package pf;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.measurement.h0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.j */
/* loaded from: classes.dex */
public final class HandlerC5910j extends h0 {

    /* renamed from: b */
    public final Context f28760b;

    /* renamed from: c */
    public final /* synthetic */ C5905e f28761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5910j(C5905e c5905e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f28761c = c5905e;
        this.f28760b = context.getApplicationContext();
    }

    @Override // com.google.android.gms.internal.measurement.h0, android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        if (message.what != 1) {
            return;
        }
        int i10 = C5906f.f28747a;
        C5905e c5905e = this.f28761c;
        Context context = this.f28760b;
        int iM11516c = c5905e.m11516c(context, i10);
        AtomicBoolean atomicBoolean = AbstractC5907g.f28749a;
        if (iM11516c == 1 || iM11516c == 2 || iM11516c == 3 || iM11516c == 9) {
            Intent intentM11515b = c5905e.m11515b(iM11516c, context, "n");
            c5905e.m11512g(context, iM11516c, intentM11515b == null ? null : PendingIntent.getActivity(context, 0, intentM11515b, 201326592));
        }
    }
}
