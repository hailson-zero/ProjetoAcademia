-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 18-Jun-2019 às 20:36
-- Versão do servidor: 10.3.15-MariaDB
-- versão do PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projetoacademia`
--
CREATE DATABASE IF NOT EXISTS `projetoacademia` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `projetoacademia`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `idaluno` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `rua` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `numero` int(11) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `horario` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `pesoCorporal` float NOT NULL,
  `estatura` float NOT NULL,
  `triceps` float NOT NULL,
  `subescapular` float NOT NULL,
  `abdominal` float NOT NULL,
  `supra` float NOT NULL,
  `punho` float NOT NULL,
  `femur` float NOT NULL,
  `gordura` float NOT NULL,
  `muscular` float NOT NULL,
  `imc` float NOT NULL,
  `pesoMagro` float NOT NULL,
  `pesoMuscular` float NOT NULL,
  `pesoGordo` float NOT NULL,
  `pesoResidual` float NOT NULL,
  `pesoOsseo` float NOT NULL,
  `pesoMinimo` float NOT NULL,
  `pesoMaximo` float NOT NULL,
  `excesso` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamento`
--

CREATE TABLE `equipamento` (
  `idequipamento` int(11) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `peso` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `danificado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `instrutor`
--

CREATE TABLE `instrutor` (
  `idinstrutor` int(11) NOT NULL,
  `salario` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `rua` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `numero` int(11) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `horario` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `treino`
--

CREATE TABLE `treino` (
  `idtreino` int(11) NOT NULL,
  `modalidade` varchar(45) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `duracao` varchar(45) NOT NULL,
  `esforco` varchar(45) NOT NULL,
  `freqCardiaca` float NOT NULL,
  `gastoCalorico` float NOT NULL,
  `idaluno_fk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`idaluno`);

--
-- Índices para tabela `equipamento`
--
ALTER TABLE `equipamento`
  ADD PRIMARY KEY (`idequipamento`);

--
-- Índices para tabela `instrutor`
--
ALTER TABLE `instrutor`
  ADD PRIMARY KEY (`idinstrutor`);

--
-- Índices para tabela `treino`
--
ALTER TABLE `treino`
  ADD PRIMARY KEY (`idtreino`),
  ADD KEY `idaluno_fk` (`idaluno_fk`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `aluno`
--
ALTER TABLE `aluno`
  MODIFY `idaluno` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `equipamento`
--
ALTER TABLE `equipamento`
  MODIFY `idequipamento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `instrutor`
--
ALTER TABLE `instrutor`
  MODIFY `idinstrutor` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `treino`
--
ALTER TABLE `treino`
  MODIFY `idtreino` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `treino`
--
ALTER TABLE `treino`
  ADD CONSTRAINT `idaluno_fk` FOREIGN KEY (`idaluno_fk`) REFERENCES `aluno` (`idaluno`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
