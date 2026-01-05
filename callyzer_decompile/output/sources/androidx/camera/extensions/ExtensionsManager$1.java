package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.extensions.impl.InitializerImpl;
import c0.InterfaceC0824q;
import og.u1;
import x4.C8299i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class ExtensionsManager$1 implements InitializerImpl.OnExtensionsInitializedCallback {
    final /* synthetic */ Context val$applicationContext;
    final /* synthetic */ InterfaceC0824q val$cameraProvider;
    final /* synthetic */ C8299i val$completer;

    public ExtensionsManager$1(C8299i c8299i, InterfaceC0824q interfaceC0824q, Context context) {
        this.val$completer = c8299i;
        this.val$cameraProvider = interfaceC0824q;
        this.val$applicationContext = context;
    }

    public void onFailure(int i10) {
        u1.m10943b("ExtensionsManager");
        C8299i c8299i = this.val$completer;
        ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability = ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE;
        c8299i.m15507b(C0225a.m614a(this.val$cameraProvider, this.val$applicationContext));
    }

    public void onSuccess() {
        u1.m10942a("ExtensionsManager");
        C8299i c8299i = this.val$completer;
        ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability = ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE;
        c8299i.m15507b(C0225a.m614a(this.val$cameraProvider, this.val$applicationContext));
    }
}
