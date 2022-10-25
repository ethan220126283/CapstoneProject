package za.ac.cput.library_management.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.api.ItemAPI;
import za.ac.cput.library_management.api.LibrarianAPI;
import za.ac.cput.library_management.api.LibraryAPI;
import za.ac.cput.library_management.api.MemberAPI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;

//@Component
//@ComponentScan({"za.ac.cput.library_management"})
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
    private JTabbedPane tbpnlInsert;
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
    private JTextField addLibrarianNameText;
    private JTextField addLibrarianAddressText;
    private JTextField addLibrarianTelText;
    private JButton addLibrarianAddButton;
    private JButton addLibrarianCancelButton;
    private JComboBox comboBox1;
    private JTextField textField4;
    private JTextField textField5;
    private JComboBox comboBox2;
    private JButton addItemButton1;
    private JButton cancelButton1;
    private JTextField addMemberIDText;
    private JTextField addMemberNameText;
    private JTextField addMemberAddressText;
    private JTextField addMemberTelText;
    private JButton addMemberAddButton;
    private JButton addMemberCancelButton;
    private JLabel addLibrarianNameLabel;
    private JLabel addLibrarianAddressLabel;
    private JLabel addLibrarianTelLabel;
    private JLabel addMemberIDLabel;
    private JLabel addMemberNameLabel;
    private JLabel addMemberAddressLabel;
    private JLabel addMemberTelLabel;
    private JLabel addItemIDLabel;
    private JLabel addItemNameLabel;
    private JLabel addItemAuthorLabel;
    private JLabel addItemGenreLabel;
    private JScrollPane memberTableScrollPane;
    private JScrollPane itemTableScrollPane;
    private JScrollPane librarianTableScrollPane;
    private JScrollPane booklineTableScrollPane;

    private MemberAPI memberAPI;
    private ItemAPI itemAPI;
    private LibrarianAPI librarianAPI;
    private LibraryAPI libraryAPI;

    //private BooklineAPI booklineAPI;


    @Autowired
    public libraryGUI(LibraryAPI libraryAPI, ItemAPI itemAPI, LibrarianAPI librarianAPI, MemberAPI memberAPI) {
        super();

        this.memberAPI = memberAPI;
        this.itemAPI = itemAPI;
        this.librarianAPI = librarianAPI;
        this.libraryAPI = libraryAPI;

        //JTable memberTable = new JTable(new DefaultTableModel(new Object[]{"ID","Name","Address","Tel","Status"}, 6));

        createTables(this.memberAPI);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlMain);
        this.pack();
    }

    private void createTables(MemberAPI memberAPI) {

        Object[][] memberData = memberAPI.getMembersTable();

        memberTable.setModel(new DefaultTableModel(
                memberData,
                new String[]{"ID","Name","Address","Tel","Status"}
        ));

        itemTable.setModel(new DefaultTableModel(
                null,
                new String[]{"ID","Name","Author","Genre","Status"}
        ));

        booklineTable.setModel(new DefaultTableModel(
                null,
                new String[]{"ID","Name","Address","Tel","Status"}
        ));

        librarianTable.setModel(new DefaultTableModel(
                null,
                new String[]{"ID","Name","Address","Tel"}
        ));
    }

}
