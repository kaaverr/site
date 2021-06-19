<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<center><h1>Update now travel</h1></center>
<div>
    <fieldset>
        <form name = "client" action="" method="POST">
            FirstName: <@spring.formInput "form.firstname" "" "Text"/>
            <br>
            LastName: <@spring.formInput "form.lastname" "" "Text"/>
            <br>
            FathersName: <@spring.formInput "form.fathersname" "" "Text"/>
            <br>
            Address: <@spring.formInput "form.address" "" "Text"/>
            <br>
            FoneNumber: <@spring.formInput "form.fonenumber" "" "Text"/>
            <br>
            <input type="submit" value="Create"/>

        </form>
    </fieldset>
</div>

<center><a href="/index.html"> <button><h4>Menu</h4></button></a></center>
<center><a href="/ui/rooms/clients"> <button><h2> Customer List </h2></button></a></center>

</body>
</html>