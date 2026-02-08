class Test{
    public static void main(String[] args) {
        Test obj = new Test();
        obj=null;  //will give error if obj=0 or obj=1 because it is not a valid reference
        //System.gc() is a method in Java that suggests the Java Virtual Machine (JVM) to perform garbage collection.
        System.gc();
    }
}