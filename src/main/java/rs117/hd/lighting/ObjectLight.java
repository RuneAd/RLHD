/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2021, 117 <https://twitter.com/117scape>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package rs117.hd.lighting;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import static net.runelite.api.NullObjectID.NULL_5208;
import static net.runelite.api.NullObjectID.NULL_5247;
import net.runelite.api.ObjectID;
import static net.runelite.api.ObjectID.*;
import static rs117.hd.lighting.LightManager.Alignment;
import static rs117.hd.lighting.LightManager.LightType;

@AllArgsConstructor
@Getter
enum ObjectLight
{
	STANDING_TORCH(250, Alignment.CENTER, 500, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, ObjectID.STANDING_TORCH, STANDING_TORCH_5494, STANDING_TORCH_6404, STANDING_TORCH_6406, STANDING_TORCH_6408, STANDING_TORCH_6410, STANDING_TORCH_6412, STANDING_TORCH_6413, STANDING_TORCH_6414, STANDING_TORCH_6415, STANDING_TORCH_6416, STANDING_TORCH_6896, STANDING_TORCH_10178, STANDING_TORCH_10179, STANDING_TORCH_11606, STANDING_TORCH_15158, STANDING_TORCH_20716, CANDLE_STAND_25122, CANDLE_STAND_25123),
	STANDING_TORCH_SHORT(200, Alignment.CENTER, 450, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, 3478, STANDING_TORCH_5881, TORCH_17237, TORCH_32118, 33454, TORCH_38512, TORCH_38513, TORCH_38514, TORCH_38555, TORCH_38562),
	STANDING_TORCH_SHORT_LARGE(250, Alignment.CENTER, 700, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, FIRE_25156),
	STANDING_TORCH_LARGE(250, Alignment.CENTER, 700, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, BRAZIER_37826),

	WALL_TORCH(235, Alignment.CENTER, 300, 3f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, 198, 3474, 4694, 5247, 5208, 6537, 10297, 12238, 12300, 20942, 25659, 31628),
	WALL_TORCH_MID(200, Alignment.CENTER, 300, 3f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, 196, 197, 202, 206, CANDLES_203, 2175, 2501, 4501, 7432, 11474, 24414),
	WALL_TORCH_MID_SMALL(220, Alignment.CENTER, 300, 3f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, 24173),
	WALL_CANDLE(300, Alignment.FRONT, 300, 2.5f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, 9746),
	FLOOR_CANDLES_CENTER(10, Alignment.CENTER, 300, 2.5f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, 11472, CANDLES_12301),
	FLOOR_CANDLES_BACK(10, Alignment.BACK, 200, 2.5f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, CANDLES_12302),

	LANTERN(250, Alignment.CENTER, 500, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, ObjectID.LANTERN, LANTERN_10307, LANTERN_11468, LANTERN_16901),

	PAPER_LANTERN(200, Alignment.CENTER, 500, 3f, rgb(235, 107, 52), LightType.FLICKER, 0, 20, LANTERN_42132, LANTERN_42133, LANTERN_42134, LANTERN_42135),

	GAMES_ROOM_FIREPLACE(185, Alignment.CENTER, 1500, 3.0f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, FIREPLACE_4650),

	SPIT_ROAST(50, Alignment.CENTER, 250, 3f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, ObjectID.SPIT_ROAST, SPIT_ROAST_5608),

	FIRE(40, Alignment.CENTER, 450, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, ObjectID.FIRE, FIRE_3775, FIRE_4265, FIRE_4266, FIRE_5249, FIRE_5499, FIRE_5981, FIRE_9735, FIRE_10660, 12795, FIRE_12796, FIRE_13337, FIRE_13881, FIRE_14169, FIRE_15156, CAMPFIRE, CAMPFIRE_19884, FIRE_21620, FIRE_23046, CAMPING_FIRE, CAMPFIRE_25374, FIRE_25465, FIRE_26185, FIRE_26577, FIRE_26578, FIRE_28791, CAMPFIRE_29085, 29300, FIRE_30021, FIRE_31798, FIRE_32297, FIRE_33311, FIRE_34682, FIRE_35810, FIRE_35811, FIRE_35912, FIRE_35913),
	FIRE_LARGE(80, Alignment.CENTER, 800, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, FIRE_25155, FIRE_35812, FIRE_40728),

	MAGICAL_FIRE(40, Alignment.CENTER, 450, 3f, rgb(161, 252, 3), LightType.FLICKER, 0, 20, MAGICAL_FIRE_37996),
	MAGICAL_FIRE_LARGE(80, Alignment.CENTER, 800, 3f, rgb(161, 252, 3), LightType.FLICKER, 0, 20, MAGICAL_FIRE_37994, MAGICAL_FIRE_37995),

	FIREPLACE(70, Alignment.CENTER, 800, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, ObjectID.FIREPLACE, FIREPLACE_5165, FIREPLACE_6093, FIREPLACE_6094, FIREPLACE_6095, FIREPLACE_6096, FIREPLACE_7185, FIREPLACE_8712, FIREPLACE_9439, FIREPLACE_9440, FIREPLACE_9441, FIREPLACE_10058, FIREPLACE_10824, FIREPLACE_17640, FIREPLACE_17641, FIREPLACE_17642, FIREPLACE_17643, FIREPLACE_18039, FIREPLACE_21795, FIREPLACE_24969, FIREPLACE_24970, FIREPLACE_26179, FIREPLACE_30136, FIREPLACE_30137, FIREPLACE_30138, CLAY_FIREPLACE_6781, DECORATED_LIMESTONE_FIREPLACE_40775, DECORATED_MARBLE_FIREPLACE_40777, LIMESTONE_FIREPLACE_6783, LIMESTONE_FIREPLACE_17325, MARBLE_FIREPLACE_6785),

	AIR_BALLOON_FIRE(400, Alignment.CENTER, 450, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, 19135),

	LIT_BARRICADE(100, Alignment.CENTER, 400, 2.5f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, BARRICADE_35806),

	STANDING_TORCH_BLUE(250, Alignment.CENTER, 450, 4f, rgb(0, 220, 255), LightType.FLICKER, 0, 20, TORCH_34345),
	STANDING_TORCH_LARGE_BLUE(250, Alignment.CENTER, 700, 3f, rgb(0, 220, 255), LightType.FLICKER, 0, 20, STANDING_TORCH_34346),

	PURPLE_FIRE(40, Alignment.CENTER, 450, 2.5f, rgb(120, 24, 237), LightType.FLICKER, 0, 20, ObjectID.FIRE_20001),
	RED_FIRE(40, Alignment.CENTER, 450, 2.5f, rgb(222, 39, 22), LightType.FLICKER, 0, 20, ObjectID.FIRE_26186),
	BLUE_FIRE(40, Alignment.CENTER, 450, 2.5f, rgb(3, 119, 252), LightType.FLICKER, 0, 20, ObjectID.FIRE_26576),
	WHITE_FIRE(40, Alignment.CENTER, 450, 1.5f, rgb(255, 255, 255), LightType.FLICKER, 0, 20, ObjectID.FIRE_20000),
	GREEN_FIRE(40, Alignment.CENTER, 450, 2.5f, rgb(70, 242, 31), LightType.FLICKER, 0, 20, ObjectID.FIRE_26575),

	KARAMJA_ROPE(270, Alignment.CENTER, 450, 6.0f, rgb(200, 220, 255), LightType.STATIC, 0, 0, CLIMBING_ROPE_18967, CLIMBING_ROPE_18968, CLIMBING_ROPE_18969, CLIMBING_ROPE_25213),

