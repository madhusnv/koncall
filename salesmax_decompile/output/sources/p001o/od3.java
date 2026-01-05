package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.model.CloudTelephonyProvider;
import ai.salesmax.services.model.CloudTelephonyAgent;
import ai.salesmax.services.model.CloudTelephonySetup;
import ai.salesmax.util.Prefs;
import androidx.databinding.ObservableBoolean;
import com.amplifyframework.datastore.generated.model.CloudTelephonyAccount;
import com.amplifyframework.datastore.generated.model.CloudTelephonyUser;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class od3 {

    /* renamed from: a */
    public Map f38136a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map f38137b = new ConcurrentHashMap();

    /* renamed from: c */
    public he3 f38138c;

    public od3(he3 he3Var) {
        this.f38138c = he3Var;
    }

    /* renamed from: D */
    public static Map m42018D() {
        return SuperfoneApplication.f225c.m127c().m3256r();
    }

    /* renamed from: E */
    public static List m42019E() {
        final String strM42020F = m42020F();
        return (List) m42021G().stream().map(new Function() { // from class: o.pc3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return od3.m42032S(strM42020F, (String) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: F */
    public static String m42020F() {
        Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        String strM3257s = prefsM127c.m3257s();
        if (strM3257s != null) {
            return strM3257s;
        }
        String str = (String) m42021G().stream().findFirst().orElse(null);
        prefsM127c.T0(str);
        return str;
    }

    /* renamed from: G */
    public static Collection m42021G() {
        return m42018D().keySet();
    }

    /* renamed from: H */
    public static ObservableBoolean m42022H() {
        final String strM42020F = m42020F();
        final ObservableBoolean observableBoolean = new ObservableBoolean(false);
        if (Optional.ofNullable(strM42020F).isPresent()) {
            SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
            Prefs prefsM127c = c0044a.m127c();
            Objects.requireNonNull(prefsM127c);
            Boolean bool = (Boolean) Optional.ofNullable((Map) ((Map) Optional.ofNullable(c0044a.m127c().m3255q()).map(new Function() { // from class: o.oc3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return od3.m42033T((String) obj);
                }
            }).orElse(Collections.emptyMap())).get((String) prefsM127c.m3242d().f44265a)).map(new Function() { // from class: o.zc3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return od3.m42034U(strM42020F, (Map) obj);
                }
            }).orElse(Boolean.FALSE);
            observableBoolean.m5960j(bool.booleanValue());
            nt6.m41112f().m41121m(bool.booleanValue());
            uni.LB().d0(new gd()).d0(new hd()).d0(new rl7() { // from class: o.gd3
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return od3.m42035V((l1) obj);
                }
            }).m55717M(new rl7() { // from class: o.hd3
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return od3.m42036W((ryh) obj);
                }
            }).v0(new gu3() { // from class: o.id3
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    od3.m42037X(observableBoolean, strM42020F, (Map) obj);
                }
            }, new gu3() { // from class: o.jd3
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    od3.m42038Y(observableBoolean, (Throwable) obj);
                }
            });
        } else {
            observableBoolean.m5960j(false);
            nt6.m41112f().m41121m(observableBoolean.m5959i());
        }
        return observableBoolean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m42023J(Map map) {
        String.format("%s - account to cloud telephony cache is initialized %s", this, this.f38136a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m42024K(qif qifVar, Throwable th) {
        String.format("%s - account to cloud telephony cache load has failed initialization %s", this, this.f38136a);
        qifVar.mo43035B(Boolean.TRUE);
    }

    /* renamed from: L */
    public static /* synthetic */ void m42025L(qif qifVar) {
        qifVar.mo43035B(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m42026M(Map map) {
        String.format("%s - users to cloud telephony cache is initialized %s", this, this.f38137b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m42027N(qif qifVar, Throwable th) {
        String.format("%s - users to cloud telephony cache load has failed initialization %s", this, this.f38137b);
        qifVar.mo43035B(Boolean.TRUE);
    }

    /* renamed from: O */
    public static /* synthetic */ void m42028O(qif qifVar) {
        qifVar.mo43035B(Boolean.TRUE);
    }

    /* renamed from: P */
    public static /* synthetic */ void m42029P(Boolean bool) {
    }

    /* renamed from: S */
    public static /* synthetic */ CloudTelephonyProvider m42032S(String str, String str2) {
        return new CloudTelephonyProvider(str2, str2, str2, Objects.equals(str, str2));
    }

    /* renamed from: T */
    public static /* synthetic */ Map m42033T(String str) {
        return (Map) ja8.f30034b.fromJson(str, Map.class);
    }

    /* renamed from: U */
    public static /* synthetic */ Boolean m42034U(String str, Map map) {
        return Boolean.valueOf(map.containsKey(str));
    }

    /* renamed from: V */
    public static /* synthetic */ ryh m42035V(l1 l1Var) {
        return uyh.of(l1Var, l1Var.lB());
    }

    /* renamed from: W */
    public static /* synthetic */ x8c m42036W(ryh ryhVar) {
        return ((od3) ryhVar.f44266b).j0((he3) ryhVar.f44265a);
    }

    /* renamed from: X */
    public static /* synthetic */ void m42037X(ObservableBoolean observableBoolean, String str, Map map) {
        observableBoolean.m5960j(map.containsKey(str));
        observableBoolean.m28508g();
        nt6.m41112f().m41121m(observableBoolean.m5959i());
        String.format("Has Cloud Telephony Enabled %s", map);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m42038Y(ObservableBoolean observableBoolean, Throwable th) {
        observableBoolean.m5960j(false);
        observableBoolean.m28508g();
        nt6.m41112f().m41121m(observableBoolean.m5959i());
        String.format("Error while checking Has Cloud Telephony Enabled", th);
    }

    public static /* synthetic */ x8c a0(final he3 he3Var) {
        return he3Var.Mo(he3Var.on()).d0(new rl7() { // from class: o.ed3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return uyh.of(he3Var, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b0(ryh ryhVar) {
        return m42066B((he3) ryhVar.f44265a, (List) ryhVar.f44266b).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map c0(he3 he3Var, ryh ryhVar) {
        return (Map) this.f38136a.getOrDefault(he3Var.on(), Collections.emptyMap());
    }

    public static /* synthetic */ x8c e0(final he3 he3Var) {
        return he3Var.Va(he3Var.on(), he3Var.Eo()).d0(new rl7() { // from class: o.qc3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return uyh.of(he3Var, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean f0(ryh ryhVar) {
        return m42067C((he3) ryhVar.f44265a, (List) ryhVar.f44266b).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map g0(he3 he3Var, ryh ryhVar) {
        return (Map) this.f38137b.getOrDefault(he3Var.Eo(), Collections.emptyMap());
    }

    public static /* synthetic */ void h0(Map map, CloudTelephonySetup cloudTelephonySetup) {
        map.put(cloudTelephonySetup.getProvider(), cloudTelephonySetup.getVirtualNumbers());
    }

    public static void l0(String str) {
        SuperfoneApplication.f225c.m127c().T0(str);
    }

    /* renamed from: A */
    public final void m42065A() {
        String.format("%s - Cloud Telephony Account Manager Initialization Called %s", this, this.f38138c);
        final qif qifVarM45520F = qif.m45520F();
        final qif qifVarM45520F2 = qif.m45520F();
        i0(this.f38138c).y0(i5f.m31599c()).w0(new gu3() { // from class: o.rc3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f43364a.m42023J((Map) obj);
            }
        }, new gu3() { // from class: o.sc3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f45169a.m42024K(qifVarM45520F, (Throwable) obj);
            }
        }, new jm() { // from class: o.tc3
            @Override // p001o.jm
            public final void run() {
                od3.m42025L(qifVarM45520F);
            }
        });
        j0(this.f38138c).y0(i5f.m31599c()).w0(new gu3() { // from class: o.uc3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f48705a.m42026M((Map) obj);
            }
        }, new gu3() { // from class: o.vc3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f50103a.m42027N(qifVarM45520F2, (Throwable) obj);
            }
        }, new jm() { // from class: o.wc3
            @Override // p001o.jm
            public final void run() {
                od3.m42028O(qifVarM45520F2);
            }
        });
        x6c.g0(x6c.m55698V(qifVarM45520F), x6c.m55698V(qifVarM45520F2)).y0(i5f.m31599c()).w0(new gu3() { // from class: o.xc3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                od3.m42029P((Boolean) obj);
            }
        }, new gu3() { // from class: o.yc3
            @Override // p001o.gu3
            public final void accept(Object obj) {
                od3.m42022H();
            }
        }, new jm() { // from class: o.ad3
            @Override // p001o.jm
            public final void run() {
                od3.m42022H();
            }
        });
    }

    /* renamed from: B */
    public final synchronized Boolean m42066B(he3 he3Var, List list) {
        CloudTelephonySetup cloudTelephonySetup;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CloudTelephonyAccount cloudTelephonyAccount = (CloudTelephonyAccount) it.next();
            String displayNumber = cloudTelephonyAccount.getDisplayNumber();
            String providerName = cloudTelephonyAccount.getProviderName();
            Boolean hasOutbound = cloudTelephonyAccount.getHasOutbound();
            String accountId = cloudTelephonyAccount.getAccountId();
            Map map = new HashMap();
            if (concurrentHashMap.containsKey(accountId)) {
                map = (Map) concurrentHashMap.get(accountId);
            } else {
                concurrentHashMap.put(accountId, map);
            }
            if (map.containsKey(providerName)) {
                cloudTelephonySetup = (CloudTelephonySetup) map.get(providerName);
            } else {
                CloudTelephonySetup cloudTelephonySetup2 = new CloudTelephonySetup(accountId, providerName);
                map.put(providerName, cloudTelephonySetup2);
                cloudTelephonySetup = cloudTelephonySetup2;
            }
            cloudTelephonySetup.addVirtualNumber(displayNumber, hasOutbound);
        }
        this.f38136a = concurrentHashMap;
        k0(he3Var.wa(), ((Map) concurrentHashMap.getOrDefault(this.f38138c.on(), Collections.emptyMap())).values());
        return Boolean.TRUE;
    }

    /* renamed from: C */
    public final synchronized Boolean m42067C(he3 he3Var, List list) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CloudTelephonyUser cloudTelephonyUser = (CloudTelephonyUser) it.next();
            List<String> allowedOutboundNumbers = cloudTelephonyUser.getAllowedOutboundNumbers();
            String providerName = cloudTelephonyUser.getProviderName();
            String agentId = cloudTelephonyUser.getAgentId();
            String agentNumber = cloudTelephonyUser.getAgentNumber();
            String userId = cloudTelephonyUser.getUserId();
            String accountId = cloudTelephonyUser.getAccountId();
            Map map = new HashMap();
            CloudTelephonyAgent cloudTelephonyAgent = new CloudTelephonyAgent();
            cloudTelephonyAgent.setCloudTelephonyProvider(providerName);
            cloudTelephonyAgent.setAgentId(agentId);
            cloudTelephonyAgent.setUserId(userId);
            cloudTelephonyAgent.setAccountId(accountId);
            cloudTelephonyAgent.setVirtualNumbers(allowedOutboundNumbers);
            cloudTelephonyAgent.setAgentNumber(agentNumber);
            if (concurrentHashMap.containsKey(userId)) {
                map = (Map) concurrentHashMap.get(userId);
            } else {
                concurrentHashMap.put(userId, map);
            }
            map.put(providerName, cloudTelephonyAgent);
        }
        SuperfoneApplication.f225c.m127c().R0(ja8.f30034b.toJson(concurrentHashMap));
        this.f38137b = concurrentHashMap;
        return Boolean.TRUE;
    }

    /* renamed from: I */
    public void m42068I() {
        m42065A();
    }

    public final x6c i0(final he3 he3Var) {
        Map map = (Map) this.f38136a.get(he3Var.on());
        return !Objects.isNull(map) ? x6c.c0(map) : ((x6c) Optional.ofNullable(he3Var).map(new kd3()).orElse(m42069z())).m55717M(new rl7() { // from class: o.bd3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return od3.a0((he3) obj);
            }
        }).m55714J(new ggd() { // from class: o.cd3
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f17876a.b0((ryh) obj);
            }
        }).d0(new rl7() { // from class: o.dd3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f19600a.c0(he3Var, (ryh) obj);
            }
        });
    }

    public final x6c j0(final he3 he3Var) {
        Map map = (Map) this.f38137b.get(he3Var.on());
        return !Objects.isNull(map) ? x6c.c0(map) : ((x6c) Optional.ofNullable(he3Var).map(new kd3()).orElse(m42069z())).m55717M(new rl7() { // from class: o.ld3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return od3.e0((he3) obj);
            }
        }).m55714J(new ggd() { // from class: o.md3
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f35194a.f0((ryh) obj);
            }
        }).d0(new rl7() { // from class: o.nd3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f36699a.g0(he3Var, (ryh) obj);
            }
        });
    }

    public final boolean k0(Prefs prefs, Collection collection) {
        String.format("%s- Saving cloud telephony virtual number prefs", this);
        final HashMap map = new HashMap();
        collection.forEach(new Consumer() { // from class: o.fd3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                od3.h0(map, (CloudTelephonySetup) obj);
            }
        });
        prefs.S0(map);
        String.format("%s- Saved cloud telephony virtual number prefs - %s", this, map);
        return true;
    }

    /* renamed from: z */
    public final x6c m42069z() {
        return uni.LB().d0(new gd()).d0(new hd());
    }
}
