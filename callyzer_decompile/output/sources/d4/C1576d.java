package d4;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.d */
/* loaded from: classes.dex */
public final class C1576d {

    /* renamed from: a */
    public final String f7832a;

    /* renamed from: b */
    public final AbstractC4155m f7833b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1576d(String str, InterfaceC2137a interfaceC2137a) {
        this.f7832a = str;
        this.f7833b = (AbstractC4155m) interfaceC2137a;
    }

    /* renamed from: a */
    public final String m5197a() {
        return this.f7832a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1576d)) {
            return false;
        }
        C1576d c1576d = (C1576d) obj;
        return AbstractC4154l.m8918a(this.f7832a, c1576d.f7832a) && this.f7833b == c1576d.f7833b;
    }

    public final int hashCode() {
        return this.f7833b.hashCode() + (this.f7832a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f7832a + ", action=" + this.f7833b + ')';
    }
}
