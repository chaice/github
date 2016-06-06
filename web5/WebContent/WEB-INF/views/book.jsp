<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书管理</title>
<%@ include file="head.jsp"%>
<a type="button" class="btn btn-success" style="float: right"
	href="/book_add1">新增图书</a>
<div class="bs-example" data-example-id="contextual-table">
	<form class="form-inline" action="/book_find1">
		<div class="form-group">
			<div class="input-group">
				<input type="text" class="form-control" id="exampleInputAmount"
					placeholder="请输入" name="wd">
			</div>
		</div>
		<button type="submit" class="btn btn-primary">搜索</button>
	</form>
	<table class="table">
		<thead>
			<tr class="active">
				<th scope="row">序号</th>
				<th>书号</th>
				<th>书名</th>
				<th>作者</th>
				<th>出版社</th>
				<th>总数</th>
				<th>剩余数量</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="b" items="${requestScope.list}">
				<tr class="info">
					<th scope="row">${b.id}</th>
					<td>${b.code }</td>
					<td>${b.title}</td>
					<td>${b.author}</td>
					<td>${b.publishing}</td>
					<td>${b.total}</td>
					<td>${b.count}</td>
					<td>
						<button id="${b.code}" type="button"
							class="btn btn-warning">修改</button>
						<button id="${b.id}" type="button" class="btn btn-danger">删除</button>

					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
	$("#l3").addClass("active");
	$("button.btn-danger").click(function() {
		var id = $(this).attr("id");
		if (confirm("确认要删除？")) {
			location.href = "book_del?id=" + id;
		}
	});
	$("button.btn-warning").click(function() {
		var code = $(this).attr("id");
		location.href = "book_find?code=" + code;
	});
</script>
</body>
</html>