package rf;

import c9.C0910e;
import java.util.Arrays;
import qf.InterfaceC6203b;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.a */
/* loaded from: classes.dex */
public final class C6496a {

    /* renamed from: a */
    public final int f31203a;

    /* renamed from: b */
    public final C0910e f31204b;

    /* renamed from: c */
    public final InterfaceC6203b f31205c;

    /* renamed from: d */
    public final String f31206d;

    public C6496a(C0910e c0910e, InterfaceC6203b interfaceC6203b, String str) {
        this.f31204b = c0910e;
        this.f31205c = interfaceC6203b;
        this.f31206d = str;
        this.f31203a = Arrays.hashCode(new Object[]{c0910e, interfaceC6203b, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6496a)) {
            return false;
        }
        C6496a c6496a = (C6496a) obj;
        return AbstractC6840z.m13040k(this.f31204b, c6496a.f31204b) && AbstractC6840z.m13040k(this.f31205c, c6496a.f31205c) && AbstractC6840z.m13040k(this.f31206d, c6496a.f31206d);
    }

    public final int hashCode() {
        return this.f31203a;
    }
}
