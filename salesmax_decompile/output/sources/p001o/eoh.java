package p001o;

import ai.salesmax.model.TodoFilter;
import com.amplifyframework.datastore.generated.model.EngagementStatus;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import type.ContactAssignmentStatus;
import type.EngagementType;
import type.SearchableEngagementFilterInput;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public class eoh extends e07 {

    /* renamed from: h */
    public static Map f22003h;

    /* renamed from: i */
    public static Map f22004i;

    /* renamed from: f */
    public TodoFilter f22005f = new TodoFilter();

    /* renamed from: g */
    public Optional f22006g = Optional.empty();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f22003h = linkedHashMap;
        linkedHashMap.put("Call", EngagementType.CALL);
        f22003h.put("Email", EngagementType.EMAIL);
        f22003h.put("Visit", EngagementType.VISIT);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        f22004i = linkedHashMap2;
        linkedHashMap2.put("Tasks Getting Due Today", "Due Today");
        f22004i.put("Pending Follow-ups", "Pending Follow Ups");
        f22004i.put("Overdue Tasks", "Overdue");
        f22004i.put("All Open Tasks", "All Open Tasks");
        f22004i.put("Upcoming Tasks", "Upcoming");
        f22004i.put("Completed Tasks", "Completed");
        f22004i.put("Unassigned Tasks", "Unassigned");
    }

    /* renamed from: j */
    public static SearchableEngagementFilterInput.Builder m25395j(SearchableEngagementFilterInput.Builder builder, String str) {
        String strM16653h;
        String strM16653h2;
        strM16653h = a81.m16653h(Long.valueOf(a81.m16664s()));
        a81.m16653h(Long.valueOf(System.currentTimeMillis()));
        strM16653h2 = a81.m16653h(Long.valueOf(a81.m16660o()));
        String str2 = (String) f22004i.getOrDefault(str, str);
        str2.hashCode();
        switch (str2) {
            case "Unassigned":
                return builder.engagementType(SearchableStringFilterInput.builder().eq(EngagementType.TASK.name()).build()).toBeAssigned(SearchableStringFilterInput.builder().eq(ContactAssignmentStatus.UNASSIGNED.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(EngagementStatus.ACTIVE.name()).build());
            case "Pending Call Note":
                return builder.engagementType(SearchableStringFilterInput.builder().eq(EngagementType.CALL.name()).build()).callOutcome(SearchableStringFilterInput.builder().exists(Boolean.FALSE).build());
            case "Due Today":
                SearchableEngagementFilterInput.Builder builder2 = SearchableEngagementFilterInput.builder();
                SearchableStringFilterInput.Builder builder3 = SearchableStringFilterInput.builder();
                EngagementType engagementType = EngagementType.TASK;
                SearchableEngagementFilterInput.Builder builderEngagementType = builder2.engagementType(builder3.eq(engagementType.name()).build());
                SearchableStringFilterInput.Builder builder4 = SearchableStringFilterInput.builder();
                EngagementStatus engagementStatus = EngagementStatus.ACTIVE;
                return builder.or(Arrays.asList(SearchableEngagementFilterInput.builder().and(Arrays.asList(builderEngagementType.engagementStatus(builder4.eq(engagementStatus.name()).build()).dueDateTime(SearchableStringFilterInput.builder().gt(strM16653h).build()).build(), SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus.name()).build()).dueDateTime(SearchableStringFilterInput.builder().lt(strM16653h2).build()).build(), SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().exists(Boolean.FALSE).build()).build())).build(), SearchableEngagementFilterInput.builder().and(Arrays.asList(SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().gt(strM16653h).build()).build(), SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().lt(strM16653h2).build()).build(), SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().exists(Boolean.TRUE).build()).build())).build())).engagementType(SearchableStringFilterInput.builder().eq(engagementType.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus.name()).build());
            case "Pending Follow Ups":
                return builder.engagementType(SearchableStringFilterInput.builder().eq(EngagementType.TASK.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(EngagementStatus.ACTIVE.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().lte(a81.m16653h(Long.valueOf(a81.m16660o()))).build());
            case "Pending Visit Note":
                return builder.engagementType(SearchableStringFilterInput.builder().eq(EngagementType.VISIT.name()).build()).visitOutcome(SearchableStringFilterInput.builder().exists(Boolean.FALSE).build());
            case "Overdue":
                SearchableEngagementFilterInput.Builder builder5 = SearchableEngagementFilterInput.builder();
                SearchableStringFilterInput.Builder builder6 = SearchableStringFilterInput.builder();
                EngagementType engagementType2 = EngagementType.TASK;
                SearchableEngagementFilterInput.Builder builderEngagementType2 = builder5.engagementType(builder6.eq(engagementType2.name()).build());
                SearchableStringFilterInput.Builder builder7 = SearchableStringFilterInput.builder();
                EngagementStatus engagementStatus2 = EngagementStatus.ACTIVE;
                return builder.or(Arrays.asList(SearchableEngagementFilterInput.builder().and(Arrays.asList(builderEngagementType2.engagementStatus(builder7.eq(engagementStatus2.name()).build()).dueDateTime(SearchableStringFilterInput.builder().lt(strM16653h).build()).build(), SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType2.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus2.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().exists(Boolean.FALSE).build()).build())).build(), SearchableEngagementFilterInput.builder().and(Arrays.asList(SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType2.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus2.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().lt(strM16653h).build()).build(), SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType2.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus2.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().exists(Boolean.TRUE).build()).build())).build())).engagementType(SearchableStringFilterInput.builder().eq(engagementType2.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus2.name()).build());
            case "Completed":
                return builder.engagementType(SearchableStringFilterInput.builder().eq(EngagementType.TASK.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(EngagementStatus.COMPLETED.name()).build());
            case "Upcoming":
                SearchableEngagementFilterInput.Builder builder8 = SearchableEngagementFilterInput.builder();
                SearchableStringFilterInput.Builder builder9 = SearchableStringFilterInput.builder();
                EngagementType engagementType3 = EngagementType.TASK;
                SearchableEngagementFilterInput.Builder builderEngagementType3 = builder8.engagementType(builder9.eq(engagementType3.name()).build());
                SearchableStringFilterInput.Builder builder10 = SearchableStringFilterInput.builder();
                EngagementStatus engagementStatus3 = EngagementStatus.ACTIVE;
                return builder.or(Arrays.asList(SearchableEngagementFilterInput.builder().and(Arrays.asList(builderEngagementType3.engagementStatus(builder10.eq(engagementStatus3.name()).build()).dueDateTime(SearchableStringFilterInput.builder().gt(strM16653h2).build()).build(), SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType3.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus3.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().exists(Boolean.FALSE).build()).build())).build(), SearchableEngagementFilterInput.builder().and(Arrays.asList(SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType3.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus3.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().gt(strM16653h2).build()).build(), SearchableEngagementFilterInput.builder().engagementType(SearchableStringFilterInput.builder().eq(engagementType3.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus3.name()).build()).nextFollowUpOn(SearchableStringFilterInput.builder().exists(Boolean.TRUE).build()).build())).build())).engagementType(SearchableStringFilterInput.builder().eq(engagementType3.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(engagementStatus3.name()).build());
            default:
                return builder.engagementType(SearchableStringFilterInput.builder().eq(EngagementType.TASK.name()).build()).engagementStatus(SearchableStringFilterInput.builder().eq(EngagementStatus.ACTIVE.name()).build());
        }
    }

    /* renamed from: k */
    public static SearchableEngagementFilterInput.Builder m25396k(SearchableEngagementFilterInput.Builder builder, String str) {
        if (!f22003h.containsKey(str)) {
            return builder;
        }
        return builder.taskActivityType(SearchableStringFilterInput.builder().eq(((EngagementType) f22003h.get(str)).name()).build());
    }

    /* renamed from: l */
    public static Collection m25397l() {
        return f22004i.keySet();
    }

    /* renamed from: q */
    public static /* synthetic */ boolean m25398q(String str) {
        return !"Due Today".equals(str);
    }

    @Override // p001o.e07
    /* renamed from: f */
    public boolean mo24031f() {
        return super.mo24031f() && m25402p() && this.f22005f.isEmpty();
    }

    /* renamed from: m */
    public Optional m25399m() {
        List list = (List) this.f20702a.orElse(Collections.emptyList());
        return list.size() > 0 ? Optional.of(list) : Optional.empty();
    }

    /* renamed from: n */
    public Optional m25400n() {
        return Optional.of((String) this.f22006g.orElse("Due Today"));
    }

    /* renamed from: o */
    public TodoFilter m25401o() {
        return this.f22005f;
    }

    /* renamed from: p */
    public boolean m25402p() {
        return !this.f22006g.filter(new Predicate() { // from class: o.doh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return eoh.m25398q((String) obj);
            }
        }).isPresent();
    }

    /* renamed from: r */
    public void m25403r(String str) {
        if (!f22004i.containsKey(str) || "Due Today".equals(str)) {
            this.f22006g = Optional.empty();
        } else {
            this.f22006g = Optional.ofNullable(str);
        }
    }

    /* renamed from: s */
    public void m25404s(TodoFilter todoFilter) {
        this.f22005f = todoFilter;
    }
}
