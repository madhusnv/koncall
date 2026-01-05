package p001o;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class dgc {

    /* renamed from: a */
    public final InterfaceC12904a f19802a;

    /* renamed from: o.dgc$a */
    public interface InterfaceC12904a {
        /* renamed from: a */
        Surface mo23039a();

        /* renamed from: b */
        void mo23040b(long j);

        /* renamed from: c */
        void mo23041c(Surface surface);

        /* renamed from: d */
        void mo23042d(long j);

        /* renamed from: e */
        void mo23043e(String str);

        /* renamed from: f */
        String mo23044f();

        /* renamed from: g */
        void mo23045g();

        /* renamed from: h */
        void mo23046h(int i);

        /* renamed from: i */
        Object mo23047i();
    }

    public dgc(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f19802a = new hgc(i, surface);
            return;
        }
        if (i2 >= 28) {
            this.f19802a = new ggc(i, surface);
        } else if (i2 >= 26) {
            this.f19802a = new fgc(i, surface);
        } else {
            this.f19802a = new egc(i, surface);
        }
    }

    /* renamed from: j */
    public static dgc m23029j(Object obj) {
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        InterfaceC12904a interfaceC12904aM30423n = i >= 33 ? hgc.m30423n((OutputConfiguration) obj) : i >= 28 ? ggc.m28578m((OutputConfiguration) obj) : i >= 26 ? fgc.m26656l((OutputConfiguration) obj) : egc.m24970k((OutputConfiguration) obj);
        if (interfaceC12904aM30423n == null) {
            return null;
        }
        return new dgc(interfaceC12904aM30423n);
    }

    /* renamed from: a */
    public void m23030a(Surface surface) {
        this.f19802a.mo23041c(surface);
    }

    /* renamed from: b */
    public void m23031b() {
        this.f19802a.mo23045g();
    }

    /* renamed from: c */
    public String m23032c() {
        return this.f19802a.mo23044f();
    }

    /* renamed from: d */
    public Surface m23033d() {
        return this.f19802a.mo23039a();
    }

    /* renamed from: e */
    public void m23034e(long j) {
        this.f19802a.mo23042d(j);
    }

    public boolean equals(Object obj) {
        if (obj instanceof dgc) {
            return this.f19802a.equals(((dgc) obj).f19802a);
        }
        return false;
    }

    /* renamed from: f */
    public void m23035f(int i) {
        this.f19802a.mo23046h(i);
    }

    /* renamed from: g */
    public void m23036g(String str) {
        this.f19802a.mo23043e(str);
    }

    /* renamed from: h */
    public void m23037h(long j) {
        this.f19802a.mo23040b(j);
    }

    public int hashCode() {
        return this.f19802a.hashCode();
    }

    /* renamed from: i */
    public Object m23038i() {
        return this.f19802a.mo23047i();
    }

    public dgc(OutputConfiguration outputConfiguration) {
        this.f19802a = hgc.m30423n(outputConfiguration);
    }

    public dgc(InterfaceC12904a interfaceC12904a) {
        this.f19802a = interfaceC12904a;
    }
}
