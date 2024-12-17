-- Backgrounds
INSERT INTO stargrave.backgrounds ("name",description,stat_modifications,will_bonus,health_bonus,health_mod,will_mod,move_mod,fight_mod,shoot_mod) VALUES
	 ('Biomorph','When the old empires fell, so did their laws limiting genetic enhancement. Biomorphs have unique abilities to control their own bodies.',NULL,NULL,NULL,1,0,0,0,0),
	 ('Cyborg','A fusion of man and machine, cyborgs have been a constant feature of every war for the past several centuries.',NULL,NULL,NULL,1,0,0,0,0),
	 ('Mystic','As the galaxy exploded during the Last War, many people turned to religion to try to find solace.',NULL,NULL,NULL,1,2,0,0,0),
	 ('Robotics Expert','Few people truly understand robots. Robotics Experts have an empathy, or fluency, with these constructs.',NULL,NULL,NULL,0,1,0,0,0),
	 ('Rogue','While law and order has broken down across most of the galaxy, rogues never paid it much attention anyway.',NULL,NULL,NULL,1,1,0,0,0),
	 ('Psionicist','Psionicists can shape and affect reality with nothing more than the mind.',NULL,NULL,NULL,1,2,0,0,0),
	 ('Tekker','Technology advances much faster in some corners of the galaxy than in others. Tekkers can repair the highest-level technology.',NULL,NULL,NULL,0,2,0,0,0),
	 ('Veteran','The Last War saw more people take up arms than at any point in the history of the galaxy.',NULL,NULL,NULL,1,0,0,1,0)
 ;
 
 -- Background_stat_choices
 INSERT INTO stargrave.background_stat_choices (background_id,choices_allowed,can_choose_move,can_choose_fight,can_choose_shoot,can_choose_health) VALUES
	 (1,2,true,true,true,false),
	 (2,2,true,true,true,false),
	 (3,1,true,true,true,false),
	 (4,2,true,true,true,true),
	 (5,2,true,true,true,false),
	 (6,1,true,true,true,false),
	 (7,2,true,true,true,true),
	 (8,1,true,true,true,false)
;

-- Equipment_slots
INSERT INTO stargrave.equipment_slots ("name",description) VALUES
	 ('Weapon','Offensive equipment'),
	 ('Armor','Defensive equipment'),
	 ('Gear','Utility equipment')
;

-- Equipment_types
INSERT INTO stargrave.equipment_types ("name",slot_type_id,description) VALUES
	 ('Basic Weapon',1,'Standard combat weapons'),
	 ('Ranged Weapon',1,'Distance combat weapons'),
	 ('Heavy Weapon',1,'Powerful but slot-intensive weapons'),
	 ('Basic Armor',2,'Standard protective gear'),
	 ('Advanced Armor',2,'High-tech protective systems'),
	 ('Utility Gear',3,'Support and special equipment'),
	 ('Deck',3,'Cyberdeck for unlocking data-loot. +6 to unlock rolls'),
	 ('Filter Mask',3,'Protection from gases and low oxygen'),
	 ('Medic Kit',3,'Used to heal and remove various conditions'),
	 ('Picks',3,'Tools for unlocking physical-loot. +6 to unlock rolls')
;
INSERT INTO stargrave.equipment_types ("name",slot_type_id,description) VALUES
	 ('Grenade - Fragmentation',3,'Explosive device with 1.5" radius'),
	 ('Grenade - Smoke',3,'Creates 4" diameter smoke cloud'),
	 ('Standard Military Kit',1,'Carbine + Light Armor'),
	 ('Close Combat Kit',1,'Hand Weapon + Heavy Armor'),
	 ('Support Weapon Kit',1,'Rapid-fire + Heavy Armor')
;

-- Armor
INSERT INTO stargrave.armor (equipment_type_id,"name",armor_modifier,gear_slots,movement_penalty,notes) VALUES
	 (4,'Light Armor',1,1,0,'Basic protection for vital organs'),
	 (4,'Heavy Armor',2,1,-1,'Full body protection but reduces mobility'),
	 (5,'Combat Armor',4,2,0,'Includes integrated weapons and life support. 50cr upkeep cost'),
	 (4,'Shield',0,1,0,'Cannot be used with weapons that take 2+ slots')
