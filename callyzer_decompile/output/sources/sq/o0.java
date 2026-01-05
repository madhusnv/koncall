package sq;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import xq.AbstractC8436j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33102a;

    /* renamed from: b */
    public final /* synthetic */ List f33103b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f33104c;

    /* renamed from: d */
    public final /* synthetic */ int f33105d;

    public /* synthetic */ o0(List list, InterfaceC2139c interfaceC2139c, int i10, int i11) {
        this.f33102a = i11;
        this.f33103b = list;
        this.f33104c = interfaceC2139c;
        this.f33105d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f33102a) {
            case 0:
                num.intValue();
                g2.m13172x(this.f33103b, this.f33104c, interfaceC3962k, C3953b.m8496A(this.f33105d | 1));
                break;
            default:
                num.getClass();
                AbstractC8436j.m15740i(this.f33103b, this.f33104c, interfaceC3962k, C3953b.m8496A(this.f33105d | 1));
                break;
        }
        return qw.a0.f30746a;
    }
}
