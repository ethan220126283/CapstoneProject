package za.ac.cput.library_management.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.api.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JComboBox addItemIdentifierCmb;
    private JTextField addItemNameText;
    private JTextField addItemAuthorText;
    private JComboBox addItemGenreCmb;
    private JButton addItemAddButton;
    private JButton addItemCancelButton;
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
    private JLabel addBooklineLibraryLabel;
    private JLabel addBooklineItemLabel;
    private JLabel addBooklineMemberLabel;
    private JLabel addBooklineDueDateLabel;
    private JTextField addLibrarianIDText;
    private JLabel addLibrarianIDLabel;

    private MemberAPI memberAPI;
    private ItemAPI itemAPI;
    private LibrarianAPI librarianAPI;
    private LibraryAPI libraryAPI;

    private BooklineAPI booklineAPI;


    @Autowired
    public libraryGUI(LibraryAPI libraryAPI, ItemAPI itemAPI, LibrarianAPI librarianAPI, MemberAPI memberAPI, BooklineAPI booklineAPI) {
        super();

        this.memberAPI = memberAPI;
        this.itemAPI = itemAPI;
        this.librarianAPI = librarianAPI;
        this.libraryAPI = libraryAPI;
        this.booklineAPI = booklineAPI;

        //JTable memberTable = new JTable(new DefaultTableModel(new Object[]{"ID","Name","Address","Tel","Status"}, 6));

        createTables();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlMain);
        this.pack();
        borrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(4);
                tbpnlInsert.setSelectedIndex(0);
            }
        });
        addLibrarianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(4);
                tbpnlInsert.setSelectedIndex(3);
            }
        });
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(4);
                tbpnlInsert.setSelectedIndex(1);
            }
        });
        addMemberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(4);
                tbpnlInsert.setSelectedIndex(2);
            }
        });
        btnAddBooklineCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(0);
                cmbAddBooklineLibrary.setSelectedIndex(-1);
                cmbAddBooklineItem.setSelectedIndex(-1);
                txtAddBooklineMember.setText("");
                txtAddBooklineDueDate.setText("");
            }
        });
        addMemberCancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(3);
                addMemberIDText.setText("");
                addMemberNameText.setText("");
                addMemberAddressText.setText("");
                addMemberTelText.setText("");
            }
        });
        addLibrarianCancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(1);
                addLibrarianIDText.setText("");
                addLibrarianNameText.setText("");
                addLibrarianAddressText.setText("");
                addLibrarianTelText.setText("");
            }
        });
        addItemCancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(2);
                addItemIdentifierCmb.setSelectedIndex(-1);
                addItemNameText.setText("");
                addItemAuthorText.setText("");
                addItemGenreCmb.setSelectedIndex(-1);
            }
        });
        //TODO: ADD BOOKLINE
        btnAddBooklineBorrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //TODO: ADD ITEM
        addItemAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //TODO: ADD MEMBER
        addMemberAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //TODO: ADD LIBRARIAN
        addLibrarianAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createTables() {

        Object[][] memberData = this.memberAPI.getMembersTable();
        Object[][] librarianData = this.librarianAPI.getLibrariansTable();
        Object[][] booklineData = this.booklineAPI.getBooklineTable();

        memberTable.setModel(new DefaultTableModel(
                memberData,
                new String[]{"ID","Name","Address","Tel","Status"}
        ));

        itemTable.setModel(new DefaultTableModel(
                null,
                new String[]{"ID","Name","Author","Genre","Status"}
        ));

        booklineTable.setModel(new DefaultTableModel(
                booklineData,
                new String[]{"ID","Name","Address","Tel","Status"}
        ));

        librarianTable.setModel(new DefaultTableModel(
                librarianData,
                new String[]{"ID","Name","Address","Tel"}
        ));
    }

}
