# Sistema Casa de Leilões

## Nome do Projeto
Sistema de Gerenciamento para Casa de Leilões

## Descrição
Sistema desenvolvido para automatizar as operações de uma casa de leilões, permitindo o cadastro de produtos, gestão de lances e controle de leilões. O sistema facilita a administração de todo o ciclo de vida dos leilões, desde o cadastro dos itens até a finalização com o arrematante vencedor.

## Funcionalidades Principais
- Cadastro de produtos para leilão
- Gestão de usuários e lances
- Controle de prazos de leilões
- Relatórios de arrematantes
- Histórico de lances

## Tecnologias Utilizadas
- **Java** - Linguagem de programação principal
- **MySQL** - Banco de dados relacional
- **Swing** - Interface gráfica do usuário
- **JDBC** - Conexão com banco de dados

## Pré-requisitos
- Java JDK 8 ou superior
- MySQL Server 5.7 ou superior
- Maven para gerenciamento de dependências

## Como Executar
1. Importe o banco de dados do arquivo `database/schema.sql`
2. Configure as credenciais do banco em `src/main/resources/config.properties`
3. Execute: `mvn clean compile exec:java`