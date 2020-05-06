/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafy
 */
import processing.core.PApplet;

public class Main
{

    public void startUI()
    {
        String[] a = {"MAIN"};
        UI ui = new UI();
        processing.core.PApplet.runSketch(a, ui);

    }
    public static void main(String[] args)
    {
        Main main = new Main();
        main.startUI();
    }
}