package ex4.tests;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import ex4.geometry.*;
class Circle2DTest {
	
	@Test
	void test0() {//test Circle2D toString fuction.
		Point2D center1 = new Point2D (2,5);
		Point2D center2 = new Point2D (6,-6);
		Point2D center3 = new Point2D (-3,6);
		Point2D center4 = new Point2D (-2,-5);
		Circle2D circle1 = new Circle2D (center1,2);
		Circle2D circle2 = new Circle2D (center2,2);
		Circle2D circle3 = new Circle2D (center3,10);
		Circle2D circle4 = new Circle2D (center4,10);
		assertEquals("2.0,5.0,2.0", circle1.toString());
		assertEquals("6.0,-6.0,2.0", circle2.toString());
		assertEquals("-3.0,6.0,10.0", circle3.toString());
		assertEquals("-2.0,-5.0,10.0", circle4.toString());
	}
	@Test
	void test1() {//test Circle2D contains fuction.
		Point2D center1 = new Point2D (2,5);
		Point2D center2 = new Point2D (6,-6);
		Point2D center3 = new Point2D (-3,6);
		Point2D center4 = new Point2D (-2,-5);
		Circle2D circle1 = new Circle2D (center1,2);
		Circle2D circle2 = new Circle2D (center2,2);
		Circle2D circle3 = new Circle2D (center3,10);
		Circle2D circle4 = new Circle2D (center4,10);
		Point2D p1 = new Point2D (3,5);
		Point2D p2 = new Point2D (0,0);
		Point2D p3 = new Point2D (-1,-1);
		Point2D p4 = new Point2D (-10,10);
		assertEquals(true, circle1.contains(p1));
		assertEquals(false, circle2.contains(p2));
		assertEquals(true, circle3.contains(p3));
		assertEquals(false, circle4.contains(p4));
	}
	@Test
	void test2() {//test Circle2D centerOfMass fuction.
		Point2D center1 = new Point2D (2,5);
		Point2D center2 = new Point2D (6,-6);
		Point2D center3 = new Point2D (-3,6);
		Point2D center4 = new Point2D (-2,-5);
		Circle2D circle1 = new Circle2D (center1,2);
		Circle2D circle2 = new Circle2D (center2,2);
		Circle2D circle3 = new Circle2D (center3,10);
		Circle2D circle4 = new Circle2D (center4,10);
		assertEquals(center1, circle1.centerOfMass());
		assertEquals(center2, circle2.centerOfMass());
		assertEquals(center3, circle3.centerOfMass());
		assertEquals(center4, circle4.centerOfMass());
	}
	@Test
	void test3() {//test Circle2D area fuction.
		Point2D center1 = new Point2D (2,5);
		Point2D center2 = new Point2D (6,-6);
		Point2D center3 = new Point2D (-3,6);
		Point2D center4 = new Point2D (-2,-5);
		Circle2D circle1 = new Circle2D (center1,2);
		Circle2D circle2 = new Circle2D (center2,2);
		Circle2D circle3 = new Circle2D (center3,10);
		Circle2D circle4 = new Circle2D (center4,10);
		double s1 = Math.PI * Math.pow(2,2);
		double s2 = Math.PI * Math.pow(2,2);
		double s3 = Math.PI * Math.pow(10,2);
		double s4 = Math.PI * Math.pow(10,2);
		assertEquals(s1, circle1.area());
		assertEquals(s2, circle2.area());
		assertEquals(s3, circle3.area());
		assertEquals(s4, circle4.area());
	}
	@Test
	void test4() {//test Circle2D perimeter fuction.
		Point2D center1 = new Point2D (2,5);
		Point2D center2 = new Point2D (6,-6);
		Point2D center3 = new Point2D (-3,6);
		Point2D center4 = new Point2D (-2,-5);
		Circle2D circle1 = new Circle2D (center1,2);
		Circle2D circle2 = new Circle2D (center2,2);
		Circle2D circle3 = new Circle2D (center3,10);
		Circle2D circle4 = new Circle2D (center4,10);
		double s1 = Math.PI *2*2;
		double s2 = Math.PI *2*2;
		double s3 = Math.PI *2*10;
		double s4 = Math.PI *2*10;
		assertEquals(s1, circle1.perimeter());
		assertEquals(s2, circle2.perimeter());
		assertEquals(s3, circle3.perimeter());
		assertEquals(s4, circle4.perimeter());
	}
	@Test
	void test5() {//test Circle2D move fuction.
		Point2D center1 = new Point2D (2,5);
		Point2D center2 = new Point2D (6,-6);
		Point2D center3 = new Point2D (-3,6);
		Point2D center4 = new Point2D (-2,-5);
		Point2D vec1 = new Point2D (5,5);
		Point2D vec2 = new Point2D (6,-6);
		Point2D vec3 = new Point2D (-3,6);
		Point2D vec4 = new Point2D (-5,-5);
		Circle2D circle1 = new Circle2D (center1,2);
		Circle2D circle2 = new Circle2D (center2,2);
		Circle2D circle3 = new Circle2D (center3,10);
		Circle2D circle4 = new Circle2D (center4,10);
		circle1.move(vec1);
		circle2.move(vec2);
		circle3.move(vec3);
		circle4.move(vec4);
		assertEquals("7.0,10.0", circle1.centerOfMass().toString());
		assertEquals("12.0,-12.0", circle2.centerOfMass().toString());
		assertEquals("-6.0,12.0", circle3.centerOfMass().toString());
		assertEquals("-7.0,-10.0", circle4.centerOfMass().toString());
	}
	@Test
	void test6() {//test Circle2D copy fuction.
		Point2D center1 = new Point2D (2,5);
		Point2D center2 = new Point2D (6,-6);
		Point2D center3 = new Point2D (-3,6);
		Point2D center4 = new Point2D (-2,-5);
		Circle2D circle1 = new Circle2D (center1,2);
		Circle2D circle2 = new Circle2D (center2,2);
		Circle2D circle3 = new Circle2D (center3,10);
		Circle2D circle4 = new Circle2D (center4,10);
		assertEquals(circle1.toString(), circle1.copy().toString());
		assertEquals(circle2.toString(), circle2.copy().toString());
		assertEquals(circle3.toString(), circle3.copy().toString());
		assertEquals(circle4.toString(), circle4.copy().toString());
	}
	@Test
	void test7() {//test Circle2D copy fuction.
		Point2D center1 = new Point2D (2,5);
		Point2D center2 = new Point2D (6,-6);
		Point2D center3 = new Point2D (-3,6);
		Point2D center4 = new Point2D (-2,-5);
		Circle2D Circle1 = new Circle2D (center1,2);
		Circle2D Circle2 = new Circle2D (center2,2);
		Circle2D Circle3 = new Circle2D (center3,10);
		Circle2D Circle4 = new Circle2D (center4,10);
		Point2D [] circle1 = new Point2D [2];
		circle1 = Circle1.getPoints();
		Point2D [] circle2 = new Point2D [2];
		circle2 = Circle2.getPoints();
		Point2D [] circle3 = new Point2D [2];
		circle3 = Circle3.getPoints();
		Point2D [] circle4 = new Point2D [2];
		circle4 = Circle4.getPoints();
		Point2D [] arr1 = {center1,new Point2D(2.0,7.0)};
		Point2D [] arr2 = {center2,new Point2D(6.0,-4.0)};
		Point2D [] arr3 = {center3,new Point2D(-3.0,16.0)};
		Point2D [] arr4 = {center4,new Point2D(-2.0,5.0)};
		assertEquals(Arrays.toString(arr1), Arrays.toString(circle1));
		assertEquals(Arrays.toString(arr2), Arrays.toString(circle2));
		assertEquals(Arrays.toString(arr3), Arrays.toString(circle3));
		assertEquals(Arrays.toString(arr4), Arrays.toString(circle4));
	}
}