	MINE_LANTERN(180, Alignment.CENTER, 700, 2.5f, rgb(252, 208, 104), LightType.FLICKER, 0, 30, 17829, 25055, 25056),

	ZANARIS_MUSHROOM_RED(100, Alignment.CENTER, 500, 3f, rgb(255, 50, 0), LightType.STATIC, 0, 0, MUSHROOM_TORCH),
	ZANARIS_MUSHROOM_BLUE(100, Alignment.CENTER, 500, 3f, rgb(0, 150, 255), LightType.STATIC, 0, 0, MUSHROOM_TORCH_12006),

	FURNACE_GLOW(150, Alignment.CENTER, 800, 3f, rgb(252, 90, 3), LightType.FLICKER, 0, 10, 24012),
	BURGH_DE_ROTT_FURNACE(150, Alignment.FRONT, 800, 3f, rgb(252, 90, 3), LightType.FLICKER, 0, 10, 12805),
	EDGEVILLE_FURNACE(40, Alignment.CENTER, 700, 3.5f, rgb(252, 122, 3), LightType.FLICKER, 0, 30, FURNACE_16469, FURNACE_16657),

	ECTOFUNTUS(300, Alignment.CENTER, 1500, 4f, rgb(106, 255, 101), LightType.PULSE, 4000, 15, ObjectID.ECTOFUNTUS),
	ECTOFUNTUS_SMALL(100, Alignment.CENTER, 500, 4f, rgb(106, 255, 101), LightType.PULSE, 4000, 15, ECTOFUNTUS_16649),

	BARROWS_SARCOPHAGUS(200, Alignment.CENTER, 900, 3.3f, rgb(255, 150, 100), LightType.STATIC, 0, 0, SARCOPHAGUS_20720, SARCOPHAGUS_20721, SARCOPHAGUS_20722, SARCOPHAGUS_20770, SARCOPHAGUS_20771, SARCOPHAGUS_20772),

	HEARTH(50, Alignment.CENTER, 650, 5f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, ObjectID.HEARTH),

	TABLE(100, Alignment.CENTER, 250, 3f, rgb(252, 200, 3), LightType.FLICKER, 0, 20, TABLE_6197, TABLE_6199, TABLE_6201),

	CHAOS_RIFT(80, Alignment.CENTER, 600, 4f, rgb(196, 79, 177), LightType.STATIC, 0, 0, CHAOS_RIFT_26765),

	BRANCH_TORCH(215, Alignment.CENTER, 350, 5f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, 11909),

	// Castle Wars
	ZAMORAK_BARRIER(50, Alignment.CENTER, 300, 4f, rgb(255, 50, 0), LightType.PULSE, 1550, 20, ENERGY_BARRIER_4470),
	SARADOMIN_BARRIER(50, Alignment.CENTER, 300, 4f, rgb(0, 80, 255), LightType.PULSE, 1550, 20, ENERGY_BARRIER),
	ZAMORAK_PORTAL(100, Alignment.CENTER, 500, 4f, rgb(255, 50, 0), LightType.PULSE, 1550, 20, ObjectID.ZAMORAK_PORTAL, PORTAL_4390, PORTAL_4407),
	SARADOMIN_PORTAL(100, Alignment.CENTER, 500, 5f, rgb(0, 80, 255), LightType.PULSE, 1550, 20, ObjectID.SARADOMIN_PORTAL, PORTAL_4389),
	GUTHIX_PORTAL(100, Alignment.CENTER, 500, 3f, rgb(0, 255, 120), LightType.PULSE, 1550, 20, ObjectID.GUTHIX_PORTAL),

	// Soul Wars
	SOUL_WARS_BLUE_BARRIER(70, Alignment.CENTER, 400, 6f, rgb(0, 80, 255), LightType.PULSE, 1600, 20, BLUE_BARRIER_40454),
	SOUL_WARS_RED_BARRIER(70, Alignment.CENTER, 400, 6f, rgb(255, 50, 0), LightType.PULSE, 1600, 20, RED_BARRIER_40456, RED_BARRIER_40457),
	SOUL_WARS_CLAN_BARRIER(70, Alignment.CENTER, 400, 6f, rgb(255, 0, 255), LightType.PULSE, 1600, 20, 41200),
	SOUL_WARS_MAIN_BARRIER(70, Alignment.CENTER, 400, 4f, rgb(255, 255, 255), LightType.PULSE, 1600, 20, 41199),
	SOUL_WARS_ENTRANCE_PORTAL(120, Alignment.CENTER, 700, 4f, rgb(255, 220, 46), LightType.PULSE, 1000, 20, 40474, PORTAL_40476),
	SOUL_WARS_BLUE_PORTAL(120, Alignment.CENTER, 700, 4f, rgb(0, 80, 255), LightType.PULSE, 1000, 20, PORTAL_40460),
	SOUL_WARS_RED_PORTAL(120, Alignment.CENTER, 700, 4f, rgb(255, 50, 0), LightType.PULSE, 1000, 20, PORTAL_40461),
	SOUL_WARS_PORTAL_FEROX(190, Alignment.CENTER, 700, 4f, rgb(255, 220, 46), LightType.PULSE, 1000, 20, 40475),
	SOUL_WARS_TORCH(180, Alignment.CENTER, 700, 2.5f, rgb(252, 122, 3), LightType.FLICKER, 0, 30, TORCH_40550, TORCH_40551),
	SOUL_WARS_OBELISK_NEUTRAL(180, Alignment.CENTER, 900, 5f, rgb(252, 255, 255), LightType.PULSE, 1000, 30, SOUL_OBELISK_40449, 40765),
	SOUL_WARS_OBELISK_RED(180, Alignment.CENTER, 900, 5f, rgb(255, 50, 0), LightType.PULSE, 3000, 30, SOUL_OBELISK_40451),
	SOUL_WARS_OBELISK_BLUE(180, Alignment.CENTER, 900, 10f, rgb(0, 120, 255), LightType.PULSE, 3000, 30, SOUL_OBELISK_40450),

	// Ferox Enclave
	CASTLE_WARS_PORTAL(120, Alignment.CENTER, 600, 4f, rgb(0, 255, 136), LightType.PULSE, 1550, 20, ObjectID.CASTLE_WARS_PORTAL),
	COMPETITIVE_BARRIER(100, Alignment.CENTER, 400, 4f, rgb(0, 255, 136), LightType.PULSE, 1600, 20, COMPETITIVE),
	CASUAL_BARRIER(100, Alignment.CENTER, 400, 4f, rgb(0, 255, 120), LightType.PULSE, 1500, 20, CASUAL),
	FEROX_BARRIER(100, Alignment.CENTER, 400, 4f, rgb(255, 50, 0), LightType.PULSE, 2050, 20, 39656),
	CHALLENGE_PORTAL(180, Alignment.CENTER, 600, 4f, rgb(123, 0, 255), LightType.PULSE, 1750, 20, ObjectID.CHALLENGE_PORTAL),
	FREE_FOR_ALL_PORTAL(120, Alignment.CENTER, 600, 4f, rgb(255, 255, 255), LightType.PULSE, 1850, 20, FREEFORALL_PORTAL),
	FREE_FOR_ALL_PORTAL_EXIT(180, Alignment.CENTER, 900, 4f, rgb(255, 255, 255), LightType.PULSE, 1850, 20, PORTAL_26646),
	POOL_OF_REFRESHMENT(150, Alignment.CENTER, 400, 4f, rgb(31, 225, 255), LightType.PULSE, 1250, 20, ObjectID.POOL_OF_REFRESHMENT),
	SKULL_LANTERN(200, Alignment.CENTER, 550, 2.5f, rgb(0, 255, 120), LightType.FLICKER, 0, 30, 39694),

