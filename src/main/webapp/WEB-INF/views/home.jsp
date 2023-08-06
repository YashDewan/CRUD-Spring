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
    <form method="post" class="container mt-3" action="formSubmit">
	  <div class="mb-3">
	    <label class="form-label">Product Title</label>
	    <input type="text" name="title" class="form-control" id="title">
	  </div>
	  <div class="mb-3">
	    <label for="floatingTextarea2">Product Description</label>
		<textarea class="form-control" name="description" id="floatingTextarea2" style="height: 200px"></textarea>
	  </div>
	  <div class="mb-3">
	    <label class="form-label">Product Price</label>
	    <input type="number" name="price" class="form-control" id="title">
	  </div>
	  <button type="submit" class="btn btn-primary mt-4">Submit</button>
	</form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>