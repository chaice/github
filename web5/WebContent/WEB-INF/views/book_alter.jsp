<%@ page import="com.ccit.sta.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改书籍</title>
<%@ include file="head.jsp"%>

<div class="row">
	<div class="col-md-8 col-md-offset-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span> Register </span>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form"
					action="/book_alter?id=${requestScope.book.id}" method="post">
					<div class="form-group">
						<label class="col-md-4 control-label">书号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="code"
								value="${requestScope.book.code}"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">书名</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="title"
								value="${requestScope.book.title}"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">作者</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="name"
								value="${requestScope.book.author}"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">出版社</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="pub"
								value="${requestScope.book.publishing}"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">总数</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="total"
								value="${requestScope.book.total}"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">剩余数量</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="count"
								value="${requestScope.book.count}"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-6 col-md-offset-4">
							<button class="btn btn-primary">
								<span> <i class="fa fa-btn fa-check-circle"></i>修改
								</span>
							</button>
						</div>
					</div>
			</div>
			</form>
		</div>
	</div>
</div>
</div>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
	$("#l3").addClass("active");
</script>
</body>
</html>