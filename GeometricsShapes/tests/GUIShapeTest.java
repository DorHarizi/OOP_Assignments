package ex4.tests;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import org.junit.jupiter.api.Test;

import ex4.GUIShape;
import ex4.geometry.*;

class GUIShapeTest {
	@Test
	void test0() {//test GUIShape constructor fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (p1,true,Color.black,0);
			GUIShape g2 = new GUIShape (c1,true,Color.black,1);
			GUIShape g3 = new GUIShape (s1,true,Color.black,2);
			GUIShape g4 = new GUIShape (t1,true,Color.black,3);
			GUIShape g5 = new GUIShape (r1,true,Color.black,4);
			String S1 = "0,true,0,Point2D,"+p1.toString();
			String S2 = "0,true,1,Circle2D,"+c1.toString();
			String S3 = "0,true,2,Segment2D,"+s1.toString();
			String S4 = "0,true,3,Triangle2D,"+t1.toString();
			String S5 = "0,true,4,Rect2D,"+r1.toString();
			assertEquals(S1,g1.toString());
			assertEquals(S2,g2.toString());
			assertEquals(S3,g3.toString());
			assertEquals(S4,g4.toString());
			assertEquals(S5,g5.toString());
		}
	}
	@Test
	void test1() {//test GUIShape constructor2 fuction.
		GUIShape g1 = new GUIShape ();
		Point2D p1 = new Point2D (0,0);
		String s = "16777215,false,0,Point2D,"+p1.toString();
		assertEquals(s,g1.toString());
	}
	@Test
	void test2() {//test GUIShape getShape fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (p1,true,Color.black,0);
			GUIShape g2 = new GUIShape (c1,true,Color.black,1);
			GUIShape g3 = new GUIShape (s1,true,Color.black,2);
			GUIShape g4 = new GUIShape (t1,true,Color.black,3);
			GUIShape g5 = new GUIShape (r1,true,Color.black,4);
			assertEquals(p1.toString(),g1.getShape().toString());
			assertEquals(c1.toString(),g2.getShape().toString());
			assertEquals(s1.toString(),g3.getShape().toString());
			assertEquals(t1.toString(),g4.getShape().toString());
			assertEquals(r1.toString(),g5.getShape().toString());
		}
	}
	@Test
	void test3() {//test GUIShape setShape fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (null,true,Color.black,0);
			GUIShape g2 = new GUIShape (null,true,Color.black,1);
			GUIShape g3 = new GUIShape (null,true,Color.black,2);
			GUIShape g4 = new GUIShape (null,true,Color.black,3);
			GUIShape g5 = new GUIShape (null,true,Color.black,4);
			g1.setShape(p1);
			g2.setShape(c1);
			g3.setShape(s1);
			g4.setShape(t1);
			g5.setShape(r1);
			assertEquals(p1.toString(),g1.getShape().toString());
			assertEquals(c1.toString(),g2.getShape().toString());
			assertEquals(s1.toString(),g3.getShape().toString());
			assertEquals(t1.toString(),g4.getShape().toString());
			assertEquals(r1.toString(),g5.getShape().toString());	
		}
	}
	@Test
	void test4() {//test GUIShape isFilled fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (p1,true,Color.black,0);
			GUIShape g2 = new GUIShape (c1,false,Color.black,1);
			GUIShape g3 = new GUIShape (s1,true,Color.black,2);
			GUIShape g4 = new GUIShape (t1,false,Color.black,3);
			GUIShape g5 = new GUIShape (r1,true,Color.black,4);
			assertEquals(true,g1.isFilled());
			assertEquals(false,g2.isFilled());
			assertEquals(true,g3.isFilled());
			assertEquals(false,g4.isFilled());
			assertEquals(true,g5.isFilled());	
		}
	}
	@Test
	void test5() {//test GUIShape setFilled fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (p1,true,Color.black,0);
			GUIShape g2 = new GUIShape (c1,false,Color.black,1);
			GUIShape g3 = new GUIShape (s1,true,Color.black,2);
			GUIShape g4 = new GUIShape (t1,false,Color.black,3);
			GUIShape g5 = new GUIShape (r1,true,Color.black,4);
			g1.setFilled(false);
			g2.setFilled(true);
			g3.setFilled(false);
			g4.setFilled(true);
			g5.setFilled(false);
			assertEquals(false,g1.isFilled());
			assertEquals(true,g2.isFilled());
			assertEquals(false,g3.isFilled());
			assertEquals(true,g4.isFilled());
			assertEquals(false,g5.isFilled());	
		}
	}
	@Test
	void test6() {//test GUIShape getColor fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (p1,true,Color.white,0);
			GUIShape g2 = new GUIShape (c1,false,Color.gray,1);
			GUIShape g3 = new GUIShape (s1,true,Color.green,2);
			GUIShape g4 = new GUIShape (t1,false,Color.blue,3);
			GUIShape g5 = new GUIShape (r1,true,Color.black,4);
			assertEquals(Color.white,g1.getColor());
			assertEquals(Color.gray,g2.getColor());
			assertEquals(Color.green,g3.getColor());
			assertEquals(Color.blue,g4.getColor());
			assertEquals(Color.black,g5.getColor());
		}
	}
	@Test
	void test7() {//test GUIShape setColor fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (p1,true,Color.white,0);
			GUIShape g2 = new GUIShape (c1,false,Color.gray,1);
			GUIShape g3 = new GUIShape (s1,true,Color.green,2);
			GUIShape g4 = new GUIShape (t1,false,Color.blue,3);
			GUIShape g5 = new GUIShape (r1,true,Color.black,4);
			g1.setColor(Color.black);;
			g2.setColor(Color.white);;
			g3.setColor(Color.gray);;
			g4.setColor(Color.green);;
			g5.setColor(Color.blue);;
			assertEquals(Color.black,g1.getColor());
			assertEquals(Color.white,g2.getColor());
			assertEquals(Color.gray,g3.getColor());
			assertEquals(Color.green,g4.getColor());
			assertEquals(Color.blue,g5.getColor());
		}
	}
	@Test
	void test8() {//test GUIShape getTag fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			int a = (int) (Math.random()*100-50);
			int b = (int) (Math.random()*100-50);
			int c = (int) (Math.random()*100-50);
			int d = (int) (Math.random()*100-50);
			int e = (int) (Math.random()*100-50);
			GUIShape g1 = new GUIShape (p1,true,Color.white,a);
			GUIShape g2 = new GUIShape (c1,false,Color.gray,b);
			GUIShape g3 = new GUIShape (s1,true,Color.green,c);
			GUIShape g4 = new GUIShape (t1,false,Color.blue,d);
			GUIShape g5 = new GUIShape (r1,true,Color.black,e);
			assertEquals(a,g1.getTag());
			assertEquals(b,g2.getTag());
			assertEquals(c,g3.getTag());
			assertEquals(d,g4.getTag());
			assertEquals(e,g5.getTag());
		}
	}
	@Test
	void test9() {//test GUIShape setTag fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (p1,true,Color.white,0);
			GUIShape g2 = new GUIShape (c1,false,Color.gray,0);
			GUIShape g3 = new GUIShape (s1,true,Color.green,0);
			GUIShape g4 = new GUIShape (t1,false,Color.blue,0);
			GUIShape g5 = new GUIShape (r1,true,Color.black,0);
			int a = (int) (Math.random()*100-50);
			int b = (int) (Math.random()*100-50);
			int c = (int) (Math.random()*100-50);
			int d = (int) (Math.random()*100-50);
			int e = (int) (Math.random()*100-50);
			g1.setTag(a);
			g2.setTag(b);
			g3.setTag(c);
			g4.setTag(d);
			g5.setTag(e);
			assertEquals(a,g1.getTag());
			assertEquals(b,g2.getTag());
			assertEquals(c,g3.getTag());
			assertEquals(d,g4.getTag());
			assertEquals(e,g5.getTag());
		}
	}
	@Test
	void test10() {//test GUIShape toString fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (p1,true,Color.black,0);
			GUIShape g2 = new GUIShape (c1,true,Color.black,1);
			GUIShape g3 = new GUIShape (s1,true,Color.black,2);
			GUIShape g4 = new GUIShape (t1,true,Color.black,3);
			GUIShape g5 = new GUIShape (r1,true,Color.black,4);
			String S1 = "0,true,0,Point2D,"+p1.toString();
			String S2 = "0,true,1,Circle2D,"+c1.toString();
			String S3 = "0,true,2,Segment2D,"+s1.toString();
			String S4 = "0,true,3,Triangle2D,"+t1.toString();
			String S5 = "0,true,4,Rect2D,"+r1.toString();
			assertEquals(S1,g1.toString());
			assertEquals(S2,g2.toString());
			assertEquals(S3,g3.toString());
			assertEquals(S4,g4.toString());
			assertEquals(S5,g5.toString());
		}
	}
	@Test
	void test11() {//test GUIShape copy fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			GUIShape g1 = new GUIShape (p1,true,Color.black,0);
			GUIShape g2 = new GUIShape (c1,true,Color.black,1);
			GUIShape g3 = new GUIShape (s1,true,Color.black,2);
			GUIShape g4 = new GUIShape (t1,true,Color.black,3);
			GUIShape g5 = new GUIShape (r1,true,Color.black,4);
			assertEquals(g1.toString(),g1.copy().toString());
			assertEquals(g2.toString(),g2.copy().toString());
			assertEquals(g3.toString(),g3.copy().toString());
			assertEquals(g4.toString(),g4.copy().toString());
			assertEquals(g5.toString(),g5.copy().toString());
		}
	}
}
