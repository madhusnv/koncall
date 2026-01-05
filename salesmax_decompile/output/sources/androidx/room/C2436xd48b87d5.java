package androidx.room;

import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1 */
/* loaded from: classes2.dex */
public final class C2436xd48b87d5 extends kf9 implements xk7 {
    final /* synthetic */ long $numBytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2436xd48b87d5(long j) {
        super(1);
        this.$numBytes = j;
    }

    @Override // p001o.xk7
    public final Long invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        return Long.valueOf(legVar.setMaximumSize(this.$numBytes));
    }
}
