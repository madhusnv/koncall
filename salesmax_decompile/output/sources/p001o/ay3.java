package p001o;

import com.amazonaws.amplify.generated.graphql.CreateContactWithNumberMutation;
import com.amazonaws.amplify.generated.graphql.CreateEntityActionDefinitionMutation;
import com.amazonaws.amplify.generated.graphql.DeleteContactNumberMutation;
import com.amazonaws.amplify.generated.graphql.RechurnLeadMutation;
import com.amazonaws.amplify.generated.graphql.UpdateContactMutation;
import com.amazonaws.amplify.generated.graphql.UpdateContactWithNumberMutation;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.Address;
import com.amplifyframework.datastore.generated.model.Business;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.ContactNumber;
import com.amplifyframework.datastore.generated.model.ContactNumberDetail;
import com.amplifyframework.datastore.generated.model.Email;
import com.amplifyframework.datastore.generated.model.EntityActionDefinition;
import com.amplifyframework.rx.RxAmplify;
import com.google.gson.Gson;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import type.AddressInput;
import type.ContactAssignmentStatus;
import type.ContactNumberDetailInput;
import type.ContactNumberType;
import type.ContactStatus;
import type.CreateBusinessInputShort;
import type.CreateContactInput;
import type.CreateContactWithNumberInput;
import type.CreateEntityActionDefinitionInput;
import type.DeleteContactNumberInput;
import type.EmailInput;
import type.LeadLifecycleStage;
import type.LeadLifecycleStageSubCategory;
import type.SegmentInput;
import type.UpdateContactInput;
import type.UpdateContactWithNumberInput;

/* loaded from: classes.dex */
public interface ay3 extends me1 {
    static /* synthetic */ boolean Cz(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Contact Fp(Map map) {
        return (Contact) sf(map, Contact.class);
    }

    static /* synthetic */ boolean Fz(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ Map G9(Map map) {
        return (Map) map.get("createContactWithNumber");
    }

    static /* synthetic */ Map Jl(Map map) {
        return (Map) map.get("rechurnLead");
    }

    static /* synthetic */ void Jm(Map map, Map map2) {
        map.put("businesses", (List) map2.get("items"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c K9(SimpleGraphQLRequest simpleGraphQLRequest, Boolean bool) {
        return !bool.booleanValue() ? x6c.m55694H(new RuntimeException("The account subscription has expired")) : RxAmplify.API.mutate(simpleGraphQLRequest).m55014i(new wx3(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.ex3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ay3.V8((Map) obj);
            }
        }).m27844k(new zx3(this)).m27844k(new rl7() { // from class: o.fx3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f24236a.nb((Map) obj);
            }
        }).m27846n();
    }

    static /* synthetic */ boolean Ld(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ EmailInput Mb(Email email) {
        return EmailInput.builder().email(email.getEmail()).fullName(email.getFullName()).isDisposableEmail(email.getIsDisposableEmail()).isPublicEmail(email.getIsPublicEmail()).isPrimary(email.getIsPrimary()).isVerified(email.getIsVerified()).isValid(email.getIsValid()).build();
    }

    static /* synthetic */ boolean Ne(Business business) {
        return (StringUtils.isBlank(business.getId()) && StringUtils.isBlank(business.getName())) ? false : true;
    }

    static /* synthetic */ Boolean P7(EntityActionDefinition entityActionDefinition) {
        return Boolean.TRUE;
    }

    static /* synthetic */ Map Py(Map map) {
        return (Map) map.get("createContactWithNumber");
    }

    static /* synthetic */ void Q7(String str, UpdateContactWithNumberInput.Builder builder, Business business) {
        final CreateBusinessInputShort.Builder builder2 = CreateBusinessInputShort.builder();
        Optional optionalOfNullable = Optional.ofNullable(str);
        Objects.requireNonNull(builder2);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.jw3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder2.accountId((String) obj);
            }
        });
        Optional.ofNullable(business.getIndustry()).ifPresent(new kw3(builder2));
        Optional.of(business.getId()).ifPresent(new lw3(builder2));
        Optional.ofNullable(business.getName()).ifPresent(new mw3(builder2));
        Optional.ofNullable(business.getWebsite()).filter(new Predicate() { // from class: o.nw3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.k7((String) obj);
            }
        }).ifPresent(new ow3(builder2));
        Optional.ofNullable(business.getPriority()).ifPresent(new qw3(builder2));
        builder.updateBusinessInput(builder2.build());
    }

    static /* synthetic */ AddressInput Qz(Address address) {
        return AddressInput.builder().addressType((String) Optional.ofNullable(address.getAddressType()).orElse("OFFICE")).area(address.getArea()).city(address.getCity()).country(address.getCountry()).establishmentName(address.getEstablishmentName()).isPrimaryAddress(address.getIsPrimaryAddress()).streetAddress(address.getStreetAddress()).rawAddressText(address.getRawAddressText()).streetAddress(address.getStreetAddress()).landmark(address.getLandmark()).lat(address.getLat()).googlePlaceId(address.getGooglePlaceId()).lng(address.getLng()).region(address.getRegion()).state(address.getState()).zipcode(address.getZipcode()).build();
    }

