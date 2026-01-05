package gr;

import ex.InterfaceC2141e;
import fr.C2369a;
import java.util.List;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gr.b */
/* loaded from: classes3.dex */
public final class C2706b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15108a;

    /* renamed from: b */
    public final /* synthetic */ C2713i f15109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2706b(C2713i c2713i, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15108a = i10;
        this.f15109b = c2713i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15108a) {
            case 0:
                return new C2706b(this.f15109b, interfaceC7559c, 0);
            default:
                return new C2706b(this.f15109b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15108a) {
            case 0:
                return ((C2706b) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                C2706b c2706b = (C2706b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c2706b.invokeSuspend(a0Var);
                return a0Var;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f15108a;
        C2713i c2713i = this.f15109b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return new Integer(((C2369a) c2713i.f15136k.f39340a.getValue()).f10778h + 1);
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c2713i.f15132g.m16232g("PermissionsViewModel", "Failed to read contacts");
                return a0.f30746a;
        }
    }
}
