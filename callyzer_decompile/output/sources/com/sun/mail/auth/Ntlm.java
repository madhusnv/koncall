package com.sun.mail.auth;

import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.MailLogger;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class Ntlm {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte HIRESPONSERVERSION = 1;
    private static final int NTLMSSP_NEGOTIATE_128 = 536870912;
    private static final int NTLMSSP_NEGOTIATE_56 = Integer.MIN_VALUE;
    private static final int NTLMSSP_NEGOTIATE_ALWAYS_SIGN = 32768;
    private static final int NTLMSSP_NEGOTIATE_DATAGRAM = 64;
    private static final int NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY = 524288;
    private static final int NTLMSSP_NEGOTIATE_IDENTIFY = 1048576;
    private static final int NTLMSSP_NEGOTIATE_KEY_EXCH = 1073741824;
    private static final int NTLMSSP_NEGOTIATE_LM_KEY = 128;
    private static final int NTLMSSP_NEGOTIATE_NTLM = 512;
    private static final int NTLMSSP_NEGOTIATE_OEM = 2;
    private static final int NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED = 4096;
    private static final int NTLMSSP_NEGOTIATE_OEM_WORKSTATION_SUPPLIED = 8192;
    private static final int NTLMSSP_NEGOTIATE_SEAL = 32;
    private static final int NTLMSSP_NEGOTIATE_SIGN = 16;
    private static final int NTLMSSP_NEGOTIATE_TARGET_INFO = 8388608;
    private static final int NTLMSSP_NEGOTIATE_UNICODE = 1;
    private static final int NTLMSSP_NEGOTIATE_VERSION = 33554432;
    private static final int NTLMSSP_REQUEST_NON_NT_SESSION_KEY = 4194304;
    private static final int NTLMSSP_REQUEST_TARGET = 4;
    private static final int NTLMSSP_TARGET_TYPE_DOMAIN = 65536;
    private static final int NTLMSSP_TARGET_TYPE_SERVER = 131072;
    private static final byte RESPONSERVERSION = 1;
    private Cipher cipher;
    private SecretKeyFactory fac;
    private Mac hmac;
    private String hostname;
    private MailLogger logger;
    private MD4 md4;
    private String ntdomain;
    private String password;
    private byte[] type1;
    private byte[] type3;
    private String username;
    private static final byte[] Z6 = {0, 0, 0, 0, 0, 0};
    private static final byte[] Z4 = {0, 0, 0, 0};
    private static char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public Ntlm(String str, String str2, String str3, String str4, MailLogger mailLogger) {
        int iIndexOf = str2.indexOf(46);
        str2 = iIndexOf != -1 ? str2.substring(0, iIndexOf) : str2;
        int iIndexOf2 = str3.indexOf(92);
        if (iIndexOf2 != -1) {
            str = str3.substring(0, iIndexOf2).toUpperCase(Locale.ENGLISH);
            str3 = str3.substring(iIndexOf2 + 1);
        } else if (str == null) {
            str = "";
        }
        this.ntdomain = str;
        this.hostname = str2;
        this.username = str3;
        this.password = str4;
        this.logger = mailLogger.getLogger(getClass(), "DEBUG NTLM");
        init0();
    }

    private byte[] calcLMHash() throws BadPaddingException, InvalidKeySpecException, IllegalBlockSizeException, InvalidKeyException, UnsupportedEncodingException {
        byte[] bytes;
        byte[] bArr = {75, 71, 83, 33, 64, 35, 36, 37};
        try {
            bytes = this.password.toUpperCase(Locale.ENGLISH).getBytes("iso-8859-1");
        } catch (UnsupportedEncodingException unused) {
            bytes = null;
        }
        byte[] bArr2 = new byte[14];
        int length = this.password.length();
        System.arraycopy(bytes, 0, bArr2, 0, length <= 14 ? length : 14);
        DESKeySpec dESKeySpec = new DESKeySpec(makeDesKey(bArr2, 0));
        DESKeySpec dESKeySpec2 = new DESKeySpec(makeDesKey(bArr2, 7));
        SecretKey secretKeyGenerateSecret = this.fac.generateSecret(dESKeySpec);
        SecretKey secretKeyGenerateSecret2 = this.fac.generateSecret(dESKeySpec2);
        this.cipher.init(1, secretKeyGenerateSecret);
        byte[] bArrDoFinal = this.cipher.doFinal(bArr, 0, 8);
        this.cipher.init(1, secretKeyGenerateSecret2);
        byte[] bArrDoFinal2 = this.cipher.doFinal(bArr, 0, 8);
        byte[] bArr3 = new byte[21];
        System.arraycopy(bArrDoFinal, 0, bArr3, 0, 8);
        System.arraycopy(bArrDoFinal2, 0, bArr3, 8, 8);
        return bArr3;
    }

    private byte[] calcNTHash() throws UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = this.password.getBytes("UnicodeLittleUnmarked");
        } catch (UnsupportedEncodingException unused) {
            bytes = null;
        }
        byte[] bArr = new byte[21];
        System.arraycopy(this.md4.digest(bytes), 0, bArr, 0, 16);
        return bArr;
    }

    private byte[] calcResponse(byte[] bArr, byte[] bArr2) throws BadPaddingException, InvalidKeySpecException, IllegalBlockSizeException, InvalidKeyException {
        DESKeySpec dESKeySpec = new DESKeySpec(makeDesKey(bArr, 0));
        DESKeySpec dESKeySpec2 = new DESKeySpec(makeDesKey(bArr, 7));
        DESKeySpec dESKeySpec3 = new DESKeySpec(makeDesKey(bArr, 14));
        SecretKey secretKeyGenerateSecret = this.fac.generateSecret(dESKeySpec);
        SecretKey secretKeyGenerateSecret2 = this.fac.generateSecret(dESKeySpec2);
        SecretKey secretKeyGenerateSecret3 = this.fac.generateSecret(dESKeySpec3);
        this.cipher.init(1, secretKeyGenerateSecret);
        byte[] bArrDoFinal = this.cipher.doFinal(bArr2, 0, 8);
        this.cipher.init(1, secretKeyGenerateSecret2);
        byte[] bArrDoFinal2 = this.cipher.doFinal(bArr2, 0, 8);
        this.cipher.init(1, secretKeyGenerateSecret3);
        byte[] bArrDoFinal3 = this.cipher.doFinal(bArr2, 0, 8);
        byte[] bArr3 = new byte[24];
        System.arraycopy(bArrDoFinal, 0, bArr3, 0, 8);
        System.arraycopy(bArrDoFinal2, 0, bArr3, 8, 8);
        System.arraycopy(bArrDoFinal3, 0, bArr3, 16, 8);
        return bArr3;
    }

    private byte[] calcV2Response(byte[] bArr, byte[] bArr2, byte[] bArr3) throws InvalidKeyException, UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = (this.username.toUpperCase(Locale.ENGLISH) + this.ntdomain).getBytes("UnicodeLittleUnmarked");
        } catch (UnsupportedEncodingException unused) {
            bytes = null;
        }
        byte[] bArrHmacMD5 = hmacMD5(bArr, bytes);
        byte[] bArr4 = new byte[bArr2.length + 8];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr2, 0, bArr4, 8, bArr2.length);
        byte[] bArr5 = new byte[bArr2.length + 16];
        System.arraycopy(hmacMD5(bArrHmacMD5, bArr4), 0, bArr5, 0, 16);
        System.arraycopy(bArr2, 0, bArr5, 16, bArr2.length);
        return bArr5;
    }

    private void copybytes(byte[] bArr, int i10, String str, String str2) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes(str2);
            System.arraycopy(bytes, 0, bArr, i10, bytes.length);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    private byte[] hmacMD5(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        try {
            if (this.hmac == null) {
                this.hmac = Mac.getInstance("HmacMD5");
            }
            int length = 16;
            try {
                byte[] bArr3 = new byte[16];
                if (bArr.length <= 16) {
                    length = bArr.length;
                }
                System.arraycopy(bArr, 0, bArr3, 0, length);
                this.hmac.init(new SecretKeySpec(bArr3, "HmacMD5"));
                return this.hmac.doFinal(bArr2);
            } catch (RuntimeException | InvalidKeyException unused) {
                return null;
            }
        } catch (NoSuchAlgorithmException unused2) {
            throw new AssertionError();
        }
    }

    private void init0() {
        byte[] bArr = new byte[256];
        this.type1 = bArr;
        this.type3 = new byte[512];
        System.arraycopy(new byte[]{78, 84, 76, 77, 83, 83, 80, 0, 1}, 0, bArr, 0, 9);
        System.arraycopy(new byte[]{78, 84, 76, 77, 83, 83, 80, 0, 3}, 0, this.type3, 0, 9);
        try {
            this.fac = SecretKeyFactory.getInstance("DES");
            this.cipher = Cipher.getInstance("DES/ECB/NoPadding");
            this.md4 = new MD4();
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private byte[] makeDesKey(byte[] r18, int r19) {
        /*
            r17 = this;
            r0 = r18
            int r1 = r0.length
            int[] r2 = new int[r1]
            r4 = 0
        L6:
            if (r4 >= r1) goto L13
            r5 = r0[r4]
            if (r5 >= 0) goto Le
            int r5 = r5 + 256
        Le:
            r2[r4] = r5
            int r4 = r4 + 1
            goto L6
        L13:
            r0 = r2[r19]
            byte r1 = (byte) r0
            r4 = 7
            int r0 = r0 << r4
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r5 = r19 + 1
            r5 = r2[r5]
            int r6 = r5 >> 1
            r0 = r0 | r6
            byte r0 = (byte) r0
            r6 = 6
            int r5 = r5 << r6
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r19 + 2
            r7 = r2[r7]
            int r8 = r7 >> 2
            r5 = r5 | r8
            byte r5 = (byte) r5
            r8 = 5
            int r7 = r7 << r8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r9 = r19 + 3
            r9 = r2[r9]
            int r10 = r9 >> 3
            r7 = r7 | r10
            byte r7 = (byte) r7
            r10 = 4
            int r9 = r9 << r10
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r11 = r19 + 4
            r11 = r2[r11]
            int r12 = r11 >> 4
            r9 = r9 | r12
            byte r9 = (byte) r9
            r12 = 3
            int r11 = r11 << r12
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r13 = r19 + 5
            r13 = r2[r13]
            int r14 = r13 >> 5
            r11 = r11 | r14
            byte r11 = (byte) r11
            r14 = 2
            int r13 = r13 << r14
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r15 = r19 + 6
            r2 = r2[r15]
            int r15 = r2 >> 6
            r13 = r13 | r15
            byte r13 = (byte) r13
            r15 = 1
            int r2 = r2 << r15
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r16 = 0
            r3 = 8
            byte[] r3 = new byte[r3]
            r3[r16] = r1
            r3[r15] = r0
            r3[r14] = r5
            r3[r12] = r7
            r3[r10] = r9
            r3[r8] = r11
            r3[r6] = r13
            r3[r4] = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.auth.Ntlm.makeDesKey(byte[], int):byte[]");
    }

    private static int readInt(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private static int readShort(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    private static String toHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 3);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(hex[(bArr[i10] >> 4) & 15]);
            sb2.append(hex[bArr[i10] & 15]);
            sb2.append(' ');
        }
        return sb2.toString();
    }

    private void writeInt(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
    }

    private void writeShort(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
    }

    public String generateType1Msg(int i10) {
        return generateType1Msg(i10, false);
    }

    public String generateType3Msg(String str) {
        byte[] bArrDecode;
        byte[] bArrCalcResponse;
        byte[] bArrCalcResponse2;
        int i10;
        try {
            try {
                bArrDecode = BASE64DecoderStream.decode(str.getBytes("us-ascii"));
            } catch (GeneralSecurityException e2) {
                this.logger.log(Level.FINE, "GeneralSecurityException", (Throwable) e2);
                return "";
            }
        } catch (UnsupportedEncodingException unused) {
            bArrDecode = null;
        }
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("type 2 message: " + toHex(bArrDecode));
        }
        byte[] bArr = new byte[8];
        System.arraycopy(bArrDecode, 24, bArr, 0, 8);
        int length = this.username.length() * 2;
        writeShort(this.type3, 36, length);
        writeShort(this.type3, 38, length);
        int length2 = this.ntdomain.length() * 2;
        writeShort(this.type3, 28, length2);
        writeShort(this.type3, 30, length2);
        int length3 = this.hostname.length() * 2;
        writeShort(this.type3, 44, length3);
        writeShort(this.type3, 46, length3);
        copybytes(this.type3, 64, this.ntdomain, "UnicodeLittleUnmarked");
        writeInt(this.type3, 32, 64);
        int i11 = length2 + 64;
        copybytes(this.type3, i11, this.username, "UnicodeLittleUnmarked");
        writeInt(this.type3, 40, i11);
        int i12 = i11 + length;
        copybytes(this.type3, i12, this.hostname, "UnicodeLittleUnmarked");
        writeInt(this.type3, 48, i12);
        int i13 = i12 + length3;
        int i14 = readInt(bArrDecode, 20);
        if ((NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY & i14) != 0) {
            this.logger.fine("Using NTLMv2");
            byte[] bArr2 = new byte[8];
            new Random().nextBytes(bArr2);
            byte[] bArrCalcNTHash = calcNTHash();
            bArrCalcResponse = calcV2Response(bArrCalcNTHash, bArr2, bArr);
            byte[] bArr3 = new byte[0];
            if ((i14 & NTLMSSP_NEGOTIATE_TARGET_INFO) != 0) {
                int i15 = readShort(bArrDecode, 40);
                byte[] bArr4 = new byte[i15];
                System.arraycopy(bArrDecode, readInt(bArrDecode, 44), bArr4, 0, i15);
                bArr3 = bArr4;
            }
            byte[] bArr5 = new byte[bArr3.length + 32];
            bArr5[0] = 1;
            bArr5[1] = 1;
            System.arraycopy(Z6, 0, bArr5, 2, 6);
            long jCurrentTimeMillis = (System.currentTimeMillis() + 11644473600000L) * 10000;
            for (int i16 = 0; i16 < 8; i16++) {
                bArr5[i16 + 8] = (byte) (r19 & 255);
                jCurrentTimeMillis >>= 8;
            }
            System.arraycopy(bArr2, 0, bArr5, 16, 8);
            byte[] bArr6 = Z4;
            System.arraycopy(bArr6, 0, bArr5, 24, 4);
            System.arraycopy(bArr3, 0, bArr5, 28, bArr3.length);
            System.arraycopy(bArr6, 0, bArr5, bArr3.length + 28, 4);
            bArrCalcResponse2 = calcV2Response(bArrCalcNTHash, bArr5, bArr);
            i10 = 557569;
        } else {
            bArrCalcResponse = calcResponse(calcLMHash(), bArr);
            bArrCalcResponse2 = calcResponse(calcNTHash(), bArr);
            i10 = 33281;
        }
        byte[] bArr7 = bArrCalcResponse;
        System.arraycopy(bArr7, 0, this.type3, i13, bArr7.length);
        writeShort(this.type3, 12, bArr7.length);
        writeShort(this.type3, 14, bArr7.length);
        writeInt(this.type3, 16, i13);
        int i17 = i13 + 24;
        System.arraycopy(bArrCalcResponse2, 0, this.type3, i17, bArrCalcResponse2.length);
        writeShort(this.type3, 20, bArrCalcResponse2.length);
        writeShort(this.type3, 22, bArrCalcResponse2.length);
        writeInt(this.type3, 24, i17);
        int length4 = i17 + bArrCalcResponse2.length;
        writeShort(this.type3, 56, length4);
        byte[] bArr8 = new byte[length4];
        System.arraycopy(this.type3, 0, bArr8, 0, length4);
        writeInt(this.type3, 60, i10);
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("type 3 message: " + toHex(bArr8));
        }
        try {
            return new String(BASE64EncoderStream.encode(bArr8), "iso-8859-1");
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    public String generateType1Msg(int i10, boolean z6) throws UnsupportedEncodingException {
        int length = this.ntdomain.length();
        int i11 = 41475 | i10;
        if (length != 0) {
            i11 = 45571 | i10;
        }
        if (z6) {
            i11 |= NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY;
        }
        writeInt(this.type1, 12, i11);
        byte[] bArr = this.type1;
        bArr[28] = 32;
        writeShort(bArr, 16, length);
        writeShort(this.type1, 18, length);
        int length2 = this.hostname.length();
        writeShort(this.type1, 24, length2);
        writeShort(this.type1, 26, length2);
        copybytes(this.type1, 32, this.hostname, "iso-8859-1");
        int i12 = length2 + 32;
        copybytes(this.type1, i12, this.ntdomain, "iso-8859-1");
        writeInt(this.type1, 20, i12);
        int i13 = i12 + length;
        byte[] bArr2 = new byte[i13];
        System.arraycopy(this.type1, 0, bArr2, 0, i13);
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("type 1 message: " + toHex(bArr2));
        }
        try {
            return new String(BASE64EncoderStream.encode(bArr2), "iso-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
