package ai.salesmax.model;

import ai.salesmax.custom.CustomFormDataObservable;
import ai.salesmax.model.EngagementSummary;
import android.net.Uri;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.ActivityLocation;
import com.amplifyframework.datastore.generated.model.Address;
import com.amplifyframework.datastore.generated.model.CallConnectStatus;
import com.amplifyframework.datastore.generated.model.CallDirection;
import com.amplifyframework.datastore.generated.model.Comment;
import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.ContactAssignmentStatus;
import com.amplifyframework.datastore.generated.model.Engagement;
import com.amplifyframework.datastore.generated.model.EngagementStatus;
import com.amplifyframework.datastore.generated.model.EngagementType;
import com.amplifyframework.datastore.generated.model.EngagementUpdate;
import com.amplifyframework.datastore.generated.model.NoteAdditionMethod;
import com.amplifyframework.datastore.generated.model.Priority;
import com.amplifyframework.datastore.generated.model.TaskActivityType;
import com.amplifyframework.datastore.generated.model.UploadedFile;
import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.datastore.generated.model.fileObjectRelationship;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.a81;
import p001o.ch3;
import p001o.dh3;
import p001o.f9g;
import p001o.id5;
import p001o.ja8;
import p001o.jm7;
import p001o.kf9;
import p001o.kh3;
import p001o.lpi;
import p001o.rl7;
import p001o.ryh;
import p001o.sq8;
import p001o.th1;
import p001o.tpb;
import p001o.u91;
import p001o.uni;
import p001o.uyh;
import p001o.vgf;
import p001o.wrd;
import p001o.x6c;
import p001o.xk7;
import type.UpdateEngagementInput;

