package l4;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import n4.C4953b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.k */
/* loaded from: classes.dex */
public final class C4366k {

    /* renamed from: g */
    public static final C4366k f21913g = new C4366k(false, 0, true, 1, 1, C4953b.f24638c);

    /* renamed from: a */
    public final boolean f21914a;

    /* renamed from: b */
    public final int f21915b;

    /* renamed from: c */
    public final boolean f21916c;

    /* renamed from: d */
    public final int f21917d;

    /* renamed from: e */
    public final int f21918e;

    /* renamed from: f */
    public final C4953b f21919f;

    public C4366k(boolean z6, int i10, boolean z10, int i11, int i12, C4953b c4953b) {
        this.f21914a = z6;
        this.f21915b = i10;
        this.f21916c = z10;
        this.f21917d = i11;
        this.f21918e = i12;
        this.f21919f = c4953b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4366k)) {
            return false;
        }
        C4366k c4366k = (C4366k) obj;
        return this.f21914a == c4366k.f21914a && this.f21915b == c4366k.f21915b && this.f21916c == c4366k.f21916c && this.f21917d == c4366k.f21917d && this.f21918e == c4366k.f21918e && AbstractC4154l.m8918a(this.f21919f, c4366k.f21919f);
    }

    public final int hashCode() {
        return this.f21919f.f24639a.hashCode() + AbstractC1452a.m4556c(this.f21918e, AbstractC1452a.m4556c(this.f21917d, AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f21915b, Boolean.hashCode(this.f21914a) * 31, 31), 31, this.f21916c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f21914a + ", capitalization=" + ((Object) C4368m.m9147a(this.f21915b)) + ", autoCorrect=" + this.f21916c + ", keyboardType=" + ((Object) C4369n.m9148a(this.f21917d)) + ", imeAction=" + ((Object) C4365j.m9113a(this.f21918e)) + ", platformImeOptions=null, hintLocales=" + this.f21919f + ')';
    }
}
