package drawing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.lang.reflect.Constructor;
import java.text.AttributedCharacterIterator;

public class Frame extends JPanel{
	
	public static void main(String[] args) throws NoSuchMethodException{
		Frame frame=new Frame();	
	}
	Shape []shapearr=new Shape[100];
	public Frame(String name) {}
	public Frame(String name,int n) {}
	protected Frame(boolean s) {}
	public Frame() {
		JFrame jf=new JFrame();
		jf.setTitle("Draw画图");
		jf.setSize(600,600);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		     
		ButtonListener buttonListener=new ButtonListener();
		
		//选择形状
		String []shape= {"圆形","直线","矩形"};
		for(int i=0;i<shape.length;i++) {
			JButton colorChooser=new JButton(shape[i]);
			colorChooser.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent actionEvent) {
					buttonListener.actionPerformed(actionEvent);
					ButtonListener.color=JColorChooser.showDialog(jf, "选择颜色", null);
					colorChooser.setBackground(ButtonListener.color);
				}
			});
			jf.add(colorChooser);
			jf.addMouseListener(buttonListener);
			jf.add(this);
			jf.setVisible(true);
			Graphics G=jf.getGraphics();
			buttonListener.penToListener(G);
			buttonListener.setShapeArray(shapearr);
		}			
	}
	
	public void paint(Graphics g)
	{
		System.out.println("绘制窗口");
		super.paint(g);
		g.drawLine(300,50,300,200);
		int len=ButtonListener.getlen();
		System.out.println(len);
		for(int i=0;i<len;i++)
		{
			if(shapearr[i]!=null) {
				shapearr[i].repaint(g);
				System.out.println(shapearr[i].toString());					
			}
			else 
			{break;};			
		}
	}

}
