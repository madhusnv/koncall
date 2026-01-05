package i00;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 extends w0 {

    /* renamed from: c */
    public final /* synthetic */ int f16640c;

    /* renamed from: d */
    public final String f16641d;

    /* renamed from: e */
    public final C3096a f16642e;

    /* renamed from: f */
    public final boolean f16643f;

    public a0(String str, boolean z6, int i10) {
        this.f16640c = i10;
        switch (i10) {
            case 1:
                C3096a c3096a = C3096a.f16633b;
                Objects.requireNonNull(str, "name == null");
                this.f16641d = str;
                this.f16642e = c3096a;
                this.f16643f = z6;
                break;
            case 2:
                C3096a c3096a2 = C3096a.f16633b;
                Objects.requireNonNull(str, "name == null");
                this.f16641d = str;
                this.f16642e = c3096a2;
                this.f16643f = z6;
                break;
            default:
                C3096a c3096a3 = C3096a.f16633b;
                Objects.requireNonNull(str, "name == null");
                this.f16641d = str;
                this.f16642e = c3096a3;
                this.f16643f = z6;
                break;
        }
    }

    @Override // i00.w0
    /* renamed from: a */
    public final void mo7438a(m0 m0Var, Object obj) {
        switch (this.f16640c) {
            case 0:
                if (obj != null) {
                    this.f16642e.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        m0Var.m7448a(this.f16641d, string, this.f16643f);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f16642e.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        m0Var.m7449b(this.f16641d, string2, this.f16643f);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f16642e.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        m0Var.m7451d(this.f16641d, string3, this.f16643f);
                        break;
                    }
                }
                break;
        }
    }
}
