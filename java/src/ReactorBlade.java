/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafy
 */
import javafx.scene.shape.Arc;
import processing.core.PVector;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;

public class ReactorBlade extends GameObject{

    float start;
    float stop;
    float speed;
    float theta;
    float frequency;
    float s,t;
    float end;
    float rMax;
    float rMin;
    float strokeIntensity;
    UI ui;
    int col = 0;
    float alpha = 255.0f;
    float audioLevel = 0.0f;

    public ReactorBlade (UI ui, float x, float y, float radius){
        this.ui = ui;
        pos = new PVector(x, y);
        this.radius = radius;
        start = ui.random(360);
        stop = start + 70 + ui.random(180);
        frequency = 30;
        this.end = 0;
        this.rMax = radius + 50;
        this.rMin = radius;
        this.strokeIntensity = 10;
    }

    public void setAlpha(float alpha) {
        this.alpha = Math.abs(alpha);
    }

    public void setAudioLevel(float level) {
        this.audioLevel = level;
    }

    //Makes the blade increase in size when hovered over
    public void hover(){
        if ( ui.mouseX >= (ui.width / 2 - radius) && ui.mouseX <= (ui.width /2 + radius) && ui.mouseY >= ui.height / 2 -  radius && ui.mouseY <= ui.height / 2 + radius && radius < rMax){
            radius++;

            if(strokeIntensity < 7){
                strokeIntensity++;
            }
        }
        else if (  radius > rMin) {
            radius--;

            if( strokeIntensity > 3){
                strokeIntensity--;
            }
        }
    }

    @Override
    public void update(){
        speed = (float) ((2*Math.PI / 60 ) * frequency);
        s = UI.radians(start + theta);
        t = UI.radians(stop + theta)- end;
        theta += speed;

        if(ui.click){
            end+= 0.045;
        }

        if(frequency<300)
        {
            frequency++;
        }

        if(col < 200)
        {
            col++;
        }
    }

    @Override
    public void render(){
        ui.strokeWeight(strokeIntensity);
        if(frequency > 299 )
        {
            float r = 255 * audioLevel;
            float g = 255 * (1 - audioLevel);
            ui.stroke(r, g, 0, alpha);
            ui.ellipse(pos.x, pos.y, radius * 2, radius * 2);
        }
        ui.stroke(col + 4, col + 55, col + 55);
        ui.noFill();
        ui.arc(pos.x, pos.y, (radius * 2) , (radius * 2), s , t);
    }
}
