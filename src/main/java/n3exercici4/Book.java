package n3exercici4;

import java.util.Objects;

public class Book {
	int num;
	String name;
	String edicion;
	public Book(int num, String name, String edicion) {
		super();
		this.num = num;
		this.name = name;
		this.edicion = edicion;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	@Override
	public String toString() {
		return "Book " + num + ", name :" + name + ", edicion: " + edicion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(edicion, name, num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(edicion, other.edicion) && Objects.equals(name, other.name) && num == other.num;
	}
	
	

}
