/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.insertion.selection.sorts;

/**
 *
 * @author user
 */
public class InsertionSort {
    
    public void INSSort(int arr[], int Length) {
        int i, j, Temp;
        for(i=0;i<Length;i++) {
            j=1;
            while(j>0 && arr[j] < arr[j-1]) {
                Temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = Temp;
            }
        }
    }
}
