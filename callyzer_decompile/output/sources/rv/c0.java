package rv;

import com.websoptimization.callyzerbiz.data.model.request.AddDeviceRequest;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a */
    public final AddDeviceRequest f31825a;

    public c0(AddDeviceRequest addDeviceRequest) {
        this.f31825a = addDeviceRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && AbstractC4154l.m8918a(this.f31825a, ((c0) obj).f31825a);
    }

    public final int hashCode() {
        return this.f31825a.hashCode();
    }

    public final String toString() {
        return "BackToRegister(addDeviceRequest=" + this.f31825a + ")";
    }
}
