package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class kmh {

    /* renamed from: a */
    public long[] f32452a;

    /* renamed from: b */
    public Object[] f32453b;

    /* renamed from: c */
    public int f32454c;

    /* renamed from: d */
    public int f32455d;

    public kmh() {
        this(10);
    }

    /* renamed from: f */
    public static Object[] m35932f(int i) {
        return new Object[i];
    }

    /* renamed from: a */
    public synchronized void m35933a(long j, Object obj) {
        m35936d(j);
        m35937e();
        m35934b(j, obj);
    }

    /* renamed from: b */
    public final void m35934b(long j, Object obj) {
        int i = this.f32454c;
        int i2 = this.f32455d;
        Object[] objArr = this.f32453b;
        int length = (i + i2) % objArr.length;
        this.f32452a[length] = j;
        objArr[length] = obj;
        this.f32455d = i2 + 1;
    }

    /* renamed from: c */
    public synchronized void m35935c() {
        this.f32454c = 0;
        this.f32455d = 0;
        Arrays.fill(this.f32453b, (Object) null);
    }

    /* renamed from: d */
    public final void m35936d(long j) {
        if (this.f32455d > 0) {
            if (j <= this.f32452a[((this.f32454c + r0) - 1) % this.f32453b.length]) {
                m35935c();
            }
        }
    }

    /* renamed from: e */
    public final void m35937e() {
        int length = this.f32453b.length;
        if (this.f32455d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArrM35932f = m35932f(i);
        int i2 = this.f32454c;
        int i3 = length - i2;
        System.arraycopy(this.f32452a, i2, jArr, 0, i3);
        System.arraycopy(this.f32453b, this.f32454c, objArrM35932f, 0, i3);
        int i4 = this.f32454c;
        if (i4 > 0) {
            System.arraycopy(this.f32452a, 0, jArr, i3, i4);
            System.arraycopy(this.f32453b, 0, objArrM35932f, i3, this.f32454c);
        }
        this.f32452a = jArr;
        this.f32453b = objArrM35932f;
        this.f32454c = 0;
    }

    /* renamed from: g */
    public synchronized Object m35938g(long j) {
        return m35939h(j, false);
    }

    /* renamed from: h */
    public final Object m35939h(long j, boolean z) {
        Object objM35942k = null;
        long j2 = Long.MAX_VALUE;
        while (this.f32455d > 0) {
            long j3 = j - this.f32452a[this.f32454c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objM35942k = m35942k();
            j2 = j3;
        }
        return objM35942k;
    }

    /* renamed from: i */
    public synchronized Object m35940i() {
        return this.f32455d == 0 ? null : m35942k();
    }

    /* renamed from: j */
    public synchronized Object m35941j(long j) {
        return m35939h(j, true);
    }

    /* renamed from: k */
    public final Object m35942k() {
        op0.m42517g(this.f32455d > 0);
        Object[] objArr = this.f32453b;
        int i = this.f32454c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f32454c = (i + 1) % objArr.length;
        this.f32455d--;
        return obj;
    }

    /* renamed from: l */
    public synchronized int m35943l() {
        return this.f32455d;
    }

    public kmh(int i) {
        this.f32452a = new long[i];
        this.f32453b = m35932f(i);
    }
}
