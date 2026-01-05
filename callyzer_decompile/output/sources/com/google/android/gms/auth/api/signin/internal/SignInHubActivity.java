package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.o0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import e1.v0;
import j7.AbstractC3594a;
import j7.C3595b;
import j7.C3596c;
import j7.C3597d;
import j7.C3598e;
import java.lang.reflect.Modifier;
import java.util.Set;
import l1.C4327p;
import nf.C5040b;
import nf.C5042d;
import nf.C5047i;
import qf.AbstractC6209h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends o0 {

    /* renamed from: f */
    public static boolean f5991f = false;

    /* renamed from: a */
    public boolean f5992a = false;

    /* renamed from: b */
    public SignInConfiguration f5993b;

    /* renamed from: c */
    public boolean f5994c;

    /* renamed from: d */
    public int f5995d;

    /* renamed from: e */
    public Intent f5996e;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [d7.u, java.lang.Object] */
    /* renamed from: f */
    public final void m3089f() {
        AbstractC3594a supportLoaderManager = getSupportLoaderManager();
        C4327p c4327p = new C4327p(7, this);
        C3598e c3598e = (C3598e) supportLoaderManager;
        ?? r22 = c3598e.f19222a;
        C3597d c3597d = c3598e.f19223b;
        boolean z6 = c3597d.f19221c;
        v0 v0Var = c3597d.f19220b;
        if (z6) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C3595b c3595b = (C3595b) v0Var.m5646c(0);
        if (c3595b == 0) {
            try {
                c3597d.f19221c = true;
                Set set = AbstractC6209h.f30197a;
                synchronized (set) {
                }
                C5042d c5042d = new C5042d(this, set);
                if (C5042d.class.isMemberClass() && !Modifier.isStatic(C5042d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c5042d);
                }
                C3595b c3595b2 = new C3595b(c5042d);
                v0Var.m5648e(0, c3595b2);
                c3597d.f19221c = false;
                C3596c c3596c = new C3596c(c3595b2.f19214l, c4327p);
                c3595b2.m5315e(r22, c3596c);
                C3596c c3596c2 = c3595b2.f19216n;
                if (c3596c2 != null) {
                    c3595b2.mo5320j(c3596c2);
                }
                c3595b2.f19215m = r22;
                c3595b2.f19216n = c3596c;
            } catch (Throwable th2) {
                c3597d.f19221c = false;
                throw th2;
            }
        } else {
            C3596c c3596c3 = new C3596c(c3595b.f19214l, c4327p);
            c3595b.m5315e(r22, c3596c3);
            C3596c c3596c4 = c3595b.f19216n;
            if (c3596c4 != null) {
                c3595b.mo5320j(c3596c4);
            }
            c3595b.f19215m = r22;
            c3595b.f19216n = c3596c3;
        }
        f5991f = false;
    }

    /* renamed from: g */
    public final void m3090g(int i10) {
        Status status = new Status(i10, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f5991f = false;
    }

    @Override // androidx.fragment.app.o0, p004e.AbstractActivityC1878m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f5992a) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f5987b) != null) {
                C5047i c5047iM9974Z = C5047i.m9974Z(this);
                GoogleSignInOptions googleSignInOptions = this.f5993b.f5990b;
                synchronized (c5047iM9974Z) {
                    ((C5040b) c5047iM9974Z.f24823b).m9959c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f5994c = true;
                this.f5995d = i11;
                this.f5996e = intent;
                m3089f();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m3090g(intExtra);
                return;
            }
        }
        m3090g(8);
    }

    @Override // androidx.fragment.app.o0, p004e.AbstractActivityC1878m, q5.AbstractActivityC6110c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            m3090g(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            m3090g(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            "Unknown action: ".concat(String.valueOf(intent.getAction()));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.f5993b = signInConfiguration;
        if (bundle != null) {
            boolean z6 = bundle.getBoolean("signingInGoogleApiClients");
            this.f5994c = z6;
            if (z6) {
                this.f5995d = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 == null) {
                    setResult(0);
                    finish();
                    return;
                } else {
                    this.f5996e = intent2;
                    m3089f();
                    return;
                }
            }
            return;
        }
        if (f5991f) {
            setResult(0);
            m3090g(12502);
            return;
        }
        f5991f = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f5993b);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f5992a = true;
            m3090g(17);
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f5991f = false;
    }

    @Override // p004e.AbstractActivityC1878m, q5.AbstractActivityC6110c, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f5994c);
        if (this.f5994c) {
            bundle.putInt("signInResultCode", this.f5995d);
            bundle.putParcelable("signInResultData", this.f5996e);
        }
    }
}
