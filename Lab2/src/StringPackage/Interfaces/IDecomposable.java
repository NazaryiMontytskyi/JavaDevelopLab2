package StringPackage.Interfaces;

/*
 * Інтерфейс для декомпозиції певного об'єкту
 */
public interface IDecomposable<T> {

    T[] decompose(final T objectToDecompose);

}
