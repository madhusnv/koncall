package ai.salesmax.model;

import ai.salesmax.model.LeadsDeal;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.Deal;
import com.amplifyframework.datastore.generated.model.DealAssociation;
import com.amplifyframework.datastore.generated.model.DealOutcome;
import com.amplifyframework.datastore.generated.model.DealStageCustomValues;
import com.amplifyframework.datastore.generated.model.DealState;
import com.amplifyframework.datastore.generated.model.ProductServiceUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import p001o.a81;
import p001o.azh;
import p001o.ch3;
import p001o.dh3;
import p001o.id5;
import p001o.ja8;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsDeal {
    private Leads _associatedContact;
    private String contactId;
    private String formId;
    private boolean isCloudTelephonyEnabled;
    private Long nextFollowupOn;
    private String taskAssigneeTeamId;
    private String taskAssigneeUserId;
    private String taskBody;
    private Boolean transferLead;
    private Deal underlyingDeal;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Deal newInstance() {
            Deal dealBuild = Deal.builder().accountId("").id("").build();
            sq8.m48648g(dealBuild, "build(...)");
            return dealBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LeadsDeal() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_leads_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Contact _get_leads_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Contact) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsSummary _get_leads_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsSummary) xk7Var.invoke(obj);
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getCurrency() {
        return this.underlyingDeal.getCurrency();
    }

    public final String getCustomDealData() {
        return this.underlyingDeal.getCustomDealData();
    }

    public final Double getDealAmount() {
        return this.underlyingDeal.getAmount();
    }

    public final String getDealLostReason() {
        return this.underlyingDeal.getDealLostReason();
    }

    public final String getDealOutcome() {
        DealOutcome dealOutcome = this.underlyingDeal.getDealOutcome();
        if (dealOutcome != null) {
            return dealOutcome.name();
        }
        return null;
    }

    public final List<DealStageCustomValues> getDealStageCustomValues() {
        return this.underlyingDeal.getDealStageCustomValues();
    }

    public final long getDealStageUpdated() {
        Long lM16645F = a81.m16645F(this.underlyingDeal.getDealStageUpdatedAt());
        sq8.m48648g(lM16645F, "toEpochMillis(...)");
        return lM16645F.longValue();
    }

    public final List<ProductServiceUnit> getDealUnits() {
        List<ProductServiceUnit> units = this.underlyingDeal.getUnits();
        return units == null ? ch3.m21246k() : units;
    }

    public final String getDescription() {
        return this.underlyingDeal.getDescription();
    }

    public final String getFormId() {
        return this.formId;
    }

    public final String getId() {
        return this.underlyingDeal.getId();
    }

    public final String getLastActivity() {
        return this.underlyingDeal.getLastActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Leads getLeads() {
        Leads leads = this._associatedContact;
        if (leads != null) {
            sq8.m48646e(leads);
            return leads;
        }
        Stream<DealAssociation> stream = this.underlyingDeal.getAssociations().stream();
        final LeadsDeal$leads$1 leadsDeal$leads$1 = LeadsDeal$leads$1.INSTANCE;
        Optional<DealAssociation> optionalFindAny = stream.filter(new Predicate() { // from class: o.wz9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeadsDeal._get_leads_$lambda$0(leadsDeal$leads$1, obj);
            }
        }).findAny();
        final LeadsDeal$leads$2 leadsDeal$leads$2 = LeadsDeal$leads$2.INSTANCE;
        Optional<U> map = optionalFindAny.map(new Function() { // from class: o.xz9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsDeal._get_leads_$lambda$1(leadsDeal$leads$2, obj);
            }
        });
        final LeadsDeal$leads$3 leadsDeal$leads$3 = LeadsDeal$leads$3.INSTANCE;
        Leads leads2 = ((LeadsSummary) map.map(new Function() { // from class: o.yz9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsDeal._get_leads_$lambda$2(leadsDeal$leads$3, obj);
            }
        }).orElse(new LeadsSummary(null, 1, 0 == true ? 1 : 0))).toLeads();
        this._associatedContact = leads2;
        sq8.m48646e(leads2);
        return leads2;
    }

    public final String getName() {
        return this.underlyingDeal.getName();
    }

    public final Long getNextFollowupOn() {
        return this.nextFollowupOn;
    }

    public final List<RecentAction> getRecentEngagements() {
        List<String> recentEngagements = this.underlyingDeal.getRecentEngagements();
        if (recentEngagements == null) {
            recentEngagements = ch3.m21246k();
        }
        ArrayList arrayList = new ArrayList(dh3.m23088v(recentEngagements, 10));
        Iterator<T> it = recentEngagements.iterator();
        while (it.hasNext()) {
            arrayList.add((RecentAction) ja8.f30035c.fromJson((String) it.next(), RecentAction.class));
        }
        return arrayList;
    }

    public final String getStage() {
        return this.underlyingDeal.getDealStage();
    }

    public final String getState() {
        DealState dealState = this.underlyingDeal.getDealState();
        if (dealState != null) {
            return dealState.name();
        }
        return null;
    }

    public final String getTaskAssigneeTeamId() {
        return this.taskAssigneeTeamId;
    }

    public final String getTaskAssigneeUserId() {
        return this.taskAssigneeUserId;
    }

    public final String getTaskBody() {
        return this.taskBody;
    }

    public final Boolean getTransferLead() {
        return this.transferLead;
    }

    public final Deal getUnderlyingDeal() {
        return this.underlyingDeal;
    }

    public final Leads get_associatedContact() {
        return this._associatedContact;
    }

    public final boolean isCloudTelephonyEnabled() {
        return this.isCloudTelephonyEnabled;
    }

    public final void setCloudTelephonyEnabled(boolean z) {
        this.isCloudTelephonyEnabled = z;
    }

    public final void setContactId(String str) {
        this.contactId = str;
    }

    public final void setCurrency(String str) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().currency(str).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setCustomDealData(String str) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().customDealData(str).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setDealAmount(Double d) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().amount(d).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setDealLostReason(String str) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().dealLostReason(str).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setDealOutcome(String str) {
        if (str != null) {
            Deal dealBuild = this.underlyingDeal.copyOfBuilder().dealOutcome(DealOutcome.valueOf(str)).build();
            sq8.m48648g(dealBuild, "build(...)");
            this.underlyingDeal = dealBuild;
        }
    }

    public final void setDealStageCustomValues(List<DealStageCustomValues> list) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().dealStageCustomValues(list).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setDealStageUpdated(long j) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().dealStageUpdatedAt(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setDealUnits(List<ProductServiceUnit> list) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().units(list).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setDescription(String str) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().description(str).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setFormId(String str) {
        this.formId = str;
    }

    public final void setId(String str) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().id(str).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setName(String str) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().name(str).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setNextFollowupOn(Long l) {
        this.nextFollowupOn = l;
    }

    public final void setRecentEngagements(List<RecentAction> list) {
        Deal.CopyOfBuilder copyOfBuilder = this.underlyingDeal.copyOfBuilder();
        sq8.m48647f(list, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
        Deal dealBuild = copyOfBuilder.recentEngagements(azh.m18050c(list)).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setStage(String str) {
        Deal dealBuild = this.underlyingDeal.copyOfBuilder().dealStage(str).build();
        sq8.m48648g(dealBuild, "build(...)");
        this.underlyingDeal = dealBuild;
    }

    public final void setState(String str) {
        if (str != null) {
            Deal dealBuild = this.underlyingDeal.copyOfBuilder().dealState(DealState.valueOf(str)).build();
            sq8.m48648g(dealBuild, "build(...)");
            this.underlyingDeal = dealBuild;
        }
    }

    public final void setTaskAssigneeTeamId(String str) {
        this.taskAssigneeTeamId = str;
    }

    public final void setTaskAssigneeUserId(String str) {
        this.taskAssigneeUserId = str;
    }

    public final void setTaskBody(String str) {
        this.taskBody = str;
    }

    public final void setTransferLead(Boolean bool) {
        this.transferLead = bool;
    }

    public final void setUnderlyingDeal(Deal deal) {
        sq8.m48649h(deal, "<set-?>");
        this.underlyingDeal = deal;
    }

    public final void set_associatedContact(Leads leads) {
        this._associatedContact = leads;
    }

    public LeadsDeal(Deal deal) {
        sq8.m48649h(deal, "underlyingDeal");
        this.underlyingDeal = deal;
    }

    public /* synthetic */ LeadsDeal(Deal deal, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : deal);
    }
}
