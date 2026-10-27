package net.yasseee.passwordmanager.model;

import java.time.Instant;

public record PasswordEntry(
        String id,
        String title,
        String username,
        String encryptedPassword,
        String url,
        String notes,
        Instant time
) {
}
