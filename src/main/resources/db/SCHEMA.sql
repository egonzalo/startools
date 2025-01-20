-- Startool DDL
-- DROP SCHEMA stargrave;

CREATE SCHEMA stargrave AUTHORIZATION postgres;

-- Drop table

-- DROP TABLE stargrave.crews;

CREATE TABLE stargrave.crews (
	crew_id serial4 NOT NULL,
	"name" varchar(100) NOT NULL,
	credits int4 DEFAULT 0 NULL,
	experience int4 DEFAULT 0 NULL,
	CONSTRAINT crews_pkey PRIMARY KEY (crew_id)
);

-- Drop table

-- DROP TABLE stargrave.crew_ships;

CREATE TABLE stargrave.crew_ships (
	ship_id serial4 NOT NULL,
	crew_id int4 NULL,
	"name" varchar(100) NOT NULL,
	CONSTRAINT crew_ships_pkey PRIMARY KEY (ship_id),
	CONSTRAINT crew_ships_crew_id_fkey FOREIGN KEY (crew_id) REFERENCES stargrave.crews(crew_id)
);

-- Drop table

-- DROP TABLE stargrave.stat_choices;
CREATE TABLE stargrave.stat_choices (
    stat_choice_id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE,
    description TEXT
);

-- Drop table

-- DROP TABLE stargrave.backgrounds;
CREATE TABLE stargrave.backgrounds (
    background_id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    description TEXT,
    health_mod INTEGER DEFAULT 0,
    will_mod INTEGER DEFAULT 0,
    move_mod INTEGER DEFAULT 0,
    fight_mod INTEGER DEFAULT 0,
    shoot_mod INTEGER DEFAULT 0,
    choices_allowed INTEGER NOT NULL
);

-- Drop table

-- DROP TABLE stargrave.background_stat_choices;
CREATE TABLE stargrave.background_stat_choices (
    background_stat_choice_id SERIAL PRIMARY KEY,
    background_id INTEGER REFERENCES stargrave.backgrounds(background_id),
    stat_choice_id INTEGER REFERENCES stargrave.stat_choices(stat_choice_id),
    UNIQUE(background_id, stat_choice_id)
);

-- Drop table

-- DROP TABLE stargrave.equipment_slots;

CREATE TABLE stargrave.equipment_slots (
	equipment_slot_id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	description text NULL,
	CONSTRAINT equipment_slots_name_key UNIQUE (name),
	CONSTRAINT equipment_slots_pkey PRIMARY KEY (equipment_slot_id)
);

-- Drop table

-- DROP TABLE stargrave.equipment_types;

CREATE TABLE stargrave.equipment_types (
	equipment_type_id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	slot_type_id int4 NULL,
	description text NULL,
	CONSTRAINT equipment_types_pkey PRIMARY KEY (equipment_type_id),
	CONSTRAINT equipment_types_slot_type_id_fkey FOREIGN KEY (slot_type_id) REFERENCES stargrave.equipment_slots(equipment_slot_id)
);

-- Drop table

-- DROP TABLE stargrave.armor;

CREATE TABLE stargrave.armor (
	armor_id serial4 NOT NULL,
	equipment_type_id int4 NULL,
	"name" varchar(50) NOT NULL,
	armor_modifier int4 NOT NULL,
	gear_slots int4 NOT NULL,
	movement_penalty int4 DEFAULT 0 NULL,
	notes text NULL,
	CONSTRAINT armor_pkey PRIMARY KEY (armor_id),
	CONSTRAINT armor_equipment_type_id_fkey FOREIGN KEY (equipment_type_id) REFERENCES stargrave.equipment_types(equipment_type_id)
);

-- Drop table

-- DROP TABLE stargrave.weapons;

CREATE TABLE stargrave.weapons (
	weapon_id serial4 NOT NULL,
	equipment_type_id int4 NULL,
	"name" varchar(50) NOT NULL,
	damage_modifier int4 DEFAULT 0 NULL,
	max_range int4 NULL,
	gear_slots int4 NOT NULL,
	notes text NULL,
	CONSTRAINT weapons_pkey PRIMARY KEY (weapon_id),
	CONSTRAINT weapons_equipment_type_id_fkey FOREIGN KEY (equipment_type_id) REFERENCES stargrave.equipment_types(equipment_type_id)
);

-- Drop table

-- DROP TABLE stargrave.power_categories;

CREATE TABLE stargrave.power_categories (
	power_category_id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	description text NULL,
	CONSTRAINT power_categories_name_key UNIQUE (name),
	CONSTRAINT power_categories_pkey PRIMARY KEY (power_category_id)
);

-- Drop table

-- DROP TABLE stargrave.powers;

CREATE TABLE stargrave.powers (
	power_id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	activation_number int4 NOT NULL,
	strain int4 NOT NULL,
	category_id int4 NULL,
	description text NULL,
	CONSTRAINT powers_pkey PRIMARY KEY (power_id),
	CONSTRAINT powers_category_id_fkey FOREIGN KEY (category_id) REFERENCES stargrave.power_categories(power_category_id)
);

