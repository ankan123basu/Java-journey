class VariableExample{
    static int c = 0;
int ins = 5;
public void counter(){
int l = 10;
c++;
ins++;
System.out.println("local" + l);
System.out.println("instance" + ins);
System.out.println("static" + c);
}

public static void main(String[] args){
VariableExample obj1 = new VariableExample();
obj1.counter();
VariableExample obj2 = new VariableExample();
obj2.counter();
VariableExample obj3 = new VariableExample();
obj3.counter();
System.out.println("instance" + obj1.ins);
}
}





