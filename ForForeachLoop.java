/*public class ForForeachLoop{  
public static void main(String[] args) {  
    //Declaring an array  
    int arr[]={12,23,44,56,78};  
    //Printing array using for-each loop  
    for(int i:arr){  
        System.out.println(i);  
    }  

    String name[]={"Gazi","Al-Amin","Gazi","Arman","Hossain","Robin"};

    for(String j: name){
    	System.out.println(j);

    }
}  
}  */

// break Statement with label 
public class ForForeachLoop {  
public static void main(String[] args) {  
            aa:  
            for(int i=1;i<=3;i++){    
                    bb:  
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using break statement with label  
                            //break aa; 
                            break bb;   
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }    
}  
}  