package Structural;
import Creational.*;


public class BasicEventBooking implements EventBooking {

	
	private String EventName;
	private Room room;
	private Equipment equipment;
	private AccessControl accesscontrol;
	
	
	/**
	 * @param eventName
	 * @param room
	 * @param equipment
	 * @param accesscontrol
	 */
	public BasicEventBooking(String eventName, Room room, Equipment equipment, AccessControl accesscontrol) {
		this.EventName = eventName;
		this.room = room;
		this.equipment = equipment;
		this.accesscontrol = accesscontrol;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return EventName;
	}

	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		EventName = eventName;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 * @return the equipment
	 */
	public Equipment getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	/**
	 * @return the accesscontrol
	 */
	public AccessControl getAccesscontrol() {
		return accesscontrol;
	}

	/**
	 * @param accesscontrol the accesscontrol to set
	 */
	public void setAccesscontrol(AccessControl accesscontrol) {
		this.accesscontrol = accesscontrol;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
        return "Event: " + EventName
                + "\nRoom: " + room.getRoomType()
                + "\nEquipment: " + equipment.getEquipmentName()
                + "\nAccess Control: " + accesscontrol.getAccessType();

	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		Double amount = room.getRoomCost() + equipment.getEquipmentCost()+ accesscontrol.getAccessCost();
		return amount;
	}}
