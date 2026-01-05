package com.razorpay;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class CheckoutUtils {

    /* renamed from: a */
    private static Dialog f13599a;

    interface BackButtonDialogCallback {
        void onNegativeButtonClick();

        void onPositiveButtonClick();
    }

    /* renamed from: a */
    public static String m15966a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&" : "?");
        sb.append(str2);
        String string = sb.toString();
        if (str3 == null) {
            return string;
        }
        return string + "=" + str3;
    }

    /* renamed from: b */
    public static void m15975b(Context context, String str) {
        SharedPreferences.Editor editorM16081b = C11907l.m16081b(context);
        editorM16081b.putString("rzp_user_contact", str);
        editorM16081b.commit();
    }

    /* renamed from: c */
    public static JSONArray m15976c(Context context) {
        List<ResolveInfo> listOfAppsWhichHandleDeepLink = BaseUtils.getListOfAppsWhichHandleDeepLink(context, "upi://pay");
        if (listOfAppsWhichHandleDeepLink == null || listOfAppsWhichHandleDeepLink.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<ResolveInfo> it = listOfAppsWhichHandleDeepLink.iterator();
        while (it.hasNext()) {
            jSONArray.put(m15967a(context, it.next()));
        }
        return jSONArray;
    }

    /* renamed from: d */
    public static JSONArray m15977d(Context context) {
        List<ResolveInfo> listOfAppsWhichHandleDeepLink = BaseUtils.getListOfAppsWhichHandleDeepLink(context, "credpay://checkout");
        if (listOfAppsWhichHandleDeepLink == null || listOfAppsWhichHandleDeepLink.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<ResolveInfo> it = listOfAppsWhichHandleDeepLink.iterator();
        while (it.hasNext()) {
            jSONArray.put(m15968a(it.next()));
        }
        return jSONArray;
    }

    /* renamed from: e */
    public static void m15978e(Context context) {
        if (!g$_H$.m16059a().m16067d() || context == null || ((Activity) context).isFinishing()) {
            return;
        }
        Dialog dialog = f13599a;
        if (dialog == null || !dialog.isShowing()) {
            Dialog dialog2 = new Dialog(context);
            f13599a = dialog2;
            dialog2.requestWindowFeature(1);
            f13599a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            f13599a.setContentView(C11895R.layout.rzp_loader);
            ((CircularProgressView) f13599a.findViewById(C11895R.id.progressBar)).setColor(Color.parseColor(g$_H$.m16059a().m16066c()));
            ((LinearLayout) f13599a.findViewById(C11895R.id.ll_loader)).setOnClickListener(new l__9_());
            try {
                f13599a.show();
            } catch (Exception e) {
                d__1_.m16053a("Error showing loader", e);
            }
        }
    }

    /* renamed from: a */
    public static void m15970a(Activity activity) {
        activity.getWindow().addFlags(2048);
        activity.getWindow().clearFlags(1024);
    }

    /* renamed from: b */
    public static String m15974b(Context context) {
        return C11907l.m16078a(context).getString("rzp_user_contact", null);
    }

    /* renamed from: a */
    public static void m15971a(Context context, String str) {
        SharedPreferences.Editor editorM16081b = C11907l.m16081b(context);
        editorM16081b.putString("rzp_user_email", str);
        editorM16081b.commit();
    }

    /* renamed from: a */
    public static void m15972a(Context context, String str, String str2) {
        SharedPreferences.Editor editorM16081b = C11907l.m16081b(context);
        if (str2 == null) {
            editorM16081b.remove("pref_merchant_options_" + str);
        } else {
            editorM16081b.putString("pref_merchant_options_" + str, str2);
        }
        editorM16081b.apply();
    }

    /* renamed from: a */
    public static String m15965a(Context context) {
        return C11907l.m16078a(context).getString("rzp_user_email", null);
    }

    /* renamed from: a */
    public static void m15973a(Context context, String str, String str2, String str3, final BackButtonDialogCallback backButtonDialogCallback) {
        new AlertDialog.Builder(context).setMessage(str).setPositiveButton(str2, new DialogInterface.OnClickListener() { // from class: com.razorpay.t$$1$
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                backButtonDialogCallback.onPositiveButtonClick();
            }
        }).setNegativeButton(str3, new E__a_(backButtonDialogCallback)).show();
    }

    /* renamed from: a */
    private static JSONObject m15968a(ResolveInfo resolveInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!resolveInfo.activityInfo.packageName.contains(BaseConstants.CRED_PACKAGE)) {
                return null;
            }
            jSONObject.put("package_name", BaseConstants.CRED_PACKAGE);
            jSONObject.put("shortcode", "cred");
            jSONObject.put("uri", "credpay");
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            AnalyticsUtil.reportError(e.getMessage(), "S1", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m15967a(Context context, ResolveInfo resolveInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("package_name", resolveInfo.activityInfo.packageName);
            jSONObject.put("app_name", BaseUtils.getAppNameOfResolveInfo(resolveInfo, context));
            jSONObject.put("app_icon", BaseUtils.getBase64FromOtherAppsResource(context, resolveInfo.activityInfo.packageName));
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m15969a() {
        Dialog dialog = f13599a;
        if (dialog == null) {
            return;
        }
        if (dialog.isShowing()) {
            try {
                f13599a.dismiss();
            } catch (Exception e) {
                d__1_.m16053a("Error dismissing loader", e);
            }
        }
        f13599a = null;
    }
}
