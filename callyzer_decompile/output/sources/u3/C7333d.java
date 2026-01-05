package u3;

import e1.e0;
import java.util.HashSet;
import m2.C4640e;
import o6.b0;
import s3.AbstractC6744a;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.C7631c;
import v3.g0;
import w2.AbstractC7878q;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u3.d */
/* loaded from: classes.dex */
public final class C7333d {

    /* renamed from: a */
    public final C7904v f34947a;

    /* renamed from: b */
    public final C4640e f34948b = new C4640e(new C7631c[16]);

    /* renamed from: c */
    public final C4640e f34949c = new C4640e(new C7336g[16]);

    /* renamed from: d */
    public final C4640e f34950d = new C4640e(new g0[16]);

    /* renamed from: e */
    public final C4640e f34951e = new C4640e(new C7336g[16]);

    /* renamed from: f */
    public boolean f34952f;

    public C7333d(C7904v c7904v) {
        this.f34947a = c7904v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: b */
    public static void m13726b(AbstractC7878q abstractC7878q, C7336g c7336g, HashSet hashSet) {
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
            if ((abstractC7878q4.f37673d & 32) != 0) {
                for (AbstractC7878q abstractC7878q5 = abstractC7878q4; abstractC7878q5 != null; abstractC7878q5 = abstractC7878q5.f37675f) {
                    if ((abstractC7878q5.f37672c & 32) != 0) {
                        AbstractC7642n abstractC7642nM14545f = abstractC7878q5;
                        ?? c4640e2 = 0;
                        while (abstractC7642nM14545f != 0) {
                            if (abstractC7642nM14545f instanceof InterfaceC7334e) {
                                InterfaceC7334e interfaceC7334e = (InterfaceC7334e) abstractC7642nM14545f;
                                if (interfaceC7334e instanceof C7631c) {
                                    C7631c c7631c = (C7631c) interfaceC7334e;
                                    if ((c7631c.f36789q instanceof InterfaceC7332c) && c7631c.f36791s.contains(c7336g)) {
                                        hashSet.add(interfaceC7334e);
                                    }
                                }
                                if (interfaceC7334e.mo12851N().mo11878a(c7336g)) {
                                    break;
                                }
                            } else if ((abstractC7642nM14545f.f37672c & 32) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                AbstractC7878q abstractC7878q6 = abstractC7642nM14545f.f36953r;
                                int i11 = 0;
                                abstractC7642nM14545f = abstractC7642nM14545f;
                                c4640e2 = c4640e2;
                                while (abstractC7878q6 != null) {
                                    if ((abstractC7878q6.f37672c & 32) != 0) {
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

    /* renamed from: a */
    public final void m13727a() {
        if (this.f34952f) {
            return;
        }
        this.f34952f = true;
        b0 b0Var = new b0(9, this);
        e0 e0Var = this.f34947a.A1;
        if (e0Var.m5548f(b0Var) >= 0) {
            return;
        }
        e0Var.m5543a(b0Var);
    }
}
