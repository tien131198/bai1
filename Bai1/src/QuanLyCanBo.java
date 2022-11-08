import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 10:37 AM
    
    ProjectName: Bai1
*/public class QuanLyCanBo {
    private List<CanBo> quanlyCanBo;

    public QuanLyCanBo() {
        this.quanlyCanBo = new ArrayList<>();
    }
    // thêm cán bộ
    public void themCanBo(CanBo canBo ){
        this.quanlyCanBo.add(canBo);
    }
    // Tìm kiếm theo họ và tên
    public List<CanBo> timKiemHoTen(String ten){
        return this.quanlyCanBo.stream().filter(o->o.getTen().contains(ten)).collect(Collectors.toList());
    }
    // Hiển thị thông tin về danh sách cán bộ
    public void hienThiCanBo(){
        this.quanlyCanBo.forEach(o-> System.out.println(o.toString()));
    }
}
