-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 11-Dez-2019 às 23:00
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aeroporto`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aeroporto`
--

CREATE TABLE `aeroporto` (
  `Codigo_Aeroporto` int(11) NOT NULL,
  `Nome_Fantasia` varchar(100) NOT NULL,
  `Razao_Social` int(11) NOT NULL,
  `mapa` varchar(100) NOT NULL,
  `CNPJ` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `aeroporto`
--

INSERT INTO `aeroporto` (`Codigo_Aeroporto`, `Nome_Fantasia`, `Razao_Social`, `mapa`, `CNPJ`) VALUES
(1, 'Salgado Filho', 0, 'Teste', 2147483647),
(2, 'Congonhas', 0, 's', 1236542151);

-- --------------------------------------------------------

--
-- Estrutura da tabela `companhia_aerea`
--

CREATE TABLE `companhia_aerea` (
  `Codigo_Companhia` int(11) NOT NULL,
  `Nome_Fantasia` varchar(100) NOT NULL,
  `Razao_Social` varchar(100) NOT NULL,
  `CNPJ` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `companhia_aerea`
--

INSERT INTO `companhia_aerea` (`Codigo_Companhia`, `Nome_Fantasia`, `Razao_Social`, `CNPJ`) VALUES
(1, 'Gol', 'GOL Linhas Aereas', 123124123214),
(2, 'Azul', 'companhia aerea Azul', 31231231);

-- --------------------------------------------------------

--
-- Estrutura da tabela `passagem`
--

CREATE TABLE `passagem` (
  `id` int(11) NOT NULL,
  `passagem` varchar(50) DEFAULT NULL,
  `codigo_voo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `passagem`
--

INSERT INTO `passagem` (`id`, `passagem`, `codigo_voo`) VALUES
(1, '1', 1),
(2, '17', 3),
(3, '15', 6),
(4, '13', 4),
(5, '12', 5),
(6, '11', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `voo`
--

CREATE TABLE `voo` (
  `cod_voo` int(11) NOT NULL,
  `Cod_Companhia_Aerea` int(11) DEFAULT NULL,
  `Aero_Partida` int(11) DEFAULT NULL,
  `Aero_Chegada` int(11) DEFAULT NULL,
  `portao` varchar(50) DEFAULT NULL,
  `previsao` datetime DEFAULT NULL,
  `situacao` varchar(20) DEFAULT NULL,
  `datahora` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `voo`
--

INSERT INTO `voo` (`cod_voo`, `Cod_Companhia_Aerea`, `Aero_Partida`, `Aero_Chegada`, `portao`, `previsao`, `situacao`, `datahora`) VALUES
(1, 1, 1, 2, '7', '2019-12-17 11:00:00', 'No Horário', '2019-12-17 11:00:00'),
(2, 1, 1, 2, '7', '2019-12-18 09:00:00', 'No Horário', '2019-12-18 00:00:00'),
(3, 2, 2, 1, '10', '2019-12-17 17:00:00', 'Em solo', '2019-12-17 11:00:00'),
(4, 2, 1, 2, '9', '2019-12-18 19:00:00', 'Atrasado', '2019-12-18 00:00:00'),
(5, 2, 1, 1, '10', '2019-12-17 17:00:00', 'Em solo', '2019-12-17 18:00:00'),
(6, 2, 1, 2, '9', '2019-12-18 19:00:00', 'Atrasado', '2019-12-18 15:00:00'),
(7, 2, 1, 1, '10', '2019-12-17 17:00:00', 'Em solo', '2019-12-17 18:00:00'),
(8, 2, 1, 2, '9', '2019-12-18 19:00:00', 'Atrasado', '2019-12-18 15:00:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aeroporto`
--
ALTER TABLE `aeroporto`
  ADD PRIMARY KEY (`Codigo_Aeroporto`),
  ADD UNIQUE KEY `CNPJ` (`CNPJ`);

--
-- Indexes for table `companhia_aerea`
--
ALTER TABLE `companhia_aerea`
  ADD PRIMARY KEY (`Codigo_Companhia`),
  ADD UNIQUE KEY `CNPJ` (`CNPJ`);

--
-- Indexes for table `passagem`
--
ALTER TABLE `passagem`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `passagem` (`passagem`),
  ADD KEY `codigo_voo` (`codigo_voo`);

--
-- Indexes for table `voo`
--
ALTER TABLE `voo`
  ADD PRIMARY KEY (`cod_voo`),
  ADD KEY `Cod_Companhia_Aerea` (`Cod_Companhia_Aerea`),
  ADD KEY `Aero_Partida` (`Aero_Partida`),
  ADD KEY `Aero_Chegada` (`Aero_Chegada`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aeroporto`
--
ALTER TABLE `aeroporto`
  MODIFY `Codigo_Aeroporto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `companhia_aerea`
--
ALTER TABLE `companhia_aerea`
  MODIFY `Codigo_Companhia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `passagem`
--
ALTER TABLE `passagem`
  ADD CONSTRAINT `passagem_ibfk_1` FOREIGN KEY (`codigo_voo`) REFERENCES `voo` (`cod_voo`);

--
-- Limitadores para a tabela `voo`
--
ALTER TABLE `voo`
  ADD CONSTRAINT `voo_ibfk_1` FOREIGN KEY (`Cod_Companhia_Aerea`) REFERENCES `companhia_aerea` (`Codigo_Companhia`),
  ADD CONSTRAINT `voo_ibfk_2` FOREIGN KEY (`Aero_Partida`) REFERENCES `aeroporto` (`Codigo_Aeroporto`),
  ADD CONSTRAINT `voo_ibfk_3` FOREIGN KEY (`Aero_Chegada`) REFERENCES `aeroporto` (`Codigo_Aeroporto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
