package t8;

import android.app.Notification;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.o */
/* loaded from: classes.dex */
public final class C7069o {

    /* renamed from: a */
    public final int f34164a;

    /* renamed from: b */
    public final int f34165b;

    /* renamed from: c */
    public final Notification f34166c;

    public C7069o(int i10, Notification notification, int i11) {
        this.f34164a = i10;
        this.f34166c = notification;
        this.f34165b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7069o.class != obj.getClass()) {
            return false;
        }
        C7069o c7069o = (C7069o) obj;
        if (this.f34164a == c7069o.f34164a && this.f34165b == c7069o.f34165b) {
            return this.f34166c.equals(c7069o.f34166c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34166c.hashCode() + (((this.f34164a * 31) + this.f34165b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f34164a + ", mForegroundServiceType=" + this.f34165b + ", mNotification=" + this.f34166c + '}';
    }
}
