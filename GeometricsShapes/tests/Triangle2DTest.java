package ex4.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import ex4.geometry.*;


class Triangle2DTest {
	@Test
	void test0() {//test Triangle2D constructor fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Triangle2D triangle = new Triangle2D (p1,p2,p3);
			Point2D [] arr = triangle.getPoints();
			Point2D [] arr1 = new Point2D [3];
			arr1[0] = p1;
			arr1[1] = p2;
			arr1[2] = p3;
			String s = Arrays.toString(arr);
			String s1 = Arrays.toString(arr1);
			assertEquals(s1, s);
		}
	}
	@Test
	void test1() {//test Triangle2D contains fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Triangle2D triangle = new Triangle2D (p1,p2,p3);
			Point2D p4 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			if(true == triangle.contains(p4)) {
				assertEquals(true, triangle.contains(p4));
			}else assertEquals(false, triangle.contains(p4));
		}
}
	@Test
	void test2() {//test Triangle2D centerOfMass fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Triangle2D triangle = new Triangle2D (p1,p2,p3);
			double x = ((p1.x()+p2.x()+p3.x())/3);
			double y = ((p1.y()+p2.y()+p3.y())/3);
			Point2D p4 = new Point2D(x,y);
			assertEquals(p4, triangle.centerOfMass());
		}
	}
	@Test
	void test3() {//test Triangle2D area fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Triangle2D triangle = new Triangle2D (p1,p2,p3);
			double dis1 = p1.distance(p2);
			double dis2 = p2.distance(p3);
			double dis3 = p3.distance(p1);
			double dis4 = ((dis1 + dis2 + dis3)/2);
			double area = Math.sqrt((dis4-dis1)*(dis4-dis2)*(dis4-dis3));
			assertEquals(area, triangle.area());
		}
	}
	@Test
	void test4() {//test Triangle2D perimeter fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Triangle2D triangle = new Triangle2D (p1,p2,p3);
			double dis1 = p1.distance(p2);
			double dis2 = p2.distance(p3);
			double dis3 = p3.distance(p1);
			double dis4 = dis1+dis2+dis3;
			assertEquals(dis4, triangle.perimeter());
		}
	}
	@Test
	void test5() {//test Triangle2D move fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Triangle2D triangle1 = new Triangle2D (p1,p2,p3);
			Point2D p4 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			triangle1.move(p4);
			p1.move(p4);
			p2.move(p4);
			p3.move(p4);
			Triangle2D triangle2 = new Triangle2D (p1,p2,p3);
			assertEquals(triangle2.toString(), triangle1.toString());
		}
	}
	@Test
	void test6() {//test Triangle2D copy fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Triangle2D triangle1 = new Triangle2D (p1,p2,p3);
			Triangle2D triangle2 = new Triangle2D (p1,p2,p3);
			assertEquals(triangle2.toString(), triangle1.copy().toString());
		}
	}
	@Test
	void test7() {//test Triangle2D toString fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Triangle2D triangle = new Triangle2D (p1,p2,p3);
			String s = p1.toString()+","+p2.toString()+","+p3.toString();
			assertEquals(s, triangle.toString());
		}
	}
	@Test
	void test8() {//test Triangle2D getPoints fuction.
		for(int i=0;i<100;i++) {
			Point2D p1 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p2 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Point2D p3 = new Point2D((Math.random()*100-50),(Math.random()*100-50));
			Triangle2D triangle = new Triangle2D (p1,p2,p3);
			Point2D [] arr = triangle.getPoints();
			Point2D [] arr1 = new Point2D [3];
			arr1[0] = p1;
			arr1[1] = p2;
			arr1[2] = p3;
			String s = Arrays.toString(arr);
			String s1 = Arrays.toString(arr1);
			assertEquals(s1, s);
		}
	}
}
