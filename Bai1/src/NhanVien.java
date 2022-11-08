/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 10:36 AM
    
    ProjectName: Bai1
*/public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String ten, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
