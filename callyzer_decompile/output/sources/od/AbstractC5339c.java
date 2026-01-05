package od;

import nd.EnumC5011b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: od.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5339c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f26255a;

    static {
        int[] iArr = new int[EnumC5011b.values().length];
        try {
            iArr[EnumC5011b.Error.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC5011b.Warning.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC5011b.Info.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC5011b.Debug.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC5011b.Trace.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f26255a = iArr;
    }
}
