# lab0
了解开发基础知识  熟悉java开发相关软件 写一个java最基础的小程序

##目录
[1. 创建一个自己的文件夹](#1)  
[2. 学习使用软件学院FTP](#2)  
[3. 注册github账号](#3)  
[4. 下载安装JAVA1.8并配置环境变量](#4)  
[5. JAVA编辑器介绍](#5)  
[6. 写一个JAVA小程序](#6)  

<h2 id='1'>第一步 创建一个自己的文件夹</h2>
请在机房电脑的D盘下创建一个以自己学号为名的文件夹。 例如：16302010001  
`注意` ** 本机房电脑每次开机会重置C盘，想保存在本电脑的内容请放在D盘自己的文件夹下，助教和其他工作人员不会对此文件夹进行查看。**

<h2 id='2'>第二步 学习使用软件学院FTP</h2>
FTP（File Transfer Protocol，文件传输协议）是一种实现计算机之间文件传输的工具。软件学院的FTP上有往届所有专业课程的课程资料，我们主要使用FTP提交每次lab和期中期末两次Project。

###进入FTP
打开我的电脑，在地址栏输入FTP地址： ftp://10.132.141.33  

![1x](https://cloud.githubusercontent.com/assets/6169077/18310556/a7004386-7531-11e6-99c0-4918f8976bfe.png)

在弹出的对话框里输入账号密码：用户名：ss  密码：ss  

![2x](https://cloud.githubusercontent.com/assets/6169077/18310598/e8c0b68e-7531-11e6-99ee-553068fe883b.png)

进入class/16/程序设计（陈荣华），此为本课程FTP目录，课程相关的文件会放置在此文件夹下，每次lab和project做好后需要您上传到upload文件夹下对应的目录中。  
`注意` ** 提交作业时请按  学号_（这是下划线）姓名  的格式修改文件名称， 例如  16302010001_XXX**
`注意` ** 此账号（账号名SS，密码SS）没有删除文件的权限，每次上传作业时请尽量保证作业完好，若需要更改请换个名字再上传一份 例如 16302010001_XXX修改版**

需要从FTP获取文件时，复制此文件，粘贴到你的电脑上等待下载完成即可。  
向FTP某文件夹上传文件时，请复制本地你要上传的文件，粘贴在对应文件夹下等待上传即可。  
`注意` ** 软件学院FTP系统架设在复旦内网中，在外网无法访问（例如南区、张江校区和校外）。笔记本只要接入校园网WIFI也可访问FTP**

<h2 id='3'>第三步 注册github账号</h2>

### GitHub是什么

当我们在编写程序时，我们往往和其他人一起协作，共同完成一个软件的开发。对于大型软件来说，团队中成员之间的协作及代码的版本管理变得尤为重要。

GitHub就是这样一个提供了版本控制的代码托管网站。也就是说，你可以将一个项目的代码储存在GitHub的一个仓库中，并允许别人与你共同开发这个项目。除此之外，它也提供了一些方便社会化软件开发的功能，包括允许用户追踪其他用户、组织、软件库的动态，对软件代码的改动和bug提出评论等。GitHub也提供了图表功能，用于显示开发者们怎样在代码库上工作以及软件的开发活跃程度。

截止到2015年，GitHub已经有超过九百万注册用户和2110万代码库。**事实上已经成为了世界上最大的代码存放网站和开源社区。**

### 我们使用GitHub做什么

目前，我们使用GitHub来查看课程文档和讨论。  

我们将这门课程托管在GitHub上，所有课程材料都可以在[课程主页](https://github.com/java-b/Forum)中找到。具体地来说：

- 在课程的[大纲仓库](https://github.com/java-b/Forum)中，你可以找到一些课程的推荐阅读。

- 在课程的[大纲仓库的讨论区](https://github.com/java-b/Forum/issues)中，你可以提出自己的问题，或是回答其他同学的问题。助教看到问题之后将会第一时间回复，同时也欢迎同学们在上面回复其他同学的问题。最终成绩中的平时分与讨论相关。
`注意` ** 平时分包含出勤情况和讨论情况，讨论情况占比较少**   
`注意` ** 平时私信老师和助教与平时分无关**

- 每个布置的Lab（上机作业）和Project都会拥有一个单独的项目仓库。以这个Lab为例，它的主页为：https://github.com/java-b/lab0

  你可以在线查看文档，或是将这个仓库下载到本地后查看。

### 如何使用GitHub

注册GitHub账号。选择你喜欢的用户名、学号邮箱及密码，点击 `Sign up for GitHub` 前往注册。
![3x](https://cloud.githubusercontent.com/assets/6169077/18310821/4f033542-7533-11e6-8bda-c2e8b4ac11c0.png)

前往课程主页：https://github.com/java-b

熟悉[如何在讨论区中发布新的帖子？](https://github.com/java-a/syllabus/issues/1)及[如何回复一个帖子？](https://github.com/java-a/syllabus/issues/2)。

<h2 id='4'>第四步 下载安装JAVA1.8并配置环境变量</h2>
[java 1.8](http://www.java.com/zh_CN/download/win10.jsp)请在FTP的Materials文件夹或者java官网下载java1.8安装包并安装。  
配置环境变量请参考此链接：http://jingyan.baidu.com/article/f96699bb8b38e0894e3c1bef.html

<h2 id='5'>第五步 JAVA编辑器介绍</h2>
###轻量编辑器：  
[Atom](https://atom.io/)  
[VS code](https://code.visualstudio.com/)  
[Editplus](https://www.editplus.com/)  
这类软件缺少IDE的自动补全等功能，但适用于其他编程语言,比较适合快速查看程序，编写代码量不大的程序，对程序进行较小的修改。  

###IDE（集成开发环境）：  
[intellij idea](https://www.jetbrains.com/idea/)  请使用此IDE进行期中，期末的Project开发，此IDE会在多门课中使用到，请认真学习其使用方法。  
[eclipse](https://www.eclipse.org/)  传统java开发软件，常见于各大公司  
请在FTP的Materials文件夹下载Atom和intellij进行安装（也可登陆各软件官网下载）

<h2 id='6'>第六步 写一个JAVA小程序</h2>
首先，请在D盘自己的文件夹下新建一个文本文件（txt格式），打开。  
粘贴上以下内容：  
```
  public class HelloWorld {  
      //输出一行字符串“Hello World!”  
      public static void main(String[] args) {  
        System.out.println("Hello World!");  
      }  
  }
```
保存并将文件名修改为HelloWorld.java  
![image](https://cloud.githubusercontent.com/assets/6169077/18313123/af429130-753f-11e6-8ded-e23f5e8b3104.png)  
请点击是  
这样我们就写好了一个在控制台中打印“Hello World!”的小程序。  
下面我们来编译、运行这个程序：  

###编译：  
在此文件夹下，按住shift键同时点击右键，选择在此处打开命令窗口。  
或者打开命令提示符，输入  
![image](https://cloud.githubusercontent.com/assets/6169077/18314312/23e68622-7545-11e6-9f9a-004a45841405.png)  
然后输入命令  
`javac Helloworld.java`  
输入此命令后如正确编译，会产生一个名为HelloWorld.class的文件，如图  
![image](https://cloud.githubusercontent.com/assets/6169077/18314449/b490fa04-7545-11e6-8b18-582e0fcf8e4e.png)  
编译结束，不要关闭命令行。

###运行： 
在命令行中继续输入
`java Helloworld`
输入此命令后如正确运行，会产生如下结果：  
![image](https://cloud.githubusercontent.com/assets/6169077/18314616/61817b94-7546-11e6-8201-57683c5e2433.png)  

`注意` ** 课后请在自己的电脑上安装[java 1.8](http://www.java.com/zh_CN/download/win10.jsp)和[intellij idea](https://www.jetbrains.com/idea/)，并为java1.8配置好环境变量**



