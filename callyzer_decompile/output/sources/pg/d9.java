package pg;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;
import og.be;
import r5.AbstractC6468c;
import rb.C6488a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d9 {
    /* renamed from: a */
    public static final boolean m11588a(Context context, String str) {
        AbstractC4154l.m8923f(str, "<this>");
        AbstractC4154l.m8923f(context, "context");
        return AbstractC6468c.m12450a(context, str) == 0;
    }

    /* renamed from: b */
    public static final boolean m11589b(Context context, String str) {
        return AbstractC6468c.m12450a(context, str) != 0;
    }

    /* renamed from: c */
    public static C6488a m11590c(String str, Boolean bool, int i10) {
        String str2 = (i10 & 2) != 0 ? null : "s3express";
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        return be.m10556a("aws.auth#sigv4s3express", g9.m11666f(false, str2, str, bool).f31166b);
    }
}
