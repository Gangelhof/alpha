
package alpha.view;

import javax.swing.JFrame;


public class AlphaMain {

    
    public static void main(String[] args) {
       JFrame Frame1 = new JFrame("Alpha");
       Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Frame1.setVisible(true);              
       Frame1.getContentPane().add(new AlphaScreen());        
       Frame1.pack(); 
    }
    
}
