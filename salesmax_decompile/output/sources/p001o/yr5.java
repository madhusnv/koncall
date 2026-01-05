package p001o;

import android.widget.Button;
import androidx.appcompat.app.DialogInterfaceC1782a;

/* loaded from: classes5.dex */
public abstract class yr5 {
    /* renamed from: a */
    public static final void m58132a(DialogInterfaceC1782a dialogInterfaceC1782a) {
        sq8.m48649h(dialogInterfaceC1782a, "<this>");
        int color = c64.getColor(dialogInterfaceC1782a.getContext(), q6e.positiveButtonTextColor);
        Button buttonM3865f = dialogInterfaceC1782a.m3865f(-1);
        if (buttonM3865f != null) {
            buttonM3865f.setTextColor(color);
        }
        int color2 = c64.getColor(dialogInterfaceC1782a.getContext(), q6e.negativeButtonTextColor);
        Button buttonM3865f2 = dialogInterfaceC1782a.m3865f(-2);
        if (buttonM3865f2 == null) {
            return;
        }
        buttonM3865f2.setTextColor(color2);
    }
}
