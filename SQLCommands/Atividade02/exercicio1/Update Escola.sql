-- update mudam valores em colunas/tabelas
UPDATE aluno
SET telefone = '11999999999'
WHERE matricula = 1;

UPDATE curso
SET valor_mensalidade = 350.00
WHERE id = 1;

UPDATE unidadecurricular
SET data_inicio = '2024-04-01', data_termino = '2024-07-31'
WHERE id = 1;

