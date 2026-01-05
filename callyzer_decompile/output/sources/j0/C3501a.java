package j0;

import android.graphics.RectF;
import android.util.Rational;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.Comparator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j0.a */
/* loaded from: classes.dex */
public final class C3501a implements Comparator {

    /* renamed from: a */
    public final RectF f18366a;

    /* renamed from: b */
    public final Rational f18367b;

    public C3501a(Rational rational, Rational rational2) {
        this.f18367b = rational2 == null ? new Rational(4, 3) : rational2;
        this.f18366a = m8053b(rational);
    }

    /* renamed from: a */
    public static float m8052a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    /* renamed from: b */
    public final RectF m8053b(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = this.f18367b;
        return fFloatValue == rational2.floatValue() ? new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        boolean z6 = false;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF rectFM8053b = m8053b(rational);
        RectF rectFM8053b2 = m8053b(rational2);
        float fWidth = rectFM8053b.width();
        RectF rectF = this.f18366a;
        boolean z10 = fWidth >= rectF.width() && rectFM8053b.height() >= rectF.height();
        if (rectFM8053b2.width() >= rectF.width() && rectFM8053b2.height() >= rectF.height()) {
            z6 = true;
        }
        if (z10 && z6) {
            return (int) Math.signum((rectFM8053b.height() * rectFM8053b.width()) - (rectFM8053b2.height() * rectFM8053b2.width()));
        }
        if (z10) {
            return -1;
        }
        if (z6) {
            return 1;
        }
        return -((int) Math.signum(m8052a(rectFM8053b, rectF) - m8052a(rectFM8053b2, rectF)));
    }
}
