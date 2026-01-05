package p001o;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes2.dex */
public class egc extends igc {

    /* renamed from: o.egc$a */
    public static final class C13184a {

        /* renamed from: a */
        public final OutputConfiguration f21598a;

        /* renamed from: b */
        public String f21599b;

        /* renamed from: c */
        public boolean f21600c;

        /* renamed from: d */
        public long f21601d = 1;

        public C13184a(OutputConfiguration outputConfiguration) {
            this.f21598a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C13184a)) {
                return false;
            }
            C13184a c13184a = (C13184a) obj;
            return Objects.equals(this.f21598a, c13184a.f21598a) && this.f21600c == c13184a.f21600c && this.f21601d == c13184a.f21601d && Objects.equals(this.f21599b, c13184a.f21599b);
        }

        public int hashCode() {
            int iHashCode = this.f21598a.hashCode() ^ 31;
            int i = (this.f21600c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i2 = (i << 5) - i;
            String str = this.f21599b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i2;
            return Long.hashCode(this.f21601d) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    public egc(int i, Surface surface) {
        this(new C13184a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: k */
    public static egc m24970k(OutputConfiguration outputConfiguration) {
        return new egc(new C13184a(outputConfiguration));
    }

    @Override // p001o.igc, p001o.dgc.InterfaceC12904a
    /* renamed from: a */
    public Surface mo23039a() {
        return ((OutputConfiguration) mo23047i()).getSurface();
    }

    @Override // p001o.dgc.InterfaceC12904a
    /* renamed from: d */
    public void mo23042d(long j) {
        ((C13184a) this.f28648a).f21601d = j;
    }

    @Override // p001o.dgc.InterfaceC12904a
    /* renamed from: e */
    public void mo23043e(String str) {
        ((C13184a) this.f28648a).f21599b = str;
    }

    @Override // p001o.dgc.InterfaceC12904a
    /* renamed from: f */
    public String mo23044f() {
        return ((C13184a) this.f28648a).f21599b;
    }

    @Override // p001o.dgc.InterfaceC12904a
    /* renamed from: g */
    public void mo23045g() {
        ((C13184a) this.f28648a).f21600c = true;
    }

    @Override // p001o.dgc.InterfaceC12904a
    /* renamed from: i */
    public Object mo23047i() {
        fgd.m26657a(this.f28648a instanceof C13184a);
        return ((C13184a) this.f28648a).f21598a;
    }

    @Override // p001o.igc
    /* renamed from: j */
    public boolean mo24971j() {
        return ((C13184a) this.f28648a).f21600c;
    }

    public egc(Object obj) {
        super(obj);
    }
}
