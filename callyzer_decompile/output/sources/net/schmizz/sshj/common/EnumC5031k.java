package net.schmizz.sshj.common;

import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.PublicKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.k */
/* loaded from: classes3.dex */
public abstract class EnumC5031k {
    private static final /* synthetic */ EnumC5031k[] $VALUES;
    public static final EnumC5031k DSA;
    public static final EnumC5031k DSA_CERT;
    public static final EnumC5031k ECDSA256;
    public static final EnumC5031k ECDSA256_CERT;
    public static final EnumC5031k ECDSA384;
    public static final EnumC5031k ECDSA384_CERT;
    public static final EnumC5031k ECDSA521;
    public static final EnumC5031k ECDSA521_CERT;
    public static final EnumC5031k ED25519;
    public static final EnumC5031k ED25519_CERT;
    public static final EnumC5031k RSA;
    public static final EnumC5031k RSA_CERT;
    public static final EnumC5031k UNKNOWN;
    protected final String sType;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: net.schmizz.sshj.common.k$e */
    public enum e extends EnumC5031k {
        public e(String str, int i10, String str2) {
            super(str, i10, str2, null);
        }

        @Override // net.schmizz.sshj.common.EnumC5031k
        public boolean isMyType(Key key) {
            return "RSA".equals(key.getAlgorithm());
        }

        @Override // net.schmizz.sshj.common.EnumC5031k
        public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) throws GeneralSecurityException {
            try {
                BigInteger bigIntegerM9926u = abstractC5022b.m9926u();
                return AbstractC5037q.m9950c("RSA").generatePublic(new RSAPublicKeySpec(abstractC5022b.m9926u(), bigIntegerM9926u));
            } catch (Buffer$BufferException e2) {
                throw new GeneralSecurityException(e2);
            }
        }

