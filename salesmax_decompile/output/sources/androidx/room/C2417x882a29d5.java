package androidx.room;

import android.util.Pair;
import java.util.List;
import p001o.kf9;
import p001o.leg;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 */
/* loaded from: classes2.dex */
public final class C2417x882a29d5 extends kf9 implements xk7 {
    public static final C2417x882a29d5 INSTANCE = new C2417x882a29d5();

    public C2417x882a29d5() {
        super(1);
    }

    @Override // p001o.xk7
    public final List<Pair<String, String>> invoke(leg legVar) {
        sq8.m48649h(legVar, "obj");
        return legVar.getAttachedDbs();
    }
}
