package c9;

import t8.EnumC7055a;
import t8.EnumC7078x;
import t8.c0;
import t8.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.w */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0928w {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5670a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f5671b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f5672c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f5673d;

    static {
        int[] iArr = new int[e0.values().length];
        try {
            iArr[e0.ENQUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e0.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e0.SUCCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e0.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e0.BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e0.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f5670a = iArr;
        int[] iArr2 = new int[EnumC7055a.values().length];
        try {
            iArr2[EnumC7055a.EXPONENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC7055a.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f5671b = iArr2;
        int[] iArr3 = new int[EnumC7078x.values().length];
        try {
            iArr3[EnumC7078x.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[EnumC7078x.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[EnumC7078x.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[EnumC7078x.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[EnumC7078x.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f5672c = iArr3;
        int[] iArr4 = new int[c0.values().length];
        try {
            iArr4[c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[c0.DROP_WORK_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        f5673d = iArr4;
    }
}
