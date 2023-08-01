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

## 💻 End-Point /Clientes para Listagem
<br>

![End-Point Listagem](https://github.com/Temgi/APILogistica/blob/main/algalog-api/assets/API-EndPoint1.png)

## 🎨 End-Point /Clientes para Cadastro
<br>

![End-Point Cadastro](https://github.com/Temgi/APILogistica/blob/main/algalog-api/assets/API-EndPoint3.png)

## 👓 Organização de Pacotes
<br>

![Pacotes do Projeto](https://github.com/Temgi/APILogistica/blob/main/algalog-api/assets/PacotesProjeto.png)

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
