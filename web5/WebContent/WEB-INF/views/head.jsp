<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	padding-top: 20px;
	padding-bottom: 20px;
}

.navbar {
	margin-bottom: 20px;
}
</style>
</head>

<body>
	<div class="container">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<strong class="navbar-brand">图书馆管理系统</strong>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li id="l1"><a href="/home">主页</a></li>
						<li id="l2"><a href="/card">借书卡管理</a></li>
						<li id="l3"><a href="/book">图书管理</a></li>
					</ul>
					<ol style="float: right" class="nav navbar-nav">
						<li><a>当前在线人数:${applicationScope.count}</a></li>
					</ol>
					<ul class="dropdown nav navbar-nav" style="float: right">
						<li><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">欢迎${sessionScope.username}登陆<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">修改密码</a></li>
								<li><a href="#">切换账号</a></li>
								<li><a href="/exit">安全退出</a></li>
							</ul></li>
					</ul>
				</div>
				<div id="navbar" class="navbar-collapse collapse"></div>
			</div>
		</nav>