	WINTERTODT_DOOR(500, Alignment.SOUTH, 1500, 6f, rgb(165, 255, 56), LightType.STATIC, 0, 0, DOORS_OF_DINH),

	// death's office
	PURPLE_FLAME(250, Alignment.CENTER, 600, 4f, rgb(77, 13, 255), LightType.FLICKER, 0, 10, 39582),
	PURPLE_FLAME_LARGE(250, Alignment.CENTER, 1200, 4f, rgb(77, 13, 255), LightType.FLICKER, 0, 10, 39551),
	DEATHS_OFFICE_PORTAL(180, Alignment.WEST, 800, 4f, rgb(77, 13, 255), LightType.PULSE, 1850, 20, PORTAL_39549),

	// tzhaar
	FIGHT_CAVES_ENTRANCE(100, Alignment.CENTER, 800, 10.0f, rgb(240, 100, 0), LightType.STATIC, 0, 0, CAVE_ENTRANCE_11833, CAVE_ENTRANCE_11834),
	TZHAAR_EXIT(100, Alignment.CENTER, 1400, 6.0f, rgb(255, 200, 90), LightType.STATIC, 0, 0, CAVE_EXIT_11836),
	INFERNO_ENTRANCE(-100, Alignment.CENTER, 2000, 10.0f, rgb(255, 55, 0), LightType.STATIC, 0, 0, 30352),

