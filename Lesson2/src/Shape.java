
public class Shape {
	double chuVi;
	double dienTich;

	Shape() {
	}

	public double getChuVi() {
		return this.chuVi;
	}

	public double getDienTich() {
		return this.dienTich;
	}

	void show() {
		System.out.println("Chu vi :" + this.getChuVi() 
		+ " Dien tich :" + this.getDienTich());
	}
	
	public void tinhChuVi() {};
	public void tinhDienTich() {};
}
