TI QUALIDADE 

Responda as questões a seguir:  

1) O cliente adquiriu um novo modelo de máquina de cartão de crédito e ela aceita as
 
bandeiras Visa, Master, Elo, Amex e Hiper e executa duas operações para cada

bandeira débito e crédito. Quantos testes serão necessários para validação dessa

máquina e qual técnica a ser utilizada? 

Resposta:

   Para validar a nova máquina de cartão de crédito, precisamos considerar todas as combinações
   
possíveis de bandeiras de cartão e tipos de operação (débito e crédito).

Vamos calcular o número total de testes necessários:

Passo 1: Identificar as combinações

A máquina aceita 5 bandeiras de cartão:

Visa

Master

Elo

Amex

Hiper

=> Cada bandeira pode realizar 2 tipos de operações:

Débito                            Crédito

Passo 2: Calcular o número total de testes

=> Para cada bandeira, precisamos testar as duas operações (débito e crédito). Portanto, o número

total de testes é o produto do número de bandeiras pelo número de operações por bandeira.


Número de bandeiras = 5

Número de operações por bandeira = 2

Total de testes = (Número de bandeiras) * (Número de operações por bandeira)

Total de testes = 5 * 2 = 10

=> Portanto, serão necessários 10 testes para validar a máquina de cartão de crédito.

Técnica a ser utilizada

=> A técnica a ser utilizada para garantir que todas as combinações de bandeira e operação sejam testadas 

é o Teste de Combinatório. Essa técnica garante que todas as possíveis combinações de entradas sejam 

testadas para verificar o funcionamento correto do sistema. Nesse caso, cada combinação de bandeira e

tipo de operação precisa ser validada.

Conclusão: 

Número de testes necessários: 10

Técnica a ser utilizada: Teste de Combinatório

Essa abordagem garante que a máquina de cartão de crédito será testada de forma completa, cobrindo todas 

as combinações de bandeira e operação.


2)  A bandeira Visa disponibilizou um novo range de bin´s no mercado que possui seis
 
dígitos 232425 a 232460. Quais os testes deverão ser feitos desse range de bins para

confirmar que está funcionando? 

a) 230000,232425,232460 

b) 0,232425,232460,240000 

c) 232425,232460  

d) 232424,232425,232459,232460,232461 

Respostas:

=> A alternativa d) 232424, 232425, 232459, 232460, 232461 é a mais completa e correta para confirmar que o novo

range de BINs está funcionando, pois cobre os valores nos limites do range e também os valores imediatamente

fora desses limites.

Portanto, os testes a serem feitos são os valores:

232424 (imediatamente fora do range abaixo do mínimo)

232425 (mínimo do range)

232459 (intermediário dentro do range)

232460 (máximo do range)

232461 (imediatamente fora do range acima do máximo)

=> Para confirmar que o novo range de BINs da bandeira Visa está funcionando corretamente, é importante testar

valores nos limites e ao redor dos limites do range especificado. O range especificado é de 232425 a 232460.

Os testes devem incluir:

= Valor mínimo do range: 232425

= Valor máximo do range: 232460

= Valor imediatamente fora do range abaixo do mínimo: 232424

= Valor imediatamente fora do range acima do máximo: 232461


3) Cite uma abordagem desenvolvimento ágil e explique-a, responda em suas palavras.
   
Resposta:

=> Uma das abordagens ágeis mais conhecidas é o Scrum. O Scrum é um framework para gerenciar projetos complexos, focado em 

entregar o máximo de valor de negócio de forma incremental e iterativa.

O Scrum divide o projeto em ciclos curtos chamados Sprints, geralmente de 2 a 4 semanas. No início de cada Sprint, a 

quipe seleciona um conjunto prioritário de funcionalidades a serem desenvolvidas, chamado de Product Backlog.

Durante o Sprint, a equipe trabalha de forma colaborativa e autogerenciada para transformar esses requisitos em 

funcionalidades prontas para uso. Eles se reúnem diariamente em uma reunião rápida chamada Daily Scrum para alinhar o 

trabalho, identificar bloqueios e fazer ajustes. No final do Sprint, a equipe demonstra as funcionalidades concluídas 

para as partes interessadas em uma reunião chamada Sprint Review. Eles também realizam uma retrospectiva para 

identificar melhorias no processo.

O Scrum enfatiza a entrega frequente de software funcional, a colaboração próxima entre a equipe e os stakeholders, e a 

adaptação contínua às mudanças. Ele usa papéis bem definidos (Product Owner, Scrum Master, Equipe de Desenvolvimento), 

eventos (Sprint, Daily Scrum, Sprint Review, Sprint Retrospective) e artefatos (Product Backlog, Sprint Backlog, 

Incremento).

O Kanban é outra metodologia ágil que se concentra na visualização do trabalho, limitação do trabalho em progresso e no 

fluxo contínuo de trabalho. Ele é amplamente utilizado para gerenciar e otimizar processos, permitindo uma abordagem 

