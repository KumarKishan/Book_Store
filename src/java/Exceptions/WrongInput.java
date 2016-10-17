/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Freeware Sys
 */
public class WrongInput extends Exception {

     private static final long serialVersionUID = 1L;
 /*
     private static String msg;

    
     public WrongInput() {
          WrongInput.msg = "Wrong Input Please Try Again";
     }

     public WrongInput(String msg) {
          WrongInput.msg = msg;

     }*/
     
     public WrongInput(String msg) {
          super(msg);
     }
/*
     @Override
     public String toString() {
          return msg;

     }
*/
}
