package w3;

import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.i */
/* loaded from: classes.dex */
public final class C7891i implements h1 {

    /* renamed from: a */
    public final ClipboardManager f37806a;

    public C7891i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f37806a = (ClipboardManager) systemService;
    }
}
