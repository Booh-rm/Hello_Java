package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import org.jfree.chart.plot.PiePlot3D;

class Rotator extends Timer implements ActionListener {
  private final PiePlot3D plot;
  
  private int angle = 270;
  
  Rotator(PiePlot3D plot) {
    super(100, null);
    this.plot = plot;
    addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent event) {
    this.plot.setStartAngle(this.angle);
    this.angle++;
    if (this.angle == 360)
      this.angle = 0; 
  }
}