package yn;

import cj.C0979e;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yn.e */
/* loaded from: classes3.dex */
public final class C8707e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42085a;

    /* renamed from: b */
    public int f42086b;

    /* renamed from: c */
    public final /* synthetic */ C8716n f42087c;

    /* renamed from: d */
    public final /* synthetic */ String f42088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8707e(C8716n c8716n, String str, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42085a = i10;
        this.f42087c = c8716n;
        this.f42088d = str;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42085a) {
            case 0:
                return new C8707e(this.f42087c, this.f42088d, interfaceC7559c, 0);
            default:
                return new C8707e(this.f42087c, this.f42088d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f42085a) {
        }
        return ((C8707e) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f42085a) {
            case 0:
                C0979e c0979e = this.f42087c.f42154l;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f42086b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f42086b = 1;
                    if (c0979e.m2774h(this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                String str = this.f42088d;
                if (str != null) {
                    this.f42086b = 2;
                    if (c0979e.m2780n(str, this) == enumC7794a) {
                        return enumC7794a;
                    }
                }
                return a0.f30746a;
            default:
                C0979e c0979e2 = this.f42087c.f42154l;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f42086b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f42086b = 1;
                    if (c0979e2.m2774h(this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                String str2 = this.f42088d;
                if (str2 != null) {
                    this.f42086b = 2;
                    if (c0979e2.m2780n(str2, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                }
                return a0.f30746a;
        }
    }
}
