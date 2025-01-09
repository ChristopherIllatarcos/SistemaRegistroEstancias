CREATE DATABASE IF NOT EXISTS bd_motelTantra;

USE bd_motelTantra;

-- Tabla para registrar las estadías
CREATE TABLE tb_estancias (
    id_estancia INT AUTO_INCREMENT PRIMARY KEY,
    nombre_cliente VARCHAR(100) NOT NULL,
	patente_o_identificacion VARCHAR(100),
    numero_suite INT NOT NULL,
    hora_llegada DATETIME,
    horas INT,
    consumo_extra VARCHAR(50),
    valor_consumo_extra DECIMAL(10,2),
    valor_total DECIMAL(10,2),
    desayuno_incluido VARCHAR(50),
    observacion TEXT
);

SELECT * FROM tb_estancias;


-- Tabla para registrar el cierre de caja
CREATE TABLE tb_cierre_caja (
    id_cierre INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    turno VARCHAR(50),
    ventas DECIMAL(10,2),
    subtotales DECIMAL(10,2),
    retiros DECIMAL(10,2),
    total_caja DECIMAL(10,2),
    observacion TEXT
);

-- Tabla para registrar los retiros
CREATE TABLE tb_retiros (
    id_retiro INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    observacion TEXT
);

-- Tabla para registrar los turnos
CREATE TABLE tb_turnos (
    id_turno INT AUTO_INCREMENT PRIMARY KEY,
    numero_ficha INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    turno VARCHAR(10) NOT NULL,
    fecha DATE NOT NULL,
    monto_caja DECIMAL(10,2) NOT NULL
);

-- Tabla para registrar los productos
CREATE TABLE tb_productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(100) NOT NULL,
    cantidad INT DEFAULT 0,
    pedido INT DEFAULT 0,
    entrega INT DEFAULT 0,
    precio DECIMAL(10,2),
    descripcion VARCHAR(200),
    porcentaje_iva INT  NOT NULL,
    id_categoria INT NOT NULL,
    observacion TEXT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria) ON DELETE CASCADE 
);



-- tabla para registrar usuarios
CREATE TABLE tb_usuarios(
id_usuario INT  AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(30) NOT NULL,
apellido VARCHAR(30) NOT NULL,
usuario VARCHAR(50) NOT NULL,
contrasena VARCHAR(64) NOT NULL,
telefono VARCHAR(15),
estado VARCHAR(10)
);



INSERT INTO tb_usuarios (nombre, apellido, usuario, contrasena, telefono, estado) 
VALUES ('Christopher', 'Illatarcos', 'admin', SHA2('admin', 256), '123456789', 'activo');

SELECT usuario, contrasena FROM tb_usuarios;



-- tabla para registrar cabecera de venta
CREATE TABLE tb_cabecera_venta(
id_cabecera_venta INT  AUTO_INCREMENT PRIMARY KEY,
id_estancia INT NOT NULL,
valor_pagar DECIMAL(10,2) NOT NULL,
fecha_venta DATE NOT NULL,
FOREIGN KEY (id_estancia) REFERENCES tb_estancias(id_estancia) ON DELETE CASCADE 
);

DROP TABLE tb_cabecera_venta;

-- tabla para registrar categoria 
CREATE TABLE tb_categorias(
id_categoria INT AUTO_INCREMENT PRIMARY KEY,
descripcion VARCHAR(200)
);



-- tabla para registrar detalle de ventas
CREATE TABLE tb_detalle_ventas(
id_detalle_venta INT AUTO_INCREMENT PRIMARY KEY,
id_cabecera_venta INT NOT NULL,
id_producto INT NOT NULL,
nombre VARCHAR(100) NOT NULL,
cantidad INT,
precio_unitario DECIMAL(10,2),
subtotal DECIMAL(10,2),
descuento DECIMAL(10,2),
iva DECIMAL(10,2),
total_pagar DECIMAL(10,2),
FOREIGN KEY (id_cabecera_venta) REFERENCES tb_cabecera_venta(id_cabecera_venta) ON DELETE CASCADE,
FOREIGN KEY (id_producto) REFERENCES tb_productos(id_producto) ON DELETE CASCADE
);

DROP TABLE tb_detalle_ventas;







