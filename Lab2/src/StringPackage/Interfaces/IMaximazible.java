package StringPackage.Interfaces;

public interface IMaximazible<T extends Comparable<T>> {
    
    public T getMax(final T[] setOfObjects);

}
