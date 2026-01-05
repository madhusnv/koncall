package p001o;

import java.util.Optional;

/* loaded from: classes.dex */
public abstract class jzf {

    /* renamed from: a */
    public Optional f31304a = Optional.empty();

    /* renamed from: b */
    public Boolean f31305b = Boolean.TRUE;

    /* renamed from: a */
    public Optional m34795a() {
        return this.f31304a;
    }

    /* renamed from: b */
    public boolean m34796b() {
        return !this.f31304a.isPresent();
    }

    /* renamed from: c */
    public void m34797c(String str) {
        this.f31304a = Optional.ofNullable(str);
    }

    /* renamed from: d */
    public void m34798d(boolean z) {
        this.f31305b = Boolean.valueOf(z);
    }
}
