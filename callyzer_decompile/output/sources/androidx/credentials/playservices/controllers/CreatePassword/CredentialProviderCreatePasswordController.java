package androidx.credentials.playservices.controllers.CreatePassword;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import ex.InterfaceC2137a;
import h6.AbstractC2847c;
import h6.AbstractC2849e;
import h6.C2848d;
import h6.InterfaceC2855k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import lf.C4457h;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialProviderCreatePasswordController extends CredentialProviderController<AbstractC2849e, C4457h, a0, AbstractC2847c, CreateCredentialException> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePassword";
    private InterfaceC2855k callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            AbstractC4154l.m8923f(context, "context");
            return new CredentialProviderCreatePasswordController(context);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$invokePlayServices$1 */
    public static final class C02751 extends AbstractC4155m implements InterfaceC2137a {
        public C02751() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePasswordController this$0) {
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
            m16531invoke();
            return a0.f30746a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m16531invoke() {
            Executor executor = CredentialProviderCreatePasswordController.this.executor;
            if (executor == null) {
                AbstractC4154l.m8928k("executor");
                throw null;
            }
            final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.b
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePasswordController.C02751.invoke$lambda$0(credentialProviderCreatePasswordController);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(Context context) {
        super(context);
        AbstractC4154l.m8923f(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                AbstractC4154l.m8923f(resultData, "resultData");
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
                C0276x4c19f34c c0276x4c19f34c = new C0276x4c19f34c(CredentialProviderBaseController.Companion);
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
                if (credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(resultData, c0276x4c19f34c, executor, interfaceC2855k, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10);
            }
        };
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public C4457h convertRequestToPlayServices2(AbstractC2849e request) {
        AbstractC4154l.m8923f(request, "request");
        throw null;
    }

    public final void handleResponse$credentials_play_services_auth_release(int i10, int i11) {
        if (i10 != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE();
        } else {
            if (CredentialProviderController.maybeReportErrorResultCodeCreate(i11, CredentialProviderCreatePasswordController$handleResponse$1.INSTANCE, new CredentialProviderCreatePasswordController$handleResponse$2(this), this.cancellationSignal)) {
                return;
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePasswordController$handleResponse$3(this, convertResponseToCredentialManager(a0.f30746a)));
        }
    }

    /* renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(AbstractC2849e request, InterfaceC2855k interfaceC2855k, Executor executor, CancellationSignal cancellationSignal) {
        AbstractC4154l.m8923f(request, "request");
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ C4457h convertRequestToPlayServices(AbstractC2849e abstractC2849e) {
        if (abstractC2849e == null) {
            return convertRequestToPlayServices2((AbstractC2849e) null);
        }
        throw new ClassCastException();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public AbstractC2847c convertResponseToCredentialManager(a0 response) {
        AbstractC4154l.m8923f(response, "response");
        new Bundle();
        return new C2848d();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(AbstractC2849e abstractC2849e, InterfaceC2855k interfaceC2855k, Executor executor, CancellationSignal cancellationSignal) {
        if (abstractC2849e != null) {
            throw new ClassCastException();
        }
        invokePlayServices2((AbstractC2849e) null, interfaceC2855k, executor, cancellationSignal);
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }
}
