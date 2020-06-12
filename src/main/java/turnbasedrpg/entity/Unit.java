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
	private Race race;

	// A unit's class determines what weapons they specialize in using, their
	// movement type,
	private Class unitClass;

	// The amount of experience that a unit has in a given class. See the Class page
	// for a full list of classes.
	private int[] classExp;

	// The unit's birthsign gives them some stat boosts an/or some abilities,
	// spells, or combat arts.
	private Birthsign birthsign;

	// A unit's level goes up as they gain experience points. The maximum level is
	// 99.
	private int level;

	// Experience Points. These are gained by various actions, mostly defeating
	// enemies. As a unit levels up, the amount of exp needed to level up increases.
	private int exp;

	// Health, Stamina, Magicka, Str, Int, Agi, Spd, Lck, End, Wil, Per, Move
	private int[] stat;

	// Same as above. This is the unit's individual stat growth rate. It is added to
	// their class growths during level-ups to determine final stat growths.
	// Move is almost always 0.
	private int[] statGrowthChar;

	// Warrior skills: One-Handed, Two-Handed, Hand-to-Hand, Heavy Armor, Riding
	// Mage skills: Destruction, Restoration, Illusion, Alteration, Conjuration
	// Thief skills: Marksman, Throwing, Authority, Light Armor, Flying
	private Skill[] skill;

	// Same as above.
	private int[] skillExp;

	// A list of all the abilities that the unit has access to, but are not
	// currently equipped.
	private ArrayList<Integer> ability;

	// Up to five abilities can be equipped at once.
	private int[] abilityEquipped;

	// Most named units have their own unique personal ability.
	// A value of zero here means that the unit has no personal ability (the
	// standard for unnamed generic units)
	private int abilityPersonal;

	private ArrayList<Integer> art;

	// Up to five combat arts can be equipped at once.
	private int[] artEquipped;

	// The list of spells that a unit has learned. Which spells a unit learns and
	// when is unique to each character.
	private ArrayList<Integer> spellsLearned;

	// The list of learned spells that are available to a unit. Determined by their
	// class.
	private ArrayList<Integer> spellsAvailable;

}
