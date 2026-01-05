package pg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.sun.mail.util.AbstractC1452a;
import hc.C2888k;
import java.io.File;
import java.util.ArrayList;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.l */
/* loaded from: classes.dex */
public abstract class AbstractC5931l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11736a(java.io.File r4, wc.InterfaceC7989w r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof hc.C2881d
            if (r0 == 0) goto L13
            r0 = r6
            hc.d r0 = (hc.C2881d) r0
            int r1 = r0.f15908c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15908c = r1
            goto L18
        L13:
            hc.d r0 = new hc.d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15907b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f15908c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            wc.d0 r4 = r0.f15906a
            og.od.m10798c(r6)     // Catch: java.lang.Throwable -> L29
            goto L4f
        L29:
            r5 = move-exception
            goto L5f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            og.od.m10798c(r6)
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r4, r6)
            r6 = 0
            b00.d r4 = b00.AbstractC0517b.m1527f(r4, r6)
            wc.d0 r4 = pg.r7.m11852c(r4)
            r0.f15906a = r4     // Catch: java.lang.Throwable -> L29
            r0.f15908c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = wc.AbstractC7984r.m15161e(r5, r4, r0)     // Catch: java.lang.Throwable -> L29
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L29
            long r5 = r6.longValue()     // Catch: java.lang.Throwable -> L29
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Throwable -> L29
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L29
            r5 = 0
            og.q1.m10844a(r4, r5)
            return r0
        L5f:
            throw r5     // Catch: java.lang.Throwable -> L60
        L60:
            r6 = move-exception
            og.q1.m10844a(r4, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.AbstractC5931l.m11736a(java.io.File, wc.w, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final C2888k m11737b(File file, long j6, long j10) {
        if (j6 < 0) {
            throw new IllegalArgumentException(("start index " + j6 + " cannot be negative").toString());
        }
        long j11 = j6 - 1;
        if (j10 < j11) {
            throw new IllegalArgumentException(("end index " + j10 + " must be greater than or equal to start index minus one (" + j11 + ')').toString());
        }
        long length = file.length();
        if (j10 < length) {
            return new C2888k(file, j6, j10);
        }
        throw new IllegalArgumentException(("end index " + j10 + " must be less than file size " + length).toString());
    }

    /* renamed from: c */
    public static Bundle m11738c(Parcel parcel, int i10) {
        int iM11752q = m11752q(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM11752q == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM11752q);
        return bundle;
    }

    /* renamed from: d */
    public static byte[] m11739d(Parcel parcel, int i10) {
        int iM11752q = m11752q(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM11752q == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM11752q);
        return bArrCreateByteArray;
    }

    /* renamed from: e */
    public static Parcelable m11740e(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iM11752q = m11752q(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM11752q == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM11752q);
        return parcelable;
    }

    /* renamed from: f */
    public static String m11741f(Parcel parcel, int i10) {
        int iM11752q = m11752q(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM11752q == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM11752q);
        return string;
    }

    /* renamed from: g */
    public static String[] m11742g(Parcel parcel, int i10) {
        int iM11752q = m11752q(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM11752q == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM11752q);
        return strArrCreateStringArray;
    }

    /* renamed from: h */
    public static ArrayList m11743h(Parcel parcel, int i10) {
        int iM11752q = m11752q(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM11752q == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM11752q);
        return arrayListCreateStringArrayList;
    }

    /* renamed from: i */
    public static Object[] m11744i(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iM11752q = m11752q(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM11752q == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM11752q);
        return objArrCreateTypedArray;
    }

    /* renamed from: j */
    public static ArrayList m11745j(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iM11752q = m11752q(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM11752q == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM11752q);
        return arrayListCreateTypedArrayList;
    }

    /* renamed from: k */
    public static void m11746k(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new SafeParcelReader$ParseException(AbstractC4801l.m9730d(i10, "Overread allowed size end="), parcel);
        }
    }

    /* renamed from: l */
    public static boolean m11747l(Parcel parcel, int i10) {
        m11756u(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: m */
    public static double m11748m(Parcel parcel, int i10) {
        m11756u(parcel, i10, 8);
        return parcel.readDouble();
    }

    /* renamed from: n */
    public static IBinder m11749n(Parcel parcel, int i10) {
        int iM11752q = m11752q(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM11752q == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM11752q);
        return strongBinder;
    }

    /* renamed from: o */
    public static int m11750o(Parcel parcel, int i10) {
        m11756u(parcel, i10, 4);
        return parcel.readInt();
    }

    /* renamed from: p */
    public static long m11751p(Parcel parcel, int i10) {
        m11756u(parcel, i10, 8);
        return parcel.readLong();
    }

    /* renamed from: q */
    public static int m11752q(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    /* renamed from: r */
    public static void m11753r(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m11752q(parcel, i10));
    }

    /* renamed from: s */
    public static int m11754s(Parcel parcel) {
        int i10 = parcel.readInt();
        int iM11752q = m11752q(parcel, i10);
        char c2 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iM11752q + iDataPosition;
        if (i11 < iDataPosition || i11 > parcel.dataSize()) {
            throw new SafeParcelReader$ParseException(AbstractC5601a.m11235f("Size read is invalid start=", iDataPosition, i11, " end="), parcel);
        }
        return i11;
    }

    /* renamed from: t */
    public static void m11755t(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        throw new SafeParcelReader$ParseException(AbstractC1452a.m4564k(AbstractC1452a.m4566m(i11, i10, "Expected size ", " got ", " (0x"), Integer.toHexString(i10), ")"), parcel);
    }

    /* renamed from: u */
    public static void m11756u(Parcel parcel, int i10, int i11) {
        int iM11752q = m11752q(parcel, i10);
        if (iM11752q == i11) {
            return;
        }
        throw new SafeParcelReader$ParseException(AbstractC1452a.m4564k(AbstractC1452a.m4566m(i11, iM11752q, "Expected size ", " got ", " (0x"), Integer.toHexString(iM11752q), ")"), parcel);
    }
}
