DROP TABLE videojuego;

create table videojuego (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);

INSERT INTO videojuego (nombre, descripcion, imagen_url)VALUES(
    'Game 1',
    'Desc Game 1',
    'https://lorenashleigh.files.wordpress.com/2013/06/big-mario-super-mario-bros-32901984-1586-2462.png'
);

INSERT INTO videojuego (nombre, descripcion, imagen_url)VALUES(
    'Game 2',
    'Desc Game 2',
    'http://vignette1.wikia.nocookie.net/fantendo/images/4/4d/Small_Mario_NSMBU.png/revision/latest?cb=20121229043401'
);

INSERT INTO videojuego (nombre, descripcion, imagen_url)VALUES(
    'Game 3',
    'Desc Game 3',
    'https://vignette2.wikia.nocookie.net/mario/images/1/1b/UMario.jpg/revision/latest?cb=20121030200758'
);

INSERT INTO videojuego (nombre, descripcion, imagen_url)VALUES(
    'Game 4',
    'Desc Game 4',
    'http://www.geeksraisinggeeks.com/wp-content/uploads/2013/08/Mario-Animals.jpg'
);

