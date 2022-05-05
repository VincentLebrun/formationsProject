<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>FORM Center</title>
</head>
<body>

   <h3>FORM Center</h3>
   <form:form modelAttribute="formation" method="post" action="add-formation">

        <form:label path="formationName">Formation name : </form:label>
        <form:input path="formationName" type="text"></form:input>

        <form:label path="sessionList">Session list </form:label>
        <form:input path="sessionList" type="text"></form:input>

        <br/>
        <form:button>Submit</form:button>
   </form:form>
</body>
</html>