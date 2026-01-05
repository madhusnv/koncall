package i1;

import ex.InterfaceC2139c;
import g2.b7;
import k2.C3972u;
import k2.InterfaceC3968q;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f16914a;

    /* renamed from: b */
    public final /* synthetic */ int f16915b;

    /* renamed from: c */
    public final /* synthetic */ Object f16916c;

    /* renamed from: d */
    public final /* synthetic */ Object f16917d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, int i10, Object obj2, int i11) {
        super(1);
        this.f16914a = i11;
        this.f16916c = obj;
        this.f16915b = i10;
        this.f16917d = obj2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC3968q interfaceC3968q;
        long[] jArr;
        InterfaceC3968q interfaceC3968q2;
        long[] jArr2;
        int i10;
        switch (this.f16914a) {
            case 0:
                t3.v0 v0Var = (t3.v0) obj;
                m1 m1Var = (m1) this.f16916c;
                int iM8526f = m1Var.f16928q.f16953a.m8526f();
                if (iM8526f < 0) {
                    iM8526f = 0;
                }
                int i11 = this.f16915b;
                if (iM8526f > i11) {
                    iM8526f = i11;
                }
                int i12 = -iM8526f;
                boolean z6 = m1Var.f16929r;
                int i13 = z6 ? 0 : i12;
                if (!z6) {
                    i12 = 0;
                }
                b7 b7Var = new b7((t3.w0) this.f16917d, i13, i12, 1);
                v0Var.f34028a = true;
                b7Var.invoke(v0Var);
                v0Var.f34028a = false;
                break;
            default:
                InterfaceC3968q interfaceC3968q3 = (InterfaceC3968q) obj;
                e1.d0 d0Var = (e1.d0) this.f16917d;
                k2.n1 n1Var = (k2.n1) this.f16916c;
                int i14 = n1Var.f20444e;
                int i15 = this.f16915b;
                if (i14 == i15 && AbstractC4154l.m8918a(d0Var, n1Var.f20445f) && (interfaceC3968q3 instanceof C3972u)) {
                    long[] jArr3 = d0Var.f8947a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j6 = jArr3[i16];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8;
                                int i18 = 8 - ((~(i16 - length)) >>> 31);
                                int i19 = 0;
                                while (i19 < i18) {
                                    if ((255 & j6) < 128) {
                                        int i20 = (i16 << 3) + i19;
                                        Object obj2 = d0Var.f8948b[i20];
                                        boolean z10 = d0Var.f8949c[i20] != i15;
                                        if (z10) {
                                            i10 = i17;
                                            C3972u c3972u = (C3972u) interfaceC3968q3;
                                            interfaceC3968q2 = interfaceC3968q3;
                                            e1.j0 j0Var = c3972u.f20563g;
                                            fb.b0.m5942c(j0Var, obj2, n1Var);
                                            jArr2 = jArr3;
                                            if (obj2 instanceof k2.c0) {
                                                k2.c0 c0Var = (k2.c0) obj2;
                                                if (!j0Var.m5570c(c0Var)) {
                                                    fb.b0.m5943d(c3972u.f20566k, c0Var);
                                                }
                                                e1.j0 j0Var2 = n1Var.f20446g;
                                                if (j0Var2 != null) {
                                                    j0Var2.m5577j(obj2);
                                                }
                                            }
                                        } else {
                                            interfaceC3968q2 = interfaceC3968q3;
                                            jArr2 = jArr3;
                                            i10 = i17;
                                        }
                                        if (z10) {
                                            d0Var.m5538g(i20);
                                        }
                                    } else {
                                        interfaceC3968q2 = interfaceC3968q3;
                                        jArr2 = jArr3;
                                        i10 = i17;
                                    }
                                    j6 >>= i10;
                                    i19++;
                                    i17 = i10;
                                    interfaceC3968q3 = interfaceC3968q2;
                                    jArr3 = jArr2;
                                }
                                interfaceC3968q = interfaceC3968q3;
                                jArr = jArr3;
                                if (i18 == i17) {
                                }
                            } else {
                                interfaceC3968q = interfaceC3968q3;
                                jArr = jArr3;
                            }
                            if (i16 != length) {
                                i16++;
                                interfaceC3968q3 = interfaceC3968q;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
