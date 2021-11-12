package iterator.exercise;

import iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator createIterator() {
    return new ArrayListIterator(this);
  }

  public class ArrayListIterator implements Iterator{
    private ProductCollection collection;
    private int index;

    public ArrayListIterator(ProductCollection collection) {
      this.collection = collection;
    }

    @Override
    public boolean hasNext() {
      return (index < collection.products.size());
    }

    @Override
    public Product current() {
      return collection.products.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }
}
