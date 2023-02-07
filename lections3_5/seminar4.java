//                      1
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// import java.util.Date;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.LinkedList;

// public class seminar4{
//     public static void main(String[] args) {
//         String str1=new String("Дорого");
//         String str2=new String("небо");
//         String str3=new String("да");
//         String str4=new String("надобен");
//         String str5=new String("огород");

//         LinkedList<String> palindrome = new LinkedList<String>();
//         palindrome.add(str1);
//         palindrome.add(str2);
//         palindrome.add(str3);
//         palindrome.add(str4);
//         palindrome.add(str5);
//         System.out.println(palindrome);
//         Collections.reverse(palindrome);
//         System.out.println(palindrome);
//     }
// }
//                      2
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Random;

// public class seminar4 {
//     public static Queue<Integer> newQueue = new LinkedList<>();
//     public static void main(String[] args) {
//         int queueLength=3;
        
//         for (int i = 0; i < queueLength; i++) {
//             enqueue();
//         }
//         System.out.println("Resulting Queue: "+newQueue);
//         dequeue();
//         System.out.println("Queue after removing the head: "+newQueue);
//         first();
//         System.out.println("Queue after showing the head: "+newQueue);
//     }
//     static void enqueue(){
//         Random rnd=new Random();
//         newQueue.add(rnd.nextInt(10)+1); 
//     }
//     static void dequeue(){
//         if (newQueue.isEmpty()) System.out.println("Queue is already empty - nothing to remove");
//         else {
//             int toRemove=newQueue.remove();
//             System.out.println("Element removed from head: "+toRemove);
//         }
        
//     }
//     static void first(){
//         int result = newQueue.peek();
//         System.out.println("The first element in Queue is: "+result); 
//     }
    
// }
