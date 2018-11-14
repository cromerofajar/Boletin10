package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Juego {
    private int numIntro, intentos, numAdivinar,partida=0;
    public Juego(){}
    
    public void jugador1(){
    int intento1;
    int numAdivinar1=Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador uno.\n introduzca una cifra a advinar entre 1 y 50."));
    while(numAdivinar1<1||numAdivinar1>50){
        numAdivinar1=Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador uno.\n Introduzca una cifra a advinar entre 1 y 50."));
        }
    numAdivinar=numAdivinar1;
    intento1=Integer.parseInt(JOptionPane.showInputDialog(null,"Jugador uno.\n Introduzca cantidad de intentos."));
    intentos=intento1;
    }
    public void jugador2(){
    int numIntro2,intentos2;
    for(intentos2=1;intentos2<=intentos;intentos2++){
        numIntro2=Integer.parseInt(JOptionPane.showInputDialog(null,"Jugador dos.\nIntroduzca una cifra."));
        while(numIntro2<1||numIntro2>50){
        numIntro2=Integer.parseInt(JOptionPane.showInputDialog(null, "Jugador dos.\n Introduzca una cifra entre 1 y 50."));
        }
        if(numIntro2<numAdivinar){
            JOptionPane.showMessageDialog(null,"El numero introducido es menor.");
        }
        else if (numIntro2>numAdivinar){
            JOptionPane.showMessageDialog(null, "El numero introducido es mayor.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Acertaste!");
            break;
        }
        if(intentos2>=intentos){
            JOptionPane.showMessageDialog(null, "Perdiste...");
        }
    
    }
    }
    public void partida(){
        while(partida<=0){
            jugador1();
            jugador2();
    partida=JOptionPane.showOptionDialog(null,"Empezar otra partida?","partida",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null);
        }
    }
}

