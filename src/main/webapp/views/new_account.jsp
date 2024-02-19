      <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create New Account</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        form {
            max-width: 400px;
            margin: 0 auto;
        }
        label {
            display: block;
            margin-bottom: 8px;
        }
        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }
        button {
            background-color: #0066cc;
            color: #fff;
            padding: 10px 15px;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Create New Account</h1>
    <form action="/register" method="post">
        <label for="account_Number">Account Number:</label>
        <input type="text" id="account_Number" name="account_Number" required>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <label for="amount">Amount:</label>
        <input type="text" id="amount" name="amount" required>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required>

        <label for="mobileNo">Mobile Number:</label>
        <input type="text" id="mobileNo" name="mobileNo" required>

        <button type="submit">Submit</button>
        <button type="reset">Clear</button>
    </form>
</body>
</html>