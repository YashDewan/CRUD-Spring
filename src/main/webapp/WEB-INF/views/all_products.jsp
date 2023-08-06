<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CRUD APP</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
 </head>
<body>
 <%@include file="./nav.jsp" %>
 <div class="container mt-3">
  <table class="table">
	  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">Title</th>
	      <th scope="col">Description</th>
	      <th scope="col">Price</th>
	      <th scope="col">Action</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach items="${allprods}" var="p">
	  		<tr>
		      <th scope="row">YD0${p.prodId}</th>
		      <td>${p.title}</td> 
		      <td>${p.description}</td>
		      <td>&#8377; ${p.price}</td>
		      <td>
		      	<a href="delete/${p.prodId}"><i class="fa-solid fa-trash" style="font-size:30px;"></i></a>
		      	<a href="edit/${p.prodId}"><i style="font-size:30px;" class="fa-solid fa-pen-to-square"></i></a>
		      </td>
		    </tr>
	  	</c:forEach>
	  </tbody>
	</table>
 </div>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>