package i1;

import a3.C0043b;
import ab.C0084b;
import b3.C0572d;
import c3.C0848c;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f00.InterfaceC2173b;
import hy.InterfaceC3055f;
import java.util.List;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import ly.C4584h;
import m1.C4622d;
import m1.C4623e;
import m1.InterfaceC4630l;
import nd.EnumC5011b;
import od.C5340d;
import uw.InterfaceC7559c;
import v3.AbstractC7634f;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 extends AbstractC4152j implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16848a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f16848a = i12;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        boolean zIsFocused;
        g0 g0VarP0;
        switch (this.f16848a) {
            case 0:
                b3.a0 a0Var = (b3.a0) obj;
                b3.a0 a0Var2 = (b3.a0) obj2;
                f0 f0Var = (f0) this.receiver;
                if (f0Var.f37683p && (zIsFocused = a0Var2.isFocused()) != a0Var.isFocused()) {
                    InterfaceC2139c interfaceC2139c = f0Var.f16857t;
                    if (interfaceC2139c != null) {
                        interfaceC2139c.invoke(Boolean.valueOf(zIsFocused));
                    }
                    InterfaceC7559c interfaceC7559c = null;
                    if (zIsFocused) {
                        tx.c0.m13502y(f0Var.z0(), null, null, new C0084b(f0Var, interfaceC7559c, 24), 3);
                        C4168z c4168z = new C4168z();
                        AbstractC7634f.m14559t(f0Var, new C0043b(12, c4168z, f0Var));
                        s1.d0 d0Var = (s1.d0) c4168z.f21164a;
                        if (d0Var != null) {
                            d0Var.m12845a();
                        } else {
                            d0Var = null;
                        }
                        f0Var.f16859w = d0Var;
                        v3.h1 h1Var = f0Var.f16860x;
                        if (h1Var != null && h1Var.T0().f37683p && (g0VarP0 = f0Var.P0()) != null) {
                            g0VarP0.L0(f0Var.f16860x);
                        }
                    } else {
                        s1.d0 d0Var2 = f0Var.f16859w;
                        if (d0Var2 != null) {
                            d0Var2.m12846b();
                        }
                        f0Var.f16859w = null;
                        g0 g0VarP02 = f0Var.P0();
                        if (g0VarP02 != null) {
                            g0VarP02.L0(null);
                        }
                    }
                    AbstractC7634f.m14554o(f0Var);
                    InterfaceC4630l interfaceC4630l = f0Var.f16856s;
                    if (interfaceC4630l != null) {
                        if (zIsFocused) {
                            C4622d c4622d = f0Var.f16858v;
                            if (c4622d != null) {
                                f0Var.O0(interfaceC4630l, new C4623e(c4622d));
                                f0Var.f16858v = null;
                            }
                            C4622d c4622d2 = new C4622d();
                            f0Var.O0(interfaceC4630l, c4622d2);
                            f0Var.f16858v = c4622d2;
                        } else {
                            C4622d c4622d3 = f0Var.f16858v;
                            if (c4622d3 != null) {
                                f0Var.O0(interfaceC4630l, new C4623e(c4622d3));
                                f0Var.f16858v = null;
                            }
                        }
                    }
                }
                return qw.a0.f30746a;
            case 1:
                InterfaceC3055f p02 = (InterfaceC3055f) obj;
                int iIntValue = ((Number) obj2).intValue();
                AbstractC4154l.m8923f(p02, "p0");
                C4584h c4584h = (C4584h) this.receiver;
                c4584h.getClass();
                boolean z6 = !p02.mo7285j(iIntValue) && p02.mo7284i(iIntValue).mo7278c();
                c4584h.f22715b = z6;
                return Boolean.valueOf(z6);
            case 2:
                ((InterfaceC2139c) this.receiver).invoke((List) obj);
                return qw.a0.f30746a;
            case 3:
                Throwable th2 = (Throwable) obj;
                InterfaceC2137a p12 = (InterfaceC2137a) obj2;
                AbstractC4154l.m8923f(p12, "p1");
                C5340d c5340d = (C5340d) this.receiver;
                InterfaceC2173b interfaceC2173b = (InterfaceC2173b) c5340d.f482a;
                if (c5340d.mo331h(EnumC5011b.Error)) {
                    if (th2 != null) {
                        interfaceC2173b.error((String) p12.invoke(), th2);
                    } else {
                        interfaceC2173b.error((String) p12.invoke());
                    }
                }
                return qw.a0.f30746a;
            case 4:
                InterfaceC2137a p13 = (InterfaceC2137a) obj2;
                AbstractC4154l.m8923f(p13, "p1");
                ((C5340d) this.receiver).mo329f((Throwable) obj, p13);
                return qw.a0.f30746a;
            case 5:
                Throwable th3 = (Throwable) obj;
                InterfaceC2137a msg = (InterfaceC2137a) obj2;
                AbstractC4154l.m8923f(msg, "p1");
                C5340d c5340d2 = (C5340d) this.receiver;
                InterfaceC2173b interfaceC2173b2 = (InterfaceC2173b) c5340d2.f482a;
                AbstractC4154l.m8923f(msg, "msg");
                if (c5340d2.mo331h(EnumC5011b.Info)) {
                    if (th3 != null) {
                        interfaceC2173b2.mo5840p((String) msg.invoke(), th3);
                    } else {
                        interfaceC2173b2.info((String) msg.invoke());
                    }
                }
                return qw.a0.f30746a;
            case 6:
                InterfaceC2137a p14 = (InterfaceC2137a) obj2;
                AbstractC4154l.m8923f(p14, "p1");
                ((C5340d) this.receiver).mo332i((Throwable) obj, p14);
                return qw.a0.f30746a;
            case 7:
                InterfaceC2137a p15 = (InterfaceC2137a) obj2;
                AbstractC4154l.m8923f(p15, "p1");
                ((C5340d) this.receiver).mo330g((Throwable) obj, p15);
                return qw.a0.f30746a;
            default:
                return Boolean.valueOf(C7904v.m15012f((C7904v) this.receiver, (C0572d) obj, (C0848c) obj2));
        }
    }
}
