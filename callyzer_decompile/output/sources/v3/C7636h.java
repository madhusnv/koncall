package v3;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3974w;
import k2.i2;
import kotlin.jvm.internal.AbstractC4155m;
import lv.C4535g;
import m2.C4640e;
import s2.C6738g;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import w2.AbstractC7878q;
import w2.InterfaceC7879r;
import w3.t2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.h */
/* loaded from: classes.dex */
public final class C7636h extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: b */
    public static final C7636h f36873b;

    /* renamed from: c */
    public static final C7636h f36874c;

    /* renamed from: d */
    public static final C7636h f36875d;

    /* renamed from: e */
    public static final C7636h f36876e;

    /* renamed from: a */
    public final /* synthetic */ int f36877a;

    static {
        int i10 = 2;
        f36873b = new C7636h(i10, 0);
        f36874c = new C7636h(i10, 1);
        f36875d = new C7636h(i10, 2);
        f36876e = new C7636h(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7636h(int i10, int i11) {
        super(i10);
        this.f36877a = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36877a) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC7639k) obj).getClass();
                break;
            case 1:
                ((g0) ((InterfaceC7639k) obj)).b0((t3.j0) obj2);
                break;
            case 2:
                ((g0) ((InterfaceC7639k) obj)).c0((InterfaceC7879r) obj2);
                break;
            default:
                InterfaceC3974w interfaceC3974w = (InterfaceC3974w) obj2;
                g0 g0Var = (g0) ((InterfaceC7639k) obj);
                g0Var.f36828F = interfaceC3974w;
                C4535g c4535g = g0Var.f36832K;
                i2 i2Var = w3.k1.f37836h;
                C6738g c6738g = (C6738g) interfaceC3974w;
                c6738g.getClass();
                g0Var.m14592Z((InterfaceC6747c) C3953b.m8518u(c6738g, i2Var));
                EnumC6757m enumC6757m = (EnumC6757m) C3953b.m8518u(c6738g, w3.k1.f37842n);
                if (g0Var.f36826D != enumC6757m) {
                    g0Var.f36826D = enumC6757m;
                    g0Var.m14575E();
                    g0 g0VarM14609v = g0Var.m14609v();
                    if (g0VarM14609v != null) {
                        g0VarM14609v.m14573C();
                    }
                    g0Var.m14574D();
                    for (AbstractC7878q abstractC7878q = (AbstractC7878q) c4535g.f22542f; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
                        abstractC7878q.mo152I();
                    }
                }
                g0Var.d0((t2) C3953b.m8518u(c6738g, w3.k1.f37847s));
                AbstractC7878q abstractC7878q2 = (AbstractC7878q) c4535g.f22542f;
                if ((abstractC7878q2.f37673d & 32768) != 0) {
                    while (abstractC7878q2 != null) {
                        if ((abstractC7878q2.f37672c & 32768) != 0) {
                            AbstractC7642n abstractC7642nM14545f = abstractC7878q2;
                            ?? c4640e = 0;
                            while (abstractC7642nM14545f != 0) {
                                if (abstractC7642nM14545f instanceof InterfaceC7640l) {
                                    AbstractC7878q abstractC7878q3 = ((AbstractC7878q) ((InterfaceC7640l) abstractC7642nM14545f)).f37670a;
                                    if (abstractC7878q3.f37683p) {
                                        i1.m14626c(abstractC7878q3);
                                    } else {
                                        abstractC7878q3.f37679k = true;
                                    }
                                } else if ((abstractC7642nM14545f.f37672c & 32768) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                    AbstractC7878q abstractC7878q4 = abstractC7642nM14545f.f36953r;
                                    int i10 = 0;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e = c4640e;
                                    while (abstractC7878q4 != null) {
                                        if ((abstractC7878q4.f37672c & 32768) != 0) {
                                            i10++;
                                            c4640e = c4640e;
                                            if (i10 == 1) {
                                                abstractC7642nM14545f = abstractC7878q4;
                                            } else {
                                                if (c4640e == 0) {
                                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7642nM14545f != 0) {
                                                    c4640e.m9506b(abstractC7642nM14545f);
                                                    abstractC7642nM14545f = 0;
                                                }
                                                c4640e.m9506b(abstractC7878q4);
                                            }
                                        }
                                        abstractC7878q4 = abstractC7878q4.f37675f;
                                        abstractC7642nM14545f = abstractC7642nM14545f;
                                        c4640e = c4640e;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                            }
                        }
                        if ((abstractC7878q2.f37673d & 32768) != 0) {
                            abstractC7878q2 = abstractC7878q2.f37675f;
                        }
                    }
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
