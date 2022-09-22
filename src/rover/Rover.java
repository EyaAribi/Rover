package rover;

public class Rover {

	private Integer x;
	private Integer y;
	private char direction;
	private Integer limit_x;
	private Integer limit_y;

	public Rover() {
	}

	public void initial_position(Integer x, Integer y, char direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void plateau(Integer limit_x, Integer limit_y) {
		this.limit_x = limit_x;
		this.limit_y = limit_y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}

	public Integer getLimit_x() {
		return limit_x;
	}

	public void setLimit_x(Integer limit_x) {
		this.limit_x = limit_x;
	}

	public Integer getLimit_y() {
		return limit_y;
	}

	public void setLimit_y(Integer limit_y) {
		this.limit_y = limit_y;
	}

	public void movement(String moves) {

		char[] list_Moves = moves.toCharArray();
		for (char m : list_Moves) {
			if (m == 'L') {
				switch (getDirection()) {
				case 'N': {

					setDirection('W');
					break;
				}
				case 'W': {

					setDirection('S');
					break;
				}
				case 'S': {

					setDirection('E');
					break;
				}
				case 'E': {

					setDirection('N');
					break;
				}
				}
			}

			if (m == 'R') {
				switch (getDirection()) {
				case 'N': {

					setDirection('E');
					break;
				}
				case 'W': {

					setDirection('N');
					break;
				}
				case 'S': {

					setDirection('W');
					break;
				}
				case 'E': {

					setDirection('S');
					break;
				}
				}
			}
			if (m == 'M') {

				switch (getDirection()) {
				case 'N': {

					if (getY() < getLimit_y())
						setY(getY() + 1);
					break;
				}
				case 'E': {

					if (getX() < getLimit_x())
						setX(getX() + 1);
					break;
				}
				case 'S': {

					if (getY() > 0)
						setY(getY() - 1);
					break;
				}
				case 'W': {

					if (getX() > 0)
						setX(getX() - 1);
					break;
				}
				}

			}
		}
	}

	public void final_position() {

		System.out.println(getX() + " " + getY() + " " + getDirection());
	}

}
