-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2024 at 06:48 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ticketing_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `ID` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Destination` varchar(255) NOT NULL,
  `DepartureDate` varchar(255) NOT NULL,
  `DepartureTime` varchar(255) NOT NULL,
  `No.OfSeats` varchar(255) NOT NULL,
  `Price` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`ID`, `Name`, `Destination`, `DepartureDate`, `DepartureTime`, `No.OfSeats`, `Price`) VALUES
(439, 'Sds', 'Tagbilaran - Panglao Airport', '2023-12-26', '7:00 AM', '30', '40'),
(440, 'Eqwe', 'Getafe - Tagbilaran', '2023-12-27', '6:00 AM', '10', '120'),
(441, 'Kars', 'Tagbilaran - Panglao', '2023-12-29', '6:00 AM', '40', '80'),
(442, 'Kasda', 'Tagbilaran - Panglao Airport', '2023-12-29', '6:00 AM', '80', '30'),
(443, 'Kars', 'Tagbilaran - Panglao Airport', '2023-12-29', '6:00 AM', '80', '30'),
(444, 'Kars', 'Tagbilaran - Panglao', '2023-12-29', '6:00 AM', '3', '80'),
(445, 'Kasdasd', 'Tagbilaran - Panglao', '2023-12-29', '6:00 AM', '4', '80'),
(446, 'Sadasd', 'Tagbilaran - Panglao Airport', '2023-12-29', '6:00 AM', '8', '30'),
(447, 'Dasds', 'Tagbilaran - Panglao', '2023-12-29', '6:00 AM', '20', '80'),
(448, 'Sdasd', 'Tagbilaran - Panglao', '2023-12-29', '6:00 AM', '18', '80'),
(449, 'Dasd', 'Tagbilaran - Panglao Airport', '2023-12-29', '6:00 AM', '10', '30'),
(450, 'Ksdsad', 'Tagbilaran - Panglao Airport', '2023-12-29', '6:00 AM', '1', '30'),
(451, 'Sdasd', 'Tagbilaran - Panglao Airport', '2023-12-29', '6:00 AM', '9', '30'),
(452, 'Rod Capili', 'Tagbilaran - Panglao Airport', '2023-12-26', '7:00 AM', '2', '40'),
(453, 'Rod Capili', 'Tagbilaran - Panglao', '2024-01-02', '6:00 AM', '2', '80');

-- --------------------------------------------------------

--
-- Table structure for table `login_admin`
--

CREATE TABLE `login_admin` (
  `username` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `login_admin`
--

INSERT INTO `login_admin` (`username`, `password`) VALUES
('admin', '123'),
('kars', 'kars'),
('leonardo', '1234'),
('macky', '1234'),
('pabs', 'pabs');

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE `schedule` (
  `ID` int(255) NOT NULL,
  `Bus Name` varchar(255) NOT NULL,
  `Destination` varchar(255) NOT NULL,
  `DepartureDate` date NOT NULL,
  `DepartureTime` varchar(255) NOT NULL,
  `DateOfArrival` date NOT NULL,
  `TimeOfArrival` varchar(255) NOT NULL,
  `No.OfPassenger` varchar(255) NOT NULL,
  `Price` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `schedule`
--

INSERT INTO `schedule` (`ID`, `Bus Name`, `Destination`, `DepartureDate`, `DepartureTime`, `DateOfArrival`, `TimeOfArrival`, `No.OfPassenger`, `Price`) VALUES
(16, 'BUS101', 'Tagbilaran - Panglao Airport', '2023-12-26', '7:00 AM', '2023-12-26', 'Select', '26', '40'),
(17, 'BUS101', 'Jagna - Tagbilaran', '2023-12-27', '6:00 AM', '2023-12-27', 'Select', '78', '100'),
(18, 'BUSS', 'Getafe - Tagbilaran', '2023-12-27', '6:00 AM', '2023-12-27', '07:30 AM', '0', '120'),
(19, 'BUS11', 'Tagbilaran - Panglao Airport', '2023-12-29', '6:00 AM', '2023-12-29', '06:40 AM', '60', '30'),
(20, 'BUS101', 'Tagbilaran - Panglao', '2023-12-29', '6:00 AM', '2023-12-29', '06:45 AM', '0', '80'),
(21, 'BUSTP101', 'Tagbilaran - Panglao', '2024-01-02', '6:00 AM', '2024-01-02', '06:45 AM', '48', '80');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `login_admin`
--
ALTER TABLE `login_admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `schedule`
--
ALTER TABLE `schedule`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `schedule`
--
ALTER TABLE `schedule`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
