package s4;

import com.sun.mail.util.AbstractC1452a;
import t4.InterfaceC7040a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.n */
/* loaded from: classes.dex */
public final class C6758n implements InterfaceC7040a {

    /* renamed from: a */
    public final float f32211a;

    public C6758n(float f6) {
        this.f32211a = f6;
    }

    @Override // t4.InterfaceC7040a
    /* renamed from: a */
    public final float mo12950a(float f6) {
        return f6 / this.f32211a;
    }

    @Override // t4.InterfaceC7040a
    /* renamed from: b */
    public final float mo12951b(float f6) {
        return f6 * this.f32211a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6758n) && Float.compare(this.f32211a, ((C6758n) obj).f32211a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32211a);
    }

    public final String toString() {
        return AbstractC1452a.m4562i(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f32211a, ')');
    }
}
