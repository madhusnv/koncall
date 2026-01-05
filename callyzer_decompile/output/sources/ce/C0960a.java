package ce;

import ge.C2580l;
import java.io.File;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ce.a */
/* loaded from: classes.dex */
public final class C0960a implements InterfaceC0961b {

    /* renamed from: a */
    public final boolean f5763a;

    public C0960a(boolean z6) {
        this.f5763a = z6;
    }

    @Override // ce.InterfaceC0961b
    /* renamed from: a */
    public final String mo2725a(Object obj, C2580l c2580l) {
        File file = (File) obj;
        if (!this.f5763a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
