package g4;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import k4.InterfaceC3987h;
import kotlin.jvm.internal.AbstractC4154l;
import s4.C6745a;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    public final C2492h f13660a;

    /* renamed from: b */
    public final o0 f13661b;

    /* renamed from: c */
    public final List f13662c;

    /* renamed from: d */
    public final int f13663d;

    /* renamed from: e */
    public final boolean f13664e;

    /* renamed from: f */
    public final int f13665f;

    /* renamed from: g */
    public final InterfaceC6747c f13666g;

    /* renamed from: h */
    public final EnumC6757m f13667h;

    /* renamed from: i */
    public final InterfaceC3987h f13668i;

    /* renamed from: j */
    public final long f13669j;

    public k0(C2492h c2492h, o0 o0Var, List list, int i10, boolean z6, int i11, InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m, InterfaceC3987h interfaceC3987h, long j6) {
        this.f13660a = c2492h;
        this.f13661b = o0Var;
        this.f13662c = list;
        this.f13663d = i10;
        this.f13664e = z6;
        this.f13665f = i11;
        this.f13666g = interfaceC6747c;
        this.f13667h = enumC6757m;
        this.f13668i = interfaceC3987h;
        this.f13669j = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return AbstractC4154l.m8918a(this.f13660a, k0Var.f13660a) && AbstractC4154l.m8918a(this.f13661b, k0Var.f13661b) && AbstractC4154l.m8918a(this.f13662c, k0Var.f13662c) && this.f13663d == k0Var.f13663d && this.f13664e == k0Var.f13664e && this.f13665f == k0Var.f13665f && AbstractC4154l.m8918a(this.f13666g, k0Var.f13666g) && this.f13667h == k0Var.f13667h && AbstractC4154l.m8918a(this.f13668i, k0Var.f13668i) && C6745a.m12912c(this.f13669j, k0Var.f13669j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f13669j) + ((this.f13668i.hashCode() + ((this.f13667h.hashCode() + ((this.f13666g.hashCode() + AbstractC1452a.m4556c(this.f13665f, AbstractC1452a.m4558e((AbstractC1452a.m4559f(this.f13662c, (this.f13661b.hashCode() + (this.f13660a.hashCode() * 31)) * 31, 31) + this.f13663d) * 31, 31, this.f13664e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f13660a);
        sb2.append(", style=");
        sb2.append(this.f13661b);
        sb2.append(", placeholders=");
        sb2.append(this.f13662c);
        sb2.append(", maxLines=");
        sb2.append(this.f13663d);
        sb2.append(", softWrap=");
        sb2.append(this.f13664e);
        sb2.append(", overflow=");
        int i10 = this.f13665f;
        sb2.append((Object) (i10 == 1 ? "Clip" : i10 == 2 ? "Ellipsis" : i10 == 5 ? "MiddleEllipsis" : i10 == 3 ? "Visible" : i10 == 4 ? "StartEllipsis" : "Invalid"));
        sb2.append(", density=");
        sb2.append(this.f13666g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f13667h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f13668i);
        sb2.append(", constraints=");
        sb2.append((Object) C6745a.m12922m(this.f13669j));
        sb2.append(')');
        return sb2.toString();
    }
}
