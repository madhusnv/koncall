package i1;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a */
    public static final float f16812a = ViewConfiguration.getScrollFriction();

    /* renamed from: b */
    public static final double f16813b;

    /* renamed from: c */
    public static final double f16814c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f16813b = dLog;
        f16814c = dLog - 1.0d;
    }
}
