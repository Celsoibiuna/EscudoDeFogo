CREATE DATABASE IF NOT EXISTS escudo_de_fogo;

USE escudo_de_fogo;

CREATE TABLE IF NOT EXISTS alertas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    localizacao VARCHAR(255) NOT NULL,
    gravidade ENUM('Alta', 'Média', 'Baixa') NOT NULL,
    status ENUM('Pendente', 'Resolvido', 'Em Monitoramento') NOT NULL,
    data_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
INSERT INTO alertas (localizacao, gravidade, status) VALUES
('Amazônia - Setor 12', 'Alta', 'Pendente'),
('Pantanal - Região Norte', 'Média', 'Resolvido'),
('Cerrado - Área 45', 'Alta', 'Pendente'),
('Amazônia - Setor 3', 'Baixa', 'Em Monitoramento'),
('Mata Atlântica - Litoral Sul', 'Média', 'Resolvido'),
('Cerrado - Área 22', 'Alta', 'Em Monitoramento'),
('Pantanal - Região Oeste', 'Alta', 'Pendente'),
('Caatinga - Região Central', 'Baixa', 'Resolvido'),
('Mata Atlântica - Região Sudeste', 'Média', 'Pendente'),
('Amazônia - Setor 15', 'Alta', 'Resolvido');
SELECT * FROM alertas;
DESCRIBE pessoas;
INSERT INTO pessoas (nome, ocupacao, email, telefone, cidade, estado)
VALUES
('João da Silva', 'Fazendeiro', 'joao.silva@email.com', '(11) 91234-5678', 'Alta Floresta', 'MT'),
('Maria Oliveira', 'Professora', 'maria.oliveira@email.com', '(21) 99876-5432', 'Santarém', 'PA'),
('Pedro Almeida', 'Técnico Ambiental', 'pedro.almeida@email.com', '(31) 99654-3210', 'Belo Horizonte', 'MG');
SELECT * FROM pessoas;
SELECT * FROM alertas;



