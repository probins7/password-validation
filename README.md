<p align="center">
  <img src="./src/main/resources/images/password.JPG"  title="Password">
</p>


### Sobre

O projeto **password_validation** expõe uma api web que valida se uma senha é válida.

### Tecnologias

O projeto foi desenvolvido utilizando as seguintes tecnologias.

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#using-boot-devtools)
* [Regex](https://regexr.com/)

* [Postman](https://www.postman.com/downloads/)

* [Eclipse](https://www.eclipse.org/downloads/packages/release/2021-03)


### Como baixar o projeto

```bash
# Clonar repositório
$ git clone https://github.com/probins7/password_validation.git
```

### Detalhes sobre a solução

- Para desenvolver a solução foram utilizadas os frameworks  **Spring Boot** com o **Sprint MVC** Spring Boot e Spring MVC. O primeiro nos ajuda com tarefas de infraestrutura do nosso projeto e o segundo nos ajuda a tratar requisições web.
- Foi utilizado o **Maven** que é um gerenciador de build e dependências baseado no conceito de project object model (POM). Traduzindo, ele permite configurar as dependências dos projetos apontando para os identificadores das mesmas num arquivo chamado pom.
- Para atender as premissas de validação de senha, utilizei-me da implementação de uma **expressão regular**, ou **Regex**, são padrões utilizados para identificar determinadas combinações ou cadeias de caracteres em uma string.

```java
// Sintaxe para validação da Regex 
boolean java.lang.String.matches (String regex)
```

- Para validação da senha foram consideradas as seguintes regras:

```java
IsValid("") // false  
IsValid("aa") // false  
IsValid("ab") // false  
IsValid("AAAbbbCc") // false  
IsValid("AbTp9!foo") // false  
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true
```

### Testes Unitários | Integrados.

- Para execução dos testes unitários, optei por utilizar a anotação **@SpringBootTest**. Seu mecanismo de funcionamento diz ao Spring Boot para ir e procurar por uma classe de configuração principal (uma com @SpringBootApplication por exemplo), sendo usado para fornecer uma ponte entre os recursos de teste do **Spring Boot** e o **JUnit**. Sempre que estivermos usando qualquer recurso de teste do Spring Boot em nossos testes **JUnit**, essa anotação será necessária. A anotação @SpringBootTest pode ser usada quando precisamos inicializar o container inteiro.
- Para execução dos testes de retorno da API, injetei uma dependencia através da anotação @Autowired que permite vincular as classes de execução ao ambiente de testes.

---

* Resultado da Cobertura de Testes

<p align="center">
   <img src="./src/main/resources/images/unitTests.PNG" width="800" title="Postman">
 </p>


### Detalhes sobre a execução

A API poderá ser executada localmente sendo a requisação http efetuada confome orientação abaixo, uma sugestão é faser o uso da ferramenta Postman.

Para executar a API seguir os passos abaixo, e como sugestão oriento o uso da IDE **eclipse**.

1. Importar o Projeto **password_validation** para dentro da IDE;
 <p align="center">
   <img src="./src/main/resources/images/import1.PNG" width="400" title="Postman">
 </p>
 
2. Selecionar Maven projects;
 <p align="center">
  <img src="./src/main/resources/images/import2.PNG" width="400" title="Postman">
 </p>
 
3. Selecionar a classe **Password_ValidationApplication** com o botão direito e clicar em: **Run As**,  em seguida selecione a opção **Java Aplication**, conforme o exemplo abaixo
<p align="center"><img src="./src/main/resources/images/execute.PNG"  width="800" title="Eclipse"></p>
 
4. Após Start da Aplicação, Utilizar a ferramenta Postman para efetuar a requisição conforme URL: http://localhost:8080/api/login
  	<p align="center">
	  <img src="./src/main/resources/images/postman.PNG" width="800"  title="Postman">
	 </p>
	 
5. No input devará ser enviada a senha do tipo (String), passando-a no formato Json através do corpo da requisição.

```java
// Request da Requisição no formato Json.
```

```Json
{
"password":"AbTp9 fok"
}
```

-https://github.com/probins7/password_validation.git Para a área de saída é esperado um valor do tipo boolean indicando se a senha é ou não válida.

```java
// Response da Requisição no formato boolean.
```
```java
false
```