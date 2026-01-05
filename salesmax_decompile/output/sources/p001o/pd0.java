package p001o;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes2.dex */
public final class pd0 implements eb3 {

    /* renamed from: a */
    public final ClipboardManager f39836a;

    public pd0(ClipboardManager clipboardManager) {
        sq8.m48649h(clipboardManager, "clipboardManager");
        this.f39836a = clipboardManager;
    }

    /* renamed from: a */
    public boolean m43380a() {
        ClipDescription primaryClipDescription = this.f39836a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pd0(Context context) {
        sq8.m48649h(context, "context");
        Object systemService = context.getSystemService("clipboard");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
