<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增书籍</title>
<%@ include file="head.jsp"%>
<div class="row">
	<div class="col-md-8 col-md-offset-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span> Register </span>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="/book_add2" method="post">
					<div class="form-group">
						<label class="col-md-4 control-label">书号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="code"
								placeholder="请输入书号！"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">书名</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="title"
								placeholder="请输入书名！"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">作者</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="name"
								placeholder="请输入作者！"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">出版社</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="pub"
								placeholder="请输入出版社！"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">总数</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="total"
								placeholder="请输入总数！"> <span class="help-block"
								style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-6 col-md-offset-4">
							<button class="btn btn-primary">
								<span> <i class="fa fa-btn fa-check-circle"></i>添加
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