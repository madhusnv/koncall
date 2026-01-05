package qv;

import com.websoptimization.callyzerbiz.data.model.request.AddDeviceRequest;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.t */
/* loaded from: classes3.dex */
public final class C6345t extends AbstractC6349x {

    /* renamed from: a */
    public final AddDeviceRequest f30739a;

    public C6345t(AddDeviceRequest addDeviceRequest) {
        this.f30739a = addDeviceRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6345t) && AbstractC4154l.m8918a(this.f30739a, ((C6345t) obj).f30739a);
    }

    public final int hashCode() {
        return this.f30739a.hashCode();
    }

    public final String toString() {
        return "SaveSIMInfoForRegister(addDeviceRequest=" + this.f30739a + ")";
    }
}
