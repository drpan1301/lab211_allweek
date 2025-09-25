package PACalculation;

public class ShapeExponent {

    private String shape;
    private double[] dimensions;

    public ShapeExponent() {
        this.shape = "";
        this.dimensions = new double[]{};
    }

    public double calculateArea(String shape, double... dimensions) {
        switch (shape.toLowerCase()) {
            case "circle":
                if (dimensions.length != 1) throw new IllegalArgumentException("Circle requires 1 dimension (radius)");
                return Math.PI * Math.pow(dimensions[0], 2);
            case "rectangle":
                if (dimensions.length != 2) throw new IllegalArgumentException("Rectangle requires 2 dimensions (length and width)");
                return dimensions[0] * dimensions[1];
            case "triangle":
                if (dimensions.length != 3) throw new IllegalArgumentException("Triangle requires 3 dimensions (edges)");
                double halfPerimeter = calculatePerimeter("triangle", dimensions[0], dimensions[1], dimensions[2]);
                return Math.sqrt(halfPerimeter * (halfPerimeter - dimensions[0]) * (halfPerimeter - dimensions[1]) * (halfPerimeter - dimensions[2]));
            default:
                throw new IllegalArgumentException("Unknown shape: " + shape);
        }
    }

    public double calculatePerimeter(String shape, double... dimensions) {
        switch (shape.toLowerCase()) {
            case "circle":
                if (dimensions.length != 1) throw new IllegalArgumentException("Circle requires 1 dimension (radius)");
                return Math.PI * dimensions[0] * 2;
            case "rectangle":
                if (dimensions.length != 2) throw new IllegalArgumentException("Rectangle requires 2 dimensions (length and width)");
                return (dimensions[0] + dimensions[1]) * 2;
            case "triangle":
                if (dimensions.length != 2) throw new IllegalArgumentException("Triangle requires 2 dimensions (base and height)");
                return dimensions[0] + dimensions[1] + dimensions[2];
            default:
                throw new IllegalArgumentException("Unknown shape: " + shape);
        }
    }

    
}