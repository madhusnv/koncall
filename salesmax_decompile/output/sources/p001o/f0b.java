package p001o;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import p001o.weg;

/* loaded from: classes2.dex */
public class f0b {

    /* renamed from: a */
    public final ExtraCroppingQuirk f22495a;

    public f0b() {
        this((ExtraCroppingQuirk) zq5.m59712b(ExtraCroppingQuirk.class));
    }

    /* renamed from: a */
    public Size m25918a(Size size) {
        Size sizeM4554c;
        ExtraCroppingQuirk extraCroppingQuirk = this.f22495a;
        if (extraCroppingQuirk == null || (sizeM4554c = extraCroppingQuirk.m4554c(weg.EnumC17833b.PRIV)) == null) {
            return size;
        }
        return sizeM4554c.getWidth() * sizeM4554c.getHeight() > size.getWidth() * size.getHeight() ? sizeM4554c : size;
    }

    public f0b(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f22495a = extraCroppingQuirk;
    }
}
