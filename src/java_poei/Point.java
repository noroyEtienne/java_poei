package java_poei;

import java.util.Objects;

public class Point {

	private int x;
	
	private int y;
	
	private static int compteur = 0;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		compteur = getCompteur() + 1;
	}
	
	public Point(int x) {
		this(x,0);
	}
	
	public Point(Point P) {
		this(P.x,P.y);
	}
	
	public static void main(String[] args) {
			Point P1, P2;
			P1 =  new Point(10,20);
			P2 = new Point(10,20);
			
			if (P1.equals(P2)) {
				System.out.println("Egaux");
			}
			else {
				System.out.print("Différents");
			}
		
			System.out.println(Point.getCompteur());

	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", hashCode()=" + hashCode() + ", getX()=" + getX() + ", getY()=" + getY()
				+ "]";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	/**
	 * @return the compteur
	 */
	public static int getCompteur() {
		return compteur;
	}
}
