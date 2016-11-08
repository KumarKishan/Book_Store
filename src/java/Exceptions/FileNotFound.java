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
public class FileNotFound extends Exception {

     private static String msg;
     private static final long serialVersionUID = 1L;

     public FileNotFound() {
          FileNotFound.msg = msg;
     }

     public FileNotFound(String msg) {
          FileNotFound.msg = msg;
     }

     @Override
     public String toString() {
          return msg;

     }
}
