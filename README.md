# SINOPSAPP

## Descrição do Projeto

SINOPSAPP é um aplicativo de exibição de informações de filmes desenvolvido usando Jetpack Compose para a interface de usuário. O aplicativo exibe detalhes de filmes, incluindo título, diretor, roteirista, sinopse, e uma lista de atores. Cada ator é apresentado com uma imagem e um nome.

## Estrutura do Projeto

### MainActivity

A `MainActivity` é a entrada principal do aplicativo. Ela define o tema e configura a interface de usuário para exibir o conteúdo principal do aplicativo.

### Composables

#### Detalhes

Esta função compõe a interface principal da tela de detalhes do filme. Ela chama `AppHeader` e `MovieDetails` para construir a interface.

#### AppHeader

Exibe o cabeçalho do aplicativo com o nome "SINOPSAPP" centralizado e estilizado.

#### MovieDetails

Exibe os detalhes do filme, incluindo:

- Imagem do filme
- Título
- Diretor
- Roteirista
- Sinopse
- Lista de atores
