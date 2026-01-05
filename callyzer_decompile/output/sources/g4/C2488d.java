package g4;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.d */
/* loaded from: classes.dex */
public final class C2488d {

    /* renamed from: a */
    public final Object f13563a;

    /* renamed from: b */
    public final int f13564b;

    /* renamed from: c */
    public int f13565c;

    /* renamed from: d */
    public final String f13566d;

    public C2488d(Object obj, int i10, int i11, String str) {
        this.f13563a = obj;
        this.f13564b = i10;
        this.f13565c = i11;
        this.f13566d = str;
    }

    /* renamed from: a */
    public final C2490f m6420a(int i10) {
        int i11 = this.f13565c;
        if (i11 != Integer.MIN_VALUE) {
            i10 = i11;
        }
        if (!(i10 != Integer.MIN_VALUE)) {
            AbstractC4646a.m9526b("Item.end should be set first");
        }
        return new C2490f(this.f13563a, this.f13564b, i10, this.f13566d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2488d)) {
            return false;
        }
        C2488d c2488d = (C2488d) obj;
        return AbstractC4154l.m8918a(this.f13563a, c2488d.f13563a) && this.f13564b == c2488d.f13564b && this.f13565c == c2488d.f13565c && AbstractC4154l.m8918a(this.f13566d, c2488d.f13566d);
    }

    public final int hashCode() {
        Object obj = this.f13563a;
        return this.f13566d.hashCode() + AbstractC1452a.m4556c(this.f13565c, AbstractC1452a.m4556c(this.f13564b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f13563a);
        sb2.append(", start=");
        sb2.append(this.f13564b);
        sb2.append(", end=");
        sb2.append(this.f13565c);
        sb2.append(", tag=");
        return AbstractC0030c.m123n(sb2, this.f13566d, ')');
    }

    public /* synthetic */ C2488d(InterfaceC2487c interfaceC2487c, int i10, int i11, String str, int i12) {
        this(interfaceC2487c, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
    }
}
