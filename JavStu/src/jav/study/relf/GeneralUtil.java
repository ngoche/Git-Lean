package jav.study.relf;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;

public class GeneralUtil {

	/**
	 * @author nald Ham support cho getListByQueryDynamic
	 * @description tim xem gia tri "key" co nam trong danh sach fields hay khong
	 */
	public static String hasInFields(Object key, Field[] fields) {
		for (Field field : fields) {
			if (field.getName().toUpperCase().equals(key.toString().toUpperCase()))
				return field.getName();
		}
		return null;
	}

	/**
	 * @author nald Ham support cho getListByQueryDynamic
	 * @description gan gia tri tu "value" dong cho thuoc tinh co ten "proName"
	 */
	public static void applyValue2Property(Object object, String proName, String value) {
		try {
			Class<?> clz = object.getClass().getDeclaredField(proName).getType();
			String proNameUpperFirst = proName.substring(0, 1).toUpperCase() + proName.substring(1);
			Method setMethod = object.getClass().getMethod("set" + proNameUpperFirst, clz);
			if (value == "") {
				setMethod.invoke(object, new Object[] { null });
			} else {
				if (Integer.class.equals(clz) || int.class.equals(clz)) {
					setMethod.invoke(object, Integer.parseInt(value));
				} else if (Long.class.equals(clz) || long.class.equals(clz)) {
					setMethod.invoke(object, Long.parseLong(value));
				} else if (String.class.equals(clz)) {
					setMethod.invoke(object, value);
				} else if (Double.class.equals(clz) || double.class.equals(clz)) {
					setMethod.invoke(object, Double.parseDouble(value));
				} else if (Float.class.equals(clz) || float.class.equals(clz)) {
					setMethod.invoke(object, Float.parseFloat(value));
				} else if (Boolean.class.equals(clz) || boolean.class.equals(clz)) {
					setMethod.invoke(object, Boolean.parseBoolean(value));
				} else if (java.util.Date.class.equals(clz) || Date.class.equals(clz)) {
					// parse kieu Date
					setMethod.invoke(object, DateUtility.parse(value, "yyyy-MM-dd HH:mm:ss"));
				} else if (BigDecimal.class.equals(clz)) {
					setMethod.invoke(object, new BigDecimal(value));
				} else {
					// error
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
