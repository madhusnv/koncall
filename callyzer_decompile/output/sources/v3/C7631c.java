package v3;

import a3.InterfaceC0042a;
import android.os.SystemClock;
import android.view.MotionEvent;
import b3.InterfaceC0573e;
import b3.InterfaceC0586r;
import b3.InterfaceC0590v;
import b3.InterfaceC0593y;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.C1573a;
import d4.C1583k;
import d4.C1595w;
import d4.InterfaceC1585m;
import d4.InterfaceC1596x;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import lv.C4535g;
import m2.C4640e;
import og.ze;
import p3.AbstractC5818p;
import p3.C5812j;
import p3.C5819q;
import p3.C5824v;
import p3.C5825w;
import p3.EnumC5813k;
import p3.EnumC5823u;
import pg.AbstractC5940u;
import qw.InterfaceC6355e;
import s1.C6709d;
import s3.AbstractC6744a;
import s4.AbstractC6746b;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import t3.C7024k;
import t3.C7032s;
import t3.InterfaceC7033t;
import t3.InterfaceC7035v;
import tx.C7251k;
import u3.C7330a;
import u3.C7331b;
import u3.C7333d;
import u3.C7336g;
import u3.InterfaceC7332c;
import u3.InterfaceC7334e;
import u3.InterfaceC7335f;
import w2.AbstractC7878q;
import w2.InterfaceC7877p;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.c */
/* loaded from: classes.dex */
public final class C7631c extends AbstractC7878q implements InterfaceC7652x, InterfaceC7644p, w1, u1, InterfaceC7334e, InterfaceC7335f, s1, InterfaceC7651w, InterfaceC7645q, InterfaceC0573e, InterfaceC0590v, InterfaceC0593y, q1, InterfaceC0042a {

    /* renamed from: q */
    public InterfaceC7877p f36789q;

    /* renamed from: r */
    public C7330a f36790r;

    /* renamed from: s */
    public HashSet f36791s;

    @Override // v3.InterfaceC7644p
    /* renamed from: C */
    public final void mo151C() {
        AbstractC7634f.m14552m(this);
    }

    @Override // b3.InterfaceC0590v
    /* renamed from: D */
    public final void mo1756D(InterfaceC0586r interfaceC0586r) {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC6744a.m12907b("applyFocusProperties called on wrong node");
        interfaceC7877p.getClass();
        throw new ClassCastException();
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        L0(true);
    }

