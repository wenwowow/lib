package drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonListener implements MouseListener, ActionListener{
	private Graphics g;
	private String Commend="";
	private Shape shapearry[];
	static int shapenum=0;
	public static Color color=Color.black;
	int x1=0,x2=0,y1=0,y2=0;
	int x3=0,y3=0;
	
	public static int getlen() {
		return shapenum;
	}
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String buttonName=actionEvent.getActionCommand();
		Commend=buttonName;
		System.out.println(Commend);
	}
	//pressed
	@Override
	public void mousePressed(MouseEvent e) {
		x1=e.getX();
		y1=e.getY();
		g.setColor(color);
		System.out.println(x1);
		System.out.println(y1);		
	}
	//released
	@Override
	public void mouseReleased(MouseEvent e) {
		x2=e.getX();
		y2=e.getY();
		if("直线".contentEquals(Commend)) {
			g.drawLine(x1,y1,x2,y2);
			shapearry[shapenum++]=new Shape(x1,y1,x2,y2,"直线");
		}
		if("圆形".contentEquals(Commend)) {
			g.drawOval(Math.min(x1, x2),Math.min(y1, y2),Math.abs(x1-x2),Math.abs(y1-y2));			
			shapearry[shapenum++]=new Shape(x1,y1,x2,y2,"圆形");
		}
		if("矩形".contentEquals(Commend)) {
			g.drawRect(Math.min(x1, x2),Math.min(y1, y2),Math.abs(x1-x2),Math.abs(y1-y2));		
			shapearry[shapenum++]=new Shape(x1,y1,x2,y2,"矩形");
		}
	}
	
	public void penToListener(Graphics pen) {
		g=pen;
	}
	public void setShapeArray(Shape ShapeArray[]) {
		this.shapearry=ShapeArray;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//x3=e.getX();
		//y3=e.getY();
		//if(x3>shape(i).)
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	}
