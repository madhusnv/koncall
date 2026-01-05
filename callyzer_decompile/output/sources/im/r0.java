package im;

import com.websoptimization.callyzerbiz.data.model.response.BaseResponse;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r0 extends f1 {

    /* renamed from: a */
    public final BaseResponse f17578a;

    public r0(BaseResponse baseResponse) {
        super(0);
        this.f17578a = baseResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && AbstractC4154l.m8918a(this.f17578a, ((r0) obj).f17578a);
    }

    public final int hashCode() {
        return this.f17578a.hashCode();
    }

    public final String toString() {
        return "CallRecordingSubscriptionExpired(callRecordingSubscriptionExpired=" + this.f17578a + ")";
    }
}
