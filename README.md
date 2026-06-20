# Serviço de Alunos (Spring Boot)

API REST de gerenciamento de alunos em arquitetura em camadas (controller, service, repository).

## Metadados

| Campo | Valor |
|-------|-------|
| Linguagem | Java 17 |
| Framework | Spring Boot 3.2 |
| Persistência | Spring Data JPA / Hibernate |
| Banco de dados | PostgreSQL |
| Build | Maven |
| Versão | 1.0.0 |
| Licença | MIT |
| Responsável | Equipe de Plataforma |

## Descrição

O serviço implementa o CRUD de alunos e uma busca por nome. A organização segue as
camadas controller → service → repository, com entidades JPA mapeadas para a tabela `alunos`.

## Endpoints

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | `/alunos` | Lista de alunos |
| GET | `/alunos/{id}` | Detalhe de um aluno |
| POST | `/alunos` | Cria um aluno |
| PUT | `/alunos/{id}` | Atualiza um aluno |
| DELETE | `/alunos/{id}` | Remove um aluno |

## Estrutura

```
java-spring-boot/
├── pom.xml
└── src/main/
    ├── java/com/escola/crud/
    │   ├── CrudApplication.java
    │   ├── controller/AlunoController.java
    │   ├── service/AlunoService.java
    │   ├── repository/AlunoRepository.java
    │   └── model/Aluno.java
    └── resources/application.properties
```

## Como executar

```bash
mvn spring-boot:run
# servidor em http://localhost:8080
```

## Configuração

Conexão com o banco e demais propriedades em `src/main/resources/application.properties`.
Testes com `mvn test` (JUnit 5).
