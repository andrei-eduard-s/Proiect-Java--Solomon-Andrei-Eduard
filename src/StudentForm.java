import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm {
    private JPanel mainPanel;
    private JTextField getNume;
    private JTextField getPrenume;
    private JButton afisareCursuriButton;
    private JTextArea textArea1;
    private JButton afisareNoteButton;
    private JTextArea textArea2;
    private JButton calculMedieButton;
    private JTextArea textArea3;
    private JButton afisareRestanteButton;
    private JTextArea textArea4;

    public StudentForm(ManagerCursuri Cursuri) {
        this.mainPanel = mainPanel;
        afisareCursuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(e.getSource()==afisareCursuriButton)
              {
                  textArea1.setText("afisare cursuri: ");
                  String getNumeStudent = getNume.getText();
                  String getPrenumeStudent = getPrenume.getText();
                  for(Curs c : Cursuri.cursuri)
                  {
                      for(Student s : c.studenti)
                      {
                          if(s.nume.compareTo(getNumeStudent)==0 && s.prenume.compareTo(getPrenumeStudent)==0)
                          {
                              textArea1.setText(c.nume.toString());
                          }
                      }
                  }
              }
            }
        });
        calculMedieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==calculMedieButton)
                {
                    textArea3.setText("afisare medie: ");
                    String getNumeStudent = getNume.getText();
                    String getPrenumeStudent = getPrenume.getText();
                    try
                    {
                        textArea3.setText(Cursuri.MediaStudentuluiAnuala(getNumeStudent, getPrenumeStudent));
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        });
        afisareNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==afisareNoteButton)
                {
                    textArea2.setText("afisare nota: ");
                    String getNumeStudent = getNume.getText();
                    String getPrenumeStudent = getPrenume.getText();
                    for(Curs c : Cursuri.cursuri)
                    {
                        for(Student s : c.studenti)
                        {
                            if(s.nume.compareTo(getNumeStudent)==0 && s.prenume.compareTo(getPrenumeStudent)==0)
                            {
                                textArea2.setText(c.nota.toString());
                            }
                        }
                    }
                }
            }
        });
        afisareRestanteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==afisareRestanteButton)
                {
                    textArea4.setText("afisare restante: ");
                    String getNumeStudent = getNume.getText();
                    String getPrenumeStudent = getPrenume.getText();
                    try
                    {
                       // textArea4.setText(Cursuri.AfisareRestante(getNumeStudent, getPrenumeStudent));
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
