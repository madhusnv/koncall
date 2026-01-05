package im;

import com.websoptimization.callyzerbiz.data.model.response.BaseResponse;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class v0 extends f1 {

    /* renamed from: a */
    public final BaseResponse f17585a;

    public v0(BaseResponse baseResponse) {
        super(0);
        this.f17585a = baseResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && AbstractC4154l.m8918a(this.f17585a, ((v0) obj).f17585a);
    }

    public final int hashCode() {
        return this.f17585a.hashCode();
    }

    public final String toString() {
        return "LeadFormBadRequest(badRequest=" + this.f17585a + ")";
    }
}
