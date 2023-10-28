package ex4.geometry;

public class Triangle2D implements GeoShape{
	private Point2D p1;
	private Point2D p2;
	private Point2D p3;
	
	public Triangle2D (Point2D p1,Point2D p2,Point2D p3) {
		this.p1 = new Point2D (p1);
		this.p2 = new Point2D (p2);
		this.p3 = new Point2D (p3);
	}
	@Override
	public boolean contains(Point2D ot) {
		double dis1 = ot.distance();
		double dis2 = this.p1.distance();
		double dis3 = this.p2.distance();
		double dis4 = this.p3.distance();
		if((dis1<=dis2)||(dis1<=dis3)||(dis1<=dis4)) {
			if((dis1>=dis2)||(dis1>=dis3)||(dis1>=dis4)) {
				return true;
			}else return false;
		}else return false;
	}
	@Override
	public Point2D centerOfMass() {
		double x = ((this.p1.x()+this.p2.x()+this.p3.x())/3);
		double y = ((this.p1.y()+this.p2.y()+this.p3.y())/3);
		return new Point2D (x,y);
	}
	@Override
	public double area() {
		double dis1 = p1.distance(p2);
		double dis2 = p2.distance(p3);
		double dis3 = p3.distance(p1);
		double dis4 = ((dis1 + dis2 + dis3)/2);
		return Math.sqrt((dis4-dis1)*(dis4-dis2)*(dis4-dis3));
	}
	@Override
	public double perimeter() {
		double dis1 = p1.distance(p2);
		double dis2 = p2.distance(p3);
		double dis3 = p3.distance(p1);
		return (dis1+dis2+dis3);
	}
	@Override
	public void move(Point2D vec) {
		p1.move(vec);
		p2.move(vec);
		p3.move(vec);
	}
	@Override
	public GeoShape copy() {
		Triangle2D P = new Triangle2D(this.p1,this.p2,this.p3);
		return P;
	}
    @Override
    public String toString() {
    	return this.p1.toString() +","+ this.p2.toString() +","+ this.p3.toString();
    }
	@Override
	public Point2D[] getPoints() {
		Point2D[] ans = new Point2D[3];
		ans[0] =new Point2D(this.p1);
		ans[1] =new Point2D(this.p2);
		ans[2] =new Point2D(this.p3);
		return ans;
	}
}