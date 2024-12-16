package DataStructure.Lab10.Task4;

public class Customer {
    private Long cid;
    private String name;
    private int tier;

    public Customer(Long oid, String name, int tier) {
        this.cid = oid;
        this.name = name;
        this.tier = tier;
    }

    public Long getCid() {
        return cid;
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
                "oid=" + cid +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}' + "\n";
    }
}
