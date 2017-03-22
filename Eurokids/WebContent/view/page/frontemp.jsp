<%@page import="org.eurokids.model.Page"%>
<%@page import="org.eurokids.doa.PageDt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <title>SoftDevNep</title>
       <head>
  
        <title><?php global $title; echo $title;?></title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- Bootstrap -->
	      <link href="../../css/bootstrap.css" rel="stylesheet">
      <link href="../../css/bootstrap.min.css" rel="stylesheet">
	  	  <link href="../../css/bootstrap-responsive.css" rel="stylesheet"/>
	  <link href="../../css/bootstrap-responsive.min.css" rel="stylesheet"/>
	<link href="../../css/font-awesome.css" rel="stylesheet" type="text/css">
         <script src="../../js/bootstrap.js"></script>
  <script src="../../js/bootstrap.min.js"></script>
  
 <script src="../../js/jquery.js" type="text/javascript"></script>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  
  
  <script src="../../js/jquery-2.1.4.js"></script>
  <script src="../../js/jquery-2.1.4.min.js"></script>
  <script src="../../js/jquery-ui.js"></script>
  <script src="../../js/jquery-ui.min.js"></script>
  
  <script src="../../jquery/jquery.js"></script>

  <link rel="stylesheet" type="text/css" href="../../style/stylesheet.css"/>
  </head>
  <body style="background-color:turquoise">
     <div class="container">
          <div style="border: 5px solid yellow; "></div>
          <div class="row">
          <div id="banner" style="border: transparent; width: 100%;border: 0px">
              <img src="../../image/euro_logo.jpg" style="background-repeat: no-repeat; width: 100%;background-color:transparent;border:0px;" class="img-responsive"/>
            </div>
          </div>
          
              <div class="container" style="marging-left:5px;margin-right:20px;width">
                  
              <nav class="navbar nav">
          			<div class="row">
                  <div class="navbar-brand" style="height: 35px; background-color: blue;width:300px;margin-left:60px;">
                  <h3 class="shadow text1">EuroKidsNepal</h3>
                  <img src="../../image/euro_bunny.JPG" class="img-responsive img-circle" style="width:150px;height:150px;">
              	</div>
              
              <ul class="nav navbar-nav " style="background-color: #00bfff; height: 35px; float: right;margin-right:50px;">
                  <li><a href="">HOME</a></li>
                  <li><a href="#program">PROGRAM</a></li>
                  <li><a href="#portfolio">PORTFOLIO</a></li>
                  <li><a href="">CLIENTS</a></li>
                  <li><a href="">MEET THE TEAM</a></li>
                </ul>
             
              </nav>
              <%
              	PageDt doa =new PageDt();
              	
              	Page pg=doa.getById(1);
              	
              %>
              <div class="row">
                      <div class="jumbotron sandbox sandbox-correct-pronounciation img-responsive" style="background-color: #4169e1;margin:-32px; height: 500px; backface-visibility: hidden;background-image: url(<%=pg.getImage() %>);background-size:cover;background-repeat: no-repeat; margin-left: 10px;margin-right:10px;">;
              
              <h3 class="heading heading-correct-pronounciation" style="color:yellow"><%=pg.getTitle() %></h3>
              <em style="text-align: center; color: white; float: right;font-weight:bold;" ><%=pg.getDescription()%></em>
              <button class="button btn btn-sm">Read More</button>
       
            </div>
            </div>
            
			 </div>
			 <%pg=doa.getById(2);
			 %>
          <div class="container">
                  <div class="row" style="margin-left:20px;">
                  <div class="col-md-3 box2" style="width:250px;height:400px;">
                  	
                      <img src="<%=pg.getImage() %>" class="img-responsive img-circle imgProcess"/>
                      <h6><%=pg.getTitle() %></h6>
                      <p style="padding-top:0px;text-align:center;"><%=pg.getDescription().substring(0,120)%>
                      ....</p>
                      <button class="button btn btn-sm" style="margin-top:0px;">Read More</button>
                      
                  </div>
                  <%pg=doa.getById(3); %>
                  <div class="col-md-3 box2" style="width:250px;height:400px;">
                  	
                      <img src="<%=pg.getImage() %>" class="img-responsive img-circle imgProcess"/>
                      <h6><%=pg.getTitle() %></h6>
                      <p style="padding-top:0px;text-align:center;"><%=pg.getDescription().substring(0,120)%>
                      ....</p>
                      <button class="button btn btn-sm" style="margin-top:0px;">Read More</button>
                      
                  </div>
                  <%pg=doa.getById(4); %>
                  <div class="col-md-3 box2" style="width:250px;height:400px;">
                      <img src="<%=pg.getImage() %>" class="img-responsive img-circle imgProcess" style="width:200px;height:200px;"/>
                      <h6><%=pg.getTitle() %></h6>
                      <p style="padding-top:15px;text-align:center;"><%=pg.getDescription().substring(0,120)%>
                      ....</p>
                      <button class="button btn btn-sm" style="margin-top:0px;">Read More</button>
                      
                  </div>
                  <%pg=doa.getById(5); %>
                  <div class="col-md-3 box2" style="width:250px;height:400px;">
                      <img src="<%=pg.getImage() %>" class="img-responsive img-circle imgProcess" style="width:200px;height:200px;"/>
                      <h6><%=pg.getTitle() %></h6>
                      <p style="padding-top:15px;text-align:center;"><%=pg.getDescription().substring(0,120)%>
                      ....</p>
                      <button class="button btn btn-sm" style="margin-top:0px;">Read More</button>
                      
                  </div>
                  </div></div>
                      
         <div class="container" id="program">
              <div class="row">
                  <div class="jumbotron" style="background-color: transparent">
                  <%pg=doa.getById(12);%>
                      <div style="background-color:#66FF33;padding: 30px;border-top: 2px solid red;border-left: 2px solid red;border-right: 2px solid red;" > <h4 class="text-center text1" style="color: blue; font-size: 20px;"><%=pg.getTitle() %></h4>
                      <p style="text-align: center;font-size: 1em"><%=pg.getDescription() %></p>
                      <div class="col-md-offset-6"><a><span class="glyphicon  glyphicon-chevron-left"></span></a><a><span class="glyphicon glyphicon-chevron-right"></span></a></div>
                      </div><div class="row" style="margin-left:0px;margin-right: 0px; border-left: 2px solid red;border-right: 2px solid red;">
                        	 <%pg=doa.getById(13);%>
                              <div class="col-md-3 box3" style="background-color:white;width:220px;height:320px;">
                                 <div style="background-color:turquoise;"><h6 style="font-size:20px;font-weight:bold;text-align:center;color:blue;"><%=pg.getTitle() %></h6></div> 
                                  <p style="text-align: center;font-size: 16px;padding-top:0px;text-align:center;"><%=pg.getDescription() %></p>
                             	  <img src="<%=pg.getImage()%>" class="img-responsive" style="padding-top:0px;border-radius:30%;">
                             	  <button class="button btn btn-sm" style="margin-top:10px;">Read More</button>
                              </div>
                              <div class="col-md-3 box3" style="background-color:white;width:220px;height:320px;">
                                 <div style="background-color:turquoise;"><h6 style="font-size:20px;font-weight:bold;text-align:center;color:blue;"><%=pg.getTitle() %></h6></div> 
                                  <p style="text-align: center;font-size: 16px;padding-top:0px;text-align:center;"><%=pg.getDescription() %></p>
                             	  <img src="<%=pg.getImage()%>" class="img-responsive" style="padding-top:0px;border-radius:30%;">
                             	  <button class="button btn btn-sm" style="margin-top:10px;">Read More</button>
                              </div>
                              <div class="col-md-3 box3" style="background-color:white;width:220px;height:320px;">
                                 <div style="background-color:turquoise;"><h6 style="font-size:20px;font-weight:bold;text-align:center;color:blue;"><%=pg.getTitle() %></h6></div> 
                                  <p style="text-align: center;font-size: 16px;padding-top:0px;text-align:center;"><%=pg.getDescription() %></p>
                             	  <img src="<%=pg.getImage()%>" class="img-responsive" style="padding-top:0px;border-radius:30%;">
                             	  <button class="button btn btn-sm" style="margin-top:10px;">Read More</button>
                              </div>
                               <div class="col-md-3 box3" style="background-color:white;width:220px;height:320px;">
                                 <div style="background-color:turquoise;"><h6 style="font-size:20px;font-weight:bold;text-align:center;color:blue;"><%=pg.getTitle() %></h6></div> 
                                  <p style="text-align: center;font-size: 16px;padding-top:0px;text-align:center;"><%=pg.getDescription() %></p>
                             	  <img src="<%=pg.getImage()%>" class="img-responsive" style="padding-top:0px;border-radius:30%;">
                             	  <button class="button btn btn-sm" style="margin-top:10px;">Read More</button>
                              </div>
                         
                      </div>
                  </div>
                  
              </div>
              <div class="row" id="portfolio">
                  <div class="jumbotron" style="background-color: transparent">
                      <div  style="background-color: #FCC;padding: 30px;border-left: 2px solid yellow;border-right: 2px solid yellow;"> <h4 class="text-center text1" style="color: blue; font-size: 20px;">Client Have To Say</h4>
                      <p style="text-align: center;font-size: 1em">Every Client are big responsibilities for us. It what drive us to perfection. By giving what our client need's are our challenge.</p>
                      <div class="col-md-offset-6"><a><span class="glyphicon  glyphicon-chevron-left"></span></a><a><span class="glyphicon glyphicon-chevron-right"></span></a></div>
                      </div><div class="row" style="margin-left:0px;margin-right: 0px; border-left: 2px solid brown;border-right: 2px solid brown;">
                        
                              <div class="col-md-4 wrap">
                                  
                                  <p style="text-align: center;font-size: 16px;padding-top: 20px;">CRS is collaborating with the Poverty Alleviation Fund (PAF) in the impoverished midwestern region of Nepal to improve access to and increase awareness of family planning products.</p>
                                  <img src="image/nepalcrs.PNG" class="img-responsive img-circle" style="margin: 15px 25px 0px 25px;width: 200px;height: 200px;">                              </div>
                              <div class="col-md-4 wrap">
                                  
                                  <p style="text-align: center;font-size: 16px;padding-top: 20px;">CRS is collaborating with the Poverty Alleviation Fund (PAF) in the impoverished midwestern region of Nepal to improve access to and increase awareness of family planning products.</p>
                                  <img src="image/nepalcrs.PNG" class="img-responsive img-circle" style="margin: 15px 25px 0px 25px;width: 200px;height: 200px;">                              </div>
                                  <div class="col-md-4 wrap">
                                  
                                  <p style="text-align: center;font-size: 16px;padding-top: 20px;">CRS is collaborating with the Poverty Alleviation Fund (PAF) in the impoverished midwestern region of Nepal to improve access to and increase awareness of family planning products.</p>
                                  <img src="image/nepalcrs.PNG" class="img-responsive img-circle" style="margin: 15px 25px 0px 25px;width: 200px;height: 200px;">                              </div>
                         
                      </div>
                  </div>
                  
              </div>
          </div>
		
</body>

</html>