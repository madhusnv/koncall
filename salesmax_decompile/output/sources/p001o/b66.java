package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Set;

/* loaded from: classes3.dex */
public final class b66 implements qx0 {

    /* renamed from: a */
    public static final b66 f15584a = new b66();

    /* renamed from: b */
    public static final boolean f15585b = true;

    /* renamed from: c */
    public static final Set f15586c = nif.m40664e();

    @Override // p001o.qx0
    /* renamed from: a */
    public Set mo18190a() {
        return f15586c;
    }

    @Override // p001o.qx0
    /* renamed from: b */
    public Object mo18191b(kx0 kx0Var) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        return null;
    }

    @Override // p001o.qx0
    /* renamed from: c */
    public boolean mo18192c(kx0 kx0Var) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof qx0) && ((qx0) obj).isEmpty();
    }

    @Override // p001o.qx0
    public boolean isEmpty() {
        return f15585b;
    }
}
