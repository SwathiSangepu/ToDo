<%@ include file="common/header.jsp" %>
<%@ include file="common/navigation.jsp" %>
<div class="container">
	<h1>Enter Todo details</h1>
		
		<form:form method="post" modelAttribute="todo">
			<fieldset class="mb-3">
				<form:label path="desc">Description</form:label>
				<form:input type="text" path="desc" required="required"/>
				<form:errors type="error" path="desc" cssClass="text-warning"/>
			</fieldset>
		
		<fieldset class="mb-3">
			<form:label path="targetDate">Target Date</form:label>
			<form:input type="text" path="targetDate" required="required"/>
			<form:errors type="error" path="targetDate" cssClass="text-warning"/>
		</fieldset>
		
		<form:input type="hidden" path="id" />
		<form:input type="hidden" path="status" />
		<input type="submit" class="btn btn-success"/>
		
		</form:form>
		</div>
<%@ include file="common/footer.jsp" %>
		<script type="text/javascript">
		$('#targetDate').datepicker({
			format:'yyyy-mm-dd',
		});
		
		</script>

