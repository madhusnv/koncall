package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class CallLogKey {
    public static final int $stable = 0;
    private final Long callConnectTime;
    private final Long callStartTime;
    private final String direction;
    private final String number;
    private final String source;

    public static final class Builder {
        public static final int $stable = 8;
        private Long callConnectTime;
        private Long callStartTime;
        private String direction;
        private String number;
        private String source;

        public final CallLogKey build() {
            return new CallLogKey(this.number, this.direction, this.callStartTime, this.callConnectTime, this.source, null);
        }

        public final Builder callConnectTime(Long l) {
            this.callConnectTime = l;
            return this;
        }

        public final Builder callStartTime(Long l) {
            this.callStartTime = l;
            return this;
        }

        public final Builder direction(String str) {
            this.direction = str;
            return this;
        }

        public final Builder number(String str) {
            this.number = str;
            return this;
        }

        public final Builder source(String str) {
            this.source = str;
            return this;
        }
    }

    public /* synthetic */ CallLogKey(String str, String str2, Long l, Long l2, String str3, id5 id5Var) {
        this(str, str2, l, l2, str3);
    }

    private final boolean isEqual(Long l, Long l2, String str, String str2, long j) {
        if (l == null) {
            return l2 == null;
        }
        if (l2 == null) {
            return false;
        }
        if (sq8.m48644c(l, l2)) {
            return true;
        }
        return !sq8.m48644c(str, str2) && Math.abs(l.longValue() - l2.longValue()) <= Math.abs(j);
    }

    public boolean equals(Object obj) {
        Long l;
        long jLongValue;
        long jLongValue2;
        if (this == obj) {
            return true;
        }
        if (!sq8.m48644c(CallLogKey.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type ai.salesmax.model.CallLogKey");
        CallLogKey callLogKey = (CallLogKey) obj;
        if (!sq8.m48644c(this.number, callLogKey.number) || !sq8.m48644c(this.direction, callLogKey.direction)) {
            return false;
        }
        long j = 3000;
        if (callLogKey.callConnectTime != null) {
            Long l2 = this.callStartTime;
            if (l2 != null) {
                jLongValue = l2.longValue();
                jLongValue2 = callLogKey.callConnectTime.longValue();
                j = jLongValue2 - jLongValue;
            }
        } else if (this.callConnectTime != null && (l = callLogKey.callStartTime) != null) {
            jLongValue = l.longValue();
            jLongValue2 = this.callConnectTime.longValue();
            j = jLongValue2 - jLongValue;
        }
        long j2 = j;
        Long l3 = this.callStartTime;
        Long l4 = callLogKey.callStartTime;
        String str = this.source;
        String str2 = str == null ? "" : str;
        String str3 = callLogKey.source;
        return isEqual(l3, l4, str2, str3 == null ? "" : str3, j2);
    }

    public final Long getCallConnectTime() {
        return this.callConnectTime;
    }

    public final Long getCallStartTime() {
        return this.callStartTime;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.number;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.direction;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CallLogKey(number=" + this.number + ", direction=" + this.direction + ", callStartTime=" + this.callStartTime + ", callConnectTime=" + this.callConnectTime + ", source=" + this.source + ")";
    }

    private CallLogKey(String str, String str2, Long l, Long l2, String str3) {
        this.number = str;
        this.direction = str2;
        this.callStartTime = l;
        this.callConnectTime = l2;
        this.source = str3;
    }

    public /* synthetic */ CallLogKey(String str, String str2, Long l, Long l2, String str3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : str3);
    }
}
