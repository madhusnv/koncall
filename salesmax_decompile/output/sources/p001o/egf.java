package p001o;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes2.dex */
public abstract class egf {

    /* renamed from: o.egf$a */
    public static class C13185a {
        /* renamed from: a */
        public static void m24976a(Service service, int i, Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & Constants.MAX_HOST_LENGTH);
            }
        }
    }

    /* renamed from: o.egf$b */
    public static class C13186b {
        /* renamed from: a */
        public static void m24977a(Service service, int i, Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & 1073745919);
            }
        }
    }

    /* renamed from: a */
    public static void m24975a(Service service, int i, Notification notification, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            C13186b.m24977a(service, i, notification, i2);
        } else if (i3 >= 29) {
            C13185a.m24976a(service, i, notification, i2);
        } else {
            service.startForeground(i, notification);
        }
    }
}
