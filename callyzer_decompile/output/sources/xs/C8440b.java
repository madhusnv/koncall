package xs;

import ex.InterfaceC2141e;
import java.util.List;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ws.C8181v;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xs.b */
/* loaded from: classes3.dex */
public final class C8440b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41169a;

    /* renamed from: b */
    public final /* synthetic */ C8449k f41170b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8440b(C8449k c8449k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41169a = i10;
        this.f41170b = c8449k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41169a) {
            case 0:
                return new C8440b(this.f41170b, interfaceC7559c, 0);
            default:
                return new C8440b(this.f41170b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41169a) {
            case 0:
                C8440b c8440b = (C8440b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c8440b.invokeSuspend(a0Var);
                return a0Var;
            default:
                return ((C8440b) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f41169a;
        C8449k c8449k = this.f41170b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c8449k.f41222l.m12019a(763);
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return new Integer(((C8181v) c8449k.f41224n.f39340a.getValue()).f39129o + 1);
        }
    }
}
