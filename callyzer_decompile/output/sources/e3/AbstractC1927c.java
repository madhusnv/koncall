package e3;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.c */
/* loaded from: classes.dex */
public abstract class AbstractC1927c {

    /* renamed from: a */
    public final String f9100a;

    /* renamed from: b */
    public final long f9101b;

    /* renamed from: c */
    public final int f9102c;

    public AbstractC1927c(String str, int i10, long j6) {
        this.f9100a = str;
        this.f9101b = j6;
        this.f9102c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    /* renamed from: a */
    public abstract float mo5673a(int i10);

    /* renamed from: b */
    public abstract float mo5674b(int i10);

    /* renamed from: c */
    public boolean mo5675c() {
        return false;
    }

    /* renamed from: d */
    public abstract long mo5676d(float f6, float f10, float f11);

    /* renamed from: e */
    public abstract float mo5677e(float f6, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1927c abstractC1927c = (AbstractC1927c) obj;
        if (this.f9102c == abstractC1927c.f9102c && AbstractC4154l.m8918a(this.f9100a, abstractC1927c.f9100a)) {
            return AbstractC1926b.m5671a(this.f9101b, abstractC1927c.f9101b);
        }
        return false;
    }

    /* renamed from: f */
    public abstract long mo5678f(float f6, float f10, float f11, float f12, AbstractC1927c abstractC1927c);

    public int hashCode() {
        int iHashCode = this.f9100a.hashCode() * 31;
        int i10 = AbstractC1926b.f9099e;
        return AbstractC1452a.m4557d(iHashCode, 31, this.f9101b) + this.f9102c;
    }

    public final String toString() {
        return this.f9100a + " (id=" + this.f9102c + ", model=" + ((Object) AbstractC1926b.m5672b(this.f9101b)) + ')';
    }
}
