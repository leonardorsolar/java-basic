# Aplicação Spring Boot no Vscode

# Repository: Consulta no Banco de dados

Componente de acesso a dados

crio uma interface:
src/main/java/com/aes/dslist/repositories/GameRepository.java

JpaRepository:

o tipo de entidade e id entidade (private Long id;)
public interface GameRepository extends JpaRepository<Game, Long> {

}
