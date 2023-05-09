# Aplicação Spring Boot no Vscode

# Insert data bd

Vá na pasta resources: import.sql

insira o código do insert

Exemplo:
INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description) VALUES ('Mass Effect Trilogy', 4.8, 2012, 'Role-playing (RPG), Shooter', 'XBox, Playstation, PC', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png', 'texto...');

# Rum: iniciar a aplicação

Ele vai iniciar a aplicação, o banco de dados h2 e insrir os dados no banco

# Visualizar no h2

http://localhost:8080/h2-console

clique atualizar

Clique em conectar

clique em TB_GAME, depois run, aparecerá a lista do comando SELECT \* FROM TB_GAME
