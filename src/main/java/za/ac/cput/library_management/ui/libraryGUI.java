package za.ac.cput.library_management.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.api.MemberAPI;

import javax.swing.*;

@Component
public class libraryGUI extends JFrame {
    private JPanel pnlMain;
    private JPanel pnlView;
    private JTabbedPane tbpnlView;
    private JPanel pnlBookline;
    private JTable booklineTable;
    private JButton booklineReturn;
    private JButton borrowButton;
    private JTextField booklineSearchText;
    private JPanel pnlLibrarian;
    private JPanel pnlItem;
    private JPanel pnlMember;
    private JButton addLibrarianButton;
    private JButton deleteLibrarianButton;
    private JTextField librarianSearchText;
    private JTable librarianTable;
    private JButton addItemButton;
    private JButton deleteLibrarianButton1;
    private JButton addMemberButton;
    private JButton deleteMemberButton;
    private JTextField memberSearchText;
    private JTextField itemSearchText;
    private JTable memberTable;
    private JTable itemTable;
    private JTabbedPane tbpnlAdd;
    private JPanel addBooklinePanel;
    private JPanel addItemPanel;
    private JPanel addMemberPanel;
    private JPanel addLibrarianPanel;
    private JComboBox cmbAddBooklineLibrary;
    private JComboBox cmbAddBooklineItem;
    private JTextField txtAddBooklineMember;
    private JTextField txtAddBooklineDueDate;
    private JButton btnAddBooklineBorrow;
    private JButton btnAddBooklineCancel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    private JComboBox comboBox1;
    private JTextField textField4;
    private JTextField textField5;
    private JComboBox comboBox2;
    private JButton button3;
    private JButton button4;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton button5;
    private JButton button6;

    private MemberAPI memberAPI;

    @Autowired
    libraryGUI(MemberAPI memberAPI) {
        this.memberAPI = memberAPI;
    }

    public libraryGUI() {
        super();

        memberAPI.addMember("5","James","123 Street", "021 323 3245", "Active");
        memberSearchText.setText(memberAPI.getMembersById("5").toString());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlMain);
        this.pack();
    }
}
