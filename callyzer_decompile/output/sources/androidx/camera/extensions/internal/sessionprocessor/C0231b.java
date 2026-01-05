package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.camera.extensions.internal.sessionprocessor.b */
/* loaded from: classes.dex */
public final class C0231b {

    /* renamed from: a */
    public final Object f1862a = new Object();

    /* renamed from: b */
    public final LongSparseArray f1863b = new LongSparseArray();

    /* renamed from: c */
    public final HashMap f1864c = new HashMap();

    /* renamed from: d */
    public final LongSparseArray f1865d = new LongSparseArray();

    /* renamed from: a */
    public final void m616a(TotalCaptureResult totalCaptureResult, int i10) {
        synchronized (this.f1862a) {
            try {
                Long l9 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                long jLongValue = l9 != null ? l9.longValue() : -1L;
                if (jLongValue == -1) {
                    return;
                }
                LongSparseArray longSparseArray = this.f1863b;
                List arrayList = (List) longSparseArray.get(jLongValue);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    longSparseArray.put(jLongValue, arrayList);
                }
                arrayList.add(totalCaptureResult);
                this.f1864c.put(totalCaptureResult, Integer.valueOf(i10));
                synchronized (this.f1862a) {
                    try {
                        int size = this.f1863b.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            List list = (List) this.f1863b.valueAt(size);
                            if (!list.isEmpty()) {
                                TotalCaptureResult totalCaptureResult2 = (TotalCaptureResult) list.get(0);
                                Long l10 = (Long) totalCaptureResult2.get(CaptureResult.SENSOR_TIMESTAMP);
                                long jLongValue2 = l10 != null ? l10.longValue() : -1L;
                                y0.m11056f(null, jLongValue2 == this.f1863b.keyAt(size));
                                List list2 = (List) this.f1865d.get(jLongValue2);
                                if (list2 != null && !list2.isEmpty()) {
                                    if (list2.get(0) != null) {
                                        throw new ClassCastException();
                                    }
                                    LongSparseArray longSparseArray2 = this.f1865d;
                                    List list3 = (List) longSparseArray2.get(jLongValue2);
                                    if (list3 != null) {
                                        list3.remove((Object) null);
                                        if (list3.isEmpty()) {
                                            longSparseArray2.remove(jLongValue2);
                                        }
                                    }
                                    list.remove(totalCaptureResult2);
                                    if (list.isEmpty()) {
                                        this.f1863b.removeAt(size);
                                    }
                                }
                            }
                            size--;
                        }
                        m619d();
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final void m617b() {
        synchronized (this.f1862a) {
            try {
                this.f1863b.clear();
                for (int i10 = 0; i10 < this.f1865d.size(); i10++) {
                    Iterator it = ((List) this.f1865d.get(this.f1865d.keyAt(i10))).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                this.f1865d.clear();
                this.f1864c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m618c() {
        synchronized (this.f1862a) {
            throw null;
        }
    }

    /* renamed from: d */
    public final void m619d() {
        synchronized (this.f1862a) {
            try {
                if (this.f1865d.size() != 0 && this.f1863b.size() != 0) {
                    long jKeyAt = this.f1865d.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f1863b.keyAt(0);
                    y0.m11052b(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f1865d.size() - 1; size >= 0; size--) {
                            if (this.f1865d.keyAt(size) < jKeyAt2) {
                                Iterator it = ((List) this.f1865d.valueAt(size)).iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                                this.f1865d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f1863b.size() - 1; size2 >= 0; size2--) {
                            if (this.f1863b.keyAt(size2) < jKeyAt) {
                                this.f1863b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
