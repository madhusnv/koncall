package androidx.credentials.provider;

import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.ClearCredentialStateRequest;
import com.google.firebase.messaging.Constants;
import p001o.ac4;
import p001o.bg1;
import p001o.cg1;
import p001o.dc4;
import p001o.ec4;
import p001o.fc4;
import p001o.ia3;
import p001o.jg1;
import p001o.ka3;
import p001o.m2e;
import p001o.mb4;
import p001o.o94;
import p001o.og1;
import p001o.pg1;
import p001o.qo7;
import p001o.sq8;
import p001o.tq;
import p001o.vg1;
import p001o.zb4;

/* loaded from: classes2.dex */
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {

    /* renamed from: a */
    public boolean f7194a;

    /* renamed from: b */
    public bg1 f7195b;

    /* renamed from: c */
    public og1 f7196c;

    /* renamed from: d */
    public m2e f7197d;

    /* renamed from: androidx.credentials.provider.CredentialProviderService$a */
    public static final class C2037a implements OutcomeReceiver {

        /* renamed from: a */
        public final /* synthetic */ OutcomeReceiver f7198a;

        public C2037a(OutcomeReceiver outcomeReceiver) {
            this.f7198a = outcomeReceiver;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(o94 o94Var) {
            sq8.m48649h(o94Var, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            OutcomeReceiver outcomeReceiver = this.f7198a;
            ac4.m16848a();
            outcomeReceiver.onError(zb4.m59143a(o94Var.mo28285a(), o94Var.getMessage()));
        }

        /* renamed from: b */
        public void m5948b(cg1 cg1Var) {
            sq8.m48649h(cg1Var, "response");
            this.f7198a.onResult(jg1.f30379a.m33785a(cg1Var));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            tq.m50332a(obj);
            m5948b(null);
        }
    }

    /* renamed from: androidx.credentials.provider.CredentialProviderService$b */
    public static final class C2038b implements OutcomeReceiver {

        /* renamed from: a */
        public final /* synthetic */ OutcomeReceiver f7199a;

        public C2038b(OutcomeReceiver outcomeReceiver) {
            this.f7199a = outcomeReceiver;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(qo7 qo7Var) {
            sq8.m48649h(qo7Var, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            OutcomeReceiver outcomeReceiver = this.f7199a;
            ec4.m24749a();
            outcomeReceiver.onError(dc4.m22803a(qo7Var.mo43965a(), qo7Var.getMessage()));
        }

        /* renamed from: b */
        public void m5950b(pg1 pg1Var) {
            sq8.m48649h(pg1Var, "response");
            this.f7199a.onResult(vg1.f50293a.m52733a(pg1Var));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            tq.m50332a(obj);
            m5950b(null);
        }
    }

    /* renamed from: androidx.credentials.provider.CredentialProviderService$c */
    public static final class C2039c implements OutcomeReceiver {

        /* renamed from: a */
        public final /* synthetic */ OutcomeReceiver f7200a;

        public C2039c(OutcomeReceiver outcomeReceiver) {
            this.f7200a = outcomeReceiver;
        }

        /* renamed from: a */
        public void m5951a(ia3 ia3Var) {
            sq8.m48649h(ia3Var, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            fc4.m26434a();
            throw null;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Void r2) {
            this.f7200a.onResult(r2);
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            tq.m50332a(th);
            m5951a(null);
        }
    }

    /* renamed from: a */
    public abstract void m5944a(bg1 bg1Var, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver);

    /* renamed from: b */
    public abstract void m5945b(og1 og1Var, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver);

    /* renamed from: c */
    public abstract void m5946c(m2e m2eVar, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver);

    public final void onBeginCreateCredential(BeginCreateCredentialRequest beginCreateCredentialRequest, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver) {
        sq8.m48649h(beginCreateCredentialRequest, "request");
        sq8.m48649h(cancellationSignal, "cancellationSignal");
        sq8.m48649h(outcomeReceiver, "callback");
        C2037a c2037a = new C2037a(outcomeReceiver);
        bg1 bg1VarM33786b = jg1.f30379a.m33786b(beginCreateCredentialRequest);
        if (this.f7194a) {
            this.f7195b = bg1VarM33786b;
        }
        m5944a(bg1VarM33786b, cancellationSignal, mb4.m38667a(c2037a));
    }

    public final void onBeginGetCredential(BeginGetCredentialRequest beginGetCredentialRequest, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver) {
        sq8.m48649h(beginGetCredentialRequest, "request");
        sq8.m48649h(cancellationSignal, "cancellationSignal");
        sq8.m48649h(outcomeReceiver, "callback");
        og1 og1VarM52734b = vg1.f50293a.m52734b(beginGetCredentialRequest);
        C2038b c2038b = new C2038b(outcomeReceiver);
        if (this.f7194a) {
            this.f7196c = og1VarM52734b;
        }
        m5945b(og1VarM52734b, cancellationSignal, mb4.m38667a(c2038b));
    }

    public final void onClearCredentialState(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver) {
        sq8.m48649h(clearCredentialStateRequest, "request");
        sq8.m48649h(cancellationSignal, "cancellationSignal");
        sq8.m48649h(outcomeReceiver, "callback");
        C2039c c2039c = new C2039c(outcomeReceiver);
        m2e m2eVarM35220a = ka3.f31725a.m35220a(clearCredentialStateRequest);
        if (this.f7194a) {
            this.f7197d = m2eVarM35220a;
        }
        m5946c(m2eVarM35220a, cancellationSignal, mb4.m38667a(c2039c));
    }
}
