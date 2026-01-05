package p001o;

import com.facebook.C10773c;
import org.json.JSONException;
import p001o.mt6;

/* loaded from: classes5.dex */
public final class pk8 {

    /* renamed from: a */
    public static final pk8 f40195a = new pk8();

    /* renamed from: d */
    public static final void m43806d() {
        if (C10773c.m13023p()) {
            mt6.m39645a(mt6.EnumC15426c.CrashReport, new mt6.InterfaceC15425b() { // from class: o.mk8
                @Override // p001o.mt6.InterfaceC15425b
                /* renamed from: a */
                public final void mo17402a(boolean z) throws JSONException {
                    pk8.m43807e(z);
                }
            });
            mt6.m39645a(mt6.EnumC15426c.ErrorReport, new mt6.InterfaceC15425b() { // from class: o.nk8
                @Override // p001o.mt6.InterfaceC15425b
                /* renamed from: a */
                public final void mo17402a(boolean z) {
                    pk8.m43808f(z);
                }
            });
            mt6.m39645a(mt6.EnumC15426c.AnrReport, new mt6.InterfaceC15425b() { // from class: o.ok8
                @Override // p001o.mt6.InterfaceC15425b
                /* renamed from: a */
                public final void mo17402a(boolean z) {
                    pk8.m43809g(z);
                }
            });
        }
    }

    /* renamed from: e */
    public static final void m43807e(boolean z) throws JSONException {
        if (z) {
            z84.f56686b.m58934c();
            if (mt6.m39648g(mt6.EnumC15426c.CrashShield)) {
                wk6.m54664b();
                a94.m16691a();
            }
            if (mt6.m39648g(mt6.EnumC15426c.ThreadCheck)) {
                ekh.m25194a();
            }
        }
    }

    /* renamed from: f */
    public static final void m43808f(boolean z) {
        if (z) {
            qj6.m45536d();
        }
    }

    /* renamed from: g */
    public static final void m43809g(boolean z) {
        if (z) {
            C14684k.m34811c();
        }
    }
}
