package im;

import com.websoptimization.callyzerbiz.common.exception.RestApiException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class f1<T> {
    public /* synthetic */ f1(int i10) {
        this();
    }

    /* renamed from: a */
    public final RestApiException m7640a() {
        return this instanceof o0 ? new RestApiException(RestApiException.EnumC1454a.SERVER_ERROR, null) : this instanceof p0 ? new RestApiException(RestApiException.EnumC1454a.UNAUTHORIZED, null) : this instanceof s0 ? new RestApiException(RestApiException.EnumC1454a.UNAUTHORIZED, null) : this instanceof t0 ? new RestApiException(RestApiException.EnumC1454a.DEVICE_DELETED, null) : this instanceof u0 ? new RestApiException(RestApiException.EnumC1454a.DEVICE_DELETED_REGISTER, null) : this instanceof x0 ? new RestApiException(RestApiException.EnumC1454a.SUBSCRIPTION_EXPIRED, null) : this instanceof a1 ? new RestApiException(RestApiException.EnumC1454a.RESTORE_LEAD, null) : this instanceof z0 ? new RestApiException(RestApiException.EnumC1454a.OTHER, null) : this instanceof b1 ? new RestApiException(RestApiException.EnumC1454a.SERVER_ERROR, null) : this instanceof c1 ? new RestApiException(RestApiException.EnumC1454a.SUBSCRIPTION_EXPIRED, null) : this instanceof y0 ? new RestApiException(RestApiException.EnumC1454a.NETWORK_ERROR, null) : this instanceof q0 ? new RestApiException(RestApiException.EnumC1454a.BAD_REQUEST, null) : this instanceof v0 ? new RestApiException(RestApiException.EnumC1454a.Lead_BAD_REQUEST, null) : new RestApiException(RestApiException.EnumC1454a.OTHER, null);
    }

    private f1() {
    }
}
