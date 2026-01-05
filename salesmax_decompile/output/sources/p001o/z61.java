package p001o;

/* loaded from: classes2.dex */
public final class z61 implements x61 {

    /* renamed from: a */
    public final int f56576a;

    /* renamed from: b */
    public final int f56577b;

    /* renamed from: c */
    public final int f56578c;

    /* renamed from: d */
    public final int f56579d;

    public z61(int i, int i2, int i3, int i4) {
        this.f56576a = i;
        this.f56577b = i2;
        this.f56578c = i3;
        this.f56579d = i4;
    }

    /* renamed from: b */
    public static z61 m58834b(zwc zwcVar) {
        int iM60040u = zwcVar.m60040u();
        zwcVar.m60018V(8);
        int iM60040u2 = zwcVar.m60040u();
        int iM60040u3 = zwcVar.m60040u();
        zwcVar.m60018V(4);
        int iM60040u4 = zwcVar.m60040u();
        zwcVar.m60018V(12);
        return new z61(iM60040u, iM60040u2, iM60040u3, iM60040u4);
    }

    /* renamed from: a */
    public boolean m58835a() {
        return (this.f56577b & 16) == 16;
    }

    @Override // p001o.x61
    public int getType() {
        return 1751742049;
    }
}
