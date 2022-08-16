-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2022 at 12:26 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `misspetdbold`
--

-- --------------------------------------------------------

--
-- Table structure for table `ad`
--

CREATE TABLE `ad` (
  `ad_id` bigint(20) NOT NULL,
  `image_link` varchar(255) DEFAULT NULL,
  `pet_description` varchar(255) DEFAULT NULL,
  `pet_gender` varchar(255) DEFAULT NULL,
  `pet_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ad`
--

INSERT INTO `ad` (`ad_id`, `image_link`, `pet_description`, `pet_gender`, `pet_name`) VALUES
(1, '/images/pic/1.png', 'black color, tall', 'male', 'Zigee'),
(2, '/images/pic/2.png', 'white color, small', 'female', 'Mia'),
(3, '/images/pic/3.png', 'black and white', 'male', 'Tyson'),
(4, '/images/pic/4.png', 'broun', 'male', 'Dodo'),
(5, '/images/pic/5.png', 'white bege', 'female', 'Rose'),
(6, '/images/pic/6.png', 'white', 'male', 'Icecream'),
(7, '/images/pic/7.png', 'black', 'male', 'Zorro'),
(8, '/images/pic/8.png', 'red and broun', 'female', 'Silvia'),
(9, '/images/pic/9.png', 'grey', 'male', 'Billy Bones');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `admin` tinyint(1) DEFAULT 0,
  `email` varchar(255) DEFAULT NULL,
  `f_name` varchar(255) DEFAULT NULL,
  `l_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ad`
--
ALTER TABLE `ad`
  ADD PRIMARY KEY (`ad_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
