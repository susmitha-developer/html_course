<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<style>
#one{
    background-color: aqua;
    height: 100px;
    width: 100px;
}
</style>

</head>
<body>

<button onclick="my()">save</button>

<div id="one" onclick="my()">
    <div id="two">
        <div id="th">
            <h3>hello java script</h3>
        </div>
    </div>
</div>

<h5>java</h5>

<script>

function my(){

    let a = document.getElementById("one")

    a.style.backgroundColor = "gray"
    a.style.width = "600px"
    a.style.height = "400px"
    a.style.transitionDuration = "3s"

    let b = a.querySelector("#two")

    b.style.backgroundColor = "pink"
    b.style.width = "500px"
    b.style.height = "300px"
    b.style.transitionDuration = "3s"

    let c = b.querySelector("div")

    c.style.backgroundColor = "green"
    c.style.width = "400px"
    c.style.height = "200px"
    c.style.transitionDuration = "3s"

    let d = c.querySelector("h3")

    d.style.color = "white"
    d.style.transitionDuration = "3s"

    console.log(d)
}

</script>

</body>
</html>