<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Form module</title>
</head>
<body>

   <h3>FORM Center</h3>
   <form:form modelAttribute="module" method="post" action="add-module">

        <form:label path="discipline">Formation name : </form:label>
        <form:input path="discipline" type="text"></form:input>

        <form:label path="sessionList">Session list </form:label>
        <form:input path="sessionList" type="text"></form:input>

        <br/>
        <form:button>Submit</form:button>
   </form:form>
</body>
</html>