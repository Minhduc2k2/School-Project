using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{

    public class NHANVIEN
    {
        public string MaSoNV { get; set; }
        public string TenNV { get; set; }
        public DateTime NgaySinh { get; set; }
        public string GioiTinh { get; set; }
        public string DiaChi { get; set; }
        public string Sdt { get; set; }
        public string MaCV { get; set; }
        public string MaDL { get; set; }
        public CHUCVU ChucVu { get; set; }
        public DAILY DaiLy { get; set; }
        public ICollection<PHANCONG> dsPhanCong_nhanvien;
        public NHANVIEN(string MaSoNV, string TenNV, DateTime NgaySinh, string GioiTinh, string DiaChi, string Sdt, 
                    string MaCV, string MaDL, CHUCVU ChucVu, DAILY DaiLy, ICollection<PHANCONG> dsPhanCong_nhanvien)
        {
            this.MaSoNV = MaSoNV;
            this.TenNV = TenNV;
            this.NgaySinh = NgaySinh;
            this.GioiTinh = GioiTinh;
            this.DiaChi = DiaChi;
            this.Sdt = Sdt;
            this.MaCV = MaCV;
            this.MaDL = MaDL;
            this.ChucVu = ChucVu;
            this.DaiLy = DaiLy;
            this.dsPhanCong_nhanvien = dsPhanCong_nhanvien;
        }
        public NHANVIEN(NHANVIEN nhanvien)
        {
            this.MaSoNV = nhanvien.MaSoNV;
            this.TenNV = nhanvien.TenNV;
            this.NgaySinh = nhanvien.NgaySinh;
            this.GioiTinh = nhanvien.GioiTinh;
            this.DiaChi = nhanvien.DiaChi;
            this.Sdt = nhanvien.Sdt;
            this.MaCV = nhanvien.MaCV;
            this.ChucVu = nhanvien.ChucVu;
            this.MaDL = nhanvien.MaDL;
            this.DaiLy = nhanvien.DaiLy;
            this.dsPhanCong_nhanvien = nhanvien.dsPhanCong_nhanvien;
        }
    }
}