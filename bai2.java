import java.time.LocalDate;
import java.util.ArrayList;
 

import java.util.Scanner;

abstract class HangHoa {
    private String mahang, tenhang;
    private int soluongton;
    private double dongia;

    public HangHoa() {

    }

    public HangHoa(String mahang, String tenhang, int soluongton, double dongia) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.soluongton = soluongton;
        this.dongia = dongia;
    }

    public String getMahang() {
        return this.mahang;
    }

    public void setMahang(String mahang) {
        if (this.mahang != "") {
            this.mahang = mahang;
        } else {
            this.mahang = "chua nhap ma hang";
        }
    }

    public String getTenhang() {
        return this.tenhang;
    }

    public void setTenhang(String tenhang) {
        if (this.tenhang != "") {
            this.tenhang = tenhang;
        } else {
            this.tenhang = "chua nhap ten hang";
        }
    }

    public int getSoluongton() {
        return this.soluongton;
    }

    public void setSoluongton(int soluongton) {
        if (this.soluongton >= 0) {
            this.soluongton = soluongton;
        } else {
            System.out.println("so luong khong hop le");
        }
    }

    public double getDongia() {
        return this.dongia;
    }

    public void setDongia(double dongia) {
        if (this.soluongton > 0) {
            this.soluongton = soluongton;
        } else {
            System.out.println("so luong khong hop le");
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap ma hang: ");
            this.mahang = sc.nextLine();
            if (this.mahang == "") {
                System.out.println("ma hang rong! nhap lai");
            }
        } while (this.mahang == "");
        do {
            System.out.println("nhap ten hang: ");
            this.tenhang = sc.nextLine();
            if (this.tenhang == "") {
                System.out.println("ten hang rong! nhap lai");
            }
        } while (this.tenhang == "");
        do {
            System.out.println("nhap so luong ton: ");
            this.soluongton = sc.nextInt();
            if (this.soluongton < 0) {
                System.out.println("so luong khong hop le! nhap lai");
            }
        } while (this.soluongton < 0);
        do {
            System.out.println("nhap don gia: ");
            this.dongia = sc.nextDouble();
            if (this.dongia < 0) {
                System.out.println("don gia khong hop le! nhap lai");
            }
        } while (this.dongia < 0);
    }

    abstract double tinhTien();

    abstract void danhGia();

    @Override
    public String toString() {
        return "{" +
                " mahang='" + getMahang() + "'" +
                ", tenhang='" + getTenhang() + "'" +
                ", soluongton='" + getSoluongton() + "'" +
                ", dongia='" + getDongia() + "'" +
                "}";
    }

}


 


public class HangDienMay extends HangHoa {
    private int baohanh;
    private double congsuat;
    private double vat = 0.05;

    public HangDienMay() {

    }

    public HangDienMay(String mahang, String tenhang, int soluongton, double dongia, int baohanh, double congsuat) {
        super(mahang, tenhang, soluongton, dongia);
        this.baohanh = baohanh;
        this.congsuat = congsuat;
    }

    public int getBaohanh() {
        return this.baohanh;
    }

    public void setBaohanh(int baohanh) {
        if (this.baohanh < 0) {
            System.out.println("khong hop le! nhap lai");
        } else {
            this.baohanh = baohanh;
        }
    }

    public double getCongsuat() {
        return this.congsuat;
    }

    public void setCongsuat(double congsuat) {
        if (this.congsuat < 0) {
            System.out.println("khong hop le! nhap lai");
        } else {
            this.congsuat = congsuat;
        }
    }

