package r1;

import android.content.Context;
import android.view.Choreographer;
import androidx.work.impl.WorkerStoppedException;
import b2.o0;
import bp.C0720d;
import d7.AbstractC1646r;
import d7.EnumC1645q;
import e1.k0;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import iz.C3382o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k2.g1;
import k2.w0;
import kotlin.jvm.internal.AbstractC4155m;
import l4.InputConnectionC4370o;
import m2.C4640e;
import o6.b0;
import org.bouncycastle.iana.AEADAlgorithm;
import oz.C5783f;
import qr.C6286j;
import qw.C6361k;
import s1.t0;
import s2.C6734c;
import s4.C6745a;
import sq.i2;
import t2.InterfaceC7003b;
import t2.InterfaceC7009h;
import t3.v0;
import t8.AbstractC7076v;
import tx.g0;
import v3.c2;
import vr.C7734b;
import w2.C7882u;
import w2.InterfaceC7879r;
import w3.C7896n;
import w3.f3;
import w3.g3;
import w3.p0;
import w3.r0;
import w3.t1;
import w3.u0;
import w4.C7915g;
import w4.C7927s;
import w4.InterfaceC7930v;
import x4.C8299i;
import z1.C8854n;
import z1.InputConnectionC8855o;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.p */
/* loaded from: classes.dex */
public final class C6431p extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f31011a;

    /* renamed from: b */
    public final /* synthetic */ Object f31012b;

    /* renamed from: c */
    public final /* synthetic */ Object f31013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6431p(int i10, Object obj, Object obj2) {
        super(1);
        this.f31011a = i10;
        this.f31013c = obj;
        this.f31012b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InputConnectionC8855o inputConnectionC8855o;
        switch (this.f31011a) {
            case 0:
                C6438w c6438wM11329c = ((C5783f) this.f31013c).m11329c(((Number) obj).intValue());
                int i10 = c6438wM11329c.f31065a;
                List list = c6438wM11329c.f31066b;
                ArrayList arrayList = new ArrayList(list.size());
                C3382o c3382o = (C3382o) this.f31012b;
                int size = list.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = (int) ((C6419d) list.get(i12)).f30951a;
                    arrayList.add(new C6361k(Integer.valueOf(i10), new C6745a(c3382o.m7747a(i11, i13))));
                    i10++;
                    i11 += i13;
                }
                return arrayList;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                C3382o c3382o2 = (C3382o) this.f31012b;
                C5783f c5783f = (C5783f) c3382o2.f17967e;
                int i14 = c5783f.f28355f;
                int iM11333g = c5783f.m11333g(iIntValue);
                long jM7747a = c3382o2.m7747a(0, iM11333g);
                C6430o c6430o = (C6430o) this.f31013c;
                return c6430o.m12426a(iIntValue, 0, iM11333g, c6430o.f31005c, jM7747a);
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                return ((C6286j) this.f31013c).invoke(Integer.valueOf(iIntValue2), ((List) this.f31012b).get(iIntValue2));
            case 3:
                int iIntValue3 = ((Number) obj).intValue();
                return ((C6286j) this.f31013c).invoke(Integer.valueOf(iIntValue3), ((List) this.f31012b).get(iIntValue3));
            case 4:
                return new t0((InterfaceC7009h) this.f31013c, (Map) obj, (InterfaceC7003b) this.f31012b);
            case 5:
                t0 t0Var = (t0) this.f31013c;
                k0 k0Var = t0Var.f32137c;
                Object obj2 = this.f31012b;
                k0Var.m5589i(obj2);
                return new C0720d(12, t0Var, obj2);
            case 6:
                int iIntValue4 = ((Number) obj).intValue();
                return ((C6286j) this.f31013c).invoke(Integer.valueOf(iIntValue4), ((List) this.f31012b).get(iIntValue4));
            case 7:
                v0 v0Var = (v0) obj;
                o0 o0Var = new o0(5, (ArrayList) this.f31012b);
                v0Var.f34028a = true;
                o0Var.invoke(v0Var);
                v0Var.f34028a = false;
                ((w0) this.f31013c).getValue();
                return qw.a0.f30746a;
            case 8:
                Throwable th2 = (Throwable) obj;
                C8299i c8299i = (C8299i) this.f31013c;
                if (th2 == null) {
                    c8299i.m15507b(((g0) this.f31012b).m13550C());
                } else if (th2 instanceof CancellationException) {
                    c8299i.m15508c();
                } else {
                    c8299i.m15509d(th2);
                }
                return qw.a0.f30746a;
            case 9:
                int iIntValue5 = ((Number) obj).intValue();
                return ((i2) this.f31013c).invoke(Integer.valueOf(iIntValue5), ((List) this.f31012b).get(iIntValue5));
            case 10:
                int iIntValue6 = ((Number) obj).intValue();
                return ((i2) this.f31013c).invoke(Integer.valueOf(iIntValue6), ((List) this.f31012b).get(iIntValue6));
            case 11:
                int iIntValue7 = ((Number) obj).intValue();
                return ((i2) this.f31013c).invoke(Integer.valueOf(iIntValue7), ((List) this.f31012b).get(iIntValue7));
            case 12:
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof WorkerStoppedException) {
                    ((AbstractC7076v) this.f31013c).stop(((WorkerStoppedException) th3).f2881a);
                }
                ((InterfaceFutureC8957d) this.f31012b).cancel(false);
                return qw.a0.f30746a;
            case 13:
                int iIntValue8 = ((Number) obj).intValue();
                return ((i2) this.f31013c).invoke(Integer.valueOf(iIntValue8), ((List) this.f31012b).get(iIntValue8));
            case 14:
                ((v3.g0) this.f31013c).c0(((InterfaceC7879r) obj).mo14852e((InterfaceC7879r) this.f31012b));
                return qw.a0.f30746a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int iIntValue9 = ((Number) obj).intValue();
                return ((i2) this.f31013c).invoke(Integer.valueOf(iIntValue9), ((List) this.f31012b).get(iIntValue9));
            case 16:
                int iIntValue10 = ((Number) obj).intValue();
                return ((i2) this.f31013c).invoke(Integer.valueOf(iIntValue10), ((List) this.f31012b).get(iIntValue10));
            case 17:
                int iIntValue11 = ((Number) obj).intValue();
                return ((i2) this.f31013c).invoke(Integer.valueOf(iIntValue11), ((List) this.f31012b).get(iIntValue11));
            case 18:
                int iIntValue12 = ((Number) obj).intValue();
                return ((C7734b) this.f31013c).invoke(Integer.valueOf(iIntValue12), ((List) this.f31012b).get(iIntValue12));
            case 19:
                int iIntValue13 = ((Number) obj).intValue();
                return ((C7734b) this.f31013c).invoke(Integer.valueOf(iIntValue13), ((List) this.f31012b).get(iIntValue13));
            case 20:
                int iIntValue14 = ((Number) obj).intValue();
                return ((C7734b) this.f31013c).invoke(Integer.valueOf(iIntValue14), ((List) this.f31012b).get(iIntValue14));
            case 21:
                ((v0) obj).m13324d((t3.w0) this.f31013c, 0, 0, ((C7882u) this.f31012b).f37686q);
                return qw.a0.f30746a;
            case 22:
                Context context = (Context) this.f31013c;
                Context applicationContext = context.getApplicationContext();
                w3.o0 o0Var2 = (w3.o0) this.f31012b;
                applicationContext.registerComponentCallbacks(o0Var2);
                return new C0720d(15, context, o0Var2);
            case 23:
                Context context2 = (Context) this.f31013c;
                Context applicationContext2 = context2.getApplicationContext();
                p0 p0Var = (p0) this.f31012b;
                applicationContext2.registerComponentCallbacks(p0Var);
                return new C0720d(16, context2, p0Var);
            case 24:
                return new t1((C8854n) this.f31013c, new b0(12, (r0) this.f31012b));
            case 25:
                t1 t1Var = (t1) this.f31013c;
                synchronized (t1Var.f37962c) {
                    try {
                        t1Var.f37964e = true;
                        C4640e c4640e = t1Var.f37963d;
                        Object[] objArr = c4640e.f22884a;
                        int i15 = c4640e.f22886c;
                        for (int i16 = 0; i16 < i15; i16++) {
                            InputConnectionC4370o inputConnectionC4370o = (InputConnectionC4370o) ((c2) objArr[i16]).get();
                            if (inputConnectionC4370o != null && (inputConnectionC8855o = inputConnectionC4370o.f21927b) != null) {
                                inputConnectionC4370o.m9149a(inputConnectionC8855o);
                                inputConnectionC4370o.f21927b = null;
                            }
                        }
                        t1Var.f37963d.m9511h();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                l4.a0 a0Var = ((r0) this.f31012b).f37946b;
                a0Var.f21852b.set(null);
                a0Var.f21851a.mo9095c();
                return qw.a0.f30746a;
            case 26:
                u0 u0Var = (u0) this.f31013c;
                w3.v0 v0Var2 = (w3.v0) this.f31012b;
                synchronized (u0Var.f37972e) {
                    u0Var.f37974g.remove(v0Var2);
                }
                return qw.a0.f30746a;
            case 27:
                ((Choreographer) ((g1) this.f31013c).f20392b).removeFrameCallback((w3.v0) this.f31012b);
                return qw.a0.f30746a;
            case 28:
                C7896n c7896n = (C7896n) obj;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f31012b;
                g3 g3Var = (g3) this.f31013c;
                if (!g3Var.f37800c) {
                    AbstractC1646r lifecycle = c7896n.f37864a.getLifecycle();
                    g3Var.f37802e = interfaceC2141e;
                    if (g3Var.f37801d == null) {
                        g3Var.f37801d = lifecycle;
                        lifecycle.mo5343a(g3Var);
                    } else if (lifecycle.mo5344b().isAtLeast(EnumC1645q.CREATED)) {
                        g3Var.f37799b.m8667j(new C6734c(new f3(g3Var, interfaceC2141e, 1), true, -2000640158));
                    }
                }
                return qw.a0.f30746a;
            default:
                C7927s c7927s = (C7927s) this.f31013c;
                c7927s.setPositionProvider((InterfaceC7930v) this.f31012b);
                c7927s.m15057j();
                return new C7915g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6431p(C3382o c3382o, C6430o c6430o) {
        super(1);
        this.f31011a = 1;
        this.f31012b = c3382o;
        this.f31013c = c6430o;
    }
}
