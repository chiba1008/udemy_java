# メンバへのアクセスの許可
* アクセス指定子
  * フィールド、メソッドのアクセス範囲を決める
  * (default), public, protected, privateがある。
    * public : どこからでも呼び出せる
    * (default) : アクセス指定子が省略されている場合。同じパッケージ内からしか呼び出せない
    * protected : 同じパッケージか、そのサブクラスからしか呼び出せない
    * private : 同じクラス内からしか呼び出せない

# クラスの可視性
* クラス全体の可視性を指定することも可能
  * public : 他のパッケージからアクセスすることができる。
  * (default) : 同一パッケージ内からしかアクセスできない

# コンストラクタ
* クラス名と同一のメソッドを、コンストラクタという
* 戻り値の指定がない
* インスタンス生成時に一度だけ呼び出される。
* `new`の後にクラス名を指定→コンストラクタ呼び出し。

# カプセル化
* 通常フィールドはprivateで隠蔽し外部からアクセスするメソッドを解して値の変更・取得を行う。
* セッター : フィールドに値を書き込むメソッド
* ゲッター : フィールドの値を取得するメソッド
* 書き込みが日強なものにはセッターをつけ、読み込みが必要なものにはゲッターをつける。
