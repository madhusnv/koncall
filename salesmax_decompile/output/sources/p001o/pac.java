package p001o;

import java.util.List;
import java.util.Set;
import p001o.ux7;

/* loaded from: classes3.dex */
public final class pac implements ux7 {

    /* renamed from: c */
    public final wx7 f39706c;

    /* renamed from: d */
    public final boolean f39707d;

    public pac(wx7 wx7Var) {
        sq8.m48649h(wx7Var, "headers");
        this.f39706c = wx7Var;
        this.f39707d = true;
    }

    @Override // p001o.xri
    /* renamed from: a */
    public boolean mo17771a() {
        return this.f39707d;
    }

    @Override // p001o.xri
    /* renamed from: b */
    public Set mo17772b() {
        return this.f39706c.m55332v().entrySet();
    }

    @Override // p001o.xri
    /* renamed from: c */
    public List mo17773c(String str) {
        sq8.m48649h(str, "name");
        List listM55334y = this.f39706c.m55334y(str);
        if (listM55334y.isEmpty()) {
            return null;
        }
        return listM55334y;
    }

    @Override // p001o.xri
    public boolean contains(String str) {
        sq8.m48649h(str, "name");
        return this.f39706c.m55327d(str) != null;
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

    @Override // p001o.xri
    public boolean isEmpty() {
        return this.f39706c.size() == 0;
    }

    @Override // p001o.xri
    public Set names() {
        return this.f39706c.m55330n();
    }
}
