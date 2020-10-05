import java.awt.Color;

import acm.graphics.GRect;
import acm.program.*;

public class robot extends GraphicsProgram {
	
	private static final int HEAD_WIDTH = 100;
	private static final int HEAD_HEIGHT = 150; 
	
	public void run() {
		GRect head = new GRect(getWidth() / 2 - HEAD_WIDTH / 2, getHeight()/2 - HEAD_HEIGHT /2, HEAD_WIDTH, HEAD_HEIGHT);
		head.setColor(Color.gray);
		head.setFilled(true);
	
		head.setColor(Color.black);
		add(head);
	}
}
