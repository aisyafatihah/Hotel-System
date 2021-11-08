-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 25, 2021 at 01:36 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hoteloop`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `bookingNum` int(11) NOT NULL,
  `GuestID` varchar(50) DEFAULT NULL,
  `roomType` varchar(100) DEFAULT NULL,
  `ArrivalDate` varchar(20) DEFAULT NULL,
  `roomQty` int(11) DEFAULT NULL,
  `night` varchar(23) DEFAULT NULL,
  `paymentOpt` varchar(100) DEFAULT NULL,
  `TotalPrice` decimal(10,2) DEFAULT NULL,
  `TotalAfterServiceCharge` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`bookingNum`, `GuestID`, `roomType`, `ArrivalDate`, `roomQty`, `night`, `paymentOpt`, `TotalPrice`, `TotalAfterServiceCharge`) VALUES
(61, 'aisyyya', 'Queen', '20210125', 1, '2', 'Pay Now (Online Banking)', '490.00', '514.50');

-- --------------------------------------------------------

--
-- Table structure for table `guest`
--

CREATE TABLE `guest` (
  `guestID` varchar(20) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `IC` varchar(14) NOT NULL,
  `telephoneNumber` varchar(11) NOT NULL,
  `Address` varchar(500) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`guestID`, `Name`, `IC`, `telephoneNumber`, `Address`, `email`) VALUES
('aisyyya', 'Aisya Fatihah', '000711031155', '0136012047', 'Kampung Malur,KB,Kel', 'aisya@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomNumber` int(11) NOT NULL,
  `roomType` varchar(10) DEFAULT NULL,
  `roomPrice` decimal(10,2) DEFAULT NULL,
  `roomStatus` varchar(10) DEFAULT 'Available'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomNumber`, `roomType`, `roomPrice`, `roomStatus`) VALUES
(134, 'Single', '180.00', 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `num` int(11) NOT NULL,
  `Username` varchar(100) DEFAULT NULL,
  `Password` text DEFAULT NULL,
  `Name` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`num`, `Username`, `Password`, `Name`) VALUES
(15, 'fdstaff15', 'asap', 'rozita'),
(16, 'fdstaff16', 'sidey', 'rozita');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`bookingNum`),
  ADD KEY `GuestID` (`GuestID`);

--
-- Indexes for table `guest`
--
ALTER TABLE `guest`
  ADD PRIMARY KEY (`guestID`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomNumber`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`num`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `bookingNum` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `roomNumber` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=135;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `num` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `booking_ibfk_1` FOREIGN KEY (`GuestID`) REFERENCES `guest` (`guestID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
