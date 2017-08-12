package com.bss.protobuff.dept.transformer;

/**
 * 
 * @author baba
 *
 * @param <T>
 */
public interface Transformer<T> {
	byte[] serialize(final T t);

	T deserialize(final byte[] stream);
}
