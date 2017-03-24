package com.cosplay.demo.mvp.bean;

import java.util.List;

/**
 * Created by zhiwei.wang on 2017/3/23.
 */

public class ZhiHuBook {

    /**
     * count : 10
     * start : 0
     * total : 999
     * books : [{"rating":{"max":10,"numRaters":20,"average":"5.1","min":0},"subtitle":"A Programmer's Guide","author":["J.F. DiMarzio"],"pubdate":"2008-7-30","tags":[{"count":16,"name":"Android","title":"Android"},{"count":6,"name":"Mobile","title":"Mobile"},{"count":4,"name":"Google","title":"Google"},{"count":3,"name":"Phone","title":"Phone"},{"count":2,"name":"技术","title":"技术"},{"count":1,"name":"Android.A.Programmers.Guide","title":"Android.A.Programmers.Guide"},{"count":1,"name":"programming","title":"programming"},{"count":1,"name":"力的来源!","title":"力的来源!"}],"origin_title":"","image":"https://img5.doubanio.com/mpic/s4259006.jpg","binding":"Paperback","translator":[],"catalog":"","pages":"400","images":{"small":"https://img5.doubanio.com/spic/s4259006.jpg","large":"https://img5.doubanio.com/lpic/s4259006.jpg","medium":"https://img5.doubanio.com/mpic/s4259006.jpg"},"alt":"https://book.douban.com/subject/3134548/","id":"3134548","publisher":"McGraw-Hill Osborne Media","isbn10":"0071599886","isbn13":"9780071599887","title":"Android","url":"https://api.douban.com/v2/book/3134548","alt_title":"","author_intro":"","summary":"Master the Android mobile development platform  Build compelling Java-based mobile applications using the Android SDK and the Eclipse open-source software development platform. Android: A Programmer's Guide shows you, step-by-step, how to download and set up all of the necessary tools, build and tune dynamic Android programs, and debug your results. Discover how to provide web and chat functions, interact with the phone dialer and GPS devices, and access the latest Google services. You'll also learn how to create custom Content Providers and database-enable your applications using SQLite.  Install and configure Java, Eclipse, and Android plugin  Create Android projects from the Eclipse UI or command line  Integrate web content, images, galleries, and sounds  Deploy menus, progress bars, and auto-complete functions  Trigger actions using Android Intents, Filters, and Receivers  Implement GPS, Google Maps, Google Earth, and GTalk Build interactive SQLite databases, calendars, and notepads  Test applications using the Android Emulator and Debug Bridge","price":"USD 39.99"},{"rating":{"max":10,"numRaters":161,"average":"8.2","min":0},"subtitle":"","author":["范怀宇"],"pubdate":"2012-8","tags":[{"count":363,"name":"Android","title":"Android"},{"count":114,"name":"编程","title":"编程"},{"count":65,"name":"计算机","title":"计算机"},{"count":52,"name":"android","title":"android"},{"count":36,"name":"互联网","title":"互联网"},{"count":28,"name":"范老师","title":"范老师"},{"count":24,"name":"计算机技术","title":"计算机技术"},{"count":21,"name":"大牛之作","title":"大牛之作"}],"origin_title":"","image":"https://img1.doubanio.com/mpic/s11184539.jpg","binding":"","translator":[],"catalog":"前言\n致谢\n第1章　Android的系统架构/1\n1.1　Android系统架构概况/2\n1.1.1　应用层/4\n1.1.2　框架层/5\n1.1.3　运行时/5\n1.1.4　核心类库/7\n1.1.5　硬件抽象层和Linux内核/7\n1.2　Android的核心功能模块/8\n1.2.1　界面框架/8\n1.2.2　数据存储/9\n1.2.3　网络通信/10\n1.2.4　地理信息/11\n1.2.5　图形和多媒体处理/11\n1.2.6　外部设备/12\n1.2.7　特色功能模块/13\n1.3　Android的架构特征和设计思想/13\n1.3.1　平台开放性/14\n1.3.2　基于组件的应用设计/14\n1.3.3　基于网络服务的平台/15\n1.4　小结/15\n第2章　Android源代码的下载和编译/16\n2.1　Android源代码的获取和编译/17\n2.1.1　环境搭建/18\n2.1.2　源代码获取/18\n2.1.3　源代码的编译/21\n2.2　Android源代码结构/22\n2.2.1　框架层源代码目录frameworks/22\n2.2.2　应用层源代码目录packages/24\n2.2.3　其他源代码目录/24\n2.3　Android源代码的阅读和编辑/25\n2.3.1　用Eclipse阅读源代码/25\n2.3.2　反馈Bug/26\n2.3.3　提交修改/27\n2.4　小结/27\n第3章　Android组件模型解析/28\n3.1　基于Mashup的应用设计/29\n3.1.1　Android中的Mashup/29\n3.1.2　基于Mashup的Android应用模型/30\n3.1.3　基于Mashup的应用架构特征/32\n3.2　界面组件Activity解析/34\n3.2.1　界面组件的功能和特征/34\n3.2.2　界面组件的开发/35\n3.2.3　界面组件的数据结构/39\n3.3　服务组件Service解析/40\n3.3.1　服务组件的功能和特征/41\n3.3.2　服务组件的开发和使用/43\n3.3.3　服务组件的进程间通信模型/45\n3.4　触发器组件Broadcast Receiver解析/49\n3.4.1　触发器组件的功能和特征/49\n3.4.2　触发器组件的使用/50\n3.4.3　广播事件的发送/52\n3.5　数据源组件Content Provider解析/52\n3.5.1　数据源组件的定位和操作/53\n3.5.2　数据源组件的开发/55\n3.5.3　数据源组件的实现细节/57\n3.6　应用配置文件解析/59\n3.6.1　权限配置/61\n3.6.2　环境配置/63\n3.6.3　应用和组件配置/65\n3.7　小结/66\n第4章　Android的Intent机制/67\n4.1　Intent对象的作用和构成/68\n4.1.1　Intent对象的作用/69\n4.1.2　Intent对象的构成/70\n4.1.3　Intent对象解析/75\n4.1.4　Intent Filter对象/76\n4.2　意图匹配/78\n4.2.1　意图匹配的算法流程/79\n4.2.2　匹配组件的选择/84\n4.2.3　意图匹配的优化/85\n4.3　意图机制的应用/86\n4.3.1　意图机制在界面组件中的应用/86\n4.3.2　意图机制在服务组件中的应用/88\n4.3.3　意图机制在触发器组件中的应用/89\n4.4　小结/90\n第5章　组件生命周期解析/91\n5.1　应用进程模型/92\n5.1.1　应用、组件和进程/92\n5.1.2　组件的应用进程配置/94\n5.2　应用进程托管/96\n5.2.1　为什么需要进程托管/97\n5.2.2　进程优先级/97\n5.2.3　进程回收算法/100\n5.2.4　进程的强行终止/103\n5.2.5　掌控进程的优先级/105\n5.3　组件的生命周期模型/106\n5.3.1　界面组件的生命周期/107\n5.3.2　服务组件的生命周期/115\n5.3.3　触发器组件的生命周期/119\n5.3.4　数据源组件的生命周期/120\n5.3.5　应用环境的生命周期/120\n5.4　任务和界面组件栈/120\n5.4.1　界面组件的运行模式/122\n5.4.2　组件的任务黏度/126\n5.4.3　实际应用中的任务控制/127\n5.5　小结/128\n第6章　组件间的数据传输/129\n6.1　利用Intent对象进行数据传输/130\n6.1.1　利用Intent对象回传数据/131\n6.1.2　利用Intent对象传递数据的优缺点/133\n6.2　利用文件进行数据共享/134\n6.2.1　利用文件进行数据共享的实现/134\n6.2.2　利用文件进行数据共享的优缺点/135\n6.3　利用应用环境的全局数据共享/136\n6.3.1　利用应用环境对象共享数据的实现/137\n6.3.2　利用应用环境对象共享数据的优缺点/138\n6.4　利用组件共享数据/139\n6.4.1　利用数据源组件共享数据/139\n6.4.2　利用服务组件共享数据/140\n6.5　小结/140\n第7章　Android控件解析/141\n7.1　Android的控件框架/142\n7.1.1　Android控件构成/142\n7.1.2　Android交互事件传输/143\n7.1.3　Android控件属性/145\n7.1.4　控件的丈量和绘制/150\n7.2　Android的窗口机制/150\n7.2.1　窗口机制的基本原理/151\n7.2.2　界面组件和窗口/152\n7.2.3　对话框/154\n7.2.4　弹出窗口/156\n7.3　Android的基本控件介绍/158\n7.3.1　文本控件/159\n7.3.2　图像控件/163\n7.3.3　Surface控件/164\n7.3.4　Layout控件/164\n7.3.5　适配器控件/167\n7.3.6　选项卡控件/172\n7.3.7　浏览器控件/173\n7.4　自定义控件/175\n7.4.1　控件的定制/175\n7.4.2 　复合控件/180\n7.4.3　自绘控件/183\n7.5　Android界面新发展/188\n7.5.1　动作栏/188\n7.5.2　界面片段/191\n7.5.3　重新定制选项卡/197\n7.5.4　交互界面的适配/200\n7.6　小结/204\n第8章　应用资源/205\n8.1　Android应用资源体系/206\n8.1.1　Android的应用资源构成/206\n8.1.2　应用资源的适配/208\n8.1.3　应用资源的动态匹配/209\n8.2　应用资源的调用/213\n8.2.1　应用资源的编译和R类/213\n8.2.2　应用资源的管理/215\n8.2.3　使用应用资源/216\n8.3　应用资源的类型/217\n8.3.1　界面和样式/217\n8.3.2　字符串和常量/221\n8.3.3　图像、图形和动画/223\n8.3.4　其他资源文件/225\n8.4　小结/225\n第9章　数据存储/226\n9.1　Android的文件系统/227\n9.1.1　Android的目录结构/229\n9.1.2　Android的应用数据存储/229\n9.1.3　Android的文件操作/231\n9.2　使用设置文件/233\n9.2.1　设置文件的存储和使用/234\n9.2.2　设置界面组件/235\n9.3　使用数据库/238\n9.3.1　Android数据库实现/238\n9.3.2　Android数据库的使用/240\n9.4　存储在云端/243\n9.4.1　云端存储的架构/244\n9.4.2　云端存储的使用/245\n9.5　小结/247\n第10章　网络通信/248\n10.1　Web通信/249\n10.1.1　基于HTTP的网络连接/249\n10.1.2　联网方式的选择/252\n10.1.3　WiFi的管理/254\n10.2　蓝牙/256\n10.2.1　Android的蓝牙实现/256\n10.2.2　基于蓝牙的通信/257\n10.3　近场通信/259\n10.3.1　基于NFC的识别和通信/259\n10.3.2　基于NFC的点对点通信/263\n10.4　基于WiFi连接的P2P通信/263\n10.4.1　Android 4.0的P2P连接实现/264\n10.4.2　使用Socket进行数据传输/266\n10.5　小结/268\n第11章　地理信息服务/269\n11.1　Android的定位服务/270\n11.1.1　定位服务框架/270\n11.1.2　位置信息源/272\n11.1.3　定位选择/273\n11.1.4　定位实例/274\n11.2　Android的地址服务/277\n11.2.1　地址服务的框架/277\n11.2.2　使用地址服务/278\n11.3　Android的地图服务/279\n11.3.1　使用地图/279\n11.3.2　其他使用地图服务的方式/282\n11.4　小结/283\n第12章　多媒体处理/284\n12.1　Android的图像处理/285\n12.1.1　图像的表示/285\n12.1.2　图像的读取和输出/286\n12.1.3　图像的呈现/288\n12.1.4　图像的管理/290\n12.2　Android的音视频处理/291\n12.2.1　Android音视频的支持框架/291\n12.2.2　Android音视频的播放/292\n12.2.3　Android音视频的录制/294\n12.3　Android中相机的使用/296\n12.4　小结/300\n第13章　其他重要模块/301\n13.1　通话和短信/302\n13.1.1　Android的通话和短信框架/302\n13.1.2　通话的处理/303\n13.1.3　短信的发送和接收/305\n13.2　App Widget的使用和实现/308\n13.2.1　Android的App Widget框架/309\n13.2.2　App Widget的界面构造和Remote Views /311\n13.2.3　App Widget的事件处理和Pending Intent /313\n13.3　Android的应用内搜索/317\n13.3.1　Android应用内搜索实现框架/317\n13.3.2　为应用定制搜索功能/318\n13.3.3　全局搜索功能/322\n13.4　Android的全局通知机制/323\n13.4.1　全局通知的类型和实现/324\n13.4.2　Toast的使用/325\n13.4.3　状态栏通知/327\n13.5　Android联系人处理/331\n13.5.1　Android联系人数据存储框架/331\n13.5.2　Android联系人操作/332\n13.6　小结/334","ebook_url":"https://read.douban.com/ebook/15171473/","pages":"356","images":{"small":"https://img1.doubanio.com/spic/s11184539.jpg","large":"https://img1.doubanio.com/lpic/s11184539.jpg","medium":"https://img1.doubanio.com/mpic/s11184539.jpg"},"alt":"https://book.douban.com/subject/11530748/","id":"11530748","publisher":"机械工业出版社","isbn10":"711139058X","isbn13":"9787111390589","title":"Android开发精要","url":"https://api.douban.com/v2/book/11530748","alt_title":"","author_intro":"范怀宇，资深Android开发工程师，毕业于清华大学，从事移动开发多年，对Android系统有颇为深入的研究，开发经验十分丰富。曾就职于网易有道，负责完成了有道词典Android版、网易掌上邮Android版、网易八方Android版等项目的开发工作，现就职于豌豆实验室 ，负责豌豆荚2.0版本的设计和开发。\n作者微博：@duguguiyu（http://weibo.com/duguguiyu）\n个人站点：http://flyvenus.net","summary":"《Android开发精要》如何才能写出贴近Android设计理念、能够更加高效和可靠运行的Android应用？通过Android的源代码去了解其底层实现细节是最重要的方法之一！然而，Android系统太过于庞大，源代码实现复杂，学习的技术门槛和时间成本都很高。有没有一种方法既能帮助开发者深入理解Android应用开发，又能不被底层大量的实现细节所羁绊，迅速掌握编写高质量Android应用所需的知识？《Android开发精要》针对这个问题给出了完美的答案！它从Android繁杂的源代码中抽取出了Android开发的\u201c精华\u201d和\u201c要点\u201d，剥离了大量琐碎的底层实现细节，进行了高度概括和总结，不仅能帮助开发者迅速从宏观上理解整个Android系统的设计理念，而且能帮助开发者迅速从微观上掌握核心知识点的原理，从而编写出高质量的Android应用。\n《Android开发精要》共13章，在逻辑上分为4个部分。第一部分（1-2章）：第1章系统介绍了Android的系统架构、核心模块和设计思想，旨在让读者真正理解它的设计理念；第2章讲解了Android源代码的获取、编译、阅读和编辑的方法。第二部分（3-6章）：第3章深入阐述了Android组件机制的设计理念和重要特征，并详细介绍了4大组件的方法和原理；第4章讲解了Intent对象和Android的意图机制，阐明了Android是如何将来自不同应用、不同进程的组件整合在一起的；第5章解析了Android中各个组件的生命周期，包括组件的进程模型和线程模型；第6章从开发的角度详细阐述了组件间数据传递的解决方案，以及它们的优缺点和适用场景。第三部分（7-8章）：第7章深入讲解了Android的控件框架，结合实际项目对重要控件的实现和使用逐一进行了分析，还包含Android 4.0界面开发的实践\u201c精华\u201d；第8章分析了Android的资源体系，剖析了Android底层对资源的处理。第4部分（9-13章）：第9章讲解了Android的数据存储结构，以及不同数据存储模式的使用要点；第10章分析了Android的各种网络连接方式，涵盖NFC和基于Wifi的P2P连接等内容；第11章讲解了Android的定位服务、地址解析服务、地图服务的框架实现；第12章仔细分析了Android各种多媒体功能的实现机制；第13章对Android中比较有特色的一些模块的实现细节进行了分析。\n海报：","ebook_price":"25.00","price":"69.00元"},{"rating":{"max":10,"numRaters":241,"average":"6.4","min":0},"subtitle":"","author":["姚尚朗","靳岩"],"pubdate":"2009 年6月","tags":[{"count":236,"name":"Android","title":"Android"},{"count":54,"name":"Google","title":"Google"},{"count":51,"name":"编程","title":"编程"},{"count":40,"name":"应用开发","title":"应用开发"},{"count":32,"name":"程序设计","title":"程序设计"},{"count":24,"name":"计算机","title":"计算机"},{"count":21,"name":"java","title":"java"},{"count":20,"name":"programming","title":"programming"}],"origin_title":"","image":"https://img3.doubanio.com/mpic/s3817805.jpg","binding":"16开","translator":[],"catalog":"第1章　掀起你的盖头来\u2014\u2014初识android　1\n1.1　认识android　1\n1.2　android的背景　2\n1.2.1　android的历史　2\n1.2.2　android的发展　2\n1.3　我的android我做主　2\n1.3.1　开发基于android平台的应用　3\n1.3.2　参加android开发者大赛　3\n1.3.3　个人英雄主义再现\u2014\u2014得到更多人的认可和尊重　3\n1.3.4　获得应有的收益\u2014\u2014android market　3\n1.4　真实体验\u2014\u2014android模拟器　4\n1.4.1　模拟器概述　4\n1.4.2　模拟器和真机的区别　4\n1.4.3　模拟器使用注意事项　4\n1.5　更上一层楼\u2014\u2014加入android开发社区　5\n1.6　本章小结　6\n第2章　工欲善其事　必先利其器\u2014\u2014搭建android开发环境　7\n2.1　开发android应用前的准备　7\n2.1.1　android开发系统要求　7\n2.1.2　android软件开发包　7\n2.1.3　其他注意事项　8\n2.2　windows开发环境搭建　8\n2.2.1　jdk、eclipse、android sdk软件安装　8\n2.2.2　sdk的家在哪里\u2014\u2014设定android sdk home　14\n2.2.3　真的准备好了吗\u2014\u2014开发环境验证　14\n2.2.4　创建android 虚拟设备(avd)　15\n2.3　linux一族\u2014\u2014ubuntu开发环境搭建　17\n2.3.1　java、eclipse和adt插件安装　17\n2.3.2　设定android sdk home　23\n2.4　mac os一族\u2014\u2014苹果开发环境搭建　24\n2.5　本章小结　24\n第3章　清点可用资本\u2014\u2014android sdk介绍　25\n3.1　android sdk 基础　25\n3.2　深入探寻android sdk的密码　25\n3.2.1　android sdk目录结构　25\n3.2.2　android.jar及内部结构　27\n3.2.3　sdk文档及阅读技巧　27\n3.2.4　先来热热身\u2014\u2014android sdk例子解析　28\n3.2.5　sdk提供的工具介绍　31\n3.3　android典型包分析　33\n3.3.1　开发的基石\u2014\u2014android api核心开发包介绍　33\n3.3.2　拓展开发外延\u2014\u2014android可选api介绍　34\n3.4　本章小结　34\n第4章　赚钱的市场\u2014\u2014android market及应用发布　35\n4.1　google market产生背景与目的　35\n4.2　体验\u201c选货\u201d的乐趣\u2014\u2014在g1上体验market的使用　35\n4.3　android开发活动及特色应用　37\n4.3.1　开发应用的领域　37\n4.3.2　android market特色应用一览　38\n4.4　你也可以做东家\u2014\u2014申请market账号　43\n4.4.1　卖东西要先入伙\u2014\u2014准备工作　43\n4.4.2　入伙过程\u2014\u2014申请　44\n4.5　开张了\u2014\u2014在market上发布应用　45\n4.5.1　发布时可能遇到的错误　45\n4.5.2　卖东西也要签名\u2014\u2014生成签名文件　46\n4.5.3　打包、签名、发布应用　48\n4.6　本章小结　51\n第5章　千里之行 始于足下\u2014\u2014第一个应用helloworld　52\n5.1　helloworld应用分析　52\n5.1.1　新建一个android工程　52\n5.1.2　填写工程的信息　52\n5.1.3　编程实现　53\n5.1.4　运行项目　54\n5.2　调试项目　54\n5.2.1　设置断点　54\n5.2.2　debug 项目　55\n5.2.3　断点调试　55\n5.3　本章小结　56\n第6章　磨刀不误砍柴工\u2014\u2014android应用程序结构介绍　57\n6.1　android体系结构介绍　57\n6.1.1　应用程序(application)　57\n6.1.2　应用程序框架(application framework)　58\n6.1.3　库(libraries)和运行环境(runtime)　58\n6.2　android 应用程序组成　59\n6.2.1　activity介绍　59\n6.2.2　broadcast intent receiver介绍　60\n6.2.3　service介绍　61\n6.2.4　content provider介绍　61\n6.3　android应用工程文件组成　61\n6.4　本章小结　62\n第7章　良好的学习开端\u2014\u2014android基本组件介绍　63\n7.1　第一印象很重要\u2014\u2014界面ui元素介绍　63\n7.1.1　视图组件(view)　63\n7.1.2　视图容器组件(viewgroup)　63\n7.1.3　布局组件(layout)　64\n7.1.4　布局参数(layoutparams)　64\n7.2　我的美丽我做主\u2014\u2014android中应用界面布局　64\n7.2.1　实例操作演示　65\n7.2.2　实例编程实现　66\n7.3　不积跬步 无以至千里\u2014\u2014常用widget组件介绍　75\n7.3.1　创建widget组件实例　75\n7.3.2　按钮(button)介绍与应用　76\n7.3.3　文本框(textview)介绍与应用　77\n7.3.4　编辑框(edittext)介绍与应用　79\n7.3.5　多项选择(checkbox)介绍与应用　81\n7.3.6　单项选择(radiogroup )介绍与应用　83\n7.3.7　下拉列表(spinner )介绍与应用　85\n7.3.8　自动完成文本(autocompletetextview )　87\n7.3.9　日期选择器(datepicker)介绍与应用　89\n7.3.10　时间选择器(timepicker)介绍与应用　90\n7.3.11　滚动视图(scrollview)介绍与应用　91\n7.3.12　进度条(progressbar)介绍与应用　92\n7.3.13　拖动条(seekbar)介绍与应用　93\n7.3.14　评分组件(ratingbar)介绍与应用　94\n7.3.15　图片视图(imageview)介绍与应用　95\n7.3.16　图片按钮(imagebutton)介绍与应用　96\n7.3.17　切换图片(imageswitcher&gallery)　96\n7.3.18　网格视图(gridview)介绍与应用　99\n7.3.19　标签(tab)介绍与应用　101\n7.4　友好的菜单\u2014\u2014menu介绍与实例　102\n7.4.1　实例操作演示..　103\n7.4.2　实例编程实现　103\n7.5　android应用的灵魂\u2014\u2014intent和activity介绍与实例　106\n7.5.1　实例操作演示　106\n7.5.2　实例编程实现　106\n7.6　用好列表，做好程序\u2014\u2014列表(listview)介绍与实例　111\n7.6.1　实例程序演示　111\n7.6.2　实例编程实现　112\n7.7　友好地互动交流\u2014\u2014对话框(dialog)介绍与实例　119\n7.8　温馨的提醒\u2014\u2014toast和notification应用　127\n7.8.1　实例操作演示　128\n7.8.2　实例编程实现　129\n7.9　本章小结　135\n第8章　移动信息仓库\u2014\u2014android的数据存储操作　136\n8.1　android数据存储概述　136\n8.2　轻轻地我保护\u2014\u2014sharedpreferences存储　136\n8.3　谁的文件，谁主宰\u2014\u2014文件存储　140\n8.4　打造自己的数据库存储\u2014\u2014sqlite存储方式　141\n8.4.1　android中对数据库操作　141\n8.4.2　完整地操作数据库\u2014\u2014日记本实例　147\n8.5　我的数据你来用\u2014\u2014contentprovider介绍　155\n8.5.1　初识contentprovider　155\n8.5.2　使用contentprovider读取系统数据　156\n8.5.3　使用contentprovider操作数据日记本实例　159\n8.6　再学一招\u2014\u2014网络存储　171\n8.7　本章小结　173\n第9章　我来\u201c广播\u201d你的\u201c意图\u201d\u2014\u2014intent和broadcast面对面　174\n9.1　android应用程序的核心\u2014\u2014intent　174\n9.1.1　intent基础　174\n9.1.2　用intent启动一个新的activity　174\n9.1.3　intent 详细讲解　177\n9.1.4　android解析intent实现　179\n9.2　用广播告诉你\u2014\u2014利用intent来广播(broadcast)事件　180\n9.2.1　实现android中的广播事件　180\n9.2.2　broadcast receiver介绍　181\n9.3　应用实例详解　181\n9.3.1　程序操作演示　182\n9.3.2　实例编程实现　182\n9.4　本章小结　186\n第10章　一切为用户服务\u2014\u2014service应用实例　187\n10.1　认识service　187\n10.2　使用service　188\n10.3　service的生命周期　194\n10.4　实例学习service　194\n10.4.1　精彩实例一\u2014\u2014定时提醒　194\n10.4.2　精彩实例二\u2014\u2014音乐播放器　198\n10.5　本章小结　201\n第11章　循序渐进\u2014\u2014开发android应用的基本步骤　202\n11.1　兵马未动 粮草先行\u2014\u2014应用规划及架构设计　202\n11.2　应用开发步骤　202\n11.2.1　界面设计始终是第一位\u2014\u2014实现ui　203\n11.2.2　必备的动力源泉\u2014\u2014数据操作和存储　203\n11.2.3　华丽转身\u2014\u2014实现多页面跳转　203\n11.2.4　始终为用户做好服务\u2014\u2014增加service　203\n11.2.5　细节决定成败\u2014\u2014完善应用细节　203\n11.3　成功就在眼前\u2014\u2014应用测试和发布　204\n11.3.1 只欠东风\u2014\u2014应用测试　204\n11.3.2　可以赚钱了\u2014\u2014发布到android market　204\n11.4　本章小结　204\n第12章　android综合案例一\u2014\u2014rss阅读器实例　205\n12.1　rss介绍　205\n12.1.1　rss基础　205\n12.1.2　rss的历史　205\n12.1.3　rss语法介绍　206\n12.2　sax介绍　207\n12.2.1　sax基础　207\n12.2.2　使用sax的作用　207\n12.2.3　怎样使用sax　207\n12.3　rss阅读器设计　209\n12.3.1　rss阅读器功能设计　209\n12.3.2　rss阅读器ui和交互流程设计　209\n12.4　rss阅读器的实现　210\n12.4.1　程序实体解析　210\n12.4.2　实现一个自己的contenthandler　214\n12.4.3　activity的实现　217\n12.5　本章小结　220\n第13章　android综合案例二\u2014\u2014基于google map开发个人移动地图　221\n13.1　项目ui规划　221\n13.2　数据存储实现　222\n13.2.1　设计数据库及表结构　222\n13.2.2　设计sharepreference 存储　223\n13.3　项目实现流程　223\n13.3.1　创建项目工程　223\n13.3.2　项目各功能及界面实现　224\n13.3.3　实现数据存取　247\n13.3.4　实现service　252\n13.3.5　应用流程整体实现　254\n13.3.6　后续开发完善　255\n13.4　项目程序演示　255\n13.5　项目程序签名、打包和发布　257\n13.6　本章小结　259\n第14章　android综合案例三\u2014\u2014基于android的豆瓣网(web 2.0)移动客户端开发　260\n14.1　关于豆瓣网和豆瓣网api　260\n14.1.1　豆瓣网介绍　260\n14.1.2　豆瓣网api介绍　261\n14.1.3　豆瓣网api认证　261\n14.1.4　豆瓣网api快速入门　264\n14.1.5　豆瓣网api java库介绍　265\n14.2　豆瓣网(web 2.0)客户端设计　268\n14.2.1　客户端功能规划设计　268\n14.2.2　ui和交互流程设计　268\n14.2.3　数据存储设计　270\n14.3　豆瓣网(web 2.0)客户端实现　270\n14.3.1　申请api key　270\n14.3.2　activity实现　271\n14.4　本章小结　282\n第15章　android综合案例四\u2014\u2014在线音乐播放器　283\n15.1　关于yobo和yobo api　283\n15.1.1　yobo简介　284\n15.1.2　yobo功能特点　284\n15.1.3　yobo api介绍　284\n15.2　在线播放器架构设计　285\n15.2.1　在线播放器功能规划设计　285\n15.2.2　在线播放器ui设计　285\n15.2.3　在线播放器数据存储设计　286\n15.3　在线播放器的编程实现　286\n15.3.1　申请api key　286\n15.3.2　基础功能实现　287\n15.3.3　实现activity　290\n15.3.4　实现service　306\n15.3.5　后续开发展望　310\n15.4　在线音乐播放器应用演示　310\n15.5　在线音乐播放器应用打包、签名和发布　311\n15.6　本章小结　311\n第16章　android综合案例五\u2014\u2014手机信息查看助手　312\n16.1　手机信息查看助手功能规划和可行性分析　312\n16.1.1　手机信息查看助手功能规划　312\n16.1.2　手机信息查看助手可行性分析　312\n16.2　手机信息查看助手功能实现　313\n16.2.1　手机信息查看助手主界面　313\n16.2.2　查看系统信息实现　316\n16.2.3　查看硬件信息　320\n16.2.4　查看软件信息　324\n16.2.5　获取运行时信息　326\n16.2.6　文件浏览器　328\n16.2.7　项目的细节完善　331\n16.3　手机信息查看助手功能展望　332\n16.4　项目的打包、签名和发布　332\n16.5　本章小结　333\n第17章　芝麻开门\u2014\u2014android底层开发和移植概述　334\n17.1　android原始码下载　334\n17.2　实机测试　335\n17.2.1　neo freerunner 介绍　335\n17.2.2　烧录androidfs.jffs2　336\n17.3　android移植技术概论　337\n17.3.1　android底层技术的重要性　337\n17.3.2　android移植项目介绍　338\n17.3.3　android的技术优点　340","pages":"400","images":{"small":"https://img3.doubanio.com/spic/s3817805.jpg","large":"https://img3.doubanio.com/lpic/s3817805.jpg","medium":"https://img3.doubanio.com/mpic/s3817805.jpg"},"alt":"https://book.douban.com/subject/3770255/","id":"3770255","publisher":"人民邮电出版社","isbn10":"7115209308","isbn13":"9787115209306","title":"Google Android开发入门与实战","url":"https://api.douban.com/v2/book/3770255","alt_title":"","author_intro":"本书由国内Android知名专业开发团队eoeMobile团队倾心撰写。eoeMoblie团队国内最早一批专注于Android开发的专业团队，目前团队已经在Google Market上有超过5款的作品，而且取得了可喜的下载量。国内著名网站豆瓣网的Android客户端(eoeDouban)也是由此团队制作。关于此团队的更多信息请访问:http://www.eoemobile.com.关于图书的进展，可以访问http://www.eoeandroid.com 社区\n作者简介：\n靳岩:\n网名：海阳|haiyangjy\nblog: http://www.haiyangjy.com\n姚尚朗:\n网名:iceskysl\nblog: http://iceskysl.1sters.com\n欢迎大家就书或者Android的问题和我们进行直接的交流。\n社区支持:http://www.eoeandroid.com/","summary":"本书内容上覆盖了用Android开发的大部分场景，从Android基础介绍、环境搭建、SDK介绍、Market使用，到应用剖析、组件介绍、实例演示等方面。从技术实现上，讲解了5个Android平台下的完整综合实例及源代码分析，分别是RSS阅读器、基于Google Map的个人GPS、豆瓣网（Web 2.0）客户端、在线音乐播放器、手机信息助手。\n本书注重对实际动手能力的指导，在遵循技术研发知识体系的严密性同时，在容易产生错误、不易理解的环节配以了详实的开发情景截图，并将重要的知识点和经验技巧以\u201c小实验\u201d、\u201c小知识\u201d的活泼形式呈现给读者。在程序实例的讲解方面，将实例安插在Android开发的精髓知识章节，这为初学者学习与实践结合提供了很好的指导。.\n本书配套有300多分钟的全程开发视频光盘，指导读者快速、无障碍地学通Android实战开发技术。..\n本书适合具备一定软件开发经验，想快速进入Android开发领域的程序员；具备一些手机开发经验的开发者和Android开发爱好者学习用书；也适合作为相关培训学校的Android培训教材。\n特点：\n* 第一本国内开发团队原创的Android图书\n* 完全基于Android最新的SDK1.5\n* 著名台湾技术专家高焕堂、Google Android工程师何峰、InfoQ站长霍泰稳鼎力推荐！\n* 全书除了大量小型案例之外还包含了5个Android平台下的完整商业实例及源码分析，分别是RSS阅读器、基于GoogleMap的个人GPS、豆瓣客户端、在线音乐播放器、手机信息助手\n* 随书附赠的光盘中包含389分钟的详细教学视频以及Android开发必备开发资源，部分教学视频免费下载地址：http://www.eoeandroid.com/viewthread.php?tid=328\n* 读者对于此书内容的疑问可以访问http://www.eoeandroid.com社区，作者团队将会及时解答","price":"55.00元"},{"rating":{"max":10,"numRaters":107,"average":"7.9","min":0},"subtitle":"卷I","author":["邓凡平"],"pubdate":"2011-9-5","tags":[{"count":307,"name":"Android","title":"Android"},{"count":95,"name":"Andriod源码分析","title":"Andriod源码分析"},{"count":36,"name":"编程","title":"编程"},{"count":35,"name":"android","title":"android"},{"count":34,"name":"计算机","title":"计算机"},{"count":23,"name":"计算机科学","title":"计算机科学"},{"count":21,"name":"移动互联网","title":"移动互联网"},{"count":13,"name":"程序设计","title":"程序设计"}],"origin_title":"","image":"https://img3.doubanio.com/mpic/s11171603.jpg","binding":"平装","translator":[],"catalog":"第1章　阅读前的准备工作 / 1\n1.1　系统架构 / 2\n1.1.1　Android系统架构 / 2\n1.1.2　本书的架构 / 3\n1.2　搭建开发环境 / 4\n1.2.1　下载源码 / 4\n1.2.2　编译源码 / 6\n1.3　工具介绍 / 8\n1.3.1　Source Insight介绍 / 8\n1.3.3　Busybox的使用 / 11\n1.4　本章小结 / 12\n第2章　深入理解JNI / 13\n2.1　JNI概述 / 14\n2.2　学习JNI的实例：MediaScanner / 15\n2.3　Java层的MediaScanner分析 / 16\n2.3.1　加载JNI库 / 16\n2.3.2　Java的native函数和总结 / 17\n2.4　JNI层MediaScanner的分析 / 17\n2.4.1　注册JNI函数 / 18\n2.4.2　数据类型转换 / 22\n2.4.3　JNIEnv介绍 / 24\n2.4.4　通过JNIEnv操作jobject / 25\n2.4.5　jstring介绍 / 27\n2.4.6　JNI类型签名介绍 / 28\n2.4.7　垃圾回收 / 29\n2.4.8　JNI中的异常处理 / 32\n2.5　本章小结 / 32\n第3章　深入理解init / 33\n3.1　概述 / 34\n3.2　init分析 / 34\n3.2.1　解析配置文件 / 38\n3.2.2　解析service / 42\n3.2.3　init控制service / 48\n3.2.4　属性服务 / 52\n3.3　本章小结 / 60\n第4章　深入理解zygote / 61\n4.1　概述 / 62\n4.2　zygote分析 / 62\n4.2.1　AppRuntime分析 / 63\n4.2.2　Welcome to Java World / 68\n4.2.3　关于zygote的总结 / 74\n4.3　SystemServer分析 / 74\n4.3.1　SystemServer的诞生 / 74\n4.3.2　SystemServer的重要使命 / 77\n4.3.3　关于 SystemServer的总结 / 83\n4.4　zygote的分裂  / 84\n4.4.1　ActivityManagerService发送请求 / 84\n4.4.2　有求必应之响应请求 / 86\n4.4.3　 关于zygote分裂的总结 / 88\n4.5　拓展思考 / 88\n4.5.1　虚拟机heapsize的限制 / 88\n4.5.2　开机速度优化 / 89\n4.5.3　Watchdog分析 / 90\n4.6　本章小结 / 93\n第5章　深入理解常见类 / 95\n5.1　概述 / 96\n5.2　以\u201c三板斧\u201d揭秘RefBase、sp和wp / 96\n5.2.1　第一板斧\u2014\u2014初识影子对象 / 96\n5.2.2　第二板斧\u2014\u2014由弱生强 / 103\n5.2.3　第三板斧\u2014\u2014破解生死魔咒 / 106\n5.2.4　轻量级的引用计数控制类LightRefBase / 108\n5.2.5　题外话\u2014三板斧的来历 / 109\n5.3　Thread类及常用同步类分析 / 109\n5.3.1　一个变量引发的思考 / 109\n5.3.2　常用同步类 / 114\n5.4　Looper和Handler类分析 / 121\n5.4.1　Looper类分析 / 122\n5.4.2　Handler分析 / 124\n5.4.3　Looper和Handler的同步关系 / 127\n5.4.4　HandlerThread介绍 / 129\n5.5　本章小结 / 129\n第6章　深入理解Binder / 130\n6.1　概述 / 131\n6.2　庖丁解MediaServer / 132\n6.2.1　MediaServer的入口函数 / 132\n6.2.2　独一无二的ProcessState / 133\n6.2.3　时空穿越魔术\u2014defaultServiceManager / 134\n6.2.4　注册MediaPlayerService / 142\n6.2.5　秋风扫落叶\u2014StartThread Pool和join Thread Pool分析 / 149\n6.2.6　你彻底明白了吗 / 152\n6.3　服务总管ServiceManager / 152\n6.3.1　ServiceManager的原理 / 152\n6.3.2　服务的注册 / 155\n6.3.3　ServiceManager存在的意义 / 158\n6.4　MediaPlayerService和它的Client / 158\n6.4.1　查询ServiceManager / 158\n6.4.2　子承父业 / 159\n6.5　拓展思考 / 162\n6.5.1　Binder和线程的关系 / 162\n6.5.2　有人情味的讣告 / 163\n6.5.3　匿名Service / 165\n6.6　学以致用 / 166\n6.6.1　纯Native的Service / 166\n6.6.2　扶得起的\u201c阿斗\u201d（aidl） / 169\n6.7　本章小结 / 172\n第7章　深入理解Audio系统 / 173\n7.1　概述 / 174\n7.2　AudioTrack的破解 / 174\n7.2.1　用例介绍 / 174\n7.2.2　AudioTrack（Java空间）分析 / 179\n7.2.3　AudioTrack（Native空间）分析 / 188\n7.2.4　关于AudioTrack的总结 / 200\n7.3　AudioFlinger的破解 / 200\n7.3.1　AudioFlinger的诞生 / 200\n7.3.2　通过流程分析AudioFlinger / 204\n7.3.3　audio_track_cblk_t分析 / 230\n7.3.4　关于AudioFlinger的总结 / 234\n7.4　AudioPolicyService的破解 / 234\n7.4.1　AudioPolicyService的创建 / 235\n7.4.2　重回AudioTrack / 245\n7.4.3　声音路由切换实例分析 / 251\n7.4.4　关于AudioPolicy的总结 / 262\n7.5　拓展思考 / 262\n7.5.1　DuplicatingThread破解 / 262\n7.5.2　题外话 / 270\n7.6　本章小结 / 272\n第8章　深入理解Surface系统 / 273\n8.1　概述 / 275\n8.2　一个Activity的显示 / 275\n8.2.1　Activity的创建 / 275\n8.2.2　Activity的UI绘制 / 294\n8.2.3　关于Activity的总结 / 296\n8.3　初识Surface / 297\n8.3.1　和Surface有关的流程总结 / 297\n8.3.2　Surface之乾坤大挪移 / 298\n8.3.3　乾坤大挪移的JNI层分析 / 303\n8.3.4　Surface和画图 / 307\n8.3.5　初识Surface小结 / 309\n8.4　深入分析Surface / 310\n8.4.1　与Surface相关的基础知识介绍 / 310\n8.4.2　SurfaceComposerClient分析 / 315\n8.4.3　SurfaceControl分析 / 320\n8.4.4　writeToParcel和Surface对象的创建 / 331\n8.4.5　lockCanvas和unlockCanvasAndPost分析 / 335\n8.4.6　GraphicBuffer介绍 / 344\n8.4.7　深入分析Surface的总结 / 353\n8.5　SurfaceFlinger分析 / 353\n8.5.1　SurfaceFlinger的诞生 / 354\n8.5.2　SF工作线程分析 / 359\n8.5.3　Transaction分析 / 368\n8.5.4　关于SurfaceFlinger的总结 / 376\n8.6　拓展思考 / 377\n8.6.1　Surface系统的CB对象分析 / 377\n8.6.2　ViewRoot的你问我答 / 384\n8.6.3　LayerBuffer分析 / 385\n8.7　本章小结 / 394\n第9章　深入理解Vold和Rild / 395\n9.1　概述 / 396\n9.2　Vold的原理与机制分析 / 396\n9.2.1　Netlink和Uevent介绍 / 397\n9.2.2　初识Vold / 399\n9.2.3　NetlinkManager模块分析 / 400\n9.2.4　VolumeManager模块分析 / 408\n9.2.5　CommandListener模块分析 / 414\n9.2.6　Vold实例分析 / 417\n9.2.7　关于Vold的总结 / 428\n9.3　Rild的原理与机制分析 / 428\n9.3.1　初识Rild / 430\n9.3.2　RIL_startEventLoop分析 / 432\n9.3.3　RIL_Init分析 / 437\n9.3.4　RIL_register分析 / 444\n9.3.5　关于Rild main函数的总结 / 447\n9.3.6　Rild实例分析 / 447\n9.3.7　关于Rild的总结 / 459\n9.4　拓展思考 / 459\n9.4.1　嵌入式系统的存储知识介绍 / 459\n9.4.2　Rild和Phone的改进探讨 / 462\n9.5　本章小结 / 463\n第10章　深入理解MediaScanner / 464\n10.1　概述 / 465\n10.2　android.process.media分析 / 465\n10.2.1　MSR模块分析 / 466\n10.2.2　MSS模块分析 / 467\n10.2.3　android.process.media媒体扫描工作的流程总结 / 471\n10.3　MediaScanner分析 / 472\n10.3.1　Java层分析 / 472\n10.3.2　JNI层分析 / 476\n10.3.3　PVMediaScanner分析 / 479\n10.3.4　关于MediaScanner的总结 / 485\n10.4　拓展思考 / 486\n10.4.1　MediaScannerConnection介绍 / 486\n10.4.2　我问你答 / 487\n10.5　本章小结 / 488","pages":"488","images":{"small":"https://img3.doubanio.com/spic/s11171603.jpg","large":"https://img3.doubanio.com/lpic/s11171603.jpg","medium":"https://img3.doubanio.com/mpic/s11171603.jpg"},"alt":"https://book.douban.com/subject/6802440/","id":"6802440","publisher":"机械工业出版社","isbn10":"7111357620","isbn13":"9787111357629","title":"深入理解Android","url":"https://api.douban.com/v2/book/6802440","alt_title":"","author_intro":"邓凡平，资深Android开发工程师，热衷于Android源代码的研究，对Android的架构设计和实现原理有非常深刻的认识和理解，应用开发经验也十分丰富。目前就职于国内一家领先的Android企业，负责Framework的开发和维护。乐于分享，活跃于CSDN等专业社区，撰写的Android Framework源码的系列文章深受读者欢迎。此外，他对Linux内核、C/C++/Python相关的技术，以及高性能网络服务器和多核并行开发等也有一定的研究。","summary":"《深入理解Android：卷I》是一本以情景方式对Android的源代码进行深入分析的书。内容广泛，以对Framework层的分析为主，兼顾Native层和Application层；分析深入，每一部分源代码的分析都力求透彻；针对性强，注重实际应用开发需求，书中所涵盖的知识点都是Android应用开发者和系统开发者需要重点掌握的。\n全书共10章，第1章介绍了阅读本书所需要做的准备工作，主要包括对Android系统架构和源码阅读方法的介绍；第2章通过对Android系统中的MediaScanner进行分析，详细讲解了Android中十分重要的JNI技术；第3章分析了init进程，揭示了通过解析init.rc来启动Zygote以及属性服务的工作原理；第4章分析了Zygote、SystemServer等进程的工作机制，同时还讨论了Android的启动速度、虚拟机HeapSize的大小调整、Watchdog工作原理等问题；第5章讲解了Android系统中常用的类，包括sp、wp、RefBase、Thread等类，同步类，以及Java中的Handler类和Looper类，掌握这些类的知识后方能在后续的代码分析中做到游刃有余；第6章以MediaServer为切入点，对Android中极为重要的Binder进行了较为全面的分析，深刻揭示了其本质。第7章对Audio系统进行了深入的分析，尤其是AudioTrack、AudioFlinger和AudioPolicyService等的工作原理。第8章深入讲解了Surface系统的实现原理，分析了Surface与Activity之间以及Surface与SurfaceFlinger之间的关系、SurfaceFlinger的工作原理、Surface系统中的帧数据传输以及LayerBuffer的工作流程。第9章对Vold和Rild的原理和机制进行了深入的分析，同时还探讨了Phone设计优化的问题；第10章分析了多媒体系统中MediaScanner的工作原理。\n本书适合有一定基础的Android应用开发工程师和系统工程师阅读。通过对本书的学习，大家将能更深刻地理解Android系统，从而自如应对实际开发中遇到的难题。","series":{"id":"28292","title":"深入理解Android"},"price":"69.00元"},{"rating":{"max":10,"numRaters":232,"average":"6.6","min":0},"subtitle":"","author":["杨丰盛"],"pubdate":"2010-1","tags":[{"count":174,"name":"Android","title":"Android"},{"count":61,"name":"Android开发","title":"Android开发"},{"count":32,"name":"编程","title":"编程"},{"count":27,"name":"软件开发","title":"软件开发"},{"count":27,"name":"Android应用开发揭秘","title":"Android应用开发揭秘"},{"count":25,"name":"计算机","title":"计算机"},{"count":12,"name":"移动开发","title":"移动开发"},{"count":10,"name":"Google","title":"Google"}],"origin_title":"","image":"https://img1.doubanio.com/mpic/s4143787.jpg","binding":"平装","translator":[],"catalog":"前言\n第一部分 准备篇\n第1章 android开发简介\n1.1 android基本概念\n1.1.1 android简介\n1.1.2 android的系统构架\n1.1.3 android应用程序框架\n1.2 oms介绍\n1.2.1 ophone介绍\n1.2.2 widget介绍\n1.3 小结\n第2章 android开发环境搭建\n2.1 android开发准备工作\n2.2 开发包及其工具的安装和\n配置\n2.2.1 安装jdk和配置java开发\n环境\n2.2.2 eclipse的安装与汉化\n2.2.3 sdk和adt的安装和\n.配置\n2.3 创建第一个android项目\u2014\u2014heuoandroid\n2.3.1 创建helloandroid项目\n2.3.2 运行helloandroid及模拟器的使用\n2.3.3 调试helloandroid\n2.4 小结\n第二部分 基础篇\n第3章 android程序设计基础\n3.1 android程序框架\n3.1.1 android项目目录结构\n3.1.2 android应用解析\n3.2 android的生命周期\n3.3 android程序u设计\n3.4 小结\n第4章 用户界面开发\n4.1 用户界面开发详解\n4.1.1 用户界面简介\n4.1.2 事件处理\n4.2 常用控件应用\n4.2.1 文本框(textiew)\n4.2.2 列表(listview)\n4.2.3 提示(t0ast)\n4.2.4 编辑框(edittext)\n4.2.5 单项选择(radiogroup、radiobutton\n4.2.6 多项选择(checkbox)\n4.2.7 下拉列表(spinner)\n4.2.8 自动提示(autocomplete.textⅵew)\n4.2.9 日期和时间(datepicker、timepicker)\n4.2.10 按钮(button)\n4.2.1l 菜单(menu)\n4.2.12 对话框(dialog)\n4.2.13 图片视图(imageview)\n4.2.14 带图标的按钮(imagebutton)\n4.2.15 拖动效果(gallery)\n4.2.16 切换图片(hmgeswilcher)\n4.2.17 网格视图(gridview)\n4.2.18 卷轴视图(scrollview)\n4.2.19 进度条(progressbar)\n4.2.20 拖动条(seekbar)\n4.2.21 状态栏提示(notification、notificationmanager)\n4.2.22 对话框中的进度条(progressdialog)\n4.3 界面布局\n4.3.1 垂直线性布局\n4.3.2 水平线性布局\n4.3.3.相对布局(relativelayout)\n4.3.4 表单布局(tablelayout)\n4.3.5 切换卡(tabwidget)\n4,4 小结\n第5章 android游戏开发\n5.1 android游戏开发框架\n5.1.1 view类开发框架\n5.1.2 surfaceview类开发框架\n5.2 graphics类开发\n5.5.1 paint和color类介绍\n5.2.2 canvas类介绍\n5.2.3 几何图形绘制\n5.2.4 字符串绘制\n5.2.5 图像绘制\n5.2.6 图像旋转\n5.2.7 图像缩放\n5.2.8 图像像素操作\n5.2.9 shader类介绍\n5.2.10 双缓冲技术\n5.2.11 全屏显示\n5.2.12 获得屏幕属性\n5.3 动画实现\n5.3.1 tween动画\n5.3.2 frame动画\n5.3.3 gif动画播放\n5.4 小结\n第6章 android数据存储\n6.1 android数据存储初探\n6.2 数据存储之shared preferences\n6.3 数据存储之files\n6.4 数据存储之network\n6.5 android数据库编程\n6.5.1 sqlite简介\n6.5.2 sqlite编程详解\n6.5.3 sqliteopenhelper应用\n6.6 数据共享(contentproviders)\n6.7 小结\n第7 章多媒体开发\n7.1 多媒体开发详解\n7.1.1 open core\n7.1.2 mediaplayer\n7.1.3 mediarecorder\n7.2 播放音乐\n7.3 播放视频\n7.4 录制歌曲\n7.5 相机设置\n7.6 闹钟设置\n7.7 铃声设置\n7.8 小结\n第8章 网络与通信\n8.1 网络通信基础\n8.1.1 无线网络技术\n8.1.2 android网络基础\n8.2 http通信\n8.2.1 httpurlconnection接口\n8.2.2 httpclient接口\n8.2.3 实时更新\n8.3 socket通信\n8.3.1 socket基础\n8.3.2 socket应用(简易聊天室)\n8.4 网络通信的中文乱码问题\n8.5 webkit应用\n8.5.1 webkjt概述\n8.5.2 webview浏览网页\n8.5.3 webview与javascript\n8.6 wtfi介绍\n8.7 蓝牙\n8.8 小结\n第9章 android特色开发\n9.1 传感器\n9.2 语音识别\n9.3 googlemap\n9.3.1 googlemap概述\n9.3.2 准备工作\n9.3.3 googlemapapi的使用\n9.3.4 定位系统\n9.4 桌面组件\n9.4.1 快捷方式\n9.4.2 实时文件夹\n9.4.3 widget开发\n9.5 账户管理\n9.6 小结\n第三部分 实例篇\n第10章 android应用开发\n实例\n10.1 情境模式\n10.2 文件管理器\n10.3 通讯录\n10.4 音乐播放器\n10.5 天气预报\n10.6 个人地图\n10.7 widget日历\n10.8 小结\n第11 章android游戏开发实例\n11.1 手机游戏开发简介\n11.2 游戏框架设计\n11.3 地图设计\n11.4 主角设计\n11.5 图层管理器\n11.6 游戏音效\n11.7 游戏存档\n11.8 小结\n第四部分 高级篇\n第12章 androidopengl开发\n基础\n12.1 opengl简介\n12.2 多边形\n12.3 颜色\n12.4 旋转\n12.5 3d 空间\n12.6 纹理映射\n12.7 光照和事件\n12.8 混合\n12.9 小结\n第13章 androidopengl综合\n应用\n13.1 移动图像\n13.2.3d 世界\n13.3 飘动的旗帜\n13.4 显示列表\n13.5 雾\n13.6 粒子系统\n13.7 蒙版\n13.8 变形\n13.9 小结\n第14章 游戏引擎实现\n14.1 游戏引擎介绍\n14.1.1 什么是引擎\n14.1.2 引擎的进化\n14.1.3 常见的游戏引擎\n14.1.4 android游戏引擎\n14.2 游戏引擎结构\n14.2.1 游戏引擎原理\n14.2.2 游戏引擎定位\n14.2.3 游戏引擎框架\n14.3 游戏引擎设计\n14.3.1 游戏引擎结构和功能\n设计\n14.3.2 游戏引擎设计注意事项\n14.4 游戏引擎实现\n14.4.1 activity类实现\n14.4.2 流程控制和线程\n14.4.3 游戏对象与对象管理\n14.4.4 图形引擎\n14.4.5 物理引擎\n14.4.6 事件模块\n14.4.7 工具模块\n14.4.8 脚本引擎、音效模块、网络\n模块\n14.5 小结\n第15章 优化技术\n15.1 优化的基本知识\n15.1.1 如何书写出优秀代码\n15.1.2 编程规范\n15.2 程序性能测试\n15.2.1 计算性能测试\n15.2.2 内存消耗测试\n15.3 初级优化\n15.4 高级优化\n15.5 android高效开发\n15.6 androidui优化\n15.7 其他优化\n15.7.1 zipalign\n15.7.2 图片优化\n15.8 小结\n第五部分 扩展篇\n第16章 android ndk开发\n16.1 androidndk简介\n16.2 安装和配置ndk开发环境\n16.2.1 系统和软件需求\n16.2.2 ndk开发环境搭建\n16.2.3 编译第一个ndk程序\n16.3 androidndk开发\n16.3.1 jni接口设计\n16.3.2 使用c\\c++实现本地\n方法\n16.3.3 android.mk实现\n16.3.4 application.mk实现\n16.3.5 编译c\\c++代码\n16.4 androidndk中使用0pengl\n16.5小结\n第17章 android脚本环境\n17.1 android脚本环境简介\n17.2 android脚本环境安装\n17.3如何编写android脚本程序\n17.4小结","ebook_url":"https://read.douban.com/ebook/15091353/","pages":"515","images":{"small":"https://img1.doubanio.com/spic/s4143787.jpg","large":"https://img1.doubanio.com/lpic/s4143787.jpg","medium":"https://img1.doubanio.com/mpic/s4143787.jpg"},"alt":"https://book.douban.com/subject/4200822/","id":"4200822","publisher":"机械工业出版社","isbn10":"7111291956","isbn13":"9787111291954","title":"Android应用开发揭秘","url":"https://api.douban.com/v2/book/4200822","alt_title":"","author_intro":"Android应用开发先驱，对Android有深入研究，实战经验极其丰富。精通Java、C、C++等语言，专注于移动通信软件开发，在机顶盒软件开发和MTK平台软件开发方面有非常深厚的积累。2007年获得中国软件行业协会游戏软件分会(CGIA)认证及国际游戏开发教育联合会国际认证。曾经领导和参与《三国群英传说》、《大航海传奇》、《美少女养成计划》等经典游戏的开发。","summary":"内容简介：\n阿国内第一本基于Android 2.0的经典著作，5大专业社区联袂推荐，权威性毋庸置疑！\n本书内容全面，不仅详细讲解了Android框架、Android组件、用户界面开发、游戏开发、数据存储、多媒体开发和网络开发等基础知识，而且还深入阐述了传感器、语音识别、桌面组件开发、Android游戏引擎设计、Android应用优化、OpenGL等高级知识，最重要的是还全面介绍了如何利用原生的C/C++（NDK）和Python、Lua等脚本语言（Android Scripting Environment）来开发Android应用；本书实战性强，书中的每个知识点都有配精心设计的示例，尤为值得一提的是，它还以迭代的方式重现了各种常用的Android应用和经典Android游戏的开发全过程，既可以以它们为范例进行实战演练，又可以将它们直接应用到实际开发中去。\nWindows操作系统的诞生成就了微软的霸主地位，也造就了PC时代的繁荣。然而，以Android和iPhone手机为代表的智能移动设备的发明却敲响了PC时代的丧钟！移动互联网时代（3G时代）已经来临，谁会成为这些移动设备上的主宰？毫无疑问，它就是Android\u2014\u2014PC时代的Windows！\n移动互联网还是一个新生的婴儿，各种移动设备上的操作系统群雄争霸！与Symbian、iPhone OS、Windows Mobile相比，Android有着天生的优势\u2014\u2014完全开放和免费，对广大开发者和手机厂商而言，这是何等的诱人！此外，在Google和以其为首的Android手机联盟的大力支持和推广下，Android不仅得到了全球开发者社区的关注，而且一大批世界一流的手机厂商都已经或准备采用Android。\n拥抱Android开发，拥抱移动开发的未来！\n如果你在思考下面的问题，也许本书就是你想要的：\n·Android开发与传统的J2ME开发有何相似与不同？\n·如何通过Shared Preferences、Files、Network和SQLite等方式高效实现Android数据的存储？又如何通过Content Providers轻松地实现Android数据的共享？\n·如何使用Open Core、MediaPlayer、MediaRecorder方便快速地开发出包含音频和视频等流媒体的丰富多媒体应用？\n·如何利用Android 2.0中新增的蓝牙特性开发包含蓝牙功能的应用？又如何使用蓝牙API来完善应用的网络功能？\n·如何解决Android网络通信中的乱码问题？\n·在Android中如何使用语音服务和 Google Map API？Android如何访问摄像头、传感器等硬件的API？\n·如何进行Widget开发？如何用各种Android组件来打造漂亮的UI界面？\n·Android如何解析XML数据？又如何提高解析速度和减少对内存、CPU资源的消耗？\n·如何使用OpenGL ES在Android平台上开发出绚丽的3D应用？在Android平台上如何更好地设计和实现游戏引擎？\n·如何对Android应用进行优化？如何进行程序性能测试？如何实现UI、zipalign和图片优化？\n·如何通过NDK利用C、C++以及通过ASE利用Python等脚本语言开发Android应用？","ebook_price":"25.00","price":"69.00元"},{"rating":{"max":10,"numRaters":122,"average":"7.7","min":0},"subtitle":"","author":["王世江"],"pubdate":"2009-11","tags":[{"count":191,"name":"Android","title":"Android"},{"count":49,"name":"编程","title":"编程"},{"count":41,"name":"入门","title":"入门"},{"count":25,"name":"计算机","title":"计算机"},{"count":24,"name":"Google","title":"Google"},{"count":17,"name":"开发入门指南","title":"开发入门指南"},{"count":11,"name":"软件开发","title":"软件开发"},{"count":8,"name":"programming","title":"programming"}],"origin_title":"","image":"https://img1.doubanio.com/mpic/s6089507.jpg","binding":"","translator":[],"catalog":"第1篇　入门篇\n第1章　初探Android\n1.1　Android是什么\n1.2　Android简史\n1.3　从创意开始\n1.4　参考资料\n第2章　安装Android开发工具\n2.1　系统需求\n2.1.1　操作系统\n2.1.2　必要开发工具\n2.1.3　其他开发环境工具（非必要安装）\n2.2　安装流程\n2.3　参考资料\n第3章　打开现有项目\n3.1　打开项目\n3.2　删除项目\n3.3　导入项目\n3.4　修复项目\n3.5　修改对应的目标版本\n3.6　参考资料\n第4章　操作Android模拟器（Emulator）\n4.1　设置环境参数\n4.2　设置Android模拟器\n4.3　使用命令行工具管理模拟器\n4.3.1　列出模拟器类型\n4.3.2　创建模拟器\n4.3.3　列出已创建的模拟器\n4.4　使用运行（Run）模式运行\n4.5　操作Android模拟器\n4.5.1　切换模拟器布局\n4.5.2　切换屏幕\n4.5.3　添加模拟器外观设置\n4.5.4　删除模拟器外观设置\n4.5.5　移除程序\n4.5.6　移除模拟器\n4.6　参考资料\n第5章　创建一个Android应用程序\n5.1　创建新项目\n5.2　程序项目架构\n5.2.1　src/：源代码（source）目录\n5.2.2　gen/：自动生成（Generate）目录\n5.2.3　res/：资源（Resource）目录\n5.2.4　Android功能列表\n5.2.5　\u201cAndroid版本号/\u201d参考函数目录\n5.3　参考资料\n第2篇　基础篇\n第6章　描述用户界面\n6.1　身高体重指数（BMI）计算\n6.2　表达用户界面\n6.3　参考资源\n第7章　设计用户界面\n7.1　视图（View）\n7.2　查阅文件\n7.2.1　线上文件\n7.2.2　脱机文件\n7.3　开始设计\n7.4　整合\n7.5　指定输入类型（InputType）\n7.6　视觉化的界面开发工具\n7.7　参考资料\n第8章　访问标识符号\n8.1　android:id属性\n8.2　XML说明文件与R.java资源文件\n8.3　将字符串抽离XML\n8.4　新增XML文件\n8.5　参考资料\n第9章　解读程序流程\n9.1　基础程序逻辑结构\n9.2　参考函数库\n9.3　参考资料\n第10章　完成BMI程序\n10.1　完整的程序\n10.2　程序解读\n第3篇　提高篇\n第11章　重构程序\n11.1　什么是重构\n11.2　重新查看BMI应用程序\n11.3　MVC模式\n11.4　重构BMI应用程序\n11.5　完整的Bmi.java程序 代码\n11.6　参考资料\n第12章　添加对话框（Dialog）\n12.1　设计对话框\n12.2　定义调用点\n12.3　实体对话框\n12.4　重构\n12.5　添加按钮\n12.6　Toast界面组件\n12.7　错误处理\n12.7.1　讲解\n12.7.2　提取字符串\n12.8　参考资料\n第13章　查看线上内容（Uri）\n13.1　打开网页\n13.1.1　讲解\n13.1.2　使用Uri查看Google地图\n13.2　再做好一点（重构）\n13.2.1　提取字符串\n13.2.2　避免出错\n13.3　参考资料\n第14章　添加菜单（Menu）\n14.1　菜单功能\n14.2　创建菜单\n14.2.1　装饰选项\n14.2.2　使用内置的菜单图标\n14.3　处理选项动作\n14.4　参考资料\n第15章　定义Android列表（Manifest）\n15.1　Android框架\n15.2　预设的Activity列表\n15.3　参考资料\n第16章　添加新活动（Activity）\n16.1　Activity的分类\n16.2　独立的Activity\n16.3　程序中创建新的Activity类文件\n16.4　在列表中添加Activity代码\n16.5　手动添加Activity标签\n16.6　修改页面标题文字\n16.7　原Activity类中添加startActivity函数\n第17章　传送数据到新意图（Intent）\n17.1　使用Intent传递数据\n17.2　使用Intent接收信息\n17.2.1　相关工作\n17.2.2　在Activity中解开信息\n17.2.3　讲解\n17.3　不通过Bundle交换信息\n第18章　信息提醒（Notification）\n18.1　状态栏提醒\n18.2　使用状态栏（Notification Bar）传递信息\n18.3　使用内置的状态图标\n18.4　参考资料\n第19章　日志与调试（Log）\n19.1　在程序中加上调试信息\n19.2　导入Log函数\n19.3　实际应用\n19.3.1　讲解\n19.3.2　其他的记录标记方式\n19.3.3　延伸使用\n19.4　在调试环境中查看除错信息\n19.4.1　启动模拟器\n19.4.2　切换到查错环境配置\n19.4.3　添加信息日志过滤器（Log Filter）\n19.5　模拟器上的调试设置\n19.6　管理日志\n19.7　在实机上调试\n19.8　参考资料\n第20章　活动的生命周期LifeCycle\n20.1　生命周期\n20.2　进程\n20.3　为什么要了解生命周期?\n20.4　Activity的状态\n20.4.1　Active（活动）\n20.4.2　Paused（暂停）\n20.4.3　Stopped（停止）\n20.4.4　Dead（已回收或未启动）\n20.5　系统内存不足时的行为\n20.6　观察Activity运行流程\n20.7　Activity运行流程\n20.7.1　一般启动\n20.7.2　调用另一个Activity\n20.7.3　返回原Activity\n20.7.4　退出结束\n20.7.5　回收后再启动\n20.8　参考资料\n第21章　优先级（Preference）\n21.1　使用优先级设置\n21.2　保存优先级设置\n21.3　参考资料\n第22章　开发不息\n22.1　回顾BMI应用程序\n22.2　BMI应用程序设计的缺陷\n22.3　展望未来\n第4篇　融会贯通篇\n第23章　显性设计\n23.1　做出容易使用的应用程序\n23.2　设计的减法\n23.3　规划应用程序的目标\n23.4　创建新项目\n23.4.1　XML说明文件\n23.4.2　文字字符串文件\n23.4.3　程序代码\n第24章　支持多国语言\n24.1　抽取文本文件\n24.2　让中文、英文多个语言界面并存\n24.3　切换语言\n24.3.1　设置中切换语系\n24.3.2　程序中切换语言\n24.4　参考资料\n第25章　针对特性配置（Orientation）\n25.1　配置资料夹的命名规则\n25.1.1　屏幕方向\n25.1.2　触控类型（Touc-hscreen type）\n25.1.3　文字输入方式（text input）\n25.1.4　浏览方式（navig-ation method）\n25.1.5　屏幕分辨率\n25.2　Android手机配置实例\n25.3　指定屏幕方向\n25.3.1　配置文件中指定屏幕方向\n25.3.2　程序中指定屏幕方向\n25.4　参考资料\n第26章　使用接口（Adapter）\n26.1　接口的概念\n26.2　数组接口（Array Adapter）与字符串数组\n26.3　数组字符串资源文件\n26.4　参考资料\n第27章　添加下拉菜单组件（Spinner）\n27.1　修改XML说明文件\n27.2　添加程序\n27.3　记录所选择的优先级\n27.4　参考资料\n第28章　签发应用程序密钥（Keytools）\n28.1　检查列表\n28.2　手动导出应用程序\n28.3　产生密钥\n28.4　签署密钥\n28.5　验证密钥\n28.6　安装到模拟器\n28.7　发布应用程序\n28.8　参考资料\n第29章　发布到Android Market\n29.1　Android Market的运作方式\n29.2　注册Android Market\n29.3　上传应用程序到Android Market\n29.4　查看成果\u2014\u2014查看管理界面\n29.5　自行提供程序在线下载\n29.6　发布到第三方Android应用程序下载网站\n29.7　针对用户作设计\n29.8　参考资料\n第5篇　数据库应用\n第30章　添加列表活动（ListActivity）\n30.1　分析记事本程序\n30.2　创建新项目\n30.3　修改程序代码\n30.3.1　讲解\n30.3.2　自定义ListView组件\n30.3.3　自定义空列表显示内容\n30.4　参考内置范例\n30.5　参考资料\n第31章　使用数据库（SQLite）\n31.1　SQLite数据库简介\n31.2　查看模拟器目录\n31.3　手动创建\u201cSQLite\u201d数据库\n31.4　创建数据表（table）\n31.5　验证\n31.5.1　离开SQLite互动模式\n31.5.2　重新打开SQLite数据库\n31.6　让Android模拟器通过Proxy上网\n31.6.1　查询数据\n31.6.2　添加数据\n31.6.3　确认数据\n31.6.4　更新数据\n31.6.5　删除数据\n31.7　参考资料\n第32章　访问数据表（SQLite OpenHelper）\n32.1　SQLiteOpenHelper\n32.2　对NotesDbAdapter类加工\n32.3　使用NotesDb Adapter类\n32.3.1　讲解\n32.3.2　验证\n32.4　添加查询\n32.5　完整的程序\n32.6　参考资料\n第33章　添加增删改查操作（CRUD）\n33.1　检索（Retrieve）\n33.1.1　讲解\n33.1.2　验证\n33.2　添加（Create）\n33.2.1　讲解\n33.2.2　验证\n33.3　删除\n33.4　查询单条记录、修改\n33.5　参考资料\n第34章　添加相依的活动（Activity ForResult）\n34.1　定义XML说明文件\n34.2　添加编辑类\n34.3　将新Activity添加列表\n34.4　打开编辑页面\n34.5　完整的程序\n34.6　参考资料\n第35章　添加长按菜单（ContextMenu）\n35.1　添加长按菜单框架\n35.2　填入菜单内容\n35.3　后续改进\n35.4　参考资料\n第6篇　地图与定位应用\n第36章　申请Google地图服务（API Key）\n36.1　取得地点坐标\n36.2　取得Google地图开发密钥（API Key）\n36.2.1　调试用密钥（debug keystore）的位置\n36.2.2　取得MD5指纹信息\n36.3　参考资料\n第37章　使用地图（MapView）\n37.1　Google地图的组成元素\n37.2　创建新项目\n37.3　定义列表\n37.4　定义XML资源文件\n37.5　产生地图\n37.6　直接用程序定义界面组件\n37.7　控制地图\n37.8　添加缩放图标\n37.8.1　修改XML说明文件\n37.8.2　加上缩放控制（Zoom Controls）\n37.9　新版的改进\n37.10　参考资料\n第38章　添加按键控制（KeyEvent）\n38.1　添加菜单\n38.2　添加按键控制\n38.3　控制缩放范围\n38.4　参考文件\n第39章　获取现在位置（GPS/基站三角定位）\n39.1　创建新项目\n39.2　添加使用权限（uses-permission）\n39.3　定义LocationListener界面\n39.4　使用定位服务管理器（locationManager）来获取现在位置\n39.4.1　讲解\n39.4.2　自动判断最佳定位服务来源\n39.5　更新地点（Location Updates）\n39.6　在模拟器中切换地点\n39.7　完整的程序\n39.8　参考资料\n第40章　结合地图与定位功能（My LocationOverlay）\n40.1　添加定位层（MyLocation Overlay）\n40.2　参考资料\n第41章　为地图标上地标（Itemized Overlay）\n41.1　设置图标层（Itemized Overlay）\n41.2　添加图标层\n41.3　地图开发备忘列表\n41.4　参考资料\n后记\n附录A　如何取得范例源代码","pages":"281","images":{"small":"https://img1.doubanio.com/spic/s6089507.jpg","large":"https://img1.doubanio.com/lpic/s6089507.jpg","medium":"https://img1.doubanio.com/mpic/s6089507.jpg"},"alt":"https://book.douban.com/subject/4127895/","id":"4127895","publisher":"人民邮电出版社","isbn10":"7115213941","isbn13":"9787115213945","title":"Google Android开发入门指南","url":"https://api.douban.com/v2/book/4127895","alt_title":"","author_intro":"","summary":"《Google Android开发入门指南(第2版)》是一部关于Android开发的基础教程，采用由浅入深、循序渐进的方式讨论Android。《Google Android开发入门指南(第2版)》全部内容基于Android SDK1.5Windows、MacOS X、Linux平台适用Android开发入门的详细教程，适合Android与J2ME的初学者学习，以编写实例为教学主线，真正助您解决开发中遇到的诸多实际问题。\n书中还结合数独游戏等实例更加形象生动地讲解了Android开发的基本流程，且每章最后都有一个\u201c快速阅读指南\u201d，更加方便了读者的阅读。\n《Google Android开发入门指南(第2版)》有超过130个实务范例，全面深度地整合手机、网络及服务。\n《Google Android开发入门指南(第2版)》有易于阅读的架构设计，每个范例均搭配步骤及完成画面！范例完全兼容Android SDK 1.5。","price":"45.00元"},{"rating":{"max":10,"numRaters":47,"average":"8.7","min":0},"subtitle":"","author":["罗升阳"],"pubdate":"2012-10","tags":[{"count":247,"name":"Android","title":"Android"},{"count":74,"name":"android","title":"android"},{"count":48,"name":"编程","title":"编程"},{"count":36,"name":"计算机","title":"计算机"},{"count":35,"name":"内核","title":"内核"},{"count":31,"name":"Linux","title":"Linux"},{"count":30,"name":"软件开发","title":"软件开发"},{"count":25,"name":"计算机技术","title":"计算机技术"}],"origin_title":"","image":"https://img3.doubanio.com/mpic/s27280265.jpg","binding":"平装","translator":[],"catalog":"目录\n第1篇 初识Android系统\n第1章 准备知识 2\n1.1 Linux内核参考书籍 2\n1.2 Android应用程序参考书籍 3\n1.3 下载、编译和运行Android源代码 3\n1.3.1 下载Android源代码 4\n1.3.2 编译Android源代码 4\n1.3.3 运行Android模拟器 5\n1.4 下载、编译和运行Android内核源代码 6\n1.4.1 下载Android内核源代码 6\n1.4.2 编译Android内核源代码 7\n1.4.3 运行Android模拟器  8\n1.5 开发第一个Android应用程序 8\n1.6 单独编译和打包Android应用程序模块 11\n1.6.1 导入单独编译模块的mmm命令 11\n1.6.2 单独编译Android应用程序模块 12\n1.6.3 重新打包Android系统镜像文件 12\n第２章 硬件抽象层 13\n2.1 开发Android硬件驱动程序 4\n2.1.1 实现内核驱动程序模块 14\n2.1.2 修改内核Kconfig文件 21\n2.1.3 修改内核Makefile文件 22\n2.1.4 编译内核驱动程序模块 22\n2.1.5 验证内核驱动程序模块 23\n2.2 开发C可执行程序验证Android硬件驱动程序 24\n2.3 开发Android硬件抽象层模块 26\n2.3.1 硬件抽象层模块编写规范 26\n2.3.2 编写硬件抽象层模块接口 29\n2.3.3 硬件抽象层模块的加载过程 33\n2.3.4 处理硬件设备访问权限问题 36\n2.4 开发Android硬件访问服务 38\n2.4.1 定义硬件访问服务接口 38\n2.4.2 实现硬件访问服务 39\n2.4.3 实现硬件访问服务的JNI方法 40\n2.4.4 启动硬件访问服务 43\n2.5 开发Android应用程序来使用硬件访问服务 44\n第３章 智能指针 49\n3.1 轻量级指针 50\n3.1.1 实现原理分析 50\n3.1.2 应用实例分析 53\n3.2 强指针和弱指针 54\n3.2.1 强指针的实现原理分析 55\n3.2.2 弱指针的实现原理分析 61\n3.2.3 应用实例分析 67\n第2篇 Android专用驱动系统\n第４章 Logger日志系统 74\n4.1 Logger日志格式 75\n4.2 Logger日志驱动程序 76\n4.2.1 基础数据结构 77\n4.2.2 日志设备的初始化过程 78\n4.2.3 日志设备文件的打开过程 83\n4.2.4 日志记录的读取过程 84\n4.2.5 日志记录的写入过程 88\n4.3 运行时库层日志库 93\n4.4 C/C++日志写入接口 100\n4.5 Java日志写入接口 104\n4.6 Logcat工具分析 110\n4.6.1 相关数据结构 111\n4.6.2 初始化过程 115\n4.6.3 日志记录的读取过程 127\n4.6.4 日志记录的输出过程 132\n第５章 Binder进程间通信系统 144\n5.1 Binder驱动程序 145\n5.1.1 基础数据结构 146\n5.1.2 Binder设备的初始化过程 164\n5.1.3 Binder设备文件的打开过程 165\n5.1.4 Binder设备文件的内存映射过程 166\n5.1.5 内核缓冲区管理 173\n5.2 Binder进程间通信库 183\n5.3 Binder进程间通信应用实例 188\n5.4 Binder对象引用计数技术 196\n5.4.1 Binder本地对象的生命周期 197\n5.4.2 Binder实体对象的生命周期 201\n5.4.3 Binder引用对象的生命周期 204\n5.4.4 Binder代理对象的生命周期 209\n5.5 Binder对象死亡通知机制 212\n5.5.1 注册死亡接收通知 213\n5.5.2 发送死亡接收通知 216\n5.5.3 注销死亡接收通知 221\n5.6 Service Manager的启动过程 224\n5.6.1 打开和映射Binder设备文件 226\n5.6.2 注册为Binder上下文管理者 227\n5.6.3 循环等待Client进程请求 231\n5.7 Service Manager代理对象的获取过程 238\n5.8 Service组件的启动过程 244\n5.8.1 注册Service组件 245\n5.8.2 启动Binder线程池 289\n5.9 Service代理对象的获取过程 291\n5.10 Binder进程间通信机制的Java接口 300\n5.10.1 Service Manager的Java代理对象的获取过程 300\n5.10.2 Java服务接口的定义和解析 310\n5.10.3 Java服务的启动过程 313\n5.10.4 Java服务代理对象的获取过程 320\n5.10.5 Java服务的调用过程 323\n第６章 Ashmem匿名共享内存系统 327\n6.1 Ashmem驱动程序 328\n6.1.1 基础数据结构 328\n6.1.2 匿名共享内存设备的初始化过程 330\n6.1.3 匿名共享内存设备文件的打开过程 332\n6.1.4 匿名共享内存设备文件的内存映射过程 334\n6.1.5 匿名共享内存块的锁定和解锁过程 336\n6.1.6 匿名共享内存块的回收过程 344\n6.2 运行时库cutils的匿名共享内存访问接口 345\n6.3 匿名共享内存的C++访问接口 349\n6.3.1 MemoryHeapBase 349\n6.3.2 MemoryBase 359\n6.3.3 应用实例 364\n6.4 匿名共享内存的Java访问接口 370\n6.4.1 MemoryFile 370\n6.4.2 应用实例 375\n6.5 匿名共享内存的共享原理 386\n第3篇 Android应用程序框架\n第７章 Activity组件的启动过程 392\n7.1 Activity组件应用实例 392\n7.2 根Activity组件的启动过程 398\n7.3 子Activity组件在进程内的启动过程 432\n7.4 子Activity组件在新进程中的启动过程 440\n第８章 Service组件的启动过程 443\n8.1 Service组件应用实例 443\n8.2 Service组件在新进程中的启动过程 451\n8.3 Service组件在进程内的绑定过程 463\n第９章 Android系统广播机制 486\n9.1 广播机制应用实例 487\n9.2 广播接收者的注册过程 493\n9.3 广播的发送过程 501\n第10章 Content Provider组件的实现原理 524\n10.1 Content Provider组件应用实例 525\n10.1.1 ArticlesProvider 525\n10.1.2 Article 535\n10.2 Content Provider组件的启动过程 550\n10.3 Content Provider组件的数据共享原理 573\n10.3.1 数据共享模型 573\n10.3.2 数据传输过程 576\n10.4 Content Provider组件的数据更新通知机制 596\n10.4.1 注册内容观察者 597\n10.4.2 发送数据更新通知 603\n第11章 Zygote和System进程的启动过程 611\n11.1 Zygote进程的启动脚本  611\n11.2 Zygote进程的启动过程 614\n11.3 System进程的启动过程 622\n第12章 Android应用程序进程的启动过程 630\n12.1 应用程序进程的创建过程 630\n12.2 Binder线程池的启动过程 639\n12.3 消息循环的创建过程 641\n第13章 Android应用程序的消息处理机制 645\n13.1 创建线程消息队列 645\n13.2 线程消息循环过程 650\n13.3 线程消息发送过程 655\n13.4 线程消息处理过程 660\n第14章 Android应用程序的键盘消息处理机制 667\n14.1 键盘消息处理模型  667\n14.2 InputManager的启动过程  670\n14.2.1 创建InputManager 670\n14.2.2 启动InputManager 673\n14.2.3 启动InputDispatcher 675\n14.2.4 启动InputReader 677\n14.3 InputChannel的注册过程 688\n14.3.1 创建InputChannel 689\n14.3.2 注册Server端InputChannel 697\n14.3.3 注册系统当前激活的应用程序窗口 701\n14.3.4 注册Client端InputChannel 706\n14.4 键盘消息的分发过程 709\n14.4.1 InputReader获得键盘事件 710\n14.4.2 InputDispatcher分发键盘事件 717\n14.4.3 系统当前激活的应用程序窗口获得键盘消息 727\n14.4.4 InputDispatcher获得键盘事件处理完成通知 743\n14.5 InputChannel的注销过程 746\n14.5.1 销毁应用程序窗口 747\n14.5.2 注销Client端InputChannel 756\n14.5.3 注销Server端InputChannel 758\n第15章 Android应用程序线程的消息循环模型 764\n15.1 应用程序主线程消息循环模型 765\n15.2 与界面无关的应用程序子线程消息循环模型 766\n15.3 与界面相关的应用程序子线程消息循环模型 769\n第16章 Android应用程序的安装和显示过程 778\n16.1 应用程序的安装过程 778\n16.2 应用程序的显示过程 814","pages":"830","images":{"small":"https://img3.doubanio.com/spic/s27280265.jpg","large":"https://img3.doubanio.com/lpic/s27280265.jpg","medium":"https://img3.doubanio.com/mpic/s27280265.jpg"},"alt":"https://book.douban.com/subject/19986441/","id":"19986441","publisher":"电子工业出版社","isbn10":"7121181088","isbn13":"9787121181085","title":"Android系统源代码情景分析","url":"https://api.douban.com/v2/book/19986441","alt_title":"","author_intro":"罗升阳，1984年出生，2007年毕业于浙江大学计算机系，取得学士学位，2010年毕业于上海交通大学计算机系，取得硕士学位。毕业后一直从事于互联网软件开发，并且致力于移动平台的研究，特别是对Android平台有深入的理解和研究。在国内知名IT技术社区CSDN上发表了数十篇高质量的Android系统原创性文章，并且开设博客专栏--《老罗的Android之旅》，积极与网友互动，深受大家喜爱，访问量一直居于前茅。","summary":"在内容上，本书结合使用情景，全面、深入、细致地分析Android系统的源代码，涉及到Linux内核层、硬件抽象层（HAL）、运行时库层(Runtime)、应用程序框架层(Application Framework)以及应用程序层(Application)。\n在组织上，本书将上述内容划分为初识Android系统、Android专用驱动系统和Android应用程序框架三大篇章。初识Android系统篇介绍了参考书籍、基础知识以及实验环境搭建；Android专用驱动系统篇介绍了Logger日志驱动程序、Binder进程间通信驱动程序以及Ashmem匿名共享内存驱动程序；Android应用程序框架篇从组件、进程、消息以及安装四个维度来对Android应用程序的框架进行了深入的剖析。\n通过上述内容及其组织，本书能使读者既能从整体上把握Android系统的层次结构，又能从细节上去掌握每一个层次的要点。","price":"109.00元"},{"rating":{"max":10,"numRaters":79,"average":"8.1","min":0},"subtitle":"","author":["柯元旦"],"pubdate":"2011-9","tags":[{"count":146,"name":"Android","title":"Android"},{"count":94,"name":"Android内核","title":"Android内核"},{"count":39,"name":"Android、内核剖析、输入法框架分析、窗口管理系统、编译系","title":"Android、内核剖析、输入法框架分析、窗口管理系统、编译系"},{"count":27,"name":"内核剖析","title":"内核剖析"},{"count":21,"name":"Android,","title":"Android,"},{"count":21,"name":"android","title":"android"},{"count":20,"name":"操作系统","title":"操作系统"},{"count":19,"name":"框架","title":"框架"}],"origin_title":"","image":"https://img5.doubanio.com/mpic/s6937206.jpg","binding":"","translator":[],"catalog":"第1部分 基础篇\n第1章 linux基础\t2\n1.1 linux文件系统概述\t2\n1.2 linux启动过程\t4\n1.3 常用linux 命令\t6\n1.4 shell脚本备忘\t9\n1.4.1 获取输入\t10\n1.4.2 变量定义\t10\n1.4.3 条件判断\t11\n1.4.4 while []...do... done语句\t12\n1.4.5 for循环\t13\n1.4.6 函数\t14\n1.4.7 常用内置符号常量\t15\n1.5 make脚本备忘\t15\n1.5.1 一个简单的makefile文件\t16\n1.5.2 变量的定义与赋值\t18\n1.5.3 条件控制语句\t18\n1.5.4 宏（函数）定义\t19\n1.5.5 内置符号和变量\t22\n1.5.6 模板目标（pattern target）\t23\n1.5.7 目标特定的变量赋值（target-specific variable）\t24\n1.5.8 常用选项\t25\n第2章 java基础\t26\n2.1 类装载器dexclassloader\t26\n2.1.1 dexclassloader的调用方法\t27\n2.1.2 基于类装载器设计一种\u201c插件\u201d架构\t29\n2.2 jni调用机制\t32\n2.2.1 java访问c\t33\n2.2.2 c访问java\t35\n2.2.3 在c中使用持久对象\t37\n2.3 异步消息处理线程\t37\n2.3.1 实现异步线程的一般思路\t38\n2.3.2 android中异步线程的实现方法\t38\n第3章 android源码下载及开发环境配置\t44\n3.1 mac系统的配置\t44\n3.1.1 硬盘格式的配置\t44\n3.1.2 port的用法\t46\n3.2 在linux中配置usb连接\t46\n3.3 在eclipse中调试framework\t46\n3.3.1 一段防止下载异常的脚本\t47\n3.3.2 调试framework中的代码\t47\n第4章 使用git\t51\n4.1 安装git\t52\n4.2 git仓库管理\t52\n4.2.1 仓库的组成\t52\n4.2.2 创建仓库\t54\n4.2.3 分支管理\t55\n4.3 git merge用法\t57\n4.4 git rebase用法\t58\n4.5 git cherry-pick用法\t61\n4.6 git reset用法\t62\n4.7 恢复到无引用提交\t63\n4.8 git remote用法\t65\n4.9 git 配置\t67\n4.9.1 基本信息配置\t68\n4.9.2 merge、diff工具配置\t68\n4.9.3 .gitignore配置\t70\n4.10 同时使用git和svn\t71\n4.11 其他git常用命令示例\t72\n4.11.1 git branch\t72\n4.11.2 git checkout\t72\n4.11.3 git log\t73\n4.11.4 git commit --amend\t73\n4.11.5 git cherry-pick sha-1\t73\n4.11.6 git merge-base\t74\n4.11.7 git diff master\u2026dev\t74\n4.11.8 git revert\t75\n4.11.9 git diff\t75\n4.11.10 git rm\t75\n4.11.11 git tag\t76\n第2部分 内核篇\n第5章 binder\t78\n5.1 binder框架\t78\n5.2 设计servier端\t80\n5.3 binder客户端设计\t81\n5.4 使用service类\t82\n5.4.1 获取binder对象\t82\n5.4.2 保证包裹内参数顺序aidl工具的使用\t83\n5.5 系统服务中的binder对象\t88\n5.5.1 servicemanager管理的服务\t88\n5.5.2 理解manager\t90\n第6章 framework概述\t92\n6.1 framework框架\t92\n6.1.1 服务端\t92\n6.1.2 客户端\t93\n6.1.3 linux驱动\t94\n6.2 apk程序的运行过程\t94\n6.3 客户端中的线程\t94\n6.4 几个常见问题\t95\n6.4.1 acitivity之间如何传递消息（数据）\t95\n6.4.2 窗口相关的概念\t96\n第7章 理解context\t98\n7.1 context是什么\t98\n7.2 一个应用程序中包含多少个context对象\t99\n7.3 context相关类的继承关系\t99\n7.4 创建context\t100\n7.4.1 application对应的context\t101\n7.4.2 activity对应的context\t102\n7.4.3 service对应的context\t103\n7.4.4 context之间的关系\t104\n第8章 创建窗口的过程\t106\n8.1 窗口的类型\t106\n8.2 token变量的含义\t108\n8.2.1 activity中的mtoken\t108\n8.2.2 window中的mapptoken\t109\n8.2.3 windowmanager.layoutparams中的token\t109\n8.2.4 view中的token\t110\n8.3 创建应用窗口\t111\n8.4 创建子窗口\t121\n8.4.1 dialog的创建\t122\n8.4.2 popupwindow的创建\t126\n8.4.3 contextmenu的创建\t127\n8.4.4 optionmenu的创建\t132\n8.5 系统窗口toast的创建\t136\n8.5.1 toast调用流程\t137\n8.5.2 toast添加窗口\t139\n8.6 创建窗口示例\t139\n第9章 framework的启动过程\t142\n9.1 framework运行环境综述\t142\n9.2 dalvik虚拟机相关的可执行程序\t143\n9.2.1 dalvikvm\t144\n9.2.2 dvz\t144\n9.2.3 app_process\t145\n9.3 zygote的启动\t147\n9.3.1 在init.rc中配置zygote启动参数\t147\n9.3.2 启动socket服务端口\t148\n9.3.3 加载preload-classes\t151\n9.3.4 加载preload-resources\t152\n9.3.5 使用folk启动新的进程\t152\n9.4 systemserver进程的启动\t155\n9.4.1 启动各种系统服务线程\t156\n9.4.2 启动第一个activity\t158\n第10章 ams内部原理\t160\n10.1 activity调度机制\t160\n10.1.1 几个重要概念\t161\n10.1.2 ams中的一些重要调度相关变量\t163\n10.1.3 startactivity()的流程\t165\n10.1.4 stopactivitylocked()停止activity\t183\n10.1.5 按\u201chome\u201d键回到桌面的过程\t186\n10.1.6 按\u201cback\u201d键回到上一个activity\t187\n10.1.7 长按\u201chome\u201d键\t189\n10.1.8 activity生命期的代码含义\t190\n10.2 内存管理\t192\n10.2.1 关闭而不退出\t192\n10.2.2 android与linux的配合\t194\n10.2.3 各种关闭程序的过程\t196\n10.2.4 释放内存详解\t197\n10.3 对ams中数据对象的理解\t211\n10.3.1 常见的对象操作\t212\n10.3.2 理解activity\t213\n10.3.3 android多进程吗，是同时在运行多个应用程序吗\t213\n10.4 activitygroup的内部机制\t214\n10.4.1 tabactivity使用时的类关系结构\t215\n10.4.2 localactivitymanager的内部机制\t217\n10.4.3 activitygroup内部的activity生命期控制\t220\n第11章 从输入设备中获取消息\t221\n11.1 android消息获取过程概述\t221\n11.2 与消息处理相关的源码文件分布\t223\n11.3 创建inputdispatcher线程\t226\n11.4 把窗口信息传递给inputdispatcher线程\t227\n11.5 创建inputchannel\t229\n11.6 在wms中注册inputchannel\t232\n11.7 在客户进程中注册inputchannel\t233\n11.8 wms中处理消息的时机\t234\n11.9 客户窗口获取消息的时机\t235\n第12章 屏幕绘图基础\t237\n12.1 绘制屏幕的软件架构\t237\n12.2 java客户端绘制调用过程\t239\n12.3 c客户端绘制过程\t241\n12.4 java客户端绘制相关类的关系\t244\n第13章 view工作原理\t247\n13.1 导论\t247\n13.2 用户消息类型\t249\n13.2.1 按键消息\t249\n13.2.2 触摸消息\t250\n13.3 按键消息派发过程\t252\n13.3.1 keyevent.dispatcherstate中的长按监测\t252\n13.3.2 按键消息总体派发过程\t254\n13.3.3 根视图内部派发过程\t256\n13.3.4 activity内部派发过程\t257\n13.3.5 view类内部的onkeydown()和onkeyup()\t260\n13.3.6 activity中的onkeydown()和onkeyup()\t261\n13.3.7 phonewindow内部消息派发过程\t262\n13.4 按键消息在wms中的派发过程\t263\n13.5 触摸消息派发过程\t266\n13.5.1 触摸消息总体派发过程\t266\n13.5.2 根视图内部消息派发过程\t267\n13.5.3 viewgroup内部消息派发过程\t268\n13.5.4 各种消息监测的基本实现方法\t271\n13.5.5 view内默认消息派发过程\t272\n13.6 导致view树重新遍历的时机\t274\n13.6.1 状态的分类\t274\n13.6.2 导致view树重新遍历的总体诱因图\t275\n13.6.3 refreshdrawablelist()\t276\n13.6.4 onfocusedchanged()\t278\n13.6.5 ensuretouchmode()\t279\n13.6.6 setvisibility()\t282\n13.6.7 setenable()\t284\n13.6.8 setselected()\t285\n13.6.9 invalidate()\t286\n13.6.10 requestfocus()\t290\n13.6.11 requestlayout()\t292\n13.7 遍历view树performtraversals()的执行过程\t293\n13.8 计算视图大小（measure）的过程\t296\n13.8.1 measure内部设计思路\t297\n13.8.2 viewgroup中的measurechildwithmargins()\t301\n13.8.3 linearlayout中的onmeasure()过程举例\t304\n13.9 布局（layout）过程\t308\n13.9.1 layout过程的设计思路\t308\n13.9.2 linearlayout中onlayout()内部过程\t309\n13.9.3 textview中gravity与layout的关系\t311\n13.10 绘制（draw）过程\t313\n13.10.1 视图中可绘制的元素\t313\n13.10.2 绘制过程的设计思路\t314\n13.10.3 viewroot中draw()的内部流程\t315\n13.10.4 view类中draw()函数内部流程\t318\n13.10.5 viewgroup类中绘制子视图dispatchdraw()内部流程\t322\n13.10.6 viewgroup类中drawchild()过程\t325\n13.10.7 绘制滚动条\t328\n13.11 动画的绘制\t331\n13.11.1 动画的设计思路\t332\n13.11.2 viewgroup类中drawchild()函数中视图动画绘制过程\t334\n13.11.3 viewgroup中dipsatchdraw()中布局动画绘制流程\t337\n第14章 wms工作原理\t340\n14.1 概述\t340\n14.1.1 窗口的定义\t340\n14.1.2 窗口管理要解决的核心问题\t341\n14.1.3 解决核心问题所使用的相关的变量列表\t343\n14.1.4 几个操作的概念\t346\n14.1.5 什么是policy，以及其与wms的关系\t346\n14.1.6 wms接口结构\t347\n14.2 wms主要内部类\t348\n14.2.1 表示窗口的数据类\t348\n14.2.2 dimanimator\t348\n14.2.3 fadeinoutanimation\t349\n14.2.4 inputmonitor类\t350\n14.2.5 policythread\t351\n14.2.6 session\t352\n14.2.7 watermark\t353\n14.2.8 wmthread\t354\n14.3 窗口的创建和删除\t355\n14.3.1 创建窗口的时机和过程\t355\n14.3.2 assignlayerslocked()的执行过程\t360\n14.3.3 addwindowtolistinorderlocked()的执行过程\t362\n14.3.4 删除窗口的时机\t364\n14.3.5 删除窗口的过程\t366\n14.3.6 removewindowinnerlocked()\t367\n14.4 计算窗口的大小\t371\n14.4.1 描述窗口尺寸的变量\t371\n14.4.2 窗口大小的变化过程\t372\n14.4.3 policy中layoutwindowlw()的执行过程\t375\n14.4.4 输入法窗口如何影响应用窗口的大小\t378\n14.5 切换窗口\t379\n14.5.1 切换要解决的问题\t379\n14.5.2 inputmanager和wms的接口\t381\n14.5.3 ams与wms的接口\t383\n14.5.4 从a到b的切换\t387\n14.5.5 从b回到a的过程\t390\n14.5.6 a中长按\u201chome\u201d键切换到b\t391\n14.5.7 setappvisiblity()与销毁surface\t393\n14.5.8 computefocusedwindowlocked()\t396\n14.6 perforlayoutandplacesurfaceslockedinner()的执行过程\t398\n14.6.1 总体过程\t399\n14.6.2 第一大步骤：计算窗口的大小\t401\n14.6.3 第二大步骤：计算窗口的可视状态\t401\n14.6.4 第三大步骤：通知surfaceflinger进行窗口重绘\t404\n14.7 窗口动画\t406\n14.8 屏幕旋转及configuration的变化过程\t409\n第3部分 系统篇\n第15章 资源访问机制\t414\n15.1 定义资源\t414\n15.2 存储资源\t415\n15.3 styleable、style、attr、theme的意义\t417\n15.4 attributeset与typedarray类\t420\n15.5 获取resources的过程\t425\n15.5.1 通过context获取\t425\n15.5.2 通过packagemanager获取\t429\n15.6 framework资源\t431\n15.6.1 加载和读取\t432\n15.6.2 添加\t434\n15.6.3 实现真正主题切换的两种思路\t436\n第16章 程序包管理（package manager service）\t439\n16.1 包管理概述\t439\n16.2 packages.xml文件格式\t442\n16.2.1 last-platform-version标签\t443\n16.2.2 permissions标签\t443\n16.2.3 cert标签\t444\n16.2.4 sigs标签\t444\n16.2.5 perms标签\t444\n16.2.6 package标签\t444\n16.2.7 shared-user标签\t445\n16.3 包管理服务的启动过程\t446\n16.3.1 各主要功能类的关系\t446\n16.3.2 pms主体启动过程\t448\n16.3.3 readpermission()内部过程\t450\n16.3.4 msettings.readlp()\t452\n16.3.5 scanpackageli()内部过程\t454\n16.3.6 msettings.writelp()\t455\n16.4 应用程序的安装和卸载\t455\n16.4.1 各主要功能类关系\t456\n16.4.2 应用程序安装过程\t457\n16.4.3 应用程序的卸载过程\t461\n16.5 intent匹配框架\t463\n16.5.1 主要功能类的关系\t463\n16.5.2 主体调用过程\t465\n第17章 输入法框架\t467\n17.1 输入法框架组成概述\t468\n17.2 输入法中各binder对象的创建过程\t469\n17.2.1 inputconnection\t469\n17.2.2 iinputmethodclient\t471\n17.2.3 inputmethodsession\t472\n17.2.4 inputmethod\t475\n17.3 输入法主要操作过程\t477\n17.3.1 输入法相关模块的启动过程\t477\n17.3.2 切换输入法\t478\n17.3.3 启动输入法\t480\n17.3.4 显示输入法\t485\n17.3.5 输入法操作过程中的重要变量总结\t489\n17.4 输入法窗口内部的显示过程\t490\n17.4.1 ims中的showwindow()的内部执行过程\t491\n17.4.2 标准布局的ims\t496\n17.4.3 自定义布局的ims\t502\n17.5 向编辑框传递字符\t503\n17.6 输入法相关源码清单\t504\n第4部分 编译篇\n第18章 android编译系统\t508\n18.1 android源码文件结构\t509\n18.2 从调用make命令开始说起\t509\n18.2.1 编译命令\t510\n18.2.2 编译结构猜想\t510\n18.3 编译所需脚本文件之间的协同关系\t512\n18.3.1 编译系统内部功能模块图\t512\n18.3.2 脚本文件的包含关系\t514\n18.3.3 从子项目中提取编译目标\t518\n18.3.4 生成编译规则\t519\n18.3.5 设置编译输出目录\t521\n18.3.6 生成最终的image文件\t522\n18.4 如何增加一个product\t523\n18.4.1 什么是一个product\t523\n18.4.2 如何增加一个product\t527\n18.5 如何增加一个项目\t528\n18.5.1 项目类别和项目路径\t529\n18.5.2 添加一个c项目\t530\n18.5.3 添加一个apk项目\t531\n18.6 apk编译过程\t533\n18.6.1 总体编译过程概述\t533\n18.6.2 生成r.java\t535\n18.6.3 编译aidl文件\t536\n18.6.4 包含java静态库\t536\n18.6.5 编译java源文件生成jar包\t538\n18.6.6 将jar包转换为dex文件\t539\n18.6.7 编译资源文件生成apk包\t540\n18.6.8 将dex文件添加到apk包中\t541\n18.6.9 添加jni所需的动态库文件\t541\n18.6.10 对apk文件进行签名\t543\n18.6.11 使用zipalign优化apk内部存储\t543\n18.7 framework的编译\t544\n18.7.1 总体编译过程\t544\n18.7.2 framework/core/ext三个jar文件的区别\t546\n18.8 编译android.jar\t547\n18.8.1 资源文件\t547\n18.8.2 aidl文件\t551\n18.8.3 java文件\t551\n18.9 编译adt插件\t553\n18.10 总结\t554\n第19章 编译自己的rom\t555\n19.1 嵌入式系统的内存地址空间\t555\n19.2 各种映像（image）文件的作用\t559\n19.3 编译nexus s（ns）的image文件\t562\n19.3.1 编译linux kernel\t562\n19.3.2 提取ns的私有驱动文件\t563\n19.3.3 编译system.img文件\t564\n19.3.4 创建ramdisk.img\t565\n19.3.5 创建boot.img文件\t566\n19.4 使用fastboot写入image文件\t566\n19.5 最后验证\t567\n19.5.1 解决触摸按键问题\t568\n19.5.2 解决音量和电源键\t568\n19.5.3 wifi问题\t570\n19.5.4 安装google mobile service（gms）\t571\n第5部分 硬件驱动篇\n第20章 基于ti omap处理器的 techshine 开发板介绍\t573\n20.1 techv-35xx开发板概述\t574\n20.2 交叉编译环境配置\t575\n20.3 x-loader编译\t578\n20.4 u-boot编译\t578\n20.5 techv-35xx linux驱动和内核配置及编译\t579\n20.5.1 touchscreen驱动配置\t579\n20.5.2 keyboard驱动配置\t580\n20.5.3 audio驱动配置\t581\n20.5.4 4mmc/sd驱动配置\t582\n20.5.5 nandflash驱动配置\t582\n20.5.6 lcd驱动配置\t583\n20.5.7 内核编译\t583\n20.6 techv-35xx android驱动编写\t584\n20.7 techv-35xx android开发环境建立\t589\n20.8 编译android donut\t590\n20.9 android根文件系统的制作\t591\n20.10 相关image文件的烧写\t591\n20.11 android 根文件系统安装\t593","pages":"595","images":{"small":"https://img5.doubanio.com/spic/s6937206.jpg","large":"https://img5.doubanio.com/lpic/s6937206.jpg","medium":"https://img5.doubanio.com/mpic/s6937206.jpg"},"alt":"https://book.douban.com/subject/6811238/","id":"6811238","publisher":"电子工业出版社","isbn10":"7121143984","isbn13":"9787121143984","title":"Android内核剖析","url":"https://api.douban.com/v2/book/6811238","alt_title":"","author_intro":"柯元旦，1981年生于陕西咸阳，2003年毕业于西安电子科技大学通信工程学院；2003～2006年，创立了一家设计公司，提供便携式媒体播放器解决方案，基于TI DSP芯片自主开发了一套操作系统，包括任务管理与调度、文件系统及GUI(图形用户接口)等：2006～2009年，就职于联想研究院，先后从事嵌入式系统设计以及互联网应用开发；2009年至今，从事Android应用程序开发和Framework内核研究，对Android内核有较深刻的理解。","summary":"由柯元旦编著的《Android内核剖析》详细分析了Android内核的内部机制，包括窗口管理系统、Activity管理系统、输入法框架、编译系统等，为Android内核定制及高级应用程序开发提供技术参考。\n    《Android内核剖析》适合于所有Android相关的工程师及产品经理，还可作为相关培训机构的教材。","price":"79.90元"},{"rating":{"max":10,"numRaters":194,"average":"8.5","min":0},"subtitle":"","author":["[美] Bill Phillips","[美] Brian Hardy"],"pubdate":"2014-4-1","tags":[{"count":202,"name":"Android","title":"Android"},{"count":115,"name":"android","title":"android"},{"count":87,"name":"编程","title":"编程"},{"count":55,"name":"移动开发","title":"移动开发"},{"count":46,"name":"计算机","title":"计算机"},{"count":30,"name":"软件开发","title":"软件开发"},{"count":23,"name":"程序设计","title":"程序设计"},{"count":12,"name":"计算机科学","title":"计算机科学"}],"origin_title":"Android programming: the big nerd ranch guide","image":"https://img3.doubanio.com/mpic/s28342615.jpg","binding":"平装","translator":["王明发"],"catalog":"第1章　Android应用初体验　　1\n1.1 　应用基础　　2\n1.2 　创建Android项目　　2\n1.3 　Eclipse工作区导航　　5\n1.4 　用户界面设计　　6\n1.4.1 　视图层级结构　　9\n1.4.2 　组件属性　　10\n1.4.3 　创建字符串资源　　11\n1.4.4 　预览界面布局　　12\n1.5 　从布局XML到视图对象　　13\n1.6 　组件的实际应用　　15\n1.6.1 　类包组织导入　　16\n1.6.2 　引用组件　　16\n1.6.3 　设置监听器　　17\n1.7 　使用模拟器运行应用　　21\n1.8 　Android编译过程　　22\n第2章　Android与MVC设计模式　　26\n2.1 　创建新类　　26\n2.2 　Android与MVC设计模式　　30\n2.3 　更新视图层　　31\n2.4 　更新控制层　　33\n2.5 　在设备上运行应用　　37\n2.5.1 　连接设备　　37\n2.5.2 　配置设备用于应用开发　　38\n2.6 　添加图标资源　　38\n2.6.1 　向项目中添加资源　　39\n2.6.2 　在XML文件中引用资源　　40\n2.7 　关于挑战练习　　41\n2.8 　挑战练习一：为TextView添加监听器　　41\n2.9 　挑战练习二：添加后退按钮　　42\n2.10 　挑战练习三：从按钮到图标按钮　　42\n第3章　Activity的生命周期　　45\n3.1 　日志跟踪理解Activity生命周期　　46\n3.1.1 　输出日志信息　　46\n3.1.2 　使用 LogCat　　48\n3.2 　设备旋转与Activity生命周期　　52\n3.3 　设备旋转前保存数据　　56\n3.4 　再探Activity生命周期　　57\n3.5 　深入学习：测试onSaveInstanceState-(Bundle)方法　　59\n3.6 　深入学习：日志记录的级别与方法　　60\n第4章　Android应用的调试　　62\n4.1 　DDMS应用调试透视图　　63\n4.2 　异常与栈跟踪　　64\n4.2.1 　诊断应用异常　　65\n4.2.2 　记录栈跟踪日志　　66\n4.2.3 　设置断点　　68\n4.2.4 　使用异常断点　　71\n4.3 　文件浏览器　　72\n4.4 　Android特有的调试工具　　73\n4.4.1 　使用Android Lint　　73\n4.4.2 　R类的问题　　74\n第5章　第二个activity　　75\n5.1 　创建第二个activity　　76\n5.1.1 　创建新布局　　77\n5.1.2 　创建新的activity子类　　80\n5.1.3 　在manifest配置文件中声明activity　　81\n5.1.4 　为QuizActivity添加cheat按钮　　82\n5.2 　启动activity　　83\n5.3 　activity间的数据传递　　85\n5.3.1 　使用intent extra　　86\n5.3.2 　从子activity获取返回结果　　88\n5.4 　activity的使用与管理　　92\n5.5 　挑战练习　　95\n第6章　Android SDK版本与兼容　　96\n6.1 　Android SDK版本　　96\n6.2 　Android编程与兼容性问题　　97\n6.2.1 　全新的系统版本\u2014\u2014Honeycomb　　97\n6.2.2 　SDK最低版本　　99\n6.2.3 　SDK目标版本　　99\n6.2.4 　SDK编译版本　　99\n6.2.5 　安全添加新版本API中的代码　　100\n6.3 　使用Android开发者文档　　103\n6.4 　挑战练习：报告编译版本　　105\n第7章　UI fragment与fragment 管理器　　106\n7.1 　UI设计的灵活性需求　　107\n7.2 　fragment的引入　　107\n7.3 　着手开发CriminalIntent　　108\n7.3.1 　创建新项目　　110\n7.3.2 　fragment与支持库　　112\n7.3.3 　创建Crime类　　113\n7.4 　托管UI fragment　　115\n7.4.1 　fragment的生命周期　　115\n7.4.2 　托管的两种方式　　116\n7.4.3 　定义容器视图　　116\n7.5 　创建UI fragment　　117\n7.5.1 　定义CrimeFragment的布局　　118\n7.5.2 　创建CrimeFragment类　　119\n7.6 　添加UI fragment到FragmentManager　　122\n7.6.1 　fragment事务　　123\n7.6.2 　FragmentManager与fragment生命周期　　125\n7.7 　activity使用fragment的理由　　127\n7.8 　深入学习：Honeycomb、ICS、Jelly Bean以及更高版本系统上的应用开发　　127\n第8章　使用布局与组件创建用户界面　　128\n8.1 　升级Crime类　　128\n8.2 　更新布局　　129\n8.3 　生成并使用组件　　131\n8.4 　深入探讨XML布局属性　　132\n8.4.1 　样式、主题及主题属性　　132\n8.4.2 　dp、sp以及屏幕像素密度　　133\n8.4.3 　Android开发设计原则　　134\n8.4.4 　布局参数　　135\n8.4.5 　边距与内边距　　135\n8.5 　使用图形布局工具　　136\n8.5.1 　添加新组件　　138\n8.5.2 　属性视图中编辑组件属性　　138\n8.5.3 　在框架视图中重新组织组件　　139\n8.5.4 　更新子组件的布局参数　　140\n8.5.5　　android:layout_weight属性的工作原理　　141\n8.5.6 　图形布局工具使用总结　　142\n8.5.7 　组件ID与多种布局　　142\n8.6 　挑战练习：日期格式化　　143\n第9章　使用ListFragment显示列表　　144\n9.1 　更新CriminalIntent应用的模型层　　145\n9.2 　创建ListFragment　　147\n9.3 　使用抽象activity托管fragment　　149\n9.3.1 　通用的fragment托管布局　　149\n9.3.2 　抽象activity类　　150\n9.4 　ListFragment、ListView及ArrayAdapter　　154\n9.4.1 　创建ArrayAdapter<T>类实例　　157\n9.4.2 　响应列表项的点击事件　　159\n9.5 　定制列表项　　160\n9.5.1 　创建列表项布局　　160\n9.5.2 　创建adapter子类　　162\n第10章　使用fragment argument　　165\n10.1 　从fragment中启动activity　　165\n10.1.1 　附加extra信息　　166\n10.1.2 　获取extra信息　　167\n10.1.3 　使用Crime数据更新CrimeFragment视图　　167\n10.1.4 　直接获取extra信息方式的缺点　　169\n10.2 　fragment argument　　169\n10.2.1 　附加argument给fragment　　169\n10.2.2 　获取argument　　170\n10.3 　重新加载显示列表项　　171\n10.4 　通过fragment获取返回结果　　172\n第11章　使用ViewPager　　174\n11.1 　创建CrimePagerActivity　　175\n11.1.1 　以代码的方式定义并产生布局　　176\n11.1.2 　ViewPager与Pager-Adapter　　177\n11.1.3 　整合配置并使用CrimePagerActivity　　178\n11.1.4 　FragmentStatePager-Adapter与Fragment-PagerAdapter　　180\n11.2 　深入学习：ViewPager的工作原理　　182\n第12章　对话框　　184\n12.1 　创建DialogFragment　　186\n12.1.1 　显示DialogFragment　　187\n12.1.2 　设置对话框的显示内容　　188\n12.2 　fragment间的数据传递　　190\n12.2.1 　传递数据给DatePicker-Fragment　　191\n12.2.2 　返回数据给CrimeFragment　　193\n12.3 　挑战练习：更多对话框　　198\n第13章　使用MediaPlayer播放音频　　199\n13.1 　添加资源　　200\n13.2 　定义HelloMoonFragment布局文件　　202\n13.3 　创建HelloMoonFragment　　203\n13.4 　使用布局fragment　　204\n13.5 　音频播放　　205\n13.6 　挑战练习：暂停音频播放　　208\n13.7 　深入学习：播放视频　　208\n13.8 　挑战练习：在HelloMoon应用中播放视频　　208\n第14章　fragment的保留　　209\n14.1 　保留fragment实例　　209\n14.2 　设备旋转与保留的fragment　　210\n14.3 　保留的fragment：一切都完美了吗　　212\n14.4 　设备旋转处理与onSaveInstance-State(Bundle)方法　　212\n14.5 　深入学习：fragment引入前的设备旋转问题　　214\n第15章　应用本地化　　215\n15.1 　本地化资源　　215\n15.2 　配置修饰符　　216\n15.2.1 　可用资源优先级排定　　217\n15.2.2 　多重配置修饰符　　218\n15.2.3 　寻找最匹配的资源　　219\n15.3 　更多资源使用原则及控制　　220\n15.3.1 　资源命名　　220\n15.3.2 　资源目录结构　　220\n15.4 　测试备选资源　　221\n第16章　操作栏　　223\n16.1 　选项菜单　　223\n16.1.1 　在XML文件中定义选项菜单　　225\n16.1.2 　创建选项菜单　　227\n16.1.3 　响应菜单项选择　　230\n16.2 　实现层级式导航　　232\n16.2.1 　启用应用图标的导航功能　　232\n16.2.2 　响应向上按钮　　233\n16.3 　可选菜单项　　236\n16.3.1 　创建可选菜单XML文件　　236\n16.3.2 　切换菜单项标题　　237\n16.3.3 　\u201c还有个问题\u201d　　238\n16.4 　挑战练习：用于列表的空视图　　239\n第17章　存储与加载本地文件　　241\n17.1 　CriminalIntent应用的数据存取　　241\n17.1.1 　保存crime数据到JSON文件　　242\n17.1.2 　从文件中读取crime数据　　246\n17.2 　挑战练习：使用外部存储　　248\n17.3 　深入学习：Android文件系统与Java I/O　　248\n第18章　上下文菜单与上下文操作模式　　250\n18.1 　定义上下文菜单资源　　251\n18.2 　实施浮动上下文菜单　　251\n18.2.1 　创建上下文菜单　　251\n18.2.2 　为上下文菜单登记视图　　252\n18.2.3 　响应菜单项选择　　253\n18.3 　实施上下文操作模式　　254\n18.3.1 　实现列表视图的多选操作　　255\n18.3.2 　列表视图中的操作模式回调方法　　256\n18.3.3 　改变已激活视图的显示背景　　258\n18.3.4 　实现其他视图的上下文操作模式　　259\n18.4 　兼容性问题：回退还是复制　　260\n18.5 　挑战练习：在CrimeFragment视图中删除crime记录　　261\n18.6 　深入学习：ActionBarSherlock　　261\n18.7 　挑战练习：使用ActionBarSherlock　　263\n18.7.1 　CriminalIntent应用中ABS的基本整合　　264\n18.7.2 　ABS的深度整合　　264\n18.7.3 　ABS的完全整合　　265\n第19章　相机I：取景器　　266\n19.1 　创建Fragment布局　　267\n19.2 　创建CrimeCameraFragment　　269\n19.3 　创建CrimeCameraActivity　　269\n19.4 　使用相机API　　271\n19.4.1 　打开并释放相机　　271\n19.4.2 　SurfaceView、Surface-Holder与Surface　　272\n19.4.3 　确定预览界面大小　　276\n19.4.4 　启动CrimeCamera-Activity　　277\n19.5 　深入学习：以命令行的方式运行activity　　281\n第20章　相机 II：拍摄并处理照片　　283\n20.1 　拍摄照片　　283\n20.1.1 　实现相机回调方法　　285\n20.1.2 　设置图片尺寸大小　　288\n20.2 　返回数据给CrimeFragment　　288\n20.2.1 　以接收返回值的方式启动CrimeCameraActivity　　289\n20.2.2 　在CrimeCameraFragment中设置返回值　　290\n20.2.3 　在CrimeFragment中获取照片文件名　　290\n20.3 　更新模型层　　291\n20.3.1 　新增Photo类　　292\n20.3.2 　为Crime添加photo属性　　293\n20.3.3 　设置photo属性　　293\n20.4 　更新CrimeFragment的视图　　294\n20.4.1 　添加ImageView组件　　295\n20.4.2 　图像处理　　296\n20.5 　在DialogFragment中显示大图片　　300\n20.6 　挑战练习：Crime照片的显示方向　　303\n20.7 　挑战练习：删除照片　　303\n20.8 　深入学习：Android代码的废弃处理　　303\n第21章　隐式intent　　305\n21.1 　添加按钮组件　　306\n21.2 　添加嫌疑人信息至模型层　　307\n21.3 　使用格式化字符串　　308\n21.4 　使用隐式intent　　309\n21.4.1 　典型隐式intent的组成　　310\n21.4.2 　发送陋习报告　　311\n21.4.3 　获取联系人信息　　313\n21.4.4 　检查可以响应的activity　　316\n21.5 　挑战练习：又一个隐式intent　　317\n第22章　Master-Detail用户界面　　318\n22.1 　增加布局灵活性　　319\n22.1.1 　修改SingleFragment-Activity　　320\n22.1.2 　创建包含两个fragment容器的布局　　320\n22.1.3 　使用别名资源　　322\n22.2 　Activity：fragment的托管者　　323\n22.3 　深入学习：设备屏幕尺寸的确定　　331\n第23章　深入学习intent和任务　　333\n23.1 　创建NerdLauncher项目　　333\n23.2 　解析隐式intent　　334\n23.3 　在运行时创建显式intent　　337\n23.4 　任务与后退栈　　338\n23.5 　使用NerdLauncher应用作为设备主屏幕　　341\n23.6 　挑战练习：应用图标与任务重排　　341\n23.7 　进程与任务　　341\n第24章　样式与include标签的使用　　343\n24.1 　创建RemoteControl项目　　344\n24.1.1 　编码实现RemoteControl-Activity　　344\n24.1.2 　创建RemoteControl-Fragment　　345\n24.2 　使用样式消除重复代码　　348\n24.3 　完善布局定义　　350\n24.4 　深入学习：使用include与merge标签　　353\n24.5 　挑战练习：样式的继承　　354\n第25章　XML Drawable与9-Patches　　355\n25.1 　XML drawable　　356\n25.2 　state list drawable　　358\n25.3 　layer list与inset drawable　　360\n25.4 　使用9-patch图像　　362\n第26章　HTTP与后台任务　　368\n26.1 　创建PhotoGallery应用　　369\n26.2 　网络连接基本　　372\n26.3 　使用AsyncTask在后台线程上运行代码　　373\n26.4 　线程与主线程　　375\n26.5 　获取Flickr XML数据　　377\n26.6 　从AsyncTask回到主线程　　382\n26.7 　深入学习：再探AsyncTask　　385\n26.8 　挑战练习：分页　　386\n第27章　Looper、Handler与HandlerThread　　387\n27.1 　设置GridView以显示图片　　387\n27.2 　批量下载缩略图　　390\n27.3 　与主线程通信　　390\n27.4 　创建并启动后台线程　　391\n27.5 　Message与message Handler　　393\n27.5.1 　消息的剖析　　393\n27.5.2 　Handler的剖析　　393\n27.5.3 　使用handler　　395\n27.5.4 　传递handler　　397\n27.6 　深入学习：AsyncTask与Thread　　401\n27.7 　挑战练习：预加载以及缓存　　401\n第28章　搜索　　402\n28.1 　搜索Flickr网站　　402\n28.2 　搜索对话框　　404\n28.2.1 　创建搜索界面　　404\n28.2.2 　可搜索的activity　　406\n28.2.3 　物理搜索键　　408\n28.2.4 　搜索的工作原理　　409\n28.2.5 　启动模式与新的intent　　410\n28.2.6 　使用shared preferences实现轻量级数据存储　　412\n28.3 　在Android 3.0以后版本的设备上使用SearchView　　414\n28.4 　挑战练习　　416\n第29章　后台服务　　417\n29.1 　创建IntentService　　417\n29.2 　服务的作用　　419\n29.3 　查找最新返回结果　　421\n29.4 　使用AlarmManager延迟运行服务　　422\n29.4.1 　PendingIntent　　424\n29.4.2 　使用PendingIntent管理定时器　　424\n29.5 　控制定时器　　425\n29.6 　通知信息　　428\n29.7 　深入学习：服务细节内容　　429\n29.7.1 　服务的能与不能　　430\n29.7.2 　服务的生命周期　　430\n29.7.3 　non-sticky服务　　430\n29.7.4 　sticky服务　　431\n29.7.5 　绑定服务　　431\n第30章　broadcast Intent　　433\n30.1 　随设备重启而重启的定时器　　433\n30.1.1 　配置文件中的broadcast receiver　　434\n30.1.2 　如何使用receiver　　435\n30.2 　过滤前台通知消息　　436\n30.2.1 　发送broadcast intent　　437\n30.2.2 　动态broadcast receiver　　437\n30.2.3 　使用私有权限　　440\n30.2.4 　使用ordered broadcast接收结果　　442\n30.3 　receiver与长时运行任务　　446\n第31章　网页浏览　　447\n31.1 　最后一段Flickr数据　　447\n31.2 　简单方式：使用隐式intent　　448\n31.3 　较难方式：使用WebView　　449\n31.3.1 　使用WebChromeClient优化WebView的显示　　453\n31.3.2 　处理WebView的设备旋转问题　　455\n31.4 　深入学习：注入JavaScript对象　　456\n第32章　定制视图与触摸事件　　457\n32.1 　创建DragAndDraw项目　　457\n32.1.1 　创建DragAndDraw-Activity　　458\n32.1.2 　创建DragAndDraw-Fragment　　459\n32.2 　创建定制视图　　460\n32.3 　处理触摸事件　　462\n32.4 　onDraw(...)方法内的图形绘制　　465\n32.5 　挑战练习：设备旋转问题　　467\n第33章　跟踪设备的地理位置　　468\n33.1 　启动RunTracker项目　　468\n33.1.1 　创建RunActivity　　469\n33.1.2 　创建RunFragment　　470\n33.2 　地理位置与LocationManager　　472\n33.3 　接收定位数据更新broadcast　　474\n33.4 　使用定位数据刷新UI显示　　475\n33.5 　快速定位：最近一次地理位置　　479\n33.6 　在物理和虚拟设备上测试地理位置定位　　480\n第34章　使用SQLite本地数据库　　482\n34.1 　在数据库中存储旅程和地理位置信息　　482\n34.2 　查询数据库中的旅程列表　　488\n34.3 　使用CursorAdapter显示旅程列表　　490\n34.4 　创建新旅程　　493\n34.5 　管理现有旅程　　494\n34.6 　挑战练习：识别当前跟踪的旅程　　500\n第35章　使用Loader加载异步数据　　501\n35.1 　Loader与LoaderManager　　501\n35.2 　在RunTracker应用中使用Loader　　502\n35.3 　加载旅程列表　　503\n35.4 　加载单个旅程　　506\n35.5 　加载旅程的最近一次地理位置　　509\n第36章　使用地图　　511\n36.1 　添加Maps API给RunTracker应用　　511\n36.1.1 　使用物理设备测试地图　　511\n36.1.2 　安装使用Google Play services SDK　　511\n36.1.3 　获取Google Maps API key　　512\n36.1.4 　更新RunTracker应用的manifest配置文件　　512\n36.2 　在地图上显示用户的地理位置　　513\n36.3 　显示旅程路线　　516\n36.4 　为旅程添加开始和结束地图标注　　520\n36.5 　挑战练习：实时数据更新　　521\n第37章　编后语　　522\n37.1 　终极挑战　　522\n37.2 　关于我们　　523\n37.3 　致谢　　523","pages":"523","images":{"small":"https://img3.doubanio.com/spic/s28342615.jpg","large":"https://img3.doubanio.com/lpic/s28342615.jpg","medium":"https://img3.doubanio.com/mpic/s28342615.jpg"},"alt":"https://book.douban.com/subject/25848404/","id":"25848404","publisher":"人民邮电出版社","isbn10":"7115346437","isbn13":"9787115346438","title":"Android编程权威指南","url":"https://api.douban.com/v2/book/25848404","alt_title":"Android programming: the big nerd ranch guide","author_intro":"作者简介：\nBill Phillips\nBig Nerd Ranch资深Android讲师、高级软件工程师。他与Brian Hardy合作，为Big Nerd Ranch开发了广受好评的5天Android训练营培训课程。Bill擅长透彻地理解事物的本质，并帮助其他人做到这一点。闲暇时间，Bill喜欢阅读和弹钢琴。\nBrian Hardy\nBig Nerd Ranch首席软件工程师、资深讲师。Big Nerd Ranch的Android、iOS和Ruby培训课程均由Brian设计开发。闲暇时间，Brian喜欢骑自行车和听音乐。","summary":"权威、全面、实用、易懂，是本书最大的特色。本书根据美国大名鼎鼎的Big Nerd Ranch训练营的Android培训讲义编写而成，已经为微软、谷歌、Facebook等行业巨头培养了众多专业人才。作者巧妙地把Android开发所需的庞杂知识、行业实践、编程规范等融入一本书中，通过精心编排的应用示例、循序渐进的内容组织，以及循循善诱的语言，深入地讲解了Android开发的方方面面。如果学完一章之后仍然意犹未尽，那\u201c挑战练习\u201d一定会让你大呼过瘾。本书之所以能在移动应用开发类图书中脱颖而出，还在于它真的是在与读者\u201c对话\u201d。阅读本书就好像有一位私人导师在你身边随时为你答疑解惑。\n本书适合所有对Android及移动开发感兴趣的读者，需要一定的Java编程基础。","series":{"id":"13846","title":"The Big Nerd Ranch Guide"},"price":"CNY 99.00"},{"rating":{"max":10,"numRaters":222,"average":"7.5","min":0},"subtitle":"","author":["李刚"],"pubdate":"2011-6","tags":[{"count":180,"name":"android","title":"android"},{"count":56,"name":"Android","title":"Android"},{"count":49,"name":"编程","title":"编程"},{"count":42,"name":"android开发","title":"android开发"},{"count":41,"name":"疯狂android讲义","title":"疯狂android讲义"},{"count":32,"name":"计算机","title":"计算机"},{"count":20,"name":"程序开发","title":"程序开发"},{"count":16,"name":"实用","title":"实用"}],"origin_title":"","image":"https://img1.doubanio.com/mpic/s6641009.jpg","binding":"","translator":[],"catalog":"第1章 android应用与开发环境\t1\n1.1 android的发展和历史\t2\n1.1.1 android的发展和简介\t2\n1.1.2 android平台架构及特性\t3\n1.2 搭建android开发环境\t5\n1.2.1 下载和安装android sdk\t5\n1.2.2 安装eclipse和adt插件\t7\n1.3 android常用开发工具的用法\t10\n1.3.1 创建、删除和浏览avd\t10\n1.3.2 使用android模拟器\n（emulator）\t14\n1.3.3 使用ddms进行调试\t15\n1.3.4 android debug bridge（adb）\n的用法\t16\n1.3.5 使用dx编译android应用\t18\n1.3.6 使用android asset packaging\ntool（aapt）打包资源\t19\n1.3.7 使用mksdcard管理虚拟sd卡\t19\n1.4 开始第一个android应用\t20\n1.4.1 使用eclipse开发第一个\nandroid应用\t20\n1.4.2 通过adt运行android应用\t23\n1.5 android应用结构分析\t24\n1.5.1 创建一个android应用\t24\n1.5.2 自动生成的r.java\t26\n1.5.3 res目录说明\t27\n1.5.4 android应用的清单文件：\nandroidmanifest.xml\t28\n1.5.5 应用程序权限说明\t29\n1.6 android应用的基本组件\n介绍\t31\n1.6.1 activity和view\t31\n1.6.2 service\t32\n1.6.3 broadcastreceiver\t32\n1.6.4 contentprovider\t32\n1.6.5 intent和intentfilter\t33\n1.7 本章小结\t33\n第2章 android应用的界面编程\t35\n2.1 界面编程与视图（view）组件\t36\n2.1.1 视图组件与容器组件\t36\n2.1.2 使用xml布局文件控制ui\n界面\t40\n2.1.3 在代码中控制ui界面\t41\n2.1.4 使用xml布局文件和java\n代码混合控制ui界面\t42\n2.1.5 开发自定义view\t43\n2.2 布局管理器\t46\n2.2.1 线性布局\t47\n2.2.2 表格布局\t49\n2.2.3 帧布局\t52\n2.2.4 相对布局\t55\n2.2.5 绝对布局\t58\n2.3 基本界面组件\t60\n2.3.1 文本框（textview）与编辑框\n（edittext）的功能和用法\t60\n2.3.2 按钮（button）与图片按钮（imagebutton）组件的功能和\n用法\t66\n2.3.3 使用9patch图片作为按钮背景\t68\n2.3.4 单选按钮（radiobutton）和复选\n框（checkbox）介绍与应用\t69\n2.3.5 状态开关按钮（togglebutton）\n的功能与用法\t71\n2.3.6 时钟（analogclock和digital\nclock）的功能与功法\t73\n2.3.7 图像视图（imageview）的\n功能和用法\t75\n2.4 高级界面组件\t79\n2.4.1 自动完成文本框（autocompletetextview）的\n功能和用法\t79\n2.4.2 spinner的功能和用法\t80\n2.4.3 日期、时间选择器（datepicker\n和timepicker）的功能和用法\t83\n2.4.4 进度条（progressbar）的\n功能和用法\t85\n2.4.5 拖动条（seekbar）的功能和\n用法\t90\n2.4.6 星级评分条（ratingbar）的\n功能和用法\t91\n2.4.7 选项卡（tabhost）的功能和\n用法\t93\n2.4.8 滚动视图（scrollview）的\n功能和用法\t95\n2.4.9 列表视图（listview和\nlistactivity）\t95\n2.4.10 可展开的列表组件（expandablelistview）\t101\n2.4.11 网格视图（gridview）和\n图像切换器（imageswitcher）\n功能和用法\t104\n2.4.12 画廊视图（gallery）的功能和\n用法\t107\n2.5 对话框\t110\n2.5.1 使用alertdialog创建简单\n对话框\t110\n2.5.2 使用alertdialog创建列表\n对话框\t112\n2.5.3 使用alertdialog创建自定义\n对话框\t116\n2.5.4 使用popupwindow\t121\n2.5.5 使用datepickerdialog、timepickerdialog\t123\n2.5.6 使用progressdialog创建进度\n对话框\t125\n2.6 消息提示\t127\n2.6.1 使用toast显示提示信息框\t128\n2.6.2 notification的功能与用法\t129\n2.7 菜单\t132\n2.7.1 选项菜单和子菜单\n（submenu）\t132\n2.7.2 使用监听器来监听菜单事件\t136\n2.7.3 创建复选菜单项和单选菜单项\t137\n2.7.4 设置与菜单项关联的activity\t140\n2.7.5 上下文菜单\t141\n2.8 本章小结\t143\n第3章 事件处理\t144\n3.1 android的事件处理\t145\n3.2 基于监听的事件处理\t145\n3.2.1 事件监听的处理模型\t145\n3.2.2 事件和事件监听器\t148\n3.2.3 内部类作为事件监听器类\t151\n3.2.4 外部类作为事件监听器类\t152\n3.2.5 activity本身作为事件监听器\t153\n3.2.6 匿名内部类作为事件监听器类\t154\n3.2.7 直接绑定到标签\t155\n3.3 基于回调的事件处理\t156\n3.3.1 回调机制与监听机制\t156\n3.3.2 基于回调的事件传播\t158\n3.3.3 重写ontouchevent方法响应\n触摸屏事件\t160\n3.4 响应的系统设置的事件\t162\n3.4.1 configuration类简介\t162\n3.4.2 重写onconfigurationchanged\n响应系统设置更改\t164\n3.5 handler消息传递机制\t166\n3.5.1 handler类简介\t166\n3.5.2 handler使用案例\t167\n3.6 本章小结\t168\n第4章 深入理解activity\t169\n4.1 建立、配置和使用activity\t170\n4.1.1 建立activity\t170\n4.1.2 配置activity\t177\n4.1.3 启动、关闭activity\t179\n4.1.4 使用bundle在activity之间\n交换数据\t181\n4.1.5 启动其他activity并返回结果\t185\n4.2 activity的回调机制\t189\n4.3 activity的生命周期\t190\n4.3.1 activity的生命周期演示\t190\n4.3.2 activity与servlet的相似性与\n区别\t194\n4.4 本章小结\t195\n第5章 使用intent和intentfilter\n第5章 进行通信\t196\n5.1 intent对象详解\t197\n5.1.1 使用intent启动系统组件\t197\n5.2 intent的属性及intent-filter\n配置\t198\n5.2.1 component属性\t198\n5.2.2 action、category属性与\nintent-filter配置\t200\n5.2.3 指定action、category调用\n系统activity\t204\n5.2.4 data、type属性与intent-filter\n配置\t209\n5.2.5 extra属性\t211\n5.3 使用intent创建tab页面\t211\n5.4 本章小结\t212\n第6章 android应用的资源\t213\n6.1 资源的类型及存储方式\t214\n6.1.1 资源的类型以及存储方式\t214\n6.1.2 使用资源\t216\n6.2 使用字符串、颜色、\n尺寸资源\t217\n6.2.1 颜色值的定义\t217\n6.2.2 定义字符串、颜色、尺寸资源\n文件\t218\n6.2.3 使用字符串、颜色、\n尺寸资源\t219\n6.3 数组（array）资源\t222\n6.4 使用（drawable）资源\t225\n6.4.1 图片资源\t225\n6.4.2 statelistdrawable资源\t225\n6.4.3 layerdrawable资源\t227\n6.4.4 shapedrawable资源\t229\n6.4.5 clipdrawable资源\t231\n6.4.6 animationdrawable资源\t233\n6.5 使用原始xml资源\t236\n6.5.1 定义原始xml资源\t236\n6.5.2 使用原始xml文件\t237\n6.6 使用布局（layout）资源\t239\n6.7 使用菜单（menu）资源\t239\n6.7.1 定义菜单资源\t239\n6.7.2 使用菜单资源\t240\n6.8 样式（style）和主题（theme）\n资源\t243\n6.8.1 样式资源\t243\n6.8.2 主题资源\t245\n6.9 属性（attribute）资源\t247\n6.10 使用原始资源\t249\n6.11 国际化和资源自适应\t251\n6.11.1 java国际化的思路\t252\n6.11.2 java支持的语言和国家\t252\n6.11.3 完成程序国际化\t253\n6.11.4 为android应用提供国际化\n资源\t255\n6.11.5 国际化android应用\t256\n6.12 本章小结\t258\n第7章 图形与图像处理\t259\n7.1 使用简单图片\t260\n7.1.1 使用drawable对象\t260\n7.1.2 bitmap和bitmapfactory\t260\n7.2 绘图\t263\n7.2.1 android绘图基础：canvas、\npaint等\t263\n7.2.2 path类\t267\n7.2.3 绘制游戏动画\t270\n7.3 图形特效处理\t278\n7.3.1 使用matrix控制变换\t278\n7.3.2 使用drawbitmapmesh扭曲\n图像\t282\n7.3.3 使用shader填充图形\t285\n7.4 逐帧（frame）动画\t288\n7.4.1 animationdrawable与逐帧\n动画\t288\n7.5 补间（tween）动画\t292\n7.5.1 tween动画与interpolator\t292\n7.5.2 位置、大小、旋转度、透明度\n改变的补间动画\t293\n7.5.3 自定义补间动画\t298\n7.6 使用surfaceview实现动画\t300\n7.6.1 surfaceview的绘图机制\t301\n7.7 本章小结\t305\n第8章 android的数据存储和io\t306\n8.1 使用sharedpreferences\t307\n8.1.1 sharedpreferences与editor\n简介\t307\n8.1.2 sharedpreferences的存储\n位置和格式\t308\n8.1.3 读、写其他应用shared\npreferences\t310\n8.2 file存储\t311\n8.2.1 openfileoutput和open\nfileinput\t312\n8.2.2 读写sd卡上的文件\t314\n8.3 sqlite数据库\t321\n8.3.1 简介sqlitedatabase\t321\n8.3.2 创建数据库和表\t323\n8.3.3 使用sql语句操作sqlite\n数据库\t323\n8.3.4 使用sqlite3工具\t325\n8.3.5 使用特定方法操作sqlite\n数据库\t327\n8.3.6 事务\t329\n8.3.7 sqliteopenhelper类\t330\n8.4 手势（gesture）\t335\n8.4.1 手势检测\t335\n8.4.2 增加手势\t342\n8.4.3 识别用户的手势\t346\n8.5 自动朗读（tts）\t347\n8.6 本章小结\t350\n第9章 使用contentprovider实现\n第9章 数据共享\t351\n9.1 数据共享标准：\ncontentprovider简介\t352\n9.1.1 contentprovider简介\t352\n9.1.2 uri简介\t353\n9.1.3 使用contentresolver操作\n数据\t354\n9.2 操作系统的contentprovider\t355\n9.2.1 使用contentprovider管理\n联系人\t355\n9.2.2 使用contentprovider管理\n多媒体内容\t360\n9.3 实现contentprovider\t364\n9.3.1 创建contentprovider的步骤\t364\n9.4 监听contentprovider的数据\n改变\t370\n9.4.1 contentobserver简介\t370\n9.5 本章小结\t372\n第10章 service与broadcast\n第10章 receiver\t373\n10.1 service简介\t374\n10.1.1 创建、配置service\t374\n10.1.2 启动和停止service\t376\n10.1.3 绑定本地service并与之\n通信\t377\n10.1.4 service的生命周期\t381\n10.2 跨进程调用service\n（aidl服务）\t382\n10.2.1 aidl服务简介\t382\n10.2.2 创建aidl文件\t383\n10.2.3 将接口暴露给客户端\t383\n10.2.4 客户端访问aidlservice\t385\n10.3 电话管理器\n（telephonymanager）\t393\n10.4 短信管理器（smsmanager）\t400\n10.5 音频管理器\n（audiomanager）\t404\n10.5.1 audiomanager简介\t404\n10.6 振动器（vibrator）\t407\n10.6.1 vibrator简介\t407\n10.6.2 使用vibrator控制手机振动\t407\n10.7 手机闹钟服务\n（alarmmanager）\t408\n10.7.1 alarmmanager简介\t408\n10.7.2 设置闹钟\t409\n10.8 接收广播消息\t413\n10.8.1 broadcastreceiver简介\t413\n10.8.2 发送广播\t414\n10.8.3 有序广播\t416\n10.9 接收系统广播消息\t424\n10.10 本章小结\t427\n第11章 多媒体应用开发\t428\n11.1 音频和视频的播放\t429\n11.1.1 使用mediaplayer播放音频\t429\n11.1.2 使用soundpool播放音效\t432\n11.1.3 使用videoview播放视频\t435\n11.1.4 使用mediaplayer和\nsurfaceview播放视频\t436\n11.2 使用mediarecorder录制\n音频\t439\n11.3 控制摄像头拍照\t442\n11.3.1 通过camera进行拍照\t442\n11.3.2 录制视频短片\t446\n11.4 本章小结\t450\n第12章 opengl与3d应用开发\t451\n12.1 3d图像与3d开发的\n基本知识\t452\n12.2 opengl和opengl es简介\t453\n12.3 绘制2d图形\t454\n12.3.1 在android应用中使用\nopengl es\t454\n12.3.2 绘制平面上的多边形\t457\n12.3.3 旋转\t463\n12.4 绘制3d图形\t465\n12.4.1 构建3d图形\t465\n12.4.2 应用纹理贴图\t469\n12.5 本章小结\t475\n第13章 android的网络应用\t476\n13.1 基于tcp协议的网络通信\t477\n13.1.1 tcp协议基础\t477\n13.1.2 使用serversocket创建\ntcp服务器端\t478\n13.1.3 使用socket进行通信\t479\n13.1.4 加入多线程\t483\n13.2 使用url访问网络资源\t488\n13.2.1 使用url读取网络资源\t489\n13.2.2 使用urlconnection\n提交请求\t490\n13.3 使用http访问网络\t496\n13.3.1 使用httpurlconnection\t496\n13.3.2 使用apache httpclient\t501\n13.4 使用webview视图\n显示网页\t505\n13.4.1 使用webview浏览网页\t506\n13.4.2 使用webview加载html\n代码\t507\n13.5 使用web service进行\n网络编程\t508\n13.5.1 web service简介\t509\n13.5.2 web service平台概述\t510\n13.5.3 使用android应用调用\nweb service\t512\n13.6 本章小结\t524\n第14章 管理android手机桌面\t525\n14.1 管理手机桌面\t526\n14.1.1 删除桌面组件\t526\n14.1.2 添加桌面组件\t526\n14.2 改变手机壁纸\t527\n14.2.1 开发实时壁纸\n（live wallpapers）\t528\n14.3 桌面快捷方式\t532\n14.3.1 在桌面上创建快捷方式\t532\n14.3.2 向launcher添加快捷方式\t534\n14.4 管理桌面小控件\t535\n14.5 实时文件夹（livefolder）\t539\n14.5.1 使用实时文件夹显示\ncontentprovider的数据\t540\n14.6 本章小结\t545\n第15章 传感器应用开发\t546\n15.1 利用android的传感器\t547\n15.1.1 开发传感器应用\t547\n15.1.2 下载和安装sensorsimulator\t549\n15.1.3 利用sensorsimulator开发\n传感器应用\t551\n15.2 android的常用传感器\t553\n15.2.1 方向传感器orientation\t553\n15.2.2 磁场传感器magnetic field\t554\n15.2.3 温度传感器temperature\t554\n15.2.4 光传感器light\t554\n15.2.5 压力传感器pressure\t554\n15.3 传感器应用案例\t557\n15.4 本章小结\t564\n第16章 gps应用开发\t565\n16.1 支持gps的核心api\t566\n16.2 获取locationprovider\t568\n16.2.1 获取所有可用的\nlocationprovider\t568\n16.2.2 通过名称获得指定\nlocationprovider\t569\n16.2.3 根据criteria获得\nlocationprovider\t569\n16.3 获取定位信息\t570\n16.3.1 通过模拟器发送gps信息\t571\n16.3.2 获取定位数据\t571\n16.4 临近警告\t573\n16.5 本章小结\t575\n第17章 使用google map服务\t576\n17.1 调用google map的准备\t577\n17.1.1 获取map api key\t577\n17.1.2 创建支持google map api的\navd\t580\n17.2 根据gps信息在地图上\n定位\t582\n17.3 gps导航\t588\n17.4 根据地址定位\t590\n17.4.1 地址解析与反向地址解析\t590\n17.4.2 根据地址定位\t595\n17.5 本章小结\t597\n第18章 疯狂连连看\t598\n18.1 连连看游戏简介\t599\n18.2 开发游戏界面\t600\n18.2.1 开发界面布局\t600\n18.2.2 开发游戏界面组件\t601\n18.2.3 处理方块之间的连接线\t605\n18.3 连连看的状态数据模型\t606\n18.3.1 定义数据模型\t606\n18.3.2 初始化游戏状态数据\t606\n18.4 加载界面的图片\t610\n18.5 实现游戏activity\t612\n18.6 实现游戏逻辑\t618\n18.6.1 定义gameservice组件接口\t618\n18.6.2 实现gameservice组件\t619\n18.6.3 获取触碰点的方块\t620\n18.6.4 判断两个方块是否可以相连\t622\n18.6.5 定义获取通道的工具方法\t623\n18.6.6 没有转折点的横向连接\t625\n18.6.7 没有转折点的纵向连接\t626\n18.6.8 一个转折点的连接\t626\n18.6.9 两个转折点的连接\t629\n18.6.10 找出最短距离\t636\n18.7 本章小结\t638\n第19章 电子拍卖系统\t639\n19.1 系统功能简介和架构设计\t640\n19.1.1 系统功能简介\t640\n19.1.2 系统架构设计\t641\n19.2 json简介\t643\n19.2.1 使用json语法创建对象\t643\n19.2.2 使用json语法创建数组\t644\n19.2.3 java的json支持\t645\n19.3 发送请求的工具类\t646\n19.4 用户登录\t647\n19.4.1 处理登录的servlet\t648\n19.4.2 用户登录\t649\n19.5 查看流拍物品\t655\n19.5.1 查看流拍物品的servlet\t655\n19.5.2 查看流拍物品\t656\n19.6 管理物品种类\t661\n19.6.1 浏览物品种类的servlet\t661\n19.6.2 查看物品种类\t662\n19.6.3 添加种类的servlet\t666\n19.6.4 添加物品种类\t666\n19.7 管理拍卖物品\t668\n19.7.1 查看自己的拍卖物品的\nservlet\t668\n19.7.2 查看自己的拍卖物品\t669\n19.7.3 添加拍卖物品的servlet\t672\n19.7.4 添加拍卖物品\t673\n19.8 参与竞拍\t678\n19.8.1 选择物品种类\t678\n19.8.2 根据种类浏览物品的servlet\t680\n19.8.3 根据种类浏览物品\t680\n19.8.4 参与竞价的servlet\t682\n19.8.5 参与竞价\t683\n19.9 权限控制\t688\n19.10 本章小结\t689","pages":"689","images":{"small":"https://img1.doubanio.com/spic/s6641009.jpg","large":"https://img1.doubanio.com/lpic/s6641009.jpg","medium":"https://img1.doubanio.com/mpic/s6641009.jpg"},"alt":"https://book.douban.com/subject/6515839/","id":"6515839","publisher":"电子工业出版社","isbn10":"7121135760","isbn13":"9787121135767","title":"疯狂Android讲义","url":"https://api.douban.com/v2/book/6515839","alt_title":"","author_intro":"作者从事过近7年的J2EE应用开发，担任过LITEON公司的J2EE技术主管，负责该公司的企业信息平台的架构设计，担任过广东龙泉科技有限公司的J2EE技术培训导师，目前在新东方IT培训中心担任J2EE培训讲师。培训的学生已在华为、从兴电子、瑞达通信、中企动力等公司就职，在珠三角的J2EE行业极具影响力。","summary":"计算机便携化是未来的发展趋势，而Android作为最受欢迎的手机、平\n板电脑操作之一，其发展的上升势头是势不可当的。而Android应用选择了\nJava作为其开发语言，对于Java来说也是一次极好的机会。\n    李刚编著的《疯狂Android讲义》全面地介绍了Android应用开发的相\n关知识，全书内容覆盖了Android用户界面编程、Android四大组件、\nAndroid资源访问、图形/图像处理、事件处理机制、Android输入/输出处\n理、音频/视频多媒体应用开发、OpenGL与3D应用开发、网络通信编程、\nAndroid平台的Web Service、传感器应用开发、GPS应用开发、Google Map\n服务等。\n    《疯狂Android讲义》并不局限于介绍Android编程的各种理论知识，\n而是从\u201c项目驱动\u201d的角度来讲授理论，全书一共包括近百个实例，这些\n示范性的实例既可帮读者更好地理解各知识点在实际开发中的应用，也可\n供读者在实际开发时作为参考、拿来就用。本书最后还提供了两个实用的\n案例：疯狂连连看和电子拍卖系统Android客户端，具有极高的参考价值。\n本书提供了配套的答疑网站，如果读者在阅读本书时遇到了技术问题，可\n以登录疯狂Java联盟（http://www.crazyit.org）发帖，笔者将会及时予\n以解答。\n    本书适合于有一定Java编程基础的读者。如果读者已熟练掌握Java编\n程语法并具有一定图形界面编程经验，阅读本书将十分合适。否则，阅读\n本书之前建议先认真阅读疯狂Java体系之《疯狂Java讲义》。","price":"89.00元"}]
     */

