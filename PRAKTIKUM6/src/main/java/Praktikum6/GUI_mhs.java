package Praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI_mhs extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tabel = new TableView<>();

        // Kolom NIM
        TableColumn<Mahasiswa, String> kolomNIM = new TableColumn<>("NIM");
        kolomNIM.setCellValueFactory(
                new PropertyValueFactory<>("nim")
        );

        // Kolom Nama
        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("Nama");
        kolomNama.setCellValueFactory(
                new PropertyValueFactory<>("nama")
        );

        tabel.getColumns().addAll(kolomNIM, kolomNama);

        tabel.getItems().add(new Mahasiswa(1, "Bambang", "6840"));
        tabel.getItems().add(new Mahasiswa(2, "Yaya", "63966"));
        tabel.getItems().add(new Mahasiswa(3, "Ucup", "74729"));
        tabel.getItems().add(new Mahasiswa(4, "Ngeng", "65839"));
        tabel.getItems().add(new Mahasiswa(5, "Brem", "15343"));
        tabel.getItems().add(new Mahasiswa(6, "Loh", "67245"));
        tabel.getItems().add(new Mahasiswa(7, "Hade", "65464"));
        tabel.getItems().add(new Mahasiswa(8, "Okia", "25236"));
        tabel.getItems().add(new Mahasiswa(9, "Halu", "87547"));
        tabel.getItems().add(new Mahasiswa(10, "Fine", "32524"));

        VBox box = new VBox(tabel);

        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Daftar Mahasiswa");
        primaryStage.show();
    }

    public static class Mahasiswa {
        private int id;
        private String nama;
        private String nim;

        // Constructor
        public Mahasiswa(int id, String nama, String nim) {
            this.id = id;
            this.nama = nama;
            this.nim = nim;
        }

        // Getter and Setter methods
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNim() {
            return nim;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }
}