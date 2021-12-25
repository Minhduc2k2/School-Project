using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich

{
    public class TOUR
    {
        public string MaSoTour { get; set; }
        public string TenTour { get; set; }
        public DateTime NgayBatDau { get; set; }
        public DateTime NgayKetThuc { get; set; }
        public string MaSoDD { get; set; }
        public string MaSoKS { get; set; }
        public string MaSoPT { get; set; }
        public DIADIEMDULICH DiaDiemDL { get; set; }
        public KHACHSAN KhachSan { get; set; }
        public PHUONGTIEN PhuongTien { get; set; }
        public ICollection<PHANCONG> dsPhanCong_Tour { get; set; }


        public TOUR(string MaSoTour, string TenTour, DateTime NgayBatDau, DateTime NgayKetThuc
                    , string MaSoDD, string MaSoKS, string MaSoPT, DIADIEMDULICH DiaDiemDL, KHACHSAN KhachSan, PHUONGTIEN PhuongTien, ICollection<PHANCONG> dsPhanCong_Tour)
        {
            this.MaSoTour = MaSoTour;
            this.TenTour = TenTour;
            this.NgayBatDau = NgayBatDau;
            this.NgayKetThuc = NgayKetThuc;
            this.MaSoDD = MaSoDD;
            this.MaSoKS = MaSoKS;
            this.MaSoPT = MaSoPT;
            this.DiaDiemDL = DiaDiemDL;
            this.KhachSan = KhachSan;
            this.PhuongTien = PhuongTien;
            this.dsPhanCong_Tour = dsPhanCong_Tour;
        }

        public TOUR(TOUR tour)
        {
            this.MaSoTour = tour.MaSoTour;
            this.TenTour = tour.TenTour;
            this.NgayBatDau = tour.NgayBatDau;
            this.NgayKetThuc = tour.NgayKetThuc;
            this.MaSoDD = tour.MaSoDD;
            this.MaSoKS = tour.MaSoKS;
            this.MaSoPT = tour.MaSoPT;
            this.DiaDiemDL = tour.DiaDiemDL;
            this.KhachSan = tour.KhachSan;
            this.PhuongTien = tour.PhuongTien;
            this.dsPhanCong_Tour = tour.dsPhanCong_Tour;
        }


    }
}
