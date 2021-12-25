using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{
	class Program
	{

		// AN
		static List<QUOCTICH> quocTich = new List<QUOCTICH>();
		static List<KHACHHANG> khachHang = new List<KHACHHANG>();
		static List<VE> ve = new List<VE>();
		static List<DANGKY> dangKy = new List<DANGKY>();

		// DUC
		static List<KHACHSAN> khachSan = new List<KHACHSAN>();
		static List<PHUONGTIEN> phuongTien = new List<PHUONGTIEN>();
		static List<PHANCONG> phanCong = new List<PHANCONG>();
		static List<CHUCVU> chucVu = new List<CHUCVU>();
		// KHOA
		static List<TOUR> tour = new List<TOUR>();
		static List<DAILY> daiLy = new List<DAILY>();
		static List<NHANVIEN> nhanVien = new List<NHANVIEN>();
		static List<DIADIEMDULICH> diaDiemDL = new List<DIADIEMDULICH>();

		//-----------------------------------------------------------------------------------------------------------------------------------
		//An
		public static void TaoDanhSachQuocTich()
		{
			quocTich.Add(new QUOCTICH("QT001", "Việt Nam", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT002", "Trung Quốc", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT003", "Mỹ", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT004", "Lào", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT005", "Bồ Đào Nha", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT006", "Thái Lan", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT007", "Sin-ga-po", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT009", "Anh", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT010", "Đức", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT011", "Nga", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT012", "Ai Cập", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT013", "Hy Lạp", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT014", "Brazil", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT015", "Sudan", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT016", "Nhật Bản", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT017", "Úc", new List<KHACHHANG>()));
			quocTich.Add(new QUOCTICH("QT017", "Úc", new List<KHACHHANG>()));
		}

		public static void TaoDanhSachKhachHang()
		{
			khachHang.Add(new KHACHHANG("KH001", "Nguyễn Hữu", "Ba", 1945, "Nam", quocTich[0].MaQG, "276315549", "Hà Nội", "0386592645", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH002", "Lý Thế", "Dân", 1998, "Nam", quocTich[1].MaQG, "396515549", "Lạc Dương", "0136529456", quocTich[1], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH003", "Nguyễn Thanh", "Tùng", 1996, "Nam", quocTich[0].MaQG, "362558945", "Thái Bình", "0993625105", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH004", "Vladimir Vladimirovich", "Putin", 1952, "Nam", quocTich[10].MaQG, "276315549", "Hà Nội", "0454264538", quocTich[10], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH005", "Cristiano", "Ronaldo", 1976, "Nam", quocTich[4].MaQG, "996351205", "Madeira", "0621539852", quocTich[4], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH006", "Trump", "Donald", 1946, "Nam", quocTich[2].MaQG, "362295586", "New York", "0885967526", quocTich[2], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH007", "Nguyễn Phương", "Hằng", 1970, "Nữ", quocTich[0].MaQG, "253695862", "Bình Dương", "0365298564", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH008", "Đàm Vĩnh", "Hưng", 1976, "Nam", quocTich[0].MaQG, "526152389", "TP. Hồ Chí Minh", "0956823561", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH009", "Alison Swift", "Taylor", 1982, "Nữ", quocTich[2].MaQG, "628539546", "California", "0995362454", quocTich[2], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH010", "Trần Thị Vân", "Anh", 1985, "Nữ", quocTich[0].MaQG, "302652485", "Bình Định", "099645328", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH011", "Phạm Nhật", "Vượng", 1968, "Nam", quocTich[0].MaQG, "625428963", "Hà Nội", "035126968", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH012", "Uchiha", "Sasuke", 1999, "Nam", quocTich[15].MaQG, "659236457", "Tokyo", "065295645", quocTich[15], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH013", "Đỗ Thị", "Huyền", 1997, "Nữ", quocTich[0].MaQG, "352629416", "TP. Hồ Chí Minh", "0142382416", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH014", "Hitler", "Adolf", 1989, "Nam", quocTich[9].MaQG, "236558461", "Berlin", "022362945", quocTich[9], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH015", "Haruno", "Sakura", 1999, "Nữ", quocTich[15].MaQG, "968561645", "Tokyo", "065434189", quocTich[15], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH016", "Lê", "Bảo", 2001, "Nam", quocTich[0].MaQG, "958610385", "Hà Nội", "069584266", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH017", "Lưu", "Bang", 1979, "Nam", quocTich[1].MaQG, "4586235659", "Lạc Dương", "0813214451", quocTich[1], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH018", "Hạng", "Vũ", 1989, "Nam", quocTich[1].MaQG, "366592546", "Giang Đông", "045236116", quocTich[1], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH019", "David", "Beckham", 1989, "Nam", quocTich[9].MaQG, "986216812", "Luân Đôn", "054268564", quocTich[9], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH020", "Trump", "Paron", 2002, "Nam", quocTich[2].MaQG, "625398542", "New York", "0625392516", quocTich[2], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH021", "Lê Thị", "Vân", 2009, "Nữ", quocTich[0].MaQG, "", "Hà Nội", "", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH022", "Cristiano", "Jr", 2010, "Nam", quocTich[4].MaQG, "", "Madeira", "", quocTich[4], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH023", "Lê", "Bình", 2008, "Nam", quocTich[0].MaQG, "", "Hà Nội", "", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH024", "Nguyễn Thanh", "Sơn", 2015, "Nam", quocTich[0].MaQG, "", "Thái Bình", "", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH025", "Lý Kiến", "Thành", 1990, "Nam", quocTich[1].MaQG, "350564198", "Trường An", "0326981916", quocTich[1], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH026", "Lâm Tấn", "Tài", 2000, "Nam", quocTich[0].MaQG, "131321561", "TP. Hồ Chí Minh", "012984154", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH027", "Trình Võ", "Kim", 1985, "Nam", quocTich[0].MaQG, "549877896", "Bình Dương", "0231653178", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH028", "Nguyễn Nhật Kim", "Anh", 2001, "Nữ", quocTich[0].MaQG, "654687112", "Bình Định", "0545078796", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH029", "Trần Thị", "Linh", 1986, "Nữ", quocTich[0].MaQG, "864189745", "Đồng Nai", "072180964", quocTich[0], new List<DANGKY>()));
			khachHang.Add(new KHACHHANG("KH030", "Võ", "Jenny", 2010, "Nữ", quocTich[0].MaQG, "347565423", "Phú Yên", "045718789", quocTich[0], new List<DANGKY>()));

			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[0]);
			quocTich[1].dsKhachHang_QuocTich.Add(khachHang[1]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[2]);
			quocTich[10].dsKhachHang_QuocTich.Add(khachHang[3]);
			quocTich[4].dsKhachHang_QuocTich.Add(khachHang[4]);
			quocTich[2].dsKhachHang_QuocTich.Add(khachHang[5]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[6]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[7]);
			quocTich[2].dsKhachHang_QuocTich.Add(khachHang[8]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[9]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[10]);
			quocTich[15].dsKhachHang_QuocTich.Add(khachHang[11]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[12]);
			quocTich[9].dsKhachHang_QuocTich.Add(khachHang[13]);
			quocTich[15].dsKhachHang_QuocTich.Add(khachHang[14]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[15]);
			quocTich[1].dsKhachHang_QuocTich.Add(khachHang[16]);
			quocTich[1].dsKhachHang_QuocTich.Add(khachHang[17]);
			quocTich[9].dsKhachHang_QuocTich.Add(khachHang[18]);
			quocTich[2].dsKhachHang_QuocTich.Add(khachHang[19]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[20]);
			quocTich[4].dsKhachHang_QuocTich.Add(khachHang[21]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[22]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[23]);
			quocTich[1].dsKhachHang_QuocTich.Add(khachHang[24]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[25]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[26]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[27]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[28]);
			quocTich[0].dsKhachHang_QuocTich.Add(khachHang[29]);
		}
		public static void TaoDanhSachVe()
		{
			ve.Add(new VE("V001", "", 3000000, new List<DANGKY>()));
			ve.Add(new VE("V002", "", 400000, new List<DANGKY>()));
			ve.Add(new VE("V003", "", 500000, new List<DANGKY>()));
			ve.Add(new VE("V004", "", 5000000, new List<DANGKY>()));
			ve.Add(new VE("V005", "", 3500000, new List<DANGKY>()));
			ve.Add(new VE("V006", "", 900000, new List<DANGKY>()));
			ve.Add(new VE("V007", "", 2000000, new List<DANGKY>()));
			ve.Add(new VE("V008", "", 4500000, new List<DANGKY>()));
			ve.Add(new VE("V009", "", 990000, new List<DANGKY>()));
			ve.Add(new VE("V010", "", 2800000, new List<DANGKY>()));
			ve.Add(new VE("V011", "", 6000000, new List<DANGKY>()));
			ve.Add(new VE("V012", "", 4700000, new List<DANGKY>()));
			ve.Add(new VE("V013", "", 5500000, new List<DANGKY>()));
		}
		public static void TaoDanhSachDangKy()
		{
			dangKy.Add(new DANGKY(ve[2].MaSoVe, khachHang[0].MaSoKH, daiLy[0].MaSoDL, new DateTime(2020, 11, 1), 500000, 500000 - ve[2].Gia, daiLy[0], khachHang[0], ve[2]));
			dangKy.Add(new DANGKY(ve[0].MaSoVe, khachHang[1].MaSoKH, daiLy[1].MaSoDL, new DateTime(2020, 12, 2), 3000000, 3000000-ve[0].Gia, daiLy[1], khachHang[1], ve[0]));
			dangKy.Add(new DANGKY(ve[5].MaSoVe, khachHang[2].MaSoKH, daiLy[2].MaSoDL, new DateTime(2020, 10, 3), 1000000, 1000000 - ve[5].Gia, daiLy[2], khachHang[2], ve[5]));		
			dangKy.Add(new DANGKY(ve[6].MaSoVe, khachHang[3].MaSoKH, daiLy[3].MaSoDL, new DateTime(2020, 11, 4), 2000000, 2000000 - ve[6].Gia, daiLy[3], khachHang[3], ve[6]));
			dangKy.Add(new DANGKY(ve[10].MaSoVe, khachHang[4].MaSoKH, daiLy[4].MaSoDL, new DateTime(2020, 10, 5), 6100000, 6100000 - ve[10].Gia, daiLy[4], khachHang[4], ve[10]));
			dangKy.Add(new DANGKY(ve[8].MaSoVe, khachHang[5].MaSoKH, daiLy[5].MaSoDL, new DateTime(2020, 12, 6), 1000000, 1000000 - ve[8].Gia, daiLy[5], khachHang[5], ve[8]));
			dangKy.Add(new DANGKY(ve[2].MaSoVe, khachHang[6].MaSoKH, daiLy[6].MaSoDL, new DateTime(2020, 11, 7), 500000, 500000 - ve[2].Gia, daiLy[6], khachHang[6], ve[2]));
			dangKy.Add(new DANGKY(ve[3].MaSoVe, khachHang[7].MaSoKH, daiLy[7].MaSoDL, new DateTime(2020, 11, 8), 5000000, 5000000 - ve[3].Gia, daiLy[7], khachHang[7], ve[3]));
			dangKy.Add(new DANGKY(ve[9].MaSoVe, khachHang[8].MaSoKH, daiLy[8].MaSoDL, new DateTime(2020, 12, 9), 2900000, 2900000 - ve[9].Gia, daiLy[8], khachHang[8], ve[9]));
			dangKy.Add(new DANGKY(ve[12].MaSoVe, khachHang[9].MaSoKH, daiLy[9].MaSoDL, new DateTime(2020, 10, 10), 6000000, 6000000 - ve[12].Gia, daiLy[9], khachHang[9], ve[12]));
			dangKy.Add(new DANGKY(ve[6].MaSoVe, khachHang[10].MaSoKH, daiLy[1].MaSoDL, new DateTime(2020, 11, 11), 2000000, 2000000 - ve[6].Gia, daiLy[1], khachHang[10], ve[6]));
			dangKy.Add(new DANGKY(ve[4].MaSoVe, khachHang[11].MaSoKH, daiLy[3].MaSoDL, new DateTime(2020, 10, 12), 3600000, 3600000 - ve[4].Gia, daiLy[3], khachHang[11], ve[4]));
			dangKy.Add(new DANGKY(ve[3].MaSoVe, khachHang[12].MaSoKH, daiLy[5].MaSoDL, new DateTime(2020, 12, 13), 5000000, 5000000 - ve[3].Gia, daiLy[5], khachHang[12], ve[3]));
			dangKy.Add(new DANGKY(ve[1].MaSoVe, khachHang[13].MaSoKH, daiLy[7].MaSoDL, new DateTime(2020, 12, 14), 500000, 500000 - ve[1].Gia, daiLy[7], khachHang[13], ve[1]));
			dangKy.Add(new DANGKY(ve[0].MaSoVe, khachHang[14].MaSoKH, daiLy[9].MaSoDL, new DateTime(2020, 12, 15), 3000000, 3000000 - ve[0].Gia, daiLy[9], khachHang[14], ve[0]));
			dangKy.Add(new DANGKY(ve[12].MaSoVe, khachHang[15].MaSoKH, daiLy[0].MaSoDL, new DateTime(2020, 11, 16), 6000000, 6000000 - ve[12].Gia, daiLy[0], khachHang[15], ve[12]));
			dangKy.Add(new DANGKY(ve[5].MaSoVe, khachHang[16].MaSoKH, daiLy[2].MaSoDL, new DateTime(2020, 10, 17), 1000000, 1000000 - ve[5].Gia, daiLy[2], khachHang[16], ve[5]));
			dangKy.Add(new DANGKY(ve[7].MaSoVe, khachHang[17].MaSoKH, daiLy[4].MaSoDL, new DateTime(2020, 10, 18), 5000000, 5000000 - ve[7].Gia, daiLy[4], khachHang[17], ve[7]));
			dangKy.Add(new DANGKY(ve[9].MaSoVe, khachHang[18].MaSoKH, daiLy[6].MaSoDL, new DateTime(2020, 11, 19), 3000000, 3000000 - ve[9].Gia, daiLy[6], khachHang[18], ve[9]));
			dangKy.Add(new DANGKY(ve[4].MaSoVe, khachHang[19].MaSoKH, daiLy[8].MaSoDL, new DateTime(2020, 11, 20), 3500000, 3500000 - ve[4].Gia, daiLy[8], khachHang[19], ve[4]));
			dangKy.Add(new DANGKY(ve[10].MaSoVe, khachHang[21].MaSoKH, daiLy[2].MaSoDL, new DateTime(2020, 12, 01), 6000000, 6000000 - ve[10].Gia, daiLy[2], khachHang[21], ve[10]));
			dangKy.Add(new DANGKY(ve[1].MaSoVe, khachHang[22].MaSoKH, daiLy[3].MaSoDL, new DateTime(2020, 12, 22), 500000, 500000 - ve[1].Gia, daiLy[3], khachHang[22], ve[1]));
			dangKy.Add(new DANGKY(ve[2].MaSoVe, khachHang[23].MaSoKH, daiLy[5].MaSoDL, new DateTime(2020, 10, 23), 500000, 500000 - ve[2].Gia, daiLy[5], khachHang[23], ve[2]));
			dangKy.Add(new DANGKY(ve[6].MaSoVe, khachHang[24].MaSoKH, daiLy[7].MaSoDL, new DateTime(2020, 11, 24), 2000000, 2000000 - ve[6].Gia, daiLy[7], khachHang[24], ve[6]));
			dangKy.Add(new DANGKY(ve[7].MaSoVe, khachHang[25].MaSoKH, daiLy[1].MaSoDL, new DateTime(2020, 10, 25), 1000000, 1000000 - ve[7].Gia, daiLy[1], khachHang[25], ve[7]));
			dangKy.Add(new DANGKY(ve[9].MaSoVe, khachHang[26].MaSoKH, daiLy[4].MaSoDL, new DateTime(2020, 10, 26), 3000000, 3000000 - ve[9].Gia, daiLy[4], khachHang[26], ve[9]));
			dangKy.Add(new DANGKY(ve[12].MaSoVe, khachHang[27].MaSoKH, daiLy[9].MaSoDL, new DateTime(2020, 12, 27), 5600000, 5600000 - ve[12].Gia, daiLy[9], khachHang[27], ve[12]));
			dangKy.Add(new DANGKY(ve[11].MaSoVe, khachHang[28].MaSoKH, daiLy[4].MaSoDL, new DateTime(2020, 9, 28), 5000000, 5000000 - ve[11].Gia, daiLy[4], khachHang[28], ve[11]));
			dangKy.Add(new DANGKY(ve[10].MaSoVe, khachHang[29].MaSoKH, daiLy[8].MaSoDL, new DateTime(2020, 8, 29), 6000000, 6000000 - ve[10].Gia, daiLy[8], khachHang[29], ve[10]));
			dangKy.Add(new DANGKY(ve[5].MaSoVe, khachHang[24].MaSoKH, daiLy[6].MaSoDL, new DateTime(2020, 10, 30), 900000, 900000 - ve[5].Gia, daiLy[6], khachHang[24], ve[5]));            
			dangKy.Add(new DANGKY(ve[9].MaSoVe, khachHang[15].MaSoKH, daiLy[0].MaSoDL, new DateTime(2020, 1, 31), 2800000, 2800000 - ve[9].Gia, daiLy[0], khachHang[15], ve[9]));
			dangKy.Add(new DANGKY(ve[8].MaSoVe, khachHang[2].MaSoKH, daiLy[1].MaSoDL, new DateTime(2020, 9, 5), 1000000, 1000000 - ve[8].Gia, daiLy[1], khachHang[2], ve[8]));
			dangKy.Add(new DANGKY(ve[10].MaSoVe, khachHang[25].MaSoKH, daiLy[7].MaSoDL, new DateTime(2020, 8, 15), 6000000, 6000000 - ve[10].Gia, daiLy[7], khachHang[25], ve[10]));
			dangKy.Add(new DANGKY(ve[7].MaSoVe, khachHang[20].MaSoKH, daiLy[9].MaSoDL, new DateTime(2020, 11, 19), 4600000, 4600000 - ve[7].Gia, daiLy[9], khachHang[20], ve[7]));
			dangKy.Add(new DANGKY(ve[12].MaSoVe, khachHang[17].MaSoKH, daiLy[3].MaSoDL, new DateTime(2020, 8, 21), 5500000, 5500000 - ve[12].Gia, daiLy[3], khachHang[17], ve[12]));
			dangKy.Add(new DANGKY(ve[8].MaSoVe, khachHang[20].MaSoKH, daiLy[5].MaSoDL, new DateTime(2020, 8, 31), 990000, 990000 - ve[8].Gia, daiLy[5], khachHang[20], ve[8]));
			dangKy.Add(new DANGKY(ve[2].MaSoVe, khachHang[14].MaSoKH, daiLy[2].MaSoDL, new DateTime(2020, 9, 9), 500000, 500000 - ve[2].Gia, daiLy[2], khachHang[14], ve[2]));
			dangKy.Add(new DANGKY(ve[0].MaSoVe, khachHang[5].MaSoKH, daiLy[8].MaSoDL, new DateTime(2020, 8, 27), 3000000, 3000000 - ve[0].Gia, daiLy[8], khachHang[5], ve[0]));
			

			// tạo dsDangKy_KhachHang
			khachHang[0].dsDangKy_KhachHang.Add(dangKy[0]);
			khachHang[1].dsDangKy_KhachHang.Add(dangKy[1]);
			khachHang[2].dsDangKy_KhachHang.Add(dangKy[2]);
			khachHang[3].dsDangKy_KhachHang.Add(dangKy[3]);
			khachHang[4].dsDangKy_KhachHang.Add(dangKy[4]);
			khachHang[5].dsDangKy_KhachHang.Add(dangKy[5]);
			khachHang[6].dsDangKy_KhachHang.Add(dangKy[6]);
			khachHang[7].dsDangKy_KhachHang.Add(dangKy[7]);
			khachHang[8].dsDangKy_KhachHang.Add(dangKy[8]);
			khachHang[9].dsDangKy_KhachHang.Add(dangKy[9]);
			khachHang[10].dsDangKy_KhachHang.Add(dangKy[10]);
			khachHang[11].dsDangKy_KhachHang.Add(dangKy[11]);
			khachHang[12].dsDangKy_KhachHang.Add(dangKy[12]);
			khachHang[13].dsDangKy_KhachHang.Add(dangKy[13]);
			khachHang[14].dsDangKy_KhachHang.Add(dangKy[14]);
			khachHang[15].dsDangKy_KhachHang.Add(dangKy[15]);
			khachHang[16].dsDangKy_KhachHang.Add(dangKy[16]);
			khachHang[17].dsDangKy_KhachHang.Add(dangKy[17]);
			khachHang[18].dsDangKy_KhachHang.Add(dangKy[18]);
			khachHang[19].dsDangKy_KhachHang.Add(dangKy[19]);
			khachHang[21].dsDangKy_KhachHang.Add(dangKy[20]);
			khachHang[22].dsDangKy_KhachHang.Add(dangKy[21]);
			khachHang[23].dsDangKy_KhachHang.Add(dangKy[22]);
			khachHang[24].dsDangKy_KhachHang.Add(dangKy[23]);
			khachHang[25].dsDangKy_KhachHang.Add(dangKy[24]);
			khachHang[26].dsDangKy_KhachHang.Add(dangKy[25]);
			khachHang[27].dsDangKy_KhachHang.Add(dangKy[26]);
			khachHang[28].dsDangKy_KhachHang.Add(dangKy[27]);
			khachHang[29].dsDangKy_KhachHang.Add(dangKy[28]);
			khachHang[24].dsDangKy_KhachHang.Add(dangKy[29]);
			khachHang[15].dsDangKy_KhachHang.Add(dangKy[30]);
			khachHang[2].dsDangKy_KhachHang.Add(dangKy[31]);
			khachHang[25].dsDangKy_KhachHang.Add(dangKy[32]);
			khachHang[20].dsDangKy_KhachHang.Add(dangKy[33]);
			khachHang[17].dsDangKy_KhachHang.Add(dangKy[34]);
			khachHang[20].dsDangKy_KhachHang.Add(dangKy[35]);
			khachHang[14].dsDangKy_KhachHang.Add(dangKy[36]);
			khachHang[5].dsDangKy_KhachHang.Add(dangKy[37]);
			
			// tạo dsDangKy_Ve
			ve[0].dsDangKy_Ve.Add(dangKy[1]);
			ve[2].dsDangKy_Ve.Add(dangKy[0]);
			ve[5].dsDangKy_Ve.Add(dangKy[2]);
			ve[6].dsDangKy_Ve.Add(dangKy[3]);
			ve[10].dsDangKy_Ve.Add(dangKy[4]);
			ve[8].dsDangKy_Ve.Add(dangKy[5]);
			ve[2].dsDangKy_Ve.Add(dangKy[6]);
			ve[3].dsDangKy_Ve.Add(dangKy[7]);
			ve[9].dsDangKy_Ve.Add(dangKy[8]);
			ve[12].dsDangKy_Ve.Add(dangKy[9]);
			ve[6].dsDangKy_Ve.Add(dangKy[10]);
			ve[4].dsDangKy_Ve.Add(dangKy[11]);
			ve[3].dsDangKy_Ve.Add(dangKy[12]);
			ve[1].dsDangKy_Ve.Add(dangKy[13]);
			ve[0].dsDangKy_Ve.Add(dangKy[14]);
			ve[12].dsDangKy_Ve.Add(dangKy[15]);
			ve[5].dsDangKy_Ve.Add(dangKy[16]);
			ve[7].dsDangKy_Ve.Add(dangKy[17]);
			ve[9].dsDangKy_Ve.Add(dangKy[18]);
			ve[4].dsDangKy_Ve.Add(dangKy[19]);
			ve[10].dsDangKy_Ve.Add(dangKy[20]);
			ve[1].dsDangKy_Ve.Add(dangKy[21]);
			ve[2].dsDangKy_Ve.Add(dangKy[22]);
			ve[6].dsDangKy_Ve.Add(dangKy[23]);
			ve[7].dsDangKy_Ve.Add(dangKy[24]);
			ve[9].dsDangKy_Ve.Add(dangKy[25]);
			ve[12].dsDangKy_Ve.Add(dangKy[26]);
			ve[11].dsDangKy_Ve.Add(dangKy[27]);
			ve[10].dsDangKy_Ve.Add(dangKy[28]);
			ve[5].dsDangKy_Ve.Add(dangKy[29]);
			ve[9].dsDangKy_Ve.Add(dangKy[30]);
			ve[8].dsDangKy_Ve.Add(dangKy[31]);
			ve[10].dsDangKy_Ve.Add(dangKy[32]);
			ve[7].dsDangKy_Ve.Add(dangKy[33]);
			ve[12].dsDangKy_Ve.Add(dangKy[34]);
			ve[8].dsDangKy_Ve.Add(dangKy[35]);
			ve[2].dsDangKy_Ve.Add(dangKy[36]);
			ve[0].dsDangKy_Ve.Add(dangKy[37]);
			

			daiLy[0].dsDangKy_daiLy.Add(dangKy[0]);
			daiLy[1].dsDangKy_daiLy.Add(dangKy[1]);
			daiLy[2].dsDangKy_daiLy.Add(dangKy[2]);
			daiLy[3].dsDangKy_daiLy.Add(dangKy[3]);
			daiLy[4].dsDangKy_daiLy.Add(dangKy[4]);
			daiLy[5].dsDangKy_daiLy.Add(dangKy[5]);
			daiLy[6].dsDangKy_daiLy.Add(dangKy[6]);
			daiLy[7].dsDangKy_daiLy.Add(dangKy[7]);
			daiLy[8].dsDangKy_daiLy.Add(dangKy[8]);
			daiLy[9].dsDangKy_daiLy.Add(dangKy[9]);
			daiLy[1].dsDangKy_daiLy.Add(dangKy[10]);
			daiLy[3].dsDangKy_daiLy.Add(dangKy[11]);
			daiLy[5].dsDangKy_daiLy.Add(dangKy[12]);
			daiLy[7].dsDangKy_daiLy.Add(dangKy[13]);
			daiLy[9].dsDangKy_daiLy.Add(dangKy[14]);
			daiLy[0].dsDangKy_daiLy.Add(dangKy[15]);
			daiLy[2].dsDangKy_daiLy.Add(dangKy[16]);
			daiLy[4].dsDangKy_daiLy.Add(dangKy[17]);
			daiLy[6].dsDangKy_daiLy.Add(dangKy[18]);
			daiLy[8].dsDangKy_daiLy.Add(dangKy[19]);
			daiLy[2].dsDangKy_daiLy.Add(dangKy[20]);
			daiLy[3].dsDangKy_daiLy.Add(dangKy[21]);
			daiLy[5].dsDangKy_daiLy.Add(dangKy[22]);
			daiLy[7].dsDangKy_daiLy.Add(dangKy[23]);
			daiLy[1].dsDangKy_daiLy.Add(dangKy[24]);
			daiLy[4].dsDangKy_daiLy.Add(dangKy[25]);
			daiLy[9].dsDangKy_daiLy.Add(dangKy[26]);
			daiLy[4].dsDangKy_daiLy.Add(dangKy[27]);
			daiLy[8].dsDangKy_daiLy.Add(dangKy[28]);
			daiLy[6].dsDangKy_daiLy.Add(dangKy[29]);
			daiLy[0].dsDangKy_daiLy.Add(dangKy[30]);
			daiLy[1].dsDangKy_daiLy.Add(dangKy[31]);
			daiLy[7].dsDangKy_daiLy.Add(dangKy[32]);
			daiLy[9].dsDangKy_daiLy.Add(dangKy[33]);
			daiLy[3].dsDangKy_daiLy.Add(dangKy[34]);
			daiLy[5].dsDangKy_daiLy.Add(dangKy[35]);
			daiLy[2].dsDangKy_daiLy.Add(dangKy[36]);
			daiLy[8].dsDangKy_daiLy.Add(dangKy[37]);

		}

		//Duc
		public static void TaoDanhSachDaiLy()
		{
			daiLy.Add(new DAILY("DL001", "Nam Hà", "TP. Hồ Chí Minh", "0963548754", "s", new List<NHANVIEN>(), new List<DANGKY>()));
			daiLy.Add(new DAILY("DL002", "Ngọc Nam", "Hà Nội", "0958758754", "",  new List<NHANVIEN>(), new List<DANGKY>()));
			daiLy.Add(new DAILY("DL003", "Giang Tiến", "Bình Định", "0942118754", "", new List<NHANVIEN>(), new List<DANGKY>()));
			daiLy.Add(new DAILY("DL004", "Hưng Nguyễn", "Thái Bình", "0925628754", "", new List<NHANVIEN>(), new List<DANGKY>()));
			daiLy.Add(new DAILY("DL005", "Bình Minh", "Phú Yên", "0912352754", "", new List<NHANVIEN>(), new List<DANGKY>()));
			daiLy.Add(new DAILY("DL006", "Hoàng Hôn", "Bình Dương", "0963123454", "", new List<NHANVIEN>(), new List<DANGKY>()));
			daiLy.Add(new DAILY("DL007", "Trương Vinh", "Đồng Nai", "0964232154", "", new List<NHANVIEN>(), new List<DANGKY>()));
			daiLy.Add(new DAILY("DL008", "Cát Tiên", "Nghệ An", "0967545754", "", new List<NHANVIEN>(), new List<DANGKY>()));
			daiLy.Add(new DAILY("DL009", "Hà Nội", "Phú Thọ", "0961552754", "", new List<NHANVIEN>(), new List<DANGKY>()));
			daiLy.Add(new DAILY("DL010", "Vương Minh", "Đà Nẵng", "0957842754", "", new List<NHANVIEN>(), new List<DANGKY>()));
		}
		public static void TaoDanhSachChucVu()
		{
			chucVu.Add(new CHUCVU("CV001", "Quản Lý", new List<NHANVIEN>()));
			chucVu.Add(new CHUCVU("CV002", "Nhân viên bán vé", new List<NHANVIEN>()));
			chucVu.Add(new CHUCVU("CV003", "Nhân viên marketing", new List<NHANVIEN>()));
			chucVu.Add(new CHUCVU("CV004", "Hướng dẫn viên du lịch", new List<NHANVIEN>()));
			chucVu.Add(new CHUCVU("CV005", "Tài xế", new List<NHANVIEN>()));
			chucVu.Add(new CHUCVU("CV006", "Lao công", new List<NHANVIEN>()));
			chucVu.Add(new CHUCVU("CV007", "Bảo vệ", new List<NHANVIEN>()));

		}
		public static void TaoDanhSachNhanVien()
		{
			nhanVien.Add(new NHANVIEN("NV001", "Hoàng Tấn Hải", new DateTime(2001, 02, 22), "Nam", "TP. Hồ Chí Minh", "0963421474", chucVu[3].MaSoCV, daiLy[3].MaSoDL, chucVu[3],daiLy[0], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV002", "Hồ Ngọc Hà", new DateTime(1987, 02, 26), "Nữ", "Hà Nội", "0963421324", chucVu[1].MaSoCV, daiLy[1].MaSoDL, chucVu[1], daiLy[1], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV003", "Dương Thị An", new DateTime(1999, 01, 21), "Nữ", "Bình Định", "0963441474", chucVu[2].MaSoCV, daiLy[2].MaSoDL, chucVu[2], daiLy[2], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV004", "Trần Tiến Tài", new DateTime(1998, 02, 11), "Nam", "Thái Bình", "0913241474", chucVu[3].MaSoCV, daiLy[3].MaSoDL, chucVu[3], daiLy[3], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV005", "Trần Công Minh", new DateTime(2001, 02, 07), "Nam", "Phú Yên", "0963453134", chucVu[4].MaSoCV, daiLy[4].MaSoDL, chucVu[4], daiLy[4], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV006", "Nguyễn Hoàng Thái", new DateTime(2001, 02, 02), "Nam", "Đồng Nai", "0963413574", chucVu[5].MaSoCV, daiLy[5].MaSoDL, chucVu[5], daiLy[5], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV007", "Võ Quốc Nam", new DateTime(2001, 02, 05), "Nam", "Bình Dương", "0963632274", chucVu[6].MaSoCV, daiLy[6].MaSoDL, chucVu[6], daiLy[6], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV008", "Trần Anh Khoa", new DateTime(2005, 10, 22), "Nam", "Nghệ An", "0963125274", chucVu[1].MaSoCV, daiLy[7].MaSoDL, chucVu[1], daiLy[7], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV009", "Nguyễn Quốc Thái", new DateTime(2000, 02, 11), "Nam", "Hà Nội", "0953231474", chucVu[1].MaSoCV, daiLy[8].MaSoDL, chucVu[1], daiLy[8], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV010", "Pham Nam Phương", new DateTime(1997, 09, 13), "Nữ", "Đà Nẵng", "0963555474", chucVu[2].MaSoCV, daiLy[9].MaSoDL, chucVu[2], daiLy[9], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV011", "Trịnh Châu", new DateTime(2001, 10, 16), "Nữ", "Bình Định", "093156486", chucVu[0].MaSoCV, daiLy[0].MaSoDL, chucVu[0], daiLy[0], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV012", "Phan Hoàng Hải", new DateTime(2001, 05, 17), "Nam", "Thái Bình", "0316899427", chucVu[0].MaSoCV, daiLy[1].MaSoDL, chucVu[0], daiLy[1], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV013", "Nam An", new DateTime(1999, 01, 21), "Nữ", "Bình Định", "0935645614", chucVu[0].MaSoCV, daiLy[2].MaSoDL, chucVu[0], daiLy[2], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV014", "Nguyễn Tấn Tài", new DateTime(1998, 02, 11), "Nam", "Thái Bình", "0813216541", chucVu[0].MaSoCV, daiLy[3].MaSoDL, chucVu[0], daiLy[3], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV015", "Trần Minh", new DateTime(2001, 02, 07), "Nam", "Phú Yên", "0321564141", chucVu[0].MaSoCV, daiLy[4].MaSoDL, chucVu[0], daiLy[4], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV016", "Nguyễn Hoàng Khải", new DateTime(2001, 02, 02), "Nam", "Đồng Nai", "03461752642", chucVu[0].MaSoCV, daiLy[5].MaSoDL, chucVu[0], daiLy[5], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV017", "Võ Quốc Tiến", new DateTime(2001, 02, 05), "Nam", "Bình Dương", "0214651274", chucVu[0].MaSoCV, daiLy[6].MaSoDL, chucVu[0], daiLy[6], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV018", "Trần Nam Khoa", new DateTime(2005, 10, 22), "Nam", "Nghệ An", "0823225274", chucVu[0].MaSoCV, daiLy[7].MaSoDL, chucVu[0], daiLy[7], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV019", "Dư Quốc Nam", new DateTime(2000, 02, 11), "Nam", "Đà Nẵng", "055222474", chucVu[0].MaSoCV, daiLy[8].MaSoDL, chucVu[0], daiLy[8], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV020", "Phạm Nam Hương", new DateTime(1997, 09, 13), "Nữ", "Đà Nẵng", "013555474", chucVu[0].MaSoCV, daiLy[9].MaSoDL, chucVu[0], daiLy[9], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV021", "Trịnh Châu", new DateTime(2001, 10, 16), "Nữ", "Bình Dương", "012221232", chucVu[3].MaSoCV, daiLy[5].MaSoDL, chucVu[3], daiLy[5], new List<PHANCONG>()));
			nhanVien.Add(new NHANVIEN("NV022", "Dương Khải Phong", new DateTime(2001, 05, 17), "Nam", "Nghệ An", "09612324", chucVu[4].MaSoCV, daiLy[3].MaSoDL, chucVu[4], daiLy[3], new List<PHANCONG>()));
			
			// 1.ds.add(n);
			daiLy[0].dsNhanVien_daily.Add(nhanVien[0]);
			daiLy[1].dsNhanVien_daily.Add(nhanVien[1]);
			daiLy[2].dsNhanVien_daily.Add(nhanVien[2]);
			daiLy[3].dsNhanVien_daily.Add(nhanVien[3]);
			daiLy[4].dsNhanVien_daily.Add(nhanVien[4]);
			daiLy[5].dsNhanVien_daily.Add(nhanVien[5]);
			daiLy[6].dsNhanVien_daily.Add(nhanVien[6]);
			daiLy[7].dsNhanVien_daily.Add(nhanVien[7]);
			daiLy[8].dsNhanVien_daily.Add(nhanVien[8]);
			daiLy[9].dsNhanVien_daily.Add(nhanVien[9]);
			daiLy[0].dsNhanVien_daily.Add(nhanVien[10]);
			daiLy[1].dsNhanVien_daily.Add(nhanVien[11]);
			daiLy[2].dsNhanVien_daily.Add(nhanVien[12]);
			daiLy[3].dsNhanVien_daily.Add(nhanVien[13]);
			daiLy[4].dsNhanVien_daily.Add(nhanVien[14]);
			daiLy[5].dsNhanVien_daily.Add(nhanVien[15]);
			daiLy[6].dsNhanVien_daily.Add(nhanVien[16]);
			daiLy[7].dsNhanVien_daily.Add(nhanVien[17]);
			daiLy[8].dsNhanVien_daily.Add(nhanVien[18]);
			daiLy[9].dsNhanVien_daily.Add(nhanVien[19]);
			daiLy[5].dsNhanVien_daily.Add(nhanVien[20]);
			daiLy[3].dsNhanVien_daily.Add(nhanVien[21]);


			chucVu[3].dsNhanVien_ChucVu.Add(nhanVien[0]);
			chucVu[1].dsNhanVien_ChucVu.Add(nhanVien[1]);
			chucVu[2].dsNhanVien_ChucVu.Add(nhanVien[2]);
			chucVu[3].dsNhanVien_ChucVu.Add(nhanVien[3]);
			chucVu[4].dsNhanVien_ChucVu.Add(nhanVien[4]);
			chucVu[5].dsNhanVien_ChucVu.Add(nhanVien[5]);
			chucVu[6].dsNhanVien_ChucVu.Add(nhanVien[6]);
			chucVu[1].dsNhanVien_ChucVu.Add(nhanVien[7]);
			chucVu[1].dsNhanVien_ChucVu.Add(nhanVien[8]);
			chucVu[2].dsNhanVien_ChucVu.Add(nhanVien[9]);
			chucVu[0].dsNhanVien_ChucVu.Add(nhanVien[10]);
			chucVu[0].dsNhanVien_ChucVu.Add(nhanVien[11]);
			chucVu[0].dsNhanVien_ChucVu.Add(nhanVien[12]);
			chucVu[0].dsNhanVien_ChucVu.Add(nhanVien[13]);
			chucVu[0].dsNhanVien_ChucVu.Add(nhanVien[14]);
			chucVu[0].dsNhanVien_ChucVu.Add(nhanVien[15]);
			chucVu[0].dsNhanVien_ChucVu.Add(nhanVien[16]);
			chucVu[0].dsNhanVien_ChucVu.Add(nhanVien[17]);
			chucVu[0].dsNhanVien_ChucVu.Add(nhanVien[18]);
			chucVu[0].dsNhanVien_ChucVu.Add(nhanVien[19]);
			chucVu[3].dsNhanVien_ChucVu.Add(nhanVien[20]);
			chucVu[4].dsNhanVien_ChucVu.Add(nhanVien[21]);



			// tạo người quản lý
			daiLy[0].MaNgQL = nhanVien[10].MaSoNV;
			daiLy[0].NhanVien = new NHANVIEN(nhanVien[10]);

			daiLy[1].MaNgQL = nhanVien[11].MaSoNV;
			daiLy[1].NhanVien = new NHANVIEN(nhanVien[11]);

			daiLy[2].MaNgQL = nhanVien[12].MaSoNV;
			daiLy[2].NhanVien = new NHANVIEN(nhanVien[12]);

			daiLy[3].MaNgQL = nhanVien[13].MaSoNV;
			daiLy[3].NhanVien = new NHANVIEN(nhanVien[13]);

			daiLy[4].MaNgQL = nhanVien[14].MaSoNV;
			daiLy[4].NhanVien = new NHANVIEN(nhanVien[14]);

			daiLy[5].MaNgQL = nhanVien[15].MaSoNV;
			daiLy[5].NhanVien = new NHANVIEN(nhanVien[15]);

			daiLy[6].MaNgQL = nhanVien[16].MaSoNV;
			daiLy[6].NhanVien = new NHANVIEN(nhanVien[16]);

			daiLy[7].MaNgQL = nhanVien[17].MaSoNV;
			daiLy[7].NhanVien = new NHANVIEN(nhanVien[17]);

			daiLy[8].MaNgQL = nhanVien[18].MaSoNV;
			daiLy[8].NhanVien = new NHANVIEN(nhanVien[18]);

			daiLy[9].MaNgQL = nhanVien[19].MaSoNV;
			daiLy[9].NhanVien = new NHANVIEN(nhanVien[19]);

			
		}
		public static void TaoDanhSachPhanCong()
		{
			phanCong.Add(new PHANCONG(nhanVien[0].MaSoNV, tour[0].MaSoTour, nhanVien[0], tour[0]));
			phanCong.Add(new PHANCONG(nhanVien[1].MaSoNV, tour[0].MaSoTour, nhanVien[1], tour[0]));
			phanCong.Add(new PHANCONG(nhanVien[2].MaSoNV, tour[0].MaSoTour, nhanVien[2], tour[0]));
			phanCong.Add(new PHANCONG(nhanVien[3].MaSoNV, tour[0].MaSoTour, nhanVien[3], tour[0]));
			phanCong.Add(new PHANCONG(nhanVien[4].MaSoNV, tour[0].MaSoTour, nhanVien[4], tour[0]));
			phanCong.Add(new PHANCONG(nhanVien[0].MaSoNV, tour[1].MaSoTour, nhanVien[0], tour[1]));
			phanCong.Add(new PHANCONG(nhanVien[1].MaSoNV, tour[1].MaSoTour, nhanVien[1], tour[1]));
			phanCong.Add(new PHANCONG(nhanVien[2].MaSoNV, tour[1].MaSoTour, nhanVien[2], tour[1]));
			phanCong.Add(new PHANCONG(nhanVien[0].MaSoNV, tour[2].MaSoTour, nhanVien[0], tour[2]));
			phanCong.Add(new PHANCONG(nhanVien[3].MaSoNV, tour[2].MaSoTour, nhanVien[3], tour[2]));
			phanCong.Add(new PHANCONG(nhanVien[0].MaSoNV, tour[3].MaSoTour, nhanVien[0], tour[3]));
			phanCong.Add(new PHANCONG(nhanVien[4].MaSoNV, tour[3].MaSoTour, nhanVien[4], tour[3]));
			phanCong.Add(new PHANCONG(nhanVien[5].MaSoNV, tour[3].MaSoTour, nhanVien[5], tour[3]));
			phanCong.Add(new PHANCONG(nhanVien[0].MaSoNV, tour[4].MaSoTour, nhanVien[0], tour[4]));
			phanCong.Add(new PHANCONG(nhanVien[5].MaSoNV, tour[4].MaSoTour, nhanVien[5], tour[4]));
			phanCong.Add(new PHANCONG(nhanVien[6].MaSoNV, tour[4].MaSoTour, nhanVien[6], tour[4]));
			phanCong.Add(new PHANCONG(nhanVien[7].MaSoNV, tour[4].MaSoTour, nhanVien[7], tour[4]));
			phanCong.Add(new PHANCONG(nhanVien[8].MaSoNV, tour[5].MaSoTour, nhanVien[8], tour[5]));
			phanCong.Add(new PHANCONG(nhanVien[8].MaSoNV, tour[5].MaSoTour, nhanVien[8], tour[5]));
			phanCong.Add(new PHANCONG(nhanVien[9].MaSoNV, tour[5].MaSoTour, nhanVien[9], tour[5]));
			phanCong.Add(new PHANCONG(nhanVien[9].MaSoNV, tour[5].MaSoTour, nhanVien[9], tour[5]));
			phanCong.Add(new PHANCONG(nhanVien[20].MaSoNV, tour[5].MaSoTour, nhanVien[20], tour[5]));
			phanCong.Add(new PHANCONG(nhanVien[21].MaSoNV, tour[6].MaSoTour, nhanVien[21], tour[6]));
			phanCong.Add(new PHANCONG(nhanVien[21].MaSoNV, tour[6].MaSoTour, nhanVien[21], tour[6]));
			phanCong.Add(new PHANCONG(nhanVien[0].MaSoNV, tour[7].MaSoTour, nhanVien[0], tour[7]));
			phanCong.Add(new PHANCONG(nhanVien[1].MaSoNV, tour[8].MaSoTour, nhanVien[1], tour[8]));
			phanCong.Add(new PHANCONG(nhanVien[2].MaSoNV, tour[9].MaSoTour, nhanVien[2], tour[9]));
			phanCong.Add(new PHANCONG(nhanVien[3].MaSoNV, tour[10].MaSoTour, nhanVien[3], tour[10]));
			phanCong.Add(new PHANCONG(nhanVien[4].MaSoNV, tour[11].MaSoTour, nhanVien[4], tour[11]));
			phanCong.Add(new PHANCONG(nhanVien[5].MaSoNV, tour[12].MaSoTour, nhanVien[5], tour[12]));
			phanCong.Add(new PHANCONG(nhanVien[6].MaSoNV, tour[7].MaSoTour, nhanVien[6], tour[7]));
			phanCong.Add(new PHANCONG(nhanVien[7].MaSoNV, tour[8].MaSoTour, nhanVien[7], tour[8]));

			nhanVien[0].dsPhanCong_nhanvien.Add(phanCong[0]);
			nhanVien[1].dsPhanCong_nhanvien.Add(phanCong[1]);
			nhanVien[2].dsPhanCong_nhanvien.Add(phanCong[2]);
			nhanVien[3].dsPhanCong_nhanvien.Add(phanCong[3]);
			nhanVien[4].dsPhanCong_nhanvien.Add(phanCong[4]);
			nhanVien[0].dsPhanCong_nhanvien.Add(phanCong[5]);
			nhanVien[1].dsPhanCong_nhanvien.Add(phanCong[6]);
			nhanVien[2].dsPhanCong_nhanvien.Add(phanCong[7]);
			nhanVien[0].dsPhanCong_nhanvien.Add(phanCong[8]);
			nhanVien[3].dsPhanCong_nhanvien.Add(phanCong[9]);
			nhanVien[0].dsPhanCong_nhanvien.Add(phanCong[10]);
			nhanVien[4].dsPhanCong_nhanvien.Add(phanCong[11]);
			nhanVien[5].dsPhanCong_nhanvien.Add(phanCong[12]);
			nhanVien[0].dsPhanCong_nhanvien.Add(phanCong[13]);
			nhanVien[5].dsPhanCong_nhanvien.Add(phanCong[14]);
			nhanVien[6].dsPhanCong_nhanvien.Add(phanCong[15]);
			nhanVien[7].dsPhanCong_nhanvien.Add(phanCong[16]);
			nhanVien[8].dsPhanCong_nhanvien.Add(phanCong[17]);
			nhanVien[8].dsPhanCong_nhanvien.Add(phanCong[18]);
			nhanVien[9].dsPhanCong_nhanvien.Add(phanCong[19]);
			nhanVien[9].dsPhanCong_nhanvien.Add(phanCong[20]);
			nhanVien[20].dsPhanCong_nhanvien.Add(phanCong[20]);
			nhanVien[21].dsPhanCong_nhanvien.Add(phanCong[21]);
			nhanVien[21].dsPhanCong_nhanvien.Add(phanCong[21]);
			nhanVien[0].dsPhanCong_nhanvien.Add(phanCong[24]);
			nhanVien[1].dsPhanCong_nhanvien.Add(phanCong[25]);
			nhanVien[2].dsPhanCong_nhanvien.Add(phanCong[26]);
			nhanVien[3].dsPhanCong_nhanvien.Add(phanCong[27]);
			nhanVien[4].dsPhanCong_nhanvien.Add(phanCong[28]);
			nhanVien[5].dsPhanCong_nhanvien.Add(phanCong[29]);
			nhanVien[6].dsPhanCong_nhanvien.Add(phanCong[30]);
			nhanVien[7].dsPhanCong_nhanvien.Add(phanCong[31]);
			//
			tour[0].dsPhanCong_Tour.Add(phanCong[0]);
			tour[0].dsPhanCong_Tour.Add(phanCong[1]);
			tour[0].dsPhanCong_Tour.Add(phanCong[2]);
			tour[0].dsPhanCong_Tour.Add(phanCong[3]);
			tour[0].dsPhanCong_Tour.Add(phanCong[4]);
			tour[1].dsPhanCong_Tour.Add(phanCong[5]);
			tour[1].dsPhanCong_Tour.Add(phanCong[6]);
			tour[1].dsPhanCong_Tour.Add(phanCong[7]);
			tour[2].dsPhanCong_Tour.Add(phanCong[8]);
			tour[2].dsPhanCong_Tour.Add(phanCong[9]);
			tour[3].dsPhanCong_Tour.Add(phanCong[10]);
			tour[3].dsPhanCong_Tour.Add(phanCong[11]);
			tour[3].dsPhanCong_Tour.Add(phanCong[12]);
			tour[4].dsPhanCong_Tour.Add(phanCong[13]);
			tour[4].dsPhanCong_Tour.Add(phanCong[14]);
			tour[4].dsPhanCong_Tour.Add(phanCong[15]);
			tour[4].dsPhanCong_Tour.Add(phanCong[16]);
			tour[5].dsPhanCong_Tour.Add(phanCong[17]);
			tour[5].dsPhanCong_Tour.Add(phanCong[18]);
			tour[5].dsPhanCong_Tour.Add(phanCong[19]);
			tour[5].dsPhanCong_Tour.Add(phanCong[20]);
			tour[5].dsPhanCong_Tour.Add(phanCong[21]);
			tour[6].dsPhanCong_Tour.Add(phanCong[22]);
			tour[6].dsPhanCong_Tour.Add(phanCong[23]);
			tour[7].dsPhanCong_Tour.Add(phanCong[24]);
			tour[8].dsPhanCong_Tour.Add(phanCong[25]);
			tour[9].dsPhanCong_Tour.Add(phanCong[26]);
			tour[10].dsPhanCong_Tour.Add(phanCong[27]);
			tour[11].dsPhanCong_Tour.Add(phanCong[28]);
			tour[12].dsPhanCong_Tour.Add(phanCong[29]);
			tour[7].dsPhanCong_Tour.Add(phanCong[30]);
			tour[8].dsPhanCong_Tour.Add(phanCong[31]);
		}
		//Khoa
		public static void TaoDanhSachTour()
		{
			tour.Add(new TOUR("T001", "Tour Nam Hội An", new DateTime(2022, 02, 14), new DateTime(2022, 02, 18), diaDiemDL[0].MaSoDD, khachSan[11].MaSoKS, phuongTien[0].MaSoPT, diaDiemDL[0], khachSan[11], phuongTien[0], new List<PHANCONG>()));
			tour.Add(new TOUR("T002", "Tour Nha Trang", new DateTime(2022, 02, 19), new DateTime(2022, 02, 23), diaDiemDL[1].MaSoDD, khachSan[12].MaSoKS, phuongTien[0].MaSoPT, diaDiemDL[1], khachSan[12], phuongTien[0], new List<PHANCONG>()));
			tour.Add(new TOUR("T003", "Tour Phú Quốc", new DateTime(2022, 05, 14), new DateTime(2022, 05, 18), diaDiemDL[2].MaSoDD, khachSan[14].MaSoKS, phuongTien[0].MaSoPT, diaDiemDL[2], khachSan[14], phuongTien[0], new List<PHANCONG>()));
			tour.Add(new TOUR("T004", "Tour Bà Nà Hills", new DateTime(2022, 06, 14), new DateTime(2022, 06, 18), diaDiemDL[3].MaSoDD, khachSan[8].MaSoKS, phuongTien[2].MaSoPT, diaDiemDL[3], khachSan[8], phuongTien[2], new List<PHANCONG>()));
			tour.Add(new TOUR("T005", "Tour Huế", new DateTime(2022, 07, 14), new DateTime(2022, 07, 18), diaDiemDL[4].MaSoDD, khachSan[16].MaSoKS, phuongTien[2].MaSoPT, diaDiemDL[4], khachSan[16], phuongTien[2], new List<PHANCONG>()));
			tour.Add(new TOUR("T006", "Tour Củ Chi", new DateTime(2022, 09, 14), new DateTime(2022, 09, 18), diaDiemDL[5].MaSoDD, khachSan[18].MaSoKS, phuongTien[3].MaSoPT, diaDiemDL[5], khachSan[18], phuongTien[3], new List<PHANCONG>()));
			tour.Add(new TOUR("T007", "Tour Vĩnh Hy", new DateTime(2022, 10, 14), new DateTime(2022, 10, 18), diaDiemDL[6].MaSoDD, khachSan[20].MaSoKS, phuongTien[3].MaSoPT, diaDiemDL[6], khachSan[20], phuongTien[3], new List<PHANCONG>()));
			tour.Add(new TOUR("T008", "Tour Bản Giốc", new DateTime(2022, 02, 25), new DateTime(2022, 02, 28), diaDiemDL[7].MaSoDD, khachSan[22].MaSoKS, phuongTien[4].MaSoPT, diaDiemDL[7], khachSan[22], phuongTien[4], new List<PHANCONG>()));
			tour.Add(new TOUR("T009", "Tour Dinh Độc Lập", new DateTime(2022, 02, 24), new DateTime(2022, 02, 27), diaDiemDL[8].MaSoDD, khachSan[19].MaSoKS, phuongTien[4].MaSoPT, diaDiemDL[8], khachSan[19], phuongTien[4], new List<PHANCONG>()));
			tour.Add(new TOUR("T010", "Tour Cam Ranh", new DateTime(2022, 02, 08), new DateTime(2022, 02, 10), diaDiemDL[9].MaSoDD, khachSan[13].MaSoKS, phuongTien[2].MaSoPT, diaDiemDL[9], khachSan[13], phuongTien[2], new List<PHANCONG>()));
			tour.Add(new TOUR("T011", "Tour Sơn Trà", new DateTime(2022, 02, 26), new DateTime(2022, 02, 28), diaDiemDL[10].MaSoDD, khachSan[7].MaSoKS, phuongTien[1].MaSoPT, diaDiemDL[10], khachSan[7], phuongTien[1], new List<PHANCONG>()));
			tour.Add(new TOUR("T012", "Tour Cà Ná", new DateTime(2022, 05, 14), new DateTime(2022, 04, 18), diaDiemDL[11].MaSoDD, khachSan[21].MaSoKS, phuongTien[2].MaSoPT, diaDiemDL[11], khachSan[21], phuongTien[2], new List<PHANCONG>()));
			tour.Add(new TOUR("T013", "Tour Hội An", new DateTime(2022, 11, 14), new DateTime(2022, 12, 18), diaDiemDL[12].MaSoDD, khachSan[11].MaSoKS, phuongTien[4].MaSoPT, diaDiemDL[12], khachSan[11], phuongTien[4], new List<PHANCONG>()));


			diaDiemDL[0].dsTour_DiaDiemDL.Add(tour[0]);
			diaDiemDL[1].dsTour_DiaDiemDL.Add(tour[1]);
			diaDiemDL[2].dsTour_DiaDiemDL.Add(tour[2]);
			diaDiemDL[3].dsTour_DiaDiemDL.Add(tour[3]);
			diaDiemDL[4].dsTour_DiaDiemDL.Add(tour[4]);
			diaDiemDL[5].dsTour_DiaDiemDL.Add(tour[5]);
			diaDiemDL[6].dsTour_DiaDiemDL.Add(tour[6]);
			diaDiemDL[7].dsTour_DiaDiemDL.Add(tour[7]);
			diaDiemDL[8].dsTour_DiaDiemDL.Add(tour[8]);
			diaDiemDL[9].dsTour_DiaDiemDL.Add(tour[9]);
			diaDiemDL[10].dsTour_DiaDiemDL.Add(tour[10]);
			diaDiemDL[11].dsTour_DiaDiemDL.Add(tour[11]);
			diaDiemDL[12].dsTour_DiaDiemDL.Add(tour[12]);


			khachSan[11].dsTour_KhachSan.Add(tour[0]);
			khachSan[12].dsTour_KhachSan.Add(tour[1]);
			khachSan[14].dsTour_KhachSan.Add(tour[2]);
			khachSan[8].dsTour_KhachSan.Add(tour[3]);
			khachSan[16].dsTour_KhachSan.Add(tour[4]);
			khachSan[18].dsTour_KhachSan.Add(tour[5]);
			khachSan[20].dsTour_KhachSan.Add(tour[6]);
			khachSan[22].dsTour_KhachSan.Add(tour[7]);
			khachSan[19].dsTour_KhachSan.Add(tour[8]);
			khachSan[13].dsTour_KhachSan.Add(tour[9]);
			khachSan[7].dsTour_KhachSan.Add(tour[10]);
			khachSan[21].dsTour_KhachSan.Add(tour[11]);
			khachSan[11].dsTour_KhachSan.Add(tour[12]);


			phuongTien[0].dsTour_PhuongTien.Add(tour[0]);
			phuongTien[0].dsTour_PhuongTien.Add(tour[1]);
			phuongTien[0].dsTour_PhuongTien.Add(tour[2]);
			phuongTien[2].dsTour_PhuongTien.Add(tour[3]);
			phuongTien[2].dsTour_PhuongTien.Add(tour[4]);
			phuongTien[3].dsTour_PhuongTien.Add(tour[5]);
			phuongTien[3].dsTour_PhuongTien.Add(tour[6]);
			phuongTien[4].dsTour_PhuongTien.Add(tour[7]);
			phuongTien[4].dsTour_PhuongTien.Add(tour[8]);
			phuongTien[2].dsTour_PhuongTien.Add(tour[9]);
			phuongTien[1].dsTour_PhuongTien.Add(tour[10]);
			phuongTien[2].dsTour_PhuongTien.Add(tour[11]);
			phuongTien[4].dsTour_PhuongTien.Add(tour[12]);


			ve[0].MaSoTour = tour[0].MaSoTour;
			ve[0].Tour = new TOUR(tour[0]);
			ve[1].MaSoTour = tour[1].MaSoTour;
			ve[1].Tour = new TOUR(tour[1]);
			ve[2].MaSoTour = tour[2].MaSoTour;
			ve[2].Tour = new TOUR(tour[2]);
			ve[3].MaSoTour = tour[3].MaSoTour;
			ve[3].Tour = new TOUR(tour[3]);
			ve[4].MaSoTour = tour[4].MaSoTour;
			ve[4].Tour = new TOUR(tour[4]);
			ve[5].MaSoTour = tour[5].MaSoTour;
			ve[5].Tour = new TOUR(tour[5]);
			ve[6].MaSoTour = tour[6].MaSoTour;
			ve[6].Tour = new TOUR(tour[6]);
			ve[7].MaSoTour = tour[7].MaSoTour;
			ve[7].Tour = new TOUR(tour[7]);
			ve[8].MaSoTour = tour[8].MaSoTour;
			ve[8].Tour = new TOUR(tour[8]);
			ve[9].MaSoTour = tour[9].MaSoTour;
			ve[9].Tour = new TOUR(tour[9]);
			ve[10].MaSoTour = tour[10].MaSoTour;
			ve[10].Tour = new TOUR(tour[10]);
			ve[11].MaSoTour = tour[11].MaSoTour;
			ve[11].Tour = new TOUR(tour[11]);
			ve[12].MaSoTour = tour[12].MaSoTour;
			ve[12].Tour = new TOUR(tour[12]);


		}
		public static void TaoDanhSachDiaDiemDL()
		{
			diaDiemDL.Add(new DIADIEMDULICH("DDDL001", "Vinpearl Nam Hội An", "Quảng Nam", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL002", "Vinpearl Nha Trang", "Khánh Hòa", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL003", "Vinpearl Phú Quốc", "Kiên Giang", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL004", "Bà Nà Hills", "Đà Nẵng", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL005", "Kinh thành Huế", "Huế", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL006", "Địa đạo Củ Chi", "TP. Hồ Chí Minh", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL007", "KDL Vĩnh Hy", "Ninh Thuận", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL008", "Thác Bản Giốc", "Cao Bằng", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL009", "Di tích Dinh Độc Lập", "TP. Hồ Chí Minh", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL010", "Vịnh Cam Ranh", "Khánh Hòa", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL011", "Bán đảo Sơn Trà", "Đà Nẵng", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL012", "Hòn Cò Cà Ná ", "Ninh Thuận", new List<TOUR>()));
			diaDiemDL.Add(new DIADIEMDULICH("DDDL013", "Hội An", "Quảng Nam", new List<TOUR>()));


		/*	tour[0].MaSoDD = diaDiemDL[0].MaSoDD;
			tour[0].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[0]);
			tour[1].MaSoDD = diaDiemDL[1].MaSoDD;
			tour[1].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[1]);
			tour[2].MaSoDD = diaDiemDL[2].MaSoDD;
			tour[2].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[2]);
			tour[3].MaSoDD = diaDiemDL[3].MaSoDD;
			tour[3].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[3]);
			tour[4].MaSoDD = diaDiemDL[4].MaSoDD;
			tour[4].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[4]);
			tour[5].MaSoDD = diaDiemDL[5].MaSoDD;
			tour[5].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[5]);
			tour[6].MaSoDD = diaDiemDL[6].MaSoDD;
			tour[6].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[6]);
			tour[7].MaSoDD = diaDiemDL[7].MaSoDD;
			tour[7].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[7]);
			tour[8].MaSoDD = diaDiemDL[8].MaSoDD;
			tour[8].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[8]);
			tour[9].MaSoDD = diaDiemDL[9].MaSoDD;
			tour[9].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[9]);
			tour[10].MaSoDD = diaDiemDL[10].MaSoDD;
			tour[10].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[10]);
			tour[11].MaSoDD = diaDiemDL[11].MaSoDD;
			tour[11].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[11]);
			tour[12].MaSoDD = diaDiemDL[12].MaSoDD;
			tour[12].DiaDiemDL = new DIADIEMDULICH(diaDiemDL[12]);*/

		}
		public static void TaoDanhSachKhachSan()
		{
			khachSan.Add(new KHACHSAN("KS001", "Sepia", "Đà Lạt", "0123456789", 5, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS002", "Golf Valley", "Đà Lạt", "01314554", 5, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS003", "La Sapinette", "Đà Lạt", "012341855", 4, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS004", "SeaSala", "Vũng Tàu", "03245846", 2, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS005", "Pullman Hotel", "Vũng Tàu", "01234795", 2, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS006", "Marina", "Vũng Tàu", "0123456875", 3, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS007", "Gold Boutique", "Đà Nẵng", "014257989", 3, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS008", "Sumi", "Đà Nẵng", "0124365485", 4, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS009", "Sala", "Đà Nẵng", "0132456854", 2, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS010", "Bamboo", "Sapa", "0324568785", 5, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS011", "Shining Riverside", "Quảng Nam", "04685123", 5, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS012", "Sea’lavie", "Quảng Nam", "024509813", 5, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS013", "Chill Suites", "Khánh Hoà", "054562813", 4, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS014", "Eastin Grand", "Khánh Hoà", "024529813", 3, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS015", "Sea Light", "Kiên Giang", "024569813", 3, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS016", "Yuri", "Kiên Giang", "024569213", 2, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS017", "Amona", "Huế", "024269813", 4, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS018", "Rosaleen", "Huế", "024569213", 4, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS019", "Lotus Laverne", "TP. Hồ Chí Minh", "024269813", 4, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS020", "Silverland", "TP. Hồ Chí Minh", "024569213", 4, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS021", "Annie", "Ninh Thuận", "024569823", 3, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS022", "Casa Maya", "Ninh Thuận", "024529813", 2, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS023", "Jeanne", "Cao Bằng", "024569813", 4, new List<TOUR>()));
			khachSan.Add(new KHACHSAN("KS024", "Micasa", "Cao Bằng", "024569814", 3, new List<TOUR>()));

		}
		public static void TaoDanhSachPhuongTien()
		{
			phuongTien.Add(new PHUONGTIEN("PT001", "Limousine", "Xe", "Moi", 16, new List<TOUR>()));
			phuongTien.Add(new PHUONGTIEN("PT002", "Taxi", "Xe", "Moi", 6, new List<TOUR>()));
			phuongTien.Add(new PHUONGTIEN("PT003", "Hyundai Universe", "Xe", "Moi", 52, new List<TOUR>()));
			phuongTien.Add(new PHUONGTIEN("PT004", "Vietnam Airline", "Máy bay", "Moi", 300, new List<TOUR>()));
			phuongTien.Add(new PHUONGTIEN("PT005", "ROYAL CARIBBEAN", "Tàu biển", "Moi", 250, new List<TOUR>()));
			phuongTien.Add(new PHUONGTIEN("PT006", "Cát Linh Hà Đông", "Tàu điện", "Moi", 960, new List<TOUR>()));
		}
		static void Main(string[] args)
		{
			Console.OutputEncoding = Encoding.UTF8;

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
			Cau16();
			Cau17();
			Cau18();
			Cau19();
			Cau20();
			Cau21();
			Cau22();
			Cau23();
			Cau24();
			Cau25();
			Cau26();
			Cau27();
			Cau28();
			Cau29();
			Cau30();
			Console.ReadKey();
		}
		static void Cau01()
		{
			Console.WriteLine("1. Ở từng đại lý hãy liệt kê các nhân viên theo thứ tự tăng dần mã số nhân viên mà có số lần dẫn tour lớn hơn 1, và liệt kê các tour đó ra.");
			foreach (DAILY dl in daiLy)
			{
				var dsNhanVien = from nv in nhanVien
								 where nv.dsPhanCong_nhanvien.Count() > 1 && nv.MaDL == dl.MaSoDL
								 orderby nv.MaSoNV ascending
								 select new
								 {
									 nv.MaSoNV,
									 nv.TenNV,
									 lst = nv.dsPhanCong_nhanvien.ToList()
								 };
				Console.WriteLine("- Đại lý {0} ở {1} có {2} nhân viên dẫn tour trên 1 lần là: ", dl.TenDL, dl.DiaChi, dsNhanVien.Count());
				foreach (var nv in dsNhanVien)
				{
					Console.WriteLine("    {0} {1} ", nv.MaSoNV, nv.TenNV);
					nv.lst.ForEach(p => Console.WriteLine("        + {0} bắt đầu vào {1}", p.Tour.TenTour, p.Tour.NgayBatDau.ToString("dd/MM/yyyy")));
				}
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		static void Cau02()
		{
			Console.WriteLine("2. Ở đại lý Giang Tiến đã bán ra những vé nào, vé đó đi tuor nào, và đã bán được bao nhiêu vé, sắp xếp theo số lượng vé đã bán?");
			var dsDaiLyNamTien = from dl in daiLy
								 where dl.TenDL == "Giang Tiến"
								 let sl = (from d in dl.dsDangKy_daiLy
										   select new
										   {
											   d.MaSoVe
										   }).Distinct().Count()
								 select new
								 {
									 dl.TenDL,
									 dl.DiaChi,
									 dsDKy = dl.dsDangKy_daiLy.ToList(),
									 soLuong = sl
								 };


			foreach (var dl in dsDaiLyNamTien)
			{
				Console.WriteLine("Đại lý {0} ở {1} đã bán {2} loại vé: ", dl.TenDL, dl.DiaChi, dl.soLuong);

				dl.dsDKy.Select(p => {
					return new
					{
						msVe = p.MaSoVe,
						tenTour = p.Ve.Tour.TenTour,
						soLuongVeBan = p.Ve.dsDangKy_Ve.Count()
					};
				}).OrderBy(p => p.soLuongVeBan)
							  .Distinct()
							  .ToList()
							  .ForEach(p => Console.WriteLine("\tMã số vé: {0} đi tour {1} đã bán được {2} vé",
																p.msVe, p.tenTour, p.soLuongVeBan));
			}

			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		static void Cau03()
		{
			Console.WriteLine("3. Liệt kê số các tour theo từng phương tiện, và từng tour có bao nhiêu khách, liệt kê họ tên và số điện thoại của họ?");
			foreach (PHUONGTIEN pt in phuongTien)
			{
				var dsVe = from v in ve
						   where pt.MaSoPT == v.Tour.MaSoPT
						   select new
						   {
							   v.MaSoTour,
							   v.Tour.TenTour,
							   soLuongDK = v.dsDangKy_Ve.Count()
						   };
				Console.WriteLine("{0} {1} có {2} tour dùng phương tiện này: ", pt.LoaiPT, pt.TenPT, pt.dsTour_PhuongTien.Count());

				foreach (var v in dsVe)
				{
					var dsKhachHang = from dk in dangKy
									  where dk.Ve.MaSoTour == v.MaSoTour
									  select new
									  {
										  dk.KhachHang.HoVaTenLot,
										  dk.KhachHang.Ten,
										  Sdt = (dk.KhachHang.Sdt == "") ? "Không có sđt" : dk.KhachHang.Sdt
									  };
					Console.WriteLine("     {0} có {1} khách: ", v.TenTour, v.soLuongDK);
					foreach (var kh in dsKhachHang)
					{
						Console.WriteLine("               {0} {1} {2}", kh.HoVaTenLot, kh.Ten, kh.Sdt);
					}
				}
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		static void Cau04()
		{
			Console.WriteLine("4. Những khách sạn nào có người Việt Nam đến nghỉ ngơi, có bao nhiêu người, liệt kê các thông tin họ tên, CMND, sđt của người đó ra theo từng khách sạn?");

			var dsKhachSan_DKy = from dk in dangKy
								 where dk.KhachHang.QuocTich.TenQG == "Việt Nam"
								 orderby dk.Ve.Tour.MaSoKS ascending
								 group dk by dk.Ve.Tour.KhachSan.TenKS + " có mã số " + dk.Ve.Tour.MaSoKS into gr
								 select new
								 {
									 key = gr.Key,
									 data = gr.ToList(),
								 };
			foreach (var ks in dsKhachSan_DKy)
			{
				Console.WriteLine("Khách sạn {0} có {1} người Việt Nam đến nghỉ ngơi ", ks.key, ks.data.Count());
				if (ks.data.Count() > 0)
					ks.data.ToList()
							.Select(p =>
							{
								return new
								{
									hoTen = p.KhachHang.HoVaTenLot + " " + p.KhachHang.Ten,
									sdt = (p.KhachHang.Sdt == "") ? "Không có sđt" : p.KhachHang.Sdt,
									CMND = (p.KhachHang.CMND == "") ? "Trẻ em chưa có CMND" : p.KhachHang.CMND
								};
							})
							.ToList()
						  .ForEach(kh => Console.WriteLine($"     Họ tên: {kh.hoTen,-50} CMND: {kh.CMND,-30} SDT: {kh.sdt,-30}"));
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		static void Cau05()
		{
			Console.WriteLine("5. Nhân viên có nhiệm vụ dẫn các Tour Bà Nà Hills là gồm những ai? In thông tin họ tên và sđt nhân viên đó");
			var dsPhanCongBNHill = from pc in phanCong
								   where pc.Tour.TenTour == "Tour Bà Nà Hills"
								   group pc by pc.Tour.MaSoTour into gr
								   select new
								   {
									   key = gr.Key,
									   data = gr.ToList()
								   };
			dsPhanCongBNHill.ToList().ForEach(p =>
			{
				Console.WriteLine("Tour Bà Nà Hills mã {0} có các nhân viên được phân công dẫn tour: ", p.key);
				foreach (var nv in p.data)
					Console.WriteLine($"Nhân viên: {nv.NhanVien.TenNV,-30} SĐT: {nv.NhanVien.Sdt,-20}");
			}
			);
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		static void Cau06()
		{
			Console.WriteLine("6. Những nhân viên nào không được phân công đi dẫn tour, và nhân viên đó làm ở đại lý nào?");
			var dsNhanVienKhongDanTour_DaiLy = from nv in nhanVien
											   where nv.dsPhanCong_nhanvien.Count() == 0
											   group nv by nv.DaiLy.MaSoDL + " " + nv.DaiLy.TenDL into gr
											   select new
											   {
												   key = gr.Key,
												   data = gr.ToList()
											   };
			foreach (var dl in dsNhanVienKhongDanTour_DaiLy)
			{
				Console.WriteLine(dl.key);
				if (dl.data.Count() == 0)
					Console.WriteLine("	     Ai cũng được phân công dẫn tour");
				else
				{
					Console.WriteLine("	     Danh sách các nhân viên không dẫn tour: ");
					foreach (var nv in dl.data.ToList())
					{
						Console.WriteLine("	     	     " + nv.MaSoNV + " " + nv.TenNV);
					}
				}
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		static void Cau07()
		{
			Console.WriteLine("7. In ra thông tin người làm quản lý ở đại lý Hưng Nguyễn ở Thái Bình.");

			var dsDL = daiLy.Where(p => p.TenDL == "Hưng Nguyễn" && p.DiaChi == "Thái Bình");

			Console.WriteLine("Thông tin người quản lý đại lý Hưng nguyễn ở Thái Bình: ");

			foreach (var dl in dsDL)
				Console.WriteLine("	    Tên: " + dl.NhanVien.TenNV + " SĐT: " + dl.NhanVien.Sdt + " quản lý đại lý có mã: " + dl.MaSoDL);

			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		static void Cau08()
		{
			Console.WriteLine("8. Liệt kê tên các tỉnh có địa điểm du lịch, tìm số lượng địa điểm du lịch và tên các địa điểm du lịch đó theo từng tỉnh.");
			var dsDiaDiem = from dd in diaDiemDL
							group dd by dd.DiaDiem into gr
							orderby gr.Key ascending
							let sl = gr.Count()
							select new
							{
								key = gr.Key,
								cacDiaDiem = gr.ToList(),
								soLuong = sl
							};

			dsDiaDiem.ToList().ForEach(p =>
			{
				Console.WriteLine("Ở {0} có {1} địa điểm du lịch: ", p.key, p.soLuong);
				p.cacDiaDiem.ForEach(a => Console.WriteLine("		{0}", a.TenDD));
			}
			);
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		static void Cau09()
		{
			Console.WriteLine("9. Liệt kê các khách hàng có ngày đăng ký trước ngày 1/11/2020 theo từng tour và thông báo số lượng khách");
			var dsTour_DangKy = from k in (from dk in dangKy
										   where DateTime.Compare(dk.NgayDki, new DateTime(2020, 11, 1)) < 0
										   select new
										   {
											   dk.Ve.Tour.MaSoTour,
											   dk.Ve.Tour.TenTour,
											   dk.KhachHang.HoVaTenLot,
											   dk.KhachHang.Ten
										   })
								orderby k.MaSoTour ascending
								group k by k.MaSoTour + " " + k.TenTour into gr
								let sl = gr.Count()
								select new
								{
									key = gr.Key,
									khachHang = gr.ToList(),
									soLuong = sl
								};
			foreach (var t in dsTour_DangKy)
			{
				Console.WriteLine("{0} có {1} khách đăng ký: ", t.key, t.soLuong);
				foreach (var kh in t.khachHang)
					Console.WriteLine("   {0} {1}", kh.HoVaTenLot, kh.Ten);
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		static void Cau10()
		{
			Console.WriteLine("10. Liệt kê tên khách hàng, mã vé mà có giá đắt nhất đã bán ở từng đại lý");
			var dsDaiLy_DangKyVe = from k in (from dk in dangKy
											  select new
											  {
												  dk.DaiLy,
												  dk.KhachHang,
												  dk.Ve
											  })
								   group k by k.DaiLy.TenDL into gr
								   select new
								   {
									   key = gr.Key,
									   data = gr.ToList()
								   };
			dsDaiLy_DangKyVe.ToList().ForEach(p =>
			{
				Console.WriteLine("Đại lý {0}:", p.key);

				var maxTien = p.data.ToList().Max(m => m.Ve.Gia);
				var thongtin = p.data.Where(m => m.Ve.Gia == maxTien).Distinct();

				thongtin.ToList().ForEach(t => Console.WriteLine("Mã số vé {0} giá {1} - Tên người mua: {2}",
												t.Ve.MaSoVe, t.Ve.Gia, t.KhachHang.HoVaTenLot + " " + t.KhachHang.Ten));
			}
			);
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		public static void Cau11()
		{
			Console.WriteLine("11. Liệt kê tour du lịch, số lượng khách hàng và danh sách khách hàng đi tour du lịch đó");
			var a =
				from dk in dangKy
				select new
				{
					tentour = dk.Ve.Tour.TenTour,
					makh = dk.KhachHang.MaSoKH,
					hokh = dk.KhachHang.HoVaTenLot,
					tenkh = dk.KhachHang.Ten
				};
			var b =
				from lk in a
				group lk by lk.tentour into g
				select new
				{
					tour = g.Key,
					KH = g
				};
			foreach (var ikey in b)
			{
				Console.Write(ikey.tour + ": ");
				Console.WriteLine(ikey.KH.Count() + " khách");
				foreach (var item in ikey.KH)
				{
					Console.WriteLine("	{0}-{1} {2}", item.makh, item.hokh, item.tenkh);
				}
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		public static void Cau12()
		{
			Console.WriteLine("12. Liệt kê danh sách tour du lịch và phương tiện di chuyển của tour đó \nvà khách sạn được tour đó chọn và địa điểm du lịch mà tour đó sẽ đến ");

			var p12 = from t in tour
					  select new
					  {
						  ten = t.TenTour,
						  pt = t.PhuongTien.TenPT,
						  diadiem= t.DiaDiemDL.TenDD,
						  ks = t.KhachSan.TenKS
					  };
			foreach(var item in p12)
            {
				Console.WriteLine($"Tour: {item.ten,-20} Phương Tiện: {item.pt,-20} Địa Điểm: {item.diadiem,-20} Khách Sạn: {item.ks,-20}");

			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}

		public static void Cau13()
		{
			Console.WriteLine("13. Liệt kê danh sách nhân viên nam trên 20 tuổi");
			var p13 = from nv in nhanVien
					  where nv.GioiTinh.Equals("Nam") && (DateTime.Today.Year - nv.NgaySinh.Year) > 20
					  select new
					  {
						  Ten = nv.TenNV,
						  tuoi = (DateTime.Today.Year - nv.NgaySinh.Year)
					  };
			foreach (var item in p13)
			{
				Console.WriteLine($"Nhân Viên: {item.Ten,-20} Tuổi: {item.tuoi,-7}");

			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}

		public static void Cau14()
		{
			Console.WriteLine("14. Tìm vé rẻ nhất, in thông tin của vé đó  ");
			var temp = from v in ve
					   select v.Gia;
			var p14 = from v in ve
					  where v.Gia == temp.Min()
					  select new
					  {
						  v.MaSoVe,
						  v.Gia,
						  v.Tour.TenTour,
						  v.Tour.KhachSan.TenKS,
						  v.Tour.DiaDiemDL.TenDD,
						  v.Tour.PhuongTien.TenPT

					  };
			foreach (var item in p14)
			{
                Console.WriteLine($"Mã Số Vé: {item.MaSoVe,-5} Giá: {item.Gia,-7}{"đ",-2}"); 
				Console.WriteLine($"Đi Tour: {item.TenTour,-10} Ở Khách Sạn: {item.TenKS,-10} Tham quan Địa Điểm: {item.TenDD,-10}  Đi bằng Phương Tiện: {item.TenPT,-10}");
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		public static void Cau15()
		{
			Console.WriteLine("15. Sắp xếp danh sách khách hàng theo bảng chữ cái");
			var p15 = from kh in khachHang
					  orderby kh.Ten ascending
					  select kh;

			foreach (var item in p15)
			{
				Console.WriteLine(item.HoVaTenLot + " " + item.Ten);
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		static void Cau16()
		{
			Console.WriteLine("16. Tìm địa điểm du lịch có lượt khách tham quan nhiều nhất ");
			var a = from dk in dangKy
					select new
					{
						tentour = dk.Ve.Tour.DiaDiemDL.TenDD,
						makh = dk.KhachHang.MaSoKH,
					};
			var b = from lk in a
					group lk by lk.tentour into g
					select new
					{
						tour = g.Key,
						Soluong = g.Count()
					};

			int max = 0;
			foreach (var ikey in b)
			{
				if (ikey.Soluong > max)
					max = ikey.Soluong;
			}
			foreach (var ikey in b)
			{
				if (ikey.Soluong == max)
				{
					Console.WriteLine($"Tour: {ikey.tour,-20} Số lượng: {ikey.Soluong,-2}{"khách du lịch",-10}");
				}
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		public static void Cau17()
		{
			Console.WriteLine("17. Liệt kê chức vụ và danh sách nhân viên giữ chức vụ đó");
			var ds = chucVu.Select(p => p);
			foreach (var i in ds)
			{
				Console.WriteLine("Chức vụ: " + i.TenCV);
				foreach (var cv in i.dsNhanVien_ChucVu)
					Console.WriteLine("\t" + cv.TenNV);
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		public static void Cau18()
		{
			Console.WriteLine("18. Tìm tour du lịch có khoảng thời gian du lịch dài nhất");

			var temp = from t in tour
					   select t.NgayKetThuc - t.NgayBatDau;

			var p18 = from t in tour
					  where (t.NgayKetThuc - t.NgayBatDau) == temp.Max()
					  select new
					  {
						  t.TenTour,
						  time = (t.NgayKetThuc - t.NgayBatDau)
					  };

			foreach (var item in p18)
			{
				Console.WriteLine(item.TenTour + ": " + item.time.Days + " ngày");
			}
			Console.WriteLine("---------------------------------------------------------------------------------");

		}
		public static void Cau19()
		{
			Console.WriteLine("19. Liệt kê danh sách vé có khách sạn lớn hơn hoặc bằng 3 sao để nghỉ dưỡng, in ra mã số vé, giá bán, tên khách sạn và số sao của khách sạn đó");

			var p19 = from v in ve
					  where v.Tour.KhachSan.Sosao >= 3
					  select new
					  {
						  v.MaSoVe,
						  v.Gia,
						  v.Tour.KhachSan.TenKS,
						  v.Tour.KhachSan.Sosao
					  };
			foreach(var item in p19)
            {
				Console.WriteLine($"Mã Số Vé: {item.MaSoVe,-10} Giá: {item.Gia,-7}{"đ",-2} Khách Sạn: {item.TenKS,-20} Số Sao: {item.Sosao,-10}");
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		public static void Cau20()
		{
			Console.WriteLine("20. Liệt kê các khách hàng cùng mua 1 loại vé và có cùng 1 địa chỉ nơi ở");
			var p20 = from dk in dangKy
					  group dk by new
					  {
						  dk.MaSoVe,
						  dk.KhachHang.DiaChi
					  };
			foreach(var ikey in p20)
            {
				if(ikey.Count() > 1)
                {
					Console.WriteLine($"Mã Số Vé: {ikey.Key.MaSoVe,-5} Địa Chỉ: {ikey.Key.DiaChi,-12}");
					foreach (var item in ikey)
					{
						Console.Write($"Khách hàng: {item.KhachHang.HoVaTenLot + " " + item.KhachHang.Ten,-30}");
					}
					Console.WriteLine();
				}
			}
			Console.WriteLine("---------------------------------------------------------------------------------");

		}
		public static void Cau21()
		{
			Console.WriteLine("21.Liệt kê khách sạn theo thứ tự chữ cái đầu của bảng chữ cái.");
			var a =
				from ks in khachSan
				group ks by ks.TenKS[0] into g
				orderby g.Key
				select new { First = g.Key, KhachSan = g };
			
			foreach (var g in a)
			{
				Console.WriteLine(" -Các khách sạn có chữ đầu '{0}' bao gồm: ", g.First);
				var dem = 1;
				foreach (var w in g.KhachSan)
				{
					Console.WriteLine("  +Khách Sạn thứ {0}: {1}",dem,w.TenKS);
					dem++;
				}
			}
			Console.WriteLine("---------------------------------------------------------------------------------");

		}
		public static void Cau22()
		{
			Console.WriteLine("22.Liệt kê các khách sạn theo từng số sao.");
			var a =
			from ks in khachSan
			group ks by ks.Sosao into g
			orderby g.Key
			select new { Sosao = g.Key, KhachSan = g };
			foreach (var g in a)
			{
				Console.WriteLine(" -Khách Sạn có Số Sao {0} gồm :", g.Sosao);
				foreach (var w in g.KhachSan)
				{
					Console.WriteLine("  +Khách Sạn {0}",w.TenKS);
				}
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		public static void Cau23()
		{
			Console.WriteLine("23.Liệt kê tên tour có loại vé với giá nhỏ hơn 5000000 với giá vé tăng dần và tên khách hàng mua vé đó.");
			var a =
				from giave in dangKy
				where giave.Ve.Gia < 5000000
				orderby giave.Ve.Gia
				select giave;
			foreach (var giave in a)
			{
				Console.WriteLine(" +Vé {0} với {1} do khách hàng {2} {3} đã mua với giá {4}", giave.Ve.MaSoVe, giave.Ve.Tour.TenTour,giave.KhachHang.HoVaTenLot,giave.KhachHang.Ten, giave.Ve.Gia);
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		public static void Cau24()
		{
			Console.WriteLine("24.Hãy cho biết mỗi khách sạn có bao nhiêu tour đặt.");
			var a =
				from ks in khachSan
				select new
				{
					khsan = ks.TenKS,
					demtour = ks.dsTour_KhachSan.Count()

				};
			foreach (var khsan in a)
			{
				Console.WriteLine(" +{0} có {1} tour đặt", khsan.khsan, khsan.demtour);
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}

		public static void Cau25()
		{
			Console.WriteLine("25.Tìm tên tour có địa điểm ở Quảng Nam");
			var a =
				from t in tour
				where t.DiaDiemDL.DiaDiem == "Quảng Nam"
				select new
				{
					mat = t.MaSoTour,
					tent = t.TenTour
				};
			var dem = 1;
			foreach (var t in a)
			{
				Console.WriteLine(" +Tour thứ {0}: {1}-{2}",dem, t.mat, t.tent);
				dem++;
			}
			Console.WriteLine("---------------------------------------------------------------------------------");

		}

		public static void Cau26()
		{
			Console.WriteLine("26.Tìm tour có giá vé lớn hơn bằng 6000000 và nằm ở Đà Nẵng.");
			var a =
				from v in ve
				where v.Gia >= 6000000
				where v.Tour.DiaDiemDL.DiaDiem == "Đà Nẵng"
				select v.Tour;
			foreach (var t in a)
			{
				Console.WriteLine(" +{0}-{1}", t.MaSoTour, t.TenTour);
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		public static void Cau27()
		{
			Console.WriteLine("27.Các tour có phương tiện lớn hơn bằng đi được 50 người.");
			var a =
				from t in tour
				where t.PhuongTien.SucChua >= 50
				select new
				{
					mat = t.MaSoTour,
					tent = t.TenTour
				};
			
			foreach (var t in a)
			{
				Console.WriteLine(" +{0}-{1}", t.mat, t.tent);
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		public static void Cau28()
		{
			Console.WriteLine("28.Liệt kê thông tin từng đại lý với thông tin quản lý và từng nhân viên trong đại lý đó.");
			var dsnhanvien = daiLy.Select(p => p);
			foreach (var dl in dsnhanvien)
			{
				Console.WriteLine("{0} - {1} - {2} - Quản Lý: {3} - {4}", dl.MaSoDL, dl.DiaChi, dl.Sdt, dl.MaNgQL, dl.NhanVien.TenNV);
				foreach (var nhanvien in dl.dsNhanVien_daily)
				{
					Console.WriteLine("   {0} - {1}", nhanvien.MaSoNV, nhanvien.TenNV);

				}
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}

		public static void Cau29()
		{
			Console.WriteLine("29.Các tour đi từ ngày 14/05/2022.");
			var a =
				from t in tour
				where t.NgayBatDau == new DateTime(2022, 05, 14)
				select t;
			Console.WriteLine("-Các tour từ ngày 14/05/2022");
			foreach (var t in a)
			{
				Console.WriteLine("  +{0}-{1}", t.MaSoTour, t.TenTour);
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}

		public static void Cau30()
		{
			Console.WriteLine("30.Liệt kê từng tên tour và tên địa điểm mà tour đó sẽ đến.");
			var dstour_dd = tour.Select(p => p);
			foreach (var tour_dd in dstour_dd)
			{
				Console.WriteLine(" +{0} - {1}", tour_dd.TenTour, tour_dd.DiaDiemDL.TenDD);
			}
			Console.WriteLine("---------------------------------------------------------------------------------");
		}
		
			
			
		
		
		
		
		
		
		
		
		

	}
}

