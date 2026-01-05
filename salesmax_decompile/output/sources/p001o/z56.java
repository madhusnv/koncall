package p001o;

/* loaded from: classes6.dex */
public final class z56 implements oh8 {

    /* renamed from: a */
    public final boolean f56561a;

    public z56(boolean z) {
        this.f56561a = z;
    }

    @Override // p001o.oh8
    /* renamed from: a */
    public boolean mo18081a() {
        return this.f56561a;
    }

    @Override // p001o.oh8
    /* renamed from: b */
    public b0c mo18082b() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo18081a() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
