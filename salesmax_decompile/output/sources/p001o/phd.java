package p001o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes4.dex */
public final class phd implements nhd {

    /* renamed from: a */
    public final ThreadLocal f40105a;

    /* renamed from: b */
    public final String f40106b;

    /* renamed from: c */
    public final Key f40107c;

    /* renamed from: d */
    public final int f40108d;

    /* renamed from: o.phd$a */
    public class C16116a extends ThreadLocal {
        public C16116a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() throws InvalidKeyException {
            try {
                Mac mac = (Mac) ag6.f14655g.m17023a(phd.this.f40106b);
                mac.init(phd.this.f40107c);
                return mac;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public phd(String str, Key key) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        C16116a c16116a = new C16116a();
        this.f40105a = c16116a;
        this.f40106b = str;
        this.f40107c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                this.f40108d = 20;
                break;
            case "HMACSHA256":
                this.f40108d = 32;
                break;
            case "HMACSHA384":
                this.f40108d = 48;
                break;
            case "HMACSHA512":
                this.f40108d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        c16116a.get();
    }

    @Override // p001o.nhd
    /* renamed from: a */
    public byte[] mo40605a(byte[] bArr, int i) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i > this.f40108d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f40105a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f40105a.get()).doFinal(), i);
    }
}
