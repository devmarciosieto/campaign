package mmmsieto.com.br.campaign.api.v1.controller;


import mmmsieto.com.br.campaign.infra.model.CustomerModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class InitController {


    @GetMapping
    public ResponseEntity<String> findAll() {

        String response = """
                <html>
                <head>
                <title>Campanha</title>
                </head>
                <body>
                <h1>Campanha</h1>
                <p>API para gerenciamento de campanhas</p>
                <p>Endpoints:</p>
                <ul>
                <li>GET /api/v1/customer</li>
                <li>POST /api/v1/customer</li>
                <li>GET /api/v1/campaign</li>
                <li>POST /api/v1/campaign</li>
                <li>GET /api/v1/campaign/{id}</li>
                </ul>
                </body>
                </html>
                """;

        return ResponseEntity.ok(response);
    }


}