
package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeitorArq {
    
    public InputStream is;
    
    public LeitorArq(String arq){
        try {
            this.is = new FileInputStream(arq);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeitorArq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int lerProxCaracter(){
        int c = -1;
        
        try {
            c = (char)is.read();
        } catch (IOException ex) {
            Logger.getLogger(LeitorArq.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }
    
}
