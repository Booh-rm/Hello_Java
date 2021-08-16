# Graphics and Exel file generation

Software is to be developed for a pet care company. The software must meet a number of requirements listed below:

* Manage customers (identification, first names, last names, address and phone). Create, query, edit and delete (CRUD) options must be provided.

* The company offers three plans for the care and welfare of pets (wellness, elite and diamond), when a pet is affiliated to the company, it will always be affiliated to one of these three plans.

* The plans have a code, name, description and price.

* A client can have one or more affiliated pets, even if he/she does not have any affiliated pet.

* The pet data are: code, name, age, weight and species (canine or feline), in addition, each pet must be related to its owner.

* You must be given the option to enter the pet's monthly payment and you will also be able to see the information of the monthly payments per pet. When a monthly payment is made, the number of installments, the plan the pet is affiliated to and the payment date must be included.

* A project must be developed that includes the creation of the UML diagram and the implementation in Java with graphical interface management. In addition, all data must be stored in a database (MySQL), so the Entity Relationship model is also requested.

* Unit tests with the JUnit testing framework and the Mockito framework are requested.

* In addition it is also requested to be able to generate an xls file (Exel), with the customers and their respective pets. In addition, it is required to generate the graphs corresponding to:
   - The number of pets per species.
   - The number of pets per plan.
   - The number of pets per customer.

--------------------------------------------------------------------------------------------------------------------

- #### UML Design:

![UML](media/UML.png)

--------------------------------------------------------------------------------------------------------------------

- ### Entity-Relationship Model:

![E-Rmodel](media/E-Rmodel.png)

--------------------------------------------------------------------------------------------------------------------

- ### Mockup Design:

* Customer list:

![customer_list](media/customer_list.png)


* affiliated pets list:

![affiliated_pets_list](media/affiliated_pets_list.png)


* payment list:

![payment_list](media/payment_list.png)


* Customers management:

![customers_management](media/customers_management.png)


* Pets management:

![pets_management](media/pets_management.png)


* Register payments:

![register_payments](media/register_payments.png)


* Chart of pets per species

![chart_of_pets_per_species](media/chart_of_pets_per_species.png)


* Chart of pets per plan:

![chart_of_pets_per_plan](media/chart_of_pets_per_plan.png)

* Chart of pets per customers:

![chart_of_pets_per_customers](media/chart_of_pets_per_customers.png)

--------------------------------------------------------------------------------------------------------------------