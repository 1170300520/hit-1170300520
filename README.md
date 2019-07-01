# Spring Boot Hello World
> An awesome hello world program for Spring Boot learner

[![Build Status](https://travis-ci.com/CN-GuoZiyang/CN-GuoZiyang.github.io.svg?branch=blog-source)](https://travis-ci.com/CN-GuoZiyang/CN-GuoZiyang.github.io)
[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg?style=flat-square)](https://github.com/996icu/996.ICU/blob/master/LICENSE)

Spring Boot, an almostly perfact 'framework' of all frameworks, makes it mush easier to create a one-click-run web application baesd on Java. However, to some noobs, learning a new framework can never be too harder. So an example project can never be too necessary.

Spring Boot Hello World is a wonderful project when you are learning Spring Boot. It combines the basic practices of Spring Boot, SpringMVC, Mybatis and Thymeleaf in just one project. It refers to the basic operations of data base like insertion, deletion and update. And becausing of using maven wrapper and SQLite, you do not even have to get maven or MySql or Oracle or whatever installed on your device, all you need is java development kit (JDK).

The goal for the repository are:

1. to help new programmers learning spring boot more easily, I will try my best to make the project standard of this configuration, which is a constant work, so feel free to open issue when some of the frameworks I used update.
2. to record some common use of some frameworks. Even though combined with Spring Boot, some configurations of framework are still too hard to learn.

![](http://ww4.sinaimg.cn/large/006tNc79ly1g4kntqyphpj310b0jcadd.jpg)

## Installation

macOS or Linux:

```sh
./mvnw package
java -jar ./target/hit-1170300520-1.0.0-RELEASE.jar
```

Windows:

```powershell
mvnw.cmd package
java -jar ./target/hit-1170300520-1.0.0-RELEASE.jar
```

## Usage example

After installation (and running), the undertow server runs on port 8080 by default, so opne your favourite web browser and jump to http://localhost:8080. The project has only one page.

The usage of the program is obvious (because it's just a DEMO!). Fill the input field with the placeholder '姓名'(name), '邮箱'(email) and '电话'(phone)，and click the button '添加'(insert) on the right, then a user's info is successfully inserted to the data base, you may be able to see it below if succeed.

![](http://ww1.sinaimg.cn/large/006tNc79ly1g4koaw3gdnj30m80godjc.jpg)

The table below the form is where users' information is showned. The fields shown are all editable (except id), just click the '更新'(update) button after editting and the data base will be updated. If you want to delete a user, just click the '删除'(delete) button on the right. I will not picture it.

However, using the program is not the main reason I created this repository, but learning the basic usage of some frameworks is. So, feel free to import it to your IntelliJ IDEA.

## Credits

This repository uses the following open source packages:

- Spring Boot
- SpringMVC
- Thymeleaf
- Undertow
- MyBatis
- Druid
- SQLite

## Release History

- 1.0.0
  - Publish the repository

## Contributing

With the rapid development of the frameworks, some configurations would be deprecated. I'll try to update the project but it's hard to be always in time. So I will appreciate if if you contribute to the repository.

How?

1. Fork it (https://github.com/CN-GuoZiyang/hit-1170300520/fork)
2. Create your own feature branch (`git checkout -b feature/fix`)
3. Commit your changes (`git commit -am 'fix some bugs'`)
4. Push to the branch (`git push origin feature/fix`)
5. Create a new pull request

## License

AGPL ©2019 Ziyang Guo

