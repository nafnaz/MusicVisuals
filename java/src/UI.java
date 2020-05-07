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
      ArrayList<GameObject> objects = new ArrayList<>();
      ArrayList<ReactorBlade> reactors = new ArrayList<>();
      public boolean click = false;
      PVector colour = new PVector(0, 0, 0);

      public static void main(String[] args) {
          UI ui = new UI();
          ui.changeColors();
          ui.redraw();
      }

      public void changeColors() {
          delay(1000);
          for(ReactorBlade g: reactors)
          {
              g.radius = g.radius + 100;
          }
      }

      @Override
      public void settings()
      {
          size(600, 400);
          // Use fullscreen instead of size to make your interface fullscreen
          //fullScreen(P3D);
      }

      @Override
      public void setup() {
          showReactorBlades();
      }


      public void draw()
      {
          background(colour.x, colour.y, colour.z);
          for(GameObject g: objects)
          {
              g.update();
              g.render();
          }
      }

      public void mouseClicked()
      {
          click = true;
      }

      public void showReactorBlades()
      {
          int[] radii = {60, 70, 80, 90};
          for (int i = 0; i < 4 ; i++) {
              ReactorBlade arc = new ReactorBlade (this, width/2.0f, height/2.0f, radii[i]);
              objects.add(arc);
              reactors.add(arc);
          }
      }

  }
