package ai.salesmax.model;

import ai.salesmax.custom.CustomFormDataObservable;
import ai.salesmax.model.LeadsSummary;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.Business;
import com.amplifyframework.datastore.generated.model.BusinessDetail;
import com.amplifyframework.datastore.generated.model.CallDirection;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.ContactAssignmentStatus;
import com.amplifyframework.datastore.generated.model.ContactBusinessMembership;
import com.amplifyframework.datastore.generated.model.ContactType;
import com.amplifyframework.datastore.generated.model.LeadLifecycleStage;
import com.amplifyframework.datastore.generated.model.LeadLifecycleStageSubCategory;
import com.amplifyframework.datastore.generated.model.Priority;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.a81;
import p001o.ch3;
import p001o.dh3;
import p001o.id5;
import p001o.ja8;
import p001o.kf9;
import p001o.kh3;
import p001o.lpi;
import p001o.lw9;
import p001o.sq8;
import p001o.tpb;
import p001o.wi0;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary {
    private BusinessSummary _addedBusiness;
    private final boolean _hideLeadSource;
    private final String lastCallDirection;
    private final String lastCallEngagementId;
    private final String lastCallOutcome;
    private final String lastCallUserId;
    private final String lastEmailEngagementId;
    private final String lastEmailUserId;
    private final String lastKnownDisposition;
    private final String lastNoteEngagementId;
    private final String lastNoteUserId;
    private final String lastTaskDoneEngagementId;
    private final String lastTaskDoneUserId;
    private final String lastVisitEngagementId;
    private final String lastVisitOutcome;
    private final String lastVisitUserId;
    private final String lastWhatsappEngagementId;
    private final String lastWhatsappUserId;
    private final Integer openTaskCount;
    private final Integer prospectingAttempts;
    private SubmittedFormValues submittedFormValues;
    private Contact underlyingContact;
    private final Integer unsuccessfulCallAttempts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: ai.salesmax.model.LeadsSummary$1 */
    public static final class C02451 extends kf9 implements xk7 {
        public static final C02451 INSTANCE = new C02451();

        public C02451() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(ContactBusinessMembership contactBusinessMembership) {
            return Boolean.valueOf(contactBusinessMembership.getBusiness() != null);
        }
    }

    /* renamed from: ai.salesmax.model.LeadsSummary$2 */
    public static final class C02462 extends kf9 implements xk7 {
        public static final C02462 INSTANCE = new C02462();

        public C02462() {
            super(1);
        }

        @Override // p001o.xk7
        public final BusinessSummary invoke(ContactBusinessMembership contactBusinessMembership) {
            Business business = contactBusinessMembership.getBusiness();
            sq8.m48648g(business, "getBusiness(...)");
            return new BusinessSummary(business);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Contact newInstance() {
            Contact contactBuild = Contact.builder().updatedById("").id("").account(Account.justId("")).build();
            sq8.m48648g(contactBuild, "build(...)");
            return contactBuild;
        }
    }

    /* renamed from: ai.salesmax.model.LeadsSummary$assignTeam$1 */
    public static final class C02471 extends kf9 implements xk7 {
        final /* synthetic */ String $teamId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02471(String str) {
            super(1);
            this.$teamId = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(!Objects.equals(str, this.$teamId));
        }
    }

    /* renamed from: ai.salesmax.model.LeadsSummary$setRecentActions$1 */
    public static final class C02481 extends kf9 implements xk7 {
        public static final C02481 INSTANCE = new C02481();

        public C02481() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(RecentAction recentAction) {
            return ja8.f30035c.toJson(recentAction);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LeadsSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_addedAt_$lambda$28(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_addedBy_$lambda$26(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_assignmentStatus_$lambda$36(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_becameCustomerOn_$lambda$29(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_companyName_$lambda$7(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsBusiness _get_company_$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsBusiness) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsBusiness _get_company_$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsBusiness) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_contactOwnerName_$lambda$9(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_contactOwner_$lambda$10(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_createdAt_$lambda$34(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_firstProspectingDoneOn_$lambda$30(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_lastCalledTime_$lambda$14(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_lastEmailTime_$lambda$16(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_lastEngagementTimeFromAccount_$lambda$21(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_lastEngagementTimeFromContact_$lambda$22(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_lastKnownDispositionTime_$lambda$20(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_lastLeadAssignmentDateTime_$lambda$25(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_lastNoteAddedTime_$lambda$18(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_lastProspectingDoneOn_$lambda$31(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_lastTaskDoneTime_$lambda$19(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_lastVisitTime_$lambda$15(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_lastWhatsappTime_$lambda$17(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _get_nextProspectingDueOn_$lambda$32(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Date) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_primaryAddress_$lambda$37(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Optional _get_primaryAddress_$lambda$38(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Optional) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsAddress _get_primaryAddress_$lambda$39(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsAddress) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_priority_$lambda$35(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_relatedBusiness_$lambda$12(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_relatedBusiness_$lambda$13(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_secondaryTitle_$lambda$8(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_teamAssignedTo_$lambda$23(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long _get_updatedAt_$lambda$33(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser _get_updatedBy_$lambda$27(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BusinessSummary _init_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (BusinessSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _set_addedBusiness_$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_contactAddedById_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_contactOwnerId_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_contactOwner_$lambda$11(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean assignTeam$lambda$24(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setRecentActions$lambda$41(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    public static /* synthetic */ Leads toLeads$default(LeadsSummary leadsSummary, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return leadsSummary.toLeads(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toLeads$lambda$43(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toLeads$lambda$44(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    public final void assignTeam(String str) {
        sq8.m48649h(str, "teamId");
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getPrimaryTeamId());
        final C02471 c02471 = new C02471(str);
        if (optionalOfNullable.filter(new Predicate() { // from class: o.j9a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeadsSummary.assignTeam$lambda$24(c02471, obj);
            }
        }).isPresent()) {
            return;
        }
        Contact contactBuild = this.underlyingContact.copyOfBuilder().primaryTeamId(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final String getActiveDealStage() {
        return this.underlyingContact.getActiveDealStage();
    }

    public final Date getActiveDealStageUpdatedAt() {
        Temporal.DateTime activeDealStageUpdatedAt = this.underlyingContact.getActiveDealStageUpdatedAt();
        if (activeDealStageUpdatedAt != null) {
            return activeDealStageUpdatedAt.toDate();
        }
        return null;
    }

    public final Date getAddedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getCreatedAt());
        final LeadsSummary$addedAt$1 leadsSummary$addedAt$1 = LeadsSummary$addedAt$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.o8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_addedAt_$lambda$28(leadsSummary$addedAt$1, obj);
            }
        }).orElse(null);
    }

    public final BusinessSummary getAddedBusiness() {
        return this._addedBusiness;
    }

    public final LeadsUser getAddedBy() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getAddedBy());
        final LeadsSummary$addedBy$1 leadsSummary$addedBy$1 = LeadsSummary$addedBy$1.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.s9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_addedBy_$lambda$26(leadsSummary$addedBy$1, obj);
            }
        }).orElse(lpi.a0(this.underlyingContact.getAddedById()));
    }

    public final String getAssignmentStatus() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getToBeAssigned());
        final LeadsSummary$assignmentStatus$1 leadsSummary$assignmentStatus$1 = LeadsSummary$assignmentStatus$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.p9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_assignmentStatus_$lambda$36(leadsSummary$assignmentStatus$1, obj);
            }
        }).orElse(ContactAssignmentStatus.UNASSIGNED.name());
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getAttentionText() {
        getContactOwnerId().isPresent();
        return "";
    }

    public final Date getBecameCustomerOn() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getBecameCustomerOn());
        final LeadsSummary$becameCustomerOn$1 leadsSummary$becameCustomerOn$1 = LeadsSummary$becameCustomerOn$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.z8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_becameCustomerOn_$lambda$29(leadsSummary$becameCustomerOn$1, obj);
            }
        }).orElse(null);
    }

    public final String getBulkUploadReference() {
        return this.underlyingContact.getBulkUploadReference();
    }

    public final ArrayList<CallLogs> getCallHistory() {
        Temporal.DateTime lastCalledTime = this.underlyingContact.getLastCalledTime();
        if (StringUtils.isBlank(lastCalledTime != null ? lastCalledTime.toString() : null)) {
            return new ArrayList<>();
        }
        CallDirection lastCallDirection = this.underlyingContact.getLastCallDirection();
        String strName = lastCallDirection != null ? lastCallDirection.name() : null;
        if (strName == null) {
            strName = "";
        }
        int i = sq8.m48644c("INCOMING", strName) ? 1 : 2;
        Integer lastCallDuration = this.underlyingContact.getLastCallDuration();
        Integer numValueOf = lastCallDuration != null ? Integer.valueOf(lastCallDuration.intValue() | 0) : null;
        if (i == 1 && numValueOf != null && numValueOf.intValue() == 0) {
            i = 3;
        } else if (i == 2 && numValueOf != null && numValueOf.intValue() == 0) {
            i = 4;
        }
        CallLogs[] callLogsArr = new CallLogs[1];
        Long lM16645F = a81.m16645F(this.underlyingContact.getLastCalledTime());
        String strValueOf = lM16645F != null ? String.valueOf(lM16645F) : null;
        callLogsArr[0] = new CallLogs(null, null, String.valueOf(i), strValueOf == null ? "" : strValueOf, null, null, null, null, null, false, null, null, false, 8179, null);
        return ch3.m21242g(callLogsArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<LeadsBusiness> getCompany() {
        List list;
        Stream<BusinessDetail> stream;
        Stream<ContactBusinessMembership> stream2;
        List<ContactBusinessMembership> businesses = this.underlyingContact.getBusinesses();
        List listM21246k = null;
        if (businesses == null || (stream2 = businesses.stream()) == null) {
            list = null;
        } else {
            final LeadsSummary$company$1 leadsSummary$company$1 = LeadsSummary$company$1.INSTANCE;
            Stream<R> map = stream2.map(new Function() { // from class: o.t8a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return LeadsSummary._get_company_$lambda$4(leadsSummary$company$1, obj);
                }
            });
            if (map != 0) {
                list = (List) map.collect(Collectors.toList());
            }
        }
        Optional optionalOfNullable = Optional.ofNullable(list);
        List<BusinessDetail> businessDetail = this.underlyingContact.getBusinessDetail();
        if (businessDetail != null && (stream = businessDetail.stream()) != null) {
            final LeadsSummary$company$2 leadsSummary$company$2 = LeadsSummary$company$2.INSTANCE;
            Stream<R> map2 = stream.map(new Function() { // from class: o.u8a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return LeadsSummary._get_company_$lambda$5(leadsSummary$company$2, obj);
                }
            });
            if (map2 != 0) {
                listM21246k = (List) map2.collect(Collectors.toList());
            }
        }
        if (listM21246k == null) {
            listM21246k = ch3.m21246k();
        }
        Object objCollect = ((List) optionalOfNullable.orElse(listM21246k)).stream().collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public final String getCompanyName() {
        Stream<LeadsBusiness> stream = getCompany().stream();
        final LeadsSummary$companyName$cName$1 leadsSummary$companyName$cName$1 = LeadsSummary$companyName$cName$1.INSTANCE;
        String str = (String) stream.map(new Function() { // from class: o.i9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_companyName_$lambda$7(leadsSummary$companyName$cName$1, obj);
            }
        }).collect(Collectors.joining(","));
        sq8.m48646e(str);
        return str;
    }

    public final Optional<String> getContactAddedById() {
        Optional<String> optionalOfNullable = Optional.ofNullable(this.underlyingContact.getAddedById());
        sq8.m48648g(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final List<String> getContactNumbers() {
        List<String> listC0 = lw9.c0(this.underlyingContact);
        sq8.m48648g(listC0, "getContactNumbers(...)");
        return listC0;
    }

    public final List<PhoneDetail> getContactNumbersWithWhatsapp() {
        List<PhoneDetail> listD0 = lw9.d0(this.underlyingContact);
        sq8.m48648g(listD0, "getContactNumbersWithWhatsapp(...)");
        return listD0;
    }

    public final Optional<LeadsUser> getContactOwner() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getOwner());
        final LeadsSummary$contactOwner$x$1 leadsSummary$contactOwner$x$1 = LeadsSummary$contactOwner$x$1.INSTANCE;
        Optional<LeadsUser> optionalOfNullable2 = Optional.ofNullable((LeadsUser) optionalOfNullable.map(new Function() { // from class: o.g9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_contactOwner_$lambda$10(leadsSummary$contactOwner$x$1, obj);
            }
        }).orElse(lpi.a0(this.underlyingContact.getOwnerId())));
        sq8.m48648g(optionalOfNullable2, "ofNullable(...)");
        return optionalOfNullable2;
    }

    public final Optional<String> getContactOwnerId() {
        Optional<String> optionalOfNullable = Optional.ofNullable(this.underlyingContact.getOwnerId());
        sq8.m48648g(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final String getContactOwnerName() {
        Optional<LeadsUser> contactOwner = getContactOwner();
        final LeadsSummary$contactOwnerName$1 leadsSummary$contactOwnerName$1 = LeadsSummary$contactOwnerName$1.INSTANCE;
        Object objOrElse = contactOwner.map(new Function() { // from class: o.t9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_contactOwnerName_$lambda$9(leadsSummary$contactOwnerName$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getContactSource() {
        if (this._hideLeadSource) {
            return null;
        }
        return this.underlyingContact.getContactSource();
    }

    public final String getContactSourceOne() {
        return this.underlyingContact.getContactSourceDrillDownOne();
    }

    public final String getContactSourceThree() {
        return this.underlyingContact.getContactSourceDrillDownThree();
    }

    public final String getContactSourceTwo() {
        return this.underlyingContact.getContactSourceDrillDownTwo();
    }

    public final String getContactType() {
        return (String) Optional.ofNullable(this.underlyingContact.getContactType()).orElse(ContactType.CLIENT.name());
    }

    public final Long getCreatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getCreatedAt());
        final LeadsSummary$createdAt$1 leadsSummary$createdAt$1 = LeadsSummary$createdAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.r9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_createdAt_$lambda$34(leadsSummary$createdAt$1, obj);
            }
        }).orElse(null);
    }

    public final String getCustomAttributes() {
        return this.underlyingContact.getCustomAttributes();
    }

    public final String getCustomDataAddedFromAddContactForm() {
        return this.underlyingContact.getCustomDataAddedFromAddContactForm();
    }

    public final String getDealDescription() {
        return this.underlyingContact.getDealDescription();
    }

    public final String getDepartment() {
        return this.underlyingContact.getDepartment();
    }

    public final String getDesignation() {
        return this.underlyingContact.getDesignation();
    }

    public final List<String> getEmail() {
        List<String> listE0 = lw9.e0(this.underlyingContact);
        sq8.m48648g(listE0, "getEmails(...)");
        return listE0;
    }

    public final Date getFirstProspectingDoneOn() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getFirstProspectingDoneOn());
        final LeadsSummary$firstProspectingDoneOn$1 leadsSummary$firstProspectingDoneOn$1 = LeadsSummary$firstProspectingDoneOn$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.d8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_firstProspectingDoneOn_$lambda$30(leadsSummary$firstProspectingDoneOn$1, obj);
            }
        }).orElse(null);
    }

    public final String getFreshLeadTag() {
        return this.underlyingContact.getFreshLeadTag();
    }

    public final String getId() {
        String id = this.underlyingContact.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final String getLastCallDirection() {
        return this.lastCallDirection;
    }

    public final int getLastCallDuration() {
        Object objOrElse = Optional.ofNullable(this.underlyingContact.getLastCallDuration()).orElse(0);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).intValue();
    }

    public final String getLastCallEngagementId() {
        return this.lastCallEngagementId;
    }

    public final String getLastCallOutcome() {
        return this.lastCallOutcome;
    }

    public final LeadsUser getLastCallUser() {
        return lpi.a0(this.lastCallUserId);
    }

    public final String getLastCallUserId() {
        return this.lastCallUserId;
    }

    public final Date getLastCalledTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastCalledTime());
        final LeadsSummary$lastCalledTime$1 leadsSummary$lastCalledTime$1 = LeadsSummary$lastCalledTime$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.r8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastCalledTime_$lambda$14(leadsSummary$lastCalledTime$1, obj);
            }
        }).orElse(null);
    }

    public final String getLastDealStageType() {
        return this.underlyingContact.getLastDealStageType();
    }

    public final String getLastEmailEngagementId() {
        return this.lastEmailEngagementId;
    }

    public final Date getLastEmailTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastEmailTime());
        final LeadsSummary$lastEmailTime$1 leadsSummary$lastEmailTime$1 = LeadsSummary$lastEmailTime$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.s8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastEmailTime_$lambda$16(leadsSummary$lastEmailTime$1, obj);
            }
        }).orElse(null);
    }

    public final LeadsUser getLastEmailUser() {
        return lpi.a0(this.lastEmailUserId);
    }

    public final String getLastEmailUserId() {
        return this.lastEmailUserId;
    }

    public final Date getLastEngagementTimeFromAccount() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastEngagementFromAccount());
        final LeadsSummary$lastEngagementTimeFromAccount$1 leadsSummary$lastEngagementTimeFromAccount$1 = LeadsSummary$lastEngagementTimeFromAccount$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.j8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastEngagementTimeFromAccount_$lambda$21(leadsSummary$lastEngagementTimeFromAccount$1, obj);
            }
        }).orElse(null);
    }

    public final Date getLastEngagementTimeFromContact() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastEngagementFromContact());
        final LeadsSummary$lastEngagementTimeFromContact$1 leadsSummary$lastEngagementTimeFromContact$1 = LeadsSummary$lastEngagementTimeFromContact$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.n9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastEngagementTimeFromContact_$lambda$22(leadsSummary$lastEngagementTimeFromContact$1, obj);
            }
        }).orElse(null);
    }

    public final String getLastKnownDisposition() {
        return this.lastKnownDisposition;
    }

    public final Date getLastKnownDispositionTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastKnownDispositionTime());
        final LeadsSummary$lastKnownDispositionTime$1 leadsSummary$lastKnownDispositionTime$1 = LeadsSummary$lastKnownDispositionTime$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.l9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastKnownDispositionTime_$lambda$20(leadsSummary$lastKnownDispositionTime$1, obj);
            }
        }).orElse(null);
    }

    public final long getLastLeadAssignmentDateTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastLeadAssignmentDateTime());
        final LeadsSummary$lastLeadAssignmentDateTime$1 leadsSummary$lastLeadAssignmentDateTime$1 = LeadsSummary$lastLeadAssignmentDateTime$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.n8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastLeadAssignmentDateTime_$lambda$25(leadsSummary$lastLeadAssignmentDateTime$1, obj);
            }
        }).orElse(-1L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final Date getLastNoteAddedTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastNoteAddedTime());
        final LeadsSummary$lastNoteAddedTime$1 leadsSummary$lastNoteAddedTime$1 = LeadsSummary$lastNoteAddedTime$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.b9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastNoteAddedTime_$lambda$18(leadsSummary$lastNoteAddedTime$1, obj);
            }
        }).orElse(null);
    }

    public final String getLastNoteEngagementId() {
        return this.lastNoteEngagementId;
    }

    public final LeadsUser getLastNoteUser() {
        return lpi.a0(this.lastNoteUserId);
    }

    public final String getLastNoteUserId() {
        return this.lastNoteUserId;
    }

    public final Date getLastProspectingDoneOn() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastProspectingDoneOn());
        final LeadsSummary$lastProspectingDoneOn$1 leadsSummary$lastProspectingDoneOn$1 = LeadsSummary$lastProspectingDoneOn$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.i8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastProspectingDoneOn_$lambda$31(leadsSummary$lastProspectingDoneOn$1, obj);
            }
        }).orElse(null);
    }

    public final String getLastTaskDoneEngagementId() {
        return this.lastTaskDoneEngagementId;
    }

    public final Date getLastTaskDoneTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastTaskDoneTime());
        final LeadsSummary$lastTaskDoneTime$1 leadsSummary$lastTaskDoneTime$1 = LeadsSummary$lastTaskDoneTime$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.q8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastTaskDoneTime_$lambda$19(leadsSummary$lastTaskDoneTime$1, obj);
            }
        }).orElse(null);
    }

    public final LeadsUser getLastTaskDoneUse() {
        return lpi.a0(this.lastTaskDoneUserId);
    }

    public final String getLastTaskDoneUserId() {
        return this.lastTaskDoneUserId;
    }

    public final String getLastVisitEngagementId() {
        return this.lastVisitEngagementId;
    }

    public final String getLastVisitOutcome() {
        return this.lastVisitOutcome;
    }

    public final Date getLastVisitTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastVisitTime());
        final LeadsSummary$lastVisitTime$1 leadsSummary$lastVisitTime$1 = LeadsSummary$lastVisitTime$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.c9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastVisitTime_$lambda$15(leadsSummary$lastVisitTime$1, obj);
            }
        }).orElse(null);
    }

    public final LeadsUser getLastVisitUser() {
        return lpi.a0(this.lastVisitUserId);
    }

    public final String getLastVisitUserId() {
        return this.lastVisitUserId;
    }

    public final String getLastWhatsappEngagementId() {
        return this.lastWhatsappEngagementId;
    }

    public final Date getLastWhatsappTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getLastWhatsappTime());
        final LeadsSummary$lastWhatsappTime$1 leadsSummary$lastWhatsappTime$1 = LeadsSummary$lastWhatsappTime$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.k9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_lastWhatsappTime_$lambda$17(leadsSummary$lastWhatsappTime$1, obj);
            }
        }).orElse(null);
    }

    public final LeadsUser getLastWhatsappUser() {
        return lpi.a0(this.lastWhatsappUserId);
    }

    public final String getLastWhatsappUserId() {
        return this.lastWhatsappUserId;
    }

    public final String getLatestRemark() {
        return this.underlyingContact.getLatestRemark();
    }

    public final String getLeadLifecycleStage() {
        LeadLifecycleStage leadLifecycleStage = this.underlyingContact.getLeadLifecycleStage();
        if (leadLifecycleStage != null) {
            return leadLifecycleStage.name();
        }
        return null;
    }

    public final String getLeadLifecycleStageSubCategory() {
        LeadLifecycleStageSubCategory leadLifecycleStageSubCategory = this.underlyingContact.getLeadLifecycleStageSubCategory();
        if (leadLifecycleStageSubCategory != null) {
            return leadLifecycleStageSubCategory.name();
        }
        return null;
    }

    public final String getManuallyClosedReason() {
        return this.underlyingContact.getManualClosedReason();
    }

    public final String getName() {
        return this.underlyingContact.getName();
    }

    public final String getNeedFollowUpTag() {
        return this.underlyingContact.getNeedFollowUpTag();
    }

    public final Date getNeedFollowUpTagUpdatedAt() {
        Temporal.DateTime needFollowUpTagUpdatedAt = this.underlyingContact.getNeedFollowUpTagUpdatedAt();
        if (needFollowUpTagUpdatedAt != null) {
            return needFollowUpTagUpdatedAt.toDate();
        }
        return null;
    }

    public final Date getNextProspectingDueOn() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getNextProspectingDueOn());
        final LeadsSummary$nextProspectingDueOn$1 leadsSummary$nextProspectingDueOn$1 = LeadsSummary$nextProspectingDueOn$1.INSTANCE;
        return (Date) optionalOfNullable.map(new Function() { // from class: o.a9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_nextProspectingDueOn_$lambda$32(leadsSummary$nextProspectingDueOn$1, obj);
            }
        }).orElse(null);
    }

    public final String getNextProspectingNote() {
        return this.underlyingContact.getNextProspectingNote();
    }

    public final String getNextProspectingSetBy() {
        return this.underlyingContact.getNextProspectingSetBy();
    }

    public final Integer getOpenTaskCount() {
        return this.openTaskCount;
    }

    public final OpenTaskDetail getOpenTaskDetail() {
        return (OpenTaskDetail) ja8.f30035c.fromJson(this.underlyingContact.getOpenTaskDetail(), OpenTaskDetail.class);
    }

    public final VideoMeeting getOpenVideoMeeting() {
        return (VideoMeeting) ja8.f30035c.fromJson(this.underlyingContact.getOpenVideoCallDetail(), VideoMeeting.class);
    }

    public final PaymentDetail getPaymentDetail() {
        return (PaymentDetail) ja8.f30035c.fromJson(this.underlyingContact.getPaymentRequestDetail(), PaymentDetail.class);
    }

    public final LeadsAddress getPrimaryAddress() {
        Object objOrElse = Optional.ofNullable(this.underlyingContact.getAddresses()).orElse(ch3.m21246k());
        sq8.m48648g(objOrElse, "orElse(...)");
        List list = (List) objOrElse;
        Optional optionalFindFirst = list.stream().findFirst();
        Stream stream = list.stream();
        final LeadsSummary$primaryAddress$1 leadsSummary$primaryAddress$1 = LeadsSummary$primaryAddress$1.INSTANCE;
        Optional optionalFindFirst2 = stream.filter(new Predicate() { // from class: o.v8a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeadsSummary._get_primaryAddress_$lambda$37(leadsSummary$primaryAddress$1, obj);
            }
        }).findFirst();
        final LeadsSummary$primaryAddress$2 leadsSummary$primaryAddress$2 = LeadsSummary$primaryAddress$2.INSTANCE;
        Optional optional = (Optional) optionalFindFirst2.map(new Function() { // from class: o.w8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_primaryAddress_$lambda$38(leadsSummary$primaryAddress$2, obj);
            }
        }).orElse(optionalFindFirst);
        final LeadsSummary$primaryAddress$3 leadsSummary$primaryAddress$3 = LeadsSummary$primaryAddress$3.INSTANCE;
        return (LeadsAddress) optional.map(new Function() { // from class: o.x8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_primaryAddress_$lambda$39(leadsSummary$primaryAddress$3, obj);
            }
        }).orElse(null);
    }

    public final String getPrimaryTeamId() {
        return this.underlyingContact.getPrimaryTeamId();
    }

    public final String getPriority() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getAccountPriority());
        final LeadsSummary$priority$1 leadsSummary$priority$1 = LeadsSummary$priority$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.q9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_priority_$lambda$35(leadsSummary$priority$1, obj);
            }
        }).orElse(Priority.MEDIUM.name());
    }

    public final String getProfilePicURL() {
        Object objOrElse = Optional.ofNullable(this.underlyingContact.getProfilePhotoUrl()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final Object getProperty(String str) {
        return null;
    }

    public final Integer getProspectingAttempts() {
        return this.prospectingAttempts;
    }

    public final List<RecentAction> getRecentActions() {
        List<String> recentEngagements = this.underlyingContact.getRecentEngagements();
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

    public final String getRelatedBusiness() {
        Stream<LeadsBusiness> stream = getCompany().stream();
        final LeadsSummary$relatedBusiness$1 leadsSummary$relatedBusiness$1 = LeadsSummary$relatedBusiness$1.INSTANCE;
        Stream<R> map = stream.map(new Function() { // from class: o.l8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_relatedBusiness_$lambda$12(leadsSummary$relatedBusiness$1, obj);
            }
        });
        final LeadsSummary$relatedBusiness$2 leadsSummary$relatedBusiness$2 = LeadsSummary$relatedBusiness$2.INSTANCE;
        Object objCollect = map.filter(new Predicate() { // from class: o.m8a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeadsSummary._get_relatedBusiness_$lambda$13(leadsSummary$relatedBusiness$2, obj);
            }
        }).collect(Collectors.joining(","));
        sq8.m48648g(objCollect, "collect(...)");
        return (String) objCollect;
    }

    public final String getSecondaryTitle() {
        Stream<LeadsBusiness> stream = getCompany().stream();
        final LeadsSummary$secondaryTitle$cName$1 leadsSummary$secondaryTitle$cName$1 = LeadsSummary$secondaryTitle$cName$1.INSTANCE;
        String str = (String) stream.map(new Function() { // from class: o.y8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_secondaryTitle_$lambda$8(leadsSummary$secondaryTitle$cName$1, obj);
            }
        }).findFirst().orElse("");
        if (getCompany().size() > 1) {
            str = str + " +" + (getCompany().size() - 1) + " more";
        }
        String designation = getDesignation();
        if (designation == null) {
            designation = "";
        }
        String str2 = (String) kh3.h0(getContactNumbers());
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) kh3.h0(getEmail());
        if (str3 == null) {
            str3 = "";
        }
        sq8.m48646e(str);
        if (!(str.length() > 0)) {
            if (str2.length() > 0) {
                return str2;
            }
            return str3.length() > 0 ? str3 : "";
        }
        if (designation.length() > 0) {
            str = designation + "( " + str + " )";
        }
        String str4 = str;
        sq8.m48646e(str4);
        return str4;
    }

    public final SubmittedFormValues getSubmittedFormValues() {
        return this.submittedFormValues;
    }

    public final String getTeamAssignedTo() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getPrimaryTeam());
        final LeadsSummary$teamAssignedTo$1 leadsSummary$teamAssignedTo$1 = LeadsSummary$teamAssignedTo$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.h9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_teamAssignedTo_$lambda$23(leadsSummary$teamAssignedTo$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final Contact getUnderlyingContact() {
        return this.underlyingContact;
    }

    public final Integer getUnsuccessfulCallAttempts() {
        return this.unsuccessfulCallAttempts;
    }

    public final Long getUpdatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getUpdatedAt());
        final LeadsSummary$updatedAt$1 leadsSummary$updatedAt$1 = LeadsSummary$updatedAt$1.INSTANCE;
        return (Long) optionalOfNullable.map(new Function() { // from class: o.m9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_updatedAt_$lambda$33(leadsSummary$updatedAt$1, obj);
            }
        }).orElse(null);
    }

    public final LeadsUser getUpdatedBy() {
        Optional optionalOfNullable = Optional.ofNullable(this.underlyingContact.getUpdatedBy());
        final LeadsSummary$updatedBy$1 leadsSummary$updatedBy$1 = LeadsSummary$updatedBy$1.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.e9a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary._get_updatedBy_$lambda$27(leadsSummary$updatedBy$1, obj);
            }
        }).orElse(lpi.a0(this.underlyingContact.getUpdatedById()));
    }

    public final List<String> getUserDefinedTags() {
        return this.underlyingContact.getUserDefinedTags();
    }

    public final String getWaChannelId() {
        Object objOrElse = Optional.ofNullable(this.underlyingContact.getWaChatChannelId()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final BusinessSummary get_addedBusiness() {
        return this._addedBusiness;
    }

    public final boolean get_hideLeadSource() {
        return this._hideLeadSource;
    }

    public final String isCustomer() {
        return this.underlyingContact.getIsCustomer();
    }

    public final void setActiveDealStage(String str) {
        if (str != null) {
            Contact contactBuild = this.underlyingContact.copyOfBuilder().activeDealStage(ja8.f30035c.toJson(str)).build();
            sq8.m48648g(contactBuild, "build(...)");
            this.underlyingContact = contactBuild;
        }
    }

    public final void setAddedBusiness(BusinessSummary businessSummary) {
        Stream<LeadsBusiness> stream = getCompany().stream();
        final LeadsSummary$addedBusiness$isAlreadyPresent$1 leadsSummary$addedBusiness$isAlreadyPresent$1 = new LeadsSummary$addedBusiness$isAlreadyPresent$1(businessSummary);
        if (stream.filter(new Predicate() { // from class: o.p8a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return LeadsSummary._set_addedBusiness_$lambda$6(leadsSummary$addedBusiness$isAlreadyPresent$1, obj);
            }
        }).findAny().isPresent()) {
            return;
        }
        this._addedBusiness = businessSummary;
    }

    public final void setBulkUploadReference(String str) {
        Contact contactBuild = this.underlyingContact.copyOfBuilder().bulkUploadReference(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setContactAddedById(Optional<String> optional) {
        sq8.m48649h(optional, "value");
        final LeadsSummary$contactAddedById$1 leadsSummary$contactAddedById$1 = new LeadsSummary$contactAddedById$1(this);
        optional.ifPresent(new Consumer() { // from class: o.k8a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadsSummary._set_contactAddedById_$lambda$3(leadsSummary$contactAddedById$1, obj);
            }
        });
    }

    public final void setContactNumbers(List<String> list) {
        sq8.m48649h(list, "contactNumbers");
        Contact contact = this.underlyingContact;
        Contact contactM1 = lw9.m1(contact, contact.getContactNumberDetail(), list);
        sq8.m48648g(contactM1, "setContactNumbers(...)");
        this.underlyingContact = contactM1;
    }

    public final void setContactOwner(Optional<LeadsUser> optional) {
        sq8.m48649h(optional, "value");
        final LeadsSummary$contactOwner$1 leadsSummary$contactOwner$1 = new LeadsSummary$contactOwner$1(this);
        optional.ifPresent(new Consumer() { // from class: o.d9a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadsSummary._set_contactOwner_$lambda$11(leadsSummary$contactOwner$1, obj);
            }
        });
    }

    public final void setContactOwnerId(Optional<String> optional) {
        sq8.m48649h(optional, "value");
        final LeadsSummary$contactOwnerId$1 leadsSummary$contactOwnerId$1 = new LeadsSummary$contactOwnerId$1(this);
        optional.ifPresent(new Consumer() { // from class: o.f9a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LeadsSummary._set_contactOwnerId_$lambda$2(leadsSummary$contactOwnerId$1, obj);
            }
        });
    }

    public final void setContactSource(String str) {
        Contact contactBuild = this.underlyingContact.copyOfBuilder().contactSource(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setContactSourceOne(String str) {
        Contact contactBuild = this.underlyingContact.copyOfBuilder().contactSourceDrillDownOne(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setContactSourceThree(String str) {
        Contact contactBuild = this.underlyingContact.copyOfBuilder().contactSourceDrillDownThree(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setContactSourceTwo(String str) {
        Contact contactBuild = this.underlyingContact.copyOfBuilder().contactSourceDrillDownTwo(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setContactType(String str) {
        Contact.CopyOfBuilder copyOfBuilder = this.underlyingContact.copyOfBuilder();
        sq8.m48646e(str);
        Contact contactBuild = copyOfBuilder.contactType(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setCustomAttributes(String str) {
        Contact contactBuild = this.underlyingContact.copyOfBuilder().customAttributes(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setCustomDataAddedFromAddContactForm(String str) {
        if (str != null) {
            Contact contactBuild = this.underlyingContact.copyOfBuilder().customDataAddedFromAddContactForm(str).build();
            sq8.m48648g(contactBuild, "build(...)");
            this.underlyingContact = contactBuild;
        }
    }

    public final void setCustomer(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Contact contactBuild = this.underlyingContact.copyOfBuilder().isCustomer(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setDepartment(String str) {
        Contact contactBuild = this.underlyingContact.copyOfBuilder().department(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setDesignation(String str) {
        Contact contactBuild = this.underlyingContact.copyOfBuilder().designation(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setEmail(List<String> list) {
        sq8.m48649h(list, "value");
        Contact contact = this.underlyingContact;
        Contact contactN1 = lw9.n1(contact, contact.getEmails(), list);
        sq8.m48648g(contactN1, "setEmails(...)");
        this.underlyingContact = contactN1;
    }

    public final void setEmails(List<String> list) {
        Contact contact = this.underlyingContact;
        Contact contactN1 = lw9.n1(contact, contact.getEmails(), list);
        sq8.m48648g(contactN1, "setEmails(...)");
        this.underlyingContact = contactN1;
    }

    public final void setFreshLeadTag(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Contact contactBuild = this.underlyingContact.copyOfBuilder().freshLeadTag(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "value");
        Contact contactBuild = this.underlyingContact.copyOfBuilder().id(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setLastDealStageType(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Contact contactBuild = this.underlyingContact.copyOfBuilder().lastDealStageType(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setLastLeadAssignmentDateTime(long j) {
        if (j != -1) {
            this.underlyingContact.copyOfBuilder().lastLeadAssignmentDateTime(a81.m16658m(Long.valueOf(j))).build();
        }
    }

    public final void setLatestRemark(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Contact contactBuild = this.underlyingContact.copyOfBuilder().latestRemark(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setLeadLifecycleStage(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Contact contactBuild = this.underlyingContact.copyOfBuilder().leadLifecycleStage(LeadLifecycleStage.valueOf(str)).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setLeadLifecycleStageSubCategory(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Contact contactBuild = this.underlyingContact.copyOfBuilder().leadLifecycleStageSubCategory(LeadLifecycleStageSubCategory.valueOf(str)).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setName(String str) {
        Contact contactBuild = this.underlyingContact.copyOfBuilder().name(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setNextProspectingDueOn(Date date) {
        if (date != null) {
            Contact contactBuild = this.underlyingContact.copyOfBuilder().nextProspectingDueOn(a81.m16658m(Long.valueOf(date.getTime()))).build();
            sq8.m48648g(contactBuild, "build(...)");
            this.underlyingContact = contactBuild;
        }
    }

    public final void setNextProspectingNote(String str) {
        if (str != null) {
            Contact contactBuild = this.underlyingContact.copyOfBuilder().nextProspectingNote(str).build();
            sq8.m48648g(contactBuild, "build(...)");
            this.underlyingContact = contactBuild;
        }
    }

    public final void setNextProspectingSetBy(String str) {
        if (str != null) {
            Contact contactBuild = this.underlyingContact.copyOfBuilder().nextProspectingSetBy(str).build();
            sq8.m48648g(contactBuild, "build(...)");
            this.underlyingContact = contactBuild;
        }
    }

    public final void setOpenTaskDetail(OpenTaskDetail openTaskDetail) {
        if (openTaskDetail != null) {
            Contact contactBuild = this.underlyingContact.copyOfBuilder().openTaskDetail(ja8.f30035c.toJson(openTaskDetail)).build();
            sq8.m48648g(contactBuild, "build(...)");
            this.underlyingContact = contactBuild;
        }
    }

    public final void setPrimaryAddress(LeadsAddress leadsAddress) {
        if (leadsAddress != null) {
            Contact contactBuild = this.underlyingContact.copyOfBuilder().addresses(Arrays.asList(leadsAddress.getAddress())).build();
            sq8.m48648g(contactBuild, "build(...)");
            this.underlyingContact = contactBuild;
        }
    }

    public final void setPriority(String str) {
        Contact contactBuild = this.underlyingContact.copyOfBuilder().accountPriority(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setProfilePicURL(String str) {
        sq8.m48649h(str, "pictureUrl");
        Contact contactBuild = this.underlyingContact.copyOfBuilder().profilePhotoUrl(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setProperty(String str, Object obj) {
    }

    public final void setRecentActions(List<RecentAction> list) {
        sq8.m48649h(list, "value");
        if (!list.isEmpty()) {
            Stream<RecentAction> stream = list.stream();
            final C02481 c02481 = C02481.INSTANCE;
            Contact contactBuild = this.underlyingContact.copyOfBuilder().recentEngagements((List<String>) stream.map(new Function() { // from class: o.o9a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return LeadsSummary.setRecentActions$lambda$41(c02481, obj);
                }
            }).collect(Collectors.toList())).build();
            sq8.m48648g(contactBuild, "build(...)");
            this.underlyingContact = contactBuild;
        }
    }

    public final void setSubmittedFormValues(SubmittedFormValues submittedFormValues) {
        this.submittedFormValues = submittedFormValues;
    }

    public final void setUnderlyingContact(Contact contact) {
        sq8.m48649h(contact, "<set-?>");
        this.underlyingContact = contact;
    }

    public final void setUserDefinedTags(List<String> list) {
        Contact.CopyOfBuilder copyOfBuilder = this.underlyingContact.copyOfBuilder();
        if (list == null) {
            list = ch3.m21246k();
        }
        Contact contactBuild = copyOfBuilder.userDefinedTags(list).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void setWaChannelId(String str) {
        sq8.m48649h(str, "waChannelId");
        Contact contactBuild = this.underlyingContact.copyOfBuilder().waChatChannelId(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    public final void set_addedBusiness(BusinessSummary businessSummary) {
        this._addedBusiness = businessSummary;
    }

    public final Leads toLeads() {
        return toLeads(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LeadsSummary(Contact contact) {
        BusinessSummary businessSummary;
        Stream<ContactBusinessMembership> stream;
        Optional<ContactBusinessMembership> optionalFindFirst;
        sq8.m48649h(contact, "underlyingContact");
        this.underlyingContact = contact;
        this._hideLeadSource = wi0.A0();
        List<ContactBusinessMembership> businesses = this.underlyingContact.getBusinesses();
        if (businesses == null || (stream = businesses.stream()) == null) {
            businessSummary = null;
        } else {
            final C02451 c02451 = C02451.INSTANCE;
            Stream<ContactBusinessMembership> streamFilter = stream.filter(new Predicate() { // from class: o.e8a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return LeadsSummary._init_$lambda$0(c02451, obj);
                }
            });
            if (streamFilter != null && (optionalFindFirst = streamFilter.findFirst()) != null) {
                final C02462 c02462 = C02462.INSTANCE;
                Optional<U> map = optionalFindFirst.map(new Function() { // from class: o.f8a
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return LeadsSummary._init_$lambda$1(c02462, obj);
                    }
                });
                if (map != 0) {
                    businessSummary = (BusinessSummary) map.orElse(null);
                }
            }
        }
        this._addedBusiness = businessSummary;
        CallDirection lastCallDirection = this.underlyingContact.getLastCallDirection();
        this.lastCallDirection = lastCallDirection != null ? lastCallDirection.name() : null;
        this.lastCallUserId = this.underlyingContact.getLastCallUserId();
        this.lastCallOutcome = this.underlyingContact.getLastCallOutcome();
        this.lastCallEngagementId = this.underlyingContact.getLastCallEngagementId();
        this.lastVisitUserId = this.underlyingContact.getLastVisitUserId();
        this.lastVisitOutcome = this.underlyingContact.getLastVisitOutcome();
        this.lastVisitEngagementId = this.underlyingContact.getLastVisitEngagementId();
        this.lastEmailUserId = this.underlyingContact.getLastEmailUserId();
        this.lastEmailEngagementId = this.underlyingContact.getLastEmailEngagementId();
        this.lastWhatsappUserId = this.underlyingContact.getLastWhatsappUserId();
        this.lastWhatsappEngagementId = this.underlyingContact.getLastWhatsappEngagementId();
        this.lastNoteUserId = this.underlyingContact.getLastNoteUserId();
        this.lastNoteEngagementId = this.underlyingContact.getLastNoteEngagementId();
        this.lastTaskDoneUserId = this.underlyingContact.getLastTaskDoneUserId();
        this.lastTaskDoneEngagementId = this.underlyingContact.getLastTaskDoneEngagementId();
        this.openTaskCount = this.underlyingContact.getOpenTaskCount();
        this.unsuccessfulCallAttempts = this.underlyingContact.getUnsuccessfulCallAttempts();
        this.lastKnownDisposition = this.underlyingContact.getLastKnownDisposition();
        this.prospectingAttempts = this.underlyingContact.getProspectingAttempts();
    }

    public final void setContactOwner(LeadsUser leadsUser) {
        sq8.m48649h(leadsUser, "leadsItemUser");
        Contact contactBuild = this.underlyingContact.copyOfBuilder().ownerId(leadsUser.getId()).build();
        sq8.m48648g(contactBuild, "build(...)");
        this.underlyingContact = contactBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Leads toLeads(boolean z) throws NumberFormatException {
        Optional<LeadsUser> optionalEmpty;
        double d;
        double d2;
        if (z) {
            optionalEmpty = getContactOwner();
        } else {
            optionalEmpty = Optional.empty();
            sq8.m48648g(optionalEmpty, "empty(...)");
        }
        String str = (String) Optional.ofNullable(getName()).orElse("");
        String str2 = (String) Optional.ofNullable(getDesignation()).orElse("");
        String companyName = getCompanyName();
        BusinessSummary addedBusiness = getAddedBusiness();
        BusinessInfo businessInfo = addedBusiness != null ? addedBusiness.toBusinessInfo() : null;
        String str3 = (String) Optional.ofNullable(getContactType()).orElse(ContactType.OTHER.name());
        final C02491 c02491 = new tpb() { // from class: ai.salesmax.model.LeadsSummary.toLeads.1
            @Override // p001o.tpb, p001o.cc9
            public Object get(Object obj) {
                return ((LeadsUser) obj).getName();
            }

            public void set(Object obj, Object obj2) {
                ((LeadsUser) obj).setName((String) obj2);
            }
        };
        String str4 = (String) optionalEmpty.map(new Function() { // from class: o.g8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary.toLeads$lambda$43(c02491, obj);
            }
        }).orElse("");
        String strOrElse = getContactOwnerId().orElse("");
        String strOrElse2 = getContactAddedById().orElse("");
        final C02502 c02502 = new tpb() { // from class: ai.salesmax.model.LeadsSummary.toLeads.2
            @Override // p001o.tpb, p001o.cc9
            public Object get(Object obj) {
                return ((LeadsUser) obj).getProfilePic();
            }

            public void set(Object obj, Object obj2) {
                ((LeadsUser) obj).setProfilePic((String) obj2);
            }
        };
        String str5 = (String) optionalEmpty.map(new Function() { // from class: o.h8a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsSummary.toLeads$lambda$44(c02502, obj);
            }
        }).orElse("");
        String str6 = (String) Optional.ofNullable(getPriority()).orElse(Priority.LOW.name());
        String contactSource = getContactSource();
        String str7 = contactSource == null ? "" : contactSource;
        String contactSourceOne = getContactSourceOne();
        String str8 = contactSourceOne == null ? "" : contactSourceOne;
        String contactSourceTwo = getContactSourceTwo();
        String str9 = contactSourceTwo == null ? "" : contactSourceTwo;
        String contactSourceThree = getContactSourceThree();
        String str10 = contactSourceThree == null ? "" : contactSourceThree;
        String bulkUploadReference = getBulkUploadReference();
        String str11 = bulkUploadReference == null ? "" : bulkUploadReference;
        ArrayList<CallLogs> callHistory = getCallHistory();
        List<String> contactNumbers = getContactNumbers();
        sq8.m48647f(contactNumbers, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        ArrayList arrayList = (ArrayList) contactNumbers;
        List<PhoneDetail> contactNumbersWithWhatsapp = getContactNumbersWithWhatsapp();
        sq8.m48647f(contactNumbersWithWhatsapp, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.PhoneDetail>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.PhoneDetail> }");
        ArrayList arrayList2 = (ArrayList) contactNumbersWithWhatsapp;
        List<String> email = getEmail();
        sq8.m48647f(email, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        ArrayList arrayList3 = (ArrayList) email;
        String id = getId();
        String primaryTeamId = getPrimaryTeamId();
        String waChannelId = getWaChannelId();
        String profilePicURL = getProfilePicURL();
        String attentionText = getAttentionText();
        LeadsAddress primaryAddress = getPrimaryAddress();
        String rawAddressText = primaryAddress != null ? primaryAddress.getRawAddressText() : null;
        String str12 = rawAddressText == null ? "" : rawAddressText;
        if (getPrimaryAddress() != null) {
            LeadsAddress primaryAddress2 = getPrimaryAddress();
            sq8.m48646e(primaryAddress2);
            if (primaryAddress2.getLatitude() != null) {
                LeadsAddress primaryAddress3 = getPrimaryAddress();
                sq8.m48646e(primaryAddress3);
                String latitude = primaryAddress3.getLatitude();
                sq8.m48646e(latitude);
                d = Double.parseDouble(latitude);
            } else {
                d = 0.0d;
            }
        }
        if (getPrimaryAddress() != null) {
            LeadsAddress primaryAddress4 = getPrimaryAddress();
            sq8.m48646e(primaryAddress4);
            if (primaryAddress4.getLongitude() != null) {
                LeadsAddress primaryAddress5 = getPrimaryAddress();
                sq8.m48646e(primaryAddress5);
                String longitude = primaryAddress5.getLongitude();
                sq8.m48646e(longitude);
                d2 = Double.parseDouble(longitude);
            } else {
                d2 = 0.0d;
            }
        }
        String secondaryTitle = getSecondaryTitle();
        Date lastCalledTime = getLastCalledTime();
        int lastCallDuration = getLastCallDuration();
        String str13 = this.lastCallDirection;
        String str14 = this.lastCallUserId;
        String str15 = this.lastCallOutcome;
        String str16 = this.lastCallEngagementId;
        Date lastVisitTime = getLastVisitTime();
        String str17 = this.lastVisitUserId;
        String str18 = this.lastVisitOutcome;
        String str19 = this.lastVisitEngagementId;
        Date lastEmailTime = getLastEmailTime();
        String str20 = this.lastEmailUserId;
        String str21 = this.lastEmailEngagementId;
        Date lastWhatsappTime = getLastWhatsappTime();
        String str22 = this.lastWhatsappUserId;
        String str23 = this.lastWhatsappEngagementId;
        Date lastNoteAddedTime = getLastNoteAddedTime();
        String str24 = this.lastNoteUserId;
        String str25 = this.lastNoteEngagementId;
        Date lastTaskDoneTime = getLastTaskDoneTime();
        String str26 = this.lastTaskDoneUserId;
        String str27 = this.lastTaskDoneEngagementId;
        Integer num = this.openTaskCount;
        Integer num2 = this.unsuccessfulCallAttempts;
        String str28 = this.lastKnownDisposition;
        Date lastKnownDispositionTime = getLastKnownDispositionTime();
        Date lastEngagementTimeFromAccount = getLastEngagementTimeFromAccount();
        Date lastEngagementTimeFromContact = getLastEngagementTimeFromContact();
        long lastLeadAssignmentDateTime = getLastLeadAssignmentDateTime();
        List<String> userDefinedTags = getUserDefinedTags();
        String freshLeadTag = getFreshLeadTag();
        String needFollowUpTag = getNeedFollowUpTag();
        Date needFollowUpTagUpdatedAt = getNeedFollowUpTagUpdatedAt();
        String activeDealStage = getActiveDealStage();
        String dealDescription = getDealDescription();
        Date activeDealStageUpdatedAt = getActiveDealStageUpdatedAt();
        String strIsCustomer = isCustomer();
        Date becameCustomerOn = getBecameCustomerOn();
        String latestRemark = getLatestRemark();
        String customAttributes = getCustomAttributes();
        CustomFormDataObservable customFormDataObservable = new CustomFormDataObservable(getCustomAttributes());
        String leadLifecycleStage = getLeadLifecycleStage();
        String leadLifecycleStageSubCategory = getLeadLifecycleStageSubCategory();
        String lastDealStageType = getLastDealStageType();
        Integer num3 = this.prospectingAttempts;
        Date firstProspectingDoneOn = getFirstProspectingDoneOn();
        Date lastProspectingDoneOn = getLastProspectingDoneOn();
        Date nextProspectingDueOn = getNextProspectingDueOn();
        String nextProspectingSetBy = getNextProspectingSetBy();
        String nextProspectingNote = getNextProspectingNote();
        List<RecentAction> recentActions = getRecentActions();
        VideoMeeting openVideoMeeting = getOpenVideoMeeting();
        OpenTaskDetail openTaskDetail = getOpenTaskDetail();
        PaymentDetail paymentDetail = getPaymentDetail();
        String customDataAddedFromAddContactForm = getCustomDataAddedFromAddContactForm();
        String manuallyClosedReason = getManuallyClosedReason();
        Long updatedAt = getUpdatedAt();
        Long createdAt = getCreatedAt();
        List<LeadsBusiness> company = getCompany();
        ArrayList arrayList4 = new ArrayList(dh3.m23088v(company, 10));
        Iterator<T> it = company.iterator();
        while (it.hasNext()) {
            String companyId = ((LeadsBusiness) it.next()).getCompanyId();
            if (companyId == null) {
                companyId = "";
            }
            arrayList4.add(companyId);
        }
        String str29 = null;
        sq8.m48646e(str);
        sq8.m48646e(str2);
        sq8.m48646e(str3);
        sq8.m48646e(str4);
        sq8.m48646e(strOrElse);
        sq8.m48646e(strOrElse2);
        sq8.m48646e(str5);
        sq8.m48646e(str6);
        return new Leads(str29, str29, str29, str, str2, companyName, businessInfo, str3, str4, strOrElse, strOrElse2, str7, str8, str9, str10, str5, str6, str12, d, d2, str11, true, waChannelId, callHistory, arrayList, arrayList2, arrayList3, id, primaryTeamId, "", profilePicURL, false, false, false, attentionText, secondaryTitle, customDataAddedFromAddContactForm, null, lastCalledTime, lastCallDuration, str13, str14, str15, str16, lastVisitTime, str17, str18, str19, lastEmailTime, str20, str21, lastWhatsappTime, str22, str23, lastNoteAddedTime, str24, str25, lastTaskDoneTime, str26, str27, num, num2, str28, lastKnownDispositionTime, lastEngagementTimeFromAccount, lastEngagementTimeFromContact, lastLeadAssignmentDateTime, userDefinedTags, freshLeadTag, needFollowUpTag, needFollowUpTagUpdatedAt, activeDealStage, activeDealStageUpdatedAt, dealDescription, strIsCustomer, becameCustomerOn, latestRemark, customAttributes, customFormDataObservable, leadLifecycleStage, leadLifecycleStageSubCategory, lastDealStageType, num3, firstProspectingDoneOn, lastProspectingDoneOn, nextProspectingDueOn, nextProspectingSetBy, nextProspectingNote, manuallyClosedReason, recentActions, openVideoMeeting, openTaskDetail, paymentDetail, arrayList4, updatedAt, createdAt, -2147483641, 35, 0, null);
    }

    public /* synthetic */ LeadsSummary(Contact contact, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : contact);
    }
}
