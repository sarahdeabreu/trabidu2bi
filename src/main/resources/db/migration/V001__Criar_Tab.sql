    create table cliente(
    id int not null primary key auto_increment,
    nome varchar(40)
);


    create table contasreceber(
    id int not null primary key auto_increment,
    idcliente int not null,
    dataconta date,
    valorconta decimal(12,2)
);