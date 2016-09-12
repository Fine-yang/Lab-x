# Lab-1

> 本节目标
> 
> 1. 学习整数相关操作，包括自增（++）、整除（/）、求模（%）等操作。
> 2. 学习基本的字符串处理操作，并体会字符类型（char）和数值类型（int）之间的联系。
> 

## 获取和提交作业
**获取**：通过 `https://github.com/java-b/Lab-1`，获取 Lab1 的作业 `Lab1.java`。

**提交**：将代码压缩，命名为 `学号_姓名` 例如 `13302010032_zhouyi`，提交至 `FTP` 站点（`ftp://10.132.141.33`）的 `work_upload` 文件夹下。

## `++i` VS `i++`
*此题不需提交*

下面代码的运行结果是什么？先根据学过的知识计算，再通过编写代码求解。

```java
int x = 1;
int ans1 = x++;
int ans2 = ++x;
int ans3 += (x++) + (++x); // 尽量避免这种代码写法
int ans4 += (x++) + (++x); // 尽量避免这种代码写法
```

## `bitsum` 按位求和（整数版本）

定义函数 `bitsum`，输入一个正整数（`int` 类），输出按位求和的结果。

例如，对于数字 `X = abcd`，按位求和操作为 `bitsum(X) = a + b + c + d`。

- `bitsum(123) = 6`
- `bitsum(19260817) = 34`

请填充作业中的 `bitsum` 函数并运行代码，运行成功将会出现 `Congratulations! You solve problem 1!` 的提示。

## `bitsum2` 按位求和（字符串版本）

定义函数 `bitsum2`，输入一个字符串（`String` 类，仅包含 26 个小写字母），定义 `a = 1 , b = 2 ... , z = 26`，输出按位求和的结果。

例如，对于字符串 `S = hello`，按位求和的结果是 `bitsum2(S) = 8 + 5 + 12 + 12 + 15`。

- `bitsum2("abc") = 6`
- `bitsum2("zzz") = 78`

请填充作业中的 `bitsum2` 函数并运行代码，运行成功将会出现 `Congratulations! You solve problem 2!` 的提示。

**提醒 1** ： `char` 类型和 `int` 类型可以互相转换，依据是 `ASCII` 码表。其中，`Dec` 列是 `int` 值，`Chr` 列是 `char` 值，如图：

![](http://www.asciitable.com/index/asciifull.gif)

由图可见：

- `char` 类型的 `A` 对应 `int` 类型的 `65`
- `char` 类型的 `0` 对应 `int` 类型的 `48` 

**提醒 2** ： `char` 类型可以进行加减法，加减法的结果就是其对应的 `int` 类型的加减法结果。

**提醒 3** ：通过 `.length` 可以获取字符串的长度，通过 `charAt(int index)` 可以获得第 `index` 位的字符。

## [此题选做] `bitsum3` 按位求和（混合版本）

定义函数 `bitsum3`，输入一个字符串（`String` 类，包含 26 个小写字母和 10 个阿拉伯数字），定义 `a = 1 , b = 2 ... , z = 26`，输出按位求和的结果。

例如，对于字符串 `S = hello123`，按位求和的结果是 `bitsum3(S) = 8 + 5 + 12 + 12 + 15 + 1 + 2 + 3`。

- `bitsum3("a0000") = 1`
- `bitsum3("09bc1") = 15`

请填充作业中的 `bitsum3` 函数并运行代码，运行成功将会出现 `Excellent! You solve problem 3!` 的提示。

**提醒** ： `char` 类型的 `0` 和 `int` 类型的 `0` 是不一样的。
