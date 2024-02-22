package collection.dao;

import java.util.ArrayList;
import collection.dto.ExDTO;

public class ExDAO {
	public static ArrayList<ExDTO> arr;
	static {
		arr = new ArrayList<>();
	}
	public void register(ExDTO dto) {
		System.out.println("register연동");
		arr.add(dto);
	}
	public ArrayList<ExDTO> getData(){
		return arr;
	}
	public ExDTO search(String name) {
		for(ExDTO d :arr) {
			if(name.equals(d.getName())) {
				return d;
			}
		}
		return null;//?
	}
	public  void modify(ExDTO dto) {
		System.out.println("수정");
		arr.add(dto);
		
	}


}
