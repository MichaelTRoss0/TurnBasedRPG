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

	private int level;

}
