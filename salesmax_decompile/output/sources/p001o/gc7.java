package p001o;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class gc7 {

    /* renamed from: a */
    public final boolean f24923a;

    /* renamed from: b */
    public final boolean f24924b;

    /* renamed from: c */
    public final boolean f24925c;

    public gc7(l5e l5eVar, l5e l5eVar2) {
        this.f24923a = l5eVar2.m36593a(TextureViewIsClosedQuirk.class);
        this.f24924b = l5eVar.m36593a(PreviewOrientationIncorrectQuirk.class);
        this.f24925c = l5eVar.m36593a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    /* renamed from: a */
    public void m28404a(List list) {
        if (!m28405b() || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((yj5) it.next()).mo30396d();
        }
        wja.m54627a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    /* renamed from: b */
    public boolean m28405b() {
        return this.f24923a || this.f24924b || this.f24925c;
    }
}
