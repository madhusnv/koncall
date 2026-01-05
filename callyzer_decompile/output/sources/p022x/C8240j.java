package p022x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.j */
/* loaded from: classes.dex */
public class C8240j {

    /* renamed from: a */
    public final Object f39382a;

    public C8240j(Object obj) {
        this.f39382a = obj;
    }

    /* renamed from: a */
    public void mo15411a(Surface surface) {
        if (m15415e() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!mo15416f()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    /* renamed from: b */
    public void mo15412b() {
        ((C8239i) this.f39382a).f39380c = true;
    }

    /* renamed from: c */
    public Object mo15413c() {
        Object obj = this.f39382a;
        y0.m11052b(obj instanceof C8239i);
        return ((C8239i) obj).f39378a;
    }

    /* renamed from: d */
    public String mo15414d() {
        return ((C8239i) this.f39382a).f39379b;
    }

    /* renamed from: e */
    public final Surface m15415e() {
        return ((OutputConfiguration) mo15413c()).getSurface();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8240j)) {
            return false;
        }
        return Objects.equals(this.f39382a, ((C8240j) obj).f39382a);
    }

    /* renamed from: f */
    public boolean mo15416f() {
        return ((C8239i) this.f39382a).f39380c;
    }

    /* renamed from: g */
    public void mo15417g(long j6) {
        ((C8239i) this.f39382a).f39381d = j6;
    }

    public final int hashCode() {
        return this.f39382a.hashCode();
    }

    /* renamed from: i */
    public void mo15419i(String str) {
        ((C8239i) this.f39382a).f39379b = str;
    }

    /* renamed from: h */
    public void mo15418h(int i10) {
    }

    /* renamed from: j */
    public void mo15420j(long j6) {
    }
}
