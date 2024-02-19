<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html> 
<html lang="en"> 
<head> 
    <meta charset="UTF-8"> 
    <meta name="viewport" content="width=device-width, initial-scale=1"> 
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> 
    <style> 
        body { 
            padding-top: 56px; /* Adjust based on your navbar height */ 
        } 
        .navbar { 
            background-color: #f8f9fa; /* Light gray background color */ 
            border-bottom: 2px solid #dc3545; /* Red border color */ 
        } 
        h1 { 
            color: red; 
            text-align: center; 
        } 
        a { 
            text-decoration: none; 
            color: #007bff; /* Blue link color */ 
        } 
        a:hover { 
            color: #0056b3; /* Darker blue on hover */ 
        } 
        .navbar a { 
            margin-right: 15px; 
        } 
    </style> 
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script> 
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script> 
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
</head> 
<body> 
 
<nav class="navbar navbar-expand-lg navbar-light fixed-top"> 
    <a style="text-decoration: none;" class="navbar-brand" href="/">SDFC_BANK</a> 
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation"> 
        <span class="navbar-toggler-icon"></span> 
    </button> 
    <div class="collapse navbar-collapse" id="navbarNav"> 
        <ul class="navbar-nav"> 
            <li class="nav-item"><a class="nav-link" href="/">Home</a></li> 
            <li class="nav-item"><a class="nav-link" href="/new">New Account</a></li> 
            <li class="nav-item"><a class="nav-link" href="/balance">Balance</a></li> 
            <li class="nav-item"><a class="nav-link" href="/deposit">Deposit</a></li> 
            <li class="nav-item"><a class="nav-link" href="/withdraw">Withdraw</a></li> 
            <li class="nav-item"><a class="nav-link" href="/transfer">Transfer</a></li> 
            <li class="nav-item"><a class="nav-link" href="/close">Close A/c</a></li> 
            <li class="nav-item"><a class="nav-link" href="/aboutus">About Us</a></li> 
        </ul> 
    </div> 
</nav> 
        <h1>withdraw  FORM</h1> 
        <form:form method="POST" modelAttribute="withdraw"  action="/withdraBal"> 
     
        <table> 
          <tr> 
                <td>Account Number:</td> 
                <td><form:input path="account_Number" /></td> 
                
            </tr> 
            <tr> 
                <td> Name:</td> 
                <td><form:input path="name" /></td> 
                
            </tr> 
            <tr> 
                <td>Password:</td> 
                <td><form:input path="password" /></td> 
                
            </tr> 
            <tr> 
            <td>Amount:</td> 
             <td><form:input path="amount"/></td> 
            </tr> 
            
          <tr> 
                <td><input type="submit" name="submit" value="submit"></td> 
            <tr> 
        </table> 
    </form:form> 
</body>�
</center>
</html>