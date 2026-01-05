package ai.salesmax.custom;

import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.CallOutcome;
import ai.salesmax.model.ChatLabel;
import ai.salesmax.model.DealStageDefinition;
import ai.salesmax.model.LeadSource;
import ai.salesmax.model.PropertyDefinition;
import ai.salesmax.model.PropertyOptions;
import ai.salesmax.model.TaskTypeDefinition;
import ai.salesmax.model.TemplateVariable;
import ai.salesmax.model.VisitOutcome;
import ai.salesmax.services.model.SubscriptionNotificationEvent;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.Business;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.CustomPropertyDefinitions;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.google.android.gms.common.api.Api;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.aod;
import p001o.aqd;
import p001o.bpd;
import p001o.bqd;
import p001o.cqd;
import p001o.cz4;
import p001o.dpd;
import p001o.eh1;
import p001o.eqd;
import p001o.gu3;
import p001o.hpb;
import p001o.hqd;
import p001o.ja8;
import p001o.jqd;
import p001o.l1;
import p001o.pnd;
import p001o.ppd;
import p001o.qe4;
import p001o.r6c;
import p001o.rl7;
import p001o.ryh;
import p001o.snd;
import p001o.ss9;
import p001o.su5;
import p001o.swd;
import p001o.th1;
import p001o.tod;
import p001o.tpd;
import p001o.upd;
import p001o.uyh;
import p001o.vpd;
import p001o.wpd;
import p001o.x6c;
import p001o.x8c;
import p001o.xpd;
import p001o.yod;
import p001o.ypd;
import p001o.zpd;
import type.Priority;

/* loaded from: classes.dex */
public class PropertyDefinitionRepository {

    /* renamed from: k */
    public static final String f288k = Contact.class.getSimpleName();

    /* renamed from: l */
    public static final String f289l = Business.class.getSimpleName();

    /* renamed from: m */
    public static final String f290m = Engagement.class.getSimpleName();

    /* renamed from: n */
    public static final String f291n = Account.class.getSimpleName();

    /* renamed from: o */
    public static PropertyDefinitionRepository f292o;

    /* renamed from: a */
    public l1 f293a;

    /* renamed from: c */
    public cz4 f295c;

    /* renamed from: d */
    public su5 f296d;

    /* renamed from: b */
    public hpb f294b = new hpb();

    /* renamed from: e */
    public Map f297e = null;

    /* renamed from: f */
    public Map f298f = null;

    /* renamed from: g */
    public Map f299g = null;

    /* renamed from: h */
    public Map f300h = null;

    /* renamed from: i */
    public List f301i = null;

    /* renamed from: j */
    public ss9 f302j = null;

    /* renamed from: ai.salesmax.custom.PropertyDefinitionRepository$a */
    public static /* synthetic */ class C0074a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f304a;

