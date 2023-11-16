package flightapp;
import javax.swing.*;
import java.awt.*;

public class FlightBook extends JFrame {

    public FlightBook() {
        setTitle("Pemesanan Tiket Penerbangan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 8));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Asal & Tujuan penerbangan
        JLabel originLabel = new JLabel("Asal:");
        JTextField originInput = new JTextField();

        JLabel destinationLabel = new JLabel("Tujuan:");
        JTextField destinationInput = new JTextField();

        // Pembelian Tiket
        JLabel purchaseLabel = new JLabel("Pembelian Tiket:");
        JComboBox<String> purchaseOptions = new JComboBox<>(new String[]{"Pilih metode pembayaran", "Kartu Kredit", "Transfer Bank", "E-wallet"});

        // Bagasi
        JLabel baggageLabel = new JLabel("Bagasi:");
        JRadioButton carryOn = new JRadioButton("Bagasi kabin");
        JRadioButton checkedBag = new JRadioButton("Bagasi terdaftar");
        ButtonGroup baggageGroup = new ButtonGroup();
        baggageGroup.add(carryOn);
        baggageGroup.add(checkedBag);

        // Fasilitas Penerbangan
        JLabel facilitiesLabel = new JLabel("Fasilitas Penerbangan:");
        JCheckBox wifiCheckbox = new JCheckBox("Wi-Fi");
        JCheckBox mealCheckbox = new JCheckBox("Makanan");

        // Refund & Reschedule
        JLabel refundLabel = new JLabel("Refund & Reschedule:");
        JButton refundButton = new JButton("Minta Pengembalian Dana");
        JButton rescheduleButton = new JButton("Ubah Jadwal");

        panel.add(originLabel);
        panel.add(originInput);
        panel.add(destinationLabel);
        panel.add(destinationInput);
        panel.add(purchaseLabel);
        panel.add(purchaseOptions);
        panel.add(baggageLabel);
        panel.add(carryOn);
        panel.add(new JLabel());
        panel.add(checkedBag);
        panel.add(facilitiesLabel);
        panel.add(wifiCheckbox);
        panel.add(new JLabel());
        panel.add(mealCheckbox);
        panel.add(refundLabel);
        panel.add(refundButton);
        panel.add(new JLabel());
        panel.add(rescheduleButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FlightBook());
    }
}
