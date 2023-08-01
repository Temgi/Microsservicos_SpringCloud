<div>
    <h1 align="center">Ecossistema de Microsserviços Java com SpringCloud</h1>
    <h6 align="center">Conjunto de Microsserviços Escalável com Balanceamento de Carga, API Gateway, Discovery Server e Configuração Centralizada no Git</h6>
</div>
<br><br>

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Temgi/APILog/blob/main/LICENSE) 

<p align="center">
<img src="https://img.shields.io/badge/STATUS-completo-blue?style=for-the-badge">
</p>

## 🧠 Sobre o Projeto
<p>A Aplicação é um Sistema de RH com Cadastro de Trabalhadores dividido em Diversos Microsserviços Java com Spring Cloud, utilizando assim, Feign para Requisições de API entre Microsserviços, Ribbon para Balanceamento de Carga, Eureka para Discovery e Registro de Microsserviços, API Gateway Zuul para Roteamento, Hystrix para Tolerância a Falhas, OAuth e JWT para Autenticação e Autorização, Configuração Centralizada no GitHub, Containers Docker para Microsserviços e Banco de Dados. Onde foi Construído os Microsserviços envolvendo os Processos de Configuração, Autenticação, Balanceamento de Carga, API Gateway, tendo como Base as Entidades Folha de Pagamento, Trabalhador, Usuários e Autorização.</p> 

## 📗 Sumário