        static {
            int[] iArr = new int[SubscriptionNotificationEvent.EventType.values().length];
            f304a = iArr;
            try {
                iArr[SubscriptionNotificationEvent.EventType.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f304a[SubscriptionNotificationEvent.EventType.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f304a[SubscriptionNotificationEvent.EventType.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ boolean A0(String str, String str2, PropertyDefinition propertyDefinition) {
        return str.equals(propertyDefinition.getParentObjectType()) && str2.equals(propertyDefinition.getPropertyName());
    }

    public static /* synthetic */ Optional B0(final String str, final String str2, List list) {
        return list.stream().filter(new Predicate() { // from class: o.ood
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PropertyDefinitionRepository.A0(str, str2, (PropertyDefinition) obj);
            }
        }).findFirst();
    }

    public static /* synthetic */ void C0(PropertyDefinition propertyDefinition, Map map) {
        map.remove(propertyDefinition.getPropertyName());
    }

    public static /* synthetic */ void D0(PropertyDefinition propertyDefinition, Map map) {
        map.remove(propertyDefinition.getPropertyName());
    }

    public static /* synthetic */ void E0(PropertyDefinition propertyDefinition, Map map) {
        map.remove(propertyDefinition.getPropertyName());
    }

    public static /* synthetic */ void F0(PropertyDefinition propertyDefinition, Map map) {
        map.remove(propertyDefinition.getPropertyName());
    }

    public static /* synthetic */ void H0(PropertyDefinition propertyDefinition, Map map) {
        map.put(propertyDefinition.getPropertyName(), propertyDefinition);
    }

    public static /* synthetic */ void I0(PropertyDefinition propertyDefinition, Map map) {
        map.put(propertyDefinition.getPropertyName(), propertyDefinition);
    }

    public static /* synthetic */ void J0(PropertyDefinition propertyDefinition, Map map) {
        map.put(propertyDefinition.getPropertyName(), propertyDefinition);
    }

    public static /* synthetic */ void K0(PropertyDefinition propertyDefinition, Map map) {
        map.put(propertyDefinition.getPropertyName(), propertyDefinition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List L0(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        arrayList.addAll(list4);
        arrayList.addAll(list5);
        List listM220T = m220T(arrayList);
        this.f301i = listM220T;
        return listM220T;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x8c M0(final List list, final List list2, final List list3, final List list4, l1 l1Var) {
        return l1Var.Ym(null).d0(new rl7() { // from class: o.zod
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return PropertyDefinitionRepository.y1((List) obj);
            }
        }).d0(new rl7() { // from class: o.apd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f15114a.L0(list, list2, list3, list4, (List) obj);
            }
        });
    }

    public static /* synthetic */ boolean N0(Map map) {
        return !map.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map O0(List list) {
        return this.f297e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x6c P0() {
        return z0().d0(new rl7() { // from class: o.pod
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f40336a.O0((List) obj);
            }
        });
    }

    public static /* synthetic */ boolean Q0(Map map) {
        return !map.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map R0(List list) {
        return this.f299g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x6c S0() {
        return z0().d0(new rl7() { // from class: o.nod
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f37108a.R0((List) obj);
            }
        });
    }

    public static /* synthetic */ void T0(PropertyDefinition propertyDefinition, Map map) {
        map.put(propertyDefinition.getPropertyName(), propertyDefinition);
    }

    public static /* synthetic */ void U0(PropertyDefinition propertyDefinition, Map map) {
        map.put(propertyDefinition.getPropertyName(), propertyDefinition);
    }

    public static /* synthetic */ void V0(PropertyDefinition propertyDefinition, Map map) {
        map.put(propertyDefinition.getPropertyName(), propertyDefinition);
    }

    /* renamed from: W */
    public static List m190W() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CallOutcome("Interested", "INTERESTED", "positive", "Form-1", true, true, 1, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Interested For Future", "INTERESTED_FOR_FUTURE", "positive", "Form-1", false, false, 2, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Not Interested", "NOT_INTERESTED", "negative", "Form-1", false, false, 3, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Hostile", "HOSTILE", "negative", "Form-1", false, false, 4, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Call Later", "CALL_LATER", "neutral", "Form-1", false, false, 5, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Wrong Number", "WRONG_NUMBER", "neutral", "Form-1", false, false, 6, false, Collections.emptyList()));
        return (List) arrayList.stream().map(new yod()).collect(Collectors.toList());
    }

    public static /* synthetic */ void W0(PropertyDefinition propertyDefinition, Map map) {
        map.put(propertyDefinition.getPropertyName(), propertyDefinition);
    }

    /* renamed from: X */
    public static List m191X() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ChatLabel("Critical", ""));
        arrayList.add(new ChatLabel("Non Critical", ""));
        return (List) arrayList.stream().map(new Function() { // from class: o.rod
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PropertyDefinitionRepository.e0((ChatLabel) obj);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ PropertyDefinition X0(final PropertyDefinition propertyDefinition) {
        if (f290m.equalsIgnoreCase(propertyDefinition.getParentObjectType())) {
            Optional.ofNullable(this.f299g).ifPresent(new Consumer() { // from class: o.ipd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.T0(propertyDefinition, (Map) obj);
                }
            });
        } else if (f288k.equalsIgnoreCase(propertyDefinition.getParentObjectType())) {
            Optional.ofNullable(this.f297e).ifPresent(new Consumer() { // from class: o.jpd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.U0(propertyDefinition, (Map) obj);
                }
            });
        } else if (f289l.equalsIgnoreCase(propertyDefinition.getParentObjectType())) {
            Optional.ofNullable(this.f298f).ifPresent(new Consumer() { // from class: o.kpd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.V0(propertyDefinition, (Map) obj);
                }
            });
        } else if (f291n.equalsIgnoreCase(propertyDefinition.getParentObjectType())) {
            Optional.ofNullable(this.f300h).ifPresent(new Consumer() { // from class: o.lpd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.W0(propertyDefinition, (Map) obj);
                }
            });
        }
        this.f301i.add(propertyDefinition);
        return propertyDefinition;
    }

    /* renamed from: Y */
    public static List m192Y() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DealStageDefinition("1", "Prospect", "There is an opportunity to sell", "Sales Pipeline", -1, false, false, Collections.emptyList(), Collections.emptyList(), 0, false, false, false));
        arrayList.add(new DealStageDefinition("2", "Demo Booked", "Demo Scheduled", "Sales Pipeline", -1, false, false, Collections.emptyList(), Collections.emptyList(), 0, false, false, false));
        arrayList.add(new DealStageDefinition("3", "Pricing Finalized", "Pricing has been negotiated", "Sales Pipeline", -1, false, false, Collections.emptyList(), Collections.emptyList(), 0, false, false, false));
        arrayList.add(new DealStageDefinition("4", "Credentials Received", "User Credentials for account creation received", "Sales Pipeline", -1, false, false, Collections.emptyList(), Collections.emptyList(), 0, false, false, false));
        arrayList.add(new DealStageDefinition("5", "Users Onboarded", "Account created and users onboarded in account", "Sales Pipeline", -1, false, false, Collections.emptyList(), Collections.emptyList(), 0, false, false, false));
        arrayList.add(new DealStageDefinition("6", "Converted to Paid Plan", "Account upgraded to paid plan from trial", "Sales Pipeline", -1, false, false, Collections.emptyList(), Collections.emptyList(), 0, false, false, false));
        arrayList.add(new DealStageDefinition("7", "Deal Won", "Deal closed in a win", "Sales Pipeline", -1, false, false, Collections.emptyList(), Collections.emptyList(), 0, false, false, false));
        arrayList.add(new DealStageDefinition("8", "Deal Lost", "Deal closed in a loss", "Sales Pipeline", -1, false, false, Collections.emptyList(), Collections.emptyList(), 0, false, false, false));
        return (List) arrayList.stream().map(new Function() { // from class: o.epd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PropertyDefinitionRepository.f0((DealStageDefinition) obj);
            }
        }).collect(Collectors.toList());
    }

    public static /* synthetic */ PropertyOptions Y0(String str) {
        return new PropertyOptions(str, str, str, false);
    }

    /* renamed from: Z */
    public static PropertyDefinition m193Z() {
        return m1("leadSource", "Option", "Contact Source", a0(), false, f288k);
    }

    public static /* synthetic */ PropertyOptions Z0(ryh ryhVar) {
        Object obj = ryhVar.f44265a;
        return new PropertyOptions((String) obj, (String) ryhVar.f44266b, (String) obj, false);
    }

    public static List a0() {
        ArrayList arrayList = new ArrayList();
        LeadSource.Companion companion = LeadSource.Companion;
        arrayList.add(new LeadSource("1", companion.getLEADSOURCE_NAME_FACEBOOK(), "Facebook", "Lead sourced from facebook", false));
        arrayList.add(new LeadSource("2", companion.getLEADSOURCE_NAME_INDIAMART(), "Indiamart", "Lead sourced from indiamart", false));
        arrayList.add(new LeadSource("3", companion.getLEADSOURCE_NAME_CONTACT_FORM(), "Contact Form", "Lead sourced from custom contact form", false));
        return (List) arrayList.stream().map(new bpd()).collect(Collectors.toList());
    }

    public static /* synthetic */ void a1(HashMap map, PropertyDefinition propertyDefinition) {
        map.put(propertyDefinition.getPropertyName().toLowerCase(), propertyDefinition);
    }

    public static List b0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TaskTypeDefinition("1", "Follow Up", "Follow Up with Lead", "form-1", "Task Creator", Collections.emptyList(), "form -2", "form-3", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), 30, 1, false));
        return (List) arrayList.stream().map(new Function() { // from class: o.qod
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PropertyDefinitionRepository.h0((TaskTypeDefinition) obj);
            }
        }).collect(Collectors.toList());
    }

    public static List c0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CallOutcome("All Unconnected", "ANY_UNCONTACTED_CALLS", "neutral", "", false, false, 1, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("RNR", "RNR", "neutral", "", false, false, 1, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Busy", "BUSY", "neutral", "", false, false, 1, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Cut the call", "CUT_THE_CALL", "neutral", "", false, false, 1, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Not Reachable", "NOT_REACHABLE", "neutral", "", false, false, 1, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Switched Off", "SWITCHED_OFF", "neutral", "", false, false, 1, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Invalid", "INVALID", "negative", "", false, false, 1, false, Collections.emptyList()));
        arrayList.add(new CallOutcome("Multiple RNR", "MULTIPLE_RNR", "negative", "", false, false, 1, false, Collections.emptyList()));
        return (List) arrayList.stream().map(new yod()).collect(Collectors.toList());
    }

    public static /* synthetic */ void c1() {
    }

    public static PropertyOptions d0(CallOutcome callOutcome) {
        return new PropertyOptions((String) Optional.ofNullable(callOutcome.getOutcomeValue()).orElse(th1.m49859k(callOutcome.getOutcomeTitle())), callOutcome.getOutcomeTitle(), (String) ja8.Tu(callOutcome, String.class), false);
    }

    public static /* synthetic */ void d1() {
    }

    public static PropertyOptions e0(ChatLabel chatLabel) {
        return new PropertyOptions(th1.m49859k(chatLabel.getLabel()), chatLabel.getLabel(), (String) ja8.Tu(chatLabel, String.class), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e1(SubscriptionNotificationEvent subscriptionNotificationEvent) {
        int i = C0074a.f304a[subscriptionNotificationEvent.eventType().ordinal()];
        if (i == 1 || i == 2) {
            n0((PropertyDefinition) subscriptionNotificationEvent.newValue());
        } else {
            if (i != 3) {
                return;
            }
            m0((PropertyDefinition) subscriptionNotificationEvent.oldValue());
        }
    }

    public static PropertyOptions f0(DealStageDefinition dealStageDefinition) {
        return new PropertyOptions(th1.m49859k(dealStageDefinition.getName()), dealStageDefinition.getName(), (String) ja8.Tu(dealStageDefinition, String.class), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f1(Throwable th) {
    }

    public static PropertyOptions g0(LeadSource leadSource) {
        return new PropertyOptions(th1.m49859k(leadSource.getName()), leadSource.getDisplayName(), (String) ja8.Tu(leadSource, String.class), false);
    }

    public static PropertyDefinition g1(List list) {
        return m1("leadSource", "Option", "Contact Source", list, false, f288k);
    }

    public static PropertyOptions h0(TaskTypeDefinition taskTypeDefinition) {
        return new PropertyOptions(th1.m49859k(taskTypeDefinition.getName()), taskTypeDefinition.getName(), (String) ja8.Tu(taskTypeDefinition, String.class), false);
    }

    public static PropertyOptions i0(VisitOutcome visitOutcome) {
        return new PropertyOptions(th1.m49859k(visitOutcome.getOutcomeTitle()), visitOutcome.getOutcomeTitle(), (String) ja8.Tu(visitOutcome, String.class), false);
    }

    public static PropertyDefinition l1(String str, String str2, String str3, List list, boolean z, String str4) {
        return m1(str, str2, str3, (List) list.stream().map(new Function() { // from class: o.cpd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PropertyDefinitionRepository.Y0((String) obj);
            }
        }).collect(Collectors.toList()), z, str4);
    }

    public static PropertyDefinition m1(String str, String str2, String str3, List list, boolean z, String str4) {
        PropertyDefinition propertyDefinition = new PropertyDefinition();
        propertyDefinition.setPropertyName(str);
        propertyDefinition.setDisplayName(str3);
        propertyDefinition.setScalarType(str2);
        propertyDefinition.setSystemProperty(true);
        propertyDefinition.setParentObjectType(str4);
        propertyDefinition.setPossibleValues(list);
        propertyDefinition.setMultiple(z);
        return propertyDefinition;
    }

    public static PropertyDefinition n1(String str, String str2, String str3, List list, boolean z, String str4) {
        return m1(str, str2, str3, (List) list.stream().map(new Function() { // from class: o.xod
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PropertyDefinitionRepository.Z0((ryh) obj);
            }
        }).collect(Collectors.toList()), z, str4);
    }

    public static synchronized PropertyDefinitionRepository o0() {
        if (f292o == null) {
            f292o = new PropertyDefinitionRepository();
        }
        return f292o;
    }

    public static /* synthetic */ Integer p0(Map map, Map.Entry entry) {
        return (Integer) Optional.ofNullable((PropertyDefinition) map.get(((String) entry.getKey()).toLowerCase())).map(new Function() { // from class: o.mpd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((PropertyDefinition) obj).getDisplayOrder();
            }
        }).orElse(Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    public static /* synthetic */ boolean q0(String str) {
        return !StringUtils.isBlank(str);
    }

    public static /* synthetic */ boolean r0(String str, PropertyOptions propertyOptions) {
        return propertyOptions.getValue().equalsIgnoreCase(str) || propertyOptions.getViewValue().equalsIgnoreCase(str);
    }

    public static /* synthetic */ void s0(List list, List list2, final String str) {
        Stream map = list.stream().filter(new Predicate() { // from class: o.fqd
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PropertyDefinitionRepository.r0(str, (PropertyOptions) obj);
            }
        }).map(new Function() { // from class: o.gqd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((PropertyOptions) obj).getViewValue();
            }
        });
        Objects.requireNonNull(list2);
        map.forEach(new hqd(list2));
    }

    public static /* synthetic */ void t0(Map map, Map map2, Map map3, Map.Entry entry) {
        String str = (String) entry.getKey();
        String str2 = (String) Optional.ofNullable((PropertyDefinition) map.get(str.toLowerCase())).map(new Function() { // from class: o.npd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((PropertyDefinition) obj).getDisplayName();
            }
        }).orElse(th1.m49850b(th1.m49854f(str)));
        String str3 = (String) Optional.ofNullable((PropertyDefinition) map.get(str.toLowerCase())).map(new Function() { // from class: o.opd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((PropertyDefinition) obj).getScalarType();
            }
        }).orElse("text");
        if ("selection".equalsIgnoreCase(str3) || "option".equalsIgnoreCase(str3)) {
            final List<PropertyOptions> possibleValues = ((PropertyDefinition) map.get(str.toLowerCase())).getPossibleValues();
            List listM45236j = qe4.m45236j(map2.get(str));
            final ArrayList arrayList = new ArrayList();
            listM45236j.stream().map(new ppd()).filter(new Predicate() { // from class: o.qpd
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return PropertyDefinitionRepository.q0((String) obj);
                }
            }).forEach(new Consumer() { // from class: o.rpd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.s0(possibleValues, arrayList, (String) obj);
                }
            });
            map3.put(str2, pnd.m43910a(",", arrayList));
            return;
        }
        if (!str3.equalsIgnoreCase("number") || entry.getValue() == null) {
            map3.put(str2, entry.getValue());
        } else if (Number.class.isAssignableFrom(entry.getValue().getClass())) {
            map3.put(str2, new BigDecimal(String.valueOf(entry.getValue())).toPlainString());
        }
    }

    public static List t1() {
        ArrayList arrayList = new ArrayList();
        String simpleName = Account.class.getSimpleName();
        arrayList.add(l1("googleVerifiedCallingBrandId", "Text", "Google Verified Calling Brand Id", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("googleVerifiedCallingAgentId", "Text", "Google Verified Calling Agent Id", Collections.emptyList(), false, simpleName));
        return arrayList;
    }

    public static List u1() {
        ArrayList arrayList = new ArrayList();
        String simpleName = Business.class.getSimpleName();
        arrayList.add(l1("addresses", "Address", "Address", Collections.emptyList(), true, simpleName));
        arrayList.add(l1("website", "Text", "Business Website", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("industry", "Text", "Industry", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("name", "Text", "Name", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("userDefinedTags", "Text", "Tag", Collections.emptyList(), true, simpleName));
        return arrayList;
    }

    public static /* synthetic */ boolean v0(String str, PropertyDefinition propertyDefinition) {
        return str.equals(propertyDefinition.getId());
    }

    public static List v1() {
        ArrayList arrayList = new ArrayList();
        String simpleName = Contact.class.getSimpleName();
        arrayList.add(l1("addresses", "Address", "Address", Collections.emptyList(), true, simpleName));
        arrayList.add(l1("emails", "Emails", "Emails", Collections.emptyList(), true, simpleName));
        arrayList.add(l1("emails__email", "email", "Email Address", Collections.emptyList(), true, simpleName));
        arrayList.add(l1("addresses__city", "Text", "City", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("addresses__state", "Text", "State", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("contactNumberDetail__phoneNumber", "phoneNumber", "Phone Number", Collections.emptyList(), true, simpleName));
        arrayList.add(l1("callPriority", "Option", "Call Priority", Arrays.asList("HIGH", "VERY_HIGH", "LOW", "MEDIUM"), false, simpleName));
        arrayList.add(l1("businesses", "Business", "Business", Collections.emptyList(), true, simpleName));
        arrayList.add(l1("contactNumberDetail", "ContactNumberDetail", "Contact Number Detail", Collections.emptyList(), true, simpleName));
        arrayList.add(l1("contactStatus", "Option", "Contact Status", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("contactType", "Text", "Contact Type", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("name", "Text", "Name", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("contactSource", "Text", "Contact Source", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("department", "Text", "Department", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("designation", "Text", "Designation", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("gender", "Option", "Gender", Arrays.asList("TRANSGENDER", "FEMALE", "MALE"), false, simpleName));
        arrayList.add(l1("isDecisionMaker", "Boolean", "Is Decision Maker", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("preferredContactDays", "Day", "Preferred Contact Days", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("seniority", "Text", "Seniority", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("userDefinedTags", "Text", "Tag", Collections.emptyList(), true, simpleName));
        arrayList.add(m193Z());
        arrayList.add(m1("dealStage", "Option", "Deal Stage", m192Y(), false, simpleName));
        arrayList.add(n1("accountPriority", "Selection", "Priority", Arrays.asList(uyh.of(Priority.VERY_HIGH.name(), "Very High"), uyh.of(Priority.HIGH.name(), "High"), uyh.of(Priority.MEDIUM.name(), "Medium"), uyh.of(Priority.LOW.name(), "Low"), uyh.of(Priority.VERY_LOW.name(), "Very Low")), false, simpleName));
        return arrayList;
    }

    public static /* synthetic */ Optional w0(final String str, List list) {
        return list.stream().filter(new Predicate() { // from class: o.mod
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PropertyDefinitionRepository.v0(str, (PropertyDefinition) obj);
            }
        }).findFirst();
    }

    public static List w1() {
        ArrayList arrayList = new ArrayList();
        String simpleName = Engagement.class.getSimpleName();
        arrayList.add(l1("toBeAssigned", "Option", "To Be Assigned", Arrays.asList("ASSIGNED", "UNASSIGNED"), false, simpleName));
        arrayList.add(l1("syncStatus", "Text", "Sync Status", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("externalNumber", "Text", "External Number", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("userNumber", "Text", "User Number", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("callDirection", "Option", "Call Direction", Arrays.asList("INCOMING", "OUTGOING"), false, simpleName));
        arrayList.add(l1("callConnectStatus", "Option", "Call Connect Status", Arrays.asList("CONNECTED", "NOT_CONNECTED"), false, simpleName));
        arrayList.add(l1("callStartTime", "Datetime", "Call Start Time", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("callEndTime", "Datetime", "Call End Time", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("noteHeading", "Text", "Note Heading", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("body", "Text", "Task Body", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("taskHeading", "Text", "Task Heading", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("taskActivityType", "Option", "Task Activity Type", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("taskInputNote", "Text", "Task Input Note", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("taskCompletionNote", "Text", "Task Completion Note", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("taskCompletionTime", "Datetime", "Reminder Date Time", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("dueDateTime", "Datetime", "Reminder Date Time", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("reminderDateTime", "Datetime", "Reminder Date Time", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("visitTime", "Datetime", "Visit Time", Collections.emptyList(), false, simpleName));
        arrayList.add(l1("visitNote", "Text", "Visit Note", Collections.emptyList(), false, simpleName));
        arrayList.add(m1("callOutcome", "Option", "Call Outcome", m190W(), false, simpleName));
        arrayList.add(m1("unconnectedCallOutcome", "Option", "Call Outcome", c0(), false, simpleName));
        arrayList.add(m1("taskType", "Option", "Task Type", b0(), false, simpleName));
        arrayList.add(m1("chatLabel", "Option", "Chat Label", m191X(), false, simpleName));
        return arrayList;
    }

    public static PropertyDefinition x1(CustomPropertyDefinitions customPropertyDefinitions) {
        PropertyDefinition propertyDefinition = new PropertyDefinition();
        Optional.ofNullable(customPropertyDefinitions.getPropertyName()).ifPresent(new tpd(propertyDefinition));
        Optional.ofNullable(customPropertyDefinitions.getIsSystemProperty()).ifPresent(new vpd(propertyDefinition));
        Optional.ofNullable(customPropertyDefinitions.getAccountId()).ifPresent(new wpd(propertyDefinition));
        Optional.ofNullable(customPropertyDefinitions.getDescription()).ifPresent(new xpd(propertyDefinition));
        Optional.ofNullable(customPropertyDefinitions.getId()).ifPresent(new ypd(propertyDefinition));
        Optional.ofNullable(customPropertyDefinitions.getDisplayName()).ifPresent(new zpd(propertyDefinition));
        Optional.ofNullable(customPropertyDefinitions.getDisplayOrder()).ifPresent(new aqd(propertyDefinition));
        Optional.ofNullable(customPropertyDefinitions.getParentObjectType()).ifPresent(new bqd(propertyDefinition));
        propertyDefinition.setPossibleValues((List) ((List) Optional.ofNullable(customPropertyDefinitions.getPossibleValues()).orElse(Collections.emptyList())).stream().map(new cqd()).collect(Collectors.toList()));
        Optional.ofNullable(customPropertyDefinitions.getScalarType()).ifPresent(new eqd(propertyDefinition));
        Optional.ofNullable(customPropertyDefinitions.getIsMultiple()).ifPresent(new upd(propertyDefinition));
        return propertyDefinition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x8c y0(final String str, Optional optional) {
        return (x8c) optional.map(new Function() { // from class: o.hod
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x6c.c0((PropertyDefinition) obj);
            }
        }).orElseGet(new Supplier() { // from class: o.iod
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f29042a.x0(str);
            }
        });
    }

    public static List y1(List list) {
        return (List) list.stream().map(new snd()).collect(Collectors.toList());
    }

    /* renamed from: T */
    public final synchronized List m220T(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PropertyDefinition propertyDefinition = (PropertyDefinition) it.next();
            if (!map.containsKey(propertyDefinition.getParentObjectType().toLowerCase())) {
                map.put(propertyDefinition.getParentObjectType().toLowerCase(), new HashMap());
            }
            ((Map) map.get(propertyDefinition.getParentObjectType().toLowerCase())).put(propertyDefinition.getPropertyName(), propertyDefinition);
        }
        this.f297e = (Map) map.getOrDefault(f288k.toLowerCase(), new HashMap());
        this.f299g = (Map) map.getOrDefault(f290m.toLowerCase(), new HashMap());
        this.f298f = (Map) map.getOrDefault(f289l.toLowerCase(), new HashMap());
        this.f300h = (Map) map.getOrDefault(f291n.toLowerCase(), new HashMap());
        return list;
    }

    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final Map b1(final Map map, final Map map2) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        ((List) map.entrySet().stream().sorted(Comparator.comparing(new Function() { // from class: o.fpd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PropertyDefinitionRepository.p0(map2, (Map.Entry) obj);
            }
        })).collect(Collectors.toList())).forEach(new Consumer() { // from class: o.gpd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PropertyDefinitionRepository.t0(map2, map, linkedHashMap, (Map.Entry) obj);
            }
        });
        return linkedHashMap;
    }

    /* renamed from: V */
    public void m222V() {
        Optional.ofNullable(this.f296d).ifPresent(new dpd());
        TemplateVariable.Companion.reset();
        this.f293a = null;
        this.f295c = null;
        this.f296d = null;
        this.f302j = null;
        r1();
    }

    /* renamed from: h1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public synchronized x6c z0() {
        if (Optional.ofNullable(this.f301i).isPresent()) {
            return x6c.c0(this.f301i);
        }
        final List listV1 = v1();
        final List listT1 = t1();
        final List listW1 = w1();
        final List listU1 = u1();
        return x6c.m55700X(Optional.ofNullable(this.f293a)).m55717M(new rl7() { // from class: o.kod
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f32508a.M0(listV1, listT1, listW1, listU1, (l1) obj);
            }
        });
    }

    public x6c i1() {
        return (x6c) Optional.ofNullable(this.f297e).filter(new Predicate() { // from class: o.qnd
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PropertyDefinitionRepository.N0((Map) obj);
            }
        }).map(new jqd()).orElseGet(new Supplier() { // from class: o.rnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f43862a.P0();
            }
        });
    }

    public synchronized ss9 j0() {
        if (this.f302j == null) {
            this.f302j = new ss9(this);
        }
        return this.f302j;
    }

    public x6c j1() {
        return (x6c) Optional.ofNullable(this.f299g).filter(new Predicate() { // from class: o.iqd
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PropertyDefinitionRepository.Q0((Map) obj);
            }
        }).map(new jqd()).orElseGet(new Supplier() { // from class: o.kqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f32544a.S0();
            }
        });
    }

    public x6c k0(String str, final String str2) {
        return ((x6c) Optional.ofNullable(this.f301i).map(new aod()).orElseGet(new Supplier() { // from class: o.lod
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f34170a.u0();
            }
        })).d0(new rl7() { // from class: o.wod
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return PropertyDefinitionRepository.w0(str2, (List) obj);
            }
        }).m55717M(new rl7() { // from class: o.hpd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f27347a.y0(str2, (Optional) obj);
            }
        });
    }

    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public final x6c x0(String str) {
        return swd.m48993Z(str).d0(new rl7() { // from class: o.sod
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f45712a.X0((PropertyDefinition) obj);
            }
        });
    }

    public x6c l0(final String str, final String str2) {
        return ((x6c) Optional.ofNullable(this.f301i).map(new aod()).orElseGet(new Supplier() { // from class: o.spd
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f45736a.z0();
            }
        })).d0(new rl7() { // from class: o.dqd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return PropertyDefinitionRepository.B0(str, str2, (List) obj);
            }
        });
    }

    public final void m0(final PropertyDefinition propertyDefinition) {
        String parentObjectType = propertyDefinition.getParentObjectType();
        if (r6c.m46255a(parentObjectType, f288k)) {
            Optional.ofNullable(this.f297e).ifPresent(new Consumer() { // from class: o.xnd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.F0(propertyDefinition, (Map) obj);
                }
            });
        }
        if (r6c.m46255a(parentObjectType, f289l)) {
            Optional.ofNullable(this.f298f).ifPresent(new Consumer() { // from class: o.ynd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.C0(propertyDefinition, (Map) obj);
                }
            });
        }
        if (r6c.m46255a(parentObjectType, f290m)) {
            Optional.ofNullable(this.f299g).ifPresent(new Consumer() { // from class: o.znd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.D0(propertyDefinition, (Map) obj);
                }
            });
        }
        if (r6c.m46255a(parentObjectType, f291n)) {
            Optional.ofNullable(this.f300h).ifPresent(new Consumer() { // from class: o.bod
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.E0(propertyDefinition, (Map) obj);
                }
            });
        }
        if ("leadLifecycleName".equals(propertyDefinition.getPropertyName())) {
            this.f302j.m48866i(null);
        }
    }

    public final void n0(final PropertyDefinition propertyDefinition) {
        String parentObjectType = propertyDefinition.getParentObjectType();
        Optional.ofNullable(this.f301i).ifPresent(new Consumer() { // from class: o.cod
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((List) obj).add(propertyDefinition);
            }
        });
        if (r6c.m46255a(parentObjectType, f288k)) {
            Optional.ofNullable(this.f297e).ifPresent(new Consumer() { // from class: o.dod
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.H0(propertyDefinition, (Map) obj);
                }
            });
        }
        if (r6c.m46255a(parentObjectType, f289l)) {
            Optional.ofNullable(this.f298f).ifPresent(new Consumer() { // from class: o.eod
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.I0(propertyDefinition, (Map) obj);
                }
            });
        }
        if (r6c.m46255a(parentObjectType, f290m)) {
            Optional.ofNullable(this.f299g).ifPresent(new Consumer() { // from class: o.fod
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.J0(propertyDefinition, (Map) obj);
                }
            });
        }
        if (r6c.m46255a(parentObjectType, f291n)) {
            Optional.ofNullable(this.f300h).ifPresent(new Consumer() { // from class: o.god
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PropertyDefinitionRepository.K0(propertyDefinition, (Map) obj);
                }
            });
        }
        if ("leadLifecycleName".equals(propertyDefinition.getPropertyName())) {
            this.f302j.m48866i(propertyDefinition);
        }
    }

    public synchronized x6c o1(final Map map) {
        return z0().m55717M(new tod()).m55733m(new HashMap(), new eh1() { // from class: o.uod
            @Override // p001o.eh1
            public final void accept(Object obj, Object obj2) {
                PropertyDefinitionRepository.a1((HashMap) obj, (PropertyDefinition) obj2);
            }
        }).m55027y().d0(new rl7() { // from class: o.vod
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f50670a.b1(map, (HashMap) obj);
            }
        });
    }

    public synchronized x6c p1(String str) {
        return q1((Map) ja8.f30035c.fromJson(str, new TypeToken<Map<String, Object>>() { // from class: ai.salesmax.custom.PropertyDefinitionRepository.1
        }.getType()));
    }

    public synchronized x6c q1(Map map) {
        x6c x6cVarO1;
        final Gson gson;
        x6cVarO1 = o1(map);
        gson = ja8.f30035c;
        Objects.requireNonNull(gson);
        return x6cVarO1.d0(new rl7() { // from class: o.jod
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gson.toJson((Map) obj);
            }
        });
    }

    public void r1() {
        this.f297e = null;
        this.f298f = null;
        this.f299g = null;
        this.f300h = null;
        this.f301i = null;
        this.f302j = new ss9(this);
        swd.m48988U(null);
    }

    public void s1(l1 l1Var) {
        if (this.f293a == l1Var) {
            return;
        }
        m222V();
        this.f293a = l1Var;
        this.f294b.postValue(l1Var);
        cz4 cz4Var = new cz4(this.f294b);
        this.f295c = cz4Var;
        this.f296d = cz4Var.S2(this.f293a, new snd(), new Runnable() { // from class: o.tnd
            @Override // java.lang.Runnable
            public final void run() {
                PropertyDefinitionRepository.c1();
            }
        }, new Runnable() { // from class: o.und
            @Override // java.lang.Runnable
            public final void run() {
                PropertyDefinitionRepository.d1();
            }
        }).v0(new gu3() { // from class: o.vnd
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f50598a.e1((SubscriptionNotificationEvent) obj);
            }
        }, new gu3() { // from class: o.wnd
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f52397a.f1((Throwable) obj);
            }
        });
        this.f302j = new ss9(this);
    }
}
