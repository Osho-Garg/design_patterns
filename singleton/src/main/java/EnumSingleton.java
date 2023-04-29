/**
 * Here we described creating singleton using enum but why?
 * Let's say in Lazy Init method you access constructor by reflection (Reason being you can access private constructor using reflection!!)
 * and create the object which eventually creates the problem by having multiple instances.
 *
 * ENUM's constructor gets invoked by JVM not by User who is using so it is safe to use.
 * Another advantage of using enum is , we don't need to worry about threads as it is thread safe.
 * It also solved the problem of Serialization as JVM takes care to return same object.
 *
 */
public enum EnumSingleton {
    INSTANCE;
    public void doSomething() {
        System.out.println("Cool");
    }
}

/*
public enum EnumSingleton {
    INSTANCE1;
INSTANCE2;
    public void doSomething() {
        System.out.println("Cool");
    }
}

how to get object of EnumSingleton

Yes, INSTANCE1 and INSTANCE2 will have the same hash code because they are both instances of the same class, EnumSingleton.

In Java, the Object class defines a hashCode() method, which returns a hash code value for an object. The default implementation of hashCode() in the Object class returns a unique integer value for each object based on its memory address.

However, for enum classes, the JVM guarantees that each constant will have a unique identity, so it is safe to assume that they will have different memory addresses. But since INSTANCE1 and INSTANCE2 are both instances of the same class, their hashCode() values will be the same. In fact, if you call hashCode() on INSTANCE1 and INSTANCE2, you will get the same hash code value.

Here's an example:

csharp
Copy code
EnumSingleton instance1 = EnumSingleton.INSTANCE1;
EnumSingleton instance2 = EnumSingleton.INSTANCE2;

System.out.println(instance1.hashCode());
System.out.println(instance2.hashCode());
This will print the same hash code value for both instances.

 */
