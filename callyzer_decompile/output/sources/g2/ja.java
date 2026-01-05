package g2;

import a2.C0036i;
import a3.C0045d;
import androidx.compose.material3.internal.AbstractC0257a;
import c9.C0908c;
import c9.C0925t;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import h2.C2803h;
import h2.C2805j;
import h2.C2819x;
import k2.C3953b;
import rw.C6669s;
import s4.InterfaceC6747c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ja {

    /* renamed from: a */
    public final boolean f11871a;

    /* renamed from: b */
    public final C0925t f11872b;

    public ja(boolean z6, InterfaceC6747c interfaceC6747c, ka kaVar, InterfaceC2139c interfaceC2139c) {
        this.f11871a = z6;
        if (z6 && kaVar == ka.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        h1.w1 w1Var = ha.f11742b;
        C0045d c0045d = new C0045d(12, interfaceC6747c);
        C0036i c0036i = new C0036i(9, interfaceC6747c);
        C0925t c0925t = new C0925t();
        c0925t.f5651a = c0045d;
        c0925t.f5652b = c0036i;
        c0925t.f5653c = w1Var;
        c0925t.f5654d = interfaceC2139c;
        c0925t.f5655e = new C2819x();
        c0925t.f5656f = new C0908c(c0925t);
        c0925t.f5657g = C3953b.m8517t(kaVar);
        c0925t.f5658h = C3953b.m8512o(new C2803h(c0925t, 4));
        c0925t.f5659i = C3953b.m8512o(new C2803h(c0925t, 2));
        c0925t.f5660j = new k2.a1(Float.NaN);
        C3953b.m8513p(new C2803h(c0925t, 3), k2.s0.f20547f);
        c0925t.f5661k = new k2.a1(DefinitionKt.NO_Float_VALUE);
        c0925t.f5662l = C3953b.m8517t(null);
        c0925t.f5663m = C3953b.m8517t(new h2.d0(C6669s.f31944a));
        c0925t.f5664n = new C2805j(c0925t);
        this.f11872b = c0925t;
    }

    /* renamed from: a */
    public static Object m6179a(ja jaVar, ka kaVar, AbstractC8199i abstractC8199i) throws Throwable {
        Object objM705b = AbstractC0257a.m705b(jaVar.f11872b, kaVar, ((k2.a1) jaVar.f11872b.f5661k).m8490f(), abstractC8199i);
        return objM705b == EnumC7794a.COROUTINE_SUSPENDED ? objM705b : qw.a0.f30746a;
    }

    /* renamed from: b */
    public final Object m6180b(AbstractC8199i abstractC8199i) throws Throwable {
        Object objM6179a = m6179a(this, ka.Hidden, abstractC8199i);
        return objM6179a == EnumC7794a.COROUTINE_SUSPENDED ? objM6179a : qw.a0.f30746a;
    }

    /* renamed from: c */
    public final boolean m6181c() {
        return ((k2.e1) this.f11872b.f5657g).getValue() != ka.Hidden;
    }

    /* renamed from: d */
    public final Object m6182d(AbstractC8199i abstractC8199i) throws Throwable {
        if (this.f11871a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objM6179a = m6179a(this, ka.PartiallyExpanded, abstractC8199i);
        return objM6179a == EnumC7794a.COROUTINE_SUSPENDED ? objM6179a : qw.a0.f30746a;
    }
}
