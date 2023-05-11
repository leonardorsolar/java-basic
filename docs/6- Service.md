# Aplicação Spring Boot no Vscode

# Service

Componente responsável por implementar lógica de negócio(regras)

Registrar os componentes: @Component ou apelido: @Service

public retorno função(){

}

public List<GameMinDto> findAll() {

}

é necessário injetar a dependência para acessar os métodos do repository
(puxando uma isntância)

@Autowired
private GameRepository gameRepository;

trazer a lista do banco dedados

public List<Game> findAll() {
List<Game> result = gameRepository.findAll();
return result;
}
