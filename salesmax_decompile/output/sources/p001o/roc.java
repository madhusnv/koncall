package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import com.amazonaws.amplify.generated.graphql.SearchEngagementsQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.ModelEngagementConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import type.SearchableEngagementFilterInput;
import type.SearchableEngagementSortInput;
import type.SearchableEngagementSortableFields;
import type.SearchableSortDirection;

/* loaded from: classes.dex */
public interface roc extends me1 {
    static /* synthetic */ ryh Bc(ModelEngagementConnection modelEngagementConnection) {
        return uyh.of(modelEngagementConnection.getItems(), modelEngagementConnection.getNextToken());
    }

    static /* synthetic */ Map Hm(Map map) {
        return (Map) map.getOrDefault("searchEngagements", Collections.emptyMap());
    }

    static /* synthetic */ SearchEngagementsQuery Mv(SearchEngagementsQuery.Builder builder, int i, String str) {
        return builder.limit(Integer.valueOf(i)).nextToken(str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x6c O9(vqh vqhVar, final String str) {
        return vv(Pg(vqhVar, str)).d0(new rl7() { // from class: o.coc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return uyh.of(str, (Integer) obj);
            }
        });
    }

    static /* synthetic */ ryh Rq(Map map, String str) {
        return uyh.of(str, (Integer) map.getOrDefault(str, 0));
    }

    static /* synthetic */ SearchEngagementsQuery Vw(SearchEngagementsQuery.Builder builder, int i, String str) {
        return builder.limit(Integer.valueOf(i)).nextToken(str).build();
    }

    static /* synthetic */ List Z0(List list, ArrayList arrayList) {
        final Map map = (Map) arrayList.stream().collect(Collectors.toMap(new Function() { // from class: o.snc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((ryh) obj).m47300g();
            }
        }, new Function() { // from class: o.tnc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Integer) ((ryh) obj).m47301h();
            }
        }));
        return (List) list.stream().map(new Function() { // from class: o.unc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return roc.Rq(map, (String) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: a */
    static /* synthetic */ ryh m47030a(ModelEngagementConnection modelEngagementConnection) {
        return uyh.of(modelEngagementConnection.getItems(), modelEngagementConnection.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults ci(ryh ryhVar, int i, x6c x6cVar) {
        return new PaginatedTokenResults(new rnc(this), ryhVar, i, x6cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults g2(ryh ryhVar, int i) {
        return new PaginatedTokenResults(new doc(this), ryhVar, i);
    }

    static /* synthetic */ Map lp(Map map) {
        ((List) map.getOrDefault("items", Collections.emptyList())).forEach(new Consumer() { // from class: o.foc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                jb6.qd((Map) obj);
            }
        });
        return map;
    }

    static /* synthetic */ ryh m8(ModelEngagementConnection modelEngagementConnection) {
        return uyh.of(modelEngagementConnection.getItems(), modelEngagementConnection.getNextToken());
    }

    static /* synthetic */ SearchEngagementsQuery p1(SearchEngagementsQuery.Builder builder, int i, String str) {
        return builder.limit(Integer.valueOf(i)).nextToken(str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults t6(ryh ryhVar, int i) {
        return new PaginatedTokenResults(new rnc(this), ryhVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelEngagementConnection xr(Map map) {
        ModelEngagementConnection modelEngagementConnection = (ModelEngagementConnection) sf(map, ModelEngagementConnection.class);
        return modelEngagementConnection == null ? ModelEngagementConnection.builder().items(Collections.emptyList()).build() : modelEngagementConnection;
    }

    default s47 Ap(SimpleGraphQLRequest simpleGraphQLRequest) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(c6()) : executeGraphQL(simpleGraphQLRequest).m55014i(new ooc(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.ync
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return roc.Hm((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.znc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return roc.lp((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.boc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f16628a.xr((Map) obj);
            }
        }).m27845m();
    }

    default x6c Eb(final vqh vqhVar, final List list) {
        return x6c.e0((List) list.stream().map(new Function() { // from class: o.joc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f30852a.O9(vqhVar, (String) obj);
            }
        }).collect(Collectors.toList())).m55733m(new ArrayList(), new eh1() { // from class: o.koc
            @Override // p001o.eh1
            public final void accept(Object obj, Object obj2) {
                ((ArrayList) obj).add((ryh) obj2);
            }
        }).m55019p(new rl7() { // from class: o.loc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return roc.Z0(list, (ArrayList) obj);
            }
        }).m55027y();
    }

    default s47 J0(ryh ryhVar, String str, int i) {
        return Ap(K8(uyh.of((SearchableEngagementFilterInput) ryhVar.f44265a, (SearchableEngagementSortInput) ryhVar.f44266b), Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.moc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return roc.m8((ModelEngagementConnection) obj);
            }
        });
    }

    default SimpleGraphQLRequest K8(ryh ryhVar, Optional optional, final int i) {
        if (Objects.isNull(ryhVar) && !optional.isPresent()) {
            return null;
        }
        SearchableEngagementFilterInput searchableEngagementFilterInput = (SearchableEngagementFilterInput) ryhVar.f44265a;
        SearchableEngagementSortInput searchableEngagementSortInput = (SearchableEngagementSortInput) ryhVar.f44266b;
        final SearchEngagementsQuery.Builder builder = SearchEngagementsQuery.builder();
        Optional optionalOfNullable = Optional.ofNullable(searchableEngagementFilterInput);
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new vnc(builder));
        Optional.ofNullable(Yt(searchableEngagementSortInput)).ifPresent(new wnc(builder));
        return new SimpleGraphQLRequest("query SearchEngagements($filter: SearchableEngagementFilterInput, $sort: SearchableEngagementSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEngagements(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callRecordingUrl\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      noteHeading\n      noteAdditionMethod\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      reminderDateTime\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      videoCallPlatform\n      videoCallLink\n      videoCallMetadata\n      videoCallOutcome\n      customCallOutcomeData\n      customVisitOutcomeData\n      customVideoCallInputData\n      customTaskCompletionData\n      customTaskInputData\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      nextFollowUpOn\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchEngagementsQuery) optional.map(new Function() { // from class: o.xnc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return roc.Vw(builder, i, (String) obj);
            }
        }).orElse(builder.limit(Integer.valueOf(i)).build())), Map.class, new GsonVariablesSerializer());
    }

    default s47 O6(ryh ryhVar, String str, int i) {
        return Ap(ct(uyh.of((SearchableEngagementFilterInput) ryhVar.f44265a, (SearchableEngagementSortInput) ryhVar.f44266b), Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.eoc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return roc.m47030a((ModelEngagementConnection) obj);
            }
        });
    }

    default ryh Pg(vqh vqhVar, String str) {
        return vqhVar.m53281A(on(), Eo(), str);
    }

    default s47 X6(ryh ryhVar, String str, int i) {
        return Ap(lz(uyh.of((SearchableEngagementFilterInput) ryhVar.f44265a, (SearchableEngagementSortInput) ryhVar.f44266b), Optional.ofNullable(str), i)).m47686M(new rl7() { // from class: o.goc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return roc.Bc((ModelEngagementConnection) obj);
            }
        });
    }

    default SearchableEngagementSortInput Yt(SearchableEngagementSortInput searchableEngagementSortInput) {
        return (SearchableEngagementSortInput) Optional.ofNullable(searchableEngagementSortInput).orElse(SearchableEngagementSortInput.builder().direction(SearchableSortDirection.desc).field(SearchableEngagementSortableFields.updatedAt).build());
    }

    default s47 Yz(final ryh ryhVar, final int i) {
        return s47.m47669H(new Callable() { // from class: o.aoc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15075a.g2(ryhVar, i);
            }
        });
    }

