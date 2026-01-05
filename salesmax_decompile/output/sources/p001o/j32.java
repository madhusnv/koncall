package p001o;

import ai.salesmax.model.CallEngagement;
import ai.salesmax.model.CallEvent;
import ai.salesmax.services.model.CloudTelephonyCall;
import com.amazonaws.amplify.generated.graphql.FetchLiveCallEngagementQuery;
import com.amplifyframework.datastore.generated.model.CloudTelephonyAccount;
import com.amplifyframework.datastore.generated.model.CloudTelephonyUser;

/* loaded from: classes.dex */
public final class j32 implements ic3 {

    /* renamed from: a */
    public static final C14442a f29668a = new C14442a(null);

    /* renamed from: b */
    public static final j32 f29669b = new j32();

    /* renamed from: c */
    public static final kc3 f29670c = kc3.f31903e.m35385a();

    /* renamed from: o.j32$a */
    public static final class C14442a {
        public C14442a() {
        }

        public /* synthetic */ C14442a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ic3 m33168a() {
            return j32.f29669b;
        }
    }

    /* renamed from: o.j32$b */
    public static final class C14443b implements rl7 {

        /* renamed from: a */
        public static final C14443b f29671a = new C14443b();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: o.j32$c */
    public static final class C14444c implements rl7 {

        /* renamed from: a */
        public static final C14444c f29672a = new C14444c();

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
            kc3 kc3Var = f29670c;
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
            Object objM55729h = ((l1) uni.LB().d0(C14443b.f29671a).d0(C14444c.f29672a).m55729h()).ef(cloudTelephonyUserM35377j, cloudTelephonyAccountM35376i, callEvent.getNumber(), cloudTelephonyCall != null ? cloudTelephonyCall.getCallId() : null, callEvent.getCloudProvider()).m0(jwe.m34628c(jwe.f31197a, 0, 0, 3, null)).m55729h();
            sq8.m48648g(objM55729h, "blockingSingle(...)");
            FetchLiveCallEngagementQuery.FetchLiveCallEngagement fetchLiveCallEngagement = (FetchLiveCallEngagementQuery.FetchLiveCallEngagement) objM55729h;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Received engagement for input: ");
            sb4.append(callEvent);
            sb4.append(" is: ");
            sb4.append(fetchLiveCallEngagement);
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
