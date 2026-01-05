package q5;

import a1.AbstractC0019r;
import android.app.Notification;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q5.i */
/* loaded from: classes.dex */
public final class C6116i extends AbstractC0019r {

    /* renamed from: e */
    public CharSequence f29829e;

    @Override // a1.AbstractC0019r
    /* renamed from: a */
    public final void mo100a(C8090p c8090p) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) c8090p.f38724b).setBigContentTitle((CharSequence) this.f85c).bigText(this.f29829e);
        if (this.f83a) {
            bigTextStyleBigText.setSummaryText((CharSequence) this.f86d);
        }
    }

    @Override // a1.AbstractC0019r
    /* renamed from: b */
    public final String mo101b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
