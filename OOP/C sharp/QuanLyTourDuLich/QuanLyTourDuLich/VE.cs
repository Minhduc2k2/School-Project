using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{
    public class VE
    {
        public string MaSoVe { get; set; }
        public string MaSoTour { get; set; }
        public int Gia { get; set; }
        public TOUR Tour { get; set; }
        public ICollection<DANGKY> dsDangKy_Ve { get; set; }
        public VE(string MaSoVe, string MaSoTour, int Gia, ICollection<DANGKY> dsDangKy_Ve)
        {
            this.MaSoVe = MaSoVe;
            this.MaSoTour = MaSoTour;
            this.Gia = Gia;
            this.dsDangKy_Ve = dsDangKy_Ve;
        }
        public VE(VE ve)
        {
            this.MaSoVe = ve.MaSoVe;
            this.MaSoTour = ve.MaSoTour;
            this.Gia = ve.Gia;
            this.dsDangKy_Ve = ve.dsDangKy_Ve;
        }
    }
}