package v0;

import androidx.camera.extensions.impl.ExtensionVersionImpl;
import java.util.Objects;
import og.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v0.d */
/* loaded from: classes.dex */
public final class C7620d extends AbstractC7621e {

    /* renamed from: c */
    public static ExtensionVersionImpl f36775c;

    /* renamed from: b */
    public final C7617a f36776b;

    public C7620d() {
        if (f36775c == null) {
            f36775c = new ExtensionVersionImpl();
        }
        ExtensionVersionImpl extensionVersionImpl = f36775c;
        C7618b c7618b = C7618b.f36773b;
        C7617a c7617aM14503b = C7617a.m14503b(extensionVersionImpl.checkApiVersion(c7618b.f36774a.toString()));
        if (c7617aM14503b != null && c7618b.f36774a.f36769a == c7617aM14503b.f36769a) {
            this.f36776b = c7617aM14503b;
        }
        Objects.toString(this.f36776b);
        u1.m10942a("ExtenderVersion");
    }

    @Override // v0.AbstractC7621e
    /* renamed from: b */
    public final C7617a mo14505b() {
        return this.f36776b;
    }
}
