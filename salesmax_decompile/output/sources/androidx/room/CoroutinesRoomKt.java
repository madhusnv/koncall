package androidx.room;

import java.util.Map;
import p001o.sq8;
import p001o.vl6;
import p001o.z74;

/* loaded from: classes2.dex */
public final class CoroutinesRoomKt {
    public static final z74 getQueryDispatcher(RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object objM52908a = backingFieldMap.get("QueryDispatcher");
        if (objM52908a == null) {
            objM52908a = vl6.m52908a(roomDatabase.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", objM52908a);
        }
        sq8.m48647f(objM52908a, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (z74) objM52908a;
    }

    public static final z74 getTransactionDispatcher(RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object objM52908a = backingFieldMap.get("TransactionDispatcher");
        if (objM52908a == null) {
            objM52908a = vl6.m52908a(roomDatabase.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", objM52908a);
        }
        sq8.m48647f(objM52908a, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (z74) objM52908a;
    }
}
