package th;

import android.app.PendingIntent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: th.a */
/* loaded from: classes.dex */
public final class C7151a {

    /* renamed from: a */
    public final int f34384a;

    /* renamed from: b */
    public final int f34385b;

    /* renamed from: c */
    public final int f34386c;

    /* renamed from: d */
    public final PendingIntent f34387d;

    /* renamed from: e */
    public final PendingIntent f34388e;

    /* renamed from: f */
    public boolean f34389f = false;

    public C7151a(int i10, int i11, int i12, long j6, long j10, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f34384a = i10;
        this.f34385b = i11;
        this.f34386c = i12;
        this.f34387d = pendingIntent;
        this.f34388e = pendingIntent2;
    }

    /* renamed from: a */
    public final PendingIntent m13414a(C7160j c7160j) {
        PendingIntent pendingIntent;
        int i10 = c7160j.f34409a;
        if (i10 == 0) {
            PendingIntent pendingIntent2 = this.f34388e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i10 != 1 || (pendingIntent = this.f34387d) == null) {
            return null;
        }
        return pendingIntent;
    }
}
