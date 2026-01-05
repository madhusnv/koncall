package ge;

import android.graphics.drawable.Drawable;
import com.sun.mail.util.AbstractC1452a;
import ee.C2033a;
import kotlin.jvm.internal.AbstractC4154l;
import yd.EnumC8622e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.o */
/* loaded from: classes.dex */
public final class C2583o extends AbstractC2578j {

    /* renamed from: a */
    public final Drawable f14063a;

    /* renamed from: b */
    public final C2577i f14064b;

    /* renamed from: c */
    public final EnumC8622e f14065c;

    /* renamed from: d */
    public final C2033a f14066d;

    /* renamed from: e */
    public final String f14067e;

    /* renamed from: f */
    public final boolean f14068f;

    /* renamed from: g */
    public final boolean f14069g;

    public C2583o(Drawable drawable, C2577i c2577i, EnumC8622e enumC8622e, C2033a c2033a, String str, boolean z6, boolean z10) {
        this.f14063a = drawable;
        this.f14064b = c2577i;
        this.f14065c = enumC8622e;
        this.f14066d = c2033a;
        this.f14067e = str;
        this.f14068f = z6;
        this.f14069g = z10;
    }

    @Override // ge.AbstractC2578j
    /* renamed from: a */
    public final C2577i mo6573a() {
        return this.f14064b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2583o)) {
            return false;
        }
        C2583o c2583o = (C2583o) obj;
        return AbstractC4154l.m8918a(this.f14063a, c2583o.f14063a) && AbstractC4154l.m8918a(this.f14064b, c2583o.f14064b) && this.f14065c == c2583o.f14065c && AbstractC4154l.m8918a(this.f14066d, c2583o.f14066d) && AbstractC4154l.m8918a(this.f14067e, c2583o.f14067e) && this.f14068f == c2583o.f14068f && this.f14069g == c2583o.f14069g;
    }

    public final int hashCode() {
        int iHashCode = (this.f14065c.hashCode() + ((this.f14064b.hashCode() + (this.f14063a.hashCode() * 31)) * 31)) * 31;
        C2033a c2033a = this.f14066d;
        int iHashCode2 = (iHashCode + (c2033a != null ? c2033a.hashCode() : 0)) * 31;
        String str = this.f14067e;
        return Boolean.hashCode(this.f14069g) + AbstractC1452a.m4558e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f14068f);
    }
}
