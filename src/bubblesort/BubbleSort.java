
package bubblesort;

public class BubbleSort {

    public static int[] bubbleSort(int[] s){              
        for (int j=0;j<s.length;j++){  //runs through it again to make sure everything is sorted
            for(int i=0;i<s.length;i++) {            
                   if(i+1<s.length){
                        if(s[i]>s[i+1]){                   
                            s=swap(s,i,i+1);
                            //printArray(s,i);                    
                        }                 
                    }
            }//end for  
        }
                return(s);        
    }//end bubbleSort
    
    public static void printArray(int[] x,int y){
        for(int i=0;i<x.length;i++)
            System.out.print(x[i]+" ");
            System.out.println(" ");
            System.out.println("**i is at "+y+"**");
    }//end printArray
    
    public static int[] swap(int[] t, int c, int d) {
                      
        int tmp;
        tmp = t[c];
        t[c] = t[d];
        t[d] = tmp;       
        
        return(t);
        
    }//end swap
    
   
    public static void main(String[] args) {
        
        int[] sortArray = {5,1,9,7,2};
        int[] finishedArray;
        
        finishedArray=bubbleSort(sortArray);
        
        
        System.out.println("sorted array is");
        for(int i=0;i<finishedArray.length;i++)
            System.out.print(finishedArray[i]+" ");
        
    }//end main
    
}//end class
