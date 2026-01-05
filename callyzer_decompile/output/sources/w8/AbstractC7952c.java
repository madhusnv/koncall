package w8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w8.c */
/* loaded from: classes.dex */
public abstract class AbstractC7952c extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f38244a = 0;

    static {
        C7077w.m13372b("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C7077w c7077wM13371a = C7077w.m13371a();
        Objects.toString(intent);
        c7077wM13371a.getClass();
        int i10 = C7951b.f38238f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
