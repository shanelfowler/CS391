public class B {
    private A.SomePrivateMethods key;

    public void receiveKey(A.SomePrivateMethods key) {
        this.key = key;
    }

    public void usageExample() {
        A anA = new A();

        //int foo = anA.privateInt; // doesn't work, not accessible

        anA.giveKeyTo(this);
        int fii = key.getSomethingPrivate();
        System.out.println(fii);
    }
}