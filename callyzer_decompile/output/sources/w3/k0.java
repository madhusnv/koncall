package w3;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import com.sun.mail.imap.IMAPStore;
import kotlin.jvm.internal.AbstractC4154l;
import p3.C5803a;
import p3.InterfaceC5816n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    public static final k0 f37828a = new k0();

    /* renamed from: a */
    public final void m14969a(View view, InterfaceC5816n interfaceC5816n) {
        Context context = view.getContext();
        PointerIcon systemIcon = interfaceC5816n instanceof C5803a ? PointerIcon.getSystemIcon(context, ((C5803a) interfaceC5816n).f28408b) : PointerIcon.getSystemIcon(context, IMAPStore.RESPONSE);
        if (AbstractC4154l.m8918a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
