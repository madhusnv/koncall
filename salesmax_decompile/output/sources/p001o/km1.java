package p001o;

import java.util.LinkedHashMap;
import java.util.Map;
import p001o.xej;

/* loaded from: classes3.dex */
public final class km1 implements tej {

    /* renamed from: a */
    public final boolean f32415a;

    /* renamed from: b */
    public final StringBuilder f32416b = new StringBuilder();

    /* renamed from: c */
    public final Map f32417c = new LinkedHashMap();

    /* renamed from: d */
    public final oo0 f32418d = new oo0();

    public km1(boolean z) {
        this.f32415a = z;
    }

    @Override // p001o.tej
    /* renamed from: a */
    public byte[] mo35893a() {
        return e9g.m24603u(m35899g());
    }

    @Override // p001o.tej
    /* renamed from: b */
    public tej mo35894b(String str, String str2) {
        sq8.m48649h(str, "name");
        aj9 aj9Var = (aj9) this.f32418d.m42469G();
        aj9 aj9Var2 = new aj9(this.f32415a, (aj9Var != null ? aj9Var.m17209f() : -1) + 1, new xej.C18137d(str, str2), this.f32417c);
        this.f32417c.clear();
        if (aj9Var != null) {
            aj9Var.m17208e(aj9Var2);
        }
        this.f32418d.m42481o(aj9Var2);
        return this;
    }

    @Override // p001o.tej
    /* renamed from: c */
    public void mo35895c(String str, String str2) {
        sq8.m48649h(str, "uri");
        this.f32417c.put(str2 == null ? new xej.C18137d("xmlns", null, 2, null) : new xej.C18137d(str2, "xmlns"), str);
    }

    @Override // p001o.tej
    /* renamed from: d */
    public tej mo35896d(String str, String str2) {
        sq8.m48649h(str, "name");
        return m35898f(new xej.C18137d(str, str2));
    }

    /* renamed from: e */
    public void m35897e() {
        aj9 aj9Var = (aj9) this.f32418d.m42469G();
        while (aj9Var != null) {
            m35898f(aj9Var.m17210g());
            aj9Var = (aj9) this.f32418d.m42469G();
        }
    }

    /* renamed from: f */
    public final tej m35898f(xej.C18137d c18137d) {
        aj9 aj9Var = (aj9) this.f32418d.m42477R();
        if (aj9Var == null) {
            throw new hff("Unexpected end of tag while no tags are open");
        }
        if (sq8.m48644c(aj9Var.m17210g(), c18137d)) {
            if (this.f32418d.isEmpty()) {
                aj9Var.m17212i(this.f32416b);
            }
            return this;
        }
        throw new hff("Tried to end tag " + c18137d + " but expected end of " + aj9Var.m17210g() + " tag");
    }

    /* renamed from: g */
    public String m35899g() {
        m35897e();
        String string = this.f32416b.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: h */
    public final aj9 m35900h() {
        if (this.f32418d.isEmpty()) {
            throw new hff("Attempted to serialize text or attribute without containing tag");
        }
        return (aj9) this.f32418d.last();
    }

    @Override // p001o.tej
    public tej text(String str) {
        sq8.m48649h(str, "text");
        m35900h().m17211h(str);
        return this;
    }
}
