CREATE DATABASE corretora;
USE corretora;

CREATE TABLE perfil (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE cliente (
    CPF VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(128) NOT NULL,
    data_nascimento DATE NOT NULL,
    agencia VARCHAR(10) NOT NULL,
    conta VARCHAR(15) NOT NULL,
    telefone VARCHAR(20),
    endereco VARCHAR(256),
    perfil_id INT NOT NULL,
    FOREIGN KEY (perfil_id) REFERENCES perfil(id)
);

CREATE TABLE ativo_financeiro (
    codigo VARCHAR(20) PRIMARY KEY,
    nome VARCHAR(128) NOT NULL,
    descricao TEXT,
    emissor VARCHAR(128),
    data_inicio DATE,
    data_fim DATE
);

CREATE TABLE nota_corretagem (
    numero_nota INT AUTO_INCREMENT PRIMARY KEY,
    folha INT NOT NULL,
    data_compra DATE NOT NULL,
    CPF_cliente VARCHAR(14),
    codigo_ativo VARCHAR(20),
    quantidade INT NOT NULL,
    cotacao DECIMAL(10, 2) NOT NULL,
    valor_compra DECIMAL(15, 2) NOT NULL,
    custos DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (CPF_cliente) REFERENCES cliente(CPF),
    FOREIGN KEY (codigo_ativo) REFERENCES ativo_financeiro(codigo)
);

INSERT INTO perfil (nome) 
VALUES 
('Conservador'), 
('Moderado'), 
('Arrojado'), 
('Sofisticado'), 
('Agressivo');

INSERT INTO cliente (CPF, nome, data_nascimento, agencia, conta, telefone, endereco, perfil_id)
VALUES 
('12345678900', 'Carlos Silva', '1980-05-15', '1234', '56789-0', '11987654321', 'Rua A, 123', 1),
('98765432100', 'Ana Oliveira', '1992-08-23', '2345', '67890-1', '11954321678', 'Rua B, 456', 3);

INSERT INTO ativo_financeiro (codigo, nome, descricao, emissor, data_inicio, data_fim)
VALUES 
('ACAO123', 'Ação XYZ', 'Ação da empresa XYZ', 'Empresa XYZ', '2020-01-01', NULL),
('FII456', 'FII Alpha', 'Fundo Imobiliário Alpha', 'Gestora Alpha', '2019-06-01', NULL),
('TES123', 'Tesouro Selic', 'Título público Tesouro Selic', 'Tesouro Nacional', '2022-01-01', '2032-01-01');

INSERT INTO nota_corretagem (folha, data_compra, CPF_cliente, codigo_ativo, quantidade, cotacao, valor_compra, custos)
VALUES 
(1, '2024-01-15', '12345678900', 'ACAO123', 100, 12.50, 1250.00, 15.00),
(2, '2024-01-16', '98765432100', 'TES123', 200, 10.00, 2000.00, 20.00);
