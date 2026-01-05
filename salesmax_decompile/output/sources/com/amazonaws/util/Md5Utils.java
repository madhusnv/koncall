package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes5.dex */
public class Md5Utils {
    private static final int FOURTEEN = 14;
    private static final int SIXTEEN_K = 16384;

    public static byte[] computeMD5Hash(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[16384];
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 16384);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException(e);
            }
        } finally {
            try {
                bufferedInputStream.close();
            } catch (Exception e2) {
                LogFactory.getLog((Class<?>) Md5Utils.class).debug("Unable to close input stream of hash candidate: " + e2);
            }
        }
    }

    public static String md5AsBase64(InputStream inputStream) {
        return Base64.encodeAsString(computeMD5Hash(inputStream));
    }

    public static String md5AsBase64(byte[] bArr) {
        return Base64.encodeAsString(computeMD5Hash(bArr));
    }

    public static String md5AsBase64(File file) {
        return Base64.encodeAsString(computeMD5Hash(file));
    }

    public static byte[] computeMD5Hash(byte[] bArr) {
        try {
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public static byte[] computeMD5Hash(File file) {
        return computeMD5Hash(new FileInputStream(file));
    }
}
