
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miltokk
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    //Semi delcaro los componentes a utilizar en mi JFrame
    JMenuBar menuBar;
    JMenuItem grados,cronometro,salir;
    JMenu  menu;
    JPanel panelCronometro,panelGrados,panelTiempo,panelBotonesTiempo;
    JTextField minutos,segundos,milisegundos;
    JButton iniciar,detener,reiniciar;
    JLabel dospuntos,dospuntos2;
            
    //Constructor
    VentanaPrincipal(){
        //Le doy titulo y dimension a la ventana
        this.setTitle("Ventana");
        this.setSize(300, 200);
        this.setLayout(new BorderLayout());
        //termino de instanciar JMenuBar y JMenu y le asigno nombre
        menuBar= new JMenuBar();
        menu=new JMenu("Utilitarios");
        //Termino de instanciar JMenuitem que es grados y le doy nombre y le agrego un ActionListener
        grados= new JMenuItem("F a C");
        grados.addActionListener(this);
        //Termino de instanciar JMenuItem que es el de Cronometro y doy nombre y agrego actionlistener
        cronometro= new JMenuItem("Cronometro");
        cronometro.addActionListener(this);
        //De la misma manera agrego Salir para el JMenuBar
        salir= new JMenuItem("Salir");
        salir.addActionListener(this);
        //Agrego los componentes Cronometro,Grados y salir a Menu que es el de JMenu
        menu.add(cronometro);
        menu.add(grados);
        menu.add(salir);
        //Agrego el componente de Menu que es un JMenu a JMenuBar
        menuBar.add(menu);
        //Utilizo un setJMenuBar que me lo posiciona en la parte superior del contenedor por default del JFrame 
        this.setJMenuBar(menuBar);
        panelCronometro = new JPanel();
        panelCronometro.setLayout(new BorderLayout());
        panelTiempo=new JPanel();
        panelBotonesTiempo=new JPanel();        
        minutos= new JTextField("   00   ");
        segundos=new JTextField("   00   ");
        milisegundos=new JTextField("   00   ");
        panelTiempo.add(minutos);
        dospuntos=new JLabel(":");
        panelTiempo.add(dospuntos);
        panelTiempo.add(segundos);
        dospuntos2=new JLabel(":");
        panelTiempo.add(dospuntos2);
        panelTiempo.add(milisegundos); 
        panelCronometro.add(panelTiempo,BorderLayout.CENTER);
        
        iniciar= new JButton("Iniciar");
        iniciar.addActionListener(this);
        panelBotonesTiempo.add(iniciar);
        detener=new JButton("Detener");
        detener.addActionListener(this);
        panelBotonesTiempo.add(detener);
        reiniciar=new JButton("Reiniciar");
        reiniciar.addActionListener(this);
        panelBotonesTiempo.add(reiniciar);
        panelCronometro.add(panelBotonesTiempo,BorderLayout.SOUTH);
        
        this.setVisible(true);
        add(panelCronometro,BorderLayout.PAGE_END);
        
        
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==salir){
             System.exit(0);
        }
        
        if(e.getSource()== cronometro){
            
        }
        
        if(e.getSource()== grados){
           
        }
    }
    
}
