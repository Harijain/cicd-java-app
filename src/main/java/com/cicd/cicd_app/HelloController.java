package com.cicd.cicd_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {

        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>DevOps Dashboard</title>
            <style>
                body {
                    background: #0f172a;
                    color: white;
                    font-family: Arial, sans-serif;
                    text-align: center;
                    padding-top: 100px;
                }

                .card {
                    background: #1e293b;
                    padding: 40px;
                    border-radius: 15px;
                    width: 600px;
                    margin: auto;
                    box-shadow: 0 0 20px rgb(0,0,0,0.5);
                }

                h1 {
                    color: #38bdf8;
                }

                .status {
                    color: #22c55e;
                    font-size: 22px;
                    font-weight: bold;
                }
            </style>
        </head>

        <body>

            <div class="card">
                <h1>DevOps CI/CD Dashboard</h1>

                <p class="status">✔ Pipeline Running Successfully</p>

                <p>GitHub Actions → Docker → AWS EC2</p>

                <p> Fully Automated Deployment</p>
            </div>

        </body>
        </html>
        """;
    }
}