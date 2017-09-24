package command;

public class OpenCommand implements Command {

	private Recevier recevier = null;
	
	private int state = 1;
	
	public void execute() {
		// TODO Auto-generated method stub
		recevier.actionOpen();
	}

	public void setRecevier(Recevier re) {
		// TODO Auto-generated method stub
		this.recevier = re;
	}

}
