# Kfácil - Aplicação para cadastro de Cliente - versão 1.0.0-SNAPSHOT

Projeto realiza o CRUD do Cliente (inserção, alteração, exclusão e consulta).

## 1. Ambiente de desenvolvimento
### 1.1 Pré requisitos

Possuir instalados os seguintes aplicativos:

| Aplicativo | Versão|
| ---------- | ------|
|**`Java`**|1.8|
|**`Apache Tomcat`**|7.0.55|
|**`Apache Maven`**|3.3.3|
|**`IDE Eclipse`**|Neon ou Oxigen|

### 1.2 Compilação
#### 1.2.1 Maven profiles

Execução:

`$ mvn clean install 

## 2. Documentação
### 2.1 APIs Rest de Entrada da Aplicação (Swagger)

As assinaturas dos serviços de integração, disponibilizados pela aplicação, fica disponível no próprio projeto.
Obs: Ainda a ser desenvolvido.

## 3. Implantação
### 3.1 Passo a passo para rodar a aplicação

1 - Baixar o código no git

2 - Compilar o código gerando o war do projeto com jdk 1.8

3 - Copiar o war para o diretório webapps do TomCat

4 - Fazer a configuração de externalização de arquivos de propriedades no TomCat

Obs: Mostrar as propriedades

## 3. Executar Serviços da Aplicacao no Postman

Os serviços Rest disponiveis sao:
- POST => Inclusão de cliente => http://localhost:8080/api/cliente
- PUT => Alteração de cliente => http://localhost:8080/api/cliente
- GET => Consulta lista de clientes => http://localhost:8080/api/cliente
- GET => Consulta cliente => http://localhost:8080/api/cliente/2
- DELETE => Deletando cliente => http://localhost:8080/api/cliente/3

