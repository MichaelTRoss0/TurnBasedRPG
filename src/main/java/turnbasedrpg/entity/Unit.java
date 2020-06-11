package turnbasedrpg.entity;

import lombok.Data;

/**
 * 
 * @author Michael T. Ross
 *
 */
@Data
public class Unit {

	private String name;

	private Race race;

	private Class unitClass;

	private Birthsign birthsign;

	private int level;
	
	private int exp;

	// HP, Str, Mag, Dex, Spd, Lck, Def, Res, Charm
	private int[] stat;
	
	

}