/* loaded from: classes.dex */
public final class EngagementSummary {
    private String __engagementPlacementId;
    private ArrayList<FileObjectRelationshipSummary> addedLinkedFiles;
    private boolean createNewDeal;
    private String customNextStepTaskInputData;
    private ArrayList<String> deletedLinkedFiles;
    private Engagement engagement;
    private boolean inFlightCall;
    private AssignmentOutcome nextStepTaskAssignmentOutcome;
    private Long nextStepTaskDueDateTime;
    private Long nextStepTaskReminderTime;
    private String nextStepTaskType;
    private SubmittedFormValues submittedFormValues;
    private SubmittedFormValues submittedFormValuesNextStepTask;
    private boolean transferLeadOnNextStepTask;
    private UpdateEngagementInput.Builder updates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Engagement newInstance() {
            Engagement engagementBuild = Engagement.builder().accountId("").engagementType(EngagementType.TASK).engagementStatus(EngagementStatus.ACTIVE).id("").build();
            sq8.m48648g(engagementBuild, "build(...)");
            return engagementBuild;
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getAddedBy$1 */
    public static final class C01071 extends kf9 implements xk7 {
        public static final C01071 INSTANCE = new C01071();

        public C01071() {
            super(1);
        }

        @Override // p001o.xk7
        public final LeadsUser invoke(User user) {
            sq8.m48646e(user);
            return new LeadsUser(user, null, null, null, 14, null);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getCallEndtime$1 */
    public static final class C01081 extends kf9 implements xk7 {
        public static final C01081 INSTANCE = new C01081();

        public C01081() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getCallStartTime$1 */
    public static final class C01091 extends kf9 implements xk7 {
        public static final C01091 INSTANCE = new C01091();

        public C01091() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getCalltime$1 */
    public static final class C01101 extends kf9 implements xk7 {
        public static final C01101 INSTANCE = new C01101();

        public C01101() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getComments$1 */
    public static final class C01111 extends kf9 implements xk7 {
        public static final C01111 INSTANCE = new C01111();

        public C01111() {
            super(1);
        }

        @Override // p001o.xk7
        public final CommentSummary invoke(Comment comment) {
            sq8.m48646e(comment);
            return new CommentSummary(comment);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getContact$1 */
    public static final class C01121 extends kf9 implements xk7 {
        public static final C01121 INSTANCE = new C01121();

        public C01121() {
            super(1);
        }

        @Override // p001o.xk7
        public final LeadsSummary invoke(Contact contact) {
            sq8.m48649h(contact, "x");
            return new LeadsSummary(contact);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getCreatedAt$1 */
    public static final class C01131 extends kf9 implements xk7 {
        public static final C01131 INSTANCE = new C01131();

        public C01131() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getDueDate$1 */
    public static final class C01141 extends kf9 implements xk7 {
        public static final C01141 INSTANCE = new C01141();

        public C01141() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getDueDateTime$1 */
    public static final class C01151 extends kf9 implements xk7 {
        public static final C01151 INSTANCE = new C01151();

        public C01151() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getEngagementStatus$1 */
    public static final class C01161 extends kf9 implements xk7 {
        public static final C01161 INSTANCE = new C01161();

        public C01161() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(EngagementStatus engagementStatus) {
            sq8.m48649h(engagementStatus, "obj");
            return engagementStatus.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getEngagementUpdates$1 */
    public static final class C01171 extends kf9 implements xk7 {
        public static final C01171 INSTANCE = new C01171();

        public C01171() {
            super(1);
        }

        @Override // p001o.xk7
        public final EngagementUpdateSummary invoke(EngagementUpdate engagementUpdate) {
            sq8.m48646e(engagementUpdate);
            return new EngagementUpdateSummary(engagementUpdate);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getNextTask$1 */
    public static final class C01181 extends kf9 implements xk7 {
        public static final C01181 INSTANCE = new C01181();

        public C01181() {
            super(1);
        }

        @Override // p001o.xk7
        public final EngagementSummary invoke(Engagement engagement) {
            sq8.m48646e(engagement);
            return new EngagementSummary(engagement);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getNextTaskDueDateTime$1 */
    public static final class C01191 extends kf9 implements xk7 {
        public static final C01191 INSTANCE = new C01191();

        public C01191() {
            super(1);
        }

        @Override // p001o.xk7
        public final Temporal.DateTime invoke(Engagement engagement) {
            return engagement.getDueDateTime();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getNextTaskDueDateTime$2 */
    public static final class C01202 extends kf9 implements xk7 {
        public static final C01202 INSTANCE = new C01202();

        public C01202() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getNextTaskId$1 */
    public static final class C01211 extends kf9 implements xk7 {
        public static final C01211 INSTANCE = new C01211();

        public C01211() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Engagement engagement) {
            return engagement.getId();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getNextTaskReminderTime$1 */
    public static final class C01221 extends kf9 implements xk7 {
        public static final C01221 INSTANCE = new C01221();

        public C01221() {
            super(1);
        }

        @Override // p001o.xk7
        public final Temporal.DateTime invoke(Engagement engagement) {
            return engagement.getReminderDateTime();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getNextTaskReminderTime$2 */
    public static final class C01232 extends kf9 implements xk7 {
        public static final C01232 INSTANCE = new C01232();

        public C01232() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getNextTaskType$1 */
    public static final class C01241 extends kf9 implements xk7 {
        public static final C01241 INSTANCE = new C01241();

        public C01241() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(Engagement engagement) {
            return engagement.getTaskType();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getNoteAdditionMethod$1 */
    public static final class C01251 extends kf9 implements xk7 {
        public static final C01251 INSTANCE = new C01251();

        public C01251() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(NoteAdditionMethod noteAdditionMethod) {
            sq8.m48649h(noteAdditionMethod, "obj");
            return noteAdditionMethod.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getOwner$1 */
    public static final class C01261 extends kf9 implements xk7 {
        public static final C01261 INSTANCE = new C01261();

        public C01261() {
            super(1);
        }

        @Override // p001o.xk7
        public final LeadsUser invoke(User user) {
            sq8.m48646e(user);
            return new LeadsUser(user, null, null, null, 14, null);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getParentEngagement$1 */
    public static final class C01271 extends kf9 implements xk7 {
        public static final C01271 INSTANCE = new C01271();

        public C01271() {
            super(1);
        }

        @Override // p001o.xk7
        public final EngagementSummary invoke(Engagement engagement) {
            sq8.m48646e(engagement);
            return new EngagementSummary(engagement);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getReminderTime$1 */
    public static final class C01281 extends kf9 implements xk7 {
        public static final C01281 INSTANCE = new C01281();

        public C01281() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getTaskActivityType$1 */
    public static final class C01291 extends kf9 implements xk7 {
        public static final C01291 INSTANCE = new C01291();

        public C01291() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(TaskActivityType taskActivityType) {
            sq8.m48649h(taskActivityType, "obj");
            return taskActivityType.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getTaskCompletionTime$1 */
    public static final class C01301 extends kf9 implements xk7 {
        public static final C01301 INSTANCE = new C01301();

        public C01301() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getTaskLocation$1 */
    public static final class C01311 extends kf9 implements xk7 {
        public static final C01311 INSTANCE = new C01311();

        public C01311() {
            super(1);
        }

        @Override // p001o.xk7
        public final LeadsAddress invoke(Address address) {
            sq8.m48646e(address);
            return new LeadsAddress(address);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getTaskStatus$1 */
    public static final class C01321 extends kf9 implements xk7 {
        public static final C01321 INSTANCE = new C01321();

        public C01321() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(EngagementStatus engagementStatus) {
            sq8.m48649h(engagementStatus, "obj");
            return engagementStatus.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getUpdatedAt$1 */
    public static final class C01331 extends kf9 implements xk7 {
        public static final C01331 INSTANCE = new C01331();

        public C01331() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getUpdatedBy$1 */
    public static final class C01341 extends kf9 implements xk7 {
        public static final C01341 INSTANCE = new C01341();

        public C01341() {
            super(1);
        }

        @Override // p001o.xk7
        public final LeadsUser invoke(User user) {
            sq8.m48646e(user);
            return new LeadsUser(user, null, null, null, 14, null);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getVisitDate$1 */
    public static final class C01371 extends kf9 implements xk7 {
        public static final C01371 INSTANCE = new C01371();

        public C01371() {
            super(1);
        }

        @Override // p001o.xk7
        public final Long invoke(Temporal.DateTime dateTime) {
            return a81.m16645F(dateTime);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$getVisitLocation$1 */
    public static final class C01381 extends kf9 implements xk7 {
        public static final C01381 INSTANCE = new C01381();

        public C01381() {
            super(1);
        }

        @Override // p001o.xk7
        public final LeadsAddress invoke(Address address) {
            sq8.m48646e(address);
            return new LeadsAddress(address);
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setAssignmentStatus$1 */
    public static final class C01391 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01391(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(ContactAssignmentStatus contactAssignmentStatus) {
            return Boolean.valueOf(Objects.equals(contactAssignmentStatus.name(), this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setBody$1 */
    public static final class C01401 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01401(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setCallConnectStatus$1 */
    public static final class C01411 extends kf9 implements xk7 {
        public static final C01411 INSTANCE = new C01411();

        public C01411() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(CallConnectStatus callConnectStatus) {
            return callConnectStatus.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setCallConnectStatus$2 */
    public static final class C01422 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01422(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setCallDirection$1 */
    public static final class C01431 extends kf9 implements xk7 {
        public static final C01431 INSTANCE = new C01431();

        public C01431() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(CallDirection callDirection) {
            return callDirection.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setCallDirection$2 */
    public static final class C01442 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01442(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setCallDuration$1 */
    public static final class C01451 extends kf9 implements xk7 {
        final /* synthetic */ int $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01451(int i) {
            super(1);
            this.$value = i;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Integer num) {
            return Boolean.valueOf(Objects.equals(num, Integer.valueOf(this.$value)));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setCallEndTime$1 */
    public static final class C01461 extends kf9 implements xk7 {
        final /* synthetic */ Temporal.DateTime $dateTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01461(Temporal.DateTime dateTime) {
            super(1);
            this.$dateTime = dateTime;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Temporal.DateTime dateTime) {
            return Boolean.valueOf(Objects.equals(dateTime, this.$dateTime));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setCallOutcome$1 */
    public static final class C01471 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01471(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setCallOutcomeNature$1 */
    public static final class C01481 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01481(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setCallStartTime$1 */
    public static final class C01491 extends kf9 implements xk7 {
        final /* synthetic */ Temporal.DateTime $dateTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01491(Temporal.DateTime dateTime) {
            super(1);
            this.$dateTime = dateTime;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Temporal.DateTime dateTime) {
            return Boolean.valueOf(Objects.equals(dateTime, this.$dateTime));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setCallTime$1 */
    public static final class C01501 extends kf9 implements xk7 {
        final /* synthetic */ Temporal.DateTime $time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01501(Temporal.DateTime dateTime) {
            super(1);
            this.$time = dateTime;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Temporal.DateTime dateTime) {
            return Boolean.valueOf(Objects.equals(dateTime, this.$time));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setContact$1 */
    public static final class C01511 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01511(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Contact contact) {
            return Boolean.valueOf(Objects.equals(contact.getId(), this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setDueDate$1 */
    public static final class C01521 extends kf9 implements xk7 {
        final /* synthetic */ Temporal.DateTime $time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01521(Temporal.DateTime dateTime) {
            super(1);
            this.$time = dateTime;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Temporal.DateTime dateTime) {
            return Boolean.valueOf(Objects.equals(dateTime, this.$time));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setDueDateTime$1 */
    public static final class C01531 extends kf9 implements xk7 {
        final /* synthetic */ Temporal.DateTime $time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01531(Temporal.DateTime dateTime) {
            super(1);
            this.$time = dateTime;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Temporal.DateTime dateTime) {
            return Boolean.valueOf(Objects.equals(dateTime, this.$time));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setEngagementLog$1 */
    public static final class C01541 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01541(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setEngagementStatus$1 */
    public static final class C01551 extends kf9 implements xk7 {
        public static final C01551 INSTANCE = new C01551();

        public C01551() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(EngagementStatus engagementStatus) {
            return engagementStatus.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setEngagementStatus$2 */
    public static final class C01562 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01562(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setEngagementType$1 */
    public static final class C01571 extends kf9 implements xk7 {
        public static final C01571 INSTANCE = new C01571();

        public C01571() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(EngagementType engagementType) {
            return engagementType.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setEngagementType$2 */
    public static final class C01582 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01582(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setExternalNumber$1 */
    public static final class C01591 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01591(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setId$1 */
    public static final class C01601 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01601(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setNoteAdditionMethod$1 */
    public static final class C01611 extends kf9 implements xk7 {
        public static final C01611 INSTANCE = new C01611();

        public C01611() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(NoteAdditionMethod noteAdditionMethod) {
            return noteAdditionMethod.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setNoteAdditionMethod$2 */
    public static final class C01622 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01622(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setNoteHeading$1 */
    public static final class C01631 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01631(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setNotes$1 */
    public static final class C01641 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01641(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setOwner$1 */
    public static final class C01651 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01651(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setPriority$1 */
    public static final class C01661 extends kf9 implements xk7 {
        final /* synthetic */ String $priority;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01661(String str) {
            super(1);
            this.$priority = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$priority));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setReminderTime$1 */
    public static final class C01671 extends kf9 implements xk7 {
        final /* synthetic */ Temporal.DateTime $time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01671(Temporal.DateTime dateTime) {
            super(1);
            this.$time = dateTime;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Temporal.DateTime dateTime) {
            return Boolean.valueOf(Objects.equals(dateTime, this.$time));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setSystemAction$1 */
    public static final class C01681 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01681(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskActivityType$1 */
    public static final class C01691 extends kf9 implements xk7 {
        public static final C01691 INSTANCE = new C01691();

        public C01691() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(TaskActivityType taskActivityType) {
            return taskActivityType.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskActivityType$2 */
    public static final class C01702 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01702(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskCompletionNote$1 */
    public static final class C01711 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01711(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskCompletionTime$1 */
    public static final class C01721 extends kf9 implements xk7 {
        final /* synthetic */ long $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01721(long j) {
            super(1);
            this.$value = j;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Temporal.DateTime dateTime) {
            return Boolean.valueOf(Objects.equals(dateTime, Long.valueOf(this.$value)));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskCompletionType$1 */
    public static final class C01731 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01731(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskHeadings$1 */
    public static final class C01741 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01741(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskInputNotes$1 */
    public static final class C01751 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01751(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskLocation$1 */
    public static final class C01761 extends kf9 implements xk7 {
        final /* synthetic */ LeadsAddress $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01761(LeadsAddress leadsAddress) {
            super(1);
            this.$value = leadsAddress;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Address address) {
            return Boolean.valueOf(Objects.equals(address, this.$value.getAddress()));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskStatus$1 */
    public static final class C01771 extends kf9 implements xk7 {
        public static final C01771 INSTANCE = new C01771();

        public C01771() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(EngagementStatus engagementStatus) {
            return engagementStatus.name();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskStatus$2 */
    public static final class C01782 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01782(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTaskType$1 */
    public static final class C01791 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01791(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setTeamId$1 */
    public static final class C01801 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01801(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setUploadedFileUrl$1 */
    public static final class C01811 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01811(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setUserNumber$1 */
    public static final class C01821 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01821(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setVideoCallLink$1 */
    public static final class C01831 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01831(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setVideoCallMetadata$1 */
    public static final class C01841 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01841(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setVideoCallPlatform$1 */
    public static final class C01851 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01851(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setVisitDate$1 */
    public static final class C01861 extends kf9 implements xk7 {
        final /* synthetic */ Temporal.DateTime $time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01861(Temporal.DateTime dateTime) {
            super(1);
            this.$time = dateTime;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Temporal.DateTime dateTime) {
            return Boolean.valueOf(Objects.equals(dateTime, this.$time));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setVisitLocation$1 */
    public static final class C01871 extends kf9 implements xk7 {
        final /* synthetic */ Address $address;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01871(Address address) {
            super(1);
            this.$address = address;
        }

        @Override // p001o.xk7
        public final Boolean invoke(Address address) {
            return Boolean.valueOf(Objects.equals(address, this.$address));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setVisitNote$1 */
    public static final class C01881 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01881(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setVisitOutcome$1 */
    public static final class C01891 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01891(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$setVisitOutcomeNature$1 */
    public static final class C01901 extends kf9 implements xk7 {
        final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01901(String str) {
            super(1);
            this.$value = str;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Objects.equals(str, this.$value));
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$toTask$3 */
    public static final class C01933 extends kf9 implements xk7 {
        public static final C01933 INSTANCE = new C01933();

        public C01933() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(LeadsUser leadsUser) {
            return (String) Optional.ofNullable(leadsUser.getId()).orElse("");
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$toTask$4 */
    public static final class C01944 extends kf9 implements xk7 {
        public static final C01944 INSTANCE = new C01944();

        public C01944() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(LeadsAddress leadsAddress) {
            return leadsAddress.getRawAddressText();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$toTask$5 */
    public static final class C01955 extends kf9 implements xk7 {
        public static final C01955 INSTANCE = new C01955();

        public C01955() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(LeadsAddress leadsAddress) {
            return leadsAddress.getLatitude();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$toTask$6 */
    public static final class C01966 extends kf9 implements xk7 {
        public static final C01966 INSTANCE = new C01966();

        public C01966() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(LeadsAddress leadsAddress) {
            return leadsAddress.getLongitude();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$toTask$7 */
    public static final class C01977 extends kf9 implements xk7 {
        public static final C01977 INSTANCE = new C01977();

        public C01977() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(LeadsAddress leadsAddress) {
            return leadsAddress.getRawAddressText();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$toTask$8 */
    public static final class C01988 extends kf9 implements xk7 {
        public static final C01988 INSTANCE = new C01988();

        public C01988() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(LeadsAddress leadsAddress) {
            return leadsAddress.getLatitude();
        }
    }

    /* renamed from: ai.salesmax.model.EngagementSummary$toTask$9 */
    public static final class C01999 extends kf9 implements xk7 {
        public static final C01999 INSTANCE = new C01999();

        public C01999() {
            super(1);
        }

        @Override // p001o.xk7
        public final String invoke(LeadsAddress leadsAddress) {
            return leadsAddress.getLongitude();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EngagementSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser getAddedBy$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getCallEndtime$lambda$15(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getCallStartTime$lambda$17(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getCalltime$lambda$51(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommentSummary getComments$lambda$20(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (CommentSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsSummary getContact$lambda$12(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getCreatedAt$lambda$37(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getDueDate$lambda$40(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getDueDateTime$lambda$42(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getEngagementStatus$lambda$71(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EngagementUpdateSummary getEngagementUpdates$lambda$21(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (EngagementUpdateSummary) xk7Var.invoke(obj);
    }

    private final FileData getFileData(String str) {
        FileData fileData;
        String str2 = null;
        FileData fileData2 = new FileData(0, null, null, null, str, null, false, false, false, null, null, null, null, null, str2, str2, null, null, null, false, null, null, null, null, null, null, null, null, 268435439, null);
        String filenameFromURL = getFilenameFromURL(Uri.parse(str));
        if (filenameFromURL == null) {
            filenameFromURL = TransferTable.COLUMN_FILE;
        }
        List listD0 = f9g.D0(filenameFromURL, new String[]{"."}, true, 0, 4, null);
        if (listD0.size() > 1) {
            fileData = fileData2;
            fileData.setMimeType((String) listD0.get(1));
        } else {
            fileData = fileData2;
        }
        if (!listD0.isEmpty()) {
            fileData.setFileName((String) listD0.get(0));
        }
        fileData.setSuccess(true);
        fileData.setUploaded(true);
        fileData.setViewOnly(false);
        fileData.setEngagementId(getId());
        return fileData;
    }

    private final String getFilenameFromURL(Uri uri) {
        return new File(String.valueOf(uri.getPath())).getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EngagementSummary getNextTask$lambda$81(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (EngagementSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Temporal.DateTime getNextTaskDueDateTime$lambda$44(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Temporal.DateTime) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getNextTaskDueDateTime$lambda$45(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNextTaskId$lambda$83(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Temporal.DateTime getNextTaskReminderTime$lambda$77(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Temporal.DateTime) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getNextTaskReminderTime$lambda$78(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNextTaskType$lambda$82(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNoteAdditionMethod$lambda$46(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser getOwner$lambda$5(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EngagementSummary getParentEngagement$lambda$80(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (EngagementSummary) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getReminderTime$lambda$75(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSecondaryTitle$lambda$14(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTaskActivityType$lambda$31(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getTaskCompletionTime$lambda$26(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsAddress getTaskLocation$lambda$35(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsAddress) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTaskStatus$lambda$68(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getUpdatedAt$lambda$38(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsUser getUpdatedBy$lambda$9(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsUser) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getVisitDate$lambda$57(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (Long) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LeadsAddress getVisitLocation$lambda$55(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (LeadsAddress) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setAssignmentStatus$lambda$8(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setBody$lambda$64(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCallConnectStatus$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCallConnectStatus$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCallDirection$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCallDirection$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCallDuration$lambda$19(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCallEndTime$lambda$16(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCallOutcome$lambda$65(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCallOutcomeNature$lambda$66(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCallStartTime$lambda$18(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setCallTime$lambda$52(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setContact$lambda$13(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDueDate$lambda$41(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDueDateTime$lambda$43(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setEngagementLog$lambda$10(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEngagementStatus$lambda$72(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setEngagementStatus$lambda$73(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEngagementType$lambda$22(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setEngagementType$lambda$23(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setExternalNumber$lambda$67(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setId$lambda$49(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setLinkedFiles$default(EngagementSummary engagementSummary, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = null;
        }
        engagementSummary.setLinkedFiles(list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setNoteAdditionMethod$lambda$47(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setNoteAdditionMethod$lambda$48(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setNoteHeading$lambda$29(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setNotes$lambda$11(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOwner$lambda$6(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setPriority$lambda$74(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setReminderTime$lambda$76(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setSystemAction$lambda$53(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTaskActivityType$lambda$32(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTaskActivityType$lambda$33(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTaskCompletionNote$lambda$24(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTaskCompletionTime$lambda$27(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTaskCompletionType$lambda$25(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTaskHeadings$lambda$28(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTaskInputNotes$lambda$30(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTaskLocation$lambda$36(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTaskStatus$lambda$69(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTaskStatus$lambda$70(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTaskType$lambda$34(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTeamId$lambda$7(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setUploadedFileUrl$lambda$79(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setUserNumber$lambda$50(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setVideoCallLink$lambda$62(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setVideoCallMetadata$lambda$63(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setVideoCallPlatform$lambda$61(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setVisitDate$lambda$58(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setVisitLocation$lambda$56(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setVisitNote$lambda$54(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setVisitOutcome$lambda$59(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setVisitOutcomeNature$lambda$60(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toTask$lambda$108(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toTask$lambda$109(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toTask$lambda$110(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toTask$lambda$111(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toTask$lambda$112(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toTask$lambda$113(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toTask$lambda$114(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toTask$lambda$115(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toTask$lambda$116(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    public final String getAccountId() {
        String accountId = this.engagement.getAccountId();
        sq8.m48648g(accountId, "getAccountId(...)");
        return accountId;
    }

    public final ryh getActivityLocation() {
        Double dValueOf;
        Double dValueOf2;
        List<ActivityLocation> locations = this.engagement.getLocations();
        if (locations == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(dh3.m23088v(locations, 10));
        for (ActivityLocation activityLocation : locations) {
            String lat = activityLocation.getLat();
            if (lat != null) {
                sq8.m48646e(lat);
                dValueOf = Double.valueOf(Double.parseDouble(lat));
            } else {
                dValueOf = null;
            }
            String lng = activityLocation.getLng();
            if (lng != null) {
                sq8.m48646e(lng);
                dValueOf2 = Double.valueOf(Double.parseDouble(lng));
            } else {
                dValueOf2 = null;
            }
            arrayList.add(uyh.of(dValueOf, dValueOf2));
        }
        return (ryh) kh3.h0(arrayList);
    }

    public final LeadsUser getAddedBy() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getAddedBy());
        final C01071 c01071 = C01071.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.kb6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getAddedBy$lambda$4(c01071, obj);
            }
        }).orElse(lpi.a0(this.engagement.getAddedById()));
    }

    public final ArrayList<FileObjectRelationshipSummary> getAddedLinkedFiles() {
        return this.addedLinkedFiles;
    }

    public final String getAssignmentStatus() {
        ContactAssignmentStatus toBeAssigned = this.engagement.getToBeAssigned();
        if (toBeAssigned != null) {
            return toBeAssigned.name();
        }
        return null;
    }

    public final String getBody() {
        Object objOrElse = Optional.ofNullable(this.engagement.getBody()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getCallConnectStatus() {
        return ((CallConnectStatus) Optional.ofNullable(this.engagement.getCallConnectStatus()).orElse(CallConnectStatus.NOT_CONNECTED)).name();
    }

    public final String getCallDirection() {
        return ((CallDirection) Optional.ofNullable(this.engagement.getCallDirection()).orElse(CallDirection.OUTGOING)).name();
    }

    public final int getCallDuration() {
        Object objOrElse = Optional.ofNullable(this.engagement.getDurationInMillis()).orElse(-1);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).intValue();
    }

    public final long getCallEndtime() {
        try {
            Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCallEndTime());
            final C01081 c01081 = C01081.INSTANCE;
            Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.nb6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EngagementSummary.getCallEndtime$lambda$15(c01081, obj);
                }
            }).orElse(-1L);
            sq8.m48648g(objOrElse, "orElse(...)");
            return ((Number) objOrElse).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final String getCallOutcome() {
        Object objOrElse = Optional.ofNullable(this.engagement.getCallOutcome()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getCallOutcomeNature() {
        Object objOrElse = Optional.ofNullable(this.engagement.getCallOutcomeNature()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getCallRecordingUrl() {
        if (type.EngagementType.CALL.name().equals(getEngagementType())) {
            return this.engagement.getCallRecordingUrl();
        }
        return null;
    }

    public final long getCallStartTime() {
        try {
            Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCallStartTime());
            final C01091 c01091 = C01091.INSTANCE;
            Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.tb6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EngagementSummary.getCallStartTime$lambda$17(c01091, obj);
                }
            }).orElse(-1L);
            sq8.m48648g(objOrElse, "orElse(...)");
            return ((Number) objOrElse).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final String getCallType() {
        return this.engagement.getCallType();
    }

    public final long getCalltime() {
        try {
            Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCallEndTime());
            final C01101 c01101 = C01101.INSTANCE;
            Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.he6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EngagementSummary.getCalltime$lambda$51(c01101, obj);
                }
            }).orElse(-1L);
            sq8.m48648g(objOrElse, "orElse(...)");
            return ((Number) objOrElse).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final String getCloudProvider() {
        return this.engagement.getCloudProvider();
    }

    public final String getCloudProviderNumber() {
        return this.engagement.getCloudProviderNumber();
    }

    public final List<CommentSummary> getComments() {
        Stream stream = ((List) Optional.ofNullable(this.engagement.getComments()).orElse(ch3.m21246k())).stream();
        final C01111 c01111 = C01111.INSTANCE;
        Object objCollect = stream.map(new Function() { // from class: o.jd6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getComments$lambda$20(c01111, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public final LeadsSummary getContact() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getContact());
        final C01121 c01121 = C01121.INSTANCE;
        return (LeadsSummary) optionalOfNullable.map(new Function() { // from class: o.le6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getContact$lambda$12(c01121, obj);
            }
        }).orElse(null);
    }

    public final String getContactID() {
        String id;
        LeadsSummary contact = getContact();
        return (contact == null || (id = contact.getId()) == null) ? "" : id;
    }

    public final String getContactName() {
        String name;
        LeadsSummary contact = getContact();
        return (contact == null || (name = contact.getName()) == null) ? "" : name;
    }

    public final boolean getCreateNewDeal() {
        return this.createNewDeal;
    }

    public final long getCreatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCreatedAt());
        final C01131 c01131 = C01131.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.ed6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getCreatedAt$lambda$37(c01131, obj);
            }
        }).orElse(-1L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getCustomCallOutcomeData() {
        return this.engagement.getCustomCallOutcomeData();
    }

    public final String getCustomNextStepTaskInputData() {
        return this.customNextStepTaskInputData;
    }

    public final String getCustomTaskCompletionData() {
        return this.engagement.getCustomTaskCompletionData();
    }

    public final String getCustomTaskInputData() {
        return this.engagement.getCustomTaskInputData();
    }

    public final String getCustomVideoCallInputData() {
        return this.engagement.getCustomVideoCallInputData();
    }

    public final String getCustomVisitOutcomeData() {
        return this.engagement.getCustomVisitOutcomeData();
    }

    public final ArrayList<String> getDeletedLinkedFiles() {
        return this.deletedLinkedFiles;
    }

    public final String getDesignation() {
        String designation;
        LeadsSummary contact = getContact();
        return (contact == null || (designation = contact.getDesignation()) == null) ? "" : designation;
    }

    public final String getDeviceId() {
        return this.engagement.getDeviceId();
    }

    public final long getDueDate() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getDueDateTime());
        final C01141 c01141 = C01141.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.bd6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getDueDate$lambda$40(c01141, obj);
            }
        }).orElse(-1L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final long getDueDateTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getDueDateTime());
        final C01151 c01151 = C01151.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.kd6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getDueDateTime$lambda$42(c01151, obj);
            }
        }).orElse(-1L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final Engagement getEngagement() {
        return this.engagement;
    }

    public final String getEngagementLog() {
        return this.engagement.getBody();
    }

    public final String getEngagementPlacementId() {
        return this.__engagementPlacementId;
    }

    public final String getEngagementSource() {
        return (String) Optional.ofNullable(this.engagement.getEngagementSource()).orElse(null);
    }

    public final String getEngagementSourceLevelTwo() {
        return (String) Optional.ofNullable(this.engagement.getEngagementSourceLevelTwo()).orElse(null);
    }

    public final String getEngagementSourceType() {
        return (String) Optional.ofNullable(this.engagement.getEngagementSourceType()).orElse(null);
    }

    public final String getEngagementStatus() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getEngagementStatus());
        final C01161 c01161 = C01161.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.td6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getEngagementStatus$lambda$71(c01161, obj);
            }
        }).orElse(EngagementStatus.ACTIVE.name());
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getEngagementType() {
        return this.engagement.getEngagementType().name();
    }

    public final List<EngagementUpdateSummary> getEngagementUpdates() {
        Stream stream = ((List) Optional.ofNullable(this.engagement.getEngagementUpdate()).orElse(ch3.m21246k())).stream();
        final C01171 c01171 = C01171.INSTANCE;
        Object objCollect = stream.map(new Function() { // from class: o.gd6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getEngagementUpdates$lambda$21(c01171, obj);
            }
        }).collect(Collectors.toList());
        sq8.m48648g(objCollect, "collect(...)");
        return (List) objCollect;
    }

    public final String getExternalNumber() {
        String externalNumber = this.engagement.getExternalNumber();
        sq8.m48648g(externalNumber, "getExternalNumber(...)");
        return externalNumber;
    }

    public final Long getFirstTaskEngagementActionOn() {
        Temporal.DateTime firstTaskEngagementActionOn = this.engagement.getFirstTaskEngagementActionOn();
        if (firstTaskEngagementActionOn != null) {
            return a81.m16645F(firstTaskEngagementActionOn);
        }
        return null;
    }

    public final String getHangupReason() {
        return this.engagement.getHangupReason();
    }

    public final String getId() {
        String id = this.engagement.getId();
        sq8.m48648g(id, "getId(...)");
        return id;
    }

    public final boolean getInFlightCall() {
        return this.inFlightCall;
    }

    public final List<FileData> getLinkedFiles() {
        List listM21246k;
        ArrayList arrayList = new ArrayList();
        String uploadedFiledUrl = this.engagement.getUploadedFiledUrl();
        if (!(uploadedFiledUrl == null || f9g.d0(uploadedFiledUrl))) {
            String uploadedFiledUrl2 = this.engagement.getUploadedFiledUrl();
            sq8.m48648g(uploadedFiledUrl2, "getUploadedFiledUrl(...)");
            arrayList.add(getFileData(uploadedFiledUrl2));
        }
        int size = arrayList.size();
        List<fileObjectRelationship> linkedFiles = this.engagement.getLinkedFiles();
        if (linkedFiles != null) {
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(linkedFiles, 10));
            for (fileObjectRelationship fileobjectrelationship : linkedFiles) {
                sq8.m48646e(fileobjectrelationship);
                arrayList2.add(new FileObjectRelationshipSummary(fileobjectrelationship));
            }
            listM21246k = new ArrayList();
            for (Object obj : arrayList2) {
                if (!this.deletedLinkedFiles.contains(((FileObjectRelationshipSummary) obj).getId())) {
                    listM21246k.add(obj);
                }
            }
        } else {
            listM21246k = null;
        }
        if (listM21246k == null) {
            listM21246k = ch3.m21246k();
        }
        Set setW0 = kh3.W0(listM21246k, this.addedLinkedFiles);
        ArrayList arrayList3 = new ArrayList(dh3.m23088v(setW0, 10));
        Iterator it = setW0.iterator();
        while (it.hasNext()) {
            arrayList3.add(((FileObjectRelationshipSummary) it.next()).toFileData(size));
            size++;
        }
        arrayList.addAll(kh3.Q0(arrayList3));
        return arrayList;
    }

    public final Long getNextFollowUpOn() {
        Temporal.DateTime nextFollowUpOn = this.engagement.getNextFollowUpOn();
        if (nextFollowUpOn != null) {
            return a81.m16645F(nextFollowUpOn);
        }
        return null;
    }

    public final String getNextFollowUpSetBy() {
        return this.engagement.getNextFollowUpSetBy();
    }

    public final AssignmentOutcome getNextStepTaskAssignmentOutcome() {
        return this.nextStepTaskAssignmentOutcome;
    }

    public final Long getNextStepTaskDueDateTime() {
        return this.nextStepTaskDueDateTime;
    }

    public final Long getNextStepTaskReminderTime() {
        return this.nextStepTaskReminderTime;
    }

    public final String getNextStepTaskType() {
        return this.nextStepTaskType;
    }

    public final EngagementSummary getNextTask() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getNextStepTask());
        final C01181 c01181 = C01181.INSTANCE;
        return (EngagementSummary) optionalOfNullable.map(new Function() { // from class: o.yd6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getNextTask$lambda$81(c01181, obj);
            }
        }).orElse(null);
    }

    public final AssignmentOutcome getNextTaskAssignmentOutcome() {
        return this.nextStepTaskAssignmentOutcome;
    }

    public final long getNextTaskDueDateTime() {
        if (this.nextStepTaskDueDateTime == null) {
            Optional optionalOfNullable = Optional.ofNullable(this.engagement.getNextStepTask());
            final C01191 c01191 = C01191.INSTANCE;
            Optional map = optionalOfNullable.map(new Function() { // from class: o.pd6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EngagementSummary.getNextTaskDueDateTime$lambda$44(c01191, obj);
                }
            });
            final C01202 c01202 = C01202.INSTANCE;
            this.nextStepTaskDueDateTime = (Long) map.map(new Function() { // from class: o.qd6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EngagementSummary.getNextTaskDueDateTime$lambda$45(c01202, obj);
                }
            }).orElse(-1L);
        }
        Long l = this.nextStepTaskDueDateTime;
        sq8.m48646e(l);
        return l.longValue();
    }

    public final String getNextTaskId() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getNextStepTask());
        final C01211 c01211 = C01211.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.de6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getNextTaskId$lambda$83(c01211, obj);
            }
        }).orElse(null);
    }

    public final long getNextTaskReminderTime() {
        if (this.nextStepTaskReminderTime == null) {
            Optional optionalOfNullable = Optional.ofNullable(this.engagement.getNextStepTask());
            final C01221 c01221 = C01221.INSTANCE;
            Optional map = optionalOfNullable.map(new Function() { // from class: o.zb6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EngagementSummary.getNextTaskReminderTime$lambda$77(c01221, obj);
                }
            });
            final C01232 c01232 = C01232.INSTANCE;
            this.nextStepTaskReminderTime = (Long) map.map(new Function() { // from class: o.ac6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EngagementSummary.getNextTaskReminderTime$lambda$78(c01232, obj);
                }
            }).orElse(0L);
        }
        Long l = this.nextStepTaskReminderTime;
        sq8.m48646e(l);
        return l.longValue();
    }

    public final long getNextTaskReminderTimeOffset() {
        if (getNextTaskDueDateTime() <= getNextTaskReminderTime()) {
            return 0L;
        }
        return getNextTaskDueDateTime() - getNextTaskReminderTime();
    }

    public final String getNextTaskType() {
        if (this.nextStepTaskType == null) {
            Optional optionalOfNullable = Optional.ofNullable(this.engagement.getNextStepTask());
            final C01241 c01241 = C01241.INSTANCE;
            this.nextStepTaskType = (String) optionalOfNullable.map(new Function() { // from class: o.hc6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EngagementSummary.getNextTaskType$lambda$82(c01241, obj);
                }
            }).orElse("");
        }
        String str = this.nextStepTaskType;
        sq8.m48646e(str);
        return str;
    }

    public final String getNoteAdditionMethod() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getNoteAdditionMethod());
        final C01251 c01251 = C01251.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.md6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getNoteAdditionMethod$lambda$46(c01251, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getNoteHeading() {
        Object objOrElse = Optional.ofNullable(this.engagement.getNoteHeading()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getNotes() {
        return this.engagement.getNoteHeading();
    }

    public final LeadsUser getOwner() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getEngagementOwner());
        final C01261 c01261 = C01261.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.ub6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getOwner$lambda$5(c01261, obj);
            }
        }).orElse(lpi.a0(this.engagement.getOwnerId()));
    }

    public final EngagementSummary getParentEngagement() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getParentEngagement());
        final C01271 c01271 = C01271.INSTANCE;
        return (EngagementSummary) optionalOfNullable.map(new Function() { // from class: o.mc6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getParentEngagement$lambda$80(c01271, obj);
            }
        }).orElse(null);
    }

    public final String getParentEngagementId() {
        EngagementSummary parentEngagement = getParentEngagement();
        if (parentEngagement != null) {
            return parentEngagement.getId();
        }
        return null;
    }

    public final String getPhoneCallLogId() {
        return this.engagement.getPhoneCallLogId();
    }

    public final String getPriority() {
        return this.engagement.getTaskPriority();
    }

    public final String getProfilePic() {
        String profilePicURL;
        LeadsSummary contact = getContact();
        return (contact == null || (profilePicURL = contact.getProfilePicURL()) == null) ? "" : profilePicURL;
    }

    public final Object getProperty(String str) {
        return null;
    }

    public final List<RecentAction> getRecentActions() {
        List<String> taskEngagementActions = this.engagement.getTaskEngagementActions();
        if (taskEngagementActions == null) {
            taskEngagementActions = ch3.m21246k();
        }
        ArrayList arrayList = new ArrayList(dh3.m23088v(taskEngagementActions, 10));
        Iterator<T> it = taskEngagementActions.iterator();
        while (it.hasNext()) {
            arrayList.add((RecentAction) ja8.f30035c.fromJson((String) it.next(), RecentAction.class));
        }
        return arrayList;
    }

    public final long getReminderTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getReminderDateTime());
        final C01281 c01281 = C01281.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.ob6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getReminderTime$lambda$75(c01281, obj);
            }
        }).orElse(0L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final long getReminderTimeOffset() {
        if (getNextFollowUpOn() == null) {
            if (getDueDateTime() <= getReminderTime()) {
                return 0L;
            }
            return getDueDateTime() - getReminderTime();
        }
        Long nextFollowUpOn = getNextFollowUpOn();
        sq8.m48646e(nextFollowUpOn);
        if (nextFollowUpOn.longValue() <= getReminderTime()) {
            return 0L;
        }
        Long nextFollowUpOn2 = getNextFollowUpOn();
        sq8.m48646e(nextFollowUpOn2);
        return nextFollowUpOn2.longValue() - getReminderTime();
    }

    public final String getSecondaryTitle() {
        LeadsSummary contact = getContact();
        String str = "";
        if (contact != null) {
            List<LeadsBusiness> company = contact.getCompany();
            Stream<LeadsBusiness> stream = company.stream();
            final EngagementSummary$getSecondaryTitle$cName$1 engagementSummary$getSecondaryTitle$cName$1 = EngagementSummary$getSecondaryTitle$cName$1.INSTANCE;
            String str2 = (String) stream.map(new Function() { // from class: o.me6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EngagementSummary.getSecondaryTitle$lambda$14(engagementSummary$getSecondaryTitle$cName$1, obj);
                }
            }).findFirst().orElse("");
            if (company.size() > 1) {
                str2 = str2 + " +" + (company.size() - 1) + " more";
            }
            String designation = contact.getDesignation();
            if (designation == null) {
                designation = "";
            }
            sq8.m48646e(str2);
            if (str2.length() > 0) {
                if (designation.length() > 0) {
                    str = designation + "( " + str2 + " )";
                } else {
                    str = str2;
                }
                sq8.m48646e(str);
            }
        }
        return str;
    }

    public final String getSingleContact() {
        if (getContact() != null) {
            sq8.m48646e(getContact());
            if (!r0.getContactNumbers().isEmpty()) {
                LeadsSummary contact = getContact();
                sq8.m48646e(contact);
                return contact.getContactNumbers().get(0);
            }
        }
        return "";
    }

    public final SubmittedFormValues getSubmittedFormValues() {
        return this.submittedFormValues;
    }

    public final SubmittedFormValues getSubmittedFormValuesNextStepTask() {
        return this.submittedFormValuesNextStepTask;
    }

    public final String getSystemAction() {
        Object objOrElse = Optional.ofNullable(this.engagement.getSystemAction()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getTaskActivityType() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskActivityType());
        final C01291 c01291 = C01291.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.cc6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getTaskActivityType$lambda$31(c01291, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getTaskCompletionNote() {
        return this.engagement.getTaskCompletionNote();
    }

    public final long getTaskCompletionTime() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskCompletionTime());
        final C01301 c01301 = C01301.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.vd6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getTaskCompletionTime$lambda$26(c01301, obj);
            }
        }).orElse(-1L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final String getTaskCompletionType() {
        return this.engagement.getTaskCompletionType();
    }

    public final Integer getTaskEngagementActionCount() {
        return this.engagement.getTaskEngagementActionCount();
    }

    public final Long getTaskEngagementActionsUpdatedAt() {
        Temporal.DateTime taskEngagementActionsUpdatedAt = this.engagement.getTaskEngagementActionsUpdatedAt();
        if (taskEngagementActionsUpdatedAt != null) {
            return a81.m16645F(taskEngagementActionsUpdatedAt);
        }
        return null;
    }

    public final String getTaskHeadings() {
        Object objOrElse = Optional.ofNullable(this.engagement.getTaskHeading()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getTaskInputNotes() {
        Object objOrElse = Optional.ofNullable(this.engagement.getTaskInputNote()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final LeadsAddress getTaskLocation() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskLocation());
        final C01311 c01311 = C01311.INSTANCE;
        return (LeadsAddress) optionalOfNullable.map(new Function() { // from class: o.ee6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getTaskLocation$lambda$35(c01311, obj);
            }
        }).orElse(null);
    }

    public final String getTaskOwnerProfilePic() {
        String profilePic;
        LeadsUser owner = getOwner();
        return (owner == null || (profilePic = owner.getProfilePic()) == null) ? "" : profilePic;
    }

    public final String getTaskStatus() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getEngagementStatus());
        final C01321 c01321 = C01321.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.xb6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getTaskStatus$lambda$68(c01321, obj);
            }
        }).orElse(EngagementStatus.ACTIVE.name());
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getTaskType() {
        Object objOrElse = Optional.ofNullable(this.engagement.getTaskType()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getTeamId() {
        return this.engagement.getPrimaryTeamId();
    }

    public final int getTotalCallDuration() {
        Integer totalCallDuration = this.engagement.getTotalCallDuration();
        if (totalCallDuration == null) {
            return 0;
        }
        return totalCallDuration.intValue();
    }

    public final boolean getTransferLeadOnNextStepTask() {
        return this.transferLeadOnNextStepTask;
    }

    public final long getUpdatedAt() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getUpdatedAt());
        final C01331 c01331 = C01331.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.pb6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getUpdatedAt$lambda$38(c01331, obj);
            }
        }).orElse(-1L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final LeadsUser getUpdatedBy() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getUpdatedBy());
        final C01341 c01341 = C01341.INSTANCE;
        return (LeadsUser) optionalOfNullable.map(new Function() { // from class: o.vc6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getUpdatedBy$lambda$9(c01341, obj);
            }
        }).orElse(lpi.a0(this.engagement.getUpdatedById()));
    }

    public final UpdateEngagementInput.Builder getUpdates() {
        return this.updates;
    }

    public final String getUploadedFileUrl() {
        FileData fileData = (FileData) kh3.h0(getLinkedFiles());
        String uploadedUri = fileData != null ? fileData.getUploadedUri() : null;
        String uploadedFiledUrl = this.engagement.getUploadedFiledUrl();
        return StringUtils.isBlank(uploadedFiledUrl) ? uploadedUri : uploadedFiledUrl;
    }

    public final x6c getUploadedFiles() {
        try {
            u91 u91VarUB = uni.UB();
            sq8.m48648g(u91VarUB, "getBackgroundApiService(...)");
            x6c x6cVarD0 = u91VarUB.V0(getId()).d0(new rl7() { // from class: ai.salesmax.model.EngagementSummary.getUploadedFiles.1
                @Override // p001o.rl7
                public final UploadedFile apply(fileObjectRelationship fileobjectrelationship) {
                    sq8.m48649h(fileobjectrelationship, "it");
                    return fileobjectrelationship.getFile();
                }
            }).d0(new rl7() { // from class: ai.salesmax.model.EngagementSummary.getUploadedFiles.2
                @Override // p001o.rl7
                public final UploadedFileSummary apply(UploadedFile uploadedFile) {
                    sq8.m48646e(uploadedFile);
                    return new UploadedFileSummary(uploadedFile);
                }
            });
            sq8.m48648g(x6cVarD0, "map(...)");
            return x6cVarD0;
        } catch (Exception unused) {
            x6c x6cVarM55693G = x6c.m55693G();
            sq8.m48648g(x6cVarM55693G, "empty(...)");
            return x6cVarM55693G;
        }
    }

    public final String getUserNumber() {
        Object objOrElse = Optional.ofNullable(this.engagement.getUserNumber()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getVideoCallLink() {
        Object objOrElse = Optional.ofNullable(this.engagement.getVideoCallLink()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getVideoCallMetadata() {
        Object objOrElse = Optional.ofNullable(this.engagement.getVideoCallMetadata()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getVideoCallOutcome() {
        return this.engagement.getVideoCallOutcome();
    }

    public final String getVideoCallPlatform() {
        Object objOrElse = Optional.ofNullable(this.engagement.getVideoCallPlatform()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final long getVisitDate() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getVisitTime());
        final C01371 c01371 = C01371.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.zd6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getVisitDate$lambda$57(c01371, obj);
            }
        }).orElse(-1L);
        sq8.m48648g(objOrElse, "orElse(...)");
        return ((Number) objOrElse).longValue();
    }

    public final LeadsAddress getVisitLocation() {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getVisitLocation());
        final C01381 c01381 = C01381.INSTANCE;
        return (LeadsAddress) optionalOfNullable.map(new Function() { // from class: o.dd6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.getVisitLocation$lambda$55(c01381, obj);
            }
        }).orElse(null);
    }

    public final String getVisitNote() {
        Object objOrElse = Optional.ofNullable(this.engagement.getVisitNote()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getVisitOutcome() {
        Object objOrElse = Optional.ofNullable(this.engagement.getVisitOutcome()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getVisitOutcomeNature() {
        Object objOrElse = Optional.ofNullable(this.engagement.getVisitOutcomeNature()).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String get__engagementPlacementId() {
        return this.__engagementPlacementId;
    }

    public final boolean isInflightCall() {
        return this.inFlightCall;
    }

    public final boolean isOverdue() {
        return getDueDateTime() > 0 && getDueDateTime() < System.currentTimeMillis();
    }

    public final void removeLinkedFiles(List<FileData> list) {
        sq8.m48649h(list, "fileList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringUtils.isBlank(((FileData) obj).getFileObjectRelationshipId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FileData) it.next()).getUploadedFileId());
        }
        Set setV0 = kh3.V0(arrayList2);
        if (!setV0.isEmpty()) {
            ArrayList<FileObjectRelationshipSummary> arrayList3 = this.addedLinkedFiles;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (!setV0.contains(((FileObjectRelationshipSummary) obj2).getFileId())) {
                    arrayList4.add(obj2);
                }
            }
            this.addedLinkedFiles = new ArrayList<>(kh3.Q0(arrayList4));
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list) {
            if (!StringUtils.isBlank(((FileData) obj3).getFileObjectRelationshipId())) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(dh3.m23088v(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            String fileObjectRelationshipId = ((FileData) it2.next()).getFileObjectRelationshipId();
            sq8.m48646e(fileObjectRelationshipId);
            arrayList6.add(fileObjectRelationshipId);
        }
        this.deletedLinkedFiles.addAll(kh3.Q0(arrayList6));
    }

    public final void setAccountId(String str) {
        sq8.m48649h(str, "value");
        if (Objects.equals(getAccountId(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().accountId(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        this.updates.accountId(str);
    }

    public final void setAddedBy(String str) {
        sq8.m48649h(str, "value");
        Engagement engagementBuild = this.engagement.copyOfBuilder().addedById(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setAddedLinkedFiles(ArrayList<FileObjectRelationshipSummary> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.addedLinkedFiles = arrayList;
    }

    public final void setAssignmentStatus(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getToBeAssigned());
        final C01391 c01391 = new C01391(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.sb6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setAssignmentStatus$lambda$8(c01391, obj);
            }
        }).isPresent()) {
            this.updates.toBeAssigned(type.ContactAssignmentStatus.valueOf(str));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().toBeAssigned(ContactAssignmentStatus.valueOf(str)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setBody(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getBody());
        final C01401 c01401 = new C01401(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.jc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setBody$lambda$64(c01401, obj);
            }
        }).isPresent()) {
            this.updates.body(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().body(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCallConnectStatus(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCallConnectStatus());
        final C01411 c01411 = C01411.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.oc6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.setCallConnectStatus$lambda$0(c01411, obj);
            }
        });
        final C01422 c01422 = new C01422(str);
        if (!map.filter(new Predicate() { // from class: o.pc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setCallConnectStatus$lambda$1(c01422, obj);
            }
        }).isPresent()) {
            this.updates.callConnectStatus(type.CallConnectStatus.valueOf(str));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().callConnectStatus(CallConnectStatus.valueOf(str)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCallDirection(String str) {
        sq8.m48649h(str, "value");
        try {
            type.CallDirection callDirectionValueOf = type.CallDirection.valueOf(str);
            Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCallDirection());
            final C01431 c01431 = C01431.INSTANCE;
            Optional map = optionalOfNullable.map(new Function() { // from class: o.gc6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EngagementSummary.setCallDirection$lambda$2(c01431, obj);
                }
            });
            final C01442 c01442 = new C01442(str);
            if (!map.filter(new Predicate() { // from class: o.rc6
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return EngagementSummary.setCallDirection$lambda$3(c01442, obj);
                }
            }).isPresent()) {
                this.updates.callDirection(callDirectionValueOf);
            }
            Engagement engagementBuild = this.engagement.copyOfBuilder().callDirection(CallDirection.valueOf(str)).build();
            sq8.m48648g(engagementBuild, "build(...)");
            this.engagement = engagementBuild;
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't set call direction with value : ");
            sb.append(str);
        }
    }

    public final void setCallDuration(int i) {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getDurationInMillis());
        final C01451 c01451 = new C01451(i);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.sc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setCallDuration$lambda$19(c01451, obj);
            }
        }).isPresent()) {
            this.updates.durationInMillis(Integer.valueOf(i));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().durationInMillis(Integer.valueOf(i)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCallEndTime(long j) {
        Temporal.DateTime dateTimeM16658m = a81.m16658m(Long.valueOf(j));
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCallEndTime());
        final C01461 c01461 = new C01461(dateTimeM16658m);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.mb6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setCallEndTime$lambda$16(c01461, obj);
            }
        }).isPresent()) {
            this.updates.callEndTime(a81.m16652g(dateTimeM16658m));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().callEndTime(dateTimeM16658m).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCallOutcome(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCallOutcome());
        final C01471 c01471 = new C01471(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.cd6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setCallOutcome$lambda$65(c01471, obj);
            }
        }).isPresent()) {
            this.updates.callOutcome(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().callOutcome(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCallOutcomeNature(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCallOutcomeNature());
        final C01481 c01481 = new C01481(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.qc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setCallOutcomeNature$lambda$66(c01481, obj);
            }
        }).isPresent()) {
            this.updates.callOutcomeNature(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().callOutcomeNature(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCallRecordingUrl(String str) {
        Engagement engagementBuild = this.engagement.copyOfBuilder().callRecordingUrl(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCallStartTime(long j) {
        Temporal.DateTime dateTimeM16658m = a81.m16658m(Long.valueOf(j));
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCallStartTime());
        final C01491 c01491 = new C01491(dateTimeM16658m);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.lc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setCallStartTime$lambda$18(c01491, obj);
            }
        }).isPresent()) {
            this.updates.callStartTime(a81.m16652g(dateTimeM16658m));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().callStartTime(dateTimeM16658m).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCallTime(long j) {
        Temporal.DateTime dateTimeM16658m = a81.m16658m(Long.valueOf(j));
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getCallEndTime());
        final C01501 c01501 = new C01501(dateTimeM16658m);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.bc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setCallTime$lambda$52(c01501, obj);
            }
        }).isPresent()) {
            this.updates.callEndTime(a81.m16652g(dateTimeM16658m));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().callEndTime(dateTimeM16658m).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCallType(String str) {
        if (str == null || Objects.equals(getCallType(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().callType(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCloudProvider(String str) {
        if (str == null || Objects.equals(getCloudProvider(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().cloudProvider(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setCloudProviderNumber(String str) {
        if (str == null || Objects.equals(getCloudProviderNumber(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().cloudProviderNumber(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setContact(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getContact());
        final C01511 c01511 = new C01511(str);
        if (optionalOfNullable.filter(new Predicate() { // from class: o.fe6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setContact$lambda$13(c01511, obj);
            }
        }).isPresent()) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().contact(Contact.justId(str)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        this.updates.contactId(str);
    }

    public final void setCreateNewDeal(boolean z) {
        this.createNewDeal = z;
    }

    public final void setCustomCallOutcomeData(String str) {
        if (Objects.equals(getCustomCallOutcomeData(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().customCallOutcomeData(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        this.updates.customCallOutcomeData(str);
    }

    public final void setCustomNextStepTaskInputData(String str) {
        this.customNextStepTaskInputData = str;
    }

    public final void setCustomTaskCompletionData(String str) {
        if (Objects.equals(getCustomTaskCompletionData(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().customTaskCompletionData(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        this.updates.customTaskCompletionData(str);
    }

    public final void setCustomTaskInputData(String str) {
        if (Objects.equals(getCustomTaskInputData(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().customTaskInputData(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        this.updates.customTaskInputData(str);
    }

    public final void setCustomVideoCallInputData(String str) {
        if (Objects.equals(getCustomVideoCallInputData(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().customVideoCallInputData(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        this.updates.customVideoCallInputData(str);
    }

    public final void setCustomVisitOutcomeData(String str) {
        if (Objects.equals(getCustomVisitOutcomeData(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().customVisitOutcomeData(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        this.updates.customVisitOutcomeData(str);
    }

    public final void setDeletedLinkedFiles(ArrayList<String> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.deletedLinkedFiles = arrayList;
    }

    public final void setDeviceId(String str) {
        if (Objects.equals(this.engagement.getDeviceId(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().deviceId(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        this.updates.deviceId(str);
    }

    public final void setDueDate(long j) {
        Temporal.DateTime dateTimeM16658m = a81.m16658m(Long.valueOf(j));
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getDueDateTime());
        final C01521 c01521 = new C01521(dateTimeM16658m);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.kc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setDueDate$lambda$41(c01521, obj);
            }
        }).isPresent()) {
            this.updates.dueDateTime(a81.m16652g(dateTimeM16658m));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().dueDateTime(dateTimeM16658m).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        if (getReminderTime() <= 0) {
            setReminderTimeOffset(1800000L);
        }
    }

    public final void setDueDateTime(long j) {
        Temporal.DateTime dateTimeM16658m = a81.m16658m(Long.valueOf(j));
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getDueDateTime());
        final C01531 c01531 = new C01531(dateTimeM16658m);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.ud6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setDueDateTime$lambda$43(c01531, obj);
            }
        }).isPresent()) {
            this.updates.dueDateTime(a81.m16652g(dateTimeM16658m));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().dueDateTime(dateTimeM16658m).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        if (getReminderTime() == 0) {
            setReminderTimeOffset(1800000L);
        }
    }

    public final void setEngagement(Engagement engagement) {
        sq8.m48649h(engagement, "<set-?>");
        this.engagement = engagement;
    }

    public final void setEngagementLog(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getBody());
        final C01541 c01541 = new C01541(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.hd6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setEngagementLog$lambda$10(c01541, obj);
            }
        }).isPresent()) {
            this.updates.body(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().body(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setEngagementPlacementId(String str) {
        if ((str == null || f9g.d0(str)) || Objects.equals(this.__engagementPlacementId, str)) {
            return;
        }
        if (f9g.d0(getId())) {
            this.updates.id(str);
            Engagement engagementBuild = this.engagement.copyOfBuilder().id(str).build();
            sq8.m48648g(engagementBuild, "build(...)");
            this.engagement = engagementBuild;
        }
        this.__engagementPlacementId = str;
    }

    public final void setEngagementSource(String str) {
        sq8.m48649h(str, "value");
        if (Objects.equals(getEngagementSource(), str)) {
            return;
        }
        this.updates.engagementSource(str);
        Engagement engagementBuild = this.engagement.copyOfBuilder().engagementSource(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setEngagementSourceLevelTwo(String str) {
        sq8.m48649h(str, "value");
        if (Objects.equals(getEngagementSourceLevelTwo(), str)) {
            return;
        }
        this.updates.engagementSourceLevelTwo(str);
        Engagement engagementBuild = this.engagement.copyOfBuilder().engagementSourceLevelTwo(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setEngagementSourceType(String str) {
        sq8.m48649h(str, "value");
        if (Objects.equals(getEngagementSourceType(), str)) {
            return;
        }
        this.updates.engagementSourceType(str);
        Engagement engagementBuild = this.engagement.copyOfBuilder().engagementSourceType(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setEngagementStatus(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getEngagementStatus());
        final C01551 c01551 = C01551.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.dc6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.setEngagementStatus$lambda$72(c01551, obj);
            }
        });
        final C01562 c01562 = new C01562(str);
        if (!map.filter(new Predicate() { // from class: o.ec6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setEngagementStatus$lambda$73(c01562, obj);
            }
        }).isPresent()) {
            this.updates.engagementStatus(type.EngagementStatus.valueOf(str));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().engagementStatus(EngagementStatus.valueOf(str)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setEngagementType(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getEngagementType());
        final C01571 c01571 = C01571.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.wd6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.setEngagementType$lambda$22(c01571, obj);
            }
        });
        final C01582 c01582 = new C01582(str);
        if (!map.filter(new Predicate() { // from class: o.xd6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setEngagementType$lambda$23(c01582, obj);
            }
        }).isPresent()) {
            this.updates.engagementType(type.EngagementType.valueOf(str));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().engagementType(EngagementType.valueOf(str)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setExternalNumber(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getExternalNumber());
        final C01591 c01591 = new C01591(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.vb6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setExternalNumber$lambda$67(c01591, obj);
            }
        }).isPresent()) {
            this.updates.externalNumber(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().externalNumber(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setHangupReason(String str) {
        if (str == null || Objects.equals(getHangupReason(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().hangupReason(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getId());
        final C01601 c01601 = new C01601(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.ic6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setId$lambda$49(c01601, obj);
            }
        }).isPresent()) {
            this.updates.id(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().id(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setInFlightCall(boolean z) {
        this.inFlightCall = z;
    }

    public final void setInflightCall(boolean z) {
        this.inFlightCall = z;
    }

    public final void setLinkedFiles(List<FileData> list, List<FileData> list2) {
        List listM21246k;
        sq8.m48649h(list, "fileList");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String uploadedFileId = ((FileData) next).getUploadedFileId();
            if (uploadedFileId == null || f9g.d0(uploadedFileId)) {
                arrayList.add(next);
            }
        }
        FileData fileData = (FileData) kh3.h0(arrayList);
        if (fileData == null) {
            setUploadedFileUrl(null);
            this.updates.uploadedFiledUrl(null);
        } else {
            setUploadedFileUrl(fileData != null ? fileData.getUploadedUri() : null);
            this.updates.uploadedFiledUrl(fileData != null ? fileData.getUploadedUri() : null);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!StringUtils.isBlank(((FileData) obj).getFileObjectRelationshipId())) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(dh3.m23088v(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String fileObjectRelationshipId = ((FileData) it2.next()).getFileObjectRelationshipId();
            sq8.m48646e(fileObjectRelationshipId);
            arrayList3.add(fileObjectRelationshipId);
        }
        List listQ0 = kh3.Q0(arrayList3);
        if (!listQ0.isEmpty()) {
            ArrayList<String> arrayList4 = this.deletedLinkedFiles;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (!listQ0.contains((String) obj2)) {
                    arrayList5.add(obj2);
                }
            }
            this.deletedLinkedFiles = new ArrayList<>(kh3.Q0(arrayList5));
        }
        if (list2 != null) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : list2) {
                if (!StringUtils.isBlank(((FileData) obj3).getFileObjectRelationshipId())) {
                    arrayList6.add(obj3);
                }
            }
            listM21246k = new ArrayList(dh3.m23088v(arrayList6, 10));
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                String fileObjectRelationshipId2 = ((FileData) it3.next()).getFileObjectRelationshipId();
                sq8.m48646e(fileObjectRelationshipId2);
                listM21246k.add(fileObjectRelationshipId2);
            }
        } else {
            listM21246k = null;
        }
        if (listM21246k == null) {
            listM21246k = ch3.m21246k();
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : listM21246k) {
            if (!listQ0.contains((String) obj4)) {
                arrayList7.add(obj4);
            }
        }
        this.deletedLinkedFiles.addAll(arrayList7);
        ArrayList arrayList8 = new ArrayList();
        for (Object obj5 : list) {
            if (StringUtils.isBlank(((FileData) obj5).getFileObjectRelationshipId())) {
                arrayList8.add(obj5);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj6 : arrayList8) {
            if (!StringUtils.isBlank(((FileData) obj6).getUploadedFileId())) {
                arrayList9.add(obj6);
            }
        }
        List<FileData> listQ02 = kh3.Q0(arrayList9);
        ArrayList arrayList10 = new ArrayList(dh3.m23088v(listQ02, 10));
        for (FileData fileData2 : listQ02) {
            fileData2.setEngagementId(getId());
            fileData2.setContactId(getContactID());
            arrayList10.add(FileData.toFileObjectRelationshipSummary$default(fileData2, null, 1, null));
        }
        this.addedLinkedFiles.addAll(arrayList10);
    }

    public final void setNextFollowUpOn(Long l) {
        if (Objects.equals(getNextFollowUpOn(), l)) {
            return;
        }
        Temporal.DateTime dateTimeM16658m = l != null ? a81.m16658m(Long.valueOf(l.longValue())) : null;
        Engagement engagementBuild = this.engagement.copyOfBuilder().nextFollowUpOn(dateTimeM16658m).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        this.updates.nextFollowUpOn(dateTimeM16658m != null ? a81.m16652g(dateTimeM16658m) : null);
    }

    public final void setNextFollowUpSetBy(String str) {
        if (Objects.equals(getNextFollowUpSetBy(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().nextFollowUpSetBy(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
        this.updates.nextFollowUpSetBy(str);
    }

    public final void setNextStepTaskAssignmentOutcome(AssignmentOutcome assignmentOutcome) {
        this.nextStepTaskAssignmentOutcome = assignmentOutcome;
    }

    public final void setNextStepTaskDueDateTime(Long l) {
        this.nextStepTaskDueDateTime = l;
    }

    public final void setNextStepTaskReminderTime(Long l) {
        this.nextStepTaskReminderTime = l;
    }

    public final void setNextStepTaskType(String str) {
        this.nextStepTaskType = str;
    }

    public final void setNextTask(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        if (sq8.m48644c(getNextTaskId(), str)) {
            return;
        }
        this.updates.nextStepTaskId(str);
        Engagement engagementBuild = this.engagement.copyOfBuilder().nextStepTask(Engagement.justId(str)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setNextTaskDueDateTime(long j) {
        this.nextStepTaskDueDateTime = Long.valueOf(j);
        if (getNextTaskReminderTime() == 0) {
            setNextTaskReminderTimeOffset(1800000L);
        }
    }

    public final void setNextTaskReminderTime(long j) {
        this.nextStepTaskReminderTime = j < 0 ? 0L : Long.valueOf(j);
    }

    public final void setNextTaskReminderTimeOffset(long j) {
        setNextTaskReminderTime(getNextTaskDueDateTime() - j);
    }

    public final void setNextTaskType(String str) {
        sq8.m48649h(str, "value");
        this.nextStepTaskType = str;
    }

    public final void setNoteAdditionMethod(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getNoteAdditionMethod());
        final C01611 c01611 = C01611.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.ae6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.setNoteAdditionMethod$lambda$47(c01611, obj);
            }
        });
        final C01622 c01622 = new C01622(str);
        if (!map.filter(new Predicate() { // from class: o.be6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setNoteAdditionMethod$lambda$48(c01622, obj);
            }
        }).isPresent()) {
            this.updates.noteAdditionMethod(type.NoteAdditionMethod.valueOf(str));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().noteAdditionMethod(NoteAdditionMethod.valueOf(str)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setNoteHeading(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getNoteHeading());
        final C01631 c01631 = new C01631(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.fc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setNoteHeading$lambda$29(c01631, obj);
            }
        }).isPresent()) {
            this.updates.noteHeading(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().noteHeading(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setNotes(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getNoteHeading());
        final C01641 c01641 = new C01641(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.tc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setNotes$lambda$11(c01641, obj);
            }
        }).isPresent()) {
            this.updates.noteHeading(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().noteHeading(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setOwner(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getOwnerId());
        final C01651 c01651 = new C01651(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.ad6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setOwner$lambda$6(c01651, obj);
            }
        }).isPresent()) {
            this.updates.ownerId(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().ownerId(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setParentEngagement(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        if (sq8.m48644c(getParentEngagementId(), str)) {
            return;
        }
        this.updates.parentEngagementId(str);
        Engagement engagementBuild = this.engagement.copyOfBuilder().parentEngagement(Engagement.justId(str)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setPhoneCallLogId(String str) {
        if (str == null || Objects.equals(getPhoneCallLogId(), str)) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().phoneCallLogId(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setPriority(String str) {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskPriority());
        final C01661 c01661 = new C01661(str);
        if (optionalOfNullable.filter(new Predicate() { // from class: o.rd6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setPriority$lambda$74(c01661, obj);
            }
        }).isPresent()) {
            return;
        }
        UpdateEngagementInput.Builder builder = this.updates;
        sq8.m48646e(str);
        builder.taskPriority(str);
        Engagement engagementBuild = this.engagement.copyOfBuilder().taskPriority(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setProperty(String str, Object obj) {
    }

    public final void setReminderTime(long j) {
        Temporal.DateTime dateTimeM16658m = a81.m16658m(Long.valueOf(j));
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getReminderDateTime());
        final C01671 c01671 = new C01671(dateTimeM16658m);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.ke6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setReminderTime$lambda$76(c01671, obj);
            }
        }).isPresent()) {
            this.updates.reminderDateTime(a81.m16652g(dateTimeM16658m));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().reminderDateTime(dateTimeM16658m).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setReminderTimeOffset(long j) {
        if (getNextFollowUpOn() == null) {
            setReminderTime(getDueDateTime() - j);
            return;
        }
        Long nextFollowUpOn = getNextFollowUpOn();
        sq8.m48646e(nextFollowUpOn);
        setReminderTime(nextFollowUpOn.longValue() - j);
    }

    public final void setSubmittedFormValues(SubmittedFormValues submittedFormValues) {
        this.submittedFormValues = submittedFormValues;
    }

    public final void setSubmittedFormValuesNextStepTask(SubmittedFormValues submittedFormValues) {
        this.submittedFormValuesNextStepTask = submittedFormValues;
    }

    public final void setSystemAction(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getSystemAction());
        final C01681 c01681 = new C01681(str);
        if (optionalOfNullable.filter(new Predicate() { // from class: o.qb6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setSystemAction$lambda$53(c01681, obj);
            }
        }).isPresent()) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().systemAction(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTaskActivityType(String str) {
        sq8.m48649h(str, "value");
        type.TaskActivityType taskActivityTypeValueOf = type.TaskActivityType.CALL;
        try {
            taskActivityTypeValueOf = type.TaskActivityType.valueOf(str);
        } catch (Exception unused) {
            sq8.m48648g(String.format("Couldn't infer %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
        }
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskActivityType());
        final C01691 c01691 = C01691.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.yc6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.setTaskActivityType$lambda$32(c01691, obj);
            }
        });
        final C01702 c01702 = new C01702(str);
        if (!map.filter(new Predicate() { // from class: o.zc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setTaskActivityType$lambda$33(c01702, obj);
            }
        }).isPresent()) {
            this.updates.taskActivityType(taskActivityTypeValueOf);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().taskActivityType(TaskActivityType.valueOf(taskActivityTypeValueOf.name())).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTaskCompletionNote(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskCompletionNote());
        final C01711 c01711 = new C01711(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.ld6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setTaskCompletionNote$lambda$24(c01711, obj);
            }
        }).isPresent()) {
            this.updates.taskCompletionNote(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().taskCompletionNote(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTaskCompletionTime(long j) {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskCompletionTime());
        final C01721 c01721 = new C01721(j);
        if (optionalOfNullable.filter(new Predicate() { // from class: o.id6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setTaskCompletionTime$lambda$27(c01721, obj);
            }
        }).isPresent()) {
            return;
        }
        this.updates.taskCompletionTime(a81.m16653h(Long.valueOf(j)));
        Engagement engagementBuild = this.engagement.copyOfBuilder().taskCompletionTime(a81.m16658m(Long.valueOf(j))).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTaskCompletionType(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskCompletionType());
        final C01731 c01731 = new C01731(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.xc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setTaskCompletionType$lambda$25(c01731, obj);
            }
        }).isPresent()) {
            this.updates.taskCompletionType(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().taskCompletionType(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTaskHeadings(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskHeading());
        final C01741 c01741 = new C01741(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.ce6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setTaskHeadings$lambda$28(c01741, obj);
            }
        }).isPresent()) {
            this.updates.taskHeading(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().taskHeading(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTaskInputNotes(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskInputNote());
        final C01751 c01751 = new C01751(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.uc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setTaskInputNotes$lambda$30(c01751, obj);
            }
        }).isPresent()) {
            this.updates.taskInputNote(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().taskInputNote(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTaskLocation(LeadsAddress leadsAddress) {
        sq8.m48649h(leadsAddress, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskLocation());
        final C01761 c01761 = new C01761(leadsAddress);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.yb6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setTaskLocation$lambda$36(c01761, obj);
            }
        }).isPresent()) {
            this.updates.taskLocation(vgf.m52764j(leadsAddress.getAddress()));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().taskLocation(leadsAddress.getAddress()).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTaskStatus(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getEngagementStatus());
        final C01771 c01771 = C01771.INSTANCE;
        Optional map = optionalOfNullable.map(new Function() { // from class: o.xe6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.setTaskStatus$lambda$69(c01771, obj);
            }
        });
        final C01782 c01782 = new C01782(str);
        if (map.filter(new Predicate() { // from class: o.lb6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setTaskStatus$lambda$70(c01782, obj);
            }
        }).isPresent()) {
            return;
        }
        this.updates.engagementStatus(type.EngagementStatus.valueOf(str));
        Engagement engagementBuild = this.engagement.copyOfBuilder().engagementStatus(EngagementStatus.valueOf(str)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTaskType(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getTaskType());
        final C01791 c01791 = new C01791(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.ie6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setTaskType$lambda$34(c01791, obj);
            }
        }).isPresent()) {
            this.updates.taskType(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().taskType(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTeamId(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getPrimaryTeamId());
        final C01801 c01801 = new C01801(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.rb6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setTeamId$lambda$7(c01801, obj);
            }
        }).isPresent()) {
            this.updates.primaryTeamId(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().primaryTeamId(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTotalCallDuration(int i) {
        if (Objects.equals(Integer.valueOf(getTotalCallDuration()), Integer.valueOf(i))) {
            return;
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().totalCallDuration(Integer.valueOf(i)).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setTransferLeadOnNextStepTask(boolean z) {
        this.transferLeadOnNextStepTask = z;
    }

    public final void setUpdatedBy(String str) {
        sq8.m48649h(str, "value");
        Engagement engagementBuild = this.engagement.copyOfBuilder().updatedById(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setUpdates(UpdateEngagementInput.Builder builder) {
        sq8.m48649h(builder, "<set-?>");
        this.updates = builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setUploadedFileUrl(String str) {
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getUploadedFiledUrl());
        final C01811 c01811 = new C01811(str);
        if (optionalOfNullable.filter(new Predicate() { // from class: o.nc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setUploadedFileUrl$lambda$79(c01811, obj);
            }
        }).isPresent()) {
            String uploadedFiledUrl = this.engagement.getUploadedFiledUrl();
            if (uploadedFiledUrl == null || f9g.d0(uploadedFiledUrl)) {
            }
        } else {
            this.updates.uploadedFiledUrl(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().uploadedFiledUrl(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setUserNumber(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getUserNumber());
        final C01821 c01821 = new C01821(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.sd6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setUserNumber$lambda$50(c01821, obj);
            }
        }).isPresent()) {
            this.updates.userNumber(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().userNumber(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setVideoCallLink(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getVideoCallLink());
        final C01831 c01831 = new C01831(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.je6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setVideoCallLink$lambda$62(c01831, obj);
            }
        }).isPresent()) {
            this.updates.videoCallLink(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().videoCallLink(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setVideoCallMetadata(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getVideoCallMetadata());
        final C01841 c01841 = new C01841(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.ue6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setVideoCallMetadata$lambda$63(c01841, obj);
            }
        }).isPresent()) {
            this.updates.videoCallMetadata(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().videoCallMetadata(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setVideoCallOutcome(String str) {
        sq8.m48649h(str, "value");
        this.updates.videoCallOutcome(str);
        Engagement engagementBuild = this.engagement.copyOfBuilder().videoCallOutcome(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setVideoCallPlatform(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getVideoCallPlatform());
        final C01851 c01851 = new C01851(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.wb6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setVideoCallPlatform$lambda$61(c01851, obj);
            }
        }).isPresent()) {
            this.updates.videoCallPlatform(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().videoCallPlatform(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setVisitDate(long j) {
        Temporal.DateTime dateTimeM16658m = a81.m16658m(Long.valueOf(j));
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getVisitTime());
        final C01861 c01861 = new C01861(dateTimeM16658m);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.wc6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setVisitDate$lambda$58(c01861, obj);
            }
        }).isPresent()) {
            this.updates.visitTime(a81.m16652g(dateTimeM16658m));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().visitTime(dateTimeM16658m).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setVisitLocation(LeadsAddress leadsAddress) {
        sq8.m48649h(leadsAddress, "value");
        Address address = leadsAddress.getAddress();
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getVisitLocation());
        final C01871 c01871 = new C01871(address);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.ge6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setVisitLocation$lambda$56(c01871, obj);
            }
        }).isPresent()) {
            this.updates.visitLocation(vgf.m52764j(address));
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().visitLocation(address).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setVisitNote(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getVisitNote());
        final C01881 c01881 = new C01881(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.fd6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setVisitNote$lambda$54(c01881, obj);
            }
        }).isPresent()) {
            this.updates.visitNote(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().visitNote(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setVisitOutcome(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getVisitOutcome());
        final C01891 c01891 = new C01891(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.od6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setVisitOutcome$lambda$59(c01891, obj);
            }
        }).isPresent()) {
            this.updates.visitOutcome(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().visitOutcome(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void setVisitOutcomeNature(String str) {
        sq8.m48649h(str, "value");
        Optional optionalOfNullable = Optional.ofNullable(this.engagement.getVisitOutcomeNature());
        final C01901 c01901 = new C01901(str);
        if (!optionalOfNullable.filter(new Predicate() { // from class: o.nd6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EngagementSummary.setVisitOutcomeNature$lambda$60(c01901, obj);
            }
        }).isPresent()) {
            this.updates.visitOutcomeNature(str);
        }
        Engagement engagementBuild = this.engagement.copyOfBuilder().visitOutcomeNature(str).build();
        sq8.m48648g(engagementBuild, "build(...)");
        this.engagement = engagementBuild;
    }

    public final void set__engagementPlacementId(String str) {
        this.__engagementPlacementId = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Tasks toTask() throws NumberFormatException {
        boolean z;
        String id = getId();
        LeadsSummary contact = getContact();
        LeadsUser owner = getOwner();
        String contactName = getContactName();
        String contactID = getContactID();
        String designation = getDesignation();
        String profilePic = getProfilePic();
        Optional optionalOfNullable = Optional.ofNullable(getContact());
        final C01911 c01911 = new wrd() { // from class: ai.salesmax.model.EngagementSummary.toTask.1
            @Override // p001o.cc9
            public Object get(Object obj) {
                return ((LeadsSummary) obj).getCompanyName();
            }
        };
        String str = (String) optionalOfNullable.map(new Function() { // from class: o.ne6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.toTask$lambda$108(c01911, obj);
            }
        }).orElse("");
        String singleContact = getSingleContact();
        String secondaryTitle = getSecondaryTitle();
        long callDuration = getCallDuration();
        long createdAt = getCreatedAt();
        long updatedAt = getUpdatedAt();
        long calltime = getCalltime();
        long callStartTime = getCallStartTime();
        long callEndtime = getCallEndtime();
        String strM49854f = th1.m49854f(getCallDirection());
        String strM49854f2 = th1.m49854f(getCallOutcome());
        String callOutcomeNature = getCallOutcomeNature();
        String strM49854f3 = th1.m49854f(getCallConnectStatus());
        String body = getBody();
        String callRecordingUrl = getCallRecordingUrl();
        String strM49854f4 = th1.m49854f(getNextTaskType());
        String nextTaskId = getNextTaskId();
        String noteHeading = getNoteHeading();
        String strM49854f5 = th1.m49854f(getNextTaskType());
        String noteAdditionMethod = getNoteAdditionMethod();
        String taskHeadings = getTaskHeadings();
        String taskInputNotes = getTaskInputNotes();
        Optional optionalOfNullable2 = Optional.ofNullable(getOwner());
        final C01922 c01922 = new tpb() { // from class: ai.salesmax.model.EngagementSummary.toTask.2
            @Override // p001o.tpb, p001o.cc9
            public Object get(Object obj) {
                return ((LeadsUser) obj).getName();
            }

            public void set(Object obj, Object obj2) {
                ((LeadsUser) obj).setName((String) obj2);
            }
        };
        String str2 = (String) optionalOfNullable2.map(new Function() { // from class: o.oe6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.toTask$lambda$109(c01922, obj);
            }
        }).orElse("");
        Optional optionalOfNullable3 = Optional.ofNullable(getOwner());
        final C01933 c01933 = C01933.INSTANCE;
        String str3 = (String) optionalOfNullable3.map(new Function() { // from class: o.pe6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.toTask$lambda$110(c01933, obj);
            }
        }).orElse("");
        String taskOwnerProfilePic = getTaskOwnerProfilePic();
        String engagementType = getEngagementType();
        Optional optionalOfNullable4 = Optional.ofNullable(getTaskLocation());
        final C01944 c01944 = C01944.INSTANCE;
        Object objOrElse = optionalOfNullable4.map(new Function() { // from class: o.qe6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.toTask$lambda$111(c01944, obj);
            }
        }).orElse("");
        sq8.m48646e(objOrElse);
        String str4 = (String) objOrElse;
        String strM49854f6 = th1.m49854f(getTaskType());
        String strM49854f7 = th1.m49854f(getTaskActivityType());
        String priority = getPriority();
        String strM49854f8 = priority != null ? th1.m49854f(priority) : null;
        String str5 = strM49854f8 == null ? "" : strM49854f8;
        Optional optionalOfNullable5 = Optional.ofNullable(getTaskLocation());
        final C01955 c01955 = C01955.INSTANCE;
        Object objOrElse2 = optionalOfNullable5.map(new Function() { // from class: o.re6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.toTask$lambda$112(c01955, obj);
            }
        }).orElse(IdManager.DEFAULT_VERSION_NAME);
        sq8.m48646e(objOrElse2);
        double d = Double.parseDouble((String) objOrElse2);
        Optional optionalOfNullable6 = Optional.ofNullable(getTaskLocation());
        final C01966 c01966 = C01966.INSTANCE;
        Object objOrElse3 = optionalOfNullable6.map(new Function() { // from class: o.se6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.toTask$lambda$113(c01966, obj);
            }
        }).orElse(IdManager.DEFAULT_VERSION_NAME);
        sq8.m48646e(objOrElse3);
        double d2 = Double.parseDouble((String) objOrElse3);
        long jM34035U = getDueDateTime() == -1 ? -1L : jm7.m34035U(getDueDateTime());
        long jM34036V = getDueDateTime() == -1 ? -1L : jm7.m34036V(getDueDateTime());
        long dueDateTime = getDueDateTime();
        String systemAction = getSystemAction();
        long jM34035U2 = getNextTaskDueDateTime() == -1 ? -1L : jm7.m34035U(getNextTaskDueDateTime());
        long jM34036V2 = getNextTaskDueDateTime() == -1 ? -1L : jm7.m34036V(getNextTaskDueDateTime());
        long nextTaskDueDateTime = getNextTaskDueDateTime();
        long reminderTimeOffset = getDueDateTime() == -1 ? -1L : getReminderTimeOffset();
        String taskStatus = getTaskStatus();
        String str6 = (String) Optional.ofNullable(getTaskCompletionNote()).orElse("");
        String str7 = (String) Optional.ofNullable(getTaskCompletionType()).orElse("");
        String strM49854f9 = th1.m49854f(getNextTaskType());
        String body2 = getBody();
        long taskCompletionTime = getTaskCompletionTime();
        long visitDate = getVisitDate();
        String strM49854f10 = th1.m49854f(getVisitOutcome());
        String visitOutcomeNature = getVisitOutcomeNature();
        String videoCallPlatform = getVideoCallPlatform();
        String videoCallLink = getVideoCallLink();
        String videoCallMetadata = getVideoCallMetadata();
        String videoCallOutcome = getVideoCallOutcome();
        String strM49854f11 = th1.m49854f(getNextTaskType());
        String visitNote = getVisitNote();
        Optional optionalOfNullable7 = Optional.ofNullable(getVisitLocation());
        final C01977 c01977 = C01977.INSTANCE;
        Object objOrElse4 = optionalOfNullable7.map(new Function() { // from class: o.te6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.toTask$lambda$114(c01977, obj);
            }
        }).orElse("");
        sq8.m48646e(objOrElse4);
        String str8 = (String) objOrElse4;
        Optional optionalOfNullable8 = Optional.ofNullable(getVisitLocation());
        final C01988 c01988 = C01988.INSTANCE;
        Object objOrElse5 = optionalOfNullable8.map(new Function() { // from class: o.ve6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.toTask$lambda$115(c01988, obj);
            }
        }).orElse(IdManager.DEFAULT_VERSION_NAME);
        sq8.m48646e(objOrElse5);
        double d3 = Double.parseDouble((String) objOrElse5);
        Optional optionalOfNullable9 = Optional.ofNullable(getVisitLocation());
        final C01999 c01999 = C01999.INSTANCE;
        Object objOrElse6 = optionalOfNullable9.map(new Function() { // from class: o.we6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return EngagementSummary.toTask$lambda$116(c01999, obj);
            }
        }).orElse(IdManager.DEFAULT_VERSION_NAME);
        sq8.m48646e(objOrElse6);
        double d4 = Double.parseDouble((String) objOrElse6);
        List<CommentSummary> comments = getComments();
        List<EngagementUpdateSummary> engagementUpdates = getEngagementUpdates();
        boolean zIsOverdue = isOverdue();
        if (!getComments().isEmpty()) {
            z = true;
        } else {
            String priority2 = getPriority();
            if (!sq8.m48644c(priority2 != null ? th1.m49854f(priority2) : null, Priority.VERY_HIGH.name())) {
                String priority3 = getPriority();
                if (!sq8.m48644c(priority3 != null ? th1.m49854f(priority3) : null, Priority.HIGH.name()) && !isOverdue()) {
                    z = false;
                }
            }
        }
        ArrayList arrayList = new ArrayList(getLinkedFiles());
        ArrayList arrayList2 = new ArrayList(getLinkedFiles());
        String teamId = getTeamId();
        String assignmentStatus = getAssignmentStatus();
        String engagementSource = getEngagementSource();
        String engagementSourceType = getEngagementSourceType();
        ryh activityLocation = getActivityLocation();
        String parentEngagementId = getParentEngagementId();
        String engagementPlacementId = getEngagementPlacementId();
        String customTaskCompletionData = getCustomTaskCompletionData();
        String customCallOutcomeData = getCustomCallOutcomeData();
        String customVisitOutcomeData = getCustomVisitOutcomeData();
        CustomFormDataObservable customFormDataObservable = new CustomFormDataObservable(getCustomTaskCompletionData());
        CustomFormDataObservable customFormDataObservable2 = new CustomFormDataObservable(getCustomCallOutcomeData());
        CustomFormDataObservable customFormDataObservable3 = new CustomFormDataObservable(getCustomVisitOutcomeData());
        CustomFormDataObservable customFormDataObservable4 = new CustomFormDataObservable(getCustomVideoCallInputData());
        String customTaskInputData = getCustomTaskInputData();
        String str9 = this.customNextStepTaskInputData;
        String customVideoCallInputData = getCustomVideoCallInputData();
        List<RecentAction> recentActions = getRecentActions();
        Long taskEngagementActionsUpdatedAt = getTaskEngagementActionsUpdatedAt();
        Long firstTaskEngagementActionOn = getFirstTaskEngagementActionOn();
        Integer taskEngagementActionCount = getTaskEngagementActionCount();
        Long nextFollowUpOn = getNextFollowUpOn();
        String nextFollowUpSetBy = getNextFollowUpSetBy();
        boolean z2 = this.transferLeadOnNextStepTask;
        AssignmentOutcome assignmentOutcome = this.nextStepTaskAssignmentOutcome;
        String engagementSourceLevelTwo = getEngagementSourceLevelTwo();
        sq8.m48646e(str);
        sq8.m48646e(str2);
        sq8.m48646e(str3);
        sq8.m48646e(str6);
        sq8.m48646e(str7);
        return new Tasks(id, contact, owner, contactName, contactID, designation, singleContact, profilePic, str, secondaryTitle, noteHeading, strM49854f5, noteAdditionMethod, body2, parentEngagementId, taskHeadings, taskInputNotes, jM34036V, jM34036V2, dueDateTime, nextTaskDueDateTime, str2, str3, taskOwnerProfilePic, engagementType, str5, null, str4, d, d2, null, jM34035U, jM34035U2, strM49854f6, strM49854f7, reminderTimeOffset, taskCompletionTime, strM49854f9, systemAction, visitNote, strM49854f10, visitOutcomeNature, visitDate, strM49854f11, str8, d3, d4, calltime, callDuration, strM49854f, strM49854f3, callStartTime, callEndtime, strM49854f2, callOutcomeNature, strM49854f4, nextTaskId, body, callRecordingUrl, false, false, comments, engagementUpdates, zIsOverdue, z, taskStatus, str6, str7, arrayList, arrayList2, assignmentStatus, teamId, engagementSource, engagementSourceType, activityLocation, engagementPlacementId, customTaskCompletionData, customCallOutcomeData, customVisitOutcomeData, customTaskInputData, str9, customVideoCallInputData, customFormDataObservable, customFormDataObservable2, customFormDataObservable3, customFormDataObservable4, recentActions, nextFollowUpOn, nextFollowUpSetBy, taskEngagementActionsUpdatedAt, firstTaskEngagementActionOn, taskEngagementActionCount, videoCallPlatform, videoCallLink, videoCallMetadata, videoCallOutcome, false, null, null, null, z2, assignmentOutcome, engagementSourceLevelTwo, false, false, Long.valueOf(updatedAt), Long.valueOf(createdAt), null, false, null, null, null, null, null, null, null, null, 1140850688, 402653184, 0, 2095503, null);
    }

    public final boolean transferLeadOnNextTask() {
        return this.transferLeadOnNextStepTask;
    }

    public EngagementSummary(Engagement engagement) {
        sq8.m48649h(engagement, "engagement");
        this.engagement = engagement;
        UpdateEngagementInput.Builder builder = UpdateEngagementInput.builder();
        sq8.m48648g(builder, "builder(...)");
        this.updates = builder;
        this.addedLinkedFiles = new ArrayList<>();
        this.deletedLinkedFiles = new ArrayList<>();
    }

    public /* synthetic */ EngagementSummary(Engagement engagement, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : engagement);
    }
}