;

-- Weapons
INSERT INTO stargrave.weapons (equipment_type_id,"name",damage_modifier,max_range,gear_slots,notes) VALUES
	 (1,'Unarmed',-2,NULL,0,'-2 Fight'),
	 (1,'Knife',-1,NULL,1,'First knife does not take up a gear slot'),
	 (1,'Hand Weapon',0,NULL,1,'Purpose-built for hand-to-hand fighting'),
	 (2,'Pistol',0,10,1,'One-handed firearm'),
	 (2,'Carbine',0,24,2,'Standard military weapon'),
	 (2,'Shotgun',1,12,2,'Trades range for power'),
	 (3,'Rapid-fire',2,24,3,'-1 Move unless wearing heavy armor or combat armor. Can target two figures within 2" of each other'),
	 (3,'Grenade Launcher',0,16,3,'-1 to hit rolls. Can fire both types of grenades'),
	 (3,'Flamethrower',2,0,2,'-1 Move unless wearing heavy armor or combat armor. Uses template')
;

-- Power_categories
INSERT INTO stargrave.power_categories ("name",description) VALUES
	 ('Line of Sight','Powers that require line of sight to target'),
	 ('Out of Game','Powers used before or after the game'),
	 ('Self Only','Powers that only affect the user'),
	 ('Touch','Powers that require close proximity')
;

-- Powers
INSERT INTO stargrave.powers ("name",activation_number,strain,category_id,description) VALUES
	 ('Adrenaline Surge',12,2,3,'This figure immediately gains an additional action during this activation, and an additional action in their next activation as well'),
	 ('Antigravity Projection',10,0,1,'The target figure gains the Levitate attribute for the rest of the game'),
	 ('Armour Plates',10,2,3,'The figure gains +2 Armour. This power may not be used if the figure is already wearing combat armour'),
	 ('Armoury',10,0,2,'The crew can field one suit of combat armour without having to pay its normal upkeep cost'),
	 ('Bait and Switch',12,2,1,'This power may only be used against a soldier carrying a loot token. That figure must make an immediate Will Roll (TN14)'),
	 ('Break Lock',12,1,1,'Immediately unlocks one physical-loot counter'),
	 ('Camouflage',10,2,3,'No figure may draw line of sight to this figure if it is more than 12" away'),
	 ('Cancel Power',12,1,1,'Immediately cancels all effects of one ongoing Line of Sight power'),
	 ('Command',10,0,1,'Select one member of the crew that is in line of sight. That figure now activates in the current player''s phase this turn'),
	 ('Dark Energy',10,1,1,'The figure makes a +5 Shooting attack against any target within 12"');
INSERT INTO stargrave.powers ("name",activation_number,strain,category_id,description) VALUES
	 ('Data Jump',10,1,1,'Move data-loot token between crew members within 8" of one another'),
	 ('Heal',10,0,1,'This power restores up to 5 points of lost Health to a target figure within 6"'),
	 ('Life Leach',10,0,1,'Target loses 3 Health and figure using power regains 3 Health'),
	 ('Power Spike',8,1,3,'Next shooting attack does +3 Damage'),
	 ('Quick-Step',10,1,3,'Move 4" in any direction, including out of combat'),
	 ('Regenerate',8,0,3,'The activator regains up to 3 points of lost Health'),
	 ('Bribe',14,0,2,'Place bribe token. Can be used to make enemy soldier automatically miss a shooting attack'),
	 ('Concealed Firearm',10,1,3,'Make one +5 Shooting attack while in combat'),
	 ('Control Animal',10,1,1,'Target animal must make Will Roll (TN16) or become temporary crew member'),
	 ('Control Robot',10,1,1,'Target robot must make Will Roll (TN15) or become temporary crew member');
