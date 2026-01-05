package p001o;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class e07 {

    /* renamed from: a */
    public Optional f20702a = Optional.empty();

    /* renamed from: b */
    public Optional f20703b = Optional.empty();

    /* renamed from: c */
    public final Set f20704c = new LinkedHashSet();

    /* renamed from: d */
    public final Set f20705d = new LinkedHashSet();

    /* renamed from: e */
    public final Set f20706e = new LinkedHashSet();

    /* renamed from: a */
    public Optional m24026a() {
        return this.f20703b;
    }

    /* renamed from: b */
    public Set m24027b() {
        return this.f20706e;
    }

    /* renamed from: c */
    public Optional m24028c() {
        return this.f20702a;
    }

    /* renamed from: d */
    public Set m24029d() {
        return this.f20704c;
    }

    /* renamed from: e */
    public Set m24030e() {
        return this.f20705d;
    }

    /* renamed from: f */
    public boolean mo24031f() {
        Optional map = this.f20702a.map(new nic());
        Boolean bool = Boolean.TRUE;
        return ((Boolean) map.orElse(bool)).booleanValue() && ((Boolean) this.f20703b.map(new Function() { // from class: o.d07
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((tz4) obj).m50798d());
            }
        }).orElse(bool)).booleanValue() && this.f20704c.isEmpty() && this.f20705d.isEmpty() && this.f20706e.isEmpty();
    }

    /* renamed from: g */
    public void m24032g(tz4 tz4Var) {
        this.f20703b = Optional.ofNullable(tz4Var);
    }

    /* renamed from: h */
    public void m24033h(List list) {
        this.f20702a = Optional.ofNullable(list);
    }
}
