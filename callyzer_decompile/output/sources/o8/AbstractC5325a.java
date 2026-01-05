package o8;

import android.os.Trace;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o8.a */
/* loaded from: classes.dex */
public abstract class AbstractC5325a {
    /* renamed from: a */
    public static void m10471a(int i10, String str) {
        Trace.beginAsyncSection(str, i10);
    }

    /* renamed from: b */
    public static void m10472b(int i10, String str) {
        Trace.endAsyncSection(str, i10);
    }

    /* renamed from: c */
    public static boolean m10473c() {
        return Trace.isEnabled();
    }

    /* renamed from: d */
    public static void m10474d(int i10, String str) {
        Trace.setCounter(str, i10);
    }
}
