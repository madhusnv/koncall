package lq;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4184n;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lq.b */
/* loaded from: classes3.dex */
public final class C4507b {

    /* renamed from: a */
    public final boolean f22419a;

    /* renamed from: b */
    public final List f22420b;

    /* renamed from: c */
    public final Map f22421c;

    /* renamed from: d */
    public final boolean f22422d;

    /* renamed from: e */
    public final boolean f22423e;

    /* renamed from: f */
    public final int f22424f;

    /* renamed from: g */
    public final C4184n f22425g;

    /* renamed from: h */
    public final String f22426h;

    /* renamed from: i */
    public final C6361k f22427i;

    public C4507b(boolean z6, List list, Map map, boolean z10, boolean z11, int i10, C4184n c4184n, String str, C6361k c6361k) {
        this.f22419a = z6;
        this.f22420b = list;
        this.f22421c = map;
        this.f22422d = z10;
        this.f22423e = z11;
        this.f22424f = i10;
        this.f22425g = c4184n;
        this.f22426h = str;
        this.f22427i = c6361k;
    }

    /* renamed from: a */
    public static C4507b m9340a(C4507b c4507b, boolean z6, List list, Map map, boolean z10, boolean z11, int i10, C4184n c4184n, String str, C6361k c6361k, int i11) {
        if ((i11 & 1) != 0) {
            z6 = c4507b.f22419a;
        }
        boolean z12 = z6;
        if ((i11 & 2) != 0) {
            list = c4507b.f22420b;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            map = c4507b.f22421c;
        }
        Map map2 = map;
        c4507b.getClass();
        if ((i11 & 16) != 0) {
            z10 = c4507b.f22422d;
        }
        boolean z13 = z10;
        if ((i11 & 32) != 0) {
            z11 = c4507b.f22423e;
        }
        boolean z14 = z11;
        int i12 = (i11 & 64) != 0 ? c4507b.f22424f : i10;
        C4184n c4184n2 = (i11 & 128) != 0 ? c4507b.f22425g : c4184n;
        String str2 = (i11 & 256) != 0 ? c4507b.f22426h : str;
        c4507b.getClass();
        C6361k c6361k2 = (i11 & 1024) != 0 ? c4507b.f22427i : c6361k;
        c4507b.getClass();
        return new C4507b(z12, list2, map2, z13, z14, i12, c4184n2, str2, c6361k2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4507b)) {
            return false;
        }
        C4507b c4507b = (C4507b) obj;
        return this.f22419a == c4507b.f22419a && this.f22420b.equals(c4507b.f22420b) && this.f22421c.equals(c4507b.f22421c) && this.f22422d == c4507b.f22422d && this.f22423e == c4507b.f22423e && this.f22424f == c4507b.f22424f && this.f22425g.equals(c4507b.f22425g) && AbstractC4154l.m8918a(this.f22426h, c4507b.f22426h) && AbstractC4154l.m8918a(this.f22427i, c4507b.f22427i);
    }

    public final int hashCode() {
        int iHashCode = (this.f22425g.hashCode() + AbstractC1452a.m4556c(this.f22424f, AbstractC1452a.m4558e(AbstractC1452a.m4558e(m0.m7369b(AbstractC1452a.m4559f(this.f22420b, Boolean.hashCode(this.f22419a) * 31, 31), 961, this.f22421c), 31, this.f22422d), 31, this.f22423e), 31)) * 31;
        String str = this.f22426h;
        int iM4556c = AbstractC1452a.m4556c(0, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        C6361k c6361k = this.f22427i;
        return iM4556c + (c6361k != null ? c6361k.hashCode() : 0);
    }

    public final String toString() {
        return "CallLogHistoryState(isLoading=" + this.f22419a + ", callHistoryUiModels=" + this.f22420b + ", callHistoryMap=" + this.f22421c + ", searchText=null, isData=" + this.f22422d + ", endReached=" + this.f22423e + ", totalFetchedCallHistory=" + this.f22424f + ", downloadDialogState=" + this.f22425g + ", error=" + this.f22426h + ", notVerifiedCallsCount=0, recordingClicked=" + this.f22427i + ")";
    }
}
