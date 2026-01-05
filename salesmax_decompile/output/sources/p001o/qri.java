package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.j0g;

/* loaded from: classes2.dex */
public final class qri extends j0g {

    /* renamed from: b */
    public final Object f42348b;

    /* renamed from: c */
    public final String f42349c;

    /* renamed from: d */
    public final j0g.EnumC14421b f42350d;

    /* renamed from: e */
    public final pja f42351e;

    public qri(Object obj, String str, j0g.EnumC14421b enumC14421b, pja pjaVar) {
        sq8.m48649h(obj, "value");
        sq8.m48649h(str, "tag");
        sq8.m48649h(enumC14421b, "verificationMode");
        sq8.m48649h(pjaVar, "logger");
        this.f42348b = obj;
        this.f42349c = str;
        this.f42350d = enumC14421b;
        this.f42351e = pjaVar;
    }

    @Override // p001o.j0g
    /* renamed from: a */
    public Object mo33012a() {
        return this.f42348b;
    }

    @Override // p001o.j0g
    /* renamed from: c */
    public j0g mo33014c(String str, xk7 xk7Var) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(xk7Var, "condition");
        return ((Boolean) xk7Var.invoke(this.f42348b)).booleanValue() ? this : new us6(this.f42348b, this.f42349c, str, this.f42351e, this.f42350d);
    }
}
