package collection.dao;

import java.util.ArrayList;

import collection.dto.ExDTO01;

public class ExDAO01 {
	public static ArrayList<ExDTO01> arr;
	static {
		arr = new ArrayList<>();
	}
	public void register(ExDTO01 dto) {
		System.out.println("register연동");
		arr.add(dto);
	}
	public ArrayList<ExDTO01> getData() {
		return arr;
	}
	public ExDTO01 search(String name) {
		for(ExDTO01 d : arr) {
			if(name.equals(d.getName())) {
				return d;
			}
		}
		return null;
	}
}
