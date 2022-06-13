document.addEventListener('DOMContentLoaded', () => {
    const title = document.querySelector('h1');
    title.textContent = "Hello JS World";

    cat()
    // const greenElements = document.querySelectorAll('li.green');
    // for (const element of greenElements) {
    //     element.textContent = "Purple"
    //     element.classList.remove('green')
    //     element.classList.add('purple')
    // }
});

const cat = function () {
    const newListItem = document.createElement('li');
    newListItem.textContent = "Purple";
    newListItem.classList.add("purple");

    const list = document.querySelector("#reading-list");
    // list.appendChild(newListItem);
    const greenLi = document.querySelector("li.green");
    list.insertBefore(newListItem, greenLi);
};