-- Drop table

-- DROP TABLE stargrave.background_core_powers;
CREATE TABLE stargrave.background_core_powers (
    background_core_power_id SERIAL PRIMARY KEY,
    background_id INTEGER REFERENCES stargrave.backgrounds(background_id),
    power_id INTEGER REFERENCES stargrave.powers(power_id),
    UNIQUE(background_id, power_id)
);

-- Drop table

-- DROP TABLE stargrave.character_roles;

CREATE TABLE stargrave.character_roles (
	character_role_id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	description text NULL,
	CONSTRAINT character_roles_name_key UNIQUE (name),
	CONSTRAINT character_roles_pkey PRIMARY KEY (character_role_id)
);

-- Drop table

-- DROP TABLE stargrave."characters";

CREATE TABLE stargrave."characters" (
	character_id serial4 NOT NULL,
	crew_id int4 NULL,
	background_id int4 NULL,
	"name" varchar(100) NOT NULL,
	role_id int4 NULL,
	"level" int4 NOT NULL,
	"move" int4 NOT NULL,
	fight int4 NOT NULL,
	shoot int4 NOT NULL,
	armor int4 NOT NULL,
	will int4 NOT NULL,
	health int4 NOT NULL,
	current_health int4 NULL,
	CONSTRAINT characters_pkey PRIMARY KEY (character_id),
	CONSTRAINT characters_background_id_fkey FOREIGN KEY (background_id) REFERENCES stargrave.backgrounds(background_id),
	CONSTRAINT characters_crew_id_fkey FOREIGN KEY (crew_id) REFERENCES stargrave.crews(crew_id),
	CONSTRAINT characters_role_id_fkey FOREIGN KEY (role_id) REFERENCES stargrave.character_roles(character_role_id)
);

-- Drop table

-- DROP TABLE stargrave.character_powers;

CREATE TABLE stargrave.character_powers (
	character_id int4 NOT NULL,
	power_id int4 NOT NULL,
	activation_number int4 NOT NULL,
	CONSTRAINT character_powers_pkey PRIMARY KEY (character_id, power_id),
	CONSTRAINT character_powers_character_id_fkey FOREIGN KEY (character_id) REFERENCES stargrave."characters"(character_id),
	CONSTRAINT character_powers_power_id_fkey FOREIGN KEY (power_id) REFERENCES stargrave.powers(power_id)
);

-- Drop table

-- DROP TABLE stargrave.character_equipment;

CREATE TABLE stargrave.character_equipment (
	character_id int4 NOT NULL,
	equipment_type_id int4 NOT NULL,
	CONSTRAINT character_equipment_pkey PRIMARY KEY (character_id, equipment_type_id),
	CONSTRAINT character_equipment_character_id_fkey FOREIGN KEY (character_id) REFERENCES stargrave."characters"(character_id),
	CONSTRAINT character_equipment_equipment_type_id_fkey FOREIGN KEY (equipment_type_id) REFERENCES stargrave.equipment_types(equipment_type_id)
);

-- Drop table

-- DROP TABLE stargrave.creatures;

CREATE TABLE stargrave.creatures (
	creature_id serial4 NOT NULL,
	"name" varchar(100) NOT NULL,
	"move" int4 NOT NULL,
	fight int4 NOT NULL,
	shoot int4 NOT NULL,
	armor int4 NOT NULL,
	will int4 NOT NULL,
	health int4 NOT NULL,
	description text NULL,
	bounty_value int4 DEFAULT 0 NULL,
	CONSTRAINT creatures_pkey PRIMARY KEY (creature_id)
);

-- Drop table

-- DROP TABLE stargrave.creature_attributes;

CREATE TABLE stargrave.creature_attributes (
	attribute_id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	description text NULL,
	CONSTRAINT creature_attributes_pkey PRIMARY KEY (attribute_id)
);

-- Drop table

-- DROP TABLE stargrave.creature_attributes_link;

CREATE TABLE stargrave.creature_attributes_link (
	creature_id int4 NOT NULL,
	attribute_id int4 NOT NULL,
	CONSTRAINT creature_attributes_link_pkey PRIMARY KEY (creature_id, attribute_id),
	CONSTRAINT creature_attributes_link_attribute_id_fkey FOREIGN KEY (attribute_id) REFERENCES stargrave.creature_attributes(attribute_id),
	CONSTRAINT creature_attributes_link_creature_id_fkey FOREIGN KEY (creature_id) REFERENCES stargrave.creatures(creature_id)
);

-- Drop table

-- DROP TABLE stargrave.ship_upgrades;

CREATE TABLE stargrave.ship_upgrades (
	ship_upgrade_id serial4 NOT NULL,
	"name" varchar(100) NOT NULL,
	"cost" int4 NOT NULL,
	description text NULL,
	max_quantity int4 DEFAULT 1 NULL,
	CONSTRAINT ship_upgrades_pkey PRIMARY KEY (ship_upgrade_id)
);

