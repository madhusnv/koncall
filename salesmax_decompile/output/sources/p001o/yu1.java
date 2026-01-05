package p001o;

import ai.salesmax.model.AutoCallConfig;
import ai.salesmax.model.CallEngagement;
import ai.salesmax.model.CallEvent;
import ai.salesmax.model.CallLogKey;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.WebInitiatedCallEvent;
import android.net.Uri;
import com.amplifyframework.datastore.generated.model.CallConnectStatus;
import com.amplifyframework.datastore.generated.model.CallDirection;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import type.EngagementStatus;

/* loaded from: classes.dex */
public final class yu1 {

    /* renamed from: h */
    public static final C18493a f56041h = new C18493a(null);

    /* renamed from: i */
    public static final int f56042i = 8;

    /* renamed from: j */
    public static final yu1 f56043j = new yu1();

    /* renamed from: k */
    public static final ConcurrentHashMap f56044k = new ConcurrentHashMap();

    /* renamed from: l */
    public static final ConcurrentHashMap f56045l = new ConcurrentHashMap();

    /* renamed from: m */
    public static final Set f56046m;

    /* renamed from: n */
    public static final ConcurrentHashMap f56047n;

    /* renamed from: o */
    public static final ConcurrentHashMap f56048o;

    /* renamed from: a */
    public final bt9 f56049a = bt9.f16783b.m19757a();

    /* renamed from: b */
    public final Object f56050b = new Object();

    /* renamed from: c */
    public final ConcurrentHashMap f56051c = new ConcurrentHashMap();

    /* renamed from: d */
    public final ConcurrentHashMap f56052d = new ConcurrentHashMap();

    /* renamed from: e */
    public final ConcurrentHashMap f56053e = new ConcurrentHashMap();

    /* renamed from: f */
    public final ConcurrentHashMap f56054f = new ConcurrentHashMap();

    /* renamed from: g */
    public volatile AtomicLong f56055g = new AtomicLong(0);

    /* renamed from: o.yu1$a */
    public static final class C18493a {
        public C18493a() {
        }

        public /* synthetic */ C18493a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final yu1 m58316a() {
            return yu1.f56043j;
        }
    }

    /* renamed from: o.yu1$b */
    public static final class C18494b extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ Object f56056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18494b(Object obj) {
            super(2);
            this.f56056a = obj;
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke(Object obj, Set set) {
            sq8.m48649h(obj, "<anonymous parameter 0>");
            if (set == null) {
                set = ConcurrentHashMap.newKeySet();
            }
            set.add(this.f56056a);
            return set;
        }
    }

    /* renamed from: o.yu1$c */
    public static final class C18495c extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C18495c f56057a = new C18495c();

