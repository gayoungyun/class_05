package collection.main;

import java.util.Scanner;
import collection.service.ExService;
import collection.service.ExServiceImpl;

public class MainEx {
	public static void main(String[] args) {

		ExService ms = new ExServiceImpl();

		ms.display();

	}
}
