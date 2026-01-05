package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Currency;

/* loaded from: classes5.dex */
public final class qg8 {

    /* renamed from: a */
    public final String f41900a;

    /* renamed from: b */
    public final double f41901b;

    /* renamed from: c */
    public final Currency f41902c;

    public qg8(String str, double d, Currency currency) {
        sq8.m48649h(str, "eventName");
        sq8.m48649h(currency, FirebaseAnalytics.Param.CURRENCY);
        this.f41900a = str;
        this.f41901b = d;
        this.f41902c = currency;
    }

    /* renamed from: a */
    public final double m45427a() {
        return this.f41901b;
    }

    /* renamed from: b */
    public final Currency m45428b() {
        return this.f41902c;
    }

    /* renamed from: c */
    public final String m45429c() {
        return this.f41900a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg8)) {
            return false;
        }
        qg8 qg8Var = (qg8) obj;
        return sq8.m48644c(this.f41900a, qg8Var.f41900a) && Double.compare(this.f41901b, qg8Var.f41901b) == 0 && sq8.m48644c(this.f41902c, qg8Var.f41902c);
    }

    public int hashCode() {
        return (((this.f41900a.hashCode() * 31) + Double.hashCode(this.f41901b)) * 31) + this.f41902c.hashCode();
    }

    public String toString() {
        return "InAppPurchase(eventName=" + this.f41900a + ", amount=" + this.f41901b + ", currency=" + this.f41902c + ')';
    }
}