	// Player Owned Houses (POH)
	POH_EXIT_PORTAL(160, Alignment.CENTER, 700, 6f, rgb(93, 0, 255), LightType.PULSE, 4100, 20, PORTAL_4525),
	POH_PORTAL(180, Alignment.CENTER, 700, 6f, rgb(93, 0, 255), LightType.PULSE, 4100, 20, PORTAL_15477, PORTAL_15478, PORTAL_15479, PORTAL_15480, PORTAL_15481, 15482, PORTAL_28822),
	POH_PORTAL_PRIFDDINAS(120, Alignment.CENTER, 700, 6f, rgb(93, 0, 255), LightType.PULSE, 4100, 20, PORTAL_34947),
	POH_PORTAL_NEXUS(200, Alignment.CENTER, 400, 5f, rgb(31, 225, 255), LightType.PULSE, 1250, 20, PORTAL_NEXUS, PORTAL_NEXUS_33354, PORTAL_NEXUS_33355, PORTAL_NEXUS_33356, PORTAL_NEXUS_33357, PORTAL_NEXUS_33358, PORTAL_NEXUS_33359, PORTAL_NEXUS_33360, PORTAL_NEXUS_33361, PORTAL_NEXUS_33362, PORTAL_NEXUS_33363, PORTAL_NEXUS_33364, PORTAL_NEXUS_33365, PORTAL_NEXUS_33366, PORTAL_NEXUS_33367, PORTAL_NEXUS_33368, PORTAL_NEXUS_33369, PORTAL_NEXUS_33370, PORTAL_NEXUS_33371, PORTAL_NEXUS_33372, PORTAL_NEXUS_33373, PORTAL_NEXUS_33374, PORTAL_NEXUS_33375, PORTAL_NEXUS_33376, PORTAL_NEXUS_33377, PORTAL_NEXUS_33378, PORTAL_NEXUS_33379, PORTAL_NEXUS_33380, PORTAL_NEXUS_33381, PORTAL_NEXUS_33382, PORTAL_NEXUS_33383, PORTAL_NEXUS_33384, PORTAL_NEXUS_33385, PORTAL_NEXUS_33386, PORTAL_NEXUS_33387, PORTAL_NEXUS_33388, PORTAL_NEXUS_33389, PORTAL_NEXUS_33390, PORTAL_NEXUS_33391, PORTAL_NEXUS_33392, PORTAL_NEXUS_33393, PORTAL_NEXUS_33394, PORTAL_NEXUS_33395, PORTAL_NEXUS_33396, PORTAL_NEXUS_33397, PORTAL_NEXUS_33398, PORTAL_NEXUS_33399, PORTAL_NEXUS_33400, PORTAL_NEXUS_33401, PORTAL_NEXUS_33402, PORTAL_NEXUS_33403, PORTAL_NEXUS_33404, PORTAL_NEXUS_33405, PORTAL_NEXUS_33406, PORTAL_NEXUS_33407, PORTAL_NEXUS_33408, PORTAL_NEXUS_33409, PORTAL_NEXUS_33410, PORTAL_NEXUS_33423, PORTAL_NEXUS_33424, PORTAL_NEXUS_33425, PORTAL_NEXUS_33426, PORTAL_NEXUS_33427, PORTAL_NEXUS_33428, PORTAL_NEXUS_33429, PORTAL_NEXUS_33430, PORTAL_NEXUS_33431, PORTAL_NEXUS_37547, PORTAL_NEXUS_37548, PORTAL_NEXUS_37549, PORTAL_NEXUS_37550, PORTAL_NEXUS_37551, PORTAL_NEXUS_37552, PORTAL_NEXUS_37553, PORTAL_NEXUS_37554, PORTAL_NEXUS_37555, PORTAL_NEXUS_37556, PORTAL_NEXUS_37557, PORTAL_NEXUS_37559, PORTAL_NEXUS_37560, PORTAL_NEXUS_37561, PORTAL_NEXUS_37562, PORTAL_NEXUS_37563, PORTAL_NEXUS_37564, PORTAL_NEXUS_37565, PORTAL_NEXUS_37566, PORTAL_NEXUS_37567, PORTAL_NEXUS_37568, PORTAL_NEXUS_37569, PORTAL_NEXUS_37571, PORTAL_NEXUS_37572, PORTAL_NEXUS_37573, PORTAL_NEXUS_37574, PORTAL_NEXUS_37575, PORTAL_NEXUS_37576, PORTAL_NEXUS_37577, PORTAL_NEXUS_37578, PORTAL_NEXUS_37579, PORTAL_NEXUS_37580, PORTAL_NEXUS_41413, PORTAL_NEXUS_41414, PORTAL_NEXUS_41415),
	// Pools
	POH_RESTORATION_POOL(150, Alignment.CENTER, 400, 4f, rgb(255, 0, 85), LightType.PULSE, 1250, 20, POOL_OF_RESTORATION, FROZEN_POOL_OF_RESTORATION),
	POH_REVITALISATION_POOL(150, Alignment.CENTER, 400, 4f, rgb(255, 179, 0), LightType.PULSE, 1250, 20, POOL_OF_REVITALISATION, FROZEN_POOL_OF_REVITALISATION),
	POH_REJUVENATION_POOL(150, Alignment.CENTER, 400, 4f, rgb(31, 225, 255), LightType.PULSE, 1250, 20, POOL_OF_REJUVENATION, FROZEN_POOL_OF_REJUVENATION),
	POH_FANCY_REJUVENATION_POOL(150, Alignment.CENTER, 400, 4f, rgb(255, 0, 179), LightType.PULSE, 1250, 20, FANCY_POOL_OF_REJUVENATION, FROZEN_FANCY_POOL_OF_REJUVENATION),
	POH_ORNATE_REJUVENATION_POOL(150, Alignment.CENTER, 400, 4f, rgb(144, 0, 255), LightType.PULSE, 1250, 20, ORNATE_POOL_OF_REJUVENATION, FROZEN_ORNATE_POOL_OF_REJUVENATION),
	// Portal chamber teleports
	SCRYING_POOL(170, Alignment.CENTER, 400, 5f, rgb(144, 0, 255), LightType.PULSE, 4100, 20, TELEPORTATION_FOCUS, GREATER_TELEPORT_FOCUS, ObjectID.SCRYING_POOL),
	POH_PORTAL_ARCEUUS_LIBRARY(120, Alignment.CENTER, 400, 5f, rgb(235, 141, 122), LightType.PULSE, 4100, 20, ARCEUUS_LIBRARY_PORTAL, ARCEUUS_LIBRARY_PORTAL_41417, ARCEUUS_LIBRARY_PORTAL_41418),
	POH_PORTAL_DRAYNOR_MANOR(120, Alignment.CENTER, 400, 5f, rgb(172, 255, 77), LightType.PULSE, 4100, 20, DRAYNOR_MANOR_PORTAL, DRAYNOR_MANOR_PORTAL_37595, DRAYNOR_MANOR_PORTAL_37607),
	POH_PORTAL_BATTLEFRONT(120, Alignment.CENTER, 400, 5f, rgb(79, 255, 202), LightType.PULSE, 4100, 20, BATTLEFRONT_PORTAL, BATTLEFRONT_PORTAL_37596, BATTLEFRONT_PORTAL_37608),
	POH_PORTAL_VARROCK(120, Alignment.CENTER, 400, 5f, rgb(255, 179, 38), LightType.PULSE, 4100, 20, 13629, VARROCK_PORTAL, VARROCK_PORTAL_33098, VARROCK_PORTAL_33104, GRAND_EXCHANGE_PORTAL, GRAND_EXCHANGE_PORTAL_33099, GRAND_EXCHANGE_PORTAL_33105, 13615),
	POH_PORTAL_MIND_ALTAR(120, Alignment.CENTER, 400, 5f, rgb(255, 143, 38), LightType.PULSE, 4100, 20, MIND_ALTAR_PORTAL, MIND_ALTAR_PORTAL_37597, MIND_ALTAR_PORTAL_37609),
	POH_PORTAL_LUMBRIDGE(120, Alignment.CENTER, 400, 5f, rgb(0, 123, 255), LightType.PULSE, 4100, 20, LUMBRIDGE_PORTAL, LUMBRIDGE_PORTAL_13623, LUMBRIDGE_PORTAL_13630),
	POH_PORTAL_FALADOR(120, Alignment.CENTER, 400, 5f, rgb(174, 0, 255), LightType.PULSE, 4100, 20, FALADOR_PORTAL, FALADOR_PORTAL_13624, FALADOR_PORTAL_13631),
	POH_PORTAL_SALVE_GRAVEYARD(120, Alignment.CENTER, 400, 5f, rgb(255, 187, 166), LightType.PULSE, 4100, 20, SALVE_GRAVEYARD_PORTAL, SALVE_GRAVEYARD_PORTAL_37598, SALVE_GRAVEYARD_PORTAL_37610),
	POH_PORTAL_CAMELOT(120, Alignment.CENTER, 400, 5f, rgb(255, 255, 255), LightType.PULSE, 4100, 20, 13632, CAMELOT_PORTAL, CAMELOT_PORTAL_33100, CAMELOT_PORTAL_33106, SEERS_VILLAGE_PORTAL, SEERS_VILLAGE_PORTAL_33101, SEERS_VILLAGE_PORTAL_33107, 13618),
	POH_PORTAL_FENKENSTRAINS_CASTLE(120, Alignment.CENTER, 400, 5f, rgb(255, 54, 225), LightType.PULSE, 4100, 20, FENKENSTRAINS_CASTLE_PORTAL, FENKENSTRAINS_CASTLE_PORTAL_37599, FENKENSTRAINS_CASTLE_PORTAL_37611),
	POH_PORTAL_ARDOUGNE(120, Alignment.CENTER, 400, 5f, rgb(255, 0, 0), LightType.PULSE, 4100, 20, ARDOUGNE_PORTAL, ARDOUGNE_PORTAL_13626, ARDOUGNE_PORTAL_13633),
	POH_PORTAL_YANILLE(120, Alignment.CENTER, 400, 5f, rgb(0, 255, 0), LightType.PULSE, 4100, 20, 13634, YANILLE_PORTAL, YANILLE_PORTAL_33102, YANILLE_PORTAL_33103, YANILLE_PORTAL_33109, YANILLE_WATCHTOWER_PORTAL, YANILLE_WATCHTOWER_PORTAL_33108),
	POH_PORTAL_SENNTISTEN(120, Alignment.CENTER, 400, 5f, rgb(55, 209, 50), LightType.PULSE, 4100, 20, SENNTISTEN_PORTAL, SENNTISTEN_PORTAL_29348, SENNTISTEN_PORTAL_29356),
	POH_PORTAL_WEST_ARDOUGNE(120, Alignment.CENTER, 400, 5f, rgb(255, 0, 0), LightType.PULSE, 4100, 20, WEST_ARDOUGNE_PORTAL, WEST_ARDOUGNE_PORTAL_37600, WEST_ARDOUGNE_PORTAL_37612),
	POH_PORTAL_MARIM(120, Alignment.CENTER, 400, 5f, rgb(255, 255, 0), LightType.PULSE, 4100, 20, MARIM_PORTAL, MARIM_PORTAL_29352, MARIM_PORTAL_29360),
	POH_PORTAL_HARMONY_ISLAND(120, Alignment.CENTER, 400, 5f, rgb(153, 252, 255), LightType.PULSE, 4100, 20, HARMONY_ISLAND_PORTAL, HARMONY_ISLAND_PORTAL_37601, HARMONY_ISLAND_PORTAL_37613),
	POH_PORTAL_KHARYLL(120, Alignment.CENTER, 400, 5f, rgb(255, 255, 255), LightType.PULSE, 4100, 20, KHARYRLL_PORTAL, KHARYRLL_PORTAL_29346, KHARYRLL_PORTAL_29354),
	POH_PORTAL_LUNAR_ISLE(120, Alignment.CENTER, 400, 5f, rgb(219, 153, 255), LightType.PULSE, 4100, 20, LUNAR_ISLE_PORTAL, LUNAR_ISLE_PORTAL_29347, LUNAR_ISLE_PORTAL_29355),
	POH_PORTAL_KOUREND(120, Alignment.CENTER, 400, 5f, rgb(69, 204, 116), LightType.PULSE, 4100, 20, KOUREND_PORTAL, KOUREND_PORTAL_29353, KOUREND_PORTAL_29361),
	POH_PORTAL_CEMETERY(120, Alignment.CENTER, 400, 5f, rgb(247, 238, 59), LightType.PULSE, 4100, 20, CEMETERY_PORTAL, CEMETERY_PORTAL_37602, CEMETERY_PORTAL_37614),
	POH_PORTAL_WATERBIRTH_ISLE(120, Alignment.CENTER, 400, 5f, rgb(122, 255, 213), LightType.PULSE, 4100, 20, WATERBIRTH_ISLAND_PORTAL, WATERBIRTH_ISLAND_PORTAL_29350, WATERBIRTH_ISLAND_PORTAL_29358),
	POH_PORTAL_BARROWS(120, Alignment.CENTER, 400, 5f, rgb(202, 122, 255), LightType.PULSE, 4100, 20, BARROWS_PORTAL, BARROWS_PORTAL_37603, BARROWS_PORTAL_37615),
	POH_PORTAL_CARRALANGAR(120, Alignment.CENTER, 400, 5f, rgb(226, 122, 255), LightType.PULSE, 4100, 20, CARRALLANGAR_PORTAL, CARRALLANGAR_PORTAL_33437, CARRALLANGAR_PORTAL_33440),
	POH_PORTAL_FISHING_GUILD(120, Alignment.CENTER, 400, 5f, rgb(0, 234, 255), LightType.PULSE, 4100, 20, FISHING_GUILD_PORTAL, FISHING_GUILD_PORTAL_29351, FISHING_GUILD_PORTAL_29359),
	POH_PORTAL_CATHERBY(120, Alignment.CENTER, 400, 5f, rgb(255, 230, 89), LightType.PULSE, 4100, 20, CATHERBY_PORTAL, CATHERBY_PORTAL_33435, CATHERBY_PORTAL_33438),
	POH_PORTAL_ANNAKARL(120, Alignment.CENTER, 400, 5f, rgb(150, 150, 150), LightType.PULSE, 4100, 20, ANNAKARL_PORTAL, ANNAKARL_PORTAL_29349, ANNAKARL_PORTAL_29357),
	POH_PORTAL_APE_ATOLL_DUNGEON(120, Alignment.CENTER, 400, 5f, rgb(255, 235, 56), LightType.PULSE, 4100, 20, APE_ATOLL_DUNGEON_PORTAL, APE_ATOLL_DUNGEON_PORTAL_37604, APE_ATOLL_DUNGEON_PORTAL_37616),
	POH_PORTAL_GHORROCK(120, Alignment.CENTER, 400, 5f, rgb(252, 0, 231), LightType.PULSE, 4100, 20, GHORROCK_PORTAL, GHORROCK_PORTAL_33436, GHORROCK_PORTAL_33439),
	POH_PORTAL_TROLL_STRONGHOLD(120, Alignment.CENTER, 400, 5f, rgb(255, 124, 77), LightType.PULSE, 4100, 20, TROLL_STRONGHOLD_PORTAL, TROLL_STRONGHOLD_PORTAL_33180, TROLL_STRONGHOLD_PORTAL_33181),
	POH_PORTAL_WEISS(120, Alignment.CENTER, 400, 5f, rgb(0, 255, 255), LightType.PULSE, 4100, 20, WEISS_PORTAL, WEISS_PORTAL_37593, WEISS_PORTAL_37605),

