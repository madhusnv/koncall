package c8;

import android.database.Cursor;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import pg.a9;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c8.f */
/* loaded from: classes.dex */
public final class C0903f extends AbstractC0905h {

    /* renamed from: d */
    public int[] f5560d;

    /* renamed from: e */
    public long[] f5561e;

    /* renamed from: f */
    public double[] f5562f;

    /* renamed from: g */
    public String[] f5563g;

    /* renamed from: h */
    public byte[][] f5564h;

    /* renamed from: j */
    public Cursor f5565j;

    /* renamed from: u */
    public static void m2542u(Cursor cursor, int i10) {
        if (i10 < 0 || i10 >= cursor.getColumnCount()) {
            a9.m11540c(25, "column index out of range");
            throw null;
        }
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: B */
    public final void mo1776B(int i10, String value) {
        AbstractC4154l.m8923f(value, "value");
        m2545h();
        m2543j(3, i10);
        this.f5560d[i10] = 3;
        this.f5563g[i10] = value;
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: W */
    public final String mo1777W(int i10) {
        m2545h();
        Cursor cursor = this.f5565j;
        if (cursor == null) {
            a9.m11540c(21, "no row");
            throw null;
        }
        m2542u(cursor, i10);
        String string = cursor.getString(i10);
        AbstractC4154l.m8922e(string, "getString(...)");
        return string;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f5569c) {
            m2545h();
            this.f5560d = new int[0];
            this.f5561e = new long[0];
            this.f5562f = new double[0];
            this.f5563g = new String[0];
            this.f5564h = new byte[0][];
            reset();
        }
        this.f5569c = true;
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: g */
    public final void mo1778g(int i10, long j6) {
        m2545h();
        m2543j(1, i10);
        this.f5560d[i10] = 1;
        this.f5561e[i10] = j6;
    }

    @Override // k8.InterfaceC4026c
    public final int getColumnCount() {
        m2545h();
        m2544n();
        Cursor cursor = this.f5565j;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // k8.InterfaceC4026c
    public final String getColumnName(int i10) {
        m2545h();
        m2544n();
        Cursor cursor = this.f5565j;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        m2542u(cursor, i10);
        String columnName = cursor.getColumnName(i10);
        AbstractC4154l.m8922e(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // k8.InterfaceC4026c
    public final long getLong(int i10) {
        m2545h();
        Cursor cursor = this.f5565j;
        if (cursor != null) {
            m2542u(cursor, i10);
            return cursor.getLong(i10);
        }
        a9.m11540c(21, "no row");
        throw null;
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: i */
    public final void mo1779i(int i10) {
        m2545h();
        m2543j(5, i10);
        this.f5560d[i10] = 5;
    }

    @Override // k8.InterfaceC4026c
    public final boolean isNull(int i10) {
        m2545h();
        Cursor cursor = this.f5565j;
        if (cursor != null) {
            m2542u(cursor, i10);
            return cursor.isNull(i10);
        }
        a9.m11540c(21, "no row");
        throw null;
    }

    /* renamed from: j */
    public final void m2543j(int i10, int i11) {
        int i12 = i11 + 1;
        int[] iArr = this.f5560d;
        if (iArr.length < i12) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            AbstractC4154l.m8922e(iArrCopyOf, "copyOf(...)");
            this.f5560d = iArrCopyOf;
        }
        if (i10 == 1) {
            long[] jArr = this.f5561e;
            if (jArr.length < i12) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                AbstractC4154l.m8922e(jArrCopyOf, "copyOf(...)");
                this.f5561e = jArrCopyOf;
                return;
            }
            return;
        }
        if (i10 == 2) {
            double[] dArr = this.f5562f;
            if (dArr.length < i12) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                AbstractC4154l.m8922e(dArrCopyOf, "copyOf(...)");
                this.f5562f = dArrCopyOf;
                return;
            }
            return;
        }
        if (i10 == 3) {
            String[] strArr = this.f5563g;
            if (strArr.length < i12) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
                this.f5563g = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        byte[][] bArr = this.f5564h;
        if (bArr.length < i12) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
            AbstractC4154l.m8922e(objArrCopyOf2, "copyOf(...)");
            this.f5564h = (byte[][]) objArrCopyOf2;
        }
    }

    /* renamed from: n */
    public final void m2544n() {
        if (this.f5565j == null) {
            this.f5565j = this.f5567a.q0(new C8986c(6, this));
        }
    }

    @Override // k8.InterfaceC4026c
    public final boolean r0() {
        m2545h();
        m2544n();
        Cursor cursor = this.f5565j;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // k8.InterfaceC4026c
    public final void reset() {
        m2545h();
        Cursor cursor = this.f5565j;
        if (cursor != null) {
            cursor.close();
        }
        this.f5565j = null;
    }
}
