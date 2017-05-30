/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Joelson
 */
public class LimiteDigitos extends PlainDocument{
  
    @Override
    public void insertString (int offs, String str, AttributeSet a) throws BadLocationException{
    int tamanho= (this.getLength()+str.length());
    if (tamanho<=4){
        super.insertString(offs, str.toUpperCase(), a);
        
    }else{
    
    }
    
    
    }
    
    public void insertStringUpper (int offs, String str, AttributeSet attr) throws BadLocationException{

    super.insertString(offs, str.toUpperCase(), attr);

}
   
}
   
   
   
   

     
   

    
