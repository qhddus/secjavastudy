package d.generic;

public class WildcardGeneric<W> {
	W wildcard;
	public void setWildcard(W wildcard) {
		this.wildcard=wildcard;
	}
	public W getWildcard() {
		return wildcard;
	}
}
/* 제네릭타입의 기본규칙
<E> 요소			<>안에 무엇이 들어가든 상관은 없지만 제일 기본적인 규칙이다
<K> 키
<N> 숫자
<T> 타입
<V> 값
<S,U,V> 두번쨰,세번째,네번째 선언된 타입*/