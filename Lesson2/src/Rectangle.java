
public class Rectangle extends Shape {
	double CD, CR;
	
	Rectangle(double cd, double cr) {
		this.CD = cd;
		this.CR = cr;
		System.out.println("Rectangle created with CD = " + CD + "and CR = " + CR);
	}

	@Override
	public void tinhChuVi() {
		this.chuVi = (CD+CR) * 2;
	}

	@Override
	public void tinhDienTich() {
//		this.dienTich = edge*edge;
		this.dienTich = CD*CR;
	}

}

class Round extends Shape {
	double R;
	double pi = Math.PI;

	Round(double R) {
		this.R = R;
		System.out.println("Round created with R = " + R);
	}

	public void tinhChuVi() {
		this.chuVi = 2 * pi * R;
	}

	public void tinhDienTich() {
		this.dienTich = pi * Math.pow(R, 2);
	}

}
class Square extends Rectangle{
	

}