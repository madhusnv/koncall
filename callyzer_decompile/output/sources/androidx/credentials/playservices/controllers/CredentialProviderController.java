package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h6.InterfaceC2855k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {
    public static final Companion Companion = new Companion(null);
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    private final Context context;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, InterfaceC2137a onResultOrException) {
            AbstractC4154l.m8923f(onResultOrException, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        /* renamed from: generateErrorStringCanceled$credentials_play_services_auth_release */
        public final String m801x576fb150() {
            return "activity is cancelled by the user.";
        }

        /* renamed from: generateErrorStringUnknown$credentials_play_services_auth_release */
        public final String m802x14b42947(int i10) {
            return AbstractC5601a.m11232c(i10, "activity with result code: ", " indicating not RESULT_OK");
        }

        public final boolean maybeReportErrorResultCodeCreate(int i10, InterfaceC2141e cancelOnError, InterfaceC2139c onError, CancellationSignal cancellationSignal) {
            AbstractC4154l.m8923f(cancelOnError, "cancelOnError");
            AbstractC4154l.m8923f(onError, "onError");
            if (i10 == -1) {
                return false;
            }
            C4168z c4168z = new C4168z();
            c4168z.f21164a = new CreateCredentialUnknownException(m802x14b42947(i10));
            if (i10 == 0) {
                c4168z.f21164a = new CreateCredentialCancellationException(m801x576fb150());
            }
            cancelOnError.invoke(cancellationSignal, new C0294x7cfe4d37(onError, c4168z));
            return true;
        }

        public final boolean maybeReportErrorResultCodeGet(int i10, InterfaceC2141e cancelOnError, InterfaceC2139c onError, CancellationSignal cancellationSignal) {
            AbstractC4154l.m8923f(cancelOnError, "cancelOnError");
            AbstractC4154l.m8923f(onError, "onError");
            if (i10 == -1) {
                return false;
            }
            C4168z c4168z = new C4168z();
            c4168z.f21164a = new GetCredentialUnknownException(m802x14b42947(i10));
            if (i10 == 0) {
                c4168z.f21164a = new GetCredentialCancellationException(m801x576fb150());
            }
            cancelOnError.invoke(cancellationSignal, new C0295x6edb4e75(onError, c4168z));
            return true;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1 */
    public static final class C02961 extends AbstractC4155m implements InterfaceC2137a {
        final /* synthetic */ InterfaceC2855k $callback;
        final /* synthetic */ E1 $exception;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02961(Executor executor, InterfaceC2855k interfaceC2855k, E1 e12) {
            super(0);
            this.$executor = executor;
            this.$callback = interfaceC2855k;
            this.$exception = e12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(InterfaceC2855k callback, Object exception) {
            AbstractC4154l.m8923f(callback, "$callback");
            AbstractC4154l.m8923f(exception, "$exception");
            callback.mo5820a(exception);
        }

        @Override // ex.InterfaceC2137a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16544invoke();
            return a0.f30746a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m16544invoke() {
            Executor executor = this.$executor;
            final InterfaceC2855k interfaceC2855k = this.$callback;
            final E1 e12 = this.$exception;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.a
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderController.C02961.invoke$lambda$0(interfaceC2855k, e12);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        AbstractC4154l.m8923f(context, "context");
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, InterfaceC2137a interfaceC2137a) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, interfaceC2137a);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i10, InterfaceC2141e interfaceC2141e, InterfaceC2139c interfaceC2139c, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i10, interfaceC2141e, interfaceC2139c, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i10, InterfaceC2141e interfaceC2141e, InterfaceC2139c interfaceC2139c, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i10, interfaceC2141e, interfaceC2139c, cancellationSignal);
    }

    public abstract T2 convertRequestToPlayServices(T1 t12);

    public abstract R1 convertResponseToCredentialManager(R2 r22);

    public abstract void invokePlayServices(T1 t12, InterfaceC2855k interfaceC2855k, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle resultData, InterfaceC2141e conversionFn, Executor executor, InterfaceC2855k callback, CancellationSignal cancellationSignal) {
        AbstractC4154l.m8923f(resultData, "resultData");
        AbstractC4154l.m8923f(conversionFn, "conversionFn");
        AbstractC4154l.m8923f(executor, "executor");
        AbstractC4154l.m8923f(callback, "callback");
        if (!resultData.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new C02961(executor, callback, conversionFn.invoke(resultData.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), resultData.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }
}
