/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terminkalender;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Richard Hofmeister
 */
public class SchuelerBL {
    private ArrayList<Schueler> li = new ArrayList<>();
    
    public void add(Schueler s)
    {
        li.add(s);
    }
    
    public void save(File f) throws Exception
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        for (Schueler s : li) {
            bw.write(s.getName());
            bw.write(";");
            bw.write(s.getBirthday().toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    
    public void load(File f) throws Exception
    {
        
    }
}