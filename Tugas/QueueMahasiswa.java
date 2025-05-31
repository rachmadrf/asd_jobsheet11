public class QueueMahasiswa {
    Node front, rear;
    int size;

    public QueueMahasiswa() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public void enqueue(Mahasiswa data) {
        Node baru = new Node(data);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
        } else {
            System.out.println("Memanggil mahasiswa:");
            front.data.tampil();
            front = front.next;
            if (front == null) rear = null;
            size--;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan:");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian Paling Belakang:");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            Node current = front;
            int no = 1;
            while (current != null) {
                System.out.println("\nAntrian ke-" + no++);
                current.data.tampil();
                current = current.next;
            }
        }
    }
}