INSERT INTO stargrave.powers ("name",activation_number,strain,category_id,description) VALUES
	 ('Coordinated Fire',10,0,1,'Target crew member receives +1 Shoot for the game duration'),
	 ('Create Robot',14,0,2,'Add one free robot soldier to crew'),
	 ('Data Knock',12,1,1,'Immediately unlocks one data-loot counter'),
	 ('Data Skip',12,2,1,'Move data-loot token up to 4" in any direction'),
	 ('Destroy Weapon',12,2,1,'Destroy one non-indestructible weapon carried by target'),
	 ('Drone',10,1,4,'Place drone that can be used for line of sight'),
	 ('Electromagnetic Pulse',10,1,1,'Disable robots or jam weapons'),
	 ('Energy Shield',10,0,3,'Absorbs next 3 points of Damage from Shooting attacks'),
	 ('Fling',8,1,4,'Move target figure 6" in any direction'),
	 ('Fortune',12,0,3,'Gain fortune token for reroll');
INSERT INTO stargrave.powers ("name",activation_number,strain,category_id,description) VALUES
	 ('Haggle',10,0,2,'Receive 20% more when selling items'),
	 ('Holographic Wall',10,1,1,'Creates 6" long and 3" high holographic wall'),
	 ('Lift',10,0,1,'Move crew member 6" in any direction'),
	 ('Mystic Trance',8,0,2,'Use another power before first Initiative Roll'),
	 ('Psionic Fire',10,1,3,'Place two flamethrower templates for +3 attacks'),
	 ('Pull',12,1,1,'Move target figure up to 6" horizontally'),
	 ('Puppet Master',12,2,4,'Return fallen soldier to table with 1 Health'),
	 ('Psychic Shield',10,2,1,'Next shooting damage is halved'),
	 ('Remote Guidance',10,0,4,'Robot can always activate in same phase as activator'),
	 ('Remote Firing',10,0,1,'Robot makes immediate +3 Shooting attack');
INSERT INTO stargrave.powers ("name",activation_number,strain,category_id,description) VALUES
	 ('Repair Robot',10,0,1,'Restore up to 5 Health to target robot'),
	 ('Restructure Body',10,0,3,'Gain one special trait'),
	 ('Re-wire Robot',14,0,2,'Permanently modify robot stats'),
	 ('Suggestion',12,1,1,'Target drops loot and can be moved 3"'),
	 ('Target Designation',8,0,1,'Target receives -2 Fight against Shooting attacks'),
	 ('Target Lock',10,1,4,'Make immediate guaranteed grenade attack'),
	 ('Temporary Upgrade',12,0,3,'Gain temporary stat increase'),
	 ('Toxic Claws',10,1,3,'Gain toxic hand weapon that does +2 Damage'),
	 ('Toxic Secretion',12,0,2,'Make crew members'' attacks toxic'),
	 ('Transport',10,1,1,'Move crew member up to 6" in any direction');
INSERT INTO stargrave.powers ("name",activation_number,strain,category_id,description) VALUES
	 ('Void Blade',10,0,3,'Hand weapon becomes indestructible and does +2 Damage'),
	 ('Wall of Force',12,1,3,'Create impenetrable 6" long and 3" high wall');

-- Background_core_powers
INSERT INTO stargrave.background_core_powers (background_id,power_id) VALUES
	 (1,1),
	 (1,3),
	 (1,7),
	 (1,16),
	 (1,29),
	 (1,42),
	 (1,48),
	 (1,49),
	 (2,7),
	 (2,14);
INSERT INTO stargrave.background_core_powers (background_id,power_id) VALUES
	 (2,15),
	 (2,20),
	 (2,23),
	 (2,28),
	 (2,46),
	 (2,47),
	 (3,10),
	 (3,12),
	 (3,13),
	 (3,19);
INSERT INTO stargrave.background_core_powers (background_id,power_id) VALUES
	 (3,34),
	 (3,37),
	 (3,44),
	 (3,51),
	 (4,20),
	 (4,22),
	 (4,26),
	 (4,27),
	 (4,39),
	 (4,40);
INSERT INTO stargrave.background_core_powers (background_id,power_id) VALUES
	 (4,41),
	 (4,43),
	 (5,5),
	 (5,8),
	 (5,11),
	 (5,15),
	 (5,17),
	 (5,18),
	 (5,30),
	 (5,31);
