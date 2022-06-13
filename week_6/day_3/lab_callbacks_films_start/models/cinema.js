const Cinema = function (films) {
  this.films = films;
};

Cinema.prototype.listFilmTitles = function () {
  const titles = this.films.map(title => title.title);
  return titles;
};

Cinema.prototype.findFilmByTitle = function (title) {
  const film = this.films.find(element => element.title === title);
  return film
};

Cinema.prototype.filterFilmByGenre = function (g) {
  var films = this.films.filter(genre => genre.genre === g);
  return films;
};

Cinema.prototype.checkFilmByYear = function(year) {
  var test = this.films.find(element => element.year === year);
  if (test != undefined) {
    return true;
  };
  return false;
};

Cinema.prototype.calcTotalRunTime = function() {
  var total = 0
  this.films.forEach((film) => {
    total += film.length
  });
  return total
}

module.exports = Cinema;