    @Override // v3.u1
    /* renamed from: E */
    public final void mo14533E() {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C5825w) interfaceC7877p).f28510d.getClass();
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        M0();
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: H */
    public final int mo146H(n0 n0Var, t3.i0 i0Var, int i10) {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC7035v) interfaceC7877p).mo10375b(new C7032s(n0Var, n0Var.getLayoutDirection()), new C7024k(i0Var, t3.m0.Min, t3.n0.Height, 1), AbstractC6746b.m12924b(i10, 0, 13)).getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(boolean r6) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.C7631c.L0(boolean):void");
    }

    public final void M0() {
        if (!this.f37683p) {
            AbstractC6744a.m12907b("unInitializeModifier called on unattached node");
        }
        InterfaceC7877p interfaceC7877p = this.f36789q;
        if ((this.f37672c & 32) != 0) {
            if (interfaceC7877p instanceof o1.x0) {
                C7333d modifierLocalManager = ((C7904v) AbstractC7634f.m14564y(this)).getModifierLocalManager();
                C7336g c7336g = o1.y1.f25893a;
                modifierLocalManager.f34950d.m9506b(AbstractC7634f.m14563x(this));
                modifierLocalManager.f34951e.m9506b(c7336g);
                modifierLocalManager.m13727a();
            }
            if (interfaceC7877p instanceof InterfaceC7332c) {
                ((InterfaceC7332c) interfaceC7877p).mo10373d(AbstractC7634f.f36810a);
            }
        }
        if ((this.f37672c & 8) != 0) {
            ((C7904v) AbstractC7634f.m14564y(this)).m15021C();
        }
    }

    @Override // u3.InterfaceC7334e
    /* renamed from: N */
    public final AbstractC5940u mo12851N() {
        C7330a c7330a = this.f36790r;
        return c7330a != null ? c7330a : C7331b.f34946a;
    }

    public final void N0() {
        if (this.f37683p) {
            this.f36791s.clear();
            ((C7904v) AbstractC7634f.m14564y(this)).getSnapshotObserver().m14657a(this, C7633e.f36795b, new C7630b(this, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // v3.u1
    /* renamed from: S */
    public final void mo6316S(C5812j c5812j, EnumC5813k enumC5813k, long j6) {
        boolean z6;
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C4367l c4367l = ((C5825w) interfaceC7877p).f28510d;
        c4367l.getClass();
        ?? r10 = c5812j.f28467a;
        C5825w c5825w = (C5825w) c4367l.f21923d;
        if (c5825w.f28509c) {
            z6 = true;
            break;
        }
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            C5819q c5819q = (C5819q) r10.get(i10);
            if (AbstractC5818p.m11397a(c5819q) || AbstractC5818p.m11399c(c5819q)) {
                z6 = true;
                break;
            }
        }
        z6 = false;
        if (((EnumC5823u) c4367l.f21922c) != EnumC5823u.NotDispatching) {
            if (enumC5813k == EnumC5813k.Initial && z6) {
                c4367l.m9135o(c5812j);
            }
            if (enumC5813k == EnumC5813k.Final && !z6) {
                c4367l.m9135o(c5812j);
            }
        }
        if (enumC5813k == EnumC5813k.Final) {
            int size2 = r10.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (!AbstractC5818p.m11399c((C5819q) r10.get(i11))) {
                    return;
                }
            }
            c4367l.f21922c = EnumC5823u.Unknown;
            c5825w.f28509c = false;
        }
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: V */
    public final int mo147V(n0 n0Var, t3.i0 i0Var, int i10) {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC7035v) interfaceC7877p).mo10375b(new C7032s(n0Var, n0Var.getLayoutDirection()), new C7024k(i0Var, t3.m0.Max, t3.n0.Height, 1), AbstractC6746b.m12924b(i10, 0, 13)).getHeight();
    }

    @Override // v3.InterfaceC7645q
    /* renamed from: W */
    public final void mo7495W(h1 h1Var) {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C6709d c6709d = (C6709d) interfaceC7877p;
        if (c6709d.f32054a) {
            return;
        }
        c6709d.f32054a = true;
        C7251k c7251k = c6709d.f32055b;
        if (c7251k != null) {
            c7251k.resumeWith(qw.a0.f30746a);
        }
        c6709d.f32055b = null;
    }

    @Override // a3.InterfaceC0042a
    /* renamed from: a */
    public final InterfaceC6747c mo149a() {
        return AbstractC7634f.m14563x(this).f36825C;
    }

    @Override // v3.s1
    public final Object a0(InterfaceC6747c interfaceC6747c, Object obj) {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((t3.t0) interfaceC7877p).mo6087f();
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC7035v) interfaceC7877p).mo10375b(l0Var, i0Var, j6);
    }

    @Override // v3.InterfaceC7641m
    /* renamed from: c */
    public final void mo153c() {
        if (this.f36789q instanceof C5825w) {
            mo6317x();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // u3.InterfaceC7334e, u3.InterfaceC7335f
    /* renamed from: d */
    public final Object mo13728d(C7336g c7336g) {
        C4535g c4535g;
        this.f36791s.add(c7336g);
        if (!this.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitAncestors called on an unattached node");
        }
        AbstractC7878q abstractC7878q = this.f37670a.f37674e;
        g0 g0VarM14563x = AbstractC7634f.m14563x(this);
        while (g0VarM14563x != null) {
            if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 32) != 0) {
                while (abstractC7878q != null) {
                    if ((abstractC7878q.f37672c & 32) != 0) {
                        AbstractC7642n abstractC7642nM14545f = abstractC7878q;
                        ?? c4640e = 0;
                        while (abstractC7642nM14545f != 0) {
                            if (abstractC7642nM14545f instanceof InterfaceC7334e) {
                                InterfaceC7334e interfaceC7334e = (InterfaceC7334e) abstractC7642nM14545f;
                                if (interfaceC7334e.mo12851N().mo11878a(c7336g)) {
                                    return interfaceC7334e.mo12851N().mo11879b(c7336g);
                                }
                            } else if ((abstractC7642nM14545f.f37672c & 32) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                AbstractC7878q abstractC7878q2 = abstractC7642nM14545f.f36953r;
                                int i10 = 0;
                                abstractC7642nM14545f = abstractC7642nM14545f;
                                c4640e = c4640e;
                                while (abstractC7878q2 != null) {
                                    if ((abstractC7878q2.f37672c & 32) != 0) {
                                        i10++;
                                        c4640e = c4640e;
                                        if (i10 == 1) {
                                            abstractC7642nM14545f = abstractC7878q2;
                                        } else {
                                            if (c4640e == 0) {
                                                c4640e = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7642nM14545f != 0) {
                                                c4640e.m9506b(abstractC7642nM14545f);
                                                abstractC7642nM14545f = 0;
                                            }
                                            c4640e.m9506b(abstractC7878q2);
                                        }
                                    }
                                    abstractC7878q2 = abstractC7878q2.f37675f;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e = c4640e;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                        }
                    }
                    abstractC7878q = abstractC7878q.f37674e;
                }
            }
            g0VarM14563x = g0VarM14563x.m14609v();
            abstractC7878q = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? null : (x1) c4535g.f22541e;
        }
        return c7336g.f34953a.invoke();
    }

    @Override // a3.InterfaceC0042a
    /* renamed from: e */
    public final long mo150e() {
        return ze.m11098d(AbstractC7634f.m14561v(this, 128).f34032c);
    }

    @Override // a3.InterfaceC0042a
    public final EnumC6757m getLayoutDirection() {
        return AbstractC7634f.m14563x(this).f36826D;
    }

    @Override // v3.InterfaceC7644p
    public final void h0(i0 i0Var) {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((i1.s0) interfaceC7877p).f16988a.mo5873a(i0Var);
    }

    @Override // v3.u1
    public final boolean j0() {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C5825w) interfaceC7877p).f28510d.getClass();
        return true;
    }

    @Override // v3.InterfaceC7652x
    public final int k0(n0 n0Var, t3.i0 i0Var, int i10) {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC7035v) interfaceC7877p).mo10375b(new C7032s(n0Var, n0Var.getLayoutDirection()), new C7024k(i0Var, t3.m0.Max, t3.n0.Width, 1), AbstractC6746b.m12924b(0, i10, 7)).mo12108b();
    }

    @Override // v3.q1
    /* renamed from: n */
    public final boolean mo14534n() {
        return this.f37683p;
    }

    @Override // b3.InterfaceC0573e
    /* renamed from: r */
    public final void mo1708r(b3.a0 a0Var) {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC6744a.m12907b("onFocusEvent called on wrong node");
        interfaceC7877p.getClass();
        throw new ClassCastException();
    }

    @Override // v3.w1
    public final void t0(InterfaceC1596x interfaceC1596x) {
        int i10;
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        C1583k c1583kMo727g = ((InterfaceC1585m) interfaceC7877p).mo727g();
        AbstractC4154l.m8921d(interfaceC1596x, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        C1583k c1583k = (C1583k) interfaceC1596x;
        e1.j0 j0Var = c1583k.f7868a;
        if (c1583kMo727g.f7870c) {
            c1583k.f7870c = true;
        }
        if (c1583kMo727g.f7871d) {
            c1583k.f7871d = true;
        }
        e1.j0 j0Var2 = c1583kMo727g.f7868a;
        Object[] objArr = j0Var2.f8999b;
        Object[] objArr2 = j0Var2.f9000c;
        long[] jArr = j0Var2.f8998a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j6 = jArr[i11];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j6) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        C1595w c1595w = (C1595w) obj;
                        if (!j0Var.m5569b(c1595w)) {
                            j0Var.m5579l(c1595w, obj2);
                        } else if (obj2 instanceof C1573a) {
                            Object objM5574g = j0Var.m5574g(c1595w);
                            AbstractC4154l.m8921d(objM5574g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            C1573a c1573a = (C1573a) objM5574g;
                            i10 = i12;
                            String str = c1573a.f7825a;
                            if (str == null) {
                                str = ((C1573a) obj2).f7825a;
                            }
                            InterfaceC6355e interfaceC6355e = c1573a.f7826b;
                            if (interfaceC6355e == null) {
                                interfaceC6355e = ((C1573a) obj2).f7826b;
                            }
                            j0Var.m5579l(c1595w, new C1573a(str, interfaceC6355e));
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                    }
                    j6 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final String toString() {
        return this.f36789q.toString();
    }

    @Override // v3.u1
    /* renamed from: x */
    public final void mo6317x() {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C4367l c4367l = ((C5825w) interfaceC7877p).f28510d;
        EnumC5823u enumC5823u = (EnumC5823u) c4367l.f21922c;
        C5825w c5825w = (C5825w) c4367l.f21923d;
        if (enumC5823u == EnumC5823u.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            C5824v c5824v = new C5824v(c5825w, 1);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 0);
            motionEventObtain.setSource(0);
            c5824v.invoke(motionEventObtain);
            motionEventObtain.recycle();
            c4367l.f21922c = EnumC5823u.Unknown;
            c5825w.f28509c = false;
        }
    }

    @Override // v3.InterfaceC7652x
    public final int x0(n0 n0Var, t3.i0 i0Var, int i10) {
        InterfaceC7877p interfaceC7877p = this.f36789q;
        AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC7035v) interfaceC7877p).mo10375b(new C7032s(n0Var, n0Var.getLayoutDirection()), new C7024k(i0Var, t3.m0.Min, t3.n0.Width, 1), AbstractC6746b.m12924b(0, i10, 7)).mo12108b();
    }

    @Override // v3.InterfaceC7651w
    public final void f0(InterfaceC7033t interfaceC7033t) {
    }

    @Override // v3.InterfaceC7651w
    /* renamed from: k */
    public final void mo5878k(long j6) {
    }
}
