package g2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class hd extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11754a;

    /* renamed from: b */
    public final /* synthetic */ C2460n f11755b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f11756c;

    /* renamed from: d */
    public final /* synthetic */ vc f11757d;

    /* renamed from: e */
    public final /* synthetic */ boolean f11758e;

    /* renamed from: f */
    public final /* synthetic */ int f11759f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd(C2460n c2460n, InterfaceC7879r interfaceC7879r, vc vcVar, boolean z6, int i10, int i11) {
        super(2);
        this.f11754a = i11;
        this.f11755b = c2460n;
        this.f11756c = interfaceC7879r;
        this.f11757d = vcVar;
        this.f11758e = z6;
        this.f11759f = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11754a) {
            case 0:
                ((Number) obj2).intValue();
                pd.m6269e(this.f11755b, this.f11756c, this.f11757d, this.f11758e, (InterfaceC3962k) obj, C3953b.m8496A(this.f11759f | 1));
                break;
            default:
                ((Number) obj2).intValue();
                pd.m6275k(this.f11755b, this.f11756c, this.f11757d, this.f11758e, (InterfaceC3962k) obj, C3953b.m8496A(this.f11759f | 1));
                break;
        }
        return qw.a0.f30746a;
    }
}
