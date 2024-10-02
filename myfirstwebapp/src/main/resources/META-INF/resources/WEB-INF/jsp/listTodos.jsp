<%@ include file="common/header.jsp" %>
<%@ include file="common/navigation.jsp" %>
<div class="container">
	<div>Your Todo's are
	<table class="table">
			<thead>
			<tr>
				<th>Description</th>
				<th>TargetDate</th>
				<th>Status</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.desc}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.status}</td>
					<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a> </td>
					<td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>	
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
<%@ include file="common/footer.jsp"%>