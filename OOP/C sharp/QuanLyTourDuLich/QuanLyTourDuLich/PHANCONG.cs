using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{
    public class PHANCONG
    {
        public string MaSoNV { get; set; }
        public string MaSoTour { get; set; }
        public NHANVIEN NhanVien { get; set; }
        public TOUR Tour { get; set; }
        public PHANCONG(string MaSoNV, string MaSoTour, NHANVIEN NhanVien, TOUR Tour)
        {
            this.MaSoNV = MaSoNV;
            this.MaSoTour = MaSoTour;
            this.NhanVien = NhanVien;
            this.Tour = Tour;
        }

        public PHANCONG(PHANCONG phancong)
        {
            MaSoNV = phancong.MaSoNV;
            MaSoTour = phancong.MaSoTour;
            NhanVien = phancong.NhanVien;
            Tour = phancong.Tour;
        }

    }
}
