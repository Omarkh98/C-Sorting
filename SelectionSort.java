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
public class SelectionSort {
    
    public void SelectionSort(int arr[], int N) {
        int Pos, Temp, i, j = 0;
        for(i=0;i<N-1;i++) {
            Pos = i;
            for(j = j+1;j<N;j++) {
                if(arr[j] < arr[Pos]) {
                    Pos = j;
                }
                if(Pos != i) {
                    Temp = arr[i];
                    arr[i] = arr[Pos];
                    arr[Pos] = Temp;
                }
            }
        }
    }
}
