    create table cliente(
    id int not null primary key auto_increment,
    nome varchar(40)
);

insert into cliente(nomeCliente) values("sarah");
insert into cliente(nomeCliente) values("mirella");
insert into cliente(nomeCliente) values("gabriel");
insert into cliente(nomeCliente) values("raul");



    create table contasreceber(
    id int not null primary key auto_increment,
    idcliente int not null,
    dataconta date,
    valorconta decimal(12,2)
);


alter table contasreceber add constraint fk_contasreceber_cliente foreign key(idcliente) references contasreceber(id);

insert into contasreceber(dataConta, idcliente, valorConta) values('2006-01-02', 1, 12345.00);
insert into contasreceber(dataConta, idcliente, valorConta) values('2006-02-03', 2, 12346.00);
insert into contasreceber(dataConta, idcliente, valorConta) values('2005-07-19', 3, 12347.00);
insert into contasreceber(dataConta, idcliente, valorConta) values('2006-01-13', 4, 12348.00);