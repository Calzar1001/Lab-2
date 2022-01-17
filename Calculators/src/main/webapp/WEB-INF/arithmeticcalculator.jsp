<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        <link href="css/style.css"type="text/css" rel="stylesheet">
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="first"> First: </label>
            <input type="number" name="first" id="first">
            <br>
            <label for="second"> Second: </label>
            <input type="number" name="second" id="second">
            <br>
            <button name="action" value="add">+</button>
            <button name="action" value="sub">-</button>
            <button name="action" value="mult">*</button>
            <button name="action" value="rem">%</button>
			<br>
                 ${message}
                <br>
                <a href="#age">Age Calculator</a>
            </p>

        </form>
    </body>
</html>
