package ss;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.b */
/* loaded from: classes3.dex */
public final class C6913b {

    /* renamed from: a */
    public final boolean f33400a;

    /* renamed from: b */
    public final boolean f33401b;

    /* renamed from: c */
    public final Boolean f33402c;

    /* renamed from: d */
    public final String f33403d;

    /* renamed from: e */
    public final int f33404e;

    /* renamed from: f */
    public final Boolean f33405f;

    /* renamed from: g */
    public final boolean f33406g;

    /* renamed from: h */
    public final InterfaceC2137a f33407h;

    /* renamed from: i */
    public final InterfaceC2137a f33408i;

    /* renamed from: j */
    public final InterfaceC2137a f33409j;

    public C6913b(boolean z6, boolean z10, Boolean bool, String str, int i10, Boolean bool2, boolean z11, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, InterfaceC2137a interfaceC2137a3) {
        this.f33400a = z6;
        this.f33401b = z10;
        this.f33402c = bool;
        this.f33403d = str;
        this.f33404e = i10;
        this.f33405f = bool2;
        this.f33406g = z11;
        this.f33407h = interfaceC2137a;
        this.f33408i = interfaceC2137a2;
        this.f33409j = interfaceC2137a3;
    }

    /* renamed from: a */
    public static C6913b m13179a(C6913b c6913b, boolean z6, boolean z10, Boolean bool, String str, int i10, Boolean bool2, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            z6 = c6913b.f33400a;
        }
        boolean z12 = z6;
        if ((i11 & 2) != 0) {
            z10 = c6913b.f33401b;
        }
        boolean z13 = z10;
        if ((i11 & 4) != 0) {
            bool = c6913b.f33402c;
        }
        Boolean bool3 = bool;
        String str2 = (i11 & 8) != 0 ? c6913b.f33403d : str;
        int i12 = (i11 & 16) != 0 ? c6913b.f33404e : i10;
        Boolean bool4 = (i11 & 32) != 0 ? c6913b.f33405f : bool2;
        boolean z14 = (i11 & 64) != 0 ? c6913b.f33406g : z11;
        InterfaceC2137a interfaceC2137a = c6913b.f33407h;
        InterfaceC2137a interfaceC2137a2 = c6913b.f33408i;
        InterfaceC2137a interfaceC2137a3 = c6913b.f33409j;
        c6913b.getClass();
        return new C6913b(z12, z13, bool3, str2, i12, bool4, z14, interfaceC2137a, interfaceC2137a2, interfaceC2137a3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6913b)) {
            return false;
        }
        C6913b c6913b = (C6913b) obj;
        return this.f33400a == c6913b.f33400a && this.f33401b == c6913b.f33401b && AbstractC4154l.m8918a(this.f33402c, c6913b.f33402c) && AbstractC4154l.m8918a(this.f33403d, c6913b.f33403d) && this.f33404e == c6913b.f33404e && AbstractC4154l.m8918a(this.f33405f, c6913b.f33405f) && this.f33406g == c6913b.f33406g && AbstractC4154l.m8918a(this.f33407h, c6913b.f33407h) && AbstractC4154l.m8918a(this.f33408i, c6913b.f33408i) && AbstractC4154l.m8918a(this.f33409j, c6913b.f33409j);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(Boolean.hashCode(this.f33400a) * 31, 31, this.f33401b);
        Boolean bool = this.f33402c;
        int iHashCode = (iM4558e + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f33403d;
        int iM4556c = AbstractC1452a.m4556c(this.f33404e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Boolean bool2 = this.f33405f;
        return this.f33409j.hashCode() + ((this.f33408i.hashCode() + ((this.f33407h.hashCode() + AbstractC1452a.m4558e((iM4556c + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.f33406g)) * 31)) * 31);
    }

    public final String toString() {
        return "MainAppBarState(askForRecordingFolder=" + this.f33400a + ", showNoInternetLabel=" + this.f33401b + ", showSyncInProgress=" + this.f33402c + ", synNotAttemptedTime=" + this.f33403d + ", recordingSyncPendingCount=" + this.f33404e + ", showRecordingSyncInProgress=" + this.f33405f + ", isRecordingSubscription=" + this.f33406g + ", onFolderRecordingTap=" + this.f33407h + ", onFolderRecordingDismiss=" + this.f33408i + ", onRecordingReSyncClick=" + this.f33409j + ")";
    }
}