	// Trollheim
	EADGAR_CAVE_EXIT(70, Alignment.CENTER, 250, 6f, rgb(255, 255, 255), LightType.STATIC, 0, 0, CAVE_EXIT_3760),

	// Underground Pass
	WELL_OF_VOYAGE(200, Alignment.CENTER, 250, 6f, rgb(255, 255, 255), LightType.PULSE, 1200, 30, WELL_4004, WELL_4005),

	// Tirannwn
	ELVEN_LAMP(180, Alignment.CENTER, 250, 4f, rgb(255, 255, 255), LightType.PULSE, 1000, 10, ObjectID.ELVEN_LAMP, ELVEN_LAMP_8767, ELVEN_LAMP_36492, ELVEN_LAMP_34958, ELVEN_LAMP_35867, ELVEN_LAMP_35868),
	GRAND_LIBRARY_PORTAL(150, Alignment.CENTER, 450, 5f, rgb(0, 200, 225), LightType.PULSE, 1200, 10, PORTAL_35075),
	GRAND_LIBRARY_CRYSTAL_1(310, Alignment.FRONTLEFT, 200, 5f, rgb(0, 200, 225), LightType.PULSE, 3200, 5, 34998),
	GRAND_LIBRARY_CRYSTAL_2(140, Alignment.FRONTLEFT, 200, 5f, rgb(0, 200, 225), LightType.PULSE, 3200, 5, 35384, 35059, 35061),
	GRAND_LIBRARY_LIGHT_1(140, Alignment.CENTER, 200, 5f, rgb(0, 200, 225), LightType.STATIC, 0, 0, 35000),
	GRAND_LIBRARY_LIGHT_2(310, Alignment.CENTER, 200, 5f, rgb(0, 200, 225), LightType.STATIC, 0, 0, 35065, 35066, 35386),
	GRAND_LIBRARY_SEAL(150, Alignment.FRONT, 300, 5f, rgb(0, 200, 225), LightType.PULSE, 3200, 5, SEAL_OF_THE_FORGOTTEN, SEAL_OF_AMLODD, SEAL_OF_AMLODD_35456, SEAL_OF_CADARN, SEAL_OF_CADARN_35452, SEAL_OF_CRWYS, SEAL_OF_CRWYS_35454, SEAL_OF_HEFIN, SEAL_OF_HEFIN_35458, SEAL_OF_IORWERTH, SEAL_OF_IORWERTH_35460, SEAL_OF_ITHELL, SEAL_OF_ITHELL_35462, SEAL_OF_MEILYR, SEAL_OF_MEILYR_35464, SEAL_OF_TRAHAEARN, SEAL_OF_TRAHAEARN_35466, 36725, 36726, 36727, 36728, 36729, 36730, 36731, 36732),
	FRAGMENT_OF_SEREN(280, LightManager.Alignment.CENTER, 500, 5f, rgb(0, 200, 225), LightManager.LightType.PULSE, 3200, 10, 37319),
	TELEPORT_PLATFORM(50, Alignment.CENTER, 400, 5f, rgb(0, 255, 255), LightType.FLICKER, 0, 20, TELEPORT_PLATFORM_35984, TELEPORT_PLATFORM_35985, TELEPORT_PLATFORM_36062, TELEPORT_PLATFORM_36082, TELEPORT_PLATFORM_36197, TELEPORT_PLATFORM_36198, TELEPORT_PLATFORM_36490, TELEPORT_PLATFORM_36614, TELEPORT_PLATFORM_36615),

