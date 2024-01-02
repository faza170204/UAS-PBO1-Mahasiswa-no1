class Mahasiswa{
	
	private String nama;
	private int umur;
	
	public Mahasiswa(String nama, int umur) {
		this.nama = nama;
		this.umur = umur;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	public int getUmur() {
		return umur;
	}
	
	void displayinfo() {
		System.out.println("Nama saya " + getNama() + " umur saya " + getUmur());
	}
	
}

class MahasiswaLama extends Mahasiswa{
	private int angkatan;
	
	 public MahasiswaLama(String nama, int umur, int angkatan) {
	        super(nama, umur);
	        this.angkatan = angkatan;
	 }
	 
	 public void setAngkatan(int angkatan) {
		 this.angkatan = angkatan;
	 }
	 
	 public int getAngkatan() {
	        return angkatan;
	 }

	 @Override
	    void displayinfo() {
	        System.out.println("Nama saya " + this.getNama() + " umur saya " + this.getUmur() +
	                " angkatan saya " + getAngkatan());
	 } 
}

class MahasiswaBaru extends Mahasiswa{
	private int nim;
	
	 public MahasiswaBaru(String nama, int umur, int nim) {
	        super(nama, umur);
	        this.nim = nim;
	 }
	 
	 public void setNim(int nim) {
		 this.nim = nim;
	 }
	 
	 public int getNim() {
	        return nim;
	 }

	 @Override
	    void displayinfo() {
	        System.out.println("Nama saya " + this.getNama() + " umur saya " + this.getUmur() +
	                " nim saya " + getNim());
	 } 
}

public class uasmahasiswa {

    public static void main(String[] args) {

    	Mahasiswa[] mahasiswaArray = new Mahasiswa[3];

        mahasiswaArray[0] = new Mahasiswa("John Doe", 30);
        mahasiswaArray[1] = new MahasiswaLama("Melisa Doe", 15, 2014);
        mahasiswaArray[2] = new MahasiswaBaru("Putu Donald", 45, 2022);

        for (Mahasiswa mhs : mahasiswaArray) {
            mhs.displayinfo();
            System.out.println();
        }
    }
}