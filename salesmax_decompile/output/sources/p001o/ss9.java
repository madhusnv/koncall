package p001o;

import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.PropertyDefinition;
import ai.salesmax.model.PropertyOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import type.LeadLifecycleStage;

/* loaded from: classes.dex */
public class ss9 {

    /* renamed from: a */
    public PropertyDefinitionRepository f45865a;

    /* renamed from: b */
    public Map f45866b = null;

    /* renamed from: c */
    public Map f45867c = null;

    /* renamed from: d */
    public Map f45868d = null;

    /* renamed from: e */
    public Map f45869e = null;

    /* renamed from: f */
    public qif f45870f;

    /* renamed from: o.ss9$a */
    public static /* synthetic */ class C16908a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45871a;

        static {
            int[] iArr = new int[LeadLifecycleStage.values().length];
            f45871a = iArr;
            try {
                iArr[LeadLifecycleStage.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45871a[LeadLifecycleStage.OPPORTUNITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45871a[LeadLifecycleStage.PROSPECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45871a[LeadLifecycleStage.UNCONTACTED_NEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45871a[LeadLifecycleStage.UNCONTACTED_RECHURNED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ss9(PropertyDefinitionRepository propertyDefinitionRepository) {
        this.f45870f = null;
        this.f45865a = propertyDefinitionRepository;
        this.f45870f = qif.m45520F();
        m48865h();
        propertyDefinitionRepository.l0(PropertyDefinitionRepository.f288k, "leadLifecycleName").w0(new gu3() { // from class: o.ms9
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f35912a.m48860m((Optional) obj);
            }
        }, new gu3() { // from class: o.ns9
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f37238a.m48861n((Throwable) obj);
            }
        }, new jm() { // from class: o.os9
            @Override // p001o.jm
            public final void run() {
                this.f38824a.m48862o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m48859l(PropertyDefinition propertyDefinition) {
        propertyDefinition.getPossibleValues().forEach(new Consumer() { // from class: o.rs9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f44024a.m48867j((PropertyOptions) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m48860m(Optional optional) {
        optional.ifPresent(new Consumer() { // from class: o.ps9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f40503a.m48866i((PropertyDefinition) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m48861n(Throwable th) {
        this.f45870f.mo43035B(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m48862o() {
        this.f45870f.mo43035B(Boolean.TRUE);
    }

    /* renamed from: f */
    public String m48863f(String str) {
        return !this.f45868d.containsKey(str) ? (String) this.f45866b.getOrDefault(str, str) : (String) this.f45868d.getOrDefault(str, str);
    }

    /* renamed from: g */
    public String m48864g(String str) {
        LeadLifecycleStage leadLifecycleStageValueOf = LeadLifecycleStage.valueOf(str);
        if (!this.f45868d.containsKey(str)) {
            int i = C16908a.f45871a[leadLifecycleStageValueOf.ordinal()];
            if (i == 1) {
                return "Closed";
            }
            if (i == 2) {
                return "Opportunity";
            }
            if (i == 3) {
                return "Prospecting";
            }
            if (i == 4) {
                return "New";
            }
            if (i == 5) {
                return "Renewed";
            }
        }
        return (String) this.f45868d.getOrDefault(str, str);
    }

    /* renamed from: h */
    public final void m48865h() {
        this.f45868d = new HashMap();
        this.f45869e = new HashMap();
        this.f45866b = new HashMap();
        this.f45867c = new HashMap();
        Map map = this.f45866b;
        LeadLifecycleStage leadLifecycleStage = LeadLifecycleStage.CLOSED;
        map.put(leadLifecycleStage.name(), "Closed");
        this.f45867c.put("Closed", leadLifecycleStage.name());
        Map map2 = this.f45866b;
        LeadLifecycleStage leadLifecycleStage2 = LeadLifecycleStage.OPPORTUNITY;
        map2.put(leadLifecycleStage2.name(), "Deal");
        this.f45867c.put("Deal", leadLifecycleStage2.name());
        Map map3 = this.f45866b;
        LeadLifecycleStage leadLifecycleStage3 = LeadLifecycleStage.PROSPECTING;
        map3.put(leadLifecycleStage3.name(), "Prospect");
        this.f45867c.put("Prospect", leadLifecycleStage3.name());
        Map map4 = this.f45866b;
        LeadLifecycleStage leadLifecycleStage4 = LeadLifecycleStage.UNCONTACTED_NEW;
        map4.put(leadLifecycleStage4.name(), "New Contact");
        this.f45867c.put("New Contact", leadLifecycleStage4.name());
        Map map5 = this.f45866b;
        LeadLifecycleStage leadLifecycleStage5 = LeadLifecycleStage.UNCONTACTED_RECHURNED;
        map5.put(leadLifecycleStage5.name(), "Renewed Contact");
        this.f45867c.put("Renewed Contact", leadLifecycleStage5.name());
    }

    /* renamed from: i */
    public synchronized void m48866i(PropertyDefinition propertyDefinition) {
        m48869p();
        Optional.ofNullable(propertyDefinition).ifPresent(new Consumer() { // from class: o.qs9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f42367a.m48859l((PropertyDefinition) obj);
            }
        });
    }

    /* renamed from: j */
    public final void m48867j(PropertyOptions propertyOptions) {
        this.f45868d.put(propertyOptions.getValue(), propertyOptions.getViewValue());
        this.f45868d.put(propertyOptions.getViewValue(), propertyOptions.getValue());
    }

    /* renamed from: k */
    public x6c m48868k() {
        return x6c.m55698V(this.f45870f);
    }

    /* renamed from: p */
    public final void m48869p() {
        this.f45868d.clear();
        this.f45869e.clear();
        if (this.f45870f == null) {
            this.f45870f = qif.m45520F();
        }
    }
}
