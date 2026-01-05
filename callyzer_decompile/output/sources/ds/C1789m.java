package ds;

import cs.C1487f;
import cs.C1489h;
import ex.InterfaceC2137a;
import gs.C2728n;
import k2.w0;
import kotlin.jvm.internal.C4168z;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ds.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1789m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f8682a = 0;

    /* renamed from: b */
    public final /* synthetic */ C2728n f8683b;

    /* renamed from: c */
    public final /* synthetic */ C4168z f8684c;

    /* renamed from: d */
    public final /* synthetic */ w0 f8685d;

    /* renamed from: e */
    public final /* synthetic */ w0 f8686e;

    public /* synthetic */ C1789m(C2728n c2728n, w0 w0Var, C4168z c4168z, w0 w0Var2) {
        this.f8683b = c2728n;
        this.f8685d = w0Var;
        this.f8684c = c4168z;
        this.f8686e = w0Var2;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f8682a) {
            case 0:
                this.f8686e.setValue(Boolean.FALSE);
                this.f8683b.m6727e(new C1489h((String) this.f8685d.getValue(), ((Number) ((w0) this.f8684c.f21164a).getValue()).intValue()));
                break;
            default:
                this.f8686e.setValue(Boolean.FALSE);
                this.f8683b.m6727e(new C1487f((String) ((w0) this.f8684c.f21164a).getValue(), (String) this.f8685d.getValue()));
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C1789m(C2728n c2728n, C4168z c4168z, w0 w0Var, w0 w0Var2) {
        this.f8683b = c2728n;
        this.f8684c = c4168z;
        this.f8685d = w0Var;
        this.f8686e = w0Var2;
    }
}
