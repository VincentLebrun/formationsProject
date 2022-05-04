<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>FORM Center</title>
</head>
<body>

   <h3>FORM Center</h3>
   <form:form modelAttribute="center" method="post" action="add-center">

        <form:label path="name">Name center : </form:label>
        <form:input path="name" type="text"></form:input>

        <form:label path="address">Address : </form:label>
        <form:input path="address" type="text"></form:input>

        <br/>
        <form:label path="form">Formation : </form:label>
        <form:input path="form" type="text"></form:input>

        <br/>
        <form:button>Submit</form:button>
   </form:form>

</body>
</html>