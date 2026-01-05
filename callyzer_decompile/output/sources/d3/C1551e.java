package d3;

import android.os.Build;
import com.websoptimization.callyzerbiz.R;
import f3.C2196b;
import g3.C2474b;
import g3.C2477e;
import g3.C2478f;
import g3.C2480h;
import g3.InterfaceC2476d;
import h3.AbstractC2822a;
import h3.C2823b;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d3.e */
/* loaded from: classes.dex */
public final class C1551e implements InterfaceC1570x {

    /* renamed from: d */
    public static boolean f7739d = true;

    /* renamed from: a */
    public final C7904v f7740a;

    /* renamed from: b */
    public final Object f7741b = new Object();

    /* renamed from: c */
    public C2823b f7742c;

    public C1551e(C7904v c7904v) {
        this.f7740a = c7904v;
    }

    @Override // d3.InterfaceC1570x
    /* renamed from: a */
    public final void mo5120a(C2474b c2474b) {
        synchronized (this.f7741b) {
            if (!c2474b.f13432s) {
                c2474b.f13432s = true;
                c2474b.m6363b();
            }
        }
    }

    @Override // d3.InterfaceC1570x
    /* renamed from: b */
    public final C2474b mo5121b() {
        InterfaceC2476d c2480h;
        C2474b c2474b;
        synchronized (this.f7741b) {
            try {
                C7904v c7904v = this.f7740a;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    AbstractC1548b.m5090b(c7904v);
                }
                if (i10 >= 29) {
                    c2480h = new C2478f();
                } else if (f7739d) {
                    try {
                        c2480h = new C2477e(this.f7740a, new C1564r(), new C2196b());
                    } catch (Throwable unused) {
                        f7739d = false;
                        c2480h = new C2480h(m5122c(this.f7740a));
                    }
                } else {
                    c2480h = new C2480h(m5122c(this.f7740a));
                }
                c2474b = new C2474b(c2480h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2474b;
    }

    /* renamed from: c */
    public final AbstractC2822a m5122c(C7904v c7904v) {
        C2823b c2823b = this.f7742c;
        if (c2823b != null) {
            return c2823b;
        }
        C2823b c2823b2 = new C2823b(c7904v.getContext());
        c2823b2.setClipChildren(false);
        c2823b2.setClipToPadding(false);
        c2823b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        c7904v.addView(c2823b2, -1);
        this.f7742c = c2823b2;
        return c2823b2;
    }
}
