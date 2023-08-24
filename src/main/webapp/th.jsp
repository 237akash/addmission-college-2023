<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>College Website Login</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    background-color: #f4f4f4;
    background-image: url("https://static.vecteezy.com/system/resources/previews/020/328/693/non_2x/3d-white-particle-wave-pattern-on-a-black-background-digital-abstract-background-can-be-applied-for-web-design-website-wallpaper-banner-or-cover-illustration-vector.jpg");
    background-size: cover;
  }
  .container {
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
    width: 300px;
  }
  .form-group {
    margin-bottom: 15px;
  }
  label {
    display: block;
    margin-bottom: 5px;
  }
  input {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 3px;
  }
  button {
  
  
    background-color: #007BFF;
    color: #fff;
    border: none;
    padding: 10px 20px;
    border-radius: 3px;
    cursor: pointer;
  }
</style>
</head>
<body>
<form action="logservlet" method="post">
<div class="container">
  <h2>Login</h2>
  <div class="form-group">
    
   Username<input type="text" name="uname" placeholder="Enter your username" required>
  </div>
  <div class="form-group">
Password<input type="password" name="password" placeholder="Enter your password" required>
  </div>
<button>Login</button>
</div>
</form>
</body>
</html>
