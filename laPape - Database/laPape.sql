create database lapape;

use lapape;

create table products(
	id_product bigint not null auto_increment, primary key(id_product),
	name_product varchar(20) not null,
	detail_product varchar(100) not null,
	stock int not null,
	price float not null,
	img_product varchar(300) not null
);

create table cart(
	id_cart bigint not null auto_increment, primary key(id_cart)
)

CREATE TABLE prodCart(
	id_product bigint NOT NULL, foreign key(id_product) references products(id_products),
	id_cart bigint not null, foreign key(id_cart) references cart(id_cart)
)

create table payment(
	id_payment bigint not null auto_increment, primary key(id_payment),
	number_card varchar(20) not null,
	name_card varchar(20) not null,
	date_card date not null
)

create table orden(
	id_orden bigint not null auto_increment, primary key(id_orden),
	direction varchar(100) not null,
	total float not null
	id_payment bigint not null, foreign key(id_payment) references payment(id_payment)
)

create table client(
	id_client bigint not null auto_increment, primary key(id_client),
	name varchar(20) not null,
	last_name varchar(20) not null,
	number_client varchar(10) not null,
	direccion varchar(20) not null,
	email varchar(20) not null,
	id_cart bigint not null, foreign key(id_cart) references cart(id_cart)
)

-- Inserts de productos

insert into products (name_product, detail_product, stock, price, img_product) values ("Colores Mapita", "Caja de 12 colores de distintas tonalidades, marca Mapita", 52,25," https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.vccgq706AjmpJcdQkAz7QgHaFj%26pid%3DApi&f=1&ipt=372661b8f1b8cf1ab1d03b48b571bc667b21d9f93854e428027a1843cdab66bd&ipo=images")

insert into products (name_product, detail_product, stock, price, img_product) values ("Tijeras", "Tijeras con punta redonda, marca Barrilito", 12,32," https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn.shopify.com%2Fs%2Ffiles%2F1%2F2225%2F6771%2Fproducts%2FDSC_0058_d036c57e-8833-41c9-89d9-052d7d5d6a8b_1024x1024.JPG%3Fv%3D1595452422&f=1&nofb=1&ipt=f6741c8a6889e30f18f4088fd46c34e5ff46b9967f4134150d123511bd41c49e&ipo=images")

insert into products (name_product, detail_product, stock, price, img_product) values ("Cutter Patita de G", "Cutter en forma de patita de gato, distintos tonos", 15,35," https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.DDocfHvWNT0vr3riTPNHmwHaFy%26pid%3DApi&f=1&ipt=6ee6dfd31608625d262a1591954aad94f8ae058c016f9fd2dbaa08146c03d12d&ipo=images")

insert into products (name_product, detail_product, stock, price, img_product) values ("Sacapuntas Tren", "Sacapuntas manual con manivela de escritorio", 3,58," https://www.papeleriatop.com/240334-thickbox_default/herramienta-de-escritura.jpg")

insert into products (name_product, detail_product, stock, price, img_product) values ("Cuaderno Profesional", "Cuaderno Profesional Blanco Sigel 90 hojas", 40,25," https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.ByOgQGPuwzjk2tnE4sc7GQHaHa%26pid%3DApi&f=1&ipt=f2c32d46b474bc310a5a67c1688e5e08b22b90e8fefb5d4b0503df00d9689971&ipo=images")

insert into products (name_product, detail_product, stock, price, img_product) values ("Marcadores Sharpie", "Marcadores Sharpie Vintage Assort 30 pz", 3,625," https://officemax.vteximg.com.br/arquivos/ids/693515-1150-1150/113956_1.jpg?v=637933369610200000")

insert into products (name_product, detail_product, stock, price, img_product) values ("Bolígrafo Punto Fino","Bolígrafo Bic Cristal Punto Fino Azul 12 pzas", 15,53," https://officemax.vteximg.com.br/arquivos/ids/177941-1150-1150/15148_1.jpg?v=636941128638830000")

insert into products (name_product, detail_product, stock, price, img_product) values ("Colores Paper Mate","Lápices de Colores Paper Mate Vintage Doble Punta 14 pzas", 20,120," https://officemax.vteximg.com.br/arquivos/ids/693663-1150-1150/113978_1.jpg?v=637933402204770000")

insert into products (name_product, detail_product, stock, price, img_product) values ("Plumones Crayola","Plumones Delgados Lavables Crayola Punto Fino 20 pzas SKU: 32962", 48,180," https://officemax.vteximg.com.br/arquivos/ids/746540-1150-1150/32962_1.jpg?v=637946167375100000")

insert into products (name_product, detail_product, stock, price, img_product) values ("Pritt Lápiz Adhesivo ","Pritt Lápiz Adhesivo 22 gr 6pzas", 20,120," https://officemax.vteximg.com.br/arquivos/ids/199739-1150-1150/22631_1.jpg?v=637480578106500000")

insert into products (name_product, detail_product, stock, price, img_product) values ("Goma Triangular ","Goma Factis Triangular Varios Colores 3 piezas", 92,30," https://officemax.vteximg.com.br/arquivos/ids/666299-1150-1150/114193_1.jpg?v=637926338001200000")

insert into products (name_product, detail_product, stock, price, img_product) values ("Cuaderno Tipo F ","Cuaderno Forma Francesa Cuadro Grande Scribe Serie Black 100 hojas", 70,80," https://officemax.vteximg.com.br/arquivos/ids/184915-1150-1150/89466_1.jpg?v=636941158179600000")

