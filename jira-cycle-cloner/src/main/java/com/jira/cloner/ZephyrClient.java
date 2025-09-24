package com.jira.cloner;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ZephyrClient {
    private final HttpClient client;

    public ZephyrClient() {
        this.client = HttpClient.newHttpClient();
    }

    public Map<String, Object> getCycles() {
        try {
            String url = Config.BASE_URL + "/testcycles?projectKey=" + Config.PROJECT_KEY;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Authorization", "Bearer " + Config.ZEPHYR_ACCESS_TOKEN)
                    .header("Accept", "application/json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Map<String, Object> result = new HashMap<>();
            result.put("status", response.statusCode());
            result.put("body", response.body());
            return result;
        } catch (Exception e) {
            return Map.of("error", e.getMessage());
        }
    }

    public Map<String, Object> createCycle(String name) {
        try {
            String url = Config.BASE_URL + "/testcycles";
            String body = String.format("{\"projectKey\":\"%s\",\"name\":\"%s\"}", Config.PROJECT_KEY, name);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Authorization", "Bearer " + Config.ZEPHYR_ACCESS_TOKEN)
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(body))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Map<String, Object> result = new HashMap<>();
            result.put("status", response.statusCode());
            result.put("body", response.body());
            return result;
        } catch (Exception e) {
            return Map.of("error", e.getMessage());
        }
    }
}
