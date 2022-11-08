import java.util.ArrayList;
import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 10:45 AM
    
    ProjectName: Bai1
*/public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        while(true){
            System.out.println("Chương trình quản lý nhân viên");
            System.out.println("Nhấn 1: Thêm cán bộ");
            System.out.println("Nhấn 2: Tìm nhân viên theo tên");
            System.out.println("Nhấn 3: Hiển thị thông tin nhân viên");
            System.out.println("Nhấn 4: Thoát khỏi chương trình");
            String line = scanner.nextLine();
            switch (line){
                case "1":{
                    System.out.println("Nhấn a: Thêm Kĩ sư");
                    System.out.println("Nhấn b: Thêm Công nhân");
                    System.out.println("Nhấn c: Thêm Nhân viên");
                    String type = scanner.nextLine();
                    switch (type){
                        case "a":{
                            System.out.println("Nhập Tên");
                            String ten = scanner.nextLine();
                            System.out.println("Nhập Tuổi");
                            int tuoi = scanner.nextInt();
                            System.out.println("Nhập Giới tính");
                            String gioiTinh = scanner.nextLine();
                            System.out.println("Nhập Địa chỉ");
                            String diaChi = scanner.nextLine();
                            System.out.println("Nhập Ngành đào tạo ");
                            String nganhDaoTao = scanner.nextLine();
                            CanBo kiSu = new KiSu(ten, tuoi, gioiTinh, diaChi, nganhDaoTao);
                            quanLyCanBo.themCanBo(kiSu);
                            System.out.println("Thêm kĩ sư thành công");
                            break;
                        }
                        case "b":{
                            System.out.println("Nhập Tên");
                            String ten = scanner.nextLine();
                            System.out.println("Nhập Tuổi");
                            int tuoi = scanner.nextInt();
                            System.out.println("Nhập Giới tính");
                            String gioiTinh = scanner.nextLine();
                            System.out.println("Nhập Địa chỉ");
                            String diaChi = scanner.nextLine();
                            System.out.println("Nhập Trình độ ");
                            int bac = scanner.nextInt();
                            CanBo congNhan = new CongNhan(ten, tuoi, gioiTinh, diaChi, bac);
                            quanLyCanBo.themCanBo(congNhan);
                            System.out.println("Thêm công nhân thành công");
                            break;
                        }
                        case "c":{
                            System.out.println("Nhập Tên");
                            String ten = scanner.nextLine();
                            System.out.println("Nhập Tuổi");
                            int tuoi = scanner.nextInt();
                            System.out.println("Nhập Giới tính");
                            String gioiTinh = scanner.nextLine();
                            System.out.println("Nhập Địa chỉ");
                            String diaChi = scanner.nextLine();
                            System.out.println("Nhập Công việc ");
                            String congViec = scanner.nextLine();
                            CanBo nhanVien = new NhanVien(ten, tuoi, gioiTinh, diaChi, congViec);
                            quanLyCanBo.themCanBo(nhanVien);
                            System.out.println("Thêm nhân viên thành công");
                            break;
                        }
                        default:
                            System.out.println("Thoát khỏi chương trình");
                            break;
                    }
                    break;
                }
                case "2":{
                    System.out.println("Nhập tên cán bộ muốn tìm kiếm");
                    String ten = scanner.nextLine();
                    quanLyCanBo.timKiemHoTen(ten).forEach(o -> System.out.println(o.toString()));
                    break;
                }
                case "3":{
                    quanLyCanBo.hienThiCanBo();
                    break;
                }
                case "4":{
                    System.out.println("Thoát khỏi chương trình");
                    System.exit(0);
                }
                default:{
                    break;
                }
            }

        }

    }
}
