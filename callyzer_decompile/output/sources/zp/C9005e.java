package zp;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import j$.time.LocalDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4793d;
import nx.AbstractC5178p;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.f9;
import uv.AbstractC7548a;
import yv.AbstractC8788c;
import yv.C8789d;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.e */
/* loaded from: classes3.dex */
public final class C9005e {

    /* renamed from: a */
    public final C4793d f43368a;

    /* renamed from: b */
    public final Context f43369b;

    /* renamed from: c */
    public final int f43370c;

    /* renamed from: d */
    public final String f43371d;

    /* renamed from: e */
    public final String f43372e;

    /* renamed from: f */
    public final String f43373f;

    /* renamed from: g */
    public final String f43374g;

    /* renamed from: h */
    public final String f43375h;

    /* renamed from: i */
    public final String f43376i;

    /* renamed from: j */
    public final String f43377j;

    /* renamed from: k */
    public final EnumC8994d f43378k;

    /* renamed from: l */
    public final String f43379l;

    /* renamed from: m */
    public final int f43380m;

    /* renamed from: n */
    public final String f43381n;

    /* renamed from: o */
    public final int f43382o;

    /* renamed from: p */
    public final long f43383p;

    public C9005e(C4793d dataModel, Context context) {
        String strM11628b;
        long j6;
        String strM16160g;
        AbstractC4154l.m8923f(dataModel, "dataModel");
        EnumC8994d enumC8994d = dataModel.f23859e;
        AbstractC4154l.m8923f(context, "context");
        this.f43368a = dataModel;
        this.f43369b = context;
        this.f43370c = dataModel.f23855a;
        String str = dataModel.f23856b;
        this.f43371d = String.valueOf(AbstractC5178p.m10094E(str));
        this.f43372e = str;
        this.f43373f = AbstractC5601a.m11232c(dataModel.f23858d, "+", dataModel.f23857c);
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTime = dataModel.f23860f;
        this.f43374g = C8800o.m16205n(localDateTime);
        this.f43375h = C8800o.m16216y(localDateTime);
        this.f43376i = C8800o.m16186J(localDateTime);
        Long l9 = dataModel.f23861g;
        this.f43377j = (l9 == null || (strM16160g = C8789d.m16160g(false, l9.longValue())) == null) ? "0s" : strM16160g;
        this.f43378k = enumC8994d;
        AbstractC4154l.m8923f(enumC8994d, "<this>");
        int i10 = AbstractC8788c.f42452a[enumC8994d.ordinal()];
        if (i10 == 1) {
            strM11628b = f9.m11628b(context, R.string.incoming);
        } else if (i10 == 2) {
            strM11628b = f9.m11628b(context, R.string.outgoing);
        } else if (i10 == 3) {
            strM11628b = f9.m11628b(context, R.string.missed);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            strM11628b = f9.m11628b(context, R.string.rejected);
        }
        this.f43379l = strM11628b;
        Integer num = dataModel.f23863i;
        this.f43380m = (num != null && num.intValue() == 1) ? R.drawable.ic_in_active_sim_1 : (num != null && num.intValue() == 2) ? R.drawable.ic_in_active_sim_2 : -1;
        this.f43381n = dataModel.f23864j;
        this.f43382o = C8789d.m16158e(enumC8994d);
        int i11 = AbstractC9004d.f43367a[enumC8994d.ordinal()];
        if (i11 == 1) {
            j6 = AbstractC7548a.f36340M;
        } else if (i11 == 2) {
            j6 = AbstractC7548a.f36341N;
        } else if (i11 == 3) {
            j6 = AbstractC7548a.f36342O;
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            j6 = AbstractC7548a.f36343P;
        }
        this.f43383p = j6;
    }

    /* renamed from: a */
    public static C9005e m16473a(C9005e c9005e, C4793d dataModel) {
        Context context = c9005e.f43369b;
        c9005e.getClass();
        AbstractC4154l.m8923f(dataModel, "dataModel");
        AbstractC4154l.m8923f(context, "context");
        return new C9005e(dataModel, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9005e)) {
            return false;
        }
        C9005e c9005e = (C9005e) obj;
        return AbstractC4154l.m8918a(this.f43368a, c9005e.f43368a) && AbstractC4154l.m8918a(this.f43369b, c9005e.f43369b);
    }

    public final int hashCode() {
        return this.f43369b.hashCode() + (this.f43368a.hashCode() * 31);
    }

    public final String toString() {
        return "CallTypesHistoryUiModel(dataModel=" + this.f43368a + ", context=" + this.f43369b + ")";
    }
}
