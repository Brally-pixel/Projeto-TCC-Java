create database Loja_Chocolicia;
use Loja_Chocolicia;


create table estados_tbl (
CodEstado int primary key,
UF_Estado varchar (20),
Estado varchar(25)
);



create table cidades_tbl (
CodCidade int primary key,
CodEstado int,
Nome_Cidade varchar (40),
Constraint FK_Chave0 Foreign Key (CodEstado) References estados_tbl (CodEstado)
);


create table Cadastro_Cliente (
Codi_do_Cliente int  primary key, 
Nome varchar(40) not null,
Data_de_Nascimento date not null, 
Data_Cadastro datetime,
CPF varchar (12) not null,
Estado_Civil varchar(13) not null check (Estado_Civil in ('Solteiro(a)','Casado(a)','Viuvo(a)','Divorciado(a)')),
Sexo varchar(1) not null check (Sexo in ('F','M')) ,
Endereco varchar(50) not null, 
Numero varchar(4) not null, 
Complemento varchar(40), 
CEP varchar (8) not null, 
Bairro varchar (20) not null, 
E_mail varchar(40), 
Numero_Tel varchar (10)not null, 
Status_Cli varchar(1) default('A') check (Status_Cli in ('A','I')) ,
CodCidade int,
CodEstado int,
Constraint FK_Chave1 Foreign Key (CodCidade) References cidades_tbl (CodCidade),
Constraint FK_Chave2 Foreign Key (CodEstado) References estados_tbl (CodEstado)
);


Create table Fornecedor(
Cod_Empresa int ,
Nome_Fantasia varchar (20) not null, 
Razao_Social varchar (40) not null, -- 40
CNPJ varchar (14), -- tamanho 14
Site_empresa varchar(50) null,
Endereco varchar(50) not null,
Numero varchar(4) not null, 
Complemento varchar(40) not null, 
CEP varchar (8) not null, 
Bairro varchar (30) not null, 
E_mail_Empresa varchar(40)not null, 
Telefone_Empresa varchar  (10)not null,
CodCidade int,
CodEstado int,
Data_Cadastro datetime,
Status_For varchar(1) default('A') check (Status_For in ('A','I')),
Constraint PK_Cod_Empre Primary Key (Cod_Empresa),
Constraint FK_Chave3 Foreign Key (CodCidade) References cidades_tbl (CodCidade),
Constraint FK_Chave4 Foreign Key (CodEstado) References estados_tbl (CodEstado)
);


create table Contato_Fornecedor(
Codi_do_contato int primary key,
codi_Empresa int ,
Nome varchar (40) not null, 
Sexo varchar(1) not null check (Sexo in ('F','M')) ,
Fax varchar(10)  null,
Data_Cadastro datetime,
E_mail_Fornecedor varchar(40) null,
numero_Tel varchar(10) not null,
Status_Cont varchar(1) default('A') check (Status_Cont in ('A','I')),
Constraint FK_Chave5 Foreign Key (codi_Empresa) References Fornecedor (Cod_Empresa)
);

Create Table Marca
(
Cod_Marca Int ,
Nome_Marca Varchar(30) Not Null,
Data_Cadastro datetime,
Status_Marca varchar(1) default('A') check (Status_Marca in ('A','I')),
Constraint PK_Cod_Marca Primary Key (Cod_Marca)
);

Create table Cad_Produto
(
Cod_Produto Int  not null, -- Códi do produto
Cod_Barra_Prod VarChar(13) Not Null,
COd_Marca int,
Data_Cadastro datetime,
Data_Validade datetime,
Descricao_Prod Varchar (50) Not Null,
Status_Prod Char(1) Default 'A' Not Null Check(Status_Prod in ('A','I')) ,
Constraint PK_Cod_Prod Primary Key (Cod_Produto),
Constraint FK_Chave54 Foreign Key (COd_Marca) References Marca (Cod_Marca)
);

