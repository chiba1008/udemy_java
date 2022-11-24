# 繰り返し処理
* 同じような処理を繰り返すこと
* 一般にプログラムは以下の3つの処理からなる。
  * 順次処理
  * 分岐処理
  * 繰り返し処理

# for文
```
for(初期値、カウンター; 条件; 更新){
    処理
}

ex)
for(int i = 0; i <= 5; i++){
    処理
}
```

# while文
* 「〜の間」の意味。
* ある条件が成り立っている間だけ処理を繰り返し実行。
* for文との違い。
  * カウンターに当たるものがない。
  * 条件判定を行う処理のなかでループを制御。

# do~while文
* while文とほぼ同じ。
* 条件判定が後についているのが特徴。
* 処理を実行してから判定を行う。
```
do{
    処理
}while(条件);
```