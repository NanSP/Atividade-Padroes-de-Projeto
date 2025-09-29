package main;

public class MenuItem implements MenuComponent{
	
		private String name;
		public MenuItem(String name) {
		this.name = name;
		}
	
	@Override
	public void show() {
		System.out.println("[] " + name);
	}

}
