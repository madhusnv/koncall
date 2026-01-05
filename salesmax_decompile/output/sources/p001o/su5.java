package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public interface su5 {
    /* renamed from: c */
    static su5 m48918c() {
        return m48921m(km7.f32431b);
    }

    /* renamed from: g */
    static su5 m48919g(jm jmVar) {
        Objects.requireNonNull(jmVar, "action is null");
        return new om(jmVar);
    }

    /* renamed from: j */
    static su5 m48920j() {
        return h66.INSTANCE;
    }

    /* renamed from: m */
    static su5 m48921m(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new pve(runnable);
    }

    void dispose();

    boolean isDisposed();
}
