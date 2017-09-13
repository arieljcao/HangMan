import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class HangmanPanel extends javax.swing.JPanel {

    public int badCount=0;
    public String showword="";
    public String guessed="";
    public String showwordLabel="YOUR WORD HERE: ";
    public String guessedLabel="GUESSED LETTERS: ";
    public String thankLabel="THANK YOU FOR PLAYING!";
    public String answer="";
    
    public HangmanPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void redraw() {
        System.out.println("calling repaint");
        repaint();  //repaint will eventually call paintComponent
    }

    public void paintComponent(Graphics g) {
    //paintComponent repaints on resize
    Graphics2D g2 =(Graphics2D)g;
    System.out.println("repainting");
    g2.setColor(Color.WHITE);
    g2.fillRect(0,0, 700,500);
    g2.setColor(Color.BLACK);
    Font myFont = new Font("Futura",Font.PLAIN, 30);
    g2.setFont(myFont);
    g2.drawString(showword, 350, 230);
    g2.drawString(guessed, 70, 440);
    if (badCount>=-1) {
        Font labelFont = new Font("Times",Font.PLAIN,20);
        g2.setFont(labelFont);
        g2.drawString(showwordLabel, 350,190);
        g2.drawString(guessedLabel,70,400);
        g2.setStroke(new BasicStroke(5F));
        g2.drawLine(120, 80, 220, 80);//top hor
        g2.drawLine(120, 80, 120, 330);//left vert
        g2.drawLine(90, 330, 150, 330);//bottom hor
        g2.drawLine(220, 80, 220, 110);//right vert
    }
    
    /*
    switch (badCount) {
        case 1:
            g2.setColor(Color.GRAY);
            g2.drawOval(180, 110, 80, 80);//head
            break;
        case 2:
            g2.drawLine(220, 190, 220, 270);//body
            break;
        case 3:
            g2.drawLine(170, 190, 220, 230);//left arm
            break;
        default:
    }
            */
    
    if(badCount>=1){
        g2.setColor(Color.GRAY);
        g2.drawOval(180, 110, 80, 80);//head
        if(badCount>=2){
            g2.drawLine(220, 190, 220, 270);//body
            if(badCount>=3){
                g2.drawLine(170, 190, 220, 230);//left arm
                if(badCount>=4){
                    g2.drawLine(220, 230, 270, 190);//right arm
                    if(badCount>=5){
                        g2.drawLine(170, 320, 220, 270);//left leg
                        if(badCount>=6){
                            g2.drawLine(220, 270, 270, 320);//right leg
                            if(badCount>=7){
                                //left eye
                                g2.drawLine(200, 135, 210, 145);
                                g2.drawLine(200, 145, 210, 135);
                                //right eye
                                g2.drawLine(230, 135, 240, 145);
                                g2.drawLine(230, 145, 240, 135);
                                //mouth
                                g2.drawLine(210, 165, 230, 165);
                                //wrong answer
                                g2.setColor(Color.red);
                                g2.drawLine(320, 230, 340, 210);
                                g2.drawLine(320, 210, 340, 230);
                                g2.setFont(myFont);
                                g2.drawString(answer, 350, 270);
                                if(badCount>=8){
                                    //clear space and print kthnxbai
                                    g2.clearRect(0, 0, 662, 500);
                                    g2.setColor(Color.BLACK);
                                    Font thankFont = 
                                            new Font("Futura",Font.PLAIN, 45);
                                    g2.setFont(thankFont);
                                    g2.drawString(thankLabel, 30, 250);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    if(badCount==-1){
        g2.setColor(Color.GREEN);
        g2.drawLine(330, 230, 340, 210);
        g2.drawLine(320, 220, 330, 230);
        g2.setColor(Color.GRAY);
    }
    
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
