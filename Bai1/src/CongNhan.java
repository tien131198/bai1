/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 10:30 AM
    
    ProjectName: Bai1
*/public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String ten, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
