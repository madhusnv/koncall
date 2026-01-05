package p001o;

import android.content.Context;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.Executor;
import p001o.ga4;
import p001o.t94;
import p001o.za4;
import p001o.zq7;

/* loaded from: classes2.dex */
public final class tb4 implements fb4 {

    /* renamed from: b */
    public static final C17045a f46758b = new C17045a(null);

    /* renamed from: a */
    public final CredentialManager f46759a;

    /* renamed from: o.tb4$a */
    public static final class C17045a {
        public C17045a() {
        }

        public /* synthetic */ C17045a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.tb4$b */
    public static final class C17046b extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ cb4 f46760a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17046b(cb4 cb4Var) {
            super(0);
            this.f46760a = cb4Var;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69035invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69035invoke() {
            this.f46760a.mo18539a(new v94("Your device doesn't support credential manager"));
        }
    }

    /* renamed from: o.tb4$c */
    public static final class C17047c implements OutcomeReceiver {

        /* renamed from: a */
        public final /* synthetic */ cb4 f46761a;

        /* renamed from: b */
        public final /* synthetic */ s94 f46762b;

        /* renamed from: c */
        public final /* synthetic */ tb4 f46763c;

        public C17047c(cb4 cb4Var, s94 s94Var, tb4 tb4Var) {
            this.f46761a = cb4Var;
            this.f46762b = s94Var;
            this.f46763c = tb4Var;
        }

