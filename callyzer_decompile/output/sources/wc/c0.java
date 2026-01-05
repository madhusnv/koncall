package wc;

import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c0 extends b0 {

    /* renamed from: b */
    public final Closeable f38341b;

    public c0(Closeable closeable) {
        AbstractC4154l.m8923f(closeable, "closeable");
        this.f38341b = closeable;
    }

    @Override // wc.b0
    /* renamed from: h */
    public final boolean mo15149h() throws IOException {
        boolean zMo15149h = super.mo15149h();
        if (zMo15149h) {
            this.f38341b.close();
        }
        return zMo15149h;
    }
}
