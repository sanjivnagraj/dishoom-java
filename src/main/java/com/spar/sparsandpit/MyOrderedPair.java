
package com.spar.sparsandpit;
public class MyOrderedPair<K, V> implements MyPair<K, V> {

    private K key;
    private V value;

    public MyOrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}