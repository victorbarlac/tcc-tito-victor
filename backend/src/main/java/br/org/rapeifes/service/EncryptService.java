package br.org.rapeifes.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EncryptService {
    private final BCryptPasswordEncoder encoder;

    public EncryptService() {
        this.encoder = new BCryptPasswordEncoder(12);
    }

    public String encrypt(String value) {
        return encoder.encode(value);
    }

    public boolean matches(String rawPassword, String encryptedPassword) {
        return encoder.matches(rawPassword, encryptedPassword);
    }

}
