DROP DATABASE IF EXISTS INVENTARIO;
CREATE DATABASE INVENTARIO;
USE INVENTARIO;

CREATE TABLE Ciudad (
  codigoCiudad int(11) NOT NULL AUTO_INCREMENT,
  nombreCiudad varchar(30) NOT NULL,
  PRIMARY KEY (codigoCiudad)
) ;

INSERT INTO Ciudad (codigoCiudad, nombreCiudad) VALUES
(1, 'POPAYAN'),
(2, 'CALI'),
(3, 'PASTO'),
(4, 'MEDELLIN'),
(5, 'BOGOTA'),
(6, 'BARRANQUILLA'),
(7, 'CARTAGENA'),
(8, 'ARAUCA'),
(9, 'BALBOA'),
(10, 'BELALCAZAR'),
(11, 'BETANIA'),
(12, 'BOLIVAR'),
(13, 'BUCARAMANGA'),
(14, 'BUENAVENTURA'),
(15, 'CUCUTA'),
(16, 'CALDAS'),
(17, 'CAQUETA'),
(18, 'CERRITO'),
(19, 'CHIA'),
(20, 'CORDOBA');

CREATE TABLE TipoDocumento (
  idTipoDocumento int(11) NOT NULL AUTO_INCREMENT,
  descripcion varchar(10) NOT NULL,
  PRIMARY KEY (idTipoDocumento)
) ;

##Tipo de documento valores de la tabla 

INSERT INTO TipoDocumento (idTipoDocumento, descripcion) VALUES
(1, "CC"),
(2, "TI"),
(3, "RC"),
(4, "NIT"),
(5, "PASAPORTE"),
(6, "CE"),
(7, "RUT");

CREATE TABLE IF NOT EXISTS Proveedor (
  numeroDocumento int(20) NOT NULL,
  codTipoDocumento int(11) NOT NULL,
  nombreCompleto varchar(20) NOT NULL,
  nombreComercial varchar(20) NOT NULL,
  direccion	 varchar(20) DEFAULT NULL,
  codCiudad int(11) NOT NULL,
  Telefono varchar(15) DEFAULT NULL,
  PRIMARY KEY (numeroDocumento),
  foreign key (codCiudad) references Ciudad(codigoCiudad),
  foreign key (codTipoDocumento) references TipoDocumento(idTipoDocumento)
) ;

INSERT INTO Proveedor (numeroDocumento, codTipoDocumento, nombreCompleto, nombreComercial, direccion, codCiudad, Telefono) VALUES
('00001-1', 4, 'Carlos Maya', 'Estilos', 'Calle 12-12', 1, NULL),
('00002-2', 4, 'Marino Burbano', 'Sports', 'Centro', 2, NULL),
('00003-A', 7, 'Paola Sanchez', 'Fashion', 'Veraneras', 3, NULL),
('00004-4', 4, 'Camilo Muñoz', 'Jeans&Jackets', 'Centro', 2, NULL),
('00005-F', 7, 'Marlon Brandom', 'Bellas', 'Calle 34 B 12', 1, NULL),
('00006-6', 1, 'Carlos sanchez diaz', 'jeans&&jeans', 'calle 45 N 23-23', 1, '8213423');

