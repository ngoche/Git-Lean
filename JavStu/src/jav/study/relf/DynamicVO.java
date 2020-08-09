package jav.study.relf;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * Tao Structer cho du lieu bao cao dong
 * 
 * @author hunglm16
 */
public class DynamicVO implements Serializable {

	private static final long serialVersionUID = 2602571432058482862L;

	private String key;
	private Object value;

	public void safeSetNull() {
		try {
			for (Field field : getClass().getDeclaredFields()) {
				if (field.getType().equals(Integer.class) && field.get(this) == null) {
					field.set(this, 0);
				} else if (field.getType().equals(BigDecimal.class) && field.get(this) == null) {
					field.set(this, BigDecimal.ZERO);
				} else if (field.getType().equals(Float.class) && field.get(this) == null) {
					field.set(this, 0f);
				} else if (field.getType().equals(Double.class) && field.get(this) == null) {
					field.set(this, 0d);
				} else if (field.getType().equals(Long.class) && field.get(this) == null) {
					field.set(this, 0l);
				} else if (field.getType().equals(String.class) && field.get(this) == null) {
					field.set(this, "");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Khai bao cac phuong thuc GETTER/SETTER
	 */
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
