# Aplicação Spring Boot no Vscode

# controller

a porta de entrada dos dados
O controlador está expondo uma função para o entrepoint

controller>service>repository

@Autowired
private GameService gameService;

controller(injeta o service)>service( o service injeta repository)>repository

# run

http://localhost:8080/games
