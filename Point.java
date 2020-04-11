class Point {
	String id;
	double x,y;
	String color;

	//TODO add new variable

	public Point(String setId, double setX, double setY, String setColor) {
		id = setId;
		x = setX;
		y = setY;
		color = setColor;
	}
	
	//TODO constructor
	
	public String getId() {
		return this.id;
	}
	
	public void setID(String newId) {
		this.id = newId;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setX(double newX) {
		this.x = newX;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double newY) {
		this.y = newY;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}

	//TODO setters and getters

	public void move (char xDirection, char yDirection) {
		//TODO
		double currentX = getX();
		double currentY = getY();
		if(xDirection == 'U') {
			setX(currentX+1);
		} else if(xDirection == 'D') {
			setX(currentX-1);
		}
		if(yDirection == 'R') {
			setY(currentY+1);
		} else if(yDirection == 'L') {
			setY(currentY-1);
		}
	}

	public void draw () {
		System.out.println("x: " + getX() + " y: " + getY());
		
		//TODO
	}
	

}