# Atividade: Padrão Singleton
**Disciplina:** Linguagens e Técnicas de Programação III  
**Professor:** Dr. Emerson Carvalho 

## 1. Problema que o padrão resolve
O padrão Singleton garante que uma classe tenha **apenas uma instância** durante a execução do sistema e fornece um ponto global de acesso a essa instância.  
Cenários típicos: gerenciadores de configuração (config central), logger de aplicação, fábrica de conexões centralizada (em ambientes controlados), cache global.

## 2. Solução proposta pelo Singleton
- **Restringe a criação de instâncias** tornando o construtor privado.  
- **Mantém uma referência estática** para a instância única.  
- **Fornece um método público de acesso** (ex.: `getInstance()`).  

## 3. Diagrama (UML)
`Diagrama_Singleton.drawio.png`

## 4. Implementação de exemplo (Java)
Contexto: `ConfigManager` — gerenciador de configurações da aplicação (simples, em memória).  
Arquivos:
- `ConfigManager.java` — implementação Singleton.
- `Main.java` — demonstra uso: grava e lê chaves de configuração e mostra que as referências são a mesma instância.

## Referências
- [Refactoring.Guru](https://refactoring.guru/design-patterns/singleton)
- [DoFactory](https://www.dofactory.com/net/singleton-design-pattern)
- [Softplan](https://www.softplan.com.br/tech-writers/singleton-guia-completo-para-entender-essa-polemica-de-uma-vez-por-todas)
