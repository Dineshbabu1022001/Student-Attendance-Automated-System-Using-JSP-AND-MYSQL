-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 09, 2022 at 10:05 AM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `studentfacultysystem`
--
CREATE DATABASE IF NOT EXISTS `studentfacultysystem` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `studentfacultysystem`;

-- --------------------------------------------------------

--
-- Table structure for table `attendanceentry`
--

CREATE TABLE IF NOT EXISTS `attendanceentry` (
  `RegisterNo` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Degree` varchar(50) NOT NULL,
  `StudyingYear` varchar(50) NOT NULL,
  `Attendance` varchar(18) NOT NULL,
  `AttendanceDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendanceentry`
--

INSERT INTO `attendanceentry` (`RegisterNo`, `Name`, `Degree`, `StudyingYear`, `Attendance`, `AttendanceDate`) VALUES
(195001, 'PriyaaSasi', 'BCA', 'III Year', 'Present', '2022-03-26'),
(195003, 'Aparna.P', 'BCA', 'III Year', 'Present', '2022-03-26'),
(195004, 'SuryaKumar.C', 'BCA', 'III Year', 'Present', '2022-03-26'),
(195006, 'SriMathi.C', 'BCA', 'III Year', 'Present', '2022-03-26'),
(195002, 'HariniSasi', 'BCA', 'III Year', 'Absent', '2022-03-26'),
(195005, 'Krithik.G', 'BCA', 'III Year', 'Absent', '2022-03-26'),
(195001, 'PriyaaSasi', 'BCA', 'III Year', 'Present', '2022-03-28'),
(195002, 'HariniSasi', 'BCA', 'III Year', 'Present', '2022-03-28'),
(195003, 'Aparna.P', 'BCA', 'III Year', 'Present', '2022-03-28'),
(195004, 'SuryaKumar.C', 'BCA', 'III Year', 'Present', '2022-03-28'),
(195005, 'Krithik.G', 'BCA', 'III Year', 'Present', '2022-03-28'),
(195006, 'SriMathi.C', 'BCA', 'III Year', 'Present', '2022-03-28'),
(195001, 'PriyaaSasi', 'BCA', 'III Year', 'Present', '2022-04-04'),
(195002, 'HariniSasi', 'BCA', 'III Year', 'Present', '2022-04-04'),
(195003, 'Aparna.P', 'BCA', 'III Year', 'Present', '2022-04-04'),
(195004, 'SuryaKumar.C', 'BCA', 'III Year', 'Present', '2022-04-04'),
(195006, 'SriMathi.C', 'BCA', 'III Year', 'Present', '2022-04-04'),
(195005, 'Krithik.G', 'BCA', 'III Year', 'Absent', '2022-04-04'),
(195001, 'PriyaaSasi', 'BCA', 'III Year', 'Present', '2022-04-08'),
(195002, 'HariniSasi', 'BCA', 'III Year', 'Present', '2022-04-08'),
(195003, 'Aparna.P', 'BCA', 'III Year', 'Present', '2022-04-08'),
(195004, 'SuryaKumar.C', 'BCA', 'III Year', 'Present', '2022-04-08'),
(195005, 'Krithik.G', 'BCA', 'III Year', 'Present', '2022-04-08'),
(195006, 'SriMathi.C', 'BCA', 'III Year', 'Present', '2022-04-08'),
(195001, 'PriyaaSasi', 'BCA', 'III Year', 'Present', '2022-04-09'),
(195002, 'HariniSasi', 'BCA', 'III Year', 'Present', '2022-04-09'),
(195003, 'Aparna.P', 'BCA', 'III Year', 'Present', '2022-04-09'),
(195004, 'SuryaKumar.C', 'BCA', 'III Year', 'Present', '2022-04-09'),
(195005, 'Krithik.G', 'BCA', 'III Year', 'Present', '2022-04-09'),
(195006, 'SriMathi.C', 'BCA', 'III Year', 'Present', '2022-04-09'),
(195001, 'PriyaaSasi', 'BCA', 'III Year', 'Present', '2022-04-07'),
(195002, 'HariniSasi', 'BCA', 'III Year', 'Present', '2022-04-07'),
(195003, 'Aparna.P', 'BCA', 'III Year', 'Present', '2022-04-07'),
(195004, 'SuryaKumar.C', 'BCA', 'III Year', 'Present', '2022-04-07'),
(195005, 'Krithik.G', 'BCA', 'III Year', 'Present', '2022-04-07'),
(195006, 'SriMathi.C', 'BCA', 'III Year', 'Present', '2022-04-07'),
(185001, 'Ajay.R', 'BSc(CS)', 'III Year', 'Present', '2022-04-09');

-- --------------------------------------------------------

--
-- Table structure for table `events`
--

CREATE TABLE IF NOT EXISTS `events` (
  `EventId` int(11) NOT NULL,
  `EventName` varchar(150) NOT NULL,
  `EventDetails` varchar(250) NOT NULL,
  `OtherDetails` varchar(250) NOT NULL,
  `Organizer` varchar(250) NOT NULL,
  `EventDate` date NOT NULL,
  PRIMARY KEY (`EventId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `events`
--

INSERT INTO `events` (`EventId`, `EventName`, `EventDetails`, `OtherDetails`, `Organizer`, `EventDate`) VALUES
(1001, 'Annual Day', 'Annual day will be celebrated on 28/Mar/2022 in our college for the year of 2021-2022.', 'Students, Iy you are willing to participate, give your name, event details to your HOD.', 'Principal and Administrator of the college.', '2022-03-28'),
(1002, 'Workshop', 'One day Workshop on BigData will be conducted on 4/Apr/2022 by the dept of BCA', 'All the year of BCA students should attend without fail.', 'BCA Dept', '2022-04-04'),
(1003, 'Seminar', 'International seminar on Research Avenue in Computer Science will host at AMY BlocK Seminar Hall.', 'All the year of UG and PG students of BSc(CS) department should participate without fail.', 'HOD of BSc(CS) Dept and Infosys', '2022-04-09');

-- --------------------------------------------------------

--
-- Table structure for table `staffs`
--

CREATE TABLE IF NOT EXISTS `staffs` (
  `StaffId` int(11) NOT NULL,
  `StaffName` varchar(50) NOT NULL,
  `Gender` varchar(18) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `MailId` varchar(50) NOT NULL,
  `MobileNo` varchar(50) NOT NULL,
  `Qualification` varchar(50) NOT NULL,
  `Dept` varchar(50) NOT NULL,
  `InchargeYear` varchar(18) NOT NULL,
  `Password` varchar(50) NOT NULL,
  PRIMARY KEY (`StaffId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffs`
--

INSERT INTO `staffs` (`StaffId`, `StaffName`, `Gender`, `Address`, `MailId`, `MobileNo`, `Qualification`, `Dept`, `InchargeYear`, `Password`) VALUES
(101, 'JeyaPal.R', 'Male', 'Arasaradi,\r\nMadurai', 'jeyapal@gmail.com', '9994375035', 'MCS, MPhil, Phd', 'BCA', 'III Year', 'jeyapal'),
(102, 'LakshmiKandhan.N', 'Male', 'Sholavandhan,\r\nMadurai Dt.', 'lakshmikandhan@gmail.com', '9994567890', 'MSc, MPhil, PHd', 'BCA', 'II Year', 'kandhan'),
(103, 'Raja', 'Male', 'KK Nagar,\r\nMadurai.', 'raja@gmail.com', '9842155590', 'MSc, MPhil, Phd', 'BCA', 'I Year', 'raja'),
(104, 'SivaKumar.N', 'Male', 'Sholavandhan,\r\nMadurai Dt.', 'sivakumar@gmail.com', '8369078900', 'MSC, MPhil', 'BSc(CS)', 'I Year', 'siva'),
(105, 'JegadhishChandraBose', 'Male', 'Sholavandhan,\r\nMadurai Dt.', 'bose@gmail.com', '9842168540', 'MSc, MPhil, Phd', 'BSc(CS)', 'II Year', 'bose'),
(106, 'PitchaiMani', 'Male', 'Arasaradi,\r\nMadurai', 'mani@gmail.com', '6369065780', 'MCS, MPhil, Phd', 'BSc(CS)', 'III Year', 'mani');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE IF NOT EXISTS `students` (
  `RegisterNo` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `DOB` date NOT NULL,
  `Age` int(11) NOT NULL,
  `FatherName` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `MailId` varchar(50) NOT NULL,
  `MobileNo` varchar(50) NOT NULL,
  `Degree` varchar(50) NOT NULL,
  `StudyingYear` varchar(18) NOT NULL,
  `Password` varchar(50) NOT NULL,
  PRIMARY KEY (`RegisterNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`RegisterNo`, `Name`, `Gender`, `DOB`, `Age`, `FatherName`, `Address`, `MailId`, `MobileNo`, `Degree`, `StudyingYear`, `Password`) VALUES
(185001, 'Ajay.R', 'Male', '2002-06-12', 20, 'Ramesh', 'Simmakkal,\r\nMadurai', 'ajay@gmail.com', '6543278900', 'BSc(CS)', 'III Year', 'ajay'),
(195001, 'PriyaaSasi', 'Female', '2002-05-05', 20, 'SasiKumar.A.M', 'Thiruvedagam,\r\nMadurai Dt.', 'priyaa@gmail.com', '9842168547', 'BCA', 'III Year', 'sasirani'),
(195002, 'HariniSasi', 'Female', '2002-10-16', 20, 'SasiKumar.A.M', 'Thiruvedagam,\r\nMadurai Dt.', 'harini@gmail.com', '9842168547', 'BCA', 'III Year', 'sasirani'),
(195003, 'Aparna.P', 'Female', '2002-01-04', 20, 'PremKumar.M', 'Thiruvedagam,\r\nMadurai Dt.', 'aparna@gmail.com', '9994914482', 'BCA', 'III Year', 'aparna'),
(195004, 'SuryaKumar.C', 'Male', '2001-06-26', 21, 'ChellaPandi.P', 'Anupanadi,\r\nMadurai', 'surya@gmail.com', '9698132737', 'BCA', 'III Year', 'surya'),
(195005, 'Krithik.G', 'Male', '2001-11-24', 21, 'Guru.M', 'Thiruvedagam,\r\nMadurai Dt.', 'krithik@gmail.com', '9952885707', 'BCA', 'III Year', 'krithik'),
(195006, 'SriMathi.C', 'Female', '2002-03-06', 20, 'ChellaPandi.P', 'Anupanadi,\r\nMadurai', 'sri@gmail.com', '9698132737', 'BCA', 'III Year', 'sri');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