        public C18495c() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke(CallLogKey callLogKey) {
            sq8.m48649h(callLogKey, "it");
            return ConcurrentHashMap.newKeySet();
        }
    }

    /* renamed from: o.yu1$d */
    public static final class C18496d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C18496d f56058a = new C18496d();

        public C18496d() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rz1 invoke(String str) {
            return (rz1) yu1.f56048o.get(str);
        }
    }

    /* renamed from: o.yu1$e */
    public static final class C18497e extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C18497e f56059a = new C18497e();

        public C18497e() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rz1 invoke(String str) {
            return (rz1) yu1.f56048o.get(str);
        }
    }

    static {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        sq8.m48648g(keySetViewNewKeySet, "newKeySet(...)");
        f56046m = keySetViewNewKeySet;
        f56047n = new ConcurrentHashMap();
        f56048o = new ConcurrentHashMap();
    }

    /* renamed from: l */
    public static final Set m58296l(nl7 nl7Var, Object obj, Object obj2) {
        sq8.m48649h(nl7Var, "$tmp0");
        return (Set) nl7Var.invoke(obj, obj2);
    }

    /* renamed from: p */
    public static final Set m58297p(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Set) xk7Var.invoke(obj);
    }

    /* renamed from: u */
    public static final rz1 m58298u(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (rz1) xk7Var.invoke(obj);
    }

    /* renamed from: v */
    public static final rz1 m58299v(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (rz1) xk7Var.invoke(obj);
    }

    /* renamed from: g */
    public final CallEngagement m58300g(CallEvent callEvent) {
        Leads leads;
        sq8.m48649h(callEvent, "callEvent");
        Set set = (Set) this.f56053e.get(callEvent.getNumber());
        WebInitiatedCallEvent webInitiatedCallEventM58312w = set != null ? m58312w(set) : null;
        azh.m18051d(this.f56053e).remove(callEvent.getNumber());
        CallLogKey callLogKeyBuild = new CallLogKey.Builder().number(callEvent.getNumber()).direction(callEvent.getDirection()).callStartTime(callEvent.getCallStartTime()).callConnectTime(callEvent.getCallConnectTime()).source(callEvent.getSource()).build();
        synchronized (this.f56050b) {
            CallEngagement callEngagement = (CallEngagement) this.f56054f.get(callLogKeyBuild);
            if (callEngagement != null) {
                return callEngagement;
            }
            gge ggeVar = new gge();
            String string = UUID.randomUUID().toString();
            sq8.m48648g(string, "toString(...)");
            ggeVar.f25106a = string;
            if (webInitiatedCallEventM58312w != null) {
                ggeVar.f25106a = webInitiatedCallEventM58312w.getId();
            }
            bt9 bt9Var = this.f56049a;
            String number = callEvent.getNumber();
            sq8.m48646e(number);
            LeadsSummary leadsSummaryM19753q = bt9Var.m19753q(new ey3(number, null, null, null, false, null, null, 126, null));
            if (leadsSummaryM19753q == null || (leads = leadsSummaryM19753q.toLeads(false)) == null) {
                String number2 = callEvent.getNumber();
                StringBuilder sb = new StringBuilder();
                sb.append("Lead ");
                sb.append(number2);
                sb.append(" is not trackable. Lead not found");
                leads = null;
            }
            if (leads == null) {
                return null;
            }
            String str = (String) ggeVar.f25106a;
            String contactID = leads.getContactID();
            String name = leads.getName();
            String company = leads.getCompany();
            String profilePic = leads.getProfilePic();
            String designation = leads.getDesignation();
            String primaryTeamId = leads.getPrimaryTeamId();
            String str2 = leads.getPhoneNumbers().get(0);
            String phone = callEvent.getPhone();
            Long duration = callEvent.getDuration();
            Long callStartTime = callEvent.getCallStartTime();
            Long callEndTime = callEvent.getCallEndTime();
            String direction = callEvent.getDirection();
            CallConnectStatus callConnectStatus = callEvent.getCallConnectStatus();
            CallEngagement callEngagement2 = new CallEngagement(str, contactID, name, company, profilePic, designation, primaryTeamId, str2, phone, duration, callStartTime, callEndTime, callEvent.getDuration(), direction, callConnectStatus != null ? callConnectStatus.name() : null, "CALL", EngagementStatus.COMPLETED.name(), m58309r(callEvent, webInitiatedCallEventM58312w), "PHONE", callEvent.getCallId(), callEvent.getCallConnectTime(), null, true, r6d.f43055a.m46257a(callEvent.getContext()), null, false, false, null, false, callEvent.getCloudProvider(), callEvent.getCloudProviderNumber(), callEvent.getTotalCallDuration(), callEvent.getCallType(), callEvent.getHangupReason(), callEvent.getPhoneCallLogId(), null, null, false, 522190848, 56, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("In flight engagement created for call ");
            sb2.append(callLogKeyBuild);
            sb2.append(" with details: ");
            sb2.append(callEngagement2);
            this.f56054f.put(callLogKeyBuild, callEngagement2);
            return callEngagement2;
        }
    }

    /* renamed from: h */
    public final void m58301h(WebInitiatedCallEvent webInitiatedCallEvent) {
        sq8.m48649h(webInitiatedCallEvent, "webInitiatedCallEvent");
        this.f56052d.put(webInitiatedCallEvent.getId(), webInitiatedCallEvent);
    }

    /* renamed from: i */
    public final synchronized void m58302i(WebInitiatedCallEvent webInitiatedCallEvent) {
        sq8.m48649h(webInitiatedCallEvent, "webInitiatedCallEvent");
        if (((WebInitiatedCallEvent) this.f56051c.putIfAbsent(webInitiatedCallEvent.getId(), webInitiatedCallEvent)) == null) {
            m58304k(this.f56053e, webInitiatedCallEvent.getPhoneNumber(), webInitiatedCallEvent);
        }
    }

    /* renamed from: j */
    public final void m58303j(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        m58304k(f56044k, new CallLogKey.Builder().number(callEvent.getNumber()).direction(callEvent.getDirection()).callStartTime(callEvent.getCallStartTime()).callConnectTime(callEvent.getCallConnectTime()).source(callEvent.getSource()).build(), callEvent);
    }

    /* renamed from: k */
    public final void m58304k(ConcurrentHashMap concurrentHashMap, Object obj, Object obj2) {
        sq8.m48649h(concurrentHashMap, "<this>");
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj2, "value");
        final C18494b c18494b = new C18494b(obj2);
        concurrentHashMap.compute(obj, new BiFunction() { // from class: o.wu1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj3, Object obj4) {
                return yu1.m58296l(c18494b, obj3, obj4);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final CallEvent m58305m(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        CallLogKey callLogKeyBuild = new CallLogKey.Builder().number(callEvent.getNumber()).direction(callEvent.getDirection()).callStartTime(callEvent.getCallStartTime()).callConnectTime(callEvent.getCallConnectTime()).source(callEvent.getSource()).build();
        Set set = (Set) f56044k.remove(callLogKeyBuild);
        f56046m.add(callLogKeyBuild);
        CallEvent callEvent2 = null;
        if (set != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                CallEvent callEvent3 = (CallEvent) next;
                if (sq8.m48644c(callEvent3.getSource(), "CALL_LOG") || sq8.m48644c(callEvent3.getSource(), "CALL_LOG_SYNC")) {
                    callEvent2 = next;
                    break;
                }
            }
            callEvent2 = callEvent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("call log for the completed event: ");
        sb.append(callEvent2);
        Long callStartTime = callEvent.getCallStartTime();
        if (callStartTime != null) {
            this.f56055g.set(callStartTime.longValue());
        }
        sq8.m48646e(callEvent2);
        return callEvent2;
    }

    /* renamed from: n */
    public final boolean m58306n(WebInitiatedCallEvent webInitiatedCallEvent, long j) {
        sq8.m48649h(webInitiatedCallEvent, "webInitiatedCallEvent");
        if (((WebInitiatedCallEvent) this.f56052d.get(webInitiatedCallEvent.getId())) == null) {
            Long inCallRequestedAt = webInitiatedCallEvent.getInCallRequestedAt();
            if (inCallRequestedAt != null && j - inCallRequestedAt.longValue() < 10000) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public final boolean m58307o(CallEvent callEvent) {
        CallEvent callEvent2;
        CallEvent callEvent3;
        CallEvent callEvent4;
        Object next;
        Object next2;
        Object next3;
        sq8.m48649h(callEvent, "callEvent");
        Set set = (Set) f56044k.get(new CallLogKey.Builder().number(callEvent.getNumber()).direction(callEvent.getDirection()).callStartTime(callEvent.getCallStartTime()).callConnectTime(callEvent.getCallConnectTime()).source(callEvent.getSource()).build());
        CallEvent callEvent5 = null;
        if (set != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                if (sq8.m48644c(((CallEvent) next3).getSource(), "CALL_LOG")) {
                    break;
                }
            }
            callEvent2 = (CallEvent) next3;
        } else {
            callEvent2 = null;
        }
        if (set != null) {
            Iterator it2 = set.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (sq8.m48644c(((CallEvent) next2).getSource(), "SCREENING")) {
                    break;
                }
            }
            callEvent3 = (CallEvent) next2;
        } else {
            callEvent3 = null;
        }
        if (set != null) {
            Iterator it3 = set.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (sq8.m48644c(((CallEvent) next).getSource(), "CALL_STATE")) {
                    break;
                }
            }
            callEvent4 = (CallEvent) next;
        } else {
            callEvent4 = null;
        }
        if (set != null) {
            Iterator it4 = set.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next4 = it4.next();
                if (sq8.m48644c(((CallEvent) next4).getSource(), "CALL_LOG_SYNC")) {
                    callEvent5 = next4;
                    break;
                }
            }
            callEvent5 = callEvent5;
        }
        boolean z = ((callEvent2 == null || (callEvent3 == null && callEvent4 == null)) && callEvent5 == null) ? false : true;
        StringBuilder sb = new StringBuilder();
        sb.append("is completed ");
        sb.append(z);
        sb.append(" for the event: ");
        sb.append(set);
        sb.append(" with incoming ");
        sb.append(callEvent);
        if (callEvent2 == null) {
            callEvent2 = callEvent5;
        }
        if (z && callEvent2 != null) {
            CallLogKey callLogKeyBuild = new CallLogKey.Builder().number(callEvent2.getNumber()).direction(callEvent2.getDirection()).callStartTime(callEvent2.getCallStartTime()).callConnectTime(callEvent2.getCallConnectTime()).source(callEvent2.getSource()).build();
            ConcurrentHashMap concurrentHashMap = f56047n;
            final C18495c c18495c = C18495c.f56057a;
            concurrentHashMap.computeIfAbsent(callLogKeyBuild, new Function() { // from class: o.xu1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return yu1.m58297p(c18495c, obj);
                }
            });
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CallEngagement m58308q(CallEvent callEvent) {
        Leads leads;
        String string;
        String engagementSourceType;
        LeadsSummary leadsSummaryM53507b;
        sq8.m48649h(callEvent, "callEvent");
        CallLogKey callLogKeyBuild = new CallLogKey.Builder().number(callEvent.getNumber()).direction(callEvent.getDirection()).callStartTime(callEvent.getCallStartTime()).callConnectTime(callEvent.getCallConnectTime()).source(callEvent.getSource()).build();
        String number = callEvent.getNumber();
        if (number != null) {
            ey3 ey3Var = new ey3(number, null, null, callEvent.getSubscriptionId(), false, null, callEvent.getPhoneHandle(), 54, null);
            if (sq8.m48644c(callEvent.getDirection(), CallDirection.INCOMING.name())) {
                ey3Var.m25842h(lw9.f34447b);
            } else {
                ey3Var.m25842h(lw9.f34448c);
            }
            vw9 vw9VarM19756x = this.f56049a.m19756x(ey3Var);
            if (vw9VarM19756x == null || (leadsSummaryM53507b = vw9VarM19756x.m53507b()) == null || (leads = leadsSummaryM53507b.toLeads(false)) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Lead ");
                sb.append(ey3Var);
                sb.append(" is not trackable.");
                if (vw9VarM19756x != null) {
                    boolean z = vw9VarM19756x.m53506a();
                    if (z) {
                        l07.f32907a.m36405b("Exception in getting lead", hsa.m31056f(vyh.m53620a("contactNumber", ey3Var.m25836b())));
                        throw new RuntimeException("Exception in getting lead");
                    }
                    leads = null;
                }
            }
        } else {
            leads = null;
        }
        if (leads == null) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            String number2 = callEvent.getNumber();
            if (number2 != null) {
                firebaseCrashlytics.setCustomKey("clientNumber", number2);
            }
            firebaseCrashlytics.recordException(new RuntimeException("CallManager: Not able to get lead for the engagement."));
            return null;
        }
        CallEngagement callEngagement = (CallEngagement) this.f56054f.remove(callLogKeyBuild);
        if (callEngagement == null || (string = callEngagement.getId()) == null) {
            string = UUID.randomUUID().toString();
            sq8.m48648g(string, "toString(...)");
        }
        String str = string;
        if (callEngagement == null || (engagementSourceType = callEngagement.getEngagementSourceType()) == null) {
            engagementSourceType = "DIALER";
        }
        String str2 = engagementSourceType;
        String contactID = leads.getContactID();
        String name = leads.getName();
        String company = leads.getCompany();
        String profilePic = leads.getProfilePic();
        String designation = leads.getDesignation();
        String primaryTeamId = leads.getPrimaryTeamId();
        String str3 = leads.getPhoneNumbers().get(0);
        String phone = callEvent.getPhone();
        CallConnectStatus callConnectStatus = callEvent.getCallConnectStatus();
        Long duration = sq8.m48644c(callConnectStatus != null ? callConnectStatus.name() : null, "CONNECTED") ? callEvent.getDuration() : 0L;
        Long callStartTime = callEvent.getCallStartTime();
        Long callEndTime = callEvent.getCallEndTime();
        String direction = callEvent.getDirection();
        CallConnectStatus callConnectStatus2 = callEvent.getCallConnectStatus();
        String strName = callConnectStatus2 != null ? callConnectStatus2.name() : null;
        String strName2 = EngagementStatus.COMPLETED.name();
        String str4 = sq8.m48644c(callEvent.getSource(), "CALL_LOG_SYNC") ? "PHONE_SYNC" : "PHONE";
        String callId = callEvent.getCallId();
        CallConnectStatus callConnectStatus3 = callEvent.getCallConnectStatus();
        CallEngagement callEngagement2 = new CallEngagement(str, contactID, name, company, profilePic, designation, primaryTeamId, str3, phone, duration, callStartTime, callEndTime, sq8.m48644c(callConnectStatus3 != null ? callConnectStatus3.name() : null, "CONNECTED") ? callEvent.getDuration() : 0L, direction, strName, "CALL", strName2, str2, str4, callId, callEvent.getCallConnectTime(), null, false, r6d.f43055a.m46257a(callEvent.getContext()), null, false, false, null, false, callEvent.getCloudProvider(), callEvent.getCloudProviderNumber(), callEvent.getTotalCallDuration(), callEvent.getCallType(), callEvent.getHangupReason(), callEvent.getPhoneCallLogId(), null, null, false, 522190848, 56, null);
        CallEngagement callEngagement3 = (CallEngagement) this.f56054f.remove(callLogKeyBuild);
        String id = callEngagement3 != null ? callEngagement3.getId() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Engagement created for key: ");
        sb2.append(callLogKeyBuild);
        sb2.append(" with details ");
        sb2.append(callEngagement2);
        sb2.append(" based in inflight call : ");
        sb2.append(id);
        f56045l.put(callLogKeyBuild, callEngagement2);
        m58304k(f56047n, callLogKeyBuild, km.ENGAGEMENT);
        return callEngagement2;
    }

    /* renamed from: r */
    public final String m58309r(CallEvent callEvent, WebInitiatedCallEvent webInitiatedCallEvent) {
        return (AutoCallConfig.Companion.instance().getAutoCallMode() && sq8.m48644c(callEvent.getDirection(), "OUTGOING")) ? "AUTO_DIALER" : webInitiatedCallEvent != null ? "WEB" : "DIALER";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m58310s(Long l, Long l2, Long l3, Long l4) {
        if ((l != null ? l.longValue() : 0L) < (l3 != null ? l3.longValue() : Long.MAX_VALUE)) {
            if ((l != null ? l.longValue() : Long.MAX_VALUE) - (l4 != null ? l4.longValue() : 0L) < 3000 && sq8.m48644c(l, l2)) {
                if ((l != null ? l.longValue() : 0L) >= (l3 != null ? l3.longValue() : Long.MAX_VALUE)) {
                }
            }
            return false;
        }
        if ((l != null ? l.longValue() : 0L) > (l4 != null ? l4.longValue() + 3000 : 0L)) {
        }
        return true;
    }

    /* renamed from: t */
    public final CallEngagement m58311t(CallEngagement callEngagement, rz1 rz1Var) {
        Object next;
        Uri uriM47311i;
        synchronized (this.f56050b) {
            if (callEngagement == null) {
                if (rz1Var == null) {
                    y3i y3iVar = y3i.f54824a;
                    return null;
                }
                f56048o.put(rz1Var.m47308f(), rz1Var);
                ConcurrentHashMap concurrentHashMap = f56047n;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (!((Set) entry.getValue()).contains(km.RECORDING)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    CallEngagement callEngagement2 = (CallEngagement) f56045l.get((CallLogKey) it.next());
                    if (m58310s(rz1Var.m47304b(), rz1Var.m47305c(), callEngagement2 != null ? callEngagement2.getCallStartTime() : null, callEngagement2 != null ? callEngagement2.getCallEndTime() : null)) {
                        if (sq8.m48644c(callEngagement2 != null ? callEngagement2.getCallConnectionStatus() : null, "CONNECTED")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Recording ");
                            sb.append(rz1Var);
                            sb.append(" is matching with engagement ");
                            sb.append(callEngagement2);
                            callEngagement2.setCallRecording(rz1Var);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Engagement updated with recording details ");
                            sb2.append(callEngagement2);
                            m58304k(f56047n, new CallLogKey.Builder().number(callEngagement2.getClientContactNumber()).direction(callEngagement2.getCallDirection()).callStartTime(callEngagement2.getCallStartTime()).callConnectTime(callEngagement2.getCallConnectTime()).source(callEngagement2.getEngagementSource()).build(), km.RECORDING);
                            return callEngagement2;
                        }
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Recording ");
                    sb3.append(rz1Var);
                    sb3.append(" is not matching with engagement ");
                    sb3.append(callEngagement2);
                }
                return null;
            }
            ConcurrentHashMap concurrentHashMap2 = f56048o;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                if (m58310s(((rz1) entry2.getValue()).m47304b(), ((rz1) entry2.getValue()).m47305c(), callEngagement.getCallStartTime(), callEngagement.getCallEndTime()) && sq8.m48644c(callEngagement.getCallConnectionStatus(), "CONNECTED")) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            Set setKeySet = linkedHashMap2.keySet();
            if ((!setKeySet.isEmpty()) && setKeySet.size() > 1) {
                int size = setKeySet.size();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("More than 1 matched found for the engagement ");
                sb4.append(size);
                sb4.append(" for the engagement ");
                sb4.append(callEngagement);
                sb4.append(" and recording ");
                sb4.append(setKeySet);
                Stream stream = setKeySet.stream();
                final C18496d c18496d = C18496d.f56058a;
                Object objCollect = stream.map(new Function() { // from class: o.uu1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return yu1.m58298u(c18496d, obj);
                    }
                }).collect(Collectors.toList());
                sq8.m48648g(objCollect, "collect(...)");
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj : (Iterable) objCollect) {
                    rz1 rz1Var2 = (rz1) obj;
                    String strM47307e = rz1Var2 != null ? rz1Var2.m47307e() : null;
                    Object arrayList = linkedHashMap3.get(strM47307e);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap3.put(strM47307e, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                if (linkedHashMap3.size() == 1) {
                    Stream stream2 = setKeySet.stream();
                    final C18497e c18497e = C18497e.f56059a;
                    Object objCollect2 = stream2.map(new Function() { // from class: o.vu1
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return yu1.m58299v(c18497e, obj2);
                        }
                    }).collect(Collectors.toList());
                    sq8.m48648g(objCollect2, "collect(...)");
                    Iterator it2 = ((Iterable) objCollect2).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        rz1 rz1Var3 = (rz1) next;
                        if (sq8.m48644c((rz1Var3 == null || (uriM47311i = rz1Var3.m47311i()) == null) ? null : uriM47311i.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                            break;
                        }
                    }
                    rz1 rz1Var4 = (rz1) next;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Matched ");
                    sb5.append(setKeySet);
                    sb5.append(" found for the engagement ");
                    sb5.append(rz1Var4);
                    callEngagement.setCallRecording((rz1) f56048o.get(rz1Var4 != null ? rz1Var4.m47308f() : null));
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Engagement updated with recording details ");
                    sb6.append(callEngagement);
                    m58304k(f56047n, new CallLogKey.Builder().number(callEngagement.getClientContactNumber()).direction(callEngagement.getCallDirection()).callStartTime(callEngagement.getCallStartTime()).callConnectTime(callEngagement.getCallConnectTime()).source(callEngagement.getEngagementSource()).build(), km.RECORDING);
                    return callEngagement;
                }
            } else {
                if (true ^ setKeySet.isEmpty()) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("Matched ");
                    sb7.append(setKeySet);
                    sb7.append(" found for the engagement ");
                    sb7.append(callEngagement);
                    callEngagement.setCallRecording((rz1) f56048o.get(kh3.e0(setKeySet)));
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Engagement updated with recording details ");
                    sb8.append(callEngagement);
                    m58304k(f56047n, new CallLogKey.Builder().number(callEngagement.getClientContactNumber()).direction(callEngagement.getCallDirection()).callStartTime(callEngagement.getCallStartTime()).callConnectTime(callEngagement.getCallConnectTime()).source(callEngagement.getEngagementSource()).build(), km.RECORDING);
                    return callEngagement;
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append("No matches found for the engagement ");
                sb9.append(callEngagement);
            }
            return null;
        }
    }

    /* renamed from: w */
    public final WebInitiatedCallEvent m58312w(Set set) {
        Iterator it = set.iterator();
        Object obj = null;
        while (it.hasNext()) {
            WebInitiatedCallEvent webInitiatedCallEvent = (WebInitiatedCallEvent) it.next();
            Object objRemove = this.f56051c.remove(webInitiatedCallEvent.getId());
            this.f56052d.remove(webInitiatedCallEvent.getId());
            obj = objRemove;
        }
        return (WebInitiatedCallEvent) obj;
    }

    /* renamed from: x */
    public final boolean m58313x(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        if (callEvent.getCallStartTime() != null && callEvent.getCallStartTime().longValue() < this.f56055g.get() && this.f56055g.get() > 0) {
            Long callStartTime = callEvent.getCallStartTime();
            long j = this.f56055g.get();
            StringBuilder sb = new StringBuilder();
            sb.append("Stale event: current: ");
            sb.append(callStartTime);
            sb.append(", last: ");
            sb.append(j);
        }
        Long callStartTime2 = callEvent.getCallStartTime();
        sq8.m48646e(callStartTime2);
        return callStartTime2.longValue() < this.f56055g.get() && this.f56055g.get() > 0 && !sq8.m48644c(callEvent.getSource(), "CALL_LOG") && !sq8.m48644c(callEvent.getSource(), "CALL_LOG_SYNC");
    }

    /* renamed from: y */
    public final CallEngagement m58314y(CallEngagement callEngagement) {
        sq8.m48649h(callEngagement, "engagement");
        return m58311t(callEngagement, null);
    }

    /* renamed from: z */
    public final CallEngagement m58315z(rz1 rz1Var) {
        sq8.m48649h(rz1Var, "callRecording");
        return m58311t(null, rz1Var);
    }
}
