package turnbasedrpg.entity;

import lombok.Data;

/**
 * 
 * @author Michael T. Ross
 *
 */
@Data
public class Weapon extends Item {

	// The weapon's type.
	private WEAPON_TYPE type;

	// The skill rank required to use the weapon.
	private SKILL_RANK rank;

	// The weapon's offensive modifier.
	private int mt;

	// The weapon's accuracy modifier.
	private int hit;

	// The weapon's critical chance modifier.
	private int crt;

	// The weapon's range.
	private int[] rng;

	// The weapon experience this weapon gives for using.
	private int wex;

	// This weapon's weight.
	private int wt;

	// The value of this weapon.
	private int worth;

}
