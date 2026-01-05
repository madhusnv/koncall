package p001o;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.AbstractC1892b;
import androidx.camera.core.InterfaceC1893c;

/* loaded from: classes2.dex */
public final class rif extends AbstractC1892b {

    /* renamed from: d */
    public final Object f43691d;

    /* renamed from: e */
    public final jd8 f43692e;

    /* renamed from: f */
    public Rect f43693f;

    /* renamed from: g */
    public final int f43694g;

    /* renamed from: h */
    public final int f43695h;

    public rif(InterfaceC1893c interfaceC1893c, jd8 jd8Var) {
        this(interfaceC1893c, null, jd8Var);
    }

    @Override // androidx.camera.core.AbstractC1892b, androidx.camera.core.InterfaceC1893c
    public void C0(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f43691d) {
            this.f43693f = rect;
        }
    }

    @Override // androidx.camera.core.AbstractC1892b, androidx.camera.core.InterfaceC1893c
    public int getHeight() {
        return this.f43695h;
    }

    @Override // androidx.camera.core.AbstractC1892b, androidx.camera.core.InterfaceC1893c
    public int getWidth() {
        return this.f43694g;
    }

    @Override // androidx.camera.core.AbstractC1892b, androidx.camera.core.InterfaceC1893c
    public jd8 y2() {
        return this.f43692e;
    }

    public rif(InterfaceC1893c interfaceC1893c, Size size, jd8 jd8Var) {
        super(interfaceC1893c);
        this.f43691d = new Object();
        if (size == null) {
            this.f43694g = super.getWidth();
            this.f43695h = super.getHeight();
        } else {
            this.f43694g = size.getWidth();
            this.f43695h = size.getHeight();
        }
        this.f43692e = jd8Var;
    }
}
