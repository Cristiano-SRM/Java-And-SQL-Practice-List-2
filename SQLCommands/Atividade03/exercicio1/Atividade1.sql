a) Apresentar identificador, nome, descrição e preço dos produtos em ordem decrescente de preço:
SELECT id, nome, categoria, preco
FROM produto
ORDER BY preco DESC;

b) Apresentar identificador, nome, descrição e preço dos produtos em ordem crescente de nome e decrescente de preço:
SELECT id, nome, categoria, preco
FROM produto
ORDER BY nome ASC, preco DESC;

c) Inserir novos registros para agrupamento por nome de identificação:
INSERT INTO produto (nome, categoria, preco, validade) 
VALUES 
('arroz', 'alimentício', 18.50, '2024-06-10'),
('detergente', 'limpeza', 4.50, '2038-01-15'),
('camisa', 'vestuário', 50.00, '2044-07-25');
--agrupamento por soma de preço
SELECT nome, COUNT(*) AS quantidade
FROM produto
GROUP BY nome;

d) Inserir novos registros para permitir agrupamento e soma de preços por nome:
INSERT INTO produto (nome, categoria, preco, validade) 
VALUES 
('arroz', 'alimentício', 20.00, '2025-01-01'),
('detergente', 'limpeza', 5.00, '2038-05-20'),
('camisa', 'vestuário', 60.00, '2044-09-30');
-- agrupamento por preço
SELECT nome, SUM(preco) AS soma_precos
FROM produto
GROUP BY nome;

e) Inserir novos registros para permitir agrupamento e média de preços por nome:
INSERT INTO produto (nome, categoria, preco, validade) 
VALUES 
('arroz', 'alimentício', 25.00, '2025-12-31'),
('detergente', 'limpeza', 6.00, '2039-03-10'),
('camisa', 'vestuário', 70.00, '2045-05-05');
-- Agrupamento e Média de Preços:
SELECT nome, AVG(preco) AS media_precos
FROM produto
GROUP BY nome;

f) Inserir novos registros para agrupamento e soma de preços com valor acima de R$ 100,00:
INSERT INTO produto (nome, categoria, preco, validade) 
VALUES 
('arroz', 'alimentício', 120.00, '2026-01-15'),
('detergente', 'limpeza', 105.00, '2040-07-12'),
('camisa', 'vestuário', 150.00, '2045-09-22');
-- Agrupamento com Soma de Preços > R$ 100,00:
SELECT nome, SUM(preco) AS soma_precos
FROM produto
GROUP BY nome
HAVING SUM(preco) > 100.00;






