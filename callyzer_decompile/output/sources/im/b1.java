package im;

import com.websoptimization.callyzerbiz.data.model.response.BaseResponse;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b1 extends f1 {

    /* renamed from: a */
    public final BaseResponse f17539a;

    public b1(BaseResponse baseResponse) {
        super(0);
        this.f17539a = baseResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && AbstractC4154l.m8918a(this.f17539a, ((b1) obj).f17539a);
    }

    public final int hashCode() {
        BaseResponse baseResponse = this.f17539a;
        if (baseResponse == null) {
            return 0;
        }
        return baseResponse.hashCode();
    }

    public final String toString() {
        return "ServerError(errorBody=" + this.f17539a + ")";
    }
}
