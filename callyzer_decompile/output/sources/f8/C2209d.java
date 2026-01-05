package f8;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.a0;
import rw.AbstractC6674x;
import s6.C6763b;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f8.d */
/* loaded from: classes.dex */
public final class C2209d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10152a;

    /* renamed from: b */
    public int f10153b;

    /* renamed from: c */
    public /* synthetic */ Object f10154c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC8199i f10155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2209d(InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f10152a = i10;
        switch (i10) {
            case 3:
                this.f10155d = (AbstractC8199i) interfaceC2141e;
                super(2, interfaceC7559c);
                break;
            default:
                this.f10155d = (AbstractC8199i) interfaceC2141e;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ex.c, ww.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ex.c, ww.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ex.e, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10152a) {
            case 0:
                C2209d c2209d = new C2209d(interfaceC7559c, (InterfaceC2139c) this.f10155d, 0);
                c2209d.f10154c = obj;
                return c2209d;
            case 1:
                C2209d c2209d2 = new C2209d(interfaceC7559c, (InterfaceC2139c) this.f10155d, 1);
                c2209d2.f10154c = obj;
                return c2209d2;
            case 2:
                C2209d c2209d3 = new C2209d((InterfaceC2141e) this.f10155d, interfaceC7559c, 2);
                c2209d3.f10154c = obj;
                return c2209d3;
            default:
                C2209d c2209d4 = new C2209d((InterfaceC2141e) this.f10155d, interfaceC7559c, 3);
                c2209d4.f10154c = obj;
                return c2209d4;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10152a) {
        }
        return ((C2209d) create((C6763b) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r5v26, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ex.c, ww.i] */
    /* JADX WARN: Type inference failed for: r5v9, types: [ex.c, ww.i] */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10152a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f10153b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f10153b = 1;
                Object objInvoke = this.f10155d.invoke(this);
                return objInvoke == enumC7794a ? enumC7794a : objInvoke;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f10153b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f10153b = 1;
                Object objInvoke2 = this.f10155d.invoke(this);
                return objInvoke2 == enumC7794a2 ? enumC7794a2 : objInvoke2;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f10153b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C6763b c6763b = (C6763b) this.f10154c;
                    this.f10153b = 1;
                    obj = this.f10155d.invoke(c6763b, this);
                    if (obj == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                C6763b c6763b2 = (C6763b) obj;
                AbstractC4154l.m8921d(c6763b2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) c6763b2.f32219b.f21788b).set(true);
                return c6763b2;
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f10153b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6763b c6763b3 = (C6763b) this.f10154c;
                    od.m10798c(obj);
                    return c6763b3;
                }
                od.m10798c(obj);
                C6763b c6763b4 = new C6763b(AbstractC6674x.m12786n(((C6763b) this.f10154c).m12964a()), false);
                this.f10154c = c6763b4;
                this.f10153b = 1;
                return this.f10155d.invoke(c6763b4, this) == enumC7794a4 ? enumC7794a4 : c6763b4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2209d(InterfaceC7559c interfaceC7559c, InterfaceC2139c interfaceC2139c, int i10) {
        super(2, interfaceC7559c);
        this.f10152a = i10;
        switch (i10) {
            case 1:
                this.f10155d = (AbstractC8199i) interfaceC2139c;
                super(2, interfaceC7559c);
                break;
            default:
                this.f10155d = (AbstractC8199i) interfaceC2139c;
                break;
        }
    }
}
