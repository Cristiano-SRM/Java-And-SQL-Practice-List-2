CREATE DATABASE oficina;
USE oficina;

CREATE TABLE cliente (
    CPF VARCHAR(16) PRIMARY KEY,
    nome VARCHAR(128) NOT NULL,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR(20),
    endereco VARCHAR(256)
);

CREATE TABLE veiculo (
    chassi VARCHAR(20) PRIMARY KEY,
    placa VARCHAR(10) NOT NULL,
    modelo VARCHAR(128) NOT NULL,
    marca VARCHAR(128) NOT NULL,
    ano YEAR NOT NULL
);

CREATE TABLE mecanico (
    CPF VARCHAR(16) PRIMARY KEY,
    nome VARCHAR(128) NOT NULL,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR(20),
    endereco VARCHAR(256),
    salario DECIMAL(10, 2) NOT NULL
);

INSERT INTO cliente (CPF, nome, data_nascimento, telefone, endereco) 
VALUES 
('12345678900', 'Carlos Silva', '1990-05-15', '11987654321', 'Rua A, 123'),
('98765432100', 'Ana Oliveira', '1985-08-23', '11954321678', 'Rua B, 456');

INSERT INTO veiculo (chassi, placa, modelo, marca, ano)
VALUES 
('ABC123456789', 'AAA-1234', 'Civic', 'Honda', 2020),
('DEF987654321', 'BBB-5678', 'Corolla', 'Toyota', 2018);

INSERT INTO mecanico (CPF, nome, data_nascimento, telefone, endereco, salario) 
VALUES 
('12312312345', 'João Mendes', '1980-03-10', '11987651234', 'Rua C, 789', 4500.00),
('45645645678', 'Maria Santos', '1992-07-25', '11954329876', 'Rua D, 321', 4800.00);