    static /* synthetic */ boolean Sh(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean Sl(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ Map Ug(Map map) {
        return (Map) map.get("updateContact");
    }

    static /* synthetic */ Map V8(Map map) {
        return (Map) map.get("updateContactWithNumber");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Z9(SimpleGraphQLRequest simpleGraphQLRequest, Boolean bool) {
        return !bool.booleanValue() ? x6c.m55694H(new RuntimeException("The account subscription has expired")) : RxAmplify.API.mutate(simpleGraphQLRequest).m55014i(new wx3(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.gx3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ay3.G9((Map) obj);
            }
        }).m27844k(new zx3(this)).m27844k(new rl7() { // from class: o.hx3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f27752a.Fp((Map) obj);
            }
        }).m27846n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Contact ag(Map map) {
        return (Contact) sf(map, Contact.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c bm(SimpleGraphQLRequest simpleGraphQLRequest, Boolean bool) {
        return !bool.booleanValue() ? x6c.m55694H(new RuntimeException("The account subscription has expired")) : RxAmplify.API.mutate(simpleGraphQLRequest).m55014i(new wx3(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.mx3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ay3.Ug((Map) obj);
            }
        }).m27844k(new zx3(this)).m27844k(new rl7() { // from class: o.nx3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f37382a.ag((Map) obj);
            }
        }).m27846n();
    }

    static /* synthetic */ Boolean bz(EntityActionDefinition entityActionDefinition) {
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Contact d9(Map map) {
        return (Contact) sf(map, Contact.class);
    }

    static /* synthetic */ boolean dx(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ContactNumber e5(DeleteContactNumberMutation.DeleteContactNumber deleteContactNumber) {
        return (ContactNumber) sf(deleteContactNumber, ContactNumber.class);
    }

    static /* synthetic */ EmailInput fq(String str) {
        return EmailInput.builder().email(str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Contact h0(Map map) {
        return (Contact) sf(map, Contact.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: if, reason: not valid java name */
    /* synthetic */ default x8c m68985if(Contact contact, Business business, String str) {
        if (StringUtils.isBlank(str)) {
            str = null;
        }
        String id = uni.kC().SB().m39171u().getId();
        String strM16653h = a81.m16653h(Long.valueOf(System.currentTimeMillis()));
        List<String> list = (List) ((List) Optional.ofNullable(contact.getContactNumberDetail()).orElse(Collections.emptyList())).stream().map(new rw3()).collect(Collectors.toList());
        final CreateContactInput.Builder builderLastLeadAssignmentDateTime = CreateContactInput.builder().accountId(on()).primaryTeamId((String) Optional.ofNullable(contact.getPrimaryTeamId()).orElse(str)).contactStatus((ContactStatus) Optional.ofNullable(contact.getContactStatus()).map(new av3()).map(new bv3()).orElse(null)).accountPriority((String) Optional.ofNullable(contact.getAccountPriority()).orElse(null)).addresses(s6(contact)).name(contact.getName()).department(contact.getDepartment()).designation(contact.getDesignation()).emails(m1(contact)).ownerId(id).profilePhotoUrl(contact.getProfilePhotoUrl()).userDefinedTags(contact.getUserDefinedTags()).contactSource(contact.getContactSource()).lastLeadAssignmentDateTime(strM16653h);
        Optional optionalFilter = Optional.ofNullable(contact.getId()).filter(new Predicate() { // from class: o.xw3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.zu((String) obj);
            }
        });
        Objects.requireNonNull(builderLastLeadAssignmentDateTime);
        optionalFilter.ifPresent(new Consumer() { // from class: o.yw3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLastLeadAssignmentDateTime.id((String) obj);
            }
        });
        Optional.ofNullable(contact.getCustomDataAddedFromAddContactForm()).filter(new Predicate() { // from class: o.zw3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.dx((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.bx3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLastLeadAssignmentDateTime.customDataAddedFromAddContactForm((String) obj);
            }
        });
        Optional.ofNullable(contact.getNextProspectingDueOn()).map(new ri()).ifPresent(new Consumer() { // from class: o.cx3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLastLeadAssignmentDateTime.nextProspectingDueOn((String) obj);
            }
        });
        Optional.ofNullable(contact.getNextProspectingSetBy()).filter(new Predicate() { // from class: o.dx3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.Fz((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.sw3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLastLeadAssignmentDateTime.nextProspectingSetBy((String) obj);
            }
        });
        CreateContactInput createContactInputBuild = builderLastLeadAssignmentDateTime.build();
        Optional map = Optional.ofNullable(business).filter(new Predicate() { // from class: o.tw3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.Ne((Business) obj);
            }
        }).map(new Function() { // from class: o.uw3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f49565a.sy((Business) obj);
            }
        });
        final CreateContactWithNumberInput.Builder builderCreateContactInput = CreateContactWithNumberInput.builder().createContactInput(createContactInputBuild);
        Objects.requireNonNull(builderCreateContactInput);
        map.ifPresent(new Consumer() { // from class: o.vw3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderCreateContactInput.createBusinessInput((CreateBusinessInputShort) obj);
            }
        });
        if (list.size() >= 1) {
            builderCreateContactInput = builderCreateContactInput.contactNumbers(list);
        }
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest("mutation CreateContactWithNumber($input: CreateContactWithNumberInput!) {\n  createContactWithNumber(input: $input) {    id\n    ownerId\n    contactNumberDetail {\n      isWhatsappNumber\n      phoneNumber\n    }\n    contactSource\n    profilePhotoUrl\n    emails {\n      email\n    }\n    name\n    activeDealStage\n    userDefinedTags\n    isCustomer\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    unsuccessfulCallAttempts\n    recentEngagements\n    customAttributes\n    lastCalledTime\n    updatedAt\n    latestRemark\n}\n}", toVariablesMap(CreateContactWithNumberMutation.builder().input(builderCreateContactInput.build()).build()), Map.class, new GsonVariablesSerializer());
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.ww3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f52791a.Z9(simpleGraphQLRequest, (Boolean) obj);
            }
        });
    }

    static /* synthetic */ boolean k7(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean kr(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Contact nb(Map map) {
        return (Contact) sf(map, Contact.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c o2(SimpleGraphQLRequest simpleGraphQLRequest, Boolean bool) {
        return !bool.booleanValue() ? x6c.m55694H(new RuntimeException("The account subscription has expired")) : RxAmplify.API.mutate(simpleGraphQLRequest).m55014i(new wx3(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.jx3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ay3.Py((Map) obj);
            }
        }).m27844k(new zx3(this)).m27844k(new rl7() { // from class: o.kx3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f32779a.h0((Map) obj);
            }
        }).m27846n();
    }

    static /* synthetic */ boolean pk(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ boolean q4(Email email) {
        return !StringUtils.isBlank(email.getEmail());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default CreateBusinessInputShort sy(Business business) {
        CreateBusinessInputShort.Builder builderAccountId = CreateBusinessInputShort.builder().accountId(on());
        Optional optionalOfNullable = Optional.ofNullable(business.getName());
        Objects.requireNonNull(builderAccountId);
        optionalOfNullable.ifPresent(new mw3(builderAccountId));
        Optional.ofNullable(business.getIndustry()).ifPresent(new kw3(builderAccountId));
        Optional.ofNullable(business.getWebsite()).filter(new Predicate() { // from class: o.tx3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.Sl((String) obj);
            }
        }).ifPresent(new ow3(builderAccountId));
        Optional.ofNullable(business.getPriority()).ifPresent(new qw3(builderAccountId));
        Optional.ofNullable(business.getId()).filter(new Predicate() { // from class: o.ux3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.Ld((String) obj);
            }
        }).ifPresent(new lw3(builderAccountId));
        return builderAccountId.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c ug(SimpleGraphQLRequest simpleGraphQLRequest, Boolean bool) {
        return !bool.booleanValue() ? x6c.m55694H(new RuntimeException("The account subscription has expired")) : RxAmplify.API.mutate(simpleGraphQLRequest).m55014i(new wx3(this)).m27844k(new rl7() { // from class: o.ox3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (DeleteContactNumberMutation.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.px3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((DeleteContactNumberMutation.Data) obj).deleteContactNumber();
            }
        }).m27844k(new rl7() { // from class: o.qx3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f42546a.e5((DeleteContactNumberMutation.DeleteContactNumber) obj);
            }
        }).m27846n();
    }

    static /* synthetic */ boolean uj(String str) {
        return !StringUtils.isBlank(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c uq(SimpleGraphQLRequest simpleGraphQLRequest, Boolean bool) {
        return !bool.booleanValue() ? x6c.m55694H(new RuntimeException("The account subscription has expired")) : RxAmplify.API.mutate(simpleGraphQLRequest).m55014i(new wx3(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.yx3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ay3.Jl((Map) obj);
            }
        }).m27844k(new zx3(this)).m27844k(new rl7() { // from class: o.yu3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f56061a.d9((Map) obj);
            }
        }).m27846n();
    }

    static /* synthetic */ UpdateContactInput ve(String str, String str2, String str3) {
        return UpdateContactInput.builder().id(str3).leadLifecycleStage(LeadLifecycleStage.CLOSED).leadLifecycleStageSubCategory(LeadLifecycleStageSubCategory.CLOSED_MANUAL).manualClosedReason(str).movedToClosedOn(str2).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x6c vi(UpdateContactInput updateContactInput) {
        return Ch(updateContactInput, Optional.empty());
    }

    static /* synthetic */ Boolean vk(EntityActionDefinition entityActionDefinition) {
        return Boolean.TRUE;
    }

    static /* synthetic */ ContactNumberDetailInput w9(ContactNumberDetail contactNumberDetail) {
        return ContactNumberDetailInput.builder().contactNumberType(ContactNumberType.valueOf((String) Optional.ofNullable(contactNumberDetail.getContactNumberType()).map(new Function() { // from class: o.xx3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((com.amplifyframework.datastore.generated.model.ContactNumberType) obj).name();
            }
        }).orElse(ContactNumberType.MOBILE.name()))).isPrimary(contactNumberDetail.getIsPrimary()).phoneNumber(contactNumberDetail.getPhoneNumber()).isWrongNumber(contactNumberDetail.getIsWrongNumber()).isValid(contactNumberDetail.getIsValid()).isVerified(contactNumberDetail.getIsVerified()).build();
    }

    static /* synthetic */ boolean zu(String str) {
        return !StringUtils.isBlank(str);
    }

    default x6c Ch(UpdateContactInput updateContactInput, Optional optional) {
        if (ce().booleanValue()) {
            return x6c.m55694H(new RuntimeException("Can't update contacts into local personal account"));
        }
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest("mutation UpdateContact($input: UpdateContactInput!, $condition: ModelContactConditionInput) {\n  updateContact(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    ownerId\n    toBeAssigned\n    sharedOwners\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    sharedTeams\n    accountPriority\n    addedById\n    addresses {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    blockedForCallReason\n    blockedForCallUntil\n    callPriority\n    contactNumberDetail {\n      __typename\n      contactNumberType\n      isPrimary\n      isValid\n      isWhatsappNumber\n      isVerified\n      isWrongNumber\n      phoneNumber\n    }\n    contactSource\n    contactSourceDrillDownOne\n    contactSourceDrillDownTwo\n    bulkUploadReference\n    contactStatus\n    contactType\n    department\n    designation\n    emails {\n      __typename\n      email\n      fullName\n      isDisposableEmail\n      isPrimary\n      isPublicEmail\n      isValid\n      isVerified\n    }\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n    }\n    businesses {\n        items {\n          businessId\n          contactId\n          contactRelationship\n          createdAt\n          department\n          business {\n            name\n            logo\n            industry\n            id\n            priority\n            updatedAt\n            accountId\n            addresses {\n              addressType\n              area\n              city\n              country\n              establishmentName\n              googlePlaceId\n              isPrimaryAddress\n              rawAddressText\n              region\n              state\n              streetAddress\n              zipcode\n              landmark\n              lat\n              lng\n            }\n            website\n            updatedById\n            addedById\n          }\n        }\n    }\n    gender\n    waChatChannelId\n    isDecisionMaker\n    isPrivate\n    lockPeriod\n    name\n    preferredContactDays\n    profilePhotoUrl\n    referredBy\n    salutation\n    seniority\n    updatedById\n    hasTask\n    openTaskActivityType\n    lastCalledTime\n    lastCallDirection\n    lastCallOutcome\n    lastCallUserId\n    lastCallDuration\n    lastCallEngagementId\n    lastVisitTime\n    lastVisitOutcome\n    lastVisitUserId\n    lastVisitEngagementId\n    lastEmailTime\n    lastEmailUserId\n    lastEmailEngagementId\n    lastWhatsappTime\n    lastWhatsappUserId\n    lastWhatsappEngagementId\n    lastNoteAddedTime\n    lastNoteUserId\n    lastNoteEngagementId\n    lastTaskDoneTime\n    lastTaskDoneUserId\n    lastTaskDoneEngagementId\n    openTaskCount\n    lastKnownDisposition\n    lastKnownDispositionTime\n    lastEngagementFromAccount\n    lastEngagementFromContact\n    freshLeadTag\n    needFollowUpTag\n    needFollowUpTagUpdatedAt\n    activeDealStage\n    dealDescription\n    activeDealStageUpdatedAt\n    unsuccessfulCallAttempts\n    userDefinedTags\n    customDataAddedFromAddContactForm\n    isCustomer\n    becameCustomerOn\n    latestRemark\n    customAttributes\n    paymentRequestDetail\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    manualClosedReason\n    lastDealStageType\n    prospectingAttempts\n    lastProspectingDoneOn\n    nextProspectingDueOn\n    nextProspectingNote\n    recentEngagements\n    openVideoCallDetail\n    openTaskDetail\n    createdAt\n    updatedAt\n  }\n}", toVariablesMap(UpdateContactMutation.builder().input(updateContactInput).build()), Map.class, new GsonVariablesSerializer());
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.pv3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f40648a.bm(simpleGraphQLRequest, (Boolean) obj);
            }
        });
    }

    default x6c Eg(Contact contact, List list) {
        String id = uni.kC().SB().m39171u().getId();
        final UpdateContactInput.Builder builderUpdatedAt = UpdateContactInput.builder().id(contact.getId()).updatedById(id).accountId(on()).name(contact.getName()).userDefinedTags(list).updatedAt(a81.m16653h(Long.valueOf(System.currentTimeMillis())));
        Optional optionalOfNullable = Optional.ofNullable(contact.getOwnerId());
        Objects.requireNonNull(builderUpdatedAt);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.lx3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUpdatedAt.ownerId((String) obj);
            }
        });
        return Ch(builderUpdatedAt.build(), Optional.empty());
    }

    default x6c Hg(List list, boolean z) {
        CreateEntityActionDefinitionInput.Builder builder = CreateEntityActionDefinitionInput.builder();
        builder.accountId(on());
        builder.ownerId(Eo());
        builder.action("PURGE_GRAPH");
        builder.name(String.format("Contact Delete %s", a81.m16652g(a81.m16641B())));
        builder.subscriptionType("ADHOC");
        builder.status("REQUESTED");
        builder.createdBy(Eo());
        builder.updatedBy(Eo());
        Map mapSingletonMap = Collections.singletonMap("doNotTrack", Boolean.valueOf(z));
        Gson gson = ja8.f30035c;
        builder.target(gson.toJson(mapSingletonMap));
        Map mapSingletonMap2 = Collections.singletonMap("and", Arrays.asList(Collections.singletonMap("accountId", Collections.singletonMap("eq", on())), Collections.singletonMap(OutcomeConstants.OUTCOME_ID, Collections.singletonMap("IN", list))));
        SegmentInput.Builder builder2 = SegmentInput.builder();
        builder2.joinStatement("Contact");
        builder2.defaultTableName("contact");
        builder2.criteria(gson.toJson(mapSingletonMap2));
        builder.segment(builder2.build());
        return graphqlMutation(CreateEntityActionDefinitionMutation.builder().input(builder.build()).build(), CreateEntityActionDefinitionMutation.Data.class, new uh(), EntityActionDefinition.class).d0(new rl7() { // from class: o.xu3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ay3.P7((EntityActionDefinition) obj);
            }
        });
    }

    default Map Ik(final Map map) {
        Optional.ofNullable((Map) map.get("businesses")).ifPresent(new Consumer() { // from class: o.nv3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ay3.Jm(map, (Map) obj);
            }
        });
        return map;
    }

    /* renamed from: Jx, reason: merged with bridge method [inline-methods] */
    default x6c Tr(String str, String str2, String str3, List list, List list2, String str4, Long l, Boolean bool) {
        if (ce().booleanValue()) {
            return x6c.m55694H(new RuntimeException("Can't add contacts into local personal account"));
        }
        String strM16653h = a81.m16653h(l);
        final CreateContactInput.Builder builderName = CreateContactInput.builder().accountId(on()).ownerId(str).contactType("CLIENT").contactStatus(ContactStatus.ACTIVE).name(str3);
        if (l.longValue() > 0) {
            builderName.lastLeadAssignmentDateTime(strM16653h).toBeAssigned(ContactAssignmentStatus.ASSIGNED);
        } else {
            builderName.toBeAssigned(ContactAssignmentStatus.UNASSIGNED);
        }
        Optional optionalFilter = Optional.ofNullable(str4).filter(new Predicate() { // from class: o.jv3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.uj((String) obj);
            }
        });
        Objects.requireNonNull(builderName);
        optionalFilter.ifPresent(new Consumer() { // from class: o.kv3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderName.contactSource((String) obj);
            }
        });
        if (!StringUtils.isBlank(str2)) {
            builderName = builderName.primaryTeamId(str2);
        }
        if (list != null && list.size() >= 1) {
            builderName = builderName.emails((List) list.stream().map(new Function() { // from class: o.lv3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ay3.fq((String) obj);
                }
            }).collect(Collectors.toList()));
        }
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest("mutation CreateContactWithNumber($input: CreateContactWithNumberInput!) {\n  createContactWithNumber(input: $input) {    id\n    ownerId\n    contactNumberDetail {\n      isWhatsappNumber\n      phoneNumber\n    }\n    contactSource\n    profilePhotoUrl\n    emails {\n      email\n    }\n    name\n    activeDealStage\n    userDefinedTags\n    isCustomer\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    unsuccessfulCallAttempts\n    recentEngagements\n    customAttributes\n    lastCalledTime\n    updatedAt\n    latestRemark\n}\n}", toVariablesMap(CreateContactWithNumberMutation.builder().input(CreateContactWithNumberInput.builder().contactNumbers(list2).createContactInput(builderName.build()).doNotCreateOnlyGet(Boolean.valueOf(true ^ bool.booleanValue())).build()).build()), Map.class, new GsonVariablesSerializer());
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.mv3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f36022a.o2(simpleGraphQLRequest, (Boolean) obj);
            }
        });
    }

    default UpdateContactInput So(Contact contact) {
        String id = uni.kC().SB().m39171u().getId();
        List<ContactNumberDetailInput> listQm = qm(contact);
        final UpdateContactInput.Builder builderUpdatedAt = UpdateContactInput.builder().id(contact.getId()).updatedById(id).contactNumberDetail(listQm).accountId(on()).contactStatus((ContactStatus) Optional.ofNullable(contact.getContactStatus()).map(new av3()).map(new bv3()).orElse(null)).accountPriority((String) Optional.ofNullable(contact.getAccountPriority()).orElse(null)).addresses(s6(contact)).name(contact.getName()).department(contact.getDepartment()).designation(contact.getDesignation()).profilePhotoUrl(contact.getProfilePhotoUrl()).userDefinedTags(contact.getUserDefinedTags()).emails(m1(contact)).contactSource(contact.getContactSource()).updatedAt(a81.m16653h(Long.valueOf(System.currentTimeMillis())));
        Optional map = Optional.ofNullable(contact.getNextProspectingDueOn()).map(new ri());
        Objects.requireNonNull(builderUpdatedAt);
        map.ifPresent(new Consumer() { // from class: o.cv3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUpdatedAt.nextProspectingDueOn((String) obj);
            }
        });
        Optional.ofNullable(contact.getNextProspectingSetBy()).ifPresent(new Consumer() { // from class: o.dv3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUpdatedAt.nextProspectingSetBy((String) obj);
            }
        });
        Optional.ofNullable(contact.getCustomDataAddedFromAddContactForm()).filter(new Predicate() { // from class: o.ev3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.Sh((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.fv3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUpdatedAt.customDataAddedFromAddContactForm((String) obj);
            }
        });
        Optional.ofNullable(contact.getCustomAttributes()).filter(new Predicate() { // from class: o.gv3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.pk((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.hv3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderUpdatedAt.customAttributes((String) obj);
            }
        });
        return builderUpdatedAt.build();
    }

    default x6c b8(List list, String str, boolean z) {
        CreateEntityActionDefinitionInput.Builder builder = CreateEntityActionDefinitionInput.builder();
        builder.accountId(on());
        builder.ownerId(Eo());
        builder.action("MOVE_LEAD_LIFECYCLE");
        builder.name(String.format("Contact Lifecycle Change %s", a81.m16652g(a81.m16641B())));
        builder.subscriptionType("ADHOC");
        builder.status("REQUESTED");
        builder.createdBy(Eo());
        builder.updatedBy(Eo());
        HashMap map = new HashMap();
        map.put("nextLifecycleStateStage", LeadLifecycleStage.CLOSED);
        map.put("manualClosedReason", str);
        map.put("nextLifecycleStateStageSubCategory", LeadLifecycleStageSubCategory.CLOSED_MANUAL);
        if (z) {
            map.put("isCustomer", Boolean.TRUE);
            map.put("manualClosedReason", "Already a customer");
        }
        Gson gson = ja8.f30035c;
        builder.target(gson.toJson(map));
        Map mapSingletonMap = Collections.singletonMap("and", Arrays.asList(Collections.singletonMap("accountId", Collections.singletonMap("eq", on())), Collections.singletonMap(OutcomeConstants.OUTCOME_ID, Collections.singletonMap("IN", list))));
        SegmentInput.Builder builder2 = SegmentInput.builder();
        builder2.joinStatement("Contact");
        builder2.defaultTableName("contact");
        builder2.criteria(gson.toJson(mapSingletonMap));
        builder.segment(builder2.build());
        return graphqlMutation(CreateEntityActionDefinitionMutation.builder().input(builder.build()).build(), CreateEntityActionDefinitionMutation.Data.class, new uh(), EntityActionDefinition.class).d0(new rl7() { // from class: o.zu3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ay3.vk((EntityActionDefinition) obj);
            }
        });
    }

    default x6c gh(final String str, final List list, final List list2, final String str2, final Long l, final Boolean bool) {
        final String id = uni.kC().SB().m39171u().getId();
        return tn().m55717M(new rl7() { // from class: o.ew3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f22235a.Tr(id, str, list, list2, str2, l, bool, (String) obj);
            }
        });
    }

    default x6c i2(List list, final String str) {
        final String strM16653h = a81.m16653h(Long.valueOf(System.currentTimeMillis()));
        return x6c.e0((List) list.stream().map(new Function() { // from class: o.qv3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ay3.ve(str, strM16653h, (String) obj);
            }
        }).map(new Function() { // from class: o.rv3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f44129a.vi((UpdateContactInput) obj);
            }
        }).collect(Collectors.toList())).m55733m(new ArrayList(), new eh1() { // from class: o.sv3
            @Override // p001o.eh1
            public final void accept(Object obj, Object obj2) {
                ((List) obj).add((Contact) obj2);
            }
        }).m55027y();
    }

    default x6c ib(String str) {
        if (ce().booleanValue()) {
            return x6c.m55694H(new RuntimeException("Can't delete contacts from local personal account"));
        }
        DeleteContactNumberMutation deleteContactNumberMutationBuild = DeleteContactNumberMutation.builder().input(DeleteContactNumberInput.builder().id(str).build()).build();
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest(deleteContactNumberMutationBuild.queryDocument(), toVariablesMap(deleteContactNumberMutationBuild), DeleteContactNumberMutation.Data.class, new GsonVariablesSerializer());
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.ov3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f38958a.ug(simpleGraphQLRequest, (Boolean) obj);
            }
        });
    }

    default x6c l9(String str, String str2) {
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest("mutation RechurnLead($idToRechurn: ID!, $accountId: ID!, $rechurnTrigger: String) {\n  rechurnLead(idToRechurn: $idToRechurn, accountId: $accountId, rechurnTrigger: $rechurnTrigger) {\n    __typename\n    id\n    accountId\n    ownerId\n    toBeAssigned\n    sharedOwners\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    sharedTeams\n    accountPriority\n    addedById\n    addresses {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    blockedForCallReason\n    blockedForCallUntil\n    callPriority\n    contactNumberDetail {\n      __typename\n      contactNumberType\n      isPrimary\n      isValid\n      isWhatsappNumber\n      isVerified\n      isWrongNumber\n      phoneNumber\n    }\n    contactSource\n    contactSourceDrillDownOne\n    contactSourceDrillDownTwo\n    bulkUploadReference\n    contactStatus\n    contactType\n    department\n    designation\n    emails {\n      __typename\n      email\n      fullName\n      isDisposableEmail\n      isPrimary\n      isPublicEmail\n      isValid\n      isVerified\n    }\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n    }\n    businesses {\n        items {\n          businessId\n          contactId\n          contactRelationship\n          createdAt\n          department\n          business {\n            name\n            logo\n            industry\n            id\n            priority\n            updatedAt\n            accountId\n            addresses {\n              addressType\n              area\n              city\n              country\n              establishmentName\n              googlePlaceId\n              isPrimaryAddress\n              rawAddressText\n              region\n              state\n              streetAddress\n              zipcode\n              landmark\n              lat\n              lng\n            }\n            website\n            updatedById\n            addedById\n          }\n        }\n    }\n    gender\n    waChatChannelId\n    isDecisionMaker\n    isPrivate\n    lockPeriod\n    name\n    preferredContactDays\n    profilePhotoUrl\n    referredBy\n    salutation\n    seniority\n    updatedById\n    hasTask\n    openTaskActivityType\n    lastCalledTime\n    lastCallDirection\n    lastCallOutcome\n    lastCallUserId\n    lastCallDuration\n    lastCallEngagementId\n    lastVisitTime\n    lastVisitOutcome\n    lastVisitUserId\n    lastVisitEngagementId\n    lastEmailTime\n    lastEmailUserId\n    lastEmailEngagementId\n    lastWhatsappTime\n    lastWhatsappUserId\n    lastWhatsappEngagementId\n    lastNoteAddedTime\n    lastNoteUserId\n    lastNoteEngagementId\n    lastTaskDoneTime\n    lastTaskDoneUserId\n    lastTaskDoneEngagementId\n    openTaskCount\n    lastKnownDisposition\n    lastKnownDispositionTime\n    lastEngagementFromAccount\n    lastEngagementFromContact\n    freshLeadTag\n    needFollowUpTag\n    needFollowUpTagUpdatedAt\n    activeDealStage\n    dealDescription\n    activeDealStageUpdatedAt\n    unsuccessfulCallAttempts\n    userDefinedTags\n    customDataAddedFromAddContactForm\n    isCustomer\n    becameCustomerOn\n    latestRemark\n    customAttributes\n    paymentRequestDetail\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    manualClosedReason\n    lastDealStageType\n    prospectingAttempts\n    lastProspectingDoneOn\n    nextProspectingDueOn\n    nextProspectingNote\n    recentEngagements\n    openVideoCallDetail\n    openTaskDetail\n    createdAt\n    updatedAt\n  }\n}", toVariablesMap(RechurnLeadMutation.builder().idToRechurn(str).accountId(on()).rechurnTrigger(str2).build()), Map.class, new GsonVariablesSerializer());
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.iv3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f29259a.uq(simpleGraphQLRequest, (Boolean) obj);
            }
        });
    }

    default List m1(Contact contact) {
        return (List) ((List) Optional.ofNullable(contact.getEmails()).orElse(Collections.emptyList())).stream().filter(new Predicate() { // from class: o.rx3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.q4((Email) obj);
            }
        }).map(new Function() { // from class: o.sx3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ay3.Mb((Email) obj);
            }
        }).collect(Collectors.toList());
    }

    default x6c n9(Contact contact, Business business) {
        UpdateContactInput updateContactInputSo = So(contact);
        final String id = (business == null || business.getAccountId() == null || business.getAccountId().isEmpty()) ? uni.kC().SB().m39156f().getId() : business.getAccountId();
        final UpdateContactWithNumberInput.Builder builderForceDuplicate = UpdateContactWithNumberInput.builder().updateContactInput(updateContactInputSo).forceDuplicate(Boolean.FALSE);
        Optional.ofNullable(business).ifPresent(new Consumer() { // from class: o.pw3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ay3.Q7(id, builderForceDuplicate, (Business) obj);
            }
        });
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest("mutation UpdateContactWithNumber($input: UpdateContactWithNumberInput!) {\n  updateContactWithNumber(input: $input) {\n    __typename\n    id\n    accountId\n    ownerId\n    toBeAssigned\n    sharedOwners\n    primaryTeamId\n    sharedTeams\n    accountPriority\n    addedById\n    addresses {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    blockedForCallReason\n    blockedForCallUntil\n    callPriority\n    contactNumberDetail {\n      __typename\n      contactNumberType\n      isPrimary\n      isValid\n      isWhatsappNumber\n      isVerified\n      isWrongNumber\n      phoneNumber\n    }\n    contactSource\n    contactStatus\n    contactType\n    department\n    designation\n    emails {\n      __typename\n      email\n      fullName\n      isDisposableEmail\n      isPrimary\n      isPublicEmail\n      isValid\n      isVerified\n    }\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n    }\n    businessDetail {\n         __typename\n         id\n         name\n         website\n         industry\n    }\n    gender\n    isDecisionMaker\n    isPrivate\n    lockPeriod\n    name\n    preferredContactDays\n    profilePhotoUrl\n    referredBy\n    salutation\n    seniority\n    updatedById\n    hasTask\n    openTaskActivityType\n    lastCalledTime\n    lastCallDirection\n    lastCallOutcome\n    lastCallUserId\n    lastCallDuration\n    lastVisitTime\n    lastVisitOutcome\n    lastVisitUserId\n    lastEmailTime\n    lastEmailUserId\n    lastKnownDisposition\n    lastEngagementFromAccount\n    lastEngagementFromContact\n    nextProspectingDueOn\n    nextProspectingSetBy\n    createdAt\n    updatedAt\n  }\n}", toVariablesMap(UpdateContactWithNumberMutation.builder().input(builderForceDuplicate.build()).build()), Map.class, new GsonVariablesSerializer());
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.ax3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f15331a.K9(simpleGraphQLRequest, (Boolean) obj);
            }
        });
    }

    default x6c p3(List list, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, ContactAssignmentStatus contactAssignmentStatus, String str3) {
        CreateEntityActionDefinitionInput.Builder builderUpdatedBy = CreateEntityActionDefinitionInput.builder().accountId(on()).ownerId(Eo()).action("TRANSFER_LEAD").name(String.format("Assign Lead %s", a81.m16652g(a81.m16641B()))).subscriptionType("ADHOC").status("REQUESTED").createdBy(Eo()).updatedBy(Eo());
        final HashMap map = new HashMap();
        Optional.ofNullable(str).filter(new Predicate() { // from class: o.uv3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.Cz((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.zv3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                map.put("assignedUser", (String) obj);
            }
        });
        Optional.ofNullable(str2).filter(new Predicate() { // from class: o.aw3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ay3.kr((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.bw3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                map.put("assignedTeam", (String) obj);
            }
        });
        Optional.ofNullable(bool).filter(new Predicate() { // from class: o.cw3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) obj).booleanValue();
            }
        }).ifPresent(new Consumer() { // from class: o.dw3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                map.put("migrateDeal", (Boolean) obj);
            }
        });
        Optional.ofNullable(bool2).filter(new Predicate() { // from class: o.fw3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) obj).booleanValue();
            }
        }).ifPresent(new Consumer() { // from class: o.gw3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                map.put("migrateEngagement", (Boolean) obj);
            }
        });
        Optional.ofNullable(bool3).filter(new Predicate() { // from class: o.hw3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) obj).booleanValue();
            }
        }).ifPresent(new Consumer() { // from class: o.iw3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                map.put("migrateChat", (Boolean) obj);
            }
        });
        Optional.ofNullable(str).ifPresent(new Consumer() { // from class: o.vv3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                map.put("assignedUser", (String) obj);
            }
        });
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.wv3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                map.put("assignedTeam", (String) obj);
            }
        });
        Optional.ofNullable(str3).ifPresent(new Consumer() { // from class: o.xv3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                map.put("assignToType", (String) obj);
            }
        });
        Gson gson = ja8.f30035c;
        builderUpdatedBy.target(gson.toJson(map));
        Map mapSingletonMap = Collections.singletonMap("and", Arrays.asList(Collections.singletonMap("accountId", Collections.singletonMap("eq", on())), Collections.singletonMap(OutcomeConstants.OUTCOME_ID, Collections.singletonMap("IN", list))));
        SegmentInput.Builder builder = SegmentInput.builder();
        builder.joinStatement("Contact");
        builder.defaultTableName("contact");
        builder.criteria(gson.toJson(mapSingletonMap));
        builderUpdatedBy.segment(builder.build());
        return graphqlMutation(CreateEntityActionDefinitionMutation.builder().input(builderUpdatedBy.build()).build(), CreateEntityActionDefinitionMutation.Data.class, new uh(), EntityActionDefinition.class).d0(new rl7() { // from class: o.yv3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ay3.bz((EntityActionDefinition) obj);
            }
        });
    }

    default List qm(Contact contact) {
        return (List) ((List) Optional.ofNullable(contact.getContactNumberDetail()).orElse(Collections.emptyList())).stream().map(new Function() { // from class: o.vx3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ay3.w9((ContactNumberDetail) obj);
            }
        }).collect(Collectors.toList());
    }

    default List s6(Contact contact) {
        return (List) ((List) Optional.ofNullable(contact.getAddresses()).orElse(Collections.emptyList())).stream().map(new Function() { // from class: o.ix3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ay3.Qz((Address) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: t */
    default x6c m17966t(final Contact contact, final Business business) {
        return ce().booleanValue() ? x6c.m55694H(new RuntimeException("Can't add contacts into local personal account")) : tn().m55717M(new rl7() { // from class: o.tv3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f47948a.m68985if(contact, business, (String) obj);
            }
        });
    }
}
