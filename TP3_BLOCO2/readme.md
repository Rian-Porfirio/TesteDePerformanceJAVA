# APIs Web RESTful: 
Recursos: Em uma API RESTful, os recursos são entidades que podem ser 
acessadas e manipuladas através da API. Esses recursos são representados por 
URIs (Uniform Resource Identifiers). 
URIs: As URIs são os identificadores dos recursos na API. Elas seguem um padrão 
hierárquico e representam os recursos disponíveis. Por exemplo, /api/produto pode 
ser uma URI que representa a coleção de produtos na API, enquanto 
/api/produto/{id} pode representar um produto específico. 

# Métodos HTTP: 
Os métodos HTTP são utilizados para realizar operações nos 
recursos. Os principais métodos utilizados em uma API RESTful são: 
GET: utilizado para recuperar informações de um recurso. 
POST: utilizado para criar um novo recurso. 
PUT: utilizado para atualizar um recurso existente. 
DELETE: utilizado para excluir um recurso. 
Representações de Recursos: As representações de recursos são os dados que 
são enviados e recebidos pela API. Geralmente, essas representações são em 
formato JSON ou XML, mas podem ser em qualquer formato. 
No projeto desenvolvido, esses conceitos foram aplicados da seguinte forma: 
Recursos: Os recursos foram modelados como Entregador, Funcionário, Endereço, 
Estado, Município e Distrito. 
URIs: Foram utilizadas URIs como /api/restaurante/entregador, 
/api/restaurante/funcionario, /api/localidade/endereco/{cep}, entre outras, para 
representar os recursos disponíveis. 
Métodos HTTP: Foram utilizados os métodos HTTP GET, POST e DELETE nos 
endpoints da API para realizar as operações CRUD (Create, Read, Update, Delete) 
nos recursos. 
Representações de Recursos: Os dados dos recursos foram enviados e recebidos 
em formato JSON. 
A API desenvolvida segue os princípios RESTful ao utilizar URIs para representar 
recursos, métodos HTTP para operações nos recursos e representações de 
recursos em formato JSON. 

# Protocolos HTTP e HTTPS: 
HTTP (Hypertext Transfer Protocol): É um protocolo de comunicação utilizado para 
transferir informações na World Wide Web. Ele funciona em um modelo cliente
servidor, onde um cliente envia uma requisição e o servidor responde com uma 
resposta. As principais características do HTTP incluem ser stateless (sem estado), 
texto legível por humanos e suportar diferentes tipos de métodos (GET, POST, PUT, 
DELETE, etc.). 
HTTPS (Hypertext Transfer Protocol Secure): É uma versão segura do HTTP que 
utiliza criptografia para garantir a segurança das comunicações. Ele utiliza o 
protocolo SSL/TLS para criptografar os dados transferidos entre o cliente e o 
servidor, garantindo assim a confidencialidade e integridade dos dados. 
No projeto desenvolvido, o protocolo HTTP foi utilizado para realizar as solicitações 
GET, POST e DELETE na API. Por exemplo, o método GET foi utilizado para 
recuperar informações sobre os recursos (como lista de entregadores ou 
funcionários), o método POST foi utilizado para criar novos recursos (incluir 
entregadores ou funcionários), e o método DELETE foi utilizado para excluir 
recursos (excluir entregadores ou funcionários). 
A importância do HTTPS reside na segurança das comunicações. Implementar o 
HTTPS no projeto garantiria que os dados transferidos entre o cliente e o servidor 
estariam protegidos contra ataques de interceptação e adulteração. Isso é 
especialmente importante ao lidar com informações sensíveis, como dados de 
clientes ou de pagamento. Para implementar o HTTPS no projeto, seria necessário 
obter um certificado SSL/TLS válido e configurá-lo no servidor de aplicação para 
permitir a comunicação segura através do protocolo HTTPS.
