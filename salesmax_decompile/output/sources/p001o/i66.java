package p001o;

import java.util.List;
import java.util.Set;
import p001o.ux7;

/* loaded from: classes3.dex */
public final class i66 implements ux7 {

    /* renamed from: c */
    public static final i66 f28149c = new i66();

    /* renamed from: d */
    public static final boolean f28150d = true;

    @Override // p001o.xri
    /* renamed from: a */
    public boolean mo17771a() {
        return f28150d;
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
    public boolean contains(String str) {
        sq8.m48649h(str, "name");
        return false;
    }

    @Override // p001o.xri
    /* renamed from: d */
    public void mo17774d(nl7 nl7Var) {
        ux7.C17468b.m52101a(this, nl7Var);
    }

    @Override // p001o.xri
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(String str) {
        return ux7.C17468b.m52102b(this, str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ux7) && ((ux7) obj).isEmpty();
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