    default ModelEngagementConnection c6() {
        return ModelEngagementConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    default SimpleGraphQLRequest ct(ryh ryhVar, Optional optional, final int i) {
        if (Objects.isNull(ryhVar) && !optional.isPresent()) {
            return null;
        }
        SearchableEngagementFilterInput searchableEngagementFilterInput = (SearchableEngagementFilterInput) ryhVar.f44265a;
        SearchableEngagementSortInput searchableEngagementSortInput = (SearchableEngagementSortInput) ryhVar.f44266b;
        final SearchEngagementsQuery.Builder builder = SearchEngagementsQuery.builder();
        Optional optionalOfNullable = Optional.ofNullable(searchableEngagementFilterInput);
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new vnc(builder));
        Optional.ofNullable(Yt(searchableEngagementSortInput)).ifPresent(new wnc(builder));
        return new SimpleGraphQLRequest("query SearchEngagements($filter: SearchableEngagementFilterInput, $sort: SearchableEngagementSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEngagements(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      id\n      engagementType\n      contactId\n      contact {\n         id\n         activeDealStage\n         profilePhotoUrl\n         emails {\n             email\n         }\n         name\n         ownerId\n         contactNumberDetail {\n             isWhatsappNumber\n             phoneNumber\n         }\n         businessDetail {\n             id\n             name\n             website\n             industry\n         }\n      }\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      reminderDateTime\n      uploadedFiledUrl\n      customTaskCompletionData\n      customTaskInputData\n      taskEngagementActions\n      nextFollowUpOn\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchEngagementsQuery) optional.map(new Function() { // from class: o.ioc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return roc.Mv(builder, i, (String) obj);
            }
        }).orElse(builder.limit(Integer.valueOf(i)).build())), Map.class, new GsonVariablesSerializer());
    }

    default ryh gv(vqh vqhVar) {
        return vqhVar.m53292z(on(), Eo());
    }

    default s47 jv(vqh vqhVar, final int i) {
        final ryh ryhVarGv = gv(vqhVar);
        return s47.m47669H(new Callable() { // from class: o.noc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37105a.t6(ryhVarGv, i);
            }
        });
    }

    default SimpleGraphQLRequest lz(ryh ryhVar, Optional optional, final int i) {
        if (Objects.isNull(ryhVar) && !optional.isPresent()) {
            return null;
        }
        SearchableEngagementFilterInput searchableEngagementFilterInput = (SearchableEngagementFilterInput) ryhVar.f44265a;
        SearchableEngagementSortInput searchableEngagementSortInput = (SearchableEngagementSortInput) ryhVar.f44266b;
        final SearchEngagementsQuery.Builder builder = SearchEngagementsQuery.builder();
        Optional optionalOfNullable = Optional.ofNullable(searchableEngagementFilterInput);
        Objects.requireNonNull(builder);
        optionalOfNullable.ifPresent(new vnc(builder));
        Optional.ofNullable(Yt(searchableEngagementSortInput)).ifPresent(new wnc(builder));
        return new SimpleGraphQLRequest("query SearchEngagements($filter: SearchableEngagementFilterInput, $sort: SearchableEngagementSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEngagements(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      id\n      engagementType\n      contactId\n      contact {\n         id\n         activeDealStage\n         profilePhotoUrl\n         emails {\n             email\n         }\n         name\n         ownerId\n         contactNumberDetail {\n             isWhatsappNumber\n             phoneNumber\n         }\n         businessDetail {\n             id\n             name\n             website\n             industry\n         }\n      }\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      callDirection\n      callConnectStatus\n      callRecordingUrl\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      noteHeading\n      noteAdditionMethod\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      reminderDateTime\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      videoCallPlatform\n      videoCallLink\n      videoCallMetadata\n      videoCallOutcome\n      customCallOutcomeData\n      customVisitOutcomeData\n      customVideoCallInputData\n      customTaskCompletionData\n      customTaskInputData\n      taskEngagementActions\n      nextFollowUpOn\n      createdAt\n      updatedAt\n      engagementUpdate(limit: 1) {\n         items {\n             createdAt\n             dueDateTimeChangedFrom\n             dueDateTimeChangedTo\n             engagementId\n             id\n             note\n             updatedAt\n         }\n         nextToken\n      }\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchEngagementsQuery) optional.map(new Function() { // from class: o.hoc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return roc.p1(builder, i, (String) obj);
            }
        }).orElse(builder.limit(Integer.valueOf(i)).build())), Map.class, new GsonVariablesSerializer());
    }

    default s47 uk(final ryh ryhVar, final int i, final x6c x6cVar) {
        return s47.m47669H(new Callable() { // from class: o.pnc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f40298a.ci(ryhVar, i, x6cVar);
            }
        });
    }

    default x6c vv(ryh ryhVar) {
        return executeGraphQL(new SimpleGraphQLRequest("query SearchEngagements($filter: SearchableEngagementFilterInput, $sort: SearchableEngagementSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEngagements(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      engagementType\n      contactId\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      callStatus\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      callOutcomeNature\n      callRecordingExternalResource\n      noteHeading\n      noteAdditionMethod\n      voiceNoteUrl\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      nextFollowUpOn\n      nextFollowUpSetBy\n      reminderDateTime\n      callRecordingUrl\n      callTranscriptUrl\n      callTranscriptSummary\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      visitOutcomeNature\n      videoCallPlatform\n      videoCallLink\n      meetingName\n      meetingCode\n      videoCallMetadata\n      videoCallOutcome\n      paymentDataId\n      calendarEventId\n      calendarName\n      campaignId\n      campaignRun\n      engagementSourceType\n      engagementSource\n      engagementSourceLevelTwo\n      systemAction\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      customVideoCallInputData\n      deviceId\n      totalCallDuration\n      cloudProviderNumber\n      hangupReason\n      cloudProvider\n      callType\n      phoneCallLogId\n      externalEventRecordId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap(SearchEngagementsQuery.builder().filter((SearchableEngagementFilterInput) ryhVar.f44265a).limit(1).build()), SearchEngagementsQuery.Data.class, new GsonVariablesSerializer())).m55014i(new ooc(this)).m27844k(new rl7() { // from class: o.poc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (SearchEngagementsQuery.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.qoc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((SearchEngagementsQuery.Data) obj).searchEngagements();
            }
        }).m27844k(new rl7() { // from class: o.qnc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((SearchEngagementsQuery.SearchEngagements) obj).total();
            }
        }).m27846n();
    }
}
