package ai.salesmax.model;

import android.content.Context;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class CallStateEvent {
    private final Context context;
    private final Long eventTime;
    private final String number;
    private final String state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Builder {
        public static final int $stable = 8;
        private Context context;
        private Long eventTime;
        private String number;
        private String state;

        public final CallStateEvent build() {
            return new CallStateEvent(this.state, this.number, this.eventTime, this.context, null);
        }

        public final Builder context(Context context) {
            this.context = context;
            return this;
        }

        public final Builder eventTime(Long l) {
            this.eventTime = l;
            return this;
        }

        public final Builder number(String str) {
            this.number = str;
            return this;
        }

        public final Builder state(String str) {
            this.state = str;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }
    }

    public /* synthetic */ CallStateEvent(String str, String str2, Long l, Context context, id5 id5Var) {
        this(str, str2, l, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sq8.m48644c(CallStateEvent.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type ai.salesmax.model.CallStateEvent");
        CallStateEvent callStateEvent = (CallStateEvent) obj;
        return sq8.m48644c(this.state, callStateEvent.state) && sq8.m48644c(this.number, callStateEvent.number) && sq8.m48644c(this.eventTime, callStateEvent.eventTime);
    }

    public final Context getContext() {
        return this.context;
    }

    public final Long getEventTime() {
        return this.eventTime;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.state;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.number;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.eventTime;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "CallStateEvent(state=" + this.state + ", number=" + this.number + ", eventTime=" + this.eventTime + ")";
    }

    private CallStateEvent(String str, String str2, Long l, Context context) {
        this.state = str;
        this.number = str2;
        this.eventTime = l;
        this.context = context;
    }
}
