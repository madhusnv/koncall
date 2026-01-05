package androidx.media.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.KeyEvent;
import java.util.List;
import p001o.c64;
import p001o.h1b;
import p001o.i1b;

/* loaded from: classes2.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    public static final class C2175a {
        /* renamed from: a */
        public static ForegroundServiceStartNotAllowedException m6676a(IllegalStateException illegalStateException) {
            return h1b.m29750a(illegalStateException);
        }

        /* renamed from: b */
        public static boolean m6677b(IllegalStateException illegalStateException) {
            return i1b.m31385a(illegalStateException);
        }
    }

    /* renamed from: androidx.media.session.MediaButtonReceiver$b */
    public static class C2176b extends MediaBrowserCompat.C1689b {

        /* renamed from: c */
        public final Context f7883c;

        /* renamed from: d */
        public final Intent f7884d;

        /* renamed from: e */
        public final BroadcastReceiver.PendingResult f7885e;

        /* renamed from: f */
        public MediaBrowserCompat f7886f;

        public C2176b(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f7883c = context;
            this.f7884d = intent;
            this.f7885e = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C1689b
        /* renamed from: a */
        public void mo3437a() {
            new MediaControllerCompat(this.f7883c, this.f7886f.m3432c()).m3519a((KeyEvent) this.f7884d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            m6678e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C1689b
        /* renamed from: b */
        public void mo3438b() {
            m6678e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C1689b
        /* renamed from: c */
        public void mo3439c() {
            m6678e();
        }

        /* renamed from: e */
        public final void m6678e() {
            this.f7886f.m3431b();
            this.f7885e.finish();
        }

        /* renamed from: f */
        public void m6679f(MediaBrowserCompat mediaBrowserCompat) {
            this.f7886f = mediaBrowserCompat;
        }
    }

    /* renamed from: a */
    public static ComponentName m6673a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        listQueryBroadcastReceivers.size();
        return null;
    }

    /* renamed from: b */
    public static ComponentName m6674b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    /* renamed from: c */
    public void m6675c(Intent intent, ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        StringBuilder sb = new StringBuilder();
        sb.append("caught exception when trying to start a foreground service from the background: ");
        sb.append(foregroundServiceStartNotAllowedException.getMessage());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignore unsupported intent: ");
            sb.append(intent);
            return;
        }
        ComponentName componentNameM6674b = m6674b(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameM6674b != null) {
            intent.setComponent(componentNameM6674b);
            try {
                c64.startForegroundService(context, intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !C2175a.m6677b(e)) {
                    throw e;
                }
                m6675c(intent, C2175a.m6676a(e));
                return;
            }
        }
        ComponentName componentNameM6674b2 = m6674b(context, "android.media.browse.MediaBrowserService");
        if (componentNameM6674b2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C2176b c2176b = new C2176b(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameM6674b2, c2176b, null);
        c2176b.m6679f(mediaBrowserCompat);
        mediaBrowserCompat.m3430a();
    }
}
