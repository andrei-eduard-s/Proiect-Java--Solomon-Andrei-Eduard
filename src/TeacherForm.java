import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherForm {
    public TeacherForm(ManagerCursuri Cursuri) {
        this.mainPanel = mainPanel;
        notareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getNumeStudent = getNume.getText();
                String getPrenumeStudent = getPrenume.getText();
                String getGrupaStudent = getGrupa.getText();
                String getNotaStudent = getNota.getText();
                if(e.getSource()==notareButton) {
                    textArea1.setText(Cursuri.ModificaNotaStudent(getNumeStudent, getPrenumeStudent, Integer.parseInt(getNotaStudent)));
                    textArea1.append("\n Afisare");
                }
            }
        });
        afisareCursuriPredateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==afisareCursuriPredateButton) {

                }
            }
        });
        afisareStudentiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==afisareStudentiButton) {

                }
            }
        });
    }

    public JPanel getPanel1() {
        return mainPanel;
    }

    private JPanel mainPanel;
    private JTextField getPrenume;
    private JTextField getGrupa;
    private JTextField getNume;
    private JButton notareButton;
    private JTextField getNota;
    private JTextArea textArea1;
    private JLabel InformatiiProfesor;
    private JButton afisareCursuriPredateButton;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JButton afisareStudentiButton;
}
