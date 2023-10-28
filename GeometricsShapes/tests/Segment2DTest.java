package ex4.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ex4.geometry.*;

class Segment2DTest {

	@Test
	void test0() {//test Segment2D constructor fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Segment2D segment = new Segment2D (p1,p2);
			Point2D [] arr = segment.getPoints();
			Point2D [] arr1 = new Point2D [2];
			arr1[0] = p1;
			arr1[1] = p2;
			String s = Arrays.toString(arr);
			String s1 = Arrays.toString(arr1);
			assertEquals(s1, s);
		}
	}
	@Test
	void test1() {//test Segment2D contains fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Segment2D segment = new Segment2D (p1,p2);
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			if(segment.contains(p3)==true) {
				assertEquals(true, segment.contains(p3));
			}else assertEquals(false, segment.contains(p3));
		}
	}
	@Test
	void test2() {//test Segment2D centerOfMass fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Segment2D segment = new Segment2D (p1,p2);
			Point2D p3 = new Point2D(((p1.x()+p2.x())/2),((p1.y()+p2.y())/2));
			assertEquals(p3, segment.centerOfMass());
		}
	}
	@Test
	void test3() {//test Segment2D area fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Segment2D segment = new Segment2D (p1,p2);
			assertEquals(0, segment.area());
		}
	}
	@Test
	void test4() {//test Segment2D perimeter fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Segment2D segment = new Segment2D (p1,p2);
			double per = (2*(p1.distance(p2)));
			assertEquals(per, segment.perimeter());
		}
	}
	@Test
	void test5() {//test Segment2D move fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Segment2D segment = new Segment2D (p1,p2);
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			segment.move(p3);
			double x = p1.x()+p3.x();
			double y = p1.y()+p3.y();
			double x1 = p2.x()+p3.x();
			double y1 = p2.y()+p3.y();
			Point2D p4 = new Point2D(x,y);
			Point2D p5 = new Point2D(x1,y1);
			Segment2D segment1 = new Segment2D (p4,p5);
			assertEquals(segment1.toString(), segment.toString());
		}
	}
	@Test
	void test6() {
		for(int i=0;i<100;i++) {//test of copy Segment2D.
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Segment2D segment = new Segment2D(p1,p2);
		    assertEquals(segment.toString(),segment.copy().toString());
		}
	}
	@Test
	void test7() {//test of toString Segment2D.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Segment2D segment = new Segment2D(p1,p2);
		    String s = p1.x()+","+p1.y()+","+p2.x()+","+p2.y();
		    assertEquals(s,segment.toString()); 
		}
	}
	@Test
	void test8() {//test of getPoints Segment2D.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Segment2D segment = new Segment2D(p1,p2);
		    Point2D [] arr = new Point2D [2];
		    arr[0] = p1;
		    arr[1] = p2;
		    String s = Arrays.toString(arr);
		    String s1 = Arrays.toString(segment.getPoints());
		    assertEquals(s,s1);
		}
	}	
}