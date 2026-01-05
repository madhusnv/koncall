package k4;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public final int f20646a;

    /* renamed from: b */
    public final C3998s f20647b;

    /* renamed from: c */
    public final C3997r f20648c;

    public a0(int i10, C3998s c3998s, C3997r c3997r) {
        this.f20646a = i10;
        this.f20647b = c3998s;
        this.f20648c = c3997r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f20646a == a0Var.f20646a && AbstractC4154l.m8918a(this.f20647b, a0Var.f20647b) && this.f20648c.equals(a0Var.f20648c);
    }

    public final int hashCode() {
        return this.f20648c.f20691a.hashCode() + AbstractC1452a.m4556c(0, AbstractC1452a.m4556c(0, ((this.f20646a * 31) + this.f20647b.f20701a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f20646a + ", weight=" + this.f20647b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
