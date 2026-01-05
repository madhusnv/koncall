package h1;

import d3.InterfaceC1563q;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f15387a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2141e f15388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(InterfaceC2141e interfaceC2141e, int i10) {
        super(1);
        this.f15387a = i10;
        switch (i10) {
            case 1:
                this.f15388b = interfaceC2141e;
                super(1);
                break;
            default:
                x1 x1Var = y1.f15664a;
                this.f15388b = interfaceC2141e;
                break;
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f15387a;
        qw.a0 a0Var = qw.a0.f30746a;
        InterfaceC2141e interfaceC2141e = this.f15388b;
        switch (i10) {
            case 0:
                C2778i c2778i = (C2778i) obj;
                Object value = c2778i.f15457e.getValue();
                x1 x1Var = y1.f15664a;
                interfaceC2141e.invoke(value, Float.valueOf(((C2781l) c2778i.f15458f).f15504a));
                break;
            default:
                interfaceC2141e.invoke((InterfaceC1563q) obj, null);
                break;
        }
        return a0Var;
    }
}