	// The Gauntlet
	GAUNTLET_PORTAL(100, Alignment.FRONT, 700, 7f, rgb(0, 127, 255), LightType.PULSE, 5000, 20, ObjectID.GAUNTLET_PORTAL),
	GAUNTLET_ENTRANCE(0, Alignment.CENTER, 400, 5f, rgb(0, 255, 255), LightType.PULSE, 900, 20, 37340),
	GAUNTLET_REWARD_CHEST(110, Alignment.CENTER, 400, 5f, rgb(0, 255, 255), LightType.STATIC, 0, 0, 37341),
	GAUNTLET_TOOL_STORAGE(180, Alignment.CENTER, 400, 5f, rgb(0, 255, 255), LightType.STATIC, 0, 0, TOOL_STORAGE_36074),
	GAUNTLET_RANGE(50, Alignment.CENTER, 400, 5f, rgb(0, 255, 255), LightType.FLICKER, 0, 20, RANGE_36077),
	GAUNTLET_SINGING_BOWL(180, Alignment.CENTER, 400, 5f, rgb(0, 255, 255), LightType.PULSE, 3100, 20, SINGING_BOWL_36063),
	GAUNTLET_LIT_NODE_1(210, Alignment.BACKRIGHT, 200, 4f, rgb(0, 255, 255), LightType.STATIC, 0, 0, 36103),
	GAUNTLET_LIT_NODE_2(210, Alignment.BACKLEFT, 200, 4f, rgb(0, 255, 255), LightType.STATIC, 0, 0, 36104),
	GAUNTLET_PHREN_ROOTS(210, Alignment.CENTER, 200, 4f, rgb(0, 255, 255), LightType.STATIC, 0, 0, PHREN_ROOTS_36066),
	GAUNTLET_CRYSTAL_DEPOSIT(40, Alignment.CENTER, 200, 4f, rgb(0, 255, 255), LightType.PULSE, 2400, 20, CRYSTAL_DEPOSIT),
	// Corrupted Gauntlet
	CORRUPTED_TELEPORT_PLATFORM(50, Alignment.CENTER, 400, 5f, rgb(255, 0, 0), LightType.FLICKER, 0, 20, ObjectID.TELEPORT_PLATFORM),
	CORRUPTED_GAUNTLET_TOOL_STORAGE(180, Alignment.CENTER, 400, 5f, rgb(255, 0, 0), LightType.STATIC, 0, 0, TOOL_STORAGE),
	CORRUPTED_GAUNTLET_RANGE(50, Alignment.CENTER, 400, 5f, rgb(255, 0, 0), LightType.FLICKER, 0, 20, RANGE_35980),
	CORRUPTED_GAUNTLET_SINGING_BOWL(180, Alignment.CENTER, 400, 5f, rgb(255, 0, 0), LightType.PULSE, 3100, 20, SINGING_BOWL_35966),
	CORRUPTED_GAUNTLET_LIT_NODE_1(210, Alignment.BACKRIGHT, 200, 4f, rgb(255, 0, 0), LightType.STATIC, 0, 0, 36000),
	CORRUPTED_GAUNTLET_LIT_NODE_2(210, Alignment.BACKLEFT, 200, 4f, rgb(255, 0, 0), LightType.STATIC, 0, 0, 36001),
	CORRUPTED_GAUNTLET_PHREN_ROOTS(210, Alignment.CENTER, 200, 4f, rgb(255, 0, 0), LightType.STATIC, 0, 0, PHREN_ROOTS),
	CORRUPTED_GAUNTLET_CORRUPT_DEPOSIT(40, Alignment.CENTER, 200, 4f, rgb(255, 0, 0), LightType.PULSE, 2400, 20, CORRUPT_DEPOSIT),

	// Zalcano
	ZALCANO_ROCK_FORMATION_GLOWING(270, Alignment.CENTER, 700, 4f, rgb(255, 0, 0), LightType.PULSE, 4300, 20, ROCK_FORMATION_GLOWING),
	ZALCANO_ROCK_FORMATION(270, Alignment.CENTER, 700, 1f, rgb(255, 0, 0), LightType.PULSE, 4300, 20, 36193),
	ZALCANO_ALTAR(300, Alignment.FRONT, 1200, 4f, rgb(0, 255, 255), LightType.STATIC, 0, 0, ALTAR_36196),
	ZALCANO_FURNACE(100, Alignment.LEFT, 1800, 7f, rgb(255, 85, 0), LightType.STATIC, 0, 0, FURNACE_36195),

	// Desert Treasure pyramid
	DESERT_TREASURE_PYRAMID_PORTAL(30, Alignment.CENTER, 500, 3f, rgb(255, 216, 87), LightType.PULSE, 1550, 20, PORTAL_6551, 6550),
	DESERT_TREASURE_PYRAMID_OBELISK_BLOOD(230, Alignment.CENTER, 1400, 5f, rgb(255, 0, 0), LightType.FLICKER, 0, 20, 6482),
	DESERT_TREASURE_PYRAMID_OBELISK_SMOKE(230, Alignment.CENTER, 1400, 3f, rgb(255, 255, 255), LightType.FLICKER, 0, 20, 6485),
	DESERT_TREASURE_PYRAMID_OBELISK_ICE(230, Alignment.CENTER, 1400, 5f, rgb(74, 168, 255), LightType.FLICKER, 0, 20, 6488),
	DESERT_TREASURE_PYRAMID_OBELISK_SHADOW(230, Alignment.CENTER, 1400, 2.5f, rgb(255, 255, 255), LightType.FLICKER, 0, 20, 6491),
	// Pyramid Plunder
	PYRAMID_PLUNDER_TOMB_DOOR(100, Alignment.FRONT, 400, 4f, rgb(255, 224, 166), LightType.STATIC, 0, 0, 20931, TOMB_DOOR_20932, TOMB_DOOR_20948, TOMB_DOOR_20949),

	// Fairy rings
	FAIRY_RINGS(30, Alignment.CENTER, 500, 3f, rgb(255, 255, 255), LightType.PULSE, 6200, 30, 14839, 29228, 29495, 29560),

	// Arceuus crystals
	ARCEUUS_BRIGHT_CRYSTAL_LARGE(200, Alignment.CENTER, 1500, 6f, rgb(0, 255, 255), LightType.PULSE, 6200, 30, 27878),
	ARCEUUS_BRIGHT_CRYSTAL_MEDIUM(180, Alignment.CENTER, 1200, 6f, rgb(0, 255, 255), LightType.PULSE, 4000, 30, 27882),
	ARCEUUS_BRIGHT_CRYSTAL_SMALL(120, Alignment.CENTER, 600, 6f, rgb(0, 255, 255), LightType.PULSE, 2400, 30, 27886),
	ARCEUUS_DARK_CRYSTAL_LARGE(200, Alignment.CENTER, 1500, 7f, rgb(76, 0, 255), LightType.PULSE, 6100, 30, 27879),
	ARCEUUS_DARK_CRYSTAL_MEDIUM(180, Alignment.CENTER, 1200, 7f, rgb(76, 0, 255), LightType.PULSE, 3900, 30, 27883),
	ARCEUUS_DARK_CRYSTAL_SMALL(120, Alignment.CENTER, 600, 7f, rgb(76, 0, 255), LightType.PULSE, 2300, 30, 27887),
	ARCEUUS_BLOOD_CRYSTAL_LARGE(200, Alignment.CENTER, 1500, 7f, rgb(255, 0, 0), LightType.PULSE, 6300, 30, 27881),
	ARCEUUS_BLOOD_CRYSTAL_MEDIUM(180, Alignment.CENTER, 1200, 7f, rgb(255, 0, 0), LightType.PULSE, 4100, 30, 27885, 27884),
	ARCEUUS_BLOOD_CRYSTAL_SMALL(120, Alignment.CENTER, 600, 7f, rgb(255, 0, 0), LightType.PULSE, 2500, 30, 27888),

	BLOOD_ALTAR(200, Alignment.CENTER, 500, 7f, rgb(255, 0, 0), LightType.STATIC, 0, 0, 27978),
	DARK_ALTAR(350, Alignment.CENTER, 500, 7f, rgb(76, 0, 255), LightType.STATIC, 0, 0, 27979),
	SOUL_ALTAR(350, Alignment.CENTER, 500, 7f, rgb(0, 255, 255), LightType.STATIC, 0, 0, 27980),

