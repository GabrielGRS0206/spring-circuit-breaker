## Projeto em desenvolvimento
# Projeto Spring Boot utilizando Circuit Breaker com Resilience4j

# Tecnologias utilizadas.
- Spring boot.
- Spring Framework
- Spring Data
- REST
- Swagger
- Mysql

O projeto consiste numa pequena aplicação, utilizando o design pattern de Circuit Breaker com Resilience4j.

Neste projeto foi desenvolvido as seguintes APIs com as seguintes funcionalidades.

# API Clients.
- Consulta cliente por código.

Nesse projeto em específico foi utilizado o pattern BFF para implementação dos serviços.
 
Ao realizarmos uma consulta no endpoint GET /clients/{id} 

Exemplo : acessado pelo swagger da aplicação da API clients.

![image](https://user-images.githubusercontent.com/44039603/162350146-f061b6dd-050e-449d-b31e-80c875bb01c7.png)

O serviço realiza internamente a chamada da API notifications, atráves do RestTemplate para consultar as notificações daquele
determinado cliente.


# API Notifications.
- Consulta notificações por código cliente.
O endpoint /notifications realiza a busca das notificações para um determinado cliente.



