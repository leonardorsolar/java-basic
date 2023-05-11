# Aplicação Spring Boot no Vscode

# DTO

DTO (Data Transfer Object) é um padrão de software voltado para a transferência de dados entre as camadas de uma aplicação. Ele consiste basicamente no entendimento de como as informações trafegam dentro de um sistema.

projetar os dados através do padrão dto:

crio uma classe para o dto

src/main/java/com/aes/dslist/dto/GameMinDto.java

copio os atributos da classe Game

vou passar os dados entity do tipo Game
um contrutor que recebe uma entidade
vou instanciar o GameMinDto a partir do objeto game, copiando os dados do game para o dto
public GameMinDto(Game entity) {
this.id = entity.getId()
this.title = entity.getTitle();
this.year = entity.getYear();
this.imgUrl = entity.getImgUrl();
this.shortDescription = entity.getShortDescription();
}
ao invés de:
public GameMinDto(Long id, String title, Integer year, String imgUrl, String shortDescription) {
this.id = id;
this.title = title;
this.year = year;
this.imgUrl = imgUrl;
this.shortDescription = shortDescription;

}
