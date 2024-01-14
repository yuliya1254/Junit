
# <a href="https://www.wildberries.ru/"><img src="media/images/logo.png" width="55" height="55"/></a> Проект по автоматизации тестирования для «Wildberries»

## :technologist: Технологии и инструменты

<p  align="center">

<a href="https://www.jetbrains.com/idea/"><img width="5%" title="IntelliJ IDEA" src="media/logo/Idea.svg"></a>
<a href="https://www.java.com/"><img width="5%" title="Java" src="media/logo/Java.svg"></a>
<a href="https://selenoid.autotests.cloud/"><img width="5%" title="Selenoid" src="media/logo/Selenoid.svg"></a>
<a href="https://selenide.org/"><img width="5%" title="Selenide" src="media/logo/Selenide.svg"></a>
<a href="https://gradle.org/"><img width="5%" title="Gradle" src="media/logo/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="5%" title="Junit5" src="media/logo/Junit5.svg"></a>
<a href="https://github.com/"><img width="5%" title="GitHub" src="media/logo/GitHub.svg"></a>
<a href="https://allurereport.org/"><img width="5%" title="Allure Report" src="media/logo/Allure.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></a>
<a href="https://www.jenkins.io/"><img width="5%" title="Jenkins" src="media/logo/Jenkins_logo.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira"><img width="5%" title="Jira" src="media/logo/Jira.svg"></a>
<a href="https://web.telegram.org/"><img width="5%" title="Telegram" src="media/logo/Telegram.svg"></a>
</p>

### В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.

- Gradle — используется как инструмент автоматизации сборки.
- Jenkins — CI/CD для удаленного запуска тестов.
- Selenoid — для удаленного запуска браузеров в Docker-контейнерах. 
- Allure Report – для визуализации результатов испытаний.
- Telegram Bot — для уведомлений о результатах тестов.
- Allure TestOps - как система управления тестированием.


## :heavy_check_mark: Список проверок, реализованных в автотестах

- [x] Проверка содержания бокового меню
- [x] Отображение всплывающей подсказки при наведение на кнопку Фотоаппарата
- [x] Проверка содержания заголовка сайта
- [x] Для проверки отображения валюты применены параметризованные тесты
- [x] Соответсвие результатов поиска дааным ввода применены параметризованные тесты
- [x] Проверка открытия формы входа при нажатии на иконку 'Войти' на главной странице
- [x] Проверка открытия сервисной страницы на вкладке Доставка при нажатии на иконку 'Адрес' на главной странице



## :heavy_check_mark: Список проверок, реализованных в ручных тестах

- [x] Проверка атрибутов в карточке товара


## :rocket: Запуск тестов

###  :rocket: Локальный запуск :
```bash
gradle clean test
```

###  :rocket: Удаленный запуск (в Jenkins):
<p align="center">
<img title="Jenkins" src="media/video/Jenkins.jpg">
</p>

1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/wildberries1/">проект</a>
2. Нажать **Build with Parameters**
3. Результат запуска сборки можно посмотреть в отчёте Allure

## :triangular_flag_on_post: Allure отчеты:

### <img src="media/logo/Allure.svg" width="25" height="25"  alt="Allure"/>Отчет в Allure</a> <a target="_blank" href="https://jenkins.autotests.cloud/job/wildberries1/allure/"> report</a>

#### :black_small_square: Основной отчет
<p align="center">
<img title="Allure Report Dashboards" src="media/video/othetAllure.png">
</p>

#### :black_small_square: Тесты
<p align="center">
<img title="Allure Report Tests" src="media/images/testForAllure.png">
</p>

### <img src="media/logo/Allure_TO.svg" width="25" height="25"  alt="Allure TestOps"/>Отчет в Allure</a> <a target="_blank" href="https://allure.autotests.cloud/project/3815/dashboards"> TestOps</a>

#### :black_small_square: Основной отчет
<p align="center">
<img title="Allure TestOps Dashboards" src="media/images/testOpsOrhet.png">
</p>

#### :black_small_square: Тесты
<p align="center">
<img title="Allure TestOps Tests" src="media/images/testsForTestOp.png">
</p>


#### :black_small_square: Пример ручных тестов
<p align="center">
  <img title="Allure TestOps manual tests" src="media/images/forManual.png">
</p>

## <img src="media/logo/Telegram.svg" width="25" height="25"  alt="Telegram"/>Telegram уведомления</a>

<p align="center">
<img title="Allure Overview Dashboard" src="media/images/telegram.png">
</p>

## <img src="media/logo/Jira.svg" width="25" height="25"  alt=/>Atlassian Jira</a> <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-968">интеграция</a>
<p align="center">
  <img title="Atlassian Jira" src="media/images/jira.png">
</p>

##  <img src="media/logo/Selenoid.svg" width="25" height="25" alt="Selenoid"/>Selenoid видеозапись тестов</a>
### Видеозапись прохождения тестов

<p align="center">

  <img title="Selenoid video" src="media/video/video.gif">

</p>
