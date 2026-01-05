package p001o;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
public abstract class xfj {
    /* renamed from: a */
    public static final byte[] m56226a(String str) {
        sq8.m48649h(str, "<this>");
        byte[] bytes = str.getBytes(sh2.f45422b);
        sq8.m48648g(bytes, "getBytes(...)");
        return bytes;
    }

    /* renamed from: b */
    public static final ReentrantLock m56227b() {
        return new ReentrantLock();
    }

    /* renamed from: c */
    public static final String m56228c(byte[] bArr) {
        sq8.m48649h(bArr, "<this>");
        return new String(bArr, sh2.f45422b);
    }
}
