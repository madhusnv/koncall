package p001o;

import android.os.Trace;

/* loaded from: classes2.dex */
public abstract class ysh {
    /* renamed from: a */
    public static boolean m58186a() {
        return Trace.isEnabled();
    }

    /* renamed from: b */
    public static void m58187b(String str, int i) {
        Trace.setCounter(str, i);
    }
}
