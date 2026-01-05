package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import com.amazonaws.amplify.generated.graphql.GetMissesByAccountQuery;
import com.amazonaws.amplify.generated.graphql.GetMissesByContactQuery;
import com.amazonaws.amplify.generated.graphql.GetMissesByOwnerQuery;
import com.amazonaws.amplify.generated.graphql.SearchMissedOpportunitiessQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.ModelMissedOpportunitiesConnection;
import com.apollographql.apollo.api.Query;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import type.ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput;
import type.ModelMissedOpportunitiesByOwnerCompositeKeyInput;
import type.ModelSortDirection;
import type.SearchableIDFilterInput;
import type.SearchableMissedOpportunitiesFilterInput;
import type.SearchableMissedOpportunitiesSortInput;
import type.SearchableMissedOpportunitiesSortableFields;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public interface gqc extends me1 {
    static /* synthetic */ void Ac(SearchableMissedOpportunitiesFilterInput.Builder builder, String str) {
        builder.ownerId(SearchableIDFilterInput.builder().eq(str).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Az(String str, int i) {
        return new PaginatedTokenResults(new fqc(this), uyh.of(str, "contact"), i);
    }

    static /* synthetic */ void Ee(SearchableMissedOpportunitiesFilterInput.Builder builder, String str) {
        builder.primaryTeamId(SearchableIDFilterInput.builder().eq(str).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelMissedOpportunitiesConnection Ez(Map map) {
        return (ModelMissedOpportunitiesConnection) sf(map, ModelMissedOpportunitiesConnection.class);
    }

    static /* synthetic */ Map P1(String str, Map map) {
        return (Map) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Rz(ryh ryhVar, int i) {
        return new PaginatedTokenResults(new npc(this), ryhVar, i);
    }

    static /* synthetic */ ryh Xd(ModelMissedOpportunitiesConnection modelMissedOpportunitiesConnection) {
        return uyh.of(modelMissedOpportunitiesConnection.getItems(), modelMissedOpportunitiesConnection.getNextToken());
    }

    static SearchableMissedOpportunitiesFilterInput.Builder bA(String str, String str2, String str3) {
        final SearchableMissedOpportunitiesFilterInput.Builder builderAccountId = SearchableMissedOpportunitiesFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build());
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.mpc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                gqc.Ac(builderAccountId, (String) obj);
            }
        });
        Optional.ofNullable(str3).ifPresent(new Consumer() { // from class: o.xpc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                gqc.Ee(builderAccountId, (String) obj);
            }
        });
        return builderAccountId;
    }

    static Map dz(final Map map) {
        Optional.ofNullable((Map) map.get("contact")).ifPresent(new Consumer() { // from class: o.wpc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                gqc.to(map, (Map) obj);
            }
        });
        return map;
    }

    static /* synthetic */ ryh gn(ModelMissedOpportunitiesConnection modelMissedOpportunitiesConnection) {
        return uyh.of(modelMissedOpportunitiesConnection.getItems(), modelMissedOpportunitiesConnection.getNextToken());
    }

    static ModelMissedOpportunitiesConnection jd() {
        return ModelMissedOpportunitiesConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    static /* synthetic */ void k5(Map map, List list) {
        map.put("items", (List) list.stream().map(new Function() { // from class: o.vpc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return gqc.dz((Map) obj);
            }
        }).collect(Collectors.toList()));
    }

    static /* synthetic */ void to(Map map, Map map2) {
        map.put("contact", d14.D2(map2));
    }

    static Map y2(final Map map) {
        Optional.ofNullable((List) map.get("items")).ifPresent(new Consumer() { // from class: o.spc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                gqc.k5(map, (List) obj);
            }
        });
        return map;
    }

    default s47 Av(String str, int i) {
        return y5(uyh.of(str, "contact"), null, i);
    }

    default s47 Bu(String str, String str2, Long l, Long l2, int i) {
        return m29314W(uyh.of(X3(str, str2, l, l2), SearchableMissedOpportunitiesSortInput.builder().direction(SearchableSortDirection.asc).field(SearchableMissedOpportunitiesSortableFields.callLaterDateTime).build()), i);
    }

    default s47 F0(final String str, final int i) {
        return s47.m47669H(new Callable() { // from class: o.dqc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20411a.Az(str, i);
            }
        });
    }

    default s47 Nt(ryh ryhVar, String str, int i) {
        final SearchMissedOpportunitiessQuery.Builder builderLimit = SearchMissedOpportunitiessQuery.builder().filter((SearchableMissedOpportunitiesFilterInput) ryhVar.f44265a).sort((SearchableMissedOpportunitiesSortInput) ryhVar.f44266b).limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(str);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.tpc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.nextToken((String) obj);
            }
        });
        return m29313P(new SimpleGraphQLRequest("query SearchMissedOpportunitiess($filter: SearchableMissedOpportunitiesFilterInput, $sort: SearchableMissedOpportunitiesSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchMissedOpportunitiess(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      owner {\n         __typename\n         id\n         name\n         registeredEmail\n         registeredNumber\n         profilePictureUrl\n      }\n      primaryTeamId\n      contactId\n      contact{\n         id\n         accountId\n         ownerId\n         toBeAssigned\n         sharedOwners\n         primaryTeamId\n         sharedTeams\n         accountPriority\n         addedById\n         addresses {\n             __typename\n             addressType\n             establishmentName\n             area\n             city\n             country\n             googlePlaceId\n             isPrimaryAddress\n             landmark\n             lat\n             lng\n             rawAddressText\n             region\n             state\n             streetAddress\n             zipcode\n         }\n         blockedForCallReason\n         blockedForCallUntil\n         callPriority\n         contactNumberDetail {\n             __typename\n             contactNumberType\n             isPrimary\n             isValid\n             isWhatsappNumber\n             isVerified\n             isWrongNumber\n             phoneNumber\n         }\n         contactSource\n         contactSourceDrillDownOne\n         contactSourceDrillDownTwo\n         contactSourceDrillDownThree\n         bulkUploadReference\n         contactStatus\n         contactType\n         department\n         designation\n         emails {\n             __typename\n             email\n             fullName\n             isDisposableEmail\n             isPrimary\n             isPublicEmail\n             isValid\n             isVerified\n         }\n         businesses {\n             items {\n                 businessId\n                 contactId\n                 contactRelationship\n                 createdAt\n                 department\n                 business {\n                     name\n                     logo\n                     industry\n                     id\n                     priority\n                     updatedAt\n                     accountId\n                     addresses {\n                         addressType\n                         area\n                         city\n                         country\n                         establishmentName\n                         googlePlaceId\n                         isPrimaryAddress\n                         rawAddressText\n                         region\n                         state\n                         streetAddress\n                         zipcode\n                         landmark\n                         lat\n                         lng\n                     }\n                     website\n                     updatedById\n                     addedById\n                 }\n             }\n         }\n         businessDetail {\n             __typename\n             id\n             name\n             website\n             industry\n         }\n         gender\n         waChatChannelId\n         isDecisionMaker\n         isPrivate\n         lockPeriod\n         name\n         preferredContactDays\n         profilePhotoUrl\n         referredBy\n         salutation\n         seniority\n         updatedById\n         hasTask\n         openTaskActivityType\n         lastCalledTime\n         lastCallDirection\n         lastCallOutcome\n         lastCallUserId\n         lastCallDuration\n         lastCallEngagementId\n         lastVisitTime\n         lastVisitOutcome\n         lastVisitUserId\n         lastVisitEngagementId\n         lastEmailTime\n         lastEmailUserId\n         lastEmailEngagementId\n         lastWhatsappTime\n         lastWhatsappUserId\n         lastWhatsappEngagementId\n         lastNoteAddedTime\n         lastNoteUserId\n         lastNoteEngagementId\n         lastTaskDoneTime\n         lastTaskDoneUserId\n         lastTaskDoneEngagementId\n         lastLeadAssignmentDateTime\n         openTaskCount\n         lastKnownDisposition\n         lastKnownDispositionTime\n         lastEngagementFromAccount\n         lastEngagementFromContact\n         freshLeadTag\n         needFollowUpTag\n         needFollowUpTagUpdatedAt\n         activeDealStage\n         dealDescription\n         activeDealStageUpdatedAt\n         unsuccessfulCallAttempts\n         userDefinedTags\n         customDataAddedFromAddContactForm\n         isCustomer\n         becameCustomerOn\n         latestRemark\n         customAttributes\n         paymentRequestDetail\n         leadLifecycleStage\n         leadLifecycleStageSubCategory\n         manualClosedReason\n         lastDealStageType\n         prospectingAttempts\n         firstProspectingDoneOn\n         lastProspectingDoneOn\n         nextProspectingDueOn\n         nextProspectingSetBy\n         nextProspectingNote\n         recentEngagements\n         openVideoCallDetail\n         openTaskDetail\n         createdAt\n         updatedAt\n      }\n      missedOpportunityType\n      messageBody\n      callLaterDateTime\n      relatedEngagementId\n      relatedEngagement {\n         __typename\n         id\n         accountId\n         engagementType\n         contactId\n         primaryTeamId\n         ownerId\n         contactPrimaryTeamId\n         contactOwnerId\n         addedById\n         updatedById\n         engagementStatus\n         parentEngagementId\n         nextStepTaskId\n         syncStatus\n         externalNumber\n         userNumber\n         callDirection\n         callConnectStatus\n         callRecordingUrl\n         callStartTime\n         callEndTime\n         durationInMillis\n         callOutcome\n         noteHeading\n         noteAdditionMethod\n         body\n         isManualTask\n         taskHeading\n         taskType\n         taskActivityType\n         taskInputNote\n         taskPriority\n         taskCompletionNote\n         dueDateTime\n         reminderDateTime\n         uploadedFiledUrl\n         visitTime\n         visitNote\n         visitOutcome\n         campaignId\n         campaignRun\n         createdAt\n         updatedAt\n      }\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap(builderLimit.build()), Map.class, new GsonVariablesSerializer()), "searchMissedOpportunitiess").m47686M(new rl7() { // from class: o.upc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gqc.Xd((ModelMissedOpportunitiesConnection) obj);
            }
        });
    }

    /* renamed from: P */
    default s47 m29313P(SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(jd()) : executeGraphQL(simpleGraphQLRequest).m55014i(new ggd() { // from class: o.opc
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f38703a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new ml()).m27844k(new rl7() { // from class: o.ppc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gqc.P1(str, (Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.qpc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gqc.y2((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.rpc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f43935a.Ez((Map) obj);
            }
        }).m27845m();
    }

    /* renamed from: W */
    default s47 m29314W(final ryh ryhVar, final int i) {
        return s47.m47669H(new Callable() { // from class: o.eqc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22045a.Rz(ryhVar, i);
            }
        });
    }

    default SearchableMissedOpportunitiesFilterInput X3(String str, String str2, Long l, Long l2) {
        SearchableMissedOpportunitiesFilterInput.Builder builderBA = bA(on(), str, str2);
        builderBA.callLaterDateTime(SearchableStringFilterInput.builder().lte(a81.m16653h(Long.valueOf(System.currentTimeMillis() + l.longValue()))).build());
        SearchableMissedOpportunitiesFilterInput.Builder builderBA2 = bA(on(), str, str2);
        builderBA2.callLaterDateTime(SearchableStringFilterInput.builder().gte(a81.m16653h(Long.valueOf(System.currentTimeMillis() - l2.longValue()))).build());
        return SearchableMissedOpportunitiesFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(on()).build()).and(Arrays.asList(builderBA.build(), builderBA2.build())).build();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    default s47 y5(ryh ryhVar, final String str, int i) {
        Query queryBuild;
        String str2 = (String) ryhVar.f44265a;
        String str3 = (String) ryhVar.f44266b;
        str3.hashCode();
        char c = 65535;
        switch (str3.hashCode()) {
            case -1177318867:
                if (str3.equals("account")) {
                    c = 0;
                    break;
                }
                break;
            case 3555933:
                if (str3.equals("team")) {
                    c = 1;
                    break;
                }
                break;
            case 106164915:
                if (str3.equals("owner")) {
                    c = 2;
                    break;
                }
                break;
            case 951526432:
                if (str3.equals("contact")) {
                    c = 3;
                    break;
                }
                break;
        }
        String str4 = "getMissesByAccount";
        String str5 = "query GetMissesByAccount($accountId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelMissedOpportunitiesFilterInput, $limit: Int, $nextToken: String) {\n  getMissesByAccount(accountId: $accountId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      owner {\n         __typename\n         id\n         name\n         registeredEmail\n         registeredNumber\n         profilePictureUrl\n      }\n      primaryTeamId\n      contactId\n      contact {\n         __typename\n         id\n         accountId\n         ownerId\n         toBeAssigned\n         contactSource\n         contactStatus\n         contactType\n         name\n         profilePhotoUrl\n         salutation\n         seniority\n      }\n      missedOpportunityType\n      messageBody\n      callLaterDateTime\n      relatedEngagementId\n      relatedEngagement {\n         __typename\n         id\n         accountId\n         engagementType\n         contactId\n         primaryTeamId\n         ownerId\n         contactPrimaryTeamId\n         contactOwnerId\n         addedById\n         updatedById\n         engagementStatus\n         parentEngagementId\n         nextStepTaskId\n         syncStatus\n         externalNumber\n         userNumber\n         callDirection\n         callConnectStatus\n         callRecordingUrl\n         callStartTime\n         callEndTime\n         durationInMillis\n         callOutcome\n         noteHeading\n         noteAdditionMethod\n         body\n         isManualTask\n         taskHeading\n         taskType\n         taskActivityType\n         taskInputNote\n         taskPriority\n         taskCompletionNote\n         dueDateTime\n         reminderDateTime\n         uploadedFiledUrl\n         visitTime\n         visitNote\n         visitOutcome\n         campaignId\n         campaignRun\n         createdAt\n         updatedAt\n      }\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
        switch (c) {
            case 0:
                final GetMissesByAccountQuery.Builder builderSortDirection = GetMissesByAccountQuery.builder().accountId(str2).limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC);
                Optional.ofNullable(str).ifPresent(new Consumer() { // from class: o.zpc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderSortDirection.nextToken(str);
                    }
                });
                queryBuild = builderSortDirection.build();
                break;
            case 1:
                final GetMissesByAccountQuery.Builder builderSortDirection2 = GetMissesByAccountQuery.builder().accountId(on()).limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC);
                Optional.ofNullable(str).ifPresent(new Consumer() { // from class: o.aqc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderSortDirection2.nextToken(str);
                    }
                });
                queryBuild = builderSortDirection2.build();
                break;
            case 2:
                final GetMissesByOwnerQuery.Builder builderSortDirection3 = GetMissesByOwnerQuery.builder().accountId(on()).ownerIdUpdatedAt(ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput.builder().beginsWith(ModelMissedOpportunitiesByOwnerCompositeKeyInput.builder().ownerId(str2).build()).build()).limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC);
                Optional.ofNullable(str).ifPresent(new Consumer() { // from class: o.ypc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderSortDirection3.nextToken(str);
                    }
                });
                queryBuild = builderSortDirection3.build();
                str5 = "query GetMissesByOwner($accountId: ID, $ownerIdUpdatedAt: ModelMissedOpportunitiesByOwnerCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelMissedOpportunitiesFilterInput, $limit: Int, $nextToken: String) {\n  getMissesByOwner(accountId: $accountId, ownerIdUpdatedAt: $ownerIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      owner {\n         __typename\n         id\n         name\n         registeredEmail\n         registeredNumber\n         profilePictureUrl\n      }\n      primaryTeamId\n      contactId\n      contact {\n         __typename\n         id\n         accountId\n         ownerId\n         toBeAssigned\n         contactSource\n         contactStatus\n         contactType\n         name\n         profilePhotoUrl\n         salutation\n         seniority\n      }\n      missedOpportunityType\n      messageBody\n      callLaterDateTime\n      relatedEngagementId\n      relatedEngagement {\n         __typename\n         id\n         accountId\n         engagementType\n         contactId\n         primaryTeamId\n         ownerId\n         contactPrimaryTeamId\n         contactOwnerId\n         addedById\n         updatedById\n         engagementStatus\n         parentEngagementId\n         nextStepTaskId\n         syncStatus\n         externalNumber\n         userNumber\n         callDirection\n         callConnectStatus\n         callRecordingUrl\n         callStartTime\n         callEndTime\n         durationInMillis\n         callOutcome\n         noteHeading\n         noteAdditionMethod\n         body\n         isManualTask\n         taskHeading\n         taskType\n         taskActivityType\n         taskInputNote\n         taskPriority\n         taskCompletionNote\n         dueDateTime\n         reminderDateTime\n         uploadedFiledUrl\n         visitTime\n         visitNote\n         visitOutcome\n         campaignId\n         campaignRun\n         createdAt\n         updatedAt\n      }\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
                str4 = "getMissesByOwner";
                break;
            case 3:
                final GetMissesByContactQuery.Builder builderSortDirection4 = GetMissesByContactQuery.builder().contactId(str2).limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC);
                Optional.ofNullable(str).ifPresent(new Consumer() { // from class: o.bqc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        builderSortDirection4.nextToken(str);
                    }
                });
                queryBuild = builderSortDirection4.build();
                str5 = "query GetMissesByContact($contactId: ID, $updatedAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelMissedOpportunitiesFilterInput, $limit: Int, $nextToken: String) {\n  getMissesByContact(contactId: $contactId, updatedAt: $updatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      owner {\n         __typename\n         id\n         name\n         registeredEmail\n         registeredNumber\n         profilePictureUrl\n      }\n      primaryTeamId\n      contactId\n      contact {\n         __typename\n         id\n         accountId\n         ownerId\n         toBeAssigned\n         contactSource\n         contactStatus\n         contactType\n         name\n         profilePhotoUrl\n         salutation\n         seniority\n      }\n      missedOpportunityType\n      messageBody\n      callLaterDateTime\n      relatedEngagementId\n      relatedEngagement {\n         __typename\n         id\n         accountId\n         engagementType\n         contactId\n         primaryTeamId\n         ownerId\n         contactPrimaryTeamId\n         contactOwnerId\n         addedById\n         updatedById\n         engagementStatus\n         parentEngagementId\n         nextStepTaskId\n         syncStatus\n         externalNumber\n         userNumber\n         callDirection\n         callConnectStatus\n         callRecordingUrl\n         callStartTime\n         callEndTime\n         durationInMillis\n         callOutcome\n         noteHeading\n         noteAdditionMethod\n         body\n         isManualTask\n         taskHeading\n         taskType\n         taskActivityType\n         taskInputNote\n         taskPriority\n         taskCompletionNote\n         dueDateTime\n         reminderDateTime\n         uploadedFiledUrl\n         visitTime\n         visitNote\n         visitOutcome\n         campaignId\n         campaignRun\n         createdAt\n         updatedAt\n      }\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
                str4 = "getMissesByContact";
                break;
            default:
                throw new RuntimeException(String.format("%s: You can query misses by owner, account, team and contact only", ryhVar.f44266b));
        }
        return m29313P(new SimpleGraphQLRequest(str5, toVariablesMap(queryBuild), Map.class, new GsonVariablesSerializer()), str4).m47686M(new rl7() { // from class: o.cqc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return gqc.gn((ModelMissedOpportunitiesConnection) obj);
            }
        });
    }
}
