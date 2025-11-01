<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: POST");
header("Access-Control-Allow-Headers: Content-Type");

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST["name"] ?? "";
    $age = $_POST["age"] ?? "";
    $gender = $_POST["gender"] ?? "";
    $location = $_POST["location"] ?? "";
    $health = isset($_POST["health"]) ? implode(", ", $_POST["health"]) : "None";
    $diet = $_POST["diet"] ?? "";
    $preference = isset($_POST["preference"]) ? implode(", ", $_POST["preference"]) : "None";
    $lifestyle = $_POST["lifestyle"] ?? "";
    $goal = $_POST["goal"] ?? "";
    $sleep = $_POST["sleep"] ?? "";
    $water = $_POST["water"] ?? "";

    $conn = new mysqli("localhost", "root", "", "grocery_db");
    if ($conn->connect_error) die("Connection failed: " . $conn->connect_error);

    $sql = "INSERT INTO user_profile 
            (name, age, gender, location, health_conditions, diet, preferences, lifestyle, goal, sleep, water)
            VALUES ('$name', '$age', '$gender', '$location', '$health', '$diet', '$preference', '$lifestyle', '$goal', '$sleep', '$water')";

    if ($conn->query($sql) === TRUE) {
        echo "✅ Profile saved successfully!";
    } else {
        echo "❌ Error: " . $conn->error;
    }

    $conn->close();
}
?>
