package androidx.room.migration;

import p001o.leg;

/* loaded from: classes2.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int i, int i2) {
        this.startVersion = i;
        this.endVersion = i2;
    }

    public abstract void migrate(leg legVar);
}
