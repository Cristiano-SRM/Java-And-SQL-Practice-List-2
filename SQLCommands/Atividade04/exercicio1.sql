-- a) Soma dos preços dos produtos por fornecedor, ordenados de forma decrescente do valor da soma
SELECT 
    f.nome AS fornecedor,
    SUM(p.preco) AS soma_precos
FROM 
    fornecedor f
JOIN 
    produto p ON f.id = p.id_fornecedor
GROUP BY 
    f.id, f.nome
ORDER BY 
    soma_precos DESC;

Aqui estão os comandos SQL para realizar as consultas solicitadas:

a) Soma dos preços dos produtos por fornecedor, ordenados de forma decrescente do valor da soma
sql
Copiar código
SELECT 
    f.nome AS fornecedor,
    SUM(p.preco) AS soma_precos
FROM 
    fornecedor f
JOIN 
    produto p ON f.id = p.id_fornecedor
GROUP BY 
    f.id, f.nome
ORDER BY 
    soma_precos DESC;
--b) Média aritmética dos preços dos produtos por fornecedor, ordenados de forma decrescente do valor da média
SELECT 
    f.nome AS fornecedor,
    AVG(p.preco) AS media_precos
FROM 
    fornecedor f
JOIN 
    produto p ON f.id = p.id_fornecedor
GROUP BY 
    f.id, f.nome
ORDER BY 
    media_precos DESC;
