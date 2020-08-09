package jav.study.relf;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Clazz {
	private static <T> List<T> convert2ClassVO(Class<T> clazz, List<Object> listTmp) throws InstantiationException,
			IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
		/* ket qua tra ve */
		List<T> listResults = new ArrayList<>();

		/* Danh sach cac thuoc tinh cua class */
		Field[] fields = clazz.getDeclaredFields();

		if (listTmp.size() != 0) {

			for (Object object : listTmp) {
				/* Tao instance cua class dynamic */
				T subClazz = clazz.newInstance();
				/* Lay tung dong du lieu */
				Map row = (Map) object;
				/* Lay thuoc tinh cua object trong list data */
				Set keySet = row.keySet();
				/**/
				List<DynamicVO> tmpDynamicVOs = new ArrayList<>();

				for (Object key : keySet) {
					String tmp = GeneralUtil.hasInFields(key, fields);
					if (tmp != null) {
						Object tmpKey = row.get(key);
						if (tmpKey == null) {
							GeneralUtil.applyValue2Property(subClazz, tmp, "");
						} else {
							GeneralUtil.applyValue2Property(subClazz, tmp, row.get(key).toString());
						}
					} else {
						if (!key.toString().startsWith("not_view_")) {
							DynamicVO tmpDynamicVO = new DynamicVO();
							tmpDynamicVO.setKey(key.toString());
							tmpDynamicVO.setValue(row.get(key));
							tmpDynamicVOs.add(tmpDynamicVO);
						}
					}
				}

				for (Field f : fields) {
					java.lang.reflect.Type type = f.getGenericType();

					// Tim thuoc tinh kieu List<DynamicVO> trong Class
					if (type instanceof ParameterizedType) {
						ParameterizedType stringListType = (ParameterizedType) f.getGenericType();
						Class<?> stringListClass = (Class<?>) stringListType.getActualTypeArguments()[0];

						if (stringListClass.equals(DynamicVO.class)) {
							// Thuoc tinh kieu List<DynamicVO>
							String proName = f.getName();
							Class<?> clz = subClazz.getClass().getDeclaredField(proName).getType();
							String proNameUpperFirst = proName.substring(0, 1).toUpperCase() + proName.substring(1);
							Method setMethod = subClazz.getClass().getMethod("set" + proNameUpperFirst, clz);
							setMethod.invoke(subClazz, tmpDynamicVOs);

							break;
						}

					}
				}

				listResults.add(subClazz);
			}
		}
		return listResults;
	}

	public static void main(String[] args) {
//		ObjectMapper oMapper = new ObjectMapper();
//
//		Henv[] obj = new Henv[2];
//		obj[0] = new Henv();
//		obj[0].setName("mkyong");
//		obj[0].setAge(34);
//		
//		obj[1] = new Henv();
//		obj[1].setName("mkyong1");
//		obj[1].setAge(35);
//		
//		Map<String, Object> map = oMapper.convertValue(obj[0], Map.class);
//		
//		Object a = (Object) map;
//      //  System.out.println(map);
//        List<Object > lst = new ArrayList<>();
//        lst.add(a);
//        
//        map = oMapper.convertValue(obj[1], Map.class);
//        a = (Object) map;
//        lst.add(a);
//        
//        List<Object> lstTemp = (List<Object>) lst;
		Map map = new HashMap<>();

//		map.put("name", "mykong");
//		map.put("age", 12);
		List<Object> lstTemp = new ArrayList<Object>();
//		lstTemp.add(map);
//		map = new HashMap<>();
//		map.put("name", "henv");
//		map.put("age", "2");
//		lstTemp.add(map);
		
		map = new HashMap<>();
		map.put("name", "henv3");
		map.put("age", "100");
		List<DynamicVO> lstDynamic = new ArrayList<DynamicVO>();
		DynamicVO d = new DynamicVO();
		d.setKey("dKey");
		d.setValue("dValue");
		lstDynamic.add(d);
		map.put("charactor", lstDynamic);
		
		lstTemp.add(map);
		
		try {
			List<Henv> listResults = convert2ClassVO(Henv.class, lstTemp);
			for(int i = 0; i < listResults.size(); i++) {
				for(int j = 0; j < listResults.get(i).getLstDynamic().size(); j++) {
					DynamicVO dn = (DynamicVO) listResults.get(i).getLstDynamic().get(j);
					System.out.println(dn.getKey()+ dn.getValue());
				}
//				System.out.println(listResults.get(i).getLstDynamic().get(i).getKey());
//				System.out.println(listResults.get(i).getLstDynamic().get(i).getValue());
			}
			System.out.println();
		} catch (InstantiationException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}

class Henv {
	public String name;
	public int age;

	private List<DynamicVO> lstDynamic = new ArrayList<DynamicVO>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public List<DynamicVO> getLstDynamic() {
		return lstDynamic;
	}

	public void setLstDynamic(List<DynamicVO> lstDynamic) {
		this.lstDynamic = lstDynamic;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "; Age: " + this.age + "; Charactor: "+ this.lstDynamic;
	}
}
