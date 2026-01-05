package p001o;

import ai.salesmax.model.CallEngagement;
import ai.salesmax.model.CallEvent;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.services.model.CloudTelephonyAgent;
import ai.salesmax.services.model.CloudTelephonyCall;
import ai.salesmax.services.model.CloudTelephonyClickToCallResponse;
import android.util.Log;
import com.amplifyframework.datastore.generated.model.CallConnectStatus;
import com.amplifyframework.datastore.generated.model.CloudTelephonyUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p001o.vre;

/* loaded from: classes.dex */
public final class dc3 {

    /* renamed from: a */
    public static final C12862a f19548a = new C12862a(null);

    /* renamed from: b */
    public static final dc3 f19549b;

    /* renamed from: c */
    public static final kc3 f19550c;

    /* renamed from: d */
    public static final jg2 f19551d;

    /* renamed from: e */
    public static final h84 f19552e;

    /* renamed from: f */
    public static final bt9 f19553f;

    /* renamed from: g */
    public static final List f19554g;

    /* renamed from: h */
    public static final AtomicReference f19555h;

    /* renamed from: i */
    public static final AtomicReference f19556i;

    /* renamed from: o.dc3$a */
    public static final class C12862a {
        public C12862a() {
        }

        public /* synthetic */ C12862a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final dc3 m22797a() {
            return dc3.f19549b;
        }
    }

    /* renamed from: o.dc3$b */
    public static final class C12863b implements rl7 {

