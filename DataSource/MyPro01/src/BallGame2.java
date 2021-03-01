import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
	Image ball=Toolkit.getDefaultToolkit().getImage("images/bill.jpg");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/disk.png");
	
	double x=100;//小球的橫座標
	double y=100;//小球的從座標
	double degree=3.14/3;//弧度，此處就是：60度
	
	//畫窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被開了一次");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x,(int)y,null);

//500是窗口高度;40是桌子邊框;30是球直徑;最後一個40是標題欄的高度
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		if(y>500-40-30 || y<40+40) {
			degree=-degree;
		}
	}

	/**
	 * 
	 */
	// 窗口加載
	void launchFrame() {
		setSize(856, 500);
		setLocation(50, 50);
		setVisible(true);
		
		
		//重畫窗口，每秒畫25次
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//40ms,1秒=1000毫秒
		}
	}

	public static void main(String[] args) {
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
