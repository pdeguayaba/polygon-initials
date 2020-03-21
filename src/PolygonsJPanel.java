import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

/*
 * Nombre  : Edwin J Estrella Ayala
 * ID      : A00549508
 * Curso   : COMP3600
 * Asig Poligonos
 */

public class PolygonsJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        /*
         * Fundamental
         */
        LetraE e = new LetraE(300, 350);
        g.setColor(Color.black);
        g.fillPolygon(e.get_p());
        
        LetraJ j = new LetraJ(400, 350);
        g.setColor(Color.red);
        g.fillPolygon(j.get_p());
        
        LetraA a = new LetraA(500, 350);
        g.setColor(Color.green);
        g.fillPolygon(a.get_p());
        
        HuecoDeLaA hueco = new HuecoDeLaA(500, 350);
        g.setColor(Color.white);
        g.fillPolygon(hueco.get_p());
        
        /*
         * Iniciales Adicionales
         */
        
        LetraE e2 = new LetraE(300, 250);
        g.setColor(Color.pink);
        g.fillPolygon(e2.get_p());
        
        LetraJ j2 = new LetraJ(490, 210);
        g.setColor(Color.yellow);
        g.fillPolygon(j2.get_p());
        
        LetraA a2 = new LetraA(570, 400);
        g.setColor(Color.magenta);
        g.fillPolygon(a2.get_p());
        
        HuecoDeLaA hueco2 = new HuecoDeLaA(570, 400);
        g.setColor(Color.white);
        g.fillPolygon(hueco2.get_p());
        
        LetraE e3 = new LetraE(370, 550);
        g.setColor(Color.lightGray);
        g.fillPolygon(e3.get_p());
        
        LetraJ j3 = new LetraJ(430, 450);
        g.setColor(Color.cyan);
        g.fillPolygon(j3.get_p());
        
        LetraA a3 = new LetraA(300, 450);
        g.setColor(Color.orange);
        g.fillPolygon(a3.get_p());
        
        HuecoDeLaA hueco3 = new HuecoDeLaA(300, 450);
        g.setColor(Color.white);
        g.fillPolygon(hueco3.get_p());
    }
}
