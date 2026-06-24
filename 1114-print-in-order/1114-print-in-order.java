class Foo {

    private volatile boolean oneDone=false;
    private volatile boolean twoDone=false;
    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        oneDone=true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        while(!oneDone){
            Thread.sleep(1);
        }
        printSecond.run();
        twoDone=true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
         while(!twoDone){
            Thread.sleep(1);
        }
        printThird.run();
    }
}