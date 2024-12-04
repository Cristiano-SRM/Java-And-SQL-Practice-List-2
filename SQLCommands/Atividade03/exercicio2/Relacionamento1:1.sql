--Tabela Principal: produto
--Tabela Secundária: produto_detalhes

CREATE TABLE produto_detalhes (
    produto_id INT PRIMARY KEY,
    fornecedor VARCHAR(128),
    estoque INT NOT NULL,
    peso DOUBLE,
    FOREIGN KEY (produto_id) REFERENCES produto(id)
);
-- inserindo mais algumas informações na tabela produto
INSERT INTO produto (nome, categoria, preco, validade) 
VALUES 
('macarrão', 'alimentício', 7.45, '2024-07-01'),
('sabão em pó', 'limpeza', 12.90, '2036-06-10');
-- inserindo registro em produto_detalhes
INSERT INTO produto_detalhes (produto_id, fornecedor, estoque, peso)
VALUES 
(1, 'Fornecedor A', 50, 1.2), 
(2, 'Fornecedor B', 120, 0.5),
(3, 'Fornecedor C', 30, 1.8),
(4, 'Fornecedor D', 75, 2.0),
(5, 'Fornecedor A', 100, 0.4),
(10, 'Fornecedor E', 60, 0.8);


-- consulta por ordenação
SELECT p.id, p.nome, p.categoria, p.preco, pd.fornecedor, pd.estoque, pd.peso
FROM produto p
JOIN produto_detalhes pd ON p.id = pd.produto_id
ORDER BY pd.estoque DESC;

-- consulta por agrupamento
SELECT p.categoria, SUM(pd.estoque) AS total_estoque
FROM produto p
JOIN produto_detalhes pd ON p.id = pd.produto_id
GROUP BY p.categoria;

-- consulta com condições sobre agrupamento
SELECT p.categoria, SUM(pd.estoque) AS total_estoque
FROM produto p
JOIN produto_detalhes pd ON p.id = pd.produto_id
GROUP BY p.categoria
HAVING SUM(pd.estoque) > 100;

-- consulta com detalhes especificos
SELECT p.nome, p.categoria, pd.fornecedor, pd.estoque, pd.peso
FROM produto p
JOIN produto_detalhes pd ON p.id = pd.produto_id
WHERE pd.fornecedor = 'Fornecedor A' AND pd.estoque > 50;
