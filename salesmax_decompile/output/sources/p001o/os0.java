package p001o;

import android.util.Range;
import android.util.Size;
import java.util.List;
import p001o.k7g;

/* loaded from: classes2.dex */
public abstract class os0 {
    /* renamed from: a */
    public static os0 m42612a(weg wegVar, int i, Size size, y16 y16Var, List list, mq3 mq3Var, Range range) {
        return new t31(wegVar, i, size, y16Var, list, mq3Var, range);
    }

    /* renamed from: b */
    public abstract List mo42613b();

    /* renamed from: c */
    public abstract y16 mo42614c();

    /* renamed from: d */
    public abstract int mo42615d();

    /* renamed from: e */
    public abstract mq3 mo42616e();

    /* renamed from: f */
    public abstract Size mo42617f();

    /* renamed from: g */
    public abstract weg mo42618g();

    /* renamed from: h */
    public abstract Range mo42619h();

    /* renamed from: i */
    public k7g m42620i(mq3 mq3Var) {
        k7g.AbstractC14726a abstractC14726aMo35135d = k7g.m35125a(mo42617f()).mo35133b(mo42614c()).mo35135d(mq3Var);
        if (mo42619h() != null) {
            abstractC14726aMo35135d.mo35134c(mo42619h());
        }
        return abstractC14726aMo35135d.mo35132a();
    }
}
