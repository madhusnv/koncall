package p001o;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class jmb {

    /* renamed from: a */
    public long f30731a;

    /* renamed from: b */
    public final SparseLongArray f30732b = new SparseLongArray();

    /* renamed from: c */
    public final SparseBooleanArray f30733c = new SparseBooleanArray();

    /* renamed from: d */
    public final List f30734d = new ArrayList();

    /* renamed from: e */
    public int f30735e = -1;

    /* renamed from: f */
    public int f30736f = -1;

    /* renamed from: a */
    public final void m34081a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f30732b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f30732b;
                long j = this.f30731a;
                this.f30731a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f30732b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f30732b;
            long j2 = this.f30731a;
            this.f30731a = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f30733c.put(pointerId2, true);
            }
        }
    }

    /* renamed from: b */
    public final void m34082b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f30735e && source == this.f30736f) {
            return;
        }
        this.f30735e = toolType;
        this.f30736f = source;
        this.f30733c.clear();
        this.f30732b.clear();
    }

    /* renamed from: c */
    public final xcd m34083c(MotionEvent motionEvent, ted tedVar) {
        sq8.m48649h(motionEvent, "motionEvent");
        sq8.m48649h(tedVar, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f30732b.clear();
            this.f30733c.clear();
            return null;
        }
        m34082b(motionEvent);
        m34081a(motionEvent);
        boolean z = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.f30733c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.f30734d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.f30734d.add(m34084d(tedVar, motionEvent, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
            i++;
        }
        m34088h(motionEvent);
        return new xcd(motionEvent.getEventTime(), this.f30734d, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ycd m34084d(ted tedVar, MotionEvent motionEvent, int i, boolean z) {
        long j;
        long jMo5072p;
        long jM40789a;
        long jMo5069l;
        int historySize;
        int i2;
        long jM34086f = m34086f(motionEvent.getPointerId(i));
        float pressure = motionEvent.getPressure(i);
        long jM52474a = v9c.m52474a(motionEvent.getX(i), motionEvent.getY(i));
        if (i == 0) {
            jM40789a = v9c.m52474a(motionEvent.getRawX(), motionEvent.getRawY());
            jMo5069l = tedVar.mo5069l(jM40789a);
        } else {
            if (Build.VERSION.SDK_INT < 29) {
                j = jM52474a;
                jMo5072p = tedVar.mo5072p(jM52474a);
                int toolType = motionEvent.getToolType(i);
                int iM24813e = toolType == 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? edd.f21438a.m24813e() : edd.f21438a.m24809a() : edd.f21438a.m24810b() : edd.f21438a.m24811c() : edd.f21438a.m24812d() : edd.f21438a.m24813e();
                ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                for (i2 = 0; i2 < historySize; i2++) {
                    float historicalX = motionEvent.getHistoricalX(i, i2);
                    float historicalY = motionEvent.getHistoricalY(i, i2);
                    if ((Float.isInfinite(historicalX) || Float.isNaN(historicalX)) ? false : true) {
                        if ((Float.isInfinite(historicalY) || Float.isNaN(historicalY)) ? false : true) {
                            arrayList.add(new sy7(motionEvent.getHistoricalEventTime(i2), v9c.m52474a(historicalX, historicalY), null));
                        }
                    }
                }
                return new ycd(jM34086f, motionEvent.getEventTime(), jMo5072p, j, z, pressure, iM24813e, this.f30733c.get(motionEvent.getPointerId(i), false), arrayList, motionEvent.getActionMasked() != 8 ? v9c.m52474a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : s9c.f45035b.m48063c(), null);
            }
            jM40789a = nmb.f37044a.m40789a(motionEvent, i);
            jMo5069l = tedVar.mo5069l(jM40789a);
        }
        jMo5072p = jM40789a;
        j = jMo5069l;
        int toolType2 = motionEvent.getToolType(i);
        int iM24813e2 = toolType2 == 0 ? toolType2 != 1 ? toolType2 != 2 ? toolType2 != 3 ? toolType2 != 4 ? edd.f21438a.m24813e() : edd.f21438a.m24809a() : edd.f21438a.m24810b() : edd.f21438a.m24811c() : edd.f21438a.m24812d() : edd.f21438a.m24813e();
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        while (i2 < historySize) {
        }
        return new ycd(jM34086f, motionEvent.getEventTime(), jMo5072p, j, z, pressure, iM24813e2, this.f30733c.get(motionEvent.getPointerId(i), false), arrayList2, motionEvent.getActionMasked() != 8 ? v9c.m52474a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : s9c.f45035b.m48063c(), null);
    }

    /* renamed from: e */
    public final void m34085e(int i) {
        this.f30733c.delete(i);
        this.f30732b.delete(i);
    }

    /* renamed from: f */
    public final long m34086f(int i) {
        long jValueAt;
        int iIndexOfKey = this.f30732b.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f30732b.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.f30731a;
            this.f30731a = 1 + jValueAt;
            this.f30732b.put(i, jValueAt);
        }
        return ucd.m51364b(jValueAt);
    }

    /* renamed from: g */
    public final boolean m34087g(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m34088h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f30733c.get(pointerId, false)) {
                this.f30732b.delete(pointerId);
                this.f30733c.delete(pointerId);
            }
        }
        if (this.f30732b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f30732b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f30732b.keyAt(size);
                if (!m34087g(motionEvent, iKeyAt)) {
                    this.f30732b.removeAt(size);
                    this.f30733c.delete(iKeyAt);
                }
            }
        }
    }
}