	// Chambers of Xeric
	COX_CRYSTAL_GREEN(120, Alignment.CENTER, 600, 6f, rgb(180, 235, 52), LightType.PULSE, 2400, 20, LARGE_CRYSTAL, CRYSTAL_30015, CRYSTAL_30018, CRYSTAL_30027),
	COX_CRYSTAL_GREEN_HIGH(480, Alignment.CENTER, 600, 6f, rgb(180, 235, 52), LightType.PULSE, 2400, 20, 29800),
	COX_CRYSTAL_PURPLE(120, Alignment.CENTER, 600, 6f, rgb(76, 0, 255), LightType.PULSE, 2400, 20, 29796),
	COX_CRYSTAL_LARGE_PURPLE(180, Alignment.CENTER, 900, 6f, rgb(76, 0, 255), LightType.PULSE, 2400, 20, 29775, CRYSTAL_30016),
	COX_CRYSTAL_PURPLE_HIGH(480, Alignment.CENTER, 600, 6f, rgb(76, 0, 255), LightType.PULSE, 2400, 20, 29801),
	COX_CRYSTAL_ORANGE(120, Alignment.CENTER, 600, 6f, rgb(255, 162, 41), LightType.PULSE, 2400, 20, 29798, CRYSTAL_30017),
	COX_CRYSTAL_ORANGE_HIGH(480, Alignment.CENTER, 600, 6f, rgb(255, 162, 41), LightType.PULSE, 2400, 20, 29802),
	COX_CRYSTAL_BLOOD(120, Alignment.CENTER, 600, 6f, rgb(255, 0, 119), LightType.PULSE, 2400, 20, BLOOD_CRYSTAL_30014, BLOOD_CRYSTAL_33147),
	COX_GIANT_ANVIL_CRYSTALS(120, Alignment.CENTER, 900, 6f, rgb(255, 162, 41), LightType.PULSE, 2400, 20, GIANT_ANVIL),
	COX_BRAZIER(120, Alignment.CENTER, 450, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, BRAZIER_29748),
	COX_FIRE_LARGE_PURPLE(80, Alignment.CENTER, 800, 3f, rgb(76, 0, 255), LightType.FLICKER, 0, 20, ObjectID.MAGICAL_FIRE),
	COX_CRYSTAL_MAGENTA(60, Alignment.CENTER, 300, 6f, rgb(255, 0, 255), LightType.PULSE, 2400, 20, MAGENTA_CRYSTAL, MAGENTA_CRYSTAL_31958),
	COX_CRYSTAL_CYAN(60, Alignment.CENTER, 300, 6f, rgb(0, 255, 255), LightType.PULSE, 2400, 20, CYAN_CRYSTAL, CYAN_CRYSTAL_31957),
	COX_CRYSTAL_YELLOW(60, Alignment.CENTER, 300, 6f, rgb(255, 255, 0), LightType.PULSE, 2400, 20, YELLOW_CRYSTAL, YELLOW_CRYSTAL_31959),
	COX_CRYSTAL_BLACK(60, Alignment.CENTER, 300, 2f, rgb(255, 255, 255), LightType.PULSE, 2400, 20, BLACK_CRYSTAL),
	COX_MYSTICAL_BARRIER(200, Alignment.CENTER, 1000, 5f, rgb(191, 255, 0), LightType.PULSE, 1400, 20, MYSTICAL_BARRIER, MYSTICAL_BARRIER_34432),
	COX_MYSTICAL_BARRIER_ORANGE(200, Alignment.CENTER, 1000, 5f, rgb(255, 162, 0), LightType.PULSE, 1400, 20, MYSTICAL_BARRIER_ORANGE),
	COX_MYSTICAL_BARRIER_RED(200, Alignment.CENTER, 1000, 5f, rgb(255, 72, 0), LightType.PULSE, 1400, 20, MYSTICAL_BARRIER_RED),

	// Kebos Lowlands
	KEBOS_SWAMP_FIRE(40, Alignment.CENTER, 450, 3f, rgb(255, 255, 255), LightType.FLICKER, 0, 20, FIRE_10433),
	LIZARDMAN_TEMPLE_SKYLIGHT(600, Alignment.CENTER, 1000, 5f, rgb(200, 230, 255), LightType.STATIC, 0, 0, LIGHT_34421),
	LIZARDMAN_TEMPLE_MYSTICAL_BARRIER(200, Alignment.CENTER, 600, 5f, rgb(191, 255, 0), LightType.PULSE, 1400, 20, 34642, 34643, 34644, 34645, 34646),

	// Corporeal beast
	CORP_PRIVATE_PORTAL(30, Alignment.CENTER, 500, 3f, rgb(255, 216, 87), LightType.PULSE, 1550, 20, 9368, 9369, 9370),

	// Rellekka slayer caves
	TUNNEL_EXIT(50, Alignment.FRONT, 800, 5f, rgb(150, 220, 255), LightType.STATIC, 1550, 20, 2141),

	// Corsair resource area
	VINE_LADDER(450, Alignment.CENTER, 800, 3f, rgb(255, 255, 255), LightType.STATIC, 0, 0, VINE_LADDER_31790),

	// Lithkren
	LITHKREN_BRAZIER(450, Alignment.CENTER, 1200, 4f, rgb(252, 122, 3), LightType.FLICKER, 0, 30, BRAZIER_32119),

	// Tears of Guthix
	TOG_BLUE_STREAM(100, Alignment.CENTER, 300, 9f, rgb(89, 145, 255), LightType.STATIC, 0, 0, 6665, 6661),
	TOG_GREEN_STREAM(100, Alignment.CENTER, 300, 6f, rgb(141, 255, 92), LightType.STATIC, 0, 0, 6662, 6666),

	// Camdozaal (Below Ice Mountain)
	CAMDOZAAL_STATUE(200, Alignment.FRONT, 600, 8f, rgb(0, 140, 255), LightType.FLICKER, 0, 30, 41467),
	CAMDOZAAL_CRYSTALS(30, Alignment.CENTER, 220, 5f, rgb(150, 0, 255), LightType.PULSE, 1700, 30, 41585),
	BARRONITE_ROCK(100, Alignment.CENTER, 220, 7f, rgb(150, 0, 255), LightType.PULSE, 2200, 20, 41547, 41548),
	CAMDOZAAL_SACRED_FORGE(100, Alignment.CENTER, 1400, 5f, rgb(252, 122, 3), LightType.FLICKER, 0, 30, SACRED_FORGE),
	CAMDOZAAL_VAULT_ORANGE_LIGHT(30, Alignment.CENTER, 200, 5f, rgb(252, 190, 0), LightType.STATIC, 0, 0, 41520),
	CAMDOZAAL_WATERFALL(500, Alignment.CENTER, 500, 6f, rgb(255, 255, 255), LightType.STATIC, 0, 0, WATER_41588),

	// Tempoross
	TEMPOROSS_SHRINE(150, Alignment.CENTER, 300, 3.5f, rgb(252, 148, 3), LightType.FLICKER, 0, 30, SHRINE_41236),
	ELECTRIFIED_HARPOONFISH_CANNON(50, Alignment.CENTER, 300, 3.5f, rgb(0, 255, 255), LightType.FLICKER, 0, 40, ObjectID.ELECTRIFIED_HARPOONFISH_CANNON, ELECTRIFIED_HARPOONFISH_CANNON_41243, ELECTRIFIED_HARPOONFISH_CANNON_41244, ELECTRIFIED_HARPOONFISH_CANNON_41245),

	// Clans
	CLAN_HALL_PORTAL(130, Alignment.FRONT, 700, 5f, rgb(0, 89, 255), LightType.STATIC, 0, 0, ObjectID.CLAN_HALL_PORTAL),

