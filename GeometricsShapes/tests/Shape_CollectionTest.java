package ex4.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import ex4.Ex4_Const;
import ex4.geometry.*;
import ex4.GUIShape;
import ex4.GUI_Shape;
import ex4.GUI_Shape_Collection;
import ex4.Shape_Collection;
import ex4.Shape_Comp;


class Shape_CollectionTest {
	
	@Test
	void test0() {//test Shape_Collection constructor fuction.
		ArrayList<GUI_Shape> shapes1 = new ArrayList();
		assertEquals("[]", shapes1.toString());
	}
	@Test
	void test1() {//test Shape_Collection get(int i) fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,(Math.random()*100));
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (p1,true,Color.black,0);
			GUIShape g2 = new GUIShape (c1,true,Color.black,1);
			GUIShape g3 = new GUIShape (s1,true,Color.black,2);
			GUIShape g4 = new GUIShape (t1,true,Color.black,3);
			GUIShape g5 = new GUIShape (r1,true,Color.black,4);
			ArrayList<GUI_Shape> shapes = new ArrayList();
			shapes.add(g1);
			shapes.add(g2);
			shapes.add(g3);
			shapes.add(g4);
			shapes.add(g5);
			assertEquals(g1,shapes.get(0));
			assertEquals(g2,shapes.get(1));
			assertEquals(g3,shapes.get(2));
			assertEquals(g4,shapes.get(3));
			assertEquals(g5,shapes.get(4));
		}
	}
	@Test
	void test2() {//test Shape_Collection size fuction.
	 for(int i = 0;i<100;i++) {
		Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		Point2D p2 = new Point2D (p1.x(),p1.y());
		Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		Circle2D c1 = new Circle2D(p2,(Math.random()*100));
		Rect2D r1 = new Rect2D(p1,p3);
		Segment2D s1 = new Segment2D (p1,p3);
		Triangle2D t1 = new Triangle2D (p1,p3,p4);
		GUIShape g1 = new GUIShape (p1,true,Color.black,0);
		GUIShape g2 = new GUIShape (c1,true,Color.black,1);
		GUIShape g3 = new GUIShape (s1,true,Color.black,2);
		GUIShape g4 = new GUIShape (t1,true,Color.black,3);
		GUIShape g5 = new GUIShape (r1,true,Color.black,4);
		ArrayList<GUI_Shape> shapes = new ArrayList();
		assertEquals(0,shapes.size());
		shapes.add(g1);
		assertEquals(1,shapes.size());
		shapes.add(g2);
		assertEquals(2,shapes.size());
		shapes.add(g3);
		assertEquals(3,shapes.size());
		shapes.add(g4);
		assertEquals(4,shapes.size());
		shapes.add(g5);
		assertEquals(5,shapes.size());
		shapes.removeAll(shapes);
		assertEquals(0,shapes.size());
	 }
	}
	@Test
	void test3() {//test Shape_Collection removeElementAt fuction.
		for(int i = 0;i<100;i++) {
		    Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D (p1.x(),p1.y());
		    Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Circle2D c1 = new Circle2D(p2,(Math.random()*100));
		    Rect2D r1 = new Rect2D(p1,p3);
		    Segment2D s1 = new Segment2D (p1,p3);
		    Triangle2D t1 = new Triangle2D (p1,p3,p4);
		    GUIShape g1 = new GUIShape (p1,true,Color.black,0);
		    GUIShape g2 = new GUIShape (c1,true,Color.black,1);
		    GUIShape g3 = new GUIShape (s1,true,Color.black,2);
		    GUIShape g4 = new GUIShape (t1,true,Color.black,3);
		    GUIShape g5 = new GUIShape (r1,true,Color.black,4);
		    ArrayList<GUI_Shape> shapes = new ArrayList();
		    shapes.add(g1);
		    shapes.add(g2);
		    shapes.add(g3);
		    shapes.add(g4);
   		    shapes.add(g5);
   		    assertEquals(g1.toString(),shapes.remove(0).toString());
   		    assertEquals(g2.toString(),shapes.remove(0).toString());
   		    assertEquals(g3.toString(),shapes.remove(0).toString());
   		    assertEquals(g4.toString(),shapes.remove(0).toString());
   		    assertEquals(g5.toString(),shapes.remove(0).toString());
	}
}
	@Test
	void test4() {//test Shape_Collection addAt fuction.
		for(int i = 0;i<100;i++) {
		    Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D (p1.x(),p1.y());
		    Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Circle2D c1 = new Circle2D(p2,(Math.random()*100));
		    Rect2D r1 = new Rect2D(p1,p3);
		    Segment2D s1 = new Segment2D (p1,p3);
		    Triangle2D t1 = new Triangle2D (p1,p3,p4);
		    GUIShape g1 = new GUIShape (p1,true,Color.black,0);
		    GUIShape g2 = new GUIShape (c1,true,Color.black,1);
		    GUIShape g3 = new GUIShape (s1,true,Color.black,2);
		    GUIShape g4 = new GUIShape (t1,true,Color.black,3);
		    GUIShape g5 = new GUIShape (r1,true,Color.black,4);
		    ArrayList<GUI_Shape> shapes = new ArrayList();
		    shapes.add(0,g1);
		    shapes.add(1,g2);
		    shapes.add(2,g3);
		    shapes.add(3,g4);
   		    shapes.add(4,g5);
   		    assertEquals(g1.toString(),shapes.get(0).toString());
   		    assertEquals(g2.toString(),shapes.get(1).toString());
   		    assertEquals(g3.toString(),shapes.get(2).toString());
   		    assertEquals(g4.toString(),shapes.get(3).toString());
   		    assertEquals(g5.toString(),shapes.get(4).toString());
	}
}
	@Test
	void test5() {//test Shape_Collection add fuction.
		for(int i = 0;i<100;i++) {
		    Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D (p1.x(),p1.y());
		    Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Circle2D c1 = new Circle2D(p2,(Math.random()*100));
		    Rect2D r1 = new Rect2D(p1,p3);
		    Segment2D s1 = new Segment2D (p1,p3);
		    Triangle2D t1 = new Triangle2D (p1,p3,p4);
		    GUIShape g1 = new GUIShape (p1,true,Color.black,0);
		    GUIShape g2 = new GUIShape (c1,true,Color.black,1);
		    GUIShape g3 = new GUIShape (s1,true,Color.black,2);
		    GUIShape g4 = new GUIShape (t1,true,Color.black,3);
		    GUIShape g5 = new GUIShape (r1,true,Color.black,4);
		    ArrayList<GUI_Shape> shapes = new ArrayList();
		    shapes.add(g1);
		    shapes.add(g2);
		    shapes.add(g3);
		    shapes.add(g4);
   		    shapes.add(g5);
   		    assertEquals(g1.toString(),shapes.get(0).toString());
   		    assertEquals(g2.toString(),shapes.get(1).toString());
   		    assertEquals(g3.toString(),shapes.get(2).toString());
   		    assertEquals(g4.toString(),shapes.get(3).toString());
   		    assertEquals(g5.toString(),shapes.get(4).toString());
	}
}
	@Test
	void test6() {//test Shape_Collection copy fuction.
		for(int i = 0;i<100;i++) {
		    Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D (p1.x(),p1.y());
		    Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Circle2D c1 = new Circle2D(p2,(Math.random()*100));
		    Rect2D r1 = new Rect2D(p1,p3);
		    Segment2D s1 = new Segment2D (p1,p3);
		    Triangle2D t1 = new Triangle2D (p1,p3,p4);
		    GUIShape g1 = new GUIShape (p1,true,Color.black,0);
		    GUIShape g2 = new GUIShape (c1,true,Color.black,1);
		    GUIShape g3 = new GUIShape (s1,true,Color.black,2);
		    GUIShape g4 = new GUIShape (t1,true,Color.black,3);
		    GUIShape g5 = new GUIShape (r1,true,Color.black,4);
		    GUI_Shape_Collection shapes = new Shape_Collection();
		    shapes.add(g1);
		    shapes.add(g2);
		    shapes.add(g3);
		    shapes.add(g4);
   		    shapes.add(g5);
   		    assertEquals(shapes.toString(),shapes.copy().toString());
	}
}
	@Test
	void test7() {//test Shape_Collection sort fuction.
		for(int i = 0;i<100;i++) {
		    Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D (p1.x(),p1.y());
		    Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Circle2D c1 = new Circle2D(p2,(Math.random()*100));
		    Rect2D r1 = new Rect2D(p1,p3);
		    Segment2D s1 = new Segment2D (p1,p3);
		    Triangle2D t1 = new Triangle2D (p1,p3,p4);
		    GUIShape g1 = new GUIShape (p1,true,Color.black,0);
		    GUIShape g2 = new GUIShape (c1,true,Color.black,1);
		    GUIShape g3 = new GUIShape (s1,true,Color.black,2);
		    GUIShape g4 = new GUIShape (t1,true,Color.black,3);
		    GUIShape g5 = new GUIShape (r1,true,Color.black,4);
		    GUI_Shape_Collection shapes = new Shape_Collection();
		    shapes.add(g1);
		    shapes.add(g2);
		    shapes.add(g3);
		    shapes.add(g4);
   		    shapes.add(g5);
   		    Shape_Comp sh = new Shape_Comp(0);
   		    Shape_Comp sh1 = new Shape_Comp(1);
   		    Shape_Comp sh2 = new Shape_Comp(2);
   		    Shape_Comp sh3 = new Shape_Comp(3);
   		    Shape_Comp sh4 = new Shape_Comp(4);
   		    Shape_Comp sh5 = new Shape_Comp(5);
   		    Shape_Comp sh6 = new Shape_Comp(6);
   		    for(int j = 0;j<7;j++) {
   		    	if(j==0) {
   		    		shapes.sort(sh);
   		    		assertEquals(g1.toString(),shapes.get(0).toString());
   		    		assertEquals(g2.toString(),shapes.get(1).toString());
   		    		assertEquals(g3.toString(),shapes.get(2).toString());
   		    		assertEquals(g4.toString(),shapes.get(3).toString());
   		    		assertEquals(g5.toString(),shapes.get(4).toString());
   		    	}
   		    	if(j==1) {
   		    		shapes.sort(sh1);
   		    		assertEquals(g5.toString(),shapes.get(0).toString());
   		    		assertEquals(g4.toString(),shapes.get(1).toString());
   		    		assertEquals(g3.toString(),shapes.get(2).toString());
   		    		assertEquals(g2.toString(),shapes.get(3).toString());
   		    		assertEquals(g1.toString(),shapes.get(4).toString());
   		    	}
   		        if(j==2) {
   		        	shapes.sort(sh2);
   		    		double a = shapes.get(4).getShape().area();
   		    		double b = shapes.get(3).getShape().area();
   		    		double c = shapes.get(2).getShape().area();
   		    		double d = shapes.get(1).getShape().area();
   		    		double e = shapes.get(0).getShape().area();
   		    		assertTrue(a>=b);
   		    		assertTrue(b>=c);
   		    		assertTrue(c>=d);
   		    		assertTrue(d>=e);
   		        }
   		        if(j==3) {
   		        	shapes.sort(sh3);
   		    		double a = shapes.get(4).getShape().area();
   		    		double b = shapes.get(3).getShape().area();
   		    		double c = shapes.get(2).getShape().area();
   		    		double d = shapes.get(1).getShape().area();
   		    		double e = shapes.get(0).getShape().area();
   		    		assertTrue(a<=b);
   		    		assertTrue(b<=c);
   		    		assertTrue(c<=d);
   		    		assertTrue(d<=e);
   		        }
   		        if(j==4) {
   		        	shapes.sort(sh4);
   		    		double a = shapes.get(4).getShape().perimeter();
   		    		double b = shapes.get(3).getShape().perimeter();
   		    		double c = shapes.get(2).getShape().perimeter();
   		    		double d = shapes.get(1).getShape().perimeter();
   		    		double e = shapes.get(0).getShape().perimeter();
   		    		assertTrue(a>=b);
   		    		assertTrue(b>=c);
   		    		assertTrue(c>=d);
   		    		assertTrue(d>=e);
   		        }
   		        if(j==5) {
   		        	shapes.sort(sh5);
   		    		double a = shapes.get(4).getShape().perimeter();
   		    		double b = shapes.get(3).getShape().perimeter();
   		    		double c = shapes.get(2).getShape().perimeter();
   		    		double d = shapes.get(1).getShape().perimeter();
   		    		double e = shapes.get(0).getShape().perimeter();
   		    		assertTrue(a<=b);
   		    		assertTrue(b<=c);
   		    		assertTrue(c<=d);
   		    		assertTrue(d<=e);
   		        }
   		        if(j==6) {
   		        	GUIShape g6 = (GUIShape) g1.copy();
   		        	shapes.add(g6);
   		        	GUIShape g7 = (GUIShape) g2.copy();
   		        	shapes.add(g7);
   		        	GUIShape g8 = (GUIShape) g3.copy();
   		        	shapes.add(g8);
   		        	GUIShape g9 = (GUIShape) g4.copy();
   		        	shapes.add(g9);
   		        	GUIShape g10 = (GUIShape) g5.copy();
   		        	shapes.add(g10);
   		        	shapes.sort(sh6);
                    assertEquals(shapes.get(0).toString(),shapes.get(1).toString());
                    assertEquals(shapes.get(2).toString(),shapes.get(3).toString());
                    assertEquals(shapes.get(4).toString(),shapes.get(5).toString());
                    assertEquals(shapes.get(6).toString(),shapes.get(7).toString());
                    assertEquals(shapes.get(8).toString(),shapes.get(9).toString());

   		        }
   		    }
	}
}
	@Test
	void test8() {//test Shape_Collection removeAll fuction.
		for(int i = 0;i<100;i++) {
		    Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D (p1.x(),p1.y());
		    Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Circle2D c1 = new Circle2D(p2,(Math.random()*100));
		    Rect2D r1 = new Rect2D(p1,p3);
		    Segment2D s1 = new Segment2D (p1,p3);
		    Triangle2D t1 = new Triangle2D (p1,p3,p4);
		    GUIShape g1 = new GUIShape (p1,true,Color.black,0);
		    GUIShape g2 = new GUIShape (c1,true,Color.black,1);
		    GUIShape g3 = new GUIShape (s1,true,Color.black,2);
		    GUIShape g4 = new GUIShape (t1,true,Color.black,3);
		    GUIShape g5 = new GUIShape (r1,true,Color.black,4);
		    GUI_Shape_Collection shapes = new Shape_Collection();
		    shapes.add(g1);
		    shapes.add(g2);
		    shapes.add(g3);
		    shapes.add(g4);
   		    shapes.add(g5);
   		    GUI_Shape_Collection shapes1 = new Shape_Collection();
		    shapes.removeAll();
   		    assertEquals(shapes1.toString(),shapes.toString());
		}
	}
	@Test
	void test9() {//test Shape_Collection save+load fuction.
		for(int i = 0;i<100;i++) {
		    Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D (p1.x(),p1.y());
		    Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Circle2D c1 = new Circle2D(p2,(Math.random()*100));
		    Rect2D r1 = new Rect2D(p1,p3);
		    Segment2D s1 = new Segment2D (p1,p3);
		    Triangle2D t1 = new Triangle2D (p1,p3,p4);
		    GUIShape g1 = new GUIShape (p1,true,Color.black,0);
		    GUIShape g2 = new GUIShape (c1,true,Color.black,1);
		    GUIShape g3 = new GUIShape (s1,true,Color.black,2);
		    GUIShape g4 = new GUIShape (t1,true,Color.black,3);
		    GUIShape g5 = new GUIShape (r1,true,Color.black,4);
		    GUI_Shape_Collection shapes = new Shape_Collection();
		    GUI_Shape_Collection shapes1 = new Shape_Collection();
		    shapes.add(g1);
		    shapes.add(g2);
		    shapes.add(g3);
		    shapes.add(g4);
   		    shapes.add(g5);
   		    shapes1.add(g1);
		    shapes1.add(g2);
		    shapes1.add(g3);
		    shapes1.add(g4);
		    shapes1.add(g5);
   		    shapes.save("file");
   		    shapes.removeAll();
   		    shapes.load("file");
   		    assertEquals(shapes1.toString(),shapes.toString());
		}
		
	}
	@Test
	void test10() {//test Shape_Collection getBoundingBox fuction.
		for(int i = 0;i<100;i++) {
		    Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D (p1.x(),p1.y());
		    Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Circle2D c1 = new Circle2D(p2,(Math.random()*100));
		    Rect2D r1 = new Rect2D(p1,p3);
		    Segment2D s1 = new Segment2D (p1,p3);
		    Triangle2D t1 = new Triangle2D (p1,p3,p4);
		    GUIShape g1 = new GUIShape (p1,true,Color.black,0);
		    GUIShape g2 = new GUIShape (c1,true,Color.black,1);
		    GUIShape g3 = new GUIShape (s1,true,Color.black,2);
		    GUIShape g4 = new GUIShape (t1,true,Color.black,3);
		    GUIShape g5 = new GUIShape (r1,true,Color.black,4);
		    GUI_Shape_Collection shapes = new Shape_Collection();
		    shapes.add(g1);
		    shapes.add(g2);
		    shapes.add(g3);
		    shapes.add(g4);
   		    shapes.add(g5);
   		    double xMax = Math.max(p1.x(), Math.max(p3.x(), p4.x()));
   		    double xMin = Math.min(p1.x(), Math.min(p3.x(), p4.x()));
   		    double yMax = Math.max(p1.y(), Math.max(p3.y(), p4.y()));
		    double yMin = Math.min(p1.y(), Math.min(p3.y(), p4.y()));
   		    double cMax1 = p2.x()+c1.getRadius();
   		    double cMax2 = p2.y()+c1.getRadius();
   		    double cMin1 = p2.x()-c1.getRadius();
   		    double cMin2 = p2.y()-c1.getRadius();
   		    if(xMax<cMax1) {
   		    	xMax = cMax1;
   		    }
   		    if(yMax<cMax2) {
   		    	yMax = cMax2;
   		    }
   		    if(xMin>cMin1) {
   		    	xMin = cMin1;
   		    }
   		    if(yMin>cMin2) {
   		    	yMin = cMin2;
   		    }
   		    Rect2D r2 =(Rect2D) shapes.getBoundingBox();
   		    String [] rect = r2.toString().split(",");
   		    double x1 = Double.parseDouble(rect[0]);
   		    double y1 = Double.parseDouble(rect[1]);
   		    double x2 = Double.parseDouble(rect[2]);
		    double y2 = Double.parseDouble(rect[3]);
		    assertEquals(xMin,x1,0.0000000000001);
		    assertEquals(yMin,y1,0.0000000000001);
		    assertEquals(xMax,x2,0.0000000000001);
		    assertEquals(yMax,y2,0.0000000000001);
		}
	}
	@Test
	void test11() {//test Shape_Collection toString fuction.
		for(int i = 0;i<100;i++) {
		    Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D (p1.x(),p1.y());
		    Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Circle2D c1 = new Circle2D(p2,(Math.random()*100));
		    Rect2D r1 = new Rect2D(p1,p3);
		    Segment2D s1 = new Segment2D (p1,p3);
		    Triangle2D t1 = new Triangle2D (p1,p3,p4);
		    GUIShape g1 = new GUIShape (p1,true,Color.black,0);
		    GUIShape g2 = new GUIShape (c1,true,Color.black,1);
		    GUIShape g3 = new GUIShape (s1,true,Color.black,2);
		    GUIShape g4 = new GUIShape (t1,true,Color.black,3);
		    GUIShape g5 = new GUIShape (r1,true,Color.black,4);
		    GUI_Shape_Collection shapes = new Shape_Collection();
		    shapes.add(g1);
		    shapes.add(g2);
		    shapes.add(g3);
		    shapes.add(g4);
   		    shapes.add(g5);
		    String s = "0,true,0,Point2D,"+p1.toString()+"\n";
		    s+= "0,true,1,Circle2D,"+c1.toString()+"\n";
		    s+= "0,true,2,Segment2D,"+s1.toString()+"\n";
		    s+= "0,true,3,Triangle2D,"+t1.toString()+"\n";
		    s+= "0,true,4,Rect2D,"+r1.toString()+"\n";
		    assertEquals(s,shapes.toString());
		}
	}
}
