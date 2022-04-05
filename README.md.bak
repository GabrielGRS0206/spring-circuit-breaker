# Projeto back-end com Spring Boot para controle de atividades diáriasD

- Spring Framework
- Spring Boot
- Spring Data
- REST
- Swagger

Projeto simples para apontamentos de horas de alguma atividade do dia a dia..
Na classe DailyAppointment temos o seguintes atributos

- id:Valor gerado pelo banco de dados para identificar apontamento.
- description:Descrição das atividades.
- date:Data da atividade.
- hours:Quantidade de horas para apontamento.
- period:Periodo da atividade, 

Na enum AppointmentPeriod tem os períodos pré-definidos:
- MORNING(1, "MANHÃ"),
- AFTERNOON(2, "TARDE"),
- NIGTH(3,"NOITE"),
- EXTRA_HOUR(4,"HORA_EXTRA");

## Configurando o projeto

1) git clone ou download do zip: https://github.com/GabrielGRS0206/spring-note

2) Importe o projeto em sua IDE de preferência

3) Altere o usuario e senha para que o projeto possa acessar o banco mysql. 
  * Vá até `/src/main/resources/application.properties`;
  * Altere as propriedades informado o usuário e senha do seu banco de dados: 
    - spring.datasource.username=usuario
    - spring.datasource.password=senha
    - spring.datasource.url = jdbc:mariadb://localhost:3306/seuBancoDeDados?useSSL=false
    
4) Na classe App de um run na sua IDE.

5) Acesse: http://localhost:8080/swagger-ui.html para visualizar os endpoints
