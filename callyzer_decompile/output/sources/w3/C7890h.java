package w3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.h */
/* loaded from: classes.dex */
public final class C7890h implements g1 {

    /* renamed from: a */
    public final C7891i f37803a;

    public C7890h(C7891i c7891i) {
        this.f37803a = c7891i;
    }

    /* renamed from: a */
    public final void m14955a(f1 f1Var) {
        ClipboardManager clipboardManager = this.f37803a.f37806a;
        if (f1Var != null) {
            clipboardManager.setPrimaryClip(f1Var.f37784a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a1.m14856a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
