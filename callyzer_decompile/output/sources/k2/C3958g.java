package k2;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k2.g */
/* loaded from: classes.dex */
public final class C3958g extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: b */
    public static final C3958g f20387b;

    /* renamed from: c */
    public static final C3958g f20388c;

    /* renamed from: a */
    public final /* synthetic */ int f20389a;

    static {
        int i10 = 2;
        f20387b = new C3958g(i10, 0);
        f20388c = new C3958g(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3958g(int i10, int i11) {
        super(i10);
        this.f20389a = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20389a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Number) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (!c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3966o.m8601S();
                }
                break;
            case 1:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (!c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c3966o2.m8601S();
                }
                break;
            default:
                ((v3.g0) obj).f36831I = true;
                break;
        }
        return qw.a0.f30746a;
    }
}
