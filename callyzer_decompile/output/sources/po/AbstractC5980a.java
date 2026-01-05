package po;

import kn.EnumC4127g;
import kn.EnumC4131k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: po.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5980a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f29232a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f29233b;

    static {
        int[] iArr = new int[EnumC4127g.values().length];
        try {
            iArr[EnumC4127g.Normal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC4127g.Silent.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC4127g.Floating.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f29232a = iArr;
        int[] iArr2 = new int[EnumC4131k.values().length];
        try {
            iArr2[EnumC4131k.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC4131k.PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC4131k.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC4131k.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f29233b = iArr2;
    }
}
