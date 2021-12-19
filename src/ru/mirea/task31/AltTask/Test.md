# Вывод по результатам тестирования #
Тестируем класс CurrencyInfo при помощи класса CurrencyInfoTest через JUnit.
Проверяем работу методов addCurency, добавляющего новую валюту в список и equals, сравнивающий списки валют (рисунок 1).

## Тест addCurency
Метод принимает на вход параметры currency - название валюты и value - ее стоимость. Затем метод добавляет валюту с ключом currency и значением value в  заранее хэш-карту currencies.
Тестирование показало, что метод обрабатывется верно.

## Тест equals
Метод создает два объекта класса CurrencyInfo, заполняет их одинаковыми значениями времени и валют, а затем сравнивает эти объекты.
Тестирование показало, что метод обрабатывается неверно, однако вывод метода полностью совпадает с ожидаемым (рисунок 2).
Причина ошибки неизвестна.

![Test](https://github.com/KirC0ff/JavaFirstMirea/blob/master/src/ru/mirea/task31/AltTask/Test.jpg?raw=true "Рисунок 1 - Тестирование класса CurrencyInfo")

Рисунок 1 - Тестирование класса CurrencyInfo

![Equals](https://github.com/KirC0ff/JavaFirstMirea/blob/master/src/ru/mirea/task31/AltTask/equalsTest.jpg?raw=true "Рисунок 2 - Сравнение выводов метода equals")

Рисунок 2 - Сравнение выводов метода equals
