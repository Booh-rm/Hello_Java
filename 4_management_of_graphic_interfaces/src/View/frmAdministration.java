package View;

import Controller.ctlPets;
import Controller.ctlCustomers;
import Class.*;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


//------------------------------------------------------------------------------------------------------------------

/**
 * ===========================================================================================
 * 
 * author @Booh
 * 
 * ===========================================================================================
 **/

/*
   ------------------------------------------------------------------------------------
   |                                                                                  |
   |        M a n a g e m e n t   o f   g r a p h i c   i n t e r f ac e s            |
   |                                                                                  |
   ------------------------------------------------------------------------------------
*/

//------------------------------------------------------------------------------------------------------------------

public class frmAdministration extends javax.swing.JFrame {

    ctlCustomers customerControl = new ctlCustomers();
    ctlPets petControl = new ctlPets();
    
    LinkedList<clsCustomers> customerObjectList = new LinkedList<>();
    LinkedList<clsPets> petObjectList = new LinkedList<>();

    public frmAdministration() {
        initComponents();
        
        customerObjectList.add(new clsCustomers("1234567891", "Name customer 1", "Last name customer 1", "Address customer 1", "Phone customer 1"));
        customerObjectList.add(new clsCustomers("1234567892", "Name customer 2", "Last name customer 2", "Address customer 2", "Phone customer 2"));
        customerObjectList.add(new clsCustomers("1234567893", "Name customer 3", "Last name customer 3", "Address customer 3", "Phone customer 3"));
        showCustomerList();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        LbTitle = new javax.swing.JLabel();
        TbPnView = new javax.swing.JTabbedPane();
        PnCustomerList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LsCustomers = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        PnPetsList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LsPets = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        PnCustomers = new javax.swing.JPanel();
        LbIdCustomer = new javax.swing.JLabel();
        LbNameCustomer = new javax.swing.JLabel();
        LbLastNameCustomer = new javax.swing.JLabel();
        LbAddressCustomer = new javax.swing.JLabel();
        LbPhoneCustomer = new javax.swing.JLabel();
        TxtNameCustomer = new javax.swing.JTextField();
        TxtIdCustomer = new javax.swing.JTextField();
        TxtLastNameCustomer = new javax.swing.JTextField();
        TxtAddressCustomer = new javax.swing.JTextField();
        TxtPhoneCustomer = new javax.swing.JTextField();
        BtCreateCustomer = new javax.swing.JButton();
        BtReadCustomer = new javax.swing.JButton();
        BtUpdateCustomer = new javax.swing.JButton();
        BtDeleteCustomer = new javax.swing.JButton();
        BtClearFielsCustomer = new javax.swing.JButton();
        PnPets = new javax.swing.JPanel();
        TxtCodePet = new javax.swing.JTextField();
        LbCodePet = new javax.swing.JLabel();
        LbNamePet = new javax.swing.JLabel();
        TxtNamePet = new javax.swing.JTextField();
        LbAgePet = new javax.swing.JLabel();
        TxtAgePet = new javax.swing.JTextField();
        LbWeightPet = new javax.swing.JLabel();
        TxtWeightPet = new javax.swing.JTextField();
        LbSpeciePet = new javax.swing.JLabel();
        BtCreatePet = new javax.swing.JButton();
        BtReadPet = new javax.swing.JButton();
        BtUpdatePet = new javax.swing.JButton();
        BtDeletePet = new javax.swing.JButton();
        BtClearFieldsPet = new javax.swing.JButton();
        LbOwnerIdPet = new javax.swing.JLabel();
        ComboBSpeciePet = new javax.swing.JComboBox<>();
        LbPetPlan = new javax.swing.JLabel();
        ComboBPetPlan = new javax.swing.JComboBox<>();
        TxtIdOwnerPet = new javax.swing.JTextField();
        LbPlanDescriptionPet = new javax.swing.JLabel();
        TxtPlanDescripcion = new javax.swing.JScrollPane();
        TxtPlanDescriptionPet = new javax.swing.JTextArea();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Your Pet");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setLocation(new java.awt.Point(500, 180));
        setResizable(false);

        LbTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Baner.jpg"))); // NOI18N

        TbPnView.setBackground(new java.awt.Color(204, 204, 204));
        TbPnView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PnCustomerList.setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane1.setViewportView(LsCustomers);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/1.jpg"))); // NOI18N

        javax.swing.GroupLayout PnCustomerListLayout = new javax.swing.GroupLayout(PnCustomerList);
        PnCustomerList.setLayout(PnCustomerListLayout);
        PnCustomerListLayout.setHorizontalGroup(
            PnCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCustomerListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnCustomerListLayout.setVerticalGroup(
            PnCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnCustomerListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnCustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TbPnView.addTab("Customer list", PnCustomerList);

        PnPetsList.setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane2.setViewportView(LsPets);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/2.jpg"))); // NOI18N

        javax.swing.GroupLayout PnPetsListLayout = new javax.swing.GroupLayout(PnPetsList);
        PnPetsList.setLayout(PnPetsListLayout);
        PnPetsListLayout.setHorizontalGroup(
            PnPetsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPetsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
        );
        PnPetsListLayout.setVerticalGroup(
            PnPetsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPetsListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnPetsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        TbPnView.addTab("Affiliated pets list", PnPetsList);

        PnCustomers.setBackground(new java.awt.Color(204, 204, 204));

        LbIdCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbIdCustomer.setText("Identification:");

        LbNameCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbNameCustomer.setText("Name:");

        LbLastNameCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbLastNameCustomer.setText("Last name:");

        LbAddressCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbAddressCustomer.setText("Address:");

        LbPhoneCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbPhoneCustomer.setText("Phone:");

        TxtNameCustomer.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        TxtIdCustomer.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        TxtLastNameCustomer.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        TxtAddressCustomer.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        TxtPhoneCustomer.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        BtCreateCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtCreateCustomer.setText("Create");
        BtCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCreateCustomerActionPerformed(evt);
            }
        });

        BtReadCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtReadCustomer.setText("Read");
        BtReadCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtReadCustomerActionPerformed(evt);
            }
        });

        BtUpdateCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtUpdateCustomer.setText("Update");
        BtUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtUpdateCustomerActionPerformed(evt);
            }
        });

        BtDeleteCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtDeleteCustomer.setText("Delete");
        BtDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeleteCustomerActionPerformed(evt);
            }
        });

        BtClearFielsCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtClearFielsCustomer.setText("  Clear fields  ");
        BtClearFielsCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearFielsCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnCustomersLayout = new javax.swing.GroupLayout(PnCustomers);
        PnCustomers.setLayout(PnCustomersLayout);
        PnCustomersLayout.setHorizontalGroup(
            PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnCustomersLayout.createSequentialGroup()
                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnCustomersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtCreateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtReadCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtDeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtClearFielsCustomer))
                    .addGroup(PnCustomersLayout.createSequentialGroup()
                        .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnCustomersLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbNameCustomer)
                                    .addComponent(LbLastNameCustomer)
                                    .addComponent(LbPhoneCustomer)
                                    .addComponent(LbAddressCustomer))
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnCustomersLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LbIdCustomer)
                                .addGap(18, 18, 18)))
                        .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtPhoneCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                            .addComponent(TxtAddressCustomer)
                            .addComponent(TxtNameCustomer)
                            .addComponent(TxtLastNameCustomer)
                            .addComponent(TxtIdCustomer))))
                .addGap(69, 69, 69))
        );
        PnCustomersLayout.setVerticalGroup(
            PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCustomersLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbIdCustomer))
                .addGap(18, 18, 18)
                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNameCustomer)
                    .addComponent(TxtNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtLastNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbLastNameCustomer))
                .addGap(16, 16, 16)
                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAddressCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbAddressCustomer))
                .addGap(18, 18, 18)
                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPhoneCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbPhoneCustomer))
                .addGap(58, 58, 58)
                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCreateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtReadCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtClearFielsCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        TbPnView.addTab("Customers management", PnCustomers);

        PnPets.setBackground(new java.awt.Color(204, 204, 204));

        TxtCodePet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        LbCodePet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbCodePet.setText("Code:");

        LbNamePet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbNamePet.setText("Name:    ");

        TxtNamePet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        LbAgePet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbAgePet.setText("Age:");

        TxtAgePet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        LbWeightPet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbWeightPet.setText("Weight:");

        TxtWeightPet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        LbSpeciePet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbSpeciePet.setText("Specie:");

        BtCreatePet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtCreatePet.setText("Create");
        BtCreatePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCreatePetActionPerformed(evt);
            }
        });

        BtReadPet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtReadPet.setText("Read");
        BtReadPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtReadPetActionPerformed(evt);
            }
        });

        BtUpdatePet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtUpdatePet.setText("Update");
        BtUpdatePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtUpdatePetActionPerformed(evt);
            }
        });

        BtDeletePet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtDeletePet.setText("Delete");
        BtDeletePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeletePetActionPerformed(evt);
            }
        });

        BtClearFieldsPet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtClearFieldsPet.setText("   Clear fields   ");
        BtClearFieldsPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearFieldsPetActionPerformed(evt);
            }
        });

        LbOwnerIdPet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbOwnerIdPet.setText("Who is the owner? Enter your ID: ");

        ComboBSpeciePet.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        ComboBSpeciePet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canine", "Feline" }));
        ComboBSpeciePet.setPreferredSize(new java.awt.Dimension(56, 26));

        LbPetPlan.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbPetPlan.setText("Pet Plan:");

        ComboBPetPlan.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        ComboBPetPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your plan here.", "Wellness", "Elite", "Diamond" }));
        ComboBPetPlan.setPreferredSize(new java.awt.Dimension(56, 26));
        ComboBPetPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBPetPlanActionPerformed(evt);
            }
        });

        TxtIdOwnerPet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        LbPlanDescriptionPet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbPlanDescriptionPet.setText("Plan Description:");

        TxtPlanDescripcion.setToolTipText("");
        TxtPlanDescripcion.setFocusable(false);

        TxtPlanDescriptionPet.setColumns(20);
        TxtPlanDescriptionPet.setRows(5);
        TxtPlanDescriptionPet.setFocusable(false);
        TxtPlanDescripcion.setViewportView(TxtPlanDescriptionPet);

        javax.swing.GroupLayout PnPetsLayout = new javax.swing.GroupLayout(PnPets);
        PnPets.setLayout(PnPetsLayout);
        PnPetsLayout.setHorizontalGroup(
            PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPetsLayout.createSequentialGroup()
                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnPetsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BtCreatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BtReadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(BtUpdatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(BtDeletePet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnPetsLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PnPetsLayout.createSequentialGroup()
                                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbCodePet)
                                    .addComponent(LbNamePet)
                                    .addComponent(LbAgePet)
                                    .addComponent(LbWeightPet))
                                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnPetsLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(TxtAgePet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                            .addComponent(TxtCodePet, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtNamePet, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPetsLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(TxtWeightPet, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(LbOwnerIdPet, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnPetsLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBSpeciePet, 0, 229, Short.MAX_VALUE)
                                    .addComponent(ComboBPetPlan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtIdOwnerPet))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PnPetsLayout.createSequentialGroup()
                                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnPetsLayout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(LbPetPlan))
                                    .addGroup(PnPetsLayout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(LbSpeciePet)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPetsLayout.createSequentialGroup()
                        .addComponent(BtClearFieldsPet)
                        .addGap(31, 31, 31))
                    .addGroup(PnPetsLayout.createSequentialGroup()
                        .addComponent(TxtPlanDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPetsLayout.createSequentialGroup()
                        .addComponent(LbPlanDescriptionPet)
                        .addGap(38, 38, 38))))
        );
        PnPetsLayout.setVerticalGroup(
            PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPetsLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodePet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCodePet)
                    .addComponent(LbSpeciePet)
                    .addComponent(LbPlanDescriptionPet))
                .addGap(18, 18, 18)
                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnPetsLayout.createSequentialGroup()
                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbNamePet)
                            .addComponent(TxtNamePet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBSpeciePet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtAgePet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbAgePet)
                            .addComponent(LbPetPlan))
                        .addGap(15, 15, 15)
                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtWeightPet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbWeightPet)
                            .addComponent(ComboBPetPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbOwnerIdPet)
                            .addComponent(TxtIdOwnerPet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TxtPlanDescripcion))
                .addGap(55, 55, 55)
                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCreatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtReadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtUpdatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDeletePet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtClearFieldsPet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        TbPnView.addTab("Pets management", PnPets);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TbPnView)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(LbTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(LbTitle)
                .addGap(18, 18, 18)
                .addComponent(TbPnView, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("view");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBPetPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBPetPlanActionPerformed
        
        if (ComboBPetPlan.getSelectedItem().toString().equals("Wellness")){
            TxtPlanDescriptionPet.setText("CODE: 001"+ '\n'+ "NAME: Wellness" + '\n' + "DESCRIPTION: Basic plan for the care of your pet." + '\n' +"PRICE: 100 USD");
        }
        else if (ComboBPetPlan.getSelectedItem().toString().equals("Elite")) {
            TxtPlanDescriptionPet.setText("CODE: 002"+ '\n'+ "NAME: Elite" + '\n' + "DESCRIPTION: Elite plan for the care of your pet." + '\n' +"PRICE: 200 USD");
        }

        else if (ComboBPetPlan.getSelectedItem().toString().equals("Diamond")) {
            TxtPlanDescriptionPet.setText("CODE: 003"+ '\n'+ "NAME: Diamond" + '\n' + "DESCRIPTION: Diamond plan for the care of your pet." + '\n' +"PRICE: 300 USD");
        }

    }//GEN-LAST:event_ComboBPetPlanActionPerformed

    private void BtClearFieldsPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearFieldsPetActionPerformed
        TxtCodePet.setText("");
        TxtNamePet.setText("");
        TxtAgePet.setText("");
        TxtWeightPet.setText("");
        TxtIdOwnerPet.setText("");
        ComboBSpeciePet.setSelectedIndex(0);
        ComboBPetPlan.setSelectedIndex(0);
        TxtPlanDescriptionPet.setText("");
        ComboBSpeciePet.setEnabled(true);
        TxtIdOwnerPet.setFocusable(true);
    }//GEN-LAST:event_BtClearFieldsPetActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtDeletePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletePetActionPerformed

        String codeFound = TxtCodePet.getText();

        if(codeFound.equals("")){
            JOptionPane.showMessageDialog(this, "You must fill in the pet's code in order to make the query.");
        }
        else {
            boolean found = false;

            for (clsPets pets : petObjectList) {

                if (pets.getCode().equals(codeFound)) {

                    int reply = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the pet's registration with code: " + codeFound);

                    if (reply == JOptionPane.OK_OPTION) {
                        petObjectList.remove(pets);
                        showListPets();
                        cleanupQuestionnairePets();

                        //Delete pet record - CONTROLLER:
                        petControl.deletePet(codeFound, pets);
                    }
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "¡The pet with a code: " + codeFound + ". Not registered!");
                cleanupQuestionnairePets();
            }
        }
    }//GEN-LAST:event_BtDeletePetActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtUpdatePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUpdatePetActionPerformed

        String codeFound = TxtCodePet.getText();

        ComboBSpeciePet.setEnabled(false);
        TxtIdOwnerPet.setFocusable(false);

        if(codeFound.equals("")){
            JOptionPane.showMessageDialog(this, "You must fill in the pet's code in order to make the query.");
        }

        else {
            boolean found = false;

            for (clsCustomers customers : customerObjectList) {

                int index = 0;

                for (clsPets pets : petObjectList) {

                    String idOwner = pets.getCustomer().getId();

                    if (customers.getId().equals(idOwner)) {

                        String name = customers.getName();
                        String lastName = customers.getLastName();
                        String address = customers.getAddress();
                        String phone = customers.getPhone();

                        clsCustomers owner = new clsCustomers(idOwner, name, lastName, address, phone);

                        if (pets.getCode().equals(codeFound)) {

                            String namePet = TxtNamePet.getText();
                            int age = Integer.parseInt(TxtAgePet.getText());
                            double weight = Double.parseDouble(TxtWeightPet.getText());
                            String specie = (String) ComboBSpeciePet.getSelectedItem();

                            if (ComboBPetPlan.getSelectedItem().equals("Wellness")){

                                clsPlans plan_W = new clsPlans("001", "Wellness", "Basic plan for the care of your pet.", 100);

                                clsPets pet_updated = new clsPets(codeFound, namePet, age, weight, specie, plan_W, owner);
                                petObjectList.set(index, pet_updated);

                                showListPets();

                                //Update pet - CONTROLLER:
                                petControl.updatePet(codeFound, pet_updated);

                                JOptionPane.showMessageDialog(this, "Pet account with code: " + codeFound + " has been successfully updated.");
                                cleanupQuestionnairePets();
                                found = true;
                                break;
                            }

                            else if (ComboBPetPlan.getSelectedItem().equals("Elite")) {

                                clsPlans plan_e = new clsPlans("002", "Elite", "Elite plan for the care of your pet.", 200);

                                clsPets pet_updated = new clsPets(codeFound, namePet, age, weight, specie, plan_e, owner);
                                petObjectList.set(index, pet_updated);

                                showListPets();

                                //Update pet - CONTROLLER:
                                petControl.updatePet(codeFound, pet_updated);

                                JOptionPane.showMessageDialog(this, "Pet account with code: " + codeFound + " has been successfully updated.");
                                cleanupQuestionnairePets();
                                found = true;
                                break;
                            }

                            else if (ComboBPetPlan.getSelectedItem().equals("Diamond")) {
                                clsPlans plan_d = new clsPlans("003", "Diamond", "Diamond plan for the care of your pet.", 300);

                                clsPets pet_updated = new clsPets(codeFound, namePet, age, weight, specie, plan_d, owner);
                                petObjectList.set(index, pet_updated);

                                showListPets();

                                //Update pet - CONTROLLER:
                                petControl.updatePet(codeFound, pet_updated);

                                JOptionPane.showMessageDialog(this, "Pet account with code: " + codeFound + " has been successfully updated.");
                                cleanupQuestionnairePets();
                                found = true;
                                break;
                            }

                            else {
                                JOptionPane.showMessageDialog(this, "You must choose a plan.");
                            }
                        }
                        index++;
                    }
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "¡The pet with a code: " + codeFound + ". Not registered!");
                cleanCustomerQuestionnaire();
            }
        }
    }//GEN-LAST:event_BtUpdatePetActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtReadPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtReadPetActionPerformed

        ComboBSpeciePet.setEnabled(false);
        TxtIdOwnerPet.setFocusable(false);

        String codeFound = TxtCodePet.getText();

        if(codeFound.equals("")){
            JOptionPane.showMessageDialog(this, "You must fill in the pet's code in order to make the query.");
        }
        else {
            boolean found = false;

            //Consult pet from - CONTROLLER:
            clsPets mascotSearched = petControl.readPet(codeFound);

            for (clsPets pets : petObjectList) {

                if (pets.getCode().equals(codeFound)) {

                    //TxtADescriptionPlan.setText(pets.get);
                    TxtNamePet.setText(pets.getName());
                    TxtAgePet.setText(pets.getAge()+ "");
                    TxtWeightPet.setText(pets.getWeight()+ "");
                    TxtIdOwnerPet.setText(pets.getCustomer().getId());
                    ComboBSpeciePet.setSelectedItem(pets.getSpecie());
                    ComboBPetPlan.setSelectedItem(pets.getPlans().getName());
                    found = true;
                    break;

                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "¡The pet with a code: " + codeFound + ". Not registered!");
                cleanupQuestionnairePets();
            }
        }

    }//GEN-LAST:event_BtReadPetActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtCreatePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCreatePetActionPerformed

        try {

            String code = TxtCodePet.getText();
            String namePet = TxtNamePet.getText();
            String idOwner = TxtIdOwnerPet.getText();
            int age = Integer.parseInt(TxtAgePet.getText());
            double weight = Double.parseDouble(TxtWeightPet.getText());
            String specie = ComboBSpeciePet.getSelectedItem().toString();
            String plan = ComboBPetPlan.getSelectedItem().toString();

            if (code.equals("") || namePet.equals("") || idOwner.equals("")) {
                JOptionPane.showMessageDialog(this, "¡You must enter all the fields of the form!");
            }
            else {
                boolean found = false;
                for (clsCustomers customers : customerObjectList) {

                    if (customers.getId().equals(idOwner)) {

                        String name = customers.getName();
                        String lastName = customers.getLastName();
                        String address = customers.getAddress();
                        String phone = customers.getPhone();

                        clsCustomers owner = new clsCustomers(idOwner, name, lastName, address, phone);

                        if (ComboBPetPlan.getSelectedItem().equals("Wellness")){

                            clsPlans plan_W = new clsPlans("001", "Wellness", "Plan basico para el cuidado de su mascota", 100);

                            clsPets pet = new clsPets(code, namePet, age, weight, specie, plan_W, owner);
                            petObjectList.add(pet);
                            showListPets();
                            JOptionPane.showMessageDialog(this, "Pet account has been successfully created!");
                            cleanupQuestionnairePets();

                            //Method create - CONTROLLER:
                            petControl.createPet(pet);
                        }

                        else if (ComboBPetPlan.getSelectedItem().equals("Elite")) {

                            clsPlans plan_e = new clsPlans("002", "Elite", "Elite plan for the care of your pet.", 200);

                            clsPets pet = new clsPets(code, namePet, age, weight, specie, plan_e, owner);
                            petObjectList.add(pet);
                            showListPets();
                            JOptionPane.showMessageDialog(this, "Pet account has been successfully created!");
                            cleanupQuestionnairePets();

                            //Method create - CONTROLLER:
                            petControl.createPet(pet);
                        }

                        else if (ComboBPetPlan.getSelectedItem().equals("Diamond")) {
                            clsPlans plan_d = new clsPlans("003", "Diamond", "Diamond plan for the care of your pet.", 300);

                            clsPets pet = new clsPets(code, namePet, age, weight, specie, plan_d, owner);
                            petObjectList.add(pet);
                            showListPets();
                            JOptionPane.showMessageDialog(this, "Pet account has been successfully created!");
                            cleanupQuestionnairePets();

                            //Method create - CONTROLLER:
                            petControl.createPet(pet);
                        }

                        else {
                            JOptionPane.showMessageDialog(this, "You must choose a plan");
                        }

                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(this, "¡The ID number:" + idOwner + ". Not registered!");
                    cleanCustomerQuestionnaire();
                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The \"age\" field and the \"weight\" field must be numeric.");
        }
    }//GEN-LAST:event_BtCreatePetActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtClearFielsCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearFielsCustomerActionPerformed
        TxtIdCustomer.setText("");
        TxtNameCustomer.setText("");
        TxtLastNameCustomer.setText("");
        TxtAddressCustomer.setText("");
        TxtPhoneCustomer.setText("");
    }//GEN-LAST:event_BtClearFielsCustomerActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeleteCustomerActionPerformed

        String IDFound = TxtIdCustomer.getText();

        if(IDFound.equals("")){
            JOptionPane.showMessageDialog(this, "You must fill in the ID number in order to be able to make the query.");
        }
        else {
            boolean found = false;

            for (clsCustomers customers : customerObjectList) {

                if (customers.getId().equals(IDFound)) {

                    int reply = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the customer with ID: " + IDFound + "?");
                    if (reply == JOptionPane.OK_OPTION) {
                        customerObjectList.remove(customers);
                        showCustomerList();
                        cleanCustomerQuestionnaire();

                        //Delete customer record - CONTROLLER:
                        customerControl.deleteCustomer(IDFound, customers);

                        JOptionPane.showMessageDialog(this, "Record successfully deleted!");
                    }
                    found = true;
                    break;
                }

            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "¡The identification number: " + IDFound + ". Not registered!");
                cleanCustomerQuestionnaire();
            }
        }
    }//GEN-LAST:event_BtDeleteCustomerActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUpdateCustomerActionPerformed

        String IDFound = TxtIdCustomer.getText();

        if(IDFound.equals("")){
            JOptionPane.showMessageDialog(this, "You must fill in the ID number in order to be able to make the query.");
        }
        else {
            boolean found = false;
            int index = 0;

            for (clsCustomers customers : customerObjectList) {

                if (customers.getId().equals(IDFound)) {
                    String name = TxtNameCustomer.getText();
                    String lastName = TxtLastNameCustomer.getText();
                    String address = TxtAddressCustomer.getText();
                    String phone = TxtPhoneCustomer.getText();

                    clsCustomers customer_updated = new clsCustomers(IDFound, name, lastName, address, phone);
                    customerObjectList.set(index, customer_updated);
                    showCustomerList();
                    cleanCustomerQuestionnaire();

                    //Update client - CONTROLLER:
                    customerControl.updateCustomer(IDFound, customer_updated);

                    JOptionPane.showMessageDialog(this, "Client with ID: " + IDFound + " has been successfully updated.");

                    found = true;
                    break;
                }
                index++;
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "¡The identification number: " + IDFound + ". Not registered!");
                cleanCustomerQuestionnaire();
            }
        }

    }//GEN-LAST:event_BtUpdateCustomerActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtReadCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtReadCustomerActionPerformed

        String IDFound = TxtIdCustomer.getText();

        if(IDFound.equals("")){
            JOptionPane.showMessageDialog(this, "You must fill in the ID number in order to be able to make the query.");
        }
        else {
            boolean found = false;

            //Consult customer - CONTROLLER:
            clsCustomers customerSearched = customerControl.readCustomer(IDFound);

            for (clsCustomers customers : customerObjectList) {

                if (customers.getId().equals(IDFound)) {
                    TxtNameCustomer.setText(customers.getName());
                    TxtLastNameCustomer.setText(customers.getLastName());
                    TxtAddressCustomer.setText(customers.getAddress());
                    TxtPhoneCustomer.setText(customers.getPhone());
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "¡The identification number: " + IDFound + ". Not registered!");
                cleanCustomerQuestionnaire();
            }
        }

    }//GEN-LAST:event_BtReadCustomerActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCreateCustomerActionPerformed

        try {

            String id = TxtIdCustomer.getText();
            String name = TxtNameCustomer.getText();
            String lastName = TxtLastNameCustomer.getText();
            String address = TxtAddressCustomer.getText();
            String phone = TxtPhoneCustomer.getText();

            if (id.equals("") || name.equals("") || lastName.equals("") || address.equals("") || phone.equals("")) {
                JOptionPane.showMessageDialog(this, "¡You must enter all the fields of the form!");
            }
            else {
                clsCustomers customer = new clsCustomers(id, name, lastName, address, phone);
                customerObjectList.add(customer);
                showCustomerList();
                JOptionPane.showMessageDialog(this, "User has been successfully created!");
                cleanCustomerQuestionnaire();

                //method create customer - CONTROLLER:
                customerControl.createCustomer(customer);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }//GEN-LAST:event_BtCreateCustomerActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void cleanCustomerQuestionnaire(){
        TxtIdCustomer.setText("");
        TxtNameCustomer.setText("");
        TxtLastNameCustomer.setText("");
        TxtAddressCustomer.setText("");
        TxtPhoneCustomer.setText("");
    }
    
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void cleanupQuestionnairePets(){
        TxtCodePet.setText("");
        TxtNamePet.setText("");
        TxtAgePet.setText("");
        TxtWeightPet.setText("");
        TxtIdOwnerPet.setText("");
        ComboBSpeciePet.setSelectedIndex(0);
        ComboBPetPlan.setSelectedIndex(0);
        TxtPlanDescriptionPet.setText("");
        ComboBSpeciePet.setEnabled(true);
        TxtIdOwnerPet.setFocusable(true);
    }
    
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void showCustomerList(){
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        for (clsCustomers customers : customerObjectList) {
            String data = "ID CUSTOMER: " + customers.getId()+ " - " + " NAME: " + customers.getName()+ " - " +
                          " LAST NAME: " +customers.getLastName()+ " - " + " ADDRESS: " + customers.getAddress()+ " - " + " PHONE: " + customers.getPhone();
            model.add(index, data);
            index++;
        }
        LsCustomers.setModel(model);
    }
    
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private void showListPets(){
         DefaultListModel model = new DefaultListModel();
        int index = 0;
        for (clsPets pets : petObjectList) {
            String data = "CODE PET: " + pets.getCode()+ " - " + "NAME: " + pets.getName()+ " - " + "AGE: " + pets.getAge()+ " - " + 
                          "WEIGHT: " + pets.getWeight()+ " - " + "SPECIE: " + pets.getSpecie() + " - " + "PLAN: " + pets.getPlans().getName()
                          + " - " + "OWNER: " + pets.getCustomer().getId();
            model.add(index, data);
            index++;
        }
        LsPets.setModel(model);
    }
   
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAdministration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdministration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdministration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdministration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdministration().setVisible(true);
                
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtClearFieldsPet;
    private javax.swing.JButton BtClearFielsCustomer;
    private javax.swing.JButton BtCreateCustomer;
    private javax.swing.JButton BtCreatePet;
    private javax.swing.JButton BtDeleteCustomer;
    private javax.swing.JButton BtDeletePet;
    private javax.swing.JButton BtReadCustomer;
    private javax.swing.JButton BtReadPet;
    private javax.swing.JButton BtUpdateCustomer;
    private javax.swing.JButton BtUpdatePet;
    private javax.swing.JComboBox<String> ComboBPetPlan;
    private javax.swing.JComboBox<String> ComboBSpeciePet;
    private javax.swing.JLabel LbAddressCustomer;
    private javax.swing.JLabel LbAgePet;
    private javax.swing.JLabel LbCodePet;
    private javax.swing.JLabel LbIdCustomer;
    private javax.swing.JLabel LbLastNameCustomer;
    private javax.swing.JLabel LbNameCustomer;
    private javax.swing.JLabel LbNamePet;
    private javax.swing.JLabel LbOwnerIdPet;
    private javax.swing.JLabel LbPetPlan;
    private javax.swing.JLabel LbPhoneCustomer;
    private javax.swing.JLabel LbPlanDescriptionPet;
    private javax.swing.JLabel LbSpeciePet;
    private javax.swing.JLabel LbTitle;
    private javax.swing.JLabel LbWeightPet;
    private javax.swing.JList<String> LsCustomers;
    private javax.swing.JList<String> LsPets;
    private javax.swing.JPanel PnCustomerList;
    private javax.swing.JPanel PnCustomers;
    private javax.swing.JPanel PnPets;
    private javax.swing.JPanel PnPetsList;
    private javax.swing.JTabbedPane TbPnView;
    private javax.swing.JTextField TxtAddressCustomer;
    private javax.swing.JTextField TxtAgePet;
    private javax.swing.JTextField TxtCodePet;
    private javax.swing.JTextField TxtIdCustomer;
    private javax.swing.JTextField TxtIdOwnerPet;
    private javax.swing.JTextField TxtLastNameCustomer;
    private javax.swing.JTextField TxtNameCustomer;
    private javax.swing.JTextField TxtNamePet;
    private javax.swing.JTextField TxtPhoneCustomer;
    private javax.swing.JScrollPane TxtPlanDescripcion;
    private javax.swing.JTextArea TxtPlanDescriptionPet;
    private javax.swing.JTextField TxtWeightPet;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    
}
