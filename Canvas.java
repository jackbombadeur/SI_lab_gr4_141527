class Canvas {
    List < Point > list;

    public Canvas() {
        this.list = new ArrayList < Point > ();
    }

    public void addPoint(Point point) {
        list.add(point);
    }

    public void removePoint(String id) {
        for (int i = 0; i < this.list.size(); i++) {
            Point pt = (Point) this.list.get(i);

            if (pt.id == id) {
                int pos = this.list.indexOf(pt);
                this.list.remove(pos);
                break;
            }
        }
    }

    public void movePoints(char xDirection, char yDirection) {
        for (int i = 0; i < this.list.size(); i++) {
            Point pt = (Point) this.list.get(i);
            pt.move(xDirection, yDirection);
        }

    }

    public void printPoints() {
        for (int i = 0; i < this.list.size(); i++) {
            Point pt = (Point) this.list.get(i);
            System.out.println(pt.id + " " + pt.x + " " + pt.y + " " + pt.color);
        }
    }

}