package com.razorpay;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
final class CryptLib {

    /* renamed from: a */
    private Cipher f13600a = Cipher.getInstance("AES/GCM/NoPadding");

    /* renamed from: b */
    private byte[] f13601b = new byte[32];

    /* renamed from: c */
    private byte[] f13602c = new byte[16];

    enum EncryptMode {
        ENCRYPT,
        DECRYPT
    }

    /* renamed from: a */
    private String m15979a(String str, String str2, EncryptMode encryptMode, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String strEncodeToString;
        int length = str2.getBytes(HTTP.UTF_8).length;
        int length2 = str2.getBytes(HTTP.UTF_8).length;
        byte[] bArr = this.f13601b;
        if (length2 > bArr.length) {
            length = bArr.length;
        }
        int length3 = str3.getBytes(HTTP.UTF_8).length;
        int length4 = str3.getBytes(HTTP.UTF_8).length;
        byte[] bArr2 = this.f13602c;
        if (length4 > bArr2.length) {
            length3 = bArr2.length;
        }
        System.arraycopy(str2.getBytes(HTTP.UTF_8), 0, this.f13601b, 0, length);
        System.arraycopy(str3.getBytes(HTTP.UTF_8), 0, this.f13602c, 0, length3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f13601b, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(this.f13602c);
        if (encryptMode.equals(EncryptMode.ENCRYPT)) {
            this.f13600a.init(1, secretKeySpec, ivParameterSpec);
            strEncodeToString = Base64.encodeToString(this.f13600a.doFinal(str.getBytes(HTTP.UTF_8)), 2);
        } else {
            strEncodeToString = "";
        }
        if (!encryptMode.equals(EncryptMode.DECRYPT)) {
            return strEncodeToString;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            this.f13600a = cipher;
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(this.f13600a.doFinal(Base64.decode(str, 0)), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return strEncodeToString;
        }
    }

    /* renamed from: b */
    public final String m15981b(String str, String str2, String str3) {
        return m15979a(str, str2, EncryptMode.DECRYPT, str3);
    }

    /* renamed from: a */
    public final String m15980a(String str, String str2, String str3) {
        return m15979a(str, str2, EncryptMode.ENCRYPT, str3);
    }
}
