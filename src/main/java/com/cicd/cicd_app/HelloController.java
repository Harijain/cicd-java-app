package com.cicd.cicd_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {

        String time = LocalDateTime.now().toString().replace("T", "  ");

        return """
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>CI/CD Dashboard</title>

<style>

*{
margin:0;
padding:0;
box-sizing:border-box;
font-family:-apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif;
}

body{

background:#f5f7fb;

display:flex;

justify-content:center;

align-items:center;

height:100vh;

color:#222;

}

.container{

width:900px;

background:white;

border-radius:30px;

padding:50px;

box-shadow:
0 15px 50px rgba(0,0,0,.08);

}

h1{

font-size:48px;

font-weight:700;

margin-bottom:10px;

}

.subtitle{

font-size:18px;

color:#777;

margin-bottom:40px;

}

.grid{

display:grid;

grid-template-columns:1fr 1fr;

gap:20px;

}

.card{

background:#fafafa;

padding:30px;

border-radius:20px;

border:1px solid #eee;

transition:.3s;

}

.card:hover{

transform:translateY(-5px);

box-shadow:0 10px 30px rgba(0,0,0,.08);

}

.title{

font-size:15px;

color:#999;

margin-bottom:10px;

}

.value{

font-size:26px;

font-weight:700;

}

.green{

color:#10b981;

}

.blue{

color:#2563eb;

}

.footer{

margin-top:40px;

display:flex;

justify-content:space-between;

align-items:center;

padding-top:25px;

border-top:1px solid #eee;

font-size:16px;

color:#666;

}

.badges{

display:flex;

gap:15px;

margin-top:40px;

}

.badge{

background:#eef4ff;

padding:12px 18px;

border-radius:30px;

font-weight:600;

color:#2563eb;

}

</style>

</head>

<body>

<div class="container">

<h1>🚀 CI/CD Dashboard</h1>

<div class="subtitle">

Automated Java Deployment Platform

</div>

<div class="grid">

<div class="card">

<div class="title">Pipeline Status</div>

<div class="value green">SUCCESS</div>

</div>

<div class="card">

<div class="title">Docker Image</div>

<div class="value blue">Latest</div>

</div>

<div class="card">

<div class="title">AWS EC2</div>

<div class="value green">Running</div>

</div>

<div class="card">

<div class="title">GitHub Actions</div>

<div class="value blue">Automated</div>

</div>

</div>

<div class="badges">

<div class="badge">Spring Boot</div>

<div class="badge">Docker</div>

<div class="badge">GitHub Actions</div>

<div class="badge">AWS EC2</div>

</div>

<div class="footer">

<div>

Last Deployment<br>

<strong>
"""
                + time +
                """
                </strong>
                
                </div>
                
                <div>
                
                Continuous Integration<br>
                
                <strong> Deployment</strong>
                
                </div>
                
                </div>
                
                </div>
                
                </body>
                
                </html>
                """;

    }

}