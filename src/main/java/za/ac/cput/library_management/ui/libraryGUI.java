package za.ac.cput.library_management.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.api.*;
import za.ac.cput.library_management.domain.Bookline;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.factory.BooklineFactory;
import za.ac.cput.library_management.factory.ItemFactory;
import za.ac.cput.library_management.domain.Librarian;
import za.ac.cput.library_management.factory.LibrarianFactory;
import za.ac.cput.library_management.factory.LibraryFactory;
import za.ac.cput.library_management.factory.MemberFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Objects;

@Component
@ComponentScan({"za.ac.cput.library_management"})
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
    private JPanel pnlLibrary;
    private JTable libraryTable;
    private JTextField librarySearchText;
    private JButton libraryAddLibrary;
    private JButton libraryDeleteLibrary;
    private JScrollPane libraryTableScrollPane;
    private JPanel addLibrary;
    private JTextField addLibraryIDText;
    private JTextField addLibraryNameText;
    private JTextField addLibraryAddressText;
    private JTextField addLibraryTelText;
    private JButton addLibraryAddButton;
    private JButton addLibraryCancelButton;
    private JLabel addLibraryIDLabel;
    private JLabel addLibraryNameLabel;
    private JLabel addLibraryAddressLabel;
    private JLabel addLibraryTelLabel;
    private JTextField addBooklineLibraryText;
    private JTextField addBooklineItemText;
    private JTextField addBooklineMember;
    private JTextField addItemIDText;
    private JTextField addItemGenreText;

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
                tbpnlView.setSelectedIndex(5);
                tbpnlInsert.setSelectedIndex(0);
            }
        });
        addLibrarianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(5);
                tbpnlInsert.setSelectedIndex(3);
            }
        });
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(5);
                tbpnlInsert.setSelectedIndex(1);
            }
        });
        addMemberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(5);
                tbpnlInsert.setSelectedIndex(2);
            }
        });
        libraryAddLibrary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(5);
                tbpnlInsert.setSelectedIndex(4);
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

        addLibraryCancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbpnlView.setSelectedIndex(4);
                addLibraryIDText.setText("");
                addLibraryNameText.setText("");
                addLibraryAddressText.setText("");
                addLibraryTelText.setText("");
            }
        });

        //TODO: ADD BOOKLINE
        btnAddBooklineBorrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addBooklineLibraryText.getText() == null
                        || addBooklineLibraryText.getText() == null
                        || txtAddBooklineMember.getText() == null
                        || txtAddBooklineDueDate.getText() == null
                        || Objects.equals(addBooklineLibraryText.getText(), "")
                        || Objects.equals(addBooklineItemText.getText(), "")
                        || Objects.equals(txtAddBooklineMember.getText(), "")
                        || Objects.equals(txtAddBooklineDueDate.getText(), "")
                ) {
                    JOptionPane.showMessageDialog(pnlMain,"Error:One or more fields are missing data.","Error",JOptionPane.ERROR_MESSAGE);
                } else {
                    int result = JOptionPane.showConfirmDialog(pnlMain, "Are you sure you wish to create this Bookline?");
                    if (result == JOptionPane.YES_OPTION) {
                        Library library = libraryAPI.getLibraryById(addBooklineLibraryText.getText());
                        Item item = itemAPI.getItemsById(addBooklineItemText.getText());
                        Member member = memberAPI.getMembersById(txtAddBooklineMember.getText());
                        Bookline bookline = BooklineFactory.createBookline(
                                "id",
                                library,
                                item,
                                member,
                                null,
                                new Date(),
                                null);

                        if (bookline == null) {
                            JOptionPane.showMessageDialog(pnlMain, "Error: Bookline entity was not created", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            booklineAPI.addBookline(bookline);
                            createTables();

                            tbpnlView.setSelectedIndex(0);
                            addBooklineLibraryText.setText("");
                            addBooklineItemText.setText("");
                            txtAddBooklineMember.setText("");
                            txtAddBooklineDueDate.setText("");
                        }
                    }
                }
            }
        });

                //TODO: ADD ITEM
                addItemAddButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (addItemIDText.getText() == null
                                || addItemNameText.getText() == null
                                || addItemGenreText.getText() == null
                                || addItemAuthorText.getText() == null
                                || Objects.equals(addItemIDText.getText(), "")
                                || Objects.equals(addItemNameText.getText(), "")
                                || Objects.equals(addItemGenreText.getText(), "")
                                || Objects.equals(addItemAuthorText.getText(), "")
                        ) {
                            JOptionPane.showMessageDialog(pnlMain, "Error:One or more fields are missing data.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            int result = JOptionPane.showConfirmDialog(pnlMain, "Are you sure you wish to create this Item?");
                            if (result == JOptionPane.YES_OPTION) {
                                Item item = ItemFactory.createItem(
                                        addItemIDText.getText(),
                                        addItemNameText.getText(),
                                        addItemGenreText.getText(),
                                        addItemAuthorText.getText(),
                                        "Active"
                                );
                                if (item == null) {
                                    JOptionPane.showMessageDialog(pnlMain, "Error: Item entity was not created", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    itemAPI.addItems(item);
                                       createTables();

                                    tbpnlView.setSelectedIndex(2);
                                    addItemIDText.setText("");
                                    addItemNameText.setText("");
                                    addItemGenreText.setText("");
                                    addItemAuthorText.setText("");
                                }
                            }
                        }
                    }
                });

                addMemberAddButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (addMemberIDText.getText() == null
                                || addMemberNameText.getText() == null
                                || addMemberAddressText.getText() == null
                                || addMemberTelText.getText() == null
                                || Objects.equals(addMemberIDText.getText(), "")
                                || Objects.equals(addMemberNameText.getText(), "")
                                || Objects.equals(addMemberAddressText.getText(), "")
                                || Objects.equals(addMemberTelText.getText(), "")
                        ) {
                            JOptionPane.showMessageDialog(pnlMain, "Error:One or more fields are missing data.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            int result = JOptionPane.showConfirmDialog(pnlMain, "Are you sure you wish to create this Member?");
                            if (result == JOptionPane.YES_OPTION) {
                                Member member = MemberFactory.createMember(
                                        addMemberIDText.getText(),
                                        addMemberNameText.getText(),
                                        addMemberAddressText.getText(),
                                        addMemberTelText.getText(),
                                        "Active"
                                );
                                if (member == null) {
                                    JOptionPane.showMessageDialog(pnlMain, "Error: Member entity was not created", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    memberAPI.addMember(member);
                                       createTables();

                                    tbpnlView.setSelectedIndex(3);
                                    addMemberIDText.setText("");
                                    addMemberNameText.setText("");
                                    addMemberAddressText.setText("");
                                    addMemberTelText.setText("");
                                }
                            }
                        }
                    }
                });
      
                deleteMemberButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int result = JOptionPane.showConfirmDialog(pnlMain, "Are you sure you wish to delete this Member?");
                        if (result == JOptionPane.YES_OPTION) {
                            int row = memberTable.getSelectedRow();
                            if (row == -1) {
                                JOptionPane.showMessageDialog(pnlMain, "Error: No Member is selected", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                String select = memberTable.getModel().getValueAt(row, 0).toString();
                                memberAPI.deleteMemberById(select);
                                createTables();
                            }
                        }
                    }
                });
                
        //TODO: ADD LIBRARIAN
        addLibrarianAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addLibrarianIDText.getText() == null
                        || addLibrarianNameText.getText() == null
                        || addLibrarianAddressText.getText() == null
                        || addLibrarianTelText.getText() == null
                        || Objects.equals(addLibrarianIDText.getText(), "")
                        || Objects.equals(addLibrarianNameText.getText(), "")
                        || Objects.equals(addLibrarianAddressText.getText(), "")
                        || Objects.equals(addLibrarianTelText.getText(), "")
                ) {
                    JOptionPane.showMessageDialog(pnlMain,"Error:One or more fields are missing data.","Error",JOptionPane.ERROR_MESSAGE);
                } else {
                    int result = JOptionPane.showConfirmDialog(pnlMain, "Are you sure you wish to create this Librarian?");
                    if (result == JOptionPane.YES_OPTION) {
                        Librarian librarian = LibrarianFactory.createLibrarian(
                                addLibrarianIDText.getText(),
                                addLibrarianNameText.getText(),
                                addLibrarianAddressText.getText(),
                                addLibrarianTelText.getText(),
                                null
                        );
                        if (librarian == null) {
                            JOptionPane.showMessageDialog(pnlMain, "Error: Librarian entity was not created", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            librarianAPI.addLibrarian(librarian);
                            createTables();

                            tbpnlView.setSelectedIndex(1);
                            addLibrarianIDText.setText("");
                            addLibrarianNameText.setText("");
                            addLibrarianAddressText.setText("");
                            addLibrarianTelText.setText("");
                        }
                    }
                }
            }
        });
        
        //TODO: ADD LIBRARY
        addLibraryAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(addLibraryIDText.getText()== null ||addLibraryNameText.getText() == null || addLibraryAddressText.getText() == null || addLibraryTelText.getText() == null
                  || Objects.equals(addLibraryIDText.getText(),"")
                  || Objects.equals(addLibraryNameText.getText(),"")
                  || Objects.equals(addLibraryAddressText.getText(),"")
                  || Objects.equals(addLibraryTelText,"")  )
                    {
                    JOptionPane.showMessageDialog(pnlMain,"Error fields are missing data", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                    Library library = LibraryFactory.createLibrary(addLibraryIDText.getText(), addLibraryNameText.getText()
                            ,addLibraryAddressText.getText(),addLibraryTelText.getText());
                        if(library == null){
                            JOptionPane.showMessageDialog(pnlMain,"Error fields are missing data", "Error", JOptionPane.ERROR_MESSAGE);
                        }else {
                            libraryAPI.addLibrary(library);
                            createTables();
                            tbpnlView.setSelectedIndex(4);
                            addLibraryIDText.setText("");
                            addLibraryNameText.setText("");
                            addLibraryAddressText.setText("");
                            addLibraryTelText.setText("");
                        }
                }

            }
  });

        libraryDeleteLibrary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(pnlMain,"Are you sure you want to delete this member?");
                if(result == JOptionPane.YES_OPTION){
                    int row = libraryTable.getSelectedRow();
                    String select = libraryTable.getModel().getValueAt(row,0).toString();
                    libraryAPI.deleteLibraryById(select);
                    createTables();
                }
            }
        });
        booklineReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(pnlMain, "Are you sure you wish to delete this Bookline?");
                if (result == JOptionPane.YES_OPTION) {
                    int row = booklineTable.getSelectedRow();
                    if (row == -1) {
                        JOptionPane.showMessageDialog(pnlMain, "Error: No bookline is selected", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String select = itemTable.getModel().getValueAt(row, 0).toString();
                        booklineAPI.deleteById(select);
                        createTables();
                    }
                }
            }
        });

        deleteLibrarianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(pnlMain, "Are you sure you wish to delete this Librarian?");
                if (result == JOptionPane.YES_OPTION) {
                    int row = librarianTable.getSelectedRow();
                    if (row == -1 ) {
                        JOptionPane.showMessageDialog(pnlMain,"Error: No Librarian is selected","Error",JOptionPane.ERROR_MESSAGE);
                    }else {
                        String select = librarianTable.getModel().getValueAt(row, 0).toString();
                        librarianAPI.deleteLibrarianById(select);
                        createTables();
                    }
                }
            }
        });
    }



    private void createTables() {

        Object[][] memberData = this.memberAPI.getMembersTable();
        Object[][] librarianData = this.librarianAPI.getLibrariansTable();
        Object[][] booklineData = this.booklineAPI.getBooklineTable();
        Object[][] libraryData = this.libraryAPI.getLibrariesTable();
        Object[][] itemData = this.itemAPI.getItemsTable();


        memberTable.setModel(new DefaultTableModel(
                memberData,
                new String[]{"ID","Name","Address","Tel","Status"}
        ));

        itemTable.setModel(new DefaultTableModel(
                itemData,
                new String[]{"ID","Name","Author","Genre","Status"}
        ));

        booklineTable.setModel(new DefaultTableModel(
                booklineData,
                new String[]{"ID","Member","Item","Library","Date"}
        ));

        librarianTable.setModel(new DefaultTableModel(
                librarianData,
                new String[]{"ID","Name","Address","Tel"}
        ));

        libraryTable.setModel(new DefaultTableModel(
                libraryData,
                new String[]{"ID","Name","Address","Tel"}
        ));
    }
}






