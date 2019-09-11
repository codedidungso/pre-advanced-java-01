/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07hw;

import java.io.*;
import java.util.*;

/**
 *
 * @author thiennd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File dataFolder = new File("data");
        if (!dataFolder.exists()) {
            if (dataFolder.mkdir()) {
                System.out.println("Tao thanh cong thu muc data");
            } else {
                System.out.println("Khong tao duoc thu muc data");
                System.exit(-1);
            }
        } else {
            File[] listFile = dataFolder.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.getName().contains(".txt")) {
                        return true;
                    } else {
                        return false;
                    }
                }
            });
            SV[] dssv = new SV[listFile.length];
            for (int i = 0; i < dssv.length; i++) {
                Scanner sc = new Scanner(listFile[i]);
                int mssv = Integer.parseInt(sc.nextLine());
                String name = sc.nextLine();
                dssv[i] = new SV(mssv, name);
                int d = Integer.parseInt(sc.nextLine());
                for (int j = 0; j < d; j++) {
                    dssv[i].addDiem(sc.nextFloat());
                }
            }
            for (int i = 0; i < dssv.length; i++) {
                System.out.println("Ho ten: " + dssv[i].name);
                System.out.println("MSSV: " + dssv[i].name);
                System.out.println("Diem: " + dssv[i].diem);
                System.out.println("");
            }

            System.out.println("Nhap mssv: ");
            Scanner sc2 = new Scanner(System.in);
            int mssvNew = sc2.nextInt();
            sc2.nextLine();
            System.out.println("Nhap ten sinh vien: ");
            String nameNew = sc2.nextLine();

            SV svNew = new SV(mssvNew, nameNew);
            File newFile = new File("data/" + mssvNew + ".txt");
            newFile.createNewFile();
            FileWriter fw = new FileWriter(newFile);
            fw.write(mssvNew + "\n" + nameNew);
            fw.close();

            System.out.println("Nhap vao mssv can xoa: ");
            int mssvCanXoa = sc2.nextInt();
            File deleteFile = new File("data/" + mssvCanXoa + ".txt");
            if(deleteFile.exists()){
                deleteFile.delete();
            } 
        }

    }

}

class SV {

    int mssv;
    String name;
    ArrayList<Float> diem;

    public SV(int mssv, String name) {
        this.mssv = mssv;
        this.name = name;
        diem = new ArrayList();
    }

    public boolean addDiem(float f) {
        if (f < 0 || f > 10) {
            return false;
        }
        this.diem.add(f);
        return true;
    }
}
