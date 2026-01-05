package r1;

import a3.C0045d;
import androidx.compose.foundation.lazy.layout.C0248b;
import b3.C0583o;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import g2.b4;
import i1.y0;
import java.util.ArrayList;
import java.util.List;
import k1.C3938m;
import k1.q1;
import k1.x0;
import k2.C3953b;
import k2.e1;
import k2.s0;
import k2.w0;
import k4.C4001v;
import l1.C4327p;
import l4.d0;
import m1.C4631m;
import m2.C4640e;
import mg.j0;
import og.gg;
import pg.ca;
import q1.C6092t;
import q1.C6095w;
import qw.C6361k;
import rw.AbstractC6663m;
import s1.AbstractC6731z;
import s1.C6709d;
import s1.e0;
import s1.h0;
import s4.C6745a;
import u2.AbstractC7311h;
import u2.AbstractC7321r;
import uw.InterfaceC7559c;
import v3.g0;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.y */
/* loaded from: classes.dex */
public final class C6440y implements q1 {

    /* renamed from: w */
    public static final C0917l f31073w = gg.m10675b(C6425j.f30983c, C6432q.f31016d);

    /* renamed from: b */
    public boolean f31075b;

    /* renamed from: c */
    public C6433r f31076c;

    /* renamed from: d */
    public final C6092t f31077d;

    /* renamed from: g */
    public float f31080g;

    /* renamed from: j */
    public g0 f31083j;

    /* renamed from: o */
    public final h0 f31088o;

    /* renamed from: t */
    public final e1 f31093t;

    /* renamed from: u */
    public final e1 f31094u;

    /* renamed from: v */
    public final C4001v f31095v;

    /* renamed from: a */
    public final j0 f31074a = new j0(3);

    /* renamed from: e */
    public final e1 f31078e = new e1(AbstractC6441z.f31096a, s0.f20544c);

    /* renamed from: f */
    public final C4631m f31079f = new C4631m();

    /* renamed from: h */
    public final C3938m f31081h = new C3938m(new C0045d(29, this));

    /* renamed from: i */
    public final boolean f31082i = true;

    /* renamed from: k */
    public final C6095w f31084k = new C6095w(this, 1);

    /* renamed from: l */
    public final C6709d f31085l = new C6709d();

    /* renamed from: m */
    public final C0248b f31086m = new C0248b();

    /* renamed from: n */
    public final d0 f31087n = new d0(15);

    /* renamed from: p */
    public final C4327p f31089p = new C4327p(18, this);

    /* renamed from: q */
    public final e0 f31090q = new e0();

    /* renamed from: r */
    public final w0 f31091r = AbstractC6731z.m12883h();

    /* renamed from: s */
    public final w0 f31092s = AbstractC6731z.m12883h();

    public C6440y(int i10, int i11) {
        this.f31077d = new C6092t(i10, i11, 1);
        this.f31088o = new h0(new C0583o(this, i10, 2));
        Boolean bool = Boolean.FALSE;
        this.f31093t = C3953b.m8517t(bool);
        this.f31094u = C3953b.m8517t(bool);
        this.f31095v = new C4001v((byte) 0, 24);
    }

    /* renamed from: i */
    public static Object m12432i(C6440y c6440y, int i10, AbstractC8199i abstractC8199i) {
        c6440y.getClass();
        Object objMo7521b = c6440y.mo7521b(y0.Default, new b4(c6440y, i10, (InterfaceC7559c) null), abstractC8199i);
        return objMo7521b == EnumC7794a.COROUTINE_SUSPENDED ? objMo7521b : qw.a0.f30746a;
    }

