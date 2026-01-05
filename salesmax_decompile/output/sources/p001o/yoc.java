package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import com.amazonaws.amplify.generated.graphql.ListEngagementTypeByContactQuery;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.ModelEngagementConnection;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import type.C19135x216a5771;
import type.EngagementStatus;
import type.EngagementType;
import type.ModelEngagementFilterInput;
import type.ModelEngagementListEngagementTypeByContactCompositeKeyInput;
import type.ModelEngagementStatusInput;

/* loaded from: classes.dex */
public interface yoc extends jb6 {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default PaginatedTokenResults T4(String str, String str2, ModelEngagementFilterInput modelEngagementFilterInput, int i) {
        return new PaginatedTokenResults(new toc(this), uyh.of(str, str2, modelEngagementFilterInput), i);
    }

    static /* synthetic */ ryh e9(ModelEngagementConnection modelEngagementConnection) {
        return uyh.of(modelEngagementConnection.getItems(), modelEngagementConnection.getNextToken());
    }

    default SimpleGraphQLRequest Wz(String str, String str2, ModelEngagementFilterInput modelEngagementFilterInput, Optional optional, int i) {
        Optional map = Optional.ofNullable(str2).map(new voc());
        EngagementType engagementType = EngagementType.TASK;
        final ListEngagementTypeByContactQuery.Builder builderLimit = ListEngagementTypeByContactQuery.builder().contactId(str).engagementTypeUpdatedAt(C19135x216a5771.builder().beginsWith(ModelEngagementListEngagementTypeByContactCompositeKeyInput.builder().engagementType(engagementType).build()).build()).filter(modelEngagementFilterInput).limit(Integer.valueOf(i));
        Optional optionalOfNullable = Optional.ofNullable(modelEngagementFilterInput);
        Objects.requireNonNull(builderLimit);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.woc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.filter((ModelEngagementFilterInput) obj);
            }
        });
        optional.ifPresent(new Consumer() { // from class: o.xoc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builderLimit.nextToken((String) obj);
            }
        });
        return new SimpleGraphQLRequest("query ListEngagementTypeByContact($contactId: ID, $engagementTypeUpdatedAt: ModelEngagementListEngagementTypeByContactCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelEngagementFilterInput, $limit: Int, $nextToken: String) {\n  listEngagementTypeByContact(contactId: $contactId, engagementTypeUpdatedAt: $engagementTypeUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      id\n      accountId\n      engagementType\n      contactId\n      contact {\n         id\n         contactSource\n         contactStatus\n         activeDealStage\n         profilePhotoUrl\n         userDefinedTags\n         emails {\n             email\n             fullName\n         }\n         name\n         ownerId\n         contactNumberDetail {\n             isWhatsappNumber\n             phoneNumber\n         }\n         businessDetail {\n             id\n             name\n             website\n             industry\n         }\n      }\n      primaryTeamId\n      toBeAssigned\n      ownerId\n      contactPrimaryTeamId\n      contactOwnerId\n      addedById\n      updatedById\n      engagementStatus\n      parentEngagementId\n      nextStepTaskId\n      syncStatus\n      externalNumber\n      userNumber\n      callDirection\n      callConnectStatus\n      callRecordingUrl\n      callStartTime\n      callEndTime\n      durationInMillis\n      callOutcome\n      noteHeading\n      noteAdditionMethod\n      body\n      isManualTask\n      taskHeading\n      taskType\n      taskActivityType\n      taskInputNote\n      taskPriority\n      taskCompletionNote\n      taskCompletionTime\n      taskCompletionType\n      dueDateTime\n      reminderDateTime\n      uploadedFiledUrl\n      visitTime\n      visitNote\n      visitOutcome\n      videoCallPlatform\n      videoCallLink\n      videoCallMetadata\n      videoCallOutcome\n      customCallOutcomeData\n      customVisitOutcomeData\n      customTaskCompletionData\n      customTaskInputData\n      taskEngagementActions\n      taskEngagementActionsUpdatedAt\n      firstTaskEngagementActionOn\n      taskEngagementActionCount\n      nextFollowUpOn\n      campaignId\n      campaignRun\n      createdAt\n      updatedAt\n      engagementUpdate(limit: 1) {\n         items {\n             createdAt\n             contactId\n             dueDateTimeChangedFrom\n             dueDateTimeChangedTo\n             engagementId\n             id\n             note\n             updatedAt\n         }\n         nextToken\n      }\n    }\n    nextToken\n    total\n  }\n}", toVariablesMap(builderLimit.build()), Map.class, new GsonVariablesSerializer());
    }

    default s47 g4(final String str, final String str2, final int i) {
        final ModelEngagementFilterInput modelEngagementFilterInputBuild = ModelEngagementFilterInput.builder().engagementStatus(ModelEngagementStatusInput.builder().eq(EngagementStatus.ACTIVE).build()).build();
        return s47.m47669H(new Callable() { // from class: o.soc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45707a.T4(str, str2, modelEngagementFilterInputBuild, i);
            }
        });
    }

    default s47 q7(syh syhVar, String str, int i) {
        return x8(Wz((String) syhVar.f46121a, (String) syhVar.f46122b, (ModelEngagementFilterInput) syhVar.f46123c, Optional.ofNullable(str), i), "listEngagementTypeByContact").m47686M(new rl7() { // from class: o.uoc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return yoc.e9((ModelEngagementConnection) obj);
            }
        });
    }

    default s47 x8(SimpleGraphQLRequest simpleGraphQLRequest, String str) {
        return Wn(simpleGraphQLRequest, str);
    }
}
