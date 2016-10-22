
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin
 */
public class MainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<User> daftarUser = new LinkedList();
        LinkedList<TokoBuku> daftarTokoBuku = new LinkedList();
        String menu = " ";
        int bookStoreIdNumbering = 1, userIdNumbering = 1;//untuk membuat id user dan toko buku secara otomatis
        String username, password;
        String bookStoreId;
        String passwordBaru, konfirmasiPasswordBaru;//untuk menyimpan password baru ketika berganti password
        String address, city, telp;
        int tempIndex;//Untuk menyimpan indeks sementara dari user ataupun tokobuku ketika login
        do {
            System.out.println("\nE-Bookstore");
            System.out.println("Main Menu:");
            System.out.println("[1] Customer");
            System.out.println("[2] Book Store");
            System.out.println("[3] Administrator");
            System.out.println("[4] Exit");
            System.out.print("Input : ");
            menu = s.next();
            switch (menu) {
                case "1":

                    break;
                case "2":
                    do {
                        System.out.println("\nBook Store");
                        System.out.println("Menu:");
                        System.out.println("[1]. Login");
                        System.out.println("[2]. Register");
                        System.out.println("[3]. Forget Password");
                        System.out.println("[4]. Return");
                        System.out.print("Input : ");
                        menu = s.next();
                        switch (menu) {
                            case "1":
                                System.out.println("\nLogin");
                                System.out.print("Username  : ");
                                username = s.next() + s.nextLine();
                                System.out.print("Password  : ");
                                password = s.next() + s.nextLine();
                                if (cekIdAdminTokoBuku(username, password, daftarTokoBuku)) {
                                    tempIndex = getAdminTokoBukuIndex(username, daftarTokoBuku);
                                    bookStoreId = daftarTokoBuku.get(tempIndex).getIdTokoBuku();
                                    do {
                                        System.out.println("\nMenu:");
                                        System.out.println("[1]. Insert Book");
                                        System.out.println("[2]. Edit Book");
                                        System.out.println("[3]. Search Book");
                                        System.out.println("[4]. Remove Book");
                                        System.out.println("[5]. Increase Book Stock");
                                        System.out.println("[6]. Decrease Book Stock");
                                        System.out.println("[7]. Create Book Order");
                                        System.out.println("[8]. Edit Book Order");
                                        System.out.println("[9]. Search Book Order");
                                        System.out.println("[10].Cancel Book Order");
                                        System.out.println("[11].Show All Book");
                                        System.out.println("[12].Show All Book Order");
                                        System.out.println("[13].Edit Profile");
                                        System.out.println("[14].Change Password");
                                        System.out.println("[15].Logout");
                                        System.out.print("Input: ");
                                        menu = s.next();
                                        switch (menu) {
                                            case "1":
                                                System.out.println("\nInsert Book");
                                                System.out.println("[1]. Magazine");
                                                System.out.println("[2]. Comic");
                                                System.out.println("[3]. Novel");
                                                System.out.println("[4]. Dictionary");
                                                System.out.println("[5]. TextBook");
                                                System.out.print("Input: ");
                                                menu = s.next();
                                                switch (menu) {
                                                    case "1":
                                                        System.out.println("\nMagazine");

                                                        //inputan data majalah baru
                                                        String bookId = createBookId(daftarTokoBuku.get(tempIndex).getBookIdNumbering(), bookStoreId, "Magazine");
                                                        System.out.print("Title       : ");
                                                        String title = s.next() + s.nextLine();
                                                        System.out.print("Author      : ");
                                                        String author = s.next() + s.nextLine();
                                                        System.out.print("Publisher   : ");
                                                        String publisher = s.next() + s.nextLine();
                                                        System.out.print("Category    : ");
                                                        String category = s.next() + s.nextLine();
                                                        System.out.print("Edition     : ");
                                                        String edition = s.next() + s.nextLine();
                                                        System.out.print("Price       : ");
                                                        double price = s.nextDouble();
                                                        System.out.print("Quantity    : ");
                                                        int quantity = s.nextInt();
                                                        boolean status = false;
                                                        if (quantity > 0) {
                                                            status = true;
                                                        }

                                                        //membuat majalah baru
                                                        Buku majalahBaru = new Majalah(bookId, title, author, publisher, price, quantity, status, category, edition);

                                                        //memasukkan majalah baru ke dalam daftar buku yang dimiliki toko buku
                                                        daftarTokoBuku.get(tempIndex).addBuku(majalahBaru);
                                                        daftarTokoBuku.get(tempIndex).increaseBookIdNumbering();
                                                        
                                                        break;
                                                    case "2":
                                                        System.out.println("\nComic");

                                                        //inputan data komik baru
                                                        bookId = createBookId(daftarTokoBuku.get(tempIndex).getBookIdNumbering(), bookStoreId, "Comic");
                                                        System.out.print("Title       : ");
                                                        title = s.next() + s.nextLine();
                                                        System.out.print("Author      : ");
                                                        author = s.next() + s.nextLine();
                                                        System.out.print("Publisher   : ");
                                                        publisher = s.next() + s.nextLine();
                                                        System.out.print("Category    : ");
                                                        category = s.next() + s.nextLine();
                                                        System.out.print("Volume      : ");
                                                        String volume = s.next() + s.nextLine();
                                                        System.out.print("Price       : ");
                                                        price = s.nextDouble();
                                                        System.out.print("Quantity    : ");
                                                        quantity = s.nextInt();
                                                        status = false;
                                                        if (quantity > 0) {
                                                            status = true;
                                                        }

                                                        //membuat komik baru
                                                        Buku komikBaru = new Komik(bookId, title, author, publisher, price, quantity, status, category, volume);

                                                        //memasukkan komik baru ke dalam daftar buku yang dimiliki toko buku
                                                        daftarTokoBuku.get(tempIndex).addBuku(komikBaru);
                                                        daftarTokoBuku.get(tempIndex).increaseBookIdNumbering();
                                                        break;
                                                    case "3":
                                                        System.out.println("\nNovel");

                                                        //inputan data novel baru
                                                        bookId = createBookId(daftarTokoBuku.get(tempIndex).getBookIdNumbering(), bookStoreId, "Novel");
                                                        System.out.print("Title       : ");
                                                        title = s.next() + s.nextLine();
                                                        System.out.print("Author      : ");
                                                        author = s.next() + s.nextLine();
                                                        System.out.print("Publisher   : ");
                                                        publisher = s.next() + s.nextLine();
                                                        System.out.print("Category    : ");
                                                        category = s.next() + s.nextLine();
                                                        String isSeries = "";
                                                        do {
                                                            System.out.print("Part of a Series (Y/N): ");
                                                            isSeries = s.next() + s.nextLine();
                                                        } while (!checkSeries(isSeries));
                                                        String seri = "Tidak ada";
                                                        if (checkSeries(isSeries)) {
                                                            System.out.print("Series      : ");
                                                            seri = s.next() + s.nextLine();
                                                        }
                                                        System.out.print("Page        : ");
                                                        int tebalBuku = s.nextInt();
                                                        System.out.print("Price       : ");
                                                        price = s.nextDouble();
                                                        System.out.print("Quantity    : ");
                                                        quantity = s.nextInt();
                                                        status = false;
                                                        if (quantity > 0) {
                                                            status = true;
                                                        }

                                                        //membuat novel baru
                                                        Buku NovelBaru = new Novel(bookId, title, author, publisher, price, quantity, status, category, seri, checkSeries(isSeries), tebalBuku);

                                                        //memasukkan novel baru ke dalam daftar buku yang dimiliki toko buku
                                                        daftarTokoBuku.get(tempIndex).addBuku(NovelBaru);
                                                        daftarTokoBuku.get(tempIndex).increaseBookIdNumbering();
                                                        break;
                                                    case "4":
                                                        System.out.println("\nKamus");

                                                        //inputan data kamus baru
                                                        bookId = createBookId(daftarTokoBuku.get(tempIndex).getBookIdNumbering(), bookStoreId, "Dictionary");
                                                        System.out.print("Title       : ");
                                                        title = s.next() + s.nextLine();
                                                        System.out.print("Author      : ");
                                                        author = s.next() + s.nextLine();
                                                        System.out.print("Publisher   : ");
                                                        publisher = s.next() + s.nextLine();
                                                        System.out.print("Category    : ");
                                                        category = s.next() + s.nextLine();
                                                        System.out.print("Language    : ");
                                                        String bahasa = s.next() + s.nextLine();
                                                        System.out.print("Price       : ");
                                                        price = s.nextDouble();
                                                        System.out.print("Quantity    : ");
                                                        quantity = s.nextInt();
                                                        status = false;
                                                        if (quantity > 0) {
                                                            status = true;
                                                        }

                                                        //membuat kamus baru
                                                        Buku kamusBaru = new Kamus(bookId, title, author, publisher, price, quantity, status, category, bahasa);

                                                        //memasukkan kamus baru ke dalam daftar buku yang dimiliki toko buku
                                                        daftarTokoBuku.get(tempIndex).addBuku(kamusBaru);
                                                        daftarTokoBuku.get(tempIndex).increaseBookIdNumbering();
                                                        break;
                                                    case "5":
                                                        System.out.println("\nTextBook");

                                                        //inputan data buku pelajaran baru
                                                        bookId = createBookId(daftarTokoBuku.get(tempIndex).getBookIdNumbering(), bookStoreId, "Text Book");
                                                        System.out.print("Title       : ");
                                                        title = s.next() + s.nextLine();
                                                        System.out.print("Author      : ");
                                                        author = s.next() + s.nextLine();
                                                        System.out.print("Publisher   : ");
                                                        publisher = s.next() + s.nextLine();
                                                        System.out.print("Category    : ");
                                                        category = s.next() + s.nextLine();
                                                        System.out.print("Level       : ");
                                                        String level = s.next() + s.nextLine();
                                                        System.out.print("Price       : ");
                                                        price = s.nextDouble();
                                                        System.out.print("Quantity    : ");
                                                        quantity = s.nextInt();
                                                        status = false;
                                                        if (quantity > 0) {
                                                            status = true;
                                                        }

                                                        //membuat buku pelajaran baru
                                                        Buku textBookBaru = new BukuPelajaran(bookId, title, author, publisher, price, quantity, status, category, level);

                                                        //memasukkan buku pelajaran baru ke dalam daftar buku yang dimiliki toko buku
                                                        daftarTokoBuku.get(tempIndex).addBuku(textBookBaru);
                                                        daftarTokoBuku.get(tempIndex).increaseBookIdNumbering();
                                                        break;
                                                    default:
                                                        System.out.println("Wrong input!");
                                                        break;
                                                }
                                                break;
                                            case "2":
                                                System.out.println("\nEdit Book");
                                                daftarTokoBuku.get(tempIndex).lihatDaftarBuku();
                                                System.out.print("Title of the book you want to edit : ");
                                                String title = s.next() + s.nextLine();
                                                if (daftarTokoBuku.get(tempIndex).isBookExist(title)) {
                                                    LinkedList<Buku> daftarBuku = daftarTokoBuku.get(tempIndex).getDaftarBuku();
                                                    Buku editedBook = daftarTokoBuku.get(tempIndex).cariBuku(title);
                                                    System.out.print("Title       : ");
                                                    title = s.next() + s.nextLine();
                                                    System.out.print("Author      : ");
                                                    String author = s.next() + s.nextLine();
                                                    System.out.print("Publisher   : ");
                                                    String publisher = s.next() + s.nextLine();
                                                    System.out.print("Category    : ");
                                                    String category = s.next() + s.nextLine();
                                                    System.out.print("Price       : ");
                                                    double price = s.nextDouble();
                                                    System.out.print("Quantity    : ");
                                                    int quantity = s.nextInt();
                                                    boolean status = false;
                                                    if (quantity > 0) {
                                                        status = true;
                                                    }
                                                    editedBook.setJudulBuku(title);
                                                    editedBook.setPenulis(author);
                                                    editedBook.setPenerbit(publisher);
                                                    editedBook.setKategori(category);
                                                    editedBook.setHarga(price);
                                                    editedBook.setStok(quantity);
                                                    editedBook.setStatus(status);
                                                    if (editedBook instanceof Majalah) {
                                                        System.out.print("Edition     : ");
                                                        String edition = s.next()+ s.nextLine();
                                                        ((Majalah)editedBook).setEdisi(edition);
                                                    } else if (editedBook instanceof Komik) {
                                                        System.out.print("Volume      : ");
                                                        String volume = s.next()+ s.nextLine();
                                                        ((Komik)editedBook).setVolume(volume);
                                                    } else if (editedBook instanceof Novel) {
                                                        String isSeries = "";
                                                        do {
                                                            System.out.print("Part of a Series (Y/N): ");
                                                            isSeries = s.next()+ s.nextLine();
                                                        } while (!checkSeries(isSeries));
                                                        String seri = "Tidak ada";
                                                        if (checkSeries(isSeries)) {
                                                            System.out.print("Series      : ");
                                                            seri = s.next()+ s.nextLine();
                                                        }
                                                        System.out.print("Page        : ");
                                                        int tebalBuku = s.nextInt();
                                                        ((Novel)editedBook).setBerseri(checkSeries(isSeries));
                                                        ((Novel)editedBook).setSeri(seri);
                                                        ((Novel)editedBook).setTebalBuku(tebalBuku);
                                                    } else if (editedBook instanceof Kamus) {
                                                        System.out.print("Language    : ");
                                                        String bahasa = s.next()+ s.nextLine();
                                                        ((Kamus)editedBook).setBahasa(bahasa);
                                                    } else if (editedBook instanceof BukuPelajaran) {
                                                        System.out.print("Level       : ");
                                                        String level = s.next()+ s.nextLine();
                                                        ((BukuPelajaran)editedBook).setTingkatPendidikan(level);
                                                    }
                                                    for (int i = 0; i < daftarBuku.size(); i++) {
                                                        if (daftarBuku.get(i).getIdBuku().equals(editedBook.getIdBuku())) {
                                                            daftarBuku.set(i, editedBook);
                                                        }
                                                    }
                                                    daftarTokoBuku.get(tempIndex).setDaftarBuku(daftarBuku);
                                                } else {
                                                    System.out.println("You haven't create the book");
                                                }
                                                break;
                                            case "3":
                                                break;
                                            case "4":
                                                break;
                                            case "5":
                                                break;
                                            case "6":
                                                break;
                                            case "7":
                                                break;
                                            case "8":
                                                break;
                                            case "9":
                                                break;
                                            case "10":
                                                break;
                                            case "11":
                                                System.out.println("\nBook List");
                                                daftarTokoBuku.get(tempIndex).lihatDaftarBuku();//menampilkan semua buku
                                                break;
                                            case "12":
                                                System.out.println("\nOrder List");
                                                daftarTokoBuku.get(tempIndex).lihatDaftarPesanan();//menampilkan semua pesanan
                                                break;
                                            case "13":
                                                System.out.println("\nEdit Profile");
                                                System.out.print("Address : ");//memasukkan alamat toko yang baru
                                                address = s.next() + s.nextLine();
                                                System.out.print("City    : ");//memasukkan kota toko yang baru
                                                city = s.next() + s.nextLine();
                                                System.out.print("Telp No : ");//memasukkan no telepon toko yang baru
                                                telp = s.next() + s.nextLine();

                                                //Menset alamat, kota, dan no telepon dengan data yang baru
                                                daftarTokoBuku.get(tempIndex).setAlamat(address);
                                                daftarTokoBuku.get(tempIndex).setKota(city);
                                                daftarTokoBuku.get(tempIndex).setNoTelepon(telp);
                                                System.out.println("Profile has been updated");
                                                break;
                                            case "14":
                                                System.out.println("\nChange Password");
                                                System.out.println("Enter old password:");//Memasukkan password lama
                                                password = s.next() + s.nextLine();
                                                System.out.println("Enter new password:");//Memasukkkan password baru
                                                passwordBaru = s.next() + s.nextLine();
                                                System.out.println("Re-enter new password:");//meminta konfirmasi password baru
                                                konfirmasiPasswordBaru = s.next() + s.nextLine();
                                                if (cekIdAdminTokoBuku(username, password, daftarTokoBuku)) {//password lama yang dimasukkan benar
                                                    if (passwordBaru.equals(konfirmasiPasswordBaru)) {//password baru yang dimasukkan sama dengan konfimasi password baru
                                                        daftarTokoBuku.get(tempIndex).setPassword(passwordBaru);
                                                        System.out.println("Password has been changed!");
                                                    } else {//password baru yang dimasukkan berbeda
                                                        System.out.println("You entered wrong password");
                                                    }
                                                } else {//salah memasukkan password lama
                                                    System.out.println("You entered wrong password");
                                                }
                                                break;
                                            default:
                                                System.out.println("Wrong Input!");
                                                break;

                                        }
                                    } while (!("15").equals(menu));

                                } else {
                                    System.out.println("You've inputted wrong username or password!");
                                }
                                break;
                            case "2":
                                System.out.println("\nRegister new book store");
                                //Inputan untuk profil toko buku, username dan password
                                bookStoreId = createBookStoreId(bookStoreIdNumbering);
                                System.out.println("Book store id   : " + bookStoreId);
                                System.out.print("Username        : ");
                                username = s.next() + s.nextLine();
                                System.out.print("Password        : ");
                                password = s.next() + s.nextLine();
                                System.out.print("Address         : ");
                                address = s.next() + s.nextLine();
                                System.out.print("City            : ");
                                city = s.next() + s.nextLine();
                                System.out.print("Telp No         : ");
                                telp = s.next() + s.nextLine();

                                //membuat toko buku baru
                                TokoBuku newTokoBuku = new TokoBuku(bookStoreId, username, password, city, address, telp);

                                //memasukan toko buku baru ke daftar toko buku
                                daftarTokoBuku.add(newTokoBuku);
                                bookStoreIdNumbering++;
                                System.out.println("Your account has been created");
                                break;
                            case "3":
                                System.out.println("\nForget password");
                                System.out.print("Book store id   : ");
                                bookStoreId = s.next() + s.nextLine();
                                System.out.print("Username        : ");
                                username = s.next() + s.nextLine();
                                if (forgotPassword(bookStoreId, username, 2, daftarUser, daftarTokoBuku).equals("Error")) {
                                    System.out.println("You entered wrong id or username");
                                } else {
                                    System.out.println("Your password is " + forgotPassword(bookStoreId, username, 2, daftarUser, daftarTokoBuku));
                                }
                                break;
                            default:
                                System.out.println("Wrong Input!");
                                break;
                        }
                    } while (!("4").equals(menu));
                    break;
                case "3":

                    break;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }
        } while (!("4").equals(menu));

    }

    static boolean cekIdAdminTokoBuku(String userName, String password, LinkedList<TokoBuku> daftarTokoBuku) {
        return daftarTokoBuku.stream().filter((daftarTokoBuku1) -> (daftarTokoBuku1.getUserName().equals(userName))).anyMatch((daftarTokoBuku1) -> (daftarTokoBuku1.getPassword().equals(password)));
    }

    static int getAdminTokoBukuIndex(String userName, LinkedList<TokoBuku> daftarTokoBuku) {
        for (int i = 0; i < daftarTokoBuku.size(); i++) {
            if (daftarTokoBuku.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    static String createBookStoreId(int bookStoreIdNumbering) {
        String newBookStoreId = "BS-" + String.valueOf(bookStoreIdNumbering);
        return newBookStoreId;
    }

    static String createUserId(int userIdNumbering) {
        String newUserId = "USER-" + String.valueOf(userIdNumbering);
        return newUserId;
    }

    static String createBookId(int bookIdNumbering, String bookStoreId, String bookType) {
        String newBookId = "[" + bookStoreId + "]-[BK-" + bookIdNumbering + "-" + bookType + "]";
        return newBookId;
    }

    static String createOrderId(int orderIdNumbering, String bookStoreId) {
        String newOrderId = "[" + bookStoreId + "]-[OR-" + orderIdNumbering + "]";
        return newOrderId;
    }

    static String forgotPassword(String id, String username, int type, LinkedList<User> daftarUser, LinkedList<TokoBuku> daftarTokoBuku) {
        if (type == 1) {//User's password
            for (int i = 0; i < daftarUser.size(); i++) {

            }
        } else if (type == 2) { //Book store's password
            for (TokoBuku daftarTokoBuku1 : daftarTokoBuku) {
                if (daftarTokoBuku1.getIdTokoBuku().equals(id) && daftarTokoBuku1.getUserName().equals(username)) {
                    return daftarTokoBuku1.getPassword();
                }
            }
        }
        return "Error";
    }

    static boolean checkSeries(String isSeries) {
        return isSeries.equalsIgnoreCase("Y") || isSeries.equalsIgnoreCase("N");
    }

}
