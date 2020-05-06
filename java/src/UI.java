  /*
   * To change this license header, choose License Headers in Project Properties.
   * To change this template file, choose Tools | Templates
   * and open the template in the editor.
   */

  /**
   *
   * @author nafy
   */

  import java.util.ArrayList;

  import org.omg.CORBA.TIMEOUT;
  import processing.core.PApplet;
  import processing.core.PVector;

  public class UI extends PApplet
  {

      public boolean click = false;
      PVector colour = new PVector(0, 0, 0);

      public static void main(String[] args) {
          UI ui = new UI();
          ui.redraw();
      }


      @Override
      public void settings()
      {
          size(600, 400);
      }

      @Override
      public void setup() {


      }


      public void draw()
      {
          background(colour.x, colour.y, colour.z);
      }

      public void mouseClicked()
      {
          click = true;
      }

  }
