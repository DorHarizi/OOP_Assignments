package ex4.geometry;

public class Segment2D implements GeoShape {
	private Point2D p1;
	private Point2D p2;
	
	public Segment2D (Point2D p1,Point2D p2) {
		this.p1 = new Point2D (p1);
		this.p2 = new Point2D (p2);
	}
	@Override
	public boolean contains(Point2D ot) {
		double dis1 = p1.distance();
		double dis2 = p2.distance();
		double dis3 = ot.distance();
		if(Math.min(dis1, dis2)<=dis3 && dis3<=Math.max(dis1, dis2)) {
			return true;
		}else return false;
	}
	@Override
	public Point2D centerOfMass() {
		double x = ((this.p1.x() + this.p2.x())/2);
		double y = ((this.p1.y() + this.p2.y())/2);
		return new Point2D (x,y);
	}
	@Override
	public double area() {
		return 0;
	}
	@Override
	public double perimeter() {
		return (2*(p1.distance(p2)));
	}
	@Override
	public void move(Point2D vec) {
		p1.move(vec);
		p2.move(vec);
	}
	@Override
	public GeoShape copy() {
		Segment2D s = new Segment2D (this.p1,this.p2);
		return s;
	}
	@Override
	public String toString() {
		return this.p1.toString() +","+ this.p2.toString();
	}
	@Override
	public Point2D[] getPoints() {
		Point2D[] ans = new Point2D[2];
		ans[0] =new Point2D(this.p1);
		ans[1] =new Point2D(this.p2);
		return ans;
	}
}
