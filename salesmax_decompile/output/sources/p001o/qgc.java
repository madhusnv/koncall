package p001o;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;

/* loaded from: classes2.dex */
public class qgc {

    /* renamed from: a */
    public final boolean f41966a;

    /* renamed from: b */
    public boolean f41967b = false;

    public qgc(l5e l5eVar) {
        this.f41966a = l5eVar.m36594b(AutoFlashUnderExposedQuirk.class) != null;
    }

    /* renamed from: a */
    public void m45433a() {
        this.f41967b = false;
    }

    /* renamed from: b */
    public void m45434b() {
        this.f41967b = true;
    }

    /* renamed from: c */
    public boolean m45435c(int i) {
        return this.f41967b && i == 0 && this.f41966a;
    }
}
