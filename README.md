# CODE LAB
## Desafio de código desenvolvido no Bootcamp da DIO Santander Coders 2024 - Backend em Java

O desafio consiste em utilizar algum Padrão de Projeto e criar uma implementação desse padrão
Foi escolhido o Strategy aplicado a um processo de pagamento com ou sem desconto.
O processo de pagamento é o contexto que tem conhecimento das estratégias de desconto e os métodos de pagamentos disponíveis.

### Estratégias de Desconto
`DiscountStrategy` -> Interface
`TenPercentDiscountStrategy` -> Class
`NoDiscount` -> Class

### Métodos de pagamento
`Payment` -> Interface
`CreditCardPayment()` -> Class
`BitCoinPayment()` -> Class

### Processor
`ProcessorContext`