INSERT INTO stargrave.background_core_powers (background_id,power_id) VALUES
	 (6,6),
	 (6,25),
	 (6,33),
	 (6,35),
	 (6,36),
	 (6,38),
	 (6,44),
	 (6,52),
	 (7,2),
	 (7,11);
INSERT INTO stargrave.background_core_powers (background_id,power_id) VALUES
	 (7,23),
	 (7,24),
	 (7,26),
	 (7,27),
	 (7,32),
	 (7,50),
	 (8,4),
	 (8,9),
	 (8,14),
	 (8,21);
INSERT INTO stargrave.background_core_powers (background_id,power_id) VALUES
	 (8,28),
	 (8,30),
	 (8,40),
	 (8,45);

-- Character_roles
INSERT INTO stargrave.character_roles ("name",description) VALUES
	 ('Captain','Leader of the crew'),
	 ('First Mate','Second in command');

-- Creatures
INSERT INTO stargrave.creatures ("name","move",fight,shoot,armor,will,health,description,bounty_value) VALUES
	 ('Bileworm',4,2,2,10,3,12,'Featureless worms that can grow over twenty feet long',0),
	 ('Bounty Hunter',6,3,3,11,2,14,'Mercenaries hunting for profit',0),
	 ('Drone',6,0,0,10,2,8,'Small flying reconnaissance robots',0),
	 ('Ferrox',8,2,0,8,4,12,'Predatory animals combining wolf and fox traits',0),
	 ('Gaunch',6,2,0,8,2,10,'Scavenging humanoids with chameleonic skin',0),
	 ('Horat',6,4,0,14,1,14,'Giant woolly rhinoceros',0),
	 ('Magmite',5,3,0,13,4,10,'Heat-loving armored crustaceans',0),
	 ('Mindgripper',6,2,0,18,3,1,'Parasitic creatures that control their hosts',0),
	 ('Pirate Shock Trooper',6,4,4,13,3,14,'Elite soldiers of the pirate fleets',0),
	 ('Pirate Trooper',5,2,2,11,0,12,'Standard pirate military forces',0);
INSERT INTO stargrave.creatures ("name","move",fight,shoot,armor,will,health,description,bounty_value) VALUES
	 ('Primitive',6,1,0,9,0,10,'Stone-age level warriors',0),
	 ('Repairbot',5,0,0,8,0,8,'Simple maintenance robots',0),
	 ('Ruffian',6,2,1,9,0,10,'Common armed thugs',0),
	 ('Ryakan',8,2,0,10,2,10,'Flying predators that spread via spacecraft',0),
	 ('Sentrabot',5,0,2,12,2,12,'Simple combat robots',0),
	 ('Sewer-dragon',5,4,0,12,4,16,'Large lizards found in industrial areas',0),
	 ('Shengrylla',6,2,0,10,3,12,'Three-eyed primates that feed on power cells',0),
	 ('Tangler',6,1,0,12,1,12,'Octopus-like creatures skilled at grappling',0),
	 ('Warbot',6,4,4,15,6,20,'Heavy combat robots from the Last War',0),
	 ('Warp Hound',8,4,0,13,15,15,'Mysterious creatures that can fold space',0);
INSERT INTO stargrave.creatures ("name","move",fight,shoot,armor,will,health,description,bounty_value) VALUES
	 ('Dedfurd',4,2,4,12,2,16,'Large, bloated amphibious creatures',20),
	 ('Porigota',5,4,0,12,0,14,'Insectoid creatures hunted for sport',30);

-- Creature_attributes
INSERT INTO stargrave.creature_attributes ("name",description) VALUES
	 ('Animal','Natural creature with less-than-human intelligence. Cannot interact with loot tokens and have no gear slots'),
	 ('Amphibious','Perfect in water and land. Automatically passes swimming rolls'),
	 ('Aquatic','Can only live in water. Treats all ground as rough ground'),
	 ('Bounty','Extra reward for killing this creature'),
	 ('Burrowing','Can move through terrain as though it were not there'),
	 ('Chameleon','Cannot be targeted from more than 12" away'),
	 ('Ensnare','Cannot be pushed back unless damaged'),
	 ('Expert Climber','No movement penalty for climbing'),
	 ('Flying','Ignores all terrain and movement penalties'),
	 ('Hatred of Gunfire','Prioritizes targets that made shooting attacks');
