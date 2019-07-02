/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluatemetrics;

/**
 *
 * @author daguaman
 */
    class C1{
        protected String s1;
        protected String s2;
        protected String getItem(String s1){ 
            this.s1 = s1;
            return s1;
        }
        protected String getBrand(String s2){ 
            this.s2 = s2;
            return s2;
        } 
        private void putItem() { 
            System.out.print( s1 +" ");
        }
        private void putBrand() { 
            System.out.print( s2 +" ");
        }
    }
