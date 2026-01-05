package wo;

import com.websoptimization.callyzerbiz.common.exception.RestApiException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC8116a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f38847a;

    static {
        int[] iArr = new int[RestApiException.EnumC1454a.values().length];
        try {
            iArr[RestApiException.EnumC1454a.DEVICE_DELETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RestApiException.EnumC1454a.SUBSCRIPTION_EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f38847a = iArr;
    }
}
