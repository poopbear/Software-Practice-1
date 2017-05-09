package piano;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;


import java.io.File;
import java.awt.Color;

public class Piano {

  private JFrame frame;

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Piano window = new Piano();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  public Piano() {
    initialize();
  }

  @SuppressWarnings("serial")
  private void initialize() {
    /* Title and Window Set */
    frame = new JFrame();
    frame.setBounds(100, 100, 653, 372);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(false);
    frame.setTitle("DangKong Piano");

    AbstractAction A0Pressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/37.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction B0FlatPressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/38.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction B0Pressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/39.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction C1Pressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/40.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction C1SharpPressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/41.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction D1Pressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/42.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };

    AbstractAction E1FlatPressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/43.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction E1Pressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/44.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction F1Pressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/45.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction F1SharpPressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/46.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction G1Pressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/47.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction A1FlatPressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/48.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction A1Pressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/49.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction B1FlatPressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/50.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction B1Pressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/51.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    
    AbstractAction C2Pressed = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./resource/pianoSound/52.wav"));
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    };
    /* Keyboard Set */
    JButton keyBoardA0 = new JButton("A");
    keyBoardA0.setForeground(Color.BLACK);
    keyBoardA0.setBackground(Color.WHITE);
    keyBoardA0.setBounds(25, 101, 60, 200);
    keyBoardA0.addActionListener(A0Pressed);
    keyBoardA0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0), "A0");
    keyBoardA0.getActionMap().put("A0", A0Pressed);
    frame.getContentPane().setLayout(null);
    keyBoardA0.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardA0.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardA0);

    JButton keyBoardB0Flat = new JButton("Bb");
    keyBoardB0Flat.setBackground(Color.BLACK);
    keyBoardB0Flat.setForeground(Color.WHITE);
    keyBoardB0Flat.setBounds(52, 12, 60, 90);
    keyBoardB0Flat.addActionListener(B0FlatPressed);
    keyBoardB0Flat.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0), "B0Flat");
    keyBoardB0Flat.getActionMap().put("B0Flat", B0FlatPressed);
    keyBoardB0Flat.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardB0Flat.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardB0Flat);

    JButton keyBoardB0 = new JButton("B");
    keyBoardB0.setBackground(Color.WHITE);
    keyBoardB0.setBounds(83, 101, 60, 200);
    keyBoardB0.addActionListener(B0Pressed);
    keyBoardB0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0), "B0");
    keyBoardB0.getActionMap().put("B0", B0Pressed);
    keyBoardB0.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardB0.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardB0);

    JButton keyBoardC1 = new JButton("C");
    keyBoardC1.setBackground(Color.WHITE);
    keyBoardC1.setBounds(141, 101, 60, 200);
    keyBoardC1.addActionListener(C1Pressed);
    keyBoardC1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_E, 0), "C1");
    keyBoardC1.getActionMap().put("C1", C1Pressed);
    keyBoardC1.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardC1.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardC1);

    JButton keyBoardC1Sharp = new JButton("C#");
    keyBoardC1Sharp.setBackground(Color.BLACK);
    keyBoardC1Sharp.setForeground(Color.WHITE);
    keyBoardC1Sharp.setBounds(169, 12, 60, 90);
    keyBoardC1Sharp.addActionListener(C1SharpPressed);
    keyBoardC1Sharp.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0), "C1Sharp");
    keyBoardC1Sharp.getActionMap().put("C1Sharp", C1SharpPressed);
    keyBoardC1Sharp.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardC1Sharp.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardC1Sharp);

    JButton keyBoardD1 = new JButton("D");
    keyBoardD1.setBackground(Color.WHITE);
    keyBoardD1.setBounds(199, 101, 60, 200);
    keyBoardD1.addActionListener(D1Pressed);
    keyBoardD1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0), "D1");
    keyBoardD1.getActionMap().put("D1", D1Pressed);
    keyBoardD1.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardD1.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardD1);

    JButton keyBoardE1Flat = new JButton("Eb");
    keyBoardE1Flat.setBackground(Color.BLACK);
    keyBoardE1Flat.setForeground(Color.WHITE);
    keyBoardE1Flat.setBounds(226, 12, 60, 90);
    keyBoardE1Flat.addActionListener(E1FlatPressed);
    keyBoardE1Flat.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0), "E1Flat");
    keyBoardE1Flat.getActionMap().put("E1Flat", E1FlatPressed);
    keyBoardE1Flat.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardE1Flat.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardE1Flat);

    JButton keyBoardE1 = new JButton("E");
    keyBoardE1.setBackground(Color.WHITE);
    keyBoardE1.setBounds(257, 101, 60, 200);
    keyBoardE1.addActionListener(E1Pressed);
    keyBoardE1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_T, 0), "E1");
    keyBoardE1.getActionMap().put("E1", E1Pressed);
    keyBoardE1.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardE1.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardE1);

    JButton keyBoardF1 = new JButton("F");
    keyBoardF1.setBackground(Color.WHITE);
    keyBoardF1.setBounds(315, 101, 60, 200);
    keyBoardF1.addActionListener(F1Pressed);
    keyBoardF1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_Y, 0), "F1");
    keyBoardF1.getActionMap().put("F1", F1Pressed);
    keyBoardF1.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardF1.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardF1);

    JButton keyBoardF1Sharp = new JButton("F#");
    keyBoardF1Sharp.setBackground(Color.BLACK);
    keyBoardF1Sharp.setForeground(Color.WHITE);
    keyBoardF1Sharp.setBounds(341, 12, 60, 90);
    keyBoardF1Sharp.addActionListener(F1SharpPressed);
    keyBoardF1Sharp.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_7, 0), "F1Sharp");
    keyBoardF1Sharp.getActionMap().put("F1Sharp", F1SharpPressed);
    keyBoardF1Sharp.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardF1Sharp.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardF1Sharp);

    JButton keyBoardG1 = new JButton("G");
    keyBoardG1.setBackground(Color.WHITE);
    keyBoardG1.setBounds(373, 101, 60, 200);
    keyBoardG1.addActionListener(G1Pressed);
    keyBoardG1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_U, 0), "G1");
    keyBoardG1.getActionMap().put("G1", G1Pressed);
    keyBoardG1.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardG1.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardG1);

    JButton keyBoardA1Flat = new JButton("Ab");
    keyBoardA1Flat.setBackground(Color.BLACK);
    keyBoardA1Flat.setForeground(Color.WHITE);
    keyBoardA1Flat.setBounds(399, 12, 60, 90);
    keyBoardA1Flat.addActionListener(A1FlatPressed);
    keyBoardA1Flat.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_8, 0), "A1Flat");
    keyBoardA1Flat.getActionMap().put("A1Flat", A1FlatPressed);
    keyBoardA1Flat.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardA1Flat.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardA1Flat);

    JButton keyBoardA1 = new JButton("A");
    keyBoardA1.setBackground(Color.WHITE);
    keyBoardA1.setBounds(430, 101, 60, 200);
    keyBoardA1.addActionListener(A1Pressed);
    keyBoardA1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_I, 0), "A1");
    keyBoardA1.getActionMap().put("A1", A1Pressed);
    keyBoardA1.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardA1.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardA1);

    JButton keyBoardB1Flat = new JButton("Bb");
    keyBoardB1Flat.setBackground(Color.BLACK);
    keyBoardB1Flat.setForeground(Color.WHITE);
    keyBoardB1Flat.setBounds(457, 12, 60, 90);
    keyBoardB1Flat.addActionListener(B1FlatPressed);
    keyBoardB1Flat.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_9, 0), "B1Flat");
    keyBoardB1Flat.getActionMap().put("B1Flat", B1FlatPressed);
    keyBoardB1Flat.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardB1Flat.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardB1Flat);

    JButton keyBoardB1 = new JButton("B");
    keyBoardB1.setBackground(Color.WHITE);
    keyBoardB1.setBounds(488, 101, 60, 200);
    keyBoardB1.addActionListener(B1Pressed);
    keyBoardB1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_O, 0), "B1");
    keyBoardB1.getActionMap().put("B1", B1Pressed);
    keyBoardB1.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardB1.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardB1);

    JButton keyBoardC2 = new JButton("C");
    keyBoardC2.setBackground(Color.WHITE);
    keyBoardC2.setBounds(546, 101, 60, 200);
    keyBoardC2.addActionListener(C2Pressed);
    keyBoardC2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_P, 0), "C2");
    keyBoardC2.getActionMap().put("C2", C2Pressed);
    keyBoardC2.setVerticalAlignment(SwingConstants.BOTTOM);
    keyBoardC2.setFont(new Font("Consolas", Font.BOLD, 20));
    frame.getContentPane().add(keyBoardC2);
  }
}