        /* renamed from: a */
        public static final C12863b f19557a = new C12863b();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mii apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.SB();
        }
    }

    /* renamed from: o.dc3$c */
    public static final class C12864c implements rl7 {

        /* renamed from: a */
        public static final C12864c f19558a = new C12864c();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(mii miiVar) {
            return miiVar.m39161k();
        }
    }

    /* renamed from: o.dc3$d */
    public static final class C12865d implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ String f19559a;

        /* renamed from: b */
        public final /* synthetic */ dc3 f19560b;

        /* renamed from: c */
        public final /* synthetic */ AtomicReference f19561c;

        /* renamed from: d */
        public final /* synthetic */ String f19562d;

        public C12865d(String str, dc3 dc3Var, AtomicReference atomicReference, String str2) {
            this.f19559a = str;
            this.f19560b = dc3Var;
            this.f19561c = atomicReference;
            this.f19562d = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final x8c apply(l1 l1Var) {
            String str = this.f19559a;
            if (str == null) {
                x6c x6cVarM55694H = x6c.m55694H(new RuntimeException("No cloud provider selected for click to call service."));
                sq8.m48648g(x6cVarM55694H, "run(...)");
                return x6cVarM55694H;
            }
            AtomicReference atomicReference = this.f19561c;
            String str2 = this.f19562d;
            CloudTelephonyUser cloudTelephonyUserM35377j = dc3.f19550c.m35377j(str);
            if (cloudTelephonyUserM35377j != null) {
                CloudTelephonyAgent cloudTelephonyAgent = new CloudTelephonyAgent();
                cloudTelephonyAgent.setCloudTelephonyProvider(cloudTelephonyUserM35377j.getProviderName());
                cloudTelephonyAgent.setAgentId(cloudTelephonyUserM35377j.getAgentId());
                cloudTelephonyAgent.setAgentNumber(cloudTelephonyUserM35377j.getAgentNumber());
                cloudTelephonyAgent.setVirtualNumbers(cloudTelephonyUserM35377j.getAllowedOutboundNumbers());
                cloudTelephonyAgent.setAccountId(cloudTelephonyUserM35377j.getAccountId());
                cloudTelephonyAgent.setUserId(cloudTelephonyUserM35377j.getUserId());
                List<String> allowedOutboundNumbers = cloudTelephonyUserM35377j.getAllowedOutboundNumbers();
                x6c x6cVarM55694H2 = null;
                if (allowedOutboundNumbers != null) {
                    sq8.m48646e(allowedOutboundNumbers);
                    if (!(allowedOutboundNumbers.size() > 0)) {
                        allowedOutboundNumbers = null;
                    }
                    String str3 = allowedOutboundNumbers != null ? allowedOutboundNumbers.get(0) : null;
                    if (str3 != null) {
                        atomicReference.set(str3);
                        x6cVarM55694H2 = l1Var.E3(cloudTelephonyAgent, str3, str2);
                    }
                    if (x6cVarM55694H2 == null) {
                        x6cVarM55694H2 = x6c.m55694H(new RuntimeException("No cloud number configured for the user for dialing of provider: " + str + "."));
                        sq8.m48648g(x6cVarM55694H2, "error(...)");
                    }
                    if (x6cVarM55694H2 != null) {
                        return x6cVarM55694H2;
                    }
                }
            }
            x6c x6cVarM55694H3 = x6c.m55694H(new RuntimeException("Cloud user is not present for the user of provider: " + str + "."));
            sq8.m48648g(x6cVarM55694H3, "run(...)");
            return x6cVarM55694H3;
        }
    }

    /* renamed from: o.dc3$e */
    public static final class C12866e implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ String f19564b;

        /* renamed from: c */
        public final /* synthetic */ Leads f19565c;

        /* renamed from: d */
        public final /* synthetic */ String f19566d;

        /* renamed from: e */
        public final /* synthetic */ AtomicReference f19567e;

        /* renamed from: f */
        public final /* synthetic */ xk7 f19568f;

        public C12866e(String str, Leads leads, String str2, AtomicReference atomicReference, xk7 xk7Var) {
            this.f19564b = str;
            this.f19565c = leads;
            this.f19566d = str2;
            this.f19567e = atomicReference;
            this.f19568f = xk7Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(CloudTelephonyClickToCallResponse cloudTelephonyClickToCallResponse) {
            sq8.m48649h(cloudTelephonyClickToCallResponse, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("click to call successfully completed with response: ");
            sb.append(cloudTelephonyClickToCallResponse);
            CloudTelephonyCall cloudTelephonyCall = new CloudTelephonyCall();
            cloudTelephonyCall.setCallId(cloudTelephonyClickToCallResponse.getCallId());
            cloudTelephonyCall.setCallDirection(cloudTelephonyClickToCallResponse.getCallDirection());
            cloudTelephonyCall.setAgentPhoneNuber(cloudTelephonyClickToCallResponse.getAgentNumber());
            cloudTelephonyCall.setCustomerPhoneNumber(cloudTelephonyClickToCallResponse.getCustomerNumber());
            cloudTelephonyCall.setCustomer(dc3.this.m22790t(this.f19564b, this.f19565c));
            cloudTelephonyCall.setProvider(this.f19566d);
            cloudTelephonyCall.setDeskphone((String) this.f19567e.get());
            dc3.f19555h.set(cloudTelephonyCall);
            this.f19568f.invoke(cloudTelephonyClickToCallResponse);
        }
    }

    /* renamed from: o.dc3$f */
    public static final class C12867f implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f19569a;

        public C12867f(xk7 xk7Var) {
            this.f19569a = xk7Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("click to call failed with error: ");
            sb.append(th);
            this.f19569a.invoke(new CloudTelephonyClickToCallResponse(Boolean.FALSE, "Couldn't place cloud call " + th.getMessage(), ""));
        }
    }

    /* renamed from: o.dc3$g */
    public static final class C12868g extends jgg implements xk7 {

        /* renamed from: a */
        public Object f19570a;

        /* renamed from: b */
        public int f19571b;

        public C12868g(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return dc3.this.new C12868g(n64Var);
        }

        /* JADX WARN: Path cross not found for [B:22:0x006d, B:88:0x0308], limit reached: 100 */
        /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0330  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003b -> B:6:0x0019). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            sg2 it;
            C12868g c12868g;
            Object objMo23482a;
            Object objM53351b;
            Object objM39304d;
            int iD;
            Object objM51918f = uq8.m51918f();
            int i = this.f19571b;
            int i2 = 1;
            if (i == 0) {
                wre.m54934b(obj);
                it = dc3.f19551d.iterator();
                c12868g = this;
                c12868g.f19570a = it;
                c12868g.f19571b = i2;
                objMo23482a = it.mo23482a(c12868g);
                if (objMo23482a == objM51918f) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (sg2) this.f19570a;
                wre.m54934b(obj);
                objMo23482a = obj;
                C12868g c12868g2 = this;
                sg2 sg2Var = it;
                Object obj2 = objM51918f;
                if (!((Boolean) objMo23482a).booleanValue()) {
                    CallEvent callEvent = (CallEvent) sg2Var.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append("cloud event picked for processing ");
                    sb.append(callEvent);
                    dc3 dc3Var = dc3.this;
                    try {
                    } catch (Throwable th) {
                        vre.C17665a c17665a = vre.f50797b;
                        objM53351b = vre.m53351b(wre.m54933a(th));
                    }
                    vre.C17665a c17665a2 = vre.f50797b;
                    Object obj3 = null;
                    CallEvent callEvent2 = ((sq8.m48644c(callEvent.getSource(), "CALL_LOG_SYNC") ? 1 : 0) ^ i2) != 0 ? callEvent : null;
                    if (callEvent2 != null) {
                        CallEvent.Builder builderClone = callEvent2.clone();
                        String number = callEvent2.getNumber();
                        String strM35382o = number != null ? dc3.f19550c.m35382o(number) : null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Provider inferred for the call: ");
                        sb2.append(strM35382o);
                        if (strM35382o != null) {
                            builderClone.cloudProvider(strM35382o);
                            builderClone.cloudProviderNumber(callEvent2.getNumber());
                            ic3 ic3VarM33495a = jc3.f30133a.m33495a(strM35382o);
                            if (ic3VarM33495a != null) {
                                if (dc3Var.m22792v(builderClone.build())) {
                                    CallEngagement callEngagement = (CallEngagement) dc3.f19556i.getAndSet(null);
                                    CloudTelephonyCall cloudTelephonyCall = callEngagement != null ? callEngagement.toCloudTelephonyCall() : null;
                                    CallEvent callEventBuild = builderClone.build();
                                    CloudTelephonyCall cloudTelephonyCall2 = (CloudTelephonyCall) dc3.f19555h.get();
                                    if (cloudTelephonyCall2 != null) {
                                        cloudTelephonyCall = cloudTelephonyCall2;
                                    }
                                    CallEngagement callEngagementMo19263a = ic3VarM33495a.mo19263a(callEventBuild, cloudTelephonyCall);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Entering post engagement call with engagement value: ");
                                    sb3.append(callEngagementMo19263a);
                                    if (callEngagementMo19263a != null) {
                                        dc3Var.m22788r(callEngagementMo19263a);
                                        builderClone.number(callEngagementMo19263a.getClientContactNumber());
                                        builderClone.phone(callEngagementMo19263a.getUserNumber());
                                        dc3Var.m22794x(builderClone, callEngagementMo19263a);
                                        dc3Var.m22784A(builderClone.build(), callEngagementMo19263a);
                                        CallEvent callEventBuild2 = builderClone.build();
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("update completed call event with cloud provider information: ");
                                        sb4.append(callEventBuild2);
                                        sb4.append(" has engagement: ");
                                        sb4.append(callEngagementMo19263a);
                                    } else {
                                        CallEvent callEventBuild3 = builderClone.build();
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append("No engagement fetched for the given event: ");
                                        sb5.append(callEventBuild3);
                                    }
                                    dc3.f19555h.set(null);
                                    objM39304d = y3i.f54824a;
                                } else {
                                    CloudTelephonyCall cloudTelephonyCall3 = (CloudTelephonyCall) dc3.f19555h.get();
                                    if (cloudTelephonyCall3 == null) {
                                        if (!dc3Var.m22793w(callEvent)) {
                                            CallEngagement callEngagementMo19263a2 = (CallEngagement) dc3.f19556i.get();
                                            if (callEngagementMo19263a2 == null) {
                                                callEngagementMo19263a2 = ic3VarM33495a.mo19263a(builderClone.build(), (CloudTelephonyCall) dc3.f19555h.get());
                                            }
                                            if (callEngagementMo19263a2 != null) {
                                                dc3Var.m22788r(callEngagementMo19263a2);
                                                builderClone.number(callEngagementMo19263a2.getClientContactNumber());
                                                builderClone.phone(callEngagementMo19263a2.getUserNumber());
                                                builderClone.inFlightCall(callEngagementMo19263a2);
                                                ec3.m24748a(dc3.f19556i, null, callEngagementMo19263a2);
                                                dc3Var.m22796z(builderClone.build());
                                                CallEvent callEventBuild4 = builderClone.build();
                                                StringBuilder sb6 = new StringBuilder();
                                                sb6.append("update in flight call event with cloud provider information: ");
                                                sb6.append(callEventBuild4);
                                                sb6.append(" has engagement: ");
                                                sb6.append(callEngagementMo19263a2);
                                            } else {
                                                CallEvent callEventBuild5 = builderClone.build();
                                                StringBuilder sb7 = new StringBuilder();
                                                sb7.append("No engagement fetched for the given event: ");
                                                sb7.append(callEventBuild5);
                                            }
                                        }
                                        objM39304d = y3i.f54824a;
                                    } else {
                                        sq8.m48646e(cloudTelephonyCall3);
                                        builderClone.number(cloudTelephonyCall3.getCustomerPhoneNumber());
                                        builderClone.phone(cloudTelephonyCall3.getAgentPhoneNuber());
                                        String callId = cloudTelephonyCall3.getCallId();
                                        Leads customer = cloudTelephonyCall3.getCustomer();
                                        String contactID = customer != null ? customer.getContactID() : null;
                                        Leads customer2 = cloudTelephonyCall3.getCustomer();
                                        String name = customer2 != null ? customer2.getName() : null;
                                        Leads customer3 = cloudTelephonyCall3.getCustomer();
                                        String company = customer3 != null ? customer3.getCompany() : null;
                                        Leads customer4 = cloudTelephonyCall3.getCustomer();
                                        String profilePic = customer4 != null ? customer4.getProfilePic() : null;
                                        Leads customer5 = cloudTelephonyCall3.getCustomer();
                                        String designation = customer5 != null ? customer5.getDesignation() : null;
                                        String callId2 = cloudTelephonyCall3.getCallId();
                                        String provider = cloudTelephonyCall3.getProvider();
                                        String deskphone = cloudTelephonyCall3.getDeskphone();
                                        String phoneCallLogId = callEvent.getPhoneCallLogId();
                                        sq8.m48646e(callId);
                                        builderClone.inFlightCall(new CallEngagement(callId, contactID, name, company, profilePic, designation, null, cloudTelephonyCall3.getCustomerPhoneNumber(), cloudTelephonyCall3.getAgentPhoneNuber(), null, null, null, null, cloudTelephonyCall3.getCallDirection().name(), null, "CALL", "COMPLETED", "CLOUDTELEPHONY", "cloudTelephony-" + strM35382o, callId2, null, null, true, null, null, false, false, null, false, provider, deskphone, null, null, null, phoneCallLogId, null, null, false, 530579456, 56, null));
                                        dc3Var.m22796z(builderClone.build());
                                        CallEngagement callEngagementMo19263a3 = (CallEngagement) dc3.f19556i.get();
                                        if (callEngagementMo19263a3 == null) {
                                            callEngagementMo19263a3 = ic3VarM33495a.mo19263a(builderClone.build(), (CloudTelephonyCall) dc3.f19555h.get());
                                        }
                                        if (callEngagementMo19263a3 != null) {
                                            dc3Var.m22788r(callEngagementMo19263a3);
                                            builderClone.number(callEngagementMo19263a3.getClientContactNumber());
                                            builderClone.phone(callEngagementMo19263a3.getUserNumber());
                                            builderClone.inFlightCall(callEngagementMo19263a3);
                                            ec3.m24748a(dc3.f19556i, null, callEngagementMo19263a3);
                                            iD = Log.d("cloud-call-manager", "update in flight call event with cloud provider information: " + builderClone.build() + " has engagement: " + callEngagementMo19263a3);
                                        } else {
                                            iD = Log.d("cloud-call-manager", "No engagement fetched for the given event: " + builderClone.build());
                                        }
                                        objM39304d = ml1.m39304d(iD);
                                    }
                                }
                                obj3 = objM39304d;
                            }
                        }
                        if (obj3 == null) {
                        }
                        objM53351b = vre.m53351b(obj3);
                        vre.m53354e(objM53351b);
                        objM51918f = obj2;
                        it = sg2Var;
                        c12868g = c12868g2;
                        i2 = 1;
                        c12868g.f19570a = it;
                        c12868g.f19571b = i2;
                        objMo23482a = it.mo23482a(c12868g);
                        if (objMo23482a == objM51918f) {
                            return objM51918f;
                        }
                        c12868g2 = c12868g;
                        sg2 sg2Var2 = it;
                        Object obj22 = objM51918f;
                        if (!((Boolean) objMo23482a).booleanValue()) {
                            return y3i.f54824a;
                        }
                    }
                    if (sq8.m48644c(callEvent.getSource(), "CALL_LOG_SYNC")) {
                        dc3Var.m22795y(callEvent);
                    }
                    obj3 = y3i.f54824a;
                    objM53351b = vre.m53351b(obj3);
                    vre.m53354e(objM53351b);
                    objM51918f = obj22;
                    it = sg2Var2;
                    c12868g = c12868g2;
                    i2 = 1;
                    c12868g.f19570a = it;
                    c12868g.f19571b = i2;
                    objMo23482a = it.mo23482a(c12868g);
                    if (objMo23482a == objM51918f) {
                    }
                }
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C12868g) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.dc3$h */
    public static final class C12869h extends jgg implements xk7 {

        /* renamed from: a */
        public int f19573a;

        /* renamed from: b */
        public final /* synthetic */ CallEvent f19574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12869h(CallEvent callEvent, n64 n64Var) {
            super(1, n64Var);
            this.f19574b = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C12869h(this.f19574b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f19573a;
            if (i == 0) {
                wre.m54934b(obj);
                CallEvent callEvent = this.f19574b;
                StringBuilder sb = new StringBuilder();
                sb.append("Routed to cloud call manager ");
                sb.append(callEvent);
                jg2 jg2Var = dc3.f19551d;
                CallEvent callEvent2 = this.f19574b;
                this.f19573a = 1;
                if (jg2Var.mo23475l(callEvent2, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C12869h) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.dc3$i */
    public static final class C12870i extends jgg implements xk7 {

        /* renamed from: a */
        public int f19575a;

        /* renamed from: b */
        public final /* synthetic */ av1 f19576b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f19577c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12870i(av1 av1Var, CallEvent callEvent, n64 n64Var) {
            super(1, n64Var);
            this.f19576b = av1Var;
            this.f19577c = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C12870i(this.f19576b, this.f19577c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f19575a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            ((bk6) this.f19576b).mo19286d(this.f19577c);
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C12870i) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.dc3$j */
    public static final class C12871j extends jgg implements nl7 {

        /* renamed from: a */
        public int f19578a;

        /* renamed from: b */
        public final /* synthetic */ av1 f19579b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f19580c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12871j(av1 av1Var, CallEvent callEvent, n64 n64Var) {
            super(2, n64Var);
            this.f19579b = av1Var;
            this.f19580c = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C12871j(this.f19579b, this.f19580c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f19578a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            this.f19579b.mo17863f(this.f19580c);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C12871j) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.dc3$k */
    public static final class C12872k extends jgg implements nl7 {

        /* renamed from: a */
        public int f19581a;

        /* renamed from: b */
        public final /* synthetic */ av1 f19582b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f19583c;

        /* renamed from: d */
        public final /* synthetic */ CallEngagement f19584d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12872k(av1 av1Var, CallEvent callEvent, CallEngagement callEngagement, n64 n64Var) {
            super(2, n64Var);
            this.f19582b = av1Var;
            this.f19583c = callEvent;
            this.f19584d = callEngagement;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C12872k(this.f19582b, this.f19583c, this.f19584d, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f19581a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            ((dfd) this.f19582b).mo22988e(this.f19583c, this.f19584d);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C12872k) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    static {
        dc3 dc3Var = new dc3();
        f19549b = dc3Var;
        f19550c = kc3.f31903e.m35385a();
        f19551d = tg2.m49824b(50, null, null, 6, null);
        f19552e = p74.f39487a.m43082j();
        f19553f = bt9.f16783b.m19757a();
        ArrayList arrayList = new ArrayList();
        f19554g = arrayList;
        f19555h = new AtomicReference();
        f19556i = new AtomicReference();
        arrayList.add(zm.f57387b.m59602a());
        arrayList.add(im3.f28834b.m32317a());
        arrayList.add(zu1.f57710b.m59939a());
        dc3Var.m22786p();
    }

    /* renamed from: o */
    public static final void m22783o() {
    }

    /* renamed from: A */
    public final void m22784A(CallEvent callEvent, CallEngagement callEngagement) {
        m22796z(callEvent);
        for (av1 av1Var : f19554g) {
            if (av1Var instanceof dfd) {
                rm1.m46952d(f19552e, null, null, new C12872k(av1Var, callEvent, callEngagement, null), 3, null);
            }
        }
    }

    /* renamed from: n */
    public final void m22785n(String str, Leads leads, xk7 xk7Var) {
        sq8.m48649h(str, "number");
        sq8.m48649h(xk7Var, "callback");
        String strM35381n = f19550c.m35381n();
        AtomicReference atomicReference = new AtomicReference();
        sq8.m48648g(uni.LB().d0(C12863b.f19557a).d0(C12864c.f19558a).m55717M(new C12865d(strM35381n, this, atomicReference, str)).y0(i5f.m31599c()).h0(i5f.m31599c()).w0(new C12866e(str, leads, strM35381n, atomicReference, xk7Var), new C12867f(xk7Var), new jm() { // from class: o.cc3
            @Override // p001o.jm
            public final void run() {
                dc3.m22783o();
            }
        }), "subscribe(...)");
    }

    /* renamed from: p */
    public final void m22786p() {
        p74.f39487a.m43078f(f19552e, new C12868g(null));
    }

    /* renamed from: q */
    public final void m22787q(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        p74.f39487a.m43078f(f19552e, new C12869h(callEvent, null));
    }

    /* renamed from: r */
    public final void m22788r(CallEngagement callEngagement) {
        if (callEngagement != null) {
            String clientContactNumber = callEngagement.getClientContactNumber();
            CloudTelephonyCall cloudTelephonyCall = (CloudTelephonyCall) f19555h.get();
            Leads leadsM22790t = m22790t(clientContactNumber, cloudTelephonyCall != null ? cloudTelephonyCall.getCustomer() : null);
            if (leadsM22790t != null) {
                callEngagement.setClientID(leadsM22790t.getContactID());
                callEngagement.setClientName(leadsM22790t.getName());
                callEngagement.setClientCompany(leadsM22790t.getCompany());
                callEngagement.setClientProfilePic(leadsM22790t.getProfilePic());
                callEngagement.setClientDesignation(leadsM22790t.getDesignation());
                callEngagement.setPrimaryTeamId(leadsM22790t.getPrimaryTeamId());
            }
        }
    }

    /* renamed from: s */
    public final Leads m22789s(String str) {
        if (str == null) {
            return null;
        }
        LeadsSummary leadsSummaryM19753q = f19553f.m19753q(new ey3(str, null, null, null, false, null, null, 126, null));
        if (leadsSummaryM19753q != null) {
            return leadsSummaryM19753q.toLeads();
        }
        return null;
    }

    /* renamed from: t */
    public final Leads m22790t(String str, Leads leads) {
        return leads == null ? m22789s(str) : leads;
    }

    /* renamed from: u */
    public final boolean m22791u(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        String number = callEvent.getNumber();
        if (number != null) {
            return f19550c.m35373f(number);
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m22792v(CallEvent callEvent) {
        Boolean boolIsConnectedCall = callEvent.isConnectedCall();
        if (!(sq8.m48644c(boolIsConnectedCall, Boolean.FALSE) && sq8.m48644c(callEvent.getSource(), "CALL_LOG"))) {
            boolIsConnectedCall = null;
        }
        if (boolIsConnectedCall == null) {
            return false;
        }
        boolIsConnectedCall.booleanValue();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m22793w(CallEvent callEvent) {
        boolean z;
        Boolean boolIsConnectedCall = callEvent.isConnectedCall();
        if (!sq8.m48644c(boolIsConnectedCall, Boolean.FALSE) || sq8.m48644c(callEvent.getSource(), "CALL_LOG")) {
            z = false;
        } else {
            String cloudProviderNumber = callEvent.getCloudProviderNumber();
            AtomicReference atomicReference = f19555h;
            CloudTelephonyCall cloudTelephonyCall = (CloudTelephonyCall) atomicReference.get();
            if (sq8.m48644c(cloudProviderNumber, cloudTelephonyCall != null ? cloudTelephonyCall.getDeskphone() : null)) {
                String cloudProvider = callEvent.getCloudProvider();
                CloudTelephonyCall cloudTelephonyCall2 = (CloudTelephonyCall) atomicReference.get();
                if (sq8.m48644c(cloudProvider, cloudTelephonyCall2 != null ? cloudTelephonyCall2.getProvider() : null)) {
                    z = true;
                }
            }
        }
        if (!z) {
            boolIsConnectedCall = null;
        }
        if (boolIsConnectedCall == null) {
            return false;
        }
        boolIsConnectedCall.booleanValue();
        return true;
    }

    /* renamed from: x */
    public final void m22794x(CallEvent.Builder builder, CallEngagement callEngagement) {
        builder.callEndTime(callEngagement.getCallEndTime());
        builder.direction(callEngagement.getCallDirection());
        builder.callStartTime(callEngagement.getCallStartTime());
        builder.callId(callEngagement.getEngagementSourceLevelTwo());
        builder.duration(callEngagement.getCallDuration());
        String callConnectionStatus = callEngagement.getCallConnectionStatus();
        CallConnectStatus callConnectStatusValueOf = null;
        if (callConnectionStatus != null) {
            if (!(sq8.m48644c(callConnectionStatus, CallConnectStatus.CONNECTED.name()) || sq8.m48644c(callConnectionStatus, CallConnectStatus.NOT_CONNECTED.name()))) {
                callConnectionStatus = null;
            }
            if (callConnectionStatus != null) {
                callConnectStatusValueOf = CallConnectStatus.valueOf(callConnectionStatus);
            }
        }
        builder.callConnectStatus(callConnectStatusValueOf);
    }

    /* renamed from: y */
    public final void m22795y(CallEvent callEvent) {
        for (av1 av1Var : f19554g) {
            if (av1Var instanceof bk6) {
                p74.f39487a.m43078f(f19552e, new C12870i(av1Var, callEvent, null));
            }
        }
    }

    /* renamed from: z */
    public final void m22796z(CallEvent callEvent) {
        Iterator it = f19554g.iterator();
        while (it.hasNext()) {
            rm1.m46952d(f19552e, null, null, new C12871j((av1) it.next(), callEvent, null), 3, null);
        }
    }
}
