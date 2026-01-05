package bt;

import ct.C1502a;
import dt.C1804j;
import ex.InterfaceC2137a;
import mm.AbstractC4801l;
import zs.C9040e;
import zs.C9041f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0758c implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4783a = 0;

    /* renamed from: b */
    public final /* synthetic */ C1804j f4784b;

    /* renamed from: c */
    public final /* synthetic */ C1502a f4785c;

    public /* synthetic */ C0758c(C1502a c1502a, C1804j c1804j) {
        this.f4785c = c1502a;
        this.f4784b = c1804j;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4783a) {
            case 0:
                this.f4784b.m5477h(new C9041f(AbstractC4801l.m9730d(this.f4785c.f7591d, "read_call_note_templates/")));
                break;
            default:
                this.f4784b.m5477h(new C9040e(this.f4785c.f7591d));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C0758c(C1804j c1804j, C1502a c1502a) {
        this.f4784b = c1804j;
        this.f4785c = c1502a;
    }
}