CREATE TABLE IF NOT EXISTS TipoProducto(
  idTipoProducto int(11) NOT NULL AUTO_INCREMENT,
  descripcionProducto varchar(30) NOT NULL,
  PRIMARY KEY (idTipoProducto)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=25 ;

--
-- Volcar la base de datos para la tabla `tipo_articulo`
--

INSERT INTO TipoProducto (idTipoProducto,descripcionProducto) VALUES
(19, 'ZAPATO FORMAL'),
(20, 'ZAPATO DEPORTIVO'),
(21, 'ZAPATO INFORMAL '),
(22, 'PRENDA FORMAL'),
(23, 'PRENDA DEPORTIVA'),
(24, 'PRENDA INFORMAL');

CREATE TABLE IF NOT EXISTS Producto (
  idProducto int(11) NOT NULL AUTO_INCREMENT,
  descripcion varchar(30) NOT NULL,
  precioVenta decimal(11) NOT NULL,
  precioCosto decimal(11) NOT NULL,
  stock int(11) NOT NULL,
  codigoTipoProducto int(11) NOT NULL,
  codigoProveedor int(20) NOT NULL,
  fechaIngreso varchar(15) NOT NULL,
  PRIMARY KEY (idProducto),
  foreign key (codigoProveedor) references Proveedor(numeroDocumento),
  foreign key (codigoTipoProducto) references TipoProducto(idTipoProducto)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;


INSERT INTO Producto (idProducto, descripcion, precioVenta, precioCosto, stock, codigoTipoProducto, codigoProveedor, fechaIngreso) VALUES
(1, 'Bota Larga', 88000, 80000, 20, 19, '00003-A', '2012-11-03'),
(2, 'Bota corta', 55000, 50000, 55, 19, '00003-A', '2012-10-11'),
(3, 'Botin ', 143000, 130000, 18, 19, '00003-A', '2012-09-01'),
(4, 'Tenis ', 110000, 100000, 8, 20, '00002-2', '2012-10-02'),
(5, 'Zandalias', 33000, 30000, 59, 21, '00001-1', '2012-11-01'),
(6, 'Jeans', 77000, 70000, 18, 24, '00004-4', '2012-10-02'),
(7, 'Camisas', 33000, 30000, 12, 22, '00003-A', '2012-10-20'),
(8, 'Chaquetas', 55000, 50000, 8, 24, '00004-4', '2012-11-02'),
(9, 'Chaquetas sudadera', 44000, 40000, 20, 23, '00002-2', '2012-10-23'),
(10, 'Pantalon sudadera', 44000, 40000, 17, 23, '00002-2', '2012-10-23'),
(11, 'Sudadera completa', 88000, 80000, 20, 23, '00002-2', '2012-10-23'),
(12, 'Camisetas', 22000, 20000, 30, 24, '00005-F', '2012-10-03');

CREATE TABLE IF NOT EXISTS cliente (
  documento int(15) NOT NULL,
  codTipoDocument int(11) NOT NULL,
  nombreCompletoC varchar(30) NOT NULL,
  direccionC varchar(20) DEFAULT NULL,
  codCiudadC int(11) NOT NULL,
  telefonoC varchar(20) DEFAULT NULL,
  PRIMARY KEY (documento),
  foreign key (codTipoDocument) references TipoDocumento(idTipoDocumento) ON UPDATE CASCADE,
  foreign key (codCiudadC) references Ciudad(codigoCiudad) ON DELETE CASCADE ON UPDATE CASCADE
 
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO Cliente (documento, codTipoDocument, nombreCompletoC, direccionC, codCiudadC, telefonoC) VALUES
('000031', 1, 'Carlos Perez', 'Carrera 23 N 34-34', 1, '3127654323'),
('000032', 1, 'dfdfff ffff', 'fffff', 1, '77777'),
('0001', 1, 'Camilo Lopez', 'Calle 23 N 12-43', 2, '8239578'),
('0002', 2, 'Maria Arango', 'Carrera 5 N 23-12', 1, '8253478'),
('0003', 1, 'Andres Florez', 'Carrera 23 N 12A 34', 4, '3127654323'),
('0004', 1, 'Carlos Marin', 'Calle 3 N 98_21', 10, '8345623'),
('0005', 1, 'Elvira Orozco', 'Centro', 15, '3219843543'),
('0006', 1, 'Kevin Ayala', 'Carrera 23 N 4B 23', 1, '8354624'),
('0007', 1, 'Angela Hoyos', 'Calle 4 N 23 34', 3, '3217654300'),
('0008', 2, 'Marcela Gomez', 'Centro', 6, NULL),
('0009', 1, 'Andres Orozco', 'Calle 34 N 89 00', 1, '8219876'),
('0010', 1, 'Marlon Diaz', 'Carrera 23 N 78-00', 9, '3219870987'),
('0011', 1, 'Daniela Ceron', 'Centro', 1, '8236543'),
('0012', 2, 'Camilo Orozco', 'Calle 21 N 23-98', 10, '3119874534'),
('0013', 1, 'Daniela Ramos', 'Centro', 2, '3217653400'),
('0014', 2, 'Camilo Samboni', 'Carrera 23 N45A 12', 6, '8204587'),
('0015', 1, 'Alexander Romero', 'Calle 34 N 23 B 12', 2, '8340976'),
('0016', 1, 'Sebastian Naranjo', 'Carrera 23 N 2 A 1', 1, '8320912'),
('0017', 2, 'Sandra Castillo', 'Centro', 3, '3218769988'),
('0018', 1, 'Nicolas Ospina', 'Calle 23- N 76', 1, '8230954'),
('0019', 1, 'Santiago Sanchez', 'Carrera 23 N 12-23', 1, '8236521'),
('0020', 1, 'Aleja Dorado', 'Calle 34 N 23 B 4', 2, '8453234'),
('0021', 2, 'andrea Ruiz', 'Centro', 1, '3238765456'),
('0022', 1, 'Andres Perdomo', 'Centro', 3, '8456342'),
('0023', 1, 'Dolly Joaqui', 'Calle 3 N 34-12', 1, '8230943'),
('0024', 2, 'Kevin Rivera', 'Centro', 1, '8342309'),
('0025', 1, 'Camila Maya', 'Carrera 23 n 65-4', 1, '3150987866'),
('0026', 1, 'Camilo Coral', 'Centro', 1, NULL),
('0027', 2, 'Carlos Paz', 'Centro', 1, NULL),
('0028', 1, 'Cristian Paz', 'Calle 34 N b34', 1, '3219870045'),
('0029', 1, 'Daniela Solarte', 'Centro', 1, '8345623'),
('0030', 1, 'Diana Aponte', 'Centro', 15, '8234522'),
('1032', 2, 'andres juan', 'calle 34-23', 2, '326589'),
('112', 1, 'andrea samboni ', 'los cimuneros', 1, '3113882177'),
('120', 1, 'andres sanchez', 'carere 12-45', 2, '8202565'),
('123', 2, 'carlos andres', 'calle 23.5', 2, '235645'),
('125', 2, 'andres sanchez', 'calle 23', 2, '12545');

CREATE TABLE IF NOT EXISTS formaPago (
  idFormaPago int(11) NOT NULL AUTO_INCREMENT,
  descripcionPago varchar(20) NOT NULL,
  PRIMARY KEY (idFormaPago)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;


INSERT INTO formaPago( idFormaPago , descripcionPago) VALUES
(1, 'EFECTIVO'),
(2, 'BONO'),
(3, 'TARJETA DE CREDITO'),
(4, 'CHEQUE');

CREATE TABLE IF NOT EXISTS Venta (
  numFactura varchar(20) NOT NULL,
  codCliente int(15) NOT NULL,
  codProducto int(11) NOT NULL,
  cantidad int(11) NOT NULL,
  nombreEmpledo varchar(30) NOT NULL,
  fecha_facturacion varchar(15) NOT NULL,
  codFormaPago int(11) NOT NULL,
  totalFactura decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (numFactura),
  foreign key (codCliente) references Cliente(documento),
  foreign key (codFormaPago) references formaPago(idFormaPago),
  foreign key (codProducto) references Producto(idProducto)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO Venta (numFactura,codCliente ,codProducto, cantidad, nombreEmpledo, fecha_facturacion, codFormaPago, totalFactura) VALUES
('FACT-9910966', '125', 3, 1,'jose', '22/1/2013', 1, '437500');

CREATE TABLE IF NOT EXISTS Compra (
  numFacturaCompra varchar(20) NOT NULL,
  numeroDocumentoProveedor int(15) NOT NULL,
  codProducto int(11) NOT NULL,
  cantidad int(11) NOT NULL,
  fechaFacturacionCompra varchar(15) NOT NULL,
  totalFactura decimal(10,0) DEFAULT NULL,
  codFormaPago int(11) NOT NULL,
  PRIMARY KEY (numFacturaCompra),
  foreign key (numeroDocumentoProveedor) references Proveedor(numeroDocumento),
  foreign key (codFormaPago) references formaPago(idFormaPago),
  foreign key (codProducto) references Producto(idProducto)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO Compra( numFacturaCompra, numeroDocumentoProveedor,codProducto, cantidad, fechaFacturacionCompra,  totalFactura, codFormaPago) VALUES
('FACT-6610966', '00001-',3, 4, '22/1/2013', '437500',1 );
Select * from Cliente;