INSERT INTO stargrave.creature_attributes ("name",description) VALUES
	 ('Horns','+2 Fight when charging into combat'),
	 ('Immune to Critical Hits','Never suffers extra damage from critical hits'),
	 ('Large','-2 to Combat Score against shooting attacks'),
	 ('Never Stunned','Never suffers stun effects'),
	 ('Never Wounded','Never suffers wounded penalties'),
	 ('Pack Hunter','Activates as group when in contact'),
	 ('Powerful','Does x2 Damage'),
	 ('Ranged Attack','Has natural ranged attack ability'),
	 ('Robot','Never wounded and subject to robot rules'),
	 ('Sharp Teeth','Does +1 Damage');
INSERT INTO stargrave.creature_attributes ("name",description) VALUES
	 ('Strong','Does +2 Damage'),
	 ('Toxic','Attacks are toxic and immune to toxins'),
	 ('Unaggressive','Only fights when attacked');

-- Creature_attributes_link
INSERT INTO stargrave.creature_attributes_link (creature_id,attribute_id) VALUES
	 (1,1),
	 (1,5),
	 (1,12),
	 (1,18),
	 (1,22),
	 (3,1),
	 (3,2),
	 (3,13),
	 (3,18),
	 (3,22);
INSERT INTO stargrave.creature_attributes_link (creature_id,attribute_id) VALUES
	 (4,9),
	 (4,19),
	 (5,1),
	 (5,16),
	 (6,6),
	 (7,1),
	 (7,10),
	 (7,11),
	 (7,13),
	 (7,21);
INSERT INTO stargrave.creature_attributes_link (creature_id,attribute_id) VALUES
	 (8,1),
	 (8,21),
	 (9,7),
	 (13,1),
	 (13,13),
	 (13,15),
	 (13,21),
	 (14,19),
	 (14,23),
	 (16,1);
INSERT INTO stargrave.creature_attributes_link (creature_id,attribute_id) VALUES
	 (16,9),
	 (17,19),
	 (18,1),
	 (18,2),
	 (18,14),
	 (18,21),
	 (19,1),
	 (19,8),
	 (19,20),
	 (20,1);
INSERT INTO stargrave.creature_attributes_link (creature_id,attribute_id) VALUES
	 (20,7),
	 (20,8),
	 (21,13),
	 (21,19),
	 (22,10),
	 (22,12),
	 (22,14),
	 (22,15),
	 (22,17);

-- Ship_upgrades
INSERT INTO stargrave.ship_upgrades ("name","cost",description,max_quantity) VALUES
	 ('Advanced Medical Suite',500,'This upgrade may only be used by a crew that contains a medic. The player may re-roll the Survival Roll for one soldier (specialist or standard) after each game. The second roll must be taken.',1),
	 ('Armament Workshop',500,'If a figure in the crew successfully uses the Armoury power before a game, the crew can field two suits of combat armour without having to pay their normal upkeep cost. Alternatively, two pistols, carbines, or shotguns may be given a +1 Damage modifier for the next game only. Or a crew may take one of each option.',1),
	 ('Communications Array',300,'Grants +2 to the Activation Roll for the Bribe power for any one member of the crew.',1),
	 ('External Cargo Pods',300,'The ship has extra room for carrying trade goods. Anytime this crew sells trade goods, it gets an extra 20% on top of the listed value.',1),
	 ('Extra Quarters',1000,'A ship with extra quarters allows the crew to include one more specialist crewman than is normally allowed – 5 instead of the normal 4. The crew is still limited to 8 crewmen in total, however.',1),
	 ('Meditation Chamber',400,'Grants +2 to the Activation Roll for the Mystic Trance power for any one member of the crew.',2),
	 ('Robotics Workshop',650,'Grants +1 to the Activation Roll for Create Robot, Remote Guidance, or Re-wire Robot for any one member of the crew when used Out of Game. This bonus may only be applied to one roll between each game.',1),
	 ('Weapon Locker',600,'Before each game, one soldier may be given a pistol, carbine, or shotgun that does +1 Damage that they may use for the following game only. This weapon is not indestructible, and takes up the soldier''s gear slot.',1);

