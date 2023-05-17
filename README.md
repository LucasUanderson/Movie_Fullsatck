#  Premium 
###### by _[Lucas Uanderson](https://www.linkedin.com/in/lucasuanderson/)_

## 📃 Sobre - About
<details>
  <summary > :brazil: Portuguese </summary>
  <p>
     Application fullstack de review de filmes de arquitetura fracamente acoplada, essas duas partes (implementadas usando tecnologias diferentes) podem evoluir em paralelo e independentemente uma da outra. 
  </p>
</details>

<details>
  <summary > us: English </summary>
  <p>
    Weakly coupled architecture film review application, these two parts (implemented using different technologies) can evolve in parallel and independently of each other.
  </p>
</details>

## 🛠️ Ferramentas - Tools

### - Front End:
  - React
  - React Router Dom
  - Context Api
  - React Hooks
  
### - Back End:
  - Java
  - MongoDb


## ⚙️ Como executar - How to run

<details>
  <summary>:brazil: Portuguese </summary>
.
  <p> Acessar a aplicação localmente, instalando as dependências, tanto no (movie_client - frontend) quanto no (movie - backend)</p>
  
Será necessário que a porta 8080 e 3000 estejam disponíveis para a aplicação e MongoDb usará a porta 27017.
  
   - Clone o repositório em: 
```
git@github.com:LucasUanderson/Movie_Fullsatck.git
```
  - Execute o frontend no terminal:
  
  `- Front End: npm start`
  
  - A aplicação irá ficar disponivel nas seguintes rotas:
  
  `- Front End: http://localhost:3000`

  `- Back End: http://localhost:3001`
  </details>

<details>
  <summary>:us: English </summary>
  .
<p>Access the application locally, installing the dependencies, both in (movie_client - frontend) and in (movie - backend)</p>
  
 It will be necessary that port 8080 and 3000 are available for the application and MongoDb will use port 27017.
  
   - Clone the repository at: 
```
git@github.com:LucasUanderson/Movie_Fullsatck.git
```
  - Run frontend in terminal:
  
  `- Front End: npm start`
  
  - The application will be available on the following routes:
  
  `- Front End: http://localhost:3000`

  `- Back End: http://localhost:3001`
   </details>
   
   
  

  ##  - Rotas do Usuário - User Routes 🗺️
  <details>
  <summary>:brazil: Portuguese </summary>
  
  ###  Reviews
  
| Método | Funcionalidade                       | URL                                  |
| ------ | ------------------------------------ | ------------------------------------ |
| `POST` | Realiza o post dos reviews no banco  | http://localhost:8080/api/v1/reviews |

 Nessa requisição `POST` é necessário informar o seguinte JSON:
  
 ```
{
  "body": "Corpo_da_mensagem"
}
```
  
  ### Movie

| Método | Funcionalidade             | URL                                 |
| ------ | -------------------------- | ----------------------------------- |
| `GET` | Recupera filmes do banco | http://localhost:8080/api/v1/movies |

Nessa requisição `GET` é necessário informar o seguinte JSON:

```
{
  "_id": "  ",
  "imdbId": " "
  "title": " ",
  "releaseDate": " "
  "trailerLink": " ",
  "poster": " "
  "genres": " ",
  "backdrops": " "
  "reviewIds": " "
}
```
</details>

<details>
  <summary>:us: English </summary>
  
   ###  Reviews
  
| Method | Functionality                        | URL                                  |
| ------ | ------------------------------------ | ------------------------------------ |
| `POST` | Post the reviews in the bank         | http://localhost:8080/api/v1/reviews |

In this `POST` request, it is necessary to inform the following JSON:
  
  
  ```
{
  "body": " "
}
```
  
  ### Movie

| Method | Functionality                 | URL                                 |
| ------ | ----------------------------- | ----------------------------------- |
| `GET`  | Retrieve movies from the bank | http://localhost:8080/api/v1/movies |

In this `GET` request, it is necessary to inform the following JSON:

```
{
  "_id": "  ",
  "imdbId": " "
  "title": " ",
  "releaseDate": " "
  "trailerLink": " ",
  "poster": " "
  "genres": " ",
  "backdrops": " "
  "reviewIds": " "
}
```
  
  </details>
  
  # Front-End
  
  <details>
  <summary>:brazil: Portuguese </summary>
  Para ter acesso ao front end da aplicação, basta apenas acessar o endereço 
  `http://localhost:3000/`
  
  ##  - home
  <div align="center">
  <img src="./images/home-page.png" alt="Premium-home"/>
  </div>
 
  
  ##  - reviews
  <div align="center">
  <img src="./images/home-page.png" alt="Premium-home"/>
  </div>
  
  ##  - player
  <div align="center">
  <img src="./images/home-page.png" alt="Premium-home"/>
  </div>
  
  </details>

 <p align="center">
<img width=150 src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>
</p>
