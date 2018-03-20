package com.example.thread.callable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ParallelAdder {                     
            public Integer parallelSum()
            {                       
                        long t1 = System.currentTimeMillis();
                        ExecutorService executor = Executors.newFixedThreadPool(10);
                        List <Future<Integer>> list = new ArrayList<Future<Integer>>();
                        int count=1;
                        int prev=0;                       
                        for(int i=0 ;i<100;i++)
                        {
                                    if(count%2==0)//grouping
                                    {
                                                System.out.println("Prev :" + prev + " current: " + i);
                                                Future<Integer> future = executor.submit(new CallableAdder(prev,i));
                                                list.add(future);
                                                count=1;                                              
                                                continue;
                                    }
                                   prev=i ;
                                    count++;                                   
                        }
                        int totalsum=0;                        
                        for(Future<Integer> fut : list)
                        {
                                    try {
                                    	totalsum = totalsum+ fut.get();
                                    } catch (InterruptedException e) {                                               
                                                e.printStackTrace();
                                                e.printStackTrace();
                                    } catch (ExecutionException e) {
                                                e.printStackTrace();
                                    }
                        }   
                        long t2 = System.currentTimeMillis(); 
                        System.out.println("Time taken by Parallel " + (t2-t1));
                        System.out.println("Total Sum is " + totalsum);
                        return totalsum;                       
            }                     
            public int sequentialSum()
            {                      
                        long t1 = System.currentTimeMillis();
                        Integer totsum=0;                        
                        for(int i=0;i<100;i++)
                        {
                            totsum=totsum+i;                                               
                        }                       
                        long t2 = System.currentTimeMillis();                       
                        System.out.println("sequentialSum Total Sum is " + totsum);
                        System.out.println("Time taken by sequentialSum " + (t2-t1));
                        return totsum;
            }           
            public static void main(String[] args) {                       
                        ParallelAdder adder = new ParallelAdder();
                        int pSum= adder.parallelSum();
                        int sSum= adder.sequentialSum();                       
                        System.out.println("parallel Sum equals to Sequential Sum is " + (pSum==sSum));
                        //System.out.println("Answer is :: " + (pSum==sSum));                                                                                          
            }
}