package rc;

import bd.C0645a;
import cd.C0951f;
import cd.C0959n;
import er.C2123w;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.C4166x;
import nd.EnumC5011b;
import og.od;
import og.u1;
import qd.InterfaceC6187g;
import qw.C6364n;
import qw.a0;
import sc.C6802v;
import tx.InterfaceC7266z;
import ud.InterfaceC7400d;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import wc.InterfaceC7971e;
import ww.AbstractC8199i;
import yb.AbstractC8610b;
import yb.EnumC8611c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rc.a */
/* loaded from: classes.dex */
public final class C6490a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f31168a = 1;

    /* renamed from: b */
    public int f31169b;

    /* renamed from: c */
    public /* synthetic */ Object f31170c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6187g f31171d;

    /* renamed from: e */
    public final /* synthetic */ C6493d f31172e;

    /* renamed from: f */
    public final /* synthetic */ C6802v f31173f;

    /* renamed from: g */
    public final /* synthetic */ C4166x f31174g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC7971e f31175h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6490a(InterfaceC6187g interfaceC6187g, InterfaceC7559c interfaceC7559c, C6493d c6493d, C6802v c6802v, C4166x c4166x, InterfaceC7971e interfaceC7971e) {
        super(2, interfaceC7559c);
        this.f31171d = interfaceC6187g;
        this.f31172e = c6493d;
        this.f31173f = c6802v;
        this.f31174g = c4166x;
        this.f31175h = interfaceC7971e;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f31168a) {
            case 0:
                C6490a c6490a = new C6490a(this.f31171d, interfaceC7559c, this.f31172e, this.f31173f, this.f31175h, this.f31174g);
                c6490a.f31170c = obj;
                return c6490a;
            default:
                C6490a c6490a2 = new C6490a(this.f31171d, interfaceC7559c, this.f31172e, this.f31173f, this.f31174g, this.f31175h);
                c6490a2.f31170c = obj;
                return c6490a2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f31168a) {
        }
        return ((C6490a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM12498b;
        Object obj2;
        switch (this.f31168a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f31169b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    int i11 = this.f31174g.f21162a;
                    this.f31170c = null;
                    this.f31169b = 1;
                    objM12498b = C6493d.m12498b(this.f31172e, this.f31173f, this.f31175h, i11, this);
                    if (objM12498b == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM12498b = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM12498b);
            default:
                C6802v c6802v = this.f31173f;
                C0645a c0645a = c6802v.f32331a;
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f31170c;
                Object obj3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f31169b;
                C4166x c4166x = this.f31174g;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C6493d c6493d = this.f31172e;
                    C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(c6493d.f31189a.getClass());
                    if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(C0959n.class))) {
                        AbstractC8610b.m15956b(c0645a, EnumC8611c.RETRY_MODE_STANDARD);
                    } else if (c4147eM8901a.equals(kotlin.jvm.internal.a0.m8901a(C0951f.class))) {
                        AbstractC8610b.m15956b(c0645a, EnumC8611c.RETRY_MODE_ADAPTIVE);
                    }
                    if (c4166x.f21162a > 1) {
                        InterfaceC7564h interfaceC7564hMo1865w = interfaceC7266z.mo1865w();
                        C2123w c2123w = new C2123w(7, c4166x);
                        EnumC5011b enumC5011b = EnumC5011b.Debug;
                        String strM8913b = kotlin.jvm.internal.a0.m8901a(C6493d.class).m8913b();
                        if (strM8913b == null) {
                            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                        }
                        u1.m10948g(interfaceC7564hMo1865w, enumC5011b, strM8913b, null, c2123w);
                    }
                    C6802v c6802v2 = new C6802v(c0645a, ((InterfaceC7400d) c6802v.f32332b).mo296m());
                    int i13 = c4166x.f21162a;
                    this.f31170c = null;
                    this.f31169b = 1;
                    Object objM12498b2 = C6493d.m12498b(c6493d, c6802v2, this.f31175h, i13, this);
                    obj2 = objM12498b2;
                    if (objM12498b2 != obj3) {
                    }
                    return obj3;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                obj2 = ((C6364n) obj).f30758a;
                obj3 = obj2;
                c4166x.f21162a++;
                od.m10798c(obj3);
                return obj3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6490a(InterfaceC6187g interfaceC6187g, InterfaceC7559c interfaceC7559c, C6493d c6493d, C6802v c6802v, InterfaceC7971e interfaceC7971e, C4166x c4166x) {
        super(2, interfaceC7559c);
        this.f31171d = interfaceC6187g;
        this.f31172e = c6493d;
        this.f31173f = c6802v;
        this.f31175h = interfaceC7971e;
        this.f31174g = c4166x;
    }
}
