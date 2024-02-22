package collection.dao;

import java.util.ArrayList;
import collection.dto.ExDTO02;

public class ExDAO02 {
	public static ArrayList<ExDTO02> arr;
	static {
		arr = new ArrayList<>();
	}
	public void register(ExDTO02 dto) {
		System.out.println("register 연동");
		arr.add(dto);
	}
	public ArrayList<ExDTO02> getData() {
		return arr;
	}
	public ExDTO02 search(String name) {
		for(ExDTO02 d : arr) {
			if(name.equals(d.getName())) {
				return d;
			}
		}
		return null;
	}

}
