package sq;

import ex.InterfaceC2137a;
import t1.AbstractC7000y;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f32982a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7266z f32983b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7000y f32984c;

    /* renamed from: d */
    public final /* synthetic */ int f32985d;

    public /* synthetic */ j3(InterfaceC7266z interfaceC7266z, AbstractC7000y abstractC7000y, int i10, int i11) {
        this.f32982a = i11;
        this.f32983b = interfaceC7266z;
        this.f32984c = abstractC7000y;
        this.f32985d = i10;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f32982a) {
            case 0:
                tx.c0.m13502y(this.f32983b, null, null, new m3(this.f32984c, this.f32985d, null, 2), 3);
                break;
            case 1:
                tx.c0.m13502y(this.f32983b, null, null, new m3(this.f32984c, this.f32985d, null, 1), 3);
                break;
            default:
                tx.c0.m13502y(this.f32983b, null, null, new m3(this.f32984c, this.f32985d, null, 0), 3);
                break;
        }
        return qw.a0.f30746a;
    }
}
