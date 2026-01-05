package p001o;

import java.security.SecureRandom;

/* loaded from: classes4.dex */
public abstract class ube {

    /* renamed from: a */
    public static final ThreadLocal f48688a = new C17352a();

    /* renamed from: o.ube$a */
    public class C17352a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return ube.m51349b();
        }
    }

    /* renamed from: b */
    public static SecureRandom m51349b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: c */
    public static byte[] m51350c(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f48688a.get()).nextBytes(bArr);
        return bArr;
    }
}
