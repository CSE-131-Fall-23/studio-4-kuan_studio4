package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;


/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		//		ellipse 146 0 0 true 0.5 0.5 0.2 0.2
		String shape = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		double parameterFive;
		double parameterSix;
		while (in.hasNextDouble()) {
			parameterFive = in.nextDouble();
			parameterSix = in.nextDouble();
		}

		Color color_random = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(color_random);
		if (shape.equals("ellipse")) {
			if (isFilled == true) {
				StdDraw.filledEllipse(parameterOne,parameterTwo,parameterThree,parameterFour);
			}
			else {
				StdDraw.ellipse(parameterOne,parameterTwo,parameterThree,parameterFour);
			}
		}

		else if (shape.equals("rectangle")) {
			if (!isFilled) {
				StdDraw.rectangle(parameterOne,parameterTwo,parameterThree,parameterFour);
			}
			else {
				StdDraw.filledRectangle(parameterOne,parameterTwo,parameterThree,parameterFour);
			}
		}

//		else {
//			double[] x = {parameterOne, parameterThree, parameterFive};
//			double[] y = {parameterTwo, parameterFour, parameterSix};
//			}
//			if (!isFilled) {
//				StdDraw.polygon(x, y);
//			}
//			else {
//				StdDraw.filledPolygon(x, y);
//			}
//		}

		//		triangle 109 182 255 false 0.2 0.8 0.5 0.6 0.2 0.3


		//		Color purple = new Color(146, 0, 0);
		//		StdDraw.setPenColor(purple);
		//		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.2);
		//		
		//		Color pink = new Color(255, 109, 182);
		//		StdDraw.setPenColor(pink);
		//		StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.2);

	}
}
