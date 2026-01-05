package t8;

import android.net.NetworkRequest;
import d9.C1664i;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6670t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.e */
/* loaded from: classes.dex */
public final class C7059e {

    /* renamed from: j */
    public static final C7059e f34128j = new C7059e();

    /* renamed from: a */
    public final EnumC7078x f34129a;

    /* renamed from: b */
    public final C1664i f34130b;

    /* renamed from: c */
    public final boolean f34131c;

    /* renamed from: d */
    public final boolean f34132d;

    /* renamed from: e */
    public final boolean f34133e;

    /* renamed from: f */
    public final boolean f34134f;

    /* renamed from: g */
    public final long f34135g;

    /* renamed from: h */
    public final long f34136h;

    /* renamed from: i */
    public final Set f34137i;

    public C7059e() {
        EnumC7078x requiredNetworkType = EnumC7078x.NOT_REQUIRED;
        AbstractC4154l.m8923f(requiredNetworkType, "requiredNetworkType");
        this.f34130b = new C1664i(null);
        this.f34129a = requiredNetworkType;
        this.f34131c = false;
        this.f34132d = false;
        this.f34133e = false;
        this.f34134f = false;
        this.f34135g = -1L;
        this.f34136h = -1L;
        this.f34137i = C6670t.f31945a;
    }

    /* renamed from: a */
    public final NetworkRequest m13351a() {
        return (NetworkRequest) this.f34130b.f8187a;
    }

    /* renamed from: b */
    public final boolean m13352b() {
        return !this.f34137i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C7059e.class.equals(obj.getClass())) {
            return false;
        }
        C7059e c7059e = (C7059e) obj;
        if (this.f34131c == c7059e.f34131c && this.f34132d == c7059e.f34132d && this.f34133e == c7059e.f34133e && this.f34134f == c7059e.f34134f && this.f34135g == c7059e.f34135g && this.f34136h == c7059e.f34136h && AbstractC4154l.m8918a(m13351a(), c7059e.m13351a()) && this.f34129a == c7059e.f34129a) {
            return AbstractC4154l.m8918a(this.f34137i, c7059e.f34137i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f34129a.hashCode() * 31) + (this.f34131c ? 1 : 0)) * 31) + (this.f34132d ? 1 : 0)) * 31) + (this.f34133e ? 1 : 0)) * 31) + (this.f34134f ? 1 : 0)) * 31;
        long j6 = this.f34135g;
        int i10 = (iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j10 = this.f34136h;
        int iHashCode2 = (this.f34137i.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestM13351a = m13351a();
        return iHashCode2 + (networkRequestM13351a != null ? networkRequestM13351a.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f34129a + ", requiresCharging=" + this.f34131c + ", requiresDeviceIdle=" + this.f34132d + ", requiresBatteryNotLow=" + this.f34133e + ", requiresStorageNotLow=" + this.f34134f + ", contentTriggerUpdateDelayMillis=" + this.f34135g + ", contentTriggerMaxDelayMillis=" + this.f34136h + ", contentUriTriggers=" + this.f34137i + ", }";
    }

    public C7059e(C1664i c1664i, EnumC7078x requiredNetworkType, boolean z6, boolean z10, boolean z11, boolean z12, long j6, long j10, Set set) {
        AbstractC4154l.m8923f(requiredNetworkType, "requiredNetworkType");
        this.f34130b = c1664i;
        this.f34129a = requiredNetworkType;
        this.f34131c = z6;
        this.f34132d = z10;
        this.f34133e = z11;
        this.f34134f = z12;
        this.f34135g = j6;
        this.f34136h = j10;
        this.f34137i = set;
    }

    public C7059e(C7059e other) {
        AbstractC4154l.m8923f(other, "other");
        this.f34131c = other.f34131c;
        this.f34132d = other.f34132d;
        this.f34130b = other.f34130b;
        this.f34129a = other.f34129a;
        this.f34133e = other.f34133e;
        this.f34134f = other.f34134f;
        this.f34137i = other.f34137i;
        this.f34135g = other.f34135g;
        this.f34136h = other.f34136h;
    }
}
