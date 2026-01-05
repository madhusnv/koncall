package s1;

import android.content.Context;
import b2.InterfaceC0557o;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.InterfaceC1563q;
import d4.C1583k;
import d4.InterfaceC1596x;
import d5.C1610n;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f3.InterfaceC2198d;
import g3.C2474b;
import gx.AbstractC2747a;
import java.util.Map;
import k1.d1;
import k2.a1;
import k2.d2;
import k2.e1;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.InputConnectionC4370o;
import l4.InterfaceC4362g;
import m2.C4640e;
import org.bouncycastle.iana.AEADAlgorithm;
import p005f.C2153b;
import s4.InterfaceC6747c;
import t1.AbstractC7000y;
import t2.C7006e;
import t2.InterfaceC7009h;
import t2.InterfaceC7012k;
import t3.C7027n;
import t3.InterfaceC7033t;
import t3.c1;
import u2.C7324u;
import u2.C7325v;
import u2.InterfaceC7318o;
import uf.C7427b;
import v3.AbstractC7634f;
import v3.InterfaceC7629a;
import v3.c2;
import v3.h1;
import v3.z1;
import v7.C7684b;
import vx.C7806h;
import w3.n1;
import w3.p1;
import w3.q1;
import w3.t1;
import z1.InputConnectionC8855o;
import z2.C8860e;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.t */
/* loaded from: classes.dex */
public final class C6725t extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f32133a;

    /* renamed from: b */
    public final /* synthetic */ Object f32134b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6725t(int i10, Object obj) {
        super(1);
        this.f32133a = i10;
        this.f32134b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [t3.w0, v3.a] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Object objMo2637a;
        switch (this.f32133a) {
            case 0:
                return new C2153b(6, (C6726u) this.f32134b);
            case 1:
                return new C2153b(8, (d0) this.f32134b);
            case 2:
                InterfaceC7009h interfaceC7009h = (InterfaceC7009h) this.f32134b;
                return Boolean.valueOf(interfaceC7009h != null ? interfaceC7009h.mo12856b(obj) : true);
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                AbstractC7000y abstractC7000y = ((t1.d0) this.f32134b).f33769b;
                abstractC7000y.f33916s.m8527g(abstractC7000y.m13262i(abstractC7000y.m13263j() + AbstractC2747a.m6747k(abstractC7000y.m13266n() != 0 ? fFloatValue / abstractC7000y.m13266n() : DefinitionKt.NO_Float_VALUE)));
                return qw.a0.f30746a;
            case 4:
                k2.w0 w0Var = (k2.w0) obj;
                if (!(w0Var instanceof InterfaceC7318o)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (w0Var.getValue() != null) {
                    InterfaceC7012k interfaceC7012k = (InterfaceC7012k) this.f32134b;
                    Object value = w0Var.getValue();
                    AbstractC4154l.m8920c(value);
                    objMo2637a = interfaceC7012k.mo2637a(value);
                } else {
                    objMo2637a = null;
                }
                d2 d2VarMo8489c = ((InterfaceC7318o) w0Var).mo8489c();
                AbstractC4154l.m8921d(d2VarMo8489c, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
                return new e1(objMo2637a, d2VarMo8489c);
            case 5:
                InterfaceC7009h interfaceC7009h2 = ((C7006e) this.f32134b).f33940c;
                return Boolean.valueOf(interfaceC7009h2 != null ? interfaceC7009h2.mo12856b(obj) : true);
            case 6:
                C7325v c7325v = (C7325v) this.f32134b;
                synchronized (c7325v.f34931g) {
                    C7324u c7324u = c7325v.f34933i;
                    AbstractC4154l.m8920c(c7324u);
                    Object obj2 = c7324u.f34914b;
                    AbstractC4154l.m8920c(obj2);
                    int i10 = c7324u.f34916d;
                    e1.d0 d0Var = c7324u.f34915c;
                    if (d0Var == null) {
                        d0Var = new e1.d0();
                        c7324u.f34915c = d0Var;
                        c7324u.f34918f.m5579l(obj2, d0Var);
                    }
                    c7324u.m13715c(obj, i10, obj2, d0Var);
                }
                return qw.a0.f30746a;
            case 7:
                InterfaceC7629a interfaceC7629a = (InterfaceC7629a) obj;
                v3.h0 h0Var = (v3.h0) this.f32134b;
                if (interfaceC7629a.mo14522I()) {
                    if (interfaceC7629a.mo14524c().f36879b) {
                        interfaceC7629a.mo14521H();
                    }
                    for (Map.Entry entry : interfaceC7629a.mo14524c().f36886i.entrySet()) {
                        v3.h0.m14614a(h0Var, (C7027n) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC7629a.mo14526j());
                    }
                    h1 h1Var = interfaceC7629a.mo14526j().f36904p;
                    AbstractC4154l.m8920c(h1Var);
                    while (!h1Var.equals(h0Var.f36878a.mo14526j())) {
                        for (C7027n c7027n : h0Var.m14615b(h1Var).keySet()) {
                            v3.h0.m14614a(h0Var, c7027n, h0Var.m14616c(h1Var, c7027n), h1Var);
                        }
                        h1Var = h1Var.f36904p;
                        AbstractC4154l.m8920c(h1Var);
                    }
                }
                return qw.a0.f30746a;
            case 8:
                ((v3.g0) this.f32134b).m14592Z((InterfaceC6747c) obj);
                return qw.a0.f30746a;
            case 9:
                Context it = (Context) obj;
                AbstractC4154l.m8923f(it, "it");
                return new C7684b((Context) this.f32134b, 0);
            case 10:
                return new C2153b(9, (n1) this.f32134b);
            case 11:
                qw.a0 a0Var = qw.a0.f30746a;
                if (p1.f37916b.compareAndSet(false, true)) {
                    ((C7806h) this.f32134b).mo14776i(a0Var);
                }
                return a0Var;
            case 12:
                InterfaceC2198d interfaceC2198d = (InterfaceC2198d) obj;
                q1 q1Var = (q1) this.f32134b;
                InterfaceC1563q interfaceC1563qM75t = interfaceC2198d.mo5899X().m75t();
                InterfaceC2141e interfaceC2141e = q1Var.f37925d;
                if (interfaceC2141e != null) {
                    interfaceC2141e.invoke(interfaceC1563qM75t, (C2474b) interfaceC2198d.mo5899X().f25c);
                }
                return qw.a0.f30746a;
            case 13:
                InputConnectionC4370o inputConnectionC4370o = (InputConnectionC4370o) obj;
                InputConnectionC8855o inputConnectionC8855o = inputConnectionC4370o.f21927b;
                if (inputConnectionC8855o != null) {
                    inputConnectionC4370o.m9149a(inputConnectionC8855o);
                    inputConnectionC4370o.f21927b = null;
                }
                t1 t1Var = (t1) this.f32134b;
                C4640e c4640e = t1Var.f37963d;
                Object[] objArr = c4640e.f22884a;
                int i11 = c4640e.f22886c;
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        i12 = -1;
                    } else if (!AbstractC4154l.m8918a((c2) objArr[i12], inputConnectionC4370o)) {
                        i12++;
                    }
                }
                if (i12 >= 0) {
                    c4640e.m9515m(i12);
                }
                if (c4640e.f22886c == 0) {
                    t1Var.f37961b.invoke();
                }
                return qw.a0.f30746a;
            case 14:
                ((C1583k) ((InterfaceC1596x) obj)).m5202q(b2.g0.f3747c, new b2.f0(x1.j0.Cursor, ((InterfaceC0557o) this.f32134b).mo1652a(), b2.e0.Middle, true));
                return qw.a0.f30746a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                float[] fArr = ((d3.b0) obj).f7732a;
                InterfaceC7033t interfaceC7033t = (InterfaceC7033t) this.f32134b;
                if (interfaceC7033t.mo13305s()) {
                    c1.m13279h(interfaceC7033t).mo13302d(interfaceC7033t, fArr);
                }
                return qw.a0.f30746a;
            case 16:
                float fFloatValue2 = ((Number) obj).floatValue();
                x1.p1 p1Var = (x1.p1) this.f32134b;
                a1 a1Var = p1Var.f39635a;
                float fM8490f = a1Var.m8490f() + fFloatValue2;
                a1 a1Var2 = p1Var.f39636b;
                if (fM8490f > a1Var2.m8490f()) {
                    fFloatValue2 = a1Var2.m8490f() - a1Var.m8490f();
                } else if (fM8490f < DefinitionKt.NO_Float_VALUE) {
                    fFloatValue2 = -a1Var.m8490f();
                }
                a1Var.m8491g(a1Var.m8490f() + fFloatValue2);
                return Float.valueOf(fFloatValue2);
            case 17:
                ((InterfaceFutureC8957d) this.f32134b).cancel(false);
                return qw.a0.f30746a;
            case 18:
                d3.i0 i0Var = (d3.i0) obj;
                C1610n c1610n = (C1610n) this.f32134b;
                if (!Float.isNaN(c1610n.f8026f) || !Float.isNaN(c1610n.f8027g)) {
                    i0Var.m5172v(d3.h0.m5136h(Float.isNaN(c1610n.f8026f) ? 0.5f : c1610n.f8026f, Float.isNaN(c1610n.f8027g) ? 0.5f : c1610n.f8027g));
                }
                if (!Float.isNaN(c1610n.f8028h)) {
                    i0Var.m5164f(c1610n.f8028h);
                }
                if (!Float.isNaN(c1610n.f8029i)) {
                    i0Var.m5165h(c1610n.f8029i);
                }
                if (!Float.isNaN(c1610n.f8030j)) {
                    i0Var.m5166j(c1610n.f8030j);
                }
                if (!Float.isNaN(c1610n.f8031k)) {
                    i0Var.m5173x(c1610n.f8031k);
                }
                if (!Float.isNaN(c1610n.f8032l)) {
                    i0Var.m5174y(c1610n.f8032l);
                }
                if (!Float.isNaN(c1610n.f8033m)) {
                    i0Var.m5169r(c1610n.f8033m);
                }
                if (!Float.isNaN(c1610n.f8034n) || !Float.isNaN(c1610n.f8035o)) {
                    i0Var.m5167k(Float.isNaN(c1610n.f8034n) ? 1.0f : c1610n.f8034n);
                    i0Var.m5168n(Float.isNaN(c1610n.f8035o) ? 1.0f : c1610n.f8035o);
                }
                if (!Float.isNaN(c1610n.f8036p)) {
                    i0Var.m5161b(c1610n.f8036p);
                }
                return qw.a0.f30746a;
            case 19:
                ((InputConnectionC8855o) this.f32134b).m16330a((InterfaceC4362g) obj);
                return qw.a0.f30746a;
            default:
                C8860e c8860e = (C8860e) obj;
                if (!c8860e.f37670a.f37683p) {
                    return z1.SkipSubtreeAndContinueTraversal;
                }
                C8860e c8860e2 = c8860e.f42640r;
                if (c8860e2 != null) {
                    C6725t c6725t = new C6725t(20, (C7427b) this.f32134b);
                    if (c6725t.invoke(c8860e2) == z1.ContinueTraversal) {
                        AbstractC7634f.m14539B(c8860e2, c6725t);
                    }
                }
                c8860e.f42640r = null;
                c8860e.f42639q = null;
                return z1.ContinueTraversal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6725t(t1.d0 d0Var, d1 d1Var) {
        super(1);
        this.f32133a = 3;
        this.f32134b = d0Var;
    }
}
