package DataStructure.Lab10.Task4;

public class Customer {
    private Long oid;
    private String name;
    private int tier;

    public Customer(Long oid, String name, int tier) {
        this.oid = oid;
        this.name = name;
        this.tier = tier;
    }

    public Long getOid() {
        return oid;
    }

    public String getName() {
        return name;
    }

    public int getTier() {
        return tier;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "oid=" + oid +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
