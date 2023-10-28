package ex4.tests;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ex4.geometry.*;

class Rect2DTest {

	@Test
	void test0() {//test of constructor Rect2D.
		for(double i=0;i<100;i++) {
		   Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		   Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		   Rect2D rect = new Rect2D(p1,p2);
		   double xMax = Math.max(p1.x(), p2.x());
		   double yMax = Math.max(p1.y(), p2.y());
		   double xMin = Math.min(p1.x(), p2.x());
		   double yMin = Math.min(p1.y(), p2.y());
		   Point2D p3 = new Point2D (xMin,yMin);
		   Point2D p4 = new Point2D (xMax,yMax);
		   assertEquals(p3.toString()+","+p4.toString(), rect.toString());
		}
	}
	@Test
	void test1() {//test of contains Rect2D.
		for(double i=0;i<100;i++) {
			   Point2D p1 = new Point2D (i,i+1);
			   Point2D p2 = new Point2D (i+2,i+3);
			   Rect2D rect = new Rect2D(p1,p2);
			   Point2D p3 = new Point2D (i+1,i+2);
			   assertEquals(true, rect.contains(p3));
			   Point2D p4 = new Point2D (i,i+1);
			   assertEquals(true, rect.contains(p4));
			   Point2D p5 = new Point2D (i+2,i+3);
			   assertEquals(true, rect.contains(p5));
			   Point2D p6 = new Point2D (i-0.1,i-0.1);
			   assertEquals(false, rect.contains(p6));
			   Point2D p7 = new Point2D (i+2.1,i+3.1);
			   assertEquals(false, rect.contains(p7));
	     }
	}
	@Test
	void test2() {//test of centerOfMass Rect2D.
	   for(int i=0; i<100; i++) {
		    Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    double x1 = p1.x();
		    double y1 = p1.y();
		    Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    double x2 = p2.x();
		    double y2 = p2.y();
		    Rect2D rect = new Rect2D(p1,p2);
		    Point2D p3 = new Point2D(((x1+x2)/2),((y1+y2)/2));
		    assertEquals(p3, rect.centerOfMass());
	   }	   
	}

	@Test
	void test3() {//test of area Rect2D.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Rect2D rect = new Rect2D(p1,p2);
		    double xMax = Math.max(p1.x(), p2.x());
		    double yMax = Math.max(p1.y(), p2.y());
		    double xMin = Math.min(p1.x(), p2.x());
		    double yMin = Math.min(p1.y(), p2.y());
		    double area = (xMax-xMin)*(yMax-yMin);
		    assertEquals(area,rect.area());
		}
		
	}
	@Test
	void test4() {//test of perimeter Rect2D.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Rect2D rect = new Rect2D(p1,p2);
		    double xMax = Math.max(p1.x(), p2.x());
		    double yMax = Math.max(p1.y(), p2.y());
		    double xMin = Math.min(p1.x(), p2.x());
		    double yMin = Math.min(p1.y(), p2.y());
		    double perimeter = 2*((xMax-xMin)+(yMax-yMin));
		    assertEquals(perimeter,rect.perimeter());
		}
	}
	@Test
	void test5() {//test of move Rect2D.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Rect2D rect1 = new Rect2D(p1,p2);
		    Point2D p3 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p4 = new Point2D((p1.x()+p3.x()),(p1.y()+p3.y()));
		    Point2D p5 = new Point2D((p2.x()+p3.x()),(p2.y()+p3.y()));
		    Rect2D rect2 = new Rect2D(p4,p5);
		    rect1.move(p3);
		    assertEquals(rect2.toString(),rect1.toString());
		}
	}
	@Test
	void test6() {
		for(int i=0;i<100;i++) {//test of copy Rect2D.
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Rect2D rect = new Rect2D(p1,p2);
		    assertEquals(rect.toString(),rect.copy().toString());
		}
	}
	@Test
	void test7() {//test of toString Rect2D.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    double xMax = Math.max(p1.x(), p2.x());
		    double yMax = Math.max(p1.y(), p2.y());
		    double xMin = Math.min(p1.x(), p2.x());
		    double yMin = Math.min(p1.y(), p2.y());
		    Point2D p3 = new Point2D (xMax,yMax);
		    Point2D p4 = new Point2D (xMin,yMin);
		    Rect2D rect = new Rect2D(p3,p4);
		    String s = p4.x()+","+p4.y()+","+p3.x()+","+p3.y();
		    assertEquals(s,rect.toString()); 
		}
	}
	@Test
	void test8() {//test of getPoints Rect2D.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Point2D p2 = new Point2D ((Math.random()*100-50),(Math.random()*100-50));
		    Rect2D rect = new Rect2D(p1,p2);
		    double xMax = Math.max(p1.x(), p2.x());
		    double yMax = Math.max(p1.y(), p2.y());
		    double xMin = Math.min(p1.x(), p2.x());
		    double yMin = Math.min(p1.y(), p2.y());
		    Point2D p3 = new Point2D (xMax,yMax);
		    Point2D p4 = new Point2D (xMin,yMin);
		    Point2D [] arr = new Point2D [2];
		    arr[0] = p4;
		    arr[1] = p3;
		    String s = Arrays.toString(arr);
		    String s1 = Arrays.toString(rect.getPoints());
		    assertEquals(s,s1);
		}
	}
}