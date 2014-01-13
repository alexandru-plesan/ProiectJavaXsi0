/*
Proiect X si 0
Echipa: Plesan Alexandru
        Puiu Daniel
        Stanica Gabriel
Grupa: 353
 */

package tic.tac.toe;
import java.awt.event.WindowEvent;
import java.util.*;
import javax.swing.*;

public class MainWindow extends javax.swing.JFrame {

    public boolean isX=true;//variabila booleana ce indica daca trebuie sa punem x sau 0 in casuta
    public boolean cpu=false;//variabila booleana ce indica daca se joaca vs cpu sau nu
    public boolean hide=true;//variabila booleana care indica daca ascundem sau afisam continutul
    public int scoreX=0;//contor care tine scorul pt X
    public int scoreO=0;//contor care tine scorul pt O
    String Player1="Player 1", Player2="Player 2";
    int move = 1;
    public String btn1="A", btn2="B", btn3="C", btn4="D", btn5="E", btn6="F", btn7="G", btn8="H", btn9="I", win;
    
    public MainWindow() {
        initComponents();
        show_bg(hide);
        jButtonpvp.setVisible(false);
        jButtonpvc.setVisible(false);
        labelMove.setText(" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        jButtons = new javax.swing.JButton();
        jButtonpvp = new javax.swing.JButton();
        jButtonpvc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelMove = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.setBackground(java.awt.Color.darkGray);
        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 250, 100));
        jDialog1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDialog1.setFont(new java.awt.Font("Adobe Arabic", 1, 18)); // NOI18N
        jDialog1.setType(java.awt.Window.Type.POPUP);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtons.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtons.setLabel("Start");
        jButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jButtonpvp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonpvp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonpvp.setLabel("Player Vs Player");
        jButtonpvp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpvpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonpvp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jButtonpvc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonpvc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonpvc.setLabel("Player Vs Computer");
        jButtonpvc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpvcActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonpvc, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 1)); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setName("bla"); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 100, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 1)); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 100, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 1)); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 100, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 1)); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 206, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 1)); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 206, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 1)); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 206, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 1)); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 312, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 1)); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 312, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 1)); // NOI18N
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 312, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player 1:  Player 2:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 300, 25));

        labelMove.setBackground(new java.awt.Color(255, 255, 255));
        labelMove.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labelMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));
        labelMove.getAccessibleContext().setAccessibleParent(this);

        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setText("EXIT");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setName("exit"); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 20, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic/tac/toe/Images/XsiO2.png"))); // NOI18N
        jLabel1.setText("backgroundImage");
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 450));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void reinitializeaza_btn(){
       btn1="1"; 
       btn2="2"; 
       btn3="3"; 
       btn4="4"; 
       btn5="5"; 
       btn6="6"; 
       btn7="7"; 
       btn8="8"; 
       btn9="9";
    }
    
       private void yes_option(){       
        reinitializeaza_btn();  
        show_bg(true);
        show_bg(hide);
        move=1;
        Player1="Player 1";
        checkMove();
        
    }
    
    private void no_option(){
        //show_bg(hide);
          // jButtons.setEnabled(true);
            //      jButtonpvp.setEnabled(true);
              //    jButtonpvc.setEnabled(true);
                //  checkMove(); 
        show_bg(hide);
        jButtons.setEnabled(true);
        jButtonpvp.setVisible(false);
        jButtonpvc.setVisible(false);
        labelMove.setVisible(false);
    }
    
    private void done() {
                Object[] options = {"Yes", "No"};
                    jOptionPane1.showMessageDialog(rootPane, win);
            int option =   jOptionPane1.showOptionDialog(rootPane, "Do you want to start again?", "Choose an option:", jOptionPane1.YES_NO_OPTION, jOptionPane1.QUESTION_MESSAGE, null, options, options[1]);
            if( option == jOptionPane1.YES_OPTION) {
                    yes_option();
            }
            else {
                no_option();
            }
    }
    public void CheckWin() {
        if(btn1.equals(btn2) && btn1.equals(btn3)) {
            if (!isX) {
             win =  "Player one wins!";
             scoreX++;
             jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            else {
             win = "Player two wins!";
             scoreO++;
             jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            done();
        }
        
        if(btn4.equals(btn5) && btn4.equals(btn6)) {
            if (!isX) {
             win =  "Player one wins!";
             scoreX++;
             jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            else {
             win = "Player two wins!";
             scoreO++;
             jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
           done();
        }
        
        if(btn7.equals(btn8) && btn7.equals(btn9)) {
            if (!isX) {
             win =  "Player one wins!";
             scoreX++;
             jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            else {
             win = "Player two wins!";
             scoreO++;
             jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            done();    
        }
        
        if(btn1.equals(btn4) && btn1.equals(btn7)) {
            if (!isX) {
                win =  "Player one wins!";
                scoreX++;
                jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            else {
                win = "Player two wins!";
                scoreO++;
                jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            done();
        }
        
        if(btn2.equals(btn5) && btn2.equals(btn8)) {
            if (!isX) {
                win =  "Player one wins!"; 
                scoreX++;
                jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            else {
                win = "Player two wins!";
                scoreO++;
                jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            done();
        }
        
        if(btn3.equals(btn6) && btn3.equals(btn9)) {
            if (!isX) {
                win =  "Player one wins!";
                scoreX++;
                jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            else {
                win = "Player two wins!";
                scoreO++;
                jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            done();
        }     

        if(btn1.equals(btn5) && btn1.equals(btn9)) {
            if (!isX) {
                win =  "Player one wins!";
                scoreX++;
                jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            else {
                win = "Player two wins!";
                scoreO++;
                jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            done();
        } 
 
        if(btn3.equals(btn5) && btn3.equals(btn7)) {
            if (!isX) {
                win =  "Player one wins!";
                scoreX++;
                jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            else {
                win = "Player two wins!";
                scoreO++;
                jLabel2.setText("Player one: "+scoreX+"       Player two: "+scoreO);
            }
            done();
        } 
    }
    
    public void show_bg(boolean x) {//acesta functie se ocupa de ascunderea/afisarea continutului
        if(x==true) {//daca variabila booleana de control este true atunci ascundem
            jButton1.setEnabled(false); jButton1.setVisible(false);
            jButton2.setEnabled(false); jButton2.setVisible(false);
            jButton3.setEnabled(false); jButton3.setVisible(false);
            jButton4.setEnabled(false); jButton4.setVisible(false);
            jButton5.setEnabled(false); jButton5.setVisible(false);
            jButton6.setEnabled(false); jButton6.setVisible(false);
            jButton7.setEnabled(false); jButton7.setVisible(false);
            jButton8.setEnabled(false); jButton8.setVisible(false);
            jButton9.setEnabled(false); jButton9.setVisible(false);
            hide=false;
            jLabel2.setVisible(false);
        }
        else {//altfel, afisam
            jButton1.setEnabled(true); jButton1.setVisible(true);
            jButton2.setEnabled(true); jButton2.setVisible(true);
            jButton3.setEnabled(true); jButton3.setVisible(true);
            jButton4.setEnabled(true); jButton4.setVisible(true);
            jButton5.setEnabled(true); jButton5.setVisible(true);
            jButton6.setEnabled(true); jButton6.setVisible(true);
            jButton7.setEnabled(true); jButton7.setVisible(true);
            jButton8.setEnabled(true); jButton8.setVisible(true);
            jButton9.setEnabled(true); jButton9.setVisible(true);
            hide=true;
            jLabel2.setVisible(true);
        }
    }
    
    public String randomButton() {//generam un buton random si returnam numele sau
        String a=jButton1.getName(), b=jButton2.getName(), c=jButton3.getName(), d=jButton4.getName(), e=jButton5.getName(), f=jButton6.getName(), g=jButton7.getName(), h=jButton8.getName(), i=jButton9.getName();
        String buttons[]={ a, b, c, d, e, f, g, h, i};
        String randbtn=(buttons[new Random().nextInt(buttons.length)]);
        return randbtn;
    }
    
    public void vscpu (JButton button) {//verificam daca butonul este populat sau nu
        String alpha=randomButton(), name=button.getName();
        if(isX && (move%2!=0)&& name.equals(alpha)) {            
            button.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/X2.png"));
        }
        else if(! isX && (move%2==0)&& name.equals(alpha)) {
            button.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/O2.png"));
        }
    }
    
    public void checkMove() {//verificam ce player este la rand
        String whoMove;
	if(isX) {
            whoMove = Player1 + " [X]";
	}
        else {
            whoMove = Player2 + " [O]";
	}
	labelMove.setText("Move: " + whoMove);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(isX) {
            jButton1.setText("X");
            jButton1.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/X2.png"));
            isX=false;
        }
        else {
            jButton1.setText("O");
            jButton1.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/O2.png"));
            isX=true;
        }
        jButton1.setEnabled(false);
        btn1 = jButton1.getText();
        CheckWin();
        checkMove();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(isX) {
            jButton2.setText("X");
            jButton2.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/X2.png"));
            isX=false;
        }
        else {
            jButton2.setText("O");
            jButton2.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/O2.png"));
            isX=true;
        }
        jButton2.setEnabled(false);
        btn2 = jButton2.getText();
        CheckWin();
        checkMove();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(isX) {
            jButton3.setText("X");
            jButton3.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/X2.png"));
            isX=false;
        }
        else {
            jButton3.setText("O");
            jButton3.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/O2.png"));
            isX=true;
        }
        jButton3.setEnabled(false);
        btn3 = jButton3.getText();
        CheckWin();
        checkMove();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(isX) {
            jButton4.setText("X");
            jButton4.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/X2.png"));
            isX=false;
        }
        else {
            jButton4.setText("O");
            jButton4.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/O2.png"));
            isX=true;
        }
        jButton4.setEnabled(false);
        btn4 = jButton4.getText();
        CheckWin();
        checkMove();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(isX) {
            jButton5.setText("X");
            jButton5.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/X2.png"));
            isX=false;
        }
        else {
            jButton5.setText("O");
            jButton5.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/O2.png"));
            isX=true;
        }
        jButton5.setEnabled(false);
        btn5 = jButton5.getText();
        CheckWin();
        checkMove();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(isX) {
            jButton6.setText("X");
            jButton6.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/X2.png"));
            isX=false;
        }
        else {
            jButton6.setText("O");
            jButton6.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/O2.png"));
            isX=true;
        }
        jButton6.setEnabled(false);
        btn6 = jButton6.getText();
        CheckWin();
        checkMove();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(isX) {
            jButton7.setText("X");
            jButton7.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/X2.png"));
            isX=false;
        }
        else {
            jButton7.setText("O");
            jButton7.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/O2.png"));
            isX=true;
        }
        jButton7.setEnabled(false);
        btn7 = jButton7.getText();
        CheckWin();
        checkMove();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(isX) {
            jButton8.setText("X");
            jButton8.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/X2.png"));
            isX=false;
        }
        else {
            jButton8.setText("O");
            jButton8.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/O2.png"));
            isX=true;
        }
        jButton8.setEnabled(false);
        btn8 = jButton8.getText();
        CheckWin();
        checkMove();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(isX) {
            jButton9.setText("X");
            jButton9.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/X2.png"));
            isX=false;
        }
        else {
            jButton9.setText("O");
            jButton9.setDisabledIcon(new ImageIcon("src/tic/tac/toe/Images/O2.png"));
            isX=true;
        }
        jButton9.setEnabled(false);
        btn9 = jButton9.getText();
        CheckWin();
        checkMove();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsActionPerformed
        jButtons.setEnabled(false);
        jButtonpvp.setVisible(true);
        jButtonpvc.setVisible(true);
        jButtonpvp.setEnabled(true);
        jButtonpvc.setEnabled(true);
    }//GEN-LAST:event_jButtonsActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void jButtonpvpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpvpActionPerformed
        reinitializeaza_btn();  
        show_bg(hide);
        jButtons.setEnabled(false);
        jButtonpvp.setEnabled(false);
        jButtonpvc.setEnabled(false);
        cpu=false;
        move=1;
        Player1="Player 1";
        checkMove();
    }//GEN-LAST:event_jButtonpvpActionPerformed

    private void jButtonpvcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpvcActionPerformed
        show_bg(hide);
        jButtons.setEnabled(false);
        jButtonpvp.setEnabled(false);
        jButtonpvc.setEnabled(false);
        cpu=true;
        move=1;
        Player1="CPU";
        checkMove();
    }//GEN-LAST:event_jButtonpvcActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        WindowEvent windowClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
	       this.dispatchEvent(windowClosing);
    }//GEN-LAST:event_exitActionPerformed
  
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonpvc;
    private javax.swing.JButton jButtonpvp;
    private javax.swing.JButton jButtons;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMove;
    // End of variables declaration//GEN-END:variables
}