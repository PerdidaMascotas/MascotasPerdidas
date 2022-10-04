-- MySQL

CREATE TABLE USUARIOS (
    id_usuario int(25) auto_increment NOT NULL,
    nombre varchar(100),
    apellido varchar(100),
    email varchar(100)  NOT NULL,
    password varchar(64)  NOT NULL,
    CONSTRAINT pk_usuario PRIMARY KEY(id_usuario),
    CONSTRAINT uq_correo UNIQUE(email)
)ENGINE = InnoDB;

	
CREATE TABLE MASCOTAS (
    id_mascota int(25) auto_increment NOT NULL,
    usuario_id int(25) NOT NULL,
    nombre_mascota varchar(100) NOT NULL,
	  tipo_mascota varchar(100) NOT NULL,
	  especie varchar(100) NOT NULL,
	  tamanio varchar(100) NOT NULL,
	  edad int(10),
	  color varchar(50),
    comentarios MEDIUMTEXT,
    fecha_registro date  NOT NULL,
    estado varchar(10) NOT NULL,
    CONSTRAINT pk_mascota PRIMARY KEY(id_mascota),
    CONSTRAINT fk_mascota_usuario FOREIGN KEY(usuario_id) REFERENCES usuarios(id_usuario)
)ENGINE = InnoDB;