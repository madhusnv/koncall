package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import h6.AbstractC2845a;
import h6.AbstractC2846b;
import h6.AbstractC2857m;
import h6.AbstractC2866v;
import h6.C2850f;
import h6.C2863s;
import h6.InterfaceC2855k;
import h6.InterfaceC2858n;
import hd.C2893e;
import ig.AbstractC3250f;
import ig.C3247c;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import lf.C4463n;
import pf.C5902b;
import pf.C5904d;
import pf.C5905e;
import qf.AbstractC6209h;
import qw.a0;
import rf.C6500e;
import sf.AbstractC6840z;
import yg.AbstractC8651h;
import yg.C8656m;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements InterfaceC2858n {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private C5905e googleApiAvailability;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            return cancellationSignal != null && cancellationSignal.isCanceled();
        }

        /* renamed from: cancellationReviewerWithCallback$credentials_play_services_auth_release */
        public final void m779xee23955a(CancellationSignal cancellationSignal, InterfaceC2137a callback) {
            AbstractC4154l.m8923f(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(C2863s request) {
            AbstractC4154l.m8923f(request, "request");
            for (AbstractC2857m abstractC2857m : request.f15872a) {
            }
            return false;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1 */
    public static final class C02661 extends AbstractC4155m implements InterfaceC2139c {
        final /* synthetic */ InterfaceC2855k $callback;
        final /* synthetic */ CancellationSignal $cancellationSignal;
        final /* synthetic */ Executor $executor;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC4155m implements InterfaceC2137a {
            final /* synthetic */ InterfaceC2855k $callback;
            final /* synthetic */ Executor $executor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Executor executor, InterfaceC2855k interfaceC2855k) {
                super(0);
                this.$executor = executor;
                this.$callback = interfaceC2855k;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$0(InterfaceC2855k callback) {
                AbstractC4154l.m8923f(callback, "$callback");
                callback.onResult(null);
            }

            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16519invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16519invoke() {
                Executor executor = this.$executor;
                final InterfaceC2855k interfaceC2855k = this.$callback;
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        CredentialProviderPlayServicesImpl.C02661.AnonymousClass1.invoke$lambda$0(interfaceC2855k);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02661(CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k interfaceC2855k) {
            super(1);
            this.$cancellationSignal = cancellationSignal;
            this.$executor = executor;
            this.$callback = interfaceC2855k;
        }

        @Override // ex.InterfaceC2139c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Void) obj);
            return a0.f30746a;
        }

        public final void invoke(Void r52) {
            CredentialProviderPlayServicesImpl.Companion.m779xee23955a(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback));
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        AbstractC4154l.m8923f(context, "context");
        this.context = context;
        this.googleApiAvailability = C5905e.f28746d;
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.m11516c(context, MIN_GMS_APK_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0(InterfaceC2139c tmp0, Object obj) {
        AbstractC4154l.m8923f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl this$0, CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k callback, Exception e2) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(executor, "$executor");
        AbstractC4154l.m8923f(callback, "$callback");
        AbstractC4154l.m8923f(e2, "e");
        Companion.m779xee23955a(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(e2, executor, callback));
    }

    public final C5905e getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // h6.InterfaceC2858n
    public boolean isAvailableOnDevice() {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z6 = iIsGooglePlayServicesAvailable == 0;
        if (!z6) {
            new C5902b(iIsGooglePlayServicesAvailable).toString();
        }
        return z6;
    }

    public void onClearCredential(AbstractC2845a request, CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k callback) {
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(executor, "executor");
        AbstractC4154l.m8923f(callback, "callback");
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Context context = this.context;
        AbstractC6840z.m13036g(context);
        C3247c c3247c = new C3247c(context, new C4463n());
        c3247c.f30187a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = AbstractC6209h.f30197a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((AbstractC6209h) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C6500e.m12513a();
        C2893e c2893eM7007b = C2893e.m7007b();
        c2893eM7007b.f15925d = new C5904d[]{AbstractC3250f.f17426a};
        c2893eM7007b.f15924c = new C8989c(23, c3247c);
        c2893eM7007b.f15922a = false;
        c2893eM7007b.f15923b = 1554;
        C8656m c8656mM12223b = c3247c.m12223b(1, c2893eM7007b.m7008a());
        C0267a c0267a = new C0267a(0, new C02661(cancellationSignal, executor, callback));
        c8656mM12223b.getClass();
        c8656mM12223b.m15979f(AbstractC8651h.f41931a, c0267a);
        c8656mM12223b.m15978e(new C0268b(this, cancellationSignal, executor, callback));
    }

    @Override // h6.InterfaceC2858n
    public void onCreateCredential(Context context, AbstractC2846b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k callback) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(executor, "executor");
        AbstractC4154l.m8923f(callback, "callback");
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (!(request instanceof C2850f)) {
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
        CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices((C2850f) request, callback, executor, cancellationSignal);
    }

    public void onGetCredential(Context context, AbstractC2866v pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k callback) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        AbstractC4154l.m8923f(executor, "executor");
        AbstractC4154l.m8923f(callback, "callback");
    }

    public void onPrepareCredential(C2863s request, CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k callback) {
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(executor, "executor");
        AbstractC4154l.m8923f(callback, "callback");
    }

    public final void setGoogleApiAvailability(C5905e c5905e) {
        AbstractC4154l.m8923f(c5905e, "<set-?>");
        this.googleApiAvailability = c5905e;
    }

    @Override // h6.InterfaceC2858n
    public void onGetCredential(Context context, C2863s request, CancellationSignal cancellationSignal, Executor executor, InterfaceC2855k callback) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(request, "request");
        AbstractC4154l.m8923f(executor, "executor");
        AbstractC4154l.m8923f(callback, "callback");
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
