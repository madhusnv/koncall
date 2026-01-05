package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AsyncTaskC10774d;
import com.facebook.C10773c;
import com.facebook.C10776f;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.ao8;
import p001o.cri;
import p001o.eae;
import p001o.h8g;
import p001o.id5;
import p001o.ir5;
import p001o.isa;
import p001o.k8e;
import p001o.k9e;
import p001o.mwf;
import p001o.nae;
import p001o.p38;
import p001o.rri;
import p001o.sq8;
import p001o.tt6;
import p001o.ur6;
import p001o.xt6;
import p001o.za;

/* loaded from: classes5.dex */
public class DeviceAuthDialog extends DialogFragment {

    /* renamed from: a */
    public View f11529a;

    /* renamed from: b */
    public TextView f11530b;

    /* renamed from: c */
    public TextView f11531c;

    /* renamed from: d */
    public DeviceAuthMethodHandler f11532d;

    /* renamed from: e */
    public final AtomicBoolean f11533e = new AtomicBoolean();

    /* renamed from: f */
    public volatile AsyncTaskC10774d f11534f;

    /* renamed from: g */
    public volatile ScheduledFuture f11535g;

    /* renamed from: h */
    public volatile RequestState f11536h;

    /* renamed from: q */
    public boolean f11537q;

    /* renamed from: s */
    public boolean f11538s;

    /* renamed from: x */
    public LoginClient.Request f11539x;

    /* renamed from: y */
    public static final C10796a f11528y = new C10796a(null);

    /* renamed from: H */
    public static final String f11525H = "device/login";

    /* renamed from: L */
    public static final String f11526L = "device/login_status";

    /* renamed from: M */
    public static final int f11527M = 1349174;

    public static final class RequestState implements Parcelable {

        /* renamed from: a */
        public String f11541a;

        /* renamed from: b */
        public String f11542b;

        /* renamed from: c */
        public String f11543c;

        /* renamed from: d */
        public long f11544d;

        /* renamed from: e */
        public long f11545e;

        /* renamed from: f */
        public static final C10795b f11540f = new C10795b(null);
        public static final Parcelable.Creator<RequestState> CREATOR = new C10794a();

        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$a */
        public static final class C10794a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(Parcel parcel) {
                sq8.m48649h(parcel, "parcel");
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int i) {
                return new RequestState[i];
            }
        }

        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$b */
        public static final class C10795b {
            public C10795b() {
            }

            public /* synthetic */ C10795b(id5 id5Var) {
                this();
            }
        }

        public RequestState() {
        }

        public RequestState(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            this.f11541a = parcel.readString();
            this.f11542b = parcel.readString();
            this.f11543c = parcel.readString();
            this.f11544d = parcel.readLong();
            this.f11545e = parcel.readLong();
        }

        /* renamed from: a */
        public final String m13196a() {
            return this.f11541a;
        }

        /* renamed from: b */
        public final long m13197b() {
            return this.f11544d;
        }

        /* renamed from: c */
        public final String m13198c() {
            return this.f11543c;
        }

