package androidx.room;

import java.util.Locale;
import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$1 */
/* loaded from: classes2.dex */
public final class C2434xf1df5ec0 extends kf9 implements xk7 {
    final /* synthetic */ Locale $locale;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2434xf1df5ec0(Locale locale) {
        super(1);
        this.$locale = locale;
    }

    @Override // p001o.xk7
    public final Object invoke(leg legVar) {
        sq8.m48649h(legVar, "db");
        legVar.setLocale(this.$locale);
        return null;
    }
}
