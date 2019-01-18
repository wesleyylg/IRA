package Programas;

import javax.swing.JOptionPane;

public class IRA {
    public static void main(String[] args){
        int cad, s, i;
        
        s = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o seu "
                + "semestre atual:"));
        
        cad = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o "
                + "número de cadeiras que você fez:"));
        
        double[] nota = new double[cad];
        double[] CH = new double[cad];
        
        for(i=0;i<cad;i++){
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog(null, 
                    "Informe sua nota na cadeira " + (i+1) + ":"));
            CH[i] = Double.parseDouble(JOptionPane.showInputDialog(null, 
                    "Informe a carga horária da cadeira " + (i+1) + ":"));
        }
        
        double soma1=0, soma2=0, IRA;
        
        for(i=0;i<cad;i++){
            soma1 += nota[i]*CH[i]*s;
            soma2 += CH[i]*s;
        }
        
        IRA = soma1/soma2;
        
        JOptionPane.showMessageDialog(null, "<html>Seu IRA Individual é: <hr>"
                + IRA + "</html>");
    }
}