* [Item-01](#-end-point-clientes-para-listagem)
* [Item-02](#-end-point-clientes-para-cadastro)
* [Item-03](#-organização-de-pacotes)
* [Item-04](#%EF%B8%8F-features)
* [Item-05](#-end-point-clientes-para-atualização)
* [Item-06](#%EF%B8%8F-end-point-clientes-para-exclusão)
* [Item-07](#-estrutura-de-classes)
* [Item-08](#-tecnologias-utilizadas)
* [Item-09](#-modelo-entidade-relacionamento)
* [Item-10](#-como-executar-o-projeto)
* [Item-11](#-autor)

## 💻 Arquitetura do Projeto
<br>

![Arquitetura Projeto](https://github.com/Temgi/Microsservicos_SpringCloud/blob/main/assets/ArquiteturaProjeto.png)

## 🎨 Modelo Conceitual
<br>

![Modelo Conceitual](https://github.com/Temgi/Microsservicos_SpringCloud/blob/main/assets/ModeloConceitual.png)

## 👓 Organização de Pacotes
<br>

![Pacotes do Projeto](https://github.com/Temgi/Microsservicos_SpringCloud/blob/main/assets/PacotesProjeto.png)

## ⚙️ Features

- [x] Collection Resources
- [x] End-Point(CRUD) para /Clientes
- [x] Representação em JSON e XML
- [x] Versionamento de Database(Migration)
- [x] Validação de Dados
- [x] Exception Handler Customizado
- [x] Camada de Domain Services
- [x] End-Point(CRUD) para /Entregas
- [x] Validação em Cascata
- [x] Validation Group
- [x] Padrão ISO-8601 para Data e Hora
- [x] Separação entre Domain Model e Representation Model
- [x] Padrão DTO com Model Mapper
- [x] Emgrego de Sub-Recursos de API
- [x] Implementação de Ação Não-CRUD(Processos de Negócios)

## 💡 Estrutura de Autenticação OAuth
<br>

![Autenticação OAuth](https://github.com/Temgi/Microsservicos_SpringCloud/blob/main/assets/Autenticacao-OAuth.png)

## 🛰️ Autorização com Token JWT
<br>

![Autorização JWT](https://github.com/Temgi/Microsservicos_SpringCloud/blob/main/assets/Autorizacao-TokenJWT.png)

## 🎯 Conjunto de Interfaces
<br>

![Conjunto Interfaces](https://github.com/Temgi/Microsservicos_SpringCloud/blob/main/assets/EstruturaClasses.png)

## 🚀 Tecnologias Utilizadas:
### Back-End
<ul>
        <li> Java 11</li>
        <li> API Gateway Netflix Zuul</li>
        <li> Feign Nextflix</li>
        <li> Spring Data JPA</li>
        <li> Jackson JSON</li>
        <li> Postman</li>
        <li> Ribbon Load Balance</li>
        <li> Maven</li>
        <li> Apache TomCat</li>
        <li> Netflix Eureka Discovery</li>
        <li> Netflix Hystrix</li>
        <li> JPA-Hibernate</li>
        <li> OAuth e JWT</li>
        <li> Docker</li>
        <li> PostgreSQL</li>
</ul>

## 🏁 Como Executar o Projeto

### Instalações
1-Baixar e Instalar o Java-JDK no Link Abaixo:
<br>
https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html
<br><br>
2-Configurar Variáveis de Ambiente do Java-JDK Conforme Link Abaixo:
<br>
https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-instalacao-do-java
<br><br>
3-Baixar e Instalar o Docker Seguindo o Link Abaixo:
<br>
https://docs.docker.com/desktop/install/windows-install/
<br><br>
4-Baixar e Instalar o Postman Seguindo os Links Abaixo:
<br>
https://www.postman.com/downloads/
<br>
https://www.alura.com.br/artigos/postman-como-instalar-dar-seus-primeiros-passos
<br><br>

### Execução e Deploy do Projeto


#### Clonar Repositório
- git clone https://github.com/Temgi/APILogistica.git

#### Executar o Projeto
- Baixar e Descompactar o Apache Maven apache-maven-3.8.4 no Unidade C:\
- Copiar o Endereço da Pasta [bin] no Caminho [C:\apache-maven-3.8.4\bin]
- Configurar as Variáveis de Ambiente para o Apache Maven apache-maven-3.8.4:

   Abra o Meu Computador no Windows(Win+E) / Botão Direito dentro de Meu Computador e Selecione [Propriedades] / Click
   no lado Esquerdo em [Configurações Avançadas de Sistema]  / Na Aba [Avançado], clique na Parte Inferior em [Variáveis
   de Ambiente]  / Em [Variáveis de Sistema] Click em [Novo] / No Campo [Nome da Variável] digite [MAVEN_HOME] / No
   Campo [Valor da Variável] digite [C:\apache-maven-3.8.4] e Click OK / Selecione na Lista o Item [PATH] e Click em
   [Editar] / Click em [Novo] digite [%MAVEN_HOME%\bin] / Click em OK - OK - OK. Abra o Executar no Windows com [Win+R]
   digite [cmd], no Prompt de Comando digite o comando [mvn -version]

- Acessar no Prompt de Comando o Caminho da Pasta [target] do Projeto [APILogistica]
- No Prompt Executar o Comando [java -jar AppLogistica.jar]
- Baixar o Collection Resources do Postman logo Abaixo:<br>
  https://github.com/Temgi/APILogistica/blob/main/assets/API%20-%20Externo(Nuvem).zip
- Abrir o Postman e Importar a Collection conforme Link Abaixo:<br>
  https://learning.postman.com/docs/getting-started/importing-and-exporting-data/


## 📝 **Autor**

<table>
<tr>
<td align="center"><a href="https://github.com/Temgi"><img style="border-radius: 10%;" src="https://avatars.githubusercontent.com/u/8334174?v=4" width="80px;" alt="Foto de Rui Temgi Saraiva Azevedo no GitHub"/></a><br /></td>
</tr>
</table>

Rui Azevedo
<br>
Contatos:  <a href="https://www.linkedin.com/in/devruiazevedo/">LinkedIn</a> - <a href="https://wa.me/5511971973505?text=Olá.%20Estou%20Entrando%20em%20Contato%20a%20partir%20do%20Portfólio%20no%20GitHub.">WhatsApp</a> - <a href="#"> ruisaraivasp@gmail.com</a>
