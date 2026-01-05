package og;

import a9.C0073l;
import java.util.Arrays;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a */
    public final ec f26881a;

    /* renamed from: b */
    public final Boolean f26882b;

    /* renamed from: c */
    public final qg f26883c;

    /* renamed from: d */
    public final e0 f26884d;

    /* renamed from: e */
    public final e0 f26885e;

    public /* synthetic */ w0(C0073l c0073l) {
        this.f26881a = (ec) c0073l.f264a;
        this.f26882b = (Boolean) c0073l.f265b;
        this.f26883c = (qg) c0073l.f266c;
        this.f26884d = (e0) c0073l.f267d;
        this.f26885e = (e0) c0073l.f268e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return AbstractC6840z.m13040k(this.f26881a, w0Var.f26881a) && AbstractC6840z.m13040k(null, null) && AbstractC6840z.m13040k(this.f26882b, w0Var.f26882b) && AbstractC6840z.m13040k(null, null) && AbstractC6840z.m13040k(this.f26883c, w0Var.f26883c) && AbstractC6840z.m13040k(this.f26884d, w0Var.f26884d) && AbstractC6840z.m13040k(this.f26885e, w0Var.f26885e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26881a, null, this.f26882b, null, this.f26883c, this.f26884d, this.f26885e});
    }
}
