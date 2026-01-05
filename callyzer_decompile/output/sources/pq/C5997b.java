package pq;

import android.net.Uri;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pq.b */
/* loaded from: classes3.dex */
public final class C5997b {

    /* renamed from: a */
    public final Uri f29314a;

    /* renamed from: b */
    public final boolean f29315b;

    /* renamed from: c */
    public final int f29316c;

    /* renamed from: d */
    public final boolean f29317d;

    /* renamed from: e */
    public final List f29318e;

    /* renamed from: f */
    public final Map f29319f;

    /* renamed from: g */
    public final String f29320g;

    public C5997b(Uri uri, boolean z6, int i10, boolean z10, List recommendedCallLogs, Map map, String str) {
        AbstractC4154l.m8923f(recommendedCallLogs, "recommendedCallLogs");
        this.f29314a = uri;
        this.f29315b = z6;
        this.f29316c = i10;
        this.f29317d = z10;
        this.f29318e = recommendedCallLogs;
        this.f29319f = map;
        this.f29320g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map] */
    /* renamed from: a */
    public static C5997b m12030a(C5997b c5997b, Uri uri, int i10, ArrayList arrayList, LinkedHashMap linkedHashMap, String str, int i11) {
        if ((i11 & 1) != 0) {
            uri = c5997b.f29314a;
        }
        Uri uri2 = uri;
        boolean z6 = (i11 & 2) != 0 ? c5997b.f29315b : false;
        if ((i11 & 4) != 0) {
            i10 = c5997b.f29316c;
        }
        int i12 = i10;
        boolean z10 = (i11 & 8) != 0 ? c5997b.f29317d : true;
        ArrayList arrayList2 = arrayList;
        if ((i11 & 16) != 0) {
            arrayList2 = c5997b.f29318e;
        }
        ArrayList recommendedCallLogs = arrayList2;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if ((i11 & 32) != 0) {
            linkedHashMap2 = c5997b.f29319f;
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        if ((i11 & 64) != 0) {
            str = c5997b.f29320g;
        }
        c5997b.getClass();
        AbstractC4154l.m8923f(recommendedCallLogs, "recommendedCallLogs");
        return new C5997b(uri2, z6, i12, z10, recommendedCallLogs, linkedHashMap3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5997b)) {
            return false;
        }
        C5997b c5997b = (C5997b) obj;
        return AbstractC4154l.m8918a(this.f29314a, c5997b.f29314a) && this.f29315b == c5997b.f29315b && this.f29316c == c5997b.f29316c && this.f29317d == c5997b.f29317d && AbstractC4154l.m8918a(this.f29318e, c5997b.f29318e) && AbstractC4154l.m8918a(this.f29319f, c5997b.f29319f) && AbstractC4154l.m8918a(this.f29320g, c5997b.f29320g);
    }

    public final int hashCode() {
        Uri uri = this.f29314a;
        int iM4559f = AbstractC1452a.m4559f(this.f29318e, AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f29316c, AbstractC1452a.m4558e((uri == null ? 0 : uri.hashCode()) * 31, 31, this.f29315b), 31), 31, this.f29317d), 31);
        Map map = this.f29319f;
        int iHashCode = (iM4559f + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f29320g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecordingAttachUiState(uri=");
        sb2.append(this.f29314a);
        sb2.append(", isLoading=");
        sb2.append(this.f29315b);
        sb2.append(", selectedCallLogId=");
        sb2.append(this.f29316c);
        sb2.append(", isDoneVisible=");
        sb2.append(this.f29317d);
        sb2.append(", recommendedCallLogs=");
        sb2.append(this.f29318e);
        sb2.append(", allAvailableCallLogs=");
        sb2.append(this.f29319f);
        sb2.append(", error=");
        return AbstractC1452a.m4564k(sb2, this.f29320g, ")");
    }
}
