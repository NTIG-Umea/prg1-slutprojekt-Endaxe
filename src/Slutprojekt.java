

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
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

    private BufferedImage bar;


    public Slutprojekt() {
        try {
            bar = ImageIO.read(new File("images/bar.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }




        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(1920,1080);

        JFrame frame = new JFrame();
        frame.add(this);
        //frame.addKeyListener(new MyKeyListener());
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
        g.drawImage(bar, 0, 0, bar.getWidth(), bar.getHeight(), null);
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
        double ns = 1000000000.0 / 60.0;
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
        //stop();
    }
}

