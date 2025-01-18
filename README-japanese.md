# Wanada PC
パソコンとその部品の紹介サイト


## 🖥️ プロジェクトの紹介
Danawa PCサイトを参考にして作ったSpring boot／Thyemleafプロジェクト


## 🕰️ 開発期間
* 一次（JSP）: 24.10.10 ~ 24.10.26
* 二次（Spring Boot（Thymeleaf）、DB）: 24.11.18 ~ 24.12.19


### 🧑‍🤝‍🧑 チームメンバー
 - Team Leader : アン・ジンヒョク - index、pc 詳細ページ、検索ぺージ、マイページ、効用（header、footer、トップボタン）
 - Sub Leader : キム・ヒョンギュ - 商品詳細ぺージ、カテゴリー別商品ページ
 - Team Member 1 : ソ・グァンジェ - コミュニティ
 - Team Member 2 : ジョ・ユナン - ログイン、会員加入、会員情報修正


### ⚙️ 開発環境
 - `Java 17`
 - **IDE** : STS 4.26.0
 - **Framework** : Spring Boot（Thymleaf）
 - **Database** : Oracle


## 📌 主要機能
### 🧑‍🤝‍🧑 アン・ジンヒョク（Team Leader）
#### Indexページ - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/Home%E2%80%90japanese">ページの詳細（WIKI）</a>
 - イメージ　スライド
 - ナビゲーション メニュー
 - カテゴリー別PCリスト
 - トップ　ボタン
 - コミュニティの最新の書き込み表示
 - ログイン時のヘッダーメニューの変更
#### カテゴリー別PCリストページ - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%E3%82%AB%E3%83%86%E3%82%B4%E3%83%AA%E3%83%BC%E5%88%A5PC%E3%83%AA%E3%82%B9%E3%83%88">ページの詳細（WIKI）</a>
 - カテゴリー別PCの情報（DBの商品テーブルを参照してPCテーブルを作成）
 - カテゴリー　メニューを選択時、カテゴリに合うPCリストを表示（性能順に4つまで）
 - おすすめpcリスト表示（性能順に4つまで）
#### PC詳細ページ - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/PC%E8%A9%B3%E7%B4%B0%E3%83%9A%E3%83%BC%E3%82%B8">ページの詳細（WIKI）</a>
 - PCとその部品の情報を紹介
 - 詳細表示ボタンを活用してPCの部品の詳細情報を表示
#### 検索ページ - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%E6%A4%9C%E7%B4%A2%E3%83%9A%E3%83%BC%E3%82%B8">ページの詳細（WIKI）</a>
 - 検索したキーワードを表示
 - 検索した内容表示（コミュニティ、商品）
#### マイページ - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%E3%83%9E%E3%82%A4%E3%83%9A%E3%83%BC%E3%82%B8">ページの詳細（WIKI）</a>
 - 詳細ページ（私が書いた文章、会員情報の修正）に移動


#
### 🧑‍🤝‍🧑 キム・ヒョンギュ（Sub Leader）
#### カテゴリー別商品ページ - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC-%EB%B3%84-%EC%83%81%ED%92%88-%ED%8E%98%EC%9D%B4%EC%A7%80">ページの詳細（WIKI）</a>
 - 商品リスト
 - 商品カテゴリ別項目を表示
#### 商品詳細ぺージ - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%EC%83%81%ED%92%88-%EC%83%81%EC%84%B8-%ED%8E%98%EC%9D%B4%EC%A7%80">ページの詳細（WIKI）</a>
 - 商品リスト
 - カタログ
 - 価格及びイメージ


#
### 🧑‍🤝‍🧑 ジョ・ユナン（Team Membmer）
#### ログイン - <a href="">ページの詳細（WIKI）</a>
 - DBの会員テーブルの情報と比較
 - ログイン時にsessionを作成
#### 会員加入 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85">ページの詳細（WIKI）</a>
 - 有効性検査
 - IDの重複をチェック
 - 有効性検査を通過し、会員登録時にパスワードは暗号化（エンコード）してDBに保存
#### 会員情報修正 - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/%ED%9A%8C%EC%9B%90%EC%A0%95%EB%B3%B4-%EC%88%98%EC%A0%95">ページの詳細（WIKI）</a>
 - マイページで会員情報修正メニューをクリックすると、パスワード確認ポップアップ ウィンドウを表示され、通過時に移動
 - 有効性検査

#
### 🧑‍🤝‍🧑 ソ・グァンジェ（Team Member）
#### コミュニティ - <a href="https://github.com/redswer/ProjectWanadaPc-SpringBootThymeleaf/wiki/Wanada-PC-community-%EC%84%9C%EA%B4%91%EC%A0%9C">ページの詳細（WIKI）</a>
 - 書き込み、読み取り、修正、削除 (CRUD)
 - 書き込みはログイン時可能（ログイン時ボタン活性化）
 - 修正、削除は作成者とログインしたIDが同じ時のみ可能（作成者とログインしたIDが同じ時ボタン活性化）
