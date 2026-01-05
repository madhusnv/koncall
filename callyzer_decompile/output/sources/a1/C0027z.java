package a1;

import b6.InterfaceC0600a;
import c0.C0816i;
import c0.C0817j;
import j0.AbstractC3506f;
import java.util.Map;
import og.u1;
import pg.o7;
import q0.C6069j;
import q0.RunnableC6067h;
import s0.C6698b;
import x4.C8299i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.z */
/* loaded from: classes.dex */
public final /* synthetic */ class C0027z implements InterfaceC0600a {

    /* renamed from: a */
    public final /* synthetic */ int f101a;

    /* renamed from: b */
    public final /* synthetic */ Object f102b;

    public /* synthetic */ C0027z(int i10, Object obj) {
        this.f101a = i10;
        this.f102b = obj;
    }

    @Override // b6.InterfaceC0600a
    public final void accept(Object obj) {
        switch (this.f101a) {
            case 0:
                C0013l c0013l = (C0013l) this.f102b;
                u1.m10942a("SurfaceViewImpl");
                if (c0013l != null) {
                    c0013l.m97c();
                    break;
                }
                break;
            case 1:
                ((C8299i) this.f102b).m15507b((C0816i) obj);
                break;
            case 2:
                ((C0005d) this.f102b).getClass();
                o7.m11806a();
                break;
            default:
                C0817j c0817j = (C0817j) obj;
                for (Map.Entry entry : ((Map) this.f102b).entrySet()) {
                    int i10 = c0817j.f5111b - ((C6698b) entry.getKey()).f32014f;
                    if (((C6698b) entry.getKey()).f32015g) {
                        i10 = -i10;
                    }
                    int iM8072g = AbstractC3506f.m8072g(i10);
                    C6069j c6069j = (C6069j) entry.getValue();
                    c6069j.getClass();
                    o7.m11809d(new RunnableC6067h(c6069j, iM8072g, -1));
                }
                break;
        }
    }
}
