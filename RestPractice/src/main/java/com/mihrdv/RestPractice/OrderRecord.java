package com.mihrdv.RestPractice;

public record OrderRecord(
        String customerName,
        String productName,
        int quantity
) {
}
