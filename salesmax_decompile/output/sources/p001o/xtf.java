package p001o;

import androidx.camera.core.AbstractC1892b;
import androidx.camera.core.InterfaceC1893c;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class xtf extends AbstractC1892b {

    /* renamed from: d */
    public final AtomicBoolean f54281d;

    public xtf(InterfaceC1893c interfaceC1893c) {
        super(interfaceC1893c);
        this.f54281d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.AbstractC1892b, androidx.camera.core.InterfaceC1893c, java.lang.AutoCloseable
    public void close() {
        if (this.f54281d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
