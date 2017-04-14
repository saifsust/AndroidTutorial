/**
 * 
 */
package Tutorial;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Saif_sust_2013331007
 *
 */
public class drawImage extends JPanel {

	/**
	 * @param args
	 */

	public void paint(Graphics g) {
		Image img = createImageWithText();
		g.drawImage(img, 20, 20, this);
	}

	private Image createImageWithText() {
		BufferedImage bufferedImage = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
		Graphics g = bufferedImage.getGraphics();
		g.setColor(Color.BLUE);
		g.setFont(new Font("Arial", 30, 20));
		g.drawString("SAIFUL ISLAM", 10, 70);
		g.drawString("SAIFUL ISLAM", 20, 40);
		return bufferedImage;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new drawImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

}
