package a2;

import ab.C0084b;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import b3.e0;
import e4.C1944a;
import ex.InterfaceC2137a;
import ey.C2147b;
import f2.C2178a;
import f2.C2179b;
import g2.l5;
import g2.qa;
import g2.u1;
import h1.AbstractC2773d;
import h1.s1;
import h1.x0;
import h6.C2853i;
import i1.AbstractC3126e;
import i1.C3128g;
import i1.C3129h;
import i1.C3147z;
import i1.e1;
import i1.f0;
import i1.q1;
import i2.C3163p;
import i2.InterfaceC3161n;
import j3.j0;
import java.util.ArrayList;
import k1.p1;
import k1.s0;
import k2.b1;
import k2.h1;
import k2.o0;
import k2.o1;
import k2.p0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4367l;
import m2.C4636a;
import o3.C5281d;
import o3.C5284g;
import org.bouncycastle.iana.AEADAlgorithm;
import q1.C6097y;
import qw.a0;
import s4.InterfaceC6747c;
import tx.C7251k;
import tx.InterfaceC7250j;
import tx.InterfaceC7266z;
import tx.c0;
import v3.AbstractC7634f;
import vx.C7813o;
import vx.InterfaceC7810l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.i */
/* loaded from: classes.dex */
public final class C0036i extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f155a;

    /* renamed from: b */
    public final /* synthetic */ Object f156b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0036i(int i10, Object obj) {
        super(0);
        this.f155a = i10;
        this.f156b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        InterfaceC7250j interfaceC7250jM8651u;
        Object[] objArr = 0;
        switch (this.f155a) {
            case 0:
                C0038k c0038k = (C0038k) this.f156b;
                c0038k.f165H = null;
                AbstractC7634f.m14554o(c0038k);
                AbstractC7634f.m14553n(c0038k);
                AbstractC7634f.m14552m(c0038k);
                return Boolean.TRUE;
            case 1:
                C0041n c0041n = (C0041n) this.f156b;
                c0041n.f183D = null;
                AbstractC7634f.m14554o(c0041n);
                AbstractC7634f.m14553n(c0041n);
                AbstractC7634f.m14552m(c0041n);
                return Boolean.TRUE;
            case 2:
                ((e0) this.f156b).M0();
                return a0.f30746a;
            case 3:
                C1944a c1944a = (C1944a) this.f156b;
                c1944a.f9184g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c1944a.m5694a();
                    Trace.endSection();
                    return a0.f30746a;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 4:
                ((C2178a) this.f156b).f10061k.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.f30746a;
            case 5:
                AbstractC7634f.m14552m((C2179b) this.f156b);
                return a0.f30746a;
            case 6:
                u1 u1Var = (u1) this.f156b;
                c0.m13502y(u1Var.z0(), null, null, new C0084b(u1Var, objArr == true ? 1 : 0, 12), 3);
                return a0.f30746a;
            case 7:
                return Integer.valueOf(((C6097y) this.f156b).f29773d.f29752b.m8526f());
            case 8:
                ((l5) this.f156b).invoke();
                return Boolean.TRUE;
            case 9:
                return Float.valueOf(((InterfaceC6747c) this.f156b).mo8435T(125));
            case 10:
                ((qa) this.f156b).m6292a();
                return Boolean.TRUE;
            case 11:
                return Float.valueOf(AbstractC2773d.m6791n(((InterfaceC7266z) this.f156b).mo1865w()));
            case 12:
                x0 x0Var = (x0) this.f156b;
                s1 s1Var = x0Var.f15648e;
                x0Var.f15649f = s1Var != null ? ((Number) s1Var.f15599l.getValue()).longValue() : 0L;
                return a0.f30746a;
            case 13:
                ((C2853i) this.f156b).mo5820a(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
                return a0.f30746a;
            case 14:
                ((C2147b) this.f156b).mo5820a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
                return a0.f30746a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((AbstractC3126e) this.f156b).f16846y.invoke();
                return Boolean.TRUE;
            case 16:
                InterfaceC2137a interfaceC2137a = ((C3147z) this.f156b).f17014M;
                if (interfaceC2137a != null) {
                    interfaceC2137a.invoke();
                }
                return Boolean.TRUE;
            case 17:
                return Boolean.valueOf(((f0) this.f156b).f16861y.P0(7));
            case 18:
                q1 q1Var = (q1) this.f156b;
                C3129h c3129h = (C3129h) AbstractC7634f.m14548i(q1Var, e1.f16849a);
                q1Var.f16966E = c3129h;
                q1Var.f16967F = c3129h != null ? new C3128g(c3129h.f16874a, c3129h.f16875b, c3129h.f16876c, c3129h.f16877d) : null;
                return a0.f30746a;
            case 19:
                return Float.valueOf(((Number) ((C3163p) ((InterfaceC3161n) this.f156b)).f17078a.m6775d()).floatValue());
            case 20:
                j0 j0Var = (j0) this.f156b;
                int i10 = j0Var.f19058m;
                b1 b1Var = j0Var.f19055j;
                if (i10 == b1Var.m8526f()) {
                    b1Var.m8527g(b1Var.m8526f() + 1);
                }
                return a0.f30746a;
            case 21:
                return (s0) C7813o.m14794a(((InterfaceC7810l) this.f156b).mo14772b());
            case 22:
                return Boolean.valueOf(((p1) this.f156b).f37683p);
            case 23:
                throw null;
            case 24:
                ArrayList arrayList = ((h1) this.f156b).f20399a;
                e1.j0 j0Var2 = new e1.j0(arrayList.size());
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    p0 p0Var = (p0) arrayList.get(i11);
                    Object obj = p0Var.f20499b;
                    int i12 = p0Var.f20498a;
                    Object o0Var = obj != null ? new o0(Integer.valueOf(i12), p0Var.f20499b) : Integer.valueOf(i12);
                    int iM5573f = j0Var2.m5573f(o0Var);
                    Object[] objArr2 = iM5573f < 0;
                    Object obj2 = objArr2 != false ? null : j0Var2.f9000c[iM5573f];
                    if (obj2 != null) {
                        if (obj2 instanceof e1.e0) {
                            e1.e0 e0Var = (e1.e0) obj2;
                            e0Var.m5543a(p0Var);
                            p0Var = e0Var;
                        } else {
                            Object[] objArr3 = e1.p0.f9035a;
                            e1.e0 e0Var2 = new e1.e0(2);
                            e0Var2.m5543a(obj2);
                            e0Var2.m5543a(p0Var);
                            p0Var = e0Var2;
                        }
                    }
                    if (objArr2 == true) {
                        int i13 = ~iM5573f;
                        j0Var2.f8999b[i13] = o0Var;
                        j0Var2.f9000c[i13] = p0Var;
                    } else {
                        j0Var2.f9000c[iM5573f] = p0Var;
                    }
                }
                return new C4636a(j0Var2);
            case 25:
                k2.q1 q1Var2 = (k2.q1) this.f156b;
                synchronized (q1Var2.f20519b) {
                    interfaceC7250jM8651u = q1Var2.m8651u();
                    if (((o1) q1Var2.f20537t.getValue()).compareTo(o1.ShuttingDown) <= 0) {
                        throw c0.m13478a("Recomposer shutdown; frame clock awaiter will never resume", q1Var2.f20521d);
                    }
                }
                if (interfaceC7250jM8651u != null) {
                    ((C7251k) interfaceC7250jM8651u).resumeWith(a0.f30746a);
                }
                return a0.f30746a;
            case 26:
                Object systemService = ((View) ((C4367l) this.f156b).f21921b).getContext().getSystemService("input_method");
                AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 27:
                return new BaseInputConnection((View) ((l4.e0) this.f156b).f21886c, false);
            case 28:
                return ((C5281d) this.f156b).f25938d;
            default:
                return ((C5284g) this.f156b).L0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0036i(int i10, Object obj, Object obj2) {
        super(0);
        this.f155a = i10;
        this.f156b = obj;
    }
}
