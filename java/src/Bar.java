/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafy
 */

public class Bar  {


    float x;
    float y;
    float barW;
    float barH;
    float random;
    float time;
    float bMax;
    float bMin;
    UI ui;

    private int change = 0;

    public Bar (UI ui, float x , float y , float barW) {
        this.ui = ui;

        this.x = x;
        this.y = y;
        this.barW = barW;
        this.barH = -ui.random(30, 70);
        this.time = 60;
        this.bMax = barH - 50;
        this.bMin = 0;
        this.change = 1;
    }


    public void render() {
        ui.rect(x , y , barW  ,barH);
        barH += change;
    }



    public void update(){
        if(barH > bMin || barH < bMax )
        {
            change*=-1;
        }
    }
}
