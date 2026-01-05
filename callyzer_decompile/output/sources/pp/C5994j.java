package pp;

import ex.InterfaceC2141e;
import og.od;
import qw.C6364n;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pp.j */
/* loaded from: classes3.dex */
public final class C5994j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29291a;

    /* renamed from: b */
    public int f29292b;

    /* renamed from: c */
    public /* synthetic */ int f29293c;

    /* renamed from: d */
    public final /* synthetic */ C5995k f29294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5994j(C5995k c5995k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f29291a = i10;
        this.f29294d = c5995k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f29291a) {
            case 0:
                C5994j c5994j = new C5994j(this.f29294d, interfaceC7559c, 0);
                c5994j.f29293c = ((Number) obj).intValue();
                return c5994j;
            default:
                C5994j c5994j2 = new C5994j(this.f29294d, interfaceC7559c, 1);
                c5994j2.f29293c = ((Number) obj).intValue();
                return c5994j2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f29291a;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C5994j) create(Integer.valueOf(iIntValue), interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM12027i;
        Object objM12026h;
        switch (this.f29291a) {
            case 0:
                int i10 = this.f29293c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f29292b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f29293c = i10;
                    this.f29292b = 1;
                    objM12027i = C5995k.m12027i(this.f29294d, i10, this);
                    if (objM12027i == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM12027i = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM12027i);
            default:
                int i12 = this.f29293c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f29292b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f29293c = i12;
                    this.f29292b = 1;
                    objM12026h = C5995k.m12026h(this.f29294d, i12, this);
                    if (objM12026h == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM12026h = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM12026h);
        }
    }
}
