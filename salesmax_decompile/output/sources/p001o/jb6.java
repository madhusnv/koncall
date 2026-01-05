package p001o;

import com.amazonaws.amplify.generated.graphql.GetEngagementQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.ModelEngagementConnection;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public interface jb6 extends sa6 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Engagement D1(Map map) {
        return (Engagement) sf(map, Engagement.class);
    }

    static /* synthetic */ Map Id(Map map) {
        return (Map) map.get("getEngagement");
    }

    static /* synthetic */ void Jt(Map map, Map map2) {
        map.put("comments", (List) map2.getOrDefault("items", Collections.emptyList()));
    }

    static /* synthetic */ void P3(Map map, Map map2) {
        map.put("linkedFiles", (List) map2.getOrDefault("items", Collections.emptyList()));
    }

    static /* synthetic */ void Um(Map map, String str) {
        HashMap map2 = new HashMap();
        map2.put(OutcomeConstants.OUTCOME_ID, str);
        map2.put("accountId", map.get("accountId"));
        map2.put("engagementType", map.get("engagementType"));
        map2.put("addedById", map.get("addedById"));
        map.put("parentEngagement", map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Map j5(Map map) {
        ((List) map.get("items")).stream().forEach(new Consumer() { // from class: o.za6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f56833a.W6((Map) obj);
            }
        });
        return map;
    }

    static /* synthetic */ void j6(Map map, Map map2) {
        map.put("locations", (List) map2.getOrDefault("items", Collections.emptyList()));
    }

    static ModelEngagementConnection jb() {
        return ModelEngagementConnection.builder().items(Collections.emptyList()).nextToken(null).startedAt(Temporal.Timestamp.now()).build();
    }

    static /* synthetic */ void lr(Map map, Map map2) {
        map.put("engagementUpdate", (List) map2.getOrDefault("items", Collections.emptyList()));
    }

    static Map qd(final Map map) {
        Map map2 = (Map) map.get("comments");
        Map map3 = (Map) map.get("engagementUpdate");
        Map map4 = (Map) map.get("locations");
        Map map5 = (Map) map.get("linkedFiles");
        String str = (String) map.get("parentEngagementId");
        Map map6 = (Map) map.get("parentEngagement");
        Optional.ofNullable(map2).ifPresent(new Consumer() { // from class: o.db6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                jb6.Jt(map, (Map) obj);
            }
        });
        Optional.ofNullable(map3).ifPresent(new Consumer() { // from class: o.eb6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                jb6.lr(map, (Map) obj);
            }
        });
        Optional.ofNullable(map4).ifPresent(new Consumer() { // from class: o.fb6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                jb6.j6(map, (Map) obj);
            }
        });
        Optional.ofNullable(map5).ifPresent(new Consumer() { // from class: o.gb6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                jb6.P3(map, (Map) obj);
            }
        });
        if (!Optional.ofNullable(map6).isPresent()) {
            Optional.ofNullable(str).ifPresent(new Consumer() { // from class: o.hb6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    jb6.Um(map, (String) obj);
                }
            });
        }
        return map;
    }

    static /* synthetic */ Map qw(String str, Map map) {
        return (Map) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelEngagementConnection su(Map map) {
        return (ModelEngagementConnection) sf(map, ModelEngagementConnection.class);
    }

    default s47 Wn(SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(jb()) : executeGraphQL(simpleGraphQLRequest).m55014i(new wa6(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.ib6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jb6.qw(str, (Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.xa6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f53417a.j5((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.ya6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f55152a.su((Map) obj);
            }
        }).m27845m();
    }

    /* renamed from: ew, reason: merged with bridge method [inline-methods] */
    default Map W6(Map map) {
        return qd(map);
    }

    default x6c na(String str) {
        return executeGraphQL(new SimpleGraphQLRequest("query GetEngagement($id: ID!) {\n  getEngagement(id: $id) {\n    __typename\n    id\n    accountId\n    engagementType\n    engagementSourceType\n    engagementSource\n    engagementSourceLevelTwo\n    contactId\n    contact {\n         id\n         contactSource\n         contactStatus\n         contactType\n         designation\n         department\n         activeDealStage\n         profilePhotoUrl\n         userDefinedTags\n         emails {\n             email\n             fullName\n         }\n         name\n         ownerId\n         contactNumberDetail {\n             __typename\n             contactNumberType\n             isPrimary\n             isValid\n             isWhatsappNumber\n             isVerified\n             isWrongNumber\n             phoneNumber\n         }\n         businessDetail {\n             __typename\n             id\n             name\n             website\n             industry\n         }\n         leadLifecycleStage\n         leadLifecycleStageSubCategory\n    }\n    primaryTeamId\n    ownerId\n    contactPrimaryTeamId\n    contactOwnerId\n    addedById\n    updatedById\n    engagementStatus\n    parentEngagementId\n    parentEngagement {\n         __typename\n         id\n         accountId\n         engagementType\n         contactId\n         taskType\n         ownerId\n    }\n    nextStepTaskId\n    nextStepTask {\n         __typename\n         id\n         accountId\n         engagementType\n         contactId\n         taskType\n         ownerId\n         dueDateTime\n    }\n    syncStatus\n    externalNumber\n    userNumber\n    callDirection\n    callConnectStatus\n    callRecordingUrl\n    callStartTime\n    callEndTime\n    durationInMillis\n    callOutcome\n    noteHeading\n    noteAdditionMethod\n    body\n    isManualTask\n    taskHeading\n    taskType\n    taskActivityType\n    taskInputNote\n    taskPriority\n    taskCompletionNote\n    taskCompletionTime\n    taskCompletionType\n    dueDateTime\n    reminderDateTime\n    taskLocation {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    uploadedFiledUrl\n    visitLocation {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    visitTime\n    visitNote\n    visitOutcome\n    createdAt\n    updatedAt\n     locations (limit: 1, sortDirection: DESC){\n          items {\n              __typename\n              id\n              accountId\n              ownerId\n              lat\n              lng\n              createdAt\n              engagementId\n              updatedAt\n          }\n          nextToken\n     }\n   comments (limit: 1, sortDirection: DESC){\n        items {\n           __typename\n            id\n            body\n            createdAt\n            engagementId\n            ownerId\n            updatedAt\n            mentioned {\n                entityId\n                entityType\n            }\n            userCommenting {\n                name\n                registeredEmail\n                registeredNumber\n                userRegistrationStatus\n                profilePictureUrl\n            }\n       }\n       nextToken\n   }\n   engagementUpdate (limit: 3, sortDirection: DESC){\n       items {\n           accountId\n           createdAt\n           dueDateTimeChangedFrom\n           dueDateTimeChangedTo\n           engagementId\n           id\n           note\n           updatedAt\n           updatedById\n       }\n       nextToken\n    }\n    customCallOutcomeData\n    customVisitOutcomeData\n    customTaskCompletionData\n    customTaskInputData\n    taskEngagementActions\n    taskEngagementActionsUpdatedAt\n    firstTaskEngagementActionOn\n    taskEngagementActionCount\n    nextFollowUpOn\n    nextFollowUpSetBy\n    linkedFiles(limit: 50, sortDirection: DESC) {\n         items {\n             id\n             accountId\n             businessId\n             business{\n                 id\n             }\n             contactId\n             contact{\n                 id\n             }\n             dealId\n             deal{\n                 id\n             }\n             engagementId\n             engagement{\n                 id\n             }\n             file {\n                 accountId\n                 createdAt\n                 description\n                 documentCategory\n                 documentSubCategory\n                 fileName\n                 fileMimeType\n                 fileMetaData\n                 fileStorageDestination\n                 fileThumbnailUrl\n                 fileUrl\n                 templateBody\n                 templateExternalLink\n                 templateLastUsed\n                 templateTitle\n                 templateType\n                 updatedAt\n                 uploadSource\n                 uploadedById\n                 tags\n                 scopeLevel\n                 scopeId\n                 parentFileId\n                 id\n                 hasParent\n             }\n         }\n    }\n  }\n}", toVariablesMap(GetEngagementQuery.builder().id(str).build()), Map.class, new GsonVariablesSerializer())).m55014i(new wa6(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.ab6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jb6.Id((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.bb6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f15863a.W6((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.cb6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f17677a.D1((Map) obj);
            }
        }).m27846n();
    }
}
