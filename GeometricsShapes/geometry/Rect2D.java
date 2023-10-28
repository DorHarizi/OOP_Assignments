package ex4.geometry;

public class Rect2D implements GeoShape{
	private Point2D RightUp;
	private Point2D LeftDown;
	
	public Rect2D (Point2D p1,Point2D p2) {
			double x1 = Math.max(p1.x(), p2.x());
		    double y1 = Math.max(p1.y(), p2.y());
		    double x2 = Math.min(p1.x(), p2.x());
		    double y2 = Math.min(p1.y(), p2.y());
		    this.RightUp = new Point2D (x1,y1);
		    this.LeftDown = new Point2D (x2,y2);
	}
	@Override
	public boolean contains(Point2D ot) {
		if(this.LeftDown.x()<=ot.x() && ot.x()<=this.RightUp.x()) {
			if(this.LeftDown.y()<=ot.y() && ot.y()<=this.RightUp.y()) {
				return true;
			}else return false;
		}else return false;
	}
	@Override
	public Point2D centerOfMass() {
		double x = ((this.RightUp.x() + this.LeftDown.x())/2);
		double y = ((this.RightUp.y() + this.LeftDown.y())/2);
		return new Point2D (x,y);
	}
	@Override
	public double area() {
		double rib1 = (this.RightUp.y() - this.LeftDown.y());
		double rib2 = (this.RightUp.x() - this.LeftDown.x());
		return rib1*rib2;
	}
	@Override
	public double perimeter() {
		double rib1 = this.RightUp.y()-this.LeftDown.y();
		double rib2 = this.RightUp.x() - this.LeftDown.x();
		return 2*(rib1 +rib2);
	}
	@Override
	public void move(Point2D vec) {
		this.RightUp.move(vec);
		this.LeftDown.move(vec);
	}
	@Override
	public GeoShape copy() {
		Rect2D rect = new Rect2D(new Point2D (this.RightUp),new Point2D(this.LeftDown));
		return rect;
	}
	@Override
	public String toString() {
		return this.LeftDown.toString() +","+ this.RightUp.toString();
	}
	@Override
	public Point2D[] getPoints() {
		Point2D[] ans = new Point2D[2];
		ans[0] =new Point2D(this.LeftDown);
		ans[1] =new Point2D(this.RightUp);
		return ans;
	}
}