    public double getVat() {
        return this.vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    @Override
    public double tinhTien() {
        return getDongia() + getDongia() * this.vat;
    }

    @Override
    public void danhGia() {
        if (this.getSoluongton() < 3) {
            System.out.println("ban duoc");
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap thang bao hanh: ");
            this.baohanh = sc.nextInt();
            if (this.baohanh < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (this.baohanh < 0);
        do {
            System.out.println("nhap cong suat: ");
            this.congsuat = sc.nextDouble();
            if (this.congsuat < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (this.congsuat < 0);
    }

    @Override
    public String toString() {
        return "{" +
                " baohanh='" + getBaohanh() + "'" +
                ", congsuat='" + getCongsuat() + "'" +
                ", vat='" + getVat() + "'" +
                "}";
    }

}


public class HangDienMay extends HangHoa {
    private int baohanh;
    private double congsuat;
    private double vat = 0.05;

    public HangDienMay() {

    }

    public HangDienMay(String mahang, String tenhang, int soluongton, double dongia, int baohanh, double congsuat) {
        super(mahang, tenhang, soluongton, dongia);
        this.baohanh = baohanh;
        this.congsuat = congsuat;
    }

    public int getBaohanh() {
        return this.baohanh;
    }

    public void setBaohanh(int baohanh) {
        if (this.baohanh < 0) {
            System.out.println("khong hop le! nhap lai");
        } else {
            this.baohanh = baohanh;
        }
    }

    public double getCongsuat() {
        return this.congsuat;
    }

    public void setCongsuat(double congsuat) {
        if (this.congsuat < 0) {
            System.out.println("khong hop le! nhap lai");
        } else {
            this.congsuat = congsuat;
        }
    }

    public double getVat() {
        return this.vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    @Override
    public double tinhTien() {
        return getDongia() + getDongia() * this.vat;
    }

    @Override
    public void danhGia() {
        if (this.getSoluongton() < 3) {
            System.out.println("ban duoc");
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap thang bao hanh: ");
            this.baohanh = sc.nextInt();
            if (this.baohanh < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (this.baohanh < 0);
        do {
            System.out.println("nhap cong suat: ");
            this.congsuat = sc.nextDouble();
            if (this.congsuat < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (this.congsuat < 0);
    }

    @Override
    public String toString() {
        return "{" +
                " baohanh='" + getBaohanh() + "'" +
                ", congsuat='" + getCongsuat() + "'" +
                ", vat='" + getVat() + "'" +
                "}";
    }

}


public class HangSanhSu extends HangHoa {
    private String nhasanxuat;
    private LocalDate ngaynhapkho = LocalDate.now();
    private double vat = 0.1;

    public HangSanhSu() {

    }

    public HangSanhSu(String mahang, String tenhang, int soluongton, double dongia, String nhasanxuat,
            LocalDate ngaynhapkho) {
        super(mahang, tenhang, soluongton, dongia);
        this.nhasanxuat = nhasanxuat;
        this.ngaynhapkho = ngaynhapkho;
    }

    public String getNhasanxuat() {
        return this.nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public LocalDate getNgaynhapkho() {
        return this.ngaynhapkho;
    }

    public void setNgaynhapkho(LocalDate ngaynhapkho) {
        this.ngaynhapkho = ngaynhapkho;
    }

    public double getVat() {
        return this.vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    @Override
    public double tinhTien() {
        return getDongia() + getDongia() * this.vat;
    }

    @Override
    public void danhGia() {
        if (getSoluongton() > 50 && this.ngaynhapkho.isBefore(ngaynhapkho.plusDays(10)) == true) {
            System.out.println("ban cham");
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nha san xuat: ");
        nhasanxuat = sc.nextLine();
        int ngaynk, thangnk, namnk;
        do {
            System.out.println("nhap ngay nhap kho: ");
            ngaynk = sc.nextInt();
            if (ngaynk < 0 || ngaynk > 31) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (ngaynk < 1 || ngaynk > 31);
        do {
            System.out.println("nhap thang nhap kho: ");
            thangnk = sc.nextInt();
            if (thangnk < 1 || thangnk > 12) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (thangnk < 1 || thangnk > 12);
        do {
            System.out.println("nhap nam nhap kho: ");
            namnk = sc.nextInt();
            if (namnk < 1940 || namnk > 2050) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (namnk < 1940 || namnk > 2050);
        ngaynhapkho = LocalDate.of(ngaynk, thangnk, namnk);
    }

    @Override
    public String toString() {
        return "{" +
                " nhasanxuat='" + getNhasanxuat() + "'" +
                ", ngaynhapkho='" + getNgaynhapkho() + "'" +
                ", vat='" + getVat() + "'" +
                "}";
    }

}


public class HangThucPham extends HangHoa {
    private LocalDate nsx, nhh = nsx;
    private String ncc;
    private double vat = 0.1;

    public HangThucPham() {

    }

    public HangThucPham(String mahang, String tenhang, int soluongton, double dongia, String ncc, LocalDate nsx,
            LocalDate nhh) {
        super(mahang, tenhang, soluongton, dongia);
        this.ncc = ncc;
        this.nsx = nsx;
    }

    public LocalDate getNsx() {
        return this.nsx;
    }

    public void setNsx(LocalDate nsx) {
        this.nsx = nsx;
    }

    public LocalDate getNhh() {
        return this.nhh;
    }

    public void setNhh(LocalDate nhh) {
        this.nhh = nhh;
    }

    public String getNcc() {
        return this.ncc;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    public double getVat() {
        return this.vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    @Override
    public double tinhTien() {
        return getDongia() + getDongia() * this.vat;
    }

    @Override
    public void danhGia() {
        if (getSoluongton() != 0 && this.nhh.isAfter(nsx)) {
            System.out.println("kho ban");
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nha cung cap: ");
        ncc = sc.nextLine();
        int ngaysx, thangsx, namsx;
        int ngayhh, thanghh, namhh;
        do {
            System.out.println("nhap ngay san xuat: ");
            ngaysx = sc.nextInt();
            if (ngaysx < 0 || ngaysx > 31) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (ngaysx < 1 || ngaysx > 31);
        do {
            System.out.println("nhap thang san xuat: ");
            thangsx = sc.nextInt();
            if (thangsx < 1 || thangsx > 12) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (thangsx < 1 || thangsx > 12);
        do {
            System.out.println("nhap nam san xuat: ");
            namsx = sc.nextInt();
            if (namsx < 1940 || namsx > 2050) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (namsx < 1940 || namsx > 2050);
        nsx = LocalDate.of(ngaysx, thangsx, namsx);
        do {
            System.out.println("nhap ngay het han: ");
            ngayhh = sc.nextInt();
            if (ngayhh < 0 || ngayhh > 31) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (ngayhh < 1 || ngayhh > 31);
        do {
            System.out.println("nhap thang het han: ");
            thanghh = sc.nextInt();
            if (thanghh < 1 || thanghh > 12) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (thanghh < 1 || thanghh > 12);
        do {
            System.out.println("nhap nam het han: ");
            namhh = sc.nextInt();
            if (namhh < 1940 || namhh > 2050) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (namhh < 1940 || namhh > 2050);
        nhh = LocalDate.of(ngayhh, thanghh, namhh);
    }

    @Override
    public String toString() {
        return "{" +
                " nsx='" + getNsx() + "'" +
                ", nhh='" + getNhh() + "'" +
                ", ncc='" + getNcc() + "'" +
                ", vat='" + getVat() + "'" +
                "}";
    }

}


public class DanhSach {
    ArrayList<HangHoa> dshh;

    public DanhSach() {
        dshh = new ArrayList<>();
    }

    public void them(HangHoa hh) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i + ": ");
            if (hh instanceof HangDienMay) {
                hh = new HangDienMay();
                hh.nhap();
            } else if (hh instanceof HangThucPham) {
                hh = new HangThucPham();
                hh.nhap();
            } else if (hh instanceof HangDienMay) {
                hh = new HangDienMay();
                hh.nhap();
            }
            dshh.add(hh);
        }
    }

    public void xuatHH() {
        System.out.println(
                "|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        System.out.format("%-15s %-30s %-30s \n",
                "| Ma HH",
                "| Ten HH",
                "| So luong ton",
                "| Don gia");
        System.out.println(
                "|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        for (HangHoa hh : dshh) {
            System.out.format("%-15s %-30s %-30s %-1s\n",
                    "| " + hh.getMahang(),
                    "| " + hh.getTenhang(),
                    "| " + hh.getSoluongton(),
                    "| " + hh.getDongia(),
                    "     |");
            System.out.println(
                    "|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        }
    }

    public void MENU() {
        System.out.printf("MENU\n" +
                "0.Thoat\n" +
                "1.Xuat\n" +
                "2.Nhap\n");
    }
}



public class App {
    public static void main(String[] args) throws Exception {
        DanhSach ds = new DanhSach();
        Scanner sc = new Scanner(System.in);
        HangHoa hh;
        int luaChon = 0;
        do {
            ds.MENU();
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.println("[1]In DS");
                System.out.printf("1.In tat ca hang hoa" +
                        "2.In hang thuc pham\n" +
                        "3.In hang dien may\n" +
                        "4.In hang sanh su\n" +
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if (i == 1) {
                    ds.xuatHH();
                }
            } else if (luaChon == 2) {
                System.out.println("[2]Them hang hoa");
                System.out.printf("1.Them hang thuc pham\n" +
                        "2.Them hang dien may\n" +
                        "3.Them hangsanh su\n" +
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if (i == 1) {
                    hh = new HangThucPham();
                    ds.them(hh);
                } else if (i == 2) {
                    hh = new HangDienMay();
                    ds.them(hh);
                } else if (i == 2) {
                    hh = new HangSanhSu();
                    ds.them(hh);
                }
            }
        } while (luaChon != 0);
    }
}
