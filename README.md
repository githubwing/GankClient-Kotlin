# GankClient-Kotlin


![image](https://github.com/githubwing/GankClient-Kotlin/raw/master/img/fuckgoods.jpg)



![image](https://github.com/githubwing/GankClient-Kotlin/raw/master/img/pic1.png)
![image](https://github.com/githubwing/GankClient-Kotlin/raw/master/img/pic2.png)

gank.io kotlin实现的干货集中营客户端

风格采用了Material Design. 多数控件都是design包里面的。



## 项目模式

* [Kotlin](https://github.com/JetBrains/kotlin)
* MVP
* [Dagger2](https://github.com/square/dagger)
* [Rxjava](https://github.com/ReactiveX/RxJava)
* DataBinding
* [Retrofit](https://github.com/square/retrofit)
* [Okhttp3](https://github.com/square/okhttp)
* [DeepLinkDispatch](https://github.com/airbnb/DeepLinkDispatch)
* [Gson](https://github.com/google/gson)
* [Glide](https://github.com/bumptech/glide)
* [ByeBurger](https://github.com/githubwing/ByeBurger)

## Kotlin

  让你的代码量大大减少，函数式编程让你爽到飞上天！如果你想学习Kotlin，本项目应该会给你不少帮助。

## MVP 
  通过契约类Contract管理View Model Presenter接口。

  * Model -- 主要处理业务，用于数据的获取(如网络、本地缓存)。
  * View -- 用于把数据展示，并且提供交互。
  * Presenter -- View和Model交互的桥梁，二者通过Presenter建立联系。

  主要流程如下： 用户与View交互，View得知用户需要加载数据，告知Presenter，Presenter则告知Model，Model拿到数据反交于Prsenter，Presenter将数据交给View进行展示。

## Dagger2

  项目中,主要进行presenter、model、retrofit Api等类的注入操作。
  
  **ApiComponent** 
  
    主Component、用于注入AppComponent、便于提供子Component依赖。
     
     依赖于：
     
     1.ApiModule(提供okhttpClient、Retrofit、Api等)
     
     2.AppModule(提供context对象(okhttp拦截器所需))
      
      
  **FuckGoodsComponent** 
  
    父Component为ApiComponent 用于注入FuckGoodsPresenter
     
     依赖于: FuckGoodsModule(提供FuckGoodsView)
     
     
  **RandomComponent** 
  
    父Component为ApiComponent 用于注入RandomPresenter
    
    依赖于 : RandomModule(提供RandomView) 
    
    
  
## Rxjava + Retrofit + okhttp3
  主要用于网络访问。
  
## DeepLinkDispatch
  基于路由进行页面转发。
  
   **GankClientUri** 定义一些路由规则、URI等
   
   **GankRouter** 统一由此进行路由操作

## GSON
  用于json的解析操作。
  
## Glide
  用于图片的加载。
  
## ByeBurGer
  用于导航栏以及悬浮按钮滑动隐藏。


# License

    Copyright 2016 androidwing1992

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
