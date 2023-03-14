\c root

CREATE SCHEMA IF NOT EXISTS public
    AUTHORIZATION root;

CREATE TABLE IF NOT EXISTS public.recipes
(
    uuid uuid NOT NULL,
    dt_create timestamp(3) without time zone NOT NULL,
    dt_update timestamp(3) without time zone NOT NULL,
    title character varying(255) NOT NULL,
    CONSTRAINT recipes_pkey PRIMARY KEY (uuid)
);


