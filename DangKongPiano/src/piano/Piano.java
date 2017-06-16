package piano;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * class for instantiating piano
 * @author samsung
 *
 */
public class Piano extends JPanel {

  private Keyboard keyboard;   /* keyboard for piano */
  private Pedal pedal;         /* pedal for piano */

  /* constructor for piano class */
  public Piano() throws IOException {
    this.setKeyboard();
    this.setPedal();
    this.setPanel();
  }

  /* initialize keyboard */
  public void setKeyboard() throws IOException {
    this.keyboard = new Keyboard();
    for (int i = 0; i < keyboard.getMelodies().length; i++)
      add(keyboard.getButtons()[i]);
  }

  /* getter for keyboard */
  public Keyboard getKeyboard() {
    return this.keyboard;
  }

  /* create pedal, and set to screen */
  public void setPedal() {
    this.pedal = new Pedal();
    add(pedal.getButton());
  }

  /* getter for pedal */
  public Pedal getPedal() {
    return this.pedal;
  }

  /* set label for "pedal mode" */
  public void setPanel() {
    JLabel pedalMode = new JLabel("Pedal Mode");
    pedalMode.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 20));
    pedalMode.setBounds(972, 78, 110, 18);
    add(pedalMode);
  }

}