-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2024 at 09:12 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlynhatro`
--

-- --------------------------------------------------------

--
-- Table structure for table `chi_tiet_hoa_don_den_bu`
--

CREATE TABLE `chi_tiet_hoa_don_den_bu` (
  `ma_hoa_don_den_buf` int(11) NOT NULL,
  `ma_phieu_thuef` int(11) NOT NULL,
  `ma_tien_ichf` int(11) NOT NULL,
  `so_tien` double NOT NULL,
  `ly_do` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chi_tiet_hoa_don_hang_thang`
--

CREATE TABLE `chi_tiet_hoa_don_hang_thang` (
  `ma_hoa_don_hang_thangf` int(11) NOT NULL,
  `ma_phieu_thuef` int(11) NOT NULL,
  `ma_tien_ichf` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chi_tiet_phieu_thue_tien_ich`
--

CREATE TABLE `chi_tiet_phieu_thue_tien_ich` (
  `ma_phieu_thuef` int(11) NOT NULL,
  `ma_tien_ichf` int(11) NOT NULL,
  `tinh_trang` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `chi_tiet_phieu_thue_tien_ich`
--

INSERT INTO `chi_tiet_phieu_thue_tien_ich` (`ma_phieu_thuef`, `ma_tien_ichf`, `tinh_trang`) VALUES
(1, 1, NULL),
(1, 2, NULL),
(1, 3, NULL),
(1, 16, NULL),
(1, 34, 'mới'),
(2, 4, NULL),
(2, 5, NULL),
(2, 6, NULL),
(3, 7, NULL),
(3, 8, NULL),
(3, 9, NULL),
(4, 10, NULL),
(4, 11, NULL),
(4, 12, NULL),
(5, 13, NULL),
(5, 14, NULL),
(5, 15, NULL),
(6, 17, NULL),
(6, 18, NULL),
(6, 19, NULL),
(7, 20, NULL),
(7, 21, NULL),
(7, 22, NULL),
(8, 23, NULL),
(8, 24, NULL),
(8, 25, NULL),
(9, 26, NULL),
(9, 27, NULL),
(9, 28, NULL),
(10, 29, NULL),
(10, 30, NULL),
(10, 31, NULL),
(18, 1, 'mới'),
(18, 2, 'mới'),
(26, 8, 'mới'),
(26, 10, 'mới'),
(27, 9, 'mới'),
(27, 11, 'mới');

-- --------------------------------------------------------

--
-- Table structure for table `hoa_don_den_bu`
--

CREATE TABLE `hoa_don_den_bu` (
  `ma_hoa_don_den_bu` int(11) NOT NULL,
  `ma_phieu_thuef` int(11) DEFAULT NULL,
  `trang_thai_thanh_toan` bit(1) NOT NULL,
  `ngay_lap` datetime(6) DEFAULT NULL,
  `user_namef` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `hoa_don_hang_thang`
--

CREATE TABLE `hoa_don_hang_thang` (
  `ma_hoa_don_hang_thang` int(11) NOT NULL,
  `ma_hop_dongf` int(11) DEFAULT NULL,
  `so_tien` double NOT NULL,
  `trang_thai_thanh_toan` bit(1) NOT NULL,
  `ngay_lap` datetime(6) DEFAULT NULL,
  `user_namef` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hoa_don_hang_thang`
--

INSERT INTO `hoa_don_hang_thang` (`ma_hoa_don_hang_thang`, `ma_hop_dongf`, `so_tien`, `trang_thai_thanh_toan`, `ngay_lap`, `user_namef`) VALUES
(1, 2, 0, b'0', '2023-08-10 23:31:15.000000', 'user1'),
(2, 2, 0, b'0', '2023-09-10 23:31:15.000000', 'user1'),
(3, 2, 0, b'0', '2023-10-10 23:31:15.000000', 'user1'),
(4, 2, 0, b'0', '2023-11-10 23:31:15.000000', 'user1'),
(5, 3, 0, b'0', '2023-08-10 23:31:15.000000', 'user2'),
(6, 3, 0, b'0', '2023-09-10 23:31:15.000000', 'user2'),
(7, 3, 0, b'0', '2023-10-10 23:31:15.000000', 'user2'),
(8, 3, 0, b'0', '2023-11-10 23:31:15.000000', 'user2'),
(9, 4, 0, b'0', '2023-08-10 23:31:15.000000', 'user3'),
(10, 4, 0, b'0', '2023-09-10 23:31:15.000000', 'user3'),
(11, 4, 0, b'0', '2023-10-10 23:31:15.000000', 'user3'),
(12, 4, 0, b'0', '2023-11-10 23:31:15.000000', 'user3'),
(13, 5, 0, b'0', '2023-08-10 23:31:15.000000', 'user4'),
(14, 5, 0, b'0', '2023-09-10 23:31:15.000000', 'user4'),
(15, 5, 0, b'0', '2023-10-10 23:31:15.000000', 'user4'),
(16, 5, 0, b'0', '2023-11-10 23:31:15.000000', 'user4'),
(17, 6, 0, b'0', '2023-08-10 23:31:15.000000', 'user5'),
(18, 6, 0, b'0', '2023-09-10 23:31:15.000000', 'user5'),
(19, 6, 0, b'0', '2023-10-10 23:31:15.000000', 'user5'),
(20, 6, 0, b'0', '2023-11-10 23:31:15.000000', 'user5'),
(21, 7, 0, b'0', '2023-08-10 23:31:15.000000', 'user6'),
(22, 7, 0, b'0', '2023-09-10 23:31:15.000000', 'user6'),
(23, 7, 0, b'0', '2023-10-10 23:31:15.000000', 'user6'),
(24, 7, 0, b'0', '2023-11-10 23:31:15.000000', 'user6'),
(25, 8, 0, b'0', '2023-08-10 23:31:15.000000', 'user7'),
(26, 8, 0, b'0', '2023-09-10 23:31:15.000000', 'user7'),
(27, 8, 0, b'0', '2023-10-10 23:31:15.000000', 'user7'),
(28, 8, 0, b'0', '2023-11-10 23:31:15.000000', 'user7'),
(29, 9, 0, b'0', '2023-08-10 23:31:15.000000', 'user8'),
(30, 9, 0, b'0', '2023-09-10 23:31:15.000000', 'user8'),
(31, 9, 0, b'0', '2023-10-10 23:31:15.000000', 'user8'),
(32, 9, 0, b'0', '2023-11-10 23:31:15.000000', 'user8'),
(33, 10, 0, b'0', '2023-08-10 23:31:15.000000', 'user9'),
(34, 10, 0, b'0', '2023-09-10 23:31:15.000000', 'user9'),
(35, 10, 0, b'0', '2023-10-10 23:31:15.000000', 'user9'),
(36, 10, 0, b'0', '2023-11-10 23:31:15.000000', 'user9'),
(37, 11, 0, b'0', '2023-08-10 23:31:15.000000', 'user10'),
(38, 11, 0, b'0', '2023-09-10 23:31:15.000000', 'user10'),
(39, 11, 0, b'0', '2023-10-10 23:31:15.000000', 'user10'),
(40, 11, 0, b'0', '2023-11-10 23:31:15.000000', 'user10'),
(41, 2, 7630205, b'0', '2023-12-21 00:14:37.756000', 'user1'),
(42, 3, 8460282.5, b'0', '2023-12-21 00:14:37.831000', 'user2'),
(43, 4, 5440262.5, b'0', '2023-12-21 00:14:37.846000', 'user3'),
(44, 5, 9050320, b'0', '2023-12-21 00:14:37.862000', 'user4'),
(45, 6, 7990277.5, b'0', '2023-12-21 00:14:37.877000', 'user5'),
(46, 7, 6950335, b'0', '2023-12-21 00:14:37.896000', 'user6'),
(47, 8, 3180332.5, b'0', '2023-12-21 00:14:37.914000', 'user7'),
(48, 9, 6120390, b'1', '2023-12-21 00:14:37.935000', 'user8'),
(49, 10, 5040447.5, b'1', '2023-12-21 00:14:37.951000', 'user9'),
(50, 11, 8360485, b'1', '2023-12-21 00:14:37.966000', 'user10');

-- --------------------------------------------------------

--
-- Table structure for table `hop_dong_thue_phong`
--

CREATE TABLE `hop_dong_thue_phong` (
  `ma_hop_dong` int(11) NOT NULL,
  `ma_phongf` int(11) DEFAULT NULL,
  `ngay_lap` datetime(6) DEFAULT NULL,
  `cccd` varchar(255) DEFAULT NULL,
  `dia_chi_thuong_tru` varchar(255) DEFAULT NULL,
  `noi_dung` varchar(255) DEFAULT NULL,
  `sdt` varchar(255) DEFAULT NULL,
  `ten` varchar(255) DEFAULT NULL,
  `tinh_trang` varchar(255) DEFAULT NULL,
  `user_namef` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hop_dong_thue_phong`
--

INSERT INTO `hop_dong_thue_phong` (`ma_hop_dong`, `ma_phongf`, `ngay_lap`, `cccd`, `dia_chi_thuong_tru`, `noi_dung`, `sdt`, `ten`, `tinh_trang`, `user_namef`) VALUES
(2, 1, '2023-08-01 00:00:00.000000', '197387354123', 'Phường 1, Quận Bình Thạnh, Hồ Chí Minh', NULL, '0949406357', 'Hoàng Quốc Thái', 'oke', 'user1'),
(3, 2, '2023-08-01 00:00:00.000000', '198765432109', 'Phường 2, Quận 1, Hồ Chí Minh', NULL, '0934567890', 'Nguyễn Văn A', 'oke', 'user2'),
(4, 3, '2023-08-01 00:00:00.000000', '123456789012', 'Phường 3, Quận 3, Hồ Chí Minh', NULL, '0912345678', 'Trần Thị B', 'oke', 'user3'),
(5, 4, '2023-08-01 00:00:00.000000', '987654321012', 'Phường 4, Quận 4, Hồ Chí Minh', NULL, '0923456789', 'Lê Văn C', 'oke', 'user4'),
(6, 5, '2023-08-01 00:00:00.000000', '876543210987', 'Phường 5, Quận 5, Hồ Chí Minh', NULL, '0956789012', 'Phạm Thị D', 'oke', 'user5'),
(7, 6, '2023-08-01 00:00:00.000000', '567890123456', 'Phường 6, Quận 6, Hồ Chí Minh', NULL, '0967890123', 'Võ Văn E', 'oke', 'user6'),
(8, 7, '2023-08-01 00:00:00.000000', '345678901234', 'Phường 7, Quận 7, Hồ Chí Minh', NULL, '0978901234', 'Nguyễn Thị F', 'oke', 'user7'),
(9, 8, '2023-08-01 00:00:00.000000', '456789012345', 'Phường 8, Quận 8, Hồ Chí Minh', NULL, '0980123456', 'Hoàng Văn G', 'oke', 'user8'),
(10, 9, '2023-08-01 00:00:00.000000', '234567890123', 'Phường 9, Quận 9, Hồ Chí Minh', NULL, '0901234567', 'Lê Thị H', 'oke', 'user9'),
(11, 10, '2023-08-01 00:00:00.000000', '890123456789', 'Phường 10, Quận 10, Hồ Chí Minh', NULL, '0912345678', 'Trần Văn I', 'oke', 'user10');

-- --------------------------------------------------------

--
-- Table structure for table `loai_phong`
--

CREATE TABLE `loai_phong` (
  `dien_tich` int(11) NOT NULL,
  `gia` double NOT NULL,
  `ma_loai_phong` int(11) NOT NULL,
  `so_luong` int(11) NOT NULL,
  `hinh` varchar(255) DEFAULT NULL,
  `ten_loai_phong` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loai_phong`
--

INSERT INTO `loai_phong` (`dien_tich`, `gia`, `ma_loai_phong`, `so_luong`, `hinh`, `ten_loai_phong`) VALUES
(50, 5000000, 1, 4, '/images/loai1.jpg', '2 phòng ngủ, 2 WC'),
(40, 4000000, 2, 6, '/images/loai2.jpg', '2 phòng ngủ, 1 WC'),
(80, 8000000, 3, 8, '/images/loai3.jpg', '3 phòng ngủ, 3 WC'),
(70, 7000000, 4, 8, '/images/loai4.jpg', '3 phòng ngủ, 2 WC'),
(60, 6000000, 5, 8, '/images/loai5.jpg', '3 phòng ngủ, 1 WC'),
(20, 2000000, 6, 5, '/images/loai6.jpg', '1 phòng ngủ, 1 WC');

-- --------------------------------------------------------

--
-- Table structure for table `loai_tien_ich`
--

CREATE TABLE `loai_tien_ich` (
  `ma_loai_tien_ich` int(11) NOT NULL,
  `ten_loai_tien_ich` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loai_tien_ich`
--

INSERT INTO `loai_tien_ich` (`ma_loai_tien_ich`, `ten_loai_tien_ich`) VALUES
(1, 'Tủ lạnh'),
(2, 'Máy giặt'),
(3, 'Máy lạnh\r\n'),
(4, 'Biếp điện');

-- --------------------------------------------------------

--
-- Table structure for table `phieu_thue_tien_ich`
--

CREATE TABLE `phieu_thue_tien_ich` (
  `ma_phieu_thue` int(11) NOT NULL,
  `ngay_lap` datetime(6) DEFAULT NULL,
  `user_namef` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `phieu_thue_tien_ich`
--

INSERT INTO `phieu_thue_tien_ich` (`ma_phieu_thue`, `ngay_lap`, `user_namef`) VALUES
(1, '2023-08-01 23:31:15.000000', 'user1'),
(2, '2023-08-01 23:31:15.000000', 'user2'),
(3, '2023-08-01 23:31:15.000000', 'user3'),
(4, '2023-08-01 23:31:15.000000', 'user4'),
(5, '2023-08-01 23:31:15.000000', 'user5'),
(6, '2023-08-01 23:31:15.000000', 'user6'),
(7, '2023-08-01 23:31:15.000000', 'user7'),
(8, '2023-08-01 23:31:15.000000', 'user8'),
(9, '2023-08-01 23:31:15.000000', 'user9'),
(10, '2023-08-01 23:31:15.000000', 'user10'),
(11, '2023-12-16 14:50:52.000000', 'user1'),
(12, '2023-12-16 16:31:42.000000', 'user1'),
(13, '2023-12-16 16:31:44.000000', 'user1'),
(14, '2023-12-16 16:31:45.000000', 'user1'),
(15, '2023-12-16 16:31:46.000000', 'user1'),
(16, '2023-12-16 16:31:47.000000', 'user1'),
(17, '2023-12-16 16:39:15.000000', 'user1'),
(18, '2023-12-16 16:51:17.000000', 'user1'),
(19, '2023-12-16 22:47:24.000000', 'user2'),
(20, '2023-12-16 22:49:53.000000', 'user2'),
(21, '2023-12-16 22:50:05.000000', 'user2'),
(22, '2023-12-16 22:51:53.000000', 'user2'),
(23, '2023-12-16 22:54:36.000000', 'user2'),
(24, '2023-12-16 22:55:58.000000', 'user2'),
(25, '2023-12-16 22:57:57.000000', 'user2'),
(26, '2023-12-16 22:59:19.000000', 'user2'),
(27, '2023-12-16 22:59:49.000000', 'user2');

-- --------------------------------------------------------

--
-- Table structure for table `phong`
--

CREATE TABLE `phong` (
  `con_trong` bit(1) NOT NULL,
  `ma_loai_phongf` int(11) DEFAULT NULL,
  `ma_phong` int(11) NOT NULL,
  `tang` int(11) NOT NULL,
  `tinh_trang` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `phong`
--

INSERT INTO `phong` (`con_trong`, `ma_loai_phongf`, `ma_phong`, `tang`, `tinh_trang`) VALUES
(b'0', 1, 1, 1, 'mới xây'),
(b'0', 1, 2, 1, 'mới xây'),
(b'0', 2, 3, 2, 'đang sửa chữa'),
(b'0', 3, 4, 3, 'sẵn sàng'),
(b'0', 4, 5, 4, 'cần bảo trì'),
(b'0', 5, 6, 5, 'đang sử dụng'),
(b'0', 6, 7, 6, 'mới xây'),
(b'0', 1, 8, 1, 'cần bảo trì'),
(b'0', 2, 9, 2, 'đang sử dụng'),
(b'0', 3, 10, 3, 'sẵn sàng'),
(b'1', 4, 11, 4, 'mới xây'),
(b'1', 5, 12, 5, 'mới sơn sửa'),
(b'1', 6, 13, 6, 'bình thường'),
(b'1', 1, 14, 1, 'mới sơn sửa'),
(b'1', 2, 15, 2, 'bình thường'),
(b'1', 3, 16, 3, 'mới sơn sửa'),
(b'1', 4, 17, 4, 'bình thường'),
(b'1', 5, 18, 5, 'mới sơn sửa'),
(b'1', 6, 19, 6, 'bình thường'),
(b'1', 1, 20, 1, 'mới sơn sửa'),
(b'1', 2, 21, 2, 'bình thường');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `ma_role` int(11) NOT NULL,
  `ten_role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`ma_role`, `ten_role`) VALUES
(1, 'admin'),
(2, 'quanly'),
(3, 'user');

-- --------------------------------------------------------

--
-- Table structure for table `so_dien`
--

CREATE TABLE `so_dien` (
  `don_gia` double NOT NULL,
  `ma_phongfpk` int(11) NOT NULL,
  `so` double NOT NULL,
  `ngay_nhap` datetime(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `so_dien`
--

INSERT INTO `so_dien` (`don_gia`, `ma_phongfpk`, `so`, `ngay_nhap`) VALUES
(3.5, 1, 30, '2023-08-01 00:00:00.000000'),
(3.5, 1, 40, '2023-09-01 00:00:00.000000'),
(3.5, 1, 50, '2023-10-01 00:00:00.000000'),
(3.5, 1, 60, '2023-11-01 00:00:00.000000'),
(3.5, 2, 35, '2023-08-01 00:00:00.000000'),
(3.5, 2, 45, '2023-09-01 00:00:00.000000'),
(3.5, 2, 55, '2023-10-01 00:00:00.000000'),
(3.5, 2, 65, '2023-11-01 00:00:00.000000'),
(3.5, 3, 35, '2023-08-01 00:00:00.000000'),
(3.5, 3, 45, '2023-09-01 00:00:00.000000'),
(3.5, 3, 55, '2023-10-01 00:00:00.000000'),
(3.5, 3, 65, '2023-11-01 00:00:00.000000'),
(3.5, 4, 40, '2023-08-01 00:00:00.000000'),
(3.5, 4, 50, '2023-09-01 00:00:00.000000'),
(3.5, 4, 60, '2023-10-01 00:00:00.000000'),
(3.5, 4, 70, '2023-11-01 00:00:00.000000'),
(3.5, 5, 45, '2023-08-01 00:00:00.000000'),
(3.5, 5, 55, '2023-09-01 00:00:00.000000'),
(3.5, 5, 65, '2023-10-01 00:00:00.000000'),
(3.5, 5, 75, '2023-11-01 00:00:00.000000'),
(3.5, 6, 50, '2023-08-01 00:00:00.000000'),
(3.5, 6, 60, '2023-09-01 00:00:00.000000'),
(3.5, 6, 70, '2023-10-01 00:00:00.000000'),
(3.5, 6, 80, '2023-11-01 00:00:00.000000'),
(3.5, 7, 55, '2023-08-01 00:00:00.000000'),
(3.5, 7, 65, '2023-09-01 00:00:00.000000'),
(3.5, 7, 75, '2023-10-01 00:00:00.000000'),
(3.5, 7, 30, '2023-11-01 00:00:00.000000'),
(3.5, 8, 60, '2023-08-01 00:00:00.000000'),
(3.5, 8, 70, '2023-09-01 00:00:00.000000'),
(3.5, 8, 80, '2023-10-01 00:00:00.000000'),
(3.5, 8, 35, '2023-11-01 00:00:00.000000'),
(3.5, 9, 65, '2023-08-01 00:00:00.000000'),
(3.5, 9, 75, '2023-09-01 00:00:00.000000'),
(3.5, 9, 30, '2023-10-01 00:00:00.000000'),
(3.5, 9, 40, '2023-11-01 00:00:00.000000'),
(3.5, 10, 70, '2023-08-01 00:00:00.000000'),
(3.5, 10, 80, '2023-09-01 00:00:00.000000'),
(3.5, 10, 35, '2023-10-01 00:00:00.000000'),
(3.5, 10, 45, '2023-11-01 00:00:00.000000'),
(3.5, 11, 75, '2023-08-01 00:00:00.000000'),
(3.5, 11, 30, '2023-09-01 00:00:00.000000'),
(3.5, 11, 40, '2023-10-01 00:00:00.000000'),
(3.5, 11, 50, '2023-11-01 00:00:00.000000'),
(3.5, 12, 80, '2023-08-01 00:00:00.000000'),
(3.5, 12, 35, '2023-09-01 00:00:00.000000'),
(3.5, 12, 45, '2023-10-01 00:00:00.000000'),
(3.5, 12, 55, '2023-11-01 00:00:00.000000'),
(3.5, 13, 30, '2023-08-01 00:00:00.000000'),
(3.5, 13, 40, '2023-09-01 00:00:00.000000'),
(3.5, 13, 50, '2023-10-01 00:00:00.000000'),
(3.5, 13, 60, '2023-11-01 00:00:00.000000'),
(3.5, 14, 35, '2023-08-01 00:00:00.000000'),
(3.5, 14, 45, '2023-09-01 00:00:00.000000'),
(3.5, 14, 55, '2023-10-01 00:00:00.000000'),
(3.5, 14, 65, '2023-11-01 00:00:00.000000'),
(3.5, 15, 40, '2023-08-01 00:00:00.000000'),
(3.5, 15, 50, '2023-09-01 00:00:00.000000'),
(3.5, 15, 60, '2023-10-01 00:00:00.000000'),
(3.5, 15, 70, '2023-11-01 00:00:00.000000'),
(3.5, 16, 45, '2023-08-01 00:00:00.000000'),
(3.5, 16, 55, '2023-09-01 00:00:00.000000'),
(3.5, 16, 65, '2023-10-01 00:00:00.000000'),
(3.5, 16, 75, '2023-11-01 00:00:00.000000'),
(3.5, 17, 50, '2023-08-01 00:00:00.000000'),
(3.5, 17, 60, '2023-09-01 00:00:00.000000'),
(3.5, 17, 70, '2023-10-01 00:00:00.000000'),
(3.5, 17, 80, '2023-11-01 00:00:00.000000'),
(3.5, 18, 55, '2023-08-01 00:00:00.000000'),
(3.5, 18, 65, '2023-09-01 00:00:00.000000'),
(3.5, 18, 75, '2023-10-01 00:00:00.000000'),
(3.5, 18, 30, '2023-11-01 00:00:00.000000'),
(3.5, 19, 60, '2023-08-01 00:00:00.000000'),
(3.5, 19, 70, '2023-09-01 00:00:00.000000'),
(3.5, 19, 80, '2023-10-01 00:00:00.000000'),
(3.5, 19, 35, '2023-11-01 00:00:00.000000'),
(3.5, 20, 65, '2023-08-01 00:00:00.000000'),
(3.5, 20, 75, '2023-09-01 00:00:00.000000'),
(3.5, 20, 30, '2023-10-01 00:00:00.000000'),
(3.5, 20, 40, '2023-11-01 00:00:00.000000'),
(3.5, 21, 70, '2023-08-01 00:00:00.000000'),
(3.5, 21, 80, '2023-09-01 00:00:00.000000'),
(3.5, 21, 35, '2023-10-01 00:00:00.000000'),
(3.5, 21, 45, '2023-11-01 00:00:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `so_nuoc`
--

CREATE TABLE `so_nuoc` (
  `don_gia` double NOT NULL,
  `ma_phongfpk` int(11) NOT NULL,
  `so` double NOT NULL,
  `ngay_nhap` datetime(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `so_nuoc`
--

INSERT INTO `so_nuoc` (`don_gia`, `ma_phongfpk`, `so`, `ngay_nhap`) VALUES
(20, 1, 5, '2023-08-01 00:00:00.000000'),
(20, 1, 10, '2023-09-01 00:00:00.000000'),
(20, 1, 15, '2023-10-01 00:00:00.000000'),
(20, 1, 20, '2023-11-01 00:00:00.000000'),
(20, 2, 8, '2023-08-01 00:00:00.000000'),
(20, 2, 12, '2023-09-01 00:00:00.000000'),
(20, 2, 16, '2023-10-01 00:00:00.000000'),
(20, 2, 18, '2023-11-01 00:00:00.000000'),
(20, 3, 7, '2023-08-01 00:00:00.000000'),
(20, 3, 11, '2023-09-01 00:00:00.000000'),
(20, 3, 14, '2023-10-01 00:00:00.000000'),
(20, 3, 19, '2023-11-01 00:00:00.000000'),
(3500, 3, 20, '2023-12-20 22:21:54.475000'),
(20, 4, 9, '2023-08-01 00:00:00.000000'),
(20, 4, 13, '2023-09-01 00:00:00.000000'),
(20, 4, 17, '2023-10-01 00:00:00.000000'),
(20, 4, 20, '2023-11-01 00:00:00.000000'),
(20, 5, 6, '2023-08-01 00:00:00.000000'),
(20, 5, 10, '2023-09-01 00:00:00.000000'),
(20, 5, 15, '2023-10-01 00:00:00.000000'),
(20, 5, 18, '2023-11-01 00:00:00.000000'),
(20, 6, 8, '2023-08-01 00:00:00.000000'),
(20, 6, 12, '2023-09-01 00:00:00.000000'),
(20, 6, 16, '2023-10-01 00:00:00.000000'),
(20, 6, 19, '2023-11-01 00:00:00.000000'),
(20, 7, 7, '2023-08-01 00:00:00.000000'),
(20, 7, 11, '2023-09-01 00:00:00.000000'),
(20, 7, 14, '2023-10-01 00:00:00.000000'),
(20, 7, 18, '2023-11-01 00:00:00.000000'),
(20, 8, 9, '2023-08-01 00:00:00.000000'),
(20, 8, 13, '2023-09-01 00:00:00.000000'),
(20, 8, 17, '2023-10-01 00:00:00.000000'),
(20, 8, 20, '2023-11-01 00:00:00.000000'),
(20, 9, 11, '2023-08-01 00:00:00.000000'),
(20, 9, 15, '2023-09-01 00:00:00.000000'),
(20, 9, 17, '2023-10-01 00:00:00.000000'),
(20, 9, 20, '2023-11-01 00:00:00.000000'),
(20, 10, 12, '2023-08-01 00:00:00.000000'),
(20, 10, 16, '2023-09-01 00:00:00.000000'),
(20, 10, 18, '2023-10-01 00:00:00.000000'),
(20, 10, 19, '2023-11-01 00:00:00.000000'),
(20, 11, 13, '2023-08-01 00:00:00.000000'),
(20, 11, 15, '2023-09-01 00:00:00.000000'),
(20, 11, 17, '2023-10-01 00:00:00.000000'),
(20, 11, 20, '2023-11-01 00:00:00.000000'),
(20, 12, 14, '2023-08-01 00:00:00.000000'),
(20, 12, 16, '2023-09-01 00:00:00.000000'),
(20, 12, 18, '2023-10-01 00:00:00.000000'),
(20, 12, 19, '2023-11-01 00:00:00.000000'),
(20, 13, 15, '2023-08-01 00:00:00.000000'),
(20, 13, 17, '2023-09-01 00:00:00.000000'),
(20, 13, 19, '2023-10-01 00:00:00.000000'),
(20, 13, 20, '2023-11-01 00:00:00.000000'),
(20, 14, 16, '2023-08-01 00:00:00.000000'),
(20, 14, 18, '2023-09-01 00:00:00.000000'),
(20, 14, 19, '2023-10-01 00:00:00.000000'),
(20, 14, 20, '2023-11-01 00:00:00.000000'),
(20, 15, 17, '2023-08-01 00:00:00.000000'),
(20, 15, 19, '2023-09-01 00:00:00.000000'),
(20, 15, 20, '2023-10-01 00:00:00.000000'),
(20, 15, 20, '2023-11-01 00:00:00.000000'),
(20, 16, 18, '2023-08-01 00:00:00.000000'),
(20, 16, 19, '2023-09-01 00:00:00.000000'),
(20, 16, 20, '2023-10-01 00:00:00.000000'),
(20, 16, 20, '2023-11-01 00:00:00.000000'),
(20, 17, 9, '2023-08-01 00:00:00.000000'),
(20, 17, 12, '2023-09-01 00:00:00.000000'),
(20, 17, 15, '2023-10-01 00:00:00.000000'),
(20, 17, 18, '2023-11-01 00:00:00.000000'),
(20, 18, 11, '2023-08-01 00:00:00.000000'),
(20, 18, 14, '2023-09-01 00:00:00.000000'),
(20, 18, 17, '2023-10-01 00:00:00.000000'),
(20, 18, 20, '2023-11-01 00:00:00.000000'),
(20, 19, 13, '2023-08-01 00:00:00.000000'),
(20, 19, 16, '2023-09-01 00:00:00.000000'),
(20, 19, 19, '2023-10-01 00:00:00.000000'),
(20, 19, 20, '2023-11-01 00:00:00.000000'),
(20, 20, 15, '2023-08-01 00:00:00.000000'),
(20, 20, 18, '2023-09-01 00:00:00.000000'),
(20, 20, 20, '2023-10-01 00:00:00.000000'),
(20, 20, 20, '2023-11-01 00:00:00.000000'),
(20, 21, 10, '2023-08-01 00:00:00.000000'),
(20, 21, 13, '2023-09-01 00:00:00.000000'),
(20, 21, 16, '2023-10-01 00:00:00.000000'),
(20, 21, 19, '2023-11-01 00:00:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `tai_khoan`
--

CREATE TABLE `tai_khoan` (
  `ma_rolef` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tai_khoan`
--

INSERT INTO `tai_khoan` (`ma_rolef`, `email`, `password`, `user_name`) VALUES
(1, 'tuan@gmail.com', '$2a$10$DhYx3hzsGmehMdm./f3yMOAhLA3NpIbmHOSEWxnjp1ekHPLDFNRNK\n', 'tuan'),
(3, NULL, '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'tuan123'),
(3, 'user1@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user1'),
(3, 'user10@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user10'),
(3, 'user11@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user11'),
(3, 'user12@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user12'),
(3, 'user13@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user13'),
(3, 'user14@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user14'),
(3, 'user15@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user15'),
(3, 'user2@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user2'),
(3, 'user3@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user3'),
(3, 'user4@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user4'),
(3, 'user5@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user5'),
(3, 'user6@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user6'),
(3, 'user7@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user7'),
(3, 'user8@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user8'),
(3, 'user9@gmail.com', '$2a$10$PAKAf5hFAXJROvehBUB7uO0fK8iTcIkbmVkdJwtqCqF2RPmJaE3gG', 'user9');

-- --------------------------------------------------------

--
-- Table structure for table `tien_ich`
--

CREATE TABLE `tien_ich` (
  `co_san` bit(1) NOT NULL,
  `gia` double NOT NULL,
  `ma_loai_tien_ichf` int(11) DEFAULT NULL,
  `ma_tien_ich` int(11) NOT NULL,
  `ten_tien_ich` varchar(255) DEFAULT NULL,
  `tinh_trang` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tien_ich`
--

INSERT INTO `tien_ich` (`co_san`, `gia`, `ma_loai_tien_ichf`, `ma_tien_ich`, `ten_tien_ich`, `tinh_trang`) VALUES
(b'0', 300000, 1, 1, 'Tủ lạnh Samsung 200 lít 01', 'mới'),
(b'0', 500000, 1, 2, 'Tủ lạnh Samsung 300 lít 02', 'mới'),
(b'0', 700000, 1, 3, 'Tủ lạnh Samsung 400 lít 03', 'mới'),
(b'0', 350000, 1, 4, 'Tủ lạnh Toshiba 250 lít 01', 'mới'),
(b'0', 550000, 1, 5, 'Tủ lạnh Toshiba 350 lít 02', 'mới'),
(b'0', 750000, 1, 6, 'Tủ lạnh Toshiba 450 lít 03', 'mới'),
(b'0', 280000, 1, 7, 'Tủ lạnh Panasonic 180 lít 01', 'mới'),
(b'0', 480000, 1, 8, 'Tủ lạnh Panasonic 280 lít 02', 'mới'),
(b'0', 680000, 1, 9, 'Tủ lạnh Panasonic 380 lít 03', 'mới'),
(b'0', 300000, 2, 10, 'Máy giặt Sharp 7.5 kg 01', 'mới'),
(b'0', 350000, 2, 11, 'Máy giặt Sharp 8 kg 02', 'mới'),
(b'0', 400000, 2, 12, 'Máy giặt Sharp 10 kg 03', 'mới'),
(b'0', 280000, 2, 13, 'Máy giặt Toshiba 6 kg 01', 'mới'),
(b'0', 330000, 2, 14, 'Máy giặt Toshiba 7 kg 02', 'mới'),
(b'0', 380000, 2, 15, 'Máy giặt Toshiba 9 kg 03', 'mới'),
(b'0', 250000, 2, 16, 'Máy giặt LG 5.5 kg 01', 'mới'),
(b'0', 300000, 2, 17, 'Máy giặt LG 6.5 kg 02', 'mới'),
(b'0', 350000, 2, 18, 'Máy giặt LG 8 kg 03', 'mới'),
(b'0', 300000, 3, 19, 'Máy lạnh Toshiba invertor 1.5HP 01', 'mới'),
(b'0', 400000, 3, 20, 'Máy lạnh Toshiba invertor 2.0HP 02', 'mới'),
(b'0', 500000, 3, 21, 'Máy lạnh Toshiba invertor 2.5HP 03', 'mới'),
(b'0', 280000, 3, 22, 'Máy lạnh Panasonic invertor 1.0HP 01', 'mới'),
(b'0', 350000, 3, 23, 'Máy lạnh Panasonic invertor 1.5HP 02', 'mới'),
(b'0', 450000, 3, 24, 'Máy lạnh Panasonic invertor 2.0HP 03', 'mới'),
(b'0', 320000, 3, 25, 'Máy lạnh LG invertor 1.5HP 01', 'mới'),
(b'0', 420000, 3, 26, 'Máy lạnh LG invertor 2.0HP 02', 'mới'),
(b'0', 520000, 3, 27, 'Máy lạnh LG invertor 2.5HP 03', 'mới'),
(b'0', 100000, 4, 28, 'Bếp điện Sunhouse 2000W 01', 'mới'),
(b'0', 120000, 4, 29, 'Bếp điện Sunhouse 2500W 02', 'mới'),
(b'0', 150000, 4, 30, 'Bếp điện Sunhouse 3000W 03', 'mới'),
(b'0', 90000, 4, 31, 'Bếp điện Electrolux 1800W 01', 'mới'),
(b'0', 110000, 4, 32, 'Bếp điện Electrolux 2200W 02', 'mới'),
(b'0', 130000, 4, 33, 'Bếp điện Electrolux 2700W 03', 'mới'),
(b'0', 80000, 4, 34, 'Bếp điện Bosch 1500W 01', 'mới'),
(b'0', 100000, 4, 35, 'Bếp điện Bosch 2000W 02', 'mới'),
(b'0', 120000, 4, 36, 'Bếp điện Bosch 2500W 03', 'mới');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chi_tiet_hoa_don_den_bu`
--
ALTER TABLE `chi_tiet_hoa_don_den_bu`
  ADD PRIMARY KEY (`ma_hoa_don_den_buf`,`ma_phieu_thuef`,`ma_tien_ichf`),
  ADD KEY `FKqgtvpi9a9q53ek1fddgyv1ty1` (`ma_phieu_thuef`,`ma_tien_ichf`);

--
-- Indexes for table `chi_tiet_hoa_don_hang_thang`
--
ALTER TABLE `chi_tiet_hoa_don_hang_thang`
  ADD PRIMARY KEY (`ma_hoa_don_hang_thangf`,`ma_phieu_thuef`,`ma_tien_ichf`),
  ADD KEY `FK912j4euf1we38eu83y4t16aj` (`ma_phieu_thuef`,`ma_tien_ichf`);

--
-- Indexes for table `chi_tiet_phieu_thue_tien_ich`
--
ALTER TABLE `chi_tiet_phieu_thue_tien_ich`
  ADD PRIMARY KEY (`ma_phieu_thuef`,`ma_tien_ichf`),
  ADD KEY `FK5kpoccnxbbcmlv0mqyvcti718` (`ma_tien_ichf`);

--
-- Indexes for table `hoa_don_den_bu`
--
ALTER TABLE `hoa_don_den_bu`
  ADD PRIMARY KEY (`ma_hoa_don_den_bu`),
  ADD KEY `FKoh49imm274j4gmymxhxquq4rg` (`ma_phieu_thuef`),
  ADD KEY `FK2ju9y8p6m1jshgxh7xyh2ssic` (`user_namef`);

--
-- Indexes for table `hoa_don_hang_thang`
--
ALTER TABLE `hoa_don_hang_thang`
  ADD PRIMARY KEY (`ma_hoa_don_hang_thang`),
  ADD KEY `FK9du7mbmdcvsauywb0nww9dx33` (`ma_hop_dongf`),
  ADD KEY `FKgedkwrrof5fk4l72xv4vsx234` (`user_namef`);

--
-- Indexes for table `hop_dong_thue_phong`
--
ALTER TABLE `hop_dong_thue_phong`
  ADD PRIMARY KEY (`ma_hop_dong`),
  ADD KEY `FKb3g5x383amma1jmcr6k1ok70v` (`ma_phongf`),
  ADD KEY `FKhsbjiylq28yv89l7qfkgru9i0` (`user_namef`);

--
-- Indexes for table `loai_phong`
--
ALTER TABLE `loai_phong`
  ADD PRIMARY KEY (`ma_loai_phong`);

--
-- Indexes for table `loai_tien_ich`
--
ALTER TABLE `loai_tien_ich`
  ADD PRIMARY KEY (`ma_loai_tien_ich`);

--
-- Indexes for table `phieu_thue_tien_ich`
--
ALTER TABLE `phieu_thue_tien_ich`
  ADD PRIMARY KEY (`ma_phieu_thue`),
  ADD KEY `FKmaqoos69s9ar67rg8106u4k84` (`user_namef`);

--
-- Indexes for table `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`ma_phong`),
  ADD KEY `FKlo1pjhqoxom1vls90lca4g5r2` (`ma_loai_phongf`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`ma_role`);

--
-- Indexes for table `so_dien`
--
ALTER TABLE `so_dien`
  ADD PRIMARY KEY (`ma_phongfpk`,`ngay_nhap`);

--
-- Indexes for table `so_nuoc`
--
ALTER TABLE `so_nuoc`
  ADD PRIMARY KEY (`ma_phongfpk`,`ngay_nhap`);

--
-- Indexes for table `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD PRIMARY KEY (`user_name`),
  ADD KEY `FK5yqkac8ate0esksyja728hv1s` (`ma_rolef`);

--
-- Indexes for table `tien_ich`
--
ALTER TABLE `tien_ich`
  ADD PRIMARY KEY (`ma_tien_ich`),
  ADD KEY `FKbdw9vn5us9ifrkp82rbasdctt` (`ma_loai_tien_ichf`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hoa_don_den_bu`
--
ALTER TABLE `hoa_don_den_bu`
  MODIFY `ma_hoa_don_den_bu` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `hoa_don_hang_thang`
--
ALTER TABLE `hoa_don_hang_thang`
  MODIFY `ma_hoa_don_hang_thang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `hop_dong_thue_phong`
--
ALTER TABLE `hop_dong_thue_phong`
  MODIFY `ma_hop_dong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `loai_phong`
--
ALTER TABLE `loai_phong`
  MODIFY `ma_loai_phong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `loai_tien_ich`
--
ALTER TABLE `loai_tien_ich`
  MODIFY `ma_loai_tien_ich` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `phieu_thue_tien_ich`
--
ALTER TABLE `phieu_thue_tien_ich`
  MODIFY `ma_phieu_thue` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `phong`
--
ALTER TABLE `phong`
  MODIFY `ma_phong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `ma_role` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tien_ich`
--
ALTER TABLE `tien_ich`
  MODIFY `ma_tien_ich` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chi_tiet_hoa_don_den_bu`
--
ALTER TABLE `chi_tiet_hoa_don_den_bu`
  ADD CONSTRAINT `FKhimp0l2nmx7i9ahp8osqc90xf` FOREIGN KEY (`ma_hoa_don_den_buf`) REFERENCES `hoa_don_den_bu` (`ma_hoa_don_den_bu`),
  ADD CONSTRAINT `FKqgtvpi9a9q53ek1fddgyv1ty1` FOREIGN KEY (`ma_phieu_thuef`,`ma_tien_ichf`) REFERENCES `chi_tiet_phieu_thue_tien_ich` (`ma_phieu_thuef`, `ma_tien_ichf`);

--
-- Constraints for table `chi_tiet_hoa_don_hang_thang`
--
ALTER TABLE `chi_tiet_hoa_don_hang_thang`
  ADD CONSTRAINT `FK8d5idqnayr87qrphdvt945cht` FOREIGN KEY (`ma_hoa_don_hang_thangf`) REFERENCES `hoa_don_hang_thang` (`ma_hoa_don_hang_thang`),
  ADD CONSTRAINT `FK912j4euf1we38eu83y4t16aj` FOREIGN KEY (`ma_phieu_thuef`,`ma_tien_ichf`) REFERENCES `chi_tiet_phieu_thue_tien_ich` (`ma_phieu_thuef`, `ma_tien_ichf`);

--
-- Constraints for table `chi_tiet_phieu_thue_tien_ich`
--
ALTER TABLE `chi_tiet_phieu_thue_tien_ich`
  ADD CONSTRAINT `FK5kpoccnxbbcmlv0mqyvcti718` FOREIGN KEY (`ma_tien_ichf`) REFERENCES `tien_ich` (`ma_tien_ich`),
  ADD CONSTRAINT `FK9s9mojuw98nykt2rt8cuoi49` FOREIGN KEY (`ma_phieu_thuef`) REFERENCES `phieu_thue_tien_ich` (`ma_phieu_thue`);

--
-- Constraints for table `hoa_don_den_bu`
--
ALTER TABLE `hoa_don_den_bu`
  ADD CONSTRAINT `FK2ju9y8p6m1jshgxh7xyh2ssic` FOREIGN KEY (`user_namef`) REFERENCES `tai_khoan` (`user_name`),
  ADD CONSTRAINT `FKoh49imm274j4gmymxhxquq4rg` FOREIGN KEY (`ma_phieu_thuef`) REFERENCES `phieu_thue_tien_ich` (`ma_phieu_thue`);

--
-- Constraints for table `hoa_don_hang_thang`
--
ALTER TABLE `hoa_don_hang_thang`
  ADD CONSTRAINT `FK9du7mbmdcvsauywb0nww9dx33` FOREIGN KEY (`ma_hop_dongf`) REFERENCES `hop_dong_thue_phong` (`ma_hop_dong`),
  ADD CONSTRAINT `FKgedkwrrof5fk4l72xv4vsx234` FOREIGN KEY (`user_namef`) REFERENCES `tai_khoan` (`user_name`);

--
-- Constraints for table `hop_dong_thue_phong`
--
ALTER TABLE `hop_dong_thue_phong`
  ADD CONSTRAINT `FKb3g5x383amma1jmcr6k1ok70v` FOREIGN KEY (`ma_phongf`) REFERENCES `phong` (`ma_phong`),
  ADD CONSTRAINT `FKhsbjiylq28yv89l7qfkgru9i0` FOREIGN KEY (`user_namef`) REFERENCES `tai_khoan` (`user_name`);

--
-- Constraints for table `phieu_thue_tien_ich`
--
ALTER TABLE `phieu_thue_tien_ich`
  ADD CONSTRAINT `FKmaqoos69s9ar67rg8106u4k84` FOREIGN KEY (`user_namef`) REFERENCES `tai_khoan` (`user_name`);

--
-- Constraints for table `phong`
--
ALTER TABLE `phong`
  ADD CONSTRAINT `FKlo1pjhqoxom1vls90lca4g5r2` FOREIGN KEY (`ma_loai_phongf`) REFERENCES `loai_phong` (`ma_loai_phong`);

--
-- Constraints for table `so_dien`
--
ALTER TABLE `so_dien`
  ADD CONSTRAINT `FKc1y13oh6lx0vypxwn97eumdcu` FOREIGN KEY (`ma_phongfpk`) REFERENCES `phong` (`ma_phong`);

--
-- Constraints for table `so_nuoc`
--
ALTER TABLE `so_nuoc`
  ADD CONSTRAINT `FK285a8is11xhjixpqdxrxkn7wq` FOREIGN KEY (`ma_phongfpk`) REFERENCES `phong` (`ma_phong`);

--
-- Constraints for table `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD CONSTRAINT `FK5yqkac8ate0esksyja728hv1s` FOREIGN KEY (`ma_rolef`) REFERENCES `role` (`ma_role`);

--
-- Constraints for table `tien_ich`
--
ALTER TABLE `tien_ich`
  ADD CONSTRAINT `FKbdw9vn5us9ifrkp82rbasdctt` FOREIGN KEY (`ma_loai_tien_ichf`) REFERENCES `loai_tien_ich` (`ma_loai_tien_ich`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
