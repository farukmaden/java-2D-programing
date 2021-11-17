import javax.swing.*;
import java.awt.*;

public class Main {


    static class Surface extends JPanel {

        private void doDrawing(Graphics g) {

            Graphics2D g2d = (Graphics2D) g;

            g2d.drawLine(0,350,900,350);
            g2d.drawLine(450,0,450,900);
            double pi = 3.14;
            int hight = 50;
            g2d.setColor(Color.red);

            for(double x=-450;x<=450;x=x+0.1)
            {
                double y = hight * Math.sin(x*(pi/180));
                int Y = (int)y;
                int X = (int)x;
                g2d.drawLine(450+X,350-Y,450+X,350-Y);
            }

            g2d.setColor(Color.blue);
            for (double x =-450;x<=450;x=x+0.1){
                double y = hight * Math.cos(x*(pi/180));
                int Y =(int)y;
                int X = (int)x;
                g2d.drawLine(450+X,350-Y,450+X,350-Y);
            }

            g2d.setColor(Color.green);
            for (double x = -450;x<=450;x=x+0.1){
                double y = hight * Math.tan(x*(pi/180));
                int Y=(int)y;
                int X= (int)x;
                g2d.drawLine(450+X,350-Y,450+X,350-Y);
            }

            g2d.setColor(Color.magenta);
            for (double x = -450;x<=450;x=x+0.1){
                double y = hight * (1/Math.tan(x*(pi/180)));
                int Y =(int)y;
                int X =(int)x;
                g2d.drawLine(450+X,350-Y,450+X,350-Y);
            }






        }

        @Override
        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            doDrawing(g);
        }
    }

    public static class LinesEx extends JFrame {

        public LinesEx() {

            initUI();
        }

        private void initUI() {

            add(new Surface());

            setTitle("Lines");
            setSize(1000, 800);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public static void main(String[] args) {

            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {

                    LinesEx ex = new LinesEx();
                    ex.setVisible(true);
                }
            });
        }
    }

}
