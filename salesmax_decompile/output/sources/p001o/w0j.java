package p001o;

import java.util.UUID;

/* loaded from: classes2.dex */
public class w0j extends mf7 {

    /* renamed from: b */
    public final String f51255b;

    /* renamed from: c */
    public int f51256c;

    public w0j(u92 u92Var) {
        super(u92Var);
        this.f51255b = "virtual-" + u92Var.mo38380b() + "-" + UUID.randomUUID().toString();
    }

    @Override // p001o.mf7, p001o.t92
    /* renamed from: a */
    public int mo38379a() {
        return mo38387j(0);
    }

    @Override // p001o.mf7, p001o.u92
    /* renamed from: b */
    public String mo38380b() {
        return this.f51255b;
    }

    @Override // p001o.mf7, p001o.t92
    /* renamed from: j */
    public int mo38387j(int i) {
        return wuh.m55052u(super.mo38387j(i) - this.f51256c);
    }

    /* renamed from: l */
    public void m53765l(int i) {
        this.f51256c = i;
    }
}
