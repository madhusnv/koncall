package androidx.work;

import android.net.Uri;
import androidx.room.ColumnInfo;
import androidx.work.impl.utils.DurationApi26Impl;
import com.google.firebase.perf.util.Constants;
import j$.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p001o.id5;
import p001o.kh3;
import p001o.nif;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class Constraints {
    public static final Companion Companion = new Companion(null);
    public static final Constraints NONE = new Constraints(null, false, false, false, false, 0, 0, null, Constants.MAX_HOST_LENGTH, null);

    @ColumnInfo(name = "trigger_max_content_delay")
    private final long contentTriggerMaxDelayMillis;

    @ColumnInfo(name = "trigger_content_update_delay")
    private final long contentTriggerUpdateDelayMillis;

    @ColumnInfo(name = "content_uri_triggers")
    private final Set<ContentUriTrigger> contentUriTriggers;

    @ColumnInfo(name = "required_network_type")
    private final NetworkType requiredNetworkType;

    @ColumnInfo(name = "requires_battery_not_low")
    private final boolean requiresBatteryNotLow;

    @ColumnInfo(name = "requires_charging")
    private final boolean requiresCharging;

    @ColumnInfo(name = "requires_device_idle")
    private final boolean requiresDeviceIdle;

    @ColumnInfo(name = "requires_storage_not_low")
    private final boolean requiresStorageNotLow;

    public static final class Builder {
        private Set<ContentUriTrigger> contentUriTriggers;
        private NetworkType requiredNetworkType;
        private boolean requiresBatteryNotLow;
        private boolean requiresCharging;
        private boolean requiresDeviceIdle;
        private boolean requiresStorageNotLow;
        private long triggerContentMaxDelay;
        private long triggerContentUpdateDelay;

        public Builder() {
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
        }

        public final Builder addContentUriTrigger(Uri uri, boolean z) {
            sq8.m48649h(uri, "uri");
            this.contentUriTriggers.add(new ContentUriTrigger(uri, z));
            return this;
        }

        public final Constraints build() {
            Set setV0 = kh3.V0(this.contentUriTriggers);
            long j = this.triggerContentUpdateDelay;
            long j2 = this.triggerContentMaxDelay;
            return new Constraints(this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, j, j2, setV0);
        }

        public final Builder setRequiredNetworkType(NetworkType networkType) {
            sq8.m48649h(networkType, "networkType");
            this.requiredNetworkType = networkType;
            return this;
        }

        public final Builder setRequiresBatteryNotLow(boolean z) {
            this.requiresBatteryNotLow = z;
            return this;
        }

        public final Builder setRequiresCharging(boolean z) {
            this.requiresCharging = z;
            return this;
        }

        public final Builder setRequiresDeviceIdle(boolean z) {
            this.requiresDeviceIdle = z;
            return this;
        }

        public final Builder setRequiresStorageNotLow(boolean z) {
            this.requiresStorageNotLow = z;
            return this;
        }

        public final Builder setTriggerContentMaxDelay(long j, TimeUnit timeUnit) {
            sq8.m48649h(timeUnit, "timeUnit");
            this.triggerContentMaxDelay = timeUnit.toMillis(j);
            return this;
        }

        public final Builder setTriggerContentUpdateDelay(long j, TimeUnit timeUnit) {
            sq8.m48649h(timeUnit, "timeUnit");
            this.triggerContentUpdateDelay = timeUnit.toMillis(j);
            return this;
        }

        public final Builder setTriggerContentMaxDelay(Duration duration) {
            sq8.m48649h(duration, "duration");
            this.triggerContentMaxDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public final Builder setTriggerContentUpdateDelay(Duration duration) {
            sq8.m48649h(duration, "duration");
            this.triggerContentUpdateDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public Builder(Constraints constraints) {
            sq8.m48649h(constraints, "constraints");
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
            this.requiresCharging = constraints.requiresCharging();
            this.requiresDeviceIdle = constraints.requiresDeviceIdle();
            this.requiredNetworkType = constraints.getRequiredNetworkType();
            this.requiresBatteryNotLow = constraints.requiresBatteryNotLow();
            this.requiresStorageNotLow = constraints.requiresStorageNotLow();
            this.triggerContentUpdateDelay = constraints.getContentTriggerUpdateDelayMillis();
            this.triggerContentMaxDelay = constraints.getContentTriggerMaxDelayMillis();
            this.contentUriTriggers = kh3.U0(constraints.getContentUriTriggers());
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public static final class ContentUriTrigger {
        private final boolean isTriggeredForDescendants;
        private final Uri uri;

        public ContentUriTrigger(Uri uri, boolean z) {
            sq8.m48649h(uri, "uri");
            this.uri = uri;
            this.isTriggeredForDescendants = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!sq8.m48644c(ContentUriTrigger.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            sq8.m48647f(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) obj;
            return sq8.m48644c(this.uri, contentUriTrigger.uri) && this.isTriggeredForDescendants == contentUriTrigger.isTriggeredForDescendants;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + Boolean.hashCode(this.isTriggeredForDescendants);
        }

        public final boolean isTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }
    }

    public Constraints() {
        this(null, false, false, false, false, 0L, 0L, null, Constants.MAX_HOST_LENGTH, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !sq8.m48644c(Constraints.class, obj.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.requiresCharging == constraints.requiresCharging && this.requiresDeviceIdle == constraints.requiresDeviceIdle && this.requiresBatteryNotLow == constraints.requiresBatteryNotLow && this.requiresStorageNotLow == constraints.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == constraints.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == constraints.contentTriggerMaxDelayMillis && this.requiredNetworkType == constraints.requiredNetworkType) {
            return sq8.m48644c(this.contentUriTriggers, constraints.contentUriTriggers);
        }
        return false;
    }

    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    public final Set<ContentUriTrigger> getContentUriTriggers() {
        return this.contentUriTriggers;
    }

    public final NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean hasContentUriTriggers() {
        return !this.contentUriTriggers.isEmpty();
    }

    public int hashCode() {
        int iHashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j = this.contentTriggerUpdateDelayMillis;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.contentTriggerMaxDelayMillis;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.contentUriTriggers.hashCode();
    }

    public final boolean requiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    public final boolean requiresCharging() {
        return this.requiresCharging;
    }

    public final boolean requiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    public final boolean requiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    public Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set<ContentUriTrigger> set) {
        sq8.m48649h(networkType, "requiredNetworkType");
        sq8.m48649h(set, "contentUriTriggers");
        this.requiredNetworkType = networkType;
        this.requiresCharging = z;
        this.requiresDeviceIdle = z2;
        this.requiresBatteryNotLow = z3;
        this.requiresStorageNotLow = z4;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j2;
        this.contentUriTriggers = set;
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set, int i, id5 id5Var) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? -1L : j, (i & 64) == 0 ? j2 : -1L, (i & 128) != 0 ? nif.m40664e() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Constraints(Constraints constraints) {
        sq8.m48649h(constraints, "other");
        boolean z = constraints.requiresCharging;
        boolean z2 = constraints.requiresDeviceIdle;
        this(constraints.requiredNetworkType, z, z2, constraints.requiresBatteryNotLow, constraints.requiresStorageNotLow, constraints.contentTriggerUpdateDelayMillis, constraints.contentTriggerMaxDelayMillis, constraints.contentUriTriggers);
    }
}
