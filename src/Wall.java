public class Wall {
//Instance variables
    double width;
    double height;

    //constructor
    public  Wall (double width,double height) {
        this.width = width;
        this.height = height;
    }

    //Methods
    public double getWidth() {
        return  width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if(width >= 0) {
            this.width = width;
        }else {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        if(height >= 0) {
            this.height = height;
        }else{
            this.height = 0;
        }
    }
    public double getArea() {
        return  width * height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall (5,4);

        System.out.println("Area=" + wall.getArea());

        wall.setHeight(-1.5);
        wall.setWidth(3.0);

        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("Area=" + wall.getArea());
    }
}
