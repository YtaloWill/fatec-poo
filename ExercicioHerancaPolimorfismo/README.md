# Exercicio de Herança e Polimorfismo

Crie um projeto em Java para uma instituição financeira. Está instituição possui diversos tipos de contas, tais como corrente, aplicação e poupança. Todas as contas devem possuir número, saldo e correntista, sendo o correntista composto por nome e cpf.

As contas do tipo corrente se subdividem em normal e especial, sendo a especial possuidora de um limite de crédito.

Todas as contas possuem os métodos de depositar e retirar, devendo ser prestado atenção nas contas que possuem ou não limite de crédito.

Alguns tipos de contas podem sofrer um rendimento em seu saldo, são elas aplicação e poupança.

Crie também uma classe que represente um cartão de crédito, o mesmo deve possuir numero do cartão, limite de compras, dia para melhor compra. Somente as contas do tipo especial podem ou não possuir um cartão de crédito.

Toda conta desse banco DEVE possuir um correntista.

Crie também uma classe de controleContas, que deverá possuir um método registro que recebera qualquer tipo de conta e deverá acumula o saldo inicial dessa conta.

Ao final crie uma classe principal e nela crie uma conta corrente normal, uma especial e uma conta poupança. Atribua todos os dados a elas e chame todos os métodos possíveis.

Coloque um cartão de crédito para sua conta especial.
