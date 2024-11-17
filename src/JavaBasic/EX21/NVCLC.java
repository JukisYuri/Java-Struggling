package EX21;

import java.util.Date;

public class NVCLC{
    private String trinhdo, nganh, noiDaoTao;

    public NVCLC(String trinhdo, String nganh, String noiDaoTao) {
        this.trinhdo = trinhdo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    @Override
    public String toString() {
        return "NVCLC{" +
                "noiDaoTao='" + noiDaoTao + '\'' +
                ", nganh='" + nganh + '\'' +
                ", trinhdo='" + trinhdo + '\'' +
                '}';
    }
}
