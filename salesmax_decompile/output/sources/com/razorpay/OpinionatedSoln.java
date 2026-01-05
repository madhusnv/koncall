package com.razorpay;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.razorpay.OpinionatedSoln;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p001o.dge;
import p001o.f9g;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OpinionatedSoln {
    private static boolean alertShownForStatus;
    private static boolean callbackSent;
    private static boolean checkedForSubMinorVersion;
    private static DismissCallback dismissCallback;
    public static final OpinionatedSoln INSTANCE = new OpinionatedSoln();
    private static final ArrayList<String> dialogItemTitles = new ArrayList<>();
    private static final ArrayList<String> dialogItemSubTitles = new ArrayList<>();
    private static final ArrayList<Boolean> dialogItemStatus = new ArrayList<>();

    public interface DismissCallback {
        void alertDismissed();
    }

    public interface HandleDialogShowPreference {
        void errorFound();
    }

    private OpinionatedSoln() {
    }

    private final void checkEnvVariablesForProject(Activity activity) {
        dialogItemTitles.add("Min SDK Version Check");
        dialogItemSubTitles.add("Min SDK Version Compatible");
        dialogItemStatus.add(Boolean.TRUE);
        showDialog(activity);
    }

    private final void checkIfVersionUpdateExists(final Activity activity, String str) {
        final dge dgeVar = new dge();
        M$_3_.m15990a("https://mvnrepository.com/artifact/com.razorpay/checkout/" + str, new Callback() { // from class: com.razorpay.o
            @Override // com.razorpay.Callback
            public final void run(ResponseObject responseObject) {
                OpinionatedSoln.m68783checkIfVersionUpdateExists$lambda0(dgeVar, activity, responseObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkIfVersionUpdateExists$lambda-0, reason: not valid java name */
    public static final void m68783checkIfVersionUpdateExists$lambda0(dge dgeVar, Activity activity, ResponseObject responseObject) {
        sq8.m48649h(dgeVar, "$versionUpdateExists");
        sq8.m48649h(activity, "$activity");
        if (responseObject != null && responseObject.getResponseCode() == 200) {
            dgeVar.f19803a = true;
            dialogItemTitles.add("Version Upgrade Check");
            dialogItemSubTitles.add("A version update was found. Click here to go to docs");
            dialogItemStatus.add(Boolean.FALSE);
            INSTANCE.checkEnvVariablesForProject(activity);
            return;
        }
        if (!checkedForSubMinorVersion) {
            checkedForSubMinorVersion = true;
            OpinionatedSoln opinionatedSoln = INSTANCE;
            opinionatedSoln.checkIfVersionUpdateExists(activity, opinionatedSoln.getUpdatedVersionNumber(false));
        } else {
            dgeVar.f19803a = false;
            dialogItemTitles.add("Version Upgrade Check");
            dialogItemSubTitles.add("Running the latest version");
            dialogItemStatus.add(Boolean.TRUE);
            INSTANCE.checkEnvVariablesForProject(activity);
        }
    }

    private final String getUpdatedVersionNumber(boolean z) {
        String str = (String) f9g.D0(BuildConfig.VERSION_NAME, new String[]{"."}, false, 0, 6, null).get(0);
        String str2 = (String) f9g.D0(BuildConfig.VERSION_NAME, new String[]{"."}, false, 0, 6, null).get(1);
        String str3 = (String) f9g.D0(BuildConfig.VERSION_NAME, new String[]{"."}, false, 0, 6, null).get(2);
        if (z) {
            return str + '.' + (Integer.parseInt(str2) + 1) + ".0";
        }
        return str + '.' + str2 + '.' + (Integer.parseInt(str3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-1, reason: not valid java name */
    public static final void m68784showDialog$lambda1(Activity activity, AdapterView adapterView, View view, int i, long j) {
        sq8.m48649h(activity, "$activity");
        if (i == 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://razorpay.com/docs/payments/payment-gateway/android-integration/standard/#list-of-razorpay-android-standard-sdk-versions-last"));
            activity.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-2, reason: not valid java name */
    public static final void m68785showDialog$lambda2(DialogInterface dialogInterface) {
        INSTANCE.sendCallbackIfExists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-3, reason: not valid java name */
    public static final void m68786showDialog$lambda3(Activity activity, DialogInterface dialogInterface, int i) {
        sq8.m48649h(activity, "$activity");
        BaseConfig.setOpinionatedSolnPreference(activity, Boolean.FALSE);
        Toast.makeText(activity, "Status will be shown in logs. RAZORPAY_SDK", 1).show();
        INSTANCE.sendCallbackIfExists();
    }

    public final boolean getAlertShownForStatus() {
        return alertShownForStatus;
    }

    public final Object getBuildConfigValue(Context context, String str) {
        sq8.m48649h(context, "context");
        try {
            Field field = str != null ? Class.forName(context.getPackageName() + ".BuildConfig").getField(str) : null;
            if (field != null) {
                return field.get(null);
            }
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final boolean getCheckedForSubMinorVersion() {
        return checkedForSubMinorVersion;
    }

    public final void integrationStatusCheck(Activity activity) {
        sq8.m48649h(activity, "activity");
        checkIfVersionUpdateExists(activity, getUpdatedVersionNumber(true));
    }

    public final void sendCallbackIfExists() {
        DismissCallback dismissCallback2 = dismissCallback;
        if (dismissCallback2 == null || callbackSent) {
            return;
        }
        if (dismissCallback2 == null) {
            sq8.m48667z("dismissCallback");
            dismissCallback2 = null;
        }
        dismissCallback2.alertDismissed();
        callbackSent = true;
    }

    public final void setAlertShownForStatus(boolean z) {
        alertShownForStatus = z;
    }

    public final void setCheckedForSubMinorVersion(boolean z) {
        checkedForSubMinorVersion = z;
    }

    public final void showDialog(final Activity activity) {
        sq8.m48649h(activity, "activity");
        Object buildConfigValue = getBuildConfigValue(activity, "DEBUG");
        if (buildConfigValue == null) {
            CheckoutUtils.m15969a();
            sendCallbackIfExists();
            return;
        }
        if (!((Boolean) buildConfigValue).booleanValue() || alertShownForStatus) {
            CheckoutUtils.m15969a();
            sendCallbackIfExists();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        View viewInflate = activity.getLayoutInflater().inflate(C11895R.layout.sdk_integration_status, (ViewGroup) null);
        sq8.m48648g(viewInflate, "activity.layoutInflater.…integration_status, null)");
        ListView listView = (ListView) viewInflate.findViewById(C11895R.id.check_list);
        final ArrayList<String> arrayList = dialogItemTitles;
        final ArrayList<String> arrayList2 = dialogItemSubTitles;
        final ArrayList<Boolean> arrayList3 = dialogItemStatus;
        listView.setAdapter((ListAdapter) new ArrayAdapter<String>(activity, arrayList, arrayList2, arrayList3) { // from class: com.razorpay.V$$3$

            /* renamed from: a */
            private final Activity f13711a;

            /* renamed from: b */
            private final ArrayList<String> f13712b;

            /* renamed from: c */
            private final ArrayList<String> f13713c;

            /* renamed from: d */
            private final ArrayList<Boolean> f13714d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activity, C11895R.layout.single_item);
                sq8.m48649h(activity, "context");
                sq8.m48649h(arrayList, "itemTitles");
                sq8.m48649h(arrayList2, "itemDescs");
                sq8.m48649h(arrayList3, "status");
                this.f13711a = activity;
                this.f13712b = arrayList;
                this.f13713c = arrayList2;
                this.f13714d = arrayList3;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public final int getCount() {
                return this.f13712b.size();
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public final View getView(int i, View view, ViewGroup viewGroup) {
                sq8.m48649h(viewGroup, "parent");
                LayoutInflater layoutInflater = this.f13711a.getLayoutInflater();
                sq8.m48648g(layoutInflater, "context.layoutInflater");
                View viewInflate2 = layoutInflater.inflate(C11895R.layout.single_item, (ViewGroup) null, true);
                View viewFindViewById = viewInflate2.findViewById(C11895R.id.tv_title);
                sq8.m48647f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById2 = viewInflate2.findViewById(C11895R.id.iv_check_mark);
                sq8.m48647f(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) viewFindViewById2;
                View viewFindViewById3 = viewInflate2.findViewById(C11895R.id.tv_sub_item);
                sq8.m48647f(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewFindViewById3;
                ((TextView) viewFindViewById).setText(this.f13712b.get(i));
                Boolean bool = this.f13714d.get(i);
                sq8.m48648g(bool, "status[position]");
                if (bool.booleanValue()) {
                    imageView.setImageResource(C11895R.drawable.ic_tick_mark);
                } else {
                    imageView.setImageResource(C11895R.drawable.ic_alert);
                }
                textView.setText(this.f13713c.get(i));
                sq8.m48648g(viewInflate2, "rowView");
                return viewInflate2;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.hec
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                OpinionatedSoln.m68784showDialog$lambda1(activity, adapterView, view, i, j);
            }
        });
        builder.setView(viewInflate);
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.iec
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                OpinionatedSoln.m68785showDialog$lambda2(dialogInterface);
            }
        });
        Iterator<Boolean> it = arrayList3.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!it.next().booleanValue()) {
                z = false;
            }
        }
        if (z) {
            builder.setNegativeButton("Hide notification forever", new DialogInterface.OnClickListener() { // from class: o.jec
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    OpinionatedSoln.m68786showDialog$lambda3(activity, dialogInterface, i);
                }
            });
        }
        Boolean opinionatedSolnPreference = BaseConfig.getOpinionatedSolnPreference(activity);
        sq8.m48648g(opinionatedSolnPreference, "getOpinionatedSolnPreference(activity)");
        if (opinionatedSolnPreference.booleanValue() || !z) {
            if (!z) {
                BaseConfig.setOpinionatedSolnPreference(activity, Boolean.TRUE);
            }
            final AlertDialog alertDialogShow = builder.show();
            alertShownForStatus = true;
            new CountDownTimer() { // from class: com.razorpay.p$_5$
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, 1000L);
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    alertDialogShow.dismiss();
                    OpinionatedSoln.INSTANCE.sendCallbackIfExists();
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                }
            }.start();
            CheckoutUtils.m15969a();
            return;
        }
        HashMap map = new HashMap();
        Iterator<String> it2 = dialogItemTitles.iterator();
        String str = "";
        while (it2.hasNext()) {
            String next = it2.next();
            sq8.m48648g(next, "item");
            ArrayList<String> arrayList4 = dialogItemSubTitles;
            ArrayList<String> arrayList5 = dialogItemTitles;
            String str2 = arrayList4.get(arrayList5.indexOf(next));
            sq8.m48648g(str2, "dialogItemSubTitles[dial…ItemTitles.indexOf(item)]");
            map.put(next, str2);
            if (!dialogItemStatus.get(arrayList5.indexOf(next)).booleanValue()) {
                str = "https://razorpay.com/docs/payments/payment-gateway/android-integration/standard";
            }
        }
        StringBuilder sb = new StringBuilder("RAZORPAY_SDK: ");
        sb.append(map);
        sb.append('\n');
        sb.append(str);
        sendCallbackIfExists();
        CheckoutUtils.m15969a();
    }

    public final void integrationStatusCheck(Activity activity, DismissCallback dismissCallback2) {
        sq8.m48649h(activity, "activity");
        sq8.m48649h(dismissCallback2, "dismissCallback");
        g$_H$.m16059a().m16063a(activity);
        CheckoutUtils.m15978e(activity);
        callbackSent = false;
        dismissCallback = dismissCallback2;
        checkIfVersionUpdateExists(activity, getUpdatedVersionNumber(true));
    }
}
