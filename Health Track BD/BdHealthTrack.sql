--SCRIPT DE CRIAÇÃO DO BANCO DE DADOS DO PROJETO HEALTH TRACK

-- Comandos de drop table do sistema health track

--drop table T_HT_Usuario;

--drop table T_HT_IMC;

--drop table T_HT_Planos;

--drop table T_HT_Exercicio;

--drop table T_HT_Acesso;

create table T_HT_Usuario(
cd_usuario number(6),
nm_user varchar(20) not null,
nr_senha varchar(8) not null, 
nm_nome varchar(30) not null,
nm_sobrenome varchar(30) not null,
ds_email varchar(30) not null,
nr_tel number(9) not null,
CONSTRAINT PK_HT_Usuario PRIMARY KEY(cd_usuario)
);

create table T_HT_DadosCorporais(
cd_dados_corp number(6) not null,
vl_peso number(5,2) not null,
vl_altura number(3,2) not null,
vl_imc number (4,2) not null,
dt_dados_corp date not null,
CONSTRAINT PK_HT_DadosCorporais PRIMARY KEY(cd_dados_corp)
);

create table T_HT_Planos(
cd_planos number(4) not null,
ds_planos varchar(20) not null,
vl_planos number(5,2) not null,
CONSTRAINT PK_HT_Planos PRIMARY KEY(cd_planos)
);

create table T_HT_Exercicio(
cd_exercicio number(6) not null,
dt_exercicio date not null,
ds_exercicio varchar(30) not null,
vl_duracao number(4,2) not null,
CONSTRAINT PK_HT_Exercicio PRIMARY KEY(cd_exercicio)
);

create table T_HT_ACESSO(
cd_acesso number(2) not null,
ds_acesso varchar(15) not null,
CONSTRAINT PK_HT_Acesso PRIMARY KEY(cd_acesso)
);

--adicionando a constraint unique ao usuario e ao email
alter table T_HT_Usuario
add constraint UN_HT_NM_USER unique (nm_user);

alter table T_HT_USUARIO
add constraint UN_HT_DS_EMAIL unique (ds_email);

--criando os campos que iram receber as chaves estrangeiras(FK)
alter table T_HT_Usuario
add cd_acesso number(6);

alter table T_HT_Usuario
add cd_planos number(6);

alter table T_HT_DadosCorporais
add cd_usuario number(6);

alter table T_HT_Exercicio
add cd_usuario number(6);

--criando as chaves estrangeiras(FK)

alter table T_HT_Usuario
add constraint FK_ACESSO_USER foreign key (cd_acesso)references T_HT_ACESSO(cd_acesso);

alter table T_HT_Usuario
add constraint FK_PLANOS_USER foreign key (cd_planos)references T_HT_Planos(cd_planos);

alter table T_HT_DadosCorporais
add constraint FK_USER_DadosCorp foreign key (cd_usuario)references T_HT_Usuario(cd_usuario);

alter table T_HT_EXERCICIO
add constraint FK_USER_EXERC foreign key(cd_usuario) references T_HT_Usuario(cd_usuario);

-- criando as sequencias que serão utilizadas

create sequence SQ_USUARIO
increment by 1
start with 1
maxvalue 999
nocache
nocycle;

create sequence SQ_DADOSCORP
increment by 1
start with 1
maxvalue 999
nocache
nocycle;

create sequence SQ_EXERCICIO
increment by 1
start with 1
maxvalue 999
nocache
nocycle;


