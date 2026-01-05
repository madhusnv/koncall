package p001o;

import java.io.File;

/* loaded from: classes6.dex */
public abstract class zz6 extends yz6 {
    /* renamed from: j */
    public static final rz6 m60147j(File file, vz6 vz6Var) {
        sq8.m48649h(file, "<this>");
        sq8.m48649h(vz6Var, "direction");
        return new rz6(file, vz6Var);
    }

    /* renamed from: k */
    public static final rz6 m60148k(File file) {
        sq8.m48649h(file, "<this>");
        return m60147j(file, vz6.TOP_DOWN);
    }
}
