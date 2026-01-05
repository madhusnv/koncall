package p001o;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ggc extends fgc {

    /* renamed from: o.ggc$a */
    public static final class C13706a {

        /* renamed from: a */
        public final OutputConfiguration f25104a;

        /* renamed from: b */
        public long f25105b = 1;

        public C13706a(OutputConfiguration outputConfiguration) {
            this.f25104a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C13706a)) {
                return false;
            }
            C13706a c13706a = (C13706a) obj;
            return Objects.equals(this.f25104a, c13706a.f25104a) && this.f25105b == c13706a.f25105b;
        }

        public int hashCode() {
            int iHashCode = this.f25104a.hashCode() ^ 31;
            return Long.hashCode(this.f25105b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    public ggc(int i, Surface surface) {
        this(new C13706a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: m */
    public static ggc m28578m(OutputConfiguration outputConfiguration) {
        return new ggc(new C13706a(outputConfiguration));
    }

    @Override // p001o.fgc, p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: d */
    public void mo23042d(long j) {
        ((C13706a) this.f28648a).f25105b = j;
    }

    @Override // p001o.fgc, p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: e */
    public void mo23043e(String str) {
        ((OutputConfiguration) mo23047i()).setPhysicalCameraId(str);
    }

    @Override // p001o.fgc, p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: f */
    public String mo23044f() {
        return null;
    }

    @Override // p001o.fgc, p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: i */
    public Object mo23047i() {
        fgd.m26657a(this.f28648a instanceof C13706a);
        return ((C13706a) this.f28648a).f25104a;
    }

    public ggc(Object obj) {
        super(obj);
    }
}
