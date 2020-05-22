# # Semillero. Git: Prueba LandSoft
## Este contenido pertenece a la prueba final del semillero.
## Problema
### supongamos que se tienen dos enpoints de consulta de información por el método GET: 
*  https://jsonplaceholder.typicode.com/comments
*  https://jsonplaceholder.typicode.com/posts
### Se requiere tener una auditoría o logs de las peticiones que se realicen a esos dos servicios, por esto se solicita crear una API que expondrá dos
endponts que llamaran los endponints citados anteriormente y retornará la misma información, adicionalmente registrará en una tabla de
histórico todos los llamados que se realicen.
#### Tabla: apicallhistory
* id: Primary
* type(post o comments): Si el llamado es de Posts o comments
* callDate: Fecha/hora de la llamada
