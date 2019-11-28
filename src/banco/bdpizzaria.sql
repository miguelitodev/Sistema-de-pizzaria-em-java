-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 28-Nov-2019 às 18:50
-- Versão do servidor: 10.1.26-MariaDB
-- PHP Version: 7.0.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdpizzaria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcadastro`
--

CREATE TABLE `tbcadastro` (
  `idCadastro` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `telefone` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `sabor` varchar(255) NOT NULL,
  `borda` varchar(255) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `preco` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbcadastro`
--

INSERT INTO `tbcadastro` (`idCadastro`, `nome`, `telefone`, `endereco`, `sabor`, `borda`, `quantidade`, `descricao`, `preco`) VALUES
(4, 'Tabata Fernanda', '999891519', 'R. Feliciano de Mendonça', 'Frango c/ catupiry', 'Borda recheada', 1, 'mais uma de calabresa ae serjo', 31.5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbcadastro`
--
ALTER TABLE `tbcadastro`
  ADD PRIMARY KEY (`idCadastro`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbcadastro`
--
ALTER TABLE `tbcadastro`
  MODIFY `idCadastro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
