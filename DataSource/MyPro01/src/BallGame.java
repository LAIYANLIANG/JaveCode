import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	Image ball=Toolkit.getDefaultToolkit().getImage("images/bill.jpg");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/disk.png");
	
	double x=100;//小球的橫座標
	double y=100;//小球的從座標
	boolean right=true;//方向
	
	//畫窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被開了一次");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x,(int)y,null);
//		x=x+1;
		if(right) {
			x=x+10;
		}else {
			x=x-10;
		}
		//856是窗品寬度，340是桌子邊框寬度，30是小球直徑
		if(x>856-340-30) {
			right=false;
			//40是桌子邊框寬度
		}if(x<40)
			right=true;
	}
	
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
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
