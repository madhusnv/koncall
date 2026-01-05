package androidx.camera.extensions;

import androidx.camera.extensions.impl.InitializerImpl;
import x4.C8299i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class ExtensionsManager$2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
    final /* synthetic */ C0225a this$0;
    final /* synthetic */ C8299i val$completer;

    public ExtensionsManager$2(C0225a c0225a, C8299i c8299i) {
        this.this$0 = c0225a;
        this.val$completer = c8299i;
    }

    public void onFailure(int i10) {
        this.val$completer.m15509d(new Exception("Failed to deinitialize extensions."));
    }

    public void onSuccess() {
        this.val$completer.m15507b(null);
    }
}
