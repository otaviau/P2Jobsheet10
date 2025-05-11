public class AntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max;

    public AntrianLayanan(int n){
        this.max = n;
        this.data = new Mahasiswa[max];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }
    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }
    public void tampilkanSemua(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        }
        System.out.println("Daftar mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i =0; i<size; i++) {
            int index = (front+i)%max;
            System.out.println((i+1)+". ");
            data[index].tampilData();
        }
    }
    public void lihatTerdepan(){
        if (IsEmpty()) {
            System.out.println("Antrian Kosong.");
        } else{
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilData();
        }
    }
    public void lihatAkhir(){
        if (IsEmpty()) {
            System.out.println("Antrian Kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilData();
        }
    }
    public int getJmlAntrian(){
        return size;
    }
    public void clear(){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void tambahAntrian(Mahasiswa mhs){
        if (IsFull()) {
            System.out.println("Antrian sudah penuh! Tidak dapat menambah mahasiswa.");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama+" berhasil masuk ke antrian.");
    }
    public Mahasiswa layaniMahasiswa(){
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong.");
            return null;
        } 
        Mahasiswa mhs = data[front];
        front = (front+1)%max;
        size--;
        return mhs;
    }
}
