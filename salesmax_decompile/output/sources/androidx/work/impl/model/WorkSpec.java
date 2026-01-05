package androidx.work.impl.model;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.objectweb.asm.Opcodes;
import p001o.bce;
import p001o.dh3;
import p001o.id5;
import p001o.sq8;
import p001o.zl7;

@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
/* loaded from: classes2.dex */
public final class WorkSpec {
    public static final Companion Companion = new Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG;
    public static final zl7 WORK_INFO_MAPPER;

    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    @ColumnInfo(name = "backoff_policy")
    public BackoffPolicy backoffPolicy;

    @Embedded
    public Constraints constraints;

    @ColumnInfo(name = "run_in_foreground")
    public boolean expedited;

    @ColumnInfo(name = "flex_duration")
    public long flexDuration;

    @ColumnInfo(defaultValue = "0")
    private final int generation;

    @PrimaryKey
    @ColumnInfo(name = OutcomeConstants.OUTCOME_ID)
    public final String id;

    @ColumnInfo(name = "initial_delay")
    public long initialDelay;

    @ColumnInfo(name = "input")
    public Data input;

    @ColumnInfo(name = "input_merger_class_name")
    public String inputMergerClassName;

    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;

    @ColumnInfo(name = "last_enqueue_time")
    public long lastEnqueueTime;

    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    @ColumnInfo(name = "out_of_quota_policy")
    public OutOfQuotaPolicy outOfQuotaPolicy;

    @ColumnInfo(name = "output")
    public Data output;

    @ColumnInfo(defaultValue = "0", name = "period_count")
    private int periodCount;

    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;

    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    @ColumnInfo(name = "state")
    public WorkInfo.State state;

