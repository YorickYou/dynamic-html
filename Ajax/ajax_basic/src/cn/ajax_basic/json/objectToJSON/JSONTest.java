package cn.ajax_basic.json.objectToJSON;
/**
 * 
 * @author Yorick
 * 2018年9月24日
 * theme:对象和JSON字符串之间的转变练习--JSONArray
 */

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import net.sf.json.JSONArray;

public class JSONTest {
	@Test
	public void objectJson() {
		JSONArray ja = new JSONArray();
		Person p1 = new Person("Yorick1", 26, "male");
		Person p2 = new Person("Yorick2", 27, "female");
		ja.add(p1);
		ja.add(p2);
		System.out.println(ja.toString());
	}
	@Test
	public void listJson() {
		Person p1 = new Person("zhangSan", 18, "male");
		Person p2 = new Person("liSi", 23, "female");
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		JSONArray ja = JSONArray.fromObject(list);
		System.out.println(ja.toString());
		
	}
	@Test
	public void arrayJson() {
		Person p1 = new Person("zhangSan", 18, "male");
		Person p2 = new Person("liSi", 23, "female");
		Person[] persons = {p1, p2};
		JSONArray ja = JSONArray.fromObject(persons);
		System.out.println(ja.toString());
	}
}
