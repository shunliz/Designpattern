package command;


public class CloseCommand implements Command {
	
	private Recevier receiver = null;

	private int state = 0;
	
	public void execute() {
		// TODO Auto-generated method stub
		receiver.actionClose();
	}

	public void setRecevier(Recevier re) {
		// TODO Auto-generated method stub
		this.receiver = re;
	}

}
