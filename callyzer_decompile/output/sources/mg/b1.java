package mg;

import com.amplifyframework.core.model.ModelIdentifier;
import com.sun.mail.util.AbstractC1452a;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 extends c1 {

    /* renamed from: a */
    public final String f23633a;

    public b1(String str) {
        this.f23633a = str;
    }

    @Override // mg.c1
    /* renamed from: a */
    public final int mo9597a() {
        return c1.m9616d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iMo9597a = c1Var.mo9597a();
        int iM9616d = c1.m9616d((byte) 96);
        if (iM9616d != iMo9597a) {
            return iM9616d - c1Var.mo9597a();
        }
        String str = ((b1) c1Var).f23633a;
        int length = str.length();
        String str2 = this.f23633a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            return this.f23633a.equals(((b1) obj).f23633a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.m9616d((byte) 96)), this.f23633a});
    }

    public final String toString() {
        return AbstractC1452a.m4564k(new StringBuilder(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR), this.f23633a, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }
}
