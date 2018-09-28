/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terminkalender;

import java.io.File;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Richard Hofmeister
 */
public class SafeTester {
    public static void main(String[] args) {
        Schueler s = new Schueler("Richard Hofmeister", LocalDate.of(2001, 5, 27));
        Schueler s2 = new Schueler("Alex Herbst", LocalDate.of(2004, 5, 27));
        
        SchuelerBL bl = new SchuelerBL();
        
        bl.add(s);
        bl.add(s2);
        
        try {
            bl.save(new File("./klasse.bin"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
