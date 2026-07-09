package Creational;
public class ConferenceFactory implements EventFactory {

	@Override
	public Room createRoom() {
		// TODO Auto-generated method stub
		return new LargeRoom();
	}

	@Override
	public Equipment createEquipment() {
		// TODO Auto-generated method stub
		return new Projector();
	}

	@Override
	public AccessControl createAccessControl() {
		// TODO Auto-generated method stub
		return new IDScanner();
	}
	
}