mais eficiente e eficaz para o desenvolvimento de produtos e serviços. o Kanban ágil combina a estrutura visual e 

flexível do Kanban com os princípios ágeis, proporcionando uma maneira eficaz de gerenciar o trabalho, promover a 

colaboração e alcançar resultados de alta qualidade de forma iterativa e incremental.


4) O que é CI/CD?
   
Resposta:

=> CI/CD é uma prática recomendada de metodologias ágeis que combina integração contínua (CI) e entrega ou implantação contínua (CD)

para acelerar e otimizar o ciclo de desenvolvimento de software. Juntas, essas práticas formam um "pipeline de CI/CD" que permite às

equipes de desenvolvimento e operações trabalharem juntas seguindo princípios ágeis e DevOps.

As principais diferenças entre CI e CD são:

CI se concentra na integração de código e identificação precoce de problemas

CD se concentra na automação da entrega de software de forma eficiente e confiável


5) O que é TDD, BDD e ATDD e quando são aplicadas?
   
Resposta:

TDD (Test-Driven Development): É uma prática em que os testes são escritos antes do código de produção. O desenvolvedor escreve um teste

que define uma nova funcionalidade ou melhoria, em seguida, escreve o código mínimo necessário para passar no teste. O TDD é aplicado para

garantir que o código funcione corretamente e para orientar o design do software.


BDD (Behavior-Driven Development): É uma metodologia na qual o aplicativo é documentado e projetado em torno do comportamento que um usuário 

espera ao interagir com ele. No BDD, os cenários de comportamento são escritos em linguagem natural, facilitando a comunicação entre os membros 

da equipe e stakeholders. O BDD se concentra em descrever e testar o comportamento esperado do software.


ATDD (Acceptance Test-Driven Development): É uma prática que visa garantir que o software atenda aos critérios de aceitação acordados. Os requisitos 

para a aplicação são expressos em um formato compreensível por todos e transformados em testes de aceitação automatizados. O ATDD promove a colaboração 

e a qualidade do software, garantindo que atenda às necessidades dos usuários

 
6) Cite uma heurística de testes utilizada para testes de front e de back e explique-as.
    
Resposta:

=> Heurística para Testes de Front-End: "Heurística do Preenchimento de Formulários"

A heurística do preenchimento de formulários é uma técnica prática e eficaz para identificar problemas comuns e melhorar a usabilidade e funcionalidade

dos formulários na interface do usuário. 

Front-End: Heurística de Feedback Imediato:

Objetivo: Fornecer feedback instantâneo e claro ao usuário.

Benefícios: Melhora a usabilidade e a eficiência do usuário. 


=>Heurística para Testes de Back-End: "Heurística de Integridade de Dados"

Explicação: Esta heurística se foca em assegurar que os dados no sistema permaneçam corretos, completos e consistentes após operações de back-end, 

como transações de banco de dados e atualizações de dados.

Back-End: Heurística de Integridade de Dados:

Objetivo: Manter a consistência e a precisão dos dados após operações de backend.

Benefícios: Garante a confiabilidade e a integridade do sistema.

Estas heurísticas ajudam a garantir que tanto a interface do usuário quanto os sistemas de backend funcionem corretamente, oferecendo uma experiência 

de usuário de alta qualidade e mantendo a integridade do sistema.


7) Cite ferramentas de testes automatizados para Desktop, Web, API´s e mobile
    
Resposta: 

=> Essas ferramentas oferecem suporte para testes automatizados em diferentes plataformas, permitindo testes eficazes e eficientes em Desktop, Web, APIs

e aplicações mobile:

Desktop e Web:

Ranorex Studio: Ferramenta completa e fácil de usar para testes de ponta a ponta em desktop e web.

TestComplete: Plataforma comercial para automatizar testes de desktop, celular e aplicações web.

Telerik Test Studio: Ferramenta abrangente para teste funcional de UI, teste de performance, teste exploratório, teste mobile, entre outros.


APIs:

Katalon Platform: Plataforma de automação de testes com tecnologia de IA para testes de API automatizados.

Postman: Ferramenta para testes de API com suporte para Windows, Linux e MacOS.

vREST: Oferece solução online para testes automatizados, simulação e gravação automatizada de APIs.


Mobile:

Appium: Ferramenta de automação open source crucial para aplicações móveis nativas, híbridas e web mobile.

Robotium: Framework gratuito popular em automação de testes para Android, compatível com aplicações nativas e híbridas.



---------------------------------------------------------------------------------------------------------------------------
Prática de API 

Desenvolva o script da automação seguindo as informações a seguir:  

Documentação = https://reqres.in/  

URI = https://reqres.in/api/ 

1) Validar o script de "CREATE" método "POST” cobertura de testes em Rest-Assured da API
   
3) Validar cobertura de Status Code, Campos obrigatórios e Contrato
   
5) Desenvolver com POJOs.
   