        /* renamed from: d */
        public final String m13199d() {
            return this.f11542b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final void m13200e(long j) {
            this.f11544d = j;
        }

        /* renamed from: f */
        public final void m13201f(long j) {
            this.f11545e = j;
        }

        /* renamed from: g */
        public final void m13202g(String str) {
            this.f11543c = str;
        }

        /* renamed from: h */
        public final void m13203h(String str) {
            this.f11542b = str;
            h8g h8gVar = h8g.f26398a;
            String str2 = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            sq8.m48648g(str2, "format(locale, format, *args)");
            this.f11541a = str2;
        }

        /* renamed from: i */
        public final boolean m13204i() {
            return this.f11545e != 0 && (new Date().getTime() - this.f11545e) - (this.f11544d * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            sq8.m48649h(parcel, "dest");
            parcel.writeString(this.f11541a);
            parcel.writeString(this.f11542b);
            parcel.writeString(this.f11543c);
            parcel.writeLong(this.f11544d);
            parcel.writeLong(this.f11545e);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$a */
    public static final class C10796a {
        public C10796a() {
        }

        public /* synthetic */ C10796a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final C10797b m13208b(JSONObject jSONObject) throws JSONException {
            String strOptString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String strOptString2 = jSONObjectOptJSONObject.optString("permission");
                sq8.m48648g(strOptString2, "permission");
                if (!(strOptString2.length() == 0) && !sq8.m48644c(strOptString2, "installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                    int iHashCode = strOptString.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && strOptString.equals("declined")) {
                                arrayList2.add(strOptString2);
                            }
                        } else if (strOptString.equals("granted")) {
                            arrayList.add(strOptString2);
                        }
                    } else if (strOptString.equals("expired")) {
                        arrayList3.add(strOptString2);
                    }
                }
            }
            return new C10797b(arrayList, arrayList2, arrayList3);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$b */
    public static final class C10797b {

        /* renamed from: a */
        public List f11546a;

        /* renamed from: b */
        public List f11547b;

        /* renamed from: c */
        public List f11548c;

        public C10797b(List list, List list2, List list3) {
            sq8.m48649h(list, "grantedPermissions");
            sq8.m48649h(list2, "declinedPermissions");
            sq8.m48649h(list3, "expiredPermissions");
            this.f11546a = list;
            this.f11547b = list2;
            this.f11548c = list3;
        }

        /* renamed from: a */
        public final List m13209a() {
            return this.f11547b;
        }

        /* renamed from: b */
        public final List m13210b() {
            return this.f11548c;
        }

        /* renamed from: c */
        public final List m13211c() {
            return this.f11546a;
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$c */
    public static final class DialogC10798c extends Dialog {
        public DialogC10798c(FragmentActivity fragmentActivity, int i) {
            super(fragmentActivity, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (DeviceAuthDialog.this.W0()) {
                super.onBackPressed();
            }
        }
    }

    public static final void O0(DeviceAuthDialog deviceAuthDialog, C10776f c10776f) throws JSONException {
        ur6 ur6Var;
        sq8.m48649h(deviceAuthDialog, "this$0");
        sq8.m48649h(c10776f, "response");
        if (deviceAuthDialog.f11533e.get()) {
            return;
        }
        FacebookRequestError facebookRequestErrorM13064b = c10776f.m13064b();
        if (facebookRequestErrorM13064b == null) {
            try {
                JSONObject jSONObjectM13065c = c10776f.m13065c();
                if (jSONObjectM13065c == null) {
                    jSONObjectM13065c = new JSONObject();
                }
                String string = jSONObjectM13065c.getString("access_token");
                sq8.m48648g(string, "resultObject.getString(\"access_token\")");
                deviceAuthDialog.Z0(string, jSONObjectM13065c.getLong("expires_in"), Long.valueOf(jSONObjectM13065c.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e) {
                deviceAuthDialog.Y0(new ur6(e));
                return;
            }
        }
        int iM12825g = facebookRequestErrorM13064b.m12825g();
        boolean z = true;
        if (iM12825g != f11527M && iM12825g != 1349172) {
            z = false;
        }
        if (z) {
            deviceAuthDialog.f1();
            return;
        }
        if (iM12825g == 1349152) {
            RequestState requestState = deviceAuthDialog.f11536h;
            if (requestState != null) {
                ir5.m32602a(requestState.m13199d());
            }
            LoginClient.Request request = deviceAuthDialog.f11539x;
            if (request != null) {
                deviceAuthDialog.i1(request);
                return;
            } else {
                deviceAuthDialog.X0();
                return;
            }
        }
        if (iM12825g == 1349173) {
            deviceAuthDialog.X0();
            return;
        }
        FacebookRequestError facebookRequestErrorM13064b2 = c10776f.m13064b();
        if (facebookRequestErrorM13064b2 == null || (ur6Var = facebookRequestErrorM13064b2.m12823e()) == null) {
            ur6Var = new ur6();
        }
        deviceAuthDialog.Y0(ur6Var);
    }

    public static final void V0(DeviceAuthDialog deviceAuthDialog, View view) {
        sq8.m48649h(deviceAuthDialog, "this$0");
        deviceAuthDialog.X0();
    }

    public static final void a1(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2, C10776f c10776f) throws JSONException, Resources.NotFoundException {
        EnumSet enumSetM50556w;
        sq8.m48649h(deviceAuthDialog, "this$0");
        sq8.m48649h(str, "$accessToken");
        sq8.m48649h(c10776f, "response");
        if (deviceAuthDialog.f11533e.get()) {
            return;
        }
        FacebookRequestError facebookRequestErrorM13064b = c10776f.m13064b();
        if (facebookRequestErrorM13064b != null) {
            ur6 ur6VarM12823e = facebookRequestErrorM13064b.m12823e();
            if (ur6VarM12823e == null) {
                ur6VarM12823e = new ur6();
            }
            deviceAuthDialog.Y0(ur6VarM12823e);
            return;
        }
        try {
            JSONObject jSONObjectM13065c = c10776f.m13065c();
            if (jSONObjectM13065c == null) {
                jSONObjectM13065c = new JSONObject();
            }
            String string = jSONObjectM13065c.getString(OutcomeConstants.OUTCOME_ID);
            sq8.m48648g(string, "jsonObject.getString(\"id\")");
            C10797b c10797bM13208b = f11528y.m13208b(jSONObjectM13065c);
            String string2 = jSONObjectM13065c.getString("name");
            sq8.m48648g(string2, "jsonObject.getString(\"name\")");
            RequestState requestState = deviceAuthDialog.f11536h;
            if (requestState != null) {
                ir5.m32602a(requestState.m13199d());
            }
            tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
            if (!sq8.m48644c((tt6VarM56796f == null || (enumSetM50556w = tt6VarM56796f.m50556w()) == null) ? null : Boolean.valueOf(enumSetM50556w.contains(mwf.RequireConfirm)), Boolean.TRUE) || deviceAuthDialog.f11538s) {
                deviceAuthDialog.Q0(string, c10797bM13208b, str, date, date2);
            } else {
                deviceAuthDialog.f11538s = true;
                deviceAuthDialog.c1(string, c10797bM13208b, str, string2, date, date2);
            }
        } catch (JSONException e) {
            deviceAuthDialog.Y0(new ur6(e));
        }
    }

    public static final void d1(DeviceAuthDialog deviceAuthDialog, String str, C10797b c10797b, String str2, Date date, Date date2, DialogInterface dialogInterface, int i) {
        sq8.m48649h(deviceAuthDialog, "this$0");
        sq8.m48649h(str, "$userId");
        sq8.m48649h(c10797b, "$permissions");
        sq8.m48649h(str2, "$accessToken");
        deviceAuthDialog.Q0(str, c10797b, str2, date, date2);
    }

    public static final void e1(DeviceAuthDialog deviceAuthDialog, DialogInterface dialogInterface, int i) {
        sq8.m48649h(deviceAuthDialog, "this$0");
        View viewU0 = deviceAuthDialog.U0(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView(viewU0);
        }
        LoginClient.Request request = deviceAuthDialog.f11539x;
        if (request != null) {
            deviceAuthDialog.i1(request);
        }
    }

    public static final void g1(DeviceAuthDialog deviceAuthDialog) {
        sq8.m48649h(deviceAuthDialog, "this$0");
        deviceAuthDialog.b1();
    }

    public static final void j1(DeviceAuthDialog deviceAuthDialog, C10776f c10776f) {
        ur6 ur6Var;
        sq8.m48649h(deviceAuthDialog, "this$0");
        sq8.m48649h(c10776f, "response");
        if (deviceAuthDialog.f11537q) {
            return;
        }
        if (c10776f.m13064b() != null) {
            FacebookRequestError facebookRequestErrorM13064b = c10776f.m13064b();
            if (facebookRequestErrorM13064b == null || (ur6Var = facebookRequestErrorM13064b.m12823e()) == null) {
                ur6Var = new ur6();
            }
            deviceAuthDialog.Y0(ur6Var);
            return;
        }
        JSONObject jSONObjectM13065c = c10776f.m13065c();
        if (jSONObjectM13065c == null) {
            jSONObjectM13065c = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            requestState.m13203h(jSONObjectM13065c.getString("user_code"));
            requestState.m13202g(jSONObjectM13065c.getString("code"));
            requestState.m13200e(jSONObjectM13065c.getLong("interval"));
            deviceAuthDialog.h1(requestState);
        } catch (JSONException e) {
            deviceAuthDialog.Y0(new ur6(e));
        }
    }

    public Map P0() {
        return null;
    }

    public final void Q0(String str, C10797b c10797b, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.f11532d;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.m13217u(str2, C10773c.m13020m(), str, c10797b.m13211c(), c10797b.m13209a(), c10797b.m13210b(), za.DEVICE_AUTH, date, null, date2);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public String R0() {
        return rri.m47107b() + '|' + rri.m47108c();
    }

    public int S0(boolean z) {
        return z ? k9e.com_facebook_smart_device_dialog_fragment : k9e.com_facebook_device_auth_dialog_fragment;
    }

    public final GraphRequest T0() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.f11536h;
        bundle.putString("code", requestState != null ? requestState.m13198c() : null);
        bundle.putString("access_token", R0());
        return GraphRequest.f11338n.m12883B(null, f11526L, bundle, new GraphRequest.InterfaceC10763b() { // from class: o.lq5
            @Override // com.facebook.GraphRequest.InterfaceC10763b
            /* renamed from: a */
            public final void mo12873a(C10776f c10776f) throws JSONException {
                DeviceAuthDialog.O0(this.f34253a, c10776f);
            }
        });
    }

    public View U0(boolean z) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        sq8.m48648g(layoutInflater, "requireActivity().layoutInflater");
        TextView textView = null;
        View viewInflate = layoutInflater.inflate(S0(z), (ViewGroup) null);
        sq8.m48648g(viewInflate, "inflater.inflate(getLayo…esId(isSmartLogin), null)");
        View viewFindViewById = viewInflate.findViewById(k8e.progress_bar);
        sq8.m48648g(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.f11529a = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(k8e.confirmation_code);
        sq8.m48647f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f11530b = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(k8e.cancel_button);
        sq8.m48647f(viewFindViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: o.nq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAuthDialog.V0(this.f37156a, view);
            }
        });
        View viewFindViewById4 = viewInflate.findViewById(k8e.com_facebook_device_auth_instructions);
        sq8.m48647f(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById4;
        this.f11531c = textView2;
        if (textView2 == null) {
            sq8.m48667z("instructions");
        } else {
            textView = textView2;
        }
        textView.setText(Html.fromHtml(getString(eae.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    public boolean W0() {
        return true;
    }

    public void X0() {
        if (this.f11533e.compareAndSet(false, true)) {
            RequestState requestState = this.f11536h;
            if (requestState != null) {
                ir5.m32602a(requestState.m13199d());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f11532d;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.m13215s();
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public void Y0(ur6 ur6Var) {
        sq8.m48649h(ur6Var, "ex");
        if (this.f11533e.compareAndSet(false, true)) {
            RequestState requestState = this.f11536h;
            if (requestState != null) {
                ir5.m32602a(requestState.m13199d());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f11532d;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.m13216t(ur6Var);
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void Z0(final String str, long j, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = j != 0 ? new Date(new Date().getTime() + (j * 1000)) : null;
        if ((l == null || l.longValue() != 0) && l != null) {
            date = new Date(l.longValue() * 1000);
        }
        GraphRequest graphRequestM12913x = GraphRequest.f11338n.m12913x(new AccessToken(str, C10773c.m13020m(), "0", null, null, null, null, date2, null, date, null, 1024, null), "me", new GraphRequest.InterfaceC10763b() { // from class: o.oq5
            @Override // com.facebook.GraphRequest.InterfaceC10763b
            /* renamed from: a */
            public final void mo12873a(C10776f c10776f) throws JSONException, Resources.NotFoundException {
                DeviceAuthDialog.a1(this.f38715a, str, date2, date, c10776f);
            }
        });
        graphRequestM12913x.m12845F(p38.GET);
        graphRequestM12913x.m12846G(bundle);
        graphRequestM12913x.m12852l();
    }

    public final void b1() {
        RequestState requestState = this.f11536h;
        if (requestState != null) {
            requestState.m13201f(new Date().getTime());
        }
        this.f11534f = T0().m12852l();
    }

    public final void c1(final String str, final C10797b c10797b, final String str2, String str3, final Date date, final Date date2) throws Resources.NotFoundException {
        String string = getResources().getString(eae.com_facebook_smart_login_confirmation_title);
        sq8.m48648g(string, "resources.getString(R.st…login_confirmation_title)");
        String string2 = getResources().getString(eae.com_facebook_smart_login_confirmation_continue_as);
        sq8.m48648g(string2, "resources.getString(R.st…confirmation_continue_as)");
        String string3 = getResources().getString(eae.com_facebook_smart_login_confirmation_cancel);
        sq8.m48648g(string3, "resources.getString(R.st…ogin_confirmation_cancel)");
        h8g h8gVar = h8g.f26398a;
        String str4 = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        sq8.m48648g(str4, "format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: o.pq5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.d1(this.f40410a, str, c10797b, str2, date, date2, dialogInterface, i);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: o.qq5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.e1(this.f42288a, dialogInterface, i);
            }
        });
        builder.create().show();
    }

    public final void f1() {
        RequestState requestState = this.f11536h;
        Long lValueOf = requestState != null ? Long.valueOf(requestState.m13197b()) : null;
        if (lValueOf != null) {
            this.f11535g = DeviceAuthMethodHandler.f11550e.m13221a().schedule(new Runnable() { // from class: o.kq5
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceAuthDialog.g1(this.f32539a);
                }
            }, lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    public final void h1(RequestState requestState) {
        this.f11536h = requestState;
        TextView textView = this.f11530b;
        View view = null;
        if (textView == null) {
            sq8.m48667z("confirmationCode");
            textView = null;
        }
        textView.setText(requestState.m13199d());
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), ir5.m32603c(requestState.m13196a()));
        TextView textView2 = this.f11531c;
        if (textView2 == null) {
            sq8.m48667z("instructions");
            textView2 = null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.f11530b;
        if (textView3 == null) {
            sq8.m48667z("confirmationCode");
            textView3 = null;
        }
        textView3.setVisibility(0);
        View view2 = this.f11529a;
        if (view2 == null) {
            sq8.m48667z("progressBar");
        } else {
            view = view2;
        }
        view.setVisibility(8);
        if (!this.f11538s && ir5.m32606f(requestState.m13199d())) {
            new ao8(getContext()).m17563f("fb_smart_login_service");
        }
        if (requestState.m13204i()) {
            f1();
        } else {
            b1();
        }
    }

    public void i1(LoginClient.Request request) {
        sq8.m48649h(request, "request");
        this.f11539x = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.m13278n()));
        cri.r0(bundle, "redirect_uri", request.m13273i());
        cri.r0(bundle, "target_user_id", request.m13272h());
        bundle.putString("access_token", R0());
        Map mapP0 = P0();
        bundle.putString("device_info", ir5.m32604d(mapP0 != null ? isa.m32696w(mapP0) : null));
        GraphRequest.f11338n.m12883B(null, f11525H, bundle, new GraphRequest.InterfaceC10763b() { // from class: o.mq5
            @Override // com.facebook.GraphRequest.InterfaceC10763b
            /* renamed from: a */
            public final void mo12873a(C10776f c10776f) {
                DeviceAuthDialog.j1(this.f35861a, c10776f);
            }
        }).m12852l();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        DialogC10798c dialogC10798c = new DialogC10798c(requireActivity(), nae.com_facebook_auth_dialog);
        dialogC10798c.setContentView(U0(ir5.m32605e() && !this.f11538s));
        return dialogC10798c;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        LoginClient loginClientM0;
        sq8.m48649h(layoutInflater, "inflater");
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        sq8.m48647f(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.facebook.FacebookActivity");
        LoginFragment loginFragment = (LoginFragment) ((FacebookActivity) fragmentActivityRequireActivity).I0();
        this.f11532d = (DeviceAuthMethodHandler) ((loginFragment == null || (loginClientM0 = loginFragment.M0()) == null) ? null : loginClientM0.m13247j());
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            h1(requestState);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f11537q = true;
        this.f11533e.set(true);
        super.onDestroyView();
        AsyncTaskC10774d asyncTaskC10774d = this.f11534f;
        if (asyncTaskC10774d != null) {
            asyncTaskC10774d.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.f11535g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        sq8.m48649h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (this.f11537q) {
            return;
        }
        X0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        sq8.m48649h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.f11536h != null) {
            bundle.putParcelable("request_state", this.f11536h);
        }
    }
}
