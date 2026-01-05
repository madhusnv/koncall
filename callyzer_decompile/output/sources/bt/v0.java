package bt;

import at.C0433d;
import ct.C1502a;
import dt.C1818x;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import mm.C4802m;
import zs.C9056u;
import zs.C9059x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4938a = 0;

    /* renamed from: b */
    public final /* synthetic */ int f4939b;

    /* renamed from: c */
    public final /* synthetic */ Object f4940c;

    /* renamed from: d */
    public final /* synthetic */ Object f4941d;

    /* renamed from: e */
    public final /* synthetic */ Object f4942e;

    public /* synthetic */ v0(C0433d c0433d, C1818x c1818x, String str, int i10) {
        this.f4941d = c0433d;
        this.f4942e = c1818x;
        this.f4940c = str;
        this.f4939b = i10;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4938a) {
            case 0:
                C0433d c0433d = (C0433d) this.f4941d;
                C1818x c1818x = (C1818x) this.f4942e;
                String str = (String) this.f4940c;
                C1502a c1502a = c0433d.f3197f;
                if (c1502a == null || !c1502a.f7590c) {
                    c1818x.m5481f(new zs.a0("create_call_note_templates/" + str + "/" + this.f4939b));
                    c1818x.m5481f(new C9059x(false));
                } else {
                    c1818x.m5481f(new C9059x(false));
                    c1818x.m5481f(new C9056u(true));
                }
                return qw.a0.f30746a;
            case 1:
                ((InterfaceC2142f) this.f4941d).invoke(String.valueOf(this.f4939b), (String) this.f4940c, (String) this.f4942e);
                break;
            default:
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f4941d;
                C4802m c4802m = (C4802m) this.f4942e;
                ((k2.w0) this.f4940c).setValue(Boolean.FALSE);
                interfaceC2141e.invoke(c4802m, Integer.valueOf(this.f4939b));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ v0(InterfaceC2141e interfaceC2141e, C4802m c4802m, int i10, k2.w0 w0Var) {
        this.f4941d = interfaceC2141e;
        this.f4942e = c4802m;
        this.f4939b = i10;
        this.f4940c = w0Var;
    }

    public /* synthetic */ v0(InterfaceC2142f interfaceC2142f, int i10, String str, String str2) {
        this.f4941d = interfaceC2142f;
        this.f4939b = i10;
        this.f4940c = str;
        this.f4942e = str2;
    }
}
