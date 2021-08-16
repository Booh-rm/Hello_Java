-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2021 at 07:01 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `yourpetdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_customers`
--

CREATE TABLE `tb_customers` (
  `id` int(11) NOT NULL,
  `id_customer` varchar(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `address` varchar(250) NOT NULL,
  `phone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_customers`
--

INSERT INTO `tb_customers` (`id`, `id_customer`, `name`, `last_name`, `address`, `phone`) VALUES
(1, '01234567891', 'Name customer 1', 'last name customer 1', 'address customer 1', '0011234567890'),
(2, '01234567892', 'Name customer 2', 'last name customer 2', 'address customer 2', '0021234567890'),
(3, '01234567893', 'Name customer 3', 'last name customer 3', 'address customer 3', '0031234567890'),
(4, '01234567894', 'Name customer 4', 'last name customer 4', 'address customer 4', '0041234567890'),
(5, '01234567895', 'Name customer 5', 'last name customer 5', 'address customer 5', '0051234567890'),
(6, '01234567896', 'Name customer 6', 'last name customer 6', 'address customer 6', '0061234567890'),
(7, '01234567897', 'Name customer 7', 'last name customer 7', 'address customer 7', '0071234567890'),
(8, '01234567898', 'Name customer 8', 'last name customer 8', 'address customer 8', '0081234567890'),
(9, '01234567899', 'Name customer 9', 'last name customer 9', 'address customer 9', '0091234567890'),
(10, '012345678910', 'Name customer 10', 'last name customer 10', 'address customer 1.', '00101234567890');

-- --------------------------------------------------------

--
-- Table structure for table `tb_monthly_fees`
--

CREATE TABLE `tb_monthly_fees` (
  `id` int(11) NOT NULL,
  `fees` int(11) NOT NULL,
  `payment_method` varchar(100) NOT NULL,
  `payment_method_id` varchar(70) NOT NULL,
  `date_fees` date DEFAULT NULL,
  `id_plan` int(11) NOT NULL,
  `id_pet` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_monthly_fees`
--

INSERT INTO `tb_monthly_fees` (`id`, `fees`, `payment_method`, `payment_method_id`, `date_fees`, `id_plan`, `id_pet`) VALUES
(1, 1, 'Credit / debit card', '001-011-111-01', '2021-08-13', 1, 1),
(2, 2, 'Bank transfer', '001-011-111-02', '2021-08-13', 2, 2),
(3, 3, 'Credit / debit card', '001-011-111-03', '2021-08-13', 3, 3),
(4, 4, 'Bank transfer', '001-011-111-04', '2021-08-13', 1, 4),
(5, 5, 'Credit / debit card', '001-011-111-05', '2021-08-13', 2, 5),
(6, 6, 'Bank transfer', '001-011-111-06', '2021-08-13', 3, 6),
(7, 7, 'Credit / debit card', '001-011-111-07', '2021-08-13', 1, 7),
(8, 8, 'Bank transfer', '001-011-111-08', '2021-08-13', 2, 8),
(9, 9, 'Credit / debit card', '001-011-111-09', '2021-08-13', 3, 9),
(10, 10, 'Bank transfer', '001-011-111-010', '2021-08-13', 1, 10);

-- --------------------------------------------------------

--
-- Table structure for table `tb_pets`
--

CREATE TABLE `tb_pets` (
  `id` int(11) NOT NULL,
  `code_pet` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `weight` double NOT NULL,
  `species` varchar(8) NOT NULL,
  `id_owner_pet` int(11) NOT NULL,
  `id_plan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pets`
--

INSERT INTO `tb_pets` (`id`, `code_pet`, `name`, `age`, `weight`, `species`, `id_owner_pet`, `id_plan`) VALUES
(1, '001', 'pet 1', 1, 1, 'Canine', 1, 1),
(2, '002', 'pet 2', 2, 2, 'Feline', 2, 2),
(3, '003', 'pet 3', 3, 3, 'Canine', 3, 3),
(4, '004', 'pet 4', 4, 4, 'Feline', 4, 1),
(5, '005', 'pet 5', 5, 5, 'Canine', 5, 2),
(6, '006', 'pet 6', 6, 6, 'Feline', 1, 3),
(7, '007', 'pet 7', 7, 7, 'Canine', 2, 1),
(8, '008', 'pet 8', 8, 8, 'Feline', 3, 2),
(9, '009', 'pet 9', 9, 9, 'Canine', 1, 3),
(10, '0010', 'pet 10', 10, 10, 'Feline', 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_plans`
--

CREATE TABLE `tb_plans` (
  `id` int(11) NOT NULL,
  `code_plan` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `description` varchar(400) NOT NULL,
  `price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_plans`
--

INSERT INTO `tb_plans` (`id`, `code_plan`, `name`, `description`, `price`) VALUES
(1, '001', 'Wellness plan', 'Basic plan for the care of your pet', 100),
(2, '002', 'Elite plan', 'Elite plan for the care of your pet', 200),
(3, '003', 'Diamond plan', 'Diamond plan for the care of your pet', 300);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_customers`
--
ALTER TABLE `tb_customers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_monthly_fees`
--
ALTER TABLE `tb_monthly_fees`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_plan` (`id_plan`),
  ADD KEY `id_pet` (`id_pet`);

--
-- Indexes for table `tb_pets`
--
ALTER TABLE `tb_pets`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_owner_pet` (`id_owner_pet`),
  ADD KEY `id_plan` (`id_plan`);

--
-- Indexes for table `tb_plans`
--
ALTER TABLE `tb_plans`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_customers`
--
ALTER TABLE `tb_customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tb_monthly_fees`
--
ALTER TABLE `tb_monthly_fees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tb_pets`
--
ALTER TABLE `tb_pets`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tb_plans`
--
ALTER TABLE `tb_plans`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_monthly_fees`
--
ALTER TABLE `tb_monthly_fees`
  ADD CONSTRAINT `tb_monthly_fees_ibfk_1` FOREIGN KEY (`id_plan`) REFERENCES `tb_plans` (`id`),
  ADD CONSTRAINT `tb_monthly_fees_ibfk_2` FOREIGN KEY (`id_pet`) REFERENCES `tb_pets` (`id`);

--
-- Constraints for table `tb_pets`
--
ALTER TABLE `tb_pets`
  ADD CONSTRAINT `tb_pets_ibfk_1` FOREIGN KEY (`id_owner_pet`) REFERENCES `tb_customers` (`id`),
  ADD CONSTRAINT `tb_pets_ibfk_2` FOREIGN KEY (`id_plan`) REFERENCES `tb_plans` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
