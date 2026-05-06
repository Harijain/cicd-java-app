package com.cicd.cicd_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {

        String time = LocalDateTime.now().toString();

        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>DevOps Dashboard</title>
            <style>
                body {
                    margin: 0;
                    font-family: 'Segoe UI', sans-serif;
                    background: #0f172a;
                    color: white;
                }

                .container {
                    text-align: center;
                    padding: 50px;
                }

                h1 {
                    font-size: 45px;
                    margin-bottom: 10px;
                    color: #38bdf8;
                }

                .subtitle {
                    color: #94a3b8;
                    margin-bottom: 40px;
                }

                .grid {
                    display: flex;
                    justify-content: center;
                    gap: 20px;
                    flex-wrap: wrap;
                }

                .card {
                    background: #1e293b;
                    padding: 25px;
                    border-radius: 12px;
                    width: 220px;
                    box-shadow: 0 0 15px rgba(0,0,0,0.4);
                    transition: transform 0.3s ease;
                }

                .card:hover {
                    transform: scale(1.05);
                }

                .status {
                    color: #22c55e;
                    font-weight: bold;
                    font-size: 18px;
                }

                .time {
                    margin-top: 30px;
                    color: #cbd5f5;
                }

                .footer {
                    margin-top: 50px;
                    font-size: 14px;
                    color: #64748b;
                }
            </style>
        </head>
        <body>

        <div class="container">
            <h1>🚀 DevOps CI/CD Dashboard</h1>
            <div class="subtitle">Live manual Deployment System</div>

            <div class="grid">
                <div class="card">
                    <h3>GitHub Actions</h3>
                    <p class="status">✔ Running</p>
                </div>

                <div class="card">
                    <h3>Build</h3>
                    <p class="status">✔ Success</p>
                </div>

                <div class="card">
                    <h3>Docker</h3>
                    <p class="status">✔ Image Built</p>
                </div>

                <div class="card">
                    <h3>AWS EC2</h3>
                    <p class="status">✔ Deployed</p>
                </div>
            </div>

            <div class="time">
                ⏱ Last Deployment: """ + time + """
            </div>

            <div class="footer">
                ⚡ Fully Automated CI/CD | No Manual Deployment
            </div>
        </div>

        </body>
        </html>
        """;
    }
}