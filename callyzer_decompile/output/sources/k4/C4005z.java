package k4;

import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k4.z */
/* loaded from: classes.dex */
public final class C4005z implements InterfaceC4004y {
    /* renamed from: a */
    public static Typeface m8784a(String str, C3998s c3998s, int i10) {
        if (i10 == 0 && AbstractC4154l.m8918a(c3998s, C3998s.f20695e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c3998s.f20701a, i10 == 1);
    }

    @Override // k4.InterfaceC4004y
    /* renamed from: b */
    public final Typeface mo8782b(C3998s c3998s, int i10) {
        return m8784a(null, c3998s, i10);
    }

    @Override // k4.InterfaceC4004y
    /* renamed from: c */
    public final Typeface mo8783c(C4000u c4000u, C3998s c3998s, int i10) {
        c4000u.getClass();
        return m8784a("sans-serif", c3998s, i10);
    }
}
