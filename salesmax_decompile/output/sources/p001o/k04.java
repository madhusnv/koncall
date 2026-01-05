package p001o;

import com.amazonaws.amplify.generated.graphql.AggregateSearchableQuery;
import com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery;
import com.amazonaws.amplify.generated.graphql.GetContactQuery;
import com.amazonaws.amplify.generated.graphql.GetUserByNumberQuery;
import com.amazonaws.amplify.generated.graphql.QueryContactListQuery;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.ModelContactConnection;
import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.datastore.generated.model.UserRegistrationStatus;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import type.ModelContactFilterInput;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;
import type.QueryContactListInput;

/* loaded from: classes.dex */
public interface k04 extends ay3 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    /* synthetic */ default Contact m34816A(Map map) {
        return (Contact) sf(map, Contact.class);
    }

    static /* synthetic */ Map A7(Map map) {
        return (Map) map.getOrDefault("contactSource", Collections.emptyMap());
    }

    static /* synthetic */ boolean B7(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ Map Dq(Map map) {
        return (Map) map.getOrDefault("aggregations", Collections.emptyMap());
    }

    static /* synthetic */ boolean Ij(List list) {
        return !list.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Optional Kk(Map map) {
        return Optional.ofNullable((Contact) sf(map, Contact.class));
    }

    static /* synthetic */ Map Ks(Map map) {
        return (Map) map.getOrDefault("contactSourceDrillDownOne", Collections.emptyMap());
    }

    static /* synthetic */ Optional Ly(Map map) {
        return Optional.ofNullable(map.get("contact"));
    }

    /* renamed from: M */
    static /* synthetic */ List m34817M(Map map) {
        return (List) map.getOrDefault("buckets", Collections.emptyList());
    }

    static /* synthetic */ String M4(Map map) {
        return (String) map.getOrDefault(TransferTable.COLUMN_KEY, "");
    }

    static /* synthetic */ RuntimeException Mz(String str) {
        return new RuntimeException(String.format("Couldn't find contact by number: %s", str));
    }

    static ModelContactConnection Ng() {
        return ModelContactConnection.builder().items(Collections.emptyList()).nextToken(null).startedAt(Temporal.Timestamp.now()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Map Oy(Map map) {
        ((List) map.get("items")).stream().forEach(new Consumer() { // from class: o.d04
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f18926a.Ik((Map) obj);
            }
        });
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default User R6(Map map) {
        Map map2 = (Map) map.get("getUserByNumber");
        if (map2 == null || !map2.containsKey("items")) {
            return null;
        }
        List list = (List) map2.get("items");
        if (list.isEmpty()) {
            return null;
        }
        return (User) sf(list.get(0), User.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default s0b Ra(List list) {
        Map map;
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            if (!Boolean.TRUE.equals(map2.getOrDefault("doNotTrack", Boolean.FALSE))) {
                arrayList.add(map2);
            }
        }
        if (arrayList.isEmpty()) {
            return g0b.m27837f(new idg() { // from class: o.uz3
                @Override // p001o.idg
                public final Object get() {
                    return new pv5();
                }
            });
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                map = null;
                break;
            }
            map = (Map) it2.next();
            Object obj2 = map.get("contact");
            if (obj2 != null && (obj = ((Map) obj2).get("ownerId")) != null && obj.toString().equals(Eo())) {
                break;
            }
        }
        if (map == null) {
            map = (Map) arrayList.get(0);
        }
        return g0b.m27838j(map);
    }

    static /* synthetic */ Map Rv(Object obj) {
        return (Map) obj;
    }

    static /* synthetic */ Object S2(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) ((Map) it.next()).get("contact");
            if (map != null && (obj = map.get("ownerId")) != null && obj.toString().equals(str)) {
                return map;
            }
        }
        return ((Map) list.get(0)).get("contact");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    /* synthetic */ default ModelContactConnection m34819T(Map map) {
        return (ModelContactConnection) sf(map, ModelContactConnection.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Contact V6(Map map) {
        return (Contact) sf(map, Contact.class);
    }

    static /* synthetic */ List Vp(Map map) {
        return (List) map.get("items");
    }

    static /* synthetic */ Map Wf(Map map) {
        return (Map) map.get("getContact");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Map Ye(Object obj) {
        return Ik((Map) obj);
    }

    static /* synthetic */ List Zu(Map map) {
        return (List) map.getOrDefault("buckets", Collections.emptyList());
    }

    static /* synthetic */ QueryContactListQuery fk(QueryContactListQuery.Builder builder, int i, String str) {
        return builder.nextToken(str).limit(Integer.valueOf(i)).build();
    }

    static /* synthetic */ Map h5(Map map) {
        return (Map) map.get("getContact");
    }

    static /* synthetic */ List kd(List list) {
        return (List) list.stream().map(new Function() { // from class: o.sz3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k04.t1((Map) obj);
            }
        }).filter(new Predicate() { // from class: o.tz3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return k04.B7((String) obj);
            }
        }).collect(Collectors.toList());
    }

    static /* synthetic */ Map mw(Map map) {
        return (Map) map.get("queryContactList");
    }

    static /* synthetic */ Map nn(Map map) {
        return (Map) map.get("getContactByNumber");
    }

    static /* synthetic */ List oy(Map map) {
        return (List) map.get("items");
    }

    static /* synthetic */ boolean sp(List list) {
        return !list.isEmpty();
    }

    static /* synthetic */ Map sz(Map map) {
        return (Map) map.get("getContactByNumber");
    }

    static /* synthetic */ String t1(Map map) {
        return (String) map.getOrDefault(TransferTable.COLUMN_KEY, "");
    }

    static /* synthetic */ boolean tx(String str) {
        return !StringUtils.isBlank(str);
    }

    static /* synthetic */ List vu(List list) {
        return (List) list.stream().map(new Function() { // from class: o.vz3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k04.M4((Map) obj);
            }
        }).filter(new Predicate() { // from class: o.wz3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return k04.tx((String) obj);
            }
        }).collect(Collectors.toList());
    }

    static /* synthetic */ Map z5(Map map) {
        return (Map) map.getOrDefault("aggregations", Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Contact zh(Map map) {
        return (Contact) sf(map, Contact.class);
    }

    default s47 A2(SimpleGraphQLRequest simpleGraphQLRequest) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(Ng()) : executeGraphQL(simpleGraphQLRequest).m55014i(new cz3(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.xz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.mw((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.zz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f57924a.Oy((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.a04
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f14001a.m34819T((Map) obj);
            }
        }).m27845m();
    }

    default x6c C3(String str) {
        return graphqlQuery(AggregateSearchableQuery.builder().accountId(on()).aggregateOnField("contactSourceDrillDownOne").aggregationType(NewHtcHomeBadger.COUNT).filter(ja8.f30034b.toJson(qd3.m45109a(new Map.Entry[]{new AbstractMap.SimpleEntry("accountId", Collections.singletonMap("eq", on())), new AbstractMap.SimpleEntry("contactSource", Collections.singletonMap("eq", str))}))).typename(Contact.class.getSimpleName()).build(), AggregateSearchableQuery.Data.class, new wy3(), Map.class).d0(new rl7() { // from class: o.oz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.Dq((Map) obj);
            }
        }).d0(new rl7() { // from class: o.pz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.Ks((Map) obj);
            }
        }).d0(new rl7() { // from class: o.qz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.Zu((Map) obj);
            }
        }).d0(new rl7() { // from class: o.rz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.vu((List) obj);
            }
        });
    }

    default x6c Mu() {
        return graphqlQuery(AggregateSearchableQuery.builder().accountId(on()).aggregateOnField("contactSource").aggregationType(NewHtcHomeBadger.COUNT).filter(ja8.f30034b.toJson(Collections.singletonMap("accountId", Collections.singletonMap("eq", on())))).typename(Contact.class.getSimpleName()).build(), AggregateSearchableQuery.Data.class, new wy3(), Map.class).d0(new rl7() { // from class: o.xy3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.z5((Map) obj);
            }
        }).d0(new rl7() { // from class: o.yy3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.A7((Map) obj);
            }
        }).d0(new rl7() { // from class: o.zy3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.m34817M((Map) obj);
            }
        }).d0(new rl7() { // from class: o.az3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.kd((List) obj);
            }
        });
    }

    default x6c Sg(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("making service call for number: ");
        sb.append(str);
        return executeGraphQL(new SimpleGraphQLRequest("query GetContactByNumber($phoneNumber: AWSPhone, $accountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelContactNumberFilterInput, $limit: Int, $nextToken: String) {\n  getContactByNumber(phoneNumber: $phoneNumber, accountId: $accountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    items {\n      id\n      contactId\n      contact{\n    id\n    ownerId\n    contactNumberDetail {\n      isWhatsappNumber\n      phoneNumber\n    }\n    contactSource\n    profilePhotoUrl\n    emails {\n      email\n    }\n    name\n    activeDealStage\n    userDefinedTags\n    isCustomer\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    unsuccessfulCallAttempts\n    recentEngagements\n    customAttributes\n    lastCalledTime\n    updatedAt\n    latestRemark\n      }\n      doNotTrack\n      contactNumberType\n      phoneNumber\n      doNotTrack\n    }\n    nextToken\n  }\n}", toVariablesMap(GetContactByNumberQuery.builder().accountId(ModelIDKeyConditionInput.builder().eq(on()).build()).phoneNumber(str).limit(10).build()), Map.class, new GsonVariablesSerializer())).m55014i(new cz3(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.ez3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.sz((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.fz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.oy((Map) obj);
            }
        }).m27841g(new ggd() { // from class: o.gz3
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return k04.sp((List) obj);
            }
        }).m27842h(new rl7() { // from class: o.hz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f27818a.Ra((List) obj);
            }
        }).m27844k(new rl7() { // from class: o.iz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.Ly((Map) obj);
            }
        }).m27841g(new aq()).m27844k(new rl7() { // from class: o.jz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((Optional) obj).get();
            }
        }).m27844k(new rl7() { // from class: o.kz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.Rv(obj);
            }
        }).m27844k(new yz3(this)).m27844k(new rl7() { // from class: o.bz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f16978a.Kk((Map) obj);
            }
        }).m27841g(new aq()).m27844k(new rl7() { // from class: o.dz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (Contact) ((Optional) obj).get();
            }
        }).m27846n();
    }

    default s47 e3(String str) {
        return executeGraphQL(new SimpleGraphQLRequest("query GetUserByNumber($registeredNumber: AWSPhone, $userRegistrationStatus: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelUserFilterInput, $limit: Int, $nextToken: String) {\n  getUserByNumber(registeredNumber: $registeredNumber, userRegistrationStatus: $userRegistrationStatus, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}", toVariablesMap(GetUserByNumberQuery.builder().registeredNumber(str).userRegistrationStatus(ModelStringKeyConditionInput.builder().eq(UserRegistrationStatus.CONFIRMED.name()).build()).limit(1).build()), Map.class, new GsonVariablesSerializer())).m55014i(new cz3(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.vy3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f51028a.R6((Map) obj);
            }
        }).m27845m();
    }

    default Optional gy(final String str) {
        final String id = uni.kC().SB().m39171u().getId();
        GraphQLResponse graphQLResponse = (GraphQLResponse) ja8.z7(new SimpleGraphQLRequest("query GetContactByNumber($phoneNumber: AWSPhone, $accountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelContactNumberFilterInput, $limit: Int, $nextToken: String) {\n  getContactByNumber(phoneNumber: $phoneNumber, accountId: $accountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    items {\n      id\n      contactId\n      contact{\n    id\n    ownerId\n    contactNumberDetail {\n      isWhatsappNumber\n      phoneNumber\n    }\n    contactSource\n    profilePhotoUrl\n    emails {\n      email\n    }\n    name\n    activeDealStage\n    userDefinedTags\n    isCustomer\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    unsuccessfulCallAttempts\n    recentEngagements\n    customAttributes\n    lastCalledTime\n    updatedAt\n    latestRemark\n      }\n      doNotTrack\n      contactNumberType\n      phoneNumber\n      doNotTrack\n    }\n    nextToken\n  }\n}", toVariablesMap(GetContactByNumberQuery.builder().accountId(ModelIDKeyConditionInput.builder().eq(on()).build()).phoneNumber(str).limit(10).build()), Map.class, new GsonVariablesSerializer())).orElseThrow(new Supplier() { // from class: o.f04
            @Override // java.util.function.Supplier
            public final Object get() {
                return k04.Mz(str);
            }
        });
        return graphQLResponse.hasErrors() ? Optional.empty() : Optional.ofNullable(graphQLResponse).map(new g04()).map(new Function() { // from class: o.h04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k04.nn((Map) obj);
            }
        }).map(new Function() { // from class: o.i04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k04.Vp((Map) obj);
            }
        }).filter(new Predicate() { // from class: o.j04
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return k04.Ij((List) obj);
            }
        }).map(new Function() { // from class: o.sy3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k04.S2(id, (List) obj);
            }
        }).map(new Function() { // from class: o.ty3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f48036a.Ye(obj);
            }
        }).map(new Function() { // from class: o.uy3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f49639a.zh((Map) obj);
            }
        });
    }

    default SimpleGraphQLRequest ln(QueryContactListInput queryContactListInput, ModelContactFilterInput modelContactFilterInput, Optional optional, final int i) {
        if (Objects.isNull(queryContactListInput) && !optional.isPresent()) {
            return null;
        }
        final QueryContactListQuery.Builder builderSortDirection = QueryContactListQuery.builder().limit(Integer.valueOf(i)).input(queryContactListInput).sortDirection(ModelSortDirection.DESC);
        Optional optionalOfNullable = Optional.ofNullable(modelContactFilterInput);
        Objects.requireNonNull(builderSortDirection);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.b04
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.filter((ModelContactFilterInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query QueryContactList($input: QueryContactListInput!, $sortDirection: ModelSortDirection, $filter: ModelContactFilterInput, $limit: Int, $nextToken: String) {\n  queryContactList(input: $input, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      primaryTeamId\n      contactNumberDetail {\n        phoneNumber\n        isWhatsappNumber\n      }\n      contactSource\n      contactSourceDrillDownOne\n      contactSourceDrillDownTwo\n      emails {\n        email\n      }\n      businessDetail {\n          id\n          name\n          website\n          industry\n      }\n      name\n      profilePhotoUrl\n      hasTask\n      lastCalledTime\n      lastCallDirection\n      lastCallDuration\n      lastLeadAssignmentDateTime\n      freshLeadTag\n      activeDealStage\n      dealDescription\n      activeDealStageUpdatedAt\n      unsuccessfulCallAttempts\n      userDefinedTags\n      isCustomer\n      becameCustomerOn\n      latestRemark\n      paymentRequestDetail\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      manualClosedReason\n      lastDealStageType\n      prospectingAttempts\n      lastProspectingDoneOn\n      nextProspectingDueOn\n      nextProspectingNote\n      recentEngagements\n      openVideoCallDetail\n      openTaskDetail\n      createdAt\n      updatedAt\n    }\n    nextToken\n    startedAt\n  }\n}", toVariablesMap((QueryContactListQuery) optional.map(new Function() { // from class: o.c04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k04.fk(builderSortDirection, i, (String) obj);
            }
        }).orElse(builderSortDirection.build())), Map.class, new GsonVariablesSerializer());
    }

    default s47 n0(String str) {
        return executeGraphQL(new SimpleGraphQLRequest("query GetContact($id: ID!) {\n  getContact(id: $id) {\n    __typename\n    id\n    accountId\n    ownerId\n    toBeAssigned\n    sharedOwners\n    primaryTeamId\n    sharedTeams\n    accountPriority\n    addedById\n    addresses {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    blockedForCallReason\n    blockedForCallUntil\n    callPriority\n    contactNumberDetail {\n      __typename\n      contactNumberType\n      isPrimary\n      isValid\n      isWhatsappNumber\n      isVerified\n      isWrongNumber\n      phoneNumber\n    }\n    contactSource\n    contactSourceDrillDownOne\n    contactSourceDrillDownTwo\n    bulkUploadReference\n    contactStatus\n    contactType\n    department\n    designation\n    emails {\n      __typename\n      email\n      fullName\n      isDisposableEmail\n      isPrimary\n      isPublicEmail\n      isValid\n      isVerified\n    }\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n    }\n    businesses {\n        items {\n          businessId\n          contactId\n          contactRelationship\n          createdAt\n          department\n          business {\n            name\n            logo\n            industry\n            id\n            priority\n            updatedAt\n            accountId\n            addresses {\n              addressType\n              area\n              city\n              country\n              establishmentName\n              googlePlaceId\n              isPrimaryAddress\n              rawAddressText\n              region\n              state\n              streetAddress\n              zipcode\n              landmark\n              lat\n              lng\n            }\n            website\n            updatedById\n            addedById\n          }\n        }\n    }\n    gender\n    waChatChannelId\n    isDecisionMaker\n    isPrivate\n    lockPeriod\n    name\n    preferredContactDays\n    profilePhotoUrl\n    referredBy\n    salutation\n    seniority\n    updatedById\n    hasTask\n    openTaskActivityType\n    lastCalledTime\n    lastCallDirection\n    lastCallOutcome\n    lastCallUserId\n    lastCallDuration\n    lastCallEngagementId\n    lastVisitTime\n    lastVisitOutcome\n    lastVisitUserId\n    lastVisitEngagementId\n    lastEmailTime\n    lastEmailUserId\n    lastEmailEngagementId\n    lastWhatsappTime\n    lastWhatsappUserId\n    lastWhatsappEngagementId\n    lastNoteAddedTime\n    lastNoteUserId\n    lastNoteEngagementId\n    lastTaskDoneTime\n    lastTaskDoneUserId\n    lastTaskDoneEngagementId\n    openTaskCount\n    lastKnownDisposition\n    lastKnownDispositionTime\n    lastEngagementFromAccount\n    lastEngagementFromContact\n    freshLeadTag\n    needFollowUpTag\n    needFollowUpTagUpdatedAt\n    activeDealStage\n    dealDescription\n    activeDealStageUpdatedAt\n    unsuccessfulCallAttempts\n    userDefinedTags\n    customDataAddedFromAddContactForm\n    isCustomer\n    becameCustomerOn\n    latestRemark\n    customAttributes\n    paymentRequestDetail\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    manualClosedReason\n    lastDealStageType\n    prospectingAttempts\n    lastProspectingDoneOn\n    nextProspectingDueOn\n    nextProspectingNote\n    recentEngagements\n    openVideoCallDetail\n    openTaskDetail\n    createdAt\n    updatedAt\n  }\n}", toVariablesMap(GetContactQuery.builder().id(str).build()), Map.class, new GsonVariablesSerializer())).m55014i(new cz3(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.lz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.Wf((Map) obj);
            }
        }).m27844k(new yz3(this)).m27844k(new rl7() { // from class: o.mz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f36119a.m34816A((Map) obj);
            }
        }).m27845m();
    }

    default s47 ry(String str) {
        return executeGraphQL(new SimpleGraphQLRequest("query GetContact($id: ID!) {\n  getContact(id: $id) {\n    id\n    accountId\n    ownerId\n    contactNumberDetail {\n      isWhatsappNumber\n      phoneNumber\n    }\n    contactSource\n    profilePhotoUrl\n    emails {\n      email\n    }\n    name\n    activeDealStage\n    userDefinedTags\n    isCustomer\n    leadLifecycleStage\n    leadLifecycleStageSubCategory\n    unsuccessfulCallAttempts\n    recentEngagements\n    latestRemark\n    customAttributes\n    lastCalledTime\n    updatedAt\n  }\n}", toVariablesMap(GetContactQuery.builder().id(str).build()), Map.class, new GsonVariablesSerializer())).m55014i(new cz3(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.nz3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return k04.h5((Map) obj);
            }
        }).m27844k(new yz3(this)).m27844k(new rl7() { // from class: o.e04
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f20686a.V6((Map) obj);
            }
        }).m27845m();
    }
}
