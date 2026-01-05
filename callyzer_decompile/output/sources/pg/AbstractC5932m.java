package pg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.m */
/* loaded from: classes.dex */
public abstract class AbstractC5932m {
    /* renamed from: a */
    public static final String m11773a(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' || cCharAt == '\\' || (cCharAt >= 0 && cCharAt < ' ')) {
                StringBuilder sb2 = new StringBuilder(str.length() + 1);
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 == '\"') {
                        sb2.append("\\\"");
                    } else if (cCharAt2 == '\\') {
                        sb2.append("\\\\");
                    } else if (cCharAt2 == '\n') {
                        sb2.append("\\n");
                    } else if (cCharAt2 == '\r') {
                        sb2.append("\\r");
                    } else if (cCharAt2 == '\t') {
                        sb2.append("\\t");
                    } else if (cCharAt2 == '\b') {
                        sb2.append("\\b");
                    } else if (cCharAt2 == '\f') {
                        sb2.append("\\f");
                    } else if (cCharAt2 < 0 || cCharAt2 >= ' ') {
                        sb2.append(cCharAt2);
                    } else {
                        og.d2.m10599b(16);
                        String string = Integer.toString(cCharAt2, 16);
                        AbstractC4154l.m8922e(string, "toString(...)");
                        sb2.append("\\u");
                        sb2.append(AbstractC5178p.m10105P(4, string));
                    }
                }
                return sb2.toString();
            }
        }
        return str;
    }

    /* renamed from: b */
    public static void m11774b(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM11783k = m11783k(parcel, i10);
        parcel.writeBundle(bundle);
        m11784l(parcel, iM11783k);
    }

    /* renamed from: c */
    public static void m11775c(Parcel parcel, int i10, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iM11783k = m11783k(parcel, i10);
        parcel.writeByteArray(bArr);
        m11784l(parcel, iM11783k);
    }

    /* renamed from: d */
    public static void m11776d(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM11783k = m11783k(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        m11784l(parcel, iM11783k);
    }

    /* renamed from: e */
    public static void m11777e(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int iM11783k = m11783k(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        m11784l(parcel, iM11783k);
    }

    /* renamed from: f */
    public static void m11778f(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int iM11783k = m11783k(parcel, i10);
        parcel.writeString(str);
        m11784l(parcel, iM11783k);
    }

    /* renamed from: g */
    public static void m11779g(Parcel parcel, int i10, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iM11783k = m11783k(parcel, i10);
        parcel.writeStringArray(strArr);
        m11784l(parcel, iM11783k);
    }

    /* renamed from: h */
    public static void m11780h(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iM11783k = m11783k(parcel, i10);
        parcel.writeStringList(list);
        m11784l(parcel, iM11783k);
    }

    /* renamed from: i */
    public static void m11781i(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iM11783k = m11783k(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m11784l(parcel, iM11783k);
    }

    /* renamed from: j */
    public static void m11782j(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iM11783k = m11783k(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m11784l(parcel, iM11783k);
    }

    /* renamed from: k */
    public static int m11783k(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: l */
    public static void m11784l(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    /* renamed from: m */
    public static void m11785m(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }
}
