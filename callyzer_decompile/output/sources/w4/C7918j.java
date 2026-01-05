package w4;

import ex.InterfaceC2141e;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.j */
/* loaded from: classes.dex */
public final class C7918j extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: b */
    public static final C7918j f38099b;

    /* renamed from: c */
    public static final C7918j f38100c;

    /* renamed from: a */
    public final /* synthetic */ int f38101a;

    static {
        int i10 = 2;
        f38099b = new C7918j(i10, 0);
        f38100c = new C7918j(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7918j(int i10, int i11) {
        super(i10);
        this.f38101a = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38101a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Number) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (!c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3966o.m8601S();
                }
                break;
            default:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (!c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c3966o2.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
