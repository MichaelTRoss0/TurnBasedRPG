package turnbasedrpg.entity;

import lombok.Data;

/**
 * 
 * @author Michael T. Ross
 *
 */
@Data
public class Armor extends Item {

	// The armor's type: light, heavy, or clothes
	private ARMOR_TYPE type;

	//
	private int prt;

	//
	private int rsl;

	//
	private int wt;

}
