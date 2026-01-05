package x1;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4365j;
import l4.C4366k;
import l4.C4368m;
import l4.C4369n;
import n4.C4953b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: e */
    public static final u0 f39690e;

    /* renamed from: a */
    public final int f39691a;

    /* renamed from: b */
    public final Boolean f39692b;

    /* renamed from: c */
    public final int f39693c;

    /* renamed from: d */
    public final int f39694d;

    static {
        int i10 = 0;
        f39690e = new u0(i10, i10, 127);
    }

    public u0(int i10, Boolean bool, int i11, int i12) {
        this.f39691a = i10;
        this.f39692b = bool;
        this.f39693c = i11;
        this.f39694d = i12;
    }

    /* renamed from: a */
    public static u0 m15474a(int i10, int i11, int i12, int i13) {
        int i14 = i13 & 1;
        u0 u0Var = f39690e;
        if (i14 != 0) {
            i10 = u0Var.f39691a;
        }
        Boolean bool = u0Var.f39692b;
        if ((i13 & 4) != 0) {
            i11 = u0Var.f39693c;
        }
        if ((i13 & 8) != 0) {
            i12 = u0Var.f39694d;
        }
        return new u0(i10, bool, i11, i12);
    }

    /* renamed from: b */
    public final C4366k m15475b(boolean z6) {
        int i10 = this.f39691a;
        C4368m c4368m = new C4368m(i10);
        if (i10 == -1) {
            c4368m = null;
        }
        int i11 = c4368m != null ? c4368m.f21924a : 0;
        Boolean bool = this.f39692b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i12 = this.f39693c;
        C4369n c4369n = new C4369n(i12);
        if (i12 == 0) {
            c4369n = null;
        }
        int i13 = c4369n != null ? c4369n.f21925a : 1;
        int i14 = this.f39694d;
        C4365j c4365j = i14 != -1 ? new C4365j(i14) : null;
        return new C4366k(z6, i11, zBooleanValue, i13, c4365j != null ? c4365j.f21911a : 1, C4953b.f24638c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f39691a == u0Var.f39691a && AbstractC4154l.m8918a(this.f39692b, u0Var.f39692b) && this.f39693c == u0Var.f39693c && this.f39694d == u0Var.f39694d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f39691a) * 31;
        Boolean bool = this.f39692b;
        return AbstractC1452a.m4556c(this.f39694d, AbstractC1452a.m4556c(this.f39693c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) C4368m.m9147a(this.f39691a)) + ", autoCorrectEnabled=" + this.f39692b + ", keyboardType=" + ((Object) C4369n.m9148a(this.f39693c)) + ", imeAction=" + ((Object) C4365j.m9113a(this.f39694d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }

    public /* synthetic */ u0(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? -1 : 3, (i12 & 2) != 0 ? null : Boolean.FALSE, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? -1 : i11);
    }
}
