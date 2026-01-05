package p001o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public class xl1 {

    /* renamed from: c */
    public static final int[] f53882c = {8000, 8000, 2000, 2000};

    /* renamed from: d */
    public static final int[] f53883d = {4000, 4000, 200, 200};

    /* renamed from: a */
    public final AtomicReferenceArray f53884a;

    /* renamed from: b */
    public final AtomicReferenceArray f53885b;

    public xl1() {
        this(4, 4);
    }

    /* renamed from: a */
    public final byte[] m56436a(int i) {
        return m56437b(i, 0);
    }

    /* renamed from: b */
    public byte[] m56437b(int i, int i2) {
        int iM56441f = m56441f(i);
        if (i2 < iM56441f) {
            i2 = iM56441f;
        }
        byte[] bArr = (byte[]) this.f53884a.getAndSet(i, null);
        return (bArr == null || bArr.length < i2) ? m56440e(i2) : bArr;
    }

    /* renamed from: c */
    public final char[] m56438c(int i) {
        return m56439d(i, 0);
    }

    /* renamed from: d */
    public char[] m56439d(int i, int i2) {
        int iM56443h = m56443h(i);
        if (i2 < iM56443h) {
            i2 = iM56443h;
        }
        char[] cArr = (char[]) this.f53885b.getAndSet(i, null);
        return (cArr == null || cArr.length < i2) ? m56442g(i2) : cArr;
    }

    /* renamed from: e */
    public byte[] m56440e(int i) {
        return new byte[i];
    }

    /* renamed from: f */
    public int m56441f(int i) {
        return f53882c[i];
    }

    /* renamed from: g */
    public char[] m56442g(int i) {
        return new char[i];
    }

    /* renamed from: h */
    public int m56443h(int i) {
        return f53883d[i];
    }

    /* renamed from: i */
    public void m56444i(int i, byte[] bArr) {
        this.f53884a.set(i, bArr);
    }

    /* renamed from: j */
    public void m56445j(int i, char[] cArr) {
        this.f53885b.set(i, cArr);
    }

    public xl1(int i, int i2) {
        this.f53884a = new AtomicReferenceArray(i);
        this.f53885b = new AtomicReferenceArray(i2);
    }
}
