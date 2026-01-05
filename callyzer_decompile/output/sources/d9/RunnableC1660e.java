package d9;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;
import pg.AbstractC5944y;
import pg.p7;
import t8.C7056b;
import t8.C7077w;
import u8.C7368p;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.e */
/* loaded from: classes.dex */
public final class RunnableC1660e implements Runnable {

    /* renamed from: e */
    public static final long f8174e;

    /* renamed from: a */
    public final Context f8175a;

    /* renamed from: b */
    public final C7368p f8176b;

    /* renamed from: c */
    public final C8986c f8177c;

    /* renamed from: d */
    public int f8178d = 0;

    static {
        C7077w.m13372b("ForceStopRunnable");
        f8174e = TimeUnit.DAYS.toMillis(3650L);
    }

    public RunnableC1660e(Context context, C7368p c7368p) {
        this.f8175a = context.getApplicationContext();
        this.f8176b = c7368p;
        this.f8177c = c7368p.f35049g;
    }

    /* renamed from: b */
    public static void m5372b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f8174e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5373a() {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.RunnableC1660e.m5373a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM5379a;
        C7368p c7368p = this.f8176b;
        try {
            C7056b c7056b = c7368p.f35044b;
            c7056b.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.f8175a;
            if (zIsEmpty) {
                C7077w.m13371a().getClass();
                zM5379a = true;
            } else {
                zM5379a = AbstractC1667l.m5379a(context, c7056b);
                C7077w.m13371a().getClass();
            }
            if (!zM5379a) {
                return;
            }
            while (true) {
                try {
                    AbstractC5944y.m11936a(context);
                    C7077w.m13371a().getClass();
                    try {
                        m5373a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        int i10 = this.f8178d + 1;
                        this.f8178d = i10;
                        if (i10 >= 3) {
                            String str = p7.m11823c(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            C7077w.m13371a().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException(str, e2);
                            c7368p.f35044b.getClass();
                            throw illegalStateException;
                        }
                        C7077w.m13371a().getClass();
                        try {
                            Thread.sleep(this.f8178d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e10) {
                    C7077w.m13371a().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
                    c7368p.f35044b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            c7368p.m13786i();
        }
    }
}
