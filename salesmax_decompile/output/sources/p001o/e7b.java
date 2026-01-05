package p001o;

import android.os.Bundle;
import androidx.mediarouter.media.C2318f;

/* loaded from: classes2.dex */
public final class e7b {

    /* renamed from: a */
    public final Bundle f21116a;

    /* renamed from: b */
    public C2318f f21117b;

    public e7b(C2318f c2318f, boolean z) {
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f21116a = bundle;
        this.f21117b = c2318f;
        bundle.putBundle("selector", c2318f.m8220a());
        bundle.putBoolean("activeScan", z);
    }

    /* renamed from: c */
    public static e7b m24482c(Bundle bundle) {
        if (bundle != null) {
            return new e7b(bundle);
        }
        return null;
    }

    /* renamed from: a */
    public Bundle m24483a() {
        return this.f21116a;
    }

    /* renamed from: b */
    public final void m24484b() {
        if (this.f21117b == null) {
            C2318f c2318fM8219d = C2318f.m8219d(this.f21116a.getBundle("selector"));
            this.f21117b = c2318fM8219d;
            if (c2318fM8219d == null) {
                this.f21117b = C2318f.f9224c;
            }
        }
    }

    /* renamed from: d */
    public C2318f m24485d() {
        m24484b();
        return this.f21117b;
    }

    /* renamed from: e */
    public boolean m24486e() {
        return this.f21116a.getBoolean("activeScan");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e7b)) {
            return false;
        }
        e7b e7bVar = (e7b) obj;
        return m24485d().equals(e7bVar.m24485d()) && m24486e() == e7bVar.m24486e();
    }

    /* renamed from: f */
    public boolean m24487f() {
        m24484b();
        return this.f21117b.m8225g();
    }

    public int hashCode() {
        return m24485d().hashCode() ^ m24486e();
    }

    public String toString() {
        return "DiscoveryRequest{ selector=" + m24485d() + ", activeScan=" + m24486e() + ", isValid=" + m24487f() + " }";
    }

    public e7b(Bundle bundle) {
        this.f21116a = bundle;
    }
}
