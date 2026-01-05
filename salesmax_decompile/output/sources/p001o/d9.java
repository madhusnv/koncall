package p001o;

import java.util.Random;

/* loaded from: classes6.dex */
public abstract class d9 extends vbe {
    @Override // p001o.vbe
    /* renamed from: b */
    public int mo22610b(int i) {
        return ybe.m57476f(mo18509j().nextInt(), i);
    }

    @Override // p001o.vbe
    /* renamed from: c */
    public double mo22611c() {
        return mo18509j().nextDouble();
    }

    @Override // p001o.vbe
    /* renamed from: f */
    public int mo22612f() {
        return mo18509j().nextInt();
    }

    @Override // p001o.vbe
    /* renamed from: g */
    public int mo22613g(int i) {
        return mo18509j().nextInt(i);
    }

    @Override // p001o.vbe
    /* renamed from: i */
    public long mo22614i() {
        return mo18509j().nextLong();
    }

    /* renamed from: j */
    public abstract Random mo18509j();
}
