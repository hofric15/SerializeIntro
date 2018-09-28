/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terminkalender;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        OutputStream fos = null;
        
        fos = new FileOutputStream(f);
        ObjectOutputStream o = new ObjectOutputStream(fos);
        for (Schueler s : li) {
            o.writeObject(s);
        }
        
        o.flush();
        o.close();
    }
    
    public void load(File f) throws Exception
    {
        InputStream fis = null;
        
        fis = new FileInputStream(f);
        ObjectInputStream o = new ObjectInputStream(fis);
        
    }
    
    public void print()
    {     
        for (Schueler s : li) {
            System.out.println(s.getName()+","+s.getBirthday().toString());
        }
    }
}