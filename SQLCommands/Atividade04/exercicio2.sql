-- Novos registros na tabela fornecedor:
INSERT INTO fornecedor (nome, telefone, endereco) 
VALUES 
('Nova Alimentos LTDA', '+55 (31) 9 9123-4567', 'Rua 4, n. 4, Centro'),
('Clean Tudo Produtos LTDA', '+55 (11) 9 9988-7766', 'Rua 5, n. 5, Jardim Paulista');

--Novos registros na tabela produto:
INSERT INTO produto (id_fornecedor, nome, preco, validade) 
VALUES 
(4, 'macarrão', 22.50, '2025-03-10'), 
(4, 'cereal', 15.30, '2024-09-05'), 
(5, 'limpador multiuso', 6.99, '2035-12-31'),
(5, 'sabão em pó', 32.99, '2038-08-20'), 
(1, 'óleo de soja', 18.40, '2023-11-15'),
(3, 'esponja', 2.50, '2030-05-18');


-- . Consulta para Fornecedores com Soma dos Produtos Superior a R$ 500,00

SELECT 
    f.nome AS fornecedor,
    SUM(p.preco) AS soma_precos
FROM 
    fornecedor f
JOIN 
    produto p ON f.id = p.id_fornecedor
GROUP BY 
    f.id, f.nome
HAVING 
    SUM(p.preco) > 500
ORDER BY 
    soma_precos DESC;
