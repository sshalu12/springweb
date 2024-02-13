<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <h2>Shalini Calculator and Information</h2>

         <form action="add">
                <label for="num1">Enter 1st Number :</label>
                <input type="text" id=num1" name="num1"><br>
                <label for="num2">Enter 2nd Number :</label>
                <input type="text" id="num2" name="num2"><br>
                <input type="submit" value="Submit">
            </form>
            <h5> OR </h5>
         <form action="submit">
                         <label for="eid">Enter ID :</label>
                         <input type="text" id=eid" name="eid"><br>
                         <label for="ename">Enter Name :</label>
                         <input type="text" id="ename" name="ename"><br>
                         <input type="submit" value="Submit">
         </form>

    </body>
</html>
