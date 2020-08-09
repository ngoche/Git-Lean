//package jav.study.relf2;
//
//import java.lang.reflect.Method;
//import java.lang.reflect.ParameterizedType;
//
//import jav.study.relf.DynamicVO;
//import jav.study.to.delete.Henv;
//
//public class ParamType {
//	public void dosomething() {
//		ParameterizedType stringListType = (ParameterizedType) f.getGenericType();
//		Class<?> stringListClass = (Class<?>) stringListType.getActualTypeArguments()[0];
//
//		if (stringListClass.equals(DynamicVO.class)) {
//			T subClazz = new Henv();
//			// Thuoc tinh kieu List<DynamicVO>
//			String proName = f.getName();
//			Class<?> clz = subClazz.getClass().getDeclaredField(proName).getType();
//			String proNameUpperFirst = proName.substring(0, 1).toUpperCase() + proName.substring(1);
//			Method setMethod = subClazz.getClass().getMethod("set" + proNameUpperFirst, clz);
//			setMethod.invoke(subClazz, tmpDynamicVOs);
//
//			break;
//		}
//	}
//}
