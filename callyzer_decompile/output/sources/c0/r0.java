package c0;

import h0.C2764d;
import i0.C3082m;
import i0.d2;
import i0.e2;
import i0.f2;
import i0.g2;
import i0.y2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import p020v.C7602l;
import p020v.C7612v;
import p020v.RunnableC7605o;
import pg.i7;
import pg.o7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements d2 {

    /* renamed from: a */
    public final /* synthetic */ int f5205a;

    /* renamed from: b */
    public final /* synthetic */ Object f5206b;

    public /* synthetic */ r0(int i10, Object obj) {
        this.f5205a = i10;
        this.f5206b = obj;
    }

    @Override // i0.d2
    /* renamed from: a */
    public final void mo2191a(g2 g2Var, e2 e2Var) {
        switch (this.f5205a) {
            case 0:
                v0 v0Var = (v0) this.f5206b;
                if (v0Var.m2152c() == null) {
                    return;
                }
                C2764d c2764d = v0Var.f5252v;
                c2764d.getClass();
                o7.m11806a();
                c2764d.f15335d = true;
                v0Var.m2233D(true);
                String strM2154e = v0Var.m2154e();
                i0.z0 z0Var = (i0.z0) v0Var.f5052g;
                C3082m c3082m = v0Var.f5053h;
                c3082m.getClass();
                i0.b2 b2VarM2234E = v0Var.m2234E(strM2154e, z0Var, c3082m);
                v0Var.f5250t = b2VarM2234E;
                Object[] objArr = {b2VarM2234E.m7305d()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                v0Var.m2149C(Collections.unmodifiableList(arrayList));
                v0Var.m2165p();
                C2764d c2764d2 = v0Var.f5252v;
                c2764d2.getClass();
                o7.m11806a();
                c2764d2.f15335d = false;
                c2764d2.m6756b();
                return;
            case 1:
                k1 k1Var = (k1) this.f5206b;
                if (k1Var.m2152c() == null) {
                    return;
                }
                k1Var.m2210F((i0.r1) k1Var.f5052g, k1Var.f5053h);
                k1Var.m2165p();
                return;
            case 2:
                ArrayList arrayList2 = ((f2) this.f5206b).f16459n;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    ((d2) obj2).mo2191a(g2Var, e2Var);
                }
                return;
            default:
                p020v.x0 x0Var = (p020v.x0) this.f5206b;
                x0Var.f36755c = x0Var.m14484n();
                C7602l c7602l = (C7602l) x0Var.f36758f;
                if (c7602l != null) {
                    C7612v c7612v = c7602l.f36621b;
                    try {
                        if (((Boolean) i7.m11697b(new C7602l(c7612v, 3)).f39850b.get()).booleanValue()) {
                            p020v.x0 x0Var2 = c7612v.f36708F;
                            g2 g2Var2 = (g2) x0Var2.f36755c;
                            p020v.w0 w0Var = (p020v.w0) x0Var2.f36756d;
                            c7612v.f36721c.execute(new RunnableC7605o(c7612v, C7612v.m14436z(x0Var2), g2Var2, w0Var, null, Collections.singletonList(y2.METERING_REPEATING), 2));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e2) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e2);
                    }
                }
                return;
        }
    }
}
