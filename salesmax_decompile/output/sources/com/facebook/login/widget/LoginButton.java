package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.C10773c;
import com.facebook.FacebookButtonBase;
import com.facebook.Profile;
import com.facebook.login.C10830e;
import com.facebook.login.widget.C10842a;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.perf.util.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p001o.a94;
import p001o.ab;
import p001o.abe;
import p001o.ao8;
import p001o.ch3;
import p001o.cri;
import p001o.d32;
import p001o.e32;
import p001o.fae;
import p001o.fka;
import p001o.gi9;
import p001o.h8g;
import p001o.id5;
import p001o.kf9;
import p001o.lk0;
import p001o.ns;
import p001o.oae;
import p001o.os;
import p001o.p6e;
import p001o.pr6;
import p001o.s7e;
import p001o.si9;
import p001o.sq8;
import p001o.tt6;
import p001o.uk7;
import p001o.ws;
import p001o.xka;
import p001o.xt6;
import p001o.ys;
import p001o.za5;

/* loaded from: classes5.dex */
public class LoginButton extends FacebookButtonBase {
    public static final C10832a q0 = new C10832a(null);
    public static final String r0 = LoginButton.class.getName();

    /* renamed from: H */
    public final C10833b f11670H;

    /* renamed from: L */
    public boolean f11671L;

    /* renamed from: M */
    public C10842a.c f11672M;

    /* renamed from: Q */
    public EnumC10835d f11673Q;
    public long h0;
    public C10842a i0;
    public ab j0;
    public gi9 k0;
    public Float l0;
    public int m0;
    public final String n0;
    public d32 o0;
    public ws p0;

    /* renamed from: s */
    public boolean f11674s;

    /* renamed from: x */
    public String f11675x;

    /* renamed from: y */
    public String f11676y;

    /* renamed from: com.facebook.login.widget.LoginButton$a */
    public static final class C10832a {
        public C10832a() {
        }

        public /* synthetic */ C10832a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$b */
    public static class C10833b {

        /* renamed from: a */
        public za5 f11677a = za5.FRIENDS;

        /* renamed from: b */
        public List f11678b = ch3.m21246k();

        /* renamed from: c */
        public fka f11679c = fka.NATIVE_WITH_FALLBACK;

        /* renamed from: d */
        public String f11680d = "rerequest";

        /* renamed from: e */
        public xka f11681e = xka.FACEBOOK;

        /* renamed from: f */
        public boolean f11682f;

        /* renamed from: g */
        public String f11683g;

        /* renamed from: h */
        public boolean f11684h;

        /* renamed from: a */
        public final String m13446a() {
            return this.f11680d;
        }

        /* renamed from: b */
        public final za5 m13447b() {
            return this.f11677a;
        }

        /* renamed from: c */
        public final fka m13448c() {
            return this.f11679c;
        }

        /* renamed from: d */
        public final xka m13449d() {
            return this.f11681e;
        }

        /* renamed from: e */
        public final String m13450e() {
            return this.f11683g;
        }

        /* renamed from: f */
        public final List m13451f() {
            return this.f11678b;
        }

        /* renamed from: g */
        public final boolean m13452g() {
            return this.f11684h;
        }

        /* renamed from: h */
        public final boolean m13453h() {
            return this.f11682f;
        }

        /* renamed from: i */
        public final void m13454i(String str) {
            sq8.m48649h(str, "<set-?>");
            this.f11680d = str;
        }

        /* renamed from: j */
        public final void m13455j(za5 za5Var) {
            sq8.m48649h(za5Var, "<set-?>");
            this.f11677a = za5Var;
        }

        /* renamed from: k */
        public final void m13456k(fka fkaVar) {
            sq8.m48649h(fkaVar, "<set-?>");
            this.f11679c = fkaVar;
        }

        /* renamed from: l */
        public final void m13457l(xka xkaVar) {
            sq8.m48649h(xkaVar, "<set-?>");
            this.f11681e = xkaVar;
        }

        /* renamed from: m */
        public final void m13458m(String str) {
            this.f11683g = str;
        }

        /* renamed from: n */
        public final void m13459n(List list) {
            sq8.m48649h(list, "<set-?>");
            this.f11678b = list;
        }

