package androidx.room;

import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$1 */
/* loaded from: classes2.dex */
public final class C2433xeb7db11c extends kf9 implements xk7 {
    final /* synthetic */ boolean $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2433xeb7db11c(boolean z) {
        super(1);
        this.$enabled = z;
    }

    @Override // p001o.xk7
    public final Object invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        legVar.setForeignKeyConstraintsEnabled(this.$enabled);
        return null;
    }
}
