package View;

import Controller.*;
import Clases.*;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.*;
import java.time.*;


//------------------------------------------------------------------------------------------------------------------

/**
 * ===========================================================================================
 * 
 * @author @Booh
 * 
 * ===========================================================================================
 **/

/*
   ------------------------------------------------------------------------------------
   |                                                                                  |
   |        M a n a g e m e n t   o f   g r a p h i c   i n t e r f a c e s           |
   |          D a t a   m a n a g e m e n t   w i t h   d a t a b a s e s             |
   |                       a n d   u n i t   t e s t s                                |
   |                                                                                  |
   ------------------------------------------------------------------------------------
*/

//------------------------------------------------------------------------------------------------------------------

public class frmAdministration extends javax.swing.JFrame {

    ctlCustomers controlCustomer = new ctlCustomers();
    ctlPets controlPet = new ctlPets();
    ctlPlans controlPlans = new ctlPlans();
    ctlPayments controlPayments = new ctlPayments();
    
    LinkedList<clsCustomers> customersObjectList = new LinkedList<>();
    LinkedList<clsPets> petsObjectList = new LinkedList<>();
    LinkedList<clsPetOwner> petsOwnerObjectList = new LinkedList<>();
    LinkedList<clsPlans> plansObjectList = new LinkedList<>();
    LinkedList<clsPayments> paymentsObjectList = new LinkedList<>();
    LinkedList<clsPaymentsPet> paymentsOwnerObjectList = new LinkedList<>();

    LocalDate currentDate = LocalDate.now();
        
