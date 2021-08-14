
package GUI.Controller;


import GUI.HomeJPanel;
import GUI.Manage.ManageJPanel;
import GUI.Manage.StaffJPanel;
import GUI.StatisticalJPanel;
import GUI.Account.AccountJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author PHONG VU
 */
public class Controller {
    private JPanel root;
    private String kindSelected = "";
    
    private List<Bean> listItem = null;

    public Controller(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem)
    {
        kindSelected = "Home";
        jpnItem.setBackground(new Color(31,36,42));
        jlbItem.setBackground(new Color(31,36,42));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new HomeJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<Bean> listItem)
    {
        this.listItem = listItem;
        for(Bean item : listItem)
        {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb(),item.getUsr()));
        }
    }
    
    class LabelEvent implements MouseListener
    {
        private JPanel node;
        private String kind;
        private String usn;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem, String usn) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
            this.usn = usn;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
           switch(kind)
           {
               case "Home":
                   node = new HomeJPanel();
                   break;
               case "Manage":
                   node = new ManageJPanel(usn);
                   break;
               case "Employee":
                   node = new StaffJPanel();
                   break;
               case "Statistical":
                   node = new StatisticalJPanel();
                   break;
               case "Account":
                   node = new AccountJPanel(usn);
                   break;
               default:
                   break;
                           
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
           setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(31,36,42));
            jlbItem.setBackground(new Color(31,36,42));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(31,36,42));
            jlbItem.setBackground(new Color(31,36,42));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind))
            {
                jpnItem.setBackground(new Color(51,51,51));
                jlbItem.setBackground(new Color(51,51,51));
            }
        }
                
    }
    private void setChangeBackground(String kind)
    {
        for(Bean item : listItem)
        {
            if(item.getKind().equalsIgnoreCase(kind))
            {
                item.getJpn().setBackground(new Color(31,36,42));
                item.getJlb().setBackground(new Color(31,36,42));
            }
            else
            {
                item.getJpn().setBackground(new Color(51,51,51));
                item.getJlb().setBackground(new Color(51,51,51));
            }
        }
    }
}
