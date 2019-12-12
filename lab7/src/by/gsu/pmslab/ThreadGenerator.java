package by.gsu.pmslab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreadGenerator {

    public static void main(String[] args) {
        System.out.println("Введите количество потоков");
        Scanner scanner=new Scanner(System.in);
        int col=scanner.nextInt();
        System.out.println(col);
        int[] flows=new int[col];
        int[] end=new int[col];
        List<Integer> result=new ArrayList<>(col);
        for (int i=1;i<=col;i++) {
            System.out.println("Выберите операцию для " + i + " потока\n1.Сложение\n2.Вычитание\n3.Умножение");
            int operation = scanner.nextInt();
            flows[i - 1] = operation;
        }
        for (int i=1;i<=col;i++) {
            System.out.println("Введите число для "+i+" потока");
            end[i-1] = scanner.nextInt();
        }
        result=execute(col,end,result);
        getResult(result,col,flows);
        }
        private static List<Integer> execute(int col, int[] end, List<Integer> result){
            for (int i=0;i<col;i++){
                ClaculatorThread claculatorThread=new ClaculatorThread(end[i]);
                claculatorThread.start();
                result=claculatorThread.getResult();
            }
            return result;

        }
        private static void getResult(List<Integer> result,int col,int[] flows){
        int fullResult=1;
            for (int i=0;i<col;i++){
                switch (flows[i]){
                    case 1:for (int val : result){
                        fullResult+=val;
                    }
                    System.out.println("Ответ: "+fullResult);
                    fullResult=0;
                    break;
                    case 2:for (int val : result){
                        fullResult-=val;
                    }
                        System.out.println("Ответ: "+fullResult);
                        fullResult=0;
                    break;
                    case 3:fullResult+=1;
                        for (int val : result){
                        fullResult*=val;
                    }
                        System.out.println("Ответ: "+fullResult);
                        fullResult=0;
                }
            }
        }
    }

