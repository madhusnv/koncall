package im;

import com.websoptimization.callyzerbiz.data.model.response.AuthFailedResponse;
import iz.C3389v;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p0 extends f1 {

    /* renamed from: a */
    public final AuthFailedResponse f17574a;

    /* renamed from: b */
    public final C3389v f17575b;

    public p0(AuthFailedResponse authFailedResponse, C3389v c3389v) {
        super(0);
        this.f17574a = authFailedResponse;
        this.f17575b = c3389v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return AbstractC4154l.m8918a(this.f17574a, p0Var.f17574a) && AbstractC4154l.m8918a(this.f17575b, p0Var.f17575b);
    }

    public final int hashCode() {
        return (this.f17574a.hashCode() * 31) + Arrays.hashCode(this.f17575b.f17981a);
    }

    public final String toString() {
        return "AuthFailure(authFailed=" + this.f17574a + ", headers=" + this.f17575b + ")";
    }
}
