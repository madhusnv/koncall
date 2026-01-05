package f1;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f1.a */
/* loaded from: classes.dex */
public abstract class AbstractC2176a {

    /* renamed from: a */
    public static final int[] f10048a = new int[0];

    /* renamed from: b */
    public static final long[] f10049b = new long[0];

    /* renamed from: c */
    public static final Object[] f10050c = new Object[0];

    /* renamed from: a */
    public static final int m5860a(int i10, int i11, int[] array) {
        AbstractC4154l.m8923f(array, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = array[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    /* renamed from: b */
    public static final int m5861b(long[] array, int i10, long j6) {
        AbstractC4154l.m8923f(array, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j10 = array[i13];
            if (j10 < j6) {
                i12 = i13 + 1;
            } else {
                if (j10 <= j6) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    /* renamed from: c */
    public static final void m5862c(String message) {
        AbstractC4154l.m8923f(message, "message");
        throw new IllegalArgumentException(message);
    }

    /* renamed from: d */
    public static final void m5863d(String message) {
        AbstractC4154l.m8923f(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    /* renamed from: e */
    public static final void m5864e(String message) {
        AbstractC4154l.m8923f(message, "message");
        throw new NoSuchElementException(message);
    }
}
