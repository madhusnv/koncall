package f0;

import android.util.Range;
import com.sun.mail.util.AbstractC1452a;
import d0.AbstractC1545b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f0.c */
/* loaded from: classes.dex */
public final class C2168c extends AbstractC1545b {

    /* renamed from: d */
    public static final Range f10032d = new Range(30, 30);

    /* renamed from: a */
    public final int f10033a = 60;

    /* renamed from: b */
    public final int f10034b = 60;

    /* renamed from: c */
    public final EnumC2167b f10035c = EnumC2167b.FPS_RANGE;

    @Override // d0.AbstractC1545b
    /* renamed from: a */
    public final EnumC2167b mo5083a() {
        return this.f10035c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FpsRangeFeature(minFps=");
        sb2.append(this.f10033a);
        sb2.append(", maxFps=");
        return AbstractC1452a.m4563j(sb2, this.f10034b, ')');
    }
}
