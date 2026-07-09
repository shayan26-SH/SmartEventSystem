package Creational;

public class OnlineWorkshopFactory implements EventFactory{

	@Override
	public Room createRoom() {
		// TODO Auto-generated method stub
		return new ZoomRoom();
	}

	@Override
	public Equipment createEquipment() {
		// TODO Auto-generated method stub
		return new Microphone();
	}

	@Override
	public AccessControl createAccessControl() {
		// TODO Auto-generated method stub
		return new IDScanner();
	}

}