-- Drop table

-- DROP TABLE stargrave.crew_ship_upgrades;

CREATE TABLE stargrave.crew_ship_upgrades (
	crew_ship_upgrade_id serial4 NOT NULL,
	ship_id int4 NULL,
	ship_upgrade_id int4 NULL,
	quantity int4 DEFAULT 1 NULL,
	CONSTRAINT crew_ship_upgrades_pkey PRIMARY KEY (crew_ship_upgrade_id),
	CONSTRAINT crew_ship_upgrades_ship_id_ship_upgrade_id_key UNIQUE (ship_id, ship_upgrade_id),
	CONSTRAINT crew_ship_upgrades_ship_id_fkey FOREIGN KEY (ship_id) REFERENCES stargrave.crew_ships(ship_id),
	CONSTRAINT crew_ship_upgrades_ship_upgrade_id_fkey FOREIGN KEY (ship_upgrade_id) REFERENCES stargrave.ship_upgrades(ship_upgrade_id)
);

-- Drop table

-- DROP TABLE stargrave.encounter_tables;

CREATE TABLE stargrave.encounter_tables (
	encounter_table_id serial4 NOT NULL,
	"name" varchar(100) NOT NULL,
	description text NULL,
	active bool DEFAULT true NULL,
	CONSTRAINT encounter_tables_pkey PRIMARY KEY (encounter_table_id)
);

-- Drop table

-- DROP TABLE stargrave.encounter_entries;

CREATE TABLE stargrave.encounter_entries (
	encounter_entry_id serial4 NOT NULL,
	encounter_table_id int4 NULL,
	creature_id int4 NULL,
	min_roll int4 NOT NULL,
	max_roll int4 NOT NULL,
	quantity int4 DEFAULT 1 NULL,
	CONSTRAINT encounter_entries_pkey PRIMARY KEY (encounter_entry_id),
	CONSTRAINT valid_roll_range CHECK (((min_roll <= max_roll) AND (min_roll >= 1) AND (max_roll <= 20))),
	CONSTRAINT encounter_entries_creature_id_fkey FOREIGN KEY (creature_id) REFERENCES stargrave.creatures(creature_id),
	CONSTRAINT encounter_entries_encounter_table_id_fkey FOREIGN KEY (encounter_table_id) REFERENCES stargrave.encounter_tables(encounter_table_id)
);

-- Drop table

-- DROP TABLE stargrave.soldier_classes;

CREATE TABLE stargrave.soldier_classes (
	soldier_class_id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	description text NULL,
	CONSTRAINT soldier_classes_name_key UNIQUE (name),
	CONSTRAINT soldier_classes_pkey PRIMARY KEY (soldier_class_id)
);

-- Drop table

-- DROP TABLE stargrave.soldier_types;

CREATE TABLE stargrave.soldier_types (
	soldier_type_id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	class_id int4 NULL,
	"move" int4 NOT NULL,
	fight int4 NOT NULL,
	shoot int4 NOT NULL,
	armor int4 NOT NULL,
	will int4 NOT NULL,
	health int4 NOT NULL,
	"cost" int4 NOT NULL,
	notes text NULL,
	CONSTRAINT soldier_types_pkey PRIMARY KEY (soldier_type_id),
	CONSTRAINT soldier_types_class_id_fkey FOREIGN KEY (class_id) REFERENCES stargrave.soldier_classes(soldier_class_id)
);

-- Drop table

-- DROP TABLE stargrave.soldiers;

CREATE TABLE stargrave.soldiers (
	soldier_id serial4 NOT NULL,
	crew_id int4 NULL,
	soldier_type_id int4 NULL,
	"name" varchar(100) NULL,
	current_health int4 NULL,
	CONSTRAINT soldiers_pkey PRIMARY KEY (soldier_id),
	CONSTRAINT soldiers_crew_id_fkey FOREIGN KEY (crew_id) REFERENCES stargrave.crews(crew_id),
	CONSTRAINT soldiers_soldier_type_id_fkey FOREIGN KEY (soldier_type_id) REFERENCES stargrave.soldier_types(soldier_type_id)
);

-- Drop table

-- DROP TABLE stargrave.soldier_equipment;

CREATE TABLE stargrave.soldier_equipment (
	soldier_id int4 NOT NULL,
	equipment_type_id int4 NOT NULL,
	CONSTRAINT soldier_equipment_pkey PRIMARY KEY (soldier_id, equipment_type_id),
	CONSTRAINT soldier_equipment_equipment_type_id_fkey FOREIGN KEY (equipment_type_id) REFERENCES stargrave.equipment_types(equipment_type_id),
	CONSTRAINT soldier_equipment_soldier_id_fkey FOREIGN KEY (soldier_id) REFERENCES stargrave.soldiers(soldier_id)
);

