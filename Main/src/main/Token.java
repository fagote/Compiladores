
package main;

public class Token {
    
    public String lexema;
    public TipoToken padrao;
    public int linha;
    
    public Token(String lex, TipoToken padrao, int l){
        this.lexema = lex;
        this.padrao = padrao;
        this.linha = l;
    }
    
    
    public String toString(){
        return "<"+this.lexema+", "+this.padrao+", "+this.linha+">";
    }
    
}
