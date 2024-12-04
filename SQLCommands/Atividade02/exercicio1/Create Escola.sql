-- cria a database
CREATE DATABASE escola;
USE escola;
-- comandos create que criam colunas/tabelas
CREATE TABLE aluno (
    matricula INT AUTO_INCREMENT PRIMARY KEY,
    CPF VARCHAR(16) NOT NULL,
    nome VARCHAR(128) NOT NULL,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR(20),
    endereco VARCHAR(256)
);

CREATE TABLE curso (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(128) NOT NULL,
    descricao TEXT,
    valor_mensalidade DECIMAL(10, 2),
    data_criacao DATE NOT NULL
);

CREATE TABLE unidadecurricular (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(128) NOT NULL,
    descricao TEXT,
    data_inicio DATE NOT NULL,
    data_termino DATE NOT NULL,
    carga_horaria INT
);
-- comandos insert que preenchem as colunas/tabela
INSERT INTO aluno (CPF, nome, data_nascimento, telefone, endereco) 
VALUES 
('98765432100', 'Maria Oliveira', '1998-08-23', '11987651234', 'Rua B, 456'),
('65498712377', 'Carlos Mendes', '1995-11-30', '11954321234', 'Rua C, 789'),
('11223344556', 'Ana Paula', '2001-02-15', '11999887766', 'Rua D, 321'),
('99887766554', 'João Pedro', '1999-06-20', '11988776655', 'Rua E, 654');

INSERT INTO curso (nome, descricao, valor_mensalidade, data_criacao) 
VALUES 
('Engenharia', 'Curso de Engenharia Civil', 1500.00, '2024-01-01'),
('Administração', 'Curso de Administração de Empresas', 1200.00, '2023-09-15'),
('Direito', 'Curso de Direito com foco em legislação brasileira', 2000.00, '2023-05-10'),
('Ciência da Computação', 'Curso sobre desenvolvimento de software e sistemas', 1800.00, '2024-02-01');

INSERT INTO unidadecurricular (nome, descricao, data_inicio, data_termino, carga_horaria)
VALUES 
('Álgebra Linear', 'Estudo de vetores, matrizes e sistemas lineares', '2024-03-01', '2024-06-30', 60),
('Lógica de Programação', 'Curso introdutório à lógica de programação e algoritmos', '2024-01-15', '2024-04-15', 45),
('História do Brasil', 'Estudo da história do Brasil desde o período colonial', '2024-02-01', '2024-05-31', 80),
('Probabilidade e Estatística', 'Curso básico de probabilidade e estatística', '2024-03-01', '2024-07-01', 60);

