-- 1-a)
 SELECT
 p.nome AS 'Produto',
 (p.preco * e.quantidade) AS 'Valor Total em Estoque'
FROM
 produto p
JOIN
 estoque e ON p.id = e.id_produto
ORDER BY
 'Valor Total em Estoque' DESC;

 -- 1-b) 
 SELECT
 f.nome AS 'Filial',
 SUM(p.preco * e.quantidade) AS 'Valor Total em Estoque'
FROM
 produto p
JOIN
 estoque e ON p.id = e.id_produto
JOIN
 filial f ON e.cnpj_filial = f.cnpj
GROUP BY
 f.nome
ORDER BY
 'Valor Total em Estoque' DESC;

 -- 2 
 SELECT
 SUM(p.preco * e.quantidade) AS 'Valor Total Geral em Estoque'
FROM
 produto p
JOIN
 estoque e ON p.id = e.id_produto;