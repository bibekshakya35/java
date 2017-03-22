<%@page import="org.eurokids.doa.DataAccess"%>
<%@page import="org.eurokids.model.Admin"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp" %>
<%
	
	DataAccess doa =new DataAccess();
	Admin ad=new Admin();
	String id=request.getParameter("id");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	String status =request.getParameter("status");
	String emailID=request.getParameter("emailId");
	String action=request.getParameter("action");
	if("edit".equals(action)){
		int idint=Integer.parseInt(id);
		ad=doa.getAdminById(idint);
	}
	else if("update".equals(action)){
		int idInt=Integer.parseInt(request.getParameter("id"));
		
		ad=new Admin(username,emailID,password);
		doa.updateAdmin(idInt,ad);
		response.sendRedirect("adminmanager.jsp");
	}
	else if("delete".equals(action)){
		int idInt =Integer.parseInt(id);
		doa.deleteAdmin(idInt);
		response.sendRedirect("adminmanager.jsp");
	}
	
%>
<form class="form" action="edituser.jsp" method="post">
				<input type="hidden" name="id" value="<%=ad.getId()%>">
				<table class="table table-condensed">
					<tr>
						<td><center>Add New User</center></td>
						
					</tr>
					<tr></tr>
					<tr>
						<td><label>Username: </label></td><td><input type="text" class="form-input" name="username" value="<%=ad.getUsername()%>"></td>
						
					</tr>		
					<tr>
					<td><label>Email Address: </label> </td><td><input type="text" class="form-input" name="emailId" value="<%=ad.getEmail()%>"></td>
					</tr>
					<tr>
					<td><label>Password: </label></td><td><input type="text" class="form-input" name="password" value="<%=ad.getPassword()%>"></td>
					</tr>
					
					
					<tr>
						<td></td>
						<td><button class="btn btn-success" name="action" value="update">Submit</button></td>
					</tr>
					
					
					
				</table>
			</form>
		</section>
	</div>
	</div>
</div>

</body>
</html>