        /* renamed from: o */
        public final void m13460o(boolean z) {
            this.f11684h = z;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$c */
    public class ViewOnClickListenerC10834c implements View.OnClickListener {
        public ViewOnClickListenerC10834c() {
        }

        /* renamed from: g */
        public static final void m13462g(C10830e c10830e, DialogInterface dialogInterface, int i) {
            if (a94.m16694d(ViewOnClickListenerC10834c.class)) {
                return;
            }
            try {
                sq8.m48649h(c10830e, "$loginManager");
                c10830e.m13406r();
            } catch (Throwable th) {
                a94.m16692b(th, ViewOnClickListenerC10834c.class);
            }
        }

        /* renamed from: b */
        public C10830e mo13423b() {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                C10830e c10830eM13416c = C10830e.f11648j.m13416c();
                c10830eM13416c.m13412z(LoginButton.this.getDefaultAudience());
                c10830eM13416c.m13390C(LoginButton.this.getLoginBehavior());
                c10830eM13416c.m13391D(m13463c());
                c10830eM13416c.m13411y(LoginButton.this.getAuthType());
                c10830eM13416c.m13389B(m13464d());
                c10830eM13416c.m13394G(LoginButton.this.getShouldSkipAccountDeduplication());
                c10830eM13416c.m13392E(LoginButton.this.getMessengerPageId());
                c10830eM13416c.m13393F(LoginButton.this.getResetMessengerState());
                return c10830eM13416c;
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return null;
            }
        }

        /* renamed from: c */
        public final xka m13463c() {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                return xka.FACEBOOK;
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return null;
            }
        }

        /* renamed from: d */
        public final boolean m13464d() {
            a94.m16694d(this);
            return false;
        }

        /* renamed from: e */
        public final void m13465e() {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                C10830e c10830eMo13423b = mo13423b();
                ws wsVar = LoginButton.this.p0;
                if (wsVar != null) {
                    os osVarMo6147a = wsVar.mo6147a();
                    sq8.m48647f(osVarMo6147a, "null cannot be cast to non-null type com.facebook.login.LoginManager.FacebookLoginActivityResultContract");
                    C10830e.c cVar = (C10830e.c) osVarMo6147a;
                    d32 callbackManager = LoginButton.this.getCallbackManager();
                    if (callbackManager == null) {
                        callbackManager = new e32();
                    }
                    cVar.m13421f(callbackManager);
                    wsVar.m54945b(LoginButton.this.getProperties().m13451f());
                    return;
                }
                if (LoginButton.this.getFragment() != null) {
                    Fragment fragment = LoginButton.this.getFragment();
                    if (fragment != null) {
                        LoginButton loginButton = LoginButton.this;
                        c10830eMo13423b.m13404p(fragment, loginButton.getProperties().m13451f(), loginButton.getLoggerID());
                        return;
                    }
                    return;
                }
                if (LoginButton.this.getNativeFragment() == null) {
                    c10830eMo13423b.m13402n(LoginButton.this.getActivity(), LoginButton.this.getProperties().m13451f(), LoginButton.this.getLoggerID());
                    return;
                }
                android.app.Fragment nativeFragment = LoginButton.this.getNativeFragment();
                if (nativeFragment != null) {
                    LoginButton loginButton2 = LoginButton.this;
                    c10830eMo13423b.m13403o(nativeFragment, loginButton2.getProperties().m13451f(), loginButton2.getLoggerID());
                }
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }

