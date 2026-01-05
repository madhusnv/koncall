package p001o;

import ai.salesmax.model.CallEngagement;
import ai.salesmax.model.CallEvent;
import ai.salesmax.services.model.CloudTelephonyCall;
import com.amazonaws.amplify.generated.graphql.FetchLiveCallEngagementQuery;
import com.amplifyframework.datastore.generated.model.CloudTelephonyAccount;
import com.amplifyframework.datastore.generated.model.CloudTelephonyUser;

/* loaded from: classes.dex */
public final class rc5 implements ic3 {

    /* renamed from: a */
    public static final C16585a f43365a = new C16585a(null);

    /* renamed from: b */
    public static final rc5 f43366b = new rc5();

    /* renamed from: c */
    public static final kc3 f43367c = kc3.f31903e.m35385a();

    /* renamed from: o.rc5$a */
    public static final class C16585a {
        public C16585a() {
        }

        public /* synthetic */ C16585a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ic3 m46506a() {
            return rc5.f43366b;
        }
    }

    /* renamed from: o.rc5$b */
    public static final class C16586b implements rl7 {

        /* renamed from: a */
        public static final C16586b f43368a = new C16586b();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: o.rc5$c */
    public static final class C16587c implements rl7 {

        /* renamed from: a */
        public static final C16587c f43369a = new C16587c();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(mii miiVar) {
            return miiVar.m39161k();
        }
    }

    @Override // p001o.ic3
    /* renamed from: a */
    public CallEngagement mo19263a(CallEvent callEvent, CloudTelephonyCall cloudTelephonyCall) {
        sq8.m48649h(callEvent, "callEvent");
        try {
            String cloudProviderNumber = callEvent.getCloudProviderNumber();
            String cloudProvider = callEvent.getCloudProvider();
            StringBuilder sb = new StringBuilder();
            sb.append("Call received from cloud number: ");
            sb.append(cloudProviderNumber);
            sb.append(" and provider: ");
            sb.append(cloudProvider);
            kc3 kc3Var = f43367c;
            CloudTelephonyAccount cloudTelephonyAccountM35376i = kc3Var.m35376i(cloudProviderNumber, callEvent.getCloudProvider());
            String cloudProvider2 = callEvent.getCloudProvider();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cloud account for the cloud number: ");
            sb2.append(cloudTelephonyAccountM35376i);
            sb2.append(" and provider: ");
            sb2.append(cloudProvider2);
            CloudTelephonyUser cloudTelephonyUserM35377j = kc3Var.m35377j(callEvent.getCloudProvider());
            String cloudProvider3 = callEvent.getCloudProvider();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cloud user for the cloud user: ");
            sb3.append(cloudTelephonyUserM35377j);
            sb3.append(" and provider: ");
            sb3.append(cloudProvider3);
            l1 l1Var = (l1) uni.LB().d0(C16586b.f43368a).d0(C16587c.f43369a).m55729h();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Invoking live call with parameters cloudUser: ");
            sb4.append(cloudTelephonyUserM35377j);
            sb4.append(", cloudAccount: ");
            sb4.append(cloudTelephonyAccountM35376i);
            sb4.append(", CallEvent: ");
            sb4.append(callEvent);
            sb4.append(" and cloudTelephonyCall: ");
            sb4.append(cloudTelephonyCall);
            Object objM55729h = l1Var.ef(cloudTelephonyUserM35377j, cloudTelephonyAccountM35376i, callEvent.getNumber(), cloudTelephonyCall != null ? cloudTelephonyCall.getCallId() : null, callEvent.getCloudProvider()).m0(jwe.m34628c(jwe.f31197a, 0, 0, 3, null)).m55729h();
            sq8.m48648g(objM55729h, "blockingSingle(...)");
            FetchLiveCallEngagementQuery.FetchLiveCallEngagement fetchLiveCallEngagement = (FetchLiveCallEngagementQuery.FetchLiveCallEngagement) objM55729h;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Received engagement for input: ");
            sb5.append(callEvent);
            sb5.append(" is: ");
            sb5.append(fetchLiveCallEngagement);
            FetchLiveCallEngagementQuery.Engagement engagement = fetchLiveCallEngagement.engagement();
            if (engagement != null) {
                return wf6.f51901a.m54328a(engagement);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
