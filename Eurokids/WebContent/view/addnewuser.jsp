<%@ include file="header.jsp" %>
<div class="row">
	<div class="col-sm-9 col-md-9 com-xs-9">
		<section>
		
			<form class="form" action="../jsp/manageAddNew.jsp" method="post">
				<table class="table table-condensed">
					<tr>
						<td>Add New User</td>
						
					</tr>
					<tr></tr>
					<tr>
						<td><label>Username: </label></td><td><input type="text" class="form-input" name="username"></td>
						
					</tr>		
					<tr>
					<td><label>Email Address: </label> </td><td><input type="text" class="form-input" name="emailId"></td>
					</tr>
					<tr>
					<td><label>Password: </label></td><td><input type="text" class="form-input" name="password"></td>
					</tr>
					<tr>
					<td><label>Status: </label></td><td>
					<select name="status">
						<option value=0>Active</option>
						<option value=1 selected="selected">Not Active</option>
					</select></td>
					</tr>
					<tr>
						<td></td>
						<td><button class="btn btn-success" name="action" value="addNewUser">Submit</button></td>
					</tr>
					
					
					
				</table>
			</form>
		</section>
	</div>
	</div>
</div>
</body>
</html>