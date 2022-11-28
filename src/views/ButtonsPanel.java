package views;

import javax.swing.JButton;

public class ButtonsPanel extends InputPanel{
    JButton calcButton;
    JButton aboutButton;

    public ButtonsPanel() {
        this.calcButton = new JButton("Számít");
        this.aboutButton = new JButton("Névjegy");
        this.addComponent();
    }

    public void addComponents() {
        this.add(this.calcButton);
        this.add(this.aboutButton);
    }
}
