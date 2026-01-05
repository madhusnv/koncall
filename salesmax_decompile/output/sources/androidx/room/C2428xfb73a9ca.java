package androidx.room;

import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$1 */
/* loaded from: classes2.dex */
public final class C2428xfb73a9ca extends kf9 implements xk7 {
    final /* synthetic */ int $newVersion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2428xfb73a9ca(int i) {
        super(1);
        this.$newVersion = i;
    }

    @Override // p001o.xk7
    public final Boolean invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        return Boolean.valueOf(legVar.needUpgrade(this.$newVersion));
    }
}
