import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String StudentId = JOptionPane.showInputDialog("Enter student-id: ");



        while (StudentId.length() != 10){
            StudentId = JOptionPane.showInputDialog("Enter student-id: ");
        }


        switch (Integer.parseInt(StudentId.substring(4,5))){
            case 1:
                JOptionPane.showMessageDialog(null,"Student-ID: "+StudentId+
                        "\nMajor: Information Technology(IT)");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Student-ID: "+StudentId+
                        "\nMajor: Multimedia Technology(MT)");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Student-ID: "+StudentId+
                        "\nDigital Business Information Technology(BI)");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Student-ID: "+StudentId+
                        "\nDigital Technology in Mass Communication(DC)");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Student-ID: "+StudentId+
                        "\nData Science and Data Analytics(DS)");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Cannot found major");
        }




    }
}