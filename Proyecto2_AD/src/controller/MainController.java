
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainJFrame;
import view.registroJDialog;

public class MainController {

    private MainJFrame view;

    public MainController(MainJFrame view) {
        this.view = view;
        this.view.addRegistroActionListener(this.getaddRegistroActionListener());
        

    }
    private ActionListener getaddInicioSesionActionListener(){
    
        ActionListener al = new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        
        };
        return al;
    
    }
    private ActionListener getaddRegistroActionListener(){
    
        ActionListener al = new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                    registroJDialog registro = new registroJDialog(view,true);
                    registroController controller = new registroController(registro);
                    registro.setVisible(true);
            }
        
        };
        return al;
    
    }
    
    
    
    
    

}
