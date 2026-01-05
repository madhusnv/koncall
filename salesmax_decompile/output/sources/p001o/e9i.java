package p001o;

import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;

/* loaded from: classes2.dex */
public class e9i {

    /* renamed from: a */
    public final TorchFlashRequiredFor3aUpdateQuirk f21197a;

    public e9i(l5e l5eVar) {
        this.f21197a = (TorchFlashRequiredFor3aUpdateQuirk) l5eVar.m36594b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    /* renamed from: a */
    public boolean m24609a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f21197a;
        boolean z = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.m4633f();
        wja.m54627a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z);
        return z;
    }
}