    @Override // k1.q1
    /* renamed from: a */
    public final boolean mo7520a() {
        return this.f31081h.mo7520a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8.mo7521b(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k1.q1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo7521b(i1.y0 r6, ex.InterfaceC2141e r7, uw.InterfaceC7559c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof r1.C6439x
            if (r0 == 0) goto L13
            r0 = r8
            r1.x r0 = (r1.C6439x) r0
            int r1 = r0.f31072f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31072f = r1
            goto L18
        L13:
            r1.x r0 = new r1.x
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f31070d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31072f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ww.i r6 = r0.f31069c
            r7 = r6
            ex.e r7 = (ex.InterfaceC2141e) r7
            i1.y0 r6 = r0.f31068b
            r1.y r2 = r0.f31067a
            og.od.m10798c(r8)
            goto L57
        L3f:
            og.od.m10798c(r8)
            r0.f31067a = r5
            r0.f31068b = r6
            r8 = r7
            ww.i r8 = (ww.AbstractC8199i) r8
            r0.f31069c = r8
            r0.f31072f = r4
            s1.d r8 = r5.f31085l
            java.lang.Object r8 = r8.m12844h(r0)
            if (r8 != r1) goto L56
            goto L68
        L56:
            r2 = r5
        L57:
            k1.m r8 = r2.f31081h
            r2 = 0
            r0.f31067a = r2
            r0.f31068b = r2
            r0.f31069c = r2
            r0.f31072f = r3
            java.lang.Object r6 = r8.mo7521b(r6, r7, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C6440y.mo7521b(i1.y0, ex.e, uw.c):java.lang.Object");
    }

    @Override // k1.q1
    /* renamed from: c */
    public final boolean mo7522c() {
        return ((Boolean) this.f31094u.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: d */
    public final boolean mo7523d() {
        return ((Boolean) this.f31093t.getValue()).booleanValue();
    }

    @Override // k1.q1
    /* renamed from: e */
    public final float mo7524e(float f6) {
        return this.f31081h.mo7524e(f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12433f(r1.C6433r r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C6440y.m12433f(r1.r, boolean, boolean):void");
    }

    /* renamed from: g */
    public final C6433r m12434g() {
        return (C6433r) this.f31078e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* renamed from: h */
    public final void m12435h(float f6, C6433r c6433r) {
        int i10;
        int i11;
        List list;
        if (this.f31082i) {
            j0 j0Var = this.f31074a;
            C4640e c4640e = (C4640e) j0Var.f23656c;
            ?? r52 = c6433r.f31030l;
            x0 x0Var = c6433r.f31034p;
            ?? r72 = c6433r.f31030l;
            if (r52.isEmpty()) {
                return;
            }
            boolean z6 = f6 < DefinitionKt.NO_Float_VALUE;
            if (z6) {
                C6434s c6434s = (C6434s) AbstractC6663m.m12750N(r72);
                i10 = (x0Var == x0.Vertical ? c6434s.f31052p : c6434s.f31053q) + 1;
                i11 = ((C6434s) AbstractC6663m.m12750N(r72)).f31037a + 1;
            } else {
                C6434s c6434s2 = (C6434s) AbstractC6663m.m12742F(r72);
                i10 = (x0Var == x0.Vertical ? c6434s2.f31052p : c6434s2.f31053q) - 1;
                i11 = ((C6434s) AbstractC6663m.m12742F(r72)).f31037a - 1;
            }
            if (i11 < 0 || i11 >= c6433r.f31033o) {
                return;
            }
            if (i10 == j0Var.f23654a || i10 < 0) {
                list = r72;
            } else {
                if (j0Var.f23655b != z6) {
                    Object[] objArr = c4640e.f22884a;
                    int i12 = c4640e.f22886c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((s1.g0) objArr[i13]).cancel();
                    }
                }
                j0Var.f23655b = z6;
                j0Var.f23654a = i10;
                c4640e.m9511h();
                C4327p c4327p = this.f31089p;
                c4327p.getClass();
                ArrayList arrayList = new ArrayList();
                C6440y c6440y = (C6440y) c4327p.f21788b;
                AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
                InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
                AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
                try {
                    C6433r c6433r2 = c6440y.f31075b ? c6440y.f31076c : (C6433r) c6440y.f31078e.getValue();
                    if (c6433r2 != null) {
                        List list2 = (List) c6433r2.f31029k.invoke(Integer.valueOf(i10));
                        int size = list2.size();
                        int i14 = 0;
                        r72 = r72;
                        while (i14 < size) {
                            C6361k c6361k = (C6361k) list2.get(i14);
                            C6440y c6440y2 = c6440y;
                            Object obj = r72;
                            arrayList.add(c6440y.f31088o.m12849a(((Number) c6361k.f30755a).intValue(), ((C6745a) c6361k.f30756b).f32195a));
                            i14++;
                            c6440y = c6440y2;
                            r72 = obj;
                        }
                    }
                    list = r72;
                    AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                    c4640e.m9508d(arrayList, c4640e.f22886c);
                } catch (Throwable th2) {
                    AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                    throw th2;
                }
            }
            if (!z6) {
                if (c6433r.f31031m - ca.m11578b((C6434s) AbstractC6663m.m12742F(list), x0Var) < f6) {
                    Object[] objArr2 = c4640e.f22884a;
                    int i15 = c4640e.f22886c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        ((s1.g0) objArr2[i16]).mo12848a();
                    }
                    return;
                }
                return;
            }
            C6434s c6434s3 = (C6434s) AbstractC6663m.m12750N(list);
            if (((ca.m11578b(c6434s3, x0Var) + ((int) (x0Var == x0.Vertical ? c6434s3.f31050n & 4294967295L : c6434s3.f31050n >> 32))) + c6433r.f31036r) - c6433r.f31032n < (-f6)) {
                Object[] objArr3 = c4640e.f22884a;
                int i17 = c4640e.f22886c;
                for (int i18 = 0; i18 < i17; i18++) {
                    ((s1.g0) objArr3[i18]).mo12848a();
                }
            }
        }
    }
}
