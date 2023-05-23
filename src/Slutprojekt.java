

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;


public class Slutprojekt extends Canvas implements Runnable {
    private BufferStrategy bs;
    private Thread thread;
    private boolean running = false;
    private int frames = 0;
//    Label l;

    private BufferedImage bar;
    private BufferedImage image;
    private BufferedImage reset;

    private BufferedImage color;

    private Color currentColor = new Color(0x000000);

    public Slutprojekt() {
        try {
            bar = ImageIO.read(new File("images/bar.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        image =new BufferedImage(1920,1080,BufferedImage.TYPE_INT_ARGB);
        reset =new BufferedImage(1920,1080,BufferedImage.TYPE_INT_ARGB);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(1920, 1080);

        JFrame frame = new JFrame();
        frame.add(this);
  //      l = new Label();
  //      l.setBounds(600, 40, 100, 20);
  //      frame.add(l);

        //frame.addKeyListener(new MyKeyListener());
        this.addMouseMotionListener(new MyMouseMotionListener());
        this.addMouseListener( new MyMouseListener());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public void render() {
        bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        draw(g);

        g.dispose();
        bs.show();
    }

    public void draw(Graphics g) {

//g.drawRect(30, 30, 30, 30, );
        g.drawImage(image, 0, 0, 1920, 1080, null);
        g.drawImage(bar, 0, 0, bar.getWidth(), bar.getHeight(), null);
       // g.drawImage(reset, 385, 965, 1920, 1080, null);

    }

    private void update() {


    }


    public static void main(String[] args) {
        Slutprojekt Mittslutprojekt = new Slutprojekt();
        Mittslutprojekt.start();

    }


    public synchronized void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        double ns = 1000000000.0 / 144.0;
        double delta = 0;
        long lasTime = System.nanoTime();

        while (running) {
            long now = System.nanoTime();
            //delta +=(now - lastTime) / ns;
            //lastTime = now;

            while (true) {
                // update():
                render();
                // delta--;
            }

        }
    }

    public class MyMouseMotionListener implements MouseMotionListener {
        @Override
        public void mouseDragged(MouseEvent e) {

            System.out.println("X=" + e.getX() + ", Y=" + e.getY());

            if (e.getX() > bar.getWidth()) {
                Graphics g = image.getGraphics();
                g.setColor(currentColor);
                g.fillOval(e.getX(), e.getY(), 10, 10);
            } else {
                Graphics g = getGraphics();
                g.setColor(currentColor);
                g.fillOval(e.getX(), e.getY(), 0, 0);
            }
        }


        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("X=" + e.getX() + ", Y=" + e.getY());

        }


        //stop();
    }public class MyMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            if (0 < e.getX() && e.getX() < 400 && 855 < e.getY() && e.getY() < 990) {

                Graphics g = image.getGraphics();
                g.setColor(Color.white);
                g.fillRect(0,0,1920,1080);

            }

 //första raden
            if (0 < e.getX() && e.getX() < 191 && 0 < e.getY() && e.getY() < 172) {

                currentColor = new Color(0x00b90d);
            }

            if (200 < e.getX() && e.getX() < 386 && 0 < e.getY() && e.getY() < 172) {

                currentColor = new Color(0xfcff00);
            }



//andra raden
            if (0 < e.getX() && e.getX() < 191 && 181 < e.getY() && e.getY() < 364) {

                currentColor = new Color(0x001eff);
            }

            if (200 < e.getX() && e.getX() < 386 && 181 < e.getY() && e.getY() < 364) {

                currentColor = new Color(0xff0000);
            }



//tredje raden
            if (0 < e.getX() && e.getX() < 191 && 371 < e.getY() && e.getY() < 560) {

                currentColor = new Color(0x000000);
            }

            if (200 < e.getX() && e.getX() < 386 && 371 < e.getY() && e.getY() < 560) {

                currentColor = new Color(0xffA500);
            }

            //sudd



        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {

            .list.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
}




