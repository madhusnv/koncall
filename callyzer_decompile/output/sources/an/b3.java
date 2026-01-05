package an;

import ad.C0101h;
import androidx.compose.material3.internal.AbstractC0257a;
import aq.C0406i;
import c9.C0925t;
import ec.InterfaceC2004b;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import f8.C2210e;
import h2.C2803h;
import ia.C3217i;
import ia.C3220l;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kn.C4121a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import l7.C4417q;
import mm.C4792c;
import mm.C4803n;
import nd.EnumC5011b;
import o6.C5321w;
import od.C5338b;
import og.ff;
import og.od;
import og.pe;
import qw.C6361k;
import rw.AbstractC6662l;
import sb.C6774a;
import sb.C6778e;
import sb.C6780g;
import sb.InterfaceC6777d;
import sc.C6802v;
import td.C7124a;
import td.C7126c;
import ud.C7404h;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import xx.AbstractC8496b;
import z7.AbstractC8894w;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b3 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f653a;

    /* renamed from: b */
    public int f654b;

    /* renamed from: c */
    public Object f655c;

    /* renamed from: d */
    public final /* synthetic */ Object f656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(1, interfaceC7559c);
        this.f653a = i10;
        this.f655c = obj;
        this.f656d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [ex.c, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f653a) {
            case 0:
                return new b3((h3) this.f655c, (C4121a) this.f656d, interfaceC7559c, 0);
            case 1:
                return new b3((g5) this.f655c, (List) this.f656d, interfaceC7559c, 1);
            case 2:
                return new b3((g5) this.f655c, (C4803n) this.f656d, interfaceC7559c, 2);
            case 3:
                return new b3((i5) this.f655c, (ArrayList) this.f656d, interfaceC7559c, 3);
            case 4:
                return new b3((AbstractC8894w) this.f655c, (AbstractC8199i) this.f656d, interfaceC7559c);
            case 5:
                return new b3((C0925t) this.f655c, (InterfaceC2142f) this.f656d, interfaceC7559c, 5);
            case 6:
                return new b3((i9.l0) this.f655c, (InterfaceC2004b) this.f656d, interfaceC7559c, 6);
            case 7:
                return new b3((C3220l) this.f655c, (C6802v) this.f656d, interfaceC7559c, 7);
            case 8:
                return new b3((C5321w) this.f656d, interfaceC7559c);
            case 9:
                return new b3((C6774a) this.f655c, (InterfaceC2004b) this.f656d, interfaceC7559c, 9);
            default:
                return new b3((InterfaceC8210k) this.f655c, (C4168z) this.f656d, interfaceC7559c, 10);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f653a) {
        }
        return ((b3) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [ex.c, ww.i] */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7560a;
        Object objMo10444e;
        o6.b1 u0Var;
        Object objM10461f;
        Object objM12973h;
        int i10 = this.f653a;
        qw.a0 a0Var = qw.a0.f30746a;
        int i11 = 0;
        InterfaceC7559c interfaceC7559c = null;
        Object obj2 = this.f656d;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f654b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                h3 h3Var = (h3) this.f655c;
                this.f654b = 1;
                h3Var.getClass();
                Object objM477z = h3.m477z(h3Var, (C4121a) obj2, this);
                return objM477z == enumC7794a ? enumC7794a : objM477z;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f654b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                g5 g5Var = (g5) this.f655c;
                this.f654b = 1;
                g5Var.getClass();
                return g5.m448d(g5Var, (List) obj2, this) == enumC7794a2 ? enumC7794a2 : a0Var;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f654b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                g5 g5Var2 = (g5) this.f655c;
                C4803n c4803n = (C4803n) obj2;
                this.f654b = 1;
                g5Var2.getClass();
                C4792c c4792c = c4803n.f23913b;
                String str = c4792c.f23846c;
                int i15 = c4792c.f23847d;
                String str2 = c4792c.f23844a;
                EnumC8994d enumC8994d = c4792c.f23848e;
                Integer num = enumC8994d != null ? new Integer(enumC8994d.getTypeValue()) : null;
                Long l9 = c4792c.f23851h;
                String str3 = c4792c.f23850g;
                LocalDateTime localDateTime = c4792c.f23849f;
                long j6 = c4792c.f23852j;
                String str4 = c4803n.f23917f;
                String str5 = c4803n.f23918g;
                AbstractC4154l.m8920c(str5);
                Object objM10839n = pe.m10839n(this, g5Var2.f862a, false, true, new c5(str, i15, str2, num, localDateTime, l9, str3, j6, str4, str5));
                return objM10839n == enumC7794a3 ? enumC7794a3 : objM10839n;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f654b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                i5 i5Var = (i5) this.f655c;
                this.f654b = 1;
                i5Var.getClass();
                AbstractC8894w abstractC8894w = i5Var.f945a;
                pe.m10837l(abstractC8894w, false, true, new C0101h(27));
                Object objM10839n2 = pe.m10839n(this, abstractC8894w, false, true, new o1(9, i5Var, (ArrayList) obj2));
                if (objM10839n2 != enumC7794a4) {
                    objM10839n2 = a0Var;
                }
                if (objM10839n2 != enumC7794a4) {
                    objM10839n2 = a0Var;
                }
                return objM10839n2 == enumC7794a4 ? enumC7794a4 : a0Var;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f654b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                AbstractC8894w abstractC8894w2 = (AbstractC8894w) this.f655c;
                C2210e c2210e = new C2210e(abstractC8894w2, null, (AbstractC8199i) obj2, 0);
                this.f654b = 1;
                Object objM16400w = abstractC8894w2.m16400w(false, c2210e, this);
                return objM16400w == enumC7794a5 ? enumC7794a5 : objM16400w;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i18 = this.f654b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                C0925t c0925t = (C0925t) this.f655c;
                C2803h c2803h = new C2803h(c0925t, i11);
                C0406i c0406i = new C0406i((InterfaceC2142f) obj2, c0925t, interfaceC7559c, 28);
                this.f654b = 1;
                return AbstractC0257a.m704a(c2803h, c0406i, this) == enumC7794a6 ? enumC7794a6 : a0Var;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i19 = this.f654b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                i9.l0 l0Var = (i9.l0) this.f655c;
                this.f654b = 1;
                Object objM7546a = i9.l0.m7546a(l0Var, this);
                return objM7546a == enumC7794a7 ? enumC7794a7 : objM7546a;
            case 7:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i20 = this.f654b;
                if (i20 == 0) {
                    od.m10798c(obj);
                    C3220l c3220l = (C3220l) this.f655c;
                    this.f654b = 1;
                    objM7560a = C3220l.m7560a(c3220l, (C7124a) c3220l.f17357d, (C6802v) obj2, this);
                    if (objM7560a == enumC7794a8) {
                        return enumC7794a8;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM7560a = obj;
                }
                C3217i c3217i = (C3217i) objM7560a;
                return new C7404h(c3217i, c3217i.f17341b);
            case 8:
                C5321w c5321w = (C5321w) obj2;
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                int i21 = this.f654b;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    o6.j0 j0VarM10462g = c5321w.m10462g();
                    this.f655c = th;
                    this.f654b = 2;
                    objMo10444e = j0VarM10462g.mo10444e(this);
                    if (objMo10444e == enumC7794a9) {
                        return enumC7794a9;
                    }
                }
                if (i21 == 0) {
                    od.m10798c(obj);
                    this.f654b = 1;
                    objM10461f = C5321w.m10461f(c5321w, true, this);
                    if (objM10461f == enumC7794a9) {
                        return enumC7794a9;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) this.f655c;
                        od.m10798c(obj);
                        objMo10444e = obj;
                        u0Var = new o6.u0(th, ((Number) objMo10444e).intValue());
                        return new C6361k(u0Var, Boolean.TRUE);
                    }
                    od.m10798c(obj);
                    objM10461f = obj;
                }
                u0Var = (o6.b1) objM10461f;
                return new C6361k(u0Var, Boolean.TRUE);
            case 9:
                C6774a c6774a = (C6774a) this.f655c;
                EnumC7794a enumC7794a10 = EnumC7794a.COROUTINE_SUSPENDED;
                int i22 = this.f654b;
                if (i22 == 0) {
                    od.m10798c(obj);
                    InterfaceC7564h context = getContext();
                    C5338b c5338b = new C5338b(16);
                    EnumC5011b enumC5011b = EnumC5011b.Trace;
                    String strM8913b = kotlin.jvm.internal.a0.m8901a(C6774a.class).m8913b();
                    if (strM8913b == null) {
                        throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                    }
                    og.u1.m10948g(context, enumC5011b, strM8913b, null, c5338b);
                    C6780g c6780g = c6774a.f32234a;
                    this.f654b = 1;
                    c6780g.getClass();
                    objM12973h = C6780g.m12973h(c6780g, (InterfaceC2004b) obj2, this);
                    if (objM12973h == enumC7794a10) {
                        return enumC7794a10;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM12973h = obj;
                }
                InterfaceC6777d interfaceC6777d = (InterfaceC6777d) objM12973h;
                C6778e c6778e = (C6778e) interfaceC6777d;
                C7126c c7126c = c6778e.f32242d;
                c6774a.f32236c.getClass();
                DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
                Iterator it = AbstractC6662l.m12729s(new C7126c[]{c7126c, C7124a.m13407e().m13410c(c6774a.f32235b)}).iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Comparable comparable = (Comparable) it.next();
                while (it.hasNext()) {
                    Comparable comparable2 = (Comparable) it.next();
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
                C7126c c7126c2 = (C7126c) comparable;
                C7126c c7126c3 = c6778e.f32242d;
                if (c7126c3 == null) {
                    c7126c3 = c7126c2;
                }
                return new C7404h(ff.m10653a(interfaceC6777d, c7126c3, null, 55), c7126c2);
            default:
                C4168z c4168z = (C4168z) obj2;
                EnumC7794a enumC7794a11 = EnumC7794a.COROUTINE_SUSPENDED;
                int i23 = this.f654b;
                if (i23 == 0) {
                    od.m10798c(obj);
                    InterfaceC8210k interfaceC8210k = (InterfaceC8210k) this.f655c;
                    C4417q c4417q = AbstractC8496b.f41395b;
                    Object obj3 = c4168z.f21164a;
                    if (obj3 == c4417q) {
                        obj3 = null;
                    }
                    this.f654b = 1;
                    if (interfaceC8210k.emit(obj3, this) == enumC7794a11) {
                        return enumC7794a11;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                c4168z.f21164a = null;
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(C5321w c5321w, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f653a = 8;
        this.f656d = c5321w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b3(AbstractC8894w abstractC8894w, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f653a = 4;
        this.f655c = abstractC8894w;
        this.f656d = (AbstractC8199i) interfaceC2139c;
    }
}
