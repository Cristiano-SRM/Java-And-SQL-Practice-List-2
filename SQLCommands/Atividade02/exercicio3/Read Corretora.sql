SELECT c.*, p.nome AS perfil 
FROM cliente c
JOIN perfil p ON c.perfil_id = p.id;

SELECT nc.*, c.nome AS cliente, af.nome AS ativo 
FROM nota_corretagem nc
JOIN cliente c ON nc.CPF_cliente = c.CPF
JOIN ativo_financeiro af ON nc.codigo_ativo = af.codigo;

