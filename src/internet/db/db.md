<!--ts-->
1. [SQLNoSQL](#SQLNoSQL)
2. [DOM](#dom)
<!--te-->

SQLNoSQL
===
| |DB|https://uk.wikipedia.org/wiki/NoSQL|
|---|---|---|
|__SQL__|---|ориентируются на требования __ACID__ к транзакционной системе:|
| |атомарность|atomicity |
| |согласованность |consistency |
| |изолированность|isolation|
| |надёжность|durability|
|__NoSQL__| |__набор свойств BASE:__| 
|базовая доступность|basic availability| каждый запрос гарантированно завершается (успешно или безуспешно)|
|гибкое состояние|soft state|состояние системы может изменяться со временем, даже без ввода новых данных, для достижения согласования данных|
 |согласованность в конечном счёте |eventual consistency|данные могут быть некоторое время рассогласованы, но приходят к согласованию через некоторое время|
 |Cassandra|Столбчатые|оптимизированы для чтения и записи данных в виде столбцов, а не строк. Столбчатый подход к хранению таблиц баз данных имеет важное значение для производительности аналитических запросов, поскольку он значительно снижает общие требования к дисковым операциям ввода-вывода и снижает объем данных, которые требуется загружать с диска.
 | Apache CouchDB, MongoDB, OrientDB|Документные| разработаны для хранения частично структурированных данных в виде документов, обычно в формате __JSON или XML__. В отличие от традиционных реляционных баз данных, каждый из документов NoSQL может обладать собственной схемой, что обеспечивает большую гибкость в упорядочивании и хранении данных приложения, а также сокращает объем хранилища для необязательных значений.|
|Neo4j, OrientDB|Графовые|хранят вершины и направленные связи, называемые ребрами. Графовыми могут быть и базы данных SQL, и базы данных NoSQL. Каждая вершина или ребро может обладать набором собственных свойств.|
|Dynamo,  Oracle NoSQL Database, Redis|Хранилища типа «ключ-значение» в памяти | базы данных NoSQL, рассчитанные на нагрузки с большим количеством операций чтения (например, социальные сети, игры, сервисы обмена мультимедийными материалами и порталы вопросов и ответов) или нагрузки с повышенными требованиями к вычислительной мощности (например, сервисы рекомендаций). Кэширование в памяти позволяет увеличить производительность приложений за счет сохранения критически важных блоков данных в памяти для последующего доступа к ним с минимальными задержками.|
| |Об'єктно-орієнтована|в якій дані моделюються у вигляді класів і об'єктів, їх атрибутів і методів|


###Сравнение терминологии SQL и NoSQL 

|sql|MongoDB (NoSQL)|DynamoDB (NoSQL)|Cassandra (NoSQL)|Couchbase (NoSQL)
|---|---|---|---|---|
Таблица|Коллекция|Таблица|Таблица|Корзина данных
Ряд|Документ|Элемент|Ряд|Документ
Столбец|Поле|Атрибут|Столбец|Поле
Первичный ключ|ObjectId|Первичный ключ|Первичный ключ|ID документа
Индекс|Индекс|Вторичный индекс|Индекс|Индекс
Вид|Вид|Глобальный вторичный индекс|Материализованный вид|Вид
Вложенная таблица или объект|Встроенный документ|Карта|Карта|Карта
Массив|Массив|Список|Список|Список|

*[source] (https://aws.amazon.com/ru/nosql/)

###[Теорема CAP](https://uk.wikipedia.org/wiki/%D0%A2%D0%B5%D0%BE%D1%80%D0%B5%D0%BC%D0%B0_CAP)
|Consistency|Availability|Partition tolerance|
|---|---|---|
|__узгодженість даних__ (усі вузли бачать однакові дані на будь-який момент часу)|__доступність__ (гарантія того, що кожен запит отримає коректну відповідь)|__стійкість до розділення__ (не зважаючи на розділення на ізольовані секції або втрати зв'язку з частиною вузлів, система не втрачає стабільність і здатність коректно відповідати на запити)
|CA (узгодженність-доступність)|AP (доступність-стійкість)|CP (узгодженність-стійкість)|
|Розподілена система в якій забезпечена доступність та узгодженість даних не може забезпечувати стійкість до розділення. Прикладом такої системи є програмне забезпечення що підтримує ACID вимоги, наприклад __реляційні бази даних__.| Розподілена система в якій не гарантується цілісність результату, зате висока доступність і збереження працездатності при розділенні. Звісно такі системи з'явилися значно раніше формулювання CAP теореми, як то наприклад __DNS__, але ріст популярності збігається з розповсюдженням даного принципу (зокрема деякі __NoSQL__ системи не гарантують цілісність результату, посилаючись на дану теорему).| Система що забезпечує цілісність даних на всіх вузлах і здатність працювати при розділенні, але не гарантує доступність і може не відповідати на запити.Прикладами таких систем є розподілене програмне забезпечення фінансових систем, де узгодженість даних має найвищий пріоритет, це наприклад, __мережа банкоматів__.|

DOM
===
1. [Документ и объекты страницы] (http://learn.javascript.ru/document)
1. [Дерево DOM] (http://learn.javascript.ru/dom-nodes)
1. 
1. [Внутреннее устройство поисковых методов] (https://learn.javascript.ru/searching-elements-internals)

brifly:  
2. DOM-модель – это внутреннее представление HTML-страницы в виде дерева.  
2. Все элементы страницы, включая теги, текст, комментарии, являются узлами DOM.  
3. У элементов DOM есть свойства и методы, которые позволяют изменять их.

HTTP
===
[HTTP Headers] (https://code.tutsplus.com/ru/tutorials/http-headers-for-dummies--net-8039)  

|Method|Do| |
|---|---|---|
|GET|получение документа|GET /foo.php?first_name=John&last_name=Doe&action=Submit HTTP/1.1|
|POST|отправка данных на сервер|POST /foo.php HTTP/1.1  first_name=John&last_name=Doe&action=Submit|
(http://java-se-learning.blogspot.com/2014/05/http-key-moments.html?view=sidebar)

Memory
===
(http://java-se-learning.blogspot.com/2014/10/permanent-generation.html?view=sidebar)



