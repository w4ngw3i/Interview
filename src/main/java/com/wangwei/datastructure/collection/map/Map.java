package com.wangwei.datastructure.collection.map;

public interface Map<K, V> {

    void add(K key, V value);

    V remove(K key);

    boolean contains(K key);

    V get(K key);

    boolean isEmpty();

    void set(K key, V value);

    int size();
}
