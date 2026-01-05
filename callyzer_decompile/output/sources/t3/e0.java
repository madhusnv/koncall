package t3;

import lv.C4535g;
import m2.C4637b;
import m2.C4640e;
import s3.AbstractC6744a;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.a2;
import v3.z1;
import w2.AbstractC7878q;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 implements d1 {

    /* renamed from: a */
    public final /* synthetic */ f0 f33974a;

    /* renamed from: b */
    public final /* synthetic */ Object f33975b;

    public e0(f0 f0Var, Object obj) {
        this.f33974a = f0Var;
        this.f33975b = obj;
    }

    @Override // t3.d1
    /* renamed from: a */
    public final int mo13282a() {
        v3.g0 g0Var = (v3.g0) this.f33974a.f33988k.m5574g(this.f33975b);
        if (g0Var != null) {
            return ((C4637b) g0Var.m14603p()).f22878a.f22886c;
        }
        return 0;
    }

    @Override // t3.d1
    /* renamed from: b */
    public final void mo13283b(int i10, long j6) {
        f0 f0Var = this.f33974a;
        v3.g0 g0Var = (v3.g0) f0Var.f33988k.m5574g(this.f33975b);
        if (g0Var == null || !g0Var.m14578H()) {
            return;
        }
        int i11 = ((C4637b) g0Var.m14603p()).f22878a.f22886c;
        if (i10 < 0 || i10 >= i11) {
            AbstractC6744a.m12909d("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
        if (g0Var.m14579I()) {
            AbstractC6744a.m12906a("Pre-measure called on node that is not placed");
        }
        v3.g0 g0Var2 = f0Var.f33979a;
        g0Var2.f36858s = true;
        ((C7904v) v3.j0.m14636a(g0Var)).m15039v((v3.g0) ((C4637b) g0Var.m14603p()).get(i10), j6);
        g0Var2.f36858s = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [o1.k0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // t3.d1
    /* renamed from: c */
    public final void mo13284c(o1.k0 k0Var) {
        C4535g c4535g;
        AbstractC7878q abstractC7878q;
        v3.g0 g0Var = (v3.g0) this.f33974a.f33988k.m5574g(this.f33975b);
        if (g0Var == null || (c4535g = g0Var.f36832K) == null || (abstractC7878q = (AbstractC7878q) c4535g.f22542f) == null) {
            return;
        }
        if (!abstractC7878q.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitSubtreeIf called on an unattached node");
        }
        C4640e c4640e = new C4640e(new AbstractC7878q[16]);
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37670a;
        AbstractC7878q abstractC7878q3 = abstractC7878q2.f37675f;
        if (abstractC7878q3 == null) {
            AbstractC7634f.m14541b(c4640e, abstractC7878q2);
        } else {
            c4640e.m9506b(abstractC7878q3);
        }
        while (true) {
            int i10 = c4640e.f22886c;
            if (i10 == 0) {
                return;
            }
            AbstractC7878q abstractC7878q4 = (AbstractC7878q) c4640e.m9515m(i10 - 1);
            if ((abstractC7878q4.f37673d & 262144) != 0) {
                for (AbstractC7878q abstractC7878q5 = abstractC7878q4; abstractC7878q5 != null; abstractC7878q5 = abstractC7878q5.f37675f) {
                    if ((abstractC7878q5.f37672c & 262144) != 0) {
                        AbstractC7642n abstractC7642nM14545f = abstractC7878q5;
                        ?? c4640e2 = 0;
                        while (abstractC7642nM14545f != 0) {
                            if (abstractC7642nM14545f instanceof a2) {
                                a2 a2Var = (a2) abstractC7642nM14545f;
                                z1 z1Var = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(a2Var.mo7492h()) ? (z1) k0Var.invoke(a2Var) : z1.ContinueTraversal;
                                if (z1Var == z1.CancelTraversal) {
                                    return;
                                }
                                if (z1Var == z1.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((abstractC7642nM14545f.f37672c & 262144) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                AbstractC7878q abstractC7878q6 = abstractC7642nM14545f.f36953r;
                                int i11 = 0;
                                abstractC7642nM14545f = abstractC7642nM14545f;
                                c4640e2 = c4640e2;
                                while (abstractC7878q6 != null) {
                                    if ((abstractC7878q6.f37672c & 262144) != 0) {
                                        i11++;
                                        c4640e2 = c4640e2;
                                        if (i11 == 1) {
                                            abstractC7642nM14545f = abstractC7878q6;
                                        } else {
                                            if (c4640e2 == 0) {
                                                c4640e2 = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7642nM14545f != 0) {
                                                c4640e2.m9506b(abstractC7642nM14545f);
                                                abstractC7642nM14545f = 0;
                                            }
                                            c4640e2.m9506b(abstractC7878q6);
                                        }
                                    }
                                    abstractC7878q6 = abstractC7878q6.f37675f;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e2 = c4640e2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e2);
                        }
                    }
                }
            }
            AbstractC7634f.m14541b(c4640e, abstractC7878q4);
        }
    }

    @Override // t3.d1
    public final void dispose() {
        f0 f0Var = this.f33974a;
        v3.g0 g0Var = f0Var.f33979a;
        f0Var.m13287d();
        v3.g0 g0Var2 = (v3.g0) f0Var.f33988k.m5577j(this.f33975b);
        if (g0Var2 != null) {
            if (f0Var.f33993q <= 0) {
                AbstractC6744a.m12907b("No pre-composed items to dispose");
            }
            int iM9513k = ((C4637b) g0Var.m14604q()).f22878a.m9513k(g0Var2);
            if (iM9513k < ((C4637b) g0Var.m14604q()).f22878a.f22886c - f0Var.f33993q) {
                AbstractC6744a.m12907b("Item is not in pre-composed item range");
            }
            f0Var.f33992p++;
            f0Var.f33993q--;
            int i10 = (((C4637b) g0Var.m14604q()).f22878a.f22886c - f0Var.f33993q) - f0Var.f33992p;
            g0Var.f36858s = true;
            g0Var.m14582L(iM9513k, i10, 1);
            g0Var.f36858s = false;
            f0Var.m13286c(i10);
        }
    }
}
