/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafy
 */
public class Time {

    float x;
    float y;
    int s;
    int m;
    int h;
    String text;
    UI ui;

    Time(UI ui, float x, float y){
        this.ui=ui;
        this.x = x;
        this.y = y;
    }

    public void render(){

        s = UI.second();
        m = UI.minute();
        h = UI.hour();

        text = "Time:" + h + ":" + m + ":" + s ;

        ui.fill(255);
        ui.textSize(30);
        ui.textAlign(UI.CENTER);
        ui.text(text, x , y);
    }
}
