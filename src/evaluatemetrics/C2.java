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
    class C2 extends C1{
    private int num;
    private float price; 
        protected void getNum(int i) {  
            this.num = i;    
        }         
        protected void getPrice(float f) {  
            this.price = f;    
        }
        private int putNum() {   
            return num;    
        }
        private float putPrice() {  
            return price;    
        }
        void putAmount(){ 
            System.out.print(num*price+" ");
        }
    }
