/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

public class Ex3 {
    public static void main(String[] args) {
        
        WorkerThread thread1 = new WorkerThread();
        thread1.start();

      
        WorkerRunnable myRunnable = new WorkerRunnable();
        Thread thread2 = new Thread(myRunnable); 
        thread2.start();
    }
}