        /* renamed from: a */
        public void m49675a(CreateCredentialException createCredentialException) {
            sq8.m48649h(createCredentialException, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f46761a.mo18539a(this.f46763c.m49670g(createCredentialException));
        }

        /* renamed from: b */
        public void m49676b(CreateCredentialResponse createCredentialResponse) {
            sq8.m48649h(createCredentialResponse, "response");
            cb4 cb4Var = this.f46761a;
            t94.C17033a c17033a = t94.f46654c;
            String strM48036e = this.f46762b.m48036e();
            Bundle data = createCredentialResponse.getData();
            sq8.m48648g(data, "response.data");
            cb4Var.onResult(c17033a.m49575a(strM48036e, data));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            m49675a(vb4.m52505a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            m49676b(ub4.m51326a(obj));
        }
    }

    /* renamed from: o.tb4$d */
    public static final class C17048d extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ cb4 f46764a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17048d(cb4 cb4Var) {
            super(0);
            this.f46764a = cb4Var;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69036invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69036invoke() {
            this.f46764a.mo18539a(new wo7("Your device doesn't support credential manager"));
        }
    }

    /* renamed from: o.tb4$e */
    public static final class C17049e implements OutcomeReceiver {

        /* renamed from: a */
        public final /* synthetic */ cb4 f46765a;

        /* renamed from: b */
        public final /* synthetic */ tb4 f46766b;

        public C17049e(cb4 cb4Var, tb4 tb4Var) {
            this.f46765a = cb4Var;
            this.f46766b = tb4Var;
        }

        /* renamed from: a */
        public void m49677a(GetCredentialException getCredentialException) {
            sq8.m48649h(getCredentialException, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f46765a.mo18539a(this.f46766b.m49671h(getCredentialException));
        }

        /* renamed from: b */
        public void m49678b(GetCredentialResponse getCredentialResponse) {
            sq8.m48649h(getCredentialResponse, "response");
            this.f46765a.onResult(this.f46766b.m49669f(getCredentialResponse));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            m49677a(xb4.m55921a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            m49678b(yb4.m57457a(obj));
        }
    }

    public tb4(Context context) {
        sq8.m48649h(context, "context");
        this.f46759a = lb4.m36849a(context.getSystemService("credential"));
    }

    @Override // p001o.fb4
    /* renamed from: a */
    public void mo26375a(Context context, s94 s94Var, CancellationSignal cancellationSignal, Executor executor, cb4 cb4Var) {
        sq8.m48649h(context, "context");
        sq8.m48649h(s94Var, "request");
        sq8.m48649h(executor, "executor");
        sq8.m48649h(cb4Var, "callback");
        if (m49672i(new C17046b(cb4Var))) {
            return;
        }
        C17047c c17047c = new C17047c(cb4Var, s94Var, this);
        CredentialManager credentialManager = this.f46759a;
        sq8.m48646e(credentialManager);
        credentialManager.createCredential(context, m49667d(s94Var, context), cancellationSignal, executor, mb4.m38667a(c17047c));
    }

    @Override // p001o.fb4
    /* renamed from: b */
    public boolean mo26376b() {
        return Build.VERSION.SDK_INT >= 34 && this.f46759a != null;
    }

    @Override // p001o.fb4
    /* renamed from: c */
    public void mo26377c(Context context, to7 to7Var, CancellationSignal cancellationSignal, Executor executor, cb4 cb4Var) {
        sq8.m48649h(context, "context");
        sq8.m48649h(to7Var, "request");
        sq8.m48649h(executor, "executor");
        sq8.m48649h(cb4Var, "callback");
        if (m49672i(new C17048d(cb4Var))) {
            return;
        }
        C17049e c17049e = new C17049e(cb4Var, this);
        CredentialManager credentialManager = this.f46759a;
        sq8.m48646e(credentialManager);
        credentialManager.getCredential(context, m49668e(to7Var), cancellationSignal, executor, mb4.m38667a(c17049e));
    }

    /* renamed from: d */
    public final CreateCredentialRequest m49667d(s94 s94Var, Context context) {
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder(s94Var.m48036e(), ak7.f14898a.m17329a(s94Var, context), s94Var.m48032a()).setIsSystemProviderRequired(s94Var.m48037f()).setAlwaysSendAppInfoToProvider(true);
        sq8.m48648g(alwaysSendAppInfoToProvider, "Builder(\n               …ndAppInfoToProvider(true)");
        m49673j(s94Var, alwaysSendAppInfoToProvider);
        CreateCredentialRequest createCredentialRequestBuild = alwaysSendAppInfoToProvider.build();
        sq8.m48648g(createCredentialRequestBuild, "createCredentialRequestBuilder.build()");
        return createCredentialRequestBuild;
    }

    /* renamed from: e */
    public final GetCredentialRequest m49668e(to7 to7Var) {
        kb4.m35251a();
        GetCredentialRequest.Builder builderM30149a = hb4.m30149a(to7.f47484f.m50251a(to7Var));
        for (eb4 eb4Var : to7Var.m50246a()) {
            builderM30149a.addCredentialOption(new CredentialOption.Builder(eb4Var.m24691d(), eb4Var.m24690c(), eb4Var.m24689b()).setIsSystemProviderRequired(eb4Var.m24692e()).setAllowedProviders(eb4Var.m24688a()).build());
        }
        m49674k(to7Var, builderM30149a);
        GetCredentialRequest getCredentialRequestBuild = builderM30149a.build();
        sq8.m48648g(getCredentialRequestBuild, "builder.build()");
        return getCredentialRequestBuild;
    }

    /* renamed from: f */
    public final uo7 m49669f(GetCredentialResponse getCredentialResponse) {
        sq8.m48649h(getCredentialResponse, "response");
        Credential credential = getCredentialResponse.getCredential();
        sq8.m48648g(credential, "response.credential");
        za4.C18598a c18598a = za4.f56830c;
        String type2 = credential.getType();
        sq8.m48648g(type2, "credential.type");
        Bundle data = credential.getData();
        sq8.m48648g(data, "credential.data");
        return new uo7(c18598a.m59080a(type2, data));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* renamed from: g */
    public final o94 m49670g(CreateCredentialException createCredentialException) {
        sq8.m48649h(createCredentialException, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        String type2 = createCredentialException.getType();
        switch (type2.hashCode()) {
            case -2055374133:
                if (type2.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new m94(createCredentialException.getMessage());
                }
                break;
            case 1316905704:
                if (type2.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new u94(createCredentialException.getMessage());
                }
                break;
            case 2092588512:
                if (type2.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new p94(createCredentialException.getMessage());
                }
                break;
            case 2131915191:
                if (type2.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new q94(createCredentialException.getMessage());
                }
                break;
        }
        String type3 = createCredentialException.getType();
        sq8.m48648g(type3, "error.type");
        if (!e9g.m24597K(type3, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            String type4 = createCredentialException.getType();
            sq8.m48648g(type4, "error.type");
            return new n94(type4, createCredentialException.getMessage());
        }
        ga4.C13662a c13662a = ga4.f24826d;
        String type5 = createCredentialException.getType();
        sq8.m48648g(type5, "error.type");
        return c13662a.m28286a(type5, createCredentialException.getMessage());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* renamed from: h */
    public final qo7 m49671h(GetCredentialException getCredentialException) {
        sq8.m48649h(getCredentialException, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        String type2 = getCredentialException.getType();
        switch (type2.hashCode()) {
            case -781118336:
                if (type2.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new vo7(getCredentialException.getMessage());
                }
                break;
            case -45448328:
                if (type2.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new ro7(getCredentialException.getMessage());
                }
                break;
            case 580557411:
                if (type2.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new oo7(getCredentialException.getMessage());
                }
                break;
            case 627896683:
                if (type2.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new yyb(getCredentialException.getMessage());
                }
                break;
        }
        String type3 = getCredentialException.getType();
        sq8.m48648g(type3, "error.type");
        if (!e9g.m24597K(type3, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            String type4 = getCredentialException.getType();
            sq8.m48648g(type4, "error.type");
            return new po7(type4, getCredentialException.getMessage());
        }
        zq7.C18695a c18695a = zq7.f57511d;
        String type5 = getCredentialException.getType();
        sq8.m48648g(type5, "error.type");
        return c18695a.m59723a(type5, getCredentialException.getMessage());
    }

    /* renamed from: i */
    public final boolean m49672i(uk7 uk7Var) {
        if (this.f46759a != null) {
            return false;
        }
        uk7Var.invoke();
        return true;
    }

    /* renamed from: j */
    public final void m49673j(s94 s94Var, CreateCredentialRequest.Builder builder) {
        if (s94Var.m48035d() != null) {
            builder.setOrigin(s94Var.m48035d());
        }
    }

    /* renamed from: k */
    public final void m49674k(to7 to7Var, GetCredentialRequest.Builder builder) {
        if (to7Var.m50247b() != null) {
            builder.setOrigin(to7Var.m50247b());
        }
    }
}
