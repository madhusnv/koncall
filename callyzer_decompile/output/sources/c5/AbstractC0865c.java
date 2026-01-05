package c5;

import a2.AbstractC0030c;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c5.c */
/* loaded from: classes.dex */
public abstract class AbstractC0865c implements Cloneable {

    /* renamed from: a */
    public final char[] f5409a;

    /* renamed from: b */
    public long f5410b = -1;

    /* renamed from: c */
    public long f5411c = Long.MAX_VALUE;

    /* renamed from: d */
    public AbstractC0864b f5412d;

    public AbstractC0865c(char[] cArr) {
        this.f5409a = cArr;
    }

    @Override // 
    /* renamed from: a */
    public AbstractC0865c clone() {
        try {
            return (AbstractC0865c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public final String m2327b() {
        String str = new String(this.f5409a);
        if (str.length() < 1) {
            return "";
        }
        long j6 = this.f5411c;
        if (j6 != Long.MAX_VALUE) {
            long j10 = this.f5410b;
            if (j6 >= j10) {
                return str.substring((int) j10, ((int) j6) + 1);
            }
        }
        long j11 = this.f5410b;
        return str.substring((int) j11, ((int) j11) + 1);
    }

    /* renamed from: c */
    public float mo2328c() {
        if (this instanceof C0867e) {
            return ((C0867e) this).mo2328c();
        }
        return Float.NaN;
    }

    /* renamed from: e */
    public int mo2329e() {
        if (this instanceof C0867e) {
            return ((C0867e) this).mo2329e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0865c)) {
            return false;
        }
        AbstractC0865c abstractC0865c = (AbstractC0865c) obj;
        if (this.f5410b == abstractC0865c.f5410b && this.f5411c == abstractC0865c.f5411c && Arrays.equals(this.f5409a, abstractC0865c.f5409a)) {
            return Objects.equals(this.f5412d, abstractC0865c.f5412d);
        }
        return false;
    }

    /* renamed from: g */
    public final String m2330g() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f5409a) * 31;
        long j6 = this.f5410b;
        int i10 = (iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j10 = this.f5411c;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        AbstractC0864b abstractC0864b = this.f5412d;
        return (i11 + (abstractC0864b != null ? abstractC0864b.hashCode() : 0)) * 31;
    }

    /* renamed from: k */
    public final void m2331k(long j6) {
        if (this.f5411c != Long.MAX_VALUE) {
            return;
        }
        this.f5411c = j6;
        AbstractC0864b abstractC0864b = this.f5412d;
        if (abstractC0864b != null) {
            abstractC0864b.m2317m(this);
        }
    }

    public String toString() {
        long j6 = this.f5410b;
        long j10 = this.f5411c;
        if (j6 > j10 || j10 == Long.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass());
            sb2.append(" (INVALID, ");
            sb2.append(this.f5410b);
            sb2.append("-");
            return AbstractC0030c.m116g(this.f5411c, ")", sb2);
        }
        return m2330g() + " (" + this.f5410b + " : " + this.f5411c + ") <<" + new String(this.f5409a).substring((int) this.f5410b, ((int) this.f5411c) + 1) + ">>";
    }
}