    public frmAdministration() {
        initComponents();
        this.getContentPane().setBackground(new Color(255,225,236));
        showCustomerList();
        showPetsList();
        showPetsOwnerList();
        showPaymentsList();
        showPaymentsPetList();
        showPlansList();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        LbTitle = new javax.swing.JLabel();
        TbPnView = new javax.swing.JTabbedPane();
        PnCustomerList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LtCustomers = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        PnAffiliatedPetsList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LtAffiliatedPets = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        PnPaymentList = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LtPayment = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        PnCustomers = new javax.swing.JPanel();
        LbIdentificationCustomer = new javax.swing.JLabel();
        LbNameCustomer = new javax.swing.JLabel();
        LbLastNameCustomer = new javax.swing.JLabel();
        LbAddressCustomer = new javax.swing.JLabel();
        LbPhoneCustomer = new javax.swing.JLabel();
        TxtNameCustomer = new javax.swing.JTextField();
        TxtIdentificationCustomer = new javax.swing.JTextField();
        TxtLastNameCustomer = new javax.swing.JTextField();
        TxtAddressCustomer = new javax.swing.JTextField();
        TxtPhoneCustomer = new javax.swing.JTextField();
        BtCreateCustomer = new javax.swing.JButton();
        BtReadCustomer = new javax.swing.JButton();
        BtUpdateCustomer = new javax.swing.JButton();
        BtDeleteCustomer = new javax.swing.JButton();
        BtClearFieldsCustomer = new javax.swing.JButton();
        TxtIdCustomer = new javax.swing.JTextField();
        LbIdCustomer = new javax.swing.JLabel();
        PnPets = new javax.swing.JPanel();
        TxtCodePet = new javax.swing.JTextField();
        LbCodePet = new javax.swing.JLabel();
        LbNamePet = new javax.swing.JLabel();
        TxtNamePet = new javax.swing.JTextField();
        LbAgePet = new javax.swing.JLabel();
        TxtAgePet = new javax.swing.JTextField();
        LbWeightPet = new javax.swing.JLabel();
        TxtWeightPet = new javax.swing.JTextField();
        LbSpeciesPet = new javax.swing.JLabel();
        BtCreatePet = new javax.swing.JButton();
        BtReadPet = new javax.swing.JButton();
        BtUpdatePet = new javax.swing.JButton();
        BtDeletePet = new javax.swing.JButton();
        BtClearFieldsPet = new javax.swing.JButton();
        LbOwnerIdPet = new javax.swing.JLabel();
        ComboBSpeciesPet = new javax.swing.JComboBox<>();
        LbPetPlan = new javax.swing.JLabel();
        ComboBPetPlan = new javax.swing.JComboBox<>();
        TxtIdOwnerPet = new javax.swing.JTextField();
        LbPlanDescriptionPet = new javax.swing.JLabel();
        TxtPlanDescripcion = new javax.swing.JScrollPane();
        TxtPlanDescriptionPet = new javax.swing.JTextArea();
        TxtIdOwner = new javax.swing.JTextField();
        LbIdOwnerPet = new javax.swing.JLabel();
        TxtIdPlan = new javax.swing.JTextField();
        LbIdPlanPet = new javax.swing.JLabel();
        TxtIdPet = new javax.swing.JTextField();
        LbIdPet = new javax.swing.JLabel();
        PnPayments = new javax.swing.JPanel();
        LbCodePetPayment = new javax.swing.JLabel();
        TxtCodePetPayment = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtPlanPetPayment = new javax.swing.JTextPane();
        LbPlanPetPayment = new javax.swing.JLabel();
        LbIdPaymentMethod = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TxtDataPetPayment = new javax.swing.JTextPane();
        LbDataPetPayment = new javax.swing.JLabel();
        LbPaymentMethod = new javax.swing.JLabel();
        ComboBPaymentMethod = new javax.swing.JComboBox<>();
        LbFeesPayment = new javax.swing.JLabel();
        TxtIdPaymentMethod = new javax.swing.JTextField();
        BtPayPayment = new javax.swing.JButton();
        BtClearFieldsPayment = new javax.swing.JButton();
        BtCancel = new javax.swing.JButton();
        LbDatePayment = new javax.swing.JLabel();
        TxtDatePayment = new javax.swing.JTextField();
        BtConsultPetPayment = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtFeesPayment = new javax.swing.JTextPane();
        TxtIdPaymentPet = new javax.swing.JTextField();
        LbIdPaymentPet = new javax.swing.JLabel();
        BtUpdatePayment = new javax.swing.JButton();
        BtDeletePayment = new javax.swing.JButton();
        BtCurrentDate = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Your Pet");
        setBackground(new java.awt.Color(153, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.pink);
        setIconImages(null);
        setLocation(new java.awt.Point(500, 180));
        setResizable(false);

        LbTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Baner.jpg"))); // NOI18N

        TbPnView.setBackground(new java.awt.Color(153, 208, 255));
        TbPnView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PnCustomerList.setBackground(new java.awt.Color(153, 208, 255));

        jScrollPane1.setViewportView(LtCustomers);

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

        PnAffiliatedPetsList.setBackground(new java.awt.Color(153, 208, 255));

        jScrollPane2.setViewportView(LtAffiliatedPets);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/2.jpg"))); // NOI18N

        javax.swing.GroupLayout PnAffiliatedPetsListLayout = new javax.swing.GroupLayout(PnAffiliatedPetsList);
        PnAffiliatedPetsList.setLayout(PnAffiliatedPetsListLayout);
        PnAffiliatedPetsListLayout.setHorizontalGroup(
            PnAffiliatedPetsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnAffiliatedPetsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
        );
        PnAffiliatedPetsListLayout.setVerticalGroup(
            PnAffiliatedPetsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnAffiliatedPetsListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnAffiliatedPetsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        TbPnView.addTab("Affiliated pets list", PnAffiliatedPetsList);

        PnPaymentList.setBackground(new java.awt.Color(153, 208, 255));

        jScrollPane3.setViewportView(LtPayment);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/3.jpg"))); // NOI18N

        javax.swing.GroupLayout PnPaymentListLayout = new javax.swing.GroupLayout(PnPaymentList);
        PnPaymentList.setLayout(PnPaymentListLayout);
        PnPaymentListLayout.setHorizontalGroup(
            PnPaymentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPaymentListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnPaymentListLayout.setVerticalGroup(
            PnPaymentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPaymentListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnPaymentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        TbPnView.addTab("Payment list", PnPaymentList);

        PnCustomers.setBackground(new java.awt.Color(153, 208, 255));

        LbIdentificationCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbIdentificationCustomer.setText("Identification: ");

        LbNameCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbNameCustomer.setText("Name:");

        LbLastNameCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbLastNameCustomer.setText("Last name:");

        LbAddressCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbAddressCustomer.setText("Address:");

        LbPhoneCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbPhoneCustomer.setText("Phone:");

        TxtNameCustomer.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        TxtIdentificationCustomer.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

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

        BtClearFieldsCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtClearFieldsCustomer.setText("  Clear fields  ");
        BtClearFieldsCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearFieldsCustomerActionPerformed(evt);
            }
        });

        TxtIdCustomer.setEditable(false);
        TxtIdCustomer.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        TxtIdCustomer.setFocusable(false);

        LbIdCustomer.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbIdCustomer.setText("Id Customer:");

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
                        .addComponent(BtClearFieldsCustomer))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnCustomersLayout.createSequentialGroup()
                        .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnCustomersLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbNameCustomer)
                                    .addComponent(LbLastNameCustomer)
                                    .addComponent(LbPhoneCustomer)
                                    .addComponent(LbAddressCustomer)
                                    .addComponent(LbIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnCustomersLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LbIdentificationCustomer)
                                .addGap(18, 18, 18)))
                        .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtPhoneCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                            .addComponent(TxtAddressCustomer)
                            .addComponent(TxtNameCustomer)
                            .addComponent(TxtLastNameCustomer)
                            .addComponent(TxtIdentificationCustomer)
                            .addGroup(PnCustomersLayout.createSequentialGroup()
                                .addComponent(TxtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(69, 69, 69))
        );
        PnCustomersLayout.setVerticalGroup(
            PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCustomersLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIdentificationCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbIdentificationCustomer))
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
                .addGap(18, 18, 18)
                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbIdCustomer))
                .addGap(18, 18, 18)
                .addGroup(PnCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCreateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtReadCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtClearFieldsCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        TbPnView.addTab("Customers management", PnCustomers);

        PnPets.setBackground(new java.awt.Color(153, 208, 255));

        TxtCodePet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        LbCodePet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbCodePet.setText("Code:");

        LbNamePet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbNamePet.setText("Name:     ");

        TxtNamePet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        LbAgePet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbAgePet.setText("Age:");

        TxtAgePet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        LbWeightPet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbWeightPet.setText("Weight:");

        TxtWeightPet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        LbSpeciesPet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbSpeciesPet.setText("Species:");

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

        ComboBSpeciesPet.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        ComboBSpeciesPet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canine", "Feline" }));
        ComboBSpeciesPet.setPreferredSize(new java.awt.Dimension(56, 26));
        ComboBSpeciesPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBSpeciesPetActionPerformed(evt);
            }
        });

        LbPetPlan.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbPetPlan.setText("Pet Plan:");

        ComboBPetPlan.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        ComboBPetPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your plan here.", "Wellness plan", "Elite plan", "Diamond plan" }));
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

        TxtIdOwner.setEditable(false);
        TxtIdOwner.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        TxtIdOwner.setFocusable(false);

        LbIdOwnerPet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbIdOwnerPet.setText("Id owner:");

        TxtIdPlan.setEditable(false);
        TxtIdPlan.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        TxtIdPlan.setFocusable(false);

        LbIdPlanPet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbIdPlanPet.setText("id Plan:");

        TxtIdPet.setEditable(false);
        TxtIdPet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        TxtIdPet.setFocusable(false);

        LbIdPet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbIdPet.setText("id pet:    ");

        javax.swing.GroupLayout PnPetsLayout = new javax.swing.GroupLayout(PnPets);
        PnPets.setLayout(PnPetsLayout);
        PnPetsLayout.setHorizontalGroup(
            PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPetsLayout.createSequentialGroup()
                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnPetsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtCreatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BtReadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BtUpdatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(BtDeletePet, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(BtClearFieldsPet))
                    .addGroup(PnPetsLayout.createSequentialGroup()
                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnPetsLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
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
                                        .addComponent(TxtWeightPet, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnPetsLayout.createSequentialGroup()
                                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PnPetsLayout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(LbSpeciesPet))
                                            .addGroup(PnPetsLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(ComboBSpeciesPet, 0, 229, Short.MAX_VALUE)
                                                    .addComponent(ComboBPetPlan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(18, 18, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPetsLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LbPetPlan)
                                        .addGap(97, 97, 97))))
                            .addGroup(PnPetsLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnPetsLayout.createSequentialGroup()
                                        .addComponent(LbIdOwnerPet)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtIdOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LbOwnerIdPet))
                                .addGap(3, 3, 3)
                                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PnPetsLayout.createSequentialGroup()
                                        .addComponent(LbIdPlanPet, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtIdPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(LbIdPet))
                                    .addComponent(TxtIdOwnerPet, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtIdPet)
                            .addComponent(TxtPlanDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPetsLayout.createSequentialGroup()
                                .addComponent(LbPlanDescriptionPet)
                                .addGap(28, 28, 28)))))
                .addContainerGap())
        );
        PnPetsLayout.setVerticalGroup(
            PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPetsLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodePet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCodePet)
                    .addComponent(LbSpeciesPet)
                    .addComponent(LbPlanDescriptionPet))
                .addGap(18, 18, 18)
                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnPetsLayout.createSequentialGroup()
                        .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbNamePet)
                            .addComponent(TxtNamePet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBSpeciesPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(21, 21, 21)
                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIdPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbIdPlanPet)
                    .addComponent(TxtIdOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbIdOwnerPet)
                    .addComponent(TxtIdPet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbIdPet))
                .addGap(42, 42, 42)
                .addGroup(PnPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCreatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtReadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtUpdatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDeletePet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtClearFieldsPet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        TbPnView.addTab("Pets management", PnPets);

        PnPayments.setBackground(new java.awt.Color(153, 208, 255));

        LbCodePetPayment.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbCodePetPayment.setText("Enter pet code:          ");

        TxtCodePetPayment.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        TxtPlanPetPayment.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        TxtPlanPetPayment.setFocusable(false);
        jScrollPane4.setViewportView(TxtPlanPetPayment);

        LbPlanPetPayment.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbPlanPetPayment.setText("Your pet's plan is:         ");

        LbIdPaymentMethod.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbIdPaymentMethod.setText("Enter the payment method ID:");

        TxtDataPetPayment.setFocusable(false);
        jScrollPane6.setViewportView(TxtDataPetPayment);

        LbDataPetPayment.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbDataPetPayment.setText("Your pet's data:");

        LbPaymentMethod.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbPaymentMethod.setText("Select payment method:");

        ComboBPaymentMethod.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        ComboBPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credit / debit card", "Bank transfer" }));

        LbFeesPayment.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbFeesPayment.setText("Enter the number of installments to be paid:");

        TxtIdPaymentMethod.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N

        BtPayPayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtPayPayment.setText(" Pay ");
        BtPayPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPayPaymentActionPerformed(evt);
            }
        });

        BtClearFieldsPayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtClearFieldsPayment.setText("  Clear fields  ");
        BtClearFieldsPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearFieldsPaymentActionPerformed(evt);
            }
        });

        BtCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtCancel.setText("Cancel");
        BtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelActionPerformed(evt);
            }
        });

        LbDatePayment.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbDatePayment.setText("Enter payment date (YYYY-MM-DD):");

        TxtDatePayment.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        TxtDatePayment.setText(currentDate+ "");
        TxtDatePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDatePaymentActionPerformed(evt);
            }
        });

        BtConsultPetPayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtConsultPetPayment.setText("Consult");
        BtConsultPetPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultPetPaymentActionPerformed(evt);
            }
        });

        TxtFeesPayment.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jScrollPane5.setViewportView(TxtFeesPayment);

        TxtIdPaymentPet.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        TxtIdPaymentPet.setToolTipText("");
        TxtIdPaymentPet.setFocusable(false);

        LbIdPaymentPet.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        LbIdPaymentPet.setText("Payment id:");

        BtUpdatePayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtUpdatePayment.setText("Update");
        BtUpdatePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtUpdatePaymentActionPerformed(evt);
            }
        });

        BtDeletePayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtDeletePayment.setText("Delete");
        BtDeletePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeletePaymentActionPerformed(evt);
            }
        });

        BtCurrentDate.setText("Current");
        BtCurrentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCurrentDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnPaymentsLayout = new javax.swing.GroupLayout(PnPayments);
        PnPayments.setLayout(PnPaymentsLayout);
        PnPaymentsLayout.setHorizontalGroup(
            PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PnPaymentsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnPaymentsLayout.createSequentialGroup()
                        .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PnPaymentsLayout.createSequentialGroup()
                                .addComponent(LbDatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtDatePayment))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPaymentsLayout.createSequentialGroup()
                                .addComponent(BtUpdatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtDeletePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(PnPaymentsLayout.createSequentialGroup()
                                .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbPaymentMethod)
                                    .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(LbCodePetPayment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LbPlanPetPayment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtCodePetPayment)
                                    .addComponent(jScrollPane4)
                                    .addComponent(ComboBPaymentMethod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PnPaymentsLayout.createSequentialGroup()
                                .addComponent(LbFeesPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPaymentsLayout.createSequentialGroup()
                                .addComponent(LbIdPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtIdPaymentMethod)))
                        .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PnPaymentsLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(BtCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LbIdPaymentPet, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtIdPaymentPet, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnPaymentsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PnPaymentsLayout.createSequentialGroup()
                                        .addComponent(LbDataPetPayment)
                                        .addGap(67, 67, 67))))))
                    .addGroup(PnPaymentsLayout.createSequentialGroup()
                        .addComponent(BtConsultPetPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtPayPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtClearFieldsPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PnPaymentsLayout.setVerticalGroup(
            PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPaymentsLayout.createSequentialGroup()
                .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnPaymentsLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbCodePetPayment)
                            .addComponent(TxtCodePetPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPaymentsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LbDataPetPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnPaymentsLayout.createSequentialGroup()
                        .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnPaymentsLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(LbPlanPetPayment)))
                        .addGap(28, 28, 28)
                        .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbPaymentMethod))
                        .addGap(26, 26, 26)
                        .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbIdPaymentMethod)
                            .addComponent(TxtIdPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PnPaymentsLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(LbFeesPayment)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPaymentsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbDatePayment)
                    .addComponent(TxtIdPaymentPet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbIdPaymentPet)
                    .addComponent(BtCurrentDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(PnPaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtPayPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtClearFieldsPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtConsultPetPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtUpdatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDeletePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        TbPnView.addTab("Register payments", PnPayments);

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

    private void cleanCustomerQuestionnaire(){
        TxtIdentificationCustomer.setText("");
        TxtNameCustomer.setText("");
        TxtLastNameCustomer.setText("");
        TxtAddressCustomer.setText("");
        TxtPhoneCustomer.setText("");
        TxtIdCustomer.setText("");
    }
    
    private void cleanPetQuestionnaire(){
        TxtCodePet.setText("");
        TxtNamePet.setText("");
        TxtAgePet.setText("");
        TxtWeightPet.setText("");
        TxtIdOwnerPet.setText("");
        ComboBSpeciesPet.setSelectedIndex(0);
        ComboBPetPlan.setSelectedIndex(0);
        TxtPlanDescriptionPet.setText("");
        ComboBSpeciesPet.setEnabled(true);
        TxtIdOwnerPet.setFocusable(true);
        TxtIdOwner.setText("");
        TxtIdPlan.setText("");
        TxtIdPet.setText("");
    }
    
    private void cleanPaymentsQuestionnaire(){
        TxtCodePetPayment.setText("");
        TxtDataPetPayment.setText("");
        TxtPlanPetPayment.setText("");
        TxtDatePayment.setText("");
        TxtIdPaymentMethod.setText("");
        ComboBPaymentMethod.setSelectedIndex(0);
        TxtFeesPayment.setText("");
        TxtIdPaymentPet.setText("");
    }
    
    private void BtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelActionPerformed
        JOptionPane.showMessageDialog(this, "¡¡¡Thank you for visiting YOUR PET!!!");
        dispose();
    }//GEN-LAST:event_BtCancelActionPerformed

    private void BtClearFieldsCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearFieldsCustomerActionPerformed
        TxtIdentificationCustomer.setText("");
        TxtNameCustomer.setText("");
        TxtLastNameCustomer.setText("");
        TxtAddressCustomer.setText("");
        TxtPhoneCustomer.setText("");
        TxtIdCustomer.setText("");
    }//GEN-LAST:event_BtClearFieldsCustomerActionPerformed

    private void BtClearFieldsPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearFieldsPetActionPerformed
        TxtCodePet.setText("");
        TxtNamePet.setText("");
        TxtAgePet.setText("");
        TxtWeightPet.setText("");
        TxtIdOwnerPet.setText("");
        ComboBSpeciesPet.setSelectedIndex(0);
        ComboBPetPlan.setSelectedIndex(0);
        TxtPlanDescriptionPet.setText("");
        ComboBSpeciesPet.setEnabled(true);
        TxtIdOwnerPet.setFocusable(true);
        TxtIdOwner.setText("");
        TxtIdPlan.setText("");
        TxtIdPet.setText("");
    }//GEN-LAST:event_BtClearFieldsPetActionPerformed

    private void BtClearFieldsPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearFieldsPaymentActionPerformed
        TxtCodePetPayment.setText("");
        TxtDataPetPayment.setText("");
        TxtPlanPetPayment.setText("");
        TxtDatePayment.setText("");
        TxtIdPaymentMethod.setText("");
        ComboBPaymentMethod.setSelectedIndex(0);
        TxtFeesPayment.setText("");
        TxtIdPaymentPet.setText("");
    }//GEN-LAST:event_BtClearFieldsPaymentActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCreateCustomerActionPerformed
        
        try {
            
            String id = TxtIdentificationCustomer.getText();
            String name = TxtNameCustomer.getText();
            String lastName = TxtLastNameCustomer.getText();
            String address = TxtAddressCustomer.getText();
            String phone = TxtPhoneCustomer.getText();
            
            if (id.equals("") || name.equals("") || lastName.equals("") || address.equals("") || phone.equals("")) {
                JOptionPane.showMessageDialog(this, "¡You must enter all the fields of the form!");
            }
            else {
                clsCustomers customer = new clsCustomers(0, id, name, lastName, address, phone);
                
                controlCustomer.createCustomer(customer);
                
                showCustomerList();
                cleanCustomerQuestionnaire();
                JOptionPane.showMessageDialog(this, "User has been successfully created!");
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_BtCreateCustomerActionPerformed

    private void BtReadCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtReadCustomerActionPerformed
        
        String IDFound = TxtIdentificationCustomer.getText();
        
        if(IDFound.equals("")){
            JOptionPane.showMessageDialog(this, "You must fill in the ID number in order to be able to make the query.");
        }
        else {
            
            clsCustomers customerSearched = controlCustomer.readCustomer(IDFound);
            
            if (customerSearched == null) {
                JOptionPane.showMessageDialog(this, "¡The identification number: " + IDFound + ". Not registered!");
                cleanCustomerQuestionnaire();
            }
            else{
                TxtNameCustomer.setText(customerSearched.getName());
                TxtLastNameCustomer.setText(customerSearched.getLastName());
                TxtAddressCustomer.setText(customerSearched.getAddress());
                TxtPhoneCustomer.setText(customerSearched.getPhone());
                
                TxtIdCustomer.setText(customerSearched.getIdCustomer()+ "");
            }
        }
    }//GEN-LAST:event_BtReadCustomerActionPerformed

    private void BtUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUpdateCustomerActionPerformed
        
        String idCustomer = TxtIdCustomer.getText();
        
        if(idCustomer.equals("")){
            JOptionPane.showMessageDialog(this, "To update a record you must first consult it.");
        }
        else {
            
            int idCustomerInt = Integer.parseInt(idCustomer);
            
            String id = TxtIdentificationCustomer.getText();
            String name = TxtNameCustomer.getText();
            String lastName = TxtLastNameCustomer.getText();
            String address = TxtAddressCustomer.getText();
            String phone = TxtPhoneCustomer.getText();
            
            clsCustomers customer_updated = new clsCustomers(idCustomerInt, id, name, lastName, address, phone);
            
            if (controlCustomer.updateCustomer(customer_updated)) {
                
                showCustomerList();
                cleanCustomerQuestionnaire();
                
                JOptionPane.showMessageDialog(this, "The customer has been successfully upgraded.");
            
            } else {
              JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
            }
        }
        
    }//GEN-LAST:event_BtUpdateCustomerActionPerformed

    private void BtDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeleteCustomerActionPerformed
        
        String idCustomer = TxtIdCustomer.getText();
        
        if (idCustomer.equals("")) {
            JOptionPane.showMessageDialog(this, "To delete a record, you must first consult it!");
        } else {
            int idCustomerInt = Integer.parseInt(idCustomer);
            
            String id = TxtIdentificationCustomer.getText();
            String name = TxtNameCustomer.getText();
            String lastName = TxtLastNameCustomer.getText();
            String address = TxtAddressCustomer.getText();
            String phone = TxtPhoneCustomer.getText();
            
            clsCustomers customer_to_remove = new clsCustomers(idCustomerInt, id, name, lastName, address, phone);
            
            int reply = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the record?");
            if (reply == JOptionPane.OK_OPTION) {
                
                if (controlCustomer.deleteCustomer(customer_to_remove)) {
                    showCustomerList();
                    cleanCustomerQuestionnaire();
                     JOptionPane.showMessageDialog(this, "Record successfully deleted!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "An error occurred while deleting, please check the data.");
            }
        }
    }//GEN-LAST:event_BtDeleteCustomerActionPerformed

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    private void BtCreatePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCreatePetActionPerformed
            
        try {

        String code = TxtCodePet.getText();
        String name = TxtNamePet.getText();
        String idOwner = TxtIdOwnerPet.getText();
        int age = Integer.parseInt(TxtAgePet.getText());
        double weight = Double.parseDouble(TxtWeightPet.getText());
        String species = ComboBSpeciesPet.getSelectedItem().toString();
        String plan = ComboBPetPlan.getSelectedItem().toString();
        
        if (code.equals("") || name.equals("") || idOwner.equals("")) {
            JOptionPane.showMessageDialog(this, "¡You must enter all the fields of the form!");
        }
        if (Integer.parseInt(TxtAgePet.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "The age cannot be less than or equal to zero.");
        }
        if (Double.parseDouble(TxtWeightPet.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "The weight cannot be less than or equal to zero.");
        }
        if(plan.equals("Choose your plan here.")){
            JOptionPane.showMessageDialog(this, "¡You must choose a plan!");
        }
        else {
            for (clsCustomers customers : customersObjectList) {
                
                if(customers.getId() == null ? (idOwner) != null : !customers.getId().equals(idOwner)){
                    TxtIdOwnerPet.setText("ID NOT REGISTERED!");
                }
                
                for (clsPlans plans : plansObjectList) {

                    if (plans.getNamePlan().equals(plan)) {         
                        
                        if (customers.getId().equals(idOwner)) {

                            clsPlans plansearch = controlPlans.readPlan(plan);
                            clsCustomers customerSearched = controlCustomer.readCustomer(idOwner);

                            TxtIdOwner.setText(customerSearched.getIdCustomer()+ "");
                            TxtIdPlan.setText(plansearch.getIdPlan() + "");

                            clsPets pet = new clsPets(0, code, name, age, weight, species);

                            controlPet.createPet(pet, customerSearched, plans);

                            JOptionPane.showMessageDialog(this, "Pet account has been successfully created!");
                            showPetsList();
                            showPetsOwnerList();
                            cleanPetQuestionnaire();
                        }
                    }
                }
            }
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "The \"age\" field and the \"weight\" field must be numeric.");
        }catch(Exception e){
            System.out.println("Error saving: " + e.getMessage());
        }
    }//GEN-LAST:event_BtCreatePetActionPerformed

    private void BtReadPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtReadPetActionPerformed
        
        String petCodeFound = TxtCodePet.getText();
        
        if(petCodeFound.equals("")){
            JOptionPane.showMessageDialog(this, "You must fill in the pet's code in order to make the query.");
        }
        else {

            clsPets petSearch = controlPet.readPet(petCodeFound);
            
            if (petSearch == null) {
                JOptionPane.showMessageDialog(this, "¡The pet with a code: " + petCodeFound + ". Not registered!");
                cleanPetQuestionnaire();
            }
            else{                
                
                for (clsPetOwner pets : petsOwnerObjectList) {
                
                    for (clsPlans plans : plansObjectList) {
                        
                        for (clsCustomers customers : customersObjectList) {
                            
                            if (customers.getIdCustomer() == pets.getIdOwnerPet()) {
                                
                                if (plans.getIdPlan() == pets.getIdPlanPet()) {

                                    if (pets.getCode().equals(petCodeFound)) {

                                    TxtNamePet.setText(petSearch.getName());
                                    TxtAgePet.setText(petSearch.getAge()+ "");
                                    TxtWeightPet.setText(petSearch.getWeight()+ "");
                                    ComboBSpeciesPet.setSelectedItem(petSearch.getSpecies());
                                    ComboBPetPlan.setSelectedItem(plans.getNamePlan());
                                    TxtIdOwnerPet.setText(customers.getId());
                                    TxtIdOwner.setText(pets.getIdOwnerPet()+ "");
                                    TxtIdPlan.setText(pets.getIdPlanPet()+ "");
                                    

                                    ComboBSpeciesPet.setEnabled(false);
                                    TxtIdOwnerPet.setFocusable(false);

                                    TxtIdPet.setText(petSearch.getIdPet()+ "");

                                    }
                                }
                            }
                        }
                        
                    } 
                }   
            }
        }  
    }//GEN-LAST:event_BtReadPetActionPerformed

    private void ComboBPetPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBPetPlanActionPerformed
        
        if (ComboBPetPlan.getSelectedItem().toString().equals("Wellness plan")){
            TxtPlanDescriptionPet.setText("CODE: 001"+ '\n'+ "NAME: Wellness" + '\n' + "DESCRIPTION: Basic plan for the care of your pet." + '\n' +"PRICE: 100 USD");
        }
        else if (ComboBPetPlan.getSelectedItem().toString().equals("Elite plan")) {
            TxtPlanDescriptionPet.setText("CODE: 002"+ '\n'+ "NAME: Elite" + '\n' + "DESCRIPTION: Elite plan for the care of your pet." + '\n' +"PRICE: 200 USD");
        }
        
        else if (ComboBPetPlan.getSelectedItem().toString().equals("Diamond plan")) {
            TxtPlanDescriptionPet.setText("CODE: 003"+ '\n'+ "NAME: Diamond" + '\n' + "DESCRIPTION: Diamond plan for the care of your pet." + '\n' +"PRICE: 300 USD");
        }
            
    }//GEN-LAST:event_ComboBPetPlanActionPerformed

    private void BtUpdatePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUpdatePetActionPerformed
        
        String idPet = TxtIdPet.getText();
        
        if(idPet.equals("")){
            JOptionPane.showMessageDialog(this, "To update a record you must first consult it.");
        }
        else {
            
            for (clsCustomers customers : customersObjectList) {
                
                for (clsPetOwner pets : petsOwnerObjectList) {
                
                    for (clsPlans plans : plansObjectList) {

                        String plan = ComboBPetPlan.getSelectedItem().toString();
                        String idOwner = TxtIdOwnerPet.getText();

                        if (plans.getNamePlan().equals(plan)) {
                            
                            if (customers.getId().equals(idOwner)) {
                                
                                int idPetInt = Integer.parseInt(idPet);

                                String code = TxtCodePet.getText();
                                String name = TxtNamePet.getText();
                                int age = Integer.parseInt(TxtAgePet.getText()); 
                                double weight = Double.parseDouble(TxtWeightPet.getText());
                                String species = ComboBSpeciesPet.getSelectedItem().toString();

                                clsPets pet_updated = new clsPets(idPetInt, code, name, age, weight, species);

                                if (controlPet.updatePet(pet_updated, customers, plans )) {

                                    showPetsList();
                                    showPetsOwnerList();
                                    cleanPetQuestionnaire();

                                    JOptionPane.showMessageDialog(this, "Se ha actualizado con exito la mascota.");

                                } else {
                                  JOptionPane.showMessageDialog(this, "¡Ocurrio un error al actuializar!");  
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_BtUpdatePetActionPerformed

    private void BtDeletePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletePetActionPerformed
       
        String idPet = TxtIdPet.getText();
        
        if (idPet.equals("")) {
            JOptionPane.showMessageDialog(this, "To delete a record, you must first consult it!");
        } else {
            int idPetInt = Integer.parseInt(idPet);
            
            String code = TxtCodePet.getText();
            String name = TxtNamePet.getText();
            int age = Integer.parseInt(TxtAgePet.getText()); 
            double weight = Double.parseDouble(TxtWeightPet.getText());
            String species = ComboBSpeciesPet.getSelectedItem().toString();            
            
            clsPets pet_to_remove = new clsPets(idPetInt, code, name, age, weight, species);
            
            int reply = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the record?");
            if (reply == JOptionPane.OK_OPTION) {
                
                if (controlPet.delelePet(pet_to_remove)) {
                    showPetsList();
                    showPetsOwnerList();
                    cleanPetQuestionnaire();
                     JOptionPane.showMessageDialog(this, "Record successfully deleted!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "An error occurred while deleting, please check the data.");
            }
        }
    }//GEN-LAST:event_BtDeletePetActionPerformed

    private void ComboBSpeciesPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBSpeciesPetActionPerformed

    }//GEN-LAST:event_ComboBSpeciesPetActionPerformed

    private void BtConsultPetPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultPetPaymentActionPerformed
        
        String codePaymentPet = TxtCodePetPayment.getText();
        
        
        if(codePaymentPet.equals("")){
            JOptionPane.showMessageDialog(this, "You must fill in the pet's code in order to make the query.");
        }
        else {
            clsPets petSearch = controlPet.readPet(codePaymentPet);
            
            
            if (petSearch == null) {
                JOptionPane.showMessageDialog(this, "¡The pet with a code: " + codePaymentPet + ". Not registered!");
                cleanPetQuestionnaire();
            }
            else{
                
                int petPayment = petSearch.getIdPet();
                
                clsPayments paymentSearch = controlPayments.readPayment(petPayment);
                
                for (clsPetOwner pets : petsOwnerObjectList) {
                
                    for (clsPlans plans : plansObjectList) {
                        
                        for (clsCustomers customers : customersObjectList) {

                        TxtDataPetPayment.setText("Name pet: " + petSearch.getName()+ '\n'
                                                    + "Species: "+ petSearch.getSpecies()+ '\n'
                                                    + "Age: " + petSearch.getAge() + '\n'
                                                    + "Weight: " + petSearch.getWeight()+ '\n'
                                                    + "ID owner: " + customers.getId());
                        TxtPlanPetPayment.setText(plans.getNamePlan());
                                    
                            for(clsPaymentsPet paymentP : paymentsOwnerObjectList){

                                if (customers.getIdCustomer()== pets.getIdOwnerPet()) {

                                    if (plans.getIdPlan() == pets.getIdPlanPet()) {

                                        if (pets.getCode().equals(codePaymentPet)) {

                                            if (paymentSearch == null) {
                                                    
                                                ComboBPaymentMethod.setSelectedIndex(0);
                                                TxtFeesPayment.setText("");
                                                TxtIdPaymentMethod.setText("");
                                                TxtDatePayment.setText("");
                                                TxtIdPaymentPet.setText("");
                                                }

                                            if(paymentP.getIdPet()== pets.getIdPet()){

                                                TxtFeesPayment.setText(paymentP.getFees()+ "");
                                                TxtIdPaymentMethod.setText(paymentP.getIdPaymentMethod());
                                                TxtDatePayment.setText(paymentP.getDate());
                                                TxtIdPaymentPet.setText(paymentP.getIdPayment()+ "");
                                                ComboBPaymentMethod.setSelectedItem(paymentP.getPaymentMethod());
                                            }
                                        }
                                    }
                                }
                            }
                        }                      
                    } 
                }   
            }
        }
        
    }//GEN-LAST:event_BtConsultPetPaymentActionPerformed

    private void BtPayPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPayPaymentActionPerformed
        
        String codePetPayment = TxtCodePetPayment.getText();
        String plan = TxtPlanPetPayment.getText();

        if(codePetPayment.equals("") || plan.equals("")){
            JOptionPane.showMessageDialog(this, "To make a payment you must first consult the pet.");
        }
        
        try {

            int feesPayment = Integer.parseInt(TxtFeesPayment.getText());
            String PaymenMmethod = ComboBPaymentMethod.getSelectedItem().toString();
            String idPaymenMmethod = TxtIdPaymentMethod.getText();
            String date = TxtDatePayment.getText();
            
            if (feesPayment == 0 || idPaymenMmethod.equals("") || date.equals("") ) {
                JOptionPane.showMessageDialog(this, "¡You must enter all the fields of the form!");
            }
            else {
                
                for (clsPetOwner pets : petsOwnerObjectList) {
                
                    for (clsPlans plans : plansObjectList) {
                 
                        if (plans.getIdPlan() == pets.getIdPlanPet()) {

                            if (pets.getCode().equals(codePetPayment)) {
                                
                                clsPayments payments = new clsPayments(0, PaymenMmethod, feesPayment, idPaymenMmethod, date);
                                
                                controlPayments.createPayment(payments, pets, plans);
                                
                                JOptionPane.showMessageDialog(this, "A payment has been successfully made!");
                                showPaymentsList();
                                showPaymentsPetList();
                                cleanPaymentsQuestionnaire();
                            }
                        }                   
                        
                    } 
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "The field \"fees\" must be numeric.");
        }catch(Exception e){
            System.out.println("Error saving: " + e.getMessage());
        }
    }//GEN-LAST:event_BtPayPaymentActionPerformed

    private void BtUpdatePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUpdatePaymentActionPerformed
        
        String idPetPayment = TxtIdPaymentPet.getText();
        String codePetPayment = TxtCodePetPayment.getText();
        
        if(idPetPayment.equals("")){
            JOptionPane.showMessageDialog(this, "To update a record you must first consult it.");
        }
        else {

            for (clsPetOwner pet : petsOwnerObjectList) {

                for (clsPlans plans : plansObjectList) {

                    if (plans.getIdPlan() == pet.getIdPlanPet()) {

                        if (pet.getCode().equals(codePetPayment)) {

                            int idPaymentInt = Integer.parseInt(idPetPayment);

                            String PaymenMmethod = ComboBPaymentMethod.getSelectedItem().toString();
                            int feesPayment = Integer.parseInt(TxtFeesPayment.getText());
                            String idPaymenMmethod = TxtIdPaymentMethod.getText();
                            String date = TxtDatePayment.getText();

                            clsPayments payment_updated = new clsPayments(idPaymentInt, PaymenMmethod, feesPayment, idPaymenMmethod, date);

                            if (controlPayments.updatePayment(payment_updated, pet, plans)) {

                                showPaymentsList();
                                showPaymentsPetList();
                                cleanPaymentsQuestionnaire();

                                JOptionPane.showMessageDialog(this, "Pet payment has been successfully updated.");
                            }
                            else {
                              JOptionPane.showMessageDialog(this, "¡An error occurred while updating!");  
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_BtUpdatePaymentActionPerformed

    private void BtDeletePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletePaymentActionPerformed
        
        String idPetPayment = TxtIdPaymentPet.getText();
        
        if (idPetPayment.equals("")) {
            JOptionPane.showMessageDialog(this, "To delete a payment record, you must first view it!");
        } else {
            
            String PaymenMmethod = ComboBPaymentMethod.getSelectedItem().toString();
            int feesPayment = Integer.parseInt(TxtFeesPayment.getText());
            String idPaymenMmethod = TxtIdPaymentMethod.getText();
            String date = TxtDatePayment.getText();            
            
            int idPaymentInt = Integer.parseInt(idPetPayment);
            
            clsPayments payment_to_remove = new clsPayments(idPaymentInt, PaymenMmethod, feesPayment, idPaymenMmethod, date);
            
            int reply = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the paid registration?");
            
            if (reply == JOptionPane.OK_OPTION) {
                
                if (controlPayments.deletePayment(payment_to_remove)) {
                    showPaymentsList();
                    showPaymentsPetList();
                    cleanPaymentsQuestionnaire();
                    JOptionPane.showMessageDialog(this, "Payment successfully removed.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "An error occurred while deleting, please check the data.");
            }
        }
    }//GEN-LAST:event_BtDeletePaymentActionPerformed

    private void TxtDatePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDatePaymentActionPerformed

    }//GEN-LAST:event_TxtDatePaymentActionPerformed

    private void BtCurrentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCurrentDateActionPerformed
        TxtDatePayment.setText(currentDate + "");
    }//GEN-LAST:event_BtCurrentDateActionPerformed

    private void showCustomerList(){
        
        customersObjectList = controlCustomer.customersList();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsCustomers customers : customersObjectList) {
            String data = "ID: " + customers.getId()+ " - " + " NAME: " + customers.getName()+ " - " +
                          "LAST NAME: " +customers.getLastName()+ " - " + "ADDRESS: " + customers.getAddress()+ " - " + "PHONE: " + customers.getPhone();
            model.add(index, data);
            index++;
        }
        LtCustomers.setModel(model);
    }

    private void showPetsList(){
        
      petsObjectList = controlPet.petsList();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsPets pets : petsObjectList) {
            String data = "CODE: " + pets.getCode()+ " - " + "NAME: " + pets.getName()+ " - " + "AGE: " + pets.getAge()+ " - " + 
                          "WEIGHT: " + pets.getWeight()+ " - " + "SPECIES: " + pets.getSpecies();
            model.add(index, data);
            index++;
        }
       LtAffiliatedPets.setModel(model);
    }
    
    private void showPetsOwnerList(){
        
      petsOwnerObjectList = controlPet.petsListOwner();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsPetOwner pets : petsOwnerObjectList) {
            String data = "CODE: " + pets.getCode()+ " - " + "NAME: " + pets.getName()+ " - " + "AGE: " + pets.getAge()+ " - " + 
                          "WEIGHT: " + pets.getWeight()+ " - " + "SPECIES: " + pets.getSpecies() + " - " + "ID OWNER: " + pets.getIdOwnerPet()+ " - "  + "ID PLAN: " + pets.getIdPlanPet();
            model.add(index, data);
            index++;
        }
    }
    
    private void showPlansList(){
        
        plansObjectList = controlPlans.plansList();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsPlans plans : plansObjectList) {
            
            String data = "CODE: " + plans.getCodePlan()+ " - " + "NAME: " + plans.getNamePlan()+ " - " + "DESCRIPTION: " + plans.getDescription()+ " - " + "PRICE: " + plans.getPrice();
            model.add(index, data);
            index++;    
        }
    }
    
    private void showPaymentsList(){
        
        paymentsObjectList = controlPayments.paymentslist();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsPayments payments : paymentsObjectList) {
            
            String data = "ID: " + payments.getIdPayment()+ " - " + "FEES: " + payments.getFees()+ " - " + "PAYMENT METHOD: " + payments.getPaymentMethod()+ " - " + "ID PAYMENT METHOD: " + payments.getIdPaymentMethod();
            model.add(index, data);
            index++;
            
        }
    }
    
    private void showPaymentsPetList(){
        
        paymentsOwnerObjectList = controlPayments.paymentListOwner();
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (clsPaymentsPet paymentP : paymentsOwnerObjectList) {
            
            for (clsPetOwner pets : petsOwnerObjectList) {
                
                if(pets.getIdPet()== paymentP.getIdPet()){
                    String data = "CODE PET: " + pets.getCode()+ " - " + "FEES: " + paymentP.getFees()+ " - " + " PAYMENT METHOD: " + paymentP.getPaymentMethod()+ " - " +
                                  "ID PAYMENT METHOD: " + paymentP.getIdPaymentMethod()+ " - " + "ID PET: " + paymentP.getIdPet()+ " - " 
                                + "ID PLAN: " + paymentP.getIdPlan();
                    model.add(index, data);
                    index++;
                }
            } 
        }
        LtPayment.setModel(model);
    }
    
    
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
    private javax.swing.JButton BtCancel;
    private javax.swing.JButton BtClearFieldsCustomer;
    private javax.swing.JButton BtClearFieldsPayment;
    private javax.swing.JButton BtClearFieldsPet;
    private javax.swing.JButton BtConsultPetPayment;
    private javax.swing.JButton BtCreateCustomer;
    private javax.swing.JButton BtCreatePet;
    private javax.swing.JButton BtCurrentDate;
    private javax.swing.JButton BtDeleteCustomer;
    private javax.swing.JButton BtDeletePayment;
    private javax.swing.JButton BtDeletePet;
    private javax.swing.JButton BtPayPayment;
    private javax.swing.JButton BtReadCustomer;
    private javax.swing.JButton BtReadPet;
    private javax.swing.JButton BtUpdateCustomer;
    private javax.swing.JButton BtUpdatePayment;
    private javax.swing.JButton BtUpdatePet;
    private javax.swing.JComboBox<String> ComboBPaymentMethod;
    private javax.swing.JComboBox<String> ComboBPetPlan;
    private javax.swing.JComboBox<String> ComboBSpeciesPet;
    private javax.swing.JLabel LbAddressCustomer;
    private javax.swing.JLabel LbAgePet;
    private javax.swing.JLabel LbCodePet;
    private javax.swing.JLabel LbCodePetPayment;
    private javax.swing.JLabel LbDataPetPayment;
    private javax.swing.JLabel LbDatePayment;
    private javax.swing.JLabel LbFeesPayment;
    private javax.swing.JLabel LbIdCustomer;
    private javax.swing.JLabel LbIdOwnerPet;
    private javax.swing.JLabel LbIdPaymentMethod;
    private javax.swing.JLabel LbIdPaymentPet;
    private javax.swing.JLabel LbIdPet;
    private javax.swing.JLabel LbIdPlanPet;
    private javax.swing.JLabel LbIdentificationCustomer;
    private javax.swing.JLabel LbLastNameCustomer;
    private javax.swing.JLabel LbNameCustomer;
    private javax.swing.JLabel LbNamePet;
    private javax.swing.JLabel LbOwnerIdPet;
    private javax.swing.JLabel LbPaymentMethod;
    private javax.swing.JLabel LbPetPlan;
    private javax.swing.JLabel LbPhoneCustomer;
    private javax.swing.JLabel LbPlanDescriptionPet;
    private javax.swing.JLabel LbPlanPetPayment;
    private javax.swing.JLabel LbSpeciesPet;
    private javax.swing.JLabel LbTitle;
    private javax.swing.JLabel LbWeightPet;
    private javax.swing.JList<String> LtAffiliatedPets;
    private javax.swing.JList<String> LtCustomers;
    private javax.swing.JList<String> LtPayment;
    private javax.swing.JPanel PnAffiliatedPetsList;
    private javax.swing.JPanel PnCustomerList;
    private javax.swing.JPanel PnCustomers;
    private javax.swing.JPanel PnPaymentList;
    private javax.swing.JPanel PnPayments;
    private javax.swing.JPanel PnPets;
    private javax.swing.JTabbedPane TbPnView;
    private javax.swing.JTextField TxtAddressCustomer;
    private javax.swing.JTextField TxtAgePet;
    private javax.swing.JTextField TxtCodePet;
    private javax.swing.JTextField TxtCodePetPayment;
    private javax.swing.JTextPane TxtDataPetPayment;
    private javax.swing.JTextField TxtDatePayment;
    private javax.swing.JTextPane TxtFeesPayment;
    private javax.swing.JTextField TxtIdCustomer;
    private javax.swing.JTextField TxtIdOwner;
    private javax.swing.JTextField TxtIdOwnerPet;
    private javax.swing.JTextField TxtIdPaymentMethod;
    private javax.swing.JTextField TxtIdPaymentPet;
    private javax.swing.JTextField TxtIdPet;
    private javax.swing.JTextField TxtIdPlan;
    private javax.swing.JTextField TxtIdentificationCustomer;
    private javax.swing.JTextField TxtLastNameCustomer;
    private javax.swing.JTextField TxtNameCustomer;
    private javax.swing.JTextField TxtNamePet;
    private javax.swing.JTextField TxtPhoneCustomer;
    private javax.swing.JScrollPane TxtPlanDescripcion;
    private javax.swing.JTextArea TxtPlanDescriptionPet;
    private javax.swing.JTextPane TxtPlanPetPayment;
    private javax.swing.JTextField TxtWeightPet;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