        @Override // net.schmizz.sshj.common.EnumC5031k
        public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
            abstractC5022b.m9913h(rSAPublicKey.getPublicExponent());
            abstractC5022b.m9913h(rSAPublicKey.getModulus());
        }
    }

    static {
        e eVar = new e("RSA", 0, "ssh-rsa");
        RSA = eVar;
        EnumC5031k enumC5031k = new EnumC5031k("DSA", 1, "ssh-dss") { // from class: net.schmizz.sshj.common.k.f
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return "DSA".equals(key.getAlgorithm());
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) throws GeneralSecurityException {
                try {
                    BigInteger bigIntegerM9926u = abstractC5022b.m9926u();
                    BigInteger bigIntegerM9926u2 = abstractC5022b.m9926u();
                    BigInteger bigIntegerM9926u3 = abstractC5022b.m9926u();
                    return AbstractC5037q.m9950c("DSA").generatePublic(new DSAPublicKeySpec(abstractC5022b.m9926u(), bigIntegerM9926u, bigIntegerM9926u2, bigIntegerM9926u3));
                } catch (Buffer$BufferException e2) {
                    throw new GeneralSecurityException(e2);
                }
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                DSAPublicKey dSAPublicKey = (DSAPublicKey) publicKey;
                abstractC5022b.m9913h(dSAPublicKey.getParams().getP());
                abstractC5022b.m9913h(dSAPublicKey.getParams().getQ());
                abstractC5022b.m9913h(dSAPublicKey.getParams().getG());
                abstractC5022b.m9913h(dSAPublicKey.getY());
            }
        };
        DSA = enumC5031k;
        EnumC5031k enumC5031k2 = new EnumC5031k("ECDSA256", 2, "ecdsa-sha2-nistp256") { // from class: net.schmizz.sshj.common.k.g
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return AbstractC5025e.m9932a(key, 256);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                return AbstractC5025e.m9933b(abstractC5022b, "256");
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                AbstractC5025e.m9934c(publicKey, abstractC5022b);
            }
        };
        ECDSA256 = enumC5031k2;
        EnumC5031k enumC5031k3 = new EnumC5031k("ECDSA384", 3, "ecdsa-sha2-nistp384") { // from class: net.schmizz.sshj.common.k.h
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return AbstractC5025e.m9932a(key, KyberEngine.KyberPolyBytes);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                return AbstractC5025e.m9933b(abstractC5022b, "384");
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                AbstractC5025e.m9934c(publicKey, abstractC5022b);
            }
        };
        ECDSA384 = enumC5031k3;
        EnumC5031k enumC5031k4 = new EnumC5031k("ECDSA521", 4, "ecdsa-sha2-nistp521") { // from class: net.schmizz.sshj.common.k.i
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return AbstractC5025e.m9932a(key, 521);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                return AbstractC5025e.m9933b(abstractC5022b, "521");
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                AbstractC5025e.m9934c(publicKey, abstractC5022b);
            }
        };
        ECDSA521 = enumC5031k4;
        EnumC5031k enumC5031k5 = new EnumC5031k("ED25519", 5, "ssh-ed25519") { // from class: net.schmizz.sshj.common.k.j
            private final InterfaceC2173b log = AbstractC2175d.m5852b(EnumC5031k.class);

            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return "EdDSA".equals(key.getAlgorithm()) || EdDSAParameterSpec.Ed25519.equals(key.getAlgorithm());
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                try {
                    int iM9930y = (int) abstractC5022b.m9930y();
                    byte[] bArr = new byte[iM9930y];
                    abstractC5022b.m9928w(bArr);
                    if (this.log.mo5829e()) {
                        this.log.debug("Key algo: " + this.sType + ", Key curve: 25519, Key Len: " + iM9930y + "\np: " + Arrays.toString(bArr));
                    }
                    return AbstractC5026f.m9935a(bArr);
                } catch (Buffer$BufferException e2) {
                    throw new SSHRuntimeException(e2.getMessage(), e2);
                }
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                byte[] encoded = publicKey.getEncoded();
                byte[] bArr = new byte[32];
                System.arraycopy(encoded, encoded.length - 32, bArr, 0, 32);
                abstractC5022b.getClass();
                abstractC5022b.m9912g(32, bArr);
            }
        };
        ED25519 = enumC5031k5;
        EnumC5031k enumC5031k6 = new EnumC5031k("RSA_CERT", 6, "ssh-rsa-cert-v01@openssh.com") { // from class: net.schmizz.sshj.common.k.k
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public EnumC5031k getParent() {
                return EnumC5031k.RSA;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return AbstractC5032l.m9942b(key, EnumC5031k.RSA);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                return AbstractC5032l.m9944d(abstractC5022b, EnumC5031k.RSA);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                AbstractC5032l.m9947g(publicKey, EnumC5031k.RSA, abstractC5022b);
            }
        };
        RSA_CERT = enumC5031k6;
        EnumC5031k enumC5031k7 = new EnumC5031k("DSA_CERT", 7, "ssh-dss-cert-v01@openssh.com") { // from class: net.schmizz.sshj.common.k.l
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public EnumC5031k getParent() {
                return EnumC5031k.DSA;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return AbstractC5032l.m9942b(key, EnumC5031k.DSA);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                return AbstractC5032l.m9944d(abstractC5022b, EnumC5031k.DSA);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                AbstractC5032l.m9947g(publicKey, EnumC5031k.DSA, abstractC5022b);
            }
        };
        DSA_CERT = enumC5031k7;
        EnumC5031k enumC5031k8 = new EnumC5031k("ED25519_CERT", 8, "ssh-ed25519-cert-v01@openssh.com") { // from class: net.schmizz.sshj.common.k.m
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public EnumC5031k getParent() {
                return EnumC5031k.ED25519;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return AbstractC5032l.m9942b(key, EnumC5031k.ED25519);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                return AbstractC5032l.m9944d(abstractC5022b, EnumC5031k.ED25519);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                AbstractC5032l.m9947g(publicKey, EnumC5031k.ED25519, abstractC5022b);
            }
        };
        ED25519_CERT = enumC5031k8;
        EnumC5031k enumC5031k9 = new EnumC5031k("ECDSA256_CERT", 9, "ecdsa-sha2-nistp256-cert-v01@openssh.com") { // from class: net.schmizz.sshj.common.k.a
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public EnumC5031k getParent() {
                return EnumC5031k.ECDSA256;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return AbstractC5032l.m9942b(key, EnumC5031k.ECDSA256);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                return AbstractC5032l.m9944d(abstractC5022b, EnumC5031k.ECDSA256);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                AbstractC5032l.m9947g(publicKey, EnumC5031k.ECDSA256, abstractC5022b);
            }
        };
        ECDSA256_CERT = enumC5031k9;
        EnumC5031k enumC5031k10 = new EnumC5031k("ECDSA384_CERT", 10, "ecdsa-sha2-nistp384-cert-v01@openssh.com") { // from class: net.schmizz.sshj.common.k.b
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public EnumC5031k getParent() {
                return EnumC5031k.ECDSA384;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return AbstractC5032l.m9942b(key, EnumC5031k.ECDSA384);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                return AbstractC5032l.m9944d(abstractC5022b, EnumC5031k.ECDSA384);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                AbstractC5032l.m9947g(publicKey, EnumC5031k.ECDSA384, abstractC5022b);
            }
        };
        ECDSA384_CERT = enumC5031k10;
        EnumC5031k enumC5031k11 = new EnumC5031k("ECDSA521_CERT", 11, "ecdsa-sha2-nistp521-cert-v01@openssh.com") { // from class: net.schmizz.sshj.common.k.c
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public EnumC5031k getParent() {
                return EnumC5031k.ECDSA521;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return AbstractC5032l.m9942b(key, EnumC5031k.ECDSA521);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                return AbstractC5032l.m9944d(abstractC5022b, EnumC5031k.ECDSA521);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                AbstractC5032l.m9947g(publicKey, EnumC5031k.ECDSA521, abstractC5022b);
            }
        };
        ECDSA521_CERT = enumC5031k11;
        EnumC5031k enumC5031k12 = new EnumC5031k("UNKNOWN", 12, "unknown") { // from class: net.schmizz.sshj.common.k.d
            {
                e eVar2 = null;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public boolean isMyType(Key key) {
                return false;
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void putPubKeyIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                throw new UnsupportedOperationException("Don't know how to encode key: " + publicKey);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b) {
                throw new UnsupportedOperationException("Don't know how to decode key:" + this.sType);
            }

            @Override // net.schmizz.sshj.common.EnumC5031k
            public void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
                throw new UnsupportedOperationException("Don't know how to encode key: " + publicKey);
            }
        };
        UNKNOWN = enumC5031k12;
        $VALUES = new EnumC5031k[]{eVar, enumC5031k, enumC5031k2, enumC5031k3, enumC5031k4, enumC5031k5, enumC5031k6, enumC5031k7, enumC5031k8, enumC5031k9, enumC5031k10, enumC5031k11, enumC5031k12};
    }

    public /* synthetic */ EnumC5031k(String str, int i10, String str2, e eVar) {
        this(str, i10, str2);
    }

    public static EnumC5031k fromKey(Key key) {
        EnumC5031k enumC5031k = UNKNOWN;
        for (EnumC5031k enumC5031k2 : values()) {
            if (enumC5031k2.isMyType(key) && (enumC5031k == UNKNOWN || enumC5031k2.isSubType(enumC5031k))) {
                enumC5031k = enumC5031k2;
            }
        }
        return enumC5031k;
    }

    public static EnumC5031k fromString(String str) {
        for (EnumC5031k enumC5031k : values()) {
            if (enumC5031k.sType.equals(str)) {
                return enumC5031k;
            }
        }
        return UNKNOWN;
    }

    private boolean isSubType(EnumC5031k enumC5031k) {
        for (EnumC5031k parent = this; parent != null; parent = parent.getParent()) {
            if (enumC5031k == parent) {
                return true;
            }
        }
        return false;
    }

    public static EnumC5031k valueOf(String str) {
        return (EnumC5031k) Enum.valueOf(EnumC5031k.class, str);
    }

    public static EnumC5031k[] values() {
        return (EnumC5031k[]) $VALUES.clone();
    }

    public EnumC5031k getParent() {
        return null;
    }

    public abstract boolean isMyType(Key key);

    public void putPubKeyIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b) {
        String str = this.sType;
        abstractC5022b.getClass();
        abstractC5022b.m9917l(str, StandardCharsets.UTF_8);
        writePubKeyContentsIntoBuffer(publicKey, abstractC5022b);
    }

    public abstract PublicKey readPubKeyFromBuffer(AbstractC5022b abstractC5022b);

    @Override // java.lang.Enum
    public String toString() {
        return this.sType;
    }

    public abstract void writePubKeyContentsIntoBuffer(PublicKey publicKey, AbstractC5022b abstractC5022b);

    private EnumC5031k(String str, int i10, String str2) {
        this.sType = str2;
    }
}
