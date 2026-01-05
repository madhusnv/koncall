package pg;

import android.content.Context;
import nx.AbstractC5178p;
import z7.C8892u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t9 {
    /* renamed from: a */
    public static final C8892u m11876a(Context context, Class cls, String str) {
        if (AbstractC5178p.m10101L(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (str.equals(":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new C8892u(context, cls, str);
    }
}
