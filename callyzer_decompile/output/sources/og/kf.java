package og;

import al.C0174b;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import aq.C0404g;
import au.C0439c;
import c9.AbstractC0911f;
import cj.C0979e;
import com.amplifyframework.storage.s3.C1230b;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d3.C1565s;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import gq.C2704a;
import h1.AbstractC2773d;
import h1.C2790u;
import ik.C3279c;
import java.util.ArrayList;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import l1.AbstractC4323l;
import l1.C4314c;
import l1.C4319h;
import l1.C4325n;
import l1.InterfaceC4324m;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5245d;
import o1.C5246e;
import o1.C5261t;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import q1.C6097y;
import r4.C6456k;
import s4.InterfaceC6747c;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7869h;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;
import wc.InterfaceC7971e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class kf {
    /* renamed from: a */
    public static final void m10736a(InterfaceC2137a onAllow, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onAllow, "onAllow");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(2020768605);
        int i11 = (c3966o.m8616i(onAllow) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C2704a(pg.f9.m11629c(c3966o, R.string.select_battery_saver_or_battery_in_app_info), R.drawable.ic_bettary_sever));
            arrayList.add(new C2704a(pg.f9.m11629c(c3966o, R.string.select_no_restriction), R.drawable.ic_no_restriction));
            long j6 = ((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12967n;
            C0174b c0174b = d3.h0.f7748a;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(c7876o, j6, c0174b);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM633a);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            float f6 = 20;
            sq.b1.m13113q(pg.f9.m11629c(c3966o, R.string.follow_steps_to_turn_off_battery_optimization), AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), f6, f6, f6, DefinitionKt.NO_Float_VALUE, 8), 0L, null, new C6456k(3), 0, 0, 0L, null, ((g2.vd) c3966o.m8618k(g2.xd.f13268a)).f13052h, c3966o, 0, 492);
            m10737b(arrayList, c3966o, 0);
            sq.g2.m13168t(pg.f9.m11629c(c3966o, R.string.turn_off_battery_optimization), AbstractC0242a.m656j(AbstractC0245d.m668e(c7876o, 1.0f), f6), null, 0, null, 0L, onAllow, c3966o, ((i11 << 18) & 3670016) | 48, 60);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0439c(i10, 2, onAllow);
        }
    }

    /* renamed from: b */
    public static final void m10737b(ArrayList arrayList, InterfaceC3962k interfaceC3962k, int i10) {
        C7636h c7636h;
        int i11;
        long jM5186b;
        ArrayList arrayList2 = arrayList;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-370939227);
        int i12 = i10 | (c3966o.m8616i(arrayList2) ? 4 : 2);
        if (c3966o.m8598P(i12 & 1, (i12 & 3) != 2)) {
            C6097y c6097yM12082a = q1.b0.m12082a(0, 3, c3966o);
            C4325n c4325n = C4325n.f21784b;
            boolean zM8614g = c3966o.m8614g(c6097yM12082a);
            Object objM8596M = c3966o.m8596M();
            Object obj = C3961j.f20408a;
            if (zM8614g || objM8596M == obj) {
                objM8596M = new C4314c(c6097yM12082a, c4325n);
                c3966o.j0(objM8596M);
            }
            InterfaceC4324m interfaceC4324m = (InterfaceC4324m) objM8596M;
            float f6 = AbstractC4323l.f21783a;
            InterfaceC6747c interfaceC6747c = (InterfaceC6747c) c3966o.m8618k(w3.k1.f37836h);
            C2790u c2790uM6086a = g1.h1.m6086a(c3966o);
            boolean zM8614g2 = c3966o.m8614g(interfaceC6747c) | c3966o.m8614g(interfaceC4324m) | c3966o.m8614g(c2790uM6086a);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g2 || objM8596M2 == obj) {
                objM8596M2 = new C4319h(interfaceC4324m, c2790uM6086a, AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, 400.0f, null, 5));
                c3966o.j0(objM8596M2);
            }
            C4319h c4319h = (C4319h) objM8596M2;
            C5245d c5245d = AbstractC5251j.f25759c;
            C5261t c5261tM10367a = AbstractC5260s.m10367a(c5245d, C7864c.f37654n, c3966o, 0);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, c7876o);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C7636h c7636h2 = C7638j.f36925f;
            C3953b.m8521x(c7636h2, c5261tM10367a, c3966o);
            C7636h c7636h3 = C7638j.f36924e;
            C3953b.m8521x(c7636h3, i1VarM8620m, c3966o);
            C7636h c7636h4 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h4);
            }
            C7636h c7636h5 = C7638j.f36923d;
            C3953b.m8521x(c7636h5, interfaceC7879rM14845c, c3966o);
            o1.i1 i1VarM647a = AbstractC0242a.m647a(25, 2);
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
            boolean zM8616i = c3966o.m8616i(arrayList2);
            Object objM8596M3 = c3966o.m8596M();
            int i14 = 14;
            if (zM8616i || objM8596M3 == obj) {
                objM8596M3 = new an.j2(i14, arrayList2);
                c3966o.j0(objM8596M3);
            }
            nc.m10777d(interfaceC7879rM668e, c6097yM12082a, i1VarM647a, null, null, c4319h, false, null, (InterfaceC2139c) objM8596M3, c3966o, 390, 440);
            Object objM8596M4 = c3966o.m8596M();
            if (objM8596M4 == obj) {
                objM8596M4 = C3953b.m8512o(new C0404g(c6097yM12082a, 6));
                c3966o.j0(objM8596M4);
            }
            k2.h2 h2Var = (k2.h2) objM8596M4;
            C7869h c7869h = C7864c.f37655p;
            InterfaceC7879r interfaceC7879rM668e2 = AbstractC0245d.m668e(c7876o, 1.0f);
            C5261t c5261tM10367a2 = AbstractC5260s.m10367a(c5245d, c7869h, c3966o, 48);
            int i15 = c3966o.f20462P;
            k2.i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM668e2);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h2, c5261tM10367a2, c3966o);
            C3953b.m8521x(c7636h3, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                c7636h = c7636h4;
                AbstractC1452a.m4577x(i15, c3966o, i15, c7636h);
            } else {
                c7636h = c7636h4;
            }
            C3953b.m8521x(c7636h5, interfaceC7879rM14845c2, c3966o);
            String strM11235f = AbstractC5601a.m11235f("Step ", ((Number) h2Var.getValue()).intValue() + 1, arrayList.size(), " / ");
            float f10 = 10;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), DefinitionKt.NO_Float_VALUE, f10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
            C6456k c6456k = new C6456k(3);
            k2.i2 i2Var = g2.xd.f13268a;
            g4.o0 o0Var = ((g2.vd) c3966o.m8618k(i2Var)).f13053i;
            C7636h c7636h6 = c7636h;
            c3966o = c3966o;
            sq.b1.m13113q(strM11235f, interfaceC7879rM660n, 0L, null, c6456k, 0, 0, 0L, null, o0Var, c3966o, 48, 492);
            arrayList2 = arrayList;
            sq.b1.m13113q(((C2704a) arrayList.get(((Number) h2Var.getValue()).intValue())).f15104a, AbstractC0242a.m658l(AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), DefinitionKt.NO_Float_VALUE, f10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13), 20, DefinitionKt.NO_Float_VALUE, 2), 0L, null, new C6456k(3), 0, 0, 0L, null, g4.o0.m6461a(((g2.vd) c3966o.m8618k(i2Var)).f13052h, 0L, af.m10534c(16), null, null, null, 0L, 0L, null, 16777213), c3966o, 48, 492);
            C5246e c5246e = AbstractC5251j.f25761e;
            C7870i c7870i = C7864c.f37652l;
            float f11 = 12;
            InterfaceC7879r interfaceC7879rM668e3 = AbstractC0245d.m668e(AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, f11, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13), 1.0f);
            o1.n1 n1VarM10357a = o1.m1.m10357a(c5246e, c7870i, c3966o, 54);
            int i16 = c3966o.f20462P;
            k2.i1 i1VarM8620m3 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM668e3);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h2, n1VarM10357a, c3966o);
            C3953b.m8521x(c7636h3, i1VarM8620m3, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i16))) {
                AbstractC1452a.m4577x(i16, c3966o, i16, c7636h6);
            }
            C3953b.m8521x(c7636h5, interfaceC7879rM14845c3, c3966o);
            c3966o.m8607Y(-1141589101);
            int size = arrayList2.size();
            int i17 = 0;
            while (i17 < size) {
                boolean z6 = ((Number) h2Var.getValue()).intValue() == i17;
                InterfaceC7879r interfaceC7879rM2617a = AbstractC0911f.m2617a(AbstractC0245d.m678o(AbstractC0242a.m656j(c7876o, 4), z6 ? f11 : 8), AbstractC7861e.f37635a);
                if (z6) {
                    c3966o.m8607Y(-553579796);
                    jM5186b = ((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12954a;
                    i11 = 0;
                    c3966o.m8623p(false);
                } else {
                    i11 = 0;
                    c3966o.m8607Y(-553577993);
                    c3966o.m8623p(false);
                    jM5186b = C1565s.m5186b(0.4f, 14, C1565s.f7810c);
                }
                AbstractC5256o.m10358a(AbstractC0237a.m633a(interfaceC7879rM2617a, jM5186b, d3.h0.f7748a), c3966o, i11);
                i17++;
            }
            c3966o.m8623p(false);
            c3966o.m8623p(true);
            c3966o.m8623p(true);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1230b(arrayList2, i10, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (tx.c0.m13487j(r6, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10738c(bd.C0645a r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof sc.C6805y
            if (r0 == 0) goto L13
            r0 = r7
            sc.y r0 = (sc.C6805y) r0
            int r1 = r0.f32342e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32342e = r1
            goto L18
        L13:
            sc.y r0 = new sc.y
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32341d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f32342e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r7)
            goto L80
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.f32340c
            java.util.Iterator r2 = r0.f32339b
            bd.a r5 = r0.f32338a
            og.od.m10798c(r7)
            r7 = r2
            r2 = r6
            r6 = r5
            goto L51
        L3f:
            og.od.m10798c(r7)
            ec.a r7 = sc.AbstractC6791k.f32293b
            java.lang.Object r7 = r6.mo1864e(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L6c
            java.util.Iterator r7 = r7.iterator()
            r2 = 0
        L51:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r7.next()
            pc.l r5 = (pc.C5884l) r5
            r0.f32338a = r6
            r0.f32339b = r7
            r0.f32340c = r2
            r0.f32342e = r4
            java.lang.Object r5 = pg.g8.m11659a(r5, r0)
            if (r5 != r1) goto L51
            goto L7f
        L6c:
            tx.f1 r6 = r6.f4117b
            tx.e1 r6 = tx.c0.m13495r(r6)
            r7 = 0
            r0.f32338a = r7
            r0.f32339b = r7
            r0.f32342e = r3
            java.lang.Object r6 = tx.c0.m13487j(r6, r0)
            if (r6 != r1) goto L80
        L7f:
            return r1
        L80:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: og.kf.m10738c(bd.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0273 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027d A[Catch: all -> 0x0276, TryCatch #3 {all -> 0x0276, blocks: (B:65:0x0279, B:67:0x027d, B:70:0x0290, B:68:0x0285, B:52:0x024b), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285 A[Catch: all -> 0x0276, TRY_LEAVE, TryCatch #3 {all -> 0x0276, blocks: (B:65:0x0279, B:67:0x027d, B:70:0x0290, B:68:0x0285, B:52:0x024b), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10739d(cj.C0979e r19, wc.InterfaceC7971e r20, java.lang.Object r21, ex.InterfaceC2141e r22, uw.InterfaceC7559c r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.kf.m10739d(cj.e, wc.e, java.lang.Object, ex.e, uw.c):java.lang.Object");
    }

    /* renamed from: e */
    public static final Object m10740e(C0979e c0979e, InterfaceC7971e interfaceC7971e, Object obj, InterfaceC7559c interfaceC7559c) {
        return m10739d(c0979e, interfaceC7971e, obj, new C3279c(2, 5, null), interfaceC7559c);
    }
}
