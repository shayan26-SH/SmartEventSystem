package Creational;

public class ClubMeeting implements EventFactory{

	@Override
	public Room createRoom() {
		// TODO Auto-generated method stub
		return new SmallRoom();
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
