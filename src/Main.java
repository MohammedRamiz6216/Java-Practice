import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;


    import java.util.*;
    /* // Fibanocci numbers
           int s=0;
           int e=1;
           int n,sum=0;
           n= sc.nextInt();
           System.out.print(s+" "+e);
           for(int i=0;i<n;i++){
               sum =s+e;
               s=e;
               e=sum;
               System.out.print(" "+sum+" ");

           }
            // prime numbers from 1 to n
           int n=sc.nextInt();

           for(int i=2;i<n;i++){
               if(i==2){
                   System.out.print(i+" ");
               }
               else if(i%2!=0){
                   System.out.print(" "+i);
               }
           }

  //palindrome number
       int n = sc.nextInt();
       int x=0,r=0,temp;
       temp=n;
       while(n>0){

          x= n%10;
           r = (r*10)+x;
          n=n/10;


       }
       if(temp==r){
           System.out.println("Is a palindrome");
       }
       else{
           System.out.println("Not a palindrome");
       }

 //factorial of a number
        int n = sc.nextInt();
        int x=1;
        for(int i=1;i<=n;i++){
           x=x*i;
        }
        System.out.println(x);

   //1st question
            System.out.println("Hello World");


  //2nd question
            Scanner sc = new Scanner(System.in);
            int a;
            a=sc.nextInt();
            System.out.println(a);


      //3rd question
          for(String t: args){
              System.out.println(t);



      //4th question
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer");
            int a;
            a=sc.nextInt();
            System.out.println("You have entered an integer");
            System.out.println("Enter a string");
            String s;
            s= sc.next();
            System.out.println("You have entered a string");
            System.out.println("Enter a float");
            float b;
            b = sc.nextFloat();
            System.out.println("You have entered an float");



  //5th question
            Scanner sc = new Scanner(System.in);
            float f;
            f= sc.nextInt();
            f = ((f-32)*5)/9;
            System.out.println(f);




  //6th question
            Scanner sc = new Scanner(System.in);
            int x,y,temp;
            x= sc.nextInt();
            y=sc.nextInt();
            temp = x;
            x=y;
            y=temp;
            System.out.println("After swapping\nx="+x+"\ny="+y);



 //7th question
            Scanner sc = new Scanner(System.in);
            int x,y;
            x= sc.nextInt();
            y=sc.nextInt();
            x=x+y;
            y=x-y;
            x=x-y;
            System.out.println("After swapping\nx="+x+"\ny="+y);



  //8th question
            Scanner sc = new Scanner(System.in);
           String num1;
           String num2;
           num1 = sc.nextLine();
           num2 = sc.nextLine();
           BigInteger A = new BigInteger(num1);
           BigInteger B = new BigInteger(num2);
           BigInteger sum;
           sum = A.add(B);
           System.out.println(sum);


 //9th question
            Scanner sc = new Scanner(System.in);
            int x;
            int y;
            int z;
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            if(x>y && x>z){
                System.out.println("x is the largest number");
            }else if(y>x && y>z ){
                System.out.println("y is the largest number");
            }else if(z>x && z>y){
                System.out.println("z is the largest number");
            }else{
                System.out.println("numbers are not different");
            }




//10th question
           boolean teaching =false;
           if(teaching){
               System.out.println("good teacher");
           }else{
               System.out.println("why are you here?");
           }



//11th question
            Scanner sc = new Scanner(System.in);
          int passMark =35;
          int obtainedMark;
          obtainedMark = sc.nextInt();
          if(obtainedMark>=passMark){
              System.out.println("Qualifiled the test");
          }
          else{
              System.out.println("Not qualified");
          }




 //12th question
            Scanner sc = new Scanner(System.in);
            int passMark =35;
            int obtainedMark;
            obtainedMark= sc.nextInt();
            char grade;
            if(obtainedMark>=passMark){
                if(obtainedMark>90)
                    grade='A';
                 else if(obtainedMark>75)
                     grade='B';
                 else if(obtainedMark>65)
                     grade='C';
                 else
                     grade= 'D';

              System.out.println("You have passed the test and your grade is :"+grade);
            }
            else{
                grade='F';
                System.out.println("You have failed the test and your grade is :"+grade);
            }


  //13th question
            Scanner sc = new Scanner(System.in);
           int n;
           n=sc.nextInt();
           if(n%2==0){
               System.out.println("Number is even");
           }else{
               System.out.println("Number is odd");
           }




 //14th question
            Scanner sc = new Scanner(System.in);
           int n;
           int fact=1;
           n=sc.nextInt();
           for(int i=2;i<=n;i++){
               fact=fact*i;
           }
            System.out.println(fact);



 //15th question
            Scanner sc = new Scanner(System.in);
          String s1,s2;
          s1= sc.nextLine();
          s2 = sc.nextLine();
          if(s1.compareTo(s2)>0){
              System.out.println("s1 is greater than s2");
          }
          else if(s2.compareTo(s1)>0){
                System.out.println("s2 is greater than s1");
            }
          else{
              System.out.println("Both strings are equal");
          }


          //16th question

            for(int i=0;i<=10;i++){
                System.out.println(i);
            }


  //17th question
            //Scanner sc = new Scanner(System.in);
            for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


//19th question
            Scanner sc = new Scanner(System.in);
            int n ;
            while((n= sc.nextInt())!=0){
                System.out.println("You entered "+n);
                System.out.println("Enter an integer");

            }
            System.out.println("out of loop");


//20th question
            Scanner sc = new Scanner(System.in);
            int n ,rev=0;
            n=sc.nextInt();
            while(n>0){
              rev = rev*10;
              rev = rev+n%10;
              n=n/10;

            }
            System.out.println(rev);



//21th question
            Scanner sc = new Scanner(System.in);
            int n ;

           while(true){
               n=sc.nextInt();
               if(n==0){
                   break;
               }
               System.out.println("You entered "+n);
           }





           //22nd question
            Scanner sc = new Scanner(System.in);
            int n ;

           while(true){
               n=sc.nextInt();
               if(n==0){
                   break;
               }
               System.out.println("You entered "+n);
           }

    //23rd question
           char ch;
           for(ch='a';ch<='z';ch++){
               System.out.println(ch);
           }


                //24th question
         int primes[]={1,2,3,4,5,6,7,8,9};
         for(int i :primes){
             System.out.println(i);
         }


          //25th question
            Scanner sc = new Scanner(System.in);
         int n;
         n=sc.nextInt();
         for(int i=1;i<=10;i++){
             System.out.println(n+"x"+i+"="+(n*i));
         }


         //26th question
            Scanner sc = new Scanner(System.in);
         int n;
         boolean isPrime = true;
         n=sc.nextInt();
         for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
              isPrime=false;
                break;
            }

         }
         if(isPrime){
             System.out.println("Is a prime number");
         }
         else{
             System.out.println("Not a Prime number");
         }

//27th question
            Scanner sc = new Scanner(System.in);
         int n,sum=0,temp,rem,digits=0;
         n= sc.nextInt();
         temp=n;
         while(temp!=0){
             digits++;
             temp=temp/10;
         }
         temp=n;
         while(temp!=0){
             rem = temp%10;
             sum+=  Math.pow(rem,digits);
             temp=temp/10;
         }
      if(sum==n){
          System.out.println("Is an armstrong number");
      }
      else{
          System.out.println("Not an armstrong number");
      }


      //28th question
           Scanner sc = new Scanner(System.in);
           int n,num=1;
           n=sc.nextInt();
           for(int i=1;i<=n;i++){
               for(int j=1;j<=i;j++){
                   System.out.print(num+" ");
                   num++;
               }
               System.out.println();
           }


          //29th question
           Scanner sc = new Scanner(System.in);
           String s,sub;
           int i,len,j;
           s= sc.nextLine();
           len = s.length();
           for(i=0;i<len;i++){
               for(j=i+1;j<=len;j++){
                   sub=s.substring(i,j);
                   System.out.println(sub);
               }
           }

           //30th question
           Scanner sc = new Scanner(System.in);
           String s,rev="";
           s=sc.nextLine();
           int len=s.length();
           for(int i=len-1;i>=0;i--)
               rev=rev+s.charAt(i);
               System.out.println(rev);

  */
public class Main{

        public static void main(String[] args) {
            //31th question
           Scanner sc = new Scanner(System.in);
           int[]marks = new int[3];

         for(int i=0;i<marks.length;i++){
             marks[i]= sc.nextInt();
         }
            for(int i=0;i<marks.length;i++){
                System.out.println(marks[i]);
            }






        }
    }























