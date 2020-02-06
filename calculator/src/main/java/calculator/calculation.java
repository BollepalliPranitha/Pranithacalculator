package calculator;

public class calculation {
            Add p=new Add();
            Subtract q=new Subtract();
            Multiplication m=new Multiplication();
            Division d=new Division();
            void calci(double a,double b,char s){
            	    switch(s){
            	    case '+':double add= p.operation(a,b);
            	             System.out.println(add);
            	             break;
            	    case '-':double sub=q.operation(a,b);
   	                         System.out.println(sub);
   	                         break;
            	    case '*':double mul=m.operation(a,b);
                             System.out.println(mul);
                             break;
            	    case '/':double div=d.operation(a,b);
                             System.out.println(div);
                             break;
            	    }
            	
            }
}
