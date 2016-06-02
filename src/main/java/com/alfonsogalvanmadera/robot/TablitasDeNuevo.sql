CREATE TABLE Cliente2(--Estos son datos del usuario
id_cliente2 integer,
nombre varchar(50),---nombre del cliente de la cadena
usuario varchar(50),
pass varchar(50),
CONSTRAINT PK_id_cliente2 primary key (id_cliente2)
);

CREATE TABLE Cadena2(
id_cadena2 integer,
id_cliente2 integer,
nombre varchar(80),
url varchar(250),
CONSTRAINT PK_id_cadena2 primary key (id_cadena2),
CONSTRAINT fk_id_cliente2 foreign key (id_cliente2) REFERENCES Cliente2 (id_cliente2)
);

CREATE TABLE Accion2(
id_accion2 integer,
id_cadena2 integer,
accion varchar(250),
orden integer,
tiempo integer,
CONSTRAINT PK_id_accion2 primary key (id_accion2), 
CONSTRAINT FK_id_cadena2_acc2 foreign key (id_cadena2) REFERENCES Cadena2 (id_cadena2)
);

CREATE TABLE Dato2(
id_dato2 integer,
id_accion2 integer,
urlDescarga varchar(250),
urlSalida varchar(250),
campoLogin varchar(50),
campoPass varchar(50),
CONSTRAINT PK_id_dato2 primary key (id_dato2)
);