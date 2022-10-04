-- -----------------------------------------------------
-- Table "USUARIOS"
-- -----------------------------------------------------
CREATE TABLE  USUARIOS (
  "id_usuario" INT(20) NOT NULL, -- identificador del usuario
  "nombre" VARCHAR(60) NOT NULL, -- nombre del usuario
  "apellido" VARCHAR(60) NULL, -- apellido del usuario
  "celular" NUMERIC NULL, -- celular de contacto
  "email" VARCHAR(70) NOT NULL, -- email para autenticación
  "password" VARCHAR(20) NOT NULL, -- password para autenticación
  PRIMARY KEY ("id_usuario"));


-- -----------------------------------------------------
-- Table "MASCOTAS"
-- -----------------------------------------------------
CREATE TABLE  MASCOTAS (
  "id_mascota" SERIAL NOT NULL, -- identificador de la mascota
  "id_usuario" VARCHAR(20) NOT NULL, -- identificador del usurio
  "nombre_mascota" VARCHAR(50) NOT NULL, -- nombre de la mascota
  "tipo_mascota" CHAR(2) NOT NULL, -- Tipo registro mascota: MP (Mascota Perdida), ME (Mascota Encontrada), -- Mascota en Adopción.
  "especie" VARCHAR(25) NOT NULL, -- Perro, Gato, Loro, Otro.
  "raza" VARCHAR(60) NULL, -- Raza de la mascota: No se, Akita, Pastor Aleman...
  "tamanio" VARCHAR(30) NOT NULL, -- Tamaño mascota: Chico, Mediano, Grande.
  "sexo" CHAR(1) NOT NULL, -- M = Macho, H = Hembrea, O = Otro.
  "edad" INT NULL, -- Edad de la mascota.
  "color" VARCHAR(30), -- Color de la mascota.
  "chip" BOOLEAN NULL, -- Mascota tiene o no chip.
  "comentarios" VARCHAR(300), -- comentario sobre la mascota perdida
  "fecha_registro" TIMESTAMP NULL, -- fecha registro mascota
  "imagen_url" VARCHAR(500) NULL, -- URL de imagen mascota
  "estado" CHAR(1) NULL, -- A: Activar, I: Inactivar.
  PRIMARY KEY ("id_mascota"),
  CONSTRAINT "fk_MASCOTAS_USUARIOS1"
    FOREIGN KEY ("id_usuario")
    REFERENCES USUARIOS ("id_usuario")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



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