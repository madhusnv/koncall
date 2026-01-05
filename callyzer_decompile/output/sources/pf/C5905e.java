package pf;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.j1;
import androidx.fragment.app.o0;
import com.google.android.gms.common.api.GoogleApiActivity;
import q5.C6112e;
import q5.C6116i;
import q5.C6118k;
import rf.InterfaceC6502g;
import sf.AbstractC6830p;
import sf.AbstractC6840z;
import sf.DialogInterfaceOnClickListenerC6831q;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.e */
/* loaded from: classes.dex */
public final class C5905e extends C5906f {

    /* renamed from: c */
    public static final Object f28745c = new Object();

    /* renamed from: d */
    public static final C5905e f28746d = new C5905e();

    /* renamed from: e */
    public static AlertDialog m11509e(Activity activity, int i10, DialogInterfaceOnClickListenerC6831q dialogInterfaceOnClickListenerC6831q, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC6830p.m13022b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(R.string.ok) : resources.getString(com.websoptimization.callyzerbiz.R.string.common_google_play_services_enable_button) : resources.getString(com.websoptimization.callyzerbiz.R.string.common_google_play_services_update_button) : resources.getString(com.websoptimization.callyzerbiz.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, dialogInterfaceOnClickListenerC6831q);
        }
        String strM13023c = AbstractC6830p.m13023c(activity, i10);
        if (strM13023c != null) {
            builder.setTitle(strM13023c);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    /* renamed from: f */
    public static void m11510f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof o0) {
                j1 supportFragmentManager = ((o0) activity).getSupportFragmentManager();
                C5909i c5909i = new C5909i();
                AbstractC6840z.m13037h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                c5909i.f28757s = alertDialog;
                if (onCancelListener != null) {
                    c5909i.f28758t = onCancelListener;
                }
                c5909i.m1273l(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC5903c dialogFragmentC5903c = new DialogFragmentC5903c();
        AbstractC6840z.m13037h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC5903c.f28739a = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC5903c.f28740b = onCancelListener;
        }
        dialogFragmentC5903c.show(fragmentManager, str);
    }

    /* renamed from: d */
    public final void m11511d(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogM11509e = m11509e(googleApiActivity, i10, new DialogInterfaceOnClickListenerC6831q(super.m11515b(i10, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogM11509e == null) {
            return;
        }
        m11510f(googleApiActivity, alertDialogM11509e, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* renamed from: g */
    public final void m11512g(Context context, int i10, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i11;
        new IllegalArgumentException();
        if (i10 == 18) {
            new HandlerC5910j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strM13025e = i10 == 6 ? AbstractC6830p.m13025e(context, "common_google_play_services_resolution_required_title") : AbstractC6830p.m13023c(context, i10);
        if (strM13025e == null) {
            strM13025e = context.getResources().getString(com.websoptimization.callyzerbiz.R.string.common_google_play_services_notification_ticker);
        }
        String strM13024d = (i10 == 6 || i10 == 19) ? AbstractC6830p.m13024d(context, "common_google_play_services_resolution_required_text", AbstractC6830p.m13021a(context)) : AbstractC6830p.m13022b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC6840z.m13036g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C6118k c6118k = new C6118k(context, null);
        c6118k.f29845p = true;
        c6118k.m12152c(16, true);
        c6118k.f29834e = C6118k.m12150b(strM13025e);
        C6116i c6116i = new C6116i();
        c6116i.f29829e = C6118k.m12150b(strM13024d);
        c6118k.m12154e(c6116i);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC8947b.f42954c == null) {
            AbstractC8947b.f42954c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC8947b.f42954c.booleanValue()) {
            c6118k.f29852w.icon = context.getApplicationInfo().icon;
            c6118k.f29839j = 2;
            if (AbstractC8947b.m16430g(context)) {
                c6118k.f29831b.add(new C6112e(2131230882, resources.getString(com.websoptimization.callyzerbiz.R.string.common_open_on_phone), pendingIntent));
            } else {
                c6118k.f29836g = pendingIntent;
            }
        } else {
            c6118k.f29852w.icon = R.drawable.stat_sys_warning;
            c6118k.f29852w.tickerText = C6118k.m12150b(resources.getString(com.websoptimization.callyzerbiz.R.string.common_google_play_services_notification_ticker));
            c6118k.f29852w.when = System.currentTimeMillis();
            c6118k.f29836g = pendingIntent;
            c6118k.f29835f = C6118k.m12150b(strM13024d);
        }
        if (AbstractC8947b.m16428e()) {
            AbstractC6840z.m13039j(AbstractC8947b.m16428e());
            synchronized (f28745c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.websoptimization.callyzerbiz.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            c6118k.f29850u = "com.google.android.gms.availability";
        }
        Notification notificationM12151a = c6118k.m12151a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            AbstractC5907g.f28749a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationM12151a);
    }

    /* renamed from: h */
    public final void m11513h(Activity activity, InterfaceC6502g interfaceC6502g, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogM11509e = m11509e(activity, i10, new DialogInterfaceOnClickListenerC6831q(super.m11515b(i10, activity, "d"), interfaceC6502g, 1), onCancelListener);
        if (alertDialogM11509e == null) {
            return;
        }
        m11510f(activity, alertDialogM11509e, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
