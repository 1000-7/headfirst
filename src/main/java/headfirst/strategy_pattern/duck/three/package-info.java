package headfirst.strategy_pattern.duck.three;
//用接口代替呢
/*
好处:
这样已设计，我们的程序就降低了它们之间的耦合。
不足:
Flyable和 Quackable接口一开始似乎还挺不错的，解决了问题（只有会飞到鸭子才实现 Flyable），
但是Java接口不具有实现代码，所以实现接口无法达到代码的复用。
*/

