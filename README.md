# Java: Практика

Сейчас я опишу перечень шагов, которые нужно сделать, чтобы ты смог работать с задачами:

1. Сделать fork этого репозитория

Для этого нужно надать на кнопку Fork в правом верхнем углу.

2. Когда у тебя откроется страница с твой копией проекта, нажимаешь на зелёную кнопку "Download or clone" справа вверху и копируешь ссылку в текстовом поле.

3. Запускаешь IntelliJ IDEA

```bash
File => New => Project From Version Control => Git
```

Вставляешь ссылку туда и нажимаешь Clone

## Работа

Каждый раз перед началом работы тебе нужно сделать git pull - выполнить команду, которая обновит последние изменения на твоём локальном ПК.

```bash
VCS => Git => Pull => нажимаешь Pull
```

Когда ты решил задачу и хочешь отправить её на проверку, то тебе нужно сделать такой порядок шагов:

```bash
VCS => Git => Commit File => выбираешь все файлы которые нужно отправить в хранилище 
(это должны быть только твои *.java файлы и пакеты) => Внизу есть кнопка Commit, которая выполняет команду git commit
=> Нажми на стрелочку и выбери Commit and Push - это выполнит команду git push после git commit автоматически
```
