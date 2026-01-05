package w3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.g */
/* loaded from: classes.dex */
public final class C7889g implements InterfaceC7888f {

    /* renamed from: a */
    public final AccessibilityManager f37789a;

    public C7889g(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f37789a = (AccessibilityManager) systemService;
    }
}
