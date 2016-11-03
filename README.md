# OMSB

OMSB(Overtime Management System BetaVersion)は、EISにおける残業管理業務をWebアプリとして実装するシステムである。Java勉強会におけるアプリ開発課題のベースとなるアプリケーションを想定している。

## Table of Contents

* [Requirements](#requirements)
* [Collaborating](#collaborating)
* [Support and Migration](#support-and-migration)

***

## Requirements
OMSBにおける開発環境は以下の通り:

* Java (JDK1.7)
* [Sprinb Boot][boot] (フレームワーク)
* [1stserver社Javaレンタルサーバプラン][1st] (レンタルサーバ)
 * Tomcat (Application server)
 * [MariaDB][maria] (DBMS)
* [Spring Tool Suite][sts] (EclipseベースのSpringプロジェクトカスタマイズIDE)
 * [maven][maven] (プロジェクト管理ツール)
* Git (構成管理システム)

## Collaborating
OMSBにおける当面の運営は以下の通り:

* 研修のベースとなるコア機能の開発は、Core-DEVチームにて行う
* 各種の議論は、Issueで行う。１つのIssueに１つのネタで起票すること。議論のラベルは**"discuss"**を付与する
その他のラベルはGitHubのデフォルトだが、利用シーンは今後協議して決める。

[GitHubがデフォルトで用意しているIssueラベルの意味](http://qiita.com/maeda_t/items/4344bdeabcc6a18a34cc)

***
### GitHubにおける各種ドキュメントの記法について
GFM(GitHub Flavored Markdown)で記述する。
以下、参考サイト。
- [Markdownで行こう！](https://gist.github.com/wate/7072365)
- [Markdown cheat sheet (2nd edition)](https://github.com/higuma/markdown_cheat_sheet)
- [Markdown記法 チートシート](http://qiita.com/Qiita/items/c686397e4a0f4f11683d "Qiita")

[sts]: https://spring.io/tools/sts
[maven]: https://maven.apache.org/
[boot]: https://projects.spring.io/spring-boot/
[maria]: https://mariadb.org/
[1st]: http://java.1strentalserver.com/modules/plan/index.php?cat_id=3
