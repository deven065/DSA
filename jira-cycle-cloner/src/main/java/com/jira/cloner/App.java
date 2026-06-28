package com.jira.cloner;

public class App {
    public static void main(String[] args) {
        Utils.log("🚀 Starting Zephyr Scale Cloner...");

        ZephyrClient client = new ZephyrClient();

        // Fetch cycles
        Utils.log("📥 Fetching cycles...");
        var cycles = client.getCycles();
        Utils.log("📋 Fetched Cycles: " + cycles);

        // Create cycle
        Utils.log("🛠 Creating new cycle...");
        var createdCycle = client.createCycle("Cloned Cycle - Demo");
        Utils.log("📋 Created Cycle: " + createdCycle);

        Utils.log("✅ Done!");
    }
}
