package ph;

import android.graphics.RectF;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.b */
/* loaded from: classes.dex */
public final class C5947b implements InterfaceC5948c {

    /* renamed from: a */
    public final InterfaceC5948c f29131a;

    /* renamed from: b */
    public final float f29132b;

    public C5947b(float f6, InterfaceC5948c interfaceC5948c) {
        while (interfaceC5948c instanceof C5947b) {
            interfaceC5948c = ((C5947b) interfaceC5948c).f29131a;
            f6 += ((C5947b) interfaceC5948c).f29132b;
        }
        this.f29131a = interfaceC5948c;
        this.f29132b = f6;
    }

    @Override // ph.InterfaceC5948c
    /* renamed from: a */
    public final float mo11975a(RectF rectF) {
        return Math.max(DefinitionKt.NO_Float_VALUE, this.f29131a.mo11975a(rectF) + this.f29132b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5947b)) {
            return false;
        }
        C5947b c5947b = (C5947b) obj;
        return this.f29131a.equals(c5947b.f29131a) && this.f29132b == c5947b.f29132b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29131a, Float.valueOf(this.f29132b)});
    }
}
