package turnbasedrpg.entity;

import java.util.ArrayList;

import lombok.Data;

/**
 * 
 * @author Michael T. Ross
 *
 */
@Data
public class Unit {

	// The unit's unique identifying number.
	private int ID;

	// Important units have a unique name. Generic characters are identified by the
	// group they belong to.
	private String name;

	// A unit's race never changes.
	private RACE race;

	// A unit's class determines their skill proficiencies, stat changes, growth
	// rates, and movement range. See the Class.java page for a full list of
	// classes.
	private UNIT_CLASS unitClass;

	// The amount of experience that a unit has in a given class. Reaching a certain
	// amount of class xp will master that class and grant an ability or art.
	private int[] classExp;

	// The unit's birthsign gives them some stat boosts an/or some abilities,
	// spells, or combat arts. A unit's birthsign (usually) never changes.
	private BIRTHSIGN birthsign;

	// A unit's level goes up as they gain experience points. The maximum level is
	// 99.
	private int level;

	// Experience Points. These are gained by various actions, mostly defeating
	// enemies. As a unit levels up, the amount of exp needed to level up increases.
	private int exp;

	// Health, Stamina, Magicka, Str, Int, Agi, Spd, Lck, End, Wil, Per, Move
	private int[] stat;

	// Same as above. This is the unit's individual stat growth rate.
	private int[] statGrowthChar;

	// Same as above. This is the sum of the unit's individual growth rate and their
	// class's growth rate.
	private int[] statGrowthFinal;

	// Warrior skills: One-Handed, Two-Handed, Hand-to-Hand, Heavy Armor, Riding
	// Mage skills: Destruction, Restoration, Illusion, Alteration, Conjuration
	// Thief skills: Marksman, Throwing, Authority, Light Armor, Flying
	private SKILL_RANK[] skill;

	// Same as above.
	private int[] skillExp;

	// A list of all the abilities that the unit has access to, but are not
	// currently equipped.
	private ArrayList<Integer> ability;

	// Up to five abilities can be equipped at once.
	private int[] abilityEquipped;

	// Most named units have their own unique personal ability.
	// A value of zero here means that the unit has no personal ability (the
	// standard for unnamed generic units).
	private int abilityPersonal;

	// Every race has an ability associated with it.
	private int abilityRace;

	// Many classes have certain abilities associated with them.
	private int[] abilityClass;

	// A list of all the arts that the unit has access to, but are not currently
	// equipped.
	private ArrayList<Integer> art;

	// Up to three combat arts can be normally equipped at once. More can be
	// accessed by other means, like using a unique weapon.
	private ArrayList<Integer> artEquipped;

	// The list of spells that a unit has learned. Which spells a unit learns and
	// when they learn them is unique to each character.
	private ArrayList<Integer> spell;

	// The list of learned spells that are available to a unit. Determined by their
	// class.
	private ArrayList<Integer> spellAvailable;

	// Main-hand, Off-hand, Armor, Accessory
	private int[] equipment;

	// Each character can hold up to eight items that aren't equipped.
	private int[] inventory;

}
