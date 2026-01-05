package pc;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import nf.C5047i;
import nz.C5206q;
import nz.C5207r;
import qw.a0;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.d */
/* loaded from: classes.dex */
public final class C5876d implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f28659a;

    /* renamed from: b */
    public final /* synthetic */ int f28660b;

    /* renamed from: c */
    public final /* synthetic */ Object f28661c;

    /* renamed from: d */
    public final /* synthetic */ Object f28662d;

    public /* synthetic */ C5876d(int i10, C5206q c5206q, C5878f c5878f, int i11) {
        this.f28659a = i11;
        this.f28660b = i10;
        this.f28661c = c5206q;
        this.f28662d = c5878f;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f28659a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("connection acquired: conn(id=");
                sb2.append(this.f28660b);
                sb2.append(")=");
                sb2.append((C5206q) this.f28661c);
                sb2.append("; connPool: total=");
                C5047i c5047i = ((C5878f) this.f28662d).f28665b;
                sb2.append(((C5207r) c5047i.f24823b).f25402g.size());
                sb2.append(", idle=");
                sb2.append(c5047i.m9978I());
                return sb2.toString();
            case 1:
                StringBuilder sb3 = new StringBuilder("connection released: conn(id=");
                sb3.append(this.f28660b);
                sb3.append(")=");
                sb3.append((C5206q) this.f28661c);
                sb3.append("; connPool: total=");
                C5047i c5047i2 = ((C5878f) this.f28662d).f28665b;
                sb3.append(((C5207r) c5047i2.f24823b).f25402g.size());
                sb3.append(", idle=");
                sb3.append(c5047i2.m9978I());
                return sb3.toString();
            default:
                C7320q c7320q = (C7320q) this.f28661c;
                int i10 = this.f28660b;
                if (c7320q.contains(Integer.valueOf(i10))) {
                    c7320q.remove(Integer.valueOf(i10));
                } else {
                    c7320q.add(Integer.valueOf(i10));
                }
                ((InterfaceC2139c) this.f28662d).invoke(c7320q.m13701r().f34901c);
                return a0.f30746a;
        }
    }

    public C5876d(C7320q c7320q, int i10, InterfaceC2139c interfaceC2139c) {
        this.f28659a = 2;
        this.f28661c = c7320q;
        this.f28660b = i10;
        this.f28662d = interfaceC2139c;
    }
}
