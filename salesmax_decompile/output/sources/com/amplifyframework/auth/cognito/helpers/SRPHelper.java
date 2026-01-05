package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import j$.util.DesugarTimeZone;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p001o.f9g;
import p001o.id5;
import p001o.mge;
import p001o.sh2;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SRPHelper {
    public static final Companion Companion = new Companion(null);
    private static final int EPHEMERAL_KEY_LENGTH = 1024;
    private static final String HMAC_SHA_256 = "HmacSHA256";
    private final String DERIVED_KEY_INFO;
    private final int DERIVED_KEY_SIZE;
    private final String HEX_N;

    /* renamed from: N */
    private final BigInteger f10636N;
    private String dateString;
    private final MessageDigest digest;

    /* renamed from: g */
    private final BigInteger f10637g;

    /* renamed from: k */
    private final BigInteger f10638k;
    private final String password;
    private BigInteger privateA;
    private BigInteger publicA;
    private final SecureRandom random;
    private String userId;
    private String userPoolName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public SRPHelper(String str) throws NoSuchAlgorithmException {
        BigInteger bigIntegerModPow;
        sq8.m48649h(str, "password");
        this.password = str;
        this.f10637g = BigInteger.valueOf(2L);
        this.HEX_N = "FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AAAC42DAD33170D04507A33A85521ABDF1CBA64ECFB850458DBEF0A8AEA71575D060C7DB3970F85A6E1E4C7ABF5AE8CDB0933D71E8C94E04A25619DCEE3D2261AD2EE6BF12FFA06D98A0864D87602733EC86A64521F2B18177B200CBBE117577A615D6C770988C0BAD946E208E24FA074E5AB3143DB5BFCE0FD108E4B82D120A93AD2CAFFFFFFFFFFFFFFFF";
        this.f10636N = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AAAC42DAD33170D04507A33A85521ABDF1CBA64ECFB850458DBEF0A8AEA71575D060C7DB3970F85A6E1E4C7ABF5AE8CDB0933D71E8C94E04A25619DCEE3D2261AD2EE6BF12FFA06D98A0864D87602733EC86A64521F2B18177B200CBBE117577A615D6C770988C0BAD946E208E24FA074E5AB3143DB5BFCE0FD108E4B82D120A93AD2CAFFFFFFFFFFFFFFFF", 16);
        this.random = new SecureRandom();
        this.DERIVED_KEY_INFO = "Caldera Derived Key";
        this.DERIVED_KEY_SIZE = 16;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        sq8.m48648g(messageDigest, "getInstance(...)");
        this.digest = messageDigest;
        do {
            BigInteger bigIntegerMod = new BigInteger(EPHEMERAL_KEY_LENGTH, this.random).mod(this.f10636N);
            sq8.m48648g(bigIntegerMod, "mod(...)");
            this.privateA = bigIntegerMod;
            bigIntegerModPow = this.f10637g.modPow(bigIntegerMod, this.f10636N);
            sq8.m48648g(bigIntegerModPow, "modPow(...)");
            this.publicA = bigIntegerModPow;
        } while (sq8.m48644c(bigIntegerModPow.mod(this.f10636N), BigInteger.ZERO));
        this.digest.reset();
        this.digest.update(this.f10636N.toByteArray());
        this.f10638k = new BigInteger(1, this.digest.digest(this.f10637g.toByteArray()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str2 = simpleDateFormat.format(new Date());
        sq8.m48648g(str2, "format(...)");
        this.dateString = str2;
        this.userId = "";
        this.userPoolName = "";
    }

    public final byte[] computePasswordAuthenticationKey$aws_auth_cognito_release(BigInteger bigInteger, BigInteger bigInteger2) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        sq8.m48649h(bigInteger, "ikm");
        sq8.m48649h(bigInteger2, "salt");
        String str = HMAC_SHA_256;
        Mac mac = Mac.getInstance(str);
        mac.init(new SecretKeySpec(bigInteger2.toByteArray(), str));
        byte[] bArrDoFinal = mac.doFinal(bigInteger.toByteArray());
        mac.reset();
        mac.init(new SecretKeySpec(bArrDoFinal, str));
        String str2 = this.DERIVED_KEY_INFO;
        Charset charset = sh2.f45422b;
        byte[] bytes = str2.getBytes(charset);
        sq8.m48648g(bytes, "getBytes(...)");
        mac.update(bytes);
        byte[] bytes2 = String.valueOf((char) 1).getBytes(charset);
        sq8.m48648g(bytes2, "getBytes(...)");
        byte[] bArrDoFinal2 = mac.doFinal(bytes2);
        sq8.m48646e(bArrDoFinal2);
        byte[] bArrCopyOf = Arrays.copyOf(bArrDoFinal2, this.DERIVED_KEY_SIZE);
        sq8.m48648g(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final BigInteger computePasswordVerifier$aws_auth_cognito_release(BigInteger bigInteger) {
        sq8.m48649h(bigInteger, "salt");
        BigInteger bigIntegerModPow = this.f10637g.modPow(computeX$aws_auth_cognito_release(bigInteger), this.f10636N);
        sq8.m48648g(bigIntegerModPow, "modPow(...)");
        return bigIntegerModPow;
    }

    public final BigInteger computeS$aws_auth_cognito_release(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        sq8.m48649h(bigInteger, "uValue");
        sq8.m48649h(bigInteger2, "xValue");
        sq8.m48649h(bigInteger3, "srpB");
        BigInteger bigIntegerMod = bigInteger3.subtract(this.f10638k.multiply(this.f10637g.modPow(bigInteger2, this.f10636N))).modPow(this.privateA.add(bigInteger.multiply(bigInteger2)), this.f10636N).mod(this.f10636N);
        sq8.m48648g(bigIntegerMod, "mod(...)");
        return bigIntegerMod;
    }

    public final BigInteger computeU$aws_auth_cognito_release(BigInteger bigInteger) {
        sq8.m48649h(bigInteger, "srpB");
        this.digest.reset();
        this.digest.update(this.publicA.toByteArray());
        return new BigInteger(1, this.digest.digest(bigInteger.toByteArray()));
    }

    public final BigInteger computeX$aws_auth_cognito_release(BigInteger bigInteger) {
        sq8.m48649h(bigInteger, "salt");
        this.digest.reset();
        MessageDigest messageDigest = this.digest;
        String str = this.userPoolName;
        Charset charset = sh2.f45422b;
        byte[] bytes = str.getBytes(charset);
        sq8.m48648g(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        MessageDigest messageDigest2 = this.digest;
        byte[] bytes2 = this.userId.getBytes(charset);
        sq8.m48648g(bytes2, "getBytes(...)");
        messageDigest2.update(bytes2);
        MessageDigest messageDigest3 = this.digest;
        byte[] bytes3 = ":".getBytes(charset);
        sq8.m48648g(bytes3, "getBytes(...)");
        messageDigest3.update(bytes3);
        MessageDigest messageDigest4 = this.digest;
        byte[] bytes4 = this.password.getBytes(charset);
        sq8.m48648g(bytes4, "getBytes(...)");
        byte[] bArrDigest = messageDigest4.digest(bytes4);
        this.digest.reset();
        this.digest.update(bigInteger.toByteArray());
        return new BigInteger(1, this.digest.digest(bArrDigest));
    }

    public final byte[] generateM1Signature$aws_auth_cognito_release(byte[] bArr, String str) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        sq8.m48649h(bArr, TransferTable.COLUMN_KEY);
        sq8.m48649h(str, "secretBlock");
        String str2 = HMAC_SHA_256;
        Mac mac = Mac.getInstance(str2);
        mac.init(new SecretKeySpec(bArr, str2));
        String str3 = this.userPoolName;
        Charset charset = sh2.f45422b;
        byte[] bytes = str3.getBytes(charset);
        sq8.m48648g(bytes, "getBytes(...)");
        mac.update(bytes);
        byte[] bytes2 = this.userId.getBytes(charset);
        sq8.m48648g(bytes2, "getBytes(...)");
        mac.update(bytes2);
        mac.update(Base64.decode(str, 2));
        byte[] bytes3 = this.dateString.getBytes(charset);
        sq8.m48648g(bytes3, "getBytes(...)");
        byte[] bArrDoFinal = mac.doFinal(bytes3);
        sq8.m48648g(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final String getDateString() {
        return this.dateString;
    }

    public final String getPublicA() {
        String string = this.publicA.toString(16);
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public final String getSignature(String str, String str2, String str3) throws Exception {
        sq8.m48649h(str, "salt");
        sq8.m48649h(str2, "srpB");
        sq8.m48649h(str3, "secretBlock");
        BigInteger bigInteger = new BigInteger(str2, 16);
        BigInteger bigInteger2 = new BigInteger(str, 16);
        BigInteger bigIntegerMod = bigInteger.mod(this.f10636N);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (sq8.m48644c(bigIntegerMod, bigInteger3)) {
            throw new Exception("Bad server public value 'B'");
        }
        BigInteger bigIntegerComputeU$aws_auth_cognito_release = computeU$aws_auth_cognito_release(bigInteger);
        if (sq8.m48644c(bigIntegerComputeU$aws_auth_cognito_release.mod(this.f10636N), bigInteger3)) {
            throw new Exception("Hash of A and B cannot be zero");
        }
        String strEncodeToString = Base64.encodeToString(generateM1Signature$aws_auth_cognito_release(computePasswordAuthenticationKey$aws_auth_cognito_release(computeS$aws_auth_cognito_release(bigIntegerComputeU$aws_auth_cognito_release, computeX$aws_auth_cognito_release(bigInteger2), bigInteger), bigIntegerComputeU$aws_auth_cognito_release), str3), 2);
        sq8.m48648g(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final BigInteger modN(BigInteger bigInteger) {
        sq8.m48649h(bigInteger, "value");
        BigInteger bigIntegerMod = bigInteger.mod(this.f10636N);
        sq8.m48648g(bigIntegerMod, "mod(...)");
        return bigIntegerMod;
    }

    public final void setAValues(BigInteger bigInteger, BigInteger bigInteger2) {
        sq8.m48649h(bigInteger, "privateA");
        sq8.m48649h(bigInteger2, "publicA");
        this.privateA = bigInteger;
        this.publicA = bigInteger2;
    }

    public final void setDateString(String str) {
        sq8.m48649h(str, "<set-?>");
        this.dateString = str;
    }

    public final void setUserPoolParams(String str, String str2) {
        sq8.m48649h(str, "userId");
        sq8.m48649h(str2, "userPoolName");
        this.userId = str;
        this.userPoolName = str2;
        if (f9g.m26306P(str2, "_", false, 2, null)) {
            this.userPoolName = (String) new mge("_").m38998j(str2, 2).get(1);
        }
    }
}
