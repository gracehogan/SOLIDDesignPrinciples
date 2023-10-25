package shapes;

public class CorrectedSquare {

    Rectangle rectangle;

    public CorrectedSquare() {
        rectangle = new Rectangle();
    }

    public void setHeight(int height) {
        rectangle.setHeight(height);
        rectangle.setWidth(height);
    }
}
