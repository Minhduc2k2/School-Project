package mypack;


import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static List<QUOCTICH> quocTich = new ArrayList<QUOCTICH>();
	public static List<KHACHHANG> khachHang = new ArrayList<KHACHHANG>();
	public static List<VE> ve = new ArrayList<VE>();
	public static List<DANGKY> dangKy = new ArrayList<DANGKY>();

	// DUC
	public static List<KHACHSAN> khachSan = new ArrayList<KHACHSAN>();
	public static List<PHUONGTIEN> phuongTien = new ArrayList<PHUONGTIEN>();
	public static List<PHANCONG> phanCong = new ArrayList<PHANCONG>();
	public static List<CHUCVU> chucVu = new ArrayList<CHUCVU>();
	// KHOA
	public static List<TOUR> tour = new ArrayList<TOUR>();
	public static List<DAILY> daiLy = new ArrayList<DAILY>();
	public static List<NHANVIEN> nhanVien = new ArrayList<NHANVIEN>();
	public static List<DIADIEMDULICH> diaDiemDL = new ArrayList<DIADIEMDULICH>();

	// AN
	public static void TaoDanhSachQuocTich() {
		quocTich.add(new QUOCTICH("QT001", "Việt Nam", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT002", "Trung Quốc", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT003", "Mỹ", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT004", "Lào", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT005", "Bồ Đào Nha", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT006", "Thái Lan", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT007", "Sin-ga-po", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT008", "Pháp", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT009", "Anh", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT010", "Đức", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT011", "Nga", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT012", "Ai Cập", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT013", "Hy Lạp", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT014", "Brazil", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT015", "Sudan", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT016", "Nhật Bản", new ArrayList<KHACHHANG>()));
		quocTich.add(new QUOCTICH("QT017", "Úc", new ArrayList<KHACHHANG>()));

	}

	public static void TaoDanhSachKhachHang() {
		khachHang.add(new KHACHHANG("KH001", "Nguyễn Hữu", "Ba", 1945, "Nam", quocTich.get(0).MaQG, "276315549", "Hà Nội", "0386592645", 
				quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH002", "Lý Thế", "Dân", 1998, "Nam", quocTich.get(1).MaQG, "396515549", "Lạc Dương", "0136529456",
				quocTich.get(1), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH003", "Nguyễn Thanh", "Tùng", 1996, "Nam", quocTich.get(0).MaQG, "362558945", "Thái Bình",
				"0993625105", quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH004", "Vladimir Vladimirovich", "Putin", 1952, "Nam", quocTich.get(10).MaQG, "276315549", "Hà Nội",
				"0454264538", quocTich.get(10), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH005", "Cristiano", "Ronaldo", 1976, "Nam", quocTich.get(4).MaQG, "996351205", "Madeira",
				"0621539852", quocTich.get(4), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH006", "Trump", "Donald", 1946, "Nam", quocTich.get(2).MaQG, "362295586", "New York", "0885967526",
				quocTich.get(2), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH007", "Nguyễn Phương", "Hằng", 1970, "Nữ", quocTich.get(0).MaQG, "253695862", "Bình Dương",
				"0365298564", quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH008", "Đàm Vĩnh", "Hưng", 1976, "Nam", quocTich.get(0).MaQG, "526152389", "TP. Hồ Chí Minh",
				"0956823561", quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH009", "Alison Swift", "Taylor", 1982, "Nữ", quocTich.get(2).MaQG, "628539546", "California",
				"0995362454", quocTich.get(2), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH010", "Trần Thị Vân", "Anh", 1985, "Nữ", quocTich.get(0).MaQG, "302652485", "Bình Định",
				"099645328", quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH011", "Phạm Nhật", "Vượng", 1968, "Nam", quocTich.get(0).MaQG, "625428963", "Hà Nội", "035126968",
				quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH012", "Uchiha", "Sasuke", 1999, "Nam", quocTich.get(15).MaQG, "659236457", "Tokyo", "065295645",
				quocTich.get(15), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH013", "Đỗ Thị", "Huyền", 1997, "Nữ", quocTich.get(0).MaQG, "352629416", "TP. Hồ Chí Minh",
				"0142382416", quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH014", "Hitler", "Adolf", 1989, "Nam", quocTich.get(9).MaQG, "236558461", "Berlin", "022362945",
				quocTich.get(9), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH015", "Haruno", "Sakura", 1999, "Nữ", quocTich.get(15).MaQG, "968561645", "Tokyo", "065434189",
				quocTich.get(15), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH016", "Lê", "Bảo", 2001, "Nam", quocTich.get(0).MaQG, "958610385", "Hà Nội", "069584266",
				quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH017", "Lưu", "Bang", 1979, "Nam", quocTich.get(1).MaQG, "4586235659", "Lạc Dương", "0813214451",
				quocTich.get(1), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH018", "Hạng", "Vũ", 1989, "Nam", quocTich.get(1).MaQG, "366592546", "Giang Đông", "045236116",
				quocTich.get(1), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH019", "David", "Beckham", 1989, "Nam", quocTich.get(9).MaQG, "986216812", "Luân Đôn", "054268564",
				quocTich.get(9), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH020", "Trump", "Paron", 2002, "Nam", quocTich.get(2).MaQG, "625398542", "New York", "0625392516",
				quocTich.get(2), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH021", "Lê Thị", "Vân", 2009, "Nữ", quocTich.get(0).MaQG, "", "Hà Nội", "", 
				quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH022", "Cristiano", "Jr", 2010, "Nam", quocTich.get(4).MaQG, "", "Madeira", "",
				quocTich.get(4), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH023", "Lê", "Bình", 2008, "Nam", quocTich.get(0).MaQG, "", "Hà Nội", "", 
				quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH024", "Nguyễn Thanh", "Sơn", 2015, "Nam", quocTich.get(0).MaQG, "", "Thái Bình", "",
				quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH025", "Lý Kiến", "Thành", 1990, "Nam", quocTich.get(1).MaQG, "350564198", "Trường An",
				"0326981916", quocTich.get(1), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH026", "Lâm Tấn", "Tài", 2000, "Nam", quocTich.get(0).MaQG, "131321561", "TP. Hồ Chí Minh",
				"012984154", quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH027", "Trình Võ", "Kim", 1985, "Nam", quocTich.get(0).MaQG, "549877896", "Bình Dương",
				"0231653178", quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH028", "Nguyễn Nhật Kim", "Anh", 2001, "Nữ", quocTich.get(0).MaQG, "654687112", "Bình Định",
				"0545078796", quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH029", "Trần Thị", "Linh", 1986, "Nữ", quocTich.get(0).MaQG, "864189745", "Đồng Nai", "072180964",
				quocTich.get(0), new ArrayList<DANGKY>()));
		khachHang.add(new KHACHHANG("KH030", "Võ", "Jenny", 2010, "Nữ", quocTich.get(0).MaQG, "347565423", "Phú Yên", "045718789",
				quocTich.get(0), new ArrayList<DANGKY>()));
		
		
		
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(0));
		quocTich.get(1).dsKhachHang_QuocTich.add(khachHang.get(1));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(2));
		quocTich.get(10).dsKhachHang_QuocTich.add(khachHang.get(3));
		quocTich.get(4).dsKhachHang_QuocTich.add(khachHang.get(4));
		quocTich.get(2).dsKhachHang_QuocTich.add(khachHang.get(5));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(6));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(7));
		quocTich.get(2).dsKhachHang_QuocTich.add(khachHang.get(8));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(9));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(10));
		quocTich.get(15).dsKhachHang_QuocTich.add(khachHang.get(11));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(12));
		quocTich.get(9).dsKhachHang_QuocTich.add(khachHang.get(13));
		quocTich.get(15).dsKhachHang_QuocTich.add(khachHang.get(14));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(15));
		quocTich.get(1).dsKhachHang_QuocTich.add(khachHang.get(16));
		quocTich.get(1).dsKhachHang_QuocTich.add(khachHang.get(17));
		quocTich.get(9).dsKhachHang_QuocTich.add(khachHang.get(18));
		quocTich.get(2).dsKhachHang_QuocTich.add(khachHang.get(19));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(20));
		quocTich.get(4).dsKhachHang_QuocTich.add(khachHang.get(21));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(22));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(23));
		quocTich.get(1).dsKhachHang_QuocTich.add(khachHang.get(24));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(25));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(26));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(27));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(28));
		quocTich.get(0).dsKhachHang_QuocTich.add(khachHang.get(29));
	}

	public static void TaoDanhSachVe() {
		ve.add(new VE("V001", "", 3000000, new ArrayList<DANGKY>()));
		ve.add(new VE("V002", "", 400000, new ArrayList<DANGKY>()));
		ve.add(new VE("V003", "", 500000, new ArrayList<DANGKY>()));
		ve.add(new VE("V004", "", 5000000, new ArrayList<DANGKY>()));
		ve.add(new VE("V005", "", 3500000, new ArrayList<DANGKY>()));
		ve.add(new VE("V006", "", 900000, new ArrayList<DANGKY>()));
		ve.add(new VE("V007", "", 2000000, new ArrayList<DANGKY>()));
		ve.add(new VE("V008", "", 4500000, new ArrayList<DANGKY>()));
		ve.add(new VE("V009", "", 990000, new ArrayList<DANGKY>()));
		ve.add(new VE("V010", "", 2800000, new ArrayList<DANGKY>()));
		ve.add(new VE("V011", "", 6000000, new ArrayList<DANGKY>()));
		ve.add(new VE("V012", "", 4700000, new ArrayList<DANGKY>()));
		ve.add(new VE("V013", "", 5500000, new ArrayList<DANGKY>()));
	}

	public static void TaoDanhSachDangKy() {
		dangKy.add(new DANGKY(ve.get(2).MaSoVe, khachHang.get(0).MaSoKH, daiLy.get(0).MaSoDL, IsoChronology.INSTANCE.date(2020, 11, 1),
				500000,
				500000 - ve.get(2).Gia, daiLy.get(0), khachHang.get(0), ve.get(2)));
		dangKy.add(new DANGKY(ve.get(0).MaSoVe, khachHang.get(1).MaSoKH, daiLy.get(1).MaSoDL, IsoChronology.INSTANCE.date(2020, 12, 2),
				3000000,
				3000000 - ve.get(0).Gia, daiLy.get(1), khachHang.get(1), ve.get(0)));
		dangKy.add(new DANGKY(ve.get(5).MaSoVe, khachHang.get(2).MaSoKH, daiLy.get(2).MaSoDL, IsoChronology.INSTANCE.date(2020, 10, 3),
				1000000,
				1000000 - ve.get(5).Gia, daiLy.get(2), khachHang.get(2), ve.get(5)));
		dangKy.add(new DANGKY(ve.get(6).MaSoVe, khachHang.get(3).MaSoKH, daiLy.get(3).MaSoDL, IsoChronology.INSTANCE.date(2020, 11, 4),
				2000000,
				2000000 - ve.get(6).Gia, daiLy.get(3), khachHang.get(3), ve.get(6)));
		dangKy.add(new DANGKY(ve.get(10).MaSoVe, khachHang.get(4).MaSoKH, daiLy.get(4).MaSoDL, IsoChronology.INSTANCE.date(2020, 10, 5),
				6100000,
				6100000 - ve.get(10).Gia, daiLy.get(4), khachHang.get(4), ve.get(10)));
		dangKy.add(new DANGKY(ve.get(8).MaSoVe, khachHang.get(5).MaSoKH, daiLy.get(5).MaSoDL, IsoChronology.INSTANCE.date(2020, 12, 6),
				1000000,
				1000000 - ve.get(8).Gia, daiLy.get(5), khachHang.get(5), ve.get(8)));
		dangKy.add(new DANGKY(ve.get(2).MaSoVe, khachHang.get(6).MaSoKH, daiLy.get(6).MaSoDL, IsoChronology.INSTANCE.date(2020, 11, 7),
				500000,
				500000 - ve.get(2).Gia, daiLy.get(6), khachHang.get(6), ve.get(2)));
		dangKy.add(new DANGKY(ve.get(3).MaSoVe, khachHang.get(7).MaSoKH, daiLy.get(7).MaSoDL, IsoChronology.INSTANCE.date(2020, 11, 8),
				5000000,
				5000000 - ve.get(3).Gia, daiLy.get(7), khachHang.get(7), ve.get(3)));
		dangKy.add(new DANGKY(ve.get(9).MaSoVe, khachHang.get(8).MaSoKH, daiLy.get(8).MaSoDL, IsoChronology.INSTANCE.date(2020, 12, 9),
				2900000,
				2900000 - ve.get(9).Gia, daiLy.get(8), khachHang.get(8), ve.get(9)));
		dangKy.add(new DANGKY(ve.get(12).MaSoVe, khachHang.get(9).MaSoKH, daiLy.get(9).MaSoDL, IsoChronology.INSTANCE.date(2020, 10, 10),
				6000000,
				6000000 - ve.get(12).Gia, daiLy.get(9), khachHang.get(9), ve.get(12)));
		dangKy.add(new DANGKY(ve.get(6).MaSoVe, khachHang.get(10).MaSoKH, daiLy.get(1).MaSoDL, IsoChronology.INSTANCE.date(2020, 11, 11),
				2000000,
				2000000 - ve.get(6).Gia, daiLy.get(1), khachHang.get(10), ve.get(6)));
		dangKy.add(new DANGKY(ve.get(4).MaSoVe, khachHang.get(11).MaSoKH, daiLy.get(3).MaSoDL, IsoChronology.INSTANCE.date(2020, 10, 12),
				3600000,
				3600000 - ve.get(4).Gia, daiLy.get(3), khachHang.get(11), ve.get(4)));
		dangKy.add(new DANGKY(ve.get(3).MaSoVe, khachHang.get(12).MaSoKH, daiLy.get(5).MaSoDL, IsoChronology.INSTANCE.date(2020, 12, 13),
				5000000,
				5000000 - ve.get(3).Gia, daiLy.get(5), khachHang.get(12), ve.get(3)));
		dangKy.add(new DANGKY(ve.get(1).MaSoVe, khachHang.get(13).MaSoKH, daiLy.get(7).MaSoDL, IsoChronology.INSTANCE.date(2020, 12, 14),
				500000,
				500000 - ve.get(1).Gia, daiLy.get(7), khachHang.get(13), ve.get(1)));
		dangKy.add(new DANGKY(ve.get(0).MaSoVe, khachHang.get(14).MaSoKH, daiLy.get(9).MaSoDL, IsoChronology.INSTANCE.date(2020, 12, 15),
				3000000,
				3000000 - ve.get(0).Gia, daiLy.get(9), khachHang.get(14), ve.get(0)));
		dangKy.add(new DANGKY(ve.get(12).MaSoVe, khachHang.get(15).MaSoKH, daiLy.get(0).MaSoDL, IsoChronology.INSTANCE.date(2020, 11, 16),
				6000000,
				6000000 - ve.get(12).Gia, daiLy.get(0), khachHang.get(15), ve.get(12)));
		dangKy.add(new DANGKY(ve.get(5).MaSoVe, khachHang.get(16).MaSoKH, daiLy.get(2).MaSoDL, IsoChronology.INSTANCE.date(2020, 10, 17),
				1000000,
				1000000 - ve.get(5).Gia, daiLy.get(2), khachHang.get(16), ve.get(5)));
		dangKy.add(new DANGKY(ve.get(7).MaSoVe, khachHang.get(17).MaSoKH, daiLy.get(4).MaSoDL, IsoChronology.INSTANCE.date(2020, 10, 18),
				5000000,
				5000000 - ve.get(7).Gia, daiLy.get(4), khachHang.get(17), ve.get(7)));
		dangKy.add(new DANGKY(ve.get(9).MaSoVe, khachHang.get(18).MaSoKH, daiLy.get(6).MaSoDL, IsoChronology.INSTANCE.date(2020, 11, 19),
				3000000,
				3000000 - ve.get(9).Gia, daiLy.get(6), khachHang.get(18), ve.get(9)));
		dangKy.add(new DANGKY(ve.get(4).MaSoVe, khachHang.get(19).MaSoKH, daiLy.get(8).MaSoDL, IsoChronology.INSTANCE.date(2020, 11, 20),
				3500000,
				3500000 - ve.get(4).Gia, daiLy.get(8), khachHang.get(19), ve.get(4)));
		dangKy.add(new DANGKY(ve.get(10).MaSoVe, khachHang.get(21).MaSoKH, daiLy.get(2).MaSoDL, IsoChronology.INSTANCE.date(2020, 12, 01),
				6000000,
				6000000 - ve.get(10).Gia, daiLy.get(2), khachHang.get(21), ve.get(10)));
		dangKy.add(new DANGKY(ve.get(1).MaSoVe, khachHang.get(22).MaSoKH, daiLy.get(3).MaSoDL, IsoChronology.INSTANCE.date(2020, 12, 22),
				500000,
				500000 - ve.get(1).Gia, daiLy.get(3), khachHang.get(22), ve.get(1)));
		dangKy.add(new DANGKY(ve.get(2).MaSoVe, khachHang.get(23).MaSoKH, daiLy.get(5).MaSoDL, IsoChronology.INSTANCE.date(2020, 10, 23),
				500000,
				500000 - ve.get(2).Gia, daiLy.get(5), khachHang.get(23), ve.get(2)));
		dangKy.add(new DANGKY(ve.get(6).MaSoVe, khachHang.get(24).MaSoKH, daiLy.get(7).MaSoDL, IsoChronology.INSTANCE.date(2020, 11, 24),
				2000000,
				2000000 - ve.get(6).Gia, daiLy.get(7), khachHang.get(24), ve.get(6)));
		dangKy.add(new DANGKY(ve.get(7).MaSoVe, khachHang.get(25).MaSoKH, daiLy.get(1).MaSoDL, IsoChronology.INSTANCE.date(2020, 10, 25),
				1000000,
				1000000 - ve.get(7).Gia, daiLy.get(1), khachHang.get(25), ve.get(7)));
		dangKy.add(new DANGKY(ve.get(9).MaSoVe, khachHang.get(26).MaSoKH, daiLy.get(4).MaSoDL, IsoChronology.INSTANCE.date(2020, 10, 26),
				3000000,
				3000000 - ve.get(9).Gia, daiLy.get(4), khachHang.get(26), ve.get(9)));
		dangKy.add(new DANGKY(ve.get(12).MaSoVe, khachHang.get(27).MaSoKH, daiLy.get(9).MaSoDL, IsoChronology.INSTANCE.date(2020, 12, 27),
				5600000,
				5600000 - ve.get(12).Gia, daiLy.get(9), khachHang.get(27), ve.get(12)));
		dangKy.add(new DANGKY(ve.get(11).MaSoVe, khachHang.get(28).MaSoKH, daiLy.get(4).MaSoDL, IsoChronology.INSTANCE.date(2020, 9, 28),
				5000000,
				5000000 - ve.get(11).Gia, daiLy.get(4), khachHang.get(28), ve.get(11)));
		dangKy.add(new DANGKY(ve.get(10).MaSoVe, khachHang.get(29).MaSoKH, daiLy.get(8).MaSoDL, IsoChronology.INSTANCE.date(2020, 8, 29),
				6000000,
				6000000 - ve.get(10).Gia, daiLy.get(8), khachHang.get(29), ve.get(10)));
		dangKy.add(new DANGKY(ve.get(5).MaSoVe, khachHang.get(24).MaSoKH, daiLy.get(6).MaSoDL, IsoChronology.INSTANCE.date(2020, 10, 30),
				900000,
				900000 - ve.get(5).Gia, daiLy.get(6), khachHang.get(24), ve.get(5)));
		dangKy.add(new DANGKY(ve.get(9).MaSoVe, khachHang.get(15).MaSoKH, daiLy.get(0).MaSoDL, IsoChronology.INSTANCE.date(2020, 1, 31),
				2800000,
				2800000 - ve.get(9).Gia, daiLy.get(0), khachHang.get(15), ve.get(9)));
		dangKy.add(new DANGKY(ve.get(8).MaSoVe, khachHang.get(2).MaSoKH, daiLy.get(1).MaSoDL, IsoChronology.INSTANCE.date(2020, 9, 5),
				1000000,
				1000000 - ve.get(8).Gia, daiLy.get(1), khachHang.get(2), ve.get(8)));
		dangKy.add(new DANGKY(ve.get(10).MaSoVe, khachHang.get(25).MaSoKH, daiLy.get(7).MaSoDL, IsoChronology.INSTANCE.date(2020, 8, 15),
				6000000,
				6000000 - ve.get(10).Gia, daiLy.get(7), khachHang.get(25), ve.get(10)));
		dangKy.add(new DANGKY(ve.get(7).MaSoVe, khachHang.get(20).MaSoKH, daiLy.get(9).MaSoDL, IsoChronology.INSTANCE.date(2020, 11, 19),
				4600000,
				4600000 - ve.get(7).Gia, daiLy.get(9), khachHang.get(20), ve.get(7)));
		dangKy.add(new DANGKY(ve.get(12).MaSoVe, khachHang.get(17).MaSoKH, daiLy.get(3).MaSoDL, IsoChronology.INSTANCE.date(2020, 8, 21),
				5500000,
				5500000 - ve.get(12).Gia, daiLy.get(3), khachHang.get(17), ve.get(12)));
		dangKy.add(new DANGKY(ve.get(8).MaSoVe, khachHang.get(20).MaSoKH, daiLy.get(5).MaSoDL, IsoChronology.INSTANCE.date(2020, 8, 31),
				990000,
				990000 - ve.get(8).Gia, daiLy.get(5), khachHang.get(20), ve.get(8)));
		dangKy.add(new DANGKY(ve.get(2).MaSoVe, khachHang.get(14).MaSoKH, daiLy.get(2).MaSoDL, IsoChronology.INSTANCE.date(2020, 9, 9),
				500000,
				500000 - ve.get(2).Gia, daiLy.get(2), khachHang.get(14), ve.get(2)));
		dangKy.add(new DANGKY(ve.get(0).MaSoVe, khachHang.get(5).MaSoKH, daiLy.get(8).MaSoDL, IsoChronology.INSTANCE.date(2020, 8, 27),
				3000000,
				3000000 - ve.get(0).Gia, daiLy.get(8), khachHang.get(5), ve.get(0)));

		khachHang.get(0).dsDangKy_KhachHang.add(dangKy.get(0));
		khachHang.get(1).dsDangKy_KhachHang.add(dangKy.get(1));
		khachHang.get(2).dsDangKy_KhachHang.add(dangKy.get(2));
		khachHang.get(3).dsDangKy_KhachHang.add(dangKy.get(3));
		khachHang.get(4).dsDangKy_KhachHang.add(dangKy.get(4));
		khachHang.get(5).dsDangKy_KhachHang.add(dangKy.get(5));
		khachHang.get(6).dsDangKy_KhachHang.add(dangKy.get(6));
		khachHang.get(7).dsDangKy_KhachHang.add(dangKy.get(7));
		khachHang.get(8).dsDangKy_KhachHang.add(dangKy.get(8));
		khachHang.get(9).dsDangKy_KhachHang.add(dangKy.get(9));
		khachHang.get(10).dsDangKy_KhachHang.add(dangKy.get(10));
		khachHang.get(11).dsDangKy_KhachHang.add(dangKy.get(11));
		khachHang.get(12).dsDangKy_KhachHang.add(dangKy.get(12));
		khachHang.get(13).dsDangKy_KhachHang.add(dangKy.get(13));
		khachHang.get(14).dsDangKy_KhachHang.add(dangKy.get(14));
		khachHang.get(15).dsDangKy_KhachHang.add(dangKy.get(15));
		khachHang.get(16).dsDangKy_KhachHang.add(dangKy.get(16));
		khachHang.get(17).dsDangKy_KhachHang.add(dangKy.get(17));
		khachHang.get(18).dsDangKy_KhachHang.add(dangKy.get(18));
		khachHang.get(19).dsDangKy_KhachHang.add(dangKy.get(19));
		khachHang.get(21).dsDangKy_KhachHang.add(dangKy.get(20));
		khachHang.get(22).dsDangKy_KhachHang.add(dangKy.get(21));
		khachHang.get(23).dsDangKy_KhachHang.add(dangKy.get(22));
		khachHang.get(24).dsDangKy_KhachHang.add(dangKy.get(23));
		khachHang.get(25).dsDangKy_KhachHang.add(dangKy.get(24));
		khachHang.get(26).dsDangKy_KhachHang.add(dangKy.get(25));
		khachHang.get(27).dsDangKy_KhachHang.add(dangKy.get(26));
		khachHang.get(28).dsDangKy_KhachHang.add(dangKy.get(27));
		khachHang.get(29).dsDangKy_KhachHang.add(dangKy.get(28));
		khachHang.get(24).dsDangKy_KhachHang.add(dangKy.get(29));
		khachHang.get(15).dsDangKy_KhachHang.add(dangKy.get(30));
		khachHang.get(2).dsDangKy_KhachHang.add(dangKy.get(31));
		khachHang.get(25).dsDangKy_KhachHang.add(dangKy.get(32));
		khachHang.get(20).dsDangKy_KhachHang.add(dangKy.get(33));
		khachHang.get(17).dsDangKy_KhachHang.add(dangKy.get(34));
		khachHang.get(20).dsDangKy_KhachHang.add(dangKy.get(35));
		khachHang.get(14).dsDangKy_KhachHang.add(dangKy.get(36));
		khachHang.get(5).dsDangKy_KhachHang.add(dangKy.get(37));

		// tạo dsDangKy_Ve
		ve.get(0).dsDangKy_Ve.add(dangKy.get(1));
		ve.get(2).dsDangKy_Ve.add(dangKy.get(0));
		ve.get(5).dsDangKy_Ve.add(dangKy.get(2));
		ve.get(6).dsDangKy_Ve.add(dangKy.get(3));
		ve.get(10).dsDangKy_Ve.add(dangKy.get(4));
		ve.get(8).dsDangKy_Ve.add(dangKy.get(5));
		ve.get(2).dsDangKy_Ve.add(dangKy.get(6));
		ve.get(3).dsDangKy_Ve.add(dangKy.get(7));
		ve.get(9).dsDangKy_Ve.add(dangKy.get(8));
		ve.get(12).dsDangKy_Ve.add(dangKy.get(9));
		ve.get(6).dsDangKy_Ve.add(dangKy.get(10));
		ve.get(4).dsDangKy_Ve.add(dangKy.get(11));
		ve.get(3).dsDangKy_Ve.add(dangKy.get(12));
		ve.get(1).dsDangKy_Ve.add(dangKy.get(13));
		ve.get(0).dsDangKy_Ve.add(dangKy.get(14));
		ve.get(12).dsDangKy_Ve.add(dangKy.get(15));
		ve.get(5).dsDangKy_Ve.add(dangKy.get(16));
		ve.get(7).dsDangKy_Ve.add(dangKy.get(17));
		ve.get(9).dsDangKy_Ve.add(dangKy.get(18));
		ve.get(4).dsDangKy_Ve.add(dangKy.get(19));
		ve.get(10).dsDangKy_Ve.add(dangKy.get(20));
		ve.get(1).dsDangKy_Ve.add(dangKy.get(21));
		ve.get(2).dsDangKy_Ve.add(dangKy.get(22));
		ve.get(6).dsDangKy_Ve.add(dangKy.get(23));
		ve.get(7).dsDangKy_Ve.add(dangKy.get(24));
		ve.get(9).dsDangKy_Ve.add(dangKy.get(25));
		ve.get(12).dsDangKy_Ve.add(dangKy.get(26));
		ve.get(11).dsDangKy_Ve.add(dangKy.get(27));
		ve.get(10).dsDangKy_Ve.add(dangKy.get(28));
		ve.get(5).dsDangKy_Ve.add(dangKy.get(29));
		ve.get(9).dsDangKy_Ve.add(dangKy.get(30));
		ve.get(8).dsDangKy_Ve.add(dangKy.get(31));
		ve.get(10).dsDangKy_Ve.add(dangKy.get(32));
		ve.get(7).dsDangKy_Ve.add(dangKy.get(33));
		ve.get(12).dsDangKy_Ve.add(dangKy.get(34));
		ve.get(8).dsDangKy_Ve.add(dangKy.get(35));
		ve.get(2).dsDangKy_Ve.add(dangKy.get(36));
		ve.get(0).dsDangKy_Ve.add(dangKy.get(37));

		daiLy.get(0).dsDangKy_daiLy.add(dangKy.get(0));
		daiLy.get(1).dsDangKy_daiLy.add(dangKy.get(1));
		daiLy.get(2).dsDangKy_daiLy.add(dangKy.get(2));
		daiLy.get(3).dsDangKy_daiLy.add(dangKy.get(3));
		daiLy.get(4).dsDangKy_daiLy.add(dangKy.get(4));
		daiLy.get(5).dsDangKy_daiLy.add(dangKy.get(5));
		daiLy.get(6).dsDangKy_daiLy.add(dangKy.get(6));
		daiLy.get(7).dsDangKy_daiLy.add(dangKy.get(7));
		daiLy.get(8).dsDangKy_daiLy.add(dangKy.get(8));
		daiLy.get(9).dsDangKy_daiLy.add(dangKy.get(9));
		daiLy.get(1).dsDangKy_daiLy.add(dangKy.get(10));
		daiLy.get(3).dsDangKy_daiLy.add(dangKy.get(11));
		daiLy.get(5).dsDangKy_daiLy.add(dangKy.get(12));
		daiLy.get(7).dsDangKy_daiLy.add(dangKy.get(13));
		daiLy.get(9).dsDangKy_daiLy.add(dangKy.get(14));
		daiLy.get(0).dsDangKy_daiLy.add(dangKy.get(15));
		daiLy.get(2).dsDangKy_daiLy.add(dangKy.get(16));
		daiLy.get(4).dsDangKy_daiLy.add(dangKy.get(17));
		daiLy.get(6).dsDangKy_daiLy.add(dangKy.get(18));
		daiLy.get(8).dsDangKy_daiLy.add(dangKy.get(19));
		daiLy.get(2).dsDangKy_daiLy.add(dangKy.get(20));
		daiLy.get(3).dsDangKy_daiLy.add(dangKy.get(21));
		daiLy.get(5).dsDangKy_daiLy.add(dangKy.get(22));
		daiLy.get(7).dsDangKy_daiLy.add(dangKy.get(23));
		daiLy.get(1).dsDangKy_daiLy.add(dangKy.get(24));
		daiLy.get(4).dsDangKy_daiLy.add(dangKy.get(25));
		daiLy.get(9).dsDangKy_daiLy.add(dangKy.get(26));
		daiLy.get(4).dsDangKy_daiLy.add(dangKy.get(27));
		daiLy.get(8).dsDangKy_daiLy.add(dangKy.get(28));
		daiLy.get(6).dsDangKy_daiLy.add(dangKy.get(29));
		daiLy.get(0).dsDangKy_daiLy.add(dangKy.get(30));
		daiLy.get(1).dsDangKy_daiLy.add(dangKy.get(31));
		daiLy.get(7).dsDangKy_daiLy.add(dangKy.get(32));
		daiLy.get(9).dsDangKy_daiLy.add(dangKy.get(33));
		daiLy.get(3).dsDangKy_daiLy.add(dangKy.get(34));
		daiLy.get(5).dsDangKy_daiLy.add(dangKy.get(35));
		daiLy.get(2).dsDangKy_daiLy.add(dangKy.get(36));
		daiLy.get(8).dsDangKy_daiLy.add(dangKy.get(37));

	}

	// DUC
	public static void TaoDanhSachDaiLy() {
		daiLy.add(new DAILY("DL001", "Nam Hà", "TP. Hồ Chí Minh", "0963548754", "s", new ArrayList<NHANVIEN>(),
				new ArrayList<DANGKY>()));
		daiLy.add(new DAILY("DL002", "Ngọc Nam", "Hà Nội", "0958758754", "", new ArrayList<NHANVIEN>(),
				new ArrayList<DANGKY>()));
		daiLy.add(new DAILY("DL003", "Giang Tiến", "Bình Định", "0942118754", "", new ArrayList<NHANVIEN>(),
				new ArrayList<DANGKY>()));
		daiLy.add(new DAILY("DL004", "Hưng Nguyễn", "Thái Bình", "0925628754", "", new ArrayList<NHANVIEN>(),
				new ArrayList<DANGKY>()));
		daiLy.add(
				new DAILY("DL005", "Bình Minh", "Phú Yên", "0912352754", "", new ArrayList<NHANVIEN>(),
						new ArrayList<DANGKY>()));
		daiLy.add(new DAILY("DL006", "Hoàng Hôn", "Bình Dương", "0963123454", "", new ArrayList<NHANVIEN>(),
				new ArrayList<DANGKY>()));
		daiLy.add(new DAILY("DL007", "Trương Vinh", "Đồng Nai", "0964232154", "", new ArrayList<NHANVIEN>(),
				new ArrayList<DANGKY>()));
		daiLy.add(
				new DAILY("DL008", "Cát Tiên", "Nghệ An", "0967545754", "", new ArrayList<NHANVIEN>(),
						new ArrayList<DANGKY>()));
		daiLy.add(new DAILY("DL009", "Hà Nội", "Phú Thọ", "0961552754", "", new ArrayList<NHANVIEN>(),
				new ArrayList<DANGKY>()));
		daiLy.add(new DAILY("DL010", "Vương Minh", "Đà Nẵng", "0957842754", "", new ArrayList<NHANVIEN>(),
				new ArrayList<DANGKY>()));
	}

	public static void TaoDanhSachChucVu() {
		chucVu.add(new CHUCVU("CV001", "Quản Lý", new ArrayList<NHANVIEN>()));
		chucVu.add(new CHUCVU("CV002", "Nhân viên bán vé", new ArrayList<NHANVIEN>()));
		chucVu.add(new CHUCVU("CV003", "Nhân viên marketing", new ArrayList<NHANVIEN>()));
		chucVu.add(new CHUCVU("CV004", "Hướng dẫn viên du lịch", new ArrayList<NHANVIEN>()));
		chucVu.add(new CHUCVU("CV005", "Tài xế", new ArrayList<NHANVIEN>()));
		chucVu.add(new CHUCVU("CV006", "Lao công", new ArrayList<NHANVIEN>()));
		chucVu.add(new CHUCVU("CV007", "Bảo vệ", new ArrayList<NHANVIEN>()));

	}

	public static void TaoDanhSachNhanVien() {
		nhanVien.add(new NHANVIEN("NV001", "Hoàng Tấn Hải", IsoChronology.INSTANCE.date(2001, 02, 22), "Nam", "TP. Hồ Chí Minh",
				"0963421474", chucVu.get(3).MaSoCV, daiLy.get(3).MaSoDL, chucVu.get(3), daiLy.get(0),
				new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV002", "Hồ Ngọc Hà", IsoChronology.INSTANCE.date(1987, 02, 26), "Nữ", "Hà Nội", "0963421324",
				chucVu.get(1).MaSoCV, daiLy.get(1).MaSoDL, chucVu.get(1), daiLy.get(1), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV003", "Dương Thị An", IsoChronology.INSTANCE.date(1999, 01, 21), "Nữ", "Bình Định", "0963441474",
				chucVu.get(2).MaSoCV, daiLy.get(2).MaSoDL, chucVu.get(2), daiLy.get(2), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV004", "Trần Tiến Tài", IsoChronology.INSTANCE.date(1998, 02, 11), "Nam", "Thái Bình",
				"0913241474", chucVu.get(3).MaSoCV, daiLy.get(3).MaSoDL, chucVu.get(3), daiLy.get(3),
				new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV005", "Trần Công Minh", IsoChronology.INSTANCE.date(2001, 02, 07), "Nam", "Phú Yên", "0963453134",
				chucVu.get(4).MaSoCV, daiLy.get(4).MaSoDL, chucVu.get(4), daiLy.get(4), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV006", "Nguyễn Hoàng Thái", IsoChronology.INSTANCE.date(2001, 02, 02), "Nam", "Đồng Nai",
				"0963413574", chucVu.get(5).MaSoCV, daiLy.get(5).MaSoDL, chucVu.get(5), daiLy.get(5),
				new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV007", "Võ Quốc Nam", IsoChronology.INSTANCE.date(2001, 02, 05), "Nam", "Bình Dương", "0963632274",
				chucVu.get(6).MaSoCV, daiLy.get(6).MaSoDL, chucVu.get(6), daiLy.get(6), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV008", "Trần Anh Khoa", IsoChronology.INSTANCE.date(2005, 10, 22), "Nam", "Nghệ An", "0963125274",
				chucVu.get(1).MaSoCV, daiLy.get(7).MaSoDL, chucVu.get(1), daiLy.get(7), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV009", "Nguyễn Quốc Thái", IsoChronology.INSTANCE.date(2000, 02, 11), "Nam", "Hà Nội",
				"0953231474", chucVu.get(1).MaSoCV, daiLy.get(8).MaSoDL, chucVu.get(1), daiLy.get(8),
				new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV010", "Pham Nam Phương", IsoChronology.INSTANCE.date(1997, 9, 13), "Nữ", "Đà Nẵng", "0963555474",
				chucVu.get(2).MaSoCV, daiLy.get(9).MaSoDL, chucVu.get(2), daiLy.get(9), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV011", "Trịnh Châu", IsoChronology.INSTANCE.date(2001, 10, 16), "Nữ", "Bình Định", "093156486",
				chucVu.get(0).MaSoCV, daiLy.get(0).MaSoDL, chucVu.get(0), daiLy.get(0), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV012", "Phan Hoàng Hải", IsoChronology.INSTANCE.date(2001, 05, 17), "Nam", "Thái Bình",
				"0316899427", chucVu.get(0).MaSoCV, daiLy.get(1).MaSoDL, chucVu.get(0), daiLy.get(1),
				new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV013", "Nam An", IsoChronology.INSTANCE.date(1999, 01, 21), "Nữ", "Bình Định", "0935645614",
				chucVu.get(0).MaSoCV, daiLy.get(2).MaSoDL, chucVu.get(0), daiLy.get(2), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV014", "Nguyễn Tấn Tài", IsoChronology.INSTANCE.date(1998, 02, 11), "Nam", "Thái Bình",
				"0813216541", chucVu.get(0).MaSoCV, daiLy.get(3).MaSoDL, chucVu.get(0), daiLy.get(3),
				new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV015", "Trần Minh", IsoChronology.INSTANCE.date(2001, 02, 07), "Nam", "Phú Yên", "0321564141",
				chucVu.get(0).MaSoCV, daiLy.get(4).MaSoDL, chucVu.get(0), daiLy.get(4), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV016", "Nguyễn Hoàng Khải", IsoChronology.INSTANCE.date(2001, 02, 02), "Nam", "Đồng Nai",
				"03461752642", chucVu.get(0).MaSoCV, daiLy.get(5).MaSoDL, chucVu.get(0), daiLy.get(5),
				new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV017", "Võ Quốc Tiến", IsoChronology.INSTANCE.date(2001, 02, 05), "Nam", "Bình Dương",
				"0214651274", chucVu.get(0).MaSoCV, daiLy.get(6).MaSoDL, chucVu.get(0), daiLy.get(6),
				new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV018", "Trần Nam Khoa", IsoChronology.INSTANCE.date(2005, 10, 22), "Nam", "Nghệ An", "0823225274",
				chucVu.get(0).MaSoCV, daiLy.get(7).MaSoDL, chucVu.get(0), daiLy.get(7), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV019", "Dư Quốc Nam", IsoChronology.INSTANCE.date(2000, 02, 11), "Nam", "Đà Nẵng", "055222474",
				chucVu.get(0).MaSoCV, daiLy.get(8).MaSoDL, chucVu.get(0), daiLy.get(8), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV020", "Phạm Nam Hương", IsoChronology.INSTANCE.date(1997, 9, 13), "Nữ", "Đà Nẵng", "013555474",
				chucVu.get(0).MaSoCV, daiLy.get(9).MaSoDL, chucVu.get(0), daiLy.get(9), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV021", "Trịnh Châu", IsoChronology.INSTANCE.date(2001, 10, 16), "Nữ", "Bình Dương", "012221232",
				chucVu.get(3).MaSoCV, daiLy.get(5).MaSoDL, chucVu.get(3), daiLy.get(5), new ArrayList<PHANCONG>()));
		nhanVien.add(new NHANVIEN("NV022", "Dương Khải Phong", IsoChronology.INSTANCE.date(2001, 05, 17), "Nam", "Nghệ An", "09612324",
				chucVu.get(4).MaSoCV, daiLy.get(3).MaSoDL, chucVu.get(4), daiLy.get(3), new ArrayList<PHANCONG>()));

		daiLy.get(0).dsNhanVien_daily.add(nhanVien.get(0));
		daiLy.get(1).dsNhanVien_daily.add(nhanVien.get(1));
		daiLy.get(2).dsNhanVien_daily.add(nhanVien.get(2));
		daiLy.get(3).dsNhanVien_daily.add(nhanVien.get(3));
		daiLy.get(4).dsNhanVien_daily.add(nhanVien.get(4));
		daiLy.get(5).dsNhanVien_daily.add(nhanVien.get(5));
		daiLy.get(6).dsNhanVien_daily.add(nhanVien.get(6));
		daiLy.get(7).dsNhanVien_daily.add(nhanVien.get(7));
		daiLy.get(8).dsNhanVien_daily.add(nhanVien.get(8));
		daiLy.get(9).dsNhanVien_daily.add(nhanVien.get(9));
		daiLy.get(0).dsNhanVien_daily.add(nhanVien.get(10));
		daiLy.get(1).dsNhanVien_daily.add(nhanVien.get(11));
		daiLy.get(2).dsNhanVien_daily.add(nhanVien.get(12));
		daiLy.get(3).dsNhanVien_daily.add(nhanVien.get(13));
		daiLy.get(4).dsNhanVien_daily.add(nhanVien.get(14));
		daiLy.get(5).dsNhanVien_daily.add(nhanVien.get(15));
		daiLy.get(6).dsNhanVien_daily.add(nhanVien.get(16));
		daiLy.get(7).dsNhanVien_daily.add(nhanVien.get(17));
		daiLy.get(8).dsNhanVien_daily.add(nhanVien.get(18));
		daiLy.get(9).dsNhanVien_daily.add(nhanVien.get(19));
		daiLy.get(5).dsNhanVien_daily.add(nhanVien.get(20));
		daiLy.get(3).dsNhanVien_daily.add(nhanVien.get(21));

		chucVu.get(3).dsNhanVien_ChucVu.add(nhanVien.get(0));
		chucVu.get(1).dsNhanVien_ChucVu.add(nhanVien.get(1));
		chucVu.get(2).dsNhanVien_ChucVu.add(nhanVien.get(2));
		chucVu.get(3).dsNhanVien_ChucVu.add(nhanVien.get(3));
		chucVu.get(4).dsNhanVien_ChucVu.add(nhanVien.get(4));
		chucVu.get(5).dsNhanVien_ChucVu.add(nhanVien.get(5));
		chucVu.get(6).dsNhanVien_ChucVu.add(nhanVien.get(6));
		chucVu.get(1).dsNhanVien_ChucVu.add(nhanVien.get(7));
		chucVu.get(1).dsNhanVien_ChucVu.add(nhanVien.get(8));
		chucVu.get(2).dsNhanVien_ChucVu.add(nhanVien.get(9));
		chucVu.get(0).dsNhanVien_ChucVu.add(nhanVien.get(10));
		chucVu.get(0).dsNhanVien_ChucVu.add(nhanVien.get(11));
		chucVu.get(0).dsNhanVien_ChucVu.add(nhanVien.get(12));
		chucVu.get(0).dsNhanVien_ChucVu.add(nhanVien.get(13));
		chucVu.get(0).dsNhanVien_ChucVu.add(nhanVien.get(14));
		chucVu.get(0).dsNhanVien_ChucVu.add(nhanVien.get(15));
		chucVu.get(0).dsNhanVien_ChucVu.add(nhanVien.get(16));
		chucVu.get(0).dsNhanVien_ChucVu.add(nhanVien.get(17));
		chucVu.get(0).dsNhanVien_ChucVu.add(nhanVien.get(18));
		chucVu.get(0).dsNhanVien_ChucVu.add(nhanVien.get(19));
		chucVu.get(3).dsNhanVien_ChucVu.add(nhanVien.get(20));
		chucVu.get(4).dsNhanVien_ChucVu.add(nhanVien.get(21));

		
		daiLy.get(0).MaNgQL = nhanVien.get(10).MaSoNV;
		daiLy.get(0).NhanVien = new NHANVIEN(nhanVien.get(10));

		daiLy.get(1).MaNgQL = nhanVien.get(11).MaSoNV;
		daiLy.get(1).NhanVien = new NHANVIEN(nhanVien.get(11));

		daiLy.get(2).MaNgQL = nhanVien.get(12).MaSoNV;
		daiLy.get(2).NhanVien = new NHANVIEN(nhanVien.get(12));

		daiLy.get(3).MaNgQL = nhanVien.get(13).MaSoNV;
		daiLy.get(3).NhanVien = new NHANVIEN(nhanVien.get(13));

		daiLy.get(4).MaNgQL = nhanVien.get(14).MaSoNV;
		daiLy.get(4).NhanVien = new NHANVIEN(nhanVien.get(14));

		daiLy.get(5).MaNgQL = nhanVien.get(15).MaSoNV;
		daiLy.get(5).NhanVien = new NHANVIEN(nhanVien.get(15));

		daiLy.get(6).MaNgQL = nhanVien.get(16).MaSoNV;
		daiLy.get(6).NhanVien = new NHANVIEN(nhanVien.get(16));

		daiLy.get(7).MaNgQL = nhanVien.get(17).MaSoNV;
		daiLy.get(7).NhanVien = new NHANVIEN(nhanVien.get(17));

		daiLy.get(8).MaNgQL = nhanVien.get(18).MaSoNV;
		daiLy.get(8).NhanVien = new NHANVIEN(nhanVien.get(18));

		daiLy.get(9).MaNgQL = nhanVien.get(19).MaSoNV;
		daiLy.get(9).NhanVien = new NHANVIEN(nhanVien.get(19));

	}

	public static void TaoDanhSachPhanCong() {
		phanCong.add(new PHANCONG(nhanVien.get(0).MaSoNV, tour.get(0).MaSoTour, nhanVien.get(0), tour.get(0)));
		phanCong.add(new PHANCONG(nhanVien.get(1).MaSoNV, tour.get(0).MaSoTour, nhanVien.get(1), tour.get(0)));
		phanCong.add(new PHANCONG(nhanVien.get(2).MaSoNV, tour.get(0).MaSoTour, nhanVien.get(2), tour.get(0)));
		phanCong.add(new PHANCONG(nhanVien.get(3).MaSoNV, tour.get(0).MaSoTour, nhanVien.get(3), tour.get(0)));
		phanCong.add(new PHANCONG(nhanVien.get(4).MaSoNV, tour.get(0).MaSoTour, nhanVien.get(4), tour.get(0)));
		phanCong.add(new PHANCONG(nhanVien.get(0).MaSoNV, tour.get(1).MaSoTour, nhanVien.get(0), tour.get(1)));
		phanCong.add(new PHANCONG(nhanVien.get(1).MaSoNV, tour.get(1).MaSoTour, nhanVien.get(1), tour.get(1)));
		phanCong.add(new PHANCONG(nhanVien.get(2).MaSoNV, tour.get(1).MaSoTour, nhanVien.get(2), tour.get(1)));
		phanCong.add(new PHANCONG(nhanVien.get(0).MaSoNV, tour.get(2).MaSoTour, nhanVien.get(0), tour.get(2)));
		phanCong.add(new PHANCONG(nhanVien.get(3).MaSoNV, tour.get(2).MaSoTour, nhanVien.get(3), tour.get(2)));
		phanCong.add(new PHANCONG(nhanVien.get(0).MaSoNV, tour.get(3).MaSoTour, nhanVien.get(0), tour.get(3)));
		phanCong.add(new PHANCONG(nhanVien.get(4).MaSoNV, tour.get(3).MaSoTour, nhanVien.get(4), tour.get(3)));
		phanCong.add(new PHANCONG(nhanVien.get(5).MaSoNV, tour.get(3).MaSoTour, nhanVien.get(5), tour.get(3)));
		phanCong.add(new PHANCONG(nhanVien.get(0).MaSoNV, tour.get(4).MaSoTour, nhanVien.get(0), tour.get(4)));
		phanCong.add(new PHANCONG(nhanVien.get(5).MaSoNV, tour.get(4).MaSoTour, nhanVien.get(5), tour.get(4)));
		phanCong.add(new PHANCONG(nhanVien.get(6).MaSoNV, tour.get(4).MaSoTour, nhanVien.get(6), tour.get(4)));
		phanCong.add(new PHANCONG(nhanVien.get(7).MaSoNV, tour.get(4).MaSoTour, nhanVien.get(7), tour.get(4)));
		phanCong.add(new PHANCONG(nhanVien.get(8).MaSoNV, tour.get(5).MaSoTour, nhanVien.get(8), tour.get(5)));
		phanCong.add(new PHANCONG(nhanVien.get(8).MaSoNV, tour.get(5).MaSoTour, nhanVien.get(8), tour.get(5)));
		phanCong.add(new PHANCONG(nhanVien.get(9).MaSoNV, tour.get(5).MaSoTour, nhanVien.get(9), tour.get(5)));
		phanCong.add(new PHANCONG(nhanVien.get(9).MaSoNV, tour.get(5).MaSoTour, nhanVien.get(9), tour.get(5)));
		phanCong.add(new PHANCONG(nhanVien.get(20).MaSoNV, tour.get(5).MaSoTour, nhanVien.get(20), tour.get(5)));
		phanCong.add(new PHANCONG(nhanVien.get(21).MaSoNV, tour.get(6).MaSoTour, nhanVien.get(21), tour.get(6)));
		phanCong.add(new PHANCONG(nhanVien.get(21).MaSoNV, tour.get(6).MaSoTour, nhanVien.get(21), tour.get(6)));
		phanCong.add(new PHANCONG(nhanVien.get(0).MaSoNV, tour.get(7).MaSoTour, nhanVien.get(0), tour.get(7)));
		phanCong.add(new PHANCONG(nhanVien.get(1).MaSoNV, tour.get(8).MaSoTour, nhanVien.get(1), tour.get(8)));
		phanCong.add(new PHANCONG(nhanVien.get(2).MaSoNV, tour.get(9).MaSoTour, nhanVien.get(2), tour.get(9)));
		phanCong.add(new PHANCONG(nhanVien.get(3).MaSoNV, tour.get(10).MaSoTour, nhanVien.get(3), tour.get(10)));
		phanCong.add(new PHANCONG(nhanVien.get(4).MaSoNV, tour.get(11).MaSoTour, nhanVien.get(4), tour.get(11)));
		phanCong.add(new PHANCONG(nhanVien.get(5).MaSoNV, tour.get(12).MaSoTour, nhanVien.get(5), tour.get(12)));
		phanCong.add(new PHANCONG(nhanVien.get(6).MaSoNV, tour.get(7).MaSoTour, nhanVien.get(6), tour.get(7)));
		phanCong.add(new PHANCONG(nhanVien.get(7).MaSoNV, tour.get(8).MaSoTour, nhanVien.get(7), tour.get(8)));

		nhanVien.get(0).dsPhanCong_nhanvien.add(phanCong.get(0));
		nhanVien.get(1).dsPhanCong_nhanvien.add(phanCong.get(1));
		nhanVien.get(2).dsPhanCong_nhanvien.add(phanCong.get(2));
		nhanVien.get(3).dsPhanCong_nhanvien.add(phanCong.get(3));
		nhanVien.get(4).dsPhanCong_nhanvien.add(phanCong.get(4));
		nhanVien.get(0).dsPhanCong_nhanvien.add(phanCong.get(5));
		nhanVien.get(1).dsPhanCong_nhanvien.add(phanCong.get(6));
		nhanVien.get(2).dsPhanCong_nhanvien.add(phanCong.get(7));
		nhanVien.get(0).dsPhanCong_nhanvien.add(phanCong.get(8));
		nhanVien.get(3).dsPhanCong_nhanvien.add(phanCong.get(9));
		nhanVien.get(0).dsPhanCong_nhanvien.add(phanCong.get(10));
		nhanVien.get(4).dsPhanCong_nhanvien.add(phanCong.get(11));
		nhanVien.get(5).dsPhanCong_nhanvien.add(phanCong.get(12));
		nhanVien.get(0).dsPhanCong_nhanvien.add(phanCong.get(13));
		nhanVien.get(5).dsPhanCong_nhanvien.add(phanCong.get(14));
		nhanVien.get(6).dsPhanCong_nhanvien.add(phanCong.get(15));
		nhanVien.get(7).dsPhanCong_nhanvien.add(phanCong.get(16));
		nhanVien.get(8).dsPhanCong_nhanvien.add(phanCong.get(17));
		nhanVien.get(8).dsPhanCong_nhanvien.add(phanCong.get(18));
		nhanVien.get(9).dsPhanCong_nhanvien.add(phanCong.get(19));
		nhanVien.get(9).dsPhanCong_nhanvien.add(phanCong.get(20));
		nhanVien.get(20).dsPhanCong_nhanvien.add(phanCong.get(20));
		nhanVien.get(21).dsPhanCong_nhanvien.add(phanCong.get(21));
		nhanVien.get(21).dsPhanCong_nhanvien.add(phanCong.get(21));
		nhanVien.get(0).dsPhanCong_nhanvien.add(phanCong.get(24));
		nhanVien.get(1).dsPhanCong_nhanvien.add(phanCong.get(25));
		nhanVien.get(2).dsPhanCong_nhanvien.add(phanCong.get(26));
		nhanVien.get(3).dsPhanCong_nhanvien.add(phanCong.get(27));
		nhanVien.get(4).dsPhanCong_nhanvien.add(phanCong.get(28));
		nhanVien.get(5).dsPhanCong_nhanvien.add(phanCong.get(29));
		nhanVien.get(6).dsPhanCong_nhanvien.add(phanCong.get(30));
		nhanVien.get(7).dsPhanCong_nhanvien.add(phanCong.get(31));
		//
		tour.get(0).dsPhanCong_Tour.add(phanCong.get(0));
		tour.get(0).dsPhanCong_Tour.add(phanCong.get(1));
		tour.get(0).dsPhanCong_Tour.add(phanCong.get(2));
		tour.get(0).dsPhanCong_Tour.add(phanCong.get(3));
		tour.get(0).dsPhanCong_Tour.add(phanCong.get(4));
		tour.get(1).dsPhanCong_Tour.add(phanCong.get(5));
		tour.get(1).dsPhanCong_Tour.add(phanCong.get(6));
		tour.get(1).dsPhanCong_Tour.add(phanCong.get(7));
		tour.get(2).dsPhanCong_Tour.add(phanCong.get(8));
		tour.get(2).dsPhanCong_Tour.add(phanCong.get(9));
		tour.get(3).dsPhanCong_Tour.add(phanCong.get(10));
		tour.get(3).dsPhanCong_Tour.add(phanCong.get(11));
		tour.get(3).dsPhanCong_Tour.add(phanCong.get(12));
		tour.get(4).dsPhanCong_Tour.add(phanCong.get(13));
		tour.get(4).dsPhanCong_Tour.add(phanCong.get(14));
		tour.get(4).dsPhanCong_Tour.add(phanCong.get(15));
		tour.get(4).dsPhanCong_Tour.add(phanCong.get(16));
		tour.get(5).dsPhanCong_Tour.add(phanCong.get(17));
		tour.get(5).dsPhanCong_Tour.add(phanCong.get(18));
		tour.get(5).dsPhanCong_Tour.add(phanCong.get(19));
		tour.get(5).dsPhanCong_Tour.add(phanCong.get(20));
		tour.get(5).dsPhanCong_Tour.add(phanCong.get(21));
		tour.get(6).dsPhanCong_Tour.add(phanCong.get(22));
		tour.get(6).dsPhanCong_Tour.add(phanCong.get(23));
		tour.get(7).dsPhanCong_Tour.add(phanCong.get(24));
		tour.get(8).dsPhanCong_Tour.add(phanCong.get(25));
		tour.get(9).dsPhanCong_Tour.add(phanCong.get(26));
		tour.get(10).dsPhanCong_Tour.add(phanCong.get(27));
		tour.get(11).dsPhanCong_Tour.add(phanCong.get(28));
		tour.get(12).dsPhanCong_Tour.add(phanCong.get(29));
		tour.get(7).dsPhanCong_Tour.add(phanCong.get(30));
		tour.get(8).dsPhanCong_Tour.add(phanCong.get(31));
	}

	// KHOA
	public static void TaoDanhSachTour() {
		tour.add(new TOUR("T001", "Tour Nam Hội An", IsoChronology.INSTANCE.date(2022, 02, 14), IsoChronology.INSTANCE.date(2022, 02, 18),
				diaDiemDL.get(0).MaSoDD, khachSan.get(11).MaSoKS, phuongTien.get(0).MaSoPT, diaDiemDL.get(0),
				khachSan.get(11), phuongTien.get(0), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T002", "Tour Nha Trang", IsoChronology.INSTANCE.date(2022, 02, 19), IsoChronology.INSTANCE.date(2022, 02, 23),
				diaDiemDL.get(1).MaSoDD, khachSan.get(12).MaSoKS, phuongTien.get(0).MaSoPT, diaDiemDL.get(1),
				khachSan.get(12), phuongTien.get(0), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T003", "Tour Phú Quốc", IsoChronology.INSTANCE.date(2022, 05, 14), IsoChronology.INSTANCE.date(2022, 05, 18),
				diaDiemDL.get(2).MaSoDD, khachSan.get(14).MaSoKS, phuongTien.get(0).MaSoPT, diaDiemDL.get(2),
				khachSan.get(14), phuongTien.get(0), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T004", "Tour Bà Nà Hills", IsoChronology.INSTANCE.date(2022, 06, 14), IsoChronology.INSTANCE.date(2022, 06, 18),
				diaDiemDL.get(3).MaSoDD, khachSan.get(8).MaSoKS, phuongTien.get(2).MaSoPT, diaDiemDL.get(3),
				khachSan.get(8), phuongTien.get(2), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T005", "Tour Huế", IsoChronology.INSTANCE.date(2022, 07, 14), IsoChronology.INSTANCE.date(2022, 07, 18), diaDiemDL.get(4).MaSoDD,
				khachSan.get(16).MaSoKS, phuongTien.get(2).MaSoPT, diaDiemDL.get(4), khachSan.get(16),
				phuongTien.get(2), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T006", "Tour Củ Chi", IsoChronology.INSTANCE.date(2022, 9, 14), IsoChronology.INSTANCE.date(2022, 9, 18), diaDiemDL.get(5).MaSoDD,
				khachSan.get(18).MaSoKS, phuongTien.get(3).MaSoPT, diaDiemDL.get(5), khachSan.get(18),
				phuongTien.get(3), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T007", "Tour Vĩnh Hy", IsoChronology.INSTANCE.date(2022, 10, 14), IsoChronology.INSTANCE.date(2022, 10, 18),
				diaDiemDL.get(6).MaSoDD, khachSan.get(20).MaSoKS, phuongTien.get(3).MaSoPT, diaDiemDL.get(6),
				khachSan.get(20), phuongTien.get(3), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T008", "Tour Bản Giốc", IsoChronology.INSTANCE.date(2022, 02, 25), IsoChronology.INSTANCE.date(2022, 02, 28),
				diaDiemDL.get(7).MaSoDD, khachSan.get(22).MaSoKS, phuongTien.get(4).MaSoPT, diaDiemDL.get(7),
				khachSan.get(22), phuongTien.get(4), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T009", "Tour Dinh Độc Lập", IsoChronology.INSTANCE.date(2022, 02, 24), IsoChronology.INSTANCE.date(2022, 02, 27),
				diaDiemDL.get(8).MaSoDD, khachSan.get(19).MaSoKS, phuongTien.get(4).MaSoPT, diaDiemDL.get(8),
				khachSan.get(19), phuongTien.get(4), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T010", "Tour Cam Ranh", IsoChronology.INSTANCE.date(2022, 02, 8), IsoChronology.INSTANCE.date(2022, 02, 10),
				diaDiemDL.get(9).MaSoDD, khachSan.get(13).MaSoKS, phuongTien.get(2).MaSoPT, diaDiemDL.get(9),
				khachSan.get(13), phuongTien.get(2), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T011", "Tour Sơn Trà", IsoChronology.INSTANCE.date(2022, 02, 26), IsoChronology.INSTANCE.date(2022, 02, 28),
				diaDiemDL.get(10).MaSoDD, khachSan.get(7).MaSoKS, phuongTien.get(1).MaSoPT, diaDiemDL.get(10),
				khachSan.get(7), phuongTien.get(1), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T012", "Tour Cà Ná", IsoChronology.INSTANCE.date(2022, 05, 14), IsoChronology.INSTANCE.date(2022, 04, 18),
				diaDiemDL.get(11).MaSoDD, khachSan.get(21).MaSoKS, phuongTien.get(2).MaSoPT, diaDiemDL.get(11),
				khachSan.get(21), phuongTien.get(2), new ArrayList<PHANCONG>()));
		tour.add(new TOUR("T013", "Tour Hội An", IsoChronology.INSTANCE.date(2022, 11, 14), IsoChronology.INSTANCE.date(2022, 12, 18),
				diaDiemDL.get(12).MaSoDD, khachSan.get(11).MaSoKS, phuongTien.get(4).MaSoPT, diaDiemDL.get(12),
				khachSan.get(11), phuongTien.get(4), new ArrayList<PHANCONG>()));

		diaDiemDL.get(0).dsTour_DiaDiemDL.add(tour.get(0));
		diaDiemDL.get(1).dsTour_DiaDiemDL.add(tour.get(1));
		diaDiemDL.get(2).dsTour_DiaDiemDL.add(tour.get(2));
		diaDiemDL.get(3).dsTour_DiaDiemDL.add(tour.get(3));
		diaDiemDL.get(4).dsTour_DiaDiemDL.add(tour.get(4));
		diaDiemDL.get(5).dsTour_DiaDiemDL.add(tour.get(5));
		diaDiemDL.get(6).dsTour_DiaDiemDL.add(tour.get(6));
		diaDiemDL.get(7).dsTour_DiaDiemDL.add(tour.get(7));
		diaDiemDL.get(8).dsTour_DiaDiemDL.add(tour.get(8));
		diaDiemDL.get(9).dsTour_DiaDiemDL.add(tour.get(9));
		diaDiemDL.get(10).dsTour_DiaDiemDL.add(tour.get(10));
		diaDiemDL.get(11).dsTour_DiaDiemDL.add(tour.get(11));
		diaDiemDL.get(12).dsTour_DiaDiemDL.add(tour.get(12));

		khachSan.get(11).dsTour_KhachSan.add(tour.get(0));
		khachSan.get(12).dsTour_KhachSan.add(tour.get(1));
		khachSan.get(14).dsTour_KhachSan.add(tour.get(2));
		khachSan.get(8).dsTour_KhachSan.add(tour.get(3));
		khachSan.get(16).dsTour_KhachSan.add(tour.get(4));
		khachSan.get(18).dsTour_KhachSan.add(tour.get(5));
		khachSan.get(20).dsTour_KhachSan.add(tour.get(6));
		khachSan.get(22).dsTour_KhachSan.add(tour.get(7));
		khachSan.get(19).dsTour_KhachSan.add(tour.get(8));
		khachSan.get(13).dsTour_KhachSan.add(tour.get(9));
		khachSan.get(7).dsTour_KhachSan.add(tour.get(10));
		khachSan.get(21).dsTour_KhachSan.add(tour.get(11));
		khachSan.get(11).dsTour_KhachSan.add(tour.get(12));

		phuongTien.get(0).dsTour_PhuongTien.add(tour.get(0));
		phuongTien.get(0).dsTour_PhuongTien.add(tour.get(1));
		phuongTien.get(0).dsTour_PhuongTien.add(tour.get(2));
		phuongTien.get(2).dsTour_PhuongTien.add(tour.get(3));
		phuongTien.get(2).dsTour_PhuongTien.add(tour.get(4));
		phuongTien.get(3).dsTour_PhuongTien.add(tour.get(5));
		phuongTien.get(3).dsTour_PhuongTien.add(tour.get(6));
		phuongTien.get(4).dsTour_PhuongTien.add(tour.get(7));
		phuongTien.get(4).dsTour_PhuongTien.add(tour.get(8));
		phuongTien.get(2).dsTour_PhuongTien.add(tour.get(9));
		phuongTien.get(1).dsTour_PhuongTien.add(tour.get(10));
		phuongTien.get(2).dsTour_PhuongTien.add(tour.get(11));
		phuongTien.get(4).dsTour_PhuongTien.add(tour.get(12));

		ve.get(0).MaSoTour = tour.get(0).MaSoTour;
		ve.get(0).Tour = new TOUR(tour.get(0));
		ve.get(1).MaSoTour = tour.get(1).MaSoTour;
		ve.get(1).Tour = new TOUR(tour.get(1));
		ve.get(2).MaSoTour = tour.get(2).MaSoTour;
		ve.get(2).Tour = new TOUR(tour.get(2));
		ve.get(3).MaSoTour = tour.get(3).MaSoTour;
		ve.get(3).Tour = new TOUR(tour.get(3));
		ve.get(4).MaSoTour = tour.get(4).MaSoTour;
		ve.get(4).Tour = new TOUR(tour.get(4));
		ve.get(5).MaSoTour = tour.get(5).MaSoTour;
		ve.get(5).Tour = new TOUR(tour.get(5));
		ve.get(6).MaSoTour = tour.get(6).MaSoTour;
		ve.get(6).Tour = new TOUR(tour.get(6));
		ve.get(7).MaSoTour = tour.get(7).MaSoTour;
		ve.get(7).Tour = new TOUR(tour.get(7));
		ve.get(8).MaSoTour = tour.get(8).MaSoTour;
		ve.get(8).Tour = new TOUR(tour.get(8));
		ve.get(9).MaSoTour = tour.get(9).MaSoTour;
		ve.get(9).Tour = new TOUR(tour.get(9));
		ve.get(10).MaSoTour = tour.get(10).MaSoTour;
		ve.get(10).Tour = new TOUR(tour.get(10));
		ve.get(11).MaSoTour = tour.get(11).MaSoTour;
		ve.get(11).Tour = new TOUR(tour.get(11));
		ve.get(12).MaSoTour = tour.get(12).MaSoTour;
		ve.get(12).Tour = new TOUR(tour.get(12));

	}

	public static void TaoDanhSachDiaDiemDL() {
		diaDiemDL.add(new DIADIEMDULICH("DDDL001", "Vinpearl Nam Hội An", "Quảng Nam", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL002", "Vinpearl Nha Trang", "Khánh Hòa", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL003", "Vinpearl Phú Quốc", "Kiên Giang", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL004", "Bà Nà Hills", "Đà Nẵng", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL005", "Kinh thành Huế", "Huế", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL006", "Địa đạo Củ Chi", "TP. Hồ Chí Minh", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL007", "KDL Vĩnh Hy", "Ninh Thuận", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL008", "Thác Bản Giốc", "Cao Bằng", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL009", "Di tích Dinh Độc Lập", "TP. Hồ Chí Minh", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL010", "Vịnh Cam Ranh", "Khánh Hòa", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL011", "Bán đảo Sơn Trà", "Đà Nẵng", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL012", "Hòn Cò Cà Ná ", "Ninh Thuận", new ArrayList<TOUR>()));
		diaDiemDL.add(new DIADIEMDULICH("DDDL013", "Hội An", "Quảng Nam", new ArrayList<TOUR>()));

	}

	public static void TaoDanhSachKhachSan() {
		khachSan.add(new KHACHSAN("KS001", "Sepia", "Đà Lạt", "0123456789", 5, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS002", "Golf Valley", "Đà Lạt", "01314554", 5, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS003", "La Sapinette", "Đà Lạt", "012341855", 4, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS004", "SeaSala", "Vũng Tàu", "03245846", 2, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS005", "Pullman Hotel", "Vũng Tàu", "01234795", 2, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS006", "Marina", "Vũng Tàu", "0123456875", 3, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS007", "Gold Boutique", "Đà Nẵng", "014257989", 3, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS008", "Sumi", "Đà Nẵng", "0124365485", 4, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS009", "Sala", "Đà Nẵng", "0132456854", 2, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS010", "Bamboo", "Sapa", "0324568785", 5, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS011", "Shining Riverside", "Quảng Nam", "04685123", 5, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS012", "Sea’lavie", "Quảng Nam", "024509813", 5, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS013", "Chill Suites", "Khánh Hoà", "054562813", 4, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS014", "Eastin Grand", "Khánh Hoà", "024529813", 3, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS015", "Sea Light", "Kiên Giang", "024569813", 3, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS016", "Yuri", "Kiên Giang", "024569213", 2, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS017", "Amona", "Huế", "024269813", 4, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS018", "Rosaleen", "Huế", "024569213", 4, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS019", "Lotus Laverne", "TP. Hồ Chí Minh", "024269813", 4, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS020", "Silverland", "TP. Hồ Chí Minh", "024569213", 4, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS021", "Annie", "Ninh Thuận", "024569823", 3, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS022", "Casa Maya", "Ninh Thuận", "024529813", 2, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS023", "Jeanne", "Cao Bằng", "024569813", 4, new ArrayList<TOUR>()));
		khachSan.add(new KHACHSAN("KS024", "Micasa", "Cao Bằng", "024569814", 3, new ArrayList<TOUR>()));

	}

	public static void TaoDanhSachPhuongTien() {
		phuongTien.add(new PHUONGTIEN("PT001", "Limousine", "Xe", "Moi", 16, new ArrayList<TOUR>()));
		phuongTien.add(new PHUONGTIEN("PT002", "Taxi", "Xe", "Moi", 6, new ArrayList<TOUR>()));
		phuongTien.add(new PHUONGTIEN("PT003", "Hyundai Universe", "Xe", "Moi", 52, new ArrayList<TOUR>()));
		phuongTien.add(new PHUONGTIEN("PT004", "Vietnam Airline", "Máy bay", "Moi", 300, new ArrayList<TOUR>()));
		phuongTien.add(new PHUONGTIEN("PT005", "ROYAL CARIBBEAN", "Tàu biển", "Moi", 250, new ArrayList<TOUR>()));
		phuongTien.add(new PHUONGTIEN("PT006", "Cát Linh Hà Đông", "Tàu điện", "Moi", 960, new ArrayList<TOUR>()));
	}

	public static void main(String[] args) {

		TaoDanhSachPhuongTien();
		TaoDanhSachKhachSan();
		TaoDanhSachVe();
		TaoDanhSachQuocTich();
		TaoDanhSachKhachHang();
		TaoDanhSachDaiLy();
		TaoDanhSachDangKy();
		TaoDanhSachDiaDiemDL();
		TaoDanhSachTour();
		TaoDanhSachChucVu();
		TaoDanhSachNhanVien();
		TaoDanhSachPhanCong();

		Cau01();
		Cau02();
		Cau03();
		Cau04();
		Cau05();
		Cau06();
		Cau07();
		Cau08();
		Cau09();
		Cau10();
		Cau11();
		Cau12();
		Cau13();
		Cau14();
		Cau15();
	}
	public static void Cau01()
	{
		System.out.println("1. Tìm danh sách họ tên các khách hàng theo thứ tự tên khách hàng có quốc tịch Trung Quốc và đã đăng ký tour 2 lần, sau đó in tên khách sạn họ nghỉ ngơi, tên tour họ đi.");
				
		var dsKhachHang = khachHang.stream()
								.sorted(Comparator.comparing(x -> x.getTen()))
								.filter(p->p.QuocTich.TenQG.equals("Trung Quốc") && p.dsDangKy_KhachHang.size()>1)
								.collect(Collectors.toList());
		for(KHACHHANG kh : dsKhachHang)
		{
			System.out.println(kh.HoVaTenLot + " " + kh.Ten + ": ");
			dangKy.stream()
				  .filter(p -> p.KhachHang.MaSoKH.equalsIgnoreCase(kh.MaSoKH))
				  .map(p -> "    + Nghỉ ngơi ở khách sạn " + p.Ve.Tour.KhachSan.TenKS 
						  		+ " đi " + p.Ve.Tour.TenTour)
				  .forEach(p -> System.out.println(p));
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void Cau02()
	{
		System.out.println("2. Danh sách các tour đi bằng các phương tiện trên 200 chỗ ngồi và số ghế còn trống: ");
		List<PHUONGTIEN> dsPhuongTien = phuongTien.stream()
						.filter(pt -> pt.SucChua > 200)
						.collect(Collectors.toList());
		for(PHUONGTIEN pt : dsPhuongTien)
		{
			System.out.println(pt.LoaiPT + " " + pt.TenPT);
			for(TOUR t : tour)
			{	
				long soLuong = dangKy.stream()
									.filter(dk -> dk.Ve.Tour.MaSoPT.equalsIgnoreCase(pt.MaSoPT)
											&& dk.Ve.MaSoTour.equalsIgnoreCase(t.MaSoTour))
									.count();
				if(soLuong != 0)
				{
					long gheTrong = pt.SucChua - soLuong;
					System.out.println("  + " + t.TenTour + " còn trống " + gheTrong);
				}								
			}
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void Cau03()
	{
		System.out.println("3. Danh sách các nhân viên được dẫn tour bao gồm những tour nào, sắp xếp theo thứ tự mã nhân viên tăng dần: ");
		List<NHANVIEN> dsNhanVienPhanCong = nhanVien.stream()
										.sorted(Comparator.comparing(x -> x.getMaSoNV()))										
										.filter(nv -> nv.dsPhanCong_nhanvien.size()!=0)
										.collect(Collectors.toList());
										
		for(NHANVIEN nv : dsNhanVienPhanCong)
		{
			System.out.println(nv.MaSoNV + " " + nv.TenNV);
			for(PHANCONG pc : nv.dsPhanCong_nhanvien)
				System.out.println("    " + pc.Tour.TenTour);
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void Cau04()
	{
		System.out.println("4. Các đại lý có số nhân viên lớn hơn 2 và số lượt bán lớn hơn 1 "
				+ "đã bán vé cho những khách hàng nào? ");
		List<DAILY> dsDaiLy = daiLy.stream()
									.filter(dl -> dl.dsDangKy_daiLy.size() > 1 && dl.dsNhanVien_daily.size() > 2)
									.collect(Collectors.toList());
	
		for(DAILY dl : dsDaiLy)
		{
			System.out.println("Ở đại lý " + dl.TenDL + " địa chỉ ở " + dl.DiaChi);
			dl.dsDangKy_daiLy.stream()
							.map(dk -> dk.KhachHang.HoVaTenLot + " " + dk.KhachHang.Ten 
									+ " mua vé " + dk.Ve.MaSoVe + " với giá " + dk.Ve.Gia)
							.forEach(s -> System.out.println("    + " + s));			
		}	
		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void Cau05()
	{
		System.out.println("5. Các tour có số lượng người đi lớn hơn 2 gồm có những khách hàng nào mang quốc tích Việt Nam");
		List<VE> dsVe = ve.stream()
				.filter(dl -> dl.dsDangKy_Ve.size() > 2)
				.collect(Collectors.toList());
		for(VE v : dsVe)
		{
			System.out.print("Có " + v.dsDangKy_Ve.size() + " khách hàng đi " + v.Tour.TenTour);
			var dsKHangVN = v.dsDangKy_Ve.stream()
							.filter(p -> p.KhachHang.QuocTich.TenQG.equalsIgnoreCase("Việt Nam"))
							.map(dk -> dk.KhachHang.HoVaTenLot + " " + dk.KhachHang.Ten)
							.collect(Collectors.toList());
			System.out.println(" trong đó có " + dsKHangVN.size() + " khách hàng Việt Nam: ");
			for(var kh : dsKHangVN)
			{
				System.out.println("   + " + kh);
			}
		}	
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	public static void Cau06()
	{
		System.out.println("6. Liệt kê danh sách nhân viên nam trên 20 tuổi");
		nhanVien.stream().filter(x -> x.GioiTinh.equals("Nam") && (LocalDate.now().getYear() - x.NgaySinh.getYear()) > 20)
				.forEach(x -> System.out.println(x.TenNV + " " + (LocalDate.now().getYear() - x.NgaySinh.getYear()) + " tuổi"));
		System.out.println("---------------------------------------------------------------------------------");

	}
	public static void Cau07()
	{
		System.out.println("7. Tìm vé rẻ nhất, in thông tin của vé đó  ");
		VE v = ve.stream().min(Comparator.comparing(x -> x.getGia())).get();

		System.out.println("Mã Số Vé: "+v.MaSoVe + " " +"Giá: "+ v.Gia + "đ");
		System.out.println("Đi Tour: "+v.Tour.TenTour+" "+"Ở Khách Sạn: "+v.Tour.KhachSan.TenKS+" "+"Tham quan Địa Điểm: "+v.Tour.DiaDiemDL.TenDD+" "+ "Đi bằng Phương Tiện: "+v.Tour.PhuongTien.TenPT);

		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void Cau08()
	{
		System.out.println("8. Sắp xếp danh sách khách hàng theo bảng chữ cái");

		khachHang.stream().sorted(Comparator.comparing(x -> x.getTen()))
						.forEach(x -> System.out.println(x.HoVaTenLot + " " + x.Ten));

		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void Cau09()
	{
		System.out.println("9. Liệt kê tour du lịch có khách sạn 5 sao để nghỉ dưỡng");

		tour.stream().filter(x -> x.KhachSan.Sosao ==5).forEach(x -> System.out.println(x.TenTour+" "+"Khách Sạn: "+x.KhachSan.TenKS+" "+"Số Sao: "+x.KhachSan.Sosao));

		System.out.println("---------------------------------------------------------------------------------");

	}
	public static void Cau10()
	{
		System.out.println("10. Liệt kê chức vụ có số nhân viên làm lớn hơn 1 và danh sách nhân viên giữ chức vụ đó");
		List<CHUCVU> kq = chucVu.stream()
					.filter(p -> p.dsNhanVien_ChucVu.size() > 1)
					.collect(Collectors.toList());
		for (CHUCVU cv : kq) {
			System.out.println(cv.TenCV);
			cv.dsNhanVien_ChucVu.stream()
								.map(nv -> nv.TenNV)
								.forEach(p -> System.out.println("\t" + p));
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void Cau11()
	{
		System.out.println("11.Tìm tên tour có mã số tour.");
			TOUR t =
					tour
					.stream()
					.filter(x -> x.MaSoTour.equals("T002"))
					.findFirst().get();
			if(t!=null)
			{	
				System.out.println("-Thông tin tour đó:");
				System.out.println(" +"+t.MaSoTour+"-"+t.TenTour);
			}else
				System.out.println("-không có mã số tour này trong danh sách.");
			System.out.println("---------------------------------------------------------------------------------");
	}
	
	public static void Cau12() {
		System.out.println("12.Liệt kê theo tour theo từng khách sạn");
		List<KHACHSAN> dstour=
				khachSan
				.stream()
				.collect(Collectors.toList());
		for(KHACHSAN ks:dstour)
		{
			
			System.out.println("-"+ks.MaSoKS+"-"+ks.TenKS+":");
			if(ks.dsTour_KhachSan.size()!=0)
			{
				for(TOUR t:ks.dsTour_KhachSan)
				{
					System.out.println(" +"+t.MaSoTour+"-"+t.TenTour);
				}
			}else
				System.out.println(" +Không có tour nào đặt");
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void Cau13() {
	System.out.println("13.Tìm tour có giá vé lớn hơn bằng 6000000 và nằm ở địa điểm du lịch Đà Nẵng");
		List<VE> dstour=
				ve
				.stream()
				.filter(t->t.Gia >= 6000000 && t.Tour.DiaDiemDL.DiaDiem == "Đà Nẵng")
				.collect(Collectors.toList());
		for(VE t:dstour)
		{
			System.out.println("-"+t.Tour.TenTour + "-" + t.Tour.MaSoTour);
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void Cau14() {
	System.out.println("14.Tìm tour có sử dụng phương tiện có sức chứa lớn hơn bằng 50");
		List<TOUR> dstour=
				tour
				.stream()
				.filter(t->t.PhuongTien.SucChua>=50)
				.toList();
		for(TOUR t:dstour)
		{
			System.out.println("-"+t.MaSoTour+"-"+t.TenTour);
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	public static void Cau15() {
	System.out.println("15.Liệt kê tên tour và tên địa điểm tour đó sẽ đến");
		List<TOUR> dstour_dd=
				tour
				.stream()
				.toList();
		for(TOUR t:dstour_dd)
		{
			System.out.println("-"+t.TenTour+"-"+t.DiaDiemDL.TenDD);
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
}
