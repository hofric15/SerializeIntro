/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terminkalender;

import java.io.File;

/**
 *
 * @author Richard Hofmeister
 */
public class LoadTester {
    public static void main(String[] args) {
            
    SchuelerBL bl = new SchuelerBL();
    try{
        bl.load(new File("./klasse.csv"));
        bl.print();
    }catch (Exception e)
    {
        e.printStackTrace();
    }
    }
}
