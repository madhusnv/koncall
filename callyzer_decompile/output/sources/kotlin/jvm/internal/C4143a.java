package kotlin.jvm.internal;

import a2.AbstractC0030c;
import java.io.Serializable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes3.dex */
public class C4143a implements InterfaceC4150h, Serializable {

    /* renamed from: a */
    public final Object f21147a;

    /* renamed from: b */
    public final Class f21148b;

    /* renamed from: c */
    public final String f21149c;

    /* renamed from: d */
    public final String f21150d;

    /* renamed from: e */
    public final boolean f21151e = false;

    /* renamed from: f */
    public final int f21152f;

    /* renamed from: g */
    public final int f21153g;

    public C4143a(int i10, int i11, Class cls, Object obj, String str, String str2) {
        this.f21147a = obj;
        this.f21148b = cls;
        this.f21149c = str;
        this.f21150d = str2;
        this.f21152f = i10;
        this.f21153g = i11 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4143a)) {
            return false;
        }
        C4143a c4143a = (C4143a) obj;
        return this.f21151e == c4143a.f21151e && this.f21152f == c4143a.f21152f && this.f21153g == c4143a.f21153g && AbstractC4154l.m8918a(this.f21147a, c4143a.f21147a) && this.f21148b.equals(c4143a.f21148b) && this.f21149c.equals(c4143a.f21149c) && this.f21150d.equals(c4143a.f21150d);
    }

    @Override // kotlin.jvm.internal.InterfaceC4150h
    public final int getArity() {
        return this.f21152f;
    }

    public final int hashCode() {
        Object obj = this.f21147a;
        return ((((AbstractC0030c.m113d(AbstractC0030c.m113d((this.f21148b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.f21149c), 31, this.f21150d) + (this.f21151e ? 1231 : 1237)) * 31) + this.f21152f) * 31) + this.f21153g;
    }

    public final String toString() {
        a0.f21154a.getClass();
        return b0.m8902a(this);
    }
}