    private int count;
    private int start;
    private int total;
    private List<BooksBean> books;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BooksBean> getBooks() {
        return books;
    }

    public void setBooks(List<BooksBean> books) {
        this.books = books;
    }

    public static class BooksBean {
        /**
         * rating : {"max":10,"numRaters":20,"average":"5.1","min":0}
         * subtitle : A Programmer's Guide
         * author : ["J.F. DiMarzio"]
         * pubdate : 2008-7-30
         * tags : [{"count":16,"name":"Android","title":"Android"},{"count":6,"name":"Mobile","title":"Mobile"},{"count":4,"name":"Google","title":"Google"},{"count":3,"name":"Phone","title":"Phone"},{"count":2,"name":"技术","title":"技术"},{"count":1,"name":"Android.A.Programmers.Guide","title":"Android.A.Programmers.Guide"},{"count":1,"name":"programming","title":"programming"},{"count":1,"name":"力的来源!","title":"力的来源!"}]
         * origin_title :
         * image : https://img5.doubanio.com/mpic/s4259006.jpg
         * binding : Paperback
         * translator : []
         * catalog :
         * pages : 400
         * images : {"small":"https://img5.doubanio.com/spic/s4259006.jpg","large":"https://img5.doubanio.com/lpic/s4259006.jpg","medium":"https://img5.doubanio.com/mpic/s4259006.jpg"}
         * alt : https://book.douban.com/subject/3134548/
         * id : 3134548
         * publisher : McGraw-Hill Osborne Media
         * isbn10 : 0071599886
         * isbn13 : 9780071599887
         * title : Android
         * url : https://api.douban.com/v2/book/3134548
         * alt_title :
         * author_intro :
         * summary : Master the Android mobile development platform  Build compelling Java-based mobile applications using the Android SDK and the Eclipse open-source software development platform. Android: A Programmer's Guide shows you, step-by-step, how to download and set up all of the necessary tools, build and tune dynamic Android programs, and debug your results. Discover how to provide web and chat functions, interact with the phone dialer and GPS devices, and access the latest Google services. You'll also learn how to create custom Content Providers and database-enable your applications using SQLite.  Install and configure Java, Eclipse, and Android plugin  Create Android projects from the Eclipse UI or command line  Integrate web content, images, galleries, and sounds  Deploy menus, progress bars, and auto-complete functions  Trigger actions using Android Intents, Filters, and Receivers  Implement GPS, Google Maps, Google Earth, and GTalk Build interactive SQLite databases, calendars, and notepads  Test applications using the Android Emulator and Debug Bridge
         * price : USD 39.99
         * ebook_url : https://read.douban.com/ebook/15171473/
         * ebook_price : 25.00
         * series : {"id":"28292","title":"深入理解Android"}
         */

