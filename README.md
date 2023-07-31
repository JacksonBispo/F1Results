# F1Results

Esta Api exibe os resultados das corridas de formula 1 no decorrer do ano escolhdo 

Usando o rest tamplate do spring consumimos a api https://ergast.com/api/f1/2023/last/results.json que retorna um objeto contendo todas as informaçōes referente aos resultados do ano escolhido

## Endpoint

A API pode ser acessada pelo endpoint: localhost:8080/api/v1/result/{ano}.

Por exemplo: localhost:8080/api/v1/result/2022.

## Exemplo de resposta:

<img width="992" alt="Captura de Tela 2023-07-31 às 16 12 49" src="https://github.com/JacksonBispo/F1Results/assets/9170784/6aab2e7b-1371-453f-b95f-c12db4123465">

## Paramêtros

O único parametro que pode ser passado é o ano que neste caso filtra os resultados do ano correspondente

## Recursos e tecnologias utilizadas

- Spring Boot: Framework para criação de aplicações Java rápidas e fáceis.
  
- Spring Web (DevTools): Facilita o desenvolvimento e recarregamento automático durante o desenvolvimento.
  
- Lombok: Biblioteca que automatiza a geração de código repetitivo, tornando o código mais conciso e legível.
