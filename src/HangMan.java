
import javax.swing.JOptionPane;

public class HangMan extends javax.swing.JFrame {

    String mystery = "";
    String guess = "";
    WordManager wm = new WordManager();
    
    public HangMan() {
        initComponents();
        textLetter.setEnabled(false);
        buttonGuess.setEnabled(false);
        guessLabel.setEnabled(false);
        livesLabel.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonStart = new javax.swing.JButton();
        textLetter = new javax.swing.JTextField();
        buttonGuess = new javax.swing.JButton();
        hangmanPanel = new HangmanPanel();
        titleLabel = new javax.swing.JLabel();
        guessLabel = new javax.swing.JLabel();
        livesLabel = new javax.swing.JLabel();
        lives = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonStart.setFont(new java.awt.Font("AppleGothic", 0, 13)); // NOI18N
        buttonStart.setText("generate new word");
        buttonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartActionPerformed(evt);
            }
        });

        textLetter.setFont(new java.awt.Font("AppleGothic", 1, 24)); // NOI18N
        textLetter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLetterActionPerformed(evt);
            }
        });

        buttonGuess.setFont(new java.awt.Font("AppleGothic", 0, 13)); // NOI18N
        buttonGuess.setText("check guess");
        buttonGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hangmanPanelLayout = new javax.swing.GroupLayout(hangmanPanel);
        hangmanPanel.setLayout(hangmanPanelLayout);
        hangmanPanelLayout.setHorizontalGroup(
            hangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        hangmanPanelLayout.setVerticalGroup(
            hangmanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        titleLabel.setFont(new java.awt.Font("AppleGothic", 1, 36)); // NOI18N
        titleLabel.setText("HANGMAN :)");

        guessLabel.setFont(new java.awt.Font("AppleGothic", 0, 13)); // NOI18N
        guessLabel.setText("guess a letter:");

        livesLabel.setFont(new java.awt.Font("AppleGothic", 0, 13)); // NOI18N
        livesLabel.setText("lives left");

        lives.setFont(new java.awt.Font("AppleGothic", 1, 13)); // NOI18N
        lives.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lives.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hangmanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(buttonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(guessLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(textLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(buttonGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lives, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(livesLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel))
                    .addComponent(buttonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guessLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(livesLabel)
                        .addComponent(lives)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hangmanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLetterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLetterActionPerformed

    private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartActionPerformed
        mystery = wm.getNextWord();
        hangmanPanel.answer=mystery;
        String temp="";
        for(int k=0;k<mystery.length();k++){
            if(mystery.substring(k,k+1).equals(" ")==true){
                temp=temp+" ";
            }
            else{
                temp=temp+"□";
            }
        }

        hangmanPanel.showword=temp;
        //showString.setText(temp);
        hangmanPanel.guessed="";
        //guessed.setText("");
        hangmanPanel.badCount=0;
        lives.setText(Integer.toString(7-hangmanPanel.badCount));
        hangmanPanel.redraw();
        textLetter.setText("");
        
        textLetter.setEnabled(true);
        buttonGuess.setEnabled(true);
        guessLabel.setEnabled(true);
        livesLabel.setText("lives left");
    }//GEN-LAST:event_buttonStartActionPerformed

    private void buttonGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuessActionPerformed
        String guess = textLetter.getText();
        
        //prevent from entering >1 and <1 letters
        if(guess.length() != 1){
            textLetter.setText("");
            return;
        }
        
        //prevent from entering non-string
        String alpha="abcdefghijklmnopqrstuvwxyz";
        if(alpha.indexOf(guess) == -1){
            textLetter.setText("");
            return;
        }   
        
        //show all guessed letters without repeating
        String guessedltr = hangmanPanel.guessed;
        if (guessedltr.indexOf(guess) == -1) {
            guessedltr=guessedltr+guess;
        } else {
            textLetter.setText("");
        }
        hangmanPanel.guessed=guessedltr;
        //guessed.setText(guessedltr);

        //show guessed word - may be too complicated
        String showword = "";
        for (int k=0; k<mystery.length(); k++) {
            int count = 0;
            for(int i=0;i<guessedltr.length();i++){
                if (mystery.substring(k, k + 1).equals(guessedltr.substring(i,i+1)) == true) {
                    showword=showword+guessedltr.substring(i,i+1);
                    count++;
                } 
            }
            if(mystery.substring(k,k+1).equals(" ")==true){
                showword=showword+" ";
            }
            else if (count<1){
                showword=showword+"□";
            }
        }
        hangmanPanel.showword=showword;
        //showString.setText(showword);
        
        //draw hangman
        if(mystery.indexOf(guess)==-1){
            hangmanPanel.badCount++;
            lives.setText(Integer.toString(7-hangmanPanel.badCount));
            if((7-hangmanPanel.badCount)==1)
                livesLabel.setText("life left");
            if((7-hangmanPanel.badCount)==0)
                livesLabel.setText("now dead");
        }
        
        hangmanPanel.redraw();
        textLetter.setText("");
        
        //show "end game" notification when word=guessed
        if(showword.indexOf("□")==-1){
            hangmanPanel.badCount=-1;
            hangmanPanel.redraw();
            int response = JOptionPane.showConfirmDialog(null,"END OF GAME - play again & generate new word?", "notification",JOptionPane.YES_NO_OPTION);
            if(response==JOptionPane.YES_OPTION){
                mystery = wm.getNextWord();
                hangmanPanel.answer=mystery;
                String temp="";
                for(int k=0;k<mystery.length();k++){
                    if(mystery.substring(k,k+1).equals(" ")==true){
                        temp=temp+" ";
                    }
                    else{
                        temp=temp+"□";
                    }
                }

                hangmanPanel.showword=temp;
                hangmanPanel.guessed="";
                hangmanPanel.badCount=0;
                lives.setText(Integer.toString(7-hangmanPanel.badCount));
                livesLabel.setText("lives left");
                hangmanPanel.redraw();
                textLetter.setText("");
                return;
            }
            else{
                buttonStart.setEnabled(false);
                textLetter.setEnabled(false);
                buttonGuess.setEnabled(false);
                guessLabel.setEnabled(false);
                livesLabel.setText("");
                lives.setText("");
                hangmanPanel.badCount=8;
                hangmanPanel.redraw();
                return;
            }
        }
        
        //show "end game" notification when man=dead
        if(hangmanPanel.badCount>6){
            hangmanPanel.badCount=7;
            hangmanPanel.redraw();
            int response=JOptionPane.showConfirmDialog(null,"END OF GAME - play again & generate new word?", "notification",JOptionPane.YES_NO_OPTION);
            if(response==JOptionPane.YES_OPTION){
                mystery = wm.getNextWord();
                hangmanPanel.answer=mystery;
                String temp="";
                for(int k=0;k<mystery.length();k++){
                    if(mystery.substring(k,k+1).equals(" ")==true){
                        temp=temp+" ";
                    } else {
                        temp=temp+"□";
                    }
                }

                hangmanPanel.showword=temp;
                hangmanPanel.guessed="";
                hangmanPanel.badCount=0;
                lives.setText(Integer.toString(7-hangmanPanel.badCount));
                livesLabel.setText("lives left");
                hangmanPanel.redraw();
                textLetter.setText("");
                return;
            }
            else{
                buttonStart.setEnabled(false);
                textLetter.setEnabled(false);
                buttonGuess.setEnabled(false);
                guessLabel.setEnabled(false);
                livesLabel.setText("");
                lives.setText("");
                hangmanPanel.badCount=8;
                hangmanPanel.redraw();
                return;
            }        
        }
    }//GEN-LAST:event_buttonGuessActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HangMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangMan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGuess;
    private javax.swing.JButton buttonStart;
    private javax.swing.JLabel guessLabel;
    private HangmanPanel hangmanPanel;
    private javax.swing.JLabel lives;
    private javax.swing.JLabel livesLabel;
    private javax.swing.JTextField textLetter;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
