public class Drum extends PackageOrder {
    private String material;
    private float diameter;

    public Drum() {
        super();
        material = "N/A";
        diameter = 0;
    }

    public Drum(String trackingnumber, String specification, String mailingclass, String m, float d) {
        super(trackingnumber, specification, mailingclass);
        material = m;
        diameter = d;
    }

    public String getMaterial() {
        return material;
    }

    public float getDiameter() {
        return diameter;
    }
}