-- Encounter_tables
INSERT INTO stargrave.encounter_tables ("name",description,active) VALUES
	 ('Standard Random Encounter','Default encounter table from the core rulebook',true);

-- Encounter_entries
INSERT INTO stargrave.encounter_entries (encounter_table_id,creature_id,min_roll,max_roll,quantity) VALUES
	 (1,1,3,3,1),
	 (1,2,9,9,1),
	 (1,5,2,2,1),
	 (1,6,12,12,1),
	 (1,7,15,15,1),
	 (1,8,8,8,1),
	 (1,9,14,14,1),
	 (1,12,7,7,3),
	 (1,12,6,6,1),
	 (1,15,4,4,1);
INSERT INTO stargrave.encounter_entries (encounter_table_id,creature_id,min_roll,max_roll,quantity) VALUES
	 (1,16,1,1,1),
	 (1,17,17,17,1),
	 (1,18,20,20,1),
	 (1,19,5,5,1),
	 (1,20,16,16,2),
	 (1,20,10,10,1),
	 (1,21,19,19,1),
	 (1,22,18,18,1),
	 (1,3,11,11,1),
	 (1,13,13,13,1);

-- Soldier_classes
INSERT INTO stargrave.soldier_classes ("name",description) VALUES
	 ('Standard','Basic soldier type'),
	 ('Specialist','Advanced soldier type with special abilities');

-- Soldier_types
INSERT INTO stargrave.soldier_types ("name",class_id,"move",fight,shoot,armor,will,health,"cost",notes) VALUES
	 ('Recruit',1,6,2,2,10,0,12,0,'Pistol, Light Armor, Knife'),
	 ('Runner',1,7,2,1,9,1,12,0,'Pistol, Knife'),
	 ('Hacker',1,6,1,1,10,1,12,20,'Pistol, Deck, Light Armor, Knife'),
	 ('Chiseler',1,6,1,1,10,1,12,20,'Pistol, Picks, Light Armor, Knife'),
	 ('Guard Dog',1,8,1,0,8,-2,10,10,'Animal, Cannot carry gear or loot'),
	 ('Sentry',1,5,3,2,11,0,14,50,'Carbine, Heavy Armor, Hand Weapon'),
	 ('Trooper',1,5,2,3,11,0,14,50,'Carbine, Heavy Armor, Knife'),
	 ('Medic',1,7,2,2,10,3,14,100,'Pistol, Light Armor, Medic Kit'),
	 ('Codebreaker',2,6,3,2,10,2,14,75,'Carbine, Deck, Light Armor, Knife'),
	 ('Casecracker',2,6,3,2,10,2,14,75,'Carbine, Picks, Light Armor, Knife');
INSERT INTO stargrave.soldier_types ("name",class_id,"move",fight,shoot,armor,will,health,"cost",notes) VALUES
	 ('Commando',2,5,3,3,11,1,14,75,'Carbine, Grenades, Heavy Armor, Hand Weapon'),
	 ('Pathfinder',2,7,3,3,10,2,14,100,'Carbine, Grenades, Light Armor, Hand Weapon'),
	 ('Sniper',2,6,3,4,10,3,14,100,'Carbine, Light Armor, Hand Weapon'),
	 ('Grenadier',2,5,3,3,11,2,14,100,'Grenade Launcher, Pistol, Heavy Armor, Knife'),
	 ('Burner',2,5,3,2,11,1,14,100,'Flamethrower, Pistol, Heavy Armor, Knife'),
	 ('Gunner',2,5,3,3,11,1,14,100,'Rapid-fire, Pistol, Heavy Armor, Knife'),
	 ('Armoured Trooper',2,6,4,4,13,3,14,150,'Carbine, Combat Armor');


