package tp;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import qw.a0;
import zp.C9014n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tp.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7182c implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f34461a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2141e f34462b;

    /* renamed from: c */
    public final /* synthetic */ C9014n f34463c;

    public /* synthetic */ C7182c(InterfaceC2141e interfaceC2141e, C9014n c9014n, int i10) {
        this.f34461a = i10;
        this.f34462b = interfaceC2141e;
        this.f34463c = c9014n;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f34461a) {
            case 0:
                C9014n c9014n = this.f34463c;
                this.f34462b.invoke(c9014n.f43422d, c9014n.f43423e);
                break;
            case 1:
                C9014n c9014n2 = this.f34463c;
                this.f34462b.invoke(c9014n2.f43422d, c9014n2.f43423e);
                break;
            case 2:
                C9014n c9014n3 = this.f34463c;
                this.f34462b.invoke(c9014n3.f43422d, c9014n3.f43423e);
                break;
            default:
                String str = this.f34463c.f43423e;
                this.f34462b.invoke(str, str);
                break;
        }
        return a0.f30746a;
    }
}
