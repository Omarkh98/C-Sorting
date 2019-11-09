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
public class BubbleSort {
    
    public void BBLSort(int arr[], int N) {
        int i, j;
        for(i=0;i<N-1;i++) {
            for(j=0;j<N-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                int Temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = Temp;
                }
            }
        }
    }
}
