/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class UpperCase extends PlainDocument {
   
        @Override
        public void insertString (int offs, String str,javax.swing.text.AttributeSet attr) throws BadLocationException{

        super.insertString(offs, str.toUpperCase(), attr);
   
   }
        public void replease (int offs, String str,javax.swing.text.AttributeSet attr) throws BadLocationException{

        super.insertString(offs, str.toUpperCase(), attr);
   
   }
  
}
