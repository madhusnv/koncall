package p001o;

import androidx.camera.core.InterfaceC1893c;
import p001o.fjd;

/* loaded from: classes2.dex */
public final class g51 extends fjd.AbstractC13464b {

    /* renamed from: a */
    public final gjd f24582a;

    /* renamed from: b */
    public final InterfaceC1893c f24583b;

    public g51(gjd gjdVar, InterfaceC1893c interfaceC1893c) {
        if (gjdVar == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f24582a = gjdVar;
        if (interfaceC1893c == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f24583b = interfaceC1893c;
    }

    @Override // p001o.fjd.AbstractC13464b
    /* renamed from: a */
    public InterfaceC1893c mo26933a() {
        return this.f24583b;
    }

    @Override // p001o.fjd.AbstractC13464b
    /* renamed from: b */
    public gjd mo26934b() {
        return this.f24582a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fjd.AbstractC13464b)) {
            return false;
        }
        fjd.AbstractC13464b abstractC13464b = (fjd.AbstractC13464b) obj;
        return this.f24582a.equals(abstractC13464b.mo26934b()) && this.f24583b.equals(abstractC13464b.mo26933a());
    }

    public int hashCode() {
        return ((this.f24582a.hashCode() ^ 1000003) * 1000003) ^ this.f24583b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f24582a + ", imageProxy=" + this.f24583b + "}";
    }
}
