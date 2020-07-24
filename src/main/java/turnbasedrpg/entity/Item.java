package turnbasedrpg.entity;

import lombok.Data;

/**
 * 
 * @author Michael T. Ross
 *
 */
@Data
class Item {

	// The item object's unique identifying number.
	protected int ID;

	// The item ID for every item of its type.
	protected int itemID;

	// The item's name.
	protected String name;

	// The number of uses reamaining/maxumun for the item.
	// 0/0 means the item has unlimited uses.
	protected int[] uses;

}
