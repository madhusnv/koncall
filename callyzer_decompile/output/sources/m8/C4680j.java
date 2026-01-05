package m8;

import android.database.sqlite.SQLiteStatement;
import l8.InterfaceC4432f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m8.j */
/* loaded from: classes.dex */
public final class C4680j extends C4679i implements InterfaceC4432f {

    /* renamed from: b */
    public final SQLiteStatement f23137b;

    public C4680j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f23137b = sQLiteStatement;
    }

    /* renamed from: h */
    public final int m9573h() {
        return this.f23137b.executeUpdateDelete();
    }
}
