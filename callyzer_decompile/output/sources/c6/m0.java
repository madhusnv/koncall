package c6;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public y1 f5483a = null;

    /* renamed from: b */
    public final /* synthetic */ View f5484b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC0893w f5485c;

    public m0(View view, InterfaceC0893w interfaceC0893w) {
        this.f5484b = view;
        this.f5485c = interfaceC0893w;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        y1 y1VarM2537d = y1.m2537d(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        InterfaceC0893w interfaceC0893w = this.f5485c;
        if (i10 < 30) {
            n0.m2449a(windowInsets, this.f5484b);
            if (y1VarM2537d.equals(this.f5483a)) {
                return interfaceC0893w.mo2531e(view, y1VarM2537d).m2539c();
            }
        }
        this.f5483a = y1VarM2537d;
        y1 y1VarMo2531e = interfaceC0893w.mo2531e(view, y1VarM2537d);
        if (i10 >= 30) {
            return y1VarMo2531e.m2539c();
        }
        Field field = v0.f5527a;
        l0.m2444c(view);
        return y1VarMo2531e.m2539c();
    }
}