Create table Estoque(
Cod_Estoque Int, -- Códi do Estoque
Cod_Prod Int Not Null, -- Códi do Produto
Estoque_Max Int Not Null, -- Estoque Máximo
Estoque_Min Int Not Null, -- Estoque Minimo
Estoque_Atual Int Default(0), -- Estoque Atual
Sabor Varchar(50), -- Característica
Unidade varchar(10), -- Unidade do produto (L Litro, P Pacote, U Unidade, G Gramas)
Vl_Venda_Prod Decimal(15,2) Not Null, -- Valor de Venda do Produto
Constraint PK_Cod_Estoque Primary Key(Cod_Prod,Cod_Estoque),
Constraint FK_Chave8 Foreign Key (Cod_Prod) References Cad_Produto (Cod_Produto)
);

Create table Estoque_For(
CodEstoque int,
Cod_Fornecedor int,
Cod_Produto int,
constraint pk primary key (CodEstoque,Cod_Fornecedor,Cod_Produto),
Constraint FK_Chave7 Foreign Key (Cod_Produto,CodEstoque) References Estoque (Cod_Prod,Cod_Estoque),
Constraint F_Chave7 Foreign Key (Cod_Fornecedor) References  Fornecedor(Cod_Empresa)
);

create table Departamento(
Cod_Departamento int primary key not null,
Descricao varchar(40) not null,
Data_Cadastro  datetime ,
Status_Dep varchar(1)  Default('A') check (Status_Dep in ('A','I'))
);

create table Cadastro_Funcionario(
Codi_do_funcionario int primary key,
Nome varchar(40) not null,
CPF varchar (12) not null,
RG varchar (12) not null,
Endereco varchar (40) not null,
Numero varchar (5) null,
Complemento varchar (50) null,
CEP varchar(8) not null,
Bairro varchar (20) not null,
Codi_Departamento int not null,
Turno_Funci Char(1) Not Null Check(Turno_Funci in('M', 'T')) ,-- Turno do funcionário
E_mail varchar (40) null,
Nivel_de_Ensino varchar(12)  not null check (Nivel_de_Ensino in ('Fundamental','Medio ','Técnico','Superior')),
Sexo varchar(1) not null check (Sexo in ('F','M')) ,
Data_de_Nascimento date not null,
Estado_Civil varchar(14) not null check (Estado_Civil in ('Solteiro(a)','Casado(a)','Viuvo(a)','Divorciado(a)')) ,
numero_Tel varchar (10)not null,
Status_Func varchar(1)default('A') check (Status_Func in ('A','I')),
CodCidade int,
CodEstado int,
Data_Cadastro datetime,
Constraint FK_Chave9 Foreign Key (CodCidade) References cidades_tbl (CodCidade),
Constraint FK_Chave10 Foreign Key (CodEstado) References estados_tbl (CodEstado),
Constraint FK_Chave11 Foreign Key (Codi_Departamento) References Departamento(Cod_Departamento)
);

create table Pagamento_Func(
Codi_Pag int primary key,
Cod_Func int,
Valor int,
Data date,
Situacao varchar(40),
Constraint FK_Chave12 Foreign Key (Cod_Func) References Cadastro_Funcionario(Codi_do_funcionario)
);


create table Contas_Pagar(
Codi_Conta int,
Descricao_conta varchar (30) not null,
Responsavel varchar (20) not null,
Data_de_Pagamento date not null, 
Data_de_Vencimento date not null, 
Valor_da_Conta Double not null,
Valor_Pa Double,
StatsPag Char(2) Default('Pe') Not Null Check(StatsPag in('Pa','Pe','At')) ,-- Status de pagamento(Pa, Pendente ou Atrasado)
Status_Cont char(1) Default ('A') Check (Status_Cont in ('A','I')) ,
constraint PK_Con primary key (Codi_Conta)
);

create table Vendas(
codi_venda int   primary key not null,
Codi_do_funcionario int not null,
Codi_do_Cliente int not null,
data_venda Datetime default (getdate()),
Valor_final Double not null, 
Status_Venda varchar(1)default('A') check (Status_Venda in ('A','F')),
Constraint FK_Chave14 Foreign Key (Codi_do_funcionario) References Cadastro_Funcionario (Codi_do_funcionario),
Constraint FK_Chave15 Foreign Key (Codi_do_Cliente) References cadastro_cliente (Codi_do_Cliente)
);


