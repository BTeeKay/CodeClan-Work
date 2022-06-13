document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');

  const form = document.querySelector('#new-item-form');
  form.addEventListener('submit', handleFormSubmit);
})

const handleFormSubmit = function(event){
  event.preventDefault();
  var cat = this.title.value
  console.log(cat)

  const list = document.querySelector("#reading-list");

  const newListTitle = document.createElement('li');
  const newListAuthor = document.createElement('li');
  const newListType = document.createElement('li');
  const newList = document.createElement('li')

  newListTitle.textContent = this.title.value;
  newListAuthor.textContent = this.author.value;
  newListType.textContent = this.category.value;
  newList.textContent = (this.title.value + " " + this.author.value + " " + this.category.value)

  list.appendChild(newList)
}
