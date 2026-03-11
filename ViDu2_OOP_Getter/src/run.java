
public class run {

	public static void main(String[] args) {
		 //tao moi doi tuong
        ChuNhat cn1 = new ChuNhat();
        ChuNhat cn2 = new ChuNhat(4, 5);
        ChuNhat hv = new ChuNhat(20, 20);
        //gia su ta muon  lay du lieu tu chu nhat cn1 de in ra
          double cn1_dai = cn1.getDai();
          double cn1_rong = cn1.getRong();
            System.out.println("Chu nhat cn1 co dai: " + cn1_dai + " va rong: " + cn1_rong);
            //thay doi gia tri cua cn1
            cn1.setDai(50);
            cn1_rong = cn1.getRong();
             // Cap nhat gia tri rong sau khi thay doi dai
            cn1_dai = cn1.getDai();
            cn1_rong = cn1.getRong();
            System.out.println("Sau khi thay doi, chu nhat cn1 co dai: " + cn1_dai + " va rong: " + cn1_rong);
    }
}
