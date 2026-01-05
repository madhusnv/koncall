package p001o;

import java.util.List;
import java.util.Set;
import p001o.ek5;

/* loaded from: classes3.dex */
public final class g66 implements ek5 {

    /* renamed from: c */
    public static final g66 f24629c = new g66();

    /* renamed from: d */
    public static final boolean f24630d = true;

    @Override // p001o.xri
    /* renamed from: a */
    public boolean mo17771a() {
        return f24630d;
    }

    @Override // p001o.xri
    /* renamed from: b */
    public Set mo17772b() {
        return nif.m40664e();
    }

    @Override // p001o.xri
    /* renamed from: c */
    public List mo17773c(String str) {
        sq8.m48649h(str, "name");
        return ch3.m21246k();
    }

    @Override // p001o.xri
    /* renamed from: d */
    public void mo17774d(nl7 nl7Var) {
        ek5.C13210b.m25186a(this, nl7Var);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ek5) && ((ek5) obj).isEmpty();
    }

    @Override // p001o.xri
    public boolean isEmpty() {
        return true;
    }

    @Override // p001o.xri
    public Set names() {
        return nif.m40664e();
    }
}
