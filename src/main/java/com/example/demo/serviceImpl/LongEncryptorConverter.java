package com.example.demo.serviceImpl;



import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.persistence.AttributeConverter;

@Component
public class LongEncryptorConverter implements AttributeConverter<String, String> {

    private static StandardPBEStringEncryptor textEncryptor;

    public LongEncryptorConverter(@Value("${jasypt.encryptor.password}") String password) {
        textEncryptor = new StandardPBEStringEncryptor();
        textEncryptor.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
        textEncryptor.setPassword(password);
    }

    @Override
    public String convertToDatabaseColumn(String attribute) {
        if (attribute == null) {
            return null;
        }
        return textEncryptor.encrypt(attribute);
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        return textEncryptor.decrypt(dbData);
    }
}




