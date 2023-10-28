package ex4;
/**
 * This class implements the GUI_shape.
 * Ex4: you should implement this class!
 * @author I2CS
 */
import java.awt.Color;

import ex4.geometry.*;

public class GUIShape implements GUI_Shape{
	private GeoShape Geo;
	private Color color;
	private boolean isfilled;
	private int Tag;
	
	public GUIShape(GeoShape Geo, boolean isFilled,Color color, int Tag) {
		this.Geo = Geo;
		this.color = color;
		this.isfilled = isFilled;
		this.Tag = Tag;
	}
	public GUIShape() {
		this.Geo = new Point2D(0,0);
		this.color = Color.white;
		this.isfilled = false;
		this.Tag = 0;
	}
	@Override
	public GeoShape getShape() {
		return this.Geo.copy();
	}
	@Override
	public void setShape(GeoShape g) {
		this.Geo = g;
	}
	@Override
	public boolean isFilled() {
		return this.isfilled;	
		}
	@Override
	public void setFilled(boolean filled) {
		this.isfilled = filled;
	}
	@Override
	public Color getColor() {
		return this.color;
	}
	@Override
	public void setColor(Color cl) {
		this.color = cl;
	}
	@Override
	public int getTag() {
		return this.Tag;
	}
	@Override
	public void setTag(int tag) {
		this.Tag = tag;
	}
	@Override
	public GUI_Shape copy() {
		GUIShape g = new GUIShape(this.Geo.copy(),this.isfilled,this.color,this.Tag);
		return g;
	}
	@Override
	public String toString() {
		int cl = this.color.getRGB()&0xffffff;
		String S = cl+","+this.isfilled+","+this.Tag+","+this.Geo.getClass().getSimpleName()+","+this.Geo.toString();
		
		return S;
	}
}