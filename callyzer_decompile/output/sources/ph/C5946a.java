package ph;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.a */
/* loaded from: classes.dex */
public final class C5946a implements InterfaceC5948c {

    /* renamed from: a */
    public final float f29130a;

    public C5946a(float f6) {
        this.f29130a = f6;
    }

    @Override // ph.InterfaceC5948c
    /* renamed from: a */
    public final float mo11975a(RectF rectF) {
        return this.f29130a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5946a) && this.f29130a == ((C5946a) obj).f29130a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29130a)});
    }
}
