package g2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class zc extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f13407a;

    /* renamed from: b */
    public final /* synthetic */ rd f13408b;

    /* renamed from: c */
    public final /* synthetic */ vc f13409c;

    /* renamed from: d */
    public final /* synthetic */ int f13410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(rd rdVar, vc vcVar, int i10, int i11) {
        super(2);
        this.f13407a = i11;
        this.f13408b = rdVar;
        this.f13409c = vcVar;
        this.f13410d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f13407a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                pd.m6265a(this.f13408b, this.f13409c, interfaceC3962k, C3953b.m8496A(this.f13410d | 1));
                break;
            case 1:
                pd.m6267c(this.f13408b, this.f13409c, interfaceC3962k, C3953b.m8496A(this.f13410d | 1));
                break;
            default:
                pd.m6273i(this.f13408b, this.f13409c, interfaceC3962k, C3953b.m8496A(this.f13410d | 1));
                break;
        }
        return qw.a0.f30746a;
    }
}
