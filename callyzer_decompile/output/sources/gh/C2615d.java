package gh;

import android.util.Rational;
import ap.C0390c;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import d4.C1589q;
import j$.time.LocalDateTime;
import java.util.Comparator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5405g;
import pg.AbstractC5939t;
import rt.C6620d;
import sr.C6911b;
import v3.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gh.d */
/* loaded from: classes.dex */
public final class C2615d implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f14174a;

    /* renamed from: b */
    public final Object f14175b;

    public /* synthetic */ C2615d(int i10, Object obj) {
        this.f14174a = i10;
        this.f14175b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14174a) {
            case 0:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f14175b;
                int iCompareTo = Boolean.valueOf(materialButton.f6794p).compareTo(Boolean.valueOf(materialButton2.f6794p));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            case 1:
                int iCompare = ((C0390c) this.f14175b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                C5405g c5405g = (C5405g) obj2;
                LocalDateTime localDateTime = c5405g.f27134e;
                if (localDateTime == null) {
                    localDateTime = c5405g.f27135f;
                }
                C5405g c5405g2 = (C5405g) obj;
                LocalDateTime localDateTime2 = c5405g2.f27134e;
                if (localDateTime2 == null) {
                    localDateTime2 = c5405g2.f27135f;
                }
                return AbstractC5939t.m11866a(localDateTime, localDateTime2);
            case 2:
                int iCompare2 = ((C6911b) this.f14175b).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                String str = ((C6620d) obj).f31805b;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((C6620d) obj2).f31805b.toLowerCase(locale);
                AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
                return AbstractC5939t.m11866a(lowerCase, lowerCase2);
            case 3:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.f14175b;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f6 = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f6);
            case 4:
                int iCompare3 = ((Comparator) this.f14175b).compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                return g0.Y0.compare(((C1589q) obj).f7878c, ((C1589q) obj2).f7878c);
            default:
                int iCompare4 = ((C2615d) this.f14175b).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : AbstractC5939t.m11866a(Integer.valueOf(((C1589q) obj).f7882g), Integer.valueOf(((C1589q) obj2).f7882g));
        }
    }

    public C2615d(Comparator comparator) {
        this.f14174a = 4;
        this.f14175b = comparator;
    }
}
