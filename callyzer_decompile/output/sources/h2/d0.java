package h2;

import com.skydoves.balloon.internals.DefinitionKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public final Map f15693a;

    public d0(Map map) {
        this.f15693a = map;
    }

    /* renamed from: a */
    public final Object m6888a(float f6) {
        Object next;
        Iterator it = this.f15693a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f6 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f6 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* renamed from: b */
    public final Object m6889b(float f6, boolean z6) {
        Object next;
        Iterator it = this.f15693a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f10 = z6 ? fFloatValue - f6 : f6 - fFloatValue;
                if (f10 < DefinitionKt.NO_Float_VALUE) {
                    f10 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f11 = z6 ? fFloatValue2 - f6 : f6 - fFloatValue2;
                    if (f11 < DefinitionKt.NO_Float_VALUE) {
                        f11 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f10, f11) > 0) {
                        next = next2;
                        f10 = f11;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* renamed from: c */
    public final float m6890c() {
        Float fValueOf;
        Collection collectionValues = this.f15693a.values();
        AbstractC4154l.m8923f(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    /* renamed from: d */
    public final float m6891d(Object obj) {
        Float f6 = (Float) this.f15693a.get(obj);
        if (f6 != null) {
            return f6.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f15693a, ((d0) obj).f15693a);
    }

    public final int hashCode() {
        return this.f15693a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f15693a + ')';
    }
}
