package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Juego {
    private int intento, numAdivinar,partida=0, resta;
    public Juego(){}
    
    public void maquina(){
        numAdivinar=(int)(Math.random()*50)+1;
    }
    public void jugador(){
        int numIntro,intentos2;
        intento=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca cantidad de intentos."));
        for(intentos2=1;intentos2<=intento;intentos2++){
        numIntro=Integer.parseInt(JOptionPane.showInputDialog(null,"Jugador.\nIntroduzca un nuemero."));
        while(numIntro<1||numIntro>50){
        numIntro=Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador.\nIntroduzca una cifra entre 1 y 50."));
        }
        resta=Math.abs(numAdivinar-numIntro);
        if (resta>20){
              JOptionPane.showMessageDialog(null,"Muy lejos.");
        }
        else if(resta>=10&&resta<=20){
              JOptionPane.showMessageDialog(null,"Lejos.");
        }
        else if(resta<10&&resta>5){
              JOptionPane.showMessageDialog(null,"Cerca.");
        }
        else if(resta<=5&&resta>=1){
              JOptionPane.showMessageDialog(null,"Muy cerca.");
        }
        else{ JOptionPane.showMessageDialog(null,"Acertaste!.");
              break;
        }
        
        if(intentos2>=intento){
              JOptionPane.showMessageDialog(null, "Perdiste...");
        }
    }
    }
        public void partida(){
        while(partida<=0){
            maquina();
            jugador();
    partida=JOptionPane.showOptionDialog(null,"Empezar otra partida?","partida",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null);
        }
    }
}
