import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherForm {
    public TeacherForm(ManagerCursuri Cursuri) {
        this.Cursuri = Cursuri;
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
                textArea2.setText("Afisare Cursuri");
                    /*
                    String getNumeProfesor = getNume.getText();
                    String getPrenumeProfesor = getPrenume.getText();
                    for(Curs c : Cursuri.cursuri)
                    {
                        for(Profesor p : c.profu)
                        {
                            if(p.nume.compareTo(getNumeProfesor)==0 && s.prenume.compareTo(getPrenumeProfesor)==0)
                            {
                                textArea2.setText(c.nume.toString());
                            }
                        }
                    }*/
                }
            }
        });
        afisareStudentiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==afisareStudentiButton) {
                    textArea3.setText("Afisare Studenti");
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
    private ManagerCursuri Cursuri;
}
