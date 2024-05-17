# IndividualAPI

## :woman_technologist:Índice

</ul>

- Sobre o projeto
- Caminho para cada endpoint
- Tecnologias utilizadas
- Autora

## :desktop_computer:Sobre o projeto

Este projeto é um sistema de biblioteca. Nele contém:

Entidades: Livro (@Embedded) e InformacaoPublicacao (@Embeddable),
  Livro: Contém informações de Id e título,
  InformacaoPublicacao: Contém informações de autor, data da publicação e editora do livro.
Interface do Repositório: LivroRepository,
Controller contendo CRUD (GET, POST, PUT, DELETE): LivroController,
Validação para o tratamento do título da classe Livro,
Tratamento de exceções com as classes: ControllerExceptionHandler e ErroResposta,
Uso do banco h2.

## ▶️:Caminho para cada endpoint

localhost:8080/livros - GET FindAll (retorna todos os livros dentro da API),
localhost:8080/livros/(id)- GET FindById (retorna o livro de id expecífico),
localhost:8080/livros/inserir - POST (insere um novo livro na API),
localhost:8080/livros/atualizar/(id) - PUT (atualiza um livro de id específico),
localhost:8080/livros/delete/(id) - DELETE (deleta um livro de id específico).

## :hammer_and_wrench: Tecnologias utilizadas

- [Spring Tool Suite 4](https://spring.io/tools)
- [Spring Initializr](https://start.spring.io/)
- [GitHub](https://github.com/)

## :writing_hand:Autora

- :woman:Izabella Prandino de Lucca (https://github.com/izapdelucca)
