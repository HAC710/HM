package GUI.Controller;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bean {

    private String kind;
    private JPanel jpn;
    private JLabel jlb;
    private String usn;

    public Bean() {
    }

    public Bean(String kind, JPanel jpn, JLabel jlb) {
        this.kind = kind;
        this.jpn = jpn;
        this.jlb = jlb;
    }
    public Bean(String kind, JPanel jpn, JLabel jlb, String usn) {
        this.kind = kind;
        this.jpn = jpn;
        this.jlb = jlb;
        this.usn = usn;
    }

    public String getKind() {
        return kind;
    }
    public String getUsr(){
        return usn;
    }
    public void setUsn(String usn){
        this.usn = usn;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }

    public JLabel getJlb() {
        return jlb;
    }

    public void setJlb(JLabel jlb) {
        this.jlb = jlb;
    }

}
