<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
  <link rel = "stylesheet" type = "text/css" href = "css/footer.css">
  <link rel = "stylesheet" type = "text/css" href = "css/admin_page.css">

    
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  



   <title>Robo Battle</title>
   <meta name="viewport" content="width=device-width, initial-scale=1">     

<style>
p.heading{
       text-align : center;	
	   
	   font-size : 50px;
	   color : #00FFFF;
	   font-family: HeadFont;

	}
	
body{
       background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.5)), url('Image/Robo3.jpg');
	   background-size: cover;
	   background-repeat: no-repeat;
       background-attachment:fixed;
	   background-position : center center;
	   
	   
	}
	
input[type=text], input[type=password], input[type=email] , input[type=number], input[type=tel]{
	   width: 90%;
	   padding: 5px 2px;
	   margin: 10px 0;
	   display: inline-block;
	   border: 1px solid #ccc;
	   border-radius: 5px;
	   
    } 

.start_login{
	   padding: 16px;
	   text-align : center;
	  
	}
a:hover.decorate{
	   background: linear-gradient(rgba(0,0,0,.5), rgba(0,0,0,.5));
	   text-decoration : none;
	   display: block;
	   color: #00FFFF;
	}

.active{
     background: linear-gradient(rgba(0,0,0,.5), rgba(0,0,0,.5));
     text-decoration : none;
     display: block;
     color: #00FFFF;
}

a{
	   text-decoration : none;
	   color : #FFFFFF;
	   font-size : 22px;
	   font-family: side_Bar_Font;
	   
	}


	
*{
       box-sizing: border-box;
    }

@font-face {
      font-family: NavFont;
      src: url(Fonts/fon4.otf);
   
}
@font-face{
	   font-family: TextFont;
	   src: url(Fonts/font1.otf);;
}

@font-face {
   	   font-family: HeadFont;
   	   src: url(Fonts/font2.otf);
   
}

	
</style>

</head>


<body>

	   <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li><a href="Index.html">Home</a></li>
      <li><a href="rools.html">Rules </a></li>
      <li><a href="about.html">About Us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Login.html"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>

     <p class = "heading"><b>ROBO BATTLE</b><br><b>2020</b></p>
   
           <div class = " col-2"> 
		   <table cellpadding = "10">
			<tr><td height = "40"><a class = "decorate active" target = "top" href = "Admin.html" >Team Details</a></td></tr>
			<tr><td height = "40"><a class = "decorate" target = "top" href = "order.html">Order food</a></td></tr>
			</table>
		   </div>

		   <div class = "col-10">
           <table style="color: white; font-size: 15px;" class = "table table-bordered" >
        	   <thead>
        		  <tr>
        		    <th>Team name</th>
        			<th>Leader name</th>
        			<th>Team Member1 Name</th>
                                <th>Team Member1 Name</th>
        			<th>No of non veg food</th>
        			<th>No of veg food</th>
        			<th>Address</th>
        			<th>Contact_No</th>
        		  </tr>
        		</thead> 
                        <tbody>
  <%                          

   Class.forName("com.mysql.jdbc.Driver");
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");
   String data = "SELECT * FROM student ORDER BY t_name desc";
   Statement stat = conn.createStatement();
//   PreparedStatement stat = conn.prepareStatement(data);
   ResultSet res = stat.executeQuery(data);
   
   while(res.next()){
   %>
       
                  <tr>
         			<td><%=res.getString("t_name")%></td>
         			<td><%=res.getString("l_name")%></td>
         			<td><%=res.getString("t_mate1")%></td>
         			<td><%=res.getString("t_mate2")%></td>
         			<td><%=Integer.parseInt(res.getString("non_veg"))%></td>
         			<td><%=Integer.parseInt(res.getString("veg"))%></td>
         			<td><%=res.getString("address")%></td>
         			<td><%=Integer.parseInt(res.getString("c_no"))%></td>
         			
         			

         		  </tr>
<% 
}
%>
                        </tbody>
           </table>
        </div>