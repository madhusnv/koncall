package p001o;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public class qu5 {

    /* renamed from: e */
    public static final Size f42415e = new Size(1920, 1080);

    /* renamed from: f */
    public static final Size f42416f = new Size(320, 240);

    /* renamed from: g */
    public static final Size f42417g = new Size(640, 480);

    /* renamed from: h */
    public static final Object f42418h = new Object();

    /* renamed from: i */
    public static volatile qu5 f42419i;

    /* renamed from: a */
    public final DisplayManager f42420a;

    /* renamed from: b */
    public volatile Size f42421b = null;

    /* renamed from: c */
    public final f0b f42422c = new f0b();

    /* renamed from: d */
    public final ru5 f42423d = new ru5();

    public qu5(Context context) {
        this.f42420a = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    /* renamed from: c */
    public static qu5 m45842c(Context context) {
        if (f42419i == null) {
            synchronized (f42418h) {
                if (f42419i == null) {
                    f42419i = new qu5(context);
                }
            }
        }
        return f42419i;
    }

    /* renamed from: a */
    public final Size m45843a() {
        Size sizeM45844b = m45844b();
        int width = sizeM45844b.getWidth() * sizeM45844b.getHeight();
        Size size = f42415e;
        if (width > size.getWidth() * size.getHeight()) {
            sizeM45844b = size;
        }
        return this.f42422c.m25918a(sizeM45844b);
    }

    /* renamed from: b */
    public final Size m45844b() {
        Point point = new Point();
        m45845d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (mvf.m39727c(size, f42416f) && (size = this.f42423d.m47162a()) == null) {
            size = f42417g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    /* renamed from: d */
    public Display m45845d(boolean z) {
        Display[] displays = this.f42420a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayM45846e = m45846e(displays, z);
        if (displayM45846e == null && z) {
            displayM45846e = m45846e(displays, false);
        }
        if (displayM45846e != null) {
            return displayM45846e;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* renamed from: e */
    public final Display m45846e(Display[] displayArr, boolean z) {
        Display display = null;
        int i = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x;
                int i3 = point.y;
                if (i2 * i3 > i) {
                    display = display2;
                    i = i2 * i3;
                }
            }
        }
        return display;
    }

    /* renamed from: f */
    public Size m45847f() {
        if (this.f42421b != null) {
            return this.f42421b;
        }
        this.f42421b = m45843a();
        return this.f42421b;
    }

    /* renamed from: g */
    public void m45848g() {
        this.f42421b = m45843a();
    }
}