        /* renamed from: f */
        public final void m13466f(Context context) {
            String string;
            if (a94.m16694d(this)) {
                return;
            }
            try {
                sq8.m48649h(context, "context");
                final C10830e c10830eMo13423b = mo13423b();
                if (!LoginButton.this.f11674s) {
                    c10830eMo13423b.m13406r();
                    return;
                }
                String string2 = LoginButton.this.getResources().getString(fae.com_facebook_loginview_log_out_action);
                sq8.m48648g(string2, "resources.getString(R.st…loginview_log_out_action)");
                String string3 = LoginButton.this.getResources().getString(fae.com_facebook_loginview_cancel_action);
                sq8.m48648g(string3, "resources.getString(R.st…_loginview_cancel_action)");
                Profile profileM12935b = Profile.f11367h.m12935b();
                if ((profileM12935b != null ? profileM12935b.m12929c() : null) != null) {
                    h8g h8gVar = h8g.f26398a;
                    String string4 = LoginButton.this.getResources().getString(fae.com_facebook_loginview_logged_in_as);
                    sq8.m48648g(string4, "resources.getString(R.st…k_loginview_logged_in_as)");
                    string = String.format(string4, Arrays.copyOf(new Object[]{profileM12935b.m12929c()}, 1));
                    sq8.m48648g(string, "format(format, *args)");
                } else {
                    string = LoginButton.this.getResources().getString(fae.com_facebook_loginview_logged_in_using_facebook);
                    sq8.m48648g(string, "{\n          resources.ge…using_facebook)\n        }");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() { // from class: o.lka
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        LoginButton.ViewOnClickListenerC10834c.m13462g(c10830eMo13423b, dialogInterface, i);
                    }
                }).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                sq8.m48649h(view, "v");
                LoginButton.this.m12808b(view);
                AccessToken.C10742c c10742c = AccessToken.f11242y;
                AccessToken accessTokenM12774e = c10742c.m12774e();
                boolean zM12776g = c10742c.m12776g();
                if (zM12776g) {
                    Context context = LoginButton.this.getContext();
                    sq8.m48648g(context, "context");
                    m13466f(context);
                } else {
                    m13465e();
                }
                ao8 ao8Var = new ao8(LoginButton.this.getContext());
                Bundle bundle = new Bundle();
                bundle.putInt("logging_in", accessTokenM12774e != null ? 0 : 1);
                bundle.putInt("access_token_expired", zM12776g ? 1 : 0);
                ao8Var.m17564g("fb_login_view_usage", bundle);
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.facebook.login.widget.LoginButton$d, still in use, count: 1, list:
      (r0v0 com.facebook.login.widget.LoginButton$d) from 0x0032: SPUT (r0v0 com.facebook.login.widget.LoginButton$d) (LINE:51) com.facebook.login.widget.LoginButton.d.DEFAULT com.facebook.login.widget.LoginButton$d
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.facebook.login.widget.LoginButton$d */
    public static final class EnumC10835d {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);

        private static final EnumC10835d DEFAULT = new EnumC10835d("automatic", 0);
        private final int intValue;
        private final String stringValue;
        public static final a Companion = new a(null);

        /* renamed from: com.facebook.login.widget.LoginButton$d$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final EnumC10835d m13467a(int i) {
                for (EnumC10835d enumC10835d : EnumC10835d.values()) {
                    if (enumC10835d.getIntValue() == i) {
                        return enumC10835d;
                    }
                }
                return null;
            }

            /* renamed from: b */
            public final EnumC10835d m13468b() {
                return EnumC10835d.DEFAULT;
            }
        }

        static {
        }