    @ColumnInfo(name = "worker_class_name")
    public String workerClassName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public static final class IdAndState {

        @ColumnInfo(name = OutcomeConstants.OUTCOME_ID)
        public String id;

        @ColumnInfo(name = "state")
        public WorkInfo.State state;

        public IdAndState(String str, WorkInfo.State state) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(state, "state");
            this.id = str;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i, Object obj) {
            if ((i & 1) != 0) {
                str = idAndState.id;
            }
            if ((i & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final IdAndState copy(String str, WorkInfo.State state) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(state, "state");
            return new IdAndState(str, state);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return sq8.m48644c(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    public static final class WorkInfoPojo {

        @ColumnInfo(name = "generation")
        private final int generation;

        @ColumnInfo(name = OutcomeConstants.OUTCOME_ID)
        private String id;

        @ColumnInfo(name = "output")
        private Data output;

        @Relation(entity = WorkProgress.class, entityColumn = "work_spec_id", parentColumn = OutcomeConstants.OUTCOME_ID, projection = {"progress"})
        private List<Data> progress;

        @ColumnInfo(name = "run_attempt_count")
        private int runAttemptCount;

        @ColumnInfo(name = "state")
        private WorkInfo.State state;

        @Relation(entity = WorkTag.class, entityColumn = "work_spec_id", parentColumn = OutcomeConstants.OUTCOME_ID, projection = {"tag"})
        private List<String> tags;

        public WorkInfoPojo(String str, WorkInfo.State state, Data data, int i, int i2, List<String> list, List<Data> list2) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(state, "state");
            sq8.m48649h(data, "output");
            sq8.m48649h(list, "tags");
            sq8.m48649h(list2, "progress");
            this.id = str;
            this.state = state;
            this.output = data;
            this.runAttemptCount = i;
            this.generation = i2;
            this.tags = list;
            this.progress = list2;
        }

        public static /* synthetic */ WorkInfoPojo copy$default(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state, Data data, int i, int i2, List list, List list2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = workInfoPojo.id;
            }
            if ((i3 & 2) != 0) {
                state = workInfoPojo.state;
            }
            WorkInfo.State state2 = state;
            if ((i3 & 4) != 0) {
                data = workInfoPojo.output;
            }
            Data data2 = data;
            if ((i3 & 8) != 0) {
                i = workInfoPojo.runAttemptCount;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                i2 = workInfoPojo.generation;
            }
            int i5 = i2;
            if ((i3 & 32) != 0) {
                list = workInfoPojo.tags;
            }
            List list3 = list;
            if ((i3 & 64) != 0) {
                list2 = workInfoPojo.progress;
            }
            return workInfoPojo.copy(str, state2, data2, i4, i5, list3, list2);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final Data component3() {
            return this.output;
        }

        public final int component4() {
            return this.runAttemptCount;
        }

        public final int component5() {
            return this.generation;
        }

        public final List<String> component6() {
            return this.tags;
        }

        public final List<Data> component7() {
            return this.progress;
        }

        public final WorkInfoPojo copy(String str, WorkInfo.State state, Data data, int i, int i2, List<String> list, List<Data> list2) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(state, "state");
            sq8.m48649h(data, "output");
            sq8.m48649h(list, "tags");
            sq8.m48649h(list2, "progress");
            return new WorkInfoPojo(str, state, data, i, i2, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return sq8.m48644c(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && sq8.m48644c(this.output, workInfoPojo.output) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.generation == workInfoPojo.generation && sq8.m48644c(this.tags, workInfoPojo.tags) && sq8.m48644c(this.progress, workInfoPojo.progress);
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final String getId() {
            return this.id;
        }

        public final Data getOutput() {
            return this.output;
        }

        public final List<Data> getProgress() {
            return this.progress;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        public final WorkInfo.State getState() {
            return this.state;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + Integer.hashCode(this.generation)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public final void setId(String str) {
            sq8.m48649h(str, "<set-?>");
            this.id = str;
        }

        public final void setOutput(Data data) {
            sq8.m48649h(data, "<set-?>");
            this.output = data;
        }

        public final void setProgress(List<Data> list) {
            sq8.m48649h(list, "<set-?>");
            this.progress = list;
        }

        public final void setRunAttemptCount(int i) {
            this.runAttemptCount = i;
        }

        public final void setState(WorkInfo.State state) {
            sq8.m48649h(state, "<set-?>");
            this.state = state;
        }

        public final void setTags(List<String> list) {
            sq8.m48649h(list, "<set-?>");
            this.tags = list;
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        public final WorkInfo toWorkInfo() {
            return new WorkInfo(UUID.fromString(this.id), this.state, this.output, this.tags, this.progress.isEmpty() ^ true ? this.progress.get(0) : Data.EMPTY, this.runAttemptCount, this.generation);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        sq8.m48648g(strTagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = strTagWithPrefix;
        WORK_INFO_MAPPER = new zl7() { // from class: o.rbj
            @Override // p001o.zl7
            public final Object apply(Object obj) {
                return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
            }
        };
    }

    public WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(state, "state");
        sq8.m48649h(str2, "workerClassName");
        sq8.m48649h(data, "input");
        sq8.m48649h(data2, "output");
        sq8.m48649h(constraints, "constraints");
        sq8.m48649h(backoffPolicy, "backoffPolicy");
        sq8.m48649h(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = str;
        this.state = state;
        this.workerClassName = str2;
        this.inputMergerClassName = str3;
        this.input = data;
        this.output = data2;
        this.initialDelay = j;
        this.intervalDuration = j2;
        this.flexDuration = j3;
        this.constraints = constraints;
        this.runAttemptCount = i;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j4;
        this.lastEnqueueTime = j5;
        this.minimumRetentionDuration = j6;
        this.scheduleRequestedAt = j7;
        this.expedited = z;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i2;
        this.generation = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    public final long calculateNextRunTime() {
        if (isBackedOff()) {
            return this.lastEnqueueTime + bce.m18605h(this.backoffPolicy == BackoffPolicy.LINEAR ? this.backoffDelayDuration * this.runAttemptCount : (long) Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1), WorkRequest.MAX_BACKOFF_MILLIS);
        }
        if (!isPeriodic()) {
            long jCurrentTimeMillis = this.lastEnqueueTime;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return this.initialDelay + jCurrentTimeMillis;
        }
        int i = this.periodCount;
        long j = this.lastEnqueueTime;
        if (i == 0) {
            j += this.initialDelay;
        }
        long j2 = this.flexDuration;
        long j3 = this.intervalDuration;
        if (j2 != j3) {
            j = i == 0 ? (-1) * j2 : 0L;
            j += j3;
        } else if (i != 0) {
            j = j3;
        }
        return j + j;
    }

    public final String component1() {
        return this.id;
    }

    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.periodCount;
    }

    public final WorkInfo.State component2() {
        return this.state;
    }

    public final int component20() {
        return this.generation;
    }

    public final String component3() {
        return this.workerClassName;
    }

    public final String component4() {
        return this.inputMergerClassName;
    }

    public final Data component5() {
        return this.input;
    }

    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    public final WorkSpec copy(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(state, "state");
        sq8.m48649h(str2, "workerClassName");
        sq8.m48649h(data, "input");
        sq8.m48649h(data2, "output");
        sq8.m48649h(constraints, "constraints");
        sq8.m48649h(backoffPolicy, "backoffPolicy");
        sq8.m48649h(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(str, state, str2, str3, data, data2, j, j2, j3, constraints, i, backoffPolicy, j4, j5, j6, j7, z, outOfQuotaPolicy, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return sq8.m48644c(this.id, workSpec.id) && this.state == workSpec.state && sq8.m48644c(this.workerClassName, workSpec.workerClassName) && sq8.m48644c(this.inputMergerClassName, workSpec.inputMergerClassName) && sq8.m48644c(this.input, workSpec.input) && sq8.m48644c(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && sq8.m48644c(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final boolean hasConstraints() {
        return !sq8.m48644c(Constraints.NONE, this.constraints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        String str = this.inputMergerClassName;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31;
        boolean z = this.expedited;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((iHashCode2 + i) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation);
    }

    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final void setBackoffDelayDuration(long j) {
        if (j > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (j < 10000) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = bce.m18610m(j, 10000L, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final void setPeriodCount(int i) {
        this.periodCount = i;
    }

    public final void setPeriodic(long j) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(bce.m18602e(j, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), bce.m18602e(j, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    public final void setPeriodic(long j, long j2) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = bce.m18602e(j, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (j2 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + j);
        }
        this.flexDuration = bce.m18610m(j2, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, this.intervalDuration);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, int i4, id5 id5Var) {
        Data data3;
        Data data4;
        WorkInfo.State state2 = (i4 & 2) != 0 ? WorkInfo.State.ENQUEUED : state;
        String str4 = (i4 & 8) != 0 ? null : str3;
        if ((i4 & 16) != 0) {
            Data data5 = Data.EMPTY;
            sq8.m48648g(data5, "EMPTY");
            data3 = data5;
        } else {
            data3 = data;
        }
        if ((i4 & 32) != 0) {
            Data data6 = Data.EMPTY;
            sq8.m48648g(data6, "EMPTY");
            data4 = data6;
        } else {
            data4 = data2;
        }
        this(str, state2, str2, str4, data3, data4, (i4 & 64) != 0 ? 0L : j, (i4 & 128) != 0 ? 0L : j2, (i4 & 256) != 0 ? 0L : j3, (i4 & 512) != 0 ? Constraints.NONE : constraints, (i4 & 1024) != 0 ? 0 : i, (i4 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i4 & 4096) != 0 ? 30000L : j4, (i4 & 8192) != 0 ? 0L : j5, (i4 & Opcodes.ACC_ENUM) != 0 ? 0L : j6, (32768 & i4) != 0 ? -1L : j7, (65536 & i4) != 0 ? false : z, (131072 & i4) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i4) != 0 ? 0 : i2, (i4 & Opcodes.ASM8) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String str, WorkSpec workSpec) {
        this(str, workSpec.state, workSpec.workerClassName, workSpec.inputMergerClassName, new Data(workSpec.input), new Data(workSpec.output), workSpec.initialDelay, workSpec.intervalDuration, workSpec.flexDuration, new Constraints(workSpec.constraints), workSpec.runAttemptCount, workSpec.backoffPolicy, workSpec.backoffDelayDuration, workSpec.lastEnqueueTime, workSpec.minimumRetentionDuration, workSpec.scheduleRequestedAt, workSpec.expedited, workSpec.outOfQuotaPolicy, workSpec.periodCount, 0, Opcodes.ASM8, null);
        sq8.m48649h(str, "newId");
        sq8.m48649h(workSpec, "other");
    }
}
