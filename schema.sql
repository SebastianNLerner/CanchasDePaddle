
    create table Canchas (
        id bigint auto_increment,
        esta_iluminada boolean not null,
        nombre varchar(128),
        color_id bigint,
        primary key (id)
    );

    create table Colores (
        id bigint auto_increment,
        detalle varchar(128),
        primary key (id)
    );

    create table Constructores (
        codigo bigint auto_increment,
        docmicilio varchar(128),
        nombre varchar(128),
        primary key (codigo)
    );

    create table Jugadores (
        id bigint auto_increment,
        apellido varchar(128),
        domicilio varchar(128),
        nacimiento timestamp,
        nombre varchar(128),
        paleta_codigo bigint,
        primary key (id)
    );

    create table Paletas (
        codigo bigint auto_increment,
        grosor integer not null,
        nombre varchar(128),
        color_id bigint,
        constructor_codigo bigint,
        primary key (codigo)
    );

    create table Participacion (
        Partidos_id bigint not null,
        paletas_codigo bigint not null,
        jugadores_id bigint not null
    );

    create table Partidos (
        id bigint auto_increment,
        cancha_id bigint,
        colorCancha_id bigint,
        reserva_inicio_partido timestamp,
        reserva_fin_partido timestamp,
        reserva_cancha_id bigint,
        primary key (id)
    );

    create table Reservas (
        inicio_partido timestamp not null,
        fin_partido timestamp not null,
        cancha_id bigint not null,
        JugResponable_id bigint,
        primary key (inicio_partido, fin_partido, cancha_id)
    );

    alter table Canchas 
        add constraint FK_aksdj4kqk9g05t05g7b2bjmpn 
        foreign key (color_id) 
        references Colores;

    alter table Jugadores 
        add constraint FK_5gbyswonactruap7fg658p1ag 
        foreign key (paleta_codigo) 
        references Paletas;

    alter table Paletas 
        add constraint FK_7am8d0oee7kgksxiri1unvqnn 
        foreign key (color_id) 
        references Colores;

    alter table Paletas 
        add constraint FK_aivohyxjjprv4crotd9vqp1yl 
        foreign key (constructor_codigo) 
        references Constructores;

    alter table Participacion 
        add constraint FK_60h12renw86qnrw5kmur353ox 
        foreign key (paletas_codigo) 
        references Paletas;

    alter table Participacion 
        add constraint FK_tjw2ltdumvcgtuubwrv09wkc0 
        foreign key (Partidos_id) 
        references Partidos;

    alter table Participacion 
        add constraint FK_n4qbklekd3xyv7pgoo45nnid5 
        foreign key (jugadores_id) 
        references Jugadores;

    alter table Partidos 
        add constraint FK_euaoyb7bsul9ym4v8u23cix4f 
        foreign key (cancha_id) 
        references Canchas;

    alter table Partidos 
        add constraint FK_4v44otbetwrbt98nf9vvlxn68 
        foreign key (colorCancha_id) 
        references Colores;

    alter table Partidos 
        add constraint FK_n41l96um9uibib8m6ia5vu3dg 
        foreign key (reserva_inicio_partido, reserva_fin_partido, reserva_cancha_id) 
        references Reservas;

    alter table Reservas 
        add constraint FK_239tb1iumnobgqy5bg1gxuu74 
        foreign key (cancha_id) 
        references Canchas;

    alter table Reservas 
        add constraint FK_eq8pvuib3y35ww8h5aanydj1t 
        foreign key (JugResponable_id) 
        references Jugadores;