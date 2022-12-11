package _04_Snake;

public class Location {

	public int x;
	
	public int y;
	
	public boolean equals(Location loc) {
		if(loc.x == x && loc.y == y) {
			return true;
		}else {
			return false;
		}
	}
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		// TODO Auto-generated method stub
				return x;
	}
	public int getY() {
		// TODO Auto-generated method stub
				return y;
	}
}

