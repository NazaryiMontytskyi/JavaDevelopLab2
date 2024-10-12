package StringPackage.Interfaces;

/*
 * Інтерфейс для пошуку максимального значення у певній
 * множині об'єктів
 */
public interface IMaximazible<T extends Comparable<T>> {
    
    public T getMax(final T[] setOfObjects);

}
