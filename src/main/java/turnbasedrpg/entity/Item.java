package turnbasedrpg.entity;

import lombok.Data;

/**
 * 
 * @author Michael T. Ross
 *
 */
@Data
public class Item {

	// The item object's unique identifying number.
	private int ID;

	// The item ID for every item of its type.
	private int itemID;

	// The item's name.
	private String name;

	// The number of uses reamaining/maxumun for the item.
	// 0 means the item has unlimited uses.
	private int[] uses;

}
