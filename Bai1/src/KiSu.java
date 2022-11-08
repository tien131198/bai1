/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 10:34 AM
    
    ProjectName: Bai1
*/public class KiSu extends CanBo{
    private String nganhDaoTao;

    public KiSu(String ten, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KiSu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
