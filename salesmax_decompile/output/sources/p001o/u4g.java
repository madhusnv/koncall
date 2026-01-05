package p001o;

import ai.salesmax.model.CallStateEvent;
import android.telephony.TelephonyManager;
import com.amplifyframework.datastore.generated.model.CallDirection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class u4g {

    /* renamed from: a */
    public static final u4g f48330a = new u4g();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.u4g$a */
    public static final class EnumC17295a {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ EnumC17295a[] $VALUES;
        public static final EnumC17295a RINGING = new EnumC17295a("RINGING", 0);
        public static final EnumC17295a CONNECTED = new EnumC17295a("CONNECTED", 1);
        public static final EnumC17295a COMPLETED = new EnumC17295a("COMPLETED", 2);

        private static final /* synthetic */ EnumC17295a[] $values() {
            return new EnumC17295a[]{RINGING, CONNECTED, COMPLETED};
        }

        static {
            EnumC17295a[] enumC17295aArr$values = $values();
            $VALUES = enumC17295aArr$values;
            $ENTRIES = hi6.m30609a(enumC17295aArr$values);
        }

        private EnumC17295a(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static EnumC17295a valueOf(String str) {
            return (EnumC17295a) Enum.valueOf(EnumC17295a.class, str);
        }

        public static EnumC17295a[] values() {
            return (EnumC17295a[]) $VALUES.clone();
        }
    }

    /* renamed from: o.u4g$b */
    public static final class C17296b {

        /* renamed from: a */
        public CallDirection f48331a;

        /* renamed from: b */
        public Long f48332b;

        public C17296b(CallDirection callDirection, Long l) {
            sq8.m48649h(callDirection, "direction");
            this.f48331a = callDirection;
            this.f48332b = l;
        }

        /* renamed from: a */
        public final Long m50945a() {
            return this.f48332b;
        }

        /* renamed from: b */
        public final CallDirection m50946b() {
            return this.f48331a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17296b)) {
                return false;
            }
            C17296b c17296b = (C17296b) obj;
            return this.f48331a == c17296b.f48331a && sq8.m48644c(this.f48332b, c17296b.f48332b);
        }

        public int hashCode() {
            int iHashCode = this.f48331a.hashCode() * 31;
            Long l = this.f48332b;
            return iHashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            return "Direction(direction=" + this.f48331a + ", callStartTime=" + this.f48332b + ")";
        }
    }

    /* renamed from: a */
    public final EnumC17295a m50941a(Set set) {
        Object obj = null;
        if (set != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (sq8.m48644c(((CallStateEvent) next).getState(), TelephonyManager.EXTRA_STATE_IDLE)) {
                    obj = next;
                    break;
                }
            }
            obj = (CallStateEvent) obj;
        }
        return obj != null ? EnumC17295a.COMPLETED : EnumC17295a.RINGING;
    }

    /* renamed from: b */
    public final boolean m50942b(Set set) {
        Object obj = null;
        if (set != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (sq8.m48644c(((CallStateEvent) next).getState(), TelephonyManager.EXTRA_STATE_IDLE)) {
                    obj = next;
                    break;
                }
            }
            obj = (CallStateEvent) obj;
        }
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final C17296b m50943c(Set set) {
        CallStateEvent callStateEvent;
        Object next;
        CallStateEvent callStateEvent2 = null;
        if (set != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (sq8.m48644c(((CallStateEvent) next).getState(), TelephonyManager.EXTRA_STATE_RINGING)) {
                    break;
                }
            }
            callStateEvent = (CallStateEvent) next;
        } else {
            callStateEvent = null;
        }
        if (callStateEvent != null) {
            return new C17296b(CallDirection.INCOMING, callStateEvent.getEventTime());
        }
        if (set != null) {
            Iterator it2 = set.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (sq8.m48644c(((CallStateEvent) next2).getState(), TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                    callStateEvent2 = next2;
                    break;
                }
            }
            callStateEvent2 = callStateEvent2;
        }
        return callStateEvent2 != null ? new C17296b(CallDirection.OUTGOING, callStateEvent2.getEventTime()) : new C17296b(CallDirection.OUTGOING, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: d */
    public final boolean m50944d(Set set, CallStateEvent callStateEvent) {
        sq8.m48649h(callStateEvent, "callStateEvent");
        Object obj = null;
        if (set != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (sq8.m48644c(((CallStateEvent) next).getState(), callStateEvent.getState())) {
                    obj = next;
                    break;
                }
            }
            obj = (CallStateEvent) obj;
        }
        return obj != null;
    }
}
