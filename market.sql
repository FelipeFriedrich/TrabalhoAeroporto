-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 02-Dez-2019 às 04:58
-- Versão do servidor: 10.4.6-MariaDB
-- versão do PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `market`
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
(1, '1', 1);

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
(2, 1, 1, 2, '7', '2019-12-18 09:00:00', 'No Horário', '2019-12-18 00:00:00');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aeroporto`
--
ALTER TABLE `aeroporto`
  ADD PRIMARY KEY (`Codigo_Aeroporto`),
  ADD UNIQUE KEY `CNPJ` (`CNPJ`);

--
-- Índices para tabela `companhia_aerea`
--
ALTER TABLE `companhia_aerea`
  ADD PRIMARY KEY (`Codigo_Companhia`),
  ADD UNIQUE KEY `CNPJ` (`CNPJ`);

--
-- Índices para tabela `passagem`
--
ALTER TABLE `passagem`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `passagem` (`passagem`),
  ADD KEY `codigo_voo` (`codigo_voo`);

--
-- Índices para tabela `voo`
--
ALTER TABLE `voo`
  ADD PRIMARY KEY (`cod_voo`),
  ADD KEY `Cod_Companhia_Aerea` (`Cod_Companhia_Aerea`),
  ADD KEY `Aero_Partida` (`Aero_Partida`),
  ADD KEY `Aero_Chegada` (`Aero_Chegada`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `aeroporto`
--
ALTER TABLE `aeroporto`
  MODIFY `Codigo_Aeroporto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `companhia_aerea`
--
ALTER TABLE `companhia_aerea`
  MODIFY `Codigo_Companhia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restrições para despejos de tabelas
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
