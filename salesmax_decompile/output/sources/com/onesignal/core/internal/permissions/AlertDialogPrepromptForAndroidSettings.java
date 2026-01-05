package com.onesignal.core.internal.permissions;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import com.onesignal.core.C11591R;
import com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import java.util.Arrays;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class AlertDialogPrepromptForAndroidSettings {
    public static final AlertDialogPrepromptForAndroidSettings INSTANCE = new AlertDialogPrepromptForAndroidSettings();

    public interface Callback {
        void onAccept();

        void onDecline();
    }

    private AlertDialogPrepromptForAndroidSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-0, reason: not valid java name */
    public static final void m68747show$lambda0(Callback callback, DialogInterface dialogInterface, int i) {
        sq8.m48649h(callback, "$callback");
        callback.onAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-1, reason: not valid java name */
    public static final void m68748show$lambda1(Callback callback, DialogInterface dialogInterface, int i) {
        sq8.m48649h(callback, "$callback");
        callback.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-2, reason: not valid java name */
    public static final void m68749show$lambda2(Callback callback, DialogInterface dialogInterface) {
        sq8.m48649h(callback, "$callback");
        callback.onDecline();
    }

    public final void show(Activity activity, String str, String str2, final Callback callback) {
        sq8.m48649h(activity, "activity");
        sq8.m48649h(str, "titlePrefix");
        sq8.m48649h(str2, "previouslyDeniedPostfix");
        sq8.m48649h(callback, "callback");
        String string = activity.getString(C11591R.string.permission_not_available_title);
        sq8.m48648g(string, "activity.getString(R.str…sion_not_available_title)");
        String str3 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        sq8.m48648g(str3, "format(this, *args)");
        String string2 = activity.getString(C11591R.string.permission_not_available_message);
        sq8.m48648g(string2, "activity.getString(R.str…on_not_available_message)");
        String str4 = String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
        sq8.m48648g(str4, "format(this, *args)");
        try {
            new AlertDialog.Builder(activity).setTitle(str3).setMessage(str4).setPositiveButton(C11591R.string.permission_not_available_open_settings_option, new DialogInterface.OnClickListener() { // from class: o.m90
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AlertDialogPrepromptForAndroidSettings.m68747show$lambda0(callback, dialogInterface, i);
                }
            }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: o.n90
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AlertDialogPrepromptForAndroidSettings.m68748show$lambda1(callback, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o.o90
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    AlertDialogPrepromptForAndroidSettings.m68749show$lambda2(callback, dialogInterface);
                }
            }).show();
        } catch (WindowManager.BadTokenException unused) {
            Logging.log(LogLevel.ERROR, "Alert dialog for Android settings was skipped because the activity was unavailable to display it.");
            callback.onDecline();
        }
    }
}
