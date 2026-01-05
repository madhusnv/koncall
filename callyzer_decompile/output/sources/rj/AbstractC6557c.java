package rj;

import tj.EnumC7168d;
import tj.EnumC7170f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rj.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6557c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f31412a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f31413b;

    static {
        int[] iArr = new int[EnumC7170f.values().length];
        f31413b = iArr;
        try {
            iArr[EnumC7170f.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f31413b[EnumC7170f.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f31413b[EnumC7170f.AUTH_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC7168d.values().length];
        f31412a = iArr2;
        try {
            iArr2[EnumC7168d.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f31412a[EnumC7168d.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
