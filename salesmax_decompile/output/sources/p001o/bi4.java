package p001o;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class bi4 {

    /* renamed from: a */
    public final Integer f16315a;

    /* renamed from: b */
    public final Integer f16316b;

    /* renamed from: c */
    public final Integer f16317c;

    /* renamed from: d */
    public final Integer f16318d;

    /* renamed from: o.bi4$a */
    public static final class C12415a {

        /* renamed from: a */
        public Integer f16319a;

        /* renamed from: b */
        public Integer f16320b;

        /* renamed from: c */
        public Integer f16321c;

        /* renamed from: d */
        public Integer f16322d;

        /* renamed from: a */
        public bi4 m19124a() {
            return new bi4(this.f16319a, this.f16320b, this.f16321c, this.f16322d);
        }
    }

    public bi4(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f16315a = num;
        this.f16316b = num2;
        this.f16317c = num3;
        this.f16318d = num4;
    }

    /* renamed from: a */
    public Bundle m19123a() {
        Bundle bundle = new Bundle();
        Integer num = this.f16315a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f16316b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f16317c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f16318d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
