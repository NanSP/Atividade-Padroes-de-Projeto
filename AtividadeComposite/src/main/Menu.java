package main;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent{
	
	private String name;
	private List<MenuComponent> children;
	
	public Menu(String name) {
		this.name = name;
		this.children = new ArrayList<>();
	
	}
	
	public void add(MenuComponent item) {
		children.add(item);
		}
	
	public void remove(MenuComponent item) {
		children.remove(item);
		}
	
	@Override
		public void show() {
		System.out.println("© " + name);
		for (MenuComponent child : children) {
			child.show();
		}
	}
}
