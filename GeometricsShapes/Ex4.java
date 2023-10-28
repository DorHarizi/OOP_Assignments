package ex4;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

import ex4.geometry.*;
/**
 * This class is the "main" class which will be constructed and run as in (Test_Ex4).
 * Ex4: you should implement this class!
 * @author boaz.benmoshe
 *
 */
public class Ex4 implements Ex4_GUI{
	private GUI_Shape_Collection p;
	
	public Ex4() {
		p = new Shape_Collection();
    }
	
	@Override
	public void init(GUI_Shape_Collection g) {
		this.p = g.copy();
		Rect2D bb = p.getBoundingBox();
		Point2D min = bb.getPoints()[0], max = bb.getPoints()[1];
		GUI_Shape s7 = new GUIShape(bb,false, Color.gray, 0);
		p.add(s7);
		double m0 = Math.min(min.x(), min.y());
		double m1 = Math.max(max.x(), max.y());
		StdDraw.setScale(m0-0.01,m1+0.01);
	}
	
	@Override
	public GUI_Shape_Collection getShape_Collection() {
		return this.p;
	}

	@Override
	public void show() {
		int ww = p.size();
		for(int i =0; i<ww;i++) {
			String s = p.get(i).toString();
			StdDraw.setPenRadius(0.01);
			Color color = p.get(i).getColor();
			StdDraw.setPenColor(color);
			if(s.contains("Point2D")==true) {
				Point2D [] point = p.get(i).getShape().getPoints();
				double x = point[0].x();
				double y = point[0].y();
				StdDraw.point(x, y);
			}
			if(s.contains("Circle2D")==true) {
				Point2D [] circle = p.get(i).getShape().getPoints();
				double x = circle[0].x();
				double y = circle[0].y();
				double radius = circle[1].y()-circle[0].y();
				if(s.contains("true")==true) {
				   StdDraw.filledCircle(x, y, radius);
				}else {
				   StdDraw.circle(x, y, radius);
				}
			}
			if(s.contains("Rect2D")==true){
				Point2D CenterOfMass = p.get(i).getShape().centerOfMass();
				Point2D [] rect = p.get(i).getShape().getPoints(); 
				double x = CenterOfMass.x();
				double y = CenterOfMass.y();
				double x2 = rect[1].x() - x;
				double y2 = rect[1].y() - y;
				if(s.contains("true")==true) {
					   StdDraw.filledRectangle(x, y, x2, y2);
					}else {
					   StdDraw.rectangle(x, y, x2, y2);	
					}
			}
			if(s.contains("Segment2D")==true) {
				Point2D[] points = p.get(i).getShape().getPoints();
				double x1 = points[0].x();
				double y1 = points[0].y();
				double x2 = points[1].x();
				double y2 = points[1].y();
			    StdDraw.line(x1, y1, x2, y2);;
			}
			if(s.contains("Triangle2D")==true) {
				Point2D[] points = p.get(i).getShape().getPoints();
				double [] x = new double [3];
				x [0] = points[0].x();
		        x [1] = points[1].x();
		    	x [2] = points[2].x();
				double [] y = new double [3];
				y [0] = points[0].y();
		        y [1] = points[1].y();
		    	y [2] = points[2].y();
		    	if(s.contains("true")==true) {
		    		StdDraw.filledPolygon(x, y);	
					}else {	
					   StdDraw.polygon(x, y);
					}
			}
		}
	}
	@Override
	public String getInfo() {
		return p.toString();
	}
	
	//*******************************************************************************\\
	public static void main(String[] args) {
		String file_name = "";
		int number = -1;
		Ex4 window = new Ex4();
		GUI_Shape_Collection shapes = new Shape_Collection();
		try {
			file_name = args[0];
			number = Integer.parseInt(args[1]);
			File my_file = new File(file_name);
			Scanner myReader = new Scanner(my_file);	
		}
		catch (Exception e) {
			    Scanner scanner = new Scanner(System.in);
				System.out.println("Enter file name");
				file_name = scanner.nextLine();
				System.out.println("Enter sort method [0,6]");
				number = scanner.nextInt();
		}
		while ((number<0)||(6<number)) {
				System.err.println("Not compatible sort method [0,6]");
				System.out.println("Enter a new sort method");
				Scanner scanner1 = new Scanner(System.in);
				number = scanner1.nextInt();
				if ((0<=number)&&(number<=6)) {
					scanner1.close();
			}
		}
		Shape_Comp comp = new Shape_Comp(number);
		shapes.load(file_name);
		shapes.sort(comp);
		window.init(shapes);
		window.show();
	  }
	}