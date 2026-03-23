# CRUD-em-POO
Neste projeto, foquei em criar um sistema robusto que não quebra por qualquer bobagem. Aqui estão os pontos principais que implementei:

Validação Blindada (Input Handling): O sistema foi projetado para ser "à prova de erros". Se o usuário digitar letras onde o programa espera números, o sistema não crasha. Usei blocos try-catch para capturar exceções e garanto a limpeza do buffer do Scanner para que o menu continue funcionando perfeitamente.

UX - Experiência do Usuário: Implementei o que chamamos de Graceful Shutdown (Desligamento Elegante). O programa não fecha do nada; ele pede uma confirmação de saída, evitando que o usuário encerre o processo por acidente.

Lógica de Navegação Fluida: Utilizei loops while internos para "prender" o usuário em perguntas críticas (como Exclusão e Sair). Isso garante que o usuário só saia daquela tela após fornecer uma resposta válida ou decidir voltar ao menu.

Controle de Índices: A listagem é numerada de forma amigável (começando em 1), mas por baixo dos panos o código faz a conversão matemática correta para os índices do ArrayList (que começam em 0), evitando erros de memória.

Código Limpo e Organizado: Uso estratégico de switch-case para manter a lógica de cada funcionalidade isolada e fácil de dar manutenção.
