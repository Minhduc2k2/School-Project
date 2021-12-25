using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{
	public class KHACHHANG
	{
		public string MaSoKH { get; set; }
		public string HoVaTenLot { get; set; }
		public string Ten { get; set; }
		public int NamSinh { get; set; }
		public string GioiTinh { get; set; }
		public string MaQG { get; set; }
		public string CMND { get; set; }
		public string DiaChi { get; set; }
		public string Sdt { get; set; }
		
		public QUOCTICH QuocTich { get; set; }
		public ICollection<DANGKY> dsDangKy_KhachHang { get; set; }

		public KHACHHANG(string MaSoKH, string HoVaTenLot, string Ten, int NamSinh, string GioiTinh
						, string MaQG, string CMND, string DiaChi, string Sdt, QUOCTICH QuocTich, ICollection<DANGKY> dsDangKy_KhachHang)
		{
			this.MaSoKH = MaSoKH;
			this.HoVaTenLot = HoVaTenLot;
			this.Ten = Ten;
			this.NamSinh = NamSinh;
			this.GioiTinh = GioiTinh;
			this.MaQG = MaQG;
			this.CMND = CMND;
			this.DiaChi = DiaChi;
			this.Sdt = Sdt;
			this.QuocTich = QuocTich;
			this.dsDangKy_KhachHang = dsDangKy_KhachHang;
		}
		public KHACHHANG(KHACHHANG kh)
		{
			this.MaSoKH = kh.MaSoKH;
			this.HoVaTenLot = kh.HoVaTenLot;
			this.Ten = kh.Ten;
			this.NamSinh = kh.NamSinh;
			this.GioiTinh = kh.GioiTinh;
			this.MaQG = kh.MaQG;
			this.CMND = kh.CMND;
			this.DiaChi = kh.DiaChi;
			this.Sdt = kh.Sdt;
			this.QuocTich = kh.QuocTich;
			this.dsDangKy_KhachHang = kh.dsDangKy_KhachHang;
		}

	}
}