        private EnumC10835d(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static EnumC10835d valueOf(String str) {
            return (EnumC10835d) Enum.valueOf(EnumC10835d.class, str);
        }

        public static EnumC10835d[] values() {
            return (EnumC10835d[]) $VALUES.clone();
        }

        public final int getIntValue() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.stringValue;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$e */
    public /* synthetic */ class C10836e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11686a;

        static {
            int[] iArr = new int[EnumC10835d.values().length];
            try {
                iArr[EnumC10835d.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10835d.DISPLAY_ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10835d.NEVER_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11686a = iArr;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$f */
    public static final class C10837f extends ab {
        public C10837f() {
        }

        @Override // p001o.ab
        /* renamed from: d */
        public void mo13469d(AccessToken accessToken, AccessToken accessToken2) {
            LoginButton.this.m13438F();
            LoginButton.this.m13436D();
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$g */
    public static final class C10838g extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C10838g f11688a = new C10838g();

        public C10838g() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C10830e invoke() {
            return C10830e.f11648j.m13416c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, i, i2, str, str2);
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "analyticsButtonCreatedEventName");
        sq8.m48649h(str2, "analyticsButtonTappedEventName");
        this.f11670H = new C10833b();
        this.f11672M = C10842a.c.BLUE;
        this.f11673Q = EnumC10835d.Companion.m13468b();
        this.h0 = 6000L;
        this.k0 = si9.m48360a(C10838g.f11688a);
        this.m0 = Constants.MAX_HOST_LENGTH;
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "randomUUID().toString()");
        this.n0 = string;
    }

    /* renamed from: A */
    public static final void m13424A(d32.C12789a c12789a) {
    }

    /* renamed from: u */
    public static final void m13432u(String str, final LoginButton loginButton) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(str, "$appId");
        sq8.m48649h(loginButton, "this$0");
        final tt6 tt6VarM56803u = xt6.m56803u(str, false);
        loginButton.getActivity().runOnUiThread(new Runnable() { // from class: o.kka
            @Override // java.lang.Runnable
            public final void run() {
                LoginButton.m13433v(this.f32338a, tt6VarM56803u);
            }
        });
    }

    /* renamed from: v */
    public static final void m13433v(LoginButton loginButton, tt6 tt6Var) {
        sq8.m48649h(loginButton, "this$0");
        loginButton.m13440H(tt6Var);
    }

    /* renamed from: B */
    public final void m13434B(Context context, AttributeSet attributeSet, int i, int i2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(context, "context");
            EnumC10835d.a aVar = EnumC10835d.Companion;
            this.f11673Q = aVar.m13468b();
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, abe.com_facebook_login_view, i, i2);
            sq8.m48648g(typedArrayObtainStyledAttributes, "context\n            .the…efStyleAttr, defStyleRes)");
            try {
                this.f11674s = typedArrayObtainStyledAttributes.getBoolean(abe.com_facebook_login_view_com_facebook_confirm_logout, true);
                setLoginText(typedArrayObtainStyledAttributes.getString(abe.com_facebook_login_view_com_facebook_login_text));
                setLogoutText(typedArrayObtainStyledAttributes.getString(abe.com_facebook_login_view_com_facebook_logout_text));
                EnumC10835d enumC10835dM13467a = aVar.m13467a(typedArrayObtainStyledAttributes.getInt(abe.com_facebook_login_view_com_facebook_tooltip_mode, aVar.m13468b().getIntValue()));
                if (enumC10835dM13467a == null) {
                    enumC10835dM13467a = aVar.m13468b();
                }
                this.f11673Q = enumC10835dM13467a;
                if (typedArrayObtainStyledAttributes.hasValue(abe.com_facebook_login_view_com_facebook_login_button_radius)) {
                    this.l0 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(abe.com_facebook_login_view_com_facebook_login_button_radius, 0.0f));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(abe.com_facebook_login_view_com_facebook_login_button_transparency, Constants.MAX_HOST_LENGTH);
                this.m0 = integer;
                int iMax = Math.max(0, integer);
                this.m0 = iMax;
                this.m0 = Math.min(Constants.MAX_HOST_LENGTH, iMax);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: C */
    public final void m13435C(d32 d32Var, pr6 pr6Var) {
        sq8.m48649h(d32Var, "callbackManager");
        sq8.m48649h(pr6Var, "callback");
        ((C10830e) this.k0.getValue()).m13409v(d32Var, pr6Var);
        if (this.o0 == null) {
            this.o0 = d32Var;
        }
    }

    /* renamed from: D */
    public final void m13436D() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(lk0.m37353b(getContext(), s7e.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: E */
    public final void m13437E() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Float f = this.l0;
            if (f != null) {
                float fFloatValue = f.floatValue();
                Drawable background = getBackground();
                if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                    int stateCount = ((StateListDrawable) background).getStateCount();
                    for (int i = 0; i < stateCount; i++) {
                        Drawable stateDrawable = ((StateListDrawable) background).getStateDrawable(i);
                        GradientDrawable gradientDrawable = stateDrawable instanceof GradientDrawable ? (GradientDrawable) stateDrawable : null;
                        if (gradientDrawable != null) {
                            gradientDrawable.setCornerRadius(fFloatValue);
                        }
                    }
                }
                if (background instanceof GradientDrawable) {
                    ((GradientDrawable) background).setCornerRadius(fFloatValue);
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: F */
    public final void m13438F() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && AccessToken.f11242y.m12776g()) {
                String string = this.f11676y;
                if (string == null) {
                    string = resources.getString(fae.com_facebook_loginview_log_out_button);
                }
                setText(string);
                return;
            }
            String str = this.f11675x;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            sq8.m48648g(string2, "resources.getString(loginButtonContinueLabel)");
            int width = getWidth();
            if (width != 0 && m13445z(string2) > width) {
                string2 = resources.getString(fae.com_facebook_loginview_log_in_button);
                sq8.m48648g(string2, "resources.getString(R.st…_loginview_log_in_button)");
            }
            setText(string2);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: G */
    public final void m13439G() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.m0);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: H */
    public final void m13440H(tt6 tt6Var) {
        if (a94.m16694d(this) || tt6Var == null) {
            return;
        }
        try {
            if (tt6Var.m50545l() && getVisibility() == 0) {
                m13443x(tt6Var.m50544k());
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase
    /* renamed from: c */
    public void mo12809c(Context context, AttributeSet attributeSet, int i, int i2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(context, "context");
            super.mo12809c(context, attributeSet, i, i2);
            setInternalOnClickListener(getNewLoginClickListener());
            m13434B(context, attributeSet, i, i2);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(p6e.com_facebook_blue));
                setLoginText("Continue with Facebook");
            } else {
                this.j0 = new C10837f();
            }
            m13438F();
            m13437E();
            m13439G();
            m13436D();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public final String getAuthType() {
        return this.f11670H.m13446a();
    }

    public final d32 getCallbackManager() {
        return this.o0;
    }

    public final za5 getDefaultAudience() {
        return this.f11670H.m13447b();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            return e32.EnumC13090c.Login.toRequestCode();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return oae.com_facebook_loginview_default_style;
    }

    public final String getLoggerID() {
        return this.n0;
    }

    public final fka getLoginBehavior() {
        return this.f11670H.m13448c();
    }

    public final int getLoginButtonContinueLabel() {
        return fae.com_facebook_loginview_log_in_button_continue;
    }

    public final gi9 getLoginManagerLazy() {
        return this.k0;
    }

    public final xka getLoginTargetApp() {
        return this.f11670H.m13449d();
    }

    public final String getLoginText() {
        return this.f11675x;
    }

    public final String getLogoutText() {
        return this.f11676y;
    }

    public final String getMessengerPageId() {
        return this.f11670H.m13450e();
    }

    public ViewOnClickListenerC10834c getNewLoginClickListener() {
        return new ViewOnClickListenerC10834c();
    }

    public final List<String> getPermissions() {
        return this.f11670H.m13451f();
    }

    public final C10833b getProperties() {
        return this.f11670H;
    }

    public final boolean getResetMessengerState() {
        return this.f11670H.m13452g();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.f11670H.m13453h();
    }

    public final long getToolTipDisplayTime() {
        return this.h0;
    }

    public final EnumC10835d getToolTipMode() {
        return this.f11673Q;
    }

    public final C10842a.c getToolTipStyle() {
        return this.f11672M;
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof ys) {
                Object context = getContext();
                sq8.m48647f(context, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                this.p0 = ((ys) context).getActivityResultRegistry().m56740i("facebook-login", ((C10830e) this.k0.getValue()).m13397i(this.o0, this.n0), new ns() { // from class: o.ika
                    @Override // p001o.ns
                    /* renamed from: a */
                    public final void mo6217a(Object obj) {
                        LoginButton.m13424A((d32.C12789a) obj);
                    }
                });
            }
            ab abVar = this.j0;
            if (abVar == null || !abVar.m16791c()) {
                return;
            }
            abVar.m16792e();
            m13438F();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            ws wsVar = this.p0;
            if (wsVar != null) {
                wsVar.mo6149d();
            }
            ab abVar = this.j0;
            if (abVar != null) {
                abVar.m16793f();
            }
            m13442w();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(canvas, "canvas");
            super.onDraw(canvas);
            if (this.f11671L || isInEditMode()) {
                return;
            }
            this.f11671L = true;
            m13441t();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            m13438F();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int iM13444y = m13444y(i);
            String string = this.f11676y;
            if (string == null) {
                string = resources.getString(fae.com_facebook_loginview_log_out_button);
                sq8.m48648g(string, "resources.getString(R.st…loginview_log_out_button)");
            }
            setMeasuredDimension(View.resolveSize(Math.max(iM13444y, m13445z(string)), i), compoundPaddingTop);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(view, "changedView");
            super.onVisibilityChanged(view, i);
            if (i != 0) {
                m13442w();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public final void setAuthType(String str) {
        sq8.m48649h(str, "value");
        this.f11670H.m13454i(str);
    }

    public final void setDefaultAudience(za5 za5Var) {
        sq8.m48649h(za5Var, "value");
        this.f11670H.m13455j(za5Var);
    }

    public final void setLoginBehavior(fka fkaVar) {
        sq8.m48649h(fkaVar, "value");
        this.f11670H.m13456k(fkaVar);
    }

    public final void setLoginManagerLazy(gi9 gi9Var) {
        sq8.m48649h(gi9Var, "<set-?>");
        this.k0 = gi9Var;
    }

    public final void setLoginTargetApp(xka xkaVar) {
        sq8.m48649h(xkaVar, "value");
        this.f11670H.m13457l(xkaVar);
    }

    public final void setLoginText(String str) {
        this.f11675x = str;
        m13438F();
    }

    public final void setLogoutText(String str) {
        this.f11676y = str;
        m13438F();
    }

    public final void setMessengerPageId(String str) {
        this.f11670H.m13458m(str);
    }

    public final void setPermissions(String... strArr) {
        sq8.m48649h(strArr, "permissions");
        this.f11670H.m13459n(ch3.m21251p(Arrays.copyOf(strArr, strArr.length)));
    }

    public final void setPublishPermissions(List<String> list) {
        sq8.m48649h(list, "permissions");
        this.f11670H.m13459n(list);
    }

    public final void setReadPermissions(List<String> list) {
        sq8.m48649h(list, "permissions");
        this.f11670H.m13459n(list);
    }

    public final void setResetMessengerState(boolean z) {
        this.f11670H.m13460o(z);
    }

    public final void setToolTipDisplayTime(long j) {
        this.h0 = j;
    }

    public final void setToolTipMode(EnumC10835d enumC10835d) {
        sq8.m48649h(enumC10835d, "<set-?>");
        this.f11673Q = enumC10835d;
    }

    public final void setToolTipStyle(C10842a.c cVar) {
        sq8.m48649h(cVar, "<set-?>");
        this.f11672M = cVar;
    }

    /* renamed from: t */
    public final void m13441t() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            int i = C10836e.f11686a[this.f11673Q.ordinal()];
            if (i == 1) {
                final String strM21647K = cri.m21647K(getContext());
                C10773c.m13028u().execute(new Runnable() { // from class: o.jka
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                        LoginButton.m13432u(strM21647K, this);
                    }
                });
            } else {
                if (i != 2) {
                    return;
                }
                String string = getResources().getString(fae.com_facebook_tooltip_default);
                sq8.m48648g(string, "resources.getString(R.st…facebook_tooltip_default)");
                m13443x(string);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: w */
    public final void m13442w() {
        C10842a c10842a = this.i0;
        if (c10842a != null) {
            c10842a.m13491d();
        }
        this.i0 = null;
    }

    /* renamed from: x */
    public final void m13443x(String str) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            C10842a c10842a = new C10842a(str, this);
            c10842a.m13494h(this.f11672M);
            c10842a.m13493g(this.h0);
            c10842a.m13495i();
            this.i0 = c10842a;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: y */
    public final int m13444y(int i) {
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String string = this.f11675x;
            if (string == null) {
                string = resources.getString(fae.com_facebook_loginview_log_in_button_continue);
                int iM13445z = m13445z(string);
                if (View.resolveSize(iM13445z, i) < iM13445z) {
                    string = resources.getString(fae.com_facebook_loginview_log_in_button);
                }
            }
            return m13445z(string);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    /* renamed from: z */
    public final int m13445z(String str) {
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + m12812f(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    public final void setPermissions(List<String> list) {
        sq8.m48649h(list, "value");
        this.f11670H.m13459n(list);
    }

    public final void setPublishPermissions(String... strArr) {
        sq8.m48649h(strArr, "permissions");
        this.f11670H.m13459n(ch3.m21251p(Arrays.copyOf(strArr, strArr.length)));
    }

    public final void setReadPermissions(String... strArr) {
        sq8.m48649h(strArr, "permissions");
        this.f11670H.m13459n(ch3.m21251p(Arrays.copyOf(strArr, strArr.length)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context) {
        this(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        sq8.m48649h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        sq8.m48649h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, "fb_login_button_create", "fb_login_button_did_tap");
        sq8.m48649h(context, "context");
    }
}
