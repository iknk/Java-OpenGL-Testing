package newpro;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.*;
import org.lwjgl.*;

public class lwjava {

	
	public lwjava() {
		try {
			Display.setDisplayMode(new DisplayMode(800, 480));
			Display.setTitle("LWJGL TEST");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (!Display.isCloseRequested()) {
			Display.update();
			Display.sync(60);
			
		}
		
		Display.destroy();
	}
	
	public static void main(String[] args) {
		new lwjava();

	}

}
