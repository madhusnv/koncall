package androidx.work.impl.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.sq8;

@Entity
/* loaded from: classes2.dex */
public final class Preference {

    @PrimaryKey
    @ColumnInfo(name = TransferTable.COLUMN_KEY)
    private final String key;

    @ColumnInfo(name = "long_value")
    private final Long value;

    public Preference(String str, Long l) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.key = str;
        this.value = l;
    }

    public static /* synthetic */ Preference copy$default(Preference preference, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preference.key;
        }
        if ((i & 2) != 0) {
            l = preference.value;
        }
        return preference.copy(str, l);
    }

    public final String component1() {
        return this.key;
    }

    public final Long component2() {
        return this.value;
    }

    public final Preference copy(String str, Long l) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return new Preference(str, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        return sq8.m48644c(this.key, preference.key) && sq8.m48644c(this.value, preference.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Long l = this.value;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.key + ", value=" + this.value + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(String str, boolean z) {
        this(str, Long.valueOf(z ? 1L : 0L));
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
    }
}
