package ya;

import eb.g2;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ya.g */
/* loaded from: classes.dex */
public final class C8608g {

    /* renamed from: a */
    public final String f41872a;

    public C8608g(g2 g2Var) {
        this.f41872a = g2Var.f9320a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8608g.class == obj.getClass() && AbstractC4154l.m8918a(this.f41872a, ((C8608g) obj).f41872a);
    }

    public final int hashCode() {
        String str = this.f41872a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC4801l.m9737k(new StringBuilder("identityId="), this.f41872a, new StringBuilder("GetIdResponse("), ")");
    }
}
