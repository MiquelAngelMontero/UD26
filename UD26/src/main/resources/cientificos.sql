CREATE TABLE IF NOT exists Proyecto (
id int primary key auto_increment,
nombre nvarchar(255),
horas int
);

CREATE TABLE IF NOT EXISTS Cientificos(
id int auto_increment,
dni varchar(9),
nomapels nvarchar(255),
primary key (id, dni),
key (dni)
);

CREATE TABLE IF NOT EXISTS Asignado_a(
id int auto_increment,
Cientifico varchar(9),
Proyecto int,
primary key (id, Cientifico, Proyecto),
CONSTRAINT FK_cient FOREIGN KEY (Cientifico) REFERENCES Cientificos (dni),
CONSTRAINT FK_pro FOREIGN KEY (Proyecto) REFERENCES Proyecto (id)
);

INSERT INTO Proyecto (nombre, horas) VALUES ('Proyecto1', 200);
INSERT INTO Proyecto (nombre, horas) VALUES ('Proyecto2', 350);

INSERT INTO Cientificos (dni, nomapels) VALUES("33333333P", 'Eloy');
INSERT INTO Cientificos (dni, nomapels) VALUES("66666666P", 'Eloy');