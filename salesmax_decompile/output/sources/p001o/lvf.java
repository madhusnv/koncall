package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.List;

/* loaded from: classes6.dex */
public final class lvf {

    /* renamed from: a */
    public final String f34428a;

    /* renamed from: b */
    public final int f34429b;

    /* renamed from: c */
    public final List f34430c;

    public lvf(String str, int i, List list) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(list, "subTrees");
        this.f34428a = str;
        this.f34429b = i;
        this.f34430c = list;
    }

    /* renamed from: a */
    public final String m37985a() {
        return this.f34428a;
    }

    /* renamed from: b */
    public final int m37986b() {
        return this.f34429b;
    }

    /* renamed from: c */
    public final List m37987c() {
        return this.f34430c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvf)) {
            return false;
        }
        lvf lvfVar = (lvf) obj;
        return sq8.m48644c(this.f34428a, lvfVar.f34428a) && this.f34429b == lvfVar.f34429b && sq8.m48644c(this.f34430c, lvfVar.f34430c);
    }

    public int hashCode() {
        String str = this.f34428a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f34429b) * 31;
        List list = this.f34430c;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SizeTree(key=" + this.f34428a + ", totalSize=" + this.f34429b + ", subTrees=" + this.f34430c + ")";
    }
}
