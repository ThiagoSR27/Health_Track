--SCRIPT DE CRIAÇÃO DO BANCO DE DADOS DO PROJETO HEALTH TRACK

-- Comandos de drop table do sistema health track

--drop table T_HT_UsuarioT;

--drop table T_HT_IMC;

--drop table T_HT_Planos cascade constraints;

--drop table T_HT_Exercicio cascade constraints;

--drop table T_HT_Acesso;

--drop table t_ht_dadoscorporais;

--Utilizando o select para gerar os drop tables das tabelas a qual eu criei/tenho acesso

--select 'drop table ' || table_name || ';' from user_tables;

--Tabelas deletadas por drop table nao sao apagadas diretamente, elas vao para uma lixeira
--que pode ser acessada

--show recyclebin;

--posso fazer um select direto da "lixeira"

--select * from "BIN$TFihQ1YlR2Cp7UlKD3ERRQ==$0";

--E posso restaurar a tabela

--flashback table <nome da tabela> to before drop;

--Para apagar a tabela sem possibilidade de ser recuperada

--drop table <nome da table> purge;

create table T_HT_UsuarioT(
cd_usuario number(6),
nm_user varchar(20) not null,
nr_senha varchar(8) not null, 
nm_nome varchar(30) not null,
nm_sobrenome varchar(30) not null,
ds_email varchar(30) not null,
nr_tel number(9) not null,
CONSTRAINT PK_HT_UsuarioT PRIMARY KEY(cd_usuario)
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
alter table T_HT_UsuarioT
add constraint UN_HT_NM_USER unique (nm_user);

alter table T_HT_USUARIOT
add constraint UN_HT_DS_EMAILT unique (ds_email);

--criando os campos que iram receber as chaves estrangeiras(FK)
alter table T_HT_UsuarioT
add cd_acesso number(6);

alter table T_HT_UsuarioT
add cd_planos number(6);

alter table T_HT_DadosCorporais
add cd_usuario number(6);

alter table T_HT_Exercicio
add cd_usuario number(6);

--criando as chaves estrangeiras(FK)

alter table T_HT_UsuarioT
add constraint FK_ACESSO_USER foreign key (cd_acesso)references T_HT_ACESSOT(cd_acesso);

alter table T_HT_UsuarioT
add constraint FK_PLANOS_USER foreign key (cd_planos)references T_HT_Planos(cd_planos);

alter table T_HT_DadosCorporais
add constraint FK_USER_DadosCorp foreign key (cd_usuario)references T_HT_UsuarioT(cd_usuario);

alter table T_HT_EXERCICIO
add constraint FK_USER_EXERC foreign key(cd_usuario) references T_HT_UsuarioT(cd_usuario);

-- criando as sequencias que serão utilizadas

create sequence SQ_USUARIOT
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

--Criando querys de inserção de dados nas tabelas

-- insert para tabela usuario
insert into T_HT_USUARIOT
(cd_usuario,nm_user, nr_senha, nm_nome, nm_sobrenome,ds_email, nr_tel)
values(SQ_USUARIOT.nextval, 'nelson', 12357,'jose', 'nelson', 'nelson_teste@teste.com','3555899'  );
    
-- insert para tabela dados corporais
insert into T_HT_DadosCorporais
(cd_dados_corp, vl_peso, vl_altura, vl_imc, dt_dados_corp)
values(SQ_DADOSCORP.nextval, 60, 1.82, 18.11, sysdate);

--insert para tabela planos
insert into T_HT_Planos
(cd_planos,ds_planos, vl_planos)
values(1, 'Gratuito', 0.00);

-- insert para tabela exercicios
insert into T_HT_EXERCICIO
(cd_exercicio, dt_exercicio, ds_exercicio, vl_duracao)
values(sq_exercicio.nextval, sysdate, 'abdominal',35);

--insert para tabela acesso
insert into t_ht_acesso
(cd_acesso, ds_acesso)
values(1,'ADM')

--querys delete

-- delete from T_HT_USUARIOT where cd_usuario = X;

--delete from t_ht_dadoscorporais where "cd_usuario = x" cd_dados_corp = 1

--delete from t_ht_exercicio where "cd_usuario = x" cd_exercicio = 1

--delete from t_ht_acesso where cd_acesso = 1 or cd_acesso = 2 or cd_acesso = 3;

commit




