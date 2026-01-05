package zv;

import a2.AbstractC0030c;
import android.app.PendingIntent;
import com.websoptimization.callyzerbiz.R;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zv.c */
/* loaded from: classes3.dex */
public final class C9099c {

    /* renamed from: a */
    public final String f43649a;

    /* renamed from: b */
    public final PendingIntent f43650b;

    public C9099c(String str, PendingIntent pendingIntent) {
        this.f43649a = str;
        this.f43650b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9099c)) {
            return false;
        }
        C9099c c9099c = (C9099c) obj;
        return this.f43649a.equals(c9099c.f43649a) && this.f43650b.equals(c9099c.f43650b);
    }

    public final int hashCode() {
        return this.f43650b.hashCode() + AbstractC0030c.m113d(Integer.hashCode(R.drawable.ic_sync_call_log) * 31, 31, this.f43649a);
    }

    public final String toString() {
        return "NotificationActionData(drawable=2131231102, name=" + this.f43649a + ", pIntent=" + this.f43650b + ")";
    }
}
