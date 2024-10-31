
import processing.core.PApplet;

public class MyExampleProcessingApp extends PApplet {

	public static void main(String[] args) {
		System.out.println("MyExampleProcessingApp main() started");

		// The string must match your full class name:
		PApplet.main(new String[] { "MyExampleProcessingApp" });
	}

	@Override
	public void settings() {
		size(800, 600);
	}

	@Override
	public void setup() {
	}

	@Override
	public void draw() {
		background(255);
		fill(255, 0, 255);
		circle(mouseX, mouseY, 100);
	}
}