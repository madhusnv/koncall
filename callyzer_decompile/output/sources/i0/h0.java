package i0;

import c0.C0811d;
import c0.EnumC0826s;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements d7.h0 {

    /* renamed from: a */
    public final /* synthetic */ int f16477a = 1;

    /* renamed from: b */
    public final /* synthetic */ Object f16478b;

    public /* synthetic */ h0(an.j2 j2Var) {
        this.f16478b = j2Var;
    }

    @Override // d7.h0
    public final void onChanged(Object obj) {
        switch (this.f16477a) {
            case 0:
                i0 i0Var = (i0) this.f16478b;
                C0811d c0811d = (C0811d) obj;
                if (!i0Var.f16487h.get()) {
                    og.u1.m10942a("CameraPresencePrvdr");
                    break;
                } else {
                    if ((c0811d != null ? c0811d.f5062b : null) == null) {
                        if ((c0811d != null ? c0811d.f5061a : null) != EnumC0826s.CLOSED) {
                        }
                    }
                    Objects.toString(c0811d.f5061a);
                    og.u1.m10951j("CameraPresencePrvdr");
                    c0.d1 d1Var = i0Var.f16484e;
                    if (d1Var != null) {
                        d1Var.m2186f();
                        break;
                    }
                }
                break;
            default:
                ((an.j2) this.f16478b).invoke(obj);
                break;
        }
    }

    public /* synthetic */ h0(i0 i0Var, String str) {
        this.f16478b = i0Var;
    }
}
