<%@page import="java.util.List"%>
<%@page import="org.eurokids.doa.DataAccess"%>
<%@page import="org.eurokids.model.Admin"%>
<%@ include file="header.jsp" %>
<div class="row">
	<div class="col-sm-9 col-md-9 com-xs-9">
	<%
		DataAccess dao=new DataAccess();
		List<Admin>admin=dao.getAll();
	%>
		<section>
			<h4 style="background:color:black;font-size:18px;font-weight:bold;">User</h4>
			<a href="addnewuser.jsp" ><i class='glyphicon glyphicon-plus text-primary'></i> Add New User</a>
			
			<table class="table table-condensed">
				<thead>
				<tr>
				<th>Username</th>
				<th>Email</th>
				<th>Edit</th>
				<th>Delete</th>
				</tr>
				</thead>
				
				<tbody>
				<%for(Admin ad:admin){ %>
				<tr>
				
				<td><%=ad.getUsername() %></td>
				
				<td><%=ad.getEmail() %></td>
				<td>
					<a href="edituser.jsp?action=edit&id=<%=ad.getId()%>"><i class='glyphicon glyphicon-pencil text-primary'></i> Edit</a></td><td>
					<a href="edituser.jsp?action=delete&id=<%=ad.getId()%>"><i class='glyphicon glyphicon-remove text-primary'></i> Delete</a>
				</td>
				</tr>
				<%} %>
				</tbody>
				
			</table>
		</section>
	</div>
	<%Admin ad =(Admin)session.getAttribute("userInformation");%>
	<div class="col-md-3 col-sm-3 col-xs-3">
		<a href=""><i class="glyphicon glyphicon-user"></i>  <%=ad.getUsername()%></a>
	</div>
	</div>
</div>
</body>
</html>