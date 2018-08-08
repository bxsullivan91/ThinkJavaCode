public class Rectangle
{
    private int height;
    private int width;

    public Rectangle()
    {
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public Rectangle(Rectangle rectangleCopy)
    {
        this.height = rectangleCopy.height;
        this.width = rectangleCopy.width;

    }

    public int getArea()
    {
        int area = height * width;
        return area;
    }

    public String dimensions()
    {
        String formatted = "Height: " + height + ", Width: " + width + ", Area: " + getArea();
        return formatted;
    }
}
