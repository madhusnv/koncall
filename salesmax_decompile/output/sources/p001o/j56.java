package p001o;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class j56 {

    /* renamed from: a */
    public long f29796a;

    /* renamed from: b */
    public float f29797b;

    public j56(h56 h56Var) {
        sq8.m48649h(h56Var, "emitter");
        this.f29796a = TimeUnit.MILLISECONDS.convert(h56Var.m29820a(), h56Var.m29821b());
    }

    /* renamed from: a */
    public final float m33262a() {
        return this.f29797b;
    }

    /* renamed from: b */
    public final long m33263b() {
        return this.f29796a;
    }

    /* renamed from: c */
    public final j56 m33264c(int i) {
        this.f29797b = (this.f29796a / i) / 1000.0f;
        return this;
    }
}