	// Morytania
	CEILING_LIGHT(0, Alignment.CENTER, 800, 3f, rgb(255, 255, 255), LightType.FLICKER, 0, 10, 20868),
	// Hallowed Sepulchre
	HALLOWED_SEPULCHRE_MAGICAL_OBELISK(300, Alignment.CENTER, 500, 4f, rgb(255, 204, 0), LightType.PULSE, 2100, 20, MAGICAL_OBELISK),
	SARADOMIN_BRAZIER(200, Alignment.CENTER, 500, 4f, rgb(0, 0, 255), LightType.FLICKER, 0, 20, 39525, 39526),
	// Darkmeyer
	RED_STREET_LAMP(250, Alignment.CENTER, 300, 3f, rgb(255, 0, 0), LightType.FLICKER, 0, 20, LAMP_39152),
	// Theatre of Blood
	MONUMENTAL_CHEST_OPEN(120, Alignment.CENTER, 800, 3f, rgb(255, 191, 0), LightType.STATIC, 0, 0, MONUMENTAL_CHEST, MONUMENTAL_CHEST_32991, MONUMENTAL_CHEST_32992, MONUMENTAL_CHEST_32993, MONUMENTAL_CHEST_32994),
	TOB_WALL_TORCH(200, Alignment.FRONTRIGHT_CORNER, 300, 3f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, 32998, 32999),
	TOB_TELEPORT_CRYSTAL(200, Alignment.CENTER, 300, 3f, rgb(140, 0, 255), LightType.PULSE, 1800, 30, 32996),
	TOB_BARRIER(50, Alignment.CENTER, 150, 3f, rgb(255, 0, 0), LightType.PULSE, 2200, 30, 32755),
	PESTILENT_BLOAT_CHAMBER(400, Alignment.CENTER, 1500, 6f, rgb(255, 208, 0), LightType.PULSE, 1800, 10, 32957),
	TOB_VERZIK_BIG_WINDOW(750, Alignment.FRONT, 1000, 6.5f, rgb(162, 0, 255), LightType.STATIC, 0, 0, 32691),
	TOB_VERZIK_WINDOW(450, Alignment.FRONT, 600, 4f, rgb(162, 0, 255), LightType.STATIC, 0, 0, 32697),
	TOB_VERZIK_WINDOW_FLOOR(70, Alignment.FRONT, 1000, 2f, rgb(162, 0, 255), LightType.STATIC, 0, 0, 32698),
	TOB_SOTETSEG_WINDOW(400, Alignment.FRONTRIGHT_CORNER, 1200, 4f, rgb(255, 255, 255), LightType.STATIC, 0, 0, 33052),
	TOB_BAT_TORCH(820, Alignment.FRONT, 300, 4f, rgb(255, 0, 0), LightType.FLICKER, 0, 20, 32776),

	// Runecrafting altars
	RUNECRAFTING_ALTAR_PORTAL(30, Alignment.CENTER, 500, 3f, rgb(255, 216, 87), LightType.PULSE, 1550, 20, PORTAL_34748),
	AIR_ALTAR_PILLAR(250, Alignment.CENTER, 300, 4f, rgb(255, 255, 255), LightType.PULSE, 500, 20, 34790),

	// Barbarian Assault
	BA_WAVE_AREA_BARRIERS(50, Alignment.BACK, 150, 3f, rgb(255, 0, 0), LightType.PULSE, 2200, 30, DOOR_20199, DOOR_20200, DOOR_20201, DOOR_20202, DOOR_20203, DOOR_20204, DOOR_20205, DOOR_20206, DOOR_20207, DOOR_20208, DOOR_20209),

	// Yanille Glowing Orbs
	NIGHTMARE_ZONE_ORBS(125, Alignment.CENTER, 150, 4f, rgb(255, 255, 255), LightType.PULSE, 500, 20, 26274),
	MAGIC_GUILD_ORBS(250, Alignment.CENTER, 250, 4f, rgb(255, 255, 255), LightType.PULSE, 500, 20, MYSTERIOUS_GLOW),
	MAGIC_GUILD_ORBS_BLUE(250, Alignment.CENTER, 250, 4f, rgb(0, 0, 255), LightType.PULSE, 500, 20, MYSTERIOUS_GLOW_34791),
	MAGIC_GUILD_PORTALS(100, Alignment.CENTER, 500, 3f, rgb(0, 0, 255), LightType.PULSE, 1550, 20, MAGIC_PORTAL, MAGIC_PORTAL_2157, MAGIC_PORTAL_2158),

	// Dorgesh-Kaan
	DORGESHKAAN_LAMPS(250, Alignment.CENTER, 500, 3f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, LAMP_22760, LAMP_22761, LAMP_22762, LAMP_22764, LAMP_22976, 22980, 22983, 22984, 22985, 22986, 22987, 22991, 22994, 22995, 22998, 22999, 23003, 23005, 23010, 23013, 23014, 23015, 23016, 23017, 23018, 23019, 23020, 23021, 23022, 23023, 23024, 23025, 23026, 23027, 23028, 23029, 23030, 23031, 23032, 23033, 23034, 23036, 23037, 23038, 23039, 23040, 23041),
	DORGESHKAAN_ZAPPER(100, Alignment.CENTER, 250, 3f, rgb(100, 170, 255), LightType.FLICKER, 0, 20, ZAPPER, ZAPPER_22736, ZAPPER_22737),
	DORGESHKAAN_MAGIC_BALL(150, Alignment.CENTER, 300, 5f, rgb(50, 10, 255), LightType.FLICKER, 0, 20, MAGIC_BALL),
	DORGESHKAAN_THINGYMAJIG(150, Alignment.CENTER, 500, 6f, rgb(50, 10, 255), LightType.FLICKER, 0, 20, THINGYMAJIG),

	// Blast Furnace
	BLAST_FURNACE_MELTING_POT(300, Alignment.CENTER, 1200, 10f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, MELTING_POT),

	//Camelot
	CAMELOT_COOKING_RANGE(120, Alignment.CENTER, 800, 2f, rgb(252, 122, 3), LightType.FLICKER, 0, 20, RANGE_26181),
	WALL_STATIC_LAMPS(190, Alignment.CENTER, 450, 3f, rgb(255, 180, 103), LightType.STATIC, 0, 20, 205),
  
	//Cerberus
	WALL_TORCH_CERBERUS_DUNGEON(250, Alignment.CENTER, 650, 7f, rgb(252, 148, 3), LightType.FLICKER, 0, 20, 26570),

	// Misc
	// This is a generic portal reused in different locations. It's identical to the private corp portal
	EXIT_PORTAL(30, Alignment.CENTER, 500, 3f, rgb(255, 216, 87), LightType.PULSE, 1550, 20, 20843),

	STRANGE_SHRINE(70, Alignment.CENTER, 300, 3f, rgb(255, 216, 87), LightType.PULSE, 2800, 30, 14985);

	private final int[] id;
	private final int height;
	private final Alignment alignment;
	private final int size;
	private final float strength;
	private final int rgb;
	private final LightType lightType;
	private final float duration;
	private final float range;

	ObjectLight(int height, Alignment alignment, int size, float strength, int rgb, LightType lightType, float duration, float range, int... ids)
	{
		this.height = height;
		this.alignment = alignment;
		this.size = size;
		this.strength = strength;
		this.rgb = rgb;
		this.lightType = lightType;
		this.duration = duration;
		this.range = range;
		this.id = ids;
	}

	private static final Map<Integer, ObjectLight> LIGHTS;

	static
	{
		ImmutableMap.Builder<Integer, ObjectLight> builder = new ImmutableMap.Builder<>();
		for (ObjectLight objectLight : values())
		{
			for (int id : objectLight.id)
			{
				builder.put(id, objectLight);
			}
		}
		LIGHTS = builder.build();
	}

	static ObjectLight find(int id)
	{
		return LIGHTS.get(id);
	}

	private static int rgb(int r, int g, int b)
	{
		return (r << 16) | (g << 8) | b;
	}
}
