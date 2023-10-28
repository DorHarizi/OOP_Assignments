package ex4;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import ex4.geometry.*;
/**
 * This class represents a collection of GUI_Shape.
 * Ex4: you should implement this class!
 * @author I2CS
 *
 */
public class Shape_Collection implements GUI_Shape_Collection{
	private ArrayList<GUI_Shape> Shapes;
    
	public Shape_Collection() {
		Shapes = new ArrayList();
    }
	@Override
	public GUI_Shape get(int i) {
		return Shapes.get(i);
	}
	@Override
	public int size() {
		return Shapes.size();
	}
	@Override
	public GUI_Shape removeElementAt(int i) {
		GUI_Shape p = Shapes.get(i);
		Shapes.remove(i);
		return p;
	}
	@Override
	public void addAt(GUI_Shape s, int i) {
		Shapes.add(i, s);
	}
	@Override
	public void add(GUI_Shape s) {
		Shapes.add(s);
	}
	@Override
	public GUI_Shape_Collection copy() {
		GUI_Shape_Collection Shapes2 = new Shape_Collection();
		for(int i=0; i<Shapes.size(); i++) {
			Shapes2.addAt(Shapes.get(i).copy(),i); 
		}
		return Shapes2;
	}
	@Override
	public void sort(Comparator comp) {
		Shapes.sort(comp);
	}
	@Override
	public void removeAll() {
		Shapes.clear();
	}
	@Override
	public void save(String file) {
			 try {
			      FileWriter myWriter = new FileWriter(file);
			      for(int i=0;i<Shapes.size();i++) {
			    	  myWriter.write("GUIShape,"+this.get(i).toString()+"\n");
			      }
			      myWriter.close();
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
		}
	@Override
	public void load(String file) {
		try {
			File myObj = new File(file);
		    Scanner myReader = new Scanner(myObj);
		    int i = 1;
		    while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String [] load = data.split(",");
		        Color color= new Color(Integer.parseInt(load[i]));
		        String s = load [i+1];
		        boolean isFilled = s.contains("true");
		        int tag = Integer.parseInt(load[i+2]);
		        String shape = load[i+3];
		        if(shape.contains("Point2D")==true) {
		        	double x = Double.parseDouble(load[i+4]);
		        	double y = Double.parseDouble(load[i+5]);
		        	GUI_Shape Point = new GUIShape(new Point2D (x,y),isFilled,color,tag);
		        	this.add(Point);
		        }else if(shape.contains("Circle2D")==true) {
		        	double x = Double.parseDouble(load[i+4]);
		        	double y = Double.parseDouble(load[i+5]);
		        	double radius = Double.parseDouble(load[i+6]);
		        	Point2D center = new Point2D (x,y);
		        	Circle2D circle = new Circle2D(center,radius);
		        	GUI_Shape Circle = new GUIShape(circle,isFilled,color,tag);
		        	this.add(Circle);
		        }else if(shape.contains("Rect2D")==true) {
		        	double xMin = Double.parseDouble(load[i+4]);
		        	double yMin = Double.parseDouble(load[i+5]);
		        	double xMax = Double.parseDouble(load[i+6]);
		        	double yMax = Double.parseDouble(load[i+7]);
		        	Point2D RightUp = new Point2D (xMax,yMax);
		        	Point2D LeftDown = new Point2D (xMin,yMin);
		        	Rect2D rect = new Rect2D(RightUp,LeftDown);
		        	GUI_Shape Rect = new GUIShape(rect,isFilled,color,tag);
		        	this.add(Rect);
		        }else if(shape.contains("Segment2D")==true) {
		        	double xp1 = Double.parseDouble(load[i+4]);
		        	double yp1 = Double.parseDouble(load[i+5]);
		        	double xp2 = Double.parseDouble(load[i+6]);
		        	double yp2 = Double.parseDouble(load[i+7]);
		        	Point2D p1 = new Point2D (xp1,yp1);
		        	Point2D p2 = new Point2D (xp2,yp2);
		        	Segment2D segment = new Segment2D(p1,p2);
		        	GUI_Shape Segment = new GUIShape(segment,isFilled,color,tag);
		        	this.add(Segment);
		        }else if(shape.contains("Triangle2D")==true) {
		        	double xp1 = Double.parseDouble(load[i+4]);
		        	double yp1 = Double.parseDouble(load[i+5]);
		        	double xp2 = Double.parseDouble(load[i+6]);
		        	double yp2 = Double.parseDouble(load[i+7]);
		        	double xp3 = Double.parseDouble(load[i+8]);
		        	double yp3 = Double.parseDouble(load[i+9]);
		        	Point2D p1 = new Point2D (xp1,yp1);
		        	Point2D p2 = new Point2D (xp2,yp2);
		        	Point2D p3 = new Point2D (xp3,yp3);
		        	Triangle2D triangle = new Triangle2D(p1,p2,p3);
		        	GUI_Shape Triangle = new GUIShape(triangle,isFilled,color,tag);
		        	this.add(Triangle);
		        }
		    }
		    myReader.close();
		}
		catch(Exception e) {
			System.err.println("Wrong file name");
		}
	}
	@Override
	public Rect2D getBoundingBox() {
		double xMax = -Double.MAX_VALUE;
		double yMax = -Double.MAX_VALUE;
		double xMin = Double.MAX_VALUE;
		double yMin = Double.MAX_VALUE;
		for(int i = 0; i<this.Shapes.size();i++) {
			String s = this.Shapes.get(i).toString();
			Point2D [] Points = (this.Shapes.get(i).getShape().getPoints());
			if(s.contains("Circle2D")==true) {
				double radius = Points[1].y() - Points[0].y();
				double x1Max = Points[0].x() + radius;
				double y1Max = Points[0].y() + radius;
                double x1Min = Points[0].x() - radius;
                double y1Min = Points[0].y() - radius;
                if(xMax<x1Max) {
                	xMax = x1Max;
                }
                if(xMin>x1Min) {
                	xMin = x1Min;
                }
                if(yMax<y1Max) {
                	yMax = y1Max;
                }
                if(yMin>y1Min) {
                	yMin = y1Min;
                }
			}else {
				for(int j=0;j<Points.length;j++) {
					 if(Points[j].x()>xMax) {
						xMax = Points[j].x();
			    	}if(Points[j].x()<xMin) {
						xMin = Points[j].x();
					}if(Points[j].y()>yMax) {
							yMax = Points[j].y();
					}if(Points[j].y()<yMin) {
							yMin = Points[j].y();
					}
				}
			}
		}
		Point2D RightUp = new Point2D (xMax,yMax);
		Point2D LeftDown = new Point2D (xMin,yMin);
		Rect2D rect = new Rect2D(RightUp,LeftDown);
		return rect;
	}
	@Override
	public String toString() {
		String s ="";
		for(int i=0;i<Shapes.size();i++) {
			GUIShape P1= (GUIShape) Shapes.get(i);
			s += P1.toString()+"\n";
		}
		return s;
	}
}