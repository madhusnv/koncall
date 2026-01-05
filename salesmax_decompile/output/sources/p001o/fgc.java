package p001o;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes2.dex */
public class fgc extends egc {

    /* renamed from: o.fgc$a */
    public static final class C13426a {

        /* renamed from: a */
        public final OutputConfiguration f23299a;

        /* renamed from: b */
        public String f23300b;

        /* renamed from: c */
        public long f23301c = 1;

        public C13426a(OutputConfiguration outputConfiguration) {
            this.f23299a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C13426a)) {
                return false;
            }
            C13426a c13426a = (C13426a) obj;
            return Objects.equals(this.f23299a, c13426a.f23299a) && this.f23301c == c13426a.f23301c && Objects.equals(this.f23300b, c13426a.f23300b);
        }

        public int hashCode() {
            int iHashCode = this.f23299a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            String str = this.f23300b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
            return Long.hashCode(this.f23301c) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    public fgc(int i, Surface surface) {
        this(new C13426a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: l */
    public static fgc m26656l(OutputConfiguration outputConfiguration) {
        return new fgc(new C13426a(outputConfiguration));
    }

    @Override // p001o.igc, p001o.dgc.InterfaceC12904a
    /* renamed from: c */
    public void mo23041c(Surface surface) {
        ((OutputConfiguration) mo23047i()).addSurface(surface);
    }

    @Override // p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: d */
    public void mo23042d(long j) {
        ((C13426a) this.f28648a).f23301c = j;
    }

    @Override // p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: e */
    public void mo23043e(String str) {
        ((C13426a) this.f28648a).f23300b = str;
    }

    @Override // p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: f */
    public String mo23044f() {
        return ((C13426a) this.f28648a).f23300b;
    }

    @Override // p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: g */
    public void mo23045g() {
        ((OutputConfiguration) mo23047i()).enableSurfaceSharing();
    }

    @Override // p001o.egc, p001o.dgc.InterfaceC12904a
    /* renamed from: i */
    public Object mo23047i() {
        fgd.m26657a(this.f28648a instanceof C13426a);
        return ((C13426a) this.f28648a).f23299a;
    }

    @Override // p001o.egc, p001o.igc
    /* renamed from: j */
    public final boolean mo24971j() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    public fgc(Object obj) {
        super(obj);
    }
}
