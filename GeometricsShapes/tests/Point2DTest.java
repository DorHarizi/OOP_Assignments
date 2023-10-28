package ex4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ex4.geometry.*;

class Point2DTest {

	@Test
	void test0() {//test Point2D toString fuction.
			Point2D p1 = new Point2D (2,5);
			Point2D p2 = new Point2D (3,6);
			Point2D p3 = new Point2D (-2,5);
			String s1 = "2.0,5.0";
			String s2 = "3.0,6.0";
			String s3 = "-2.0,5.0";
			assertEquals(s1, p1.toString());
			assertEquals(s2, p2.toString());
			assertEquals(s3, p3.toString());
	}
	@Test
	void test1() {//test Point2D contains fuction.
		Point2D p1 = new Point2D (2,5);
		Point2D p2 = new Point2D (2,5);
		Point2D p3 = new Point2D (-2,-5);
		Point2D p4 = new Point2D (3,6);
		Point2D p5 = new Point2D (6,3);
		Point2D p6 = new Point2D (6,3);
		assertEquals(true, p1.contains(p2));
		assertEquals(false, p2.contains(p3));
		assertEquals(false, p3.contains(p4));
		assertEquals(false, p4.contains(p5));
		assertEquals(false, p1.contains(p5));
		assertEquals(true, p5.contains(p6));
	}
	@Test
	void test2() {//test Point2D centerOfMass fuction.
		Point2D p1 = new Point2D (2,5);
		Point2D p2 = new Point2D (3,6);
		Point2D p3 = new Point2D (-2,-5);
		assertEquals(p1.toString(), p1.centerOfMass().toString());
		assertEquals(p2.toString(), p2.centerOfMass().toString());
		assertEquals(p3.toString(), p3.centerOfMass().toString());
	}
	@Test
	void test3() {//test Point2D area fuction.
		Point2D p1 = new Point2D (2,5);
		Point2D p2 = new Point2D (3,6);
		Point2D p3 = new Point2D (-2,-5);
		assertEquals(0, p1.area());
		assertEquals(0, p2.area());
		assertEquals(0, p3.area());
	}
	@Test
	void test4() {//test Point2D perimeter  fuction.
		Point2D p1 = new Point2D (2,5);
		Point2D p2 = new Point2D (3,6);
		Point2D p3 = new Point2D (-2,-5);
		assertEquals(0, p1.perimeter());
		assertEquals(0, p2.perimeter());
		assertEquals(0, p3.perimeter());
	}
	@Test
	void test5() {//test Point2D move fuction.
		Point2D p1 = new Point2D (2,5);
		Point2D p2 = new Point2D (3,6);
		Point2D p3 = new Point2D (-2,-5);
		Point2D p4 = new Point2D (-4,-6);
		p1.move(p3);
		p2.move(p3);
		p3.move(p4);
		Point2D p5 = new Point2D (0,0);
		Point2D p6 = new Point2D (1,1);
		Point2D p7 = new Point2D (-6,-11);
		assertEquals(true, p5.contains(p1));
		assertEquals(true, p6.contains(p2));
		assertEquals(true, p7.contains(p3));
	}
	@Test
	void test6() {//test Point2D GeoShape copy fuction.
		Point2D p1 = new Point2D (2,5);
		Point2D p2 = new Point2D (3,6);
		Point2D p3 = new Point2D (-2,-5);
		Point2D p4 = new Point2D (-4,-6);
		GeoShape p5 = p1.copy();
		GeoShape p6 = p2.copy();
		GeoShape p7 = p3.copy();
		GeoShape p8 = p4.copy();
		assertEquals(p5, p1.copy());
		assertEquals(p6, p2.copy());
		assertEquals(p7, p3.copy());
		assertEquals(p8, p4.copy());
	}
	@Test
	void test7() {//test Point2D getPoints fuction.
		Point2D p1 = new Point2D (2,5);
		Point2D p2 = new Point2D (3,6);
		Point2D p3 = new Point2D (-2,-5);
		Point2D p4 = new Point2D (-4,-6);
		Point2D [] Points =new Point2D[4];
		Points [0] = p1;
		Points [1] = p2;
		Points [2] = p3;
		Points [3] = p4;
		Point2D [] Points1 =new Point2D[1];
		Points1 = p1.getPoints();
		Point2D [] Points2 =new Point2D[1];
		Points2 = p2.getPoints();
		Point2D [] Points3 =new Point2D[1];
		Points3 = p3.getPoints();
		Point2D [] Points4 =new Point2D[1];
		Points4 = p4.getPoints();
		assertEquals(Points1[0].toString(), Points[0].toString());
		assertEquals(Points2[0].toString(), Points[1].toString());
		assertEquals(Points3[0].toString(), Points[2].toString());
		assertEquals(Points4[0].toString(), Points[3].toString());
	}
	@Test
	void test8() {//test Point2D distance fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			double dx = p1.x() - p2.x();
			double dy = p1.y() - p2.y();
			double distance = Math.sqrt((dx*dx)+(dy*dy));
			assertEquals(distance, p1.distance(p2));
		}
	}
	@Test
	void test9() {//test Point2D vector fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			double x = p1.x() - p2.x();
			double y = p1.y() - p2.y();
			Point2D p3 = new Point2D(x,y);
			assertEquals(p3, p2.vector(p1));
		}
	}
	@Test
	void test10() {//test Point2D equals fuction.
		for(int i = 0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D (p1.x(),p1.y());
			Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p4 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Circle2D c1 = new Circle2D(p2,3);
			Rect2D r1 = new Rect2D(p1,p3);
			Segment2D s1 = new Segment2D (p1,p3);
			Triangle2D t1 = new Triangle2D (p1,p3,p4);
			assertEquals(true, p1.equals(p2));
			assertEquals(false, p1.equals(c1));
			assertEquals(false, p1.equals(r1));
			assertEquals(false, p1.equals(s1));
			assertEquals(false, p1.equals(t1));
		}
	}
	@Test
	void test11() {//test Point2D x() fuction.
		for(int i = 0;i<100;i++) {
			double x = (Math.random()*100-50);
			Point2D p1 = new Point2D (x,(Math.random()*100-50));
			assertEquals(x, p1.x());
		}
	}
	@Test
	void test12() {//test Point2D y() fuction.
		for(int i = 0;i<100;i++) {
			double y = (Math.random()*100-50);
			Point2D p1 = new Point2D ((Math.random()*100-50),y);
			assertEquals(y, p1.y());
		}
	}
	@Test
	void test13() {//test Point2D add fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
			Point2D p3 = new Point2D ((p1.x()+p2.x()),(p1.y()+p2.y()));
			assertEquals(p3, p1.add(p2));
		}
	}
	
}
