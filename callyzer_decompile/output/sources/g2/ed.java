package g2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import o1.AbstractC5256o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ed extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11530a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f11531b;

    /* renamed from: c */
    public final /* synthetic */ int f11532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed(int i10, int i11, InterfaceC7879r interfaceC7879r) {
        super(2);
        this.f11530a = i11;
        this.f11531b = interfaceC7879r;
        this.f11532c = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f11530a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                pd.m6278n(this.f11531b, interfaceC3962k, C3953b.m8496A(this.f11532c | 1));
                break;
            default:
                AbstractC5256o.m10358a(this.f11531b, interfaceC3962k, C3953b.m8496A(this.f11532c | 1));
                break;
        }
        return qw.a0.f30746a;
    }
}
