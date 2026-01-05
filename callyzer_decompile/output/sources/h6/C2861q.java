package h6;

import a2.C0036i;
import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import c9.C0910e;
import com.websoptimization.callyzerbiz.R;
import ey.C2147b;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.q */
/* loaded from: classes.dex */
public final class C2861q implements InterfaceC2858n {

    /* renamed from: a */
    public final CredentialManager f15871a;

    public C2861q(Context context) {
        AbstractC4154l.m8923f(context, "context");
        this.f15871a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // h6.InterfaceC2858n
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f15871a != null;
    }

    @Override // h6.InterfaceC2858n
    public final void onCreateCredential(Context context, AbstractC2846b abstractC2846b, CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k interfaceC2855k) {
        AbstractC4154l.m8923f(context, "context");
        C2853i c2853i = (C2853i) interfaceC2855k;
        C0036i c0036i = new C0036i(13, c2853i);
        CredentialManager credentialManager = this.f15871a;
        if (credentialManager == null) {
            c0036i.invoke();
            return;
        }
        C2860p c2860p = new C2860p(c2853i, (C2850f) abstractC2846b, this);
        AbstractC4154l.m8920c(credentialManager);
        Bundle bundle = abstractC2846b.f15857a;
        C0910e c0910e = abstractC2846b.f15859c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) c0910e.f5579b);
        CharSequence charSequence = (CharSequence) c0910e.f5580c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, R.drawable.ic_passkey));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, abstractC2846b.f15858b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        AbstractC4154l.m8922e(alwaysSendAppInfoToProvider, "Builder(\n               …ndAppInfoToProvider(true)");
        CreateCredentialRequest createCredentialRequestBuild = alwaysSendAppInfoToProvider.build();
        AbstractC4154l.m8922e(createCredentialRequestBuild, "createCredentialRequestBuilder.build()");
        credentialManager.createCredential(context, createCredentialRequestBuild, cancellationSignal, executor, c2860p);
    }

    @Override // h6.InterfaceC2858n
    public final void onGetCredential(Context context, C2863s c2863s, CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k interfaceC2855k) {
        AbstractC4154l.m8923f(context, "context");
        C2147b c2147b = (C2147b) interfaceC2855k;
        C0036i c0036i = new C0036i(14, c2147b);
        CredentialManager credentialManager = this.f15871a;
        if (credentialManager == null) {
            c0036i.invoke();
            return;
        }
        C2860p c2860p = new C2860p(c2147b, this);
        AbstractC4154l.m8920c(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (AbstractC2857m abstractC2857m : c2863s.f15872a) {
            abstractC2857m.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", abstractC2857m.f15865a, abstractC2857m.f15866b).setIsSystemProviderRequired(false).setAllowedProviders(abstractC2857m.f15867c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builder.build();
        AbstractC4154l.m8922e(getCredentialRequestBuild, "builder.build()");
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, executor, c2860p);
    }
}
