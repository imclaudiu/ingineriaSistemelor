CREATE database gymHelp;
use gymHelp;

CREATE TABLE Trainer(
	id_trainer INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(60) NOT NULL,
    last_name VARCHAR(60) NOT NULL,
	email VARCHAR(60),
	gender varchar(7),
    username VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
    );

use gymHelp;
CREATE TABLE Trainee(
	id_trainee INT PRIMARY KEY auto_increment,
    first_name VARCHAR(60) NOT NULL,
    last_name VARCHAR(60) NOT NULL,
	email VARCHAR(60),
	age INT NOT null,
	weight INT not null,
	height INT not null,
    username varchar(100) UNIQUE not null,
    password varchar(100) not null
	);
    
use gymHelp;
CREATE TABLE Progress(
	id_trainer INT not null,
    id_trainee INT not null,
    menu VARCHAR(300),
	trainee_weight INT not null,
	PRIMARY KEY(id_trainer, id_trainee),
    FOREIGN KEY (id_trainer) REFERENCES Trainer(id_trainer),
    FOREIGN KEY (id_trainee) REFERENCES Trainee(id_trainee)
	);