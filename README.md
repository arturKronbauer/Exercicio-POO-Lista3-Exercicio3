# Exercicio-POO-Lista3-Exercicio3

Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.
Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as seguintes:

Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.

Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica: (50000 * 25%) - (2000 * 50%) = 11500.00

Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto.

Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica: 400000 * 14% = 56000.00

Exemplo de Interação

Digite o número de contribuintes: 3

Dados do contribuinte #1:

Pessoa física ou jurídica (f/j)? f

Nome: Alex

Renda anual: 50000,00

Despesas com saúde: 2000,00


Dados do contribuinte #2:

Pessoa física ou jurídica (f/j)? j

Nome: SoftTech

Renda anual: 400000,00

Número de empregados: 25


Dados do contribuinte #3:

Pessoa física ou jurídica (f/j)? f

Nome: Bob

Renda anual: 120000,00

Despesas com saúde: 1000,00


IMPOSTOS PAGOS:

Alex: R$ 11500,00

SoftTech: R$ 56000,00

Bob: R$ 29500,00

IMPOSTOS TOTAIS: R$ 97000,00
