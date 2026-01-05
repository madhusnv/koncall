package q5;

import a1.AbstractC0019r;
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q5.h */
/* loaded from: classes.dex */
public final class C6115h extends AbstractC0019r {

    /* renamed from: e */
    public IconCompat f29826e;

    /* renamed from: f */
    public IconCompat f29827f;

    /* renamed from: g */
    public boolean f29828g;

    @Override // a1.AbstractC0019r
    /* renamed from: a */
    public final void mo100a(C8090p c8090p) {
        Bitmap bitmapM757a;
        Notification.Builder builder = (Notification.Builder) c8090p.f38724b;
        Context context = (Context) c8090p.f38723a;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle((CharSequence) this.f85c);
        IconCompat iconCompat = this.f29826e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC6114g.m12143a(bigContentTitle, iconCompat.m762f(context));
            } else if (iconCompat.m760d() == 1) {
                IconCompat iconCompat2 = this.f29826e;
                int i10 = iconCompat2.f2202a;
                if (i10 == -1) {
                    Object obj = iconCompat2.f2203b;
                    bitmapM757a = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i10 == 1) {
                    bitmapM757a = (Bitmap) iconCompat2.f2203b;
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapM757a = IconCompat.m757a((Bitmap) iconCompat2.f2203b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapM757a);
            }
        }
        if (this.f29828g) {
            IconCompat iconCompat3 = this.f29827f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC6113f.m12142a(bigContentTitle, iconCompat3.m762f(context));
            }
        }
        if (this.f83a) {
            bigContentTitle.setSummaryText((CharSequence) this.f86d);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC6114g.m12145c(bigContentTitle, false);
            AbstractC6114g.m12144b(bigContentTitle, null);
        }
    }

    @Override // a1.AbstractC0019r
    /* renamed from: b */
    public final String mo101b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
