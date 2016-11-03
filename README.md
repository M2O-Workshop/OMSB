# OMSB

OMSB(Overtime Management System BetaVersion)は、EISにおける残業管理業務をWebアプリとして実装するシステムである。Java勉強会におけるアプリ開発課題のベースとなるアプリケーションを想定している。

## Table of Contents

* [Requirements](#requirements)
* [Documents](#documents)
* [Collaborating](#collaborating)

***

## <a name="requirements"> Requirements
OMSBにおける開発環境は以下の通り:

* Java (JDK1.7)
* [Sprinb Boot][boot] (フレームワーク)
* [1stserver社Javaレンタルサーバプラン][1st] (レンタルサーバ)
 * Tomcat (Application server)
 * [MariaDB][maria] (DBMS)
* [Spring Tool Suite][sts] (EclipseベースのSpringプロジェクトカスタマイズIDE)
 * [maven][maven] (プロジェクト管理ツール)
* Git (構成管理システム)

## <a name="documents"> Documents
OMSBにおける各種ドキュメントの管理は以下の通り：

* システム要件、設計書等は、リポジトリの「doc」フォルダの配下に格納
* その他の事項で共有すべき事項は、[wiki](https://github.com/M2O-Workshop/OMSB/wiki)に記載

## <a name="collaborating"> Collaborating
OMSBにおける当面の運営は以下の通り:

1. 基本方針
 * システム要件のうち、一部の機能をコア開発として括りだし、Core-DEVチームにて開発する
 * コア開発の成果物に対する機能拡張、機能追加を研修課題として受講メンバにて開発する

2. 運営について
 * 各種の議論は、issueで行う。１つのissueに１つのネタで起票し、ラベルは**"discuss"**を付与する。
 * issueのその他のラベルはGitHubのデフォルトだが、利用シーンは今後協議して決める。
3. GitHub運用ポリシー（継続検討）
 * commit運用
 * branch運用
 * PullRequest運用

[GitHubがデフォルトで用意しているIssueラベルの意味](http://qiita.com/maeda_t/items/4344bdeabcc6a18a34cc)


[sts]: https://spring.io/tools/sts
[maven]: https://maven.apache.org/
[boot]: https://projects.spring.io/spring-boot/
[maria]: https://mariadb.org/
[1st]: http://java.1strentalserver.com/modules/plan/index.php?cat_id=3
