/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafy
 */
public class StarMatrix{
    float x;
    float y;
    float interval;
    float amountW;
    float amountH;
    int i;
    int j;
    UI ui;

    public StarMatrix (UI ui, float x, float y ){
        this.ui=ui;
        this.x = x;
        this.y = y;
        this.interval = ui.width / 32;
        this.amountW = 15;
        this.amountH =  8;

    }

    public void render(){
        ui.stroke(255, 255, 255, 255);
        for(i = 0 ; i <= amountW; i++){
            ui.line(x + (interval * i) , y , x + (interval * i), y +(amountH * interval));
            for( j = 0; j <= amountH; j++){
                ui.line(x , y + (interval * j) , ui.width / 2 - ui.width / 32, y + (interval * j));
            }
        }



    }

    public void update(){



    }


    public void loadTable(){

        //Table table = loadTable("planetData.csv");



    }











}
