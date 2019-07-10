创建页面
1. 引用静态资源
我们提供了CDN地址可以直接使用，并且强烈建议使用我们的CDN而不是下载到本地。

<link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm.min.css">
<script type='text/javascript' src='//g.alicdn.com/sj/lib/zepto/zepto.min.js' charset='utf-8'></script>
<script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm.min.js' charset='utf-8'></script>
如果你用到了拓展包中的组件，还需要引用extend扩展包，为减少请求数，可以使用阿里CDN的combo功能：

<link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/??sm.min.css,sm-extend.min.css">
<script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/??sm.min.js,sm-extend.min.js' charset='utf-8'></script>
2. 调试代码
如果你希望在开发环境下可以调试代码，那么你可以这样引用未压缩的版本

<link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm.css">
<script type='text/javascript' src='//g.alicdn.com/sj/lib/zepto/zepto.js' charset='utf-8'></script>
<script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm.js' charset='utf-8'></script>
<!--如果你用到了拓展包中的组件，还需要引用下面两个-->
<link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm-extend.css">
<script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm-extend.js' charset='utf-8'></script>
完整的页面模板
你可以直接用下面的模板来创建你的页面：

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>我的生活</title>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/favicon.ico">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">

    <link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm.min.css">
    <link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm-extend.min.css">

  </head>
  <body>
    <div class="page-group">
        <div class="page page-current">
        <!-- 你的html代码 -->
        </div>
    </div>

    <script type='text/javascript' src='//g.alicdn.com/sj/lib/zepto/zepto.min.js' charset='utf-8'></script>
    <script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm.min.js' charset='utf-8'></script>
    <script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm-extend.min.js' charset='utf-8'></script>

  </body>
</html>
使用组件
上面已经有了页面的基本结构，下一步就是把你需要的组件塞进去，这里我们以一个卡片形式的页面为例。我们主要会用到导航栏和卡片两个组件。

首先，我们需要一个标题栏和工具栏。

<div class="page">
  <header class="bar bar-nav">
    <a class="button button-link button-nav pull-left" href="/demos/card" data-transition='slide-out'>
      <span class="icon icon-left"></span>
      返回
    </a>
    <h1 class="title">我的生活</h1>
  </header>
  <nav class="bar bar-tab">
    <a class="tab-item active" href="#">
      <span class="icon icon-home"></span>
      <span class="tab-label">首页</span>
    </a>
    <a class="tab-item" href="#">
      <span class="icon icon-me"></span>
      <span class="tab-label">我</span>
    </a>
    <a class="tab-item" href="#">
      <span class="icon icon-star"></span>
      <span class="tab-label">收藏</span>
    </a>
    <a class="tab-item" href="#">
      <span class="icon icon-settings"></span>
      <span class="tab-label">设置</span>
    </a>
  </nav>
  <div class="content">
    <!-- 这里是页面内容区 -->
  </div>
</div>
然后我们在内容区中填上几个卡片

<div class="page-index">
  <div class="card">
    <div style="background-image:url(//gqianniu.alicdn.com/bao/uploaded/i4//tfscom/i3/TB10LfcHFXXXXXKXpXXXXXXXXXX_!!0-item_pic.jpg_250.3.0q60.jpg)" valign="bottom" class="card-header color-white no-border">旅途的山</div>
    <div class="card-content">
      <div class="card-content-inner">
        <p class="color-gray">发表于 2015/01/15</p>
        <p>此处是内容...</p>
      </div>
    </div>
    <div class="card-footer">
      <a href="#" class="link">赞</a>
      <a href="#" class="link">更多</a>
    </div>
  </div>
  <div class="card">
    <div style="background-image:url(//gqianniu.alicdn.com/bao/uploaded/i4//tfscom/i3/TB10LfcHFXXXXXKXpXXXXXXXXXX_!!0-item_pic.jpg_250.3.0q60.jpg)" valign="bottom" class="card-header color-white no-border">旅途的山</div>
    <div class="card-content">
      <div class="card-content-inner">
        <p class="color-gray">发表于 2015/01/15</p>
        <p>此处是内容...</p>
      </div>
    </div>
    <div class="card-footer">
      <a href="#" class="link">赞</a>
      <a href="#" class="link">更多</a>
    </div>
  </div>
  ... 可以多放几张卡片
</div>
最终效果是这样的 示例