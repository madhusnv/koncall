package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.services.model.ModelChatChannelConnection;
import ai.salesmax.services.model.ModelChatMessageConnection;
import ai.salesmax.services.model.ModelChatParticipantConnection;
import ai.salesmax.services.model.ModelWabaAccountConnection;
import com.amazonaws.amplify.generated.graphql.GetBotContextByChannelIdQuery;
import com.amazonaws.amplify.generated.graphql.GetChannelByContactQuery;
import com.amazonaws.amplify.generated.graphql.GetChatChannelQuery;
import com.amazonaws.amplify.generated.graphql.GetChatMessageQuery;
import com.amazonaws.amplify.generated.graphql.GetDirectChannelByUserIdsQuery;
import com.amazonaws.amplify.generated.graphql.GetWabaByAccountQuery;
import com.amazonaws.amplify.generated.graphql.ListAllMessagesByChannelQuery;
import com.amazonaws.amplify.generated.graphql.ListChannelByParticipantQuery;
import com.amazonaws.amplify.generated.graphql.SearchChatChannelsQuery;
import com.amazonaws.amplify.generated.graphql.SearchChatMessagesQuery;
import com.amazonaws.amplify.generated.graphql.SearchChatParticipantsQuery;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.ChatBotContext;
import com.amplifyframework.datastore.generated.model.ChatChannel;
import com.amplifyframework.datastore.generated.model.ChatMessage;
import com.amplifyframework.datastore.generated.model.ChatParticipant;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import type.C19063x745baff2;
import type.ModelChatMessageFilterInput;
import type.ModelChatParticipantChannelByParticipantCompositeKeyInput;
import type.ModelChatParticipantFilterInput;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;
import type.SearchableChatChannelFilterInput;
import type.SearchableChatChannelSortInput;
import type.SearchableChatChannelSortableFields;
import type.SearchableChatMessageFilterInput;
import type.SearchableChatMessageSortInput;
import type.SearchableChatMessageSortableFields;
import type.SearchableChatParticipantFilterInput;
import type.SearchableChatParticipantSortInput;
import type.SearchableChatParticipantSortableFields;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public interface u03 extends me1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Ax(SearchableChatMessageFilterInput searchableChatMessageFilterInput, int i, x6c x6cVar) {
        return new PaginatedTokenResults(new fz2(this), searchableChatMessageFilterInput, i, x6cVar);
    }

    static Map D3(Map map) {
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Df(String str, int i, x6c x6cVar) {
        return new PaginatedTokenResults(new sy2(this), uyh.of(str, null), i, x6cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults G1(SearchableChatChannelFilterInput searchableChatChannelFilterInput, int i, x6c x6cVar) {
        return new PaginatedTokenResults(new vy2(this), searchableChatChannelFilterInput, i, x6cVar);
    }

    static /* synthetic */ Map G7(String str, Map map) {
        return (Map) map.get(str);
    }

    static /* synthetic */ ryh Ga(ModelChatChannelConnection modelChatChannelConnection) {
        return uyh.of(modelChatChannelConnection.getItems(), modelChatChannelConnection.getNextToken());
    }

    static /* synthetic */ void H4(Map map, Map map2) {
        map.put("messages", (List) map2.getOrDefault("items", Collections.emptyList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults Hv(String str, int i, x6c x6cVar) {
        return new PaginatedTokenResults(new oy2(this), uyh.of(str, null), i, x6cVar);
    }

    static /* synthetic */ ListAllMessagesByChannelQuery Jb(ListAllMessagesByChannelQuery.Builder builder, int i, String str) {
        return builder.nextToken(str).limit(Integer.valueOf(i)).build();
    }

    static /* synthetic */ ryh Jr(ModelChatMessageConnection modelChatMessageConnection) {
        return uyh.of(modelChatMessageConnection.getItems(), modelChatMessageConnection.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelChatMessageConnection Mg(Map map) {
        return (ModelChatMessageConnection) sf(map, ModelChatMessageConnection.class);
    }

    static /* synthetic */ SearchChatChannelsQuery Od(SearchChatChannelsQuery.Builder builder, String str) {
        return builder.nextToken(str).build();
    }

    static /* synthetic */ ryh Oj(ModelChatParticipantConnection modelChatParticipantConnection) {
        return uyh.of(modelChatParticipantConnection.getItems(), modelChatParticipantConnection.getNextToken());
    }

    static ModelChatChannelConnection Pi() {
        return ModelChatChannelConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    static /* synthetic */ ModelChatParticipantChannelByParticipantCompositeKeyInput Pp(String str) {
        return ModelChatParticipantChannelByParticipantCompositeKeyInput.builder().participantId(str).build();
    }

    static Map Pq(final Map map) {
        Optional.ofNullable((Map) Optional.ofNullable(map).map(new Function() { // from class: o.wy2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.V2((Map) obj);
            }
        }).orElse(null)).ifPresent(new Consumer() { // from class: o.yy2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                u03.H4(map, (Map) obj);
            }
        });
        return map;
    }

    static /* synthetic */ Map Ps(String str, Map map) {
        return (Map) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    /* synthetic */ default PaginatedTokenResults m50827Q(SearchableChatParticipantFilterInput searchableChatParticipantFilterInput, int i, x6c x6cVar) {
        return new PaginatedTokenResults(new ty2(this), searchableChatParticipantFilterInput, i, x6cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Map Sf(Map map) {
        ((List) map.get("items")).stream().forEach(new Consumer() { // from class: o.kz2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f32869a.Ke((Map) obj);
            }
        });
        return map;
    }

    static /* synthetic */ ryh Sm(ModelChatParticipantConnection modelChatParticipantConnection) {
        return uyh.of(modelChatParticipantConnection.getItems(), modelChatParticipantConnection.getNextToken());
    }

    static /* synthetic */ Object V2(Map map) {
        return map.get("messages");
    }

    static /* synthetic */ ModelStringKeyConditionInput V3(String str) {
        return ModelStringKeyConditionInput.builder().le(str).build();
    }

    static /* synthetic */ ListChannelByParticipantQuery Vb(ListChannelByParticipantQuery.Builder builder, int i, String str) {
        return builder.nextToken(str).limit(Integer.valueOf(i)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void W7(x6c x6cVar, int i, final SearchableChatParticipantFilterInput searchableChatParticipantFilterInput, final f3e f3eVar, rag ragVar) {
        x6cVar.n0(i, TimeUnit.MILLISECONDS).m55717M(new rl7() { // from class: o.n03
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f36149a.Zl(searchableChatParticipantFilterInput, (ChatParticipant) obj);
            }
        }).v0(new gu3() { // from class: o.o03
            @Override // p001o.gu3
            public final void accept(Object obj) {
                f3eVar.mo16560e((Integer) obj);
            }
        }, new gu3() { // from class: o.q03
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f41029a.ws(f3eVar, (Throwable) obj);
            }
        });
    }

    static ModelChatMessageConnection Y0() {
        return ModelChatMessageConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    static /* synthetic */ ryh Yi(ModelChatMessageConnection modelChatMessageConnection) {
        return uyh.of(modelChatMessageConnection.getItems(), modelChatMessageConnection.getNextToken());
    }

    static /* synthetic */ SearchChatParticipantsQuery Yv(SearchChatParticipantsQuery.Builder builder, String str) {
        return builder.nextToken(str).build();
    }

    static /* synthetic */ C19063x745baff2 Yy(ModelChatParticipantChannelByParticipantCompositeKeyInput modelChatParticipantChannelByParticipantCompositeKeyInput) {
        return C19063x745baff2.builder().beginsWith(modelChatParticipantChannelByParticipantCompositeKeyInput).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Zl(SearchableChatParticipantFilterInput searchableChatParticipantFilterInput, ChatParticipant chatParticipant) {
        String.format("Chat message received by participant %s", chatParticipant);
        return vz(searchableChatParticipantFilterInput, null, 1).h0();
    }

    static /* synthetic */ boolean bg(String str, ChatChannel chatChannel) {
        return str.equalsIgnoreCase(chatChannel.getMessagePlatform());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelChatChannelConnection c9(Map map) {
        return (ModelChatChannelConnection) sf(map, ModelChatChannelConnection.class);
    }

    static /* synthetic */ boolean cl(List list) {
        return list.size() == 1;
    }

    static Map cr(Map map) {
        map.put("channel", Pq((Map) map.get("channel")));
        return map;
    }

    static /* synthetic */ Integer fe(Map map) {
        try {
            return Integer.valueOf(Double.valueOf(Double.parseDouble(map.get("total").toString())).intValue());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ChatBotContext fp(Map map) {
        List list;
        Map map2 = (Map) map.get("getBotContextByChannelId");
        if (map2 == null || (list = (List) map2.get("items")) == null || list.isEmpty()) {
            return null;
        }
        return (ChatBotContext) sf(list.get(0), ChatBotContext.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ChatChannel fr(Map map) {
        return (ChatChannel) sf(map, ChatChannel.class);
    }

    static /* synthetic */ Map fy(Map map) {
        return (Map) map.get("getChatChannel");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Map ge(Map map) {
        ((List) map.get("items")).stream().forEach(new Consumer() { // from class: o.xz2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f54495a.Kg((Map) obj);
            }
        });
        return map;
    }

    static /* synthetic */ ModelStringKeyConditionInput ht(String str) {
        return ModelStringKeyConditionInput.builder().gt(str).build();
    }

    static /* synthetic */ Map hv(Map map) {
        return (Map) map.get("getChatMessage");
    }

    static ModelChatParticipantConnection je() {
        return ModelChatParticipantConnection.builder().items(Collections.emptyList()).nextToken(null).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Map ke(Map map) {
        ((List) map.get("items")).stream().forEach(new Consumer() { // from class: o.d03
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f18925a.de((Map) obj);
            }
        });
        return map;
    }

    static /* synthetic */ ryh o6(ModelChatMessageConnection modelChatMessageConnection) {
        return uyh.of(modelChatMessageConnection.getItems(), modelChatMessageConnection.getNextToken());
    }

    static /* synthetic */ Map o8(String str, Map map) {
        return (Map) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default s47 od(String str, Long l, int i, String str2) {
        return dy(uyh.of(str, null), l, str2, i);
    }

    static ChatChannel q3(String str) {
        return ChatChannel.builder().accountId(str).id("").build();
    }

    static ChatParticipant r3(String str) {
        return ChatParticipant.builder().accountId(str).participantId("").participationStatus("").channel(q3(str)).id("").build();
    }

    static /* synthetic */ ryh s1(ModelChatMessageConnection modelChatMessageConnection) {
        return uyh.of(modelChatMessageConnection.getItems(), modelChatMessageConnection.getNextToken());
    }

    static /* synthetic */ SearchChatMessagesQuery v0(SearchChatMessagesQuery.Builder builder, int i, String str) {
        return builder.nextToken(str).limit(Integer.valueOf(i)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void ws(f3e f3eVar, Throwable th) {
        f3eVar.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults wt(String str, Long l, Long l2, ModelSortDirection modelSortDirection, int i, x6c x6cVar) {
        return new PaginatedTokenResults(new ly2(this), uyh.of(str, null, l, l2, modelSortDirection), i, x6cVar);
    }

    static /* synthetic */ Boolean x6(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    static /* synthetic */ Map yh(String str, Map map) {
        return (Map) map.get(str);
    }

    static /* synthetic */ ryh yk(ModelChatParticipantConnection modelChatParticipantConnection) {
        return uyh.of(modelChatParticipantConnection.getItems(), modelChatParticipantConnection.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default ModelChatParticipantConnection yl(Map map) {
        return (ModelChatParticipantConnection) sf(map, ModelChatParticipantConnection.class);
    }

    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    default Map Kg(Map map) {
        return cr(map);
    }

    /* renamed from: E */
    default s47 m50830E(String str, int i, x6c x6cVar) {
        return t3(str, i, x6cVar);
    }

    default s47 Em(final String str, final int i, final x6c x6cVar) {
        return s47.m47669H(new Callable() { // from class: o.tz2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48106a.Df(str, i, x6cVar);
            }
        });
    }

    default x6c Eq(String str) {
        return executeGraphQL(new SimpleGraphQLRequest("query GetChatChannel($id: ID!) {\n  getChatChannel(id: $id) {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    channelName\n    tags\n    recipientType\n    channelType\n    channelSubType\n    messagePlatform\n    externalParticipantsAllowed\n    participantScopeIfInternal\n    userIdsForDirectChannel\n    channelStatus\n    channelOpenUntil\n    channelWillBeChargedNext\n    contactId\n    visitorId\n    recipientExternalId\n    recipientExternalIdType\n    ownerId\n    primaryTeamId\n    toBeAssigned\n    salesmaxAccountId\n    createdById\n    createdAt\n    updatedAt\n    messages(limit: 1, sortDirection: DESC) {\n      __typename\n       items {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    channelId\n    contactId\n    visitorId\n    messageType\n    messageCategory\n    messagePlatform\n    externalMessageReferenceId\n    replyingToMessageId\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      contactId\n      messageType\n      messageCategory\n      messagePlatform\n      externalMessageReferenceId\n      replyingToMessageId\n      replyingToMessageIdExternal\n      isStarred\n      status\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      text\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    replyingToMessageIdExternal\n    isStarred\n    status\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    text\n    headerText\n    footerText\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    buttons{\n         waType\n         waText\n         waUrl\n         waNumber\n    }\n    parameters{\n         taType\n         parameters{\n             type\n             value\n         }\n    }\n    mediaObjectId\n    media {\n      __typename\n      id\n      fileUrl\n      fileName\n      fileMimeType\n      fileThumbnailUrl\n    }\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    createdAt\n    updatedAt\n      }\n      nextToken\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      contactSource\n      contactStatus\n      contactType\n      department\n      designation\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      userDefinedTags\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      recentEngagements\n      leadLifecycleStage\n      leadLifecycleStageSubCategory\n      prospectingAttempts\n      activeDealStage\n      activeDealStageUpdatedAt\n      manualClosedReason\n      createdAt\n      updatedAt\n    }\n  }\n}", toVariablesMap(GetChatChannelQuery.builder().id(str).build()), Map.class, new GsonVariablesSerializer())).m55014i(new r03(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.fy2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.fy((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.gy2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f25934a.Ke((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.hy2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f27785a.fr((Map) obj);
            }
        }).m27846n();
    }

    default s47 F8(SearchableChatParticipantFilterInput searchableChatParticipantFilterInput, String str, int i) {
        return It(Mm(searchableChatParticipantFilterInput, Optional.ofNullable(str), i), "searchChatParticipants").m47686M(new rl7() { // from class: o.mz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.yk((ModelChatParticipantConnection) obj);
            }
        });
    }

    default s47 Iq(SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(Y0()) : executeGraphQL(simpleGraphQLRequest).m55014i(new r03(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.cz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.yh(str, (Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.dz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f20663a.ke((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.ez2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f22426a.Mg((Map) obj);
            }
        }).m27845m();
    }

    default s47 It(SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(je()) : executeGraphQL(simpleGraphQLRequest).m55014i(new r03(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.oz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.Ps(str, (Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.pz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f40744a.ge((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.qz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f42641a.yl((Map) obj);
            }
        }).m27845m();
    }

    /* renamed from: Jk, reason: merged with bridge method [inline-methods] */
    default s47 yt(String str, String str2, int i) {
        final SearchChatParticipantsQuery.Builder builderLimit = SearchChatParticipantsQuery.builder().filter(SearchableChatParticipantFilterInput.builder().channelId(SearchableIDFilterInput.builder().eq(str).build()).build()).limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(str2);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.zy2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.nextToken((String) obj);
            }
        });
        return It(new SimpleGraphQLRequest("query SearchChatParticipants($filter: SearchableChatParticipantFilterInput, $sort: SearchableChatParticipantSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchChatParticipants(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      channel {\n         __typename\n         id\n         accountId\n         phoneNumberIdExternal\n         channelName\n         tags\n         recipientType\n         channelType\n         channelSubType\n         messagePlatform\n         externalParticipantsAllowed\n         participantScopeIfInternal\n         userIdsForDirectChannel\n         channelStatus\n         channelOpenUntil\n         userIdsForDirectChannel\n         contactId\n         visitorId\n         contact {\n             id\n             updatedById\n             name\n             contactNumberDetail {\n                 phoneNumber\n                 isWhatsappNumber\n             }\n             businessDetail {\n                 id\n                 name\n                 website\n                 industry\n             }\n             contactSource\n             recentEngagements\n             leadLifecycleStage\n             leadLifecycleStageSubCategory\n             prospectingAttempts\n             activeDealStage\n             activeDealStageUpdatedAt\n             lastCallOutcome\n             lastKnownDisposition\n             lastLeadAssignmentDateTime\n             userDefinedTags\n         }\n         recipientExternalId\n         recipientExternalIdType\n         ownerId\n         primaryTeamId\n         toBeAssigned\n         salesmaxAccountId\n         createdById\n         createdAt\n         updatedAt\n         messages(limit: 1, sortDirection: DESC) {\n             __typename\n              items {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    channelId\n    contactId\n    visitorId\n    messageType\n    messageCategory\n    messagePlatform\n    externalMessageReferenceId\n    replyingToMessageId\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      contactId\n      messageType\n      messageCategory\n      messagePlatform\n      externalMessageReferenceId\n      replyingToMessageId\n      replyingToMessageIdExternal\n      isStarred\n      status\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      text\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    replyingToMessageIdExternal\n    isStarred\n    status\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    text\n    headerText\n    footerText\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    buttons{\n         waType\n         waText\n         waUrl\n         waNumber\n    }\n    parameters{\n         taType\n         parameters{\n             type\n             value\n         }\n    }\n    mediaObjectId\n    media {\n      __typename\n      id\n      fileUrl\n      fileName\n      fileMimeType\n      fileThumbnailUrl\n    }\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    createdAt\n    updatedAt\n             }\n             nextToken\n         }\n      }\n      participantId\n      participationStatus\n      unreadMessageCount\n      lastViewed\n      isStarred\n      joinedAt\n      leftAt\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap(builderLimit.build()), Map.class, new GsonVariablesSerializer()), "searchChatParticipants").m47686M(new rl7() { // from class: o.az2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.Oj((ModelChatParticipantConnection) obj);
            }
        });
    }

    default SimpleGraphQLRequest Mm(SearchableChatParticipantFilterInput searchableChatParticipantFilterInput, Optional optional, int i) {
        final SearchChatParticipantsQuery.Builder builderLimit = SearchChatParticipantsQuery.builder().filter(searchableChatParticipantFilterInput).sort(SearchableChatParticipantSortInput.builder().direction(SearchableSortDirection.desc).field(SearchableChatParticipantSortableFields.updatedAt).build()).limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(searchableChatParticipantFilterInput);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.h03
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.filter((SearchableChatParticipantFilterInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query SearchChatParticipants($filter: SearchableChatParticipantFilterInput, $sort: SearchableChatParticipantSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchChatParticipants(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      channel {\n         __typename\n         id\n         accountId\n         phoneNumberIdExternal\n         channelName\n         tags\n         recipientType\n         channelType\n         channelSubType\n         messagePlatform\n         externalParticipantsAllowed\n         participantScopeIfInternal\n         userIdsForDirectChannel\n         channelStatus\n         channelOpenUntil\n         userIdsForDirectChannel\n         contactId\n         visitorId\n         contact {\n             id\n             updatedById\n             name\n             contactNumberDetail {\n                 phoneNumber\n                 isWhatsappNumber\n             }\n             businessDetail {\n                 id\n                 name\n                 website\n                 industry\n             }\n             contactSource\n             recentEngagements\n             leadLifecycleStage\n             leadLifecycleStageSubCategory\n             prospectingAttempts\n             activeDealStage\n             activeDealStageUpdatedAt\n             lastCallOutcome\n             lastKnownDisposition\n             lastLeadAssignmentDateTime\n             userDefinedTags\n         }\n         recipientExternalId\n         recipientExternalIdType\n         ownerId\n         primaryTeamId\n         toBeAssigned\n         salesmaxAccountId\n         createdById\n         createdAt\n         updatedAt\n         messages(limit: 1, sortDirection: DESC) {\n             __typename\n              items {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    channelId\n    contactId\n    visitorId\n    messageType\n    messageCategory\n    messagePlatform\n    externalMessageReferenceId\n    replyingToMessageId\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      contactId\n      messageType\n      messageCategory\n      messagePlatform\n      externalMessageReferenceId\n      replyingToMessageId\n      replyingToMessageIdExternal\n      isStarred\n      status\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      text\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    replyingToMessageIdExternal\n    isStarred\n    status\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    text\n    headerText\n    footerText\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    buttons{\n         waType\n         waText\n         waUrl\n         waNumber\n    }\n    parameters{\n         taType\n         parameters{\n             type\n             value\n         }\n    }\n    mediaObjectId\n    media {\n      __typename\n      id\n      fileUrl\n      fileName\n      fileMimeType\n      fileThumbnailUrl\n    }\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    createdAt\n    updatedAt\n             }\n             nextToken\n         }\n      }\n      participantId\n      participationStatus\n      unreadMessageCount\n      lastViewed\n      isStarred\n      joinedAt\n      leftAt\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchChatParticipantsQuery) optional.map(new Function() { // from class: o.i03
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.Yv(builderLimit, (String) obj);
            }
        }).orElse(builderLimit.build())), Map.class, new GsonVariablesSerializer());
    }

    default s47 N6(tyh tyhVar, String str, int i) {
        return Iq(m50831l((String) tyhVar.f48095a, (ModelChatMessageFilterInput) tyhVar.f48096b, Optional.ofNullable((Long) tyhVar.f48097c), Optional.ofNullable((Long) tyhVar.f48098d), Optional.ofNullable(str), Optional.ofNullable((ModelSortDirection) tyhVar.f48099e), i), "listAllMessagesByChannel").m47686M(new rl7() { // from class: o.lz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.Jr((ModelChatMessageConnection) obj);
            }
        });
    }

    default s47 N9(final String str, final Long l, final Long l2, final ModelSortDirection modelSortDirection, final int i, final x6c x6cVar) {
        return s47.m47669H(new Callable() { // from class: o.jy2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f31241a.wt(str, l, l2, modelSortDirection, i, x6cVar);
            }
        });
    }

    default x6c Q0(String str) {
        return o0(new SimpleGraphQLRequest("query GetDirectChannelByUserIds($accountId: ID, $userIdsForDirectChannel: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelChatChannelFilterInput, $limit: Int, $nextToken: String) {\n  getDirectChannelByUserIds(accountId: $accountId, userIdsForDirectChannel: $userIdsForDirectChannel, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}", toVariablesMap(GetDirectChannelByUserIdsQuery.builder().accountId(on()).userIdsForDirectChannel(ModelStringKeyConditionInput.builder().eq(str).build()).build()), Map.class, new GsonVariablesSerializer()), "getDirectChannelByUserIds").m47686M(new cy2()).h0().m55717M(new tod()).m55715K().m27846n();
    }

    default s47 Qj(ryh ryhVar, String str, int i) {
        return It(U6((String) ryhVar.f44265a, (ModelChatParticipantFilterInput) ryhVar.f44266b, Optional.ofNullable(str), i), "listChannelByParticipant").m47686M(new rl7() { // from class: o.gz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.Sm((ModelChatParticipantConnection) obj);
            }
        });
    }

    default s47 Sk(final SearchableChatMessageFilterInput searchableChatMessageFilterInput, final int i, final x6c x6cVar) {
        return s47.m47669H(new Callable() { // from class: o.uy2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f49635a.Ax(searchableChatMessageFilterInput, i, x6cVar);
            }
        });
    }

    default s47 Tg(final SearchableChatParticipantFilterInput searchableChatParticipantFilterInput, final int i, final x6c x6cVar) {
        s47 s47VarVz = vz(searchableChatParticipantFilterInput, null, 1);
        final f3e f3eVarN0 = f3e.N0();
        return s47.m47677p(s47VarVz, f3eVarN0.C0(la1.BUFFER)).m47680A(new gu3() { // from class: o.g03
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f24319a.W7(x6cVar, i, searchableChatParticipantFilterInput, f3eVarN0, (rag) obj);
            }
        });
    }

    default s47 Ty(SearchableChatChannelFilterInput searchableChatChannelFilterInput, String str, int i) {
        return o0(X9(searchableChatChannelFilterInput, Optional.ofNullable(str), i), "searchChatChannels").m47686M(new rl7() { // from class: o.nz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.Ga((ModelChatChannelConnection) obj);
            }
        });
    }

    default SimpleGraphQLRequest U6(String str, ModelChatParticipantFilterInput modelChatParticipantFilterInput, Optional optional, final int i) {
        final ListChannelByParticipantQuery.Builder builderSortDirection = ListChannelByParticipantQuery.builder().accountId(on()).limit(Integer.valueOf(i)).sortDirection(ModelSortDirection.DESC);
        Optional map = Optional.ofNullable(str).map(new Function() { // from class: o.yz2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.Pp((String) obj);
            }
        }).map(new Function() { // from class: o.zz2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.Yy((ModelChatParticipantChannelByParticipantCompositeKeyInput) obj);
            }
        });
        Objects.requireNonNull(builderSortDirection);
        map.ifPresent(new Consumer() { // from class: o.a03
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.participantIdUpdatedAt((C19063x745baff2) obj);
            }
        });
        Optional.ofNullable(modelChatParticipantFilterInput).ifPresent(new Consumer() { // from class: o.b03
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderSortDirection.filter((ModelChatParticipantFilterInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query ListChannelByParticipant($accountId: ID, $participantIdUpdatedAt: ModelChatParticipantChannelByParticipantCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelChatParticipantFilterInput, $limit: Int, $nextToken: String) {\n  listChannelByParticipant(accountId: $accountId, participantIdUpdatedAt: $participantIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      channel {\n         __typename\n         id\n         accountId\n         phoneNumberIdExternal\n         channelName\n         tags\n         recipientType\n         channelType\n         channelSubType\n         messagePlatform\n         externalParticipantsAllowed\n         participantScopeIfInternal\n         userIdsForDirectChannel\n         channelStatus\n         channelOpenUntil\n         userIdsForDirectChannel\n         contactId\n         visitorId\n         contact {\n             id\n             updatedById\n             name\n             contactNumberDetail {\n                 phoneNumber\n                 isWhatsappNumber\n             }\n             businessDetail {\n                 id\n                 name\n                 website\n                 industry\n             }\n             contactSource\n             recentEngagements\n             leadLifecycleStage\n             leadLifecycleStageSubCategory\n             prospectingAttempts\n             activeDealStage\n             activeDealStageUpdatedAt\n             lastCallOutcome\n             lastKnownDisposition\n             lastLeadAssignmentDateTime\n             userDefinedTags\n         }\n         recipientExternalId\n         recipientExternalIdType\n         ownerId\n         primaryTeamId\n         toBeAssigned\n         salesmaxAccountId\n         createdById\n         createdAt\n         updatedAt\n         messages(limit: 1, sortDirection: DESC) {\n             __typename\n              items {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    channelId\n    contactId\n    visitorId\n    messageType\n    messageCategory\n    messagePlatform\n    externalMessageReferenceId\n    replyingToMessageId\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      contactId\n      messageType\n      messageCategory\n      messagePlatform\n      externalMessageReferenceId\n      replyingToMessageId\n      replyingToMessageIdExternal\n      isStarred\n      status\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      text\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    replyingToMessageIdExternal\n    isStarred\n    status\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    text\n    headerText\n    footerText\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    buttons{\n         waType\n         waText\n         waUrl\n         waNumber\n    }\n    parameters{\n         taType\n         parameters{\n             type\n             value\n         }\n    }\n    mediaObjectId\n    media {\n      __typename\n      id\n      fileUrl\n      fileName\n      fileMimeType\n      fileThumbnailUrl\n    }\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    createdAt\n    updatedAt\n             }\n             nextToken\n         }\n      }\n      participantId\n      participationStatus\n      unreadMessageCount\n      lastViewed\n      isStarred\n      joinedAt\n      leftAt\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}", toVariablesMap((ListChannelByParticipantQuery) optional.map(new Function() { // from class: o.c03
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.Vb(builderSortDirection, i, (String) obj);
            }
        }).orElse(builderSortDirection.build())), Map.class, new GsonVariablesSerializer());
    }

    default SimpleGraphQLRequest X9(SearchableChatChannelFilterInput searchableChatChannelFilterInput, Optional optional, int i) {
        final SearchChatChannelsQuery.Builder builderLimit = SearchChatChannelsQuery.builder().filter(searchableChatChannelFilterInput).sort(SearchableChatChannelSortInput.builder().direction(SearchableSortDirection.desc).field(SearchableChatChannelSortableFields.updatedAt).build()).limit(Integer.valueOf(i));
        return new SimpleGraphQLRequest("query SearchChatChannels($filter: SearchableChatChannelFilterInput, $sort: SearchableChatChannelSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchChatChannels(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n         __typename\n         id\n         accountId\n         phoneNumberIdExternal\n         channelName\n         tags\n         recipientType\n         channelType\n         channelSubType\n         messagePlatform\n         externalParticipantsAllowed\n         participantScopeIfInternal\n         userIdsForDirectChannel\n         channelStatus\n         channelOpenUntil\n         channelWillBeChargedNext\n         contactId\n         visitorId\n         contact {\n             id\n             updatedById\n             name\n             contactNumberDetail {\n                 phoneNumber\n                 isWhatsappNumber\n             }\n             businessDetail {\n                 id\n                 name\n                 website\n                 industry\n             }\n             contactSource\n             recentEngagements\n             leadLifecycleStage\n             leadLifecycleStageSubCategory\n             prospectingAttempts\n             activeDealStage\n             activeDealStageUpdatedAt\n             lastCallOutcome\n             lastKnownDisposition\n             lastLeadAssignmentDateTime\n             manualClosedReason\n              userDefinedTags\n         }\n         recipientExternalId\n         recipientExternalIdType\n         ownerId\n         primaryTeamId\n         toBeAssigned\n         salesmaxAccountId\n         createdById\n         createdAt\n         updatedAt\n         messages(limit: 1, sortDirection: DESC) {\n             __typename\n              items {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    channelId\n    contactId\n    visitorId\n    messageType\n    messageCategory\n    messagePlatform\n    externalMessageReferenceId\n    replyingToMessageId\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      contactId\n      messageType\n      messageCategory\n      messagePlatform\n      externalMessageReferenceId\n      replyingToMessageId\n      replyingToMessageIdExternal\n      isStarred\n      status\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      text\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    replyingToMessageIdExternal\n    isStarred\n    status\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    text\n    headerText\n    footerText\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    buttons{\n         waType\n         waText\n         waUrl\n         waNumber\n    }\n    parameters{\n         taType\n         parameters{\n             type\n             value\n         }\n    }\n    mediaObjectId\n    media {\n      __typename\n      id\n      fileUrl\n      fileName\n      fileMimeType\n      fileThumbnailUrl\n    }\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    createdAt\n    updatedAt\n             }\n             nextToken\n         }\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchChatChannelsQuery) optional.map(new Function() { // from class: o.j03
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.Od(builderLimit, (String) obj);
            }
        }).orElse(builderLimit.build())), Map.class, new GsonVariablesSerializer());
    }

    default x6c Yp(final String str) {
        final int i = 100;
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.ky2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f32803a.yt(str, i, (String) obj);
            }
        }).h0();
    }

    default s47 aa(String str, Long l, Long l2, ModelSortDirection modelSortDirection, int i, x6c x6cVar) {
        return N9(str, l, l2, modelSortDirection, i, x6cVar);
    }

    default x6c bb() {
        return graphqlQuery(GetWabaByAccountQuery.builder().accountId(on()).build(), GetWabaByAccountQuery.Data.class, new Function() { // from class: o.by2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GetWabaByAccountQuery.Data) obj).getWabaByAccount();
            }
        }, ModelWabaAccountConnection.class).d0(new rl7() { // from class: o.my2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((ModelWabaAccountConnection) obj).getItems();
            }
        }).m55714J(new ggd() { // from class: o.xy2
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return u03.cl((List) obj);
            }
        }).b0().m55019p(new rl7() { // from class: o.iz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.x6((Boolean) obj);
            }
        }).m55027y();
    }

    default s47 dm(SearchableChatMessageFilterInput searchableChatMessageFilterInput, String str, int i) {
        return Iq(tl(searchableChatMessageFilterInput, Optional.ofNullable(str), i), "searchChatMessages").m47686M(new rl7() { // from class: o.f03
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.o6((ModelChatMessageConnection) obj);
            }
        });
    }

    default s47 dy(ryh ryhVar, Long l, String str, int i) {
        return Iq(m50831l((String) ryhVar.f44265a, (ModelChatMessageFilterInput) ryhVar.f44266b, Optional.of(l), Optional.empty(), Optional.ofNullable(str), Optional.empty(), i), "listAllMessagesByChannel").m47686M(new rl7() { // from class: o.bz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.s1((ModelChatMessageConnection) obj);
            }
        });
    }

    default s47 gj(SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(0) : executeGraphQL(simpleGraphQLRequest).m55014i(new r03(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.l03
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.o8(str, (Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.m03
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.fe((Map) obj);
            }
        }).m27845m();
    }

    /* renamed from: l */
    default SimpleGraphQLRequest m50831l(String str, ModelChatMessageFilterInput modelChatMessageFilterInput, Optional optional, Optional optional2, Optional optional3, Optional optional4, final int i) {
        final ListAllMessagesByChannelQuery.Builder builderChannelId = ListAllMessagesByChannelQuery.builder().channelId(str);
        builderChannelId.sortDirection((ModelSortDirection) optional4.orElse(ModelSortDirection.DESC));
        optional.map(new ko()).map(new Function() { // from class: o.rz2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.ht((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.sz2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderChannelId.createdAt((ModelStringKeyConditionInput) obj);
            }
        });
        optional2.map(new ko()).map(new Function() { // from class: o.uz2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.V3((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.sz2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderChannelId.createdAt((ModelStringKeyConditionInput) obj);
            }
        });
        Optional.ofNullable(modelChatMessageFilterInput).ifPresent(new Consumer() { // from class: o.vz2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderChannelId.filter((ModelChatMessageFilterInput) obj);
            }
        });
        return new SimpleGraphQLRequest("query ListAllMessagesByChannel($channelId: ID, $createdAt: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelChatMessageFilterInput, $limit: Int, $nextToken: String) {\n  listAllMessagesByChannel(channelId: $channelId, createdAt: $createdAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    channelId\n    contactId\n    visitorId\n    messageType\n    messageCategory\n    messagePlatform\n    externalMessageReferenceId\n    replyingToMessageId\n    replyingToMessageIdExternal\n    isStarred\n    status\n    errorMessages\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    text\n    headerText\n    footerText\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    buttons{\n         waType\n         waText\n         waUrl\n         waNumber\n         }\n    parameters{\n         taType\n         parameters{\n             type\n             value\n             }\n         }\n    mediaObjectId\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    createdAt\n    updatedAt\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      contactId\n      messageType\n      messageCategory\n      messagePlatform\n      externalMessageReferenceId\n      replyingToMessageId\n      replyingToMessageIdExternal\n      isStarred\n      status\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      text\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    media {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    }\n    nextToken\n  }\n}", toVariablesMap((ListAllMessagesByChannelQuery) optional3.map(new Function() { // from class: o.wz2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.Jb(builderChannelId, i, (String) obj);
            }
        }).orElse(builderChannelId.limit(Integer.valueOf(i)).build())), Map.class, new GsonVariablesSerializer());
    }

    default x6c lw(String str, String str2) {
        return StringUtils.isBlank(str2) ? x6c.c0(r3(on())) : It(new SimpleGraphQLRequest("query SearchChatParticipants($filter: SearchableChatParticipantFilterInput, $sort: SearchableChatParticipantSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchChatParticipants(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      channel {\n         __typename\n         id\n         accountId\n         phoneNumberIdExternal\n         channelName\n         tags\n         recipientType\n         channelType\n         channelSubType\n         messagePlatform\n         externalParticipantsAllowed\n         participantScopeIfInternal\n         userIdsForDirectChannel\n         channelStatus\n         channelOpenUntil\n         userIdsForDirectChannel\n         contactId\n         visitorId\n         contact {\n             id\n             updatedById\n             name\n             contactNumberDetail {\n                 phoneNumber\n                 isWhatsappNumber\n             }\n             businessDetail {\n                 id\n                 name\n                 website\n                 industry\n             }\n             contactSource\n             recentEngagements\n             leadLifecycleStage\n             leadLifecycleStageSubCategory\n             prospectingAttempts\n             activeDealStage\n             activeDealStageUpdatedAt\n             lastCallOutcome\n             lastKnownDisposition\n             lastLeadAssignmentDateTime\n             userDefinedTags\n         }\n         recipientExternalId\n         recipientExternalIdType\n         ownerId\n         primaryTeamId\n         toBeAssigned\n         salesmaxAccountId\n         createdById\n         createdAt\n         updatedAt\n         messages(limit: 1, sortDirection: DESC) {\n             __typename\n              items {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    channelId\n    contactId\n    visitorId\n    messageType\n    messageCategory\n    messagePlatform\n    externalMessageReferenceId\n    replyingToMessageId\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      contactId\n      messageType\n      messageCategory\n      messagePlatform\n      externalMessageReferenceId\n      replyingToMessageId\n      replyingToMessageIdExternal\n      isStarred\n      status\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      text\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    replyingToMessageIdExternal\n    isStarred\n    status\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    text\n    headerText\n    footerText\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    buttons{\n         waType\n         waText\n         waUrl\n         waNumber\n    }\n    parameters{\n         taType\n         parameters{\n             type\n             value\n         }\n    }\n    mediaObjectId\n    media {\n      __typename\n      id\n      fileUrl\n      fileName\n      fileMimeType\n      fileThumbnailUrl\n    }\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    createdAt\n    updatedAt\n             }\n             nextToken\n         }\n      }\n      participantId\n      participationStatus\n      unreadMessageCount\n      lastViewed\n      isStarred\n      joinedAt\n      leftAt\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap(SearchChatParticipantsQuery.builder().filter(SearchableChatParticipantFilterInput.builder().participantId(SearchableIDFilterInput.builder().eq(str2).build()).channelId(SearchableIDFilterInput.builder().eq(str).build()).participationStatus(SearchableStringFilterInput.builder().ne("INACTIVE").build()).build()).build()), Map.class, new GsonVariablesSerializer()), "searchChatParticipants").m47686M(new rl7() { // from class: o.ny2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((ModelChatParticipantConnection) obj).getItems();
            }
        }).m47684F(new ki()).m47683E().m27846n().p0(r3(on())).m55027y();
    }

    default s47 ms(ryh ryhVar, String str, int i) {
        return Iq(m50831l((String) ryhVar.f44265a, (ModelChatMessageFilterInput) ryhVar.f44266b, Optional.empty(), Optional.empty(), Optional.ofNullable(str), Optional.empty(), i), "listAllMessagesByChannel").m47686M(new rl7() { // from class: o.hz2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.Yi((ModelChatMessageConnection) obj);
            }
        });
    }

    default x6c nA(String str) {
        return executeGraphQL(new SimpleGraphQLRequest("query GetBotContextByChannelId($accountId: ID, $channelId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelChatBotContextFilterInput, $limit: Int, $nextToken: String) {\n  getBotContextByChannelId(accountId: $accountId, channelId: $channelId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      handlerChatBot\n      masterChatBot\n      accountId\n      contactId\n      userId\n      channelId\n      lastChatMessageId\n      createdAt\n      updatedAt\n      isPaused\n      pausedBy\n      pausedById\n      pausedAt\n      currentIntent\n      intentList\n    }\n    nextToken\n  }\n}", toVariablesMap(GetBotContextByChannelIdQuery.builder().accountId(on()).channelId(ModelIDKeyConditionInput.builder().eq(str).build()).build()), Map.class, new GsonVariablesSerializer())).m55014i(new r03(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.s03
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f44357a.fp((Map) obj);
            }
        }).m27841g(new ggd() { // from class: o.t03
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return Objects.nonNull((ChatBotContext) obj);
            }
        }).m27846n();
    }

    default x6c ns(String str) {
        return graphqlQuery(GetChatMessageQuery.builder().id(str).build(), "query GetChatMessage($id: ID!) {\n  getChatMessage(id: $id) {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    channelId\n    contactId\n    visitorId\n    messageType\n    messageCategory\n    messagePlatform\n    externalMessageReferenceId\n    replyingToMessageId\n    replyingToMessageIdExternal\n    isStarred\n    status\n    errorMessages\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    text\n    headerText\n    footerText\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    buttons{\n         waType\n         waText\n         waUrl\n         waNumber\n         }\n    parameters{\n         taType\n         parameters{\n             type\n             value\n             }\n         }\n    mediaObjectId\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    createdAt\n    updatedAt\n    channel {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelOpenUntil\n      channelWillBeChargedNext\n      contactId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      salesmaxAccountId\n      createdById\n      createdAt\n      updatedAt\n    }\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      contactId\n      messageType\n      messageCategory\n      messagePlatform\n      externalMessageReferenceId\n      replyingToMessageId\n      replyingToMessageIdExternal\n      isStarred\n      status\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      text\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    media {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    contact {\n      __typename\n      id\n      accountId\n      ownerId\n      toBeAssigned\n      sharedOwners\n      primaryTeamId\n      sharedTeams\n      accountPriority\n      addedById\n      assignedToId\n      blockedForCallById\n      blockedForCallReason\n      blockedForCallUntil\n      callPriority\n      contactSource\n      contactStatus\n      contactType\n      department\n      designation\n      gender\n      isDecisionMaker\n      isPrivate\n      lockPeriod\n      name\n      preferredContactDays\n      profilePhotoUrl\n      referredBy\n      salutation\n      seniority\n      updatedById\n      hasTask\n      openTaskActivityType\n      lastCalledTime\n      lastCallDirection\n      lastCallOutcome\n      lastCallOutcomeNature\n      lastCallUserId\n      lastCallDuration\n      lastCallEngagementId\n      lastVisitTime\n      lastVisitOutcome\n      lastVisitOutcomeNature\n      lastVisitUserId\n      lastVisitEngagementId\n      lastEmailTime\n      lastEmailUserId\n      lastEmailEngagementId\n      lastWhatsappTime\n      lastWhatsappUserId\n      lastWhatsappEngagementId\n      lastSmsTime\n      lastSmsUserId\n      lastSmsEngagementId\n      lastNoteAddedTime\n      lastNoteUserId\n      lastNoteEngagementId\n      lastTaskDoneTime\n      lastTaskDoneUserId\n      lastTaskDoneEngagementId\n      openTaskCount\n      lastKnownDisposition\n      lastKnownDispositionTime\n      lastLeadAssignmentDateTime\n      lastEngagementFromAccount\n      lastEngagementFromContact\n      freshLeadTag\n      needFollowUpTag\n      needFollowUpTagUpdatedAt\n      activeDealStage\n      activeDealStageUpdatedAt\n      dealDescription\n      isCustomer\n      becameCustomerOn\n      unsuccessfulCallAttempts\n      userDefinedTags\n      bulkUploadReference\n      assignmentMethod\n      whatsappOptInStatus\n      createdAt\n      updatedAt\n    }\n  }\n}", Map.class, new Function() { // from class: o.jz2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.hv((Map) obj);
            }
        }, ChatMessage.class);
    }

    default s47 o0(SimpleGraphQLRequest simpleGraphQLRequest, final String str) {
        return Objects.isNull(simpleGraphQLRequest) ? s47.m47673L(Pi()) : executeGraphQL(simpleGraphQLRequest).m55014i(new r03(this)).m27844k(new ml()).m27844k(new rl7() { // from class: o.py2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return u03.G7(str, (Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.qy2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f42607a.Sf((Map) obj);
            }
        }).m27844k(new rl7() { // from class: o.ry2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f44252a.c9((Map) obj);
            }
        }).m27845m();
    }

    /* renamed from: qn, reason: merged with bridge method [inline-methods] */
    default Map de(Map map) {
        return D3(map);
    }

    default s47 r8(final SearchableChatParticipantFilterInput searchableChatParticipantFilterInput, final int i, final x6c x6cVar) {
        return s47.m47669H(new Callable() { // from class: o.iy2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f29358a.m50827Q(searchableChatParticipantFilterInput, i, x6cVar);
            }
        });
    }

    default s47 t3(final String str, final int i, final x6c x6cVar) {
        return s47.m47669H(new Callable() { // from class: o.p03
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f39131a.Hv(str, i, x6cVar);
            }
        });
    }

    default SimpleGraphQLRequest tl(SearchableChatMessageFilterInput searchableChatMessageFilterInput, Optional optional, final int i) {
        final SearchChatMessagesQuery.Builder builderLimit = SearchChatMessagesQuery.builder().filter(searchableChatMessageFilterInput).sort(SearchableChatMessageSortInput.builder().field(SearchableChatMessageSortableFields.createdAt).direction(SearchableSortDirection.desc).build()).limit(Integer.valueOf(i));
        return new SimpleGraphQLRequest("query SearchChatMessages($filter: SearchableChatMessageFilterInput, $sort: SearchableChatMessageSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchChatMessages(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n    __typename\n    id\n    accountId\n    phoneNumberIdExternal\n    channelId\n    contactId\n    visitorId\n    messageType\n    messageCategory\n    messagePlatform\n    externalMessageReferenceId\n    replyingToMessageId\n    replyingToMessageIdExternal\n    isStarred\n    status\n    errorMessages\n    sentAt\n    deliveredAt\n    readAt\n    internalTemplateId\n    externalTemplateId\n    text\n    headerText\n    footerText\n    contactObjectToSend\n    locationObjectToSend\n    adddressMessageParameters\n    buttons{\n         waType\n         waText\n         waUrl\n         waNumber\n         }\n    parameters{\n         taType\n         parameters{\n             type\n             value\n             }\n         }\n    mediaObjectId\n    mediaMetadata\n    hasImage\n    thumbnailUrl\n    isInbound\n    chatUserId\n    chatUserName\n    chatUserAccountIdIfExternal\n    chatUserAccountNameIfExternal\n    mentioned {\n      __typename\n      entityType\n      entityId\n    }\n    primaryTeamId\n    createdAt\n    updatedAt\n    replyingToMessage {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelId\n      contactId\n      messageType\n      messageCategory\n      messagePlatform\n      externalMessageReferenceId\n      replyingToMessageId\n      replyingToMessageIdExternal\n      isStarred\n      status\n      sentAt\n      deliveredAt\n      readAt\n      internalTemplateId\n      externalTemplateId\n      text\n      mediaObjectId\n      mediaMetadata\n      hasImage\n      thumbnailUrl\n      isInbound\n      chatUserId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    media {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap((SearchChatMessagesQuery) optional.map(new Function() { // from class: o.k03
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u03.v0(builderLimit, i, (String) obj);
            }
        }).orElse(builderLimit.build())), Map.class, new GsonVariablesSerializer());
    }

    default s47 tw(final String str, final Long l) {
        if (l.longValue() <= 0) {
            return s47.m47668C();
        }
        final int i = 10;
        return fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.ey2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f22368a.od(str, l, i, (String) obj);
            }
        });
    }

    /* renamed from: ub, reason: merged with bridge method [inline-methods] */
    default Map Ke(Map map) {
        return Pq(map);
    }

    default s47 vz(SearchableChatParticipantFilterInput searchableChatParticipantFilterInput, String str, int i) {
        return gj(Mm(searchableChatParticipantFilterInput, Optional.ofNullable(str), i), "searchChatParticipants");
    }

    default s47 wb(final SearchableChatChannelFilterInput searchableChatChannelFilterInput, final int i, final x6c x6cVar) {
        return s47.m47669H(new Callable() { // from class: o.e03
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20682a.G1(searchableChatChannelFilterInput, i, x6cVar);
            }
        });
    }

    default x6c zx(String str, final String str2) {
        return o0(new SimpleGraphQLRequest("query GetChannelByContact($contactId: ID, $sortDirection: ModelSortDirection, $filter: ModelChatChannelFilterInput, $limit: Int, $nextToken: String) {\n  getChannelByContact(contactId: $contactId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      phoneNumberIdExternal\n      channelName\n      messagePlatform\n      tags\n      recipientType\n      channelType\n      channelSubType\n      externalParticipantsAllowed\n      participantScopeIfInternal\n      userIdsForDirectChannel\n      channelStatus\n      channelWillBeChargedNext\n      channelOpenUntil\n      contactId\n      visitorId\n      recipientExternalId\n      recipientExternalIdType\n      ownerId\n      primaryTeamId\n      toBeAssigned\n      createdById\n      readNotifiedAt\n      lastMessageByLeadTime\n      lastMessageByUserTime\n      isLastMessageByLead\n      lastOutboundMessageId\n      lastOutboundMessageStatus\n      lastOutboundMessageWasBroadcast\n      chanelHasOnlyBroadcast\n      salesmaxAccountId\n      channelProfilePic\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}", toVariablesMap(GetChannelByContactQuery.builder().contactId(str).build()), Map.class, new GsonVariablesSerializer()), "getChannelByContact").m47686M(new cy2()).h0().m55717M(new tod()).m55714J(new ggd() { // from class: o.dy2
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return u03.bg(str2, (ChatChannel) obj);
            }
        }).m55715K().m27846n();
    }
}
