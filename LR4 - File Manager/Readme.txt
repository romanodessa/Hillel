Для выполнения одной из операций необходимо выбрать ее из списка - ввести число,
соответствующее операции (от 0 до 7).
Если пользователь введет символы, отличные от 0...7, программа сообщит об ошибке.

1. Создание файла
После выбора операции 1 программа запрашивает ввести путь и имя файла, который необходимо
создать, в формате, предусмотренном ОС.
Пример для Windows: /Users/user/projects/test.txt, где /Users/user/projects/ - путь к файлу, test.txt - имя
файла.
После успешного создания файла программа выдает сообщение "File has been created".
При попытке создать файл, который уже существует, программа выдаст сообщение "File already
exists".

2. Удаление файла
После выбора операции 2 программа запрашивает ввести путь и имя файла, который необходимо
удалить, в формате, предусмотренном ОС.
После успешного удаления файла программа выдает сообщение "File has been deleted".
При попытке удалить файл, которого не существует, вводе некорректного пути, программа выдаст
сообщение "File hasn't been found or can't be deleted".

3. Переименование файла
После выбора операции 3 программа запрашивает ввести путь и имя файла, который необходимо
переименовать, в формате, предусмотренном ОС.
Затем необходимо ввести путь и новое имя файла.
После успешного переименования файла программа выдает сообщение "File has been renamed".
В противном случае - "File hasn't been renamed".

4. Поиск слова в файле
После выбора операции 4 программа запрашивает ввести путь и имя файла, в котором необходимо
найти слово, в формате, предусмотренном ОС.
Далее программа просит ввести слово, которое необходимо найти в файле. Если слово найдено,
"The word has been found", если нет - "The word hasn't been found".

5. Замена слова в файле
После выбора операции 5 программа запрашивает ввести путь и имя файла, в котором необходимо
заменить слово, в формате, предусмотренном ОС.
Далее программа просит ввести слово, которое необходимо заменить и новое слово для замены.
Если слово, которое необходимо заменить, присутствует в файле, оно заменяется и программа
выдает сообщение "The word has been replaced". В противном случае - "Such word is missing in
this file"

6. Запись в Excel файл
После выбора операции 6 программа запрашивает ввести путь и имя файла, в котором необходимо
заменить слово, в формате, предусмотренном ОС.
Программа позволяет записать данные в Excel файл.

7. Чтение из Excel файла
После выбора операции 7 программа запрашивает ввести путь и имя файла, в котором необходимо
заменить слово, в формате, предусмотренном ОС.
Программа позволяет читать данные из Excel файла.

8. Поиск в Excel файле
После выбора операции 8 программа запрашивает ввести путь и имя файла, в котором необходимо найти слово, в формате, предусмотренном ОС.Программа просит пользователя ввести слово или число для поиска.
Если пользователь ввел слово, которое присутствует в ячейках таблицы, выдается сообщение - "The word has been found".
Если пользователь ввел число, которое присутствует в ячейках таблицы, выдается сообщение - "The digit has been found".
Если пользователь ввел слово или число, которое отсутствует в ячейках таблицы, выдается сообщение - "The word/digit hasn't been found".


0. Выход из программы