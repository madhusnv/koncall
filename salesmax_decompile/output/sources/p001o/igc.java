package p001o;

import android.view.Surface;
import java.util.Objects;
import p001o.dgc;

/* loaded from: classes2.dex */
public abstract class igc implements dgc.InterfaceC12904a {

    /* renamed from: a */
    public final Object f28648a;

    public igc(Object obj) {
        this.f28648a = obj;
    }

    @Override // p001o.dgc.InterfaceC12904a
    /* renamed from: a */
    public abstract Surface mo23039a();

    @Override // p001o.dgc.InterfaceC12904a
    /* renamed from: b */
    public void mo23040b(long j) {
    }

    @Override // p001o.dgc.InterfaceC12904a
    /* renamed from: c */
    public void mo23041c(Surface surface) {
        fgd.m26664h(surface, "Surface must not be null");
        if (mo23039a() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!mo24971j()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    public boolean equals(Object obj) {
        if (obj instanceof igc) {
            return Objects.equals(this.f28648a, ((igc) obj).f28648a);
        }
        return false;
    }

    @Override // p001o.dgc.InterfaceC12904a
    /* renamed from: h */
    public void mo23046h(int i) {
    }

    public int hashCode() {
        return this.f28648a.hashCode();
    }

    /* renamed from: j */
    public abstract boolean mo24971j();
}
