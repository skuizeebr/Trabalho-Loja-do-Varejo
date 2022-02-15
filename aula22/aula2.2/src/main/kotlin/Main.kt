fun main(){
    val vendedor = Vendedor()
    vendedor.nome = "Sérgio Ramos"
    vendedor.cpf = "567.789.245-12"
    vendedor.idade = 26
    vendedor.numeroDeTelefone = 51985160736
    vendedor.salario = 1500
    vendedor.dataDeNascimento = 24/10/2002

    val cliente = Cliente()
    cliente.nomeCompleto = "Lucas Silva"
    cliente.cpf = "674.329.953-91"
    cliente.idade = 55
    cliente.numeroDeTelefone = 51986040518
    cliente.dataDeNascimento = "09/10/1967"

    val fornecedores = Fornecedores()
    fornecedores.nomeDaTransportadora = "Asun Sumpermecados LTDA"
    fornecedores.motorista = "Paulo Ricardo"
    fornecedores.fabrica = "SuperPan"

    val ProdutoseServicos = ProdutoseServicos()
    ProdutoseServicos.produtos = "Alimentos, Perfumaria e Bazar"
    ProdutoseServicos.servicosOnline = "Compre Online pelo nosso site"
    ProdutoseServicos.site = "www.asun.com.br"

    val vendas = Vendas()
    vendas.vendasAoMes = "R$ 5.600,00"

    val estoque = Estoque()
    estoque.deposito = "Alimenticios e Bovinos em Geral"
    estoque.quantidadeDeProdutos = 127
    estoque.produtosChegando = "Março e Abril"

    val transportadora = Transportadora()
    transportadora.transportadora = "Asun Supermercados LTDA"

    val filial = Filial()
    filial.nomeDaFilial = "Leve Mais"
    filial.filialLocalizda = "Torres - RS"


    println(vendedor)
    println(cliente)
    println(fornecedores)
    println(ProdutoseServicos)
    println(vendas)
    println(estoque)
    println(transportadora)
    println(filial)


    println("Nome do Vendedor da Loja, é ${vendedor.nome} sua idade é ${vendedor.idade} seu cpf é ${vendedor.cpf} seu número de telefone é ${vendedor.numeroDeTelefone} e nasceu em ${vendedor.numeroDeTelefone}")
    println("Seu Cliente, é ${cliente.nomeCompleto} sua data de nascimento é${cliente.dataDeNascimento}seu cpf é ${cliente.cpf} idade é ${cliente.idade} e seu número de telefone é ${cliente.numeroDeTelefone}")
    println("Nome dos Forncedores, é ${fornecedores.nomeDaTransportadora} o motorista é o seu ${fornecedores.motorista} a Fábrica tem o nome de  ${fornecedores.fabrica}")
    println("Nome dos Produtos da Loja, é ${ProdutoseServicos.produtos} seus serviços online são ${ProdutoseServicos.servicosOnline} seu site é ${ProdutoseServicos.site}")
    println("As suas vendas ao mês são de aproximadamente ${vendas.vendasAoMes}")
    println("A variedade do seu depósito, é de ${estoque.deposito} a sua quantidade de produtos dos Alimentícios e o Bovino, é ${estoque.quantidadeDeProdutos} e seus produtos chegam em ${estoque.produtosChegando}")
    println("Sua Filial é a ${filial.nomeDaFilial},e ela fica em ${filial.filialLocalizda}")







}