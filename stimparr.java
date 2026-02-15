class stimparr{
    int top=-1;
    int st[] = new int[10];
    void push(int n){
        if(top>=10){
            System.out.print("overflow");
        }
        else{
            top++;
            st[top]=n;
        }
    }
    void pop(){
        if(top==-1){
            System.out.print("Empty stack");
        }
        else{
            top--;
        }
    }
    int peek(){
        
        return st[top];
    }
    int size(){
        return top+1;
    }
    void display(){
        if(top==-1){
            System.out.print("Stack is empty");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(st[i]+" ");
            }
        }
    }

    public static void main(String[] args){

        stimparr s = new stimparr();
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        System.out.println();
        s.pop();
        
        s.display();
        System.out.println();
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}