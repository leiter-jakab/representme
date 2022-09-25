CREATE TABLE DEMO (
    ID UUID NOT NULL,
    NAME VARCHAR(30),
    PRIMARY KEY(ID)
);

CREATE TABLE official (
    id UUID NOT NULL,
    name VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE action (
    id UUID NOT NULL,
    name VARCHAR(500) NOT NULL,
    date date NOT NULL,
    action_type UUID NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE official_action (
    id UUID NOT NULL,
    official UUID NOT NULL,
    action UUID NOT NULL,
    reference VARCHAR(500) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE jurisdiction (
    id UUID NOT NULL,
    name VARCHAR(500) NOT NULL,
    location UUID NOT NULL,
    jurisdiction_type UUID NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE official_jurisdiction (
    id UUID NOT NULL,
    official UUID NOT NULL,
    jurisdiction UUID NOT NULL,
    start_date date NOT NULL,
    end_date date NOT NULL,
    reference VARCHAR(500) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE organization (
    id UUID NOT NULL,
    name VARCHAR(200),
    organization_type UUID NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE official_organization (
    id UUID NOT NULL,
    official UUID NOT NULL,
    organization UUID NOT NULL,
    start_date date NOT NULL,
    end_date date NOT NULL,
    reference VARCHAR(500) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE action_type (
    id UUID NOT NULL,
    name VARCHAR(200) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE jurisdiction_type (
    id UUID NOT NULL,
    name VARCHAR(200) NOT NULL,
    level SMALLINT NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE organization_type (
    id UUID NOT NULL,
    name VARCHAR(200) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE location (
    id UUID NOT NULL,
    name VARCHAR(500) NOT NULL,
    PRIMARY KEY(id)
);
