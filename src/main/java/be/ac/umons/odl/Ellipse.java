package be.ac.umons.odl;

import java.awt.*;

public class Ellipse implements Drawable {
	private Point center; //attention center n'est pas le centre de l'ellipse
	private int xAxisLength;
	private int yAxis2Length;

	public Ellipse(Point center, int xAxisLength, int yAxis2Length) {
		this.center = center;
		this.xAxisLength = xAxisLength;
		this.yAxis2Length = yAxis2Length;
	}


	@Override
	public void draw(Graphics g) {
		int x = center.getX();
		int y = center.getY();

		g.drawOval(x, y, xAxisLength, yAxis2Length);
	}
}
