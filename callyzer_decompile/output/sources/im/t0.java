package im;

import com.websoptimization.callyzerbiz.data.model.response.BaseResponse;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class t0 extends f1 {

    /* renamed from: a */
    public final BaseResponse f17582a;

    public t0(BaseResponse baseResponse) {
        super(0);
        this.f17582a = baseResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && AbstractC4154l.m8918a(this.f17582a, ((t0) obj).f17582a);
    }

    public final int hashCode() {
        return this.f17582a.hashCode();
    }

    public final String toString() {
        return "DeviceDeleted(deviceDelete=" + this.f17582a + ")";
    }
}
