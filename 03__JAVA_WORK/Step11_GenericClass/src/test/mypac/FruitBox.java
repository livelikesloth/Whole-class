package test.mypac;
/*
 *  T는 type 파라미터 이다.
 *  T를 포괄 클래스(Generic Class)라고 한다.
 */

public class FruitBox<T> {
	//field
	private T item;
	//field에 값을 넣는 method
	public void setItem(T item) {
		this.item=item;
	}
	//field에 저장된 값을 리턴하는 method
	public T getItem() {
		return item;
	}
}