Create Table Forma_Pag
(
Cod_FormPag int ,
Tipo_FormPag varchar(8) Not Null,
Constraint PK_Cod_FormPag Primary Key (Cod_FormPag)
);

Create Table Recebimento
(
Cod_Receb Int Not Null, -- Códi do Recebimento
Cod_Venda Int Not Null, -- Códi da Venda
CodForma_Pag Int Not Null, -- Códi da Forma Pagamento
DataReceb Datetime Null, -- Data de Recebimento
ValorReceb Decimal(15,2) Not Null, -- Valor Recebido
Status_Pag Char(2) Not Null Check(Status_Pag in('Pa','Pe','At')), -- Status do Pagamento, Pa(Pa) Pe(Pendente) At(Atrasado)
Satatus_Recebimento Char(1) Default 'A' Not Null Check(Satatus_Recebimento in ('A','I')), -- Status do Pagamento(Ativo ou Inativo)
Constraint PK_CodRecebVenda Primary Key (Cod_Receb,Cod_Venda),
Constraint FK_VendaReceb Foreign Key (Cod_Venda) References Vendas (codi_venda),
Constraint FK_FormaPagReceb Foreign Key (CodForma_Pag) References Forma_Pag (Cod_FormPag)
);

create table Detalhes_Venda(
codi_venda int  not null,
Codi_do_Detalhe int not null,
Codi_do_Produto int not null,
cod_estoque int,
Quantidade int not null,
Valor_Unitário Double not null,
Status_Item_Venda Char(1)Default 'A' Not Null Check(Status_Item_Venda in ('A','I')) ,
constraint PK_detalhe primary key (codi_venda,Codi_do_Detalhe), 
Constraint FK_Chave16 Foreign Key (Codi_venda) References vendas (codi_venda),
Constraint FK_Chave17 Foreign Key (Codi_do_Produto,cod_estoque) References estoque (Cod_Prod,Cod_Estoque)
);

Create table Cad_Login(
Cod_fun int not null,
cad_login varchar (20)not null, 
senha varchar (20) not null,
Data_Cadastro datetime,
Nivel  varchar(15)default('2') check (Nivel in ('1','2')),
Status_Log varchar(1)default('A') check (Status_Log in ('A','I')),
Constraint FK_Chave19 Foreign Key (cod_fun) References Cadastro_Funcionario (Codi_do_funcionario)
);

Create table Compra (
Cod_Compra Int  primary key,-- Códi da Compra
Cod_Forne Int Not Null, -- Códi do Fornecedor
Vl_Compra Double Not Null,-- Valor da compra
Data_Compra Datetime Default(GetDate()) Not Null,-- Data de compra
Status_Com Char(1) Check(Status_Com in ('A','I')), -- Status da Compra(Ativo ou Inativo)
Constraint FK_Cod_Forne Foreign Key(Cod_Forne) References Fornecedor(Cod_Empresa)
);

Create table Item_Compra(
Cod_Item_Compra int, -- Códi do Item Compra
Cod_Compra int Not Null, -- Códi da Compra
Cod_Prod int Not Null, -- Códi do Produto
Cod_Estoque int Not Null, -- Códi do Estoque
Qtd_Prod int Not Null, -- Quantidade do Produto
Vl_Unitario Double Not Null, -- Valor Unitário do Produto
Unidade varchar(10) Not Null,-- Unidade do produto (L Litro, P Pacote, U Unidade, G Gramas)
Status_Item_Com Char(1) Check(Status_Item_Com in ('A','I')), -- Status do Item(Ativo ou Inativo)
Constraint PK_Cod_Item_Compra primary key(Cod_Item_Compra, Cod_Compra),
Constraint FK_Cod_Compra Foreign Key(Cod_Compra) References Compra(Cod_Compra),
Constraint FK_Cod_Prod foreign key (Cod_Prod) references Cad_Produto (Cod_Produto)
);

create table Fale_Conosco2 (
cod_Fale int ,
Nome varchar(40),
email varchar(40),
Descricao varchar(2048)
);
