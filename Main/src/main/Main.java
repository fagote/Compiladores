
package main;


public class Main {

    public static void main(String[] args) {
        LeitorArq leitor = new LeitorArq("/home/alunos/a2152304/NetBeansProjects/Main/src/main/entrada.txt");
        int c;
        while((c = leitor.lerProxCaracter()) != -1){
            System.out.print((char)c);
        }
    }
    
}
