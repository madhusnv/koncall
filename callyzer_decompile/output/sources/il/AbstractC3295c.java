package il;

import android.database.sqlite.SQLiteDatabase;
import d3.C1549c;
import d3.C1552f;
import f3.C2196b;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import m8.C4672b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: il.c */
/* loaded from: classes.dex */
public abstract class AbstractC3295c {

    /* renamed from: a */
    public static C1552f f17525a;

    /* renamed from: b */
    public static C1549c f17526b;

    /* renamed from: c */
    public static C2196b f17527c;

    /* renamed from: a */
    public static C4672b m7639a(C4001v refHolder, SQLiteDatabase sQLiteDatabase) {
        AbstractC4154l.m8923f(refHolder, "refHolder");
        C4672b c4672b = (C4672b) refHolder.f20704b;
        if (c4672b != null && c4672b.f23115a.equals(sQLiteDatabase)) {
            return c4672b;
        }
        C4672b c4672b2 = new C4672b(sQLiteDatabase);
        refHolder.f20704b = c4672b2;
        return c4672b2;
    }
}
