<p align="center">
  <img width="800" height="400" src="https://img.freepik.com/vetores-gratis/composicao-da-vista-superior-do-estacionamento-com-cenario-ao-ar-livre-com-arvores-verdes-e-asfalto-marcado-com-carros_1284-55560.jpg?w=740&t=st=1678313200~exp=1678313800~hmac=fa8870265ec5e0e4a3af92ce732e65b2ed196f37a67140655d543401a51caaf8">
</p>

# API Estacionamento - \<Dev>ª - B³/Let's Code (Ada) - Projeto Final (Módulo 07 - Arquitetura de Software e Ágil II)
 
## 💻 Sobre
Esta etapa do curso BackEnd Java do programa \<Dev>ª - B³/Let's Code (Ada) consiste da partipação do Módulo 07 - ARQUITETURA DE SOFTWARE II e entrega do projeto APIs de Estacionamento. Este repositório contém o projeto final.


## 📋Tabela de conteúdos
<!--ts-->
   * [Sobre](https://github.com/Karla-Silva/recepcao/blob/master/README.md#-sobre)
   * [Tabela de Conteudo](https://github.com/Karla-Silva/recepcao/blob/master/README.md#tabela-de-conte%C3%BAdos)
   * [Descrição do Projeto](https://github.com/Karla-Silva/recepcao/blob/master/README.md#-descri%C3%A7%C3%A3o-do-projeto)
   * [Diagrama](https://github.com/Karla-Silva/recepcao/blob/master/README.md#-diagrama)
   * [Microsserviços -> Endpoints](https://github.com/Karla-Silva/recepcao/blob/master/README.md#-microsservi%C3%A7os---endpoints)
   * [Desenvolvimento](https://github.com/Karla-Silva/recepcao/blob/master/README.md#desenvolvimento)
   * [Tecnologias](https://github.com/Karla-Silva/recepcao/blob/master/README.md#-tecnologias)
   * [Equipe](https://github.com/Karla-Silva/recepcao/blob/master/README.md#-equipe)
<!--te-->


## 🧾 Descrição do Projeto
  
  <p align="center">
  <img width="1200" height="200" src="https://ada-site-frontend.s3.sa-east-1.amazonaws.com/home/header-logo.svg">
</p>


  
  ![image](https://user-images.githubusercontent.com/96498080/223885615-ffd2b1c0-9996-4d32-adde-7da63ebf67b7.png)
 
 
 > Escolhemos como tema do projeto um sistema de controle para um estaciomento. 

  
## 🔀 Diagrama


![image](https://user-images.githubusercontent.com/96498080/223865181-ed9ad2b9-9063-4ecb-ada2-8ae4643ce66d.png)



## 👩‍🏫 Microsserviços -> Endpoints
  * 👩‍💼Recepção -> [Repositório](https://github.com/Karla-Silva/recepcao)
    * Receber Cliente
    * Cadastrar Mensalista
    * Registrar Saída                 
          
  * 🅿️Pátio -> [Repositório](https://github.com/Karla-Silva/patio)
    * Consultar Vagas
    * Consultar Vagas Mensalistas
    * Ocupar Vagas
    * Ocupar Vagas Mensalista
    * Devolver Carro
                  
  * 💵Financeiro -> [Repositório](https://github.com/Karla-Silva/financeiro)
    * Pagamento
    * Relatório
                   
 
## 👩‍💻Desenvolvimento
   
  * 👩‍💼Recepção:
    Criamos as seguintes entidades e seus elementos: Cliente (Id, Placa e Nome) e Mensalista (Id, Placa, Nome e Cartão de Crédito).
    Foram criadas funções dentro de Client: Devolver carro do cliente, Ocupar vagas para clientes gerais, Ocupar vagas para clientes mensalista, Consultar vagas de cliente gerais e Consultar vagas de clientes mensalistas.
    Foram criadas funções dentro de Service: Cadastrar cliente mensalista, Receber cliente e Registro de saída do carro.
    
  * 🅿️Pátio:
    Criamos as seguintes entidades e seus elementos: Vaga (Id e Placa) e Vaga Mensalista (Id e Placa).
    Foram criadas funções dentro de Service: Consultar vaga de mensalista, consultar vaga de clientes gerais, Devolver carro, Ocupar vaga de cliente mensalista e Ocupar vaga de cliente geral.
    
  * 💵Financeiro:
    Criamos as seguintes entidades e seus elementos: Cliente (Id, CPF, Identificador Placa, Nome), Item (Id, Preço, Quantidade, Vaga e Pagamento), Pagamento (Id, Cliente, Data da Criação, Itens), Vaga (Id e Indentificador Placa) e Relatório Fornecedor (Valor e Identificador).
    Foram criadas funções dentro de Service: Salvar vaga, Salvar cliente e Salvar pagamento.
    
    
 
## 🛠 Tecnologias
As seguintes ferramentas foram usadas na construção do projeto:
* **[Java](https://www.java.com/pt-BR/)**
* **[IntelliJ](https://www.jetbrains.com/pt-br/idea/download/#section=windows)**
* **[Trello](https://trello.com/b/Xk50BrK2/projeto-java)**
* **[Figma](https://www.figma.com/)**

## 📝 Equipe
Feito com ❤️ por: <br>
 * Fernanda Savatin [Entre em contato!](https://www.linkedin.com/in/fernanda-savatin/)
 * Karla Silva [Entre em contato!](https://www.linkedin.com/in/karla-de-morais-silva-821296165/)
 * Mayara Carvalho [Entre em contato!](https://www.linkedin.com/in/mayara-carvalho-a68988250/)
