package androidx.room;

import p001o.kf9;
import p001o.peg;
import p001o.uk7;

/* loaded from: classes2.dex */
public final class SharedSQLiteStatement$stmt$2 extends kf9 implements uk7 {
    final /* synthetic */ SharedSQLiteStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSQLiteStatement$stmt$2(SharedSQLiteStatement sharedSQLiteStatement) {
        super(0);
        this.this$0 = sharedSQLiteStatement;
    }

    @Override // p001o.uk7
    public final peg invoke() {
        return this.this$0.createNewStatement();
    }
}
