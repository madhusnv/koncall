package p001o;

import android.graphics.Point;
import android.view.Display;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class gu5 {

    /* renamed from: a */
    public static final gu5 f25802a = new gu5();

    /* renamed from: a */
    public final void m29490a(Display display, Point point) {
        sq8.m48649h(display, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        sq8.m48649h(point, "point");
        display.getRealSize(point);
    }
}
