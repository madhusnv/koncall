package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
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
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5163a;
import nx.AbstractC5178p;
import nx.C5176n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SRPHelper {
    public static final Companion Companion = new Companion(null);
    private static final int EPHEMERAL_KEY_LENGTH = 1024;
    private static final String HMAC_SHA_256 = "HmacSHA256";
    private String dateString;
    private final String derivedKeyInfo;
    private final int derivedKeySize;
    private final MessageDigest digest;

    /* renamed from: g */
    private final BigInteger f5868g;
    private final String hexN;

    /* renamed from: k */
    private final BigInteger f5869k;

    /* renamed from: n */
    private final BigInteger f5870n;
    private final String password;
    private BigInteger privateA;
    private BigInteger publicA;
    private final SecureRandom random;
    private String userId;
    private String userPoolName;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    public SRPHelper(String password) throws NoSuchAlgorithmException {
        BigInteger bigIntegerModPow;
        AbstractC4154l.m8923f(password, "password");
        this.password = password;
        this.f5868g = BigInteger.valueOf(2L);
        this.hexN = "FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AAAC42DAD33170D04507A33A85521ABDF1CBA64ECFB850458DBEF0A8AEA71575D060C7DB3970F85A6E1E4C7ABF5AE8CDB0933D71E8C94E04A25619DCEE3D2261AD2EE6BF12FFA06D98A0864D87602733EC86A64521F2B18177B200CBBE117577A615D6C770988C0BAD946E208E24FA074E5AB3143DB5BFCE0FD108E4B82D120A93AD2CAFFFFFFFFFFFFFFFF";
        this.f5870n = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AAAC42DAD33170D04507A33A85521ABDF1CBA64ECFB850458DBEF0A8AEA71575D060C7DB3970F85A6E1E4C7ABF5AE8CDB0933D71E8C94E04A25619DCEE3D2261AD2EE6BF12FFA06D98A0864D87602733EC86A64521F2B18177B200CBBE117577A615D6C770988C0BAD946E208E24FA074E5AB3143DB5BFCE0FD108E4B82D120A93AD2CAFFFFFFFFFFFFFFFF", 16);
        this.random = new SecureRandom();
        this.derivedKeyInfo = "Caldera Derived Key";
        this.derivedKeySize = 16;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        AbstractC4154l.m8922e(messageDigest, "getInstance(...)");
        this.digest = messageDigest;
        do {
            BigInteger bigIntegerMod = new BigInteger(EPHEMERAL_KEY_LENGTH, this.random).mod(this.f5870n);
            AbstractC4154l.m8922e(bigIntegerMod, "mod(...)");
            this.privateA = bigIntegerMod;
            bigIntegerModPow = this.f5868g.modPow(bigIntegerMod, this.f5870n);
            AbstractC4154l.m8922e(bigIntegerModPow, "modPow(...)");
            this.publicA = bigIntegerModPow;
        } while (AbstractC4154l.m8918a(bigIntegerModPow.mod(this.f5870n), BigInteger.ZERO));
        this.digest.reset();
        this.digest.update(this.f5870n.toByteArray());
        this.f5869k = new BigInteger(1, this.digest.digest(this.f5868g.toByteArray()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date());
        AbstractC4154l.m8922e(str, "format(...)");
        this.dateString = str;
        this.userId = "";
        this.userPoolName = "";
    }

    public final byte[] computePasswordAuthenticationKey$aws_auth_cognito_release(BigInteger ikm, BigInteger salt) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        AbstractC4154l.m8923f(ikm, "ikm");
        AbstractC4154l.m8923f(salt, "salt");
        String str = HMAC_SHA_256;
        Mac mac = Mac.getInstance(str);
        mac.init(new SecretKeySpec(salt.toByteArray(), str));
        byte[] bArrDoFinal = mac.doFinal(ikm.toByteArray());
        mac.reset();
        mac.init(new SecretKeySpec(bArrDoFinal, str));
        String str2 = this.derivedKeyInfo;
        Charset charset = AbstractC5163a.f25245a;
        byte[] bytes = str2.getBytes(charset);
        AbstractC4154l.m8922e(bytes, "getBytes(...)");
        mac.update(bytes);
        byte[] bytes2 = String.valueOf((char) 1).getBytes(charset);
        AbstractC4154l.m8922e(bytes2, "getBytes(...)");
        byte[] bArrDoFinal2 = mac.doFinal(bytes2);
        AbstractC4154l.m8920c(bArrDoFinal2);
        byte[] bArrCopyOf = Arrays.copyOf(bArrDoFinal2, this.derivedKeySize);
        AbstractC4154l.m8922e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final BigInteger computePasswordVerifier$aws_auth_cognito_release(BigInteger salt) {
        AbstractC4154l.m8923f(salt, "salt");
        BigInteger bigIntegerModPow = this.f5868g.modPow(computeX$aws_auth_cognito_release(salt), this.f5870n);
        AbstractC4154l.m8922e(bigIntegerModPow, "modPow(...)");
        return bigIntegerModPow;
    }

    public final BigInteger computeS$aws_auth_cognito_release(BigInteger uValue, BigInteger xValue, BigInteger srpB) {
        AbstractC4154l.m8923f(uValue, "uValue");
        AbstractC4154l.m8923f(xValue, "xValue");
        AbstractC4154l.m8923f(srpB, "srpB");
        BigInteger bigIntegerMod = srpB.subtract(this.f5869k.multiply(this.f5868g.modPow(xValue, this.f5870n))).modPow(this.privateA.add(uValue.multiply(xValue)), this.f5870n).mod(this.f5870n);
        AbstractC4154l.m8922e(bigIntegerMod, "mod(...)");
        return bigIntegerMod;
    }

    public final BigInteger computeU$aws_auth_cognito_release(BigInteger srpB) {
        AbstractC4154l.m8923f(srpB, "srpB");
        this.digest.reset();
        this.digest.update(this.publicA.toByteArray());
        return new BigInteger(1, this.digest.digest(srpB.toByteArray()));
    }

    public final BigInteger computeX$aws_auth_cognito_release(BigInteger salt) {
        AbstractC4154l.m8923f(salt, "salt");
        this.digest.reset();
        MessageDigest messageDigest = this.digest;
        String str = this.userPoolName;
        Charset charset = AbstractC5163a.f25245a;
        byte[] bytes = str.getBytes(charset);
        AbstractC4154l.m8922e(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        MessageDigest messageDigest2 = this.digest;
        byte[] bytes2 = this.userId.getBytes(charset);
        AbstractC4154l.m8922e(bytes2, "getBytes(...)");
        messageDigest2.update(bytes2);
        MessageDigest messageDigest3 = this.digest;
        byte[] bytes3 = ":".getBytes(charset);
        AbstractC4154l.m8922e(bytes3, "getBytes(...)");
        messageDigest3.update(bytes3);
        MessageDigest messageDigest4 = this.digest;
        byte[] bytes4 = this.password.getBytes(charset);
        AbstractC4154l.m8922e(bytes4, "getBytes(...)");
        byte[] bArrDigest = messageDigest4.digest(bytes4);
        this.digest.reset();
        this.digest.update(salt.toByteArray());
        return new BigInteger(1, this.digest.digest(bArrDigest));
    }

    public final byte[] generateM1Signature$aws_auth_cognito_release(byte[] key, String secretBlock) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(secretBlock, "secretBlock");
        String str = HMAC_SHA_256;
        Mac mac = Mac.getInstance(str);
        mac.init(new SecretKeySpec(key, str));
        String str2 = this.userPoolName;
        Charset charset = AbstractC5163a.f25245a;
        byte[] bytes = str2.getBytes(charset);
        AbstractC4154l.m8922e(bytes, "getBytes(...)");
        mac.update(bytes);
        byte[] bytes2 = this.userId.getBytes(charset);
        AbstractC4154l.m8922e(bytes2, "getBytes(...)");
        mac.update(bytes2);
        mac.update(Base64.decode(secretBlock, 2));
        byte[] bytes3 = this.dateString.getBytes(charset);
        AbstractC4154l.m8922e(bytes3, "getBytes(...)");
        byte[] bArrDoFinal = mac.doFinal(bytes3);
        AbstractC4154l.m8922e(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final String getDateString() {
        return this.dateString;
    }

    public final String getPublicA() {
        String string = this.publicA.toString(16);
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    public final String getSignature(String salt, String srpB, String secretBlock) throws Exception {
        AbstractC4154l.m8923f(salt, "salt");
        AbstractC4154l.m8923f(srpB, "srpB");
        AbstractC4154l.m8923f(secretBlock, "secretBlock");
        BigInteger bigInteger = new BigInteger(srpB, 16);
        BigInteger bigInteger2 = new BigInteger(salt, 16);
        BigInteger bigIntegerMod = bigInteger.mod(this.f5870n);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (AbstractC4154l.m8918a(bigIntegerMod, bigInteger3)) {
            throw new Exception("Bad server public value 'B'");
        }
        BigInteger bigIntegerComputeU$aws_auth_cognito_release = computeU$aws_auth_cognito_release(bigInteger);
        if (AbstractC4154l.m8918a(bigIntegerComputeU$aws_auth_cognito_release.mod(this.f5870n), bigInteger3)) {
            throw new Exception("Hash of A and B cannot be zero");
        }
        String strEncodeToString = Base64.encodeToString(generateM1Signature$aws_auth_cognito_release(computePasswordAuthenticationKey$aws_auth_cognito_release(computeS$aws_auth_cognito_release(bigIntegerComputeU$aws_auth_cognito_release, computeX$aws_auth_cognito_release(bigInteger2), bigInteger), bigIntegerComputeU$aws_auth_cognito_release), secretBlock), 2);
        AbstractC4154l.m8922e(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final BigInteger modN(BigInteger value) {
        AbstractC4154l.m8923f(value, "value");
        BigInteger bigIntegerMod = value.mod(this.f5870n);
        AbstractC4154l.m8922e(bigIntegerMod, "mod(...)");
        return bigIntegerMod;
    }

    public final void setAValues(BigInteger privateA, BigInteger publicA) {
        AbstractC4154l.m8923f(privateA, "privateA");
        AbstractC4154l.m8923f(publicA, "publicA");
        this.privateA = privateA;
        this.publicA = publicA;
    }

    public final void setDateString(String str) {
        AbstractC4154l.m8923f(str, "<set-?>");
        this.dateString = str;
    }

    public final void setUserPoolParams(String userId, String userPoolName) {
        AbstractC4154l.m8923f(userId, "userId");
        AbstractC4154l.m8923f(userPoolName, "userPoolName");
        this.userId = userId;
        this.userPoolName = userPoolName;
        if (AbstractC5178p.m10116x(userPoolName, "_", false)) {
            this.userPoolName = (String) new C5176n("_").m10089e(userPoolName, 2).get(1);
        }
    }
}
