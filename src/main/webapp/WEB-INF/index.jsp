<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Hopper's Receipt</title>
</head>
<body>
	<h1>
		Hopper's Receipt
	</h1>
	<br>
	<h2>
		Customer Name: <c:out value="${name}"></c:out>
	</h2>
	<br>
	<p>
		Item name: <c:out value="${itemName}"></c:out>
	</p>
	<p>
		Price: $<c:out value="${price}"></c:out>
	</p>
	<p>
		Description: <c:out value="${description}"></c:out>
	</p>
	<p>
		Vendor: <c:out value="${vendor}"></c:out>
	</p>
	
</body>
</head>