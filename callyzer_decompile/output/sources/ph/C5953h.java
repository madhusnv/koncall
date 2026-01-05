package ph;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.h */
/* loaded from: classes.dex */
public final class C5953h implements InterfaceC5948c {

    /* renamed from: a */
    public final float f29174a;

    public C5953h(float f6) {
        this.f29174a = f6;
    }

    @Override // ph.InterfaceC5948c
    /* renamed from: a */
    public final float mo11975a(RectF rectF) {
        return rectF.height() * this.f29174a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5953h) && this.f29174a == ((C5953h) obj).f29174a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29174a)});
    }
}
