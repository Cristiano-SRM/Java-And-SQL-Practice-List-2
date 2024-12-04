create schema if not exists empresa;

use empresa;

create table if not exists produto (
id int auto_increment primary key,
nome varchar(128),
categoria varchar(256),
preco double,
validade date
);

insert into produto (nome, categoria, preco, validade) values ('arroz', 'alimentício', 16.57,
'2023-12-17');
insert into produto (nome, categoria, preco, validade) values ('detergente', 'limpeza', 3.97,
'2037-08-23');
insert into produto (nome, categoria, preco, validade) values ('calça', 'vestuário', 184.91,
'2045-01-27');
insert into produto (nome, categoria, preco, validade) values ('desinfetante', 'limpeza',
8.60, '2036-02-14');
insert into produto (nome, categoria, preco, validade) values ('camisa', 'vestuário', 48.99,
'2043-04-03');
insert into produto (nome, categoria, preco, validade) values ('feijão', 'alimentício', 12.31,
'2023-09-11');
insert into produto (nome, categoria, preco, validade) values ('vestido', 'vestuário', 89.99,
'2041-05-16');
insert into produto (nome, categoria, preco, validade) values ('leite', 'alimentício', 4.28,
'2023-10-03');
insert into produto (nome, categoria, preco, validade) values ('sabão', 'limpeza', 1.85,
'2035-03-05');