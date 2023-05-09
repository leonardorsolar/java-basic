# Aplicação Spring Boot no Vscode

# Configurações

## Configuraçẽos do acesso web: application.properties

Inserir o código a seguir em application.properties:

spring.profiles.active=${APP_PROFILE:test}
spring.jpa.open-in-view=false

cors.origins=${CORS_ORIGINS:http://localhost:5173,http://localhost:3000}

## Configuraçẽos do banco de dados de teste: application-test.properties

Criar o arquivo e inserir o código a seguir em application-test.properties:

# H2 Connection

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 Client

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Show SQL

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
