INSERT INTO DEMO (ID, NAME) VALUES ('C45B5D5E778939BDBA92A9DFEC015FD6', 'demo01');
INSERT INTO DEMO (ID, NAME) VALUES ('5937BC13FEBD3349B8AA32A74AD94173', 'demo02');

INSERT INTO official (id, name) VALUES ('c59edf74-0605-4af5-8ecd-ba15ecf749a7', 'John Doe');
INSERT INTO official (id, name) VALUES ('2944dd8a-9001-4962-86cc-af8afcbcd926', 'Jane Doe');
INSERT INTO official (id, name) VALUES ('f81353ac-3254-4219-b118-313918c6ef77', 'June Doe');
INSERT INTO official (id, name) VALUES ('6714ead8-7df8-468d-a952-e9c69848e366', 'Jack Doe');

INSERT INTO location (id, name) VALUES ('aa6f69cf-f24a-4d08-a784-7ae0c5d27e91', 'big town');
INSERT INTO location (id, name) VALUES ('ea8e3add-8616-4dde-bea0-cd27a6e40b7d', 'small town');

INSERT INTO action_type (id, name) VALUES ('7f2dff12-e34a-4547-9ced-c2307fa9bb29', 'legislative proposal');
INSERT INTO action_type (id, name) VALUES ('f1d7db38-ad36-416f-b100-8b4eecdb4ba0', 'legislative change proposal');

INSERT INTO action (id, name, date, action_type) VALUES ('0b31930d-1bde-4791-b88e-48eebf6a0ab8', 'free stuff', '1999-02-02', '7f2dff12-e34a-4547-9ced-c2307fa9bb29');
INSERT INTO action (id, name, date, action_type) VALUES ('c8cb6082-c610-42d5-88cc-97f4d67e0aa4', 'good things', '1997-08-13', 'f1d7db38-ad36-416f-b100-8b4eecdb4ba0');

INSERT INTO organization_type (id, name) VALUES ('32ea7297-f228-4da8-8cb2-fa48b7c73f72', 'party');
INSERT INTO organization_type (id, name) VALUES ('751689b8-bbd8-465b-a3d7-0cd9c82e47ff', 'ngo');

INSERT INTO organization (id, name, organization_type) VALUES ('c0c8d4da-9f5f-44ee-ae3b-19dc4363cd13', 'orange party', '32ea7297-f228-4da8-8cb2-fa48b7c73f72');
INSERT INTO organization (id, name, organization_type) VALUES ('3650ebbe-15ed-4fcf-bc6f-b46c52e87593', 'teal party', '32ea7297-f228-4da8-8cb2-fa48b7c73f72');
INSERT INTO organization (id, name, organization_type) VALUES ('93e48355-28ee-4fc4-97c1-31a5d7e54836', 'big brains', '751689b8-bbd8-465b-a3d7-0cd9c82e47ff');

INSERT INTO jurisdiction_type (id, name, level) VALUES ('6cbea561-b29e-46a2-8053-058421ec1830', 'president', 0);
INSERT INTO jurisdiction_type (id, name, level) VALUES ('bc12967b-af48-42d2-b171-cecb2bff798f', 'member of parliament', 1);
INSERT INTO jurisdiction_type (id, name, level) VALUES ('bbb8b83b-0caf-4e14-8d04-6a0f24e05dab', 'mayor', 2);

INSERT INTO jurisdiction (id, name, location, jurisdiction_type) VALUES ('49a63f52-96e1-491c-8e21-4b86e4557fd4', 'district 9', 'aa6f69cf-f24a-4d08-a784-7ae0c5d27e91', 'bc12967b-af48-42d2-b171-cecb2bff798f');
INSERT INTO jurisdiction (id, name, location, jurisdiction_type) VALUES ('4b668721-5ae6-40d9-82c4-d36388677665', 'district 9', 'ea8e3add-8616-4dde-bea0-cd27a6e40b7d', 'bc12967b-af48-42d2-b171-cecb2bff798f');

INSERT INTO official_jurisdiction (id, official, jurisdiction, start_date, end_date, reference) VALUES ('13272566-594b-4ee5-9125-3c3dedb529d9', '2944dd8a-9001-4962-86cc-af8afcbcd926', '49a63f52-96e1-491c-8e21-4b86e4557fd4', '1996-01-01', '1999-12-31', 'ref');
INSERT INTO official_jurisdiction (id, official, jurisdiction, start_date, end_date, reference) VALUES ('fabccde3-a5df-4e00-9b2f-67096cfbe9bf', 'f81353ac-3254-4219-b118-313918c6ef77', '4b668721-5ae6-40d9-82c4-d36388677665', '1996-01-01', '1999-12-31', 'ref');
INSERT INTO official_jurisdiction (id, official, jurisdiction, start_date, end_date, reference) VALUES ('172b9d55-1252-444e-8918-a0c1fdb666b3', '6714ead8-7df8-468d-a952-e9c69848e366', '49a63f52-96e1-491c-8e21-4b86e4557fd4', '1992-01-01', '1995-12-31', 'ref');

INSERT INTO official_organization (id, official, organization, start_date, end_date, reference) VALUES ('1673aa05-cddc-46df-8402-aee92f1704fe', '2944dd8a-9001-4962-86cc-af8afcbcd926', 'c0c8d4da-9f5f-44ee-ae3b-19dc4363cd13', '1990-12-13', '2003-11-27', 'ref');
INSERT INTO official_organization (id, official, organization, start_date, end_date, reference) VALUES ('ce961117-4e3f-4e91-91b8-603a7d42522e', 'f81353ac-3254-4219-b118-313918c6ef77', '3650ebbe-15ed-4fcf-bc6f-b46c52e87593', '1992-06-24', '2005-09-12', 'ref');
INSERT INTO official_organization (id, official, organization, start_date, end_date, reference) VALUES ('4843b89a-eeb6-4534-a6ef-7825df189843', '2944dd8a-9001-4962-86cc-af8afcbcd926', '93e48355-28ee-4fc4-97c1-31a5d7e54836', '1994-08-01', '2002-03-14', 'ref');

INSERT INTO official_action (id, official, action, reference) VALUES ('6f3e9db5-7185-41ad-a7fe-4b107859e92a', '2944dd8a-9001-4962-86cc-af8afcbcd926', '0b31930d-1bde-4791-b88e-48eebf6a0ab8', 'ref');
INSERT INTO official_action (id, official, action, reference) VALUES ('368a88d5-7865-46c5-9481-982a08f880fb', 'f81353ac-3254-4219-b118-313918c6ef77', 'c8cb6082-c610-42d5-88cc-97f4d67e0aa4', 'ref');
