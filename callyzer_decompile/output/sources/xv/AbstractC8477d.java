package xv;

import com.websoptimization.callyzerbiz.common.exception.SimStateException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.d */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC8477d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f41298a;

    static {
        int[] iArr = new int[SimStateException.EnumC1456a.values().length];
        try {
            iArr[SimStateException.EnumC1456a.NO_SIM_FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SimStateException.EnumC1456a.CONNECTED_SIM_NOT_EXIST_ON_DEVICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SimStateException.EnumC1456a.NO_CONNECTED_SIM_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SimStateException.EnumC1456a.NO_AVAILABLE_SIM_IN_DB.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SimStateException.EnumC1456a.IDENTIFY_FROM_DATA_STORE_STATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SimStateException.EnumC1456a.NO_LEAD_CONNECTED_SIM_FOUND.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f41298a = iArr;
    }
}
