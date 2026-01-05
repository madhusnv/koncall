package u3;

import lv.C4535g;
import m2.C4640e;
import pg.AbstractC5940u;
import s3.AbstractC6744a;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.InterfaceC7641m;
import v3.g0;
import v3.x1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u3.e */
/* loaded from: classes.dex */
public interface InterfaceC7334e extends InterfaceC7335f, InterfaceC7641m {
    /* renamed from: N */
    default AbstractC5940u mo12851N() {
        return C7331b.f34946a;
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
    /* JADX WARN: Type inference failed for: r9v0, types: [u3.e, v3.m] */
    @Override // u3.InterfaceC7335f
    /* renamed from: d */
    default Object mo13728d(C7336g c7336g) {
        C4535g c4535g;
        AbstractC7878q abstractC7878q = (AbstractC7878q) this;
        if (!abstractC7878q.f37670a.f37683p) {
            AbstractC6744a.m12906a("ModifierLocal accessed from an unattached node");
        }
        if (!abstractC7878q.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitAncestors called on an unattached node");
        }
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37670a.f37674e;
        g0 g0VarM14563x = AbstractC7634f.m14563x(this);
        while (g0VarM14563x != null) {
            if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 32) != 0) {
                while (abstractC7878q2 != null) {
                    if ((abstractC7878q2.f37672c & 32) != 0) {
                        AbstractC7642n abstractC7642nM14545f = abstractC7878q2;
                        ?? c4640e = 0;
                        while (abstractC7642nM14545f != 0) {
                            if (abstractC7642nM14545f instanceof InterfaceC7334e) {
                                InterfaceC7334e interfaceC7334e = (InterfaceC7334e) abstractC7642nM14545f;
                                if (interfaceC7334e.mo12851N().mo11878a(c7336g)) {
                                    return interfaceC7334e.mo12851N().mo11879b(c7336g);
                                }
                            } else if ((abstractC7642nM14545f.f37672c & 32) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                AbstractC7878q abstractC7878q3 = abstractC7642nM14545f.f36953r;
                                int i10 = 0;
                                abstractC7642nM14545f = abstractC7642nM14545f;
                                c4640e = c4640e;
                                while (abstractC7878q3 != null) {
                                    if ((abstractC7878q3.f37672c & 32) != 0) {
                                        i10++;
                                        c4640e = c4640e;
                                        if (i10 == 1) {
                                            abstractC7642nM14545f = abstractC7878q3;
                                        } else {
                                            if (c4640e == 0) {
                                                c4640e = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7642nM14545f != 0) {
                                                c4640e.m9506b(abstractC7642nM14545f);
                                                abstractC7642nM14545f = 0;
                                            }
                                            c4640e.m9506b(abstractC7878q3);
                                        }
                                    }
                                    abstractC7878q3 = abstractC7878q3.f37675f;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e = c4640e;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                        }
                    }
                    abstractC7878q2 = abstractC7878q2.f37674e;
                }
            }
            g0VarM14563x = g0VarM14563x.m14609v();
            abstractC7878q2 = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? null : (x1) c4535g.f22541e;
        }
        return c7336g.f34953a.invoke();
    }
}
