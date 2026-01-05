package ai.salesmax.model;

import ai.salesmax.model.MissedOpportunitiesSummary;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.MissedOpportunities;
import com.amplifyframework.datastore.generated.model.MissedOpportunityType;
import java.util.Optional;
import java.util.function.Function;
import p001o.a81;
import p001o.f9g;
import p001o.id5;
import p001o.jm7;
import p001o.lpi;
import p001o.sq8;
import p001o.th1;
import p001o.xk7;

/* loaded from: classes.dex */
public final class MissedOpportunitiesSummary {
    private MissedOpportunities underlyingMissedOpportunity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final MissedOpportunities newInstance() {
            MissedOpportunities missedOpportunitiesBuild = MissedOpportunities.builder().accountId("").ownerId("").missedOpportunityType(MissedOpportunityType.CALL_NOT_ANSWERED).id("").build();
            sq8.m48648g(missedOpportunitiesBuild, "build(...)");
            return missedOpportunitiesBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MissedOpportunitiesSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_engagementId_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EngagementSummary _get_engagementSummary_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (EngagementSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsSummary _get_leadsSummary_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_owner_$lambda$7(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        String accountId = this.underlyingMissedOpportunity.getAccountId();
        sq8.m48648g(accountId, "getAccountId(...)");
        return accountId;
    }

    public final Long getCallLaterDateTime() {
        Temporal.DateTime callLaterDateTime = this.underlyingMissedOpportunity.getCallLaterDateTime();
        if (callLaterDateTime != null) {
            return a81.m16645F(callLaterDateTime);
        }
        return null;
    }

    public final String getClientDesignation() {
        LeadsSummary leadsSummary = getLeadsSummary();
        String designation = leadsSummary != null ? leadsSummary.getDesignation() : null;
        return designation == null ? "" : designation;
    }

    public final String getClientName() {
        LeadsSummary leadsSummary = getLeadsSummary();
        if (leadsSummary != null) {
            return leadsSummary.getName();
        }
        return null;
    }

    public final String getClientProfilePic() {
        LeadsSummary leadsSummary = getLeadsSummary();
        if (leadsSummary != null) {
            return leadsSummary.getProfilePicURL();
        }
        return null;
    }

    public final String getContactId() {
        String id = this.underlyingMissedOpportunity.getContact().getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final long getCreatedAt() {
        Long lM16645F = a81.m16645F(this.underlyingMissedOpportunity.getCreatedAt());
        sq8.m48648g(lM16645F, "toEpochMillis(...)");
        return lM16645F.longValue();
    }

    public final String getEngagementId() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingMissedOpportunity.getRelatedEngagement());
        final MissedOpportunitiesSummary$engagementId$1 missedOpportunitiesSummary$engagementId$1 = MissedOpportunitiesSummary$engagementId$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.efb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MissedOpportunitiesSummary._get_engagementId_$lambda$3(missedOpportunitiesSummary$engagementId$1, obj);
            }
        }).orElse(null);
    }

    public final EngagementSummary getEngagementSummary() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingMissedOpportunity.getRelatedEngagement());
        final MissedOpportunitiesSummary$engagementSummary$1 missedOpportunitiesSummary$engagementSummary$1 = MissedOpportunitiesSummary$engagementSummary$1.INSTANCE;
        return (EngagementSummary) optionalOfNullable.map(new Function() { // from class: o.gfb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MissedOpportunitiesSummary._get_engagementSummary_$lambda$2(missedOpportunitiesSummary$engagementSummary$1, obj);
            }
        }).orElse(null);
    }

    public final String getId() {
        String id = this.underlyingMissedOpportunity.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Leads getLeads() {
        Leads leads;
        LeadsSummary leadsSummary = getLeadsSummary();
        return (leadsSummary == null || (leads = leadsSummary.toLeads()) == null) ? new LeadsSummary(null, 1, 0 == true ? 1 : 0).toLeads() : leads;
    }

    public final LeadsSummary getLeadsSummary() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingMissedOpportunity.getContact());
        final MissedOpportunitiesSummary$leadsSummary$1 missedOpportunitiesSummary$leadsSummary$1 = MissedOpportunitiesSummary$leadsSummary$1.INSTANCE;
        return (LeadsSummary) optionalOfNullable.map(new Function() { // from class: o.dfb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MissedOpportunitiesSummary._get_leadsSummary_$lambda$1(missedOpportunitiesSummary$leadsSummary$1, obj);
            }
        }).orElse(null);
    }

    public final String getMessageBody() {
        return this.underlyingMissedOpportunity.getMessageBody();
    }

    public final String getMissedOpportunityDescription() {
        String displayValue = DisplayConstants.getDisplayValue(getMissedOpportunityType());
        sq8.m48648g(displayValue, "getDisplayValue(...)");
        return displayValue;
    }

    public final String getMissedOpportunityType() {
        return this.underlyingMissedOpportunity.getMissedOpportunityType().name();
    }

    public final LeadsUser getOwner() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingMissedOpportunity.getOwner());
        final MissedOpportunitiesSummary$owner$1 missedOpportunitiesSummary$owner$1 = MissedOpportunitiesSummary$owner$1.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.ffb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MissedOpportunitiesSummary._get_owner_$lambda$7(missedOpportunitiesSummary$owner$1, obj);
            }
        }).orElse(lpi.a0(this.underlyingMissedOpportunity.getOwnerId()));
    }

    public final String getOwnerId() {
        String ownerId = this.underlyingMissedOpportunity.getOwnerId();
        sq8.m48648g(ownerId, "getOwnerId(...)");
        return ownerId;
    }

    public final String getPrimaryTeamId() {
        String primaryTeamId = this.underlyingMissedOpportunity.getPrimaryTeamId();
        sq8.m48648g(primaryTeamId, "getPrimaryTeamId(...)");
        return primaryTeamId;
    }

    public final String getTaskAssignedTo() {
        LeadsUser owner = getOwner();
        if (owner != null) {
            return owner.getName();
        }
        return null;
    }

    public final String getTaskAssignedToProfilePic() {
        LeadsUser owner = getOwner();
        if (owner != null) {
            return owner.getProfilePic();
        }
        return null;
    }

    public final String getTaskContactMode() {
        return th1.m49854f(getMissedOpportunityType());
    }

    public final String getTaskContent() {
        String strM34027M;
        String missedOpportunityType = getMissedOpportunityType();
        switch (missedOpportunityType.hashCode()) {
            case -1066447067:
                if (!missedOpportunityType.equals("CALL_DISPOSITION_NOT_RECORDED")) {
                    return "";
                }
                EngagementSummary engagementSummary = getEngagementSummary();
                strM34027M = engagementSummary != null ? jm7.m34027M(engagementSummary.getCallStartTime()) : null;
                return "You've not logged call outcome for " + getClientName() + " happened on " + strM34027M;
            case -969547445:
                if (!missedOpportunityType.equals("CALL_LATER")) {
                    return "";
                }
                Long callLaterDateTime = getCallLaterDateTime();
                strM34027M = callLaterDateTime != null ? jm7.m34027M(callLaterDateTime.longValue()) : null;
                return getMessageBody() + " Next Call Time : " + strM34027M;
            case -585793984:
                if (!missedOpportunityType.equals("VISIT_NOT_ADDED")) {
                    return "";
                }
                return "You've missed to log visits with " + getClientName();
            case 690643242:
                if (!missedOpportunityType.equals("CALL_NOT_ANSWERED")) {
                    return "";
                }
                return "You've missed to answer call from " + getClientName();
            case 1138375928:
                if (!missedOpportunityType.equals("VISIT_DISPOSITION_NOT_RECORDED")) {
                    return "";
                }
                EngagementSummary engagementSummary2 = getEngagementSummary();
                strM34027M = engagementSummary2 != null ? jm7.m34027M(engagementSummary2.getVisitDate()) : null;
                return "You've not logged visit outcome for " + getClientName() + " which happened on " + strM34027M;
            default:
                return "";
        }
    }

    public final long getTaskDateTimeInMillis() {
        EngagementSummary engagementSummary = getEngagementSummary();
        Long lValueOf = engagementSummary != null ? Long.valueOf(engagementSummary.getDueDateTime()) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    public final String getTaskTitle() {
        return getMissedOpportunityDescription();
    }

    public final MissedOpportunities getUnderlyingMissedOpportunity() {
        return this.underlyingMissedOpportunity;
    }

    public final long getUpdatedAt() {
        Long lM16645F = a81.m16645F(this.underlyingMissedOpportunity.getUpdatedAt());
        sq8.m48648g(lM16645F, "toEpochMillis(...)");
        return lM16645F.longValue();
    }

    public final boolean isExpired() {
        EngagementSummary engagementSummary = getEngagementSummary();
        return engagementSummary != null && (engagementSummary.isOverdue() || false);
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "value");
        MissedOpportunities missedOpportunitiesBuild = this.underlyingMissedOpportunity.copyOfBuilder().accountId(str).build();
        sq8.m48648g(missedOpportunitiesBuild, "build(...)");
        this.underlyingMissedOpportunity = missedOpportunitiesBuild;
    }

    public final void setCallLaterDateTime(Long l) {
        MissedOpportunities missedOpportunitiesBuild = this.underlyingMissedOpportunity.copyOfBuilder().callLaterDateTime(a81.m16658m(l)).build();
        sq8.m48648g(missedOpportunitiesBuild, "build(...)");
        this.underlyingMissedOpportunity = missedOpportunitiesBuild;
    }

    public final void setContactId(String str) {
        sq8.m48649h(str, "value");
        MissedOpportunities missedOpportunitiesBuild = this.underlyingMissedOpportunity.copyOfBuilder().contact(Contact.justId(str)).build();
        sq8.m48648g(missedOpportunitiesBuild, "build(...)");
        this.underlyingMissedOpportunity = missedOpportunitiesBuild;
    }

    public final void setEngagementId(String str) {
        if (str == null || f9g.d0(str)) {
            return;
        }
        MissedOpportunities missedOpportunitiesBuild = this.underlyingMissedOpportunity.copyOfBuilder().relatedEngagement(Engagement.justId(str)).build();
        sq8.m48648g(missedOpportunitiesBuild, "build(...)");
        this.underlyingMissedOpportunity = missedOpportunitiesBuild;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "value");
        MissedOpportunities missedOpportunitiesBuild = this.underlyingMissedOpportunity.copyOfBuilder().id(str).build();
        sq8.m48648g(missedOpportunitiesBuild, "build(...)");
        this.underlyingMissedOpportunity = missedOpportunitiesBuild;
    }

    public final void setMessageBody(String str) {
        MissedOpportunities missedOpportunitiesBuild = this.underlyingMissedOpportunity.copyOfBuilder().messageBody(str).build();
        sq8.m48648g(missedOpportunitiesBuild, "build(...)");
        this.underlyingMissedOpportunity = missedOpportunitiesBuild;
    }

    public final void setMissedOpportunityType(String str) {
        sq8.m48649h(str, "value");
        MissedOpportunities missedOpportunitiesBuild = this.underlyingMissedOpportunity.copyOfBuilder().missedOpportunityType(MissedOpportunityType.valueOf(str)).build();
        sq8.m48648g(missedOpportunitiesBuild, "build(...)");
        this.underlyingMissedOpportunity = missedOpportunitiesBuild;
    }

    public final void setOwnerId(String str) {
        sq8.m48649h(str, "value");
        MissedOpportunities missedOpportunitiesBuild = this.underlyingMissedOpportunity.copyOfBuilder().ownerId(str).build();
        sq8.m48648g(missedOpportunitiesBuild, "build(...)");
        this.underlyingMissedOpportunity = missedOpportunitiesBuild;
    }

    public final void setPrimaryTeamId(String str) {
        sq8.m48649h(str, "value");
        MissedOpportunities missedOpportunitiesBuild = this.underlyingMissedOpportunity.copyOfBuilder().primaryTeamId(str).build();
        sq8.m48648g(missedOpportunitiesBuild, "build(...)");
        this.underlyingMissedOpportunity = missedOpportunitiesBuild;
    }

    public final void setUnderlyingMissedOpportunity(MissedOpportunities missedOpportunities) {
        sq8.m48649h(missedOpportunities, "<set-?>");
        this.underlyingMissedOpportunity = missedOpportunities;
    }

    public MissedOpportunitiesSummary(MissedOpportunities missedOpportunities) {
        sq8.m48649h(missedOpportunities, "underlyingMissedOpportunity");
        this.underlyingMissedOpportunity = missedOpportunities;
    }

    public /* synthetic */ MissedOpportunitiesSummary(MissedOpportunities missedOpportunities, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : missedOpportunities);
    }
}
