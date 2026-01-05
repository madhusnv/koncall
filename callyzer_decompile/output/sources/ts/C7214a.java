package ts;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ts.a */
/* loaded from: classes3.dex */
public final class C7214a {

    /* renamed from: a */
    public final boolean f34507a;

    /* renamed from: b */
    public final String f34508b;

    /* renamed from: c */
    public final boolean f34509c;

    /* renamed from: d */
    public final List f34510d;

    /* renamed from: e */
    public final boolean f34511e;

    /* renamed from: f */
    public final boolean f34512f;

    public C7214a(boolean z6, String str, boolean z10, List callRecordingpathSuggestions, boolean z11, boolean z12) {
        AbstractC4154l.m8923f(callRecordingpathSuggestions, "callRecordingpathSuggestions");
        this.f34507a = z6;
        this.f34508b = str;
        this.f34509c = z10;
        this.f34510d = callRecordingpathSuggestions;
        this.f34511e = z11;
        this.f34512f = z12;
    }

    /* renamed from: a */
    public static C7214a m13447a(C7214a c7214a, boolean z6, String str, boolean z10, List list, boolean z11, boolean z12, int i10) {
        if ((i10 & 1) != 0) {
            z6 = c7214a.f34507a;
        }
        boolean z13 = z6;
        if ((i10 & 2) != 0) {
            str = c7214a.f34508b;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            z10 = c7214a.f34509c;
        }
        boolean z14 = z10;
        if ((i10 & 8) != 0) {
            list = c7214a.f34510d;
        }
        List callRecordingpathSuggestions = list;
        if ((i10 & 16) != 0) {
            z11 = c7214a.f34511e;
        }
        boolean z15 = z11;
        if ((i10 & 32) != 0) {
            z12 = c7214a.f34512f;
        }
        c7214a.getClass();
        AbstractC4154l.m8923f(callRecordingpathSuggestions, "callRecordingpathSuggestions");
        return new C7214a(z13, str2, z14, callRecordingpathSuggestions, z15, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7214a)) {
            return false;
        }
        C7214a c7214a = (C7214a) obj;
        return this.f34507a == c7214a.f34507a && AbstractC4154l.m8918a(this.f34508b, c7214a.f34508b) && this.f34509c == c7214a.f34509c && AbstractC4154l.m8918a(this.f34510d, c7214a.f34510d) && this.f34511e == c7214a.f34511e && this.f34512f == c7214a.f34512f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f34507a) * 31;
        String str = this.f34508b;
        return Boolean.hashCode(this.f34512f) + AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f34510d, AbstractC1452a.m4558e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f34509c), 31), 31, this.f34511e);
    }

    public final String toString() {
        return "CallRecordingPathsState(showErrorBottomSheet=" + this.f34507a + ", bottomSheetErrorMessage=" + this.f34508b + ", isInternetConnected=" + this.f34509c + ", callRecordingpathSuggestions=" + this.f34510d + ", isPathListLoading=" + this.f34511e + ", showRecordingPathsBottomSheet=" + this.f34512f + ")";
    }
}
