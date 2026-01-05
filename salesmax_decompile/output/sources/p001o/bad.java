package p001o;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes6.dex */
public final class bad extends d9 {
    @Override // p001o.vbe
    /* renamed from: d */
    public double mo18507d(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // p001o.vbe
    /* renamed from: h */
    public int mo18508h(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // p001o.d9
    /* renamed from: j */
    public Random mo18509j() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        sq8.m48648g(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
