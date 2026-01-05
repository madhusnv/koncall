package i0;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: h */
    public static final C3076g f16562h = new C3076g("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* renamed from: i */
    public static final C3076g f16563i = new C3076g("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* renamed from: j */
    public static final C3076g f16564j = new C3076g("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* renamed from: a */
    public final ArrayList f16565a;

    /* renamed from: b */
    public final o1 f16566b;

    /* renamed from: c */
    public final int f16567c;

    /* renamed from: d */
    public final List f16568d;

    /* renamed from: e */
    public final boolean f16569e;

    /* renamed from: f */
    public final r2 f16570f;

    /* renamed from: g */
    public final InterfaceC3093x f16571g;

    public q0(ArrayList arrayList, o1 o1Var, int i10, ArrayList arrayList2, boolean z6, r2 r2Var, InterfaceC3093x interfaceC3093x) {
        this.f16565a = arrayList;
        this.f16566b = o1Var;
        this.f16567c = i10;
        this.f16568d = Collections.unmodifiableList(arrayList2);
        this.f16569e = z6;
        this.f16570f = r2Var;
        this.f16571g = interfaceC3093x;
    }

    /* renamed from: a */
    public final Range m7410a() {
        o1 o1Var = this.f16566b;
        C3076g c3076g = f16564j;
        Object objMo7406k = C3082m.f16521h;
        try {
            objMo7406k = o1Var.mo7406k(c3076g);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objMo7406k;
        Objects.requireNonNull(range);
        return range;
    }

    /* renamed from: b */
    public final int m7411b() {
        Object objMo7406k = 0;
        try {
            objMo7406k = this.f16566b.mo7406k(w2.D0);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objMo7406k;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: c */
    public final int m7412c() {
        Object objMo7406k = 0;
        try {
            objMo7406k = this.f16566b.mo7406k(w2.E0);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objMo7406k;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
