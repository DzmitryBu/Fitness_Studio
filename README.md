# fitness_studio
Приложение предназначено для организации работы по учету и хранению информации о пользователях, обеспечения безопасного доступа в приложение, 
а также составления рациона питания тренером для клиентов. Пользователи (клиенты) могут просматривать информацию общего рода, а также получать информацию о себе. 
Администраторы, в свою очередь, способны редактировать информацию о пользователях, а также добавлять и обновлять информацию о продуктах и рецептах.<br>
## Приложение выполняет следующие функции:

## 1. Пользователи - Информация о пользователях системы
-  Добавление нового пользователя:
```sh
Метод запроса: POST
URL запроса: http://localhost:8080/api/v1/users
role: ADMIN
```
-  Получить страницу пользователей:
```sh
Метод запроса: GET
URL запроса: http://localhost:8080/api/v1/users
role: ADMIN
```
-  Получить информацию о пользователе:
```sh
Метод запроса: GET
URL запроса: http://localhost:8080/api/v1/users/{uuid}
role: ADMIN
```
- Редактировать информацию о пользователе:
```sh
Метод запроса: PUT
URL запроса: http://localhost:8080/api/v1/users/{uuid}/dt_update/{dt_update}
role: ADMIN
```
## 2. Личный кабинет - Доступ к личному кабинету
- Самостоятельная регистрация пользователя:
```sh
Метод запроса: POST
URL запроса: http://localhost:8080/api/v1/users/registration
role: ALL
В результате регистрации пользователю на указанную почту высылается ссылка с проверочным кодом для последующей верификации.
```
- Верификация самостоятельного зарегистрированного пользователя:
```sh
Метод запроса: GET
URL запроса: http://localhost:8080/api/v1/users/verification
role: ALL
```
- Вход:
```sh
Метод запроса: POST
URL запроса: http://localhost:8080/api/v1/users/login
role: ALL
По результату верного логирования пользвателя, пользователю предоставляется токе для обеспечения последующего входа.
```
- Получить информацию о себе:
```sh
Метод запроса: GET
URL запроса: http://localhost:8080/api/v1/users/me
```
## 3. Рацион - Информация для составления рациона клиента
- Добавление нового продукта:
```sh
Метод запроса: POST
URL запроса: http://localhost:8080/api/v1/product
role: ADMIN
```
- Получить страницу продуктов:
```sh
Метод запроса: GET
URL запроса: http://localhost:8080/api/v1/product
role: ALL
```
- Редактировать информацию о продукте:
```sh
Метод запроса: PUT
URL запроса: http://localhost:8080/api/v1/product/{uuid}/dt_update/{dt_update}
role: ADMIN
```
- Добавление нового рецепта:
```sh
Метод запроса: POST
URL запроса: http://localhost:8080/api/v1/recipe
role: ADMIN
```
- Получить страницу рецептов:
```sh
Метод запроса: GET
URL запроса: http://localhost:8080/api/v1/recipe
role: ALL
```
- Редактировать информацию о рецепте:
```sh
Метод запроса: PUT
URL запроса: http://localhost:8080/api/v1/recipe/{uuid}/dt_update/{dt_update}
role: ADMIN
```
