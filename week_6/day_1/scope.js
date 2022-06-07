var filterNamesByFirstLetter = function (names, letter) {
    var filteredNames = [];
    for (var name of names) {
      if (name[0] === letter) {
        filteredNames.push(name);
      }
    }
    return filteredNames
  }
  
  var students = ['Alice', 'Bob', 'Alyssia', 'Artem', 'Babs'];
  var filteredStudents = filterNamesByFirstLetter(students, 'A');
  console.log('filteredStudents:', filteredStudents);

  const song = {
    title: 'Raspberry Beret',
    artist: 'Prince'
  };
  
  console.log('song before mutation', song);
  song.title = 'When Doves Cry';
  console.log('song after mutation', song);
  
  const songs = [
    song,
    'Happy Birthday',
    'Hey Jude'
  ];
  
  console.log('songs array before mutation', songs);
  songs[1] = 'Call Me Maybe';
  songs.pop();
  console.log('songs array after mutation', songs);