        private RatingBean rating;
        private String subtitle;
        private String pubdate;
        private String origin_title;
        private String image;
        private String binding;
        private String catalog;
        private String pages;
        private ImagesBean images;
        private String alt;
        private String id;
        private String publisher;
        private String isbn10;
        private String isbn13;
        private String title;
        private String url;
        private String alt_title;
        private String author_intro;
        private String summary;
        private String price;
        private String ebook_url;
        private String ebook_price;
        private SeriesBean series;
        private List<String> author;
        private List<TagsBean> tags;
        private List<?> translator;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getOrigin_title() {
            return origin_title;
        }

        public void setOrigin_title(String origin_title) {
            this.origin_title = origin_title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getBinding() {
            return binding;
        }

        public void setBinding(String binding) {
            this.binding = binding;
        }

        public String getCatalog() {
            return catalog;
        }

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public String getPages() {
            return pages;
        }

        public void setPages(String pages) {
            this.pages = pages;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getIsbn10() {
            return isbn10;
        }

        public void setIsbn10(String isbn10) {
            this.isbn10 = isbn10;
        }

        public String getIsbn13() {
            return isbn13;
        }

        public void setIsbn13(String isbn13) {
            this.isbn13 = isbn13;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAlt_title() {
            return alt_title;
        }

        public void setAlt_title(String alt_title) {
            this.alt_title = alt_title;
        }

        public String getAuthor_intro() {
            return author_intro;
        }

        public void setAuthor_intro(String author_intro) {
            this.author_intro = author_intro;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getEbook_url() {
            return ebook_url;
        }

        public void setEbook_url(String ebook_url) {
            this.ebook_url = ebook_url;
        }

        public String getEbook_price() {
            return ebook_price;
        }

        public void setEbook_price(String ebook_price) {
            this.ebook_price = ebook_price;
        }

        public SeriesBean getSeries() {
            return series;
        }

        public void setSeries(SeriesBean series) {
            this.series = series;
        }

        public List<String> getAuthor() {
            return author;
        }

        public void setAuthor(List<String> author) {
            this.author = author;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<?> getTranslator() {
            return translator;
        }

        public void setTranslator(List<?> translator) {
            this.translator = translator;
        }

        public static class RatingBean {
            /**
             * max : 10
             * numRaters : 20
             * average : 5.1
             * min : 0
             */

            private int max;
            private int numRaters;
            private String average;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getNumRaters() {
                return numRaters;
            }

            public void setNumRaters(int numRaters) {
                this.numRaters = numRaters;
            }

            public String getAverage() {
                return average;
            }

            public void setAverage(String average) {
                this.average = average;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img5.doubanio.com/spic/s4259006.jpg
             * large : https://img5.doubanio.com/lpic/s4259006.jpg
             * medium : https://img5.doubanio.com/mpic/s4259006.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class SeriesBean {
            /**
             * id : 28292
             * title : 深入理解Android
             */

            private String id;
            private String title;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class TagsBean {
            /**
             * count : 16
             * name : Android
             * title : Android
             */

            private int count;
            private String name;
            private String title;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
