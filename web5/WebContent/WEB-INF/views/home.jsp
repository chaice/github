<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页</title>
<%@ include file="head.jsp"%>
<c:choose>
<c:when test="${param.mes == 100 }"><div class="container">
			<strong class="btn-success">借书成功！</strong>
		</div></c:when>
<c:when test="${param.mes == 101 }"><div class="container">
			<strong class="btn-danger">借书失败！</strong>
		</div></c:when>
<c:when test="${param.mes == 200 }"><div class="container">
			<strong class="btn-success">还书成功！</strong>
		</div></c:when>
<c:when test="${param.mes == 201 }"><div class="container">
			<strong class="btn-danger">还书失败</strong>
		</div></c:when>
</c:choose>
<div class="row">
	<div class="col-md-8 col-md-offset-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span>借书</span>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="/bor" method="post">
					<div class="form-group">
						<label class="col-md-4 control-label">卡号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="cardcode">
							<span class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">书号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="bookcode">
							<span class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-6 col-md-offset-4">
							<button class="btn btn-primary">
								<span> <i class="fa fa-btn fa-check-circle"></i>确定
								</span>
							</button>
						</div>
					</div>
			</div>
			</form>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-md-8 col-md-offset-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span>还书</span>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="/ret" method="post">
					<div class="form-group">
						<label class="col-md-4 control-label">卡号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="cardcode">
							<span class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">书号</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="bookcode">
							<span class="help-block" style="display: none;"> </span>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-6 col-md-offset-4">
							<button class="btn btn-primary">
								<span> <i class="fa fa-btn fa-check-circle"></i>确定
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
	$("#l1").addClass("active");
</script>
</body>
</html>