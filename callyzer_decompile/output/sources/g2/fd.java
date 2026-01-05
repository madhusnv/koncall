package g2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class fd extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11603a;

    /* renamed from: b */
    public final /* synthetic */ rd f11604b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f11605c;

    /* renamed from: d */
    public final /* synthetic */ vc f11606d;

    /* renamed from: e */
    public final /* synthetic */ int f11607e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(rd rdVar, InterfaceC7879r interfaceC7879r, vc vcVar, int i10, int i11) {
        super(2);
        this.f11603a = 1;
        this.f11604b = rdVar;
        this.f11605c = interfaceC7879r;
        this.f11606d = vcVar;
        this.f11607e = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11603a) {
            case 0:
                ((Number) obj2).intValue();
                int iM8496A = C3953b.m8496A(this.f11607e | 1);
                pd.m6268d(this.f11605c, this.f11604b, this.f11606d, (InterfaceC3962k) obj, iM8496A);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM8496A2 = C3953b.m8496A(1);
                pd.m6271g(this.f11604b, this.f11605c, this.f11606d, this.f11607e, (InterfaceC3962k) obj, iM8496A2);
                break;
            default:
                ((Number) obj2).intValue();
                int iM8496A3 = C3953b.m8496A(this.f11607e | 1);
                pd.m6274j(this.f11605c, this.f11604b, this.f11606d, (InterfaceC3962k) obj, iM8496A3);
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(InterfaceC7879r interfaceC7879r, rd rdVar, vc vcVar, int i10, int i11) {
        super(2);
        this.f11603a = i11;
        this.f11605c = interfaceC7879r;
        this.f11604b = rdVar;
        this.f11606d = vcVar;
        this.f11607e = i10;
    }
}
