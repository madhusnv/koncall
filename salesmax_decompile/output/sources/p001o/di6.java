package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public abstract class di6 implements Map.Entry, sb9 {

    /* renamed from: a */
    public final Map.Entry f19930a;

    /* renamed from: b */
    public final xk7 f19931b;

    /* renamed from: c */
    public final xk7 f19932c;

    public di6(Map.Entry entry, xk7 xk7Var, xk7 xk7Var2) {
        sq8.m48649h(entry, "src");
        sq8.m48649h(xk7Var, "kSrc2Dest");
        sq8.m48649h(xk7Var2, "vSrc2Dest");
        this.f19930a = entry;
        this.f19931b = xk7Var;
        this.f19932c = xk7Var2;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f19931b.invoke(this.f19930a.getKey());
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f19932c.invoke(this.f19930a.getValue());
    }
}
