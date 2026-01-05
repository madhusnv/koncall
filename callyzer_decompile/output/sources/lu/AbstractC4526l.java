package lu;

import pu.EnumC6039g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lu.l */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4526l {

    /* renamed from: a */
    public static final /* synthetic */ int[] f22495a;

    static {
        int[] iArr = new int[EnumC6039g.values().length];
        try {
            iArr[EnumC6039g.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC6039g.WORKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC6039g.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC6039g.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f22495a = iArr;
    }
}
