let currentPage = 0;
const pageSize = 2;

const productList = document.getElementById("product-list");
const sortSelect = document.getElementById("sort");
const prevBtn = document.getElementById("prev");
const nextBtn = document.getElementById("next");

function loadProducts() {
    const sortBy = sortSelect.value;

    fetch(`/api/products?page=${currentPage}&size=${pageSize}&sort=${sortBy}`)
        .then(res => res.json())
        .then(data => {
            productList.innerHTML = "";

            data.content.forEach(product => {
                const div = document.createElement("div");
                div.className = "product";

                div.innerHTML = `
                    <h3>${product.name}</h3>
                    <p>Brand: ${product.brand}</p>
                    <p>Category: ${product.category}</p>
                    <p class="price">₹ ${product.price}</p>
                    <p>Rating: ⭐ ${product.rating}</p>
                `;

                productList.appendChild(div);
            });

            prevBtn.disabled = data.first;
            nextBtn.disabled = data.last;
        });
}

sortSelect.addEventListener("change", () => {
    currentPage = 0;
    loadProducts();
});

prevBtn.addEventListener("click", () => {
    if (currentPage > 0) {
        currentPage--;
        loadProducts();
    }
});

nextBtn.addEventListener("click", () => {
    currentPage++;
    loadProducts();
});

loadProducts();
