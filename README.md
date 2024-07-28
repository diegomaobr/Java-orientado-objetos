Explicação
Superclasse Audio:

Atributos titulo, autor e duracao são comuns a qualquer tipo de áudio.
Métodos get e set para manipular os atributos.
Método play para tocar o áudio.
Método abstrato info que será implementado nas subclasses para fornecer informações específicas sobre o áudio.
Subclasse Música:

Atributos adicionais album e genero.
Implementação do método info para exibir informações específicas de uma música.
Subclasse Podcast:

Atributos adicionais episodio e descricao.
Implementação do método info para exibir informações específicas de um podcast.
Classe Principal App:

Criação de objetos Musica e Podcast.
Chamada dos métodos play e info para testar a funcionalidade.
Este exemplo demonstra o uso de herança e encapsulamento para criar uma aplicação simples que pode lidar com diferentes tipos de áudios, permitindo a extensão futura para outros tipos de mídia se necessário.
