package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.fido.fido2.api.common.C1275a;
import com.google.android.gms.fido.fido2.api.common.C1277c;
import ex.InterfaceC2137a;
import gg.C2588c;
import gg.C2590e;
import gg.C2591f;
import gg.C2597l;
import h6.AbstractC2847c;
import h6.C2850f;
import h6.C2851g;
import h6.InterfaceC2855k;
import i6.C3172a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import mg.u0;
import org.json.JSONException;
import org.json.JSONObject;
import pg.AbstractC5933n;
import qw.a0;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<C2850f, C1277c, C2597l, AbstractC2847c, CreateCredentialException> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private InterfaceC2855k callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final ResultReceiverC0288x1c337a18 resultReceiver;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            AbstractC4154l.m8923f(context, "context");
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1 */
    public static final class C02851 extends AbstractC4155m implements InterfaceC2137a {
        final /* synthetic */ JSONException $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02851(JSONException jSONException) {
            super(0);
            this.$e = jSONException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, JSONException e2) {
            AbstractC4154l.m8923f(this$0, "this$0");
            AbstractC4154l.m8923f(e2, "$e");
            InterfaceC2855k interfaceC2855k = this$0.callback;
            if (interfaceC2855k != null) {
                interfaceC2855k.mo5820a(this$0.JSONExceptionToPKCError(e2));
            } else {
                AbstractC4154l.m8928k("callback");
                throw null;
            }
        }

        @Override // ex.InterfaceC2137a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16538invoke();
            return a0.f30746a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m16538invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor != null) {
                executor.execute(new RunnableC0291b(CredentialProviderCreatePublicKeyCredentialController.this, this.$e, 1));
            } else {
                AbstractC4154l.m8928k("executor");
                throw null;
            }
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2 */
    public static final class C02862 extends AbstractC4155m implements InterfaceC2137a {
        final /* synthetic */ Throwable $t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02862(Throwable th2) {
            super(0);
            this.$t = th2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, Throwable t7) {
            AbstractC4154l.m8923f(this$0, "this$0");
            AbstractC4154l.m8923f(t7, "$t");
            InterfaceC2855k interfaceC2855k = this$0.callback;
            if (interfaceC2855k != null) {
                interfaceC2855k.mo5820a(new CreateCredentialUnknownException(t7.getMessage()));
            } else {
                AbstractC4154l.m8928k("callback");
                throw null;
            }
        }

        @Override // ex.InterfaceC2137a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16539invoke();
            return a0.f30746a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m16539invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor != null) {
                executor.execute(new RunnableC0292c(CredentialProviderCreatePublicKeyCredentialController.this, this.$t, 1));
            } else {
                AbstractC4154l.m8928k("executor");
                throw null;
            }
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3 */
    public static final class C02873 extends AbstractC4155m implements InterfaceC2137a {
        public C02873() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
            AbstractC4154l.m8923f(this$0, "this$0");
            InterfaceC2855k interfaceC2855k = this$0.callback;
            if (interfaceC2855k != null) {
                interfaceC2855k.mo5820a(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
            } else {
                AbstractC4154l.m8928k("callback");
                throw null;
            }
        }

        @Override // ex.InterfaceC2137a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16540invoke();
            return a0.f30746a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m16540invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor != null) {
                executor.execute(new RunnableC0293d(CredentialProviderCreatePublicKeyCredentialController.this, 0));
            } else {
                AbstractC4154l.m8928k("executor");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        AbstractC4154l.m8923f(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                AbstractC4154l.m8923f(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
                C0289xdfe2be02 c0289xdfe2be02 = new C0289xdfe2be02(CredentialProviderBaseController.Companion);
                Executor executor = this.this$0.executor;
                if (executor == null) {
                    AbstractC4154l.m8928k("executor");
                    throw null;
                }
                InterfaceC2855k interfaceC2855k = this.this$0.callback;
                if (interfaceC2855k == null) {
                    AbstractC4154l.m8928k("callback");
                    throw null;
                }
                if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, c0289xdfe2be02, executor, interfaceC2855k, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreatePublicKeyCredentialDomException JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        return (message == null || message.length() <= 0) ? new CreatePublicKeyCredentialDomException(new C3172a(3), "Unknown error") : new CreatePublicKeyCredentialDomException(new C3172a(3), message);
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
        AbstractC4154l.m8923f(this$0, "this$0");
        InterfaceC2855k interfaceC2855k = this$0.callback;
        if (interfaceC2855k != null) {
            interfaceC2855k.mo5820a(new CreatePublicKeyCredentialDomException(new C3172a(22), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
        } else {
            AbstractC4154l.m8928k("callback");
            throw null;
        }
    }

    public final void handleResponse$credentials_play_services_auth_release(int i10, int i11, Intent intent) {
        if (i10 != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE();
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i11, C0279xb96e2c35.INSTANCE, new C0280xb96e2c36(this), this.cancellationSignal)) {
            return;
        }
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor = this.executor;
            if (executor != null) {
                executor.execute(new RunnableC0293d(this, 1));
                return;
            } else {
                AbstractC4154l.m8928k("executor");
                throw null;
            }
        }
        C2597l c2597l = (C2597l) AbstractC5933n.m11793a(byteArrayExtra, C2597l.CREATOR);
        AbstractC4154l.m8922e(c2597l, "deserializeFromBytes(bytes)");
        CreateCredentialException createCredentialExceptionPublicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(c2597l);
        if (createCredentialExceptionPublicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0281xb96e2c38(this, createCredentialExceptionPublicKeyCredentialResponseContainsError));
            return;
        }
        try {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0282xb96e2c39(this, convertResponseToCredentialManager(c2597l)));
        } catch (JSONException e2) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0283xb96e2c3a(this, e2));
        } catch (Throwable th2) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0284xb96e2c3b(this, th2));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public C1277c convertRequestToPlayServices(C2850f request) {
        AbstractC4154l.m8923f(request, "request");
        return PublicKeyCredentialControllerUtility.Companion.convert(request, this.context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public AbstractC2847c convertResponseToCredentialManager(C2597l response) throws CreateCredentialUnknownException {
        JSONObject jSONObjectM6585b;
        String str = "response";
        AbstractC4154l.m8923f(response, "response");
        try {
            C1275a c1275a = response.f14121f;
            u0 u0Var = response.f14118c;
            try {
                JSONObject jSONObject = new JSONObject();
                if (u0Var != null && u0Var.m9652m().length > 0) {
                    jSONObject.put("rawId", AbstractC8947b.m16426c(u0Var.m9652m()));
                }
                String str2 = response.f14123h;
                if (str2 != null) {
                    jSONObject.put("authenticatorAttachment", str2);
                }
                String str3 = response.f14117b;
                if (str3 != null && c1275a == null) {
                    jSONObject.put(TransferTable.COLUMN_TYPE, str3);
                }
                String str4 = response.f14116a;
                if (str4 != null) {
                    jSONObject.put("id", str4);
                }
                C2590e c2590e = response.f14120e;
                boolean z6 = true;
                if (c2590e != null) {
                    jSONObjectM6585b = c2590e.m6583b();
                } else {
                    C2591f c2591f = response.f14119d;
                    if (c2591f != null) {
                        jSONObjectM6585b = c2591f.m6585b();
                    } else {
                        z6 = false;
                        if (c1275a != null) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("code", c1275a.f6023a.getCode());
                                String str5 = c1275a.f6024b;
                                if (str5 != null) {
                                    jSONObject2.put("message", str5);
                                }
                                jSONObjectM6585b = jSONObject2;
                                str = "error";
                            } catch (JSONException e2) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e2);
                            }
                        } else {
                            jSONObjectM6585b = null;
                        }
                    }
                }
                if (jSONObjectM6585b != null) {
                    jSONObject.put(str, jSONObjectM6585b);
                }
                C2588c c2588c = response.f14122g;
                if (c2588c != null) {
                    jSONObject.put("clientExtensionResults", c2588c.m6582b());
                } else if (z6) {
                    jSONObject.put("clientExtensionResults", new JSONObject());
                }
                String string = jSONObject.toString();
                AbstractC4154l.m8922e(string, "response.toJson()");
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", string);
                return new C2851g(string, bundle);
            } catch (JSONException e10) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
            }
        } catch (Throwable th2) {
            throw new CreateCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C2850f request, InterfaceC2855k callback, Executor executor, CancellationSignal cancellationSignal) {
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(callback, "callback");
        AbstractC4154l.m8923f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            C1277c c1277cConvertRequestToPlayServices = convertRequestToPlayServices(request);
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, c1277cConvertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            try {
                this.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C02873());
            }
        } catch (JSONException e2) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C02851(e2));
        } catch (Throwable th2) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C02862(th2));
        }
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }
}
