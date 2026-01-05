package androidx.room;

import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$2 */
/* loaded from: classes2.dex */
public final class C2439xff8530fd extends kf9 implements xk7 {
    final /* synthetic */ int $version;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2439xff8530fd(int i) {
        super(1);
        this.$version = i;
    }

    @Override // p001o.xk7
    public final Object invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        legVar.setVersion(this.$version);
        return null;
    }
}
