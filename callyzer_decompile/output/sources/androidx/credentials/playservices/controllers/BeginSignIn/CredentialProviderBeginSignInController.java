package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import ex.InterfaceC2137a;
import h6.C2862r;
import h6.C2863s;
import h6.C2864t;
import h6.C2867w;
import h6.InterfaceC2855k;
import ig.C3247c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;
import lf.C4454e;
import lf.C4459j;
import lf.C4463n;
import pg.AbstractC5927h;
import qw.a0;
import sf.AbstractC6840z;
import zg.C8953b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController extends CredentialProviderController<C2863s, C4454e, C4459j, C2864t, GetCredentialException> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BeginSignIn";
    public InterfaceC2855k callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final CredentialProviderBeginSignInController getInstance(Context context) {
            AbstractC4154l.m8923f(context, "context");
            return new CredentialProviderBeginSignInController(context);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$invokePlayServices$1 */
    public static final class C02701 extends AbstractC4155m implements InterfaceC2137a {
        public C02701() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderBeginSignInController this$0) {
            AbstractC4154l.m8923f(this$0, "this$0");
            this$0.getCallback().mo5820a(new GetCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }

        @Override // ex.InterfaceC2137a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16529invoke();
            return a0.f30746a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m16529invoke() {
            Executor executor = CredentialProviderBeginSignInController.this.getExecutor();
            final CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.c
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderBeginSignInController.C02701.invoke$lambda$0(credentialProviderBeginSignInController);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        AbstractC4154l.m8923f(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                AbstractC4154l.m8923f(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new C0271x4b514208(CredentialProviderBaseController.Companion), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final C8953b createGoogleIdCredential(C4459j c4459j) {
        String str = c4459j.f22214a;
        AbstractC4154l.m8922e(str, "response.id");
        String str2 = c4459j.f22220g;
        AbstractC4154l.m8920c(str2);
        String str3 = c4459j.f22215b;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = c4459j.f22216c;
        String str5 = str4 != null ? str4 : null;
        String str6 = c4459j.f22217d;
        if (str6 == null) {
            str6 = null;
        }
        String str7 = c4459j.f22221h;
        String str8 = str7 != null ? str7 : null;
        Uri uri = c4459j.f22218e;
        return new C8953b(str, str2, str3, str6, str5, uri != null ? uri : null, str8);
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public C2864t convertResponseToCredentialManager(C4459j response) throws GetCredentialException {
        AbstractC5927h c2867w;
        AbstractC4154l.m8923f(response, "response");
        String str = response.f22219f;
        if (str != null) {
            String str2 = response.f22214a;
            AbstractC4154l.m8922e(str2, "response.id");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            c2867w = new C2862r(str, bundle, 1);
        } else if (response.f22220g != null) {
            c2867w = createGoogleIdCredential(response);
        } else if (response.f22222j != null) {
            String authenticationResponseJson = PublicKeyCredentialControllerUtility.Companion.toAssertPasskeyResponse(response);
            AbstractC4154l.m8923f(authenticationResponseJson, "authenticationResponseJson");
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", authenticationResponseJson);
            c2867w = new C2867w(authenticationResponseJson, bundle2);
        } else {
            c2867w = null;
        }
        if (c2867w != null) {
            return new C2864t(c2867w);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    public final InterfaceC2855k getCallback() {
        InterfaceC2855k interfaceC2855k = this.callback;
        if (interfaceC2855k != null) {
            return interfaceC2855k;
        }
        AbstractC4154l.m8928k("callback");
        throw null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        AbstractC4154l.m8928k("executor");
        throw null;
    }

    public final void handleResponse$credentials_play_services_auth_release(int i10, int i11, Intent intent) {
        if (i10 != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE();
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeGet(i11, CredentialProviderBeginSignInController$handleResponse$1.INSTANCE, new CredentialProviderBeginSignInController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        try {
            Context context = this.context;
            AbstractC6840z.m13036g(context);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$3(this, convertResponseToCredentialManager(new C3247c(context, new C4463n()).m7585c(intent))));
        } catch (GetCredentialException e2) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$5(this, e2));
        } catch (ApiException e10) {
            C4168z c4168z = new C4168z();
            c4168z.f21164a = new GetCredentialUnknownException(e10.getMessage());
            Status status = e10.f5997a;
            if (status.f6007a == 16) {
                c4168z.f21164a = new GetCredentialCancellationException(e10.getMessage());
            } else if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(status.f6007a))) {
                c4168z.f21164a = new GetCredentialInterruptedException(e10.getMessage());
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, c4168z));
        } catch (Throwable th2) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$6(this, new GetCredentialUnknownException(th2.getMessage())));
        }
    }

    public final void setCallback(InterfaceC2855k interfaceC2855k) {
        AbstractC4154l.m8923f(interfaceC2855k, "<set-?>");
        this.callback = interfaceC2855k;
    }

    public final void setExecutor(Executor executor) {
        AbstractC4154l.m8923f(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public C4454e convertRequestToPlayServices(C2863s request) {
        AbstractC4154l.m8923f(request, "request");
        return BeginSignInControllerUtility.Companion.m781x545fe152(request, this.context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C2863s request, InterfaceC2855k callback, Executor executor, CancellationSignal cancellationSignal) {
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(callback, "callback");
        AbstractC4154l.m8923f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        C4454e c4454eConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, c4454eConvertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C02701());
        }
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }
}
