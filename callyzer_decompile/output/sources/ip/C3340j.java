package ip;

import ex.InterfaceC2141e;
import og.od;
import qw.C6364n;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ip.j */
/* loaded from: classes3.dex */
public final class C3340j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f17685a;

    /* renamed from: b */
    public int f17686b;

    /* renamed from: c */
    public /* synthetic */ int f17687c;

    /* renamed from: d */
    public final /* synthetic */ C3342l f17688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3340j(C3342l c3342l, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f17685a = i10;
        this.f17688d = c3342l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f17685a) {
            case 0:
                C3340j c3340j = new C3340j(this.f17688d, interfaceC7559c, 0);
                c3340j.f17687c = ((Number) obj).intValue();
                return c3340j;
            default:
                C3340j c3340j2 = new C3340j(this.f17688d, interfaceC7559c, 1);
                c3340j2.f17687c = ((Number) obj).intValue();
                return c3340j2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f17685a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C3340j) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM7666j;
        Object objM7665i;
        switch (this.f17685a) {
            case 0:
                int i10 = this.f17687c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f17686b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f17687c = i10;
                    this.f17686b = 1;
                    objM7666j = C3342l.m7666j(this.f17688d, i10, this);
                    if (objM7666j == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM7666j = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM7666j);
            default:
                int i12 = this.f17687c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f17686b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f17687c = i12;
                    this.f17686b = 1;
                    objM7665i = C3342l.m7665i(this.f17688d, i12, this);
                    if (objM7665i == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM7665i = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM7665i